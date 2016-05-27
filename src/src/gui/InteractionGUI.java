package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;

/** General GUI for OrgArts */
public class InteractionGUI {
    private static JFrame  frame;
    private static JTabbedPane allArtsPane;
    private static int guiCount = 0;
    
    private JTabbedPane tpane; 
    private JTextPane txtScene  = new JTextPane();
    private JTextPane txtSceneMonitor  = new JTextPane();
    private JTextArea txtLog = new JTextArea(9, 10);
    private JPanel    artPanel;
    
    private String lastUpScene = "";
    private String lastUpSceneMonitor = "";
    
    private InteractionGUI() {    
    }

    private static void initFrame() {
        frame = new JFrame("..:: Interaction Artifacts GUI ::..");
        allArtsPane = new JTabbedPane(JTabbedPane.LEFT);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.add(BorderLayout.CENTER, allArtsPane);
        frame.pack();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        guiCount = guiCount+30;
        frame.setBounds(0, 0, 800, (int)(screenSize.height * 0.8));
        frame.setLocation((screenSize.width / 2)-guiCount - frame.getWidth() / 2, (screenSize.height / 2)+guiCount - frame.getHeight() / 2);        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setVisible(true);            
            }
        });        
    }
    
    public static InteractionGUI add(String scene, String title) throws Exception {
        if (frame == null)
            initFrame();
        
        final InteractionGUI gui = new InteractionGUI();

        // scene panel
        JPanel scenePanel = new JPanel(new BorderLayout());
        gui.txtScene.setContentType("text/html");
        gui.txtScene.setEditable(false);
        gui.txtScene.setAutoscrolls(false);
        scenePanel.add(BorderLayout.CENTER, new JScrollPane(gui.txtScene));
        
        // scene monitor panel
        JPanel sceneMonitorPanel = new JPanel(new BorderLayout());
        gui.txtSceneMonitor.setContentType("text/html");
        gui.txtSceneMonitor.setEditable(false);
        gui.txtSceneMonitor.setAutoscrolls(false);
        sceneMonitorPanel.add(BorderLayout.CENTER, new JScrollPane(gui.txtSceneMonitor));

        // center tabled 
        gui.tpane = new JTabbedPane();
        gui.tpane.add("Scene", scenePanel);
        gui.tpane.add("Scene monitor", sceneMonitorPanel);
                    
        gui.txtLog.setEditable(false); 
        gui.txtLog.setAutoscrolls(false);
        gui.txtLog.setFont(new Font("courier", Font.PLAIN, 14));

        JPanel sul = new JPanel(new BorderLayout());
        sul.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "History", TitledBorder.LEFT, TitledBorder.TOP));
        sul.add(BorderLayout.SOUTH, new JScrollPane(gui.txtLog));
        
        gui.artPanel = new JPanel(new BorderLayout());
        gui.artPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), title, TitledBorder.CENTER, TitledBorder.TOP));
        
        gui.artPanel.add(BorderLayout.CENTER, gui.tpane);
        gui.artPanel.add(BorderLayout.SOUTH, sul);
        allArtsPane.add(scene, gui.artPanel);
        
        return gui;
    }
    
    
    public void setProtocolSpecification(String specification) {
        JPanel protocolSpecificationPanel = new JPanel(new BorderLayout());
        JTextArea txtProtocolSpecification = new JTextArea();
        txtProtocolSpecification.setFont(new Font("courier", Font.PLAIN, 14));
        txtProtocolSpecification.setEditable(false);
        txtProtocolSpecification.setText(specification);
        protocolSpecificationPanel.add(BorderLayout.CENTER, new JScrollPane(txtProtocolSpecification));
        tpane.add("Protocol specification", protocolSpecificationPanel);
    }
    
    public void remove() {
        allArtsPane.remove(artPanel);
    }
    
    public void updateScene(String text) {
        try {
        	if (!lastUpScene.equals(text)) {
        		txtScene.setText(text);
        		lastUpScene = text;
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateSceneMonitor(String text) {
        try {
        	if (!lastUpSceneMonitor.equals(text)) {
        		txtSceneMonitor.setText(text);
        		lastUpSceneMonitor = text;
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addLog(String text) {
    	txtLog.append(text);
    }
}


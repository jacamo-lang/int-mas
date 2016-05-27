package aux;

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

/**
 * Singleton pattern
 * @author xsplyter
 *
 */
public class LoggerManager {
	private static LoggerManager instance = new LoggerManager();
	private Logger logger = Logger.getLogger(LoggerManager.class.getName());
	
	private LoggerManager() {
		logger.addHandler(new StreamHandler(System.out, new SimpleFormatter()));
		logger.setLevel(java.util.logging.Level.INFO);
	}
	
	public static LoggerManager getInstance() {
		return instance;
	}
}

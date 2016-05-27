/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Cardinality Max</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getMax <em>Max</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getMax2 <em>Max2</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMax()
 * @model
 * @generated
 */
public interface ParticipantCardinalityMax extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMax_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMax_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

  /**
   * Returns the value of the '<em><b>Max2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max2</em>' attribute.
   * @see #setMax2(String)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMax_Max2()
   * @model
   * @generated
   */
  String getMax2();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getMax2 <em>Max2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max2</em>' attribute.
   * @see #getMax2()
   * @generated
   */
  void setMax2(String value);

} // ParticipantCardinalityMax

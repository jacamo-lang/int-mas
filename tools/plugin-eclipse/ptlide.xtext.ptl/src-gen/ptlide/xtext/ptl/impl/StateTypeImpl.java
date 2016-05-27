/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ptlide.xtext.ptl.PtlPackage;
import ptlide.xtext.ptl.StateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.StateTypeImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.StateTypeImpl#getFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateTypeImpl extends MinimalEObjectImpl.Container implements StateType
{
  /**
   * The default value of the '{@link #getInitial() <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitial()
   * @generated
   * @ordered
   */
  protected static final String INITIAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitial() <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitial()
   * @generated
   * @ordered
   */
  protected String initial = INITIAL_EDEFAULT;

  /**
   * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinal()
   * @generated
   * @ordered
   */
  protected static final String FINAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinal()
   * @generated
   * @ordered
   */
  protected String final_ = FINAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PtlPackage.Literals.STATE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInitial()
  {
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitial(String newInitial)
  {
    String oldInitial = initial;
    initial = newInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.STATE_TYPE__INITIAL, oldInitial, initial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinal(String newFinal)
  {
    String oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.STATE_TYPE__FINAL, oldFinal, final_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PtlPackage.STATE_TYPE__INITIAL:
        return getInitial();
      case PtlPackage.STATE_TYPE__FINAL:
        return getFinal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PtlPackage.STATE_TYPE__INITIAL:
        setInitial((String)newValue);
        return;
      case PtlPackage.STATE_TYPE__FINAL:
        setFinal((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PtlPackage.STATE_TYPE__INITIAL:
        setInitial(INITIAL_EDEFAULT);
        return;
      case PtlPackage.STATE_TYPE__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PtlPackage.STATE_TYPE__INITIAL:
        return INITIAL_EDEFAULT == null ? initial != null : !INITIAL_EDEFAULT.equals(initial);
      case PtlPackage.STATE_TYPE__FINAL:
        return FINAL_EDEFAULT == null ? final_ != null : !FINAL_EDEFAULT.equals(final_);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (initial: ");
    result.append(initial);
    result.append(", final: ");
    result.append(final_);
    result.append(')');
    return result.toString();
  }

} //StateTypeImpl

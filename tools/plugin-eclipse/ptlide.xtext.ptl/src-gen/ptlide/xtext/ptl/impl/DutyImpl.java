/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ptlide.xtext.ptl.Duty;
import ptlide.xtext.ptl.DutyType;
import ptlide.xtext.ptl.PtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.DutyImpl#getDutytype <em>Dutytype</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.DutyImpl#getDuty <em>Duty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DutyImpl extends MinimalEObjectImpl.Container implements Duty
{
  /**
   * The cached value of the '{@link #getDutytype() <em>Dutytype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDutytype()
   * @generated
   * @ordered
   */
  protected DutyType dutytype;

  /**
   * The default value of the '{@link #getDuty() <em>Duty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuty()
   * @generated
   * @ordered
   */
  protected static final String DUTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDuty() <em>Duty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuty()
   * @generated
   * @ordered
   */
  protected String duty = DUTY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DutyImpl()
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
    return PtlPackage.Literals.DUTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DutyType getDutytype()
  {
    return dutytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDutytype(DutyType newDutytype, NotificationChain msgs)
  {
    DutyType oldDutytype = dutytype;
    dutytype = newDutytype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.DUTY__DUTYTYPE, oldDutytype, newDutytype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDutytype(DutyType newDutytype)
  {
    if (newDutytype != dutytype)
    {
      NotificationChain msgs = null;
      if (dutytype != null)
        msgs = ((InternalEObject)dutytype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.DUTY__DUTYTYPE, null, msgs);
      if (newDutytype != null)
        msgs = ((InternalEObject)newDutytype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.DUTY__DUTYTYPE, null, msgs);
      msgs = basicSetDutytype(newDutytype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.DUTY__DUTYTYPE, newDutytype, newDutytype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDuty()
  {
    return duty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuty(String newDuty)
  {
    String oldDuty = duty;
    duty = newDuty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.DUTY__DUTY, oldDuty, duty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PtlPackage.DUTY__DUTYTYPE:
        return basicSetDutytype(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PtlPackage.DUTY__DUTYTYPE:
        return getDutytype();
      case PtlPackage.DUTY__DUTY:
        return getDuty();
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
      case PtlPackage.DUTY__DUTYTYPE:
        setDutytype((DutyType)newValue);
        return;
      case PtlPackage.DUTY__DUTY:
        setDuty((String)newValue);
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
      case PtlPackage.DUTY__DUTYTYPE:
        setDutytype((DutyType)null);
        return;
      case PtlPackage.DUTY__DUTY:
        setDuty(DUTY_EDEFAULT);
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
      case PtlPackage.DUTY__DUTYTYPE:
        return dutytype != null;
      case PtlPackage.DUTY__DUTY:
        return DUTY_EDEFAULT == null ? duty != null : !DUTY_EDEFAULT.equals(duty);
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
    result.append(" (duty: ");
    result.append(duty);
    result.append(')');
    return result.toString();
  }

} //DutyImpl

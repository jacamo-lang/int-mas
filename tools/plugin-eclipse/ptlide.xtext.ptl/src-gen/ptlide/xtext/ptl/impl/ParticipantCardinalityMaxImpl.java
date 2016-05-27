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

import ptlide.xtext.ptl.ParticipantCardinalityMax;
import ptlide.xtext.ptl.PtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Cardinality Max</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMaxImpl#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMaxImpl#getMax <em>Max</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMaxImpl#getMax2 <em>Max2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantCardinalityMaxImpl extends MinimalEObjectImpl.Container implements ParticipantCardinalityMax
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final int MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected int max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getMax2() <em>Max2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax2()
   * @generated
   * @ordered
   */
  protected static final String MAX2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax2() <em>Max2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax2()
   * @generated
   * @ordered
   */
  protected String max2 = MAX2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParticipantCardinalityMaxImpl()
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
    return PtlPackage.Literals.PARTICIPANT_CARDINALITY_MAX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY_MAX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(int newMax)
  {
    int oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMax2()
  {
    return max2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax2(String newMax2)
  {
    String oldMax2 = max2;
    max2 = newMax2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX2, oldMax2, max2));
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__NAME:
        return getName();
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX:
        return getMax();
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX2:
        return getMax2();
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__NAME:
        setName((String)newValue);
        return;
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX:
        setMax((Integer)newValue);
        return;
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX2:
        setMax2((String)newValue);
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX2:
        setMax2(MAX2_EDEFAULT);
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX:
        return max != MAX_EDEFAULT;
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX__MAX2:
        return MAX2_EDEFAULT == null ? max2 != null : !MAX2_EDEFAULT.equals(max2);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", max: ");
    result.append(max);
    result.append(", max2: ");
    result.append(max2);
    result.append(')');
    return result.toString();
  }

} //ParticipantCardinalityMaxImpl

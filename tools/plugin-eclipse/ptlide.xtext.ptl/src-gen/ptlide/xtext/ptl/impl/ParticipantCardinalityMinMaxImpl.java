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

import ptlide.xtext.ptl.ParticipantCardinalityMax;
import ptlide.xtext.ptl.ParticipantCardinalityMin;
import ptlide.xtext.ptl.ParticipantCardinalityMinMax;
import ptlide.xtext.ptl.PtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Cardinality Min Max</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMinMaxImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMinMaxImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantCardinalityMinMaxImpl extends MinimalEObjectImpl.Container implements ParticipantCardinalityMinMax
{
  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected ParticipantCardinalityMin min;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected ParticipantCardinalityMax max;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParticipantCardinalityMinMaxImpl()
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
    return PtlPackage.Literals.PARTICIPANT_CARDINALITY_MIN_MAX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinalityMin getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin(ParticipantCardinalityMin newMin, NotificationChain msgs)
  {
    ParticipantCardinalityMin oldMin = min;
    min = newMin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN, oldMin, newMin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(ParticipantCardinalityMin newMin)
  {
    if (newMin != min)
    {
      NotificationChain msgs = null;
      if (min != null)
        msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN, null, msgs);
      if (newMin != null)
        msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN, null, msgs);
      msgs = basicSetMin(newMin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN, newMin, newMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinalityMax getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax(ParticipantCardinalityMax newMax, NotificationChain msgs)
  {
    ParticipantCardinalityMax oldMax = max;
    max = newMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX, oldMax, newMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(ParticipantCardinalityMax newMax)
  {
    if (newMax != max)
    {
      NotificationChain msgs = null;
      if (max != null)
        msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX, null, msgs);
      if (newMax != null)
        msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX, null, msgs);
      msgs = basicSetMax(newMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX, newMax, newMax));
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN:
        return basicSetMin(null, msgs);
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX:
        return basicSetMax(null, msgs);
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN:
        return getMin();
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX:
        return getMax();
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN:
        setMin((ParticipantCardinalityMin)newValue);
        return;
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX:
        setMax((ParticipantCardinalityMax)newValue);
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN:
        setMin((ParticipantCardinalityMin)null);
        return;
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX:
        setMax((ParticipantCardinalityMax)null);
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
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MIN:
        return min != null;
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX__MAX:
        return max != null;
    }
    return super.eIsSet(featureID);
  }

} //ParticipantCardinalityMinMaxImpl

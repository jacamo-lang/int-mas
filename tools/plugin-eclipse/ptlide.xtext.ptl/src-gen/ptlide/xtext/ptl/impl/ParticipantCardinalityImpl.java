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

import ptlide.xtext.ptl.ParticipantCardinality;
import ptlide.xtext.ptl.ParticipantCardinalityAll;
import ptlide.xtext.ptl.ParticipantCardinalityMinMax;
import ptlide.xtext.ptl.PtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantCardinalityImpl#getCardAll <em>Card All</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantCardinalityImpl#getCardMinMax <em>Card Min Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantCardinalityImpl extends MinimalEObjectImpl.Container implements ParticipantCardinality
{
  /**
   * The cached value of the '{@link #getCardAll() <em>Card All</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardAll()
   * @generated
   * @ordered
   */
  protected ParticipantCardinalityAll cardAll;

  /**
   * The cached value of the '{@link #getCardMinMax() <em>Card Min Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardMinMax()
   * @generated
   * @ordered
   */
  protected ParticipantCardinalityMinMax cardMinMax;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParticipantCardinalityImpl()
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
    return PtlPackage.Literals.PARTICIPANT_CARDINALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinalityAll getCardAll()
  {
    return cardAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCardAll(ParticipantCardinalityAll newCardAll, NotificationChain msgs)
  {
    ParticipantCardinalityAll oldCardAll = cardAll;
    cardAll = newCardAll;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL, oldCardAll, newCardAll);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardAll(ParticipantCardinalityAll newCardAll)
  {
    if (newCardAll != cardAll)
    {
      NotificationChain msgs = null;
      if (cardAll != null)
        msgs = ((InternalEObject)cardAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL, null, msgs);
      if (newCardAll != null)
        msgs = ((InternalEObject)newCardAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL, null, msgs);
      msgs = basicSetCardAll(newCardAll, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL, newCardAll, newCardAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinalityMinMax getCardMinMax()
  {
    return cardMinMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCardMinMax(ParticipantCardinalityMinMax newCardMinMax, NotificationChain msgs)
  {
    ParticipantCardinalityMinMax oldCardMinMax = cardMinMax;
    cardMinMax = newCardMinMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX, oldCardMinMax, newCardMinMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardMinMax(ParticipantCardinalityMinMax newCardMinMax)
  {
    if (newCardMinMax != cardMinMax)
    {
      NotificationChain msgs = null;
      if (cardMinMax != null)
        msgs = ((InternalEObject)cardMinMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX, null, msgs);
      if (newCardMinMax != null)
        msgs = ((InternalEObject)newCardMinMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX, null, msgs);
      msgs = basicSetCardMinMax(newCardMinMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX, newCardMinMax, newCardMinMax));
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
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL:
        return basicSetCardAll(null, msgs);
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX:
        return basicSetCardMinMax(null, msgs);
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
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL:
        return getCardAll();
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX:
        return getCardMinMax();
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
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL:
        setCardAll((ParticipantCardinalityAll)newValue);
        return;
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX:
        setCardMinMax((ParticipantCardinalityMinMax)newValue);
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
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL:
        setCardAll((ParticipantCardinalityAll)null);
        return;
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX:
        setCardMinMax((ParticipantCardinalityMinMax)null);
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
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_ALL:
        return cardAll != null;
      case PtlPackage.PARTICIPANT_CARDINALITY__CARD_MIN_MAX:
        return cardMinMax != null;
    }
    return super.eIsSet(featureID);
  }

} //ParticipantCardinalityImpl

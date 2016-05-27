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

import ptlide.xtext.ptl.ParticipantId;
import ptlide.xtext.ptl.ParticipantOccurrence;
import ptlide.xtext.ptl.PtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantOccurrenceImpl#getParticipantSource <em>Participant Source</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantOccurrenceImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantOccurrenceImpl extends MinimalEObjectImpl.Container implements ParticipantOccurrence
{
  /**
   * The cached value of the '{@link #getParticipantSource() <em>Participant Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipantSource()
   * @generated
   * @ordered
   */
  protected ParticipantId participantSource;

  /**
   * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected static final int CARDINALITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected int cardinality = CARDINALITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParticipantOccurrenceImpl()
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
    return PtlPackage.Literals.PARTICIPANT_OCCURRENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantId getParticipantSource()
  {
    return participantSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParticipantSource(ParticipantId newParticipantSource, NotificationChain msgs)
  {
    ParticipantId oldParticipantSource = participantSource;
    participantSource = newParticipantSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE, oldParticipantSource, newParticipantSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParticipantSource(ParticipantId newParticipantSource)
  {
    if (newParticipantSource != participantSource)
    {
      NotificationChain msgs = null;
      if (participantSource != null)
        msgs = ((InternalEObject)participantSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE, null, msgs);
      if (newParticipantSource != null)
        msgs = ((InternalEObject)newParticipantSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE, null, msgs);
      msgs = basicSetParticipantSource(newParticipantSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE, newParticipantSource, newParticipantSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCardinality()
  {
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardinality(int newCardinality)
  {
    int oldCardinality = cardinality;
    cardinality = newCardinality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_OCCURRENCE__CARDINALITY, oldCardinality, cardinality));
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
      case PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE:
        return basicSetParticipantSource(null, msgs);
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
      case PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE:
        return getParticipantSource();
      case PtlPackage.PARTICIPANT_OCCURRENCE__CARDINALITY:
        return getCardinality();
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
      case PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE:
        setParticipantSource((ParticipantId)newValue);
        return;
      case PtlPackage.PARTICIPANT_OCCURRENCE__CARDINALITY:
        setCardinality((Integer)newValue);
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
      case PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE:
        setParticipantSource((ParticipantId)null);
        return;
      case PtlPackage.PARTICIPANT_OCCURRENCE__CARDINALITY:
        setCardinality(CARDINALITY_EDEFAULT);
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
      case PtlPackage.PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE:
        return participantSource != null;
      case PtlPackage.PARTICIPANT_OCCURRENCE__CARDINALITY:
        return cardinality != CARDINALITY_EDEFAULT;
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
    result.append(" (cardinality: ");
    result.append(cardinality);
    result.append(')');
    return result.toString();
  }

} //ParticipantOccurrenceImpl

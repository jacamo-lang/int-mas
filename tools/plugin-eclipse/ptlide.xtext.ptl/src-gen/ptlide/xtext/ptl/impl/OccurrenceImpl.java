/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ptlide.xtext.ptl.Duty;
import ptlide.xtext.ptl.Occurrence;
import ptlide.xtext.ptl.ParticipantOccurrence;
import ptlide.xtext.ptl.PtlPackage;
import ptlide.xtext.ptl.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.OccurrenceImpl#getParticipantSource <em>Participant Source</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.OccurrenceImpl#getDuty <em>Duty</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.OccurrenceImpl#getParticipantDestination <em>Participant Destination</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.OccurrenceImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccurrenceImpl extends MinimalEObjectImpl.Container implements Occurrence
{
  /**
   * The cached value of the '{@link #getParticipantSource() <em>Participant Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipantSource()
   * @generated
   * @ordered
   */
  protected ParticipantOccurrence participantSource;

  /**
   * The cached value of the '{@link #getDuty() <em>Duty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuty()
   * @generated
   * @ordered
   */
  protected Duty duty;

  /**
   * The cached value of the '{@link #getParticipantDestination() <em>Participant Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipantDestination()
   * @generated
   * @ordered
   */
  protected ParticipantOccurrence participantDestination;

  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected EList<Trigger> trigger;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OccurrenceImpl()
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
    return PtlPackage.Literals.OCCURRENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantOccurrence getParticipantSource()
  {
    return participantSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParticipantSource(ParticipantOccurrence newParticipantSource, NotificationChain msgs)
  {
    ParticipantOccurrence oldParticipantSource = participantSource;
    participantSource = newParticipantSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE, oldParticipantSource, newParticipantSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParticipantSource(ParticipantOccurrence newParticipantSource)
  {
    if (newParticipantSource != participantSource)
    {
      NotificationChain msgs = null;
      if (participantSource != null)
        msgs = ((InternalEObject)participantSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE, null, msgs);
      if (newParticipantSource != null)
        msgs = ((InternalEObject)newParticipantSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE, null, msgs);
      msgs = basicSetParticipantSource(newParticipantSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE, newParticipantSource, newParticipantSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duty getDuty()
  {
    return duty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDuty(Duty newDuty, NotificationChain msgs)
  {
    Duty oldDuty = duty;
    duty = newDuty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.OCCURRENCE__DUTY, oldDuty, newDuty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuty(Duty newDuty)
  {
    if (newDuty != duty)
    {
      NotificationChain msgs = null;
      if (duty != null)
        msgs = ((InternalEObject)duty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.OCCURRENCE__DUTY, null, msgs);
      if (newDuty != null)
        msgs = ((InternalEObject)newDuty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.OCCURRENCE__DUTY, null, msgs);
      msgs = basicSetDuty(newDuty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.OCCURRENCE__DUTY, newDuty, newDuty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantOccurrence getParticipantDestination()
  {
    return participantDestination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParticipantDestination(ParticipantOccurrence newParticipantDestination, NotificationChain msgs)
  {
    ParticipantOccurrence oldParticipantDestination = participantDestination;
    participantDestination = newParticipantDestination;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION, oldParticipantDestination, newParticipantDestination);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParticipantDestination(ParticipantOccurrence newParticipantDestination)
  {
    if (newParticipantDestination != participantDestination)
    {
      NotificationChain msgs = null;
      if (participantDestination != null)
        msgs = ((InternalEObject)participantDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION, null, msgs);
      if (newParticipantDestination != null)
        msgs = ((InternalEObject)newParticipantDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION, null, msgs);
      msgs = basicSetParticipantDestination(newParticipantDestination, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION, newParticipantDestination, newParticipantDestination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Trigger> getTrigger()
  {
    if (trigger == null)
    {
      trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, PtlPackage.OCCURRENCE__TRIGGER);
    }
    return trigger;
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
      case PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE:
        return basicSetParticipantSource(null, msgs);
      case PtlPackage.OCCURRENCE__DUTY:
        return basicSetDuty(null, msgs);
      case PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION:
        return basicSetParticipantDestination(null, msgs);
      case PtlPackage.OCCURRENCE__TRIGGER:
        return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
      case PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE:
        return getParticipantSource();
      case PtlPackage.OCCURRENCE__DUTY:
        return getDuty();
      case PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION:
        return getParticipantDestination();
      case PtlPackage.OCCURRENCE__TRIGGER:
        return getTrigger();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE:
        setParticipantSource((ParticipantOccurrence)newValue);
        return;
      case PtlPackage.OCCURRENCE__DUTY:
        setDuty((Duty)newValue);
        return;
      case PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION:
        setParticipantDestination((ParticipantOccurrence)newValue);
        return;
      case PtlPackage.OCCURRENCE__TRIGGER:
        getTrigger().clear();
        getTrigger().addAll((Collection<? extends Trigger>)newValue);
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
      case PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE:
        setParticipantSource((ParticipantOccurrence)null);
        return;
      case PtlPackage.OCCURRENCE__DUTY:
        setDuty((Duty)null);
        return;
      case PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION:
        setParticipantDestination((ParticipantOccurrence)null);
        return;
      case PtlPackage.OCCURRENCE__TRIGGER:
        getTrigger().clear();
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
      case PtlPackage.OCCURRENCE__PARTICIPANT_SOURCE:
        return participantSource != null;
      case PtlPackage.OCCURRENCE__DUTY:
        return duty != null;
      case PtlPackage.OCCURRENCE__PARTICIPANT_DESTINATION:
        return participantDestination != null;
      case PtlPackage.OCCURRENCE__TRIGGER:
        return trigger != null && !trigger.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OccurrenceImpl

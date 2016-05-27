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

import ptlide.xtext.ptl.Participant;
import ptlide.xtext.ptl.ParticipantDescription;
import ptlide.xtext.ptl.ParticipantId;
import ptlide.xtext.ptl.PtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantImpl#getParticipantDescription <em>Participant Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected ParticipantId name;

  /**
   * The cached value of the '{@link #getParticipantDescription() <em>Participant Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipantDescription()
   * @generated
   * @ordered
   */
  protected ParticipantDescription participantDescription;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParticipantImpl()
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
    return PtlPackage.Literals.PARTICIPANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantId getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(ParticipantId newName, NotificationChain msgs)
  {
    ParticipantId oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(ParticipantId newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantDescription getParticipantDescription()
  {
    return participantDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParticipantDescription(ParticipantDescription newParticipantDescription, NotificationChain msgs)
  {
    ParticipantDescription oldParticipantDescription = participantDescription;
    participantDescription = newParticipantDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION, oldParticipantDescription, newParticipantDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParticipantDescription(ParticipantDescription newParticipantDescription)
  {
    if (newParticipantDescription != participantDescription)
    {
      NotificationChain msgs = null;
      if (participantDescription != null)
        msgs = ((InternalEObject)participantDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION, null, msgs);
      if (newParticipantDescription != null)
        msgs = ((InternalEObject)newParticipantDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION, null, msgs);
      msgs = basicSetParticipantDescription(newParticipantDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION, newParticipantDescription, newParticipantDescription));
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
      case PtlPackage.PARTICIPANT__NAME:
        return basicSetName(null, msgs);
      case PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION:
        return basicSetParticipantDescription(null, msgs);
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
      case PtlPackage.PARTICIPANT__NAME:
        return getName();
      case PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION:
        return getParticipantDescription();
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
      case PtlPackage.PARTICIPANT__NAME:
        setName((ParticipantId)newValue);
        return;
      case PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION:
        setParticipantDescription((ParticipantDescription)newValue);
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
      case PtlPackage.PARTICIPANT__NAME:
        setName((ParticipantId)null);
        return;
      case PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION:
        setParticipantDescription((ParticipantDescription)null);
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
      case PtlPackage.PARTICIPANT__NAME:
        return name != null;
      case PtlPackage.PARTICIPANT__PARTICIPANT_DESCRIPTION:
        return participantDescription != null;
    }
    return super.eIsSet(featureID);
  }

} //ParticipantImpl

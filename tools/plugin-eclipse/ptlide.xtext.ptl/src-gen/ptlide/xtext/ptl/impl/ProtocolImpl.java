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

import ptlide.xtext.ptl.Description;
import ptlide.xtext.ptl.Goals;
import ptlide.xtext.ptl.Participants;
import ptlide.xtext.ptl.Protocol;
import ptlide.xtext.ptl.PtlPackage;
import ptlide.xtext.ptl.States;
import ptlide.xtext.ptl.Transitions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.ProtocolImpl#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ProtocolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ProtocolImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ProtocolImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ProtocolImpl#getStates <em>States</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ProtocolImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolImpl extends MinimalEObjectImpl.Container implements Protocol
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
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected Description description;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected Goals goals;

  /**
   * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipants()
   * @generated
   * @ordered
   */
  protected Participants participants;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected States states;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected Transitions transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtocolImpl()
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
    return PtlPackage.Literals.PROTOCOL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs)
  {
    Description oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(Description newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goals getGoals()
  {
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoals(Goals newGoals, NotificationChain msgs)
  {
    Goals oldGoals = goals;
    goals = newGoals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__GOALS, oldGoals, newGoals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoals(Goals newGoals)
  {
    if (newGoals != goals)
    {
      NotificationChain msgs = null;
      if (goals != null)
        msgs = ((InternalEObject)goals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__GOALS, null, msgs);
      if (newGoals != null)
        msgs = ((InternalEObject)newGoals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__GOALS, null, msgs);
      msgs = basicSetGoals(newGoals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__GOALS, newGoals, newGoals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participants getParticipants()
  {
    return participants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParticipants(Participants newParticipants, NotificationChain msgs)
  {
    Participants oldParticipants = participants;
    participants = newParticipants;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__PARTICIPANTS, oldParticipants, newParticipants);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParticipants(Participants newParticipants)
  {
    if (newParticipants != participants)
    {
      NotificationChain msgs = null;
      if (participants != null)
        msgs = ((InternalEObject)participants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__PARTICIPANTS, null, msgs);
      if (newParticipants != null)
        msgs = ((InternalEObject)newParticipants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__PARTICIPANTS, null, msgs);
      msgs = basicSetParticipants(newParticipants, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__PARTICIPANTS, newParticipants, newParticipants));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States getStates()
  {
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStates(States newStates, NotificationChain msgs)
  {
    States oldStates = states;
    states = newStates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__STATES, oldStates, newStates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStates(States newStates)
  {
    if (newStates != states)
    {
      NotificationChain msgs = null;
      if (states != null)
        msgs = ((InternalEObject)states).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__STATES, null, msgs);
      if (newStates != null)
        msgs = ((InternalEObject)newStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__STATES, null, msgs);
      msgs = basicSetStates(newStates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__STATES, newStates, newStates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transitions getTransitions()
  {
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransitions(Transitions newTransitions, NotificationChain msgs)
  {
    Transitions oldTransitions = transitions;
    transitions = newTransitions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__TRANSITIONS, oldTransitions, newTransitions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitions(Transitions newTransitions)
  {
    if (newTransitions != transitions)
    {
      NotificationChain msgs = null;
      if (transitions != null)
        msgs = ((InternalEObject)transitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__TRANSITIONS, null, msgs);
      if (newTransitions != null)
        msgs = ((InternalEObject)newTransitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PROTOCOL__TRANSITIONS, null, msgs);
      msgs = basicSetTransitions(newTransitions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PROTOCOL__TRANSITIONS, newTransitions, newTransitions));
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
      case PtlPackage.PROTOCOL__DESCRIPTION:
        return basicSetDescription(null, msgs);
      case PtlPackage.PROTOCOL__GOALS:
        return basicSetGoals(null, msgs);
      case PtlPackage.PROTOCOL__PARTICIPANTS:
        return basicSetParticipants(null, msgs);
      case PtlPackage.PROTOCOL__STATES:
        return basicSetStates(null, msgs);
      case PtlPackage.PROTOCOL__TRANSITIONS:
        return basicSetTransitions(null, msgs);
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
      case PtlPackage.PROTOCOL__NAME:
        return getName();
      case PtlPackage.PROTOCOL__DESCRIPTION:
        return getDescription();
      case PtlPackage.PROTOCOL__GOALS:
        return getGoals();
      case PtlPackage.PROTOCOL__PARTICIPANTS:
        return getParticipants();
      case PtlPackage.PROTOCOL__STATES:
        return getStates();
      case PtlPackage.PROTOCOL__TRANSITIONS:
        return getTransitions();
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
      case PtlPackage.PROTOCOL__NAME:
        setName((String)newValue);
        return;
      case PtlPackage.PROTOCOL__DESCRIPTION:
        setDescription((Description)newValue);
        return;
      case PtlPackage.PROTOCOL__GOALS:
        setGoals((Goals)newValue);
        return;
      case PtlPackage.PROTOCOL__PARTICIPANTS:
        setParticipants((Participants)newValue);
        return;
      case PtlPackage.PROTOCOL__STATES:
        setStates((States)newValue);
        return;
      case PtlPackage.PROTOCOL__TRANSITIONS:
        setTransitions((Transitions)newValue);
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
      case PtlPackage.PROTOCOL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PtlPackage.PROTOCOL__DESCRIPTION:
        setDescription((Description)null);
        return;
      case PtlPackage.PROTOCOL__GOALS:
        setGoals((Goals)null);
        return;
      case PtlPackage.PROTOCOL__PARTICIPANTS:
        setParticipants((Participants)null);
        return;
      case PtlPackage.PROTOCOL__STATES:
        setStates((States)null);
        return;
      case PtlPackage.PROTOCOL__TRANSITIONS:
        setTransitions((Transitions)null);
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
      case PtlPackage.PROTOCOL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PtlPackage.PROTOCOL__DESCRIPTION:
        return description != null;
      case PtlPackage.PROTOCOL__GOALS:
        return goals != null;
      case PtlPackage.PROTOCOL__PARTICIPANTS:
        return participants != null;
      case PtlPackage.PROTOCOL__STATES:
        return states != null;
      case PtlPackage.PROTOCOL__TRANSITIONS:
        return transitions != null;
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
    result.append(')');
    return result.toString();
  }

} //ProtocolImpl

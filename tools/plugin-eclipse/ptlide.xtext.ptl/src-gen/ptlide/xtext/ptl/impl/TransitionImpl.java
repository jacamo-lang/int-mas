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

import ptlide.xtext.ptl.PtlPackage;
import ptlide.xtext.ptl.StateId;
import ptlide.xtext.ptl.Transition;
import ptlide.xtext.ptl.TransitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.TransitionImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.TransitionImpl#getDestinationState <em>Destination State</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.TransitionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getSourceState() <em>Source State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceState()
   * @generated
   * @ordered
   */
  protected StateId sourceState;

  /**
   * The cached value of the '{@link #getDestinationState() <em>Destination State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationState()
   * @generated
   * @ordered
   */
  protected StateId destinationState;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TransitionType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return PtlPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateId getSourceState()
  {
    return sourceState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceState(StateId newSourceState, NotificationChain msgs)
  {
    StateId oldSourceState = sourceState;
    sourceState = newSourceState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.TRANSITION__SOURCE_STATE, oldSourceState, newSourceState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceState(StateId newSourceState)
  {
    if (newSourceState != sourceState)
    {
      NotificationChain msgs = null;
      if (sourceState != null)
        msgs = ((InternalEObject)sourceState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.TRANSITION__SOURCE_STATE, null, msgs);
      if (newSourceState != null)
        msgs = ((InternalEObject)newSourceState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.TRANSITION__SOURCE_STATE, null, msgs);
      msgs = basicSetSourceState(newSourceState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.TRANSITION__SOURCE_STATE, newSourceState, newSourceState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateId getDestinationState()
  {
    return destinationState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestinationState(StateId newDestinationState, NotificationChain msgs)
  {
    StateId oldDestinationState = destinationState;
    destinationState = newDestinationState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.TRANSITION__DESTINATION_STATE, oldDestinationState, newDestinationState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationState(StateId newDestinationState)
  {
    if (newDestinationState != destinationState)
    {
      NotificationChain msgs = null;
      if (destinationState != null)
        msgs = ((InternalEObject)destinationState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.TRANSITION__DESTINATION_STATE, null, msgs);
      if (newDestinationState != null)
        msgs = ((InternalEObject)newDestinationState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.TRANSITION__DESTINATION_STATE, null, msgs);
      msgs = basicSetDestinationState(newDestinationState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.TRANSITION__DESTINATION_STATE, newDestinationState, newDestinationState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TransitionType newType, NotificationChain msgs)
  {
    TransitionType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.TRANSITION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TransitionType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.TRANSITION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.TRANSITION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.TRANSITION__TYPE, newType, newType));
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
      case PtlPackage.TRANSITION__SOURCE_STATE:
        return basicSetSourceState(null, msgs);
      case PtlPackage.TRANSITION__DESTINATION_STATE:
        return basicSetDestinationState(null, msgs);
      case PtlPackage.TRANSITION__TYPE:
        return basicSetType(null, msgs);
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
      case PtlPackage.TRANSITION__SOURCE_STATE:
        return getSourceState();
      case PtlPackage.TRANSITION__DESTINATION_STATE:
        return getDestinationState();
      case PtlPackage.TRANSITION__TYPE:
        return getType();
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
      case PtlPackage.TRANSITION__SOURCE_STATE:
        setSourceState((StateId)newValue);
        return;
      case PtlPackage.TRANSITION__DESTINATION_STATE:
        setDestinationState((StateId)newValue);
        return;
      case PtlPackage.TRANSITION__TYPE:
        setType((TransitionType)newValue);
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
      case PtlPackage.TRANSITION__SOURCE_STATE:
        setSourceState((StateId)null);
        return;
      case PtlPackage.TRANSITION__DESTINATION_STATE:
        setDestinationState((StateId)null);
        return;
      case PtlPackage.TRANSITION__TYPE:
        setType((TransitionType)null);
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
      case PtlPackage.TRANSITION__SOURCE_STATE:
        return sourceState != null;
      case PtlPackage.TRANSITION__DESTINATION_STATE:
        return destinationState != null;
      case PtlPackage.TRANSITION__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl

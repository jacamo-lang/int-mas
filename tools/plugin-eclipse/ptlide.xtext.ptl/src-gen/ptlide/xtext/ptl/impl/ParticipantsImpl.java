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

import ptlide.xtext.ptl.Participant;
import ptlide.xtext.ptl.Participants;
import ptlide.xtext.ptl.PtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participants</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantsImpl#getParticipants <em>Participants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantsImpl extends MinimalEObjectImpl.Container implements Participants
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
   * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipants()
   * @generated
   * @ordered
   */
  protected EList<Participant> participants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParticipantsImpl()
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
    return PtlPackage.Literals.PARTICIPANTS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANTS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Participant> getParticipants()
  {
    if (participants == null)
    {
      participants = new EObjectContainmentEList<Participant>(Participant.class, this, PtlPackage.PARTICIPANTS__PARTICIPANTS);
    }
    return participants;
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
      case PtlPackage.PARTICIPANTS__PARTICIPANTS:
        return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
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
      case PtlPackage.PARTICIPANTS__NAME:
        return getName();
      case PtlPackage.PARTICIPANTS__PARTICIPANTS:
        return getParticipants();
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
      case PtlPackage.PARTICIPANTS__NAME:
        setName((String)newValue);
        return;
      case PtlPackage.PARTICIPANTS__PARTICIPANTS:
        getParticipants().clear();
        getParticipants().addAll((Collection<? extends Participant>)newValue);
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
      case PtlPackage.PARTICIPANTS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PtlPackage.PARTICIPANTS__PARTICIPANTS:
        getParticipants().clear();
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
      case PtlPackage.PARTICIPANTS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PtlPackage.PARTICIPANTS__PARTICIPANTS:
        return participants != null && !participants.isEmpty();
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

} //ParticipantsImpl

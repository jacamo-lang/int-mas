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
import ptlide.xtext.ptl.ParticipantDescription;
import ptlide.xtext.ptl.PtlPackage;
import ptlide.xtext.ptl.Role;
import ptlide.xtext.ptl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantDescriptionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantDescriptionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantDescriptionImpl#getType <em>Type</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.impl.ParticipantDescriptionImpl#getCard <em>Card</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantDescriptionImpl extends MinimalEObjectImpl.Container implements ParticipantDescription
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final String KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected String kind = KIND_EDEFAULT;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected Role role;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getCard() <em>Card</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCard()
   * @generated
   * @ordered
   */
  protected ParticipantCardinality card;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParticipantDescriptionImpl()
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
    return PtlPackage.Literals.PARTICIPANT_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(String newKind)
  {
    String oldKind = kind;
    kind = newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_DESCRIPTION__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRole(Role newRole, NotificationChain msgs)
  {
    Role oldRole = role;
    role = newRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_DESCRIPTION__ROLE, oldRole, newRole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(Role newRole)
  {
    if (newRole != role)
    {
      NotificationChain msgs = null;
      if (role != null)
        msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_DESCRIPTION__ROLE, null, msgs);
      if (newRole != null)
        msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_DESCRIPTION__ROLE, null, msgs);
      msgs = basicSetRole(newRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_DESCRIPTION__ROLE, newRole, newRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_DESCRIPTION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_DESCRIPTION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_DESCRIPTION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_DESCRIPTION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinality getCard()
  {
    return card;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCard(ParticipantCardinality newCard, NotificationChain msgs)
  {
    ParticipantCardinality oldCard = card;
    card = newCard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_DESCRIPTION__CARD, oldCard, newCard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCard(ParticipantCardinality newCard)
  {
    if (newCard != card)
    {
      NotificationChain msgs = null;
      if (card != null)
        msgs = ((InternalEObject)card).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_DESCRIPTION__CARD, null, msgs);
      if (newCard != null)
        msgs = ((InternalEObject)newCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtlPackage.PARTICIPANT_DESCRIPTION__CARD, null, msgs);
      msgs = basicSetCard(newCard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PtlPackage.PARTICIPANT_DESCRIPTION__CARD, newCard, newCard));
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
      case PtlPackage.PARTICIPANT_DESCRIPTION__ROLE:
        return basicSetRole(null, msgs);
      case PtlPackage.PARTICIPANT_DESCRIPTION__TYPE:
        return basicSetType(null, msgs);
      case PtlPackage.PARTICIPANT_DESCRIPTION__CARD:
        return basicSetCard(null, msgs);
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
      case PtlPackage.PARTICIPANT_DESCRIPTION__KIND:
        return getKind();
      case PtlPackage.PARTICIPANT_DESCRIPTION__ROLE:
        return getRole();
      case PtlPackage.PARTICIPANT_DESCRIPTION__TYPE:
        return getType();
      case PtlPackage.PARTICIPANT_DESCRIPTION__CARD:
        return getCard();
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
      case PtlPackage.PARTICIPANT_DESCRIPTION__KIND:
        setKind((String)newValue);
        return;
      case PtlPackage.PARTICIPANT_DESCRIPTION__ROLE:
        setRole((Role)newValue);
        return;
      case PtlPackage.PARTICIPANT_DESCRIPTION__TYPE:
        setType((Type)newValue);
        return;
      case PtlPackage.PARTICIPANT_DESCRIPTION__CARD:
        setCard((ParticipantCardinality)newValue);
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
      case PtlPackage.PARTICIPANT_DESCRIPTION__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case PtlPackage.PARTICIPANT_DESCRIPTION__ROLE:
        setRole((Role)null);
        return;
      case PtlPackage.PARTICIPANT_DESCRIPTION__TYPE:
        setType((Type)null);
        return;
      case PtlPackage.PARTICIPANT_DESCRIPTION__CARD:
        setCard((ParticipantCardinality)null);
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
      case PtlPackage.PARTICIPANT_DESCRIPTION__KIND:
        return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
      case PtlPackage.PARTICIPANT_DESCRIPTION__ROLE:
        return role != null;
      case PtlPackage.PARTICIPANT_DESCRIPTION__TYPE:
        return type != null;
      case PtlPackage.PARTICIPANT_DESCRIPTION__CARD:
        return card != null;
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
    result.append(" (kind: ");
    result.append(kind);
    result.append(')');
    return result.toString();
  }

} //ParticipantDescriptionImpl

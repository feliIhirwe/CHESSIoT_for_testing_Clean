/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage
 * @generated
 */
public class CHESSIoTSoftwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTSoftwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwareSwitch() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTSoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD: {
				VirtualBoard virtualBoard = (VirtualBoard)theEObject;
				T result = caseVirtualBoard(virtualBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TSTATE: {
				IoTState ioTState = (IoTState)theEObject;
				T result = caseIoTState(ioTState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TEVENT: {
				IoTEvent ioTEvent = (IoTEvent)theEObject;
				T result = caseIoTEvent(ioTEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.SYSTEM_SW: {
				SystemSW systemSW = (SystemSW)theEObject;
				T result = caseSystemSW(systemSW);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.INCOMING_EVENT: {
				IncomingEvent incomingEvent = (IncomingEvent)theEObject;
				T result = caseIncomingEvent(incomingEvent);
				if (result == null) result = caseIoTEvent(incomingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.RECEIVE_PAYLOAD: {
				ReceivePayload receivePayload = (ReceivePayload)theEObject;
				T result = caseReceivePayload(receivePayload);
				if (result == null) result = caseIoTAction(receivePayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TACTION: {
				IoTAction ioTAction = (IoTAction)theEObject;
				T result = caseIoTAction(ioTAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.PAYLOAD: {
				Payload payload = (Payload)theEObject;
				T result = casePayload(payload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.MESSAGE_CONTENT: {
				MessageContent messageContent = (MessageContent)theEObject;
				T result = caseMessageContent(messageContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT: {
				OutgoingEvent outgoingEvent = (OutgoingEvent)theEObject;
				T result = caseOutgoingEvent(outgoingEvent);
				if (result == null) result = caseIoTEvent(outgoingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD: {
				SendPayload sendPayload = (SendPayload)theEObject;
				T result = caseSendPayload(sendPayload);
				if (result == null) result = caseIoTAction(sendPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.STATE_TRANSITION: {
				StateTransition stateTransition = (StateTransition)theEObject;
				T result = caseStateTransition(stateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY: {
				VirtualEntity virtualEntity = (VirtualEntity)theEObject;
				T result = caseVirtualEntity(virtualEntity);
				if (result == null) result = caseSystemSW(virtualEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TELEMENT: {
				IoTElement ioTElement = (IoTElement)theEObject;
				T result = caseIoTElement(ioTElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.GENERIC_EVENT: {
				GenericEvent genericEvent = (GenericEvent)theEObject;
				T result = caseGenericEvent(genericEvent);
				if (result == null) result = caseIoTEvent(genericEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.GENERIC_IO_TACTION: {
				GenericIoTAction genericIoTAction = (GenericIoTAction)theEObject;
				T result = caseGenericIoTAction(genericIoTAction);
				if (result == null) result = caseIoTAction(genericIoTAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualBoard(VirtualBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TState</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TState</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTState(IoTState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTEvent(IoTEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System SW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System SW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSW(SystemSW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingEvent(IncomingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceivePayload(ReceivePayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTAction(IoTAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayload(Payload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageContent(MessageContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingEvent(OutgoingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendPayload(SendPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateTransition(StateTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualEntity(VirtualEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTElement(IoTElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericEvent(GenericEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Io TAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Io TAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericIoTAction(GenericIoTAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CHESSIoTSoftwareSwitch

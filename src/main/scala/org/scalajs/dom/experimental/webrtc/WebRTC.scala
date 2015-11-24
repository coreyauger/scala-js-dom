package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.raw.{Promise, DOMError, Event, EventTarget}
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import org.scalajs.dom.{MediaStream, MediaStreamTrack, MediaStreamEvent}

@js.native
trait RTCIdentityAssertion extends js.Object{
  val idp:String = js.native
  val name:String = js.native
}

object RTCIdentityAssertion{
  def apply(
      idp: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined):RTCIdentityAssertion ={
    val result = js.Dynamic.literal()
    idp.foreach(result.idp = _)
    name.foreach(result.name = _)
    result.asInstanceOf[RTCIdentityAssertion]
  }
}

@js.native
trait MediaConstraints extends js.Object{
  var audio: Boolean = js.native
  var video: Boolean = js.native
  var optional: js.Array[js.Dynamic] =  js.native
  var mandatory: js.Array[js.Dynamic] =  js.native
}

object MediaConstraints {
  def apply(
      video: js.UndefOr[Boolean] = js.undefined,
      audio: js.UndefOr[Boolean] = js.undefined,
      optional: js.UndefOr[js.Array[js.Dynamic]] = js.undefined,
      mandatory: js.UndefOr[js.Dynamic] = js.undefined): MediaConstraints = {
    val result = js.Dynamic.literal()
    video.foreach(result.video = _)
    audio.foreach(result.audio = _)
    optional.foreach(result.optional = _)
    mandatory.foreach(result.mandatory = _)
    result.asInstanceOf[MediaConstraints]
  }
}

@js.native
trait RTCIceServer extends js.Object{
  var url:String  = js.native
  var username:String  = js.native
  var credential:String  = js.native
}

object RTCIceServer{
  def apply(
      url: js.UndefOr[String] = js.undefined,
      username: js.UndefOr[String] = js.undefined,
      credential: js.UndefOr[String] = js.undefined): RTCIceServer = {
    val result = js.Dynamic.literal()
    url.foreach(result.url = _)
    username.foreach(result.username = _)
    credential.foreach(result.credential = _)
    result.asInstanceOf[RTCIceServer]
  }
}

@js.native
trait RTCConfiguration extends js.Object{
  var iceServers:js.Array[RTCIceServer] = js.native
}

object RTCConfiguration {
  def apply(
      iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined): RTCConfiguration = {
    val result = js.Dynamic.literal()
    iceServers.foreach(result.iceServers = _)
    result.asInstanceOf[RTCConfiguration]
  }
}

@JSName("RTCSessionDescription")
@js.native
class RTCSessionDescription(options: js.Dynamic) extends js.Object {

  /**
   * This constructor returns a new RTCSessionDescription. The parameter is a
   * RTCSessionDescriptionInit dictionary containing the (optional) values
   * for the two properties. Any values not specified in the dictionary will
   * be initialized to null.
   *
   * MDN
   */
  //def this(options: js.Dynamic) = this(options)

  /**
   * An enum of type RTCSdpType describing the session description's type.
   *
   * MDN
   */
  var `type`:String = js.native

  /**
   * A DOMString containing the SDP format describing the session.
   *
   * MDN
   */
  var sdp:String = js.native

  /**
   * Returns a JSON description of the object. The values of both properties,
   * type and {domxref("RTCSessionDescription.sdp", "sdp")}}, are contained
   * in the generated JSON.
   *
   * MDN
   */
  def toJson():js.Any = js.native
}

object RTCSessionDescription{
  def apply(
      `type`: js.UndefOr[String] = js.undefined,
      sdp:   js.UndefOr[String] = js.undefined): RTCSessionDescription = {
    val result = js.Dynamic.literal()
    `type`.foreach(result.`type` = _)
    sdp.foreach(result.sdp = _)
    new RTCSessionDescription(result)
  }
}

object RTCSdpType{
  val offer = "offer"
  val pranswer = "pranswer"
  val answer = "answer"
  val rollback = "rollback"
}

@JSName("RTCIceCandidate")
@js.native
class RTCIceCandidate(builder: js.Dynamic) extends js.Object {
  var candidate: String = js.native
  var sdpMLineIndex: Int = js.native
  var sdpMid:String = js.native
}

object RTCIceCandidate {
  def apply(
      candidate: js.UndefOr[String] = js.undefined,
      sdpMLineIndex: js.UndefOr[Int] = js.undefined,
      sdpMid: js.UndefOr[String] = js.undefined): RTCIceCandidate = {
    val result = js.Dynamic.literal()
    candidate.foreach(result.candidate = _)
    sdpMLineIndex.foreach(result.sdpMLineIndex = _)
    sdpMid.foreach(result.sdpMid = _)
    new RTCIceCandidate(result)
  }
}

object MediaDevicesInfoKind{
  val videoinput = "videoinput"
  val audioinput = "audioinput"
  val audiooutput = "audiooutput"
}

@js.native
trait MediaDevicesInfo extends js.Object{

  /**
   * Returns a DOMString that is an identifier for the represented device
   * that is persisted across sessions. It is un-guessable by other
   * applications and unique to the origin of the calling application. It is
   * reset when the user clears cookies (for Private Browsing, a different
   * identifier is used that is not persisted across sessions).
   *
   * MDN
   */
  val deviceId: String = js.native

  /**
   * Returns a DOMString that is a group identifier. Two devices have the same
   * group identifier if they belong to the same physical device; for example
   * a monitor with both a built-in camera and microphone.
   *
   * MDN
   */
  val groupId:String = js.native

  /**
   * enum MediaDevicesInfoKind
   * Returns an enumerated value that is either "videoinput", "audioinput"
   * or "audiooutput".
   *
   * MDN
   */
  val kind:String = js.native

  /**
   * Returns a DOMString that is a label describing this device (for example
   * "External USB Webcam"). Only available during active MediaStream use or
   * when persistent permissions have been granted.
   *
   * MDN
   */
  val label:String = js.native
}

object MediaDevicesInfo {
  def apply(
      deviceId: js.UndefOr[String] = js.undefined,
      groupId: js.UndefOr[String] = js.undefined,
      kind: js.UndefOr[String] = js.undefined,
      label: js.UndefOr[String] = js.undefined): MediaDevicesInfo = {
    val result = js.Dynamic.literal()
    deviceId.foreach(result.deviceId = _)
    groupId.foreach(result.groupId = _)
    kind.foreach(result.kind = _)
    label.foreach(result.label = _)
    result.asInstanceOf[MediaDevicesInfo]
  }
}

// TODO: ..
// https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel
trait RTCDataChannel {
  // TODO: ...
}

//https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection
trait RTCDataChannelInit{
  // TODO: ..
}

//https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection
trait RTCDTMFSender{
  // TODO: ..
}

//https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection
trait RTCStatsReport{
  // TODO: ..
}

@js.native
trait RTCPeerConnectionIceEvent extends Event{
  val candidate:RTCIceCandidate  = js.native
}

object IceConnectionState{
  val `new` = "new"
  val checking = "checking"
  val connected = "connected"
  val completed = "completed"
  val failed = "failed"
  val disconnected = "disconnected"
  val closed = "closed"
}

object SignalingState{
  val stable = "stable"
  val have_local_offer = "have-local-offer"
  val have_local_pranswer = "have-local-pranswer"
  val have_remote_pranswer = "have-remote-pranswer"
  val closed = "closed"
}

/**
 * The MediaStream
 *
 * MDN
 *
 */
@JSName("webkitRTCPeerConnection")
@js.native
class RTCPeerConnection(
    configuration:js.UndefOr[RTCConfiguration] = js.undefined,
    constraints:js.UndefOr[MediaConstraints] = js.undefined) extends EventTarget {
  /**
   * READONLY Returns an enum of type RTCIceConnectionState that describes the
   * ICE connection state for the connection. When this value changes, a
   * iceconnectionstatechange event is fired on the object. The possible values
   * are:
   *    "new": the ICE agent is gathering addresses or waiting for remote
   *    candidates (or both).
   *
   *    "checking": the ICE agent has remote candidates, on at least one
   *    component, and is check them, though it has not found a connection yet.
   *    At the same time, it may still be gathering candidates.
   *
   *    "connected": the ICE agent has found a usable connection for each
   *    component, but is still testing more remote candidates for a better
   *    connection. At the same time, it may still be gathering candidates.
   *
   *    "completed": the ICE agent has found a usable connection for each
   *    component, and is no more testing remote candidates.
   *
   *    "failed": the ICE agent has checked all the remote candidates and
   *    didn't find a match for at least one component. Connections may have
   *    been found for some components.
   *
   *    "disconnected": liveness check has failed for at least one component.
   *    This may be a transient state, e. g. on a flaky network, that can
   *    recover by itself.
   *
   *    "closed": the ICE agent has shutdown and is not answering to requests.
   *
   * MDN
   */
  val iceConnectionState: String = js.native

  /**
   * READONLY Returns an enum of type RTCIceGatheringState that describes the
   * ICE gathering state for the connection. The possible values are:
   *    "new": the object was just created, and no networking has occurred yet.
   *
   *    "gathering": the ICE engine is in the process of gathering candidates
   *    for this connection.
   *
   *    "complete": the ICE engine has completed gathering. Events such as
   *    adding a new interface or a new TURN server will cause the state to
   *    go back to gathering.
   *
   * MDN
   */
  val iceGatheringState: String = js.native

  /**
   * READONLY Returns a RTCSessionDescription describing the session for the
   * local end of the connection. If it has not yet been set, it can be null.
   *
   * MDN
   */
  val localDescription: RTCSessionDescription = js.native

  /**
   * Returns a RTCIdentityAssertion, that is a couple of a domain name (idp)
   * and a name (name) representing the identity of the remote peer of this
   * connection, once set and verified. If no peer has yet been set and
   * verified, this property will return null. Once set, via the appropriate
   * method, it can't be changed.
   *
   * MDN
   */
  val peerIdentity: RTCIdentityAssertion = js.native

  /**
   * Returns a RTCSessionDescription describing the session for the remote end
   * of the connection. If it has not yet been set, it can be null.
   *
   * MDN
   */
  val remoteDescription: RTCSessionDescription = js.native

  /**
   * READONLY Returns an enum of type RTCSignalingState that describes the
   * signaling state of the local connection. This state describes the SDP
   * offer, that defines the configuration of the connections like the
   * description of the locally associated objects of type MediaStream, the
   * codec/RTP/RTCP options, the candidates gathered by the ICE Agent. When
   * this value changes, a signalingstatechange event is fired on the object.
   * The possible values are:
   *
   *    "stable": there is no SDP offer/answer exchange in progress. This is
   *    also the initial state of the connection.
   *
   *    "have-local-offer": the local end of the connection has locally applied
   *    a SDP offer.
   *
   *    "have-remote-offer": the remote end of the connection has locally
   *    applied a SDP offer.
   *
   *    "have-local-pranswer": a remote SDP offer has been applied, and a SDP
   *    pranswer applied locally.
   *
   *    "have-remote-pranswer": a local SDP offer has been applied, and a SDP
   *    pranswer applied remotely.
   *
   *    "closed": the connection is closed.
   *
   * MDN
   */
  val signalingState: String = js.native

  /**
   * Is the event handler called when the addstream event is received. Such an
   * event is sent when a MediaStream is added to this connection by the
   * remote peer. The event is sent immediately after the call
   * RTCPeerConnection.setRemoteDescription() and doesn't wait for the result
   * of the SDP negotiation.
   *
   * MDN
   */
  var onaddstream: js.Function1[MediaStreamEvent, Any] = js.native

  /**
   * Is the event handler called when the datachannel event is received. Such
   * an event is sent when a RTCDataChannel is added to this connection.
   *
   * MDN
   */
  var ondatachannel: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the icecandidate event is received. Such
   * an event is sent when a RTCICECandidate object is added to the script..
   *
   * MDN
   */
  var onicecandidate: js.Function1[RTCPeerConnectionIceEvent, Any] = js.native

  /**
   * Is the event handler called when the iceconnectionstatechange event is
   * received. Such an event is sent when the value of iceConnectionState
   * changes.
   *
   * MDN
   */
  var oniceconnectionstatechange: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the identityresult event is received.
   * Such an event is sent when an identity assertion is generated, via
   * getIdentityAssertion(), or during the creation of an offer or an answer.
   *
   * MDN
   */
  var onidentityresult: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the idpassertionerror event is received.
   * Such an event is sent when the associated identity provider (IdP)
   * encounters an error while generating an identity assertion.
   *
   * MDN
   */
  var onidpassertionerror: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler alled when the idpvalidationerror event is received.
   * Such an event is sent when the associated identity provider (IdP)
   * encounters an error while validating an identity assertion.
   *
   * MDN
   */
  var onidpvalidationerror: js.Function1[Event ,Any] = js.native

  /**
   * Is the event handler called when the negotiationneeded event, sent by the
   * browser to inform that negotiation will be required at some point in the
   * future, is received.
   *
   * MDN
   */
  var onnegotiationneeded: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the peeridentity event, sent when a peer
   * identity has been set and verified on this connection, is received.
   *
   * MDN
   */
  var onpeeridentity: js.Function1[Event, Any] = js.native

  /**
   * Is the event handler called when the removestream event, sent when a
   * MediaStream is removed from this connection, is received.
   *
   * MDN
   */
  var onremovestream: js.Function1[MediaStreamEvent, Any] = js.native

  /**
   * Is the event handler called when the signalingstatechange event, sent when
   * the value of signalingState changes, is received.
   *
   * MDN
   */
  var onsignalingstatechange: js.Function1[Event, Any] = js.native

  /**
   * Creates an offer that is a request to find a remote peer with a specific
   * configuration. The two first parameters of this methods are respectively
   * success and error callbacks, the optional third one are options the user
   * want to have, like audio or video streams.
   *
   * MDN
   */
  def createOffer(
      success:js.Function1[RTCSessionDescription, Any],
      error:js.Function1[DOMError, Any],
      options:js.UndefOr[MediaConstraints] = js.undefined): Unit = js.native

  /**
   * Creates an answer to the offer received by the remote peer, in a two-part
   * offer/answer negotiation of a connection. The two first parameters are
   * respectively success and error callbacks, the optional third one represent
   * options for the answer to be created.
   *
   * MDN
   */
  def createAnswer(
      success:js.Function1[RTCSessionDescription, Any],
      error:js.Function1[DOMError, Any],
      options:js.UndefOr[MediaConstraints] = js.undefined): Unit = js.native

  /**
   * Changes the local description associated with the connection. The
   * description defines the properties of the connection like its codec. The
   * connection is affected by this change and must be able to support both
   * old and new descriptions. The method takes three parameters, a
   * RTCSessionDescription object to set, and two callbacks, one called if
   * the change of description succeeds, another called if it failed.
   *
   * MDN
   */
  def setLocalDescription(
      description:RTCSessionDescription,
      success:js.Function0[Any],
      error:js.Function1[DOMError,Any]): Unit = js.native

  /**
   * Changes the remote description associated with the connection. The
   * description defines the properties of the connection like its codec.
   * The connection is affected by this change and must be able to support
   * both old and new descriptions. The method takes three parameters, a
   * RTCSessionDescription object to set, and two callbacks, one called if
   * the change of description succeeds, another called if it failed.
   *
   * MDN
   */
  def setRemoteDescription(
      description:RTCSessionDescription,
      success:js.Function0[Any],
      error:js.Function1[DOMError,Any]): Unit = js.native

  /**
   * The updateIce method updates the ICE Agent process of gathering local
   * candidates and pinging remote candidates. If there is a mandatory
   * constraint called "IceTransports" it will control how the ICE engine
   * can act. This can be used to limit the use to TURN candidates by a callee
   * to avoid leaking location information prior to the call being accepted.
   * This call may result in a change to the state of the ICE Agent, and may
   * result in a change to media state if it results in connectivity being
   * established
   *
   * MDN
   */
  def updateIce(
      configuration: js.UndefOr[RTCConfiguration] = js.undefined,
      constraints: js.UndefOr[MediaConstraints] = js.undefined): Unit = js.native

  /**
   * The addIceCandidate() method provides a remote candidate to the ICE Agent.
   * In addition to being added to the remote description, connectivity checks
   * will be sent to the new candidates as long as the "IceTransports"
   * constraint is not set to "none". This call will result in a change to the
   * connection state of the ICE Agent, and may result in a change to media
   * state if it results in different connectivity being established.
   *
   * MDN
   */
  def addIceCandidate(
      candidate:RTCIceCandidate, success:js.Function0[Any],
      error:js.Function1[DOMError, Any]): Unit = js.native

  def getConfiguration(): RTCConfiguration = js.native

  /**
   * Returns an array of MediaStream associated with the local end of the
   * connection. The array may be empty.
   *
   * MDN
   */
  def getLocalStreams(): js.Array[MediaStream] = js.native

  /**
   * Returns an array of MediaStream associated with the remote end of the
   * connection. The array may be empty.
   *
   * MDN
   */
  def getRemoteStreams(): js.Array[MediaStream] = js.native

  /**
   * Returns the MediaStream with the given id that is associated with local
   * or remote end of the connection. If no stream matches, it returns null.
   *
   * MDN
   */
  def getStreamById(id: String): MediaStream = js.native

  /**
   * Adds a MediaStream as a local source of audio or video. If the
   * negotiation already happened, a new one will be needed for the remote
   * peer to be able to use it.
   *
   * MDN
   */
  def addStream(stream: MediaStream): Unit = js.native

  /**
   * Removes a MediaStream as a local source of audio or video. If the
   * negotiation already happened, a new one will be needed for the remote
   * peer to stop using it.
   *
   * MDN
   */
  def removeStream(stream: MediaStream): Unit = js.native

  /**
   * Abruptly closes a connection.
   *
   * MDN
   */
  def close(): Unit = js.native

  /**
   * Creates a new RTCDataChannel associated with this connection. The method
   * takes a dictionary as parameter, with the configuration required for the
   * underlying data channel, like its reliability.
   *
   * MDN
   */
  def createDataChannel(
      label:String,
      options:js.UndefOr[RTCDataChannelInit] = js.undefined): RTCDataChannel = js.native

  /**
   * Creates a new RTCDTMFSender, associated to a specific MediaStreamTrack,
   * that will be able to send DTMF phone signaling over the connection.
   *
   * MDN
   */
  def createDTMFSender(): RTCDTMFSender = js.native

  /**
   * Creates a new RTCStatsReport that contains and allows access to statistics
   * regarding the connection.
   *
   * MDN
   */
  def getStats(): RTCStatsReport = js.native

  /**
   * Sets the Identity Provider (IdP) to the triplet given in parameter: its
   * name, the protocol used to communicate with it (optional) and an optional
   * username. The IdP will be used only when an assertion will be needed.
   *
   * MDN
   */
  def setIdentityProvider(id: js.Any): Unit = js.native

  /**
   * Initiates the gathering of an identity assertion. This has an effect only
   * if the signalingState is not "closed". It is not expected for the
   * application dealing with the RTCPeerConnection: this is automatically
   * done; an explicit call only allows to anticipate the need.
   *
   * MDN
   */
  def getIdentityAssertion(id: js.Any): Unit = js.native
}

/**
 * ## This is an experimental technology ##
 * The MediaDevices interface provides access to connected media input devices
 * like cameras and microphones, as well as screensharing.
 *
 * MDN
 */
@JSName("window.navigator.mediaDevices")
@js.native
object MediaDevices extends js.Object {

  /**
   * The MediaDevices.getUserMedia() method prompts the user for permission
   * to use one video and/or one audio input device such as a camera or
   * screensharing and/or a microphone. If the user provides permission, then
   * the returned Promise is resolved with the resulting MediaStream object.
   * If the user denies permission, or media is not available, then the promise
   * is rejected with PermissionDeniedError or NotFoundError respectively. Note
   * that it is possible for the returned promise to neither resolve nor
   * reject, as the user is not required to make a choice.
   *
   * MDN
   */
  def getUserMedia(constraints: MediaConstraints): Promise[MediaStream] = js.native

  /**
   * The MediaDevices.enumeratedDevices() method collects information about
   * the media input and output devices available on the system.
   *
   * MDN
   */
  def enumerateDevices(): Promise[MediaDevicesInfo] = js.native
}

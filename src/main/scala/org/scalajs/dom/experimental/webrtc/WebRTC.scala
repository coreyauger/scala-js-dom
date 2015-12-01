/**
 * http://www.w3.org/TR/2015/WD-webrtc-20150210/
 */
package org.scalajs.dom.experimental.webrtc

import org.scalajs.dom.raw.{Promise, DOMError, Event, EventTarget}
import scala.scalajs.js
import org.scalajs.dom.{MediaStreamTrack, MediaStream, MediaStreamEvent}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
trait RTCIdentityAssertion extends js.Object {
  val idp: String = js.native
  val name :String = js.native
}

object RTCIdentityAssertion {
  def apply(
      idp: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined): RTCIdentityAssertion = {
    val result = js.Dynamic.literal()
    idp.foreach(result.idp = _)
    name.foreach(result.name = _)
    result.asInstanceOf[RTCIdentityAssertion]
  }
}

@js.native
trait RTCOfferOptions  extends js.Object {

  /**
   * When the value of this dictionary member is true, the generated
   * description will have ICE credentials that are different from the current
   * credentials (as visible in the localDescription attribute's SDP). Applying
   * the generated description will restart ICE.
   *
   * When the value of this dictionary member is false, and the localDescription
   * attribute has valid ICE credentials, the generated description will have
   * the same ICE credentials as the current value from the localDescription
   * attribute.
   *
   */
  var iceRestart: Boolean = js.native

  /**
   * In some cases, an RTCPeerConnection may wish to receive audio but not send
   * any audio. The RTCPeerConnection needs to know if it should signal to the
   * remote side whether it wishes to receive audio. This option allows an
   * application to indicate its preferences for the number of audio streams
   * to receive when creating an offer.
   *
   */
  var offerToReceiveAudio: Long = js.native

  /**
   * In some cases, an RTCPeerConnection may wish to receive video but not send
   * any video. The RTCPeerConnection needs to know if it should signal to the
   * remote side whether it wishes to receive video or not. This option allows
   * an application to indicate its preferences for the number of video streams
   * to receive when creating an offer.
   *
   */
  var offerToReceiveVideo: Long = js.native

  /**
   * default: true
   * Many codecs and system are capable of detecting "silence" and changing
   * their behavior in this case by doing things such as not transmitting any
   * media. In many cases, such as when dealing with emergency calling or
   * sounds other than spoken voice, it is desirable to be able to turn off
   * this behavior. This option allows the application to provide information
   * about whether it wishes this type of processing enabled or disabled.
   *
   */
  var voiceActivityDetection: Boolean = js.native
}

object RTCOfferOptions  {
  def apply(
      iceRestart: js.UndefOr[Boolean] = js.undefined,
      offerToReceiveAudio: js.UndefOr[Long] = js.undefined,
      offerToReceiveVideo: js.UndefOr[Long] = js.undefined,
      voiceActivityDetection: js.UndefOr[Boolean] = js.undefined): RTCOfferOptions  = {
    val result = js.Dynamic.literal()
    iceRestart.foreach(result.iceRestart = _)
    offerToReceiveAudio.foreach(result.offerToReceiveAudio = _)
    offerToReceiveVideo.foreach(result.offerToReceiveVideo = _)
    voiceActivityDetection.foreach(result.voiceActivityDetection = _)
    result.asInstanceOf[RTCOfferOptions ]
  }
}

@js.native
trait RTCIceServer extends js.Object {
  var urls: String | js.Array[String] = js.native
  var username: String  = js.native
  var credential: String  = js.native
}

object RTCIceServer {
  def apply(
      urls: js.UndefOr[String | js.Array[String]] = js.undefined,
      username: js.UndefOr[String] = js.undefined,
      credential: js.UndefOr[String] = js.undefined): RTCIceServer = {
    val result = js.Dynamic.literal()
    urls.foreach(v => result.urls = v.asInstanceOf[js.Any])
    username.foreach(result.username = _)
    credential.foreach(result.credential = _)
    result.asInstanceOf[RTCIceServer]
  }
}



@js.native
trait RTCConfiguration extends js.Object {

  /**
   * An array containing URIs of servers available to be used by ICE, such
   * as STUN and TURN server.
   *
   */
  var iceServers: js.Array[RTCIceServer] = js.native

  /**
   * defaulting to "all"
   * Indicates which candidates the ICE engine is allowed to use.
   *
   */
  var iceTransportPolicy: String = js.native

  /**
   * defaulting to "balanced"
   * Indicates which BundlePolicy to use.
   *
   */
  var bundlePolicy: String = js.native

  /**
   * Sets the target peer identity for the RTCPeerConnection. The
   * RTCPeerConnection will establish a connection to a remote peer unless
   * it can be successfully authenticated with the provided name.
   *
   */
  var peerIdentity: String = js.native
}

object RTCConfiguration {
  object RTCIceTransportPolicy {
    val none = "none"
    val relay = "relay"
    val all = "all"
  }

  object RTCBundlePolicy {
    val balanced = "balanced"
    val `max-compat` = "max-compat"
    val `max-bundle` = "max-bundle"
  }

  def apply(
      iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined,
      iceTransportPolicy: js.UndefOr[String] = js.undefined,
      bundlePolicy: js.UndefOr[String] = js.undefined,
      peerIdentity: js.UndefOr[String] = js.undefined): RTCConfiguration = {
    val result = js.Dynamic.literal()
    iceServers.foreach(result.iceServers = _)
    iceTransportPolicy.foreach(result.iceTransportPolicy = _)
    bundlePolicy.foreach(result.bundlePolicy = _)
    peerIdentity.foreach(result.peerIdentity = _)
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
  var `type`: String = js.native

  /**
   * A DOMString containing the SDP format describing the session.
   *
   * MDN
   */
  var sdp: String = js.native

  /**
   * Returns a JSON description of the object. The values of both properties,
   * type and {domxref("RTCSessionDescription.sdp", "sdp")}}, are contained
   * in the generated JSON.
   *
   * MDN
   */
  def toJson(): js.Any = js.native
}

object RTCSessionDescription {
  def apply(
      `type`: js.UndefOr[String] = js.undefined,
      sdp: js.UndefOr[String] = js.undefined): RTCSessionDescription = {
    val result = js.Dynamic.literal()
    `type`.foreach(result.`type` = _)
    sdp.foreach(result.sdp = _)
    new RTCSessionDescription(result)
  }
}

object RTCSdpType {
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
  var sdpMid: String = js.native
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

object MediaDevicesInfoKind {
  val videoinput = "videoinput"
  val audioinput = "audioinput"
  val audiooutput = "audiooutput"
}

@js.native
trait MediaDevicesInfo extends js.Object {

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
  val groupId: String = js.native

  /**
   * enum MediaDevicesInfoKind
   * Returns an enumerated value that is either "videoinput", "audioinput"
   * or "audiooutput".
   *
   * MDN
   */
  val kind: String = js.native

  /**
   * Returns a DOMString that is a label describing this device (for example
   * "External USB Webcam"). Only available during active MediaStream use or
   * when persistent permissions have been granted.
   *
   * MDN
   */
  val label: String = js.native
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
trait RTCDataChannelInit {
  // TODO: ..
}

//https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection
trait RTCDTMFSender {
  // TODO: ..
}

//https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection
trait RTCStatsReport {
  // TODO: ..
}

@js.native
trait RTCPeerConnectionIceEvent extends Event {
  val candidate: RTCIceCandidate  = js.native
}

object IceConnectionState {
  val `new` = "new"
  val checking = "checking"
  val connected = "connected"
  val completed = "completed"
  val failed = "failed"
  val disconnected = "disconnected"
  val closed = "closed"
}

object SignalingState {
  val stable = "stable"
  val `have-local-offer` = "have-local-offer"
  val `have-local-pranswer` = "have-local-pranswer"
  val `have-remote-pranswer` = "have-remote-pranswer"
  val closed = "closed"
}

/**
 * The MediaStream
 *
 * MDN
 *
 */
@js.native
class RTCPeerConnection(
    configuration: js.UndefOr[RTCConfiguration] = js.undefined) extends EventTarget {
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
   * This attribute indicates whether the remote peer is able to accept trickled
   * ICE candidates [TRICKLE-ICE]. The value is determined based on whether a
   * remote description indicates support for trickle ICE, as defined in Section
   * 4.1.9 of [RTCWEB-JSEP]. Prior to the completion of setRemoteDescription,
   * this value is null.
   */
  val canTrickleIceCandidates: js.Any = js.native

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
  var onidpvalidationerror: js.Function1[Event, Any] = js.native

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
   * The createOffer method generates a blob of SDP that contains an RFC 3264
   * offer with the supported configurations for the session, including
   * descriptions of the local MediaStreams attached to this RTCPeerConnection,
   * the codec/RTP/RTCP options supported by this implementation, and any
   * candidates that have been gathered by the ICE Agent. The options parameter
   * may be supplied to provide additional control over the offer generated.
   *
   * As an offer, the generated SDP will contain the full set of capabilities
   * supported by the session (as opposed to an answer, which will include only
   * a specific negotiated subset to use); for each SDP line, the generation
   * of the SDP must follow the appropriate process for generating an offer.
   * In the event createOffer is called after the session is established,
   * createOffer will generate an offer that is compatible with the current
   * session, incorporating any changes that have been made to the session
   * since the last complete offer-answer exchange, such as addition or removal
   * of streams. If no changes have been made, the offer will include the
   * capabilities of the current local description as well as any additional
   * capabilities that could be negotiated in an updated offer.
   *
   * Session descriptions generated by createOffer must be immediately usable
   * by setLocalDescription without causing an error as long as
   * setLocalDescription is called reasonably soon. If a system has limited
   * resources (e.g. a finite number of decoders), createOffer needs to return
   * an offer that reflects the current state of the system, so that
   * setLocalDescription will succeed when it attempts to acquire those
   * resources. The session descriptions must remain usable by
   * setLocalDescription without causing an error until at least the end of
   * the fulfillment callback of the returned promise. Calling this method
   * is needed to get the ICE user name fragment and password.
   *
   * If the RTCPeerConnection is configured to generate Identity assertions,
   * then the session description shall contain an appropriate assertion.
   *
   * If this RTCPeerConnection object is closed before the SDP generation
   * process completes, the USER agent must suppress the result and not resolve
   * or reject the returned promise.
   *
   * If the SDP generation process completed successfully, the user agent must
   * resolve the returned promise with a newly created RTCSessionDescription
   * object, representing the generated offer.
   *
   * If the SDP generation process failed for any reason, the user agent must
   * reject the returned promise with an DOMError object of type TBD as its
   * argument.
   *
   * To Do: Discuss privacy aspects of this from a fingerprinting point of
   * view - it's probably around as bad as access to a canvas :-)
   *
   * Parameter	Type	Nullable	Optional	Description
   * options	RTCOfferOptions	✘	✔
   * Return type: Promise<RTCSessionDescription>
   */
  def createOffer(
      options: js.UndefOr[RTCOfferOptions] = js.undefined): Promise[RTCSessionDescription] = js.native

  /**
   * The createAnswer method generates an [SDP] answer with the supported
   * configuration for the session that is compatible with the parameters in
   * the remote configuration. Like createOffer, the returned blob contains
   * descriptions of the local MediaStreams attached to this RTCPeerConnection,
   * the codec/RTP/RTCP options negotiated for this session, and any candidates
   * that have been gathered by the ICE Agent. The options parameter may be
   * supplied to provide additional control over the generated answer.
   *
   * As an answer, the generated SDP will contain a specific configuration
   * that, along with the corresponding offer, specifies how the media plane
   * should be established. The generation of the SDP must follow the
   * appropriate process for generating an answer.
   *
   * Session descriptions generated by createAnswer must be immediately usable
   * by setLocalDescription without causing an error as long as
   * setLocalDescription is called reasonably soon. Like createOffer, the
   * returned description should reflect the current state of the system. The
   * session descriptions must remain usable by setLocalDescription without
   * causing an error until at least the end of the fulfillment callback of
   * the returned promise. Calling this method is needed to get the ICE user
   * name fragment and password.
   *
   * An answer can be marked as provisional, as described in [RTCWEB-JSEP], by
   * setting the type to "pranswer".
   *
   * If the RTCPeerConnection is configured to generate Identity assertions,
   * then the session description shall contain an appropriate assertion.
   *
   * If this RTCPeerConnection object is closed before the SDP generation process
   * completes, the USER agent must suppress the result and not resolve or reject
   * the returned promise.
   *
   * If the SDP generation process completed successfully, the user agent must
   * resolve the returned promise with a newly created RTCSessionDescription
   * object, representing the generated answer.
   *
   * If the SDP generation process failed for any reason, the user agent must
   * reject the returned promise with a DOMError object of type TBD.
   *
   * No parameters.
   * Return type: Promise<RTCSessionDescription>
   */
  def createAnswer(): Promise[RTCSessionDescription] = js.native

  /**
   * Changes the local description associated with the connection. The
   * description defines the properties of the connection like its codec. The
   * connection is affected by this change and must be able to support both
   * old and new descriptions. The method takes one parameters, a
   * RTCSessionDescription object to set, and returns a Promise.
   *
   * MDN
   */
  def setLocalDescription(
      description: RTCSessionDescription): Promise[Any] = js.native

  /**
   * Changes the remote description associated with the connection. The
   * description defines the properties of the connection like its codec.
   * The connection is affected by this change and must be able to support
   * both old and new descriptions. The method takes one parameters, a
   * RTCSessionDescription object to set, and returns a Promise.
   *
   * MDN
   */
  def setRemoteDescription(
      description: RTCSessionDescription): Promise[Any] = js.native

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
      configuration: js.UndefOr[RTCConfiguration] = js.undefined): Unit = js.native

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
      candidate: RTCIceCandidate): Promise[Any] = js.native

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
      label: String,
      options: js.UndefOr[RTCDataChannelInit] = js.undefined): RTCDataChannel = js.native

  /**
   * Creates a new RTCDTMFSender, associated to a specific MediaStreamTrack,
   * that will be able to send DTMF phone signaling over the connection.
   *
   * MDN
   */
  def createDTMFSender(track: MediaStreamTrack): RTCDTMFSender = js.native

  /**
   * Creates a new RTCStatsReport that contains and allows access to statistics
   * regarding the connection.
   *
   * MDN
   */
  def getStats(
      selector: MediaStreamTrack,
      callback: js.Function1[RTCStatsReport, Any],
      error: js.Function1[DOMError, Any]): RTCStatsReport = js.native

  /**
   * Sets the identity provider to be used for a given RTCPeerConnection object.
   * Applications need not make this call; if the browser is already configured
   * for an IdP, then that configured IdP might be used to get an assertion.
   *
   * When the setIdentityProvider() method is invoked, the user agent must run the
   * following steps:
   *    If the connection's RTCPeerConnection signalingState is closed, throw
   *    an InvalidStateError exception and abort these steps.
   *
   *    Set the current identity provider values to the triplet (provider,
   *    protocol, usernameHint).
   *
   *    If any identity provider value has changed, discard any stored identity
   *    assertion.
   *
   *    Identity provider information is not used until an identity assertion
   *    is required, either in response to a call to getIdentityAssertion, or a
   *    session description is requested with a call to either createOffer or
   *    createAnswer.
   */
  def setIdentityProvider(
      provider: String,
      protocol: String,
      usernameHint: String): Unit = js.native

  /**
   * Initiates the process of obtaining an identity assertion. Applications
   * need not make this call. It is merely intended to allow them to start the
   * process of obtaining identity assertions before a call is initiated. If an
   * identity is needed, either because the browser has been configured with a
   * default identity provider or because the setIdentityProvider() method was
   * called, then an identity will be automatically requested when an offer or
   * answer is created.
   *
   * When getIdentityAssertion is invoked, queue a task to run the following
   * steps:
   *
   *    If the connection's RTCPeerConnection signalingState is closed, abort
   *    these steps.
   *
   *    Request an identity assertion from the IdP.
   *
   *    Resolve the promise with the base64 and JSON encoded assertion.
   *
   */
  def getIdentityAssertion(): Promise[String] = js.native
}



@js.native
trait MediaStreamConstraints extends js.Object {
  var video: Boolean | MediaTrackConstraints = js.native
  var audio: Boolean | MediaTrackConstraints = js.native
  var peerIdentity: String = js.native
}


object MediaStreamConstraints {
  def apply(
      video: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined,
      audio: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined,
      peerIdentity: js.UndefOr[String] = js.undefined): MediaStreamConstraints = {
    val result = js.Dynamic.literal()
    video.foreach(v => result.video = v.asInstanceOf[js.Any])
    audio.foreach(a => result.audio = a.asInstanceOf[js.Any])
    peerIdentity.foreach(result.peerIdentity = _)
    result.asInstanceOf[MediaStreamConstraints]
  }
}

@js.native
trait MediaTrackConstraints extends js.Object {
  var advanced: js.Array[MediaTrackConstraintSet] = js.native
}

object MediaTrackConstraint {
  def apply(
      advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined): MediaTrackConstraints = {
    val result = js.Dynamic.literal()
    advanced.foreach(result.advanced = _)
    result.asInstanceOf[MediaTrackConstraints]
  }
}

@js.native
trait MediaTrackConstraintSet extends js.Object {
  var width: Long = js.native
  var height: Long = js.native
  var aspectRatio: Double = js.native
  var frameRate: Double = js.native
  var facingMode: String = js.native
  var volume: Double = js.native
  var sampleRate: Long = js.native
  var sampleSize: Long = js.native
  var echoCancellation: Boolean = js.native
  var deviceId: String = js.native
  var groupId: String = js.native
}

object MediaTrackConstraintSet {
  def apply(
      width: js.UndefOr[String] = js.undefined,
      height: js.UndefOr[String] = js.undefined,
      aspectRatio: js.UndefOr[String] = js.undefined,
      frameRate: js.UndefOr[String] = js.undefined,
      facingMode: js.UndefOr[String] = js.undefined,
      volume: js.UndefOr[Double] = js.undefined,
      sampleRate: js.UndefOr[Long] = js.undefined,
      sampleSize: js.UndefOr[Long] = js.undefined,
      echoCancellation: js.UndefOr[Boolean] = js.undefined,
      deviceId: js.UndefOr[String] = js.undefined,
      groupId: js.UndefOr[String] = js.undefined): MediaTrackConstraintSet = {
    val result = js.Dynamic.literal()
    width.foreach(result.width = _)
    height.foreach(result.height = _)
    aspectRatio.foreach(result.aspectRatio = _)
    frameRate.foreach(result.frameRate = _)
    facingMode.foreach(result.facingMode = _)
    volume.foreach(result.volume = _)
    sampleRate.foreach(result.sampleRate = _)
    sampleSize.foreach(result.sampleSize = _)
    echoCancellation.foreach(result.echoCancellation = _)
    deviceId.foreach(result.deviceId = _)
    groupId.foreach(result.groupId = _)
    result.asInstanceOf[MediaTrackConstraintSet]
  }
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
  def getUserMedia(constraints: MediaStreamConstraints): Promise[MediaStream] = js.native

  /**
   * The MediaDevices.enumeratedDevices() method collects information about
   * the media input and output devices available on the system.
   *
   * MDN
   */
  def enumerateDevices(): Promise[MediaDevicesInfo] = js.native
}

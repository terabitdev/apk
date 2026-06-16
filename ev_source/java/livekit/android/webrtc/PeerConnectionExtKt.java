package io.livekit.android.webrtc;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0005H\u0000¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Llivekit/org/webrtc/PeerConnection;", "", "isConnected", "(Llivekit/org/webrtc/PeerConnection;)Z", "isDisconnected", "Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "(Llivekit/org/webrtc/PeerConnection$PeerConnectionState;)Z", "Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "copy", "(Llivekit/org/webrtc/PeerConnection$RTCConfiguration;)Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "config", "Lsn/z;", "copyFrom", "(Llivekit/org/webrtc/PeerConnection$RTCConfiguration;Llivekit/org/webrtc/PeerConnection$RTCConfiguration;)V", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PeerConnectionExtKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeerConnection.PeerConnectionState.values().length];
            try {
                iArr[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PeerConnection.PeerConnectionState.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PeerConnection.RTCConfiguration copy(PeerConnection.RTCConfiguration rTCConfiguration) {
        rTCConfiguration.getClass();
        PeerConnection.RTCConfiguration rTCConfiguration2 = new PeerConnection.RTCConfiguration(t.f33547a);
        copyFrom(rTCConfiguration2, rTCConfiguration);
        return rTCConfiguration2;
    }

    public static final void copyFrom(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.RTCConfiguration rTCConfiguration2) {
        rTCConfiguration.getClass();
        rTCConfiguration2.getClass();
        rTCConfiguration.activeResetSrtpParams = rTCConfiguration2.activeResetSrtpParams;
        rTCConfiguration.audioJitterBufferFastAccelerate = rTCConfiguration2.audioJitterBufferFastAccelerate;
        rTCConfiguration.audioJitterBufferMaxPackets = rTCConfiguration2.audioJitterBufferMaxPackets;
        rTCConfiguration.bundlePolicy = rTCConfiguration2.bundlePolicy;
        rTCConfiguration.candidateNetworkPolicy = rTCConfiguration2.candidateNetworkPolicy;
        rTCConfiguration.certificate = rTCConfiguration2.certificate;
        rTCConfiguration.continualGatheringPolicy = rTCConfiguration2.continualGatheringPolicy;
        rTCConfiguration.cryptoOptions = rTCConfiguration2.cryptoOptions;
        rTCConfiguration.disableIPv6OnWifi = rTCConfiguration2.disableIPv6OnWifi;
        rTCConfiguration.enableCpuOveruseDetection = rTCConfiguration2.enableCpuOveruseDetection;
        rTCConfiguration.enableDscp = rTCConfiguration2.enableDscp;
        rTCConfiguration.enableIceGatheringOnAnyAddressPorts = rTCConfiguration2.enableIceGatheringOnAnyAddressPorts;
        rTCConfiguration.enableImplicitRollback = rTCConfiguration2.enableImplicitRollback;
        rTCConfiguration.iceBackupCandidatePairPingInterval = rTCConfiguration2.iceBackupCandidatePairPingInterval;
        rTCConfiguration.iceCandidatePoolSize = rTCConfiguration2.iceCandidatePoolSize;
        rTCConfiguration.iceCheckIntervalStrongConnectivityMs = rTCConfiguration2.iceCheckIntervalStrongConnectivityMs;
        rTCConfiguration.iceCheckIntervalWeakConnectivityMs = rTCConfiguration2.iceCheckIntervalWeakConnectivityMs;
        rTCConfiguration.iceCheckMinInterval = rTCConfiguration2.iceCheckMinInterval;
        rTCConfiguration.iceConnectionReceivingTimeout = rTCConfiguration2.iceConnectionReceivingTimeout;
        rTCConfiguration.iceServers = rTCConfiguration2.iceServers;
        rTCConfiguration.iceTransportsType = rTCConfiguration2.iceTransportsType;
        rTCConfiguration.iceUnwritableMinChecks = rTCConfiguration2.iceUnwritableMinChecks;
        rTCConfiguration.iceUnwritableTimeMs = rTCConfiguration2.iceUnwritableTimeMs;
        rTCConfiguration.keyType = rTCConfiguration2.keyType;
        rTCConfiguration.maxIPv6Networks = rTCConfiguration2.maxIPv6Networks;
        rTCConfiguration.networkPreference = rTCConfiguration2.networkPreference;
        rTCConfiguration.offerExtmapAllowMixed = rTCConfiguration2.offerExtmapAllowMixed;
        rTCConfiguration.portAllocatorFlags = rTCConfiguration2.portAllocatorFlags;
        rTCConfiguration.portAllocatorMaxPort = rTCConfiguration2.portAllocatorMaxPort;
        rTCConfiguration.portAllocatorMinPort = rTCConfiguration2.portAllocatorMinPort;
        rTCConfiguration.presumeWritableWhenFullyRelayed = rTCConfiguration2.presumeWritableWhenFullyRelayed;
        rTCConfiguration.pruneTurnPorts = rTCConfiguration2.pruneTurnPorts;
        rTCConfiguration.rtcpMuxPolicy = rTCConfiguration2.rtcpMuxPolicy;
        rTCConfiguration.screencastMinBitrate = rTCConfiguration2.screencastMinBitrate;
        rTCConfiguration.sdpSemantics = rTCConfiguration2.sdpSemantics;
        rTCConfiguration.stableWritableConnectionPingIntervalMs = rTCConfiguration2.stableWritableConnectionPingIntervalMs;
        rTCConfiguration.stunCandidateKeepaliveIntervalMs = rTCConfiguration2.stunCandidateKeepaliveIntervalMs;
        rTCConfiguration.surfaceIceCandidatesOnIceTransportTypeChanged = rTCConfiguration2.surfaceIceCandidatesOnIceTransportTypeChanged;
        rTCConfiguration.suspendBelowMinBitrate = rTCConfiguration2.suspendBelowMinBitrate;
        rTCConfiguration.tcpCandidatePolicy = rTCConfiguration2.tcpCandidatePolicy;
        rTCConfiguration.turnCustomizer = rTCConfiguration2.turnCustomizer;
        rTCConfiguration.turnLoggingId = rTCConfiguration2.turnLoggingId;
        rTCConfiguration.turnPortPrunePolicy = rTCConfiguration2.turnPortPrunePolicy;
    }

    public static final boolean isConnected(PeerConnection peerConnection) {
        peerConnection.getClass();
        PeerConnection.PeerConnectionState connectionState = peerConnection.connectionState();
        connectionState.getClass();
        return isConnected(connectionState);
    }

    public static final boolean isDisconnected(PeerConnection.PeerConnectionState peerConnectionState) {
        peerConnectionState.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[peerConnectionState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean isConnected(PeerConnection.PeerConnectionState peerConnectionState) {
        peerConnectionState.getClass();
        return peerConnectionState == PeerConnection.PeerConnectionState.CONNECTED;
    }

    public static final boolean isDisconnected(PeerConnection peerConnection) {
        peerConnection.getClass();
        PeerConnection.PeerConnectionState connectionState = peerConnection.connectionState();
        connectionState.getClass();
        return isDisconnected(connectionState);
    }
}

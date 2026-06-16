package io.livekit.android.dagger;

import ho.l;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpCapabilities;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Llivekit/org/webrtc/RtpCapabilities;", "kotlin.jvm.PlatformType", "mediaType", "Llivekit/org/webrtc/MediaStreamTrack$MediaType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCModule$senderCapabilitiesGetter$1 extends n implements l {
    final /* synthetic */ PeerConnectionFactory $peerConnectionFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCModule$senderCapabilitiesGetter$1(PeerConnectionFactory peerConnectionFactory) {
        super(1);
        this.$peerConnectionFactory = peerConnectionFactory;
    }

    @Override // ho.l
    public final RtpCapabilities invoke(MediaStreamTrack.MediaType mediaType) {
        mediaType.getClass();
        RtpCapabilities rtpSenderCapabilities = this.$peerConnectionFactory.getRtpSenderCapabilities(mediaType);
        rtpSenderCapabilities.getClass();
        return rtpSenderCapabilities;
    }
}

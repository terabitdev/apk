package io.livekit.android.room;

import ho.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$updateRTCConfig$1 extends n implements a {
    final /* synthetic */ PeerConnection.RTCConfiguration $config;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$updateRTCConfig$1(PeerConnectionTransport peerConnectionTransport, PeerConnection.RTCConfiguration rTCConfiguration) {
        super(0);
        this.this$0 = peerConnectionTransport;
        this.$config = rTCConfiguration;
    }

    @Override // ho.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getPeerConnection().setConfiguration(this.$config));
    }
}

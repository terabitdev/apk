package io.livekit.android.room;

import ho.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.IceCandidate;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$addIceCandidate$1 extends n implements a {
    final /* synthetic */ IceCandidate $candidate;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$addIceCandidate$1(PeerConnectionTransport peerConnectionTransport, IceCandidate iceCandidate) {
        super(0);
        this.this$0 = peerConnectionTransport;
        this.$candidate = iceCandidate;
    }

    @Override // ho.a
    public final Boolean invoke() {
        List list;
        boolean add;
        boolean z6;
        if (this.this$0.getPeerConnection().getRemoteDescription() != null) {
            z6 = this.this$0.restartingIce;
            if (!z6) {
                add = this.this$0.getPeerConnection().addIceCandidate(this.$candidate);
                return Boolean.valueOf(add);
            }
        }
        list = this.this$0.pendingCandidates;
        add = list.add(this.$candidate);
        return Boolean.valueOf(add);
    }
}

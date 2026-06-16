package io.livekit.android.room.util;

import io.livekit.android.util.FlowDelegateKt;
import ir.r;
import ir.w;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/livekit/android/room/util/PeerConnectionStateObservable;", "Lsn/z;", "waitUntilConnected", "(Lio/livekit/android/room/util/PeerConnectionStateObservable;Lwn/c;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PeerConnectionStateObservableKt {
    public static final Object waitUntilConnected(final PeerConnectionStateObservable peerConnectionStateObservable, c<? super z> cVar) {
        Object k4 = r.k(new w(FlowDelegateKt.getFlow(new v(peerConnectionStateObservable) { // from class: io.livekit.android.room.util.PeerConnectionStateObservableKt$waitUntilConnected$2
            @Override // oo.r
            public Object get() {
                return ((PeerConnectionStateObservable) this.receiver).getConnectionState();
            }
        }), new PeerConnectionStateObservableKt$waitUntilConnected$3(null), 4), cVar);
        if (k4 == a.f37986a) {
            return k4;
        }
        return z.f31622a;
    }
}

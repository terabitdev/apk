package io.livekit.android.room;

import as.uc;
import et.d;
import ho.a;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.org.webrtc.IceCandidate;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SubscriberTransportObserver$onIceCandidate$1 extends n implements a {
    final /* synthetic */ IceCandidate $candidate;
    final /* synthetic */ SubscriberTransportObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberTransportObserver$onIceCandidate$1(SubscriberTransportObserver subscriberTransportObserver, IceCandidate iceCandidate) {
        super(0);
        this.this$0 = subscriberTransportObserver;
        this.$candidate = iceCandidate;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2552invoke() {
        SignalClient signalClient;
        LKLog.Companion companion = LKLog.INSTANCE;
        IceCandidate iceCandidate = this.$candidate;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "onIceCandidate: " + iceCandidate, new Object[0]);
        }
        signalClient = this.this$0.client;
        signalClient.sendCandidate(this.$candidate, uc.SUBSCRIBER);
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m2552invoke();
        return z.f31622a;
    }
}

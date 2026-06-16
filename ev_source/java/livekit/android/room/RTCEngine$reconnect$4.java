package io.livekit.android.room;

import fr.k1;
import ho.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lsn/z;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$reconnect$4 extends n implements l {
    final /* synthetic */ k1 $job;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$reconnect$4(RTCEngine rTCEngine, k1 k1Var) {
        super(1);
        this.this$0 = rTCEngine;
        this.$job = k1Var;
    }

    public final void invoke(Throwable th) {
        k1 k1Var;
        k1Var = this.this$0.reconnectingJob;
        if (m.c(k1Var, this.$job)) {
            this.this$0.reconnectingJob = null;
        }
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return z.f31622a;
    }
}

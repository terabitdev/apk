package io.livekit.android.room.participant;

import fr.k1;
import ho.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$performRpc$2$responsePayload$1$3 extends n implements a {
    final /* synthetic */ d0 $ackTimeoutJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$performRpc$2$responsePayload$1$3(d0 d0Var) {
        super(0);
        this.$ackTimeoutJob = d0Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2594invoke() {
        ((k1) this.$ackTimeoutJob.f20559a).cancel((CancellationException) null);
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m2594invoke();
        return z.f31622a;
    }
}

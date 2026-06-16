package io.livekit.android.room;

import android.gov.nist.javax.sip.header.ParameterNames;
import fr.k1;
import ho.l;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ParameterNames.CAUSE, "Lsn/z;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Room$connect$2$outerHandler$1 extends n implements l {
    final /* synthetic */ k1 $connectJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$connect$2$outerHandler$1(k1 k1Var) {
        super(1);
        this.$connectJob = k1Var;
    }

    public final void invoke(Throwable th) {
        if (th instanceof CancellationException) {
            this.$connectJob.cancel((CancellationException) th);
        }
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return z.f31622a;
    }
}

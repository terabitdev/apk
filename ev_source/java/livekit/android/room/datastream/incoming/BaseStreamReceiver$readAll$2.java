package io.livekit.android.room.datastream.incoming;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import ir.j;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$2", f = "BaseStreamReceiver.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {TokenNames.T, "Lir/j;", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BaseStreamReceiver$readAll$2 extends i implements q {
    int label;

    public BaseStreamReceiver$readAll$2(c<? super BaseStreamReceiver$readAll$2> cVar) {
        super(3, cVar);
    }

    @Override // ho.q
    public final Object invoke(j jVar, Throwable th, c<? super z> cVar) {
        return new BaseStreamReceiver$readAll$2(cVar).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.g(obj);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

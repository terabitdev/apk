package io.livekit.android.room.util;

import com.google.protobuf.c6;
import fr.d0;
import fr.l;
import ho.p;
import io.livekit.android.util.Either;
import java.util.List;
import kotlin.Metadata;
import or.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.util.CoroutineSdpObserver$awaitCreate$2$1", f = "CoroutineSdpObserver.kt", l = {106}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CoroutineSdpObserver$awaitCreate$2$1 extends i implements p {
    final /* synthetic */ l $cont;
    int label;
    final /* synthetic */ CoroutineSdpObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineSdpObserver$awaitCreate$2$1(CoroutineSdpObserver coroutineSdpObserver, l lVar, c<? super CoroutineSdpObserver$awaitCreate$2$1> cVar) {
        super(2, cVar);
        this.this$0 = coroutineSdpObserver;
        this.$cont = lVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new CoroutineSdpObserver$awaitCreate$2$1(this.this$0, this.$cont, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((CoroutineSdpObserver$awaitCreate$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        List list;
        a aVar2;
        a aVar3;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            aVar = this.this$0.stateLock;
            this.label = 1;
            Object a10 = aVar.a(this);
            xn.a aVar4 = xn.a.f37986a;
            if (a10 == aVar4) {
                return aVar4;
            }
        }
        Either either = this.this$0.createOutcome;
        CoroutineSdpObserver coroutineSdpObserver = this.this$0;
        if (either != null) {
            aVar3 = coroutineSdpObserver.stateLock;
            aVar3.n(null);
            this.$cont.resumeWith(either);
        } else {
            list = coroutineSdpObserver.pendingCreate;
            list.add(this.$cont);
            aVar2 = this.this$0.stateLock;
            aVar2.n(null);
        }
        return z.f31622a;
    }
}

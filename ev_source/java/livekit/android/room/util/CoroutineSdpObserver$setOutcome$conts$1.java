package io.livekit.android.room.util;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.util.Either;
import java.util.List;
import kotlin.Metadata;
import or.a;
import sn.z;
import tn.o;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.util.CoroutineSdpObserver$setOutcome$conts$1", f = "CoroutineSdpObserver.kt", l = {168}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfr/d0;", "", "Lwn/c;", "Lio/livekit/android/util/Either;", "Lsn/z;", "", "<anonymous>", "(Lfr/d0;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CoroutineSdpObserver$setOutcome$conts$1 extends i implements p {
    final /* synthetic */ Either<z, String> $value;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CoroutineSdpObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineSdpObserver$setOutcome$conts$1(CoroutineSdpObserver coroutineSdpObserver, Either<z, String> either, c<? super CoroutineSdpObserver$setOutcome$conts$1> cVar) {
        super(2, cVar);
        this.this$0 = coroutineSdpObserver;
        this.$value = either;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new CoroutineSdpObserver$setOutcome$conts$1(this.this$0, this.$value, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super List<? extends c<? super Either<z, String>>>> cVar) {
        return ((CoroutineSdpObserver$setOutcome$conts$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Either<z, String> either;
        CoroutineSdpObserver coroutineSdpObserver;
        List list;
        List list2;
        List list3;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                either = (Either) this.L$2;
                coroutineSdpObserver = (CoroutineSdpObserver) this.L$1;
                aVar = (a) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            aVar = this.this$0.stateLock;
            CoroutineSdpObserver coroutineSdpObserver2 = this.this$0;
            either = this.$value;
            this.L$0 = aVar;
            this.L$1 = coroutineSdpObserver2;
            this.L$2 = either;
            this.label = 1;
            Object a10 = aVar.a(this);
            xn.a aVar2 = xn.a.f37986a;
            if (a10 == aVar2) {
                return aVar2;
            }
            coroutineSdpObserver = coroutineSdpObserver2;
        }
        try {
            coroutineSdpObserver.setOutcome = either;
            if (either != null) {
                list2 = coroutineSdpObserver.pendingSets;
                list = o.g1(list2);
                list3 = coroutineSdpObserver.pendingSets;
                list3.clear();
            } else {
                list = null;
            }
            return list;
        } finally {
            aVar.n(null);
        }
    }
}

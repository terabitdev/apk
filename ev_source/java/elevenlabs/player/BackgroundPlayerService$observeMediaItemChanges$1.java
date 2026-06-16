package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ir.a1;
import ir.r;
import jr.j;
import kotlin.Metadata;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.m;
import sn.z;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeMediaItemChanges$1", f = "BackgroundPlayerService.kt", l = {496}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$observeMediaItemChanges$1 extends i implements p {
    final /* synthetic */ ir.i $emptyOffsetFlow;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$observeMediaItemChanges$1(BackgroundPlayerService backgroundPlayerService, ir.i iVar, wn.c<? super BackgroundPlayerService$observeMediaItemChanges$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$emptyOffsetFlow = iVar;
    }

    public static final boolean invokeSuspend$lambda$0(r0 r0Var, r0 r0Var2) {
        Long l4;
        if (m.c(r0Var.f36578a, r0Var2.f36578a)) {
            Bundle bundle = r0Var.f36581d.J;
            Long l7 = null;
            if (bundle != null) {
                l4 = ExchangeKt.getInitialOffset(bundle);
            } else {
                l4 = null;
            }
            Bundle bundle2 = r0Var2.f36581d.J;
            if (bundle2 != null) {
                l7 = ExchangeKt.getInitialOffset(bundle2);
            }
            if (m.c(l4, l7)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$observeMediaItemChanges$1(this.this$0, this.$emptyOffsetFlow, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$observeMediaItemChanges$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            a1 a1Var = new a1(this.this$0.currentMediaItem, 0);
            c cVar = new c(0);
            a2.p pVar = r.f18031a;
            i0.d(2, cVar);
            j G = r.G(r.p(a1Var, pVar, cVar), new BackgroundPlayerService$observeMediaItemChanges$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0, this.$emptyOffsetFlow));
            this.label = 1;
            Object k4 = r.k(G, this);
            xn.a aVar = xn.a.f37986a;
            if (k4 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}

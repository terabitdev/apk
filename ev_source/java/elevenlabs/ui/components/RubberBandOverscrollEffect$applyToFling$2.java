package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.RubberBandOverscrollEffect$applyToFling$2", f = "SwipeToActionBox.kt", l = {499}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class RubberBandOverscrollEffect$applyToFling$2 extends yn.i implements ho.p {
    final /* synthetic */ float $currentOverscrollDelta;
    int label;
    final /* synthetic */ RubberBandOverscrollEffect<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RubberBandOverscrollEffect$applyToFling$2(float f10, RubberBandOverscrollEffect<T> rubberBandOverscrollEffect, wn.c<? super RubberBandOverscrollEffect$applyToFling$2> cVar) {
        super(2, cVar);
        this.$currentOverscrollDelta = f10;
        this.this$0 = rubberBandOverscrollEffect;
    }

    public static final sn.z invokeSuspend$lambda$0(RubberBandOverscrollEffect rubberBandOverscrollEffect, float f10, float f11) {
        ho.l lVar;
        lVar = rubberBandOverscrollEffect.updateOverscrollDelta;
        lVar.invoke(Float.valueOf(f10));
        return sn.z.f31622a;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RubberBandOverscrollEffect$applyToFling$2(this.$currentOverscrollDelta, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RubberBandOverscrollEffect$applyToFling$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        j1.e1 e1Var;
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
            float f10 = this.$currentOverscrollDelta;
            e1Var = ((RubberBandOverscrollEffect) this.this$0).snapAnimationSpec;
            d2 d2Var = new d2(this.this$0, 0);
            this.label = 1;
            Object e10 = j1.e.e(f10, t2.u.P, e1Var, d2Var, this, 4);
            xn.a aVar = xn.a.f37986a;
            if (e10 == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}

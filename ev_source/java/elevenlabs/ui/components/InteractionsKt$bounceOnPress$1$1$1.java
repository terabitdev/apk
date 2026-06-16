package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.InteractionsKt$bounceOnPress$1$1$1", f = "Interactions.kt", l = {45}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class InteractionsKt$bounceOnPress$1$1$1 extends yn.i implements ho.p {
    final /* synthetic */ float $compressScale;
    final /* synthetic */ x3.a $haptic;
    final /* synthetic */ p1.l $interactionSource;
    final /* synthetic */ float $normalScale;
    final /* synthetic */ j1.d $scale;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionsKt$bounceOnPress$1$1$1(p1.l lVar, x3.a aVar, j1.d dVar, float f10, float f11, wn.c<? super InteractionsKt$bounceOnPress$1$1$1> cVar) {
        super(2, cVar);
        this.$interactionSource = lVar;
        this.$haptic = aVar;
        this.$scale = dVar;
        this.$compressScale = f10;
        this.$normalScale = f11;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new InteractionsKt$bounceOnPress$1$1$1(this.$interactionSource, this.$haptic, this.$scale, this.$compressScale, this.$normalScale, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((InteractionsKt$bounceOnPress$1$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        ir.q1 q1Var = ((p1.m) this.$interactionSource).f26311a;
        final x3.a aVar = this.$haptic;
        final j1.d dVar = this.$scale;
        final float f10 = this.$compressScale;
        final float f11 = this.$normalScale;
        ir.j jVar = new ir.j() { // from class: io.elevenlabs.ui.components.InteractionsKt$bounceOnPress$1$1$1.1
            public final Object emit(p1.j jVar2, wn.c<? super sn.z> cVar) {
                Object c5;
                boolean z6 = jVar2 instanceof p1.o;
                xn.a aVar2 = xn.a.f37986a;
                if (z6) {
                    x3.a.this.mo944performHapticFeedbackCdsT49E(1);
                    Object c10 = j1.d.c(dVar, new Float(f10), j1.e.s(50, 0, null, 6), null, cVar, 12);
                    if (c10 == aVar2) {
                        return c10;
                    }
                } else if (((jVar2 instanceof p1.p) || (jVar2 instanceof p1.n)) && (c5 = j1.d.c(dVar, new Float(f11), j1.e.r(0.5f, 1500.0f, 4, null), null, cVar, 12)) == aVar2) {
                    return c5;
                }
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                return emit((p1.j) obj2, (wn.c<? super sn.z>) cVar);
            }
        };
        this.label = 1;
        q1Var.collect(jVar, this);
        return xn.a.f37986a;
    }
}

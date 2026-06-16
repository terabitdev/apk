package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.AutoScrollingChipRowKt$autoScroll$2", f = "AutoScrollingChipRow.kt", l = {188}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/o2;", "Lsn/z;", "<anonymous>", "(Ln1/o2;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AutoScrollingChipRowKt$autoScroll$2 extends yn.i implements ho.p {
    final /* synthetic */ kotlin.jvm.internal.a0 $previousValue;
    final /* synthetic */ float $scrollDx;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollingChipRowKt$autoScroll$2(float f10, kotlin.jvm.internal.a0 a0Var, wn.c<? super AutoScrollingChipRowKt$autoScroll$2> cVar) {
        super(2, cVar);
        this.$scrollDx = f10;
        this.$previousValue = a0Var;
    }

    public static final sn.z invokeSuspend$lambda$0(kotlin.jvm.internal.a0 a0Var, n1.o2 o2Var, float f10, float f11) {
        float f12 = a0Var.f20555a;
        a0Var.f20555a = o2Var.e(f10 - f12) + f12;
        return sn.z.f31622a;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        AutoScrollingChipRowKt$autoScroll$2 autoScrollingChipRowKt$autoScroll$2 = new AutoScrollingChipRowKt$autoScroll$2(this.$scrollDx, this.$previousValue, cVar);
        autoScrollingChipRowKt$autoScroll$2.L$0 = obj;
        return autoScrollingChipRowKt$autoScroll$2;
    }

    @Override // ho.p
    public final Object invoke(n1.o2 o2Var, wn.c<? super sn.z> cVar) {
        return ((AutoScrollingChipRowKt$autoScroll$2) create(o2Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        n1.o2 o2Var = (n1.o2) this.L$0;
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
            float f10 = this.$scrollDx;
            j1.a2 s10 = j1.e.s(500, 0, j1.y.f18447d, 2);
            k kVar = new k(this.$previousValue, o2Var, 0);
            this.L$0 = null;
            this.label = 1;
            Object e10 = j1.e.e(t2.u.P, f10, s10, kVar, this, 4);
            xn.a aVar = xn.a.f37986a;
            if (e10 == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}

package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$4$1", f = "AutoScrollingChipRow.kt", l = {133}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AutoScrollingChipRowKt$AutoScrollingChipRow$4$1 extends yn.i implements ho.p {
    final /* synthetic */ u2.z0 $isPaused$delegate;
    final /* synthetic */ t1.z $lazyListState;
    final /* synthetic */ float $scrollDx;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollingChipRowKt$AutoScrollingChipRow$4$1(t1.z zVar, float f10, u2.z0 z0Var, wn.c<? super AutoScrollingChipRowKt$AutoScrollingChipRow$4$1> cVar) {
        super(2, cVar);
        this.$lazyListState = zVar;
        this.$scrollDx = f10;
        this.$isPaused$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        AutoScrollingChipRowKt$AutoScrollingChipRow$4$1 autoScrollingChipRowKt$AutoScrollingChipRow$4$1 = new AutoScrollingChipRowKt$AutoScrollingChipRow$4$1(this.$lazyListState, this.$scrollDx, this.$isPaused$delegate, cVar);
        autoScrollingChipRowKt$AutoScrollingChipRow$4$1.L$0 = obj;
        return autoScrollingChipRowKt$AutoScrollingChipRow$4$1;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AutoScrollingChipRowKt$AutoScrollingChipRow$4$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean AutoScrollingChipRow_6PoWaU8$lambda$2;
        Object autoScroll;
        fr.d0 d0Var = (fr.d0) this.L$0;
        int i10 = this.label;
        if (i10 != 0 && i10 != 1) {
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        while (fr.g0.y(d0Var)) {
            AutoScrollingChipRow_6PoWaU8$lambda$2 = AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$2(this.$isPaused$delegate);
            if (AutoScrollingChipRow_6PoWaU8$lambda$2) {
                break;
            }
            t1.z zVar = this.$lazyListState;
            float f10 = this.$scrollDx;
            this.L$0 = d0Var;
            this.label = 1;
            autoScroll = AutoScrollingChipRowKt.autoScroll(zVar, f10, this);
            xn.a aVar = xn.a.f37986a;
            if (autoScroll == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}

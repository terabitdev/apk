package io.elevenlabs.ui.components.headers;

import ae.l;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import l1.f2;
import sn.z;
import u2.x0;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ui.components.headers.ScrollingHeaderBoxKt$ScrollingHeaderBox$1$1", f = "ScrollingHeaderBox.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ScrollingHeaderBoxKt$ScrollingHeaderBox$1$1 extends i implements p {
    final /* synthetic */ x0 $globalOffset$delegate;
    final /* synthetic */ x0 $lastOffset$delegate;
    final /* synthetic */ f2 $scrollState;
    final /* synthetic */ x0 $topBarHeight$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingHeaderBoxKt$ScrollingHeaderBox$1$1(f2 f2Var, x0 x0Var, x0 x0Var2, x0 x0Var3, c<? super ScrollingHeaderBoxKt$ScrollingHeaderBox$1$1> cVar) {
        super(2, cVar);
        this.$scrollState = f2Var;
        this.$lastOffset$delegate = x0Var;
        this.$globalOffset$delegate = x0Var2;
        this.$topBarHeight$delegate = x0Var3;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ScrollingHeaderBoxKt$ScrollingHeaderBox$1$1(this.$scrollState, this.$lastOffset$delegate, this.$globalOffset$delegate, this.$topBarHeight$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ScrollingHeaderBoxKt$ScrollingHeaderBox$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int ScrollingHeaderBox$lambda$4;
        int ScrollingHeaderBox$lambda$7;
        int ScrollingHeaderBox$lambda$1;
        if (this.label == 0) {
            sn.a.g(obj);
            int h10 = this.$scrollState.f20901a.h();
            ScrollingHeaderBox$lambda$4 = ScrollingHeaderBoxKt.ScrollingHeaderBox$lambda$4(this.$lastOffset$delegate);
            int i10 = h10 - ScrollingHeaderBox$lambda$4;
            x0 x0Var = this.$globalOffset$delegate;
            ScrollingHeaderBox$lambda$7 = ScrollingHeaderBoxKt.ScrollingHeaderBox$lambda$7(x0Var);
            int i11 = ScrollingHeaderBox$lambda$7 + i10;
            ScrollingHeaderBox$lambda$1 = ScrollingHeaderBoxKt.ScrollingHeaderBox$lambda$1(this.$topBarHeight$delegate);
            ScrollingHeaderBoxKt.ScrollingHeaderBox$lambda$8(x0Var, l.m(i11, 0, ScrollingHeaderBox$lambda$1));
            ScrollingHeaderBoxKt.ScrollingHeaderBox$lambda$5(this.$lastOffset$delegate, this.$scrollState.f20901a.h());
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import w1.e0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.HomeReadsCarouselKt$HomeReadsCarouselV3$3$1", f = "HomeReadsCarousel.kt", l = {61}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HomeReadsCarouselKt$HomeReadsCarouselV3$3$1 extends i implements p {
    final /* synthetic */ e0 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeReadsCarouselKt$HomeReadsCarouselV3$3$1(e0 e0Var, wn.c<? super HomeReadsCarouselKt$HomeReadsCarouselV3$3$1> cVar) {
        super(2, cVar);
        this.$pagerState = e0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new HomeReadsCarouselKt$HomeReadsCarouselV3$3$1(this.$pagerState, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((HomeReadsCarouselKt$HomeReadsCarouselV3$3$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            e0 e0Var = this.$pagerState;
            this.label = 1;
            Object t10 = e0.t(e0Var, 0, this);
            xn.a aVar = xn.a.f37986a;
            if (t10 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}

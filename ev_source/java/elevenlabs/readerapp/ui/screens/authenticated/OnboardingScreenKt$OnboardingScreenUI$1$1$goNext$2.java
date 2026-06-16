package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$OnboardingScreenUI$1$1$goNext$2", f = "OnboardingScreen.kt", l = {499}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class OnboardingScreenKt$OnboardingScreenUI$1$1$goNext$2 extends yn.i implements ho.p {
    final /* synthetic */ w1.e0 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingScreenKt$OnboardingScreenUI$1$1$goNext$2(w1.e0 e0Var, wn.c<? super OnboardingScreenKt$OnboardingScreenUI$1$1$goNext$2> cVar) {
        super(2, cVar);
        this.$pagerState = e0Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new OnboardingScreenKt$OnboardingScreenUI$1$1$goNext$2(this.$pagerState, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((OnboardingScreenKt$OnboardingScreenUI$1$1$goNext$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            w1.e0 e0Var = this.$pagerState;
            int h10 = ((u2.f1) e0Var.f35962d.f5294c).h() + 1;
            this.label = 1;
            Object g10 = w1.e0.g(e0Var, h10, t2.u.P, null, this, 6);
            xn.a aVar = xn.a.f37986a;
            if (g10 == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}

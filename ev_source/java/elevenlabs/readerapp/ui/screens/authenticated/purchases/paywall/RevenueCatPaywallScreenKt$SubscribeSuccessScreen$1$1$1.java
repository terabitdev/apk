package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import u2.z0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallScreenKt$SubscribeSuccessScreen$1$1$1", f = "RevenueCatPaywallScreen.kt", l = {389}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class RevenueCatPaywallScreenKt$SubscribeSuccessScreen$1$1$1 extends i implements p {
    final /* synthetic */ z0 $visible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevenueCatPaywallScreenKt$SubscribeSuccessScreen$1$1$1(z0 z0Var, wn.c<? super RevenueCatPaywallScreenKt$SubscribeSuccessScreen$1$1$1> cVar) {
        super(2, cVar);
        this.$visible$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new RevenueCatPaywallScreenKt$SubscribeSuccessScreen$1$1$1(this.$visible$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((RevenueCatPaywallScreenKt$SubscribeSuccessScreen$1$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            this.label = 1;
            Object m10 = g0.m(300L, this);
            xn.a aVar = xn.a.f37986a;
            if (m10 == aVar) {
                return aVar;
            }
        }
        RevenueCatPaywallScreenKt.SubscribeSuccessScreen$lambda$0$2(this.$visible$delegate, true);
        return z.f31622a;
    }
}

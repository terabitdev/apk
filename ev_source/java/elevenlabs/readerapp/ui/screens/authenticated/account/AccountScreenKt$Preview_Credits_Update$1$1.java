package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import kotlin.Metadata;
import sn.z;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountScreenKt$Preview_Credits_Update$1$1", f = "AccountScreen.kt", l = {365}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AccountScreenKt$Preview_Credits_Update$1$1 extends yn.i implements ho.p {
    final /* synthetic */ x0 $hours$delegate;
    final /* synthetic */ z0 $isPaid$delegate;
    final /* synthetic */ z0 $plan$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountScreenKt$Preview_Credits_Update$1$1(x0 x0Var, z0 z0Var, z0 z0Var2, wn.c<? super AccountScreenKt$Preview_Credits_Update$1$1> cVar) {
        super(2, cVar);
        this.$hours$delegate = x0Var;
        this.$plan$delegate = z0Var;
        this.$isPaid$delegate = z0Var2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AccountScreenKt$Preview_Credits_Update$1$1(this.$hours$delegate, this.$plan$delegate, this.$isPaid$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AccountScreenKt$Preview_Credits_Update$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            xq.a aVar = xq.b.f38124b;
            long n2 = xq.g.n(1, xq.d.SECONDS);
            this.label = 1;
            Object n10 = g0.n(n2, this);
            xn.a aVar2 = xn.a.f37986a;
            if (n10 == aVar2) {
                return aVar2;
            }
        }
        AccountScreenKt.Preview_Credits_Update$lambda$2(this.$hours$delegate, 425);
        this.$plan$delegate.setValue("pro");
        AccountScreenKt.Preview_Credits_Update$lambda$8(this.$isPaid$delegate, true);
        return z.f31622a;
    }
}

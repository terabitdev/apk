package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.MfaVerificationScreenKt$MfaVerificationScreen$2$1", f = "MfaVerificationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class MfaVerificationScreenKt$MfaVerificationScreen$2$1 extends yn.i implements p {
    final /* synthetic */ ho.a $onCloseSuccess;
    final /* synthetic */ s2 $state$delegate;
    final /* synthetic */ MfaVerificationViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaVerificationScreenKt$MfaVerificationScreen$2$1(MfaVerificationViewModel mfaVerificationViewModel, ho.a aVar, s2 s2Var, wn.c<? super MfaVerificationScreenKt$MfaVerificationScreen$2$1> cVar) {
        super(2, cVar);
        this.$vm = mfaVerificationViewModel;
        this.$onCloseSuccess = aVar;
        this.$state$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new MfaVerificationScreenKt$MfaVerificationScreen$2$1(this.$vm, this.$onCloseSuccess, this.$state$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((MfaVerificationScreenKt$MfaVerificationScreen$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        MfaVerificationState MfaVerificationScreen$lambda$0;
        if (this.label == 0) {
            sn.a.g(obj);
            MfaVerificationScreen$lambda$0 = MfaVerificationScreenKt.MfaVerificationScreen$lambda$0(this.$state$delegate);
            if (MfaVerificationScreen$lambda$0.getCloseScreenOnSuccess()) {
                this.$vm.clearCloseScreenOnSuccessAction();
                this.$onCloseSuccess.invoke();
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

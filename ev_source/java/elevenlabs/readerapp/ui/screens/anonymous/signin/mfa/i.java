package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14902a;

    public /* synthetic */ i(int i10) {
        this.f14902a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z lambda__2011307041$lambda$0$0$0;
        MfaVerificationState clearCloseScreenOnSuccessAction$lambda$0;
        MfaVerificationState onSubmitCode$lambda$0;
        MfaVerificationState startMfaVerification$lambda$0;
        MfaVerificationState startMfaVerification$lambda$2;
        MfaVerificationState startMfaVerification$lambda$3;
        switch (this.f14902a) {
            case 0:
                return MfaVerificationViewModel$onSubmitCode$2.d((MfaVerificationState) obj);
            case 1:
                return MfaVerificationViewModel$onSubmitCode$2.h((MfaVerificationState) obj);
            case 2:
                return MfaVerificationViewModel$onSubmitCode$2.i((MfaVerificationState) obj);
            case 3:
                return MfaVerificationViewModel$startPhoneVerification$1.h((MfaVerificationState) obj);
            case 4:
                return MfaVerificationViewModel$startPhoneVerification$1.i((MfaVerificationState) obj);
            case 5:
                lambda__2011307041$lambda$0$0$0 = ComposableSingletons$MfaVerificationScreenKt.lambda__2011307041$lambda$0$0$0((l) obj);
                return lambda__2011307041$lambda$0$0$0;
            case 6:
                clearCloseScreenOnSuccessAction$lambda$0 = MfaVerificationViewModel.clearCloseScreenOnSuccessAction$lambda$0((MfaVerificationState) obj);
                return clearCloseScreenOnSuccessAction$lambda$0;
            case 7:
                onSubmitCode$lambda$0 = MfaVerificationViewModel.onSubmitCode$lambda$0((MfaVerificationState) obj);
                return onSubmitCode$lambda$0;
            case 8:
                startMfaVerification$lambda$0 = MfaVerificationViewModel.startMfaVerification$lambda$0((MfaVerificationState) obj);
                return startMfaVerification$lambda$0;
            case 9:
                startMfaVerification$lambda$2 = MfaVerificationViewModel.startMfaVerification$lambda$2((MfaVerificationState) obj);
                return startMfaVerification$lambda$2;
            default:
                startMfaVerification$lambda$3 = MfaVerificationViewModel.startMfaVerification$lambda$3((MfaVerificationState) obj);
                return startMfaVerification$lambda$3;
        }
    }
}

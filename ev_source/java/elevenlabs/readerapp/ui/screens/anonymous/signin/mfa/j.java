package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import ho.l;
import io.elevenlabs.domain.model.MfaState;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14904b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f14903a = i10;
        this.f14904b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        MfaVerificationState invokeSuspend$lambda$0;
        z MfaVerificationScreenUi$lambda$4$0$3$0$0;
        z MfaVerificationScreen$lambda$3$0;
        MfaVerificationState startMfaVerification$lambda$1;
        switch (this.f14903a) {
            case 0:
                invokeSuspend$lambda$0 = MfaVerificationViewModel$startPhoneVerification$1.invokeSuspend$lambda$0((MfaState.Phone) this.f14904b, (MfaVerificationState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                MfaVerificationScreenUi$lambda$4$0$3$0$0 = MfaVerificationScreenKt.MfaVerificationScreenUi$lambda$4$0$3$0$0((String) this.f14904b, (MfaVerificationViewModel) obj);
                return MfaVerificationScreenUi$lambda$4$0$3$0$0;
            case 2:
                MfaVerificationScreen$lambda$3$0 = MfaVerificationScreenKt.MfaVerificationScreen$lambda$3$0((MfaVerificationViewModel) this.f14904b, (l) obj);
                return MfaVerificationScreen$lambda$3$0;
            default:
                startMfaVerification$lambda$1 = MfaVerificationViewModel.startMfaVerification$lambda$1((MfaState) this.f14904b, (MfaVerificationState) obj);
                return startMfaVerification$lambda$1;
        }
    }
}

package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyEmailViewModel f14911b;

    public /* synthetic */ d(VerifyEmailViewModel verifyEmailViewModel, int i10) {
        this.f14910a = i10;
        this.f14911b = verifyEmailViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z VerifyEmailScreen$lambda$2$0;
        VerifyEmailState sendVerificationEmail$lambda$0;
        VerifyEmailState submitVerificationCode$lambda$0;
        switch (this.f14910a) {
            case 0:
                VerifyEmailScreen$lambda$2$0 = VerifyEmailScreenKt.VerifyEmailScreen$lambda$2$0(this.f14911b, (l) obj);
                return VerifyEmailScreen$lambda$2$0;
            case 1:
                sendVerificationEmail$lambda$0 = VerifyEmailViewModel.sendVerificationEmail$lambda$0(this.f14911b, (VerifyEmailState) obj);
                return sendVerificationEmail$lambda$0;
            default:
                submitVerificationCode$lambda$0 = VerifyEmailViewModel.submitVerificationCode$lambda$0(this.f14911b, (VerifyEmailState) obj);
                return submitVerificationCode$lambda$0;
        }
    }
}

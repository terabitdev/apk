package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14915a;

    public /* synthetic */ f(int i10) {
        this.f14915a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z VerifyEmailScreenUI$lambda$3$0$0$0$9$0$0;
        z VerifyEmailScreenUI$lambda$3$0$0$0$5$0$0;
        z VerifyEmailScreenUI$lambda$3$0$0$0$8$0$0;
        z Preview_VerifyEmailScreen_Idle$lambda$0$0;
        z VerifyEmailScreenUI$lambda$0$0;
        switch (this.f14915a) {
            case 0:
                return VerifyEmailViewModel$sendVerificationEmail$1$1.h((VerifyEmailState) obj);
            case 1:
                return VerifyEmailViewModel$sendVerificationEmail$1$1.d((VerifyEmailState) obj);
            case 2:
                return VerifyEmailViewModel$submitVerificationCode$1$1.h((VerifyEmailState) obj);
            case 3:
                return VerifyEmailViewModel$submitVerificationCode$1$1.d((VerifyEmailState) obj);
            case 4:
                VerifyEmailScreenUI$lambda$3$0$0$0$9$0$0 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$3$0$0$0$9$0$0((VerifyEmailViewModel) obj);
                return VerifyEmailScreenUI$lambda$3$0$0$0$9$0$0;
            case 5:
                VerifyEmailScreenUI$lambda$3$0$0$0$5$0$0 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$3$0$0$0$5$0$0((VerifyEmailViewModel) obj);
                return VerifyEmailScreenUI$lambda$3$0$0$0$5$0$0;
            case 6:
                VerifyEmailScreenUI$lambda$3$0$0$0$8$0$0 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$3$0$0$0$8$0$0((VerifyEmailViewModel) obj);
                return VerifyEmailScreenUI$lambda$3$0$0$0$8$0$0;
            case 7:
                Preview_VerifyEmailScreen_Idle$lambda$0$0 = VerifyEmailScreenKt.Preview_VerifyEmailScreen_Idle$lambda$0$0((l) obj);
                return Preview_VerifyEmailScreen_Idle$lambda$0$0;
            default:
                VerifyEmailScreenUI$lambda$0$0 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$0$0((l) obj);
                return VerifyEmailScreenUI$lambda$0$0;
        }
    }
}

package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import ho.p;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14871a;

    public /* synthetic */ i(int i10) {
        this.f14871a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda__121414390$lambda$0;
        z lambda_1592067771$lambda$0;
        z lambda__1228332425$lambda$0;
        int i10 = this.f14871a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                lambda__121414390$lambda$0 = ComposableSingletons$AuthScreenKt.lambda__121414390$lambda$0(mVar, intValue);
                return lambda__121414390$lambda$0;
            case 1:
                lambda_1592067771$lambda$0 = ComposableSingletons$AuthScreenKt.lambda_1592067771$lambda$0(mVar, intValue);
                return lambda_1592067771$lambda$0;
            case 2:
                lambda__1228332425$lambda$0 = ComposableSingletons$AuthScreenKt.lambda__1228332425$lambda$0(mVar, intValue);
                return lambda__1228332425$lambda$0;
            case 3:
                return ComposableSingletons$EmailSignUpFormUIKt.b(mVar, intValue);
            case 4:
                return ComposableSingletons$PreviewSignInAccountBannedMessageTextcomponentsSignInAccountBannedMessageTextKt.a(mVar, intValue);
            case 5:
                return ComposableSingletons$PreviewSignInScreenEmailSignInDefaultGroupPreviewSignInScreenEmailSignIn1Kt.a(mVar, intValue);
            case 6:
                return ComposableSingletons$PreviewSignInScreenEmailSignInDefaultGroupPreviewSignInScreenEmailSignInKt.a(mVar, intValue);
            case 7:
                return ComposableSingletons$PreviewSignInScreenEmailSignUpDefaultGroupPreviewSignInScreenEmailSignUp1Kt.a(mVar, intValue);
            case 8:
                return ComposableSingletons$PreviewSignInScreenEmailSignUpDefaultGroupPreviewSignInScreenEmailSignUpKt.a(mVar, intValue);
            case 9:
                return ComposableSingletons$PreviewSignInScreenEmailSignUpPasswordRequirementsDefaultGroupPreviewSignInScreenEmailSignUpPasswordRequirements1Kt.a(mVar, intValue);
            case 10:
                return ComposableSingletons$PreviewSignInScreenEmailSignUpPasswordRequirementsDefaultGroupPreviewSignInScreenEmailSignUpPasswordRequirementsKt.a(mVar, intValue);
            case 11:
                return ComposableSingletons$PreviewSignInScreenIntroDefaultGroupPreviewSignInScreenIntro1Kt.a(mVar, intValue);
            case 12:
                return ComposableSingletons$PreviewSignInScreenIntroDefaultGroupPreviewSignInScreenIntroKt.a(mVar, intValue);
            default:
                return ComposableSingletons$SignInAccountBannedMessageTextKt.a(mVar, intValue);
        }
    }
}

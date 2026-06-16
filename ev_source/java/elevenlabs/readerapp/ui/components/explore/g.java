package io.elevenlabs.readerapp.ui.components.explore;

import io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthScreenKt;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.SignInAccountBannedMessageTextKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14592b;

    public /* synthetic */ g(int i10, int i11) {
        this.f14591a = i11;
        this.f14592b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z Preview_SignInScreen_EmailSignIn$lambda$2;
        z Preview_SignInScreen_EmailSignUp$lambda$2;
        z Preview_SignInScreen_EmailSignUp_PasswordRequirements$lambda$2;
        z Preview_SignInScreen_Intro$lambda$0;
        int i10 = this.f14591a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ExploreCardCarouselCollectionKt.h(this.f14592b, mVar, intValue);
            case 1:
                return ExploreHeroCarouselKt.h(this.f14592b, mVar, intValue);
            case 2:
                return ExploreHeroCarouselKt.m(this.f14592b, mVar, intValue);
            case 3:
                return ExploreHeroCarouselKt.f(this.f14592b, mVar, intValue);
            case 4:
                return ExploreHeroCarouselKt.b(this.f14592b, mVar, intValue);
            case 5:
                return ExploreHeroCarouselKt.e(this.f14592b, mVar, intValue);
            case 6:
                return ExploreHighlightCarouselKt.a(this.f14592b, mVar, intValue);
            case 7:
                return ExploreHighlightCarouselKt.b(this.f14592b, mVar, intValue);
            case 8:
                return ExploreReadCardKt.b(this.f14592b, mVar, intValue);
            case 9:
                return ExploreReadCardKt.o(this.f14592b, mVar, intValue);
            case 10:
                return ExploreReadCardKt.a(this.f14592b, mVar, intValue);
            case 11:
                return ExploreReadCardKt.k(this.f14592b, mVar, intValue);
            case 12:
                return ExploreReadCardKt.p(this.f14592b, mVar, intValue);
            case 13:
                return ExploreReadCardKt.g(this.f14592b, mVar, intValue);
            case 14:
                return ExploreReadCardKt.f(this.f14592b, mVar, intValue);
            case 15:
                return ExploreReadCardKt.c(this.f14592b, mVar, intValue);
            case 16:
                return ExploreReadCardKt.i(this.f14592b, mVar, intValue);
            case 17:
                return ExploreReadCardKt.l(this.f14592b, mVar, intValue);
            case 18:
                return ExploreReadCardKt.j(this.f14592b, mVar, intValue);
            case 19:
                return ExploreReadCardKt.d(this.f14592b, mVar, intValue);
            case 20:
                return ExploreReadCardKt.m(this.f14592b, mVar, intValue);
            case 21:
                return ExploreSectionHeaderKt.b(this.f14592b, mVar, intValue);
            case 22:
                return ExploreSectionHeaderKt.c(this.f14592b, mVar, intValue);
            case 23:
                return ExploreSectionHeaderKt.d(this.f14592b, mVar, intValue);
            case 24:
                return ExploreSectionHeaderKt.e(this.f14592b, mVar, intValue);
            case 25:
                Preview_SignInScreen_EmailSignIn$lambda$2 = AuthScreenKt.Preview_SignInScreen_EmailSignIn$lambda$2(this.f14592b, mVar, intValue);
                return Preview_SignInScreen_EmailSignIn$lambda$2;
            case 26:
                Preview_SignInScreen_EmailSignUp$lambda$2 = AuthScreenKt.Preview_SignInScreen_EmailSignUp$lambda$2(this.f14592b, mVar, intValue);
                return Preview_SignInScreen_EmailSignUp$lambda$2;
            case 27:
                Preview_SignInScreen_EmailSignUp_PasswordRequirements$lambda$2 = AuthScreenKt.Preview_SignInScreen_EmailSignUp_PasswordRequirements$lambda$2(this.f14592b, mVar, intValue);
                return Preview_SignInScreen_EmailSignUp_PasswordRequirements$lambda$2;
            case 28:
                Preview_SignInScreen_Intro$lambda$0 = AuthScreenKt.Preview_SignInScreen_Intro$lambda$0(this.f14592b, mVar, intValue);
                return Preview_SignInScreen_Intro$lambda$0;
            default:
                return SignInAccountBannedMessageTextKt.a(this.f14592b, mVar, intValue);
        }
    }
}

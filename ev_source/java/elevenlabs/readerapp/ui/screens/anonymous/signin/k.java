package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import ho.p;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignInState f14874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f14875c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f14876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14878f;

    public /* synthetic */ k(SignInState signInState, ho.l lVar, ho.a aVar, int i10, int i11, int i12) {
        this.f14873a = i12;
        this.f14874b = signInState;
        this.f14875c = lVar;
        this.f14876d = aVar;
        this.f14877e = i10;
        this.f14878f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z EmailSignInFormUI$lambda$10;
        z EmailSignUpFormUI$lambda$13;
        switch (this.f14873a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                EmailSignInFormUI$lambda$10 = EmailSignInFormUIKt.EmailSignInFormUI$lambda$10(this.f14874b, this.f14875c, this.f14876d, this.f14877e, this.f14878f, (u2.m) obj, intValue);
                return EmailSignInFormUI$lambda$10;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                EmailSignUpFormUI$lambda$13 = EmailSignUpFormUIKt.EmailSignUpFormUI$lambda$13(this.f14874b, this.f14875c, this.f14876d, this.f14877e, this.f14878f, (u2.m) obj, intValue2);
                return EmailSignUpFormUI$lambda$13;
        }
    }
}

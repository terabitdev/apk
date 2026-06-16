package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import a2.y1;
import i4.q2;
import io.elevenlabs.domain.model.AsyncCallResult;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14870c;

    public /* synthetic */ h(String str, AuthViewModel authViewModel) {
        this.f14868a = 1;
        this.f14870c = str;
        this.f14869b = authViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        SignInState onPasswordChanged$lambda$0;
        z EmailSignUpFormUI$lambda$12$0$0$4$0;
        z SignInAccountBannedMessageText_FNF3uiM$lambda$0$0;
        switch (this.f14868a) {
            case 0:
                return AuthViewModel$onHCaptchaResult$3$1.d((AuthViewModel) this.f14869b, (AsyncCallResult.Error) this.f14870c, (SignInState) obj);
            case 1:
                onPasswordChanged$lambda$0 = AuthViewModel.onPasswordChanged$lambda$0((String) this.f14870c, (AuthViewModel) this.f14869b, (SignInState) obj);
                return onPasswordChanged$lambda$0;
            case 2:
                EmailSignUpFormUI$lambda$12$0$0$4$0 = EmailSignUpFormUIKt.EmailSignUpFormUI$lambda$12$0$0$4$0((SignInState) this.f14869b, (ho.l) this.f14870c, (y1) obj);
                return EmailSignUpFormUI$lambda$12$0$0$4$0;
            default:
                SignInAccountBannedMessageText_FNF3uiM$lambda$0$0 = SignInAccountBannedMessageTextKt.SignInAccountBannedMessageText_FNF3uiM$lambda$0$0((s4.h) this.f14869b, (q2) this.f14870c, ((Integer) obj).intValue());
                return SignInAccountBannedMessageText_FNF3uiM$lambda$0$0;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f14868a = i10;
        this.f14869b = obj;
        this.f14870c = obj2;
    }
}

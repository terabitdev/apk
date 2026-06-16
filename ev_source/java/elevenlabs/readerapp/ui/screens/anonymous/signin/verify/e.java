package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import a2.y1;
import ho.l;
import i4.e1;
import i4.m2;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14914c;

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f14912a = i10;
        this.f14913b = obj;
        this.f14914c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z VerifyEmailScreenUI$lambda$3$0$0$0$5$0;
        z VerifyEmailScreenUI$lambda$3$0$0$0$6$0;
        VerifyEmailState onEmailChanged$lambda$0;
        switch (this.f14912a) {
            case 0:
                return VerifyEmailScreenKt$VerifyEmailScreenUI$4$1$1$1$1$1.a((e1) this.f14913b, (z0) this.f14914c, (o3.b) obj);
            case 1:
                VerifyEmailScreenUI$lambda$3$0$0$0$5$0 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$3$0$0$0$5$0((m2) this.f14913b, (l) this.f14914c, (y1) obj);
                return VerifyEmailScreenUI$lambda$3$0$0$0$5$0;
            case 2:
                VerifyEmailScreenUI$lambda$3$0$0$0$6$0 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$3$0$0$0$6$0((l) this.f14913b, (z0) this.f14914c, (String) obj);
                return VerifyEmailScreenUI$lambda$3$0$0$0$6$0;
            default:
                onEmailChanged$lambda$0 = VerifyEmailViewModel.onEmailChanged$lambda$0((VerifyEmailViewModel) this.f14913b, (String) this.f14914c, (VerifyEmailState) obj);
                return onEmailChanged$lambda$0;
        }
    }
}

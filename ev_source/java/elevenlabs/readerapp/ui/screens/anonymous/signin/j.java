package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import ho.q;
import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14872a;

    public /* synthetic */ j(int i10) {
        this.f14872a = i10;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z lambda__210787318$lambda$0;
        int i10 = this.f14872a;
        l2 l2Var = (l2) obj;
        u2.m mVar = (u2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$EmailSignInFormUIKt.a(l2Var, mVar, intValue);
            default:
                lambda__210787318$lambda$0 = ComposableSingletons$EmailSignUpFormUIKt.lambda__210787318$lambda$0(l2Var, mVar, intValue);
                return lambda__210787318$lambda$0;
        }
    }
}

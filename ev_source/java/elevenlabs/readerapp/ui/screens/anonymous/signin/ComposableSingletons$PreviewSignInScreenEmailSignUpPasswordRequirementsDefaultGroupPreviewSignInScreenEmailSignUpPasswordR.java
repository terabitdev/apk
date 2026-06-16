package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewSignInScreenEmailSignUpPasswordRequirementsDefaultGroupPreviewSignInScreenEmailSignUpPasswordRequirementsKt {
    public static final ComposableSingletons$PreviewSignInScreenEmailSignUpPasswordRequirementsDefaultGroupPreviewSignInScreenEmailSignUpPasswordRequirementsKt INSTANCE = new ComposableSingletons$PreviewSignInScreenEmailSignUpPasswordRequirementsDefaultGroupPreviewSignInScreenEmailSignUpPasswordRequirementsKt();

    /* renamed from: lambda$-151376283 */
    private static p f174lambda$151376283 = new c3.j(new i(10), false, -151376283);

    public static final z lambda__151376283$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthScreenKt.Preview_SignInScreen_EmailSignUp_PasswordRequirements(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-151376283$app_productionRelease */
    public final p m1182getLambda$151376283$app_productionRelease() {
        return f174lambda$151376283;
    }
}

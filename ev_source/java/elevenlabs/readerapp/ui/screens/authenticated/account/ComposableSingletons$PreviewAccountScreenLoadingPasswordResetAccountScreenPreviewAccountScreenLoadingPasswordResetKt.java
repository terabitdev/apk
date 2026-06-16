package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewAccountScreenLoadingPasswordResetAccountScreenPreviewAccountScreenLoadingPasswordResetKt {
    public static final ComposableSingletons$PreviewAccountScreenLoadingPasswordResetAccountScreenPreviewAccountScreenLoadingPasswordResetKt INSTANCE = new ComposableSingletons$PreviewAccountScreenLoadingPasswordResetAccountScreenPreviewAccountScreenLoadingPasswordResetKt();

    /* renamed from: lambda$-279524386 */
    private static ho.p f202lambda$279524386 = new c3.j(new l(7), false, -279524386);

    public static final z lambda__279524386$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AccountScreenKt.Preview_AccountScreen_Loading_PasswordReset(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-279524386$app_productionRelease */
    public final ho.p m1224getLambda$279524386$app_productionRelease() {
        return f202lambda$279524386;
    }
}

package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewVerifyEmailScreenIdleDefaultGroupPreviewVerifyEmailScreenIdleKt {
    public static final ComposableSingletons$PreviewVerifyEmailScreenIdleDefaultGroupPreviewVerifyEmailScreenIdleKt INSTANCE = new ComposableSingletons$PreviewVerifyEmailScreenIdleDefaultGroupPreviewVerifyEmailScreenIdleKt();

    /* renamed from: lambda$-893823522 */
    private static p f178lambda$893823522 = new j(new a(3), false, -893823522);

    public static final z lambda__893823522$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VerifyEmailScreenKt.Preview_VerifyEmailScreen_Idle(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-893823522$app_productionRelease */
    public final p m1187getLambda$893823522$app_productionRelease() {
        return f178lambda$893823522;
    }
}

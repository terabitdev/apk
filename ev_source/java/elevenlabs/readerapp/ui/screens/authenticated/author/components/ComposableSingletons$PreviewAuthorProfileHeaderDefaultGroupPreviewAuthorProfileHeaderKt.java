package io.elevenlabs.readerapp.ui.screens.authenticated.author.components;

import c3.j;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewAuthorProfileHeaderDefaultGroupPreviewAuthorProfileHeaderKt {
    public static final ComposableSingletons$PreviewAuthorProfileHeaderDefaultGroupPreviewAuthorProfileHeaderKt INSTANCE = new ComposableSingletons$PreviewAuthorProfileHeaderDefaultGroupPreviewAuthorProfileHeaderKt();
    private static p lambda$1183374280 = new j(new a(15), false, 1183374280);

    public static /* synthetic */ z a(m mVar, int i10) {
        return lambda_1183374280$lambda$0(mVar, i10);
    }

    public static final z lambda_1183374280$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileHeaderKt.Preview_AuthorProfileHeader(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$1183374280$app_productionRelease() {
        return lambda$1183374280;
    }
}

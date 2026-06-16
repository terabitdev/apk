package io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables;

import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import nm.a;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewAuthorSectionDefaultGroupPreviewAuthorSectionKt {
    public static final ComposableSingletons$PreviewAuthorSectionDefaultGroupPreviewAuthorSectionKt INSTANCE = new ComposableSingletons$PreviewAuthorSectionDefaultGroupPreviewAuthorSectionKt();
    private static p lambda$1722993324 = new j(new a(3), false, 1722993324);

    /* JADX INFO: Access modifiers changed from: private */
    public static final z lambda_1722993324$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorSectionKt.Preview_AuthorSection(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$1722993324$app_productionRelease() {
        return lambda$1722993324;
    }
}

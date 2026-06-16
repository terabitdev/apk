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
public final class ComposableSingletons$PreviewReadsV2ListSectionDefaultGroupPreviewReadsV2ListSectionKt {
    public static final ComposableSingletons$PreviewReadsV2ListSectionDefaultGroupPreviewReadsV2ListSectionKt INSTANCE = new ComposableSingletons$PreviewReadsV2ListSectionDefaultGroupPreviewReadsV2ListSectionKt();
    private static p lambda$678827052 = new j(new a(10), false, 678827052);

    public static /* synthetic */ z a(m mVar, int i10) {
        return lambda_678827052$lambda$0(mVar, i10);
    }

    public static final z lambda_678827052$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadsListSectionKt.Preview_ReadsV2ListSection(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$678827052$app_productionRelease() {
        return lambda$678827052;
    }
}

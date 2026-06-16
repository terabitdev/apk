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
public final class ComposableSingletons$PreviewDetailsSectionDefaultGroupPreviewDetailsSectionKt {
    public static final ComposableSingletons$PreviewDetailsSectionDefaultGroupPreviewDetailsSectionKt INSTANCE = new ComposableSingletons$PreviewDetailsSectionDefaultGroupPreviewDetailsSectionKt();

    /* renamed from: lambda$-88155604 */
    private static p f581lambda$88155604 = new j(new a(8), false, -88155604);

    public static /* synthetic */ z a(m mVar, int i10) {
        return lambda__88155604$lambda$0(mVar, i10);
    }

    public static final z lambda__88155604$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            DetailsSectionKt.Preview_DetailsSection(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-88155604$app_productionRelease */
    public final p m1692getLambda$88155604$app_productionRelease() {
        return f581lambda$88155604;
    }
}

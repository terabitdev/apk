package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.j;
import ho.p;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.t;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeRecentReadsCarouselKt {
    public static final ComposableSingletons$HomeRecentReadsCarouselKt INSTANCE = new ComposableSingletons$HomeRecentReadsCarouselKt();
    private static p lambda$309820803 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(15), false, 309820803);

    /* renamed from: lambda$-1638447402 */
    private static p f378lambda$1638447402 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(16), false, -1638447402);

    public static final z lambda_309820803$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomeRecentReadsCarouselKt.HomeRecentReadsCarouselV4("Continue listening", ReadsFactoryKt.stubReadMetaList$default(5, null, 2, null), t.f33547a, null, null, null, qVar, 390, 56);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1638447402$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, lambda$309820803, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1638447402$app_productionRelease */
    public final p m1429getLambda$1638447402$app_productionRelease() {
        return f378lambda$1638447402;
    }

    public final p getLambda$309820803$app_productionRelease() {
        return lambda$309820803;
    }
}

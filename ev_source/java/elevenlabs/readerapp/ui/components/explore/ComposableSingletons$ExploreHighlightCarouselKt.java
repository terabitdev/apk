package io.elevenlabs.readerapp.ui.components.explore;

import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.ui.components.e1;
import io.elevenlabs.readerapp.ui.components.r0;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ExploreHighlightCarouselKt {
    public static final ComposableSingletons$ExploreHighlightCarouselKt INSTANCE = new ComposableSingletons$ExploreHighlightCarouselKt();
    private static ho.p lambda$2108240486 = new c3.j(new io.elevenlabs.readerapp.ui.components.o(26), false, 2108240486);
    private static ho.p lambda$546218809 = new c3.j(new io.elevenlabs.readerapp.ui.components.o(27), false, 546218809);
    private static ho.p lambda$752181950 = new c3.j(new io.elevenlabs.readerapp.ui.components.o(28), false, 752181950);
    private static ho.p lambda$1972776779 = new c3.j(new io.elevenlabs.readerapp.ui.components.o(29), false, 1972776779);

    public static final z lambda_1972776779$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, lambda$752181950, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_2108240486$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List<ExploreRead> stubExploreReadList = ExploreFactoryKt.stubExploreReadList(3);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new r0(16);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e1(25);
                qVar.h0(L2);
            }
            ExploreHighlightCarouselKt.ExploreHighlightCarousel("Top Picks", "See what's hot right now", stubExploreReadList, lVar, (ho.a) L2, null, null, null, qVar, 27702, 224);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_2108240486$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_546218809$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, lambda$2108240486, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_752181950$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List<ExploreRead> stubExploreReadList = ExploreFactoryKt.stubExploreReadList(1);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new r0(17);
                qVar.h0(L);
            }
            ExploreHighlightCarouselKt.ExploreHighlightCarousel("New & Trending", "We think you'll enjoy these", stubExploreReadList, (ho.l) L, null, null, null, null, qVar, 27702, 224);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_752181950$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public final ho.p getLambda$1972776779$app_productionRelease() {
        return lambda$1972776779;
    }

    public final ho.p getLambda$2108240486$app_productionRelease() {
        return lambda$2108240486;
    }

    public final ho.p getLambda$546218809$app_productionRelease() {
        return lambda$546218809;
    }

    public final ho.p getLambda$752181950$app_productionRelease() {
        return lambda$752181950;
    }
}

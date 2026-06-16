package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.j;
import ho.p;
import ig.f;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.readerapp.ui.previews.HomeFactoryKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeMediumCarouselSectionKt {
    public static final ComposableSingletons$HomeMediumCarouselSectionKt INSTANCE = new ComposableSingletons$HomeMediumCarouselSectionKt();
    private static p lambda$2037219203 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(10), false, 2037219203);
    private static p lambda$315778902 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(11), false, 315778902);
    private static p lambda$1358240667 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(12), false, 1358240667);

    /* renamed from: lambda$-986325266 */
    private static p f377lambda$986325266 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(13), false, -986325266);
    private static p lambda$1604187487 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(14), false, 1604187487);
    private static p lambda$1667103660 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(9), false, 1667103660);

    public static final z lambda_1358240667$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.MediumCarousel stubMediumCarouselSection = HomeFactoryKt.stubMediumCarouselSection("Trending Releases", null, null, ExploreFactoryKt.stubMixedAspectReadList(8));
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(7);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(15);
                qVar.h0(L2);
            }
            HomeMediumCarouselSectionKt.HomeMediumCarouselSectionV4(stubMediumCarouselSection, lVar, (ho.a) L2, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1358240667$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_1604187487$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.MediumCarousel stubMediumCarouselSection = HomeFactoryKt.stubMediumCarouselSection("Your Next Listen", null, null, f.I(ExploreRead.copy$default(ExploreFactoryKt.stubExploreRead(0), null, "The Museum of Extraordinary Things", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null), ExploreRead.copy$default(ExploreFactoryKt.stubExploreRead(1), null, "A", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null), ExploreRead.copy$default(ExploreFactoryKt.stubExploreRead(2), null, "One Hundred Years of Solitude by Gabriel Garcia Marquez", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null), ExploreRead.copy$default(ExploreFactoryKt.stubExploreRead(3), null, "Normal", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null)));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(8);
                qVar.h0(L);
            }
            HomeMediumCarouselSectionKt.HomeMediumCarouselSectionV4(stubMediumCarouselSection, (ho.l) L, null, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1604187487$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_1667103660$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, lambda$1604187487, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_2037219203$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.MediumCarousel stubMediumCarouselSection$default = HomeFactoryKt.stubMediumCarouselSection$default(null, null, null, null, 15, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(6);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(14);
                qVar.h0(L2);
            }
            HomeMediumCarouselSectionKt.HomeMediumCarouselSectionV4(stubMediumCarouselSection$default, lVar, (ho.a) L2, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_2037219203$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_315778902$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, lambda$2037219203, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__986325266$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, lambda$1358240667, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-986325266$app_productionRelease */
    public final p m1428getLambda$986325266$app_productionRelease() {
        return f377lambda$986325266;
    }

    public final p getLambda$1358240667$app_productionRelease() {
        return lambda$1358240667;
    }

    public final p getLambda$1604187487$app_productionRelease() {
        return lambda$1604187487;
    }

    public final p getLambda$1667103660$app_productionRelease() {
        return lambda$1667103660;
    }

    public final p getLambda$2037219203$app_productionRelease() {
        return lambda$2037219203;
    }

    public final p getLambda$315778902$app_productionRelease() {
        return lambda$315778902;
    }
}

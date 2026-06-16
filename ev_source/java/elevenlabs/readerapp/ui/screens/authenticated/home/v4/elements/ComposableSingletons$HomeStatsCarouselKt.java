package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.j;
import ho.p;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.previews.HomeFactoryKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.a7;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeStatsCarouselKt {
    public static final ComposableSingletons$HomeStatsCarouselKt INSTANCE = new ComposableSingletons$HomeStatsCarouselKt();

    /* renamed from: lambda$-855188898 */
    private static p f382lambda$855188898 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(17), false, -855188898);
    private static p lambda$1457202265 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(18), false, 1457202265);
    private static p lambda$1716567971 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(19), false, 1716567971);

    /* renamed from: lambda$-175155896 */
    private static p f380lambda$175155896 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(20), false, -175155896);

    /* renamed from: lambda$-2094083275 */
    private static p f381lambda$2094083275 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(21), false, -2094083275);
    private static p lambda$1154341146 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(22), false, 1154341146);

    /* renamed from: lambda$-1658364650 */
    private static p f379lambda$1658364650 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(23), false, -1658364650);
    private static p lambda$1078822545 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(24), false, 1078822545);

    public static final z lambda_1078822545$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            a7.a(null, null, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), 0L, u.P, u.P, null, f379lambda$1658364650, qVar, 12582912, 123);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1154341146$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            a7.a(null, null, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), 0L, u.P, u.P, null, f381lambda$2094083275, qVar, 12582912, 123);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1457202265$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            a7.a(null, null, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), 0L, u.P, u.P, null, f382lambda$855188898, qVar, 12582912, 123);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1716567971$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.StatsCarousel stubStatsCarouselSectionData = HomeFactoryKt.stubStatsCarouselSectionData();
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(17);
                qVar.h0(L);
            }
            HomeStatsCarouselKt.HomeStatsCarouselSectionV4(stubStatsCarouselSectionData, 0L, (ho.a) L, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1658364650$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.StatsCarousel copy$default = HomePageV4.Section.StatsCarousel.copy$default(HomeFactoryKt.stubStatsCarouselSectionData(), null, 0, 0, 3, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(16);
                qVar.h0(L);
            }
            HomeStatsCarouselKt.HomeStatsCarouselSectionV4(copy$default, 30L, (ho.a) L, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__175155896$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            a7.a(null, null, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), 0L, u.P, u.P, null, lambda$1716567971, qVar, 12582912, 123);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__2094083275$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.StatsCarousel stubStatsCarouselSectionData = HomeFactoryKt.stubStatsCarouselSectionData();
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(18);
                qVar.h0(L);
            }
            HomeStatsCarouselKt.HomeStatsCarouselSectionV4(stubStatsCarouselSectionData, 30L, (ho.a) L, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__855188898$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.StatsCarousel copy$default = HomePageV4.Section.StatsCarousel.copy$default(HomeFactoryKt.stubStatsCarouselSectionData(), null, 0, 15, 3, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(19);
                qVar.h0(L);
            }
            HomeStatsCarouselKt.HomeStatsCarouselSectionV4(copy$default, 30L, (ho.a) L, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1658364650$app_productionRelease */
    public final p m1430getLambda$1658364650$app_productionRelease() {
        return f379lambda$1658364650;
    }

    /* renamed from: getLambda$-175155896$app_productionRelease */
    public final p m1431getLambda$175155896$app_productionRelease() {
        return f380lambda$175155896;
    }

    /* renamed from: getLambda$-2094083275$app_productionRelease */
    public final p m1432getLambda$2094083275$app_productionRelease() {
        return f381lambda$2094083275;
    }

    /* renamed from: getLambda$-855188898$app_productionRelease */
    public final p m1433getLambda$855188898$app_productionRelease() {
        return f382lambda$855188898;
    }

    public final p getLambda$1078822545$app_productionRelease() {
        return lambda$1078822545;
    }

    public final p getLambda$1154341146$app_productionRelease() {
        return lambda$1154341146;
    }

    public final p getLambda$1457202265$app_productionRelease() {
        return lambda$1457202265;
    }

    public final p getLambda$1716567971$app_productionRelease() {
        return lambda$1716567971;
    }
}

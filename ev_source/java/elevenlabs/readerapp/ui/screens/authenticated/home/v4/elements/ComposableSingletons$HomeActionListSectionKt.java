package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.j;
import ho.p;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.previews.HomeFactoryKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeActionListSectionKt {
    public static final ComposableSingletons$HomeActionListSectionKt INSTANCE = new ComposableSingletons$HomeActionListSectionKt();

    /* renamed from: lambda$-1032179018 */
    private static p f376lambda$1032179018 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(7), false, -1032179018);
    private static p lambda$724180846 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(8), false, 724180846);

    public static final z lambda_724180846$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.HomeActionList copy$default = HomePageV4.Section.HomeActionList.copy$default(HomeFactoryKt.stubActionListSection(), null, null, 2, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(5);
                qVar.h0(L);
            }
            HomeActionListSectionKt.HomeActionListSectionV4(copy$default, (ho.l) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_724180846$lambda$0$0$0(HomePageV4.Section.HomeActionList.HomeActionItem homeActionItem) {
        homeActionItem.getClass();
        return z.f31622a;
    }

    public static final z lambda__1032179018$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV4.Section.HomeActionList stubActionListSection = HomeFactoryKt.stubActionListSection();
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(4);
                qVar.h0(L);
            }
            HomeActionListSectionKt.HomeActionListSectionV4(stubActionListSection, (ho.l) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1032179018$lambda$0$0$0(HomePageV4.Section.HomeActionList.HomeActionItem homeActionItem) {
        homeActionItem.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1032179018$app_productionRelease */
    public final p m1427getLambda$1032179018$app_productionRelease() {
        return f376lambda$1032179018;
    }

    public final p getLambda$724180846$app_productionRelease() {
        return lambda$724180846;
    }
}

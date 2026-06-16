package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import c3.j;
import ho.p;
import ho.q;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.readerapp.ui.components.r0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.u0;
import sn.z;
import u2.l;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ExploreLanguageSettingScreenKt {
    public static final ComposableSingletons$ExploreLanguageSettingScreenKt INSTANCE = new ComposableSingletons$ExploreLanguageSettingScreenKt();
    private static q lambda$1674317531 = new j(new a2.f(27), false, 1674317531);

    /* renamed from: lambda$-485127896 */
    private static p f223lambda$485127896 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h(9), false, -485127896);

    /* renamed from: lambda$-1836031227 */
    private static p f222lambda$1836031227 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h(10), false, -1836031227);
    private static p lambda$1521816593 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h(11), false, 1521816593);

    public static final z lambda_1521816593$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreLanguageState exploreLanguageState = new ExploreLanguageState(false, "Failed to load available languages. Please check your internet connection and try again.", null, null, 13, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new r0(23);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(5);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(6);
                qVar.h0(L3);
            }
            ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreenUI(exploreLanguageState, lVar, aVar, (ho.a) L3, qVar, 3504);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1521816593$lambda$0$0$0(KeyLabel keyLabel) {
        keyLabel.getClass();
        return z.f31622a;
    }

    public static final z lambda_1674317531$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(u0.e(qVar).f29154l), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1836031227$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreLanguageState exploreLanguageState = new ExploreLanguageState(true, null, null, null, 14, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new r0(22);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(1);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(2);
                qVar.h0(L3);
            }
            ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreenUI(exploreLanguageState, lVar, aVar, (ho.a) L3, qVar, 3504);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1836031227$lambda$0$0$0(KeyLabel keyLabel) {
        keyLabel.getClass();
        return z.f31622a;
    }

    public static final z lambda__485127896$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreLanguageState exploreLanguageState = new ExploreLanguageState(false, null, ig.f.I(new KeyLabel("en", "English"), new KeyLabel("es", "Español"), new KeyLabel("fr", "Français"), new KeyLabel("de", "Deutsch"), new KeyLabel("pt", "Português"), new KeyLabel("it", "Italiano")), "en", 3, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new r0(21);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(3);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(4);
                qVar.h0(L3);
            }
            ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreenUI(exploreLanguageState, lVar, aVar, (ho.a) L3, qVar, 3504);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__485127896$lambda$0$0$0(KeyLabel keyLabel) {
        keyLabel.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1836031227$app_productionRelease */
    public final p m1256getLambda$1836031227$app_productionRelease() {
        return f222lambda$1836031227;
    }

    /* renamed from: getLambda$-485127896$app_productionRelease */
    public final p m1257getLambda$485127896$app_productionRelease() {
        return f223lambda$485127896;
    }

    public final p getLambda$1521816593$app_productionRelease() {
        return lambda$1521816593;
    }

    public final q getLambda$1674317531$app_productionRelease() {
        return lambda$1674317531;
    }
}

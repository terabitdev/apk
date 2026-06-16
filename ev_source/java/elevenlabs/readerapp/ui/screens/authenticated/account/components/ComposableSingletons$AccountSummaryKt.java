package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import ho.p;
import ho.q;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.readerapp.ui.previews.AccountFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.y2;
import r1.p2;
import sn.z;
import u2.l;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AccountSummaryKt {
    public static final ComposableSingletons$AccountSummaryKt INSTANCE = new ComposableSingletons$AccountSummaryKt();
    private static q lambda$1255901868 = new c3.j(new a2.f(25), false, 1255901868);

    /* renamed from: lambda$-1665014836 */
    private static p f212lambda$1665014836 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(22), false, -1665014836);
    private static p lambda$1164628844 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(23), false, 1164628844);
    private static p lambda$352873786 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(24), false, 352873786);

    /* renamed from: lambda$-824644182 */
    private static p f213lambda$824644182 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(25), false, -824644182);

    public static final z lambda_1164628844$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            User user = new User("abc", "jane.smith@elevenlabs.io", null, "Jane Smith");
            AccountPage.Section.Credits copy$default = AccountPage.Section.Credits.copy$default(AccountFactoryKt.stubCreditsSection(), "ultra", true, false, null, null, null, 0, 120, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.components.explore.b(29);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.components.explore.b(23);
                qVar.h0(L2);
            }
            AccountSummaryKt.AccountSummary(user, copy$default, null, aVar, (ho.a) L2, qVar, 28032);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1255901868$lambda$0(String str, m mVar, int i10) {
        boolean z6;
        str.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            y2.a(kd.a.M(R.drawable.info_filled, qVar, 0), null, p2.o(i3.q.f13017a, 16), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getIcon().getQuaternary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_352873786$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            User user = new User("abc", "user@elevenlabs.io", null, null);
            AccountPage.Section.Credits stubCreditsSection = AccountFactoryKt.stubCreditsSection();
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.components.explore.b(22);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.components.explore.b(26);
                qVar.h0(L2);
            }
            AccountSummaryKt.AccountSummary(user, stubCreditsSection, null, aVar, (ho.a) L2, qVar, 28032);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1665014836$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            User user = new User("abc", "john.doe@elevenlabs.io", null, "John Doe");
            AccountPage.Section.Credits stubCreditsSection = AccountFactoryKt.stubCreditsSection();
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.components.explore.b(24);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.components.explore.b(25);
                qVar.h0(L2);
            }
            AccountSummaryKt.AccountSummary(user, stubCreditsSection, null, aVar, (ho.a) L2, qVar, 28032);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__824644182$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            User user = new User("abc", "ultra@elevenlabs.io", null, "Ultra User");
            AccountPage.Section.CreditsUnlimited creditsUnlimited = new AccountPage.Section.CreditsUnlimited("ultra", "Unlimited hours", "Unlimited");
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.components.explore.b(27);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.components.explore.b(28);
                qVar.h0(L2);
            }
            AccountSummaryKt.AccountSummary(user, null, creditsUnlimited, aVar, (ho.a) L2, qVar, 27696);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1665014836$app_productionRelease */
    public final p m1240getLambda$1665014836$app_productionRelease() {
        return f212lambda$1665014836;
    }

    /* renamed from: getLambda$-824644182$app_productionRelease */
    public final p m1241getLambda$824644182$app_productionRelease() {
        return f213lambda$824644182;
    }

    public final p getLambda$1164628844$app_productionRelease() {
        return lambda$1164628844;
    }

    public final q getLambda$1255901868$app_productionRelease() {
        return lambda$1255901868;
    }

    public final p getLambda$352873786$app_productionRelease() {
        return lambda$352873786;
    }
}

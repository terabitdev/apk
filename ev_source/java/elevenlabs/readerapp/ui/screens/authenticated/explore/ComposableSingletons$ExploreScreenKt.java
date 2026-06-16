package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.ui.components.EmptyScreenKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ExploreScreenKt {
    public static final ComposableSingletons$ExploreScreenKt INSTANCE = new ComposableSingletons$ExploreScreenKt();

    /* renamed from: lambda$-686466570 */
    private static ho.p f319lambda$686466570 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.author.o(20), false, -686466570);
    private static ho.p lambda$958028800 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.author.o(21), false, 958028800);

    /* renamed from: lambda$-1469584110 */
    private static ho.q f315lambda$1469584110 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(5), false, -1469584110);

    /* renamed from: lambda$-1111805383 */
    private static ho.q f314lambda$1111805383 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(6), false, -1111805383);

    /* renamed from: lambda$-1629468615 */
    private static ho.q f316lambda$1629468615 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(7), false, -1629468615);

    /* renamed from: lambda$-1853951691 */
    private static ho.q f317lambda$1853951691 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(8), false, -1853951691);

    /* renamed from: lambda$-639092294 */
    private static ho.p f318lambda$639092294 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.author.o(22), false, -639092294);

    public static final z lambda_958028800$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1111805383$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            LoaderKt.LoaderRow(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1469584110$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ib.i.o(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, i3.q.f13017a, qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1629468615$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            LoaderKt.LoaderRow(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1853951691$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        bVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(bVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EmptyScreenKt.EmptyScreen(t1.b.c(bVar), kj.c.R(qVar, R.string.explore_empty_state_title), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__639092294$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MiniPlayerKt.Preview_MiniPlayer_Visible_Playing(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__686466570$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1111805383$app_productionRelease */
    public final ho.q m1359getLambda$1111805383$app_productionRelease() {
        return f314lambda$1111805383;
    }

    /* renamed from: getLambda$-1469584110$app_productionRelease */
    public final ho.q m1360getLambda$1469584110$app_productionRelease() {
        return f315lambda$1469584110;
    }

    /* renamed from: getLambda$-1629468615$app_productionRelease */
    public final ho.q m1361getLambda$1629468615$app_productionRelease() {
        return f316lambda$1629468615;
    }

    /* renamed from: getLambda$-1853951691$app_productionRelease */
    public final ho.q m1362getLambda$1853951691$app_productionRelease() {
        return f317lambda$1853951691;
    }

    /* renamed from: getLambda$-639092294$app_productionRelease */
    public final ho.p m1363getLambda$639092294$app_productionRelease() {
        return f318lambda$639092294;
    }

    /* renamed from: getLambda$-686466570$app_productionRelease */
    public final ho.p m1364getLambda$686466570$app_productionRelease() {
        return f319lambda$686466570;
    }

    public final ho.p getLambda$958028800$app_productionRelease() {
        return lambda$958028800;
    }
}

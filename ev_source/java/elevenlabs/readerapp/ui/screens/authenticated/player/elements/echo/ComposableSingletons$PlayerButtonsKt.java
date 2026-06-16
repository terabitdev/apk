package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import c3.j;
import c3.o;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayerButtonsKt {
    public static final ComposableSingletons$PlayerButtonsKt INSTANCE = new ComposableSingletons$PlayerButtonsKt();
    private static p lambda$845140096 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(9), false, 845140096);
    private static p lambda$705034398 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(10), false, 705034398);

    /* renamed from: lambda$-583414337 */
    private static p f436lambda$583414337 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(11), false, -583414337);

    /* renamed from: lambda$-75538644 */
    private static p f437lambda$75538644 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(12), false, -75538644);
    private static p lambda$271215962 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(13), false, 271215962);

    public static final z lambda_271215962$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerButtonsPlayButtonState playerButtonsPlayButtonState = PlayerButtonsPlayButtonState.Playing;
            PlayerButtonsSpeedState playerButtonsSpeedState = new PlayerButtonsSpeedState(0.75f, false);
            SkipDuration skipDuration = SkipDuration.SECONDS_30;
            SkipDuration skipDuration2 = SkipDuration.SECONDS_15;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(27);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(28);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(29);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(0);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new a(1);
                qVar.h0(L5);
            }
            PlayerButtonsKt.PlayerButtons(playerButtonsPlayButtonState, playerButtonsSpeedState, skipDuration, skipDuration2, aVar, aVar2, aVar3, aVar4, (ho.a) L5, qVar, 115043718);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_705034398$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerButtonsPlayButtonState playerButtonsPlayButtonState = PlayerButtonsPlayButtonState.Playing;
            PlayerButtonsSpeedState playerButtonsSpeedState = new PlayerButtonsSpeedState(1.0f, false);
            SkipDuration skipDuration = SkipDuration.SECONDS_30;
            SkipDuration skipDuration2 = SkipDuration.SECONDS_15;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new a(2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(3);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(4);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(5);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new a(6);
                qVar.h0(L5);
            }
            PlayerButtonsKt.PlayerButtons(playerButtonsPlayButtonState, playerButtonsSpeedState, skipDuration, skipDuration2, aVar, aVar2, aVar3, aVar4, (ho.a) L5, qVar, 115043718);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_845140096$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerButtonsPlayButtonState playerButtonsPlayButtonState = PlayerButtonsPlayButtonState.Paused;
            PlayerButtonsSpeedState playerButtonsSpeedState = new PlayerButtonsSpeedState(1.0f, false);
            SkipDuration skipDuration = SkipDuration.SECONDS_30;
            SkipDuration skipDuration2 = SkipDuration.SECONDS_15;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(20);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(26);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(7);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(8);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new a(9);
                qVar.h0(L5);
            }
            PlayerButtonsKt.PlayerButtons(playerButtonsPlayButtonState, playerButtonsSpeedState, skipDuration, skipDuration2, aVar, aVar2, aVar3, aVar4, (ho.a) L5, qVar, 115043718);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__583414337$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerButtonsPlayButtonState playerButtonsPlayButtonState = PlayerButtonsPlayButtonState.RequiresRestart;
            PlayerButtonsSpeedState playerButtonsSpeedState = new PlayerButtonsSpeedState(1.0f, false);
            SkipDuration skipDuration = SkipDuration.SECONDS_30;
            SkipDuration skipDuration2 = SkipDuration.SECONDS_15;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new a(10);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(11);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(12);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(13);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new a(14);
                qVar.h0(L5);
            }
            PlayerButtonsKt.PlayerButtons(playerButtonsPlayButtonState, playerButtonsSpeedState, skipDuration, skipDuration2, aVar, aVar2, aVar3, aVar4, (ho.a) L5, qVar, 115043718);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__75538644$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerButtonsPlayButtonState playerButtonsPlayButtonState = PlayerButtonsPlayButtonState.Loading;
            PlayerButtonsSpeedState playerButtonsSpeedState = new PlayerButtonsSpeedState(0.5f, false);
            SkipDuration skipDuration = SkipDuration.SECONDS_30;
            SkipDuration skipDuration2 = SkipDuration.SECONDS_15;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(21);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(22);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(23);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(24);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(25);
                qVar.h0(L5);
            }
            PlayerButtonsKt.PlayerButtons(playerButtonsPlayButtonState, playerButtonsSpeedState, skipDuration, skipDuration2, aVar, aVar2, aVar3, aVar4, (ho.a) L5, qVar, 115043718);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-583414337$app_productionRelease */
    public final p m1503getLambda$583414337$app_productionRelease() {
        return f436lambda$583414337;
    }

    /* renamed from: getLambda$-75538644$app_productionRelease */
    public final p m1504getLambda$75538644$app_productionRelease() {
        return f437lambda$75538644;
    }

    public final p getLambda$271215962$app_productionRelease() {
        return lambda$271215962;
    }

    public final p getLambda$705034398$app_productionRelease() {
        return lambda$705034398;
    }

    public final p getLambda$845140096$app_productionRelease() {
        return lambda$845140096;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import c3.j;
import c3.o;
import f4.f1;
import h4.g;
import ho.p;
import ho.q;
import i3.t;
import io.elevenlabs.readerapp.ui.components.r0;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.y2;
import r1.p2;
import sn.z;
import u2.l;
import u2.m;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AgentChatComposerKt {
    public static final ComposableSingletons$AgentChatComposerKt INSTANCE = new ComposableSingletons$AgentChatComposerKt();
    private static q lambda$1598651059 = new j(new a2.f(28), false, 1598651059);

    /* renamed from: lambda$-75335978 */
    private static p f229lambda$75335978 = new j(new h(16), false, -75335978);
    private static p lambda$579205807 = new j(new h(17), false, 579205807);

    public static final z lambda_1598651059$lambda$0(boolean z6, m mVar, int i10) {
        boolean z10;
        float f10;
        float f11;
        int i11;
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).g(z6)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            f10 = AgentChatComposerKt.SendIconSize;
            i3.q qVar2 = i3.q.f13017a;
            t o6 = p2.o(qVar2, f10);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(o6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
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
            if (z6) {
                qVar.X(-449797648);
                f11 = AgentChatComposerKt.StopIconSize;
                r1.p.a(n.h(p2.o(qVar2, f11), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getIcon().getOnFillPrimary(qVar, EchoThemeColors.Icon.$stable), z1.h.b(2)), qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(-449388107);
                y2.a(kd.a.M(R.drawable.arrow_up, qVar, 0), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.chat_support_send_button_a11y), p2.d(qVar2, 1.0f), 0L, qVar, u3.c.$stable | 384, 8);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_579205807$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new r0(24);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(8);
                qVar.h0(L2);
            }
            AgentChatComposerKt.AgentChatComposer(lVar, (ho.a) L2, true, r1.d.E(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX4()), false, qVar, 438, 16);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_579205807$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__75335978$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new r0(25);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(9);
                qVar.h0(L2);
            }
            AgentChatComposerKt.AgentChatComposer(lVar, (ho.a) L2, false, r1.d.E(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX4()), false, qVar, 438, 16);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__75335978$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-75335978$app_productionRelease */
    public final p m1264getLambda$75335978$app_productionRelease() {
        return f229lambda$75335978;
    }

    public final q getLambda$1598651059$app_productionRelease() {
        return lambda$1598651059;
    }

    public final p getLambda$579205807$app_productionRelease() {
        return lambda$579205807;
    }
}

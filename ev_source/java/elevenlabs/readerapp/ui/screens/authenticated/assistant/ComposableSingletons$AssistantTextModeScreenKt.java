package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import f4.f1;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AssistantTextModeScreenKt {
    public static final ComposableSingletons$AssistantTextModeScreenKt INSTANCE = new ComposableSingletons$AssistantTextModeScreenKt();
    private static ho.p lambda$1402265427 = new c3.j(new y(2), false, 1402265427);

    /* renamed from: lambda$-354623835 */
    private static ho.p f237lambda$354623835 = new c3.j(new y(3), false, -354623835);
    private static ho.p lambda$1795875222 = new c3.j(new y(4), false, 1795875222);

    public static final sn.z lambda_1402265427$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(p2.e(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            List I = ig.f.I(new ChatMessage("Hello! How can I help you today?", false, 1000L), new ChatMessage("What is this book actually about?", true, 2000L), new ChatMessage("Sure! So the book is about a story about lorem ipsum dolor sit amet.", false, 3000L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new o(10);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new z(5);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new z(6);
                qVar.h0(L3);
            }
            AssistantTextModeScreenKt.AssistantTextModeUI(I, false, false, lVar, aVar, (ho.a) L3, qVar, 224688);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1402265427$lambda$0$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1795875222$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(p2.e(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new o(12);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new z(3);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new z(4);
                qVar.h0(L3);
            }
            AssistantTextModeScreenKt.AssistantTextModeUI(tn.t.f33547a, false, true, lVar, aVar, (ho.a) L3, qVar, 224694);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1795875222$lambda$0$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__354623835$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(p2.e(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            List I = ig.f.I(new ChatMessage("Hello! How can I help you today?", false, 1000L), new ChatMessage("What is this book actually about?", true, 2000L));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new o(11);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new z(7);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new z(8);
                qVar.h0(L3);
            }
            AssistantTextModeScreenKt.AssistantTextModeUI(I, true, false, lVar, aVar, (ho.a) L3, qVar, 224688);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__354623835$lambda$0$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-354623835$app_productionRelease */
    public final ho.p m1273getLambda$354623835$app_productionRelease() {
        return f237lambda$354623835;
    }

    public final ho.p getLambda$1402265427$app_productionRelease() {
        return lambda$1402265427;
    }

    public final ho.p getLambda$1795875222$app_productionRelease() {
        return lambda$1795875222;
    }
}

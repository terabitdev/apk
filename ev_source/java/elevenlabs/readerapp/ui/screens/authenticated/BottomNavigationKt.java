package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.readerapp.core.router.Routes;
import io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.theme.ElevenLabsColors;
import io.elevenlabs.ui.theme.ElevenLabsSpacings;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsTypography;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e4;
import q2.e5;
import q2.f5;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u001aY\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0013\u001a\u00020\b*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lna/n;", "navController", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem;", FirebaseAnalytics.Param.ITEMS, "", "initialRoute", "Lkotlin/Function0;", "Lsn/z;", "onAddClick", "Lkotlin/Function1;", "onTabClicked", "Li3/t;", "modifier", "BottomNavigation", "(Lna/n;Ljava/lang/Iterable;Ljava/lang/String;Lho/a;Lho/l;Li3/t;Lu2/m;II)V", "Lr1/l2;", "currentRoute", "item", "BottomItem", "(Lr1/l2;Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem;Lna/n;Lho/l;Lu2/m;I)V", "", "bottomNavigationRoutes", "Ljava/util/List;", "getBottomNavigationRoutes", "()Ljava/util/List;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BottomNavigationKt {
    private static final List<BottomNavigationItem> bottomNavigationRoutes = ig.f.I(new BottomNavigationItem.Home(Routes.homeRoute), new BottomNavigationItem.Explore(Routes.exploreRoute), new BottomNavigationItem.Reads(Routes.libraryRoute), new BottomNavigationItem.Voices(Routes.voicesRoute));

    private static final void BottomItem(l2 l2Var, String str, BottomNavigationItem bottomNavigationItem, na.n nVar, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        BottomNavigationItem bottomNavigationItem2;
        boolean z6;
        u2.q qVar;
        boolean z10;
        long m2186getSecondary0d7_KjU;
        boolean z11;
        boolean z12;
        boolean z13;
        String str2;
        int iconRes;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-555758579);
        if ((i10 & 6) == 0) {
            if (qVar2.f(l2Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            bottomNavigationItem2 = bottomNavigationItem;
            if (qVar2.f(bottomNavigationItem2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        } else {
            bottomNavigationItem2 = bottomNavigationItem;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(nVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(lVar)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i17 = ElevenLabsTheme.$stable;
            ElevenLabsSpacings spacings = elevenLabsTheme.getSpacings(qVar2, i17);
            ElevenLabsTypography typo = elevenLabsTheme.getTypo(qVar2, i17);
            if (kotlin.jvm.internal.m.c(str, bottomNavigationItem2.getRoute()) || (wq.u.N(bottomNavigationItem2.getRoute(), "/reads", false) && str != null && wq.u.W(str, bottomNavigationItem2.getRoute(), false))) {
                z10 = true;
            } else {
                z10 = false;
            }
            String R = kj.c.R(qVar2, bottomNavigationItem2.getTitleRes());
            if (z10) {
                qVar2.X(-1508029612);
                m2186getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar2, i17).getText().m2185getPrimary0d7_KjU();
            } else {
                qVar2.X(-1508028330);
                m2186getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar2, i17).getText().m2186getSecondary0d7_KjU();
            }
            qVar2.p(false);
            p3.b1 md = elevenLabsTheme.getShapes(qVar2, i17).getMd();
            i3.q qVar3 = i3.q.f13017a;
            i3.t c5 = m3.h.c(qVar3, md);
            boolean f10 = qVar2.f(R);
            Object L = qVar2.L();
            Object obj = u2.l.f33918a;
            if (f10 || L == obj) {
                L = new k0(R, 2);
                qVar2.h0(L);
            }
            i3.t c10 = p4.q.c(c5, true, (ho.l) L);
            Object L2 = qVar2.L();
            if (L2 == obj) {
                L2 = j0.c.o(qVar2);
            }
            p1.l lVar2 = (p1.l) L2;
            f5 b10 = e5.b(t2.u.P, 3, defpackage.f.b(elevenLabsTheme, qVar2, i17), false);
            p4.k kVar = new p4.k(0);
            if ((i11 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i11 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z14 = z11 | z12;
            if ((i11 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean h10 = z13 | z14 | qVar2.h(nVar);
            Object L3 = qVar2.L();
            if (!h10 && L3 != obj) {
                str2 = R;
            } else {
                str2 = R;
                io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f fVar = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f(str, bottomNavigationItem2, lVar, nVar, 1);
                qVar2.h0(fVar);
                L3 = fVar;
            }
            i3.t b11 = l2Var.b(r1.d.G(l1.n.n(c10, lVar2, b10, false, kVar, (ho.a) L3, 12), t2.u.P, spacings.m2356getX4D9Ej5fM(), 1), 1.0f, true);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c11 = i3.a.c(b11, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c11, qVar2);
            if (z10) {
                iconRes = bottomNavigationItem.getIconResActive();
            } else {
                iconRes = bottomNavigationItem.getIconRes();
            }
            long j4 = m2186getSecondary0d7_KjU;
            y2.a(kd.a.M(iconRes, qVar2, 0), null, p2.o(qVar3, 24), j4, qVar2, u3.c.$stable | 432, 0);
            r1.d.g(p2.f(qVar3, spacings.m2353getX2D9Ej5fM()), qVar2);
            j7.d(str2, null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, typo.getBodyTiny500(), qVar2, 0, 0, 131066);
            qVar = qVar2;
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.f(l2Var, str, bottomNavigationItem, nVar, lVar, i10, 2);
        }
    }

    public static final sn.z BottomItem$lambda$0$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z BottomItem$lambda$2$0(String str, BottomNavigationItem bottomNavigationItem, ho.l lVar, na.n nVar) {
        if (!kotlin.jvm.internal.m.c(str, bottomNavigationItem.getRoute()) && (str == null || !wq.u.W(str, bottomNavigationItem.getRoute(), false))) {
            lVar.invoke(bottomNavigationItem);
            nVar.b(new l0(bottomNavigationItem, 3), bottomNavigationItem.getRoute());
        }
        return sn.z.f31622a;
    }

    public static final sn.z BottomItem$lambda$2$0$0(BottomNavigationItem bottomNavigationItem, na.g0 g0Var) {
        g0Var.getClass();
        g0Var.a(new w(6), bottomNavigationItem.getRoute());
        g0Var.f24313b = true;
        return sn.z.f31622a;
    }

    public static final sn.z BottomItem$lambda$2$0$0$0(na.l0 l0Var) {
        l0Var.getClass();
        l0Var.f24342a = false;
        return sn.z.f31622a;
    }

    public static final sn.z BottomItem$lambda$4(l2 l2Var, String str, BottomNavigationItem bottomNavigationItem, na.n nVar, ho.l lVar, int i10, u2.m mVar, int i11) {
        BottomItem(l2Var, str, bottomNavigationItem, nVar, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomNavigation(na.n nVar, Iterable<? extends BottomNavigationItem> iterable, String str, ho.a aVar, ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        nVar.getClass();
        iterable.getClass();
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(471759087);
        if ((i10 & 6) == 0) {
            if (qVar.h(nVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(iterable)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i14;
        }
        int i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            if ((74899 & i12) == 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i20 = ElevenLabsTheme.$stable;
                ElevenLabsColors colors = elevenLabsTheme.getColors(qVar, i20);
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(tVar4, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, a10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                e4.a(null, colors.getPrimaryBg(), defpackage.f.b(elevenLabsTheme, qVar, i20), t2.u.P, null, c3.k.d(856003058, true, new a(iterable, str, nVar, lVar, aVar, 0), qVar), qVar, 196608);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.u0(nVar, iterable, str, aVar, lVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z BottomNavigation$lambda$0$0(Iterable iterable, String str, na.n nVar, ho.l lVar, ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        m2 m2Var;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t G = r1.d.G(p2.e(qVar2, 1.0f), ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM(), t2.u.P, 2);
            k2 a10 = i2.a(r1.j.f29233f, i3.d.f13005z0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            qVar.X(-208635647);
            Iterator it = tn.o.b1(iterable, 2).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                m2Var = m2.f29267a;
                if (!hasNext) {
                    break;
                }
                BottomItem(m2Var, str, (BottomNavigationItem) it.next(), nVar, lVar, qVar, 6);
            }
            qVar.p(false);
            i3.t b10 = m2Var.b(qVar2, 1.0f, true);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(b10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l7, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c10, qVar);
            ButtonIconKt.ButtonIcon(R.drawable.plus_large, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_accessibility_import), aVar, null, null, ButtonIconSize.Medium, false, false, false, qVar, 196608, 472);
            qVar.p(true);
            qVar.X(-208617279);
            Iterator it2 = tn.o.q0(iterable, 2).iterator();
            while (it2.hasNext()) {
                BottomItem(m2Var, str, (BottomNavigationItem) it2.next(), nVar, lVar, qVar, 6);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z BottomNavigation$lambda$1(na.n nVar, Iterable iterable, String str, ho.a aVar, ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        BottomNavigation(nVar, iterable, str, aVar, lVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final List<BottomNavigationItem> getBottomNavigationRoutes() {
        return bottomNavigationRoutes;
    }
}

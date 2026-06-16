package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.ui.components.VideoPlayerKt;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.PageSizeWithRatio;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\u0007¨\u0006\r²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"", "Lio/elevenlabs/readerapp/ui/components/MediaCarouselItem;", FirebaseAnalytics.Param.ITEMS, "Lsn/z;", "MediaCarouselSection", "(Ljava/util/List;Lu2/m;I)V", "Preview_MediaCarouselSection", "(Lu2/m;I)V", "Preview_MediaCarouselSection_long_title", "", "ready", "", "opacity", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaCarouselSectionKt {
    public static final void MediaCarouselSection(List<MediaCarouselItem> list, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        list.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-72646931);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            float m1979rememberDpToPx8Feqmps = ComposeExtensionsKt.m1979rememberDpToPx8Feqmps(500, qVar, 6);
            boolean c5 = qVar.c(m1979rememberDpToPx8Feqmps);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (c5 || L == eVar) {
                L = new PageSizeWithRatio(0.9f, Integer.valueOf((int) m1979rememberDpToPx8Feqmps));
                qVar.h0(L);
            }
            PageSizeWithRatio pageSizeWithRatio = (PageSizeWithRatio) L;
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            i3.l lVar = i3.d.f12997a;
            f4.f1 d10 = r1.p.d(lVar, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, d10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c10, qVar);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(qVar2, t2.u.P, elevenLabsTheme.getSpacings(qVar, i13).m2358getX6D9Ej5fM(), 1);
            f4.f1 d11 = r1.p.d(lVar, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(G, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, d11, qVar);
            u2.r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c11, qVar);
            boolean h10 = qVar.h(list);
            Object L2 = qVar.L();
            if (h10 || L2 == eVar) {
                L2 = new e(list, 2);
                qVar.h0(L2);
            }
            gg.b.d(w1.h0.b(0, (ho.a) L2, qVar, 0, 3), p2.e(qVar2, 1.0f), r1.d.d(elevenLabsTheme.getSpacings(qVar, i13).m2357getX5D9Ej5fM(), t2.u.P, 2), pageSizeWithRatio, list.size(), elevenLabsTheme.getSpacings(qVar, i13).m2353getX2D9Ej5fM(), i3.d.f13004y0, null, false, null, null, null, c3.k.d(618847098, true, new b5.c(list, 2), qVar), qVar, 1572912, 24576, 16256);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new v(i10, 0, list);
        }
    }

    public static final sn.z MediaCarouselSection$lambda$1$0$1(List list, w1.w wVar, int i10, u2.m mVar, int i11) {
        int i12;
        i3.q qVar;
        h4.d dVar;
        h4.e eVar;
        h4.e eVar2;
        h4.e eVar3;
        h4.e eVar4;
        float f10;
        wVar.getClass();
        MediaCarouselItem mediaCarouselItem = (MediaCarouselItem) list.get(i10);
        u2.q qVar2 = (u2.q) mVar;
        boolean f11 = qVar2.f(mediaCarouselItem);
        Object L = qVar2.L();
        u2.e eVar5 = u2.l.f33918a;
        if (f11 || L == eVar5) {
            L = new a2.a0(mediaCarouselItem, 28);
            qVar2.h0(L);
        }
        i3.q qVar3 = i3.q.f13017a;
        i3.t p10 = l1.n.p(qVar3, false, null, null, null, (ho.a) L, 15);
        boolean f12 = qVar2.f(mediaCarouselItem);
        Object L2 = qVar2.L();
        if (f12 || L2 == eVar5) {
            L2 = new a2.b(mediaCarouselItem, 26);
            qVar2.h0(L2);
        }
        i3.t c5 = p4.q.c(p10, true, (ho.l) L2);
        r1.u0 u0Var = r1.j.f29228a;
        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
        int i13 = ElevenLabsTheme.$stable;
        r1.h g10 = r1.j.g(elevenLabsTheme.getSpacings(qVar2, i13).m2355getX3D9Ej5fM());
        i3.j jVar = i3.d.B0;
        r1.x a10 = r1.w.a(g10, jVar, qVar2, 0);
        int hashCode = Long.hashCode(qVar2.T);
        c3.o l4 = qVar2.l();
        i3.t c10 = i3.a.c(c5, qVar2);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        h4.e eVar6 = h4.g.f11907f;
        u2.r.J(eVar6, a10, qVar2);
        h4.e eVar7 = h4.g.f11906e;
        u2.r.J(eVar7, l4, qVar2);
        Integer valueOf = Integer.valueOf(hashCode);
        h4.e eVar8 = h4.g.f11908g;
        u2.r.y(qVar2, valueOf, eVar8);
        h4.d dVar2 = h4.g.f11909h;
        u2.r.F(dVar2, qVar2);
        h4.e eVar9 = h4.g.f11905d;
        u2.r.J(eVar9, c10, qVar2);
        i3.t boxShadow = BoxShadowKt.boxShadow(qVar3, elevenLabsTheme.getShadows(qVar2, i13).getLg(), elevenLabsTheme.getShapes(qVar2, i13).getLg(), true, qVar2, 3078, 0);
        f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
        int hashCode2 = Long.hashCode(qVar2.T);
        c3.o l7 = qVar2.l();
        i3.t c11 = i3.a.c(boxShadow, qVar2);
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        u2.r.J(eVar6, d10, qVar2);
        u2.r.J(eVar7, l7, qVar2);
        defpackage.f.u(hashCode2, qVar2, eVar8, qVar2, dVar2);
        u2.r.J(eVar9, c11, qVar2);
        i3.t e10 = p2.e(r1.d.j(qVar3, 1.9408603f, false), 1.0f);
        long j4 = p3.x.f26427b;
        i3.t h10 = l1.n.h(e10, j4, p3.h0.f26395b);
        ad.h hVar = new ad.h((Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b));
        hVar.f1788c = mediaCarouselItem.getBackgroundImageUrl();
        hVar.b();
        qc.m.b(hVar.a(), null, h10, i3.d.Z, f4.q.f8839b, null, qVar2, 1769904, 3992);
        u2.q qVar4 = qVar2;
        if (mediaCarouselItem.getBackgroundVideoUrl() != null) {
            qVar4.X(196153684);
            Object L3 = qVar4.L();
            if (L3 == eVar5) {
                L3 = u2.r.A(Boolean.FALSE);
                qVar4.h0(L3);
            }
            u2.z0 z0Var = (u2.z0) L3;
            if (MediaCarouselSection$lambda$1$0$1$2$0$1(z0Var)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            i3.t a11 = m3.h.a(p2.e(r1.d.j(qVar3, 1.9408603f, false), 1.0f), MediaCarouselSection$lambda$1$0$1$2$0$3(j1.f.b(f10, null, "opacity", qVar4, 3072, 22)));
            Uri parse = Uri.parse(mediaCarouselItem.getBackgroundVideoUrl());
            Object L4 = qVar4.L();
            if (L4 == eVar5) {
                L4 = new a2.d0(z0Var, 7);
                qVar4.h0(L4);
            }
            i12 = i13;
            eVar3 = eVar7;
            eVar = eVar6;
            eVar4 = eVar8;
            dVar = dVar2;
            qVar = qVar3;
            eVar2 = eVar9;
            VideoPlayerKt.m1885VideoPlayer_Ogyb9c(a11, parse, j4, (ho.a) L4, (ho.a) null, (ho.a) null, true, true, false, (Float) null, false, 0, (u2.m) qVar4, 14159232, 0, 3888);
            qVar4 = qVar4;
            qVar4.p(false);
        } else {
            i12 = i13;
            qVar = qVar3;
            dVar = dVar2;
            eVar = eVar6;
            eVar2 = eVar9;
            eVar3 = eVar7;
            eVar4 = eVar8;
            qVar4.X(196914796);
            qVar4.p(false);
        }
        qVar4.p(true);
        r1.x a12 = r1.w.a(r1.j.g(6), jVar, qVar4, 6);
        int hashCode3 = Long.hashCode(qVar4.T);
        c3.o l10 = qVar4.l();
        i3.t c12 = i3.a.c(qVar, qVar4);
        qVar4.b0();
        if (qVar4.S) {
            qVar4.k(fVar);
        } else {
            qVar4.k0();
        }
        u2.r.J(eVar, a12, qVar4);
        u2.r.J(eVar3, l10, qVar4);
        defpackage.f.u(hashCode3, qVar4, eVar4, qVar4, dVar);
        u2.r.J(eVar2, c12, qVar4);
        int i14 = i12;
        u2.q qVar5 = qVar4;
        j7.d(mediaCarouselItem.getTitle(), null, defpackage.f.b(elevenLabsTheme, qVar5, i14), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar4, i14).getBodyMedium700(), qVar5, 0, 24960, 110586);
        u2.q qVar6 = qVar5;
        String subtitle = mediaCarouselItem.getSubtitle();
        if (subtitle != null && !wq.n.m0(subtitle)) {
            qVar6.X(-2014523364);
            j7.d(mediaCarouselItem.getSubtitle(), null, ib.i.w(elevenLabsTheme, qVar6, i14), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar6, i14).getBodySmall400(), qVar6, 0, 24960, 110586);
            qVar6 = qVar6;
            qVar6.p(false);
        } else {
            qVar6.X(-2014159300);
            qVar6.p(false);
        }
        qVar6.p(true);
        qVar6.p(true);
        return sn.z.f31622a;
    }

    public static final sn.z MediaCarouselSection$lambda$1$0$1$0$0(MediaCarouselItem mediaCarouselItem) {
        mediaCarouselItem.getOnItemClick().invoke();
        return sn.z.f31622a;
    }

    public static final sn.z MediaCarouselSection$lambda$1$0$1$1$0(MediaCarouselItem mediaCarouselItem, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(String.valueOf(mediaCarouselItem.getAccessibilityText()), b0Var);
        return sn.z.f31622a;
    }

    private static final boolean MediaCarouselSection$lambda$1$0$1$2$0$1(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void MediaCarouselSection$lambda$1$0$1$2$0$2(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final float MediaCarouselSection$lambda$1$0$1$2$0$3(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z MediaCarouselSection$lambda$1$0$1$2$0$4$0(u2.z0 z0Var) {
        MediaCarouselSection$lambda$1$0$1$2$0$2(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z MediaCarouselSection$lambda$2(List list, int i10, u2.m mVar, int i11) {
        MediaCarouselSection(list, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_MediaCarouselSection(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1323869480);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(5);
                qVar.h0(L);
            }
            MediaCarouselSection(ig.f.H(new MediaCarouselItem("title", "subtitle", null, "https://example.com", null, (ho.a) L)), qVar, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 9);
        }
    }

    public static final sn.z Preview_MediaCarouselSection$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MediaCarouselSection(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_MediaCarouselSection_long_title(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1228993712);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(4);
                qVar.h0(L);
            }
            MediaCarouselSection(ig.f.H(new MediaCarouselItem("Introducing Premium plans", "Learn more", null, "https://example.com", null, (ho.a) L)), qVar, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 8);
        }
    }

    public static final sn.z Preview_MediaCarouselSection_long_title$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MediaCarouselSection_long_title(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

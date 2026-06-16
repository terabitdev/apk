package io.elevenlabs.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a=\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClick", "", "title", "subtitle", "backgroundImageUrl", "coverImageUrl", "BoxSection", "(Lho/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BoxSectionKt {
    public static final void BoxSection(ho.a aVar, String str, String str2, String str3, String str4, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        String str5;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-771379963);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.f(str3)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.f(str4)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        int i17 = i11;
        if ((i17 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i17 & 1, z6)) {
            long j4 = p3.x.f26427b;
            p3.w0 w0Var = p3.h0.f26395b;
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = r1.p2.e(l1.n.h(qVar2, j4, w0Var), 1.0f);
            if ((i17 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (z10 || L == eVar) {
                L = new o(0, aVar);
                qVar.h0(L);
            }
            i3.t p10 = l1.n.p(e10, false, null, null, null, (ho.a) L, 15);
            if ((i17 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i17 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z13 = z11 | z12;
            Object L2 = qVar.L();
            if (z13 || L2 == eVar) {
                L2 = new p(0, str, str2);
                qVar.h0(L2);
            }
            i3.t c5 = p4.q.c(p10, true, (ho.l) L2);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(c5, qVar);
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
            i3.t a10 = r1.t.f29349a.a();
            f4.p pVar = f4.q.f8839b;
            qc.m.b(str3, null, a10, null, pVar, null, qVar, ((i17 >> 9) & 14) | 1572912, 4024);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            float m2358getX6D9Ej5fM = elevenLabsTheme.getSpacings(qVar, 6).m2358getX6D9Ej5fM();
            float f10 = 500;
            i3.t u6 = r1.p2.u(r1.d.I(qVar2, m2358getX6D9Ej5fM, m2358getX6D9Ej5fM, m2358getX6D9Ej5fM, t2.u.P, 8), t2.u.P, f10, 1);
            r1.e eVar6 = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a11 = r1.w.a(eVar6, jVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(u6, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a11, qVar);
            u2.r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c11, qVar);
            r1.k2 a12 = r1.i2.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), i3.d.f13005z0, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c12 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a12, qVar);
            u2.r.J(eVar3, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c12, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            r1.m1 m1Var = new r1.m1(1.0f, true);
            r1.x a13 = r1.w.a(eVar6, jVar, qVar, 0);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c13 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a13, qVar);
            u2.r.J(eVar3, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c13, qVar);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            j7.d(upperCase, null, p3.x.b(0.6f, elevenLabsTheme.getColors(qVar, 6).getExploreBoxText()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleSmall700(), qVar, 0, 0, 131066);
            r1.d.g(r1.p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2350getX1D9Ej5fM()), qVar);
            j7.d(str2, null, elevenLabsTheme.getColors(qVar, 6).getExploreBoxText(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleLarge700Inter(), qVar, (i17 >> 6) & 14, 0, 131066);
            qVar.p(true);
            l1.n.c(kd.a.M(R.drawable.chevron_right, qVar, 0), null, null, null, null, t2.u.P, new p3.n(p3.x.b(0.6f, elevenLabsTheme.getColors(qVar, 6).getExploreBoxText()), 5), qVar, u3.c.$stable | 48, 60);
            qVar = qVar;
            qVar.p(true);
            r1.d.g(r1.p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), qVar);
            i3.t j10 = r1.d.j(r1.p2.e(r1.p2.u(qVar2, t2.u.P, f10, 1), 1.0f), 1.4979591f, false);
            ad.h hVar = new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
            str5 = str4;
            hVar.f1788c = str5;
            hVar.b();
            qc.m.b(hVar.a(), null, j10, null, pVar, null, qVar, 1573296, 4024);
            qVar.p(true);
            qVar.p(true);
        } else {
            str5 = str4;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.f(aVar, str, str2, str3, str5, i10, 7);
        }
    }

    public static final sn.z BoxSection$lambda$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z BoxSection$lambda$1$0(String str, String str2, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str + " - " + str2, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z BoxSection$lambda$3(ho.a aVar, String str, String str2, String str3, String str4, int i10, u2.m mVar, int i11) {
        BoxSection(aVar, str, str2, str3, str4, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

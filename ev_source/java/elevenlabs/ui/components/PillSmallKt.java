package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", ParameterNames.TEXT, "Li3/t;", "modifier", "Lsn/z;", "PillSmall", "(Ljava/lang/String;Li3/t;Lu2/m;II)V", "PillSmallPreview", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PillSmallKt {
    public static final void PillSmall(String str, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        i3.t tVar2;
        int i14;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1768556111);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar2 = i3.q.f13017a;
            } else {
                tVar2 = tVar;
            }
            ElevenLabsThemeKt.ElevenLabsTheme(false, c3.k.d(1886473465, true, new k(tVar2, str, 3), qVar), qVar, 48, 1);
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.r(str, tVar2, i10, i11, 8);
        }
    }

    public static final sn.z PillSmall$lambda$0(i3.t tVar, String str, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t c5 = m3.h.c(tVar, z1.h.a());
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t F = r1.d.F(l1.n.h(c5, elevenLabsTheme.getColor(qVar, 6).getBackground().m2006getTertiary0d7_KjU(), p3.h0.f26395b), elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, 6).m2350getX1D9Ej5fM());
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(F, qVar);
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
            u2.r.J(h4.g.f11905d, c10, qVar);
            j7.d(str, null, elevenLabsTheme.getColor(qVar, 6).getSelectableCard().m2158getInactiveSecondaryText0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyXSmall600(), qVar, 0, 0, 131066);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PillSmall$lambda$1(String str, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        PillSmall(str, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void PillSmallPreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-356696839);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PillSmallKt.INSTANCE.m1817getLambda$220017245$ui_release(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 26);
        }
    }

    public static final sn.z PillSmallPreview$lambda$0(int i10, u2.m mVar, int i11) {
        PillSmallPreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Li3/t;", "modifier", "", ParameterNames.TEXT, "Lsn/z;", "EmptyScreen", "(Li3/t;Ljava/lang/String;Lu2/m;II)V", "Preview_EmptyScreen", "(Lu2/m;I)V", "Preview_ErrorScreen_multiline", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EmptyScreenKt {
    public static final void EmptyScreen(i3.t tVar, String str, u2.m mVar, int i10, int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        boolean z6;
        i3.t tVar3;
        i3.t tVar4;
        int i14;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(764359749);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            if (i15 != 0) {
                tVar4 = qVar2;
            } else {
                tVar4 = tVar2;
            }
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar, 6, tVar4);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(x10, qVar);
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
            j7.d(str, r1.p2.e(r1.d.I(qVar2, t2.u.P, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), t2.u.P, t2.u.P, 13), 1.0f), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyLarge500(), qVar, (i12 >> 3) & 14, 0, 130044);
            qVar = qVar;
            qVar.p(true);
            tVar3 = tVar4;
        } else {
            qVar.R();
            tVar3 = tVar2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.r(tVar3, str, i10, i11, 7);
        }
    }

    public static final sn.z EmptyScreen$lambda$1(i3.t tVar, String str, int i10, int i11, u2.m mVar, int i12) {
        EmptyScreen(tVar, str, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_EmptyScreen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1746864794);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EmptyScreen(null, "Empty", qVar, 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 0);
        }
    }

    public static final sn.z Preview_EmptyScreen$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EmptyScreen(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ErrorScreen_multiline(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-474321341);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EmptyScreen(null, "Text that takes more than one line. It should take two lines or more.,", qVar, 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 1);
        }
    }

    public static final sn.z Preview_ErrorScreen_multiline$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ErrorScreen_multiline(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

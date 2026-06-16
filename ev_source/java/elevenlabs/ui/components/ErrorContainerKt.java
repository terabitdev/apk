package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007¢\u0006\u0004\b\u0003\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", ParameterNames.TEXT, "Lsn/z;", "ErrorContainer", "(Ljava/lang/String;Lu2/m;I)V", "Li3/f;", "verticalAlignment", "Lkotlin/Function1;", "Lr1/l2;", FirebaseAnalytics.Param.CONTENT, "(Li3/f;Lho/q;Lu2/m;II)V", "Preview_ErrorContainer", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ErrorContainerKt {
    public static final void ErrorContainer(i3.f fVar, ho.q qVar, u2.m mVar, int i10, int i11) {
        i3.f fVar2;
        int i12;
        int i13;
        boolean z6;
        i3.f fVar3;
        i3.f fVar4;
        int i14;
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-2119589787);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            fVar2 = fVar;
        } else if ((i10 & 6) == 0) {
            fVar2 = fVar;
            if (qVar2.f(fVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            fVar2 = fVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(qVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i12;
        if ((i16 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i16 & 1, z6)) {
            if (i15 != 0) {
                fVar4 = i3.d.f13004y0;
            } else {
                fVar4 = fVar2;
            }
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t I = r1.d.I(e10, t2.u.P, elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), t2.u.P, t2.u.P, 13);
            r1.k2 a10 = r1.i2.a(r1.j.g(4), fVar4, qVar2, (((((i16 << 6) & 896) | 48) >> 3) & 112) | 6);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(I, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar5 = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar5);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            q2.y2.a(kd.a.M(R.drawable.warning_1, qVar2, 0), SIPHeaderNames.WARNING, null, elevenLabsTheme.getColor(qVar2, 6).getButtonText().m2040getDangerLight0d7_KjU(), qVar2, u3.c.$stable | 48, 4);
            qVar.invoke(r1.m2.f29267a, qVar2, Integer.valueOf(6 | (i16 & 112)));
            qVar2.p(true);
            fVar3 = fVar4;
        } else {
            qVar2.R();
            fVar3 = fVar2;
        }
        u2.r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(fVar3, qVar, i10, i11, 21);
        }
    }

    public static final sn.z ErrorContainer$lambda$0(String str, r1.l2 l2Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.t b10 = l2Var.b(i3.q.f13017a, 1.0f, false);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            j7.d(str, b10, elevenLabsTheme.getColor(qVar, 6).getButtonText().m2040getDangerLight0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleMedium500(), qVar, 0, 0, 131064);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ErrorContainer$lambda$1(String str, int i10, u2.m mVar, int i11) {
        ErrorContainer(str, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z ErrorContainer$lambda$3(i3.f fVar, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        ErrorContainer(fVar, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ErrorContainer(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1376609080);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(l1.n.y(i3.q.f13017a, l1.n.x(qVar), true, true), 10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            ErrorContainer("Error occurred!", qVar, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 2);
        }
    }

    public static final sn.z Preview_ErrorContainer$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ErrorContainer(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ErrorContainer(String str, u2.m mVar, int i10) {
        int i11;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(789094208);
        if ((i10 & 6) == 0) {
            i11 = (qVar.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (qVar.O(i11 & 1, (i11 & 3) != 2)) {
            ErrorContainer(i3.d.f13005z0, c3.k.d(-1746081521, true, new c1(str, 1), qVar), qVar, 54, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.q0(str, i10, 6);
        }
    }
}

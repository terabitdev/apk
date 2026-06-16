package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.b5;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "checked", "Lkotlin/Function0;", "Lsn/z;", "onCheckedChange", "", Constants.ScionAnalytics.PARAM_LABEL, "Li3/t;", "modifier", "RadioButton", "(ZLho/a;Ljava/lang/String;Li3/t;Lu2/m;II)V", "Preview_RadioButton", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RadioButtonKt {
    public static final void Preview_RadioButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1896242458);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.n(ElevenLabsTheme.INSTANCE, qVar, 6), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
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
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new u0(10);
                qVar.h0(L);
            }
            RadioButton(true, (ho.a) L, "RadioButton checked", null, qVar, 438, 8);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new u0(11);
                qVar.h0(L2);
            }
            RadioButton(false, (ho.a) L2, "RadioButton unchecked", null, qVar, 438, 8);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new u0(12);
                qVar.h0(L3);
            }
            RadioButton(false, (ho.a) L3, "RadioButton with long text that takes few lines. It should wrap to next lines and center content vertically.", null, qVar, 438, 8);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 1);
        }
    }

    public static final sn.z Preview_RadioButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_RadioButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(boolean z6, ho.a aVar, String str, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z10;
        i3.t tVar3;
        u2.r1 r10;
        boolean z11;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1025127383);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            boolean z12 = false;
            if ((i12 & 1171) == 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i17 != 0) {
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                i3.t c5 = m3.h.c(qVar2, ElevenLabsTheme.INSTANCE.getShapes(qVar, 6).getMd());
                if ((i12 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z11 || L == eVar) {
                    L = new o(8, aVar);
                    qVar.h0(L);
                }
                i3.t then = l1.n.p(c5, false, null, null, null, (ho.a) L, 15).then(tVar3);
                if ((i12 & 896) == 256) {
                    z12 = true;
                }
                Object L2 = qVar.L();
                if (z12 || L2 == eVar) {
                    L2 = new g(str, 12);
                    qVar.h0(L2);
                }
                RowWithInvertedMeasurementKt.RowWithInvertedMeasurement(p4.q.c(then, true, (ho.l) L2), null, i3.d.f13005z0, c3.k.d(710806250, true, new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.a(2, str, z6), qVar), qVar, 3456, 2);
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new y(z6, aVar, str, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z122 = false;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z RadioButton$lambda$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z RadioButton$lambda$1$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 1);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z RadioButton$lambda$2(boolean z6, String str, r1.l2 l2Var, u2.m mVar, int i10) {
        boolean z10;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            b5.a(z6, null, false, null, qVar, 48, 60);
            s4.y0 baseRegular500 = EchoTheme.INSTANCE.getTypography(qVar, 6).getBaseRegular500(qVar, 0);
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            j7.d(str, r1.d.I(r1.d.G(e10, t2.u.P, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), 1), t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), t2.u.P, 11), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar, 0, 0, 131068);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z RadioButton$lambda$3(boolean z6, ho.a aVar, String str, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        RadioButton(z6, aVar, str, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}

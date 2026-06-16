package io.elevenlabs.ui.components;

import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "hint", "Lsn/z;", "InputLabelHintContainer", "(Ljava/lang/String;Ljava/lang/String;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class InputLabelHintContainerKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputLabelHintContainer(String str, String str2, u2.m mVar, int i10, int i11) {
        String str3;
        int i12;
        int i13;
        String str4;
        int i14;
        int i15;
        boolean z6;
        String str5;
        String str6;
        u2.r1 r10;
        String str7;
        ElevenLabsTheme elevenLabsTheme;
        String str8;
        boolean z10;
        boolean z11;
        String str9;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2052051823);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            str3 = str;
        } else if ((i10 & 6) == 0) {
            str3 = str;
            if (qVar.f(str3)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            str3 = str;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            str4 = str2;
            if (qVar.f(str4)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i12;
            if ((i15 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i15 & 1, z6)) {
                if (i16 != 0) {
                    str3 = null;
                }
                if (i17 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (str3 == null && str7 == null) {
                    qVar.X(1889557809);
                    qVar.p(false);
                    str8 = str3;
                    str9 = str7;
                } else {
                    qVar.X(1888781321);
                    ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                    i3.t e10 = r1.p2.e(r1.d.I(i3.q.f13017a, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme2.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), 7), 1.0f);
                    r1.k2 a10 = r1.i2.a(r1.j.f29234g, i3.d.f13005z0, qVar, 54);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c5 = i3.a.c(e10, qVar);
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
                    if (str3 != null) {
                        qVar.X(-116453516);
                        String str10 = str3;
                        elevenLabsTheme = elevenLabsTheme2;
                        j7.d(str10, null, defpackage.f.b(elevenLabsTheme2, qVar, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar, 6).getSubtitleSmall500(), qVar, i15 & 14, 0, 131066);
                        str8 = str10;
                        qVar = qVar;
                        z10 = false;
                        qVar.p(false);
                    } else {
                        elevenLabsTheme = elevenLabsTheme2;
                        str8 = str3;
                        z10 = false;
                        qVar.X(-116258960);
                        qVar.p(false);
                    }
                    if (str7 != null) {
                        qVar.X(-116204493);
                        ElevenLabsTheme elevenLabsTheme3 = elevenLabsTheme;
                        s4.y0 subtitleSmall500 = elevenLabsTheme3.getTypo(qVar, 6).getSubtitleSmall500();
                        u2.q qVar2 = qVar;
                        String str11 = str7;
                        j7.d(str11, null, defpackage.f.A(elevenLabsTheme3, qVar, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, subtitleSmall500, qVar2, (i15 >> 3) & 14, 0, 131066);
                        str9 = str11;
                        qVar = qVar2;
                        z11 = false;
                        qVar.p(false);
                    } else {
                        z11 = z10;
                        str9 = str7;
                        qVar.X(-116008976);
                        qVar.p(z11);
                    }
                    qVar.p(true);
                    qVar.p(z11);
                }
                str5 = str9;
                str6 = str8;
            } else {
                qVar.R();
                str5 = str4;
                str6 = str3;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new i1(str6, str5, i10, i11, 0);
                return;
            }
            return;
        }
        str4 = str2;
        i15 = i12;
        if ((i15 & 19) == 18) {
        }
        if (!qVar.O(i15 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z InputLabelHintContainer$lambda$1(String str, String str2, int i10, int i11, u2.m mVar, int i12) {
        InputLabelHintContainer(str, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}

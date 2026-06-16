package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.ColorMatrixColorFilter;
import c3.o;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.VoiceCircleKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.extensions.ColorExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.room.SignalClient;
import j1.f0;
import j1.r0;
import j1.y;
import java.util.UUID;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.i0;
import p3.y0;
import p4.b0;
import r1.m1;
import r1.p;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.e1;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.w0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Li3/t;", "modifier", "", "voiceId", "Lsn/z;", "GeneratingStep", "(Li3/t;Ljava/lang/String;Lu2/m;II)V", "Preview_GeneratingStep", "(Lu2/m;I)V", "Lh5/f;", "GeneratingCircleSize", TokenNames.F, "", "scale", "hueRotation", "animatedHueRotation", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GeneratingStepKt {
    private static final float GeneratingCircleSize = SensibleDefaults.X_OFFSET;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GeneratingStep(t tVar, String str, m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        int i13;
        String str2;
        boolean z6;
        t tVar3;
        String str3;
        String str4;
        t tVar4;
        int i14;
        Object L;
        Object L2;
        boolean f10;
        Object L3;
        boolean f11;
        Object L4;
        Object L5;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(-1587889929);
        int i16 = i11 & 1;
        if (i16 != 0) {
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
            if ((i11 & 2) == 0) {
                str2 = str;
                if (qVar.f(str2)) {
                    i15 = 32;
                    i12 |= i15;
                }
            } else {
                str2 = str;
            }
            i15 = 16;
            i12 |= i15;
        } else {
            str2 = str;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            int i17 = i10 & 1;
            i3.q qVar2 = i3.q.f13017a;
            u2.e eVar = u2.l.f33918a;
            if (i17 != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else {
                if (i16 != 0) {
                    tVar2 = qVar2;
                }
                if ((i11 & 2) != 0) {
                    Object L6 = qVar.L();
                    if (L6 == eVar) {
                        L6 = UUID.randomUUID().toString();
                        qVar.h0(L6);
                    }
                    String str5 = (String) L6;
                    str5.getClass();
                    str4 = str5;
                    tVar4 = tVar2;
                    i14 = i12 & (-113);
                    qVar.q();
                    t d10 = p2.d(tVar4, 1.0f);
                    x a10 = w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
                    int hashCode = Long.hashCode(qVar.T);
                    o l4 = qVar.l();
                    t c5 = i3.a.c(d10, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    if (!qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    h4.e eVar2 = h4.g.f11907f;
                    r.J(eVar2, a10, qVar);
                    h4.e eVar3 = h4.g.f11906e;
                    r.J(eVar3, l4, qVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar4 = h4.g.f11908g;
                    r.y(qVar, valueOf, eVar4);
                    h4.d dVar = h4.g.f11909h;
                    r.F(dVar, qVar);
                    h4.e eVar5 = h4.g.f11905d;
                    r.J(eVar5, c5, qVar);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    t e10 = p2.e(new m1(1.0f, true), 1.0f);
                    f1 d11 = p.d(i3.d.f13001e, false);
                    int hashCode2 = Long.hashCode(qVar.T);
                    o l7 = qVar.l();
                    t c10 = i3.a.c(e10, qVar);
                    qVar.b0();
                    if (!qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    r.J(eVar2, d11, qVar);
                    r.J(eVar3, l7, qVar);
                    defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                    r.J(eVar5, c10, qVar);
                    f0 g10 = j1.e.g(j1.e.q("breathing", qVar, 0), 0.85f, 1.15f, j1.e.p(j1.e.s(1250, 0, y.f18444a, 2), r0.f18351b, 0L, 4), "breathing_scale", qVar, 29112, 0);
                    L = qVar.L();
                    if (L == eVar) {
                        L = new e1(u.P);
                        qVar.h0(L);
                    }
                    w0 w0Var = (w0) L;
                    L2 = qVar.L();
                    if (L2 == eVar) {
                        L2 = new GeneratingStepKt$GeneratingStep$2$1$1$1(w0Var, null);
                        qVar.h0(L2);
                    }
                    r.f((ho.p) L2, z.f31622a, qVar);
                    s2 b10 = j1.f.b(GeneratingStep$lambda$1$0$2(w0Var), j1.e.s(SignalClient.CLOSE_REASON_NORMAL_CLOSURE, 0, y.f18447d, 2), "hue_rotation", qVar, 3072, 20);
                    String R = kj.c.R(qVar, R.string.voice_design_generating_a11y);
                    t o6 = p2.o(qVar2, GeneratingCircleSize);
                    f10 = qVar.f(g10) | qVar.f(b10);
                    L3 = qVar.L();
                    if (!f10 || L3 == eVar) {
                        L3 = new e(g10, b10, 0);
                        qVar.h0(L3);
                    }
                    t r10 = h0.r(o6, (ho.l) L3);
                    f11 = qVar.f(R);
                    L4 = qVar.L();
                    if (!f11 || L4 == eVar) {
                        L4 = new f(R, 0);
                        qVar.h0(L4);
                    }
                    String str6 = str4;
                    VoiceCircleKt.VoiceCircle(true, str6, p4.q.c(r10, false, (ho.l) L4), false, true, qVar, (i14 & 112) | 24582, 8);
                    qVar.p(true);
                    String R2 = kj.c.R(qVar, R.string.voice_design_generating_continue);
                    L5 = qVar.L();
                    if (L5 == eVar) {
                        L5 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(16);
                        qVar.h0(L5);
                    }
                    t e11 = p2.e(qVar2, 1.0f);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i18 = ElevenLabsTheme.$stable;
                    EchoButtonKt.m1835EchoButton562pCRU(R2, (ho.a) L5, r1.d.F(e11, elevenLabsTheme.getSpacings(qVar, i18).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i18).m2356getX4D9Ej5fM()), EchoButtonVariant.Primary, EchoButtonSize.Medium, null, false, false, null, false, false, qVar, 1600560, 0, 1952);
                    qVar = qVar;
                    qVar.p(true);
                    str3 = str6;
                    tVar3 = tVar4;
                }
            }
            tVar4 = tVar2;
            i14 = i12;
            str4 = str2;
            qVar.q();
            t d102 = p2.d(tVar4, 1.0f);
            x a102 = w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            o l42 = qVar.l();
            t c52 = i3.a.c(d102, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (!qVar.S) {
            }
            h4.e eVar22 = h4.g.f11907f;
            r.J(eVar22, a102, qVar);
            h4.e eVar32 = h4.g.f11906e;
            r.J(eVar32, l42, qVar);
            Integer valueOf2 = Integer.valueOf(hashCode3);
            h4.e eVar42 = h4.g.f11908g;
            r.y(qVar, valueOf2, eVar42);
            h4.d dVar2 = h4.g.f11909h;
            r.F(dVar2, qVar);
            h4.e eVar52 = h4.g.f11905d;
            r.J(eVar52, c52, qVar);
            if (1.0f <= 0.0d) {
            }
            t e102 = p2.e(new m1(1.0f, true), 1.0f);
            f1 d112 = p.d(i3.d.f13001e, false);
            int hashCode22 = Long.hashCode(qVar.T);
            o l72 = qVar.l();
            t c102 = i3.a.c(e102, qVar);
            qVar.b0();
            if (!qVar.S) {
            }
            r.J(eVar22, d112, qVar);
            r.J(eVar32, l72, qVar);
            defpackage.f.u(hashCode22, qVar, eVar42, qVar, dVar2);
            r.J(eVar52, c102, qVar);
            f0 g102 = j1.e.g(j1.e.q("breathing", qVar, 0), 0.85f, 1.15f, j1.e.p(j1.e.s(1250, 0, y.f18444a, 2), r0.f18351b, 0L, 4), "breathing_scale", qVar, 29112, 0);
            L = qVar.L();
            if (L == eVar) {
            }
            w0 w0Var2 = (w0) L;
            L2 = qVar.L();
            if (L2 == eVar) {
            }
            r.f((ho.p) L2, z.f31622a, qVar);
            s2 b102 = j1.f.b(GeneratingStep$lambda$1$0$2(w0Var2), j1.e.s(SignalClient.CLOSE_REASON_NORMAL_CLOSURE, 0, y.f18447d, 2), "hue_rotation", qVar, 3072, 20);
            String R3 = kj.c.R(qVar, R.string.voice_design_generating_a11y);
            t o62 = p2.o(qVar2, GeneratingCircleSize);
            f10 = qVar.f(g102) | qVar.f(b102);
            L3 = qVar.L();
            if (!f10) {
            }
            L3 = new e(g102, b102, 0);
            qVar.h0(L3);
            t r102 = h0.r(o62, (ho.l) L3);
            f11 = qVar.f(R3);
            L4 = qVar.L();
            if (!f11) {
            }
            L4 = new f(R3, 0);
            qVar.h0(L4);
            String str62 = str4;
            VoiceCircleKt.VoiceCircle(true, str62, p4.q.c(r102, false, (ho.l) L4), false, true, qVar, (i14 & 112) | 24582, 8);
            qVar.p(true);
            String R22 = kj.c.R(qVar, R.string.voice_design_generating_continue);
            L5 = qVar.L();
            if (L5 == eVar) {
            }
            t e112 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
            int i182 = ElevenLabsTheme.$stable;
            EchoButtonKt.m1835EchoButton562pCRU(R22, (ho.a) L5, r1.d.F(e112, elevenLabsTheme2.getSpacings(qVar, i182).m2357getX5D9Ej5fM(), elevenLabsTheme2.getSpacings(qVar, i182).m2356getX4D9Ej5fM()), EchoButtonVariant.Primary, EchoButtonSize.Medium, null, false, false, null, false, false, qVar, 1600560, 0, 1952);
            qVar = qVar;
            qVar.p(true);
            str3 = str62;
            tVar3 = tVar4;
        } else {
            qVar.R();
            tVar3 = tVar2;
            str3 = str2;
        }
        r1 r11 = qVar.r();
        if (r11 != null) {
            r11.f34012d = new io.elevenlabs.readerapp.ui.components.r(tVar3, str3, i10, i11, 6);
        }
    }

    private static final float GeneratingStep$lambda$1$0$0(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final float GeneratingStep$lambda$1$0$2(w0 w0Var) {
        return ((e1) w0Var).h();
    }

    public static final void GeneratingStep$lambda$1$0$3(w0 w0Var, float f10) {
        ((e1) w0Var).i(f10);
    }

    private static final float GeneratingStep$lambda$1$0$5(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [p3.z, p3.y] */
    public static final z GeneratingStep$lambda$1$0$6$0(s2 s2Var, s2 s2Var2, i0 i0Var) {
        i0Var.getClass();
        y0 y0Var = (y0) i0Var;
        y0Var.r(GeneratingStep$lambda$1$0$0(s2Var));
        y0Var.s(GeneratingStep$lambda$1$0$0(s2Var));
        float[] createHueRotationMatrix = ColorExtensionsKt.createHueRotationMatrix(GeneratingStep$lambda$1$0$5(s2Var2));
        ?? yVar = new p3.y(new ColorMatrixColorFilter(createHueRotationMatrix));
        yVar.f26452b = createHueRotationMatrix;
        y0Var.j(yVar);
        return z.f31622a;
    }

    public static final z GeneratingStep$lambda$1$0$7$0(String str, b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z GeneratingStep$lambda$2(t tVar, String str, int i10, int i11, m mVar, int i12) {
        GeneratingStep(tVar, str, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_GeneratingStep(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1552440018);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$GeneratingStepKt.INSTANCE.m1754getLambda$1585715272$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 10);
        }
    }

    public static final z Preview_GeneratingStep$lambda$0(int i10, m mVar, int i11) {
        Preview_GeneratingStep(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

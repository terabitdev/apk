package io.elevenlabs.ui.components;

import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "Lio/elevenlabs/ui/components/LabelSquareColor;", "color", "Lsn/z;", "LabelSquare", "(Ljava/lang/String;Lio/elevenlabs/ui/components/LabelSquareColor;Lu2/m;II)V", "Preview_LabelSquare", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LabelSquareKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LabelSquareColor.values().length];
            try {
                iArr[LabelSquareColor.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LabelSquareColor.STRONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void LabelSquare(String str, LabelSquareColor labelSquareColor, u2.m mVar, int i10, int i11) {
        int i12;
        int ordinal;
        int i13;
        boolean z6;
        LabelSquareColor labelSquareColor2;
        LabelSquareColor labelSquareColor3;
        sn.k kVar;
        int i14;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1319853710);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (labelSquareColor == null) {
                ordinal = -1;
            } else {
                ordinal = labelSquareColor.ordinal();
            }
            if (qVar.d(ordinal)) {
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
                labelSquareColor3 = LabelSquareColor.DEFAULT;
            } else {
                labelSquareColor3 = labelSquareColor;
            }
            int i16 = WhenMappings.$EnumSwitchMapping$0[labelSquareColor3.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    qVar.X(1364077480);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    kVar = new sn.k(new p3.x(elevenLabsTheme.getColor(qVar, 6).getButtonBackground().m2017getPrimary0d7_KjU()), new p3.x(elevenLabsTheme.getColor(qVar, 6).getButtonText().m2041getPrimary0d7_KjU()));
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(1364068159, qVar, false);
                }
            } else {
                qVar.X(1364070219);
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                kVar = new sn.k(new p3.x(p3.x.b(0.1f, elevenLabsTheme2.getColor(qVar, 6).getText().m2185getPrimary0d7_KjU())), new p3.x(p3.x.b(0.5f, elevenLabsTheme2.getColor(qVar, 6).getText().m2185getPrimary0d7_KjU())));
                qVar.p(false);
            }
            long j4 = ((p3.x) kVar.f31600a).f26440a;
            long j10 = ((p3.x) kVar.f31601b).f26440a;
            ElevenLabsTheme elevenLabsTheme3 = ElevenLabsTheme.INSTANCE;
            i3.t F = r1.d.F(l1.n.h(i3.q.f13017a, j4, elevenLabsTheme3.getShapes(qVar, 6).getSm()), elevenLabsTheme3.getSpacings(qVar, 6).m2350getX1D9Ej5fM(), elevenLabsTheme3.getSpacings(qVar, 6).m2349getX05D9Ej5fM());
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(F, qVar);
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
            j7.d(str, null, j10, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme3.getTypo(qVar, 6).getBodyTiny500(), qVar, i12 & 14, 0, 131066);
            qVar = qVar;
            qVar.p(true);
            labelSquareColor2 = labelSquareColor3;
        } else {
            qVar.R();
            labelSquareColor2 = labelSquareColor;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(str, labelSquareColor2, i10, i11, 22);
        }
    }

    public static final sn.z LabelSquare$lambda$1(String str, LabelSquareColor labelSquareColor, int i10, int i11, u2.m mVar, int i12) {
        LabelSquare(str, labelSquareColor, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_LabelSquare(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(295519642);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(qVar2, 10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
            qVar.X(1673110256);
            tn.e eVar = (tn.e) LabelSquareColor.getEntries();
            eVar.getClass();
            g1.a1 a1Var = new g1.a1(eVar, 9);
            while (a1Var.hasNext()) {
                LabelSquare("Label", (LabelSquareColor) a1Var.next(), qVar, 6, 0);
                r1.d.g(r1.p2.f(qVar2, 5), qVar);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 17);
        }
    }

    public static final sn.z Preview_LabelSquare$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LabelSquare(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

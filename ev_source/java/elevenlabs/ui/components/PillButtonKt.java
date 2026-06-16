package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.a7;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", ParameterNames.TEXT, "", ParameterNames.ICON, "Lkotlin/Function0;", "Lsn/z;", "onClick", "Lio/elevenlabs/ui/components/PillButtonVariant;", "variant", "Li3/t;", "modifier", "PillButton", "(Ljava/lang/String;ILho/a;Lio/elevenlabs/ui/components/PillButtonVariant;Li3/t;Lu2/m;II)V", "Preview_PillButton", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PillButtonKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PillButtonVariant.values().length];
            try {
                iArr[PillButtonVariant.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PillButtonVariant.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PillButton(String str, int i10, ho.a aVar, PillButtonVariant pillButtonVariant, i3.t tVar, u2.m mVar, int i11, int i12) {
        int i13;
        int ordinal;
        int i14;
        i3.t tVar2;
        int i15;
        boolean z6;
        u2.q qVar;
        PillButtonVariant pillButtonVariant2;
        i3.t tVar3;
        u2.r1 r10;
        PillButtonVariant pillButtonVariant3;
        PillButtonColors pillButtonColors;
        float f10;
        int i16;
        int i17;
        int i18;
        str.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-2083616894);
        if ((i11 & 6) == 0) {
            if (qVar2.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i13 = i18 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar2.d(i10)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i13 |= i17;
        }
        if ((i11 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        int i19 = i12 & 8;
        if (i19 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (pillButtonVariant == null) {
                ordinal = -1;
            } else {
                ordinal = pillButtonVariant.ordinal();
            }
            if (qVar2.d(ordinal)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
        }
        int i20 = i12 & 16;
        if (i20 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i15;
            if ((i13 & 9363) == 9362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i13 & 1, z6)) {
                if (i19 != 0) {
                    pillButtonVariant3 = PillButtonVariant.Primary;
                } else {
                    pillButtonVariant3 = pillButtonVariant;
                }
                if (i20 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                int i21 = WhenMappings.$EnumSwitchMapping$0[pillButtonVariant3.ordinal()];
                if (i21 != 1) {
                    if (i21 == 2) {
                        qVar2.X(-901058547);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        pillButtonColors = new PillButtonColors(elevenLabsTheme.getColor(qVar2, 6).getButtonBackground().m2018getSecondary0d7_KjU(), elevenLabsTheme.getColors(qVar2, 6).getSecondaryButtonText(), elevenLabsTheme.getColor(qVar2, 6).getButtonBackground().m2018getSecondary0d7_KjU(), null);
                        qVar2.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(-901068585, qVar2, false);
                    }
                } else {
                    qVar2.X(-901067193);
                    ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                    pillButtonColors = new PillButtonColors(elevenLabsTheme2.getColor(qVar2, 6).getButtonBackground().m2017getPrimary0d7_KjU(), elevenLabsTheme2.getColor(qVar2, 6).getButtonText().m2041getPrimary0d7_KjU(), elevenLabsTheme2.getColor(qVar2, 6).getButtonBackground().m2017getPrimary0d7_KjU(), null);
                    qVar2.p(false);
                }
                i3.t c5 = m3.h.c(r1.p2.f(tVar3, 28), z1.h.a());
                if (p3.x.c(pillButtonColors.m1849getBorder0d7_KjU(), pillButtonColors.m1848getBackground0d7_KjU())) {
                    f10 = 0;
                } else {
                    f10 = 1;
                }
                qVar = qVar2;
                a7.a(l1.n.p(l1.n.j(f10, pillButtonColors.m1849getBorder0d7_KjU(), c5, z1.h.a()), false, null, null, null, aVar, 15), null, pillButtonColors.m1848getBackground0d7_KjU(), 0L, t2.u.P, t2.u.P, null, c3.k.d(-1190299577, true, new s1(i10, pillButtonColors, str), qVar2), qVar, 12582912, 122);
                pillButtonVariant2 = pillButtonVariant3;
            } else {
                qVar = qVar2;
                qVar.R();
                pillButtonVariant2 = pillButtonVariant;
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new t1(str, i10, aVar, pillButtonVariant2, tVar3, i11, i12);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i13 & 9363) == 9362) {
        }
        if (!qVar2.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z PillButton$lambda$0(int i10, PillButtonColors pillButtonColors, String str, u2.m mVar, int i11) {
        boolean z6;
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t G = r1.d.G(qVar2, 12, t2.u.P, 2);
            r1.k2 a10 = r1.i2.a(r1.j.g(4), i3.d.f13005z0, qVar, 54);
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
            q2.y2.a(kd.a.M(i10, qVar, 0), null, r1.p2.o(qVar2, 16), pillButtonColors.m1850getText0d7_KjU(), qVar, u3.c.$stable | 432, 0);
            j7.d(str, null, pillButtonColors.m1850getText0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ElevenLabsTheme.INSTANCE.getTypo(qVar, 6).getPill700(), qVar, 0, 0, 131066);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PillButton$lambda$1(String str, int i10, ho.a aVar, PillButtonVariant pillButtonVariant, i3.t tVar, int i11, int i12, u2.m mVar, int i13) {
        PillButton(str, i10, aVar, pillButtonVariant, tVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final void Preview_PillButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-921497644);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PillButtonKt.INSTANCE.m1816getLambda$728709398$ui_release(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 24);
        }
    }

    public static final sn.z Preview_PillButton$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PillButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;
import q2.f5;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "Lio/elevenlabs/ui/components/PillSize;", "size", "", ParameterNames.ICON, "Li3/t;", "modifier", "", "selected", "Lkotlin/Function0;", "Lsn/z;", "onToggle", "Pill", "(Ljava/lang/String;Lio/elevenlabs/ui/components/PillSize;ILi3/t;ZLho/a;Lu2/m;II)V", "Preview_Pill", "(Lu2/m;I)V", "Lp3/x;", "backgroundColor", "foregroundColor", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PillKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PillSize.values().length];
            try {
                iArr[PillSize.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PillSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Pill(String str, PillSize pillSize, int i10, i3.t tVar, boolean z6, ho.a aVar, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        ho.a aVar2;
        i3.t tVar3;
        boolean z12;
        u2.r1 r10;
        boolean z13;
        ho.a aVar3;
        long m2140getInactiveBg0d7_KjU;
        long m2141getInactiveText0d7_KjU;
        float f10;
        int i20;
        i3.t tVar4;
        boolean z14;
        float m2353getX2D9Ej5fM;
        float f11;
        float m2356getX4D9Ej5fM;
        boolean z15;
        int i21;
        int i22;
        int i23;
        str.getClass();
        pillSize.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-89109918);
        if ((i11 & 6) == 0) {
            if (qVar.f(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i13 = i23 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.d(pillSize.ordinal())) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i13 |= i22;
        }
        if ((i11 & 384) == 0) {
            if (qVar.d(i10)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i13 |= i21;
        }
        int i24 = i12 & 8;
        if (i24 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i16 = 16384;
                } else {
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i16;
                i17 = i12 & 32;
                if (i17 != 0) {
                    i13 |= 196608;
                } else if ((196608 & i11) == 0) {
                    if (qVar.h(aVar)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                    i19 = i13;
                    if ((74899 & i19) == 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!qVar.O(i19 & 1, z11)) {
                        i3.q qVar2 = i3.q.f13017a;
                        if (i24 != 0) {
                            tVar2 = qVar2;
                        }
                        if (i15 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        ColorScheme color = elevenLabsTheme.getColor(qVar, 6);
                        ColorScheme.Selectable selectable = color.getSelectable();
                        if (z13) {
                            m2140getInactiveBg0d7_KjU = selectable.m2138getActiveBg0d7_KjU();
                        } else {
                            m2140getInactiveBg0d7_KjU = selectable.m2140getInactiveBg0d7_KjU();
                        }
                        long j4 = m2140getInactiveBg0d7_KjU;
                        ho.a aVar4 = aVar3;
                        i3.t tVar5 = tVar2;
                        u2.s2 a10 = i1.w2.a(j4, null, "background", qVar, 384, 10);
                        ColorScheme.Selectable selectable2 = color.getSelectable();
                        if (z13) {
                            m2141getInactiveText0d7_KjU = selectable2.m2139getActiveText0d7_KjU();
                        } else {
                            m2141getInactiveText0d7_KjU = selectable2.m2141getInactiveText0d7_KjU();
                        }
                        u2.s2 a11 = i1.w2.a(m2141getInactiveText0d7_KjU, null, ParameterNames.TEXT, qVar, 384, 10);
                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                        int i25 = iArr[pillSize.ordinal()];
                        if (i25 != 1) {
                            if (i25 == 2) {
                                f10 = 20;
                            } else {
                                c6.p();
                                return;
                            }
                        } else {
                            f10 = 16;
                        }
                        if (z13) {
                            qVar.X(264746107);
                            i20 = R.string.accessibility_chip_selected;
                        } else {
                            qVar.X(264748142);
                            i20 = R.string.accessibility_chip_unselected;
                        }
                        String R = kj.c.R(qVar, i20);
                        qVar.p(false);
                        qVar.X(264755718);
                        i3.t h10 = l1.n.h(m3.h.c(tVar5, elevenLabsTheme.getShapes(qVar, 6).getFull()), Pill$lambda$0(a10), p3.h0.f26395b);
                        u2.e eVar = u2.l.f33918a;
                        if (aVar4 != null) {
                            qVar.X(-237983429);
                            Object L = qVar.L();
                            if (L == eVar) {
                                L = j0.c.o(qVar);
                            }
                            p1.l lVar = (p1.l) L;
                            tVar4 = tVar5;
                            f5 b10 = e5.b(t2.u.P, 3, Pill$lambda$1(a11), false);
                            p4.k kVar = new p4.k(0);
                            if ((i19 & 458752) == 131072) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            Object L2 = qVar.L();
                            if (z15 || L2 == eVar) {
                                L2 = new o(7, aVar4);
                                qVar.h0(L2);
                            }
                            h10 = l1.n.n(h10, lVar, b10, false, kVar, (ho.a) L2, 12);
                            qVar.p(false);
                        } else {
                            tVar4 = tVar5;
                            qVar.X(-237605632);
                            qVar.p(false);
                        }
                        i3.t tVar6 = h10;
                        qVar.p(false);
                        int i26 = i19 & 14;
                        if (i26 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean f12 = z14 | qVar.f(R);
                        Object L3 = qVar.L();
                        if (f12 || L3 == eVar) {
                            L3 = new p(3, str, R);
                            qVar.h0(L3);
                        }
                        i3.t c5 = p4.q.c(tVar6, true, (ho.l) L3);
                        int i27 = iArr[pillSize.ordinal()];
                        if (i27 != 1) {
                            if (i27 == 2) {
                                qVar.X(264782788);
                                m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar, 6).m2350getX1D9Ej5fM();
                                qVar.p(false);
                            } else {
                                throw com.google.android.gms.internal.play_billing.b.h(264778373, qVar, false);
                            }
                        } else {
                            qVar.X(264780676);
                            m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM();
                            qVar.p(false);
                        }
                        i3.t G = r1.d.G(c5, t2.u.P, m2353getX2D9Ej5fM, 1);
                        int i28 = iArr[pillSize.ordinal()];
                        if (i28 != 1) {
                            if (i28 == 2) {
                                qVar.X(264789284);
                                f11 = elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM();
                                qVar.p(false);
                            } else {
                                throw com.google.android.gms.internal.play_billing.b.h(264785551, qVar, false);
                            }
                        } else {
                            qVar.X(264787172);
                            qVar.p(false);
                            f11 = 14;
                        }
                        float f13 = f11;
                        int i29 = iArr[pillSize.ordinal()];
                        if (i29 != 1) {
                            if (i29 == 2) {
                                qVar.X(264795268);
                                m2356getX4D9Ej5fM = elevenLabsTheme.getSpacings(qVar, 6).m2355getX3D9Ej5fM();
                                qVar.p(false);
                            } else {
                                throw com.google.android.gms.internal.play_billing.b.h(264790853, qVar, false);
                            }
                        } else {
                            qVar.X(264793156);
                            m2356getX4D9Ej5fM = elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM();
                            qVar.p(false);
                        }
                        i3.t I = r1.d.I(G, f13, t2.u.P, m2356getX4D9Ej5fM, t2.u.P, 10);
                        r1.k2 a12 = r1.i2.a(r1.j.f29232e, i3.d.f13005z0, qVar, 54);
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.t c10 = i3.a.c(I, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(h4.g.f11907f, a12, qVar);
                        u2.r.J(h4.g.f11906e, l4, qVar);
                        u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar);
                        u2.r.J(h4.g.f11905d, c10, qVar);
                        Pill$IconComponent(f10, a11, i10, qVar, (i19 >> 6) & 14);
                        r1.d.g(r1.p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2350getX1D9Ej5fM()), qVar);
                        j7.d(str, null, Pill$lambda$1(a11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleMedium700(), qVar, i26, 0, 131066);
                        qVar = qVar;
                        qVar.p(true);
                        z12 = z13;
                        tVar3 = tVar4;
                        aVar2 = aVar4;
                    } else {
                        qVar.R();
                        aVar2 = aVar;
                        tVar3 = tVar2;
                        z12 = z10;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new j2(str, pillSize, i10, tVar3, z12, aVar2, i11, i12);
                        return;
                    }
                    return;
                }
                i19 = i13;
                if ((74899 & i19) == 74898) {
                }
                if (!qVar.O(i19 & 1, z11)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            z10 = z6;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            i19 = i13;
            if ((74899 & i19) == 74898) {
            }
            if (!qVar.O(i19 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        z10 = z6;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        i19 = i13;
        if ((74899 & i19) == 74898) {
        }
        if (!qVar.O(i19 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final void Pill$IconComponent(float f10, u2.s2 s2Var, int i10, u2.m mVar, int i11) {
        q2.y2.a(kd.a.M(i10, mVar, i11 & 14), null, r1.p2.o(i3.q.f13017a, f10), Pill$lambda$1(s2Var), mVar, u3.c.$stable | 48, 0);
    }

    private static final long Pill$lambda$0(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long Pill$lambda$1(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final sn.z Pill$lambda$2$1$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z Pill$lambda$3$0(String str, String str2, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        p4.y.l(str2, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z Pill$lambda$5(String str, PillSize pillSize, int i10, i3.t tVar, boolean z6, ho.a aVar, int i11, int i12, u2.m mVar, int i13) {
        Pill(str, pillSize, i10, tVar, z6, aVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final void Preview_Pill(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2041805384);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(l1.n.y(i3.q.f13017a, l1.n.x(qVar), true, true), 10);
            i3.j jVar = i3.d.C0;
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(ElevenLabsTheme.INSTANCE.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), jVar, qVar, 48);
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
            qVar.X(127818848);
            for (PillSize pillSize : PillSize.getEntries()) {
                Pill("Pill(" + pillSize + Separators.RPAREN, pillSize, R.drawable.close_circle, null, true, null, qVar, 24576, 40);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 25);
        }
    }

    public static final sn.z Preview_Pill$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Pill(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

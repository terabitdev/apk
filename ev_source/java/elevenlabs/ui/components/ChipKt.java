package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a}\u0010\u0016\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001d²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Li3/t;", "Lh5/f;", "minSize", "currentSize", "minimumTouchTarget-VpY3zN4", "(Li3/t;FF)Li3/t;", "minimumTouchTarget", "", Constants.ScionAnalytics.PARAM_LABEL, "modifier", "", "selected", "", ParameterNames.ICON, "iconUrl", "Lio/elevenlabs/ui/components/ChipIconPosition;", "iconPosition", "Lkotlin/Function0;", "Lsn/z;", "onToggle", "onIconPress", "iconAccessibilityLabel", "Chip", "(Ljava/lang/String;Li3/t;ZLjava/lang/Integer;Ljava/lang/String;Lio/elevenlabs/ui/components/ChipIconPosition;Lho/a;Lho/a;Ljava/lang/String;Lu2/m;II)V", "Preview_Chip", "(Lu2/m;I)V", "Lp3/x;", "backgroundColor", "foregroundColor", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ChipKt {
    /* JADX WARN: Removed duplicated region for block: B:114:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(String str, i3.t tVar, boolean z6, Integer num, String str2, ChipIconPosition chipIconPosition, ho.a aVar, ho.a aVar2, String str3, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        Integer num2;
        int i17;
        int i18;
        String str4;
        int i19;
        int i20;
        int ordinal;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z11;
        u2.q qVar;
        ChipIconPosition chipIconPosition2;
        ho.a aVar3;
        String str5;
        i3.t tVar3;
        boolean z12;
        Integer num3;
        String str6;
        ho.a aVar4;
        u2.r1 r10;
        i3.t tVar4;
        boolean z13;
        Integer num4;
        ChipIconPosition chipIconPosition3;
        ho.a aVar5;
        ho.a aVar6;
        long m2140getInactiveBg0d7_KjU;
        long m2141getInactiveText0d7_KjU;
        boolean z14;
        String R;
        float f10;
        String str7;
        boolean z15;
        boolean z16;
        float f11;
        float f12;
        String str8;
        ho.a aVar7;
        u2.s2 s2Var;
        String str9;
        boolean z17;
        i3.q qVar2;
        float f13;
        ChipIconPosition chipIconPosition4;
        ho.a aVar8;
        boolean z18;
        ElevenLabsTheme elevenLabsTheme;
        boolean z19;
        boolean z20;
        int i31;
        str.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(984804448);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i12 = i31 | i10;
        } else {
            i12 = i10;
        }
        int i32 = i11 & 2;
        if (i32 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                z10 = z6;
                if (qVar3.g(z10)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    num2 = num;
                    if (qVar3.f(num2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        str4 = str2;
                        if (qVar3.f(str4)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        i20 = i11 & 32;
                        if (i20 != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 196608) == 0) {
                            if (chipIconPosition == null) {
                                ordinal = -1;
                            } else {
                                ordinal = chipIconPosition.ordinal();
                            }
                            if (qVar3.d(ordinal)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                        }
                        i22 = i11 & 64;
                        if (i22 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (qVar3.h(aVar)) {
                                i23 = 1048576;
                            } else {
                                i23 = 524288;
                            }
                            i12 |= i23;
                        }
                        i24 = i11 & 128;
                        if (i24 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 12582912) == 0) {
                            i25 = i24;
                            if (qVar3.h(aVar2)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i12 |= i26;
                            i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                            if (i27 == 0) {
                                i28 = i27;
                                i29 = i12 | 100663296;
                            } else {
                                if ((i10 & 100663296) == 0) {
                                    i28 = i27;
                                    if (qVar3.f(str3)) {
                                        i30 = 67108864;
                                    } else {
                                        i30 = 33554432;
                                    }
                                    i12 |= i30;
                                } else {
                                    i28 = i27;
                                }
                                i29 = i12;
                            }
                            if ((i29 & 38347923) == 38347922) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!qVar3.O(i29 & 1, z11)) {
                                i3.q qVar4 = i3.q.f13017a;
                                if (i32 != 0) {
                                    tVar4 = qVar4;
                                } else {
                                    tVar4 = tVar2;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                String str10 = null;
                                if (i16 != 0) {
                                    num4 = null;
                                } else {
                                    num4 = num2;
                                }
                                if (i18 != 0) {
                                    str4 = null;
                                }
                                if (i20 != 0) {
                                    chipIconPosition3 = ChipIconPosition.End;
                                } else {
                                    chipIconPosition3 = chipIconPosition;
                                }
                                if (i22 != 0) {
                                    aVar5 = null;
                                } else {
                                    aVar5 = aVar;
                                }
                                if (i25 != 0) {
                                    aVar6 = null;
                                } else {
                                    aVar6 = aVar2;
                                }
                                if (i28 == 0) {
                                    str10 = str3;
                                }
                                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                                ColorScheme color = elevenLabsTheme2.getColor(qVar3, 6);
                                ColorScheme.Selectable selectable = color.getSelectable();
                                if (z13) {
                                    m2140getInactiveBg0d7_KjU = selectable.m2138getActiveBg0d7_KjU();
                                } else {
                                    m2140getInactiveBg0d7_KjU = selectable.m2140getInactiveBg0d7_KjU();
                                }
                                u2.s2 a10 = i1.w2.a(m2140getInactiveBg0d7_KjU, null, "background", qVar3, 384, 10);
                                ColorScheme.Selectable selectable2 = color.getSelectable();
                                if (z13) {
                                    m2141getInactiveText0d7_KjU = selectable2.m2139getActiveText0d7_KjU();
                                } else {
                                    m2141getInactiveText0d7_KjU = selectable2.m2141getInactiveText0d7_KjU();
                                }
                                u2.s2 a11 = i1.w2.a(m2141getInactiveText0d7_KjU, null, ParameterNames.TEXT, qVar3, 384, 10);
                                qVar = qVar3;
                                float f14 = 20;
                                float f15 = 48;
                                if (z13) {
                                    qVar.X(1504397529);
                                    R = kj.c.R(qVar, R.string.accessibility_chip_selected);
                                    z14 = false;
                                } else {
                                    z14 = false;
                                    qVar.X(1504399564);
                                    R = kj.c.R(qVar, R.string.accessibility_chip_unselected);
                                }
                                qVar.p(z14);
                                qVar.X(1504408968);
                                i3.t tVar5 = tVar4;
                                i3.t h10 = l1.n.h(m3.h.c(r1.p2.h(tVar4, 36, t2.u.P, 2), elevenLabsTheme2.getShapes(qVar, 6).getFull()), Chip$lambda$0(a10), p3.h0.f26395b);
                                u2.e eVar = u2.l.f33918a;
                                if (aVar5 != null) {
                                    qVar.X(-1487303699);
                                    Object L = qVar.L();
                                    if (L == eVar) {
                                        L = j0.c.o(qVar);
                                    }
                                    p1.l lVar = (p1.l) L;
                                    f10 = f15;
                                    str7 = str10;
                                    f5 b10 = e5.b(t2.u.P, 3, Chip$lambda$1(a11), false);
                                    p4.k kVar = new p4.k(0);
                                    if ((i29 & 3670016) == 1048576) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    Object L2 = qVar.L();
                                    if (z20 || L2 == eVar) {
                                        L2 = new o(3, aVar5);
                                        qVar.h0(L2);
                                    }
                                    h10 = l1.n.n(h10, lVar, b10, false, kVar, (ho.a) L2, 12);
                                    z15 = false;
                                    qVar.p(false);
                                } else {
                                    f10 = f15;
                                    str7 = str10;
                                    z15 = false;
                                    qVar.X(-1486879402);
                                    qVar.p(false);
                                }
                                i3.t tVar6 = h10;
                                qVar.p(z15);
                                int i33 = i29 & 14;
                                if (i33 == 4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                boolean f16 = z16 | qVar.f(R);
                                Object L3 = qVar.L();
                                if (f16 || L3 == eVar) {
                                    L3 = new p(2, str, R);
                                    qVar.h0(L3);
                                }
                                i3.t G = r1.d.G(p4.q.c(tVar6, true, (ho.l) L3), t2.u.P, 6, 1);
                                r1.f fVar = r1.j.f29232e;
                                i3.k kVar2 = i3.d.f13005z0;
                                r1.k2 a12 = r1.i2.a(fVar, kVar2, qVar, 54);
                                int hashCode = Long.hashCode(qVar.T);
                                c3.o l4 = qVar.l();
                                i3.t c5 = i3.a.c(G, qVar);
                                h4.h.f11920i.getClass();
                                h4.f fVar2 = h4.g.f11903b;
                                qVar.b0();
                                if (qVar.S) {
                                    qVar.k(fVar2);
                                } else {
                                    qVar.k0();
                                }
                                h4.e eVar2 = h4.g.f11907f;
                                u2.r.J(eVar2, a12, qVar);
                                h4.e eVar3 = h4.g.f11906e;
                                u2.r.J(eVar3, l4, qVar);
                                Integer valueOf = Integer.valueOf(hashCode);
                                h4.e eVar4 = h4.g.f11908g;
                                u2.r.y(qVar, valueOf, eVar4);
                                h4.d dVar = h4.g.f11909h;
                                u2.r.F(dVar, qVar);
                                h4.e eVar5 = h4.g.f11905d;
                                u2.r.J(eVar5, c5, qVar);
                                r1.d.g(r1.p2.s(qVar4, elevenLabsTheme2.getSpacings(qVar, 6).m2355getX3D9Ej5fM()), qVar);
                                if (chipIconPosition3 == ChipIconPosition.Start) {
                                    qVar.X(-279411342);
                                    if (num4 != null) {
                                        qVar.X(-279365245);
                                        ho.a aVar9 = aVar6;
                                        Chip$IconComponent(aVar9, f14, f10, str7, a11, num4.intValue(), qVar, (i29 >> 9) & 14);
                                        qVar.p(false);
                                        aVar7 = aVar9;
                                        str8 = str7;
                                        s2Var = a11;
                                        str9 = str4;
                                        f12 = f10;
                                        z17 = false;
                                        f11 = f14;
                                    } else {
                                        float f17 = f10;
                                        ho.a aVar10 = aVar6;
                                        String str11 = str7;
                                        if (str4 != null) {
                                            qVar.X(-279269765);
                                            String str12 = str4;
                                            Chip$AsyncIconComponent(aVar10, f14, f17, str11, a11, str12, qVar, (i29 >> 12) & 14);
                                            aVar7 = aVar10;
                                            f11 = f14;
                                            f12 = f17;
                                            str8 = str11;
                                            s2Var = a11;
                                            str9 = str12;
                                            z17 = false;
                                            qVar.p(false);
                                        } else {
                                            aVar7 = aVar10;
                                            str8 = str11;
                                            s2Var = a11;
                                            str9 = str4;
                                            f12 = f17;
                                            z17 = false;
                                            f11 = f14;
                                            qVar.X(-279179524);
                                            qVar.p(false);
                                        }
                                    }
                                    qVar.p(z17);
                                } else {
                                    f11 = f14;
                                    f12 = f10;
                                    str8 = str7;
                                    aVar7 = aVar6;
                                    s2Var = a11;
                                    str9 = str4;
                                    z17 = false;
                                    qVar.X(-279153794);
                                    qVar.p(false);
                                }
                                r1.d.g(r1.p2.s(qVar4, elevenLabsTheme2.getSpacings(qVar, 6).m2350getX1D9Ej5fM()), qVar);
                                if (str.length() > 0) {
                                    qVar.X(-279023997);
                                    i3.t h11 = r1.p2.h(qVar4, f11, t2.u.P, 2);
                                    r1.k2 a13 = r1.i2.a(r1.j.f29228a, kVar2, qVar, 48);
                                    float f18 = f11;
                                    ChipIconPosition chipIconPosition5 = chipIconPosition3;
                                    int hashCode2 = Long.hashCode(qVar.T);
                                    c3.o l7 = qVar.l();
                                    i3.t c10 = i3.a.c(h11, qVar);
                                    qVar.b0();
                                    if (qVar.S) {
                                        qVar.k(fVar2);
                                    } else {
                                        qVar.k0();
                                    }
                                    u2.r.J(eVar2, a13, qVar);
                                    u2.r.J(eVar3, l7, qVar);
                                    defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                                    u2.r.J(eVar5, c10, qVar);
                                    aVar8 = aVar5;
                                    f13 = f18;
                                    qVar2 = qVar4;
                                    chipIconPosition4 = chipIconPosition5;
                                    elevenLabsTheme = elevenLabsTheme2;
                                    j7.d(str, null, Chip$lambda$1(s2Var), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar, 6).getSubtitleMedium600(), qVar, i33, 0, 131066);
                                    qVar = qVar;
                                    z19 = true;
                                    qVar.p(true);
                                    z18 = false;
                                    qVar.p(false);
                                } else {
                                    qVar2 = qVar4;
                                    f13 = f11;
                                    chipIconPosition4 = chipIconPosition3;
                                    aVar8 = aVar5;
                                    z18 = z17;
                                    elevenLabsTheme = elevenLabsTheme2;
                                    z19 = true;
                                    qVar.X(-278680610);
                                    qVar.p(z18);
                                }
                                ElevenLabsTheme elevenLabsTheme3 = elevenLabsTheme;
                                i3.q qVar5 = qVar2;
                                r1.d.g(r1.p2.s(qVar5, elevenLabsTheme3.getSpacings(qVar, 6).m2350getX1D9Ej5fM()), qVar);
                                ChipIconPosition chipIconPosition6 = chipIconPosition4;
                                if (chipIconPosition6 == ChipIconPosition.End) {
                                    qVar.X(-278560175);
                                    if (num4 != null) {
                                        qVar.X(-278514078);
                                        ho.a aVar11 = aVar7;
                                        float f19 = f12;
                                        Chip$IconComponent(aVar11, f13, f19, str8, s2Var, num4.intValue(), qVar, (i29 >> 9) & 14);
                                        qVar.p(z18);
                                    } else {
                                        u2.s2 s2Var2 = s2Var;
                                        float f20 = f12;
                                        if (str9 != null) {
                                            qVar.X(-278417637);
                                            ho.a aVar12 = aVar7;
                                            String str13 = str8;
                                            Chip$AsyncIconComponent(aVar12, f13, f20, str13, s2Var2, str9, qVar, (i29 >> 12) & 14);
                                            qVar.p(z18);
                                        } else {
                                            qVar.X(-278327396);
                                            qVar.p(z18);
                                        }
                                    }
                                    qVar.p(z18);
                                } else {
                                    qVar.X(-278301666);
                                    qVar.p(z18);
                                }
                                r1.d.g(r1.p2.s(qVar5, elevenLabsTheme3.getSpacings(qVar, 6).m2355getX3D9Ej5fM()), qVar);
                                qVar.p(z19);
                                chipIconPosition2 = chipIconPosition6;
                                z12 = z13;
                                num3 = num4;
                                tVar3 = tVar5;
                                str6 = str9;
                                aVar4 = aVar7;
                                str5 = str8;
                                aVar3 = aVar8;
                            } else {
                                qVar = qVar3;
                                qVar.R();
                                chipIconPosition2 = chipIconPosition;
                                aVar3 = aVar;
                                str5 = str3;
                                tVar3 = tVar2;
                                z12 = z10;
                                num3 = num2;
                                str6 = str4;
                                aVar4 = aVar2;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new g0(str, tVar3, z12, num3, str6, chipIconPosition2, aVar3, aVar4, str5, i10, i11);
                                return;
                            }
                            return;
                        }
                        i25 = i24;
                        i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                        if (i27 == 0) {
                        }
                        if ((i29 & 38347923) == 38347922) {
                        }
                        if (!qVar3.O(i29 & 1, z11)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    str4 = str2;
                    i20 = i11 & 32;
                    if (i20 != 0) {
                    }
                    i22 = i11 & 64;
                    if (i22 != 0) {
                    }
                    i24 = i11 & 128;
                    if (i24 != 0) {
                    }
                    i25 = i24;
                    i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i27 == 0) {
                    }
                    if ((i29 & 38347923) == 38347922) {
                    }
                    if (!qVar3.O(i29 & 1, z11)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                num2 = num;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                str4 = str2;
                i20 = i11 & 32;
                if (i20 != 0) {
                }
                i22 = i11 & 64;
                if (i22 != 0) {
                }
                i24 = i11 & 128;
                if (i24 != 0) {
                }
                i25 = i24;
                i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i27 == 0) {
                }
                if ((i29 & 38347923) == 38347922) {
                }
                if (!qVar3.O(i29 & 1, z11)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            z10 = z6;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            num2 = num;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            str4 = str2;
            i20 = i11 & 32;
            if (i20 != 0) {
            }
            i22 = i11 & 64;
            if (i22 != 0) {
            }
            i24 = i11 & 128;
            if (i24 != 0) {
            }
            i25 = i24;
            i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i27 == 0) {
            }
            if ((i29 & 38347923) == 38347922) {
            }
            if (!qVar3.O(i29 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        z10 = z6;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        num2 = num;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        str4 = str2;
        i20 = i11 & 32;
        if (i20 != 0) {
        }
        i22 = i11 & 64;
        if (i22 != 0) {
        }
        i24 = i11 & 128;
        if (i24 != 0) {
        }
        i25 = i24;
        i27 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i27 == 0) {
        }
        if ((i29 & 38347923) == 38347922) {
        }
        if (!qVar3.O(i29 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final void Chip$AsyncIconComponent(ho.a aVar, float f10, float f11, String str, u2.s2 s2Var, String str2, u2.m mVar, int i10) {
        f4.p pVar = f4.q.f8840c;
        i3.q qVar = i3.q.f13017a;
        if (aVar != null) {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(2041976384);
            i3.t c5 = m3.h.c(m1793minimumTouchTargetVpY3zN4(r1.p2.o(qVar, f10), f11, f10), ElevenLabsTheme.INSTANCE.getShapes(qVar2, 6).getFull());
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = j0.c.o(qVar2);
            }
            p1.l lVar = (p1.l) L;
            f5 a10 = e5.a(Chip$lambda$1(s2Var), 24, false);
            p4.k kVar = new p4.k(0);
            boolean f12 = qVar2.f(aVar);
            Object L2 = qVar2.L();
            if (f12 || L2 == eVar) {
                L2 = new o(4, aVar);
                qVar2.h0(L2);
            }
            i3.t n2 = l1.n.n(c5, lVar, a10, false, kVar, (ho.a) L2, 12);
            boolean f13 = qVar2.f(str);
            Object L3 = qVar2.L();
            if (f13 || L3 == eVar) {
                L3 = new g(str, 7);
                qVar2.h0(L3);
            }
            i3.t c10 = p4.q.c(n2, false, (ho.l) L3);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c11 = i3.a.c(c10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c11, qVar2);
            CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str2, r1.p2.o(qVar, f10), new p3.x(Chip$lambda$1(s2Var)), pVar, null, null, null, qVar2, (i10 & 14) | 3120, 112);
            qVar2.p(true);
            qVar2.p(false);
            return;
        }
        u2.q qVar3 = (u2.q) mVar;
        qVar3.X(2043164614);
        CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str2, r1.p2.o(qVar, f10), new p3.x(Chip$lambda$1(s2Var)), pVar, null, null, null, qVar3, (i10 & 14) | 3120, 112);
        qVar3.p(false);
    }

    public static final sn.z Chip$AsyncIconComponent$lambda$7$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z Chip$AsyncIconComponent$lambda$8$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        if (str == null) {
            str = "";
        }
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    private static final void Chip$IconComponent(ho.a aVar, float f10, float f11, String str, u2.s2 s2Var, int i10, u2.m mVar, int i11) {
        i3.q qVar = i3.q.f13017a;
        if (aVar != null) {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(-449568365);
            i3.t c5 = m3.h.c(m1793minimumTouchTargetVpY3zN4(r1.p2.o(qVar, f10), f11, f10), ElevenLabsTheme.INSTANCE.getShapes(qVar2, 6).getFull());
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = j0.c.o(qVar2);
            }
            p1.l lVar = (p1.l) L;
            f5 a10 = e5.a(Chip$lambda$1(s2Var), 24, false);
            p4.k kVar = new p4.k(0);
            boolean f12 = qVar2.f(aVar);
            Object L2 = qVar2.L();
            if (f12 || L2 == eVar) {
                L2 = new o(2, aVar);
                qVar2.h0(L2);
            }
            i3.t n2 = l1.n.n(c5, lVar, a10, false, kVar, (ho.a) L2, 12);
            boolean f13 = qVar2.f(str);
            Object L3 = qVar2.L();
            if (f13 || L3 == eVar) {
                L3 = new g(str, 6);
                qVar2.h0(L3);
            }
            i3.t c10 = p4.q.c(n2, false, (ho.l) L3);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c11 = i3.a.c(c10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c11, qVar2);
            q2.y2.a(kd.a.M(i10, qVar2, i11 & 14), null, r1.p2.o(qVar, f10), Chip$lambda$1(s2Var), qVar2, u3.c.$stable | 432, 0);
            qVar2.p(true);
            qVar2.p(false);
            return;
        }
        u2.q qVar3 = (u2.q) mVar;
        qVar3.X(-448360047);
        q2.y2.a(kd.a.M(i10, qVar3, i11 & 14), null, r1.p2.o(qVar, f10), Chip$lambda$1(s2Var), qVar3, u3.c.$stable | 432, 0);
        qVar3.p(false);
    }

    public static final sn.z Chip$IconComponent$lambda$3$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z Chip$IconComponent$lambda$4$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        if (str == null) {
            str = "";
        }
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    private static final long Chip$lambda$0(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long Chip$lambda$1(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final sn.z Chip$lambda$10$1$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z Chip$lambda$11$0(String str, String str2, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        p4.y.l(str2, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z Chip$lambda$13(String str, i3.t tVar, boolean z6, Integer num, String str2, ChipIconPosition chipIconPosition, ho.a aVar, ho.a aVar2, String str3, int i10, int i11, u2.m mVar, int i12) {
        Chip(str, tVar, z6, num, str2, chipIconPosition, aVar, aVar2, str3, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_Chip(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1324566574);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            l1.f2 x10 = l1.n.x(qVar);
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(l1.n.y(qVar2, x10, true, true), 10);
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
            qVar.X(-2095419483);
            tn.e eVar = (tn.e) ChipIconPosition.getEntries();
            eVar.getClass();
            g1.a1 a1Var = new g1.a1(eVar, 9);
            while (a1Var.hasNext()) {
                ChipIconPosition chipIconPosition = (ChipIconPosition) a1Var.next();
                g1.a1 a1Var2 = a1Var;
                Chip("Chip", null, false, null, null, null, null, null, null, qVar, 6, 510);
                float f10 = 4;
                r1.p.a(r1.p2.f(qVar2, f10), qVar, 6);
                Integer valueOf = Integer.valueOf(R.drawable.close_circle);
                Object L = qVar.L();
                if (L == u2.l.f33918a) {
                    L = new a(16);
                    qVar.h0(L);
                }
                Chip("Chip selected", null, true, valueOf, null, chipIconPosition, null, (ho.a) L, "Icon action", qVar, 113246598, 82);
                r1.p.a(r1.p2.f(qVar2, f10), qVar, 6);
                Chip("Chip", null, false, null, null, chipIconPosition, null, null, null, qVar, 6, 478);
                r1.p.a(r1.p2.f(qVar2, f10), qVar, 6);
                a1Var = a1Var2;
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 4);
        }
    }

    public static final sn.z Preview_Chip$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Chip(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: minimumTouchTarget-VpY3zN4 */
    private static final i3.t m1793minimumTouchTargetVpY3zN4(i3.t tVar, final float f10, final float f11) {
        return f4.i0.m(new ho.q() { // from class: io.elevenlabs.ui.components.f0
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                f4.g1 minimumTouchTarget_VpY3zN4$lambda$0;
                minimumTouchTarget_VpY3zN4$lambda$0 = ChipKt.minimumTouchTarget_VpY3zN4$lambda$0(f10, f11, (f4.h1) obj, (f4.e1) obj2, (h5.a) obj3);
                return minimumTouchTarget_VpY3zN4$lambda$0;
            }
        }, tVar);
    }

    public static final f4.g1 minimumTouchTarget_VpY3zN4$lambda$0(float f10, float f11, f4.h1 h1Var, f4.e1 e1Var, h5.a aVar) {
        h1Var.getClass();
        e1Var.getClass();
        int B = h1Var.B(f10);
        return h1Var.Z(B, B, tn.u.f33548a, new e0(B, h1Var.B(f11), e1Var.V(aVar.f12077a)));
    }

    public static final sn.z minimumTouchTarget_VpY3zN4$lambda$0$0(int i10, int i11, f4.s1 s1Var, f4.r1 r1Var) {
        r1Var.getClass();
        int i12 = (i10 - i11) / 2;
        r1Var.k(s1Var, i12, i12, t2.u.P);
        return sn.z.f31622a;
    }
}

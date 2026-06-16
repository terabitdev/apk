package io.elevenlabs.ui.echo.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.d;
import h4.e;
import h4.f;
import h4.g;
import h5.c;
import ho.a;
import i3.j;
import i3.k;
import i3.t;
import i4.j1;
import ib.i;
import io.elevenlabs.readerapp.ui.components.u0;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import p3.b1;
import p3.h0;
import p3.w0;
import p4.b0;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p;
import r1.p2;
import r1.w;
import r1.x;
import s4.j0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", ParameterNames.TEXT, "Li3/t;", "modifier", "title", "", "leadingIcon", "Lkotlin/Function0;", "Lsn/z;", "onClick", "", "Lio/elevenlabs/ui/echo/components/EchoToastAction;", "actions", "EchoToast", "(Ljava/lang/String;Li3/t;Ljava/lang/String;Ljava/lang/Integer;Lho/a;Ljava/util/List;Lu2/m;II)V", ParameterNames.ICON, "EchoToastActionButton", "(Ljava/lang/String;Ljava/lang/Integer;Lho/a;Li3/t;Lu2/m;II)V", "Preview_EchoToast", "(Lu2/m;I)V", "Lio/elevenlabs/ui/extensions/BoxShadow;", "EchoToastShadow", "Lio/elevenlabs/ui/extensions/BoxShadow;", "Lh5/f;", "EchoToastMaxWidth", TokenNames.F, "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoToastKt {
    private static final BoxShadow EchoToastShadow = new BoxShadow(h0.c(521212177), 16, u.P, (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(8) & 4294967295L), false, 20, null);
    private static final float EchoToastMaxWidth = 480;

    /* JADX WARN: Removed duplicated region for block: B:100:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoToast(String str, t tVar, String str2, Integer num, a aVar, List<EchoToastAction> list, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer num2;
        int i17;
        int i18;
        a aVar2;
        int i19;
        int i20;
        List<EchoToastAction> list2;
        int i21;
        boolean z6;
        t tVar3;
        q qVar;
        Integer num3;
        a aVar3;
        List<EchoToastAction> list3;
        String str3;
        r1 r10;
        t tVar4;
        String str4;
        Integer num4;
        a aVar4;
        List<EchoToastAction> list4;
        j jVar;
        w0 w0Var;
        d dVar;
        e eVar;
        k kVar;
        EchoTheme echoTheme;
        e eVar2;
        i3.q qVar2;
        f fVar;
        int i22;
        String str5;
        e eVar3;
        int i23;
        int i24;
        q qVar3;
        int i25;
        str.getClass();
        q qVar4 = (q) mVar;
        qVar4.Z(181266874);
        if ((i10 & 6) == 0) {
            if (qVar4.f(str)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i12 = i25 | i10;
        } else {
            i12 = i10;
        }
        int i26 = i11 & 2;
        if (i26 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar4.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (qVar4.f(str2)) {
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
                    if (qVar4.f(num2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        aVar2 = aVar;
                        if (qVar4.h(aVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        i20 = i11 & 32;
                        if (i20 != 0) {
                            i12 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            list2 = list;
                            if (qVar4.h(list2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                            if ((74899 & i12) == 74898) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!qVar4.O(i12 & 1, z6)) {
                                i3.q qVar5 = i3.q.f13017a;
                                if (i26 != 0) {
                                    tVar4 = qVar5;
                                } else {
                                    tVar4 = tVar2;
                                }
                                if (i14 != 0) {
                                    str4 = null;
                                } else {
                                    str4 = str2;
                                }
                                if (i16 != 0) {
                                    num4 = null;
                                } else {
                                    num4 = num2;
                                }
                                if (i18 != 0) {
                                    aVar4 = null;
                                } else {
                                    aVar4 = aVar2;
                                }
                                if (i20 != 0) {
                                    list4 = tn.t.f33547a;
                                } else {
                                    list4 = list2;
                                }
                                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                                b1 threeXl = echoTheme2.getShapes(qVar4, 6).getThreeXl(qVar4, 0);
                                long septenaryAlpha = echoTheme2.getColors(qVar4, 6).getBorder().getSeptenaryAlpha(qVar4, 0);
                                t c5 = h.c(BoxShadowKt.boxShadow$default(p2.u(tVar4, u.P, EchoToastMaxWidth, 1), new BoxShadow[]{EchoToastShadow}, threeXl, false, 4, null), threeXl);
                                long visualRaisedSm = echoTheme2.getColors(qVar4, 6).getFill().getVisualRaisedSm(qVar4, 0);
                                w0 w0Var2 = h0.f26395b;
                                t j4 = n.j(echoTheme2.getSpacings(qVar4, 6).getXpx(), septenaryAlpha, n.h(c5, visualRaisedSm, w0Var2), threeXl);
                                if (aVar4 != null) {
                                    j4 = n.p(j4, false, null, null, null, aVar4, 15);
                                }
                                a aVar5 = aVar4;
                                Object L = qVar4.L();
                                if (L == l.f33918a) {
                                    L = new j0(24);
                                    qVar4.h0(L);
                                }
                                t c10 = p4.q.c(j4, true, (ho.l) L);
                                r1.e eVar4 = r1.j.f29230c;
                                j jVar2 = i3.d.B0;
                                x a10 = w.a(eVar4, jVar2, qVar4, 0);
                                int i27 = i12;
                                int hashCode = Long.hashCode(qVar4.T);
                                o l4 = qVar4.l();
                                t c11 = i3.a.c(c10, qVar4);
                                h4.h.f11920i.getClass();
                                f fVar2 = g.f11903b;
                                qVar4.b0();
                                if (qVar4.S) {
                                    qVar4.k(fVar2);
                                } else {
                                    qVar4.k0();
                                }
                                e eVar5 = g.f11907f;
                                r.J(eVar5, a10, qVar4);
                                e eVar6 = g.f11906e;
                                r.J(eVar6, l4, qVar4);
                                Integer valueOf = Integer.valueOf(hashCode);
                                t tVar5 = tVar4;
                                e eVar7 = g.f11908g;
                                r.y(qVar4, valueOf, eVar7);
                                d dVar2 = g.f11909h;
                                r.F(dVar2, qVar4);
                                String str6 = str4;
                                e eVar8 = g.f11905d;
                                r.J(eVar8, c11, qVar4);
                                t E = r1.d.E(qVar5, echoTheme2.getSpacings(qVar4, 6).getX3());
                                k kVar2 = i3.d.f13004y0;
                                k2 a11 = i2.a(i.m(echoTheme2, qVar4, 6), kVar2, qVar4, 48);
                                int hashCode2 = Long.hashCode(qVar4.T);
                                o l7 = qVar4.l();
                                t c12 = i3.a.c(E, qVar4);
                                qVar4.b0();
                                List<EchoToastAction> list5 = list4;
                                if (qVar4.S) {
                                    qVar4.k(fVar2);
                                } else {
                                    qVar4.k0();
                                }
                                r.J(eVar5, a11, qVar4);
                                r.J(eVar6, l7, qVar4);
                                defpackage.f.u(hashCode2, qVar4, eVar7, qVar4, dVar2);
                                r.J(eVar8, c12, qVar4);
                                if (num4 != null) {
                                    qVar4.X(-596010076);
                                    qVar4.X(1643347980);
                                    float i28 = ((c) qVar4.j(j1.f13129h)).i(echoTheme2.getTypography(qVar4, 6).getBaseRegular400(qVar4, 0).f31175b.f31011c);
                                    qVar4.p(false);
                                    t f10 = p2.f(qVar5, i28);
                                    f1 d10 = p.d(i3.d.f13001e, false);
                                    int hashCode3 = Long.hashCode(qVar4.T);
                                    o l10 = qVar4.l();
                                    t c13 = i3.a.c(f10, qVar4);
                                    qVar4.b0();
                                    if (qVar4.S) {
                                        qVar4.k(fVar2);
                                    } else {
                                        qVar4.k0();
                                    }
                                    r.J(eVar5, d10, qVar4);
                                    r.J(eVar6, l10, qVar4);
                                    defpackage.f.u(hashCode3, qVar4, eVar7, qVar4, dVar2);
                                    r.J(eVar8, c13, qVar4);
                                    jVar = jVar2;
                                    w0Var = w0Var2;
                                    echoTheme = echoTheme2;
                                    dVar = dVar2;
                                    eVar = eVar8;
                                    kVar = kVar2;
                                    i22 = 0;
                                    qVar2 = qVar5;
                                    fVar = fVar2;
                                    eVar2 = eVar6;
                                    y2.a(kd.a.M(num4.intValue(), qVar4, (i27 >> 9) & 14), null, p2.o(qVar5, 20), echoTheme2.getColors(qVar4, 6).getIcon().getPrimary(qVar4, 0), qVar4, u3.c.$stable | 432, 0);
                                    qVar4.p(true);
                                    qVar4.p(false);
                                } else {
                                    jVar = jVar2;
                                    w0Var = w0Var2;
                                    dVar = dVar2;
                                    eVar = eVar8;
                                    kVar = kVar2;
                                    echoTheme = echoTheme2;
                                    eVar2 = eVar6;
                                    qVar2 = qVar5;
                                    fVar = fVar2;
                                    i22 = 0;
                                    qVar4.X(-595231666);
                                    qVar4.p(false);
                                }
                                x a12 = w.a(r1.j.g(echoTheme.getSpacings(qVar4, 6).getX1()), jVar, qVar4, i22);
                                int hashCode4 = Long.hashCode(qVar4.T);
                                o l11 = qVar4.l();
                                t c14 = i3.a.c(qVar2, qVar4);
                                qVar4.b0();
                                if (qVar4.S) {
                                    qVar4.k(fVar);
                                } else {
                                    qVar4.k0();
                                }
                                r.J(eVar5, a12, qVar4);
                                r.J(eVar2, l11, qVar4);
                                d dVar3 = dVar;
                                defpackage.f.u(hashCode4, qVar4, eVar7, qVar4, dVar3);
                                e eVar9 = eVar;
                                r.J(eVar9, c14, qVar4);
                                if (str6 != null) {
                                    qVar4.X(-1202491725);
                                    eVar3 = eVar9;
                                    i23 = 6;
                                    j7.d(str6, null, i.v(6, 0, echoTheme, qVar4, qVar4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar4, 6).getBaseRegular500(qVar4, 0), qVar4, (i27 >> 6) & 14, 0, 131066);
                                    str5 = str6;
                                    qVar4 = qVar4;
                                    i24 = 0;
                                    qVar4.p(false);
                                } else {
                                    str5 = str6;
                                    eVar3 = eVar9;
                                    i23 = 6;
                                    i24 = 0;
                                    qVar4.X(-1202284552);
                                    qVar4.p(false);
                                }
                                q qVar6 = qVar4;
                                j7.d(str, null, i.v(i23, i24, echoTheme, qVar4, qVar4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar4, i23).getBaseRegular400(qVar4, i24), qVar6, i27 & 14, 0, 131066);
                                q qVar7 = qVar6;
                                boolean z10 = true;
                                qVar7.p(true);
                                qVar7.p(true);
                                if (!list5.isEmpty()) {
                                    qVar7.X(1678680827);
                                    float f11 = 1;
                                    w0 w0Var3 = w0Var;
                                    boolean z11 = false;
                                    p.a(n.h(p2.f(p2.e(qVar2, 1.0f), f11), septenaryAlpha, w0Var3), qVar7, 0);
                                    t f12 = p2.f(p2.e(qVar2, 1.0f), 52);
                                    k2 a13 = i2.a(r1.j.f29228a, kVar, qVar7, 0);
                                    int hashCode5 = Long.hashCode(qVar7.T);
                                    o l12 = qVar7.l();
                                    t c15 = i3.a.c(f12, qVar7);
                                    qVar7.b0();
                                    if (qVar7.S) {
                                        qVar7.k(fVar);
                                    } else {
                                        qVar7.k0();
                                    }
                                    r.J(eVar5, a13, qVar7);
                                    r.J(eVar2, l12, qVar7);
                                    defpackage.f.u(hashCode5, qVar7, eVar7, qVar7, dVar3);
                                    List<EchoToastAction> list6 = list5;
                                    Iterator s10 = b.s(qVar7, c15, eVar3, -200609361, list6);
                                    int i29 = 0;
                                    while (s10.hasNext()) {
                                        Object next = s10.next();
                                        int i30 = i29 + 1;
                                        if (i29 >= 0) {
                                            EchoToastAction echoToastAction = (EchoToastAction) next;
                                            String text = echoToastAction.getText();
                                            Integer icon = echoToastAction.getIcon();
                                            a onClick = echoToastAction.getOnClick();
                                            if (1.0f <= 0.0d) {
                                                s1.a.a("invalid weight; must be greater than zero");
                                            }
                                            i3.q qVar8 = qVar2;
                                            List<EchoToastAction> list7 = list6;
                                            q qVar9 = qVar7;
                                            w0 w0Var4 = w0Var3;
                                            boolean z12 = z11;
                                            EchoToastActionButton(text, icon, onClick, new m1(1.0f, true), qVar9, 0, 0);
                                            if (i29 < list7.size() - 1) {
                                                qVar9.X(-350786003);
                                                p.a(n.h(p2.s(p2.c(qVar8, 1.0f), f11), septenaryAlpha, w0Var4), qVar9, z12 ? 1 : 0);
                                                qVar9.p(z12);
                                            } else {
                                                qVar9.X(-350517884);
                                                qVar9.p(z12);
                                            }
                                            qVar7 = qVar9;
                                            w0Var3 = w0Var4;
                                            i29 = i30;
                                            qVar2 = qVar8;
                                            list6 = list7;
                                            z11 = z12 ? 1 : 0;
                                        } else {
                                            ig.f.U();
                                            throw null;
                                        }
                                    }
                                    list5 = list6;
                                    qVar3 = qVar7;
                                    boolean z13 = z11;
                                    z10 = true;
                                    p.n.t(qVar3, z13, true, z13);
                                } else {
                                    qVar3 = qVar7;
                                    qVar3.X(1679656242);
                                    qVar3.p(false);
                                }
                                qVar3.p(z10);
                                qVar = qVar3;
                                num3 = num4;
                                aVar3 = aVar5;
                                tVar3 = tVar5;
                                list3 = list5;
                                str3 = str5;
                            } else {
                                qVar4.R();
                                tVar3 = tVar2;
                                qVar = qVar4;
                                num3 = num2;
                                aVar3 = aVar2;
                                list3 = list2;
                                str3 = str2;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new u0(str, tVar3, str3, num3, aVar3, list3, i10, i11);
                                return;
                            }
                            return;
                        }
                        list2 = list;
                        if ((74899 & i12) == 74898) {
                        }
                        if (!qVar4.O(i12 & 1, z6)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    aVar2 = aVar;
                    i20 = i11 & 32;
                    if (i20 != 0) {
                    }
                    list2 = list;
                    if ((74899 & i12) == 74898) {
                    }
                    if (!qVar4.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                num2 = num;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                aVar2 = aVar;
                i20 = i11 & 32;
                if (i20 != 0) {
                }
                list2 = list;
                if ((74899 & i12) == 74898) {
                }
                if (!qVar4.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            num2 = num;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            aVar2 = aVar;
            i20 = i11 & 32;
            if (i20 != 0) {
            }
            list2 = list;
            if ((74899 & i12) == 74898) {
            }
            if (!qVar4.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        num2 = num;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        aVar2 = aVar;
        i20 = i11 & 32;
        if (i20 != 0) {
        }
        list2 = list;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar4.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z EchoToast$lambda$1$0(b0 b0Var) {
        b0Var.getClass();
        return z.f31622a;
    }

    public static final z EchoToast$lambda$3(String str, t tVar, String str2, Integer num, a aVar, List list, int i10, int i11, m mVar, int i12) {
        EchoToast(str, tVar, str2, num, aVar, list, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void EchoToastActionButton(String str, Integer num, a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        a aVar2;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        int i14;
        int i15;
        int i16;
        int i17;
        q qVar = (q) mVar;
        qVar.Z(-1106728523);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(num)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        } else {
            aVar2 = aVar;
        }
        int i18 = i11 & 8;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i18 != 0) {
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                t p10 = n.p(p2.c(tVar3, 1.0f), false, null, null, null, aVar2, 15);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                t E = r1.d.E(p10, echoTheme.getSpacings(qVar, 6).getX3());
                k kVar = i3.d.f13005z0;
                r1.u0 u0Var = r1.j.f29228a;
                k2 a10 = i2.a(r1.j.h(echoTheme.getSpacings(qVar, 6).getX2(), i3.d.C0), kVar, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(E, qVar);
                h4.h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a10, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c5, qVar);
                if (num != null) {
                    qVar.X(1372817819);
                    i14 = 0;
                    y2.a(kd.a.M(num.intValue(), qVar, (i12 >> 3) & 14), null, p2.o(qVar2, 20), echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0), qVar, u3.c.$stable | 432, 0);
                    qVar.p(false);
                } else {
                    i14 = 0;
                    qVar.X(1373046537);
                    qVar.p(false);
                }
                j7.d(str, null, i.v(6, i14, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getSmCompact600(qVar, i14), qVar, i12 & 14, 0, 131066);
                qVar = qVar;
                qVar.p(true);
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f((Object) str, (Object) num, aVar, tVar3, i10, i11, 16);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z EchoToastActionButton$lambda$1(String str, Integer num, a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        EchoToastActionButton(str, num, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_EchoToast(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(204875369);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoToastKt.INSTANCE.getLambda$1474105155$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 4);
        }
    }

    public static final z Preview_EchoToast$lambda$0(int i10, m mVar, int i11) {
        Preview_EchoToast(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

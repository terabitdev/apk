package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aQ\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "accessibilityLabel", "", "isSelected", "Lkotlin/Function0;", "Lsn/z;", "onSelected", "Li3/t;", "modifier", "badge", FirebaseAnalytics.Param.CONTENT, "SelectableCardV2", "(Ljava/lang/String;ZLho/a;Li3/t;Ljava/lang/String;Lho/p;Lu2/m;II)V", "RadioButton", "(ZLi3/t;Lu2/m;II)V", "Preview_SelectableCardV2", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SelectableCardV2Kt {
    public static final void Preview_SelectableCardV2(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1525583782);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$SelectableCardV2Kt.INSTANCE.getLambda$1595341836$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 10);
        }
    }

    public static final sn.z Preview_SelectableCardV2$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SelectableCardV2(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void RadioButton(boolean z6, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1215313943);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
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
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i12 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            if (i15 != 0) {
                tVar = qVar2;
            }
            i3.t o6 = r1.p2.o(tVar, 24);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(o6, qVar);
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
            if (z6) {
                qVar.X(-1122137796);
                i3.t o10 = r1.p2.o(qVar2, 18);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                long primary = echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0);
                z1.g gVar = z1.h.f39128a;
                r1.p.a(l1.n.h(o10, primary, gVar), qVar, 0);
                r1.p.a(l1.n.h(r1.p2.o(qVar2, 6), echoTheme.getColors(qVar, 6).getIcon().getOnFillPrimary(qVar, 0), gVar), qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(-1121534040);
                r1.p.a(l1.n.j(2, EchoTheme.INSTANCE.getColors(qVar, 6).getBorder().getQuaternary(qVar, 0), r1.p2.o(qVar2, 18), z1.h.f39128a), qVar, 0);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        i3.t tVar2 = tVar;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.i(z6, tVar2, i10, i11, 2);
        }
    }

    public static final sn.z RadioButton$lambda$1(boolean z6, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        RadioButton(z6, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectableCardV2(String str, boolean z6, ho.a aVar, i3.t tVar, String str2, ho.p pVar, u2.m mVar, int i10, int i11) {
        String str3;
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        int i15;
        boolean z10;
        u2.q qVar;
        String str4;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        String str5;
        i3.t j4;
        boolean z11;
        h4.e eVar;
        int i16;
        i3.t tVar5;
        h4.d dVar;
        String str6;
        h4.e eVar2;
        h4.e eVar3;
        i3.q qVar2;
        h4.e eVar4;
        boolean z12;
        boolean z13;
        ho.a aVar2;
        float x32;
        boolean z14;
        long nonary;
        long tertiary;
        int i17;
        int i18;
        int i19;
        int i20;
        ho.p pVar2 = pVar;
        str.getClass();
        aVar.getClass();
        pVar2.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(442351855);
        if ((i10 & 6) == 0) {
            str3 = str;
            if (qVar3.f(str3)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            str3 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.g(z6)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(aVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (qVar3.f(str2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((196608 & i10) == 0) {
                    if (qVar3.h(pVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (qVar3.O(i12 & 1, z10)) {
                    i3.q qVar4 = i3.q.f13017a;
                    if (i21 != 0) {
                        tVar4 = qVar4;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    StringBuilder p10 = defpackage.f.p(str3);
                    if (str5 != null && !wq.n.m0(str5)) {
                        p10.append(", ".concat(str5));
                    }
                    String sb = p10.toString();
                    if (z6) {
                        qVar3.X(1144839988);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        j4 = l1.n.j(2, echoTheme.getColors(qVar3, 6).getBorder().getHeavy(qVar3, 0), qVar4, echoTheme.getShapes(qVar3, 6).getXl(qVar3, 0));
                        qVar3.p(false);
                    } else {
                        qVar3.X(1145003978);
                        EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                        j4 = l1.n.j((float) 0.5d, echoTheme2.getColors(qVar3, 6).getBorder().getQuiniaryAlpha(qVar3, 0), qVar4, echoTheme2.getShapes(qVar3, 6).getXl(qVar3, 0));
                        qVar3.p(false);
                    }
                    i3.t e10 = r1.p2.e(tVar4, 1.0f);
                    EchoTheme echoTheme3 = EchoTheme.INSTANCE;
                    i3.t c5 = m3.h.c(e10, echoTheme3.getShapes(qVar3, 6).getXl(qVar3, 0));
                    long visualRaisedXs = echoTheme3.getColors(qVar3, 6).getFill().getVisualRaisedXs(qVar3, 0);
                    p3.w0 w0Var = p3.h0.f26395b;
                    i3.t then = l1.n.h(c5, visualRaisedXs, w0Var).then(j4);
                    if ((i12 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object L = qVar3.L();
                    Object obj = u2.l.f33918a;
                    if (z11 || L == obj) {
                        L = new o(10, aVar);
                        qVar3.h0(L);
                    }
                    i3.t p11 = l1.n.p(then, false, null, null, null, (ho.a) L, 15);
                    boolean f10 = qVar3.f(sb);
                    Object L2 = qVar3.L();
                    if (f10 || L2 == obj) {
                        L2 = new g(sb, 15);
                        qVar3.h0(L2);
                    }
                    i3.t c10 = p4.q.c(p11, true, (ho.l) L2);
                    r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
                    int hashCode = Long.hashCode(qVar3.T);
                    c3.o l4 = qVar3.l();
                    i3.t c11 = i3.a.c(c10, qVar3);
                    h4.h.f11920i.getClass();
                    ho.a aVar3 = h4.g.f11903b;
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(aVar3);
                    } else {
                        qVar3.k0();
                    }
                    h4.e eVar5 = h4.g.f11907f;
                    u2.r.J(eVar5, a10, qVar3);
                    h4.e eVar6 = h4.g.f11906e;
                    u2.r.J(eVar6, l4, qVar3);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar7 = h4.g.f11908g;
                    u2.r.y(qVar3, valueOf, eVar7);
                    h4.d dVar2 = h4.g.f11909h;
                    u2.r.F(dVar2, qVar3);
                    h4.e eVar8 = h4.g.f11905d;
                    u2.r.J(eVar8, c11, qVar3);
                    if (str5 == null || wq.n.m0(str5)) {
                        eVar = eVar6;
                        i16 = i12;
                        tVar5 = tVar4;
                        dVar = dVar2;
                        str6 = str5;
                        eVar2 = eVar7;
                        eVar3 = eVar8;
                        qVar2 = qVar4;
                        eVar4 = eVar5;
                        z12 = false;
                        z13 = true;
                        qVar = qVar3;
                        aVar2 = aVar3;
                        qVar.X(-56786403);
                        qVar.p(false);
                    } else {
                        qVar3.X(-57437961);
                        i3.t e11 = r1.p2.e(qVar4, 1.0f);
                        if (z6) {
                            qVar3.X(552342028);
                            z14 = false;
                            nonary = echoTheme3.getColors(qVar3, 6).getFill().getPrimary(qVar3, 0);
                        } else {
                            z14 = false;
                            qVar3.X(552343147);
                            nonary = echoTheme3.getColors(qVar3, 6).getFill().getNonary(qVar3, 0);
                        }
                        qVar3.p(z14);
                        i3.t G = r1.d.G(l1.n.h(e11, nonary, w0Var), t2.u.P, echoTheme3.getSpacings(qVar3, 6).getX1(), 1);
                        f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                        i3.t tVar6 = tVar4;
                        int hashCode2 = Long.hashCode(qVar3.T);
                        c3.o l7 = qVar3.l();
                        i3.t c12 = i3.a.c(G, qVar3);
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(aVar3);
                        } else {
                            qVar3.k0();
                        }
                        u2.r.J(eVar5, d10, qVar3);
                        eVar = eVar6;
                        u2.r.J(eVar, l7, qVar3);
                        defpackage.f.u(hashCode2, qVar3, eVar7, qVar3, dVar2);
                        u2.r.J(eVar8, c12, qVar3);
                        String upperCase = str5.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        s4.y0 xsRegular500 = echoTheme3.getTypography(qVar3, 6).getXsRegular500(qVar3, 0);
                        if (z6) {
                            tertiary = ib.i.g(1486604403, 6, echoTheme3, qVar3, qVar3).getOnFillPrimary(qVar3, 0);
                        } else {
                            tertiary = ib.i.g(1486605710, 6, echoTheme3, qVar3, qVar3).getTertiary(qVar3, 0);
                        }
                        qVar3.p(false);
                        str6 = str5;
                        eVar2 = eVar7;
                        eVar3 = eVar8;
                        tVar5 = tVar6;
                        i16 = i12;
                        z12 = false;
                        qVar2 = qVar4;
                        z13 = true;
                        dVar = dVar2;
                        eVar4 = eVar5;
                        aVar2 = aVar3;
                        j7.d(upperCase, null, tertiary, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, xsRegular500, qVar3, 0, 0, 131066);
                        qVar = qVar3;
                        qVar.p(true);
                        qVar.p(false);
                    }
                    i3.t e12 = r1.p2.e(qVar2, 1.0f);
                    float x42 = echoTheme3.getSpacings(qVar, 6).getX4();
                    float x33 = echoTheme3.getSpacings(qVar, 6).getX3();
                    if (str6 != null && !wq.n.m0(str6)) {
                        qVar.X(552367239);
                        x32 = echoTheme3.getSpacings(qVar, 6).getX0();
                    } else {
                        qVar.X(552366375);
                        x32 = echoTheme3.getSpacings(qVar, 6).getX3();
                    }
                    qVar.p(z12);
                    i3.t H = r1.d.H(e12, x42, x32, x33, echoTheme3.getSpacings(qVar, 6).getX3());
                    f4.f1 d11 = r1.p.d(i3.d.f12997a, z12);
                    int hashCode3 = Long.hashCode(qVar.T);
                    c3.o l10 = qVar.l();
                    i3.t c13 = i3.a.c(H, qVar);
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(aVar2);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(eVar4, d11, qVar);
                    u2.r.J(eVar, l10, qVar);
                    defpackage.f.u(hashCode3, qVar, eVar2, qVar, dVar);
                    u2.r.J(eVar3, c13, qVar);
                    pVar2 = pVar;
                    j0.c.r((i16 >> 15) & 14, pVar2, qVar, z13, z13);
                    tVar3 = tVar5;
                    str4 = str6;
                } else {
                    qVar = qVar3;
                    qVar.R();
                    str4 = str2;
                    tVar3 = tVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new h2(str, z6, aVar, tVar3, str4, pVar2, i10, i11, 1);
                    return;
                }
                return;
            }
            if ((196608 & i10) == 0) {
            }
            if ((74899 & i12) != 74898) {
            }
            if (qVar3.O(i12 & 1, z10)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        if ((74899 & i12) != 74898) {
        }
        if (qVar3.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z SelectableCardV2$lambda$1$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z SelectableCardV2$lambda$2$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        p4.y.i(b0Var, 3);
        return sn.z.f31622a;
    }

    public static final sn.z SelectableCardV2$lambda$4(String str, boolean z6, ho.a aVar, i3.t tVar, String str2, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        SelectableCardV2(str, z6, aVar, tVar, str2, pVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final /* synthetic */ void access$RadioButton(boolean z6, i3.t tVar, u2.m mVar, int i10, int i11) {
        RadioButton(z6, tVar, mVar, i10, i11);
    }
}

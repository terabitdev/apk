package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import ho.q;
import i3.t;
import io.elevenlabs.readerapp.ui.components.ExpandableTextKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import r1.p;
import r1.p2;
import r1.w;
import r1.x;
import r1.z;
import s4.y0;
import t2.u;
import u2.m;
import u2.r;
import u2.r1;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"", "title", "subtitle", "description", "", "meta", "Lp3/x;", "backgroundColor", "Lh5/f;", "topPadding", "Lkotlin/Function1;", "Lr1/y;", "Lsn/z;", "bottomContent", "CollectionDetailHeader-ZfqMctQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JFLho/q;Lu2/m;II)V", "CollectionDetailHeader", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CollectionDetailHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ac  */
    /* renamed from: CollectionDetailHeader-ZfqMctQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1378CollectionDetailHeaderZfqMctQ(final String str, final String str2, final String str3, final List<String> list, final long j4, final float f10, q qVar, m mVar, final int i10, final int i11) {
        int i12;
        String str4;
        q qVar2;
        int i13;
        boolean z6;
        u2.q qVar3;
        final q qVar4;
        r1 r10;
        String str5;
        q qVar5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        str.getClass();
        list.getClass();
        u2.q qVar6 = (u2.q) mVar;
        qVar6.Z(834673919);
        if ((i10 & 6) == 0) {
            if (qVar6.f(str)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar6.f(str2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i10 & 384) == 0) {
            str4 = str3;
            if (qVar6.f(str4)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        } else {
            str4 = str3;
        }
        if ((i10 & 3072) == 0) {
            if (qVar6.h(list)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if (qVar6.e(j4)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((196608 & i10) == 0) {
            if (qVar6.c(f10)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        int i20 = i11 & 64;
        if (i20 != 0) {
            i12 |= 1572864;
        } else if ((1572864 & i10) == 0) {
            qVar2 = qVar;
            if (qVar6.h(qVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
            if ((599187 & i12) == 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar6.O(i12 & 1, z6)) {
                String str6 = null;
                if (i20 != 0) {
                    qVar2 = null;
                }
                if (str2 != null) {
                    if (!n.m0(str2)) {
                        str6 = str2;
                    }
                    if (str6 != null) {
                        str5 = str6;
                        i3.q qVar7 = i3.q.f13017a;
                        t h10 = l1.n.h(p2.e(qVar7, 1.0f), j4, h0.f26395b);
                        f1 d10 = p.d(i3.d.f12997a, false);
                        int hashCode = Long.hashCode(qVar6.T);
                        o l4 = qVar6.l();
                        t c5 = i3.a.c(h10, qVar6);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar6.b0();
                        int i21 = i12;
                        if (!qVar6.S) {
                            qVar6.k(fVar);
                        } else {
                            qVar6.k0();
                        }
                        h4.e eVar = h4.g.f11907f;
                        r.J(eVar, d10, qVar6);
                        h4.e eVar2 = h4.g.f11906e;
                        r.J(eVar2, l4, qVar6);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar3 = h4.g.f11908g;
                        r.y(qVar6, valueOf, eVar3);
                        h4.d dVar = h4.g.f11909h;
                        r.F(dVar, qVar6);
                        h4.e eVar4 = h4.g.f11905d;
                        r.J(eVar4, c5, qVar6);
                        t G = r1.d.G(p2.e(qVar7, 1.0f), 20, u.P, 2);
                        x a10 = w.a(r1.j.f29230c, i3.d.C0, qVar6, 48);
                        int hashCode2 = Long.hashCode(qVar6.T);
                        o l7 = qVar6.l();
                        t c10 = i3.a.c(G, qVar6);
                        qVar6.b0();
                        if (!qVar6.S) {
                            qVar6.k(fVar);
                        } else {
                            qVar6.k0();
                        }
                        r.J(eVar, a10, qVar6);
                        r.J(eVar2, l7, qVar6);
                        defpackage.f.u(hashCode2, qVar6, eVar3, qVar6, dVar);
                        r.J(eVar4, c10, qVar6);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i22 = EchoTheme.$stable;
                        r1.d.g(p2.f(qVar7, echoTheme.getSpacings(qVar6, i22).getX2() + f10), qVar6);
                        EchoThemeTypography typography = echoTheme.getTypography(qVar6, i22);
                        int i23 = EchoThemeTypography.$stable;
                        y0 xlRegular500 = typography.getXlRegular500(qVar6, i23);
                        EchoThemeColors.Text text = echoTheme.getColors(qVar6, i22).getText();
                        int i24 = EchoThemeColors.Text.$stable;
                        qVar5 = qVar2;
                        j7.d(str, null, text.getWhitePrimary(qVar6, i24), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, xlRegular500, qVar6, i21 & 14, 0, 130042);
                        qVar3 = qVar6;
                        if (str5 == null && !n.m0(str5)) {
                            qVar3.X(578442299);
                            r1.d.g(p2.f(qVar7, echoTheme.getSpacings(qVar3, i22).getX2()), qVar3);
                            ExpandableTextKt.m1085ExpandableText0Zdzm9U(str5, 2, null, echoTheme.getTypography(qVar3, i22).getSmRegular500(qVar3, i23), echoTheme.getColors(qVar3, i22).getText().getWhiteSecondary(qVar3, i24), echoTheme.getColors(qVar3, i22).getText().getWhitePrimary(qVar3, i24), 3, qVar3, 48, 4);
                            qVar3.p(false);
                        } else {
                            qVar3.X(578884359);
                            qVar3.p(false);
                        }
                        if (list.isEmpty()) {
                            qVar3.X(578931541);
                            r1.d.g(p2.f(qVar7, 16), qVar3);
                            j7.d(tn.o.E0(list, " · ", null, null, null, 62), null, echoTheme.getColors(qVar3, i22).getText().getWhiteTertiary(qVar3, i24), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar3, i22).getXsRegular400(qVar3, i23), qVar3, 0, 0, 130042);
                            qVar3.p(false);
                        } else {
                            qVar3.X(579256359);
                            qVar3.p(false);
                        }
                        if (qVar5 == null) {
                            qVar3.X(579298488);
                            qVar5.invoke(z.f29398a, qVar3, Integer.valueOf(((i21 >> 15) & 112) | 6));
                            qVar3.p(false);
                        } else {
                            qVar3.X(579352056);
                            r1.d.g(p2.f(qVar7, echoTheme.getSpacings(qVar3, i22).getX10()), qVar3);
                            qVar3.p(false);
                        }
                        qVar3.p(true);
                        qVar3.p(true);
                        qVar4 = qVar5;
                    }
                }
                str5 = str4;
                i3.q qVar72 = i3.q.f13017a;
                t h102 = l1.n.h(p2.e(qVar72, 1.0f), j4, h0.f26395b);
                f1 d102 = p.d(i3.d.f12997a, false);
                int hashCode3 = Long.hashCode(qVar6.T);
                o l42 = qVar6.l();
                t c52 = i3.a.c(h102, qVar6);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar6.b0();
                int i212 = i12;
                if (!qVar6.S) {
                }
                h4.e eVar5 = h4.g.f11907f;
                r.J(eVar5, d102, qVar6);
                h4.e eVar22 = h4.g.f11906e;
                r.J(eVar22, l42, qVar6);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                h4.e eVar32 = h4.g.f11908g;
                r.y(qVar6, valueOf2, eVar32);
                h4.d dVar2 = h4.g.f11909h;
                r.F(dVar2, qVar6);
                h4.e eVar42 = h4.g.f11905d;
                r.J(eVar42, c52, qVar6);
                t G2 = r1.d.G(p2.e(qVar72, 1.0f), 20, u.P, 2);
                x a102 = w.a(r1.j.f29230c, i3.d.C0, qVar6, 48);
                int hashCode22 = Long.hashCode(qVar6.T);
                o l72 = qVar6.l();
                t c102 = i3.a.c(G2, qVar6);
                qVar6.b0();
                if (!qVar6.S) {
                }
                r.J(eVar5, a102, qVar6);
                r.J(eVar22, l72, qVar6);
                defpackage.f.u(hashCode22, qVar6, eVar32, qVar6, dVar2);
                r.J(eVar42, c102, qVar6);
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i222 = EchoTheme.$stable;
                r1.d.g(p2.f(qVar72, echoTheme2.getSpacings(qVar6, i222).getX2() + f10), qVar6);
                EchoThemeTypography typography2 = echoTheme2.getTypography(qVar6, i222);
                int i232 = EchoThemeTypography.$stable;
                y0 xlRegular5002 = typography2.getXlRegular500(qVar6, i232);
                EchoThemeColors.Text text2 = echoTheme2.getColors(qVar6, i222).getText();
                int i242 = EchoThemeColors.Text.$stable;
                qVar5 = qVar2;
                j7.d(str, null, text2.getWhitePrimary(qVar6, i242), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, xlRegular5002, qVar6, i212 & 14, 0, 130042);
                qVar3 = qVar6;
                if (str5 == null) {
                }
                qVar3.X(578884359);
                qVar3.p(false);
                if (list.isEmpty()) {
                }
                if (qVar5 == null) {
                }
                qVar3.p(true);
                qVar3.p(true);
                qVar4 = qVar5;
            } else {
                qVar3 = qVar6;
                qVar3.R();
                qVar4 = qVar2;
            }
            r10 = qVar3.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.a
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z CollectionDetailHeader_ZfqMctQ$lambda$2;
                        int intValue = ((Integer) obj2).intValue();
                        CollectionDetailHeader_ZfqMctQ$lambda$2 = CollectionDetailHeaderKt.CollectionDetailHeader_ZfqMctQ$lambda$2(str, str2, str3, list, j4, f10, qVar4, i10, i11, (m) obj, intValue);
                        return CollectionDetailHeader_ZfqMctQ$lambda$2;
                    }
                };
                return;
            }
            return;
        }
        qVar2 = qVar;
        if ((599187 & i12) == 599186) {
        }
        if (!qVar6.O(i12 & 1, z6)) {
        }
        r10 = qVar3.r();
        if (r10 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z CollectionDetailHeader_ZfqMctQ$lambda$2(String str, String str2, String str3, List list, long j4, float f10, q qVar, int i10, int i11, m mVar, int i12) {
        m1378CollectionDetailHeaderZfqMctQ(str, str2, str3, list, j4, f10, qVar, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}

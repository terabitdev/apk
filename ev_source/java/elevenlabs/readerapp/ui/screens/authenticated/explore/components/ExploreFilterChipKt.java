package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import f4.f1;
import i1.w2;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.router.d0;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p1.l;
import p3.h0;
import p3.x;
import p4.b0;
import p4.k;
import p4.y;
import q2.e5;
import q2.f5;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.p;
import r1.p2;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u000f\u0010\u0015\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u000f\u0010\u0016\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0012\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001e²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "", "selected", "Li3/t;", "modifier", "Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/components/ExploreFilterChipSize;", "size", "", ParameterNames.ICON, "Lkotlin/Function0;", "Lsn/z;", "onToggle", "onIconPress", "iconAccessibilityLabel", "ExploreFilterChip", "(Ljava/lang/String;ZLi3/t;Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/components/ExploreFilterChipSize;Ljava/lang/Integer;Lho/a;Lho/a;Ljava/lang/String;Lu2/m;II)V", "Preview_ExploreFilterChip_Unselected", "(Lu2/m;I)V", "Preview_ExploreFilterChip_SelectedNoIcon", "Preview_ExploreFilterChip_SelectedWithIcon", "Preview_ExploreFilterChip_MultiOption", "Preview_ExploreFilterChip_LongLabel", "Lh5/f;", "CHIP_MIN_HEIGHT_DEFAULT", TokenNames.F, "CHIP_MIN_HEIGHT_SMALL", "Lp3/x;", "backgroundColor", "foregroundColor", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreFilterChipKt {
    private static final float CHIP_MIN_HEIGHT_DEFAULT = 48;
    private static final float CHIP_MIN_HEIGHT_SMALL = 36;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExploreFilterChipSize.values().length];
            try {
                iArr[ExploreFilterChipSize.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExploreFilterChipSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreFilterChip(String str, boolean z6, t tVar, ExploreFilterChipSize exploreFilterChipSize, Integer num, ho.a aVar, ho.a aVar2, String str2, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        Integer num2;
        int i15;
        ho.a aVar3;
        int i16;
        int i17;
        int i18;
        q qVar;
        Integer num3;
        ExploreFilterChipSize exploreFilterChipSize2;
        ho.a aVar4;
        String str3;
        t tVar3;
        ho.a aVar5;
        r1 r10;
        long denary;
        long primary;
        long j4;
        float x32;
        float f10;
        boolean z10;
        float x42;
        boolean z11;
        String R;
        boolean z12;
        t tVar4;
        float f11;
        String str4;
        h4.d dVar;
        i3.q qVar2;
        u2.e eVar;
        h4.e eVar2;
        int i19;
        h4.e eVar3;
        h4.e eVar4;
        h4.f fVar;
        ho.a aVar6;
        ho.a aVar7;
        q qVar3;
        h4.e eVar5;
        EchoTheme echoTheme;
        float f12;
        ho.a aVar8;
        String str5;
        boolean z13;
        boolean z14;
        h4.f fVar2;
        u2.e eVar6;
        l lVar;
        boolean z15;
        Object L;
        str.getClass();
        q qVar4 = (q) mVar;
        qVar4.Z(348820226);
        if ((i10 & 6) == 0) {
            i12 = (qVar4.f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= qVar4.g(z6) ? 32 : 16;
        }
        int i20 = i11 & 4;
        if (i20 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            i12 |= qVar4.f(tVar2) ? RpcError.MAX_MESSAGE_BYTES : 128;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                i12 |= qVar4.d(exploreFilterChipSize == null ? -1 : exploreFilterChipSize.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                num2 = num;
                i12 |= qVar4.f(num2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    aVar3 = aVar;
                    i12 |= qVar4.h(aVar3) ? 131072 : 65536;
                    i16 = i11 & 64;
                    if (i16 == 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        i12 |= qVar4.h(aVar2) ? 1048576 : 524288;
                    }
                    i17 = i11 & 128;
                    if (i17 == 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        i12 |= qVar4.f(str2) ? 8388608 : 4194304;
                    }
                    i18 = i12;
                    if (!qVar4.O(i18 & 1, (i18 & 4793491) == 4793490)) {
                        i3.q qVar5 = i3.q.f13017a;
                        t tVar5 = i20 != 0 ? qVar5 : tVar2;
                        ExploreFilterChipSize exploreFilterChipSize3 = i13 != 0 ? ExploreFilterChipSize.Default : exploreFilterChipSize;
                        Integer num4 = i14 != 0 ? null : num2;
                        ho.a aVar9 = i15 != 0 ? null : aVar3;
                        ho.a aVar10 = i16 != 0 ? null : aVar2;
                        String str6 = i17 == 0 ? str2 : null;
                        if (z6) {
                            qVar4.X(-2117098165);
                            denary = EchoTheme.INSTANCE.getColors(qVar4, EchoTheme.$stable).getFill().getPrimary(qVar4, EchoThemeColors.Fill.$stable);
                            qVar4.p(false);
                        } else {
                            qVar4.X(-2117039668);
                            denary = EchoTheme.INSTANCE.getColors(qVar4, EchoTheme.$stable).getFill().getDenary(qVar4, EchoThemeColors.Fill.$stable);
                            qVar4.p(false);
                        }
                        s2 a10 = w2.a(denary, null, "chipBackground", qVar4, 384, 10);
                        if (z6) {
                            qVar4.X(-2116862875);
                            primary = EchoTheme.INSTANCE.getColors(qVar4, EchoTheme.$stable).getText().getOnFillPrimary(qVar4, EchoThemeColors.Text.$stable);
                            qVar4.p(false);
                        } else {
                            qVar4.X(-2116798581);
                            primary = EchoTheme.INSTANCE.getColors(qVar4, EchoTheme.$stable).getText().getPrimary(qVar4, EchoThemeColors.Text.$stable);
                            qVar4.p(false);
                        }
                        s2 a11 = w2.a(primary, null, "chipForeground", qVar4, 384, 10);
                        if (z6) {
                            qVar4.X(-2116668598);
                            j4 = EchoTheme.INSTANCE.getColors(qVar4, EchoTheme.$stable).getBorder().getSeptenaryAlpha(qVar4, EchoThemeColors.Border.$stable);
                            qVar4.p(false);
                        } else {
                            qVar4.X(-2116609729);
                            qVar4.p(false);
                            j4 = x.f26437l;
                        }
                        EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                        int i21 = EchoTheme.$stable;
                        float x43 = echoTheme2.getSpacings(qVar4, i21).getX4();
                        String str7 = str6;
                        float f13 = 48;
                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                        int i22 = iArr[exploreFilterChipSize3.ordinal()];
                        if (i22 == 1) {
                            qVar4.X(208823556);
                            x32 = echoTheme2.getSpacings(qVar4, i21).getX3();
                            qVar4.p(false);
                        } else if (i22 == 2) {
                            qVar4.X(208825766);
                            x32 = echoTheme2.getSpacings(qVar4, i21).getX1_5();
                            qVar4.p(false);
                        } else {
                            throw com.google.android.gms.internal.play_billing.b.h(208821346, qVar4, false);
                        }
                        int i23 = iArr[exploreFilterChipSize3.ordinal()];
                        if (i23 == 1) {
                            f10 = CHIP_MIN_HEIGHT_DEFAULT;
                        } else if (i23 == 2) {
                            f10 = CHIP_MIN_HEIGHT_SMALL;
                        } else {
                            c6.p();
                            return;
                        }
                        if (z6 && num4 != null) {
                            qVar4.X(-2116033005);
                            x42 = echoTheme2.getSpacings(qVar4, i21).getX3();
                            z10 = false;
                            qVar4.p(false);
                        } else {
                            z10 = false;
                            qVar4.X(-2115982413);
                            x42 = echoTheme2.getSpacings(qVar4, i21).getX4();
                            qVar4.p(false);
                        }
                        if (z6) {
                            qVar4.X(208839822);
                            R = kj.c.R(qVar4, R.string.accessibility_chip_selected);
                            z11 = false;
                        } else {
                            z11 = z10;
                            qVar4.X(208842448);
                            R = kj.c.R(qVar4, R.string.accessibility_chip_unselected);
                        }
                        qVar4.p(z11);
                        qVar4.X(208855574);
                        t h10 = p2.h(tVar5, f10, u.P, 2);
                        EchoThemeShapes shapes = echoTheme2.getShapes(qVar4, i21);
                        int i24 = EchoThemeShapes.$stable;
                        t c5 = m3.h.c(h10, shapes.getFull(qVar4, i24));
                        t tVar6 = tVar5;
                        t j10 = n.j(1, j4, n.h(c5, ExploreFilterChip$lambda$0(a10), h0.f26395b), echoTheme2.getShapes(qVar4, i21).getFull(qVar4, i24));
                        u2.e eVar7 = u2.l.f33918a;
                        if (aVar9 != null) {
                            qVar4.X(-258450585);
                            Object L2 = qVar4.L();
                            if (L2 == eVar7) {
                                L2 = j0.c.o(qVar4);
                            }
                            l lVar2 = (l) L2;
                            f5 b10 = e5.b(u.P, 3, ExploreFilterChip$lambda$1(a11), false);
                            k kVar = new k(0);
                            boolean z16 = (i18 & 458752) == 131072;
                            Object L3 = qVar4.L();
                            if (z16 || L3 == eVar7) {
                                L3 = new fm.g(17, aVar9);
                                qVar4.h0(L3);
                            }
                            j10 = n.n(j10, lVar2, b10, false, kVar, (ho.a) L3, 12);
                            z12 = false;
                            qVar4.p(false);
                        } else {
                            z12 = false;
                            qVar4.X(-258149668);
                            qVar4.p(false);
                        }
                        t tVar7 = j10;
                        qVar4.p(z12);
                        int i25 = i18 & 14;
                        boolean f14 = (i25 == 4 ? true : z12) | qVar4.f(R);
                        Object L4 = qVar4.L();
                        if (f14 || L4 == eVar7) {
                            L4 = new d0(2, str, R);
                            qVar4.h0(L4);
                        }
                        t H = r1.d.H(p4.q.c(tVar7, true, (ho.l) L4), echoTheme2.getSpacings(qVar4, i21).getX4(), x32, x42, x32);
                        k2 a12 = i2.a(r1.j.f29232e, i3.d.f13005z0, qVar4, 54);
                        int hashCode = Long.hashCode(qVar4.T);
                        o l4 = qVar4.l();
                        t c10 = i3.a.c(H, qVar4);
                        h4.h.f11920i.getClass();
                        h4.f fVar3 = h4.g.f11903b;
                        qVar4.b0();
                        if (qVar4.S) {
                            qVar4.k(fVar3);
                        } else {
                            qVar4.k0();
                        }
                        h4.e eVar8 = h4.g.f11907f;
                        r.J(eVar8, a12, qVar4);
                        h4.e eVar9 = h4.g.f11906e;
                        r.J(eVar9, l4, qVar4);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar10 = h4.g.f11908g;
                        r.y(qVar4, valueOf, eVar10);
                        h4.d dVar2 = h4.g.f11909h;
                        r.F(dVar2, qVar4);
                        h4.e eVar11 = h4.g.f11905d;
                        r.J(eVar11, c10, qVar4);
                        if (str.length() > 0) {
                            qVar4.X(-1981239114);
                            aVar6 = aVar9;
                            tVar4 = tVar6;
                            f11 = x43;
                            str4 = str7;
                            dVar = dVar2;
                            qVar2 = qVar5;
                            eVar2 = eVar9;
                            i19 = i21;
                            eVar3 = eVar11;
                            eVar4 = eVar10;
                            fVar = fVar3;
                            aVar7 = aVar10;
                            f12 = f13;
                            eVar5 = eVar8;
                            echoTheme = echoTheme2;
                            eVar = eVar7;
                            j7.d(str, null, ExploreFilterChip$lambda$1(a11), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme2.getTypography(qVar4, i21).getBaseRegular500(qVar4, EchoThemeTypography.$stable), qVar4, i25, 24960, 110586);
                            qVar3 = qVar4;
                            z12 = false;
                            qVar3.p(false);
                        } else {
                            tVar4 = tVar6;
                            f11 = x43;
                            str4 = str7;
                            dVar = dVar2;
                            qVar2 = qVar5;
                            eVar = eVar7;
                            eVar2 = eVar9;
                            i19 = i21;
                            eVar3 = eVar11;
                            eVar4 = eVar10;
                            fVar = fVar3;
                            aVar6 = aVar9;
                            aVar7 = aVar10;
                            qVar3 = qVar4;
                            eVar5 = eVar8;
                            echoTheme = echoTheme2;
                            f12 = f13;
                            qVar3.X(-1981008164);
                            qVar3.p(z12);
                        }
                        if (num4 != null) {
                            qVar3.X(-1980915877);
                            i3.q qVar6 = qVar2;
                            r1.d.g(p2.s(qVar6, echoTheme.getSpacings(qVar3, i19).getX2()), qVar3);
                            aVar8 = aVar7;
                            if (aVar8 != null) {
                                qVar3.X(-1980556990);
                                i3.l lVar3 = i3.d.f13001e;
                                float f15 = f11;
                                t o6 = p2.o(qVar6, f15);
                                f1 d10 = p.d(lVar3, z12);
                                int hashCode2 = Long.hashCode(qVar3.T);
                                o l7 = qVar3.l();
                                t c11 = i3.a.c(o6, qVar3);
                                qVar3.b0();
                                if (qVar3.S) {
                                    fVar2 = fVar;
                                    qVar3.k(fVar2);
                                } else {
                                    fVar2 = fVar;
                                    qVar3.k0();
                                }
                                h4.e eVar12 = eVar5;
                                r.J(eVar12, d10, qVar3);
                                h4.e eVar13 = eVar2;
                                r.J(eVar13, l7, qVar3);
                                h4.e eVar14 = eVar4;
                                h4.d dVar3 = dVar;
                                defpackage.f.u(hashCode2, qVar3, eVar14, qVar3, dVar3);
                                h4.e eVar15 = eVar3;
                                r.J(eVar15, c11, qVar3);
                                t k4 = p2.k(qVar6, f12);
                                Object L5 = qVar3.L();
                                u2.e eVar16 = eVar;
                                if (L5 == eVar16) {
                                    L5 = j0.c.o(qVar3);
                                }
                                l lVar4 = (l) L5;
                                f5 a13 = e5.a(ExploreFilterChip$lambda$1(a11), 24, false);
                                k kVar2 = new k(0);
                                boolean z17 = (i18 & 3670016) == 1048576;
                                Object L6 = qVar3.L();
                                if (z17) {
                                    eVar6 = eVar16;
                                } else {
                                    eVar6 = eVar16;
                                    if (L6 != eVar6) {
                                        lVar = lVar4;
                                        t n2 = n.n(k4, lVar, a13, false, kVar2, (ho.a) L6, 12);
                                        z15 = (i18 & 29360128) != 8388608;
                                        L = qVar3.L();
                                        if (!z15 || L == eVar6) {
                                            str5 = str4;
                                            L = new am.c(str5, 19);
                                            qVar3.h0(L);
                                        } else {
                                            str5 = str4;
                                        }
                                        t c12 = p4.q.c(n2, false, (ho.l) L);
                                        f1 d11 = p.d(lVar3, false);
                                        int hashCode3 = Long.hashCode(qVar3.T);
                                        o l10 = qVar3.l();
                                        t c13 = i3.a.c(c12, qVar3);
                                        qVar3.b0();
                                        if (!qVar3.S) {
                                            qVar3.k(fVar2);
                                        } else {
                                            qVar3.k0();
                                        }
                                        r.J(eVar12, d11, qVar3);
                                        r.J(eVar13, l10, qVar3);
                                        defpackage.f.u(hashCode3, qVar3, eVar14, qVar3, dVar3);
                                        r.J(eVar15, c13, qVar3);
                                        y2.a(kd.a.M(num4.intValue(), qVar3, (i18 >> 12) & 14), null, p2.o(qVar6, f15), ExploreFilterChip$lambda$1(a11), qVar3, u3.c.$stable | 48, 0);
                                        z14 = false;
                                        z13 = true;
                                        p.n.t(qVar3, true, true, false);
                                    }
                                }
                                lVar = lVar4;
                                L6 = new fm.g(18, aVar8);
                                qVar3.h0(L6);
                                t n22 = n.n(k4, lVar, a13, false, kVar2, (ho.a) L6, 12);
                                if ((i18 & 29360128) != 8388608) {
                                }
                                L = qVar3.L();
                                if (z15) {
                                }
                                str5 = str4;
                                L = new am.c(str5, 19);
                                qVar3.h0(L);
                                t c122 = p4.q.c(n22, false, (ho.l) L);
                                f1 d112 = p.d(lVar3, false);
                                int hashCode32 = Long.hashCode(qVar3.T);
                                o l102 = qVar3.l();
                                t c132 = i3.a.c(c122, qVar3);
                                qVar3.b0();
                                if (!qVar3.S) {
                                }
                                r.J(eVar12, d112, qVar3);
                                r.J(eVar13, l102, qVar3);
                                defpackage.f.u(hashCode32, qVar3, eVar14, qVar3, dVar3);
                                r.J(eVar15, c132, qVar3);
                                y2.a(kd.a.M(num4.intValue(), qVar3, (i18 >> 12) & 14), null, p2.o(qVar6, f15), ExploreFilterChip$lambda$1(a11), qVar3, u3.c.$stable | 48, 0);
                                z14 = false;
                                z13 = true;
                                p.n.t(qVar3, true, true, false);
                            } else {
                                str5 = str4;
                                z13 = true;
                                qVar3.X(-1979157991);
                                y2.a(kd.a.M(num4.intValue(), qVar3, (i18 >> 12) & 14), null, p2.o(qVar6, f11), ExploreFilterChip$lambda$1(a11), qVar3, u3.c.$stable | 48, 0);
                                z14 = false;
                                qVar3.p(false);
                            }
                            qVar3.p(z14);
                        } else {
                            boolean z18 = z12;
                            aVar8 = aVar7;
                            str5 = str4;
                            z13 = true;
                            qVar3.X(-1978916036);
                            qVar3.p(z18);
                        }
                        qVar3.p(z13);
                        qVar = qVar3;
                        aVar4 = aVar8;
                        str3 = str5;
                        exploreFilterChipSize2 = exploreFilterChipSize3;
                        num3 = num4;
                        tVar3 = tVar4;
                        aVar5 = aVar6;
                    } else {
                        qVar4.R();
                        Integer num5 = num2;
                        qVar = qVar4;
                        num3 = num5;
                        exploreFilterChipSize2 = exploreFilterChipSize;
                        aVar4 = aVar2;
                        str3 = str2;
                        tVar3 = tVar2;
                        aVar5 = aVar3;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new a(str, z6, tVar3, exploreFilterChipSize2, num3, aVar5, aVar4, str3, i10, i11);
                        return;
                    }
                    return;
                }
                aVar3 = aVar;
                i16 = i11 & 64;
                if (i16 == 0) {
                }
                i17 = i11 & 128;
                if (i17 == 0) {
                }
                i18 = i12;
                if (!qVar4.O(i18 & 1, (i18 & 4793491) == 4793490)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            num2 = num;
            i15 = i11 & 32;
            if (i15 != 0) {
            }
            aVar3 = aVar;
            i16 = i11 & 64;
            if (i16 == 0) {
            }
            i17 = i11 & 128;
            if (i17 == 0) {
            }
            i18 = i12;
            if (!qVar4.O(i18 & 1, (i18 & 4793491) == 4793490)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        num2 = num;
        i15 = i11 & 32;
        if (i15 != 0) {
        }
        aVar3 = aVar;
        i16 = i11 & 64;
        if (i16 == 0) {
        }
        i17 = i11 & 128;
        if (i17 == 0) {
        }
        i18 = i12;
        if (!qVar4.O(i18 & 1, (i18 & 4793491) == 4793490)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final long ExploreFilterChip$lambda$0(s2 s2Var) {
        return ((x) s2Var.getValue()).f26440a;
    }

    private static final long ExploreFilterChip$lambda$1(s2 s2Var) {
        return ((x) s2Var.getValue()).f26440a;
    }

    public static final z ExploreFilterChip$lambda$2$1$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z ExploreFilterChip$lambda$3$0(String str, String str2, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        y.l(str2, b0Var);
        return z.f31622a;
    }

    public static final z ExploreFilterChip$lambda$4$0$1$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z ExploreFilterChip$lambda$4$0$2$0(String str, b0 b0Var) {
        b0Var.getClass();
        if (str == null) {
            str = "";
        }
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z ExploreFilterChip$lambda$5(String str, boolean z6, t tVar, ExploreFilterChipSize exploreFilterChipSize, Integer num, ho.a aVar, ho.a aVar2, String str2, int i10, int i11, m mVar, int i12) {
        ExploreFilterChip(str, z6, tVar, exploreFilterChipSize, num, aVar, aVar2, str2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreFilterChip_LongLabel(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1604559100);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreFilterChipKt.INSTANCE.getLambda$1758037098$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 24);
        }
    }

    public static final z Preview_ExploreFilterChip_LongLabel$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreFilterChip_LongLabel(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreFilterChip_MultiOption(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1903154554);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreFilterChipKt.INSTANCE.m1370getLambda$752273056$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 23);
        }
    }

    public static final z Preview_ExploreFilterChip_MultiOption$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreFilterChip_MultiOption(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreFilterChip_SelectedNoIcon(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-143278981);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreFilterChipKt.INSTANCE.getLambda$1015416533$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 22);
        }
    }

    public static final z Preview_ExploreFilterChip_SelectedNoIcon$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreFilterChip_SelectedNoIcon(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreFilterChip_SelectedWithIcon(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-863843840);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreFilterChipKt.INSTANCE.getLambda$246015450$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 21);
        }
    }

    public static final z Preview_ExploreFilterChip_SelectedWithIcon$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreFilterChip_SelectedWithIcon(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreFilterChip_Unselected(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2144197594);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreFilterChipKt.INSTANCE.m1371getLambda$989502668$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 20);
        }
    }

    public static final z Preview_ExploreFilterChip_Unselected$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreFilterChip_Unselected(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

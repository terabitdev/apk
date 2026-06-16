package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.readerapp.ui.components.explore.ExploreSectionHeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.PageSizeWithRatio;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aC\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u001e0\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0006H\u0007¢\u0006\u0004\b$\u0010#\u001a\u000f\u0010%\u001a\u00020\u0006H\u0007¢\u0006\u0004\b%\u0010#\u001a\u000f\u0010&\u001a\u00020\u0006H\u0007¢\u0006\u0004\b&\u0010#¨\u0006(²\u0006\u001e\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u001e8\nX\u008a\u0084\u0002"}, d2 = {"", "title", "", "Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection$Banner;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "Lsn/z;", "onItemClick", "Li3/t;", "modifier", "AnnouncementBannerCarousel", "(Ljava/lang/String;Ljava/util/List;Lho/l;Li3/t;Lu2/m;II)V", "Lp3/x;", "color", "contrastingTextColor-8_81llA", "(J)J", "contrastingTextColor", "item", "Lkotlin/Function0;", "onClick", "Banner", "(Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection$Banner;Lho/a;Li3/t;Lu2/m;II)V", "textColor", "BannerButton-sW7UJKQ", "(Ljava/lang/String;JLho/a;Li3/t;Lu2/m;II)V", "BannerButton", "url", "", "skipColorExtraction", "Lu2/s2;", "Lsn/k;", "Lp3/k0;", "rememberImageAndColor", "(Ljava/lang/String;ZLu2/m;I)Lu2/s2;", "Preview_AnnouncementBannerCarousel", "(Lu2/m;I)V", "Preview_AnnouncementBannerCarouselSectionBanner_WithButton", "Preview_AnnouncementBannerCarousel_Tablet", "Preview_AnnouncementBannerCarouselSectionBanner_WithoutButton", "result", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AnnouncementBannerCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnnouncementBannerCarousel(String str, List<AnnouncementBannerCarouselSection.Banner> list, ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        r1 r10;
        int i14;
        int i15;
        int i16;
        str.getClass();
        list.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-816878904);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(list)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
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
                if (i17 != 0) {
                    tVar2 = qVar2;
                }
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i18 = EchoTheme.$stable;
                float x52 = echoTheme.getSpacings(qVar, i18).getX5();
                float m1979rememberDpToPx8Feqmps = ComposeExtensionsKt.m1979rememberDpToPx8Feqmps(500, qVar, 6);
                boolean c5 = qVar.c(m1979rememberDpToPx8Feqmps);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (c5 || L == eVar) {
                    L = new PageSizeWithRatio(1.0f, Integer.valueOf((int) m1979rememberDpToPx8Feqmps));
                    qVar.h0(L);
                }
                PageSizeWithRatio pageSizeWithRatio = (PageSizeWithRatio) L;
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c10 = i3.a.c(tVar2, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                int i19 = i12;
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, a10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c10, qVar);
                ExploreSectionHeaderKt.ExploreSectionHeader(str, null, null, null, qVar, i19 & 14, 14);
                ib.i.o(echoTheme, qVar, i18, qVar2, qVar);
                boolean h10 = qVar.h(list);
                Object L2 = qVar.L();
                if (h10 || L2 == eVar) {
                    L2 = new e(list, 0);
                    qVar.h0(L2);
                }
                gg.b.d(w1.h0.b(0, (ho.a) L2, qVar, 0, 3), p2.e(qVar2, 1.0f), r1.d.d(x52, t2.u.P, 2), pageSizeWithRatio, 0, echoTheme.getSpacings(qVar, i18).getX3(), i3.d.f13004y0, null, false, null, null, null, c3.k.d(-1641570049, true, new f(list, lVar, 0), qVar), qVar, 1572912, 24576, 16272);
                qVar = qVar;
                qVar.p(true);
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.i(i10, i11, 2, lVar, tVar2, str, list);
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

    public static final sn.z AnnouncementBannerCarousel$lambda$1$1(List list, ho.l lVar, w1.w wVar, int i10, u2.m mVar, int i11) {
        wVar.getClass();
        AnnouncementBannerCarouselSection.Banner banner = (AnnouncementBannerCarouselSection.Banner) list.get(i10);
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(lVar) | qVar.h(banner);
        Object L = qVar.L();
        if (f10 || L == u2.l.f33918a) {
            L = new y0(lVar, banner, 1);
            qVar.h0(L);
        }
        Banner(banner, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), qVar, 384, 0);
        return sn.z.f31622a;
    }

    public static final sn.z AnnouncementBannerCarousel$lambda$1$1$0$0(ho.l lVar, AnnouncementBannerCarouselSection.Banner banner) {
        lVar.invoke(banner);
        return sn.z.f31622a;
    }

    public static final sn.z AnnouncementBannerCarousel$lambda$2(String str, List list, ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        AnnouncementBannerCarousel(str, list, lVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Banner(AnnouncementBannerCarouselSection.Banner banner, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        AnnouncementBannerCarouselSection.Banner banner2;
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        boolean z10;
        p3.x xVar;
        boolean z11;
        sn.k Banner$lambda$1$1;
        p3.k0 k0Var;
        sn.k Banner$lambda$1$12;
        long j4;
        h4.e eVar;
        i3.j jVar;
        h4.f fVar;
        long j10;
        h4.e eVar2;
        long j11;
        String headerText;
        boolean z12;
        r1.e eVar3;
        long j12;
        h4.d dVar;
        i3.j jVar2;
        h4.e eVar4;
        h4.e eVar5;
        int i14;
        h4.e eVar6;
        EchoTheme echoTheme;
        u2.q qVar;
        int i15;
        r1.e eVar7;
        i3.q qVar2;
        int i16;
        h4.d dVar2;
        int i17;
        int i18;
        i3.j jVar3 = i3.d.B0;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(1477031233);
        if ((i10 & 6) == 0) {
            banner2 = banner;
            if (qVar3.h(banner2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            banner2 = banner;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(aVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar3.O(i12 & 1, z6)) {
                i3.q qVar4 = i3.q.f13017a;
                if (i19 != 0) {
                    tVar2 = qVar4;
                }
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i20 = EchoTheme.$stable;
                z1.g b10 = z1.h.b(echoTheme2.getSpacings(qVar3, i20).getX5());
                int i21 = i12;
                i3.t boxShadow = BoxShadowKt.boxShadow(tVar2, ElevenLabsTheme.INSTANCE.getShadows(qVar3, ElevenLabsTheme.$stable).getLg(), b10, false, qVar3, (i12 >> 6) & 14, 4);
                i3.t tVar4 = tVar2;
                qVar3 = qVar3;
                i3.t c5 = m3.h.c(boxShadow, b10);
                if ((i21 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar3.L();
                if (z10 || L == u2.l.f33918a) {
                    L = new fm.g(7, aVar);
                    qVar3.h0(L);
                }
                i3.t h10 = l1.n.h(l1.n.p(c5, false, null, null, null, (ho.a) L, 15), echoTheme2.getColors(qVar3, i20).getBackground().getPrimary(qVar3, EchoThemeColors.Background.$stable), b10);
                r1.x a10 = r1.w.a(r1.j.f29230c, jVar3, qVar3, 0);
                int hashCode = Long.hashCode(qVar3.T);
                c3.o l4 = qVar3.l();
                i3.t c10 = i3.a.c(h10, qVar3);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar2);
                } else {
                    qVar3.k0();
                }
                u2.r.J(h4.g.f11907f, a10, qVar3);
                u2.r.J(h4.g.f11906e, l4, qVar3);
                u2.r.y(qVar3, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar3);
                u2.r.J(h4.g.f11905d, c10, qVar3);
                String colorHex = banner2.getColorHex();
                p3.x xVar2 = null;
                if (colorHex != null) {
                    try {
                        xVar = new p3.x(p3.h0.c(Color.parseColor(Separators.POUND.concat(colorHex))));
                    } catch (IllegalArgumentException unused) {
                    }
                    if (xVar == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s2 rememberImageAndColor = rememberImageAndColor(banner2.getImageUrl(), z11, qVar3, 0);
                    Banner$lambda$1$1 = Banner$lambda$1$1(rememberImageAndColor);
                    if (Banner$lambda$1$1 == null) {
                        k0Var = (p3.k0) Banner$lambda$1$1.f31600a;
                    } else {
                        k0Var = null;
                    }
                    Banner$lambda$1$12 = Banner$lambda$1$1(rememberImageAndColor);
                    if (Banner$lambda$1$12 != null) {
                        xVar2 = (p3.x) Banner$lambda$1$12.f31601b;
                    }
                    if (xVar == null) {
                        j4 = xVar.f26440a;
                    } else if (xVar2 != null) {
                        j4 = xVar2.f26440a;
                    } else {
                        j4 = p3.x.f26427b;
                    }
                    long m1023contrastingTextColor8_81llA = m1023contrastingTextColor8_81llA(j4);
                    i3.t j13 = r1.d.j(p2.e(qVar4, 1.0f), 1.875f, false);
                    i3.l lVar = i3.d.f12997a;
                    f4.f1 d10 = r1.p.d(lVar, false);
                    int hashCode2 = Long.hashCode(qVar3.T);
                    c3.o l7 = qVar3.l();
                    i3.t c11 = i3.a.c(j13, qVar3);
                    h4.h.f11920i.getClass();
                    long j14 = j4;
                    h4.f fVar3 = h4.g.f11903b;
                    qVar3.b0();
                    if (!qVar3.S) {
                        qVar3.k(fVar3);
                    } else {
                        qVar3.k0();
                    }
                    h4.e eVar8 = h4.g.f11907f;
                    u2.r.J(eVar8, d10, qVar3);
                    h4.e eVar9 = h4.g.f11906e;
                    u2.r.J(eVar9, l7, qVar3);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    h4.e eVar10 = h4.g.f11908g;
                    u2.r.y(qVar3, valueOf, eVar10);
                    h4.d dVar3 = h4.g.f11909h;
                    u2.r.F(dVar3, qVar3);
                    h4.e eVar11 = h4.g.f11905d;
                    u2.r.J(eVar11, c11, qVar3);
                    if (k0Var != null) {
                        qVar3.X(-1575556636);
                        qVar3.p(false);
                        jVar = jVar3;
                        eVar = eVar11;
                        eVar2 = eVar8;
                        j11 = m1023contrastingTextColor8_81llA;
                        fVar = fVar3;
                        j10 = j14;
                    } else {
                        qVar3.X(-1575556635);
                        eVar = eVar11;
                        jVar = jVar3;
                        fVar = fVar3;
                        j10 = j14;
                        eVar2 = eVar8;
                        j11 = m1023contrastingTextColor8_81llA;
                        l1.n.d(k0Var, null, p2.d(qVar4, 1.0f), qVar3, 25008, 232);
                        qVar3.p(false);
                    }
                    qVar3.p(true);
                    headerText = banner.getHeaderText();
                    if (headerText == null) {
                        qVar3.X(-641046170);
                        i3.t I = r1.d.I(r1.d.G(l1.n.h(p2.e(qVar4, 1.0f), j10, p3.h0.f26395b), 16, t2.u.P, 2), t2.u.P, 14, t2.u.P, 20, 5);
                        f4.f1 d11 = r1.p.d(lVar, false);
                        int hashCode3 = Long.hashCode(qVar3.T);
                        c3.o l10 = qVar3.l();
                        i3.t c12 = i3.a.c(I, qVar3);
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        u2.r.J(eVar2, d11, qVar3);
                        u2.r.J(eVar9, l10, qVar3);
                        defpackage.f.u(hashCode3, qVar3, eVar10, qVar3, dVar3);
                        h4.e eVar12 = eVar;
                        u2.r.J(eVar12, c12, qVar3);
                        i3.t e10 = p2.e(qVar4, 1.0f);
                        k2 a11 = i2.a(r1.j.g(12), i3.d.f13004y0, qVar3, 6);
                        int hashCode4 = Long.hashCode(qVar3.T);
                        c3.o l11 = qVar3.l();
                        i3.t c13 = i3.a.c(e10, qVar3);
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        u2.r.J(eVar2, a11, qVar3);
                        u2.r.J(eVar9, l11, qVar3);
                        defpackage.f.u(hashCode4, qVar3, eVar10, qVar3, dVar3);
                        u2.r.J(eVar12, c13, qVar3);
                        if (1.0f <= 0.0d) {
                            s1.a.a("invalid weight; must be greater than zero");
                        }
                        m1 m1Var = new m1(1.0f, true);
                        r1.e eVar13 = r1.j.f29230c;
                        i3.j jVar4 = jVar;
                        r1.x a12 = r1.w.a(eVar13, jVar4, qVar3, 0);
                        int hashCode5 = Long.hashCode(qVar3.T);
                        c3.o l12 = qVar3.l();
                        i3.t c14 = i3.a.c(m1Var, qVar3);
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        u2.r.J(eVar2, a12, qVar3);
                        u2.r.J(eVar9, l12, qVar3);
                        defpackage.f.u(hashCode5, qVar3, eVar10, qVar3, dVar3);
                        u2.r.J(eVar12, c14, qVar3);
                        String eyebrowText = banner.getEyebrowText();
                        if (eyebrowText == null) {
                            qVar3.X(2063565803);
                            qVar3.p(false);
                            dVar = dVar3;
                            eVar3 = eVar13;
                            j12 = j11;
                            jVar2 = jVar4;
                        } else {
                            qVar3.X(2063565804);
                            i3.t e11 = p2.e(qVar4, 1.0f);
                            EchoTheme echoTheme3 = EchoTheme.INSTANCE;
                            int i22 = EchoTheme.$stable;
                            eVar3 = eVar13;
                            j12 = j11;
                            dVar = dVar3;
                            jVar2 = jVar4;
                            j7.d(eyebrowText, e11, p3.x.b(0.75f, j12), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme3.getTypography(qVar3, i22).getSmRegular500(qVar3, EchoThemeTypography.$stable), qVar3, 48, 24960, 110584);
                            qVar3 = qVar3;
                            r1.d.g(p2.f(qVar4, echoTheme3.getSpacings(qVar3, i22).getX2()), qVar3);
                            qVar3.p(false);
                        }
                        EchoTheme echoTheme4 = EchoTheme.INSTANCE;
                        int i23 = EchoTheme.$stable;
                        EchoThemeTypography typography = echoTheme4.getTypography(qVar3, i23);
                        int i24 = EchoThemeTypography.$stable;
                        u2.q qVar5 = qVar3;
                        long j15 = j12;
                        j7.d(headerText, null, j15, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, typography.getBaseRegular500(qVar3, i24), qVar5, 0, 24960, 110586);
                        qVar5.p(true);
                        String buttonText = banner.getButtonText();
                        if (buttonText == null) {
                            qVar5.X(35121238);
                            qVar5.p(false);
                            i14 = i23;
                            eVar6 = eVar12;
                            i15 = i24;
                            echoTheme = echoTheme4;
                            qVar2 = qVar4;
                            eVar4 = eVar9;
                            z12 = true;
                            i16 = 0;
                            qVar = qVar5;
                            eVar7 = eVar3;
                            dVar2 = dVar;
                            eVar5 = eVar10;
                        } else {
                            qVar5.X(35121239);
                            eVar4 = eVar9;
                            eVar5 = eVar10;
                            i14 = i23;
                            eVar6 = eVar12;
                            echoTheme = echoTheme4;
                            qVar = qVar5;
                            i15 = i24;
                            eVar7 = eVar3;
                            qVar2 = qVar4;
                            i16 = 0;
                            dVar2 = dVar;
                            m1022BannerButtonsW7UJKQ(buttonText, j15, aVar, null, qVar, (i21 << 3) & 896, 8);
                            qVar.p(false);
                            z12 = true;
                        }
                        qVar.p(z12);
                        r1.x a13 = r1.w.a(eVar7, jVar2, qVar, i16);
                        int hashCode6 = Long.hashCode(qVar.T);
                        c3.o l13 = qVar.l();
                        i3.t c15 = i3.a.c(qVar2, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(eVar2, a13, qVar);
                        u2.r.J(eVar4, l13, qVar);
                        defpackage.f.u(hashCode6, qVar, eVar5, qVar, dVar2);
                        u2.r.J(eVar6, c15, qVar);
                        EchoTheme echoTheme5 = echoTheme;
                        int i25 = i14;
                        int i26 = i15;
                        u2.q qVar6 = qVar;
                        j7.d("", null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 1, null, echoTheme5.getTypography(qVar, i25).getSmRegular500(qVar, i26), qVar6, 6, 221184, 81918);
                        r1.d.g(p2.f(qVar2, echoTheme5.getSpacings(qVar6, i25).getX1()), qVar6);
                        j7.d("", null, 0L, 0L, null, 0L, null, 0L, 0, false, 2, 2, null, echoTheme5.getTypography(qVar6, i25).getBaseRegular500(qVar6, i26), qVar6, 6, 221184, 81918);
                        qVar3 = qVar6;
                        p.n.t(qVar3, z12, z12, i16);
                    } else {
                        z12 = true;
                        qVar3.X(-638661929);
                        qVar3.p(false);
                    }
                    qVar3.p(z12);
                    tVar3 = tVar4;
                }
                xVar = null;
                if (xVar == null) {
                }
                s2 rememberImageAndColor2 = rememberImageAndColor(banner2.getImageUrl(), z11, qVar3, 0);
                Banner$lambda$1$1 = Banner$lambda$1$1(rememberImageAndColor2);
                if (Banner$lambda$1$1 == null) {
                }
                Banner$lambda$1$12 = Banner$lambda$1$1(rememberImageAndColor2);
                if (Banner$lambda$1$12 != null) {
                }
                if (xVar == null) {
                }
                long m1023contrastingTextColor8_81llA2 = m1023contrastingTextColor8_81llA(j4);
                i3.t j132 = r1.d.j(p2.e(qVar4, 1.0f), 1.875f, false);
                i3.l lVar2 = i3.d.f12997a;
                f4.f1 d102 = r1.p.d(lVar2, false);
                int hashCode22 = Long.hashCode(qVar3.T);
                c3.o l72 = qVar3.l();
                i3.t c112 = i3.a.c(j132, qVar3);
                h4.h.f11920i.getClass();
                long j142 = j4;
                h4.f fVar32 = h4.g.f11903b;
                qVar3.b0();
                if (!qVar3.S) {
                }
                h4.e eVar82 = h4.g.f11907f;
                u2.r.J(eVar82, d102, qVar3);
                h4.e eVar92 = h4.g.f11906e;
                u2.r.J(eVar92, l72, qVar3);
                Integer valueOf2 = Integer.valueOf(hashCode22);
                h4.e eVar102 = h4.g.f11908g;
                u2.r.y(qVar3, valueOf2, eVar102);
                h4.d dVar32 = h4.g.f11909h;
                u2.r.F(dVar32, qVar3);
                h4.e eVar112 = h4.g.f11905d;
                u2.r.J(eVar112, c112, qVar3);
                if (k0Var != null) {
                }
                qVar3.p(true);
                headerText = banner.getHeaderText();
                if (headerText == null) {
                }
                qVar3.p(z12);
                tVar3 = tVar4;
            } else {
                qVar3.R();
                tVar3 = tVar2;
            }
            r10 = qVar3.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(banner, aVar, tVar3, i10, i11, 8);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar3.r();
        if (r10 == null) {
        }
    }

    public static final sn.z Banner$lambda$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    private static final sn.k Banner$lambda$1$1(s2 s2Var) {
        return (sn.k) s2Var.getValue();
    }

    public static final sn.z Banner$lambda$2(AnnouncementBannerCarouselSection.Banner banner, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        Banner(banner, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0069  */
    /* renamed from: BannerButton-sW7UJKQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1022BannerButtonsW7UJKQ(String str, long j4, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        boolean z10;
        int i14;
        int i15;
        int i16;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-2043266601);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.e(j4)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
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
            if (!qVar2.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                i3.t h10 = l1.n.h(m3.h.c(tVar4, z1.h.b(999)), p3.x.b(0.1f, j4), p3.h0.f26395b);
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar2.L();
                if (z10 || L == u2.l.f33918a) {
                    L = new fm.g(8, aVar);
                    qVar2.h0(L);
                }
                i3.t p10 = l1.n.p(h10, false, null, null, null, (ho.a) L, 15);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i18 = EchoTheme.$stable;
                i3.t F = r1.d.F(p10, echoTheme.getSpacings(qVar2, i18).getX3(), 6);
                f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(F, qVar2);
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
                u2.r.J(h4.g.f11905d, c5, qVar2);
                j7.d(str, null, j4, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar2, i18).getSmCompact600(qVar2, EchoThemeTypography.$stable), qVar2, (i12 & 14) | ((i12 << 3) & 896), 24960, 110586);
                qVar = qVar2;
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new d(str, j4, aVar, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z BannerButton_sW7UJKQ$lambda$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z BannerButton_sW7UJKQ$lambda$2(String str, long j4, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        m1022BannerButtonsW7UJKQ(str, j4, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_AnnouncementBannerCarousel(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-715261772);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AnnouncementBannerCarouselKt.INSTANCE.m1029getLambda$1396625766$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 24);
        }
    }

    public static final sn.z Preview_AnnouncementBannerCarousel$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AnnouncementBannerCarousel(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AnnouncementBannerCarouselSectionBanner_WithButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(915241102);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AnnouncementBannerCarouselKt.INSTANCE.m1030getLambda$1740186508$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 21);
        }
    }

    public static final sn.z Preview_AnnouncementBannerCarouselSectionBanner_WithButton$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AnnouncementBannerCarouselSectionBanner_WithButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AnnouncementBannerCarouselSectionBanner_WithoutButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(311258520);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AnnouncementBannerCarouselKt.INSTANCE.getLambda$1469954034$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 22);
        }
    }

    public static final sn.z Preview_AnnouncementBannerCarouselSectionBanner_WithoutButton$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AnnouncementBannerCarouselSectionBanner_WithoutButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AnnouncementBannerCarousel_Tablet(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-617422369);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AnnouncementBannerCarouselKt.INSTANCE.getLambda$1896373561$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 23);
        }
    }

    public static final sn.z Preview_AnnouncementBannerCarousel_Tablet$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AnnouncementBannerCarousel_Tablet(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final /* synthetic */ void access$Banner(AnnouncementBannerCarouselSection.Banner banner, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        Banner(banner, aVar, tVar, mVar, i10, i11);
    }

    /* renamed from: contrastingTextColor-8_81llA */
    private static final long m1023contrastingTextColor8_81llA(long j4) {
        if (p3.h0.w(j4) > 0.5f) {
            int i10 = p3.x.f26439n;
            return p3.x.f26427b;
        }
        int i11 = p3.x.f26439n;
        return p3.x.f26431f;
    }

    private static final s2 rememberImageAndColor(String str, boolean z6, u2.m mVar, int i10) {
        boolean z10;
        u2.q qVar = (u2.q) mVar;
        Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
        Boolean valueOf = Boolean.valueOf(z6);
        boolean z11 = false;
        if ((((i10 & 14) ^ 6) > 4 && qVar.f(str)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean h10 = z10 | qVar.h(context);
        if ((((i10 & 112) ^ 48) > 32 && qVar.g(z6)) || (i10 & 48) == 32) {
            z11 = true;
        }
        boolean z12 = h10 | z11;
        Object L = qVar.L();
        if (z12 || L == u2.l.f33918a) {
            L = new AnnouncementBannerCarouselKt$rememberImageAndColor$1$1(str, context, z6, null);
            qVar.h0(L);
        }
        int i11 = i10 << 3;
        return u2.r.D(null, str, valueOf, (ho.p) L, qVar, (i11 & 112) | 6 | (i11 & 896));
    }
}

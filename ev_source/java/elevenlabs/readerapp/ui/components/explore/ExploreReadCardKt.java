package io.elevenlabs.readerapp.ui.components.explore;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import i3.t;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.readerapp.ui.components.ReadPricingRowKt;
import io.elevenlabs.readerapp.ui.components.ReadPricingUltraRowStyle;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.MoneyPriceFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.RateFormatterKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.x;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.s;
import r1.u0;
import r1.w;
import s4.y0;
import sn.z;
import t2.u;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u000f\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0013\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0013\u001a\u000f\u0010\u001a\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u0013\u001a\u000f\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u0013\u001a\u000f\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u0013\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u0013\u001a\u000f\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u0013\u001a\u000f\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010\u0013\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lio/elevenlabs/domain/model/ExploreRead;", "read", "Lkotlin/Function0;", "Lsn/z;", "onCardClick", "Li3/t;", "modifier", "Lkotlin/Function1;", "onPreviewClick", "", "playingPreviewReadId", "ExploreReadCard", "(Lio/elevenlabs/domain/model/ExploreRead;Lho/a;Li3/t;Lho/l;Ljava/lang/String;Lu2/m;II)V", "Lp3/x;", "textColor", "ExploreReadPriceRow-FNF3uiM", "(Lio/elevenlabs/domain/model/ExploreRead;Li3/t;JLu2/m;II)V", "ExploreReadPriceRow", "Preview_ExploreReadCard_WithImage", "(Lu2/m;I)V", "Preview_ExploreReadCard_NoImage", "Preview_ExploreReadCard_Paid", "Preview_ExploreReadCard_Ultra", "Preview_ExploreReadCard_Paid_Loading", "Preview_ExploreReadCard_Ultra_Loading", "Preview_ExploreReadCard_Paid_FullLayout", "Preview_ExploreReadCard_Ultra_FullLayout", "Preview_ExploreReadCard_Ultra_Included", "Preview_ExploreReadCard_Paid_AED", "Preview_ExploreReadCard_Ultra_AED", "Preview_ExploreReadCard_NoStats", "Preview_ExploreReadCard_LongText", "Lh5/f;", "STAT_ICON_SIZE", TokenNames.F, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreReadCardKt {
    private static final float STAT_ICON_SIZE = 16;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreReadCard(ExploreRead exploreRead, ho.a aVar, t tVar, ho.l lVar, String str, u2.m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        ho.l lVar2;
        int i15;
        int i16;
        String str2;
        int i17;
        boolean z6;
        u2.q qVar;
        t tVar3;
        ho.l lVar3;
        String str3;
        r1 r10;
        ho.l lVar4;
        int i18;
        int i19;
        exploreRead.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-232793122);
        if ((i10 & 6) == 0) {
            if (qVar2.h(exploreRead)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        int i20 = i11 & 4;
        if (i20 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                lVar2 = lVar;
                if (qVar2.h(lVar2)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    str2 = str;
                    if (qVar2.f(str2)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    if ((i12 & 9363) == 9362) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i12 & 1, z6)) {
                        if (i20 != 0) {
                            tVar3 = i3.q.f13017a;
                        } else {
                            tVar3 = tVar2;
                        }
                        String str4 = null;
                        if (i14 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if (i16 == 0) {
                            str4 = str2;
                        }
                        qVar = qVar2;
                        ButtonContainerKt.m1780ButtonContainer83mGB3Q(tn.o.E0(tn.n.F0(new String[]{exploreRead.getTitle(), exploreRead.getAuthor()}), ", ", null, null, null, 62), aVar, m3.h.c(p2.f(p2.s(tVar3, 324), SensibleDefaults.X_OFFSET), EchoTheme.INSTANCE.getShapes(qVar2, EchoTheme.$stable).getSm(qVar2, EchoThemeShapes.$stable)), 0L, false, 0, null, false, null, c3.k.d(-471342982, true, new fm.o(exploreRead, lVar4, str4, 2), qVar2), qVar, (i12 & 112) | 805306368, 504);
                        ho.l lVar5 = lVar4;
                        str3 = str4;
                        lVar3 = lVar5;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        tVar3 = tVar2;
                        lVar3 = lVar2;
                        str3 = str2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new p(exploreRead, aVar, tVar3, lVar3, str3, i10, i11, 0);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((i12 & 9363) == 9362) {
                }
                if (!qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar2 = lVar;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            str2 = str;
            if ((i12 & 9363) == 9362) {
            }
            if (!qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        lVar2 = lVar;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        str2 = str;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ExploreReadCard$lambda$0(ExploreRead exploreRead, ho.l lVar, String str, s sVar, u2.m mVar, int i10) {
        boolean z6;
        float f10;
        String str2;
        boolean z10;
        ho.a aVar;
        ho.a aVar2;
        boolean z11;
        int i11;
        boolean z12;
        h4.e eVar;
        h4.e eVar2;
        h4.e eVar3;
        h4.d dVar;
        i3.k kVar;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        float f11;
        int i14;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            k2 a10 = i2.a(ib.i.y(echoTheme, qVar, i15), i3.d.f13004y0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar4 = h4.g.f11907f;
            r.J(eVar4, a10, qVar);
            h4.e eVar5 = h4.g.f11906e;
            r.J(eVar5, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar6 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar6);
            h4.d dVar2 = h4.g.f11909h;
            r.F(dVar2, qVar);
            h4.e eVar7 = h4.g.f11905d;
            r.J(eVar7, c5, qVar);
            long j4 = x.f26437l;
            String coverImageUrl = ExploreKt.coverImageUrl(exploreRead, CoverImageSize.Medium);
            BookCoverSize bookCoverSize = BookCoverSize.Medium;
            float f12 = SensibleDefaults.X_OFFSET;
            String title = exploreRead.getTitle();
            String str3 = null;
            if (lVar == null) {
                qVar.X(1843541543);
                qVar.p(false);
                f10 = f12;
                str2 = coverImageUrl;
                aVar2 = null;
            } else {
                f10 = f12;
                qVar.X(1843541544);
                if (exploreRead.getPreviewAudioUrl() == null) {
                    qVar.X(-901423190);
                    qVar.p(false);
                    str2 = coverImageUrl;
                    aVar = null;
                    z10 = false;
                } else {
                    qVar.X(-901423189);
                    boolean f13 = qVar.f(lVar) | qVar.h(exploreRead);
                    Object L = qVar.L();
                    if (!f13) {
                        str2 = coverImageUrl;
                        if (L != u2.l.f33918a) {
                            z10 = false;
                            aVar = (ho.a) L;
                            qVar.p(z10);
                        }
                    } else {
                        str2 = coverImageUrl;
                    }
                    z10 = false;
                    L = new o(lVar, exploreRead, 0);
                    qVar.h0(L);
                    aVar = (ho.a) L;
                    qVar.p(z10);
                }
                qVar.p(z10);
                aVar2 = aVar;
            }
            ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(str2, bookCoverSize, null, f10, false, true, j4, j4, title, null, aVar2, kotlin.jvm.internal.m.c(str, exploreRead.getReadId()), exploreRead.getBlurPlaceholder(), exploreRead.getCoverAspectRatio(), false, null, qVar, 14355504, 0, 49684);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            t G = r1.d.G(p2.c(new m1(1.0f, true), 1.0f), u.P, 22, 1);
            r1.f fVar2 = r1.j.f29234g;
            i3.j jVar = i3.d.B0;
            r1.x a11 = w.a(fVar2, jVar, qVar, 6);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(G, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar4, a11, qVar);
            r.J(eVar5, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar6, qVar, dVar2);
            r.J(eVar7, c10, qVar);
            r1.x a12 = w.a(ib.i.m(echoTheme, qVar, i15), jVar, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            t c11 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar4, a12, qVar);
            r.J(eVar5, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar6, qVar, dVar2);
            r.J(eVar7, c11, qVar);
            r1.x a13 = w.a(r1.j.f29230c, jVar, qVar, 0);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            t c12 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar4, a13, qVar);
            r.J(eVar5, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar6, qVar, dVar2);
            r.J(eVar7, c12, qVar);
            String title2 = exploreRead.getTitle();
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i15);
            int i16 = EchoThemeTypography.$stable;
            y0 baseRegular500 = typography.getBaseRegular500(qVar, i16);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i15).getText();
            int i17 = EchoThemeColors.Text.$stable;
            j7.d(title2, null, text.getPrimary(qVar, i17), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, baseRegular500, qVar, 0, 24960, 110586);
            String author = exploreRead.getAuthor();
            if (author == null) {
                author = "";
            }
            j7.d(author, null, ib.i.b(i15, i17, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar, i15).getSmCompact400(qVar, i16), qVar, 0, 24960, 110586);
            u2.q qVar3 = qVar;
            qVar3.p(true);
            if (exploreRead.getAudioDurationSeconds() != null) {
                qVar3.X(-560127837);
                z11 = false;
                str3 = MinutesFormatterKt.formatSecondsAsDuration(r8.floatValue(), qVar3, 0);
            } else {
                z11 = false;
                qVar3.X(-184063661);
            }
            qVar3.p(z11);
            String str4 = str3;
            if (str4 != null) {
                qVar3.X(-183981479);
                j7.d(str4, null, ib.i.B(i15, i17, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar3, i15).getSmCompact400(qVar3, i16), qVar3, 0, 24960, 110586);
                qVar3 = qVar3;
                i11 = 0;
                qVar3.p(false);
            } else {
                i11 = 0;
                qVar3.X(-183653096);
                qVar3.p(false);
            }
            qVar3.p(true);
            r1.x a14 = w.a(r1.j.g(echoTheme.getSpacings(qVar3, i15).getX2()), jVar, qVar3, i11);
            int hashCode5 = Long.hashCode(qVar3.T);
            c3.o l12 = qVar3.l();
            t c13 = i3.a.c(qVar2, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar4, a14, qVar3);
            r.J(eVar5, l12, qVar3);
            defpackage.f.u(hashCode5, qVar3, eVar6, qVar3, dVar2);
            r.J(eVar7, c13, qVar3);
            if (exploreRead.getAverageRating() != null && exploreRead.getTotalRatingCount() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            Integer addedToLibraryCount = exploreRead.getAddedToLibraryCount();
            if (!z12 && addedToLibraryCount == null) {
                qVar3.X(-767667921);
                qVar3.p(false);
                i12 = i17;
                z14 = true;
            } else {
                qVar3.X(-770850753);
                r1.h g10 = r1.j.g(echoTheme.getSpacings(qVar3, i15).getX1());
                i3.k kVar2 = i3.d.f13005z0;
                k2 a15 = i2.a(g10, kVar2, qVar3, 48);
                int hashCode6 = Long.hashCode(qVar3.T);
                c3.o l13 = qVar3.l();
                t c14 = i3.a.c(qVar2, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar);
                } else {
                    qVar3.k0();
                }
                r.J(eVar4, a15, qVar3);
                r.J(eVar5, l13, qVar3);
                defpackage.f.u(hashCode6, qVar3, eVar6, qVar3, dVar2);
                r.J(eVar7, c14, qVar3);
                if (z12) {
                    qVar3.X(-618732652);
                    k2 a16 = i2.a(r1.j.g(echoTheme.getSpacings(qVar3, i15).getX1_5()), kVar2, qVar3, 48);
                    int hashCode7 = Long.hashCode(qVar3.T);
                    c3.o l14 = qVar3.l();
                    t c15 = i3.a.c(qVar2, qVar3);
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    r.J(eVar4, a16, qVar3);
                    r.J(eVar5, l14, qVar3);
                    defpackage.f.u(hashCode7, qVar3, eVar6, qVar3, dVar2);
                    r.J(eVar7, c15, qVar3);
                    eVar2 = eVar7;
                    dVar = dVar2;
                    eVar3 = eVar6;
                    kVar = kVar2;
                    y2.a(kd.a.M(R.drawable.star, qVar3, 0), null, p2.o(qVar2, STAT_ICON_SIZE), echoTheme.getColors(qVar3, i15).getIcon().getQuaternary(qVar3, EchoThemeColors.Icon.$stable), qVar3, u3.c.$stable | 432, 0);
                    Float averageRating = exploreRead.getAverageRating();
                    if (averageRating != null) {
                        f11 = averageRating.floatValue();
                    } else {
                        f11 = 0.0f;
                    }
                    String formatRatingScore = RateFormatterKt.formatRatingScore(f11);
                    Integer totalRatingCount = exploreRead.getTotalRatingCount();
                    if (totalRatingCount != null) {
                        i14 = totalRatingCount.intValue();
                    } else {
                        i14 = 0;
                    }
                    u2.q qVar4 = qVar3;
                    eVar = eVar5;
                    i12 = i17;
                    i13 = i16;
                    j7.d(formatRatingScore + " (" + i14 + Separators.RPAREN, null, ib.i.b(i15, i17, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar3, i15).getSmCompact400(qVar3, i16), qVar4, 0, 24960, 110586);
                    qVar3 = qVar4;
                    qVar3.p(true);
                    qVar3.p(false);
                } else {
                    eVar = eVar5;
                    eVar2 = eVar7;
                    eVar3 = eVar6;
                    dVar = dVar2;
                    kVar = kVar2;
                    i12 = i17;
                    i13 = i16;
                    qVar3.X(-617539090);
                    qVar3.p(false);
                }
                if (z12 && addedToLibraryCount != null) {
                    qVar3.X(-617425661);
                    u2.q qVar5 = qVar3;
                    j7.d("·", null, ib.i.b(i15, i12, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar3, i15).getSmCompact400(qVar3, i13), qVar5, 6, 24960, 110586);
                    qVar3 = qVar5;
                    qVar3.p(false);
                } else {
                    qVar3.X(-617047058);
                    qVar3.p(false);
                }
                if (addedToLibraryCount != null) {
                    qVar3.X(-616954430);
                    k2 a17 = i2.a(r1.j.g(echoTheme.getSpacings(qVar3, i15).getX1_5()), kVar, qVar3, 48);
                    int hashCode8 = Long.hashCode(qVar3.T);
                    c3.o l15 = qVar3.l();
                    t c16 = i3.a.c(qVar2, qVar3);
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    r.J(eVar4, a17, qVar3);
                    r.J(eVar, l15, qVar3);
                    defpackage.f.u(hashCode8, qVar3, eVar3, qVar3, dVar);
                    r.J(eVar2, c16, qVar3);
                    y2.a(kd.a.M(R.drawable.play_round, qVar3, 0), null, p2.o(qVar2, STAT_ICON_SIZE), echoTheme.getColors(qVar3, i15).getIcon().getQuaternary(qVar3, EchoThemeColors.Icon.$stable), qVar3, u3.c.$stable | 432, 0);
                    u2.q qVar6 = qVar3;
                    j7.d(ExploreReadFormattingKt.formatShortCount(addedToLibraryCount.intValue()), null, ib.i.b(i15, i12, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar3, i15).getSmCompact400(qVar3, i13), qVar6, 0, 24960, 110586);
                    qVar3 = qVar6;
                    z14 = true;
                    qVar3.p(true);
                    z13 = false;
                    qVar3.p(false);
                } else {
                    z13 = false;
                    z14 = true;
                    qVar3.X(-615805074);
                    qVar3.p(false);
                }
                qVar3.p(z14);
                qVar3.p(z13);
            }
            m1168ExploreReadPriceRowFNF3uiM(exploreRead, null, ib.i.B(i15, i12, echoTheme, qVar3, qVar3), qVar3, 0, 2);
            p.n.t(qVar3, z14, z14, z14);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreReadCard$lambda$0$0$0$0$0$0(ho.l lVar, ExploreRead exploreRead) {
        lVar.invoke(exploreRead);
        return z.f31622a;
    }

    public static final z ExploreReadCard$lambda$1(ExploreRead exploreRead, ho.a aVar, t tVar, ho.l lVar, String str, int i10, int i11, u2.m mVar, int i12) {
        ExploreReadCard(exploreRead, aVar, tVar, lVar, str, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0051  */
    /* renamed from: ExploreReadPriceRow-FNF3uiM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1168ExploreReadPriceRowFNF3uiM(ExploreRead exploreRead, t tVar, long j4, u2.m mVar, int i10, int i11) {
        ExploreRead exploreRead2;
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        t tVar3;
        r1 r10;
        boolean z10;
        t tVar4;
        MoneyPrice moneyPrice;
        int i14;
        int i15;
        exploreRead.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-93129258);
        if ((i10 & 6) == 0) {
            exploreRead2 = exploreRead;
            if (qVar2.h(exploreRead2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            exploreRead2 = exploreRead;
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) == 0) {
                if (qVar2.e(j4)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            boolean z11 = false;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    tVar4 = i3.q.f13017a;
                    z10 = true;
                } else {
                    z10 = true;
                    tVar4 = tVar2;
                }
                Map map = (Map) qVar2.j(LocalExplorePricesKt.getLocalExplorePrices());
                Boolean bool = (Boolean) qVar2.j(LocalExplorePricesKt.getLocalIsFreeUser());
                ExplorePricingType pricingType = exploreRead2.getPricingType();
                String str = null;
                if (map != null) {
                    moneyPrice = (MoneyPrice) map.get(exploreRead2.getAndroidProductId());
                } else {
                    moneyPrice = null;
                }
                if (map == null && exploreRead2.getAndroidProductId() != null) {
                    z11 = z10;
                }
                Float listPrice = exploreRead2.getListPrice();
                if (listPrice != null) {
                    str = MoneyPriceFormatterKt.formatPrice(listPrice.floatValue(), exploreRead2.getCurrency());
                }
                qVar = qVar2;
                ReadPricingRowKt.m1089ReadPricingRowKNANIv4(pricingType, moneyPrice, z11, str, ExploreKt.getCanBePurchasedIndividually(exploreRead2), tVar4, bool, exploreRead2.getCurrency(), null, ReadPricingUltraRowStyle.Compact, EchoTheme.INSTANCE.getTypography(qVar2, EchoTheme.$stable).getSmCompact400(qVar2, EchoThemeTypography.$stable), j4, qVar, ((i12 << 12) & 458752) | 805306368, (i12 >> 3) & 112, RpcError.MAX_MESSAGE_BYTES);
                tVar3 = tVar4;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new n(exploreRead2, tVar3, j4, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i10 & 384) == 0) {
        }
        boolean z112 = false;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ExploreReadPriceRow_FNF3uiM$lambda$0(ExploreRead exploreRead, t tVar, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1168ExploreReadPriceRowFNF3uiM(exploreRead, tVar, j4, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_LongText(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-485356113);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.m1140getLambda$946716663$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 17);
        }
    }

    public static final z Preview_ExploreReadCard_LongText$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_LongText(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_NoImage(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1873415562);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.m1131getLambda$2020792336$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 12);
        }
    }

    public static final z Preview_ExploreReadCard_NoImage$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_NoImage(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_NoStats(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1015480526);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.getLambda$1416239924$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 8);
        }
    }

    public static final z Preview_ExploreReadCard_NoStats$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_NoStats(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Paid(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1267600946);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.m1130getLambda$194413172$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 20);
        }
    }

    public static final z Preview_ExploreReadCard_Paid$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Paid(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Paid_AED(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(61213843);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.m1134getLambda$400146707$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 14);
        }
    }

    public static final z Preview_ExploreReadCard_Paid_AED$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Paid_AED(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Paid_FullLayout(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-536587652);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.getLambda$1802610402$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 18);
        }
    }

    public static final z Preview_ExploreReadCard_Paid_FullLayout$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Paid_FullLayout(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Paid_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1723292401);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.getLambda$55843433$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 13);
        }
    }

    public static final z Preview_ExploreReadCard_Paid_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Paid_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Ultra(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-838805924);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.getLambda$1083396674$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 16);
        }
    }

    public static final z Preview_ExploreReadCard_Ultra$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Ultra(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Ultra_AED(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(29667261);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.m1126getLambda$1387607901$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 19);
        }
    }

    public static final z Preview_ExploreReadCard_Ultra_AED$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Ultra_AED(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Ultra_FullLayout(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-827741166);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.m1125getLambda$1327045524$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 10);
        }
    }

    public static final z Preview_ExploreReadCard_Ultra_FullLayout$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Ultra_FullLayout(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Ultra_Included(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(678378421);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.getLambda$1030931087$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 15);
        }
    }

    public static final z Preview_ExploreReadCard_Ultra_Included$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Ultra_Included(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_Ultra_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1403888441);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.getLambda$722524447$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 9);
        }
    }

    public static final z Preview_ExploreReadCard_Ultra_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_Ultra_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreReadCard_WithImage(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1192057243);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreReadCardKt.INSTANCE.getLambda$1685634891$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 11);
        }
    }

    public static final z Preview_ExploreReadCard_WithImage$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreReadCard_WithImage(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

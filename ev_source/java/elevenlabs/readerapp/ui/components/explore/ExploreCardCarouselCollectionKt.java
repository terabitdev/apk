package io.elevenlabs.readerapp.ui.components.explore;

import a2.h3;
import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import i3.t;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.ui.components.i0;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.RateFormatterKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.y2;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.p2;
import r1.s;
import r1.w;
import r1.x;
import rd.c1;
import s4.y0;
import sn.z;
import t2.u;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001aa\u0010\r\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"", "title", "subtitle", "", "Lio/elevenlabs/domain/model/ExploreRead;", "books", "Lkotlin/Function1;", "Lsn/z;", "onBookClick", "Li3/t;", "modifier", "Lkotlin/Function0;", "onSeeAllClick", "ExploreCardCarouselCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lho/l;Li3/t;Lho/a;Lu2/m;II)V", "book", "onClick", "CardCarouselItem", "(Lio/elevenlabs/domain/model/ExploreRead;Lho/a;Li3/t;Lu2/m;II)V", "Preview_ExploreCardCarouselCollection", "(Lu2/m;I)V", "Preview_ExploreCardCarouselCollection_Minimal", "Preview_ExploreCardCarouselCollection_LongTitles", "Preview_ExploreCardCarouselCollection_PricingStates", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreCardCarouselCollectionKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardCarouselItem(ExploreRead exploreRead, ho.a aVar, t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1726728502);
        if ((i10 & 6) == 0) {
            if (qVar2.h(exploreRead)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
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
            if (!qVar2.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                String E0 = tn.o.E0(tn.n.F0(new String[]{exploreRead.getTitle(), exploreRead.getAuthor()}), ", ", null, null, null, 62);
                t r11 = p2.r(tVar4, 240, 320, u.P, u.P, 12);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                qVar = qVar2;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(E0, aVar, l1.n.h(m3.h.c(r11, echoTheme.getShapes(qVar2, i17).getXl(qVar2, EchoThemeShapes.$stable)), echoTheme.getColors(qVar2, i17).getFill().getDenary(qVar2, EchoThemeColors.Fill.$stable), h0.f26395b), 0L, false, 0, null, false, null, c3.k.d(-186366766, true, new h3(exploreRead, 4), qVar2), qVar, (i12 & 112) | 805306368, 504);
                tVar3 = tVar4;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(exploreRead, aVar, tVar3, i10, i11, 17);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z CardCarouselItem$lambda$0(ExploreRead exploreRead, s sVar, u2.m mVar, int i10) {
        boolean z6;
        h4.f fVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        h4.f fVar2;
        i3.q qVar;
        h4.e eVar;
        h4.e eVar2;
        h4.e eVar3;
        h4.d dVar;
        i3.k kVar;
        h4.f fVar3;
        h4.e eVar4;
        float f10;
        i3.q qVar2;
        int i11;
        EchoTheme echoTheme;
        int i12;
        int i13;
        h4.e eVar5;
        h4.e eVar6;
        h4.d dVar2;
        h4.e eVar7;
        h4.f fVar4;
        h4.e eVar8;
        float f11;
        int i14;
        boolean z15;
        boolean z16;
        h4.f fVar5;
        String str;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar3 = (u2.q) mVar;
        if (qVar3.O(i10 & 1, z6)) {
            i3.q qVar4 = i3.q.f13017a;
            t E = r1.d.E(qVar4, 24);
            i3.j jVar = i3.d.C0;
            r1.e eVar9 = r1.j.f29230c;
            x a10 = w.a(eVar9, jVar, qVar3, 48);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            t c5 = i3.a.c(E, qVar3);
            h4.h.f11920i.getClass();
            h4.f fVar6 = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar6);
            } else {
                qVar3.k0();
            }
            h4.e eVar10 = h4.g.f11907f;
            r.J(eVar10, a10, qVar3);
            h4.e eVar11 = h4.g.f11906e;
            r.J(eVar11, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar12 = h4.g.f11908g;
            r.y(qVar3, valueOf, eVar12);
            h4.d dVar3 = h4.g.f11909h;
            r.F(dVar3, qVar3);
            h4.e eVar13 = h4.g.f11905d;
            r.J(eVar13, c5, qVar3);
            String coverImageUrl = ExploreKt.coverImageUrl(exploreRead, CoverImageSize.Medium);
            BookCoverSize bookCoverSize = BookCoverSize.Square;
            String title = exploreRead.getTitle();
            long j4 = p3.x.f26437l;
            ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(coverImageUrl, bookCoverSize, null, u.P, false, false, j4, j4, title, null, null, false, exploreRead.getBlurPlaceholder(), exploreRead.getCoverAspectRatio(), false, null, qVar3, 14155824, 0, 52796);
            float f12 = 16;
            r1.d.g(p2.f(qVar4, f12), qVar3);
            x a11 = w.a(eVar9, jVar, qVar3, 48);
            int hashCode2 = Long.hashCode(qVar3.T);
            c3.o l7 = qVar3.l();
            t c10 = i3.a.c(qVar4, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                fVar = fVar6;
                qVar3.k(fVar);
            } else {
                fVar = fVar6;
                qVar3.k0();
            }
            r.J(eVar10, a11, qVar3);
            r.J(eVar11, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar12, qVar3, dVar3);
            r.J(eVar13, c10, qVar3);
            String title2 = exploreRead.getTitle();
            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            EchoThemeTypography typography = echoTheme2.getTypography(qVar3, i15);
            int i16 = EchoThemeTypography.$stable;
            y0 baseCompact500 = typography.getBaseCompact500(qVar3, i16);
            EchoThemeColors.Text text = echoTheme2.getColors(qVar3, i15).getText();
            int i17 = EchoThemeColors.Text.$stable;
            h4.f fVar7 = fVar;
            j7.d(title2, null, text.getPrimary(qVar3, i17), 0L, null, 0L, new e5.k(3), 0L, 2, false, 1, 0, null, baseCompact500, qVar3, 0, 24960, 109562);
            String author = exploreRead.getAuthor();
            if (author == null) {
                author = "";
            }
            j7.d(author, null, ib.i.b(i15, i17, echoTheme2, qVar3, qVar3), 0L, null, 0L, new e5.k(3), 0L, 2, false, 1, 0, null, echoTheme2.getTypography(qVar3, i15).getSmCompact400(qVar3, i16), qVar3, 0, 24960, 109562);
            u2.q qVar5 = qVar3;
            qVar5.p(true);
            r1.d.g(p2.f(qVar4, 8), qVar5);
            if (exploreRead.getAverageRating() != null && exploreRead.getTotalRatingCount() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Integer addedToLibraryCount = exploreRead.getAddedToLibraryCount();
            Float audioDurationSeconds = exploreRead.getAudioDurationSeconds();
            if (audioDurationSeconds != null && audioDurationSeconds.floatValue() > u.P) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (addedToLibraryCount != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 && z11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z12 && !z13) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (!z10 && !z14) {
                qVar5.X(-1893922106);
                qVar5.p(false);
                z15 = true;
            } else {
                qVar5.X(-1897164520);
                r1.h g10 = r1.j.g(echoTheme2.getSpacings(qVar5, i15).getX2());
                i3.k kVar2 = i3.d.f13005z0;
                k2 a12 = i2.a(g10, kVar2, qVar5, 48);
                int hashCode3 = Long.hashCode(qVar5.T);
                c3.o l10 = qVar5.l();
                t c11 = i3.a.c(qVar4, qVar5);
                qVar5.b0();
                if (qVar5.S) {
                    fVar2 = fVar7;
                    qVar5.k(fVar2);
                } else {
                    fVar2 = fVar7;
                    qVar5.k0();
                }
                r.J(eVar10, a12, qVar5);
                r.J(eVar11, l10, qVar5);
                defpackage.f.u(hashCode3, qVar5, eVar12, qVar5, dVar3);
                r.J(eVar13, c11, qVar5);
                if (z10) {
                    qVar5.X(-400784787);
                    k2 a13 = i2.a(r1.j.g(5), kVar2, qVar5, 54);
                    int hashCode4 = Long.hashCode(qVar5.T);
                    c3.o l11 = qVar5.l();
                    t c12 = i3.a.c(qVar4, qVar5);
                    qVar5.b0();
                    if (qVar5.S) {
                        qVar5.k(fVar2);
                    } else {
                        qVar5.k0();
                    }
                    r.J(eVar10, a13, qVar5);
                    r.J(eVar11, l11, qVar5);
                    defpackage.f.u(hashCode4, qVar5, eVar12, qVar5, dVar3);
                    r.J(eVar13, c12, qVar5);
                    eVar3 = eVar12;
                    eVar = eVar11;
                    dVar = dVar3;
                    eVar2 = eVar13;
                    y2.a(kd.a.M(R.drawable.star, qVar5, 0), null, p2.o(qVar4, f12), echoTheme2.getColors(qVar5, i15).getIcon().getQuaternary(qVar5, EchoThemeColors.Icon.$stable), qVar5, u3.c.$stable | 432, 0);
                    Float averageRating = exploreRead.getAverageRating();
                    if (averageRating != null) {
                        str = RateFormatterKt.formatRatingScore(averageRating.floatValue());
                    } else {
                        str = null;
                    }
                    qVar = qVar4;
                    f10 = f12;
                    kVar = kVar2;
                    fVar3 = fVar2;
                    eVar4 = eVar10;
                    j7.d(str + " (" + exploreRead.getTotalRatingCount() + Separators.RPAREN, null, ib.i.b(i15, i17, echoTheme2, qVar5, qVar5), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar5, i15).getSmCompact400(qVar5, i16), qVar5, 0, 0, 131066);
                    qVar5 = qVar5;
                    qVar5.p(true);
                    qVar5.p(false);
                } else {
                    qVar = qVar4;
                    eVar = eVar11;
                    eVar2 = eVar13;
                    eVar3 = eVar12;
                    dVar = dVar3;
                    kVar = kVar2;
                    fVar3 = fVar2;
                    eVar4 = eVar10;
                    f10 = f12;
                    qVar5.X(-399900667);
                    qVar5.p(false);
                }
                if (z10 && z14) {
                    qVar5.X(-399814797);
                    u2.q qVar6 = qVar5;
                    j7.d("·", null, ib.i.b(i15, i17, echoTheme2, qVar5, qVar5), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar5, i15).getSmCompact400(qVar5, i16), qVar6, 6, 0, 131066);
                    qVar5 = qVar6;
                    qVar5.p(false);
                } else {
                    qVar5.X(-399591163);
                    qVar5.p(false);
                }
                if (z12) {
                    qVar5.X(-399523025);
                    k2 a14 = i2.a(r1.j.g(5), kVar, qVar5, 54);
                    int hashCode5 = Long.hashCode(qVar5.T);
                    c3.o l12 = qVar5.l();
                    i3.q qVar7 = qVar;
                    t c13 = i3.a.c(qVar7, qVar5);
                    qVar5.b0();
                    if (qVar5.S) {
                        fVar5 = fVar3;
                        qVar5.k(fVar5);
                    } else {
                        fVar5 = fVar3;
                        qVar5.k0();
                    }
                    h4.e eVar14 = eVar4;
                    r.J(eVar14, a14, qVar5);
                    h4.e eVar15 = eVar;
                    r.J(eVar15, l12, qVar5);
                    h4.e eVar16 = eVar3;
                    h4.d dVar4 = dVar;
                    defpackage.f.u(hashCode5, qVar5, eVar16, qVar5, dVar4);
                    h4.e eVar17 = eVar2;
                    r.J(eVar17, c13, qVar5);
                    y2.a(kd.a.M(R.drawable.play_round, qVar5, 0), null, p2.o(qVar7, f10), echoTheme2.getColors(qVar5, i15).getIcon().getQuaternary(qVar5, EchoThemeColors.Icon.$stable), qVar5, u3.c.$stable | 432, 0);
                    u2.q qVar8 = qVar5;
                    i11 = i17;
                    fVar4 = fVar5;
                    eVar6 = eVar16;
                    qVar2 = qVar7;
                    dVar2 = dVar4;
                    eVar7 = eVar17;
                    f11 = f10;
                    echoTheme = echoTheme2;
                    i13 = i15;
                    eVar5 = eVar15;
                    i14 = 5;
                    i12 = i16;
                    eVar8 = eVar14;
                    j7.d(ExploreReadFormattingKt.formatShortCount(addedToLibraryCount.intValue()), null, ib.i.b(i15, i17, echoTheme2, qVar5, qVar5), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar5, i15).getSmCompact400(qVar5, i16), qVar8, 0, 0, 131066);
                    qVar5 = qVar8;
                    qVar5.p(true);
                    qVar5.p(false);
                } else {
                    qVar2 = qVar;
                    i11 = i17;
                    echoTheme = echoTheme2;
                    i12 = i16;
                    i13 = i15;
                    eVar5 = eVar;
                    eVar6 = eVar3;
                    dVar2 = dVar;
                    eVar7 = eVar2;
                    fVar4 = fVar3;
                    eVar8 = eVar4;
                    f11 = f10;
                    i14 = 5;
                    qVar5.X(-398671579);
                    qVar5.p(false);
                }
                if (z13) {
                    qVar5.X(-398603720);
                    k2 a15 = i2.a(r1.j.g(i14), kVar, qVar5, 54);
                    int hashCode6 = Long.hashCode(qVar5.T);
                    c3.o l13 = qVar5.l();
                    i3.q qVar9 = qVar2;
                    t c14 = i3.a.c(qVar9, qVar5);
                    qVar5.b0();
                    if (qVar5.S) {
                        qVar5.k(fVar4);
                    } else {
                        qVar5.k0();
                    }
                    r.J(eVar8, a15, qVar5);
                    r.J(eVar5, l13, qVar5);
                    defpackage.f.u(hashCode6, qVar5, eVar6, qVar5, dVar2);
                    r.J(eVar7, c14, qVar5);
                    EchoTheme echoTheme3 = echoTheme;
                    int i18 = i13;
                    y2.a(kd.a.M(R.drawable.clock_filled, qVar5, 0), null, p2.o(qVar9, f11), echoTheme3.getColors(qVar5, i18).getIcon().getQuaternary(qVar5, EchoThemeColors.Icon.$stable), qVar5, u3.c.$stable | 432, 0);
                    u2.q qVar10 = qVar5;
                    j7.d(MinutesFormatterKt.formatSecondsAsDuration(audioDurationSeconds.floatValue(), qVar5, 0), null, ib.i.b(i18, i11, echoTheme3, qVar5, qVar5), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme3.getTypography(qVar5, i18).getSmCompact400(qVar5, i12), qVar10, 0, 0, 131066);
                    qVar5 = qVar10;
                    z15 = true;
                    qVar5.p(true);
                    z16 = false;
                    qVar5.p(false);
                } else {
                    z15 = true;
                    z16 = false;
                    qVar5.X(-397730171);
                    qVar5.p(false);
                }
                qVar5.p(z15);
                qVar5.p(z16);
            }
            qVar5.p(z15);
        } else {
            qVar3.R();
        }
        return z.f31622a;
    }

    public static final z CardCarouselItem$lambda$1(ExploreRead exploreRead, ho.a aVar, t tVar, int i10, int i11, u2.m mVar, int i12) {
        CardCarouselItem(exploreRead, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreCardCarouselCollection(String str, String str2, List<ExploreRead> list, ho.l lVar, t tVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        String str3;
        t tVar2;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        int i16;
        boolean z6;
        ho.a aVar3;
        r1 r10;
        t tVar3;
        ho.a aVar4;
        t tVar4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        list.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(398528652);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            str3 = str2;
            if (qVar.f(str3)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        } else {
            str3 = str2;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(list)) {
                i20 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i20 = 128;
            }
            i12 |= i20;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
                i19 = 2048;
            } else {
                i19 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i19;
        }
        int i23 = i11 & 16;
        if (i23 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 32;
            if (i14 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                aVar2 = aVar;
                if (qVar.h(aVar2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
                i16 = i12;
                if ((74899 & i16) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i16 & 1, z6)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i23 != 0) {
                        tVar3 = qVar2;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i14 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    boolean f10 = qVar.f(list);
                    Object L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    Object obj = L;
                    if (f10 || L == eVar) {
                        ArrayList arrayList = new ArrayList(tn.p.a0(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ExploreKt.coverImageUrl((ExploreRead) it.next(), CoverImageSize.Medium));
                        }
                        qVar.h0(arrayList);
                        obj = arrayList;
                    }
                    ExploreCarouselDefaultsKt.PreloadCarouselImages((List) obj, false, qVar, 0, 2);
                    t e10 = p2.e(tVar3, 1.0f);
                    x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    t c5 = i3.a.c(e10, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    r.J(h4.g.f11907f, a10, qVar);
                    r.J(h4.g.f11906e, l4, qVar);
                    r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                    r.F(h4.g.f11909h, qVar);
                    r.J(h4.g.f11905d, c5, qVar);
                    if (str != null) {
                        qVar.X(-2045478537);
                        tVar4 = tVar3;
                        ExploreSectionHeaderKt.ExploreSectionHeader(str, null, str3, aVar4, qVar, ((i16 >> 6) & 7168) | (i16 & 14) | ((i16 << 3) & 896), 2);
                        ib.i.o(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, qVar2, qVar);
                        i17 = 0;
                        qVar.p(false);
                    } else {
                        tVar4 = tVar3;
                        i17 = 0;
                        qVar.X(-2045243092);
                        qVar.p(false);
                    }
                    t1.z rememberCarouselLazyListState = ExploreCarouselDefaultsKt.rememberCarouselLazyListState(qVar, i17);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i24 = EchoTheme.$stable;
                    d2 d10 = r1.d.d(echoTheme.getSpacings(qVar, i24).getX5(), u.P, 2);
                    r1.h y10 = ib.i.y(echoTheme, qVar, i24);
                    t e11 = p2.e(qVar2, 1.0f);
                    boolean h10 = qVar.h(list);
                    if ((i16 & 7168) == 2048) {
                        i18 = 1;
                    } else {
                        i18 = i17;
                    }
                    int i25 = (h10 ? 1 : 0) | i18;
                    Object L2 = qVar.L();
                    Object obj2 = L2;
                    if (i25 != 0 || L2 == eVar) {
                        h hVar = new h(list, 0, lVar);
                        qVar.h0(hVar);
                        obj2 = hVar;
                    }
                    c1.d(e11, rememberCarouselLazyListState, d10, y10, null, null, false, null, (ho.l) obj2, qVar, 6, 488);
                    qVar.p(true);
                    aVar3 = aVar4;
                    tVar2 = tVar4;
                } else {
                    qVar.R();
                    aVar3 = aVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new i(str, str2, list, lVar, tVar2, aVar3, i10, i11);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            i16 = i12;
            if ((74899 & i16) != 74898) {
            }
            if (qVar.O(i16 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        i16 = i12;
        if ((74899 & i16) != 74898) {
        }
        if (qVar.O(i16 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z ExploreCardCarouselCollection$lambda$1$0$0(final List list, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        final ExploreCardCarouselCollectionKt$ExploreCardCarouselCollection$lambda$1$0$0$$inlined$items$default$1 exploreCardCarouselCollectionKt$ExploreCardCarouselCollection$lambda$1$0$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreCardCarouselCollectionKt$ExploreCardCarouselCollection$lambda$1$0$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ExploreRead) obj);
            }

            @Override // ho.l
            public final Void invoke(ExploreRead exploreRead) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreCardCarouselCollectionKt$ExploreCardCarouselCollection$lambda$1$0$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreCardCarouselCollectionKt$ExploreCardCarouselCollection$lambda$1$0$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final ExploreRead exploreRead = (ExploreRead) list.get(i10);
                    qVar.X(-233868303);
                    boolean f10 = qVar.f(lVar) | qVar.h(exploreRead);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreCardCarouselCollectionKt$ExploreCardCarouselCollection$2$1$1$1$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1165invoke() {
                                ho.l.this.invoke(exploreRead.getReadId());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1165invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ExploreCardCarouselCollectionKt.CardCarouselItem(exploreRead, (ho.a) L, p2.s(i3.q.f13017a, 240), qVar, 384, 0);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        return z.f31622a;
    }

    public static final z ExploreCardCarouselCollection$lambda$2(String str, String str2, List list, ho.l lVar, t tVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        ExploreCardCarouselCollection(str, str2, list, lVar, tVar, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreCardCarouselCollection(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1056177359);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreCardCarouselCollectionKt.INSTANCE.getLambda$355985461$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 0);
        }
    }

    public static final z Preview_ExploreCardCarouselCollection$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreCardCarouselCollection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreCardCarouselCollection_LongTitles(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1345377357);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreCardCarouselCollectionKt.INSTANCE.getLambda$631500071$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 28);
        }
    }

    public static final z Preview_ExploreCardCarouselCollection_LongTitles$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreCardCarouselCollection_LongTitles(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreCardCarouselCollection_Minimal(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1054154129);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreCardCarouselCollectionKt.INSTANCE.getLambda$121783031$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 29);
        }
    }

    public static final z Preview_ExploreCardCarouselCollection_Minimal$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreCardCarouselCollection_Minimal(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreCardCarouselCollection_PricingStates(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(779777368);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreCardCarouselCollectionKt.INSTANCE.m1116getLambda$1955367362$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 27);
        }
    }

    public static final z Preview_ExploreCardCarouselCollection_PricingStates$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreCardCarouselCollection_PricingStates(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

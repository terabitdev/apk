package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.f;
import h4.g;
import h5.h;
import ho.l;
import i3.k;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.components.CoverAspectRatioKt;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreCarouselDefaultsKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreSectionHeaderKt;
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
import q2.j7;
import r1.d2;
import r1.j;
import r1.p2;
import r1.s;
import r1.u0;
import r1.w;
import r1.x;
import rd.c1;
import t1.z;
import t2.u;
import tn.p;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aE\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$MediumCarousel;", "section", "Lkotlin/Function1;", "", "Lsn/z;", "onReadClick", "Lkotlin/Function0;", "onSeeAllClick", "Li3/t;", "modifier", "HomeMediumCarouselSectionV4", "(Lio/elevenlabs/domain/model/home/HomePageV4$Section$MediumCarousel;Lho/l;Lho/a;Li3/t;Lu2/m;II)V", "Lio/elevenlabs/domain/model/ExploreRead;", "read", "Lh5/f;", "coverHeight", "onClick", "MediumCarouselItemV4-rAjV9yQ", "(Lio/elevenlabs/domain/model/ExploreRead;FLho/a;Lu2/m;I)V", "MediumCarouselItemV4", "Preview_HomeMediumCarouselSectionV4", "(Lu2/m;I)V", "Preview_HomeMediumCarouselSectionV4_MixedCovers", "Preview_HomeMediumCarouselSectionV4_LongTitles", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeMediumCarouselSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeMediumCarouselSectionV4(HomePageV4.Section.MediumCarousel mediumCarousel, l lVar, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        q qVar;
        r1 r10;
        boolean z10;
        float a10;
        i3.q qVar2;
        u2.e eVar;
        float f10;
        int i14;
        int i15;
        int i16;
        mediumCarousel.getClass();
        lVar.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(-509921504);
        if ((i10 & 6) == 0) {
            if (qVar3.h(mediumCarousel)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(aVar)) {
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
            if (qVar3.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            boolean z11 = false;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar3.O(i12 & 1, z6)) {
                i3.q qVar4 = i3.q.f13017a;
                if (i17 != 0) {
                    tVar3 = qVar4;
                } else {
                    tVar3 = tVar2;
                }
                boolean f11 = qVar3.f(mediumCarousel.getReads());
                Object L = qVar3.L();
                u2.e eVar2 = u2.l.f33918a;
                Object obj = L;
                if (f11 || L == eVar2) {
                    List<ExploreRead> reads = mediumCarousel.getReads();
                    ArrayList arrayList = new ArrayList(p.a0(reads, 10));
                    Iterator<T> it = reads.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ExploreKt.coverImageUrl((ExploreRead) it.next(), CoverImageSize.Thumbnail));
                    }
                    qVar3.h0(arrayList);
                    obj = arrayList;
                }
                ExploreCarouselDefaultsKt.PreloadCarouselImages((List) obj, false, qVar3, 0, 2);
                boolean f12 = qVar3.f(mediumCarousel.getReads());
                Object L2 = qVar3.L();
                if (f12 || L2 == eVar2) {
                    List<ExploreRead> reads2 = mediumCarousel.getReads();
                    if (reads2 == null || !reads2.isEmpty()) {
                        Iterator<T> it2 = reads2.iterator();
                        while (it2.hasNext()) {
                            if (!CoverAspectRatioKt.isCoverSquarish(((ExploreRead) it2.next()).getCoverAspectRatio())) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    L2 = Boolean.valueOf(z10);
                    qVar3.h0(L2);
                }
                if (((Boolean) L2).booleanValue()) {
                    a10 = h.b(BookCoverSize.Compact.getSize());
                } else {
                    a10 = h.a(BookCoverSize.Compact.getSize());
                }
                float f13 = a10;
                t e10 = p2.e(tVar3, 1.0f);
                x a11 = w.a(j.f29230c, i3.d.B0, qVar3, 0);
                int hashCode = Long.hashCode(qVar3.T);
                o l4 = qVar3.l();
                t c5 = i3.a.c(e10, qVar3);
                h4.h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar);
                } else {
                    qVar3.k0();
                }
                r.J(g.f11907f, a11, qVar3);
                r.J(g.f11906e, l4, qVar3);
                r.y(qVar3, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar3);
                r.J(g.f11905d, c5, qVar3);
                if (mediumCarousel.getTitle() != null) {
                    qVar3.X(1122868831);
                    qVar2 = qVar4;
                    eVar = eVar2;
                    f10 = 1.0f;
                    ExploreSectionHeaderKt.ExploreSectionHeader(mediumCarousel.getTitle(), null, mediumCarousel.getSubtitle(), aVar, qVar3, (i12 << 3) & 7168, 2);
                    i.o(EchoTheme.INSTANCE, qVar3, EchoTheme.$stable, qVar2, qVar3);
                    qVar3.p(false);
                } else {
                    qVar2 = qVar4;
                    eVar = eVar2;
                    f10 = 1.0f;
                    qVar3.X(1123108120);
                    qVar3.p(false);
                }
                z rememberCarouselLazyListState = ExploreCarouselDefaultsKt.rememberCarouselLazyListState(qVar3, 0);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i18 = EchoTheme.$stable;
                d2 d10 = r1.d.d(echoTheme.getSpacings(qVar3, i18).getX5(), u.P, 2);
                r1.h g10 = j.g(echoTheme.getSpacings(qVar3, i18).getX3());
                k kVar = i3.d.A0;
                t e11 = p2.e(qVar2, f10);
                boolean h10 = qVar3.h(mediumCarousel) | qVar3.c(f13);
                if ((i12 & 112) == 32) {
                    z11 = true;
                }
                boolean z12 = h10 | z11;
                Object L3 = qVar3.L();
                if (z12 || L3 == eVar) {
                    L3 = new a2.a(mediumCarousel, f13, lVar, 2);
                    qVar3.h0(L3);
                }
                c1.d(e11, rememberCarouselLazyListState, d10, g10, kVar, null, false, null, (l) L3, qVar3, 196614, 456);
                q qVar5 = qVar3;
                qVar5.p(true);
                qVar = qVar5;
            } else {
                qVar3.R();
                tVar3 = tVar2;
                qVar = qVar3;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) mediumCarousel, lVar, aVar, (Object) tVar3, i10, i11, 16);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z112 = false;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z HomeMediumCarouselSectionV4$lambda$2$0$0(HomePageV4.Section.MediumCarousel mediumCarousel, final float f10, final l lVar, t1.t tVar) {
        tVar.getClass();
        final List<ExploreRead> reads = mediumCarousel.getReads();
        final HomeMediumCarouselSectionKt$HomeMediumCarouselSectionV4$lambda$2$0$0$$inlined$items$default$1 homeMediumCarouselSectionKt$HomeMediumCarouselSectionV4$lambda$2$0$0$$inlined$items$default$1 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeMediumCarouselSectionKt$HomeMediumCarouselSectionV4$lambda$2$0$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ExploreRead) obj);
            }

            @Override // ho.l
            public final Void invoke(ExploreRead exploreRead) {
                return null;
            }
        };
        ((t1.i) tVar).u(reads.size(), null, new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeMediumCarouselSectionKt$HomeMediumCarouselSectionV4$lambda$2$0$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return l.this.invoke(reads.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeMediumCarouselSectionKt$HomeMediumCarouselSectionV4$lambda$2$0$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((q) mVar).d(i10)) {
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
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final ExploreRead exploreRead = (ExploreRead) reads.get(i10);
                    qVar.X(-60417920);
                    float f11 = f10;
                    boolean f12 = qVar.f(lVar) | qVar.h(exploreRead);
                    Object L = qVar.L();
                    if (f12 || L == u2.l.f33918a) {
                        final l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeMediumCarouselSectionKt$HomeMediumCarouselSectionV4$2$1$1$1$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1447invoke() {
                                l.this.invoke(exploreRead.getReadId());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1447invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    HomeMediumCarouselSectionKt.m1445MediumCarouselItemV4rAjV9yQ(exploreRead, f11, (ho.a) L, qVar, 0);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
        return sn.z.f31622a;
    }

    public static final sn.z HomeMediumCarouselSectionV4$lambda$3(HomePageV4.Section.MediumCarousel mediumCarousel, l lVar, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        HomeMediumCarouselSectionV4(mediumCarousel, lVar, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* renamed from: MediumCarouselItemV4-rAjV9yQ */
    public static final void m1445MediumCarouselItemV4rAjV9yQ(final ExploreRead exploreRead, final float f10, final ho.a aVar, m mVar, final int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-2005461249);
        if ((i10 & 6) == 0) {
            if (qVar.h(exploreRead)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.c(f10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(exploreRead.getTitle(), aVar, m3.h.c(p2.s(i3.q.f13017a, h.b(BookCoverSize.Compact.getSize())), EchoTheme.INSTANCE.getShapes(qVar, EchoTheme.$stable).getSm(qVar, EchoThemeShapes.$stable)), 0L, false, 0, null, false, null, c3.k.d(1915818395, true, new b(f10, exploreRead, 0), qVar), qVar, ((i11 >> 3) & 112) | 805306368, 504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.c
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z MediumCarouselItemV4_rAjV9yQ$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    MediumCarouselItemV4_rAjV9yQ$lambda$1 = HomeMediumCarouselSectionKt.MediumCarouselItemV4_rAjV9yQ$lambda$1(ExploreRead.this, f10, aVar, i10, (m) obj, intValue);
                    return MediumCarouselItemV4_rAjV9yQ$lambda$1;
                }
            };
        }
    }

    public static final sn.z MediumCarouselItemV4_rAjV9yQ$lambda$0(float f10, ExploreRead exploreRead, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.j jVar = i3.d.C0;
            u0 u0Var = j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            x a10 = w.a(j.g(echoTheme.getSpacings(qVar, i11).getX3()), jVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = g.f11907f;
            r.J(eVar, a10, qVar);
            h4.e eVar2 = g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = g.f11905d;
            r.J(eVar4, c5, qVar);
            t f11 = p2.f(qVar2, f10);
            f1 d10 = r1.p.d(i3.d.Z, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(f11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            String coverImageUrl = ExploreKt.coverImageUrl(exploreRead, CoverImageSize.Thumbnail);
            BookCoverSize bookCoverSize = BookCoverSize.Compact;
            long j4 = p3.x.f26437l;
            ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(coverImageUrl, bookCoverSize, null, u.P, false, false, j4, j4, null, null, null, false, exploreRead.getBlurPlaceholder(), exploreRead.getCoverAspectRatio(), true, null, qVar, 14155824, 24576, 36668);
            qVar.p(true);
            j7.d(exploreRead.getTitle(), null, echoTheme.getColors(qVar, i11).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, new e5.k(3), 0L, 2, false, 2, 2, null, echoTheme.getTypography(qVar, i11).getSmCompact500(qVar, EchoThemeTypography.$stable), qVar, 0, 221568, 76794);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MediumCarouselItemV4_rAjV9yQ$lambda$1(ExploreRead exploreRead, float f10, ho.a aVar, int i10, m mVar, int i11) {
        m1445MediumCarouselItemV4rAjV9yQ(exploreRead, f10, aVar, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_HomeMediumCarouselSectionV4(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1244043664);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeMediumCarouselSectionKt.INSTANCE.getLambda$315778902$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 18);
        }
    }

    public static final sn.z Preview_HomeMediumCarouselSectionV4$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeMediumCarouselSectionV4(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_HomeMediumCarouselSectionV4_LongTitles(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2086430802);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeMediumCarouselSectionKt.INSTANCE.getLambda$1667103660$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 16);
        }
    }

    public static final sn.z Preview_HomeMediumCarouselSectionV4_LongTitles$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeMediumCarouselSectionV4_LongTitles(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_HomeMediumCarouselSectionV4_MixedCovers(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-872085752);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeMediumCarouselSectionKt.INSTANCE.m1428getLambda$986325266$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 17);
        }
    }

    public static final sn.z Preview_HomeMediumCarouselSectionV4_MixedCovers$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeMediumCarouselSectionV4_MixedCovers(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

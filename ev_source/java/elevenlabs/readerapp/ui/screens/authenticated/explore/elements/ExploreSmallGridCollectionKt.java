package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ho.l;
import i3.t;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreDeeplinkPosition;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.CoverAspectRatioKt;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreCarouselDefaultsKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreSectionHeaderKt;
import io.elevenlabs.readerapp.ui.components.x;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.extensions.ScreenWidthBreakpoints;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d2;
import r1.p2;
import r1.u;
import r1.u0;
import r1.v;
import r1.w;
import rd.c1;
import sn.z;
import tn.p;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aw\u0010\u0011\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u000f\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u000f\u0010\u0019\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u0014\u001a\u000f\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"", "title", "subtitle", "", "Lio/elevenlabs/domain/model/ExploreRead;", "reads", "Lkotlin/Function1;", "Lsn/z;", "onReadClick", "Lkotlin/Function0;", "onSeeAllClick", "Li3/t;", "modifier", "", "rows", "Lio/elevenlabs/domain/model/ExploreDeeplinkPosition;", "deeplinkPosition", "ExploreSmallGridCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lho/l;Lho/a;Li3/t;Ljava/lang/Integer;Lio/elevenlabs/domain/model/ExploreDeeplinkPosition;Lu2/m;II)V", "Preview_ExploreSmallGridCollection", "(Lu2/m;I)V", "Preview_ExploreSmallGridCollection_NoSeeAll", "Preview_ExploreSmallGridCollection_FewItems", "Preview_ExploreSmallGridCollection_SingleRow", "Preview_ExploreSmallGridCollection_Tablet", "Preview_ExploreSmallGridCollection_SquarishCovers", "Preview_ExploreSmallGridCollection_MixedAspects", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreSmallGridCollectionKt {
    /* JADX WARN: Removed duplicated region for block: B:125:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreSmallGridCollection(final String str, final String str2, final List<ExploreRead> list, final l lVar, final ho.a aVar, t tVar, Integer num, ExploreDeeplinkPosition exploreDeeplinkPosition, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        Integer num2;
        int i15;
        int i16;
        int ordinal;
        int i17;
        int i18;
        boolean z6;
        q qVar;
        ExploreDeeplinkPosition exploreDeeplinkPosition2;
        Integer num3;
        r1 r10;
        t tVar3;
        Integer num4;
        final ExploreDeeplinkPosition exploreDeeplinkPosition3;
        int i19;
        boolean z10;
        boolean z11;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        list.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(353657024);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i12 = i24 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str2)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i12 |= i23;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(list)) {
                i22 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i22 = 128;
            }
            i12 |= i22;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar)) {
                i21 = 2048;
            } else {
                i21 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i21;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar)) {
                i20 = 16384;
            } else {
                i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i20;
        }
        int i25 = i11 & 32;
        if (i25 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                num2 = num;
                if (qVar2.f(num2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                i16 = i11 & 128;
                int i26 = 12582912;
                if (i16 == 0) {
                    if ((12582912 & i10) == 0) {
                        if (exploreDeeplinkPosition == null) {
                            ordinal = -1;
                        } else {
                            ordinal = exploreDeeplinkPosition.ordinal();
                        }
                        if (qVar2.d(ordinal)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                    }
                    i17 = 4793491 & i12;
                    i18 = i12;
                    boolean z12 = true;
                    if (i17 == 4793490) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i18 & 1, z6)) {
                        if (i25 != 0) {
                            tVar3 = i3.q.f13017a;
                        } else {
                            tVar3 = tVar2;
                        }
                        if (i14 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i16 != 0) {
                            exploreDeeplinkPosition3 = null;
                        } else {
                            exploreDeeplinkPosition3 = exploreDeeplinkPosition;
                        }
                        if (num4 != null) {
                            i19 = ae.l.m(num4.intValue(), 1, 2);
                        } else {
                            i19 = 2;
                        }
                        boolean f10 = qVar2.f(list) | qVar2.d(i19);
                        Object L = qVar2.L();
                        u2.e eVar = u2.l.f33918a;
                        if (!f10 && L != eVar) {
                            z10 = true;
                        } else {
                            if (i19 == 1) {
                                z10 = true;
                                L = new sn.k(list, tn.t.f33547a);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                int i27 = 0;
                                for (Object obj : list) {
                                    int i28 = i27 + 1;
                                    if (i27 >= 0) {
                                        if (i27 % 2 == 0) {
                                            arrayList.add(obj);
                                        }
                                        i27 = i28;
                                    } else {
                                        ig.f.U();
                                        throw null;
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int i29 = 0;
                                for (Object obj2 : list) {
                                    int i30 = i29 + 1;
                                    if (i29 >= 0) {
                                        if (i29 % 2 == 1) {
                                            arrayList2.add(obj2);
                                        }
                                        z12 = true;
                                        i29 = i30;
                                    } else {
                                        ig.f.U();
                                        throw null;
                                    }
                                }
                                z10 = z12;
                                L = new sn.k(arrayList, arrayList2);
                            }
                            qVar2.h0(L);
                        }
                        sn.k kVar = (sn.k) L;
                        final List list2 = (List) kVar.f31600a;
                        final List list3 = (List) kVar.f31601b;
                        if (str == null && (str2 == null || exploreDeeplinkPosition3 != ExploreDeeplinkPosition.Header || aVar == null)) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        boolean f11 = qVar2.f(list);
                        Object L2 = qVar2.L();
                        Object obj3 = L2;
                        if (f11 || L2 == eVar) {
                            ArrayList arrayList3 = new ArrayList(p.a0(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(ExploreKt.coverImageUrl((ExploreRead) it.next(), CoverImageSize.Thumbnail));
                            }
                            qVar2.h0(arrayList3);
                            obj3 = arrayList3;
                        }
                        ExploreCarouselDefaultsKt.PreloadCarouselImages((List) obj3, false, qVar2, 0, 2);
                        final int i31 = i19;
                        final boolean z13 = z11;
                        qVar = qVar2;
                        r1.d.a(p2.e(tVar3, 1.0f), null, false, c3.k.d(-1830867286, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.j
                            @Override // ho.q
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                z ExploreSmallGridCollection$lambda$2;
                                int intValue = ((Integer) obj6).intValue();
                                ExploreSmallGridCollection$lambda$2 = ExploreSmallGridCollectionKt.ExploreSmallGridCollection$lambda$2(list, i31, z13, str, str2, exploreDeeplinkPosition3, aVar, list2, lVar, list3, (u) obj4, (m) obj5, intValue);
                                return ExploreSmallGridCollection$lambda$2;
                            }
                        }, qVar2), qVar, 3072, 6);
                        exploreDeeplinkPosition2 = exploreDeeplinkPosition3;
                        tVar2 = tVar3;
                        num3 = num4;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        exploreDeeplinkPosition2 = exploreDeeplinkPosition;
                        num3 = num2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new x(str, str2, list, lVar, aVar, tVar2, num3, exploreDeeplinkPosition2, i10, i11, 4);
                        return;
                    }
                    return;
                }
                i12 |= i26;
                i17 = 4793491 & i12;
                i18 = i12;
                boolean z122 = true;
                if (i17 == 4793490) {
                }
                if (!qVar2.O(i18 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            num2 = num;
            i16 = i11 & 128;
            int i262 = 12582912;
            if (i16 == 0) {
            }
            i12 |= i262;
            i17 = 4793491 & i12;
            i18 = i12;
            boolean z1222 = true;
            if (i17 == 4793490) {
            }
            if (!qVar2.O(i18 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        num2 = num;
        i16 = i11 & 128;
        int i2622 = 12582912;
        if (i16 == 0) {
        }
        i12 |= i2622;
        i17 = 4793491 & i12;
        i18 = i12;
        boolean z12222 = true;
        if (i17 == 4793490) {
        }
        if (!qVar2.O(i18 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ExploreSmallGridCollection$lambda$2(List list, final int i10, boolean z6, String str, String str2, ExploreDeeplinkPosition exploreDeeplinkPosition, ho.a aVar, final List list2, final l lVar, final List list3, u uVar, m mVar, int i11) {
        int i12;
        boolean z10;
        BookCoverSize bookCoverSize;
        boolean z11;
        float a10;
        float f10;
        i3.q qVar;
        ho.a aVar2;
        int i13;
        uVar.getClass();
        if ((i11 & 6) == 0) {
            if (((q) mVar).f(uVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i11 | i13;
        } else {
            i12 = i11;
        }
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar2 = (q) mVar;
        if (qVar2.O(i12 & 1, z10)) {
            v vVar = (v) uVar;
            boolean c5 = qVar2.c(vVar.d());
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (c5 || L == eVar) {
                if (h5.f.a(vVar.d(), ScreenWidthBreakpoints.INSTANCE.m1985getMediumD9Ej5fM()) < 0) {
                    bookCoverSize = BookCoverSize.Small;
                } else {
                    bookCoverSize = BookCoverSize.Medium;
                }
                L = bookCoverSize;
                qVar2.h0(L);
            }
            final BookCoverSize bookCoverSize2 = (BookCoverSize) L;
            boolean f11 = qVar2.f(list);
            Object L2 = qVar2.L();
            if (f11 || L2 == eVar) {
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!CoverAspectRatioKt.isCoverSquarish(((ExploreRead) it.next()).getCoverAspectRatio())) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                L2 = Boolean.valueOf(z11);
                qVar2.h0(L2);
            }
            if (((Boolean) L2).booleanValue()) {
                a10 = h5.h.b(bookCoverSize2.getSize());
            } else {
                a10 = h5.h.a(bookCoverSize2.getSize());
            }
            final float f12 = a10;
            if (i10 > 1) {
                qVar2.X(-1577133226);
                f10 = EchoTheme.INSTANCE.getSpacings(qVar2, EchoTheme.$stable).getX4() + (2 * f12);
                qVar2.p(false);
            } else {
                qVar2.X(-1577062670);
                qVar2.p(false);
                f10 = f12;
            }
            i3.q qVar3 = i3.q.f13017a;
            t e10 = p2.e(qVar3, 1.0f);
            r1.x a11 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c10 = i3.a.c(e10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(h4.g.f11907f, a11, qVar2);
            r.J(h4.g.f11906e, l4, qVar2);
            r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar2);
            r.J(h4.g.f11905d, c10, qVar2);
            if (z6) {
                qVar2.X(-1301501977);
                if (exploreDeeplinkPosition == ExploreDeeplinkPosition.Header) {
                    aVar2 = aVar;
                } else {
                    aVar2 = null;
                }
                ExploreSectionHeaderKt.ExploreSectionHeader(str, null, str2, aVar2, qVar2, 0, 2);
                ib.i.o(EchoTheme.INSTANCE, qVar2, EchoTheme.$stable, qVar3, qVar2);
                qVar2.p(false);
            } else {
                qVar2.X(-1301187730);
                qVar2.p(false);
            }
            t1.z rememberCarouselLazyListState = ExploreCarouselDefaultsKt.rememberCarouselLazyListState(qVar2, 0);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i14 = EchoTheme.$stable;
            d2 d10 = r1.d.d(echoTheme.getSpacings(qVar2, i14).getX5(), t2.u.P, 2);
            r1.h y10 = ib.i.y(echoTheme, qVar2, i14);
            i3.k kVar = i3.d.A0;
            t f13 = p2.f(p2.e(qVar3, 1.0f), f10);
            boolean h10 = qVar2.h(list2) | qVar2.d(bookCoverSize2.ordinal()) | qVar2.f(lVar) | qVar2.d(i10) | qVar2.h(list3) | qVar2.c(f12);
            Object L3 = qVar2.L();
            if (!h10 && L3 != eVar) {
                qVar = qVar3;
            } else {
                qVar = qVar3;
                L3 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.i
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z ExploreSmallGridCollection$lambda$2$2$0$0;
                        ExploreSmallGridCollection$lambda$2$2$0$0 = ExploreSmallGridCollectionKt.ExploreSmallGridCollection$lambda$2$2$0$0(list2, bookCoverSize2, lVar, i10, list3, f12, (t1.t) obj);
                        return ExploreSmallGridCollection$lambda$2$2$0$0;
                    }
                };
                qVar2.h0(L3);
            }
            c1.d(f13, rememberCarouselLazyListState, d10, y10, kVar, null, false, null, (l) L3, qVar2, 196608, 456);
            q qVar4 = qVar2;
            if (aVar != null && (exploreDeeplinkPosition == ExploreDeeplinkPosition.Button || exploreDeeplinkPosition == null)) {
                qVar4.X(-1298576042);
                r1.d.g(p2.f(qVar, echoTheme.getSpacings(qVar4, i14).getX4()), qVar4);
                EchoButtonKt.m1835EchoButton562pCRU(kj.c.R(qVar4, R.string.explore_collection_button_see_all), aVar, r1.d.G(qVar, echoTheme.getSpacings(qVar4, i14).getX5(), t2.u.P, 2), EchoButtonVariant.Secondary, null, null, false, false, new h5.f(500), false, false, qVar4, 100666368, 0, 1776);
                qVar4 = qVar4;
                qVar4.p(false);
            } else {
                qVar4.X(-1298153202);
                qVar4.p(false);
            }
            qVar4.p(true);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z ExploreSmallGridCollection$lambda$2$2$0$0(final List list, final BookCoverSize bookCoverSize, final l lVar, final int i10, final List list2, final float f10, t1.t tVar) {
        tVar.getClass();
        t1.t.d(tVar, list.size(), null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.k
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                z ExploreSmallGridCollection$lambda$2$2$0$0$0;
                int intValue = ((Integer) obj4).intValue();
                ExploreSmallGridCollection$lambda$2$2$0$0$0 = ExploreSmallGridCollectionKt.ExploreSmallGridCollection$lambda$2$2$0$0$0(list, bookCoverSize, lVar, i10, list2, f10, (t1.b) obj, ((Integer) obj2).intValue(), (m) obj3, intValue);
                return ExploreSmallGridCollection$lambda$2$2$0$0$0;
            }
        }, true, -682540000), 6);
        return z.f31622a;
    }

    public static final z ExploreSmallGridCollection$lambda$2$2$0$0$0(List list, BookCoverSize bookCoverSize, l lVar, int i10, List list2, float f10, t1.b bVar, int i11, m mVar, int i12) {
        int i13;
        boolean z6;
        int i14;
        bVar.getClass();
        if ((i12 & 48) == 0) {
            if (((q) mVar).d(i11)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 = i12 | i14;
        } else {
            i13 = i12;
        }
        if ((i13 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i13 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            r1.x a10 = w.a(ib.i.y(EchoTheme.INSTANCE, qVar, EchoTheme.$stable), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            ho.a aVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ExploreRead exploreRead = (ExploreRead) list.get(i11);
            long j4 = p3.x.f26437l;
            CoverImageSize coverImageSize = CoverImageSize.Thumbnail;
            String coverImageUrl = ExploreKt.coverImageUrl(exploreRead, coverImageSize);
            String title = exploreRead.getTitle();
            String blurPlaceholder = exploreRead.getBlurPlaceholder();
            Double coverAspectRatio = exploreRead.getCoverAspectRatio();
            boolean f11 = qVar.f(lVar) | qVar.h(exploreRead);
            Object L = qVar.L();
            Object obj = u2.l.f33918a;
            if (f11 || L == obj) {
                L = new io.elevenlabs.readerapp.ui.components.explore.o(lVar, exploreRead, 3);
                qVar.h0(L);
            }
            ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(coverImageUrl, bookCoverSize, null, t2.u.P, false, false, j4, j4, title, (ho.a) L, null, false, blurPlaceholder, coverAspectRatio, true, null, qVar, 14155776, 24576, 35900);
            q qVar3 = qVar;
            if (i10 > 1) {
                qVar3.X(1471309447);
                ExploreRead exploreRead2 = (ExploreRead) tn.o.z0(i11, list2);
                if (exploreRead2 != null) {
                    qVar3.X(1471449443);
                    String coverImageUrl2 = ExploreKt.coverImageUrl(exploreRead2, coverImageSize);
                    String title2 = exploreRead2.getTitle();
                    String blurPlaceholder2 = exploreRead2.getBlurPlaceholder();
                    Double coverAspectRatio2 = exploreRead2.getCoverAspectRatio();
                    boolean f12 = qVar3.f(lVar) | qVar3.h(exploreRead2);
                    Object L2 = qVar3.L();
                    if (f12 || L2 == obj) {
                        L2 = new io.elevenlabs.readerapp.ui.components.explore.o(lVar, exploreRead2, 4);
                        qVar3.h0(L2);
                    }
                    ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(coverImageUrl2, bookCoverSize, null, t2.u.P, false, false, j4, j4, title2, (ho.a) L2, null, false, blurPlaceholder2, coverAspectRatio2, true, null, qVar3, 14155776, 24576, 35900);
                    qVar3 = qVar3;
                    qVar3.p(false);
                } else {
                    qVar3.X(1472173541);
                    r1.d.g(p2.f(qVar2, f10), qVar3);
                    qVar3.p(false);
                }
                qVar3.p(false);
            } else {
                qVar3.X(1472298316);
                qVar3.p(false);
            }
            qVar3.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreSmallGridCollection$lambda$2$2$0$0$0$0$0$0(l lVar, ExploreRead exploreRead) {
        lVar.invoke(exploreRead.getReadId());
        return z.f31622a;
    }

    public static final z ExploreSmallGridCollection$lambda$2$2$0$0$0$0$1$0(l lVar, ExploreRead exploreRead) {
        lVar.invoke(exploreRead.getReadId());
        return z.f31622a;
    }

    public static final z ExploreSmallGridCollection$lambda$3(String str, String str2, List list, l lVar, ho.a aVar, t tVar, Integer num, ExploreDeeplinkPosition exploreDeeplinkPosition, int i10, int i11, m mVar, int i12) {
        ExploreSmallGridCollection(str, str2, list, lVar, aVar, tVar, num, exploreDeeplinkPosition, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreSmallGridCollection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1519124648);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSmallGridCollectionKt.INSTANCE.m1388getLambda$1216020082$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 17);
        }
    }

    public static final z Preview_ExploreSmallGridCollection$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreSmallGridCollection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSmallGridCollection_FewItems(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1024886821);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSmallGridCollectionKt.INSTANCE.getLambda$1745623477$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 14);
        }
    }

    public static final z Preview_ExploreSmallGridCollection_FewItems$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreSmallGridCollection_FewItems(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSmallGridCollection_MixedAspects(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1287307709);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSmallGridCollectionKt.INSTANCE.m1392getLambda$533765347$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 15);
        }
    }

    public static final z Preview_ExploreSmallGridCollection_MixedAspects$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreSmallGridCollection_MixedAspects(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSmallGridCollection_NoSeeAll(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(908498580);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSmallGridCollectionKt.INSTANCE.m1393getLambda$615958418$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 16);
        }
    }

    public static final z Preview_ExploreSmallGridCollection_NoSeeAll$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreSmallGridCollection_NoSeeAll(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSmallGridCollection_SingleRow(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1513238091);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSmallGridCollectionKt.INSTANCE.m1390getLambda$1526764773$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 18);
        }
    }

    public static final z Preview_ExploreSmallGridCollection_SingleRow$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreSmallGridCollection_SingleRow(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSmallGridCollection_SquarishCovers(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1895319375);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSmallGridCollectionKt.INSTANCE.getLambda$704384779$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 13);
        }
    }

    public static final z Preview_ExploreSmallGridCollection_SquarishCovers$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreSmallGridCollection_SquarishCovers(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSmallGridCollection_Tablet(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1119220797);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSmallGridCollectionKt.INSTANCE.getLambda$1609254039$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 12);
        }
    }

    public static final z Preview_ExploreSmallGridCollection_Tablet$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreSmallGridCollection_Tablet(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

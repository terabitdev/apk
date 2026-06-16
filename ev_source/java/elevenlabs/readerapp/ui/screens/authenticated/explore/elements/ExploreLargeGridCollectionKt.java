package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ho.l;
import i3.t;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.CoverAspectRatioKt;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreReadCardKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreSectionHeaderKt;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.ScreenWidthBreakpoints;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.v;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import tn.p;
import tn.y;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a\u008f\u0001\u0010\u0011\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001ai\u0010\u001f\u001a\u00020\u0007*\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00162\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u001f\u0010 \u001aq\u0010\"\u001a\u00020\u00072\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00162\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\"\u0010#\u001ac\u0010)\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010*\u001a\u00020\u0007H\u0007¢\u0006\u0004\b*\u0010+\u001a\u000f\u0010,\u001a\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010+\u001a\u000f\u0010-\u001a\u00020\u0007H\u0007¢\u0006\u0004\b-\u0010+\u001a\u000f\u0010.\u001a\u00020\u0007H\u0007¢\u0006\u0004\b.\u0010+\u001a\u000f\u0010/\u001a\u00020\u0007H\u0007¢\u0006\u0004\b/\u0010+\u001a\u000f\u00100\u001a\u00020\u0007H\u0007¢\u0006\u0004\b0\u0010+\u001a\u000f\u00101\u001a\u00020\u0007H\u0007¢\u0006\u0004\b1\u0010+\u001a\u000f\u00102\u001a\u00020\u0007H\u0007¢\u0006\u0004\b2\u0010+¨\u00063"}, d2 = {"", "title", "subtitle", "", "Lio/elevenlabs/domain/model/ExploreRead;", "reads", "Lkotlin/Function1;", "Lsn/z;", "onReadClick", "Lkotlin/Function0;", "onSeeAllClick", "Li3/t;", "modifier", "", "rows", "onPreviewClick", "playingPreviewReadId", "ExploreLargeGridCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lho/l;Lho/a;Li3/t;Ljava/lang/Integer;Lho/l;Ljava/lang/String;Lu2/m;II)V", "Lh5/f;", "width", "Lsn/k;", "Lio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;", "rememberGridLayout-8Feqmps", "(FLu2/m;I)Lsn/k;", "rememberGridLayout", "Lt1/t;", "Lua/b;", "pagingItems", "columns", "coverSize", "pagedBookGrid", "(Lt1/t;Lua/b;ILio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;Lho/l;Lho/l;Ljava/lang/String;)V", "rowReads", "BookGridRow", "(Ljava/util/List;ILio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;Lho/l;Li3/t;Lho/l;Ljava/lang/String;Lu2/m;II)V", "read", "onClick", "coverSlotHeight", "LargeBookGridItem--b7W0Lw", "(Lio/elevenlabs/domain/model/ExploreRead;Lho/a;Lio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;FLi3/t;Lho/l;Ljava/lang/String;Lu2/m;II)V", "LargeBookGridItem", "Preview_ExploreLargeGridCollection", "(Lu2/m;I)V", "Preview_ExploreLargeGridCollection_NoSeeAll", "Preview_ExploreLargeGridCollection_PricingStates", "Preview_ExploreLargeGridCollection_NoHeader", "Preview_ExploreLargeGridCollection_Tablet", "Preview_ExploreLargeGridCollection_LimitedRows", "Preview_ExploreLargeGridCollection_Squarish", "Preview_ExploreLargeGridCollection_MixedAspects", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreLargeGridCollectionKt {
    /* JADX WARN: Removed duplicated region for block: B:110:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BookGridRow(List<ExploreRead> list, int i10, BookCoverSize bookCoverSize, l lVar, t tVar, l lVar2, String str, m mVar, int i11, int i12) {
        int i13;
        t tVar2;
        int i14;
        int i15;
        l lVar3;
        int i16;
        int i17;
        String str2;
        int i18;
        boolean z6;
        q qVar;
        t tVar3;
        l lVar4;
        String str3;
        r1 r10;
        t tVar4;
        l lVar5;
        String str4;
        float a10;
        int i19;
        q qVar2;
        float f10;
        float f11;
        boolean z10;
        int i20;
        int i21;
        int i22;
        int i23;
        List<ExploreRead> list2 = list;
        int i24 = i10;
        q qVar3 = (q) mVar;
        qVar3.Z(1058929426);
        if ((i11 & 6) == 0) {
            if (qVar3.h(list2)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i13 = i23 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar3.d(i24)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i13 |= i22;
        }
        if ((i11 & 384) == 0) {
            if (qVar3.d(bookCoverSize.ordinal())) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i13 |= i21;
        }
        if ((i11 & 3072) == 0) {
            if (qVar3.h(lVar)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i20;
        }
        int i25 = i12 & 16;
        if (i25 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i14;
            i15 = i12 & 32;
            if (i15 == 0) {
                i13 |= 196608;
            } else if ((196608 & i11) == 0) {
                lVar3 = lVar2;
                if (qVar3.h(lVar3)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((1572864 & i11) == 0) {
                    str2 = str;
                    if (qVar3.f(str2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                    if ((599187 & i13) == 599186) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar3.O(i13 & 1, z6)) {
                        if (i25 != 0) {
                            tVar4 = i3.q.f13017a;
                        } else {
                            tVar4 = tVar2;
                        }
                        if (i15 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i17 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (list2.size() == i24) {
                            if (!list2.isEmpty()) {
                                for (ExploreRead exploreRead : list2) {
                                    if (exploreRead != null && CoverAspectRatioKt.isCoverSquarish(exploreRead.getCoverAspectRatio())) {
                                    }
                                }
                            }
                            a10 = h5.h.b(bookCoverSize.getSize());
                            float f12 = a10;
                            float f13 = 1.0f;
                            t e10 = p2.e(tVar4, 1.0f);
                            u0 u0Var = r1.j.f29228a;
                            k2 a11 = i2.a(ib.i.y(EchoTheme.INSTANCE, qVar3, EchoTheme.$stable), i3.d.f13004y0, qVar3, 0);
                            int hashCode = Long.hashCode(qVar3.T);
                            o l4 = qVar3.l();
                            t c5 = i3.a.c(e10, qVar3);
                            h4.h.f11920i.getClass();
                            h4.f fVar = h4.g.f11903b;
                            qVar3.b0();
                            if (!qVar3.S) {
                                qVar3.k(fVar);
                            } else {
                                qVar3.k0();
                            }
                            r.J(h4.g.f11907f, a11, qVar3);
                            r.J(h4.g.f11906e, l4, qVar3);
                            r.y(qVar3, Integer.valueOf(hashCode), h4.g.f11908g);
                            r.F(h4.g.f11909h, qVar3);
                            r.J(h4.g.f11905d, c5, qVar3);
                            qVar3.X(1548498514);
                            i19 = 0;
                            while (i19 < i24) {
                                ExploreRead exploreRead2 = (ExploreRead) tn.o.z0(i19, list2);
                                float f14 = Float.MAX_VALUE;
                                if (exploreRead2 != null) {
                                    qVar3.X(758932007);
                                    if (f13 <= 0.0d) {
                                        s1.a.a("invalid weight; must be greater than zero");
                                    }
                                    if (f13 <= Float.MAX_VALUE) {
                                        f14 = f13;
                                    }
                                    m1 m1Var = new m1(f14, true);
                                    if ((i13 & 7168) == 2048) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    boolean h10 = z10 | qVar3.h(exploreRead2);
                                    Object L = qVar3.L();
                                    if (h10 || L == u2.l.f33918a) {
                                        L = new io.elevenlabs.readerapp.ui.components.explore.o(lVar, exploreRead2, 2);
                                        qVar3.h0(L);
                                    }
                                    q qVar4 = qVar3;
                                    f10 = f13;
                                    m1404LargeBookGridItemb7W0Lw(exploreRead2, (ho.a) L, bookCoverSize, f12, m1Var, lVar5, str4, qVar4, i13 & 4129664, 0);
                                    qVar2 = qVar4;
                                    qVar2.p(false);
                                } else {
                                    qVar2 = qVar3;
                                    f10 = f13;
                                    qVar2.X(759335193);
                                    if (f10 <= 0.0d) {
                                        s1.a.a("invalid weight; must be greater than zero");
                                    }
                                    if (f10 > Float.MAX_VALUE) {
                                        f11 = Float.MAX_VALUE;
                                    } else {
                                        f11 = f10;
                                    }
                                    r1.d.g(new m1(f11, true), qVar2);
                                    qVar2.p(false);
                                }
                                i19++;
                                list2 = list;
                                i24 = i10;
                                f13 = f10;
                                qVar3 = qVar2;
                            }
                            q qVar5 = qVar3;
                            qVar5.p(false);
                            qVar5.p(true);
                            tVar3 = tVar4;
                            qVar = qVar5;
                            lVar4 = lVar5;
                            str3 = str4;
                        }
                        a10 = h5.h.a(bookCoverSize.getSize());
                        float f122 = a10;
                        float f132 = 1.0f;
                        t e102 = p2.e(tVar4, 1.0f);
                        u0 u0Var2 = r1.j.f29228a;
                        k2 a112 = i2.a(ib.i.y(EchoTheme.INSTANCE, qVar3, EchoTheme.$stable), i3.d.f13004y0, qVar3, 0);
                        int hashCode2 = Long.hashCode(qVar3.T);
                        o l42 = qVar3.l();
                        t c52 = i3.a.c(e102, qVar3);
                        h4.h.f11920i.getClass();
                        h4.f fVar2 = h4.g.f11903b;
                        qVar3.b0();
                        if (!qVar3.S) {
                        }
                        r.J(h4.g.f11907f, a112, qVar3);
                        r.J(h4.g.f11906e, l42, qVar3);
                        r.y(qVar3, Integer.valueOf(hashCode2), h4.g.f11908g);
                        r.F(h4.g.f11909h, qVar3);
                        r.J(h4.g.f11905d, c52, qVar3);
                        qVar3.X(1548498514);
                        i19 = 0;
                        while (i19 < i24) {
                        }
                        q qVar52 = qVar3;
                        qVar52.p(false);
                        qVar52.p(true);
                        tVar3 = tVar4;
                        qVar = qVar52;
                        lVar4 = lVar5;
                        str3 = str4;
                    } else {
                        qVar3.R();
                        qVar = qVar3;
                        tVar3 = tVar2;
                        lVar4 = lVar3;
                        str3 = str2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new g(list, i10, bookCoverSize, lVar, tVar3, lVar4, str3, i11, i12);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((599187 & i13) == 599186) {
                }
                if (!qVar3.O(i13 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar3 = lVar2;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            str2 = str;
            if ((599187 & i13) == 599186) {
            }
            if (!qVar3.O(i13 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 32;
        if (i15 == 0) {
        }
        lVar3 = lVar2;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        str2 = str;
        if ((599187 & i13) == 599186) {
        }
        if (!qVar3.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z BookGridRow$lambda$1$0$0(l lVar, ExploreRead exploreRead) {
        lVar.invoke(exploreRead.getReadId());
        return z.f31622a;
    }

    public static final z BookGridRow$lambda$2(List list, int i10, BookCoverSize bookCoverSize, l lVar, t tVar, l lVar2, String str, int i11, int i12, m mVar, int i13) {
        BookGridRow(list, i10, bookCoverSize, lVar, tVar, lVar2, str, mVar, r.M(i11 | 1), i12);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreLargeGridCollection(String str, String str2, List<ExploreRead> list, l lVar, ho.a aVar, t tVar, Integer num, l lVar2, String str3, m mVar, int i10, int i11) {
        int i12;
        String str4;
        t tVar2;
        int i13;
        int i14;
        Integer num2;
        int i15;
        int i16;
        l lVar3;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        String str5;
        t tVar3;
        Integer num3;
        l lVar4;
        r1 r10;
        t tVar4;
        Integer num4;
        l lVar5;
        String str6;
        i3.q qVar;
        t tVar5;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        list.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1779963528);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i12 = i25 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            str4 = str2;
            if (qVar2.f(str4)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i12 |= i24;
        } else {
            str4 = str2;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(list)) {
                i23 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i23 = 128;
            }
            i12 |= i23;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar)) {
                i22 = 2048;
            } else {
                i22 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i22;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar)) {
                i21 = 16384;
            } else {
                i21 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i21;
        }
        int i26 = i11 & 32;
        if (i26 != 0) {
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
                if (i16 != 0) {
                    i12 |= 12582912;
                } else if ((12582912 & i10) == 0) {
                    lVar3 = lVar2;
                    if (qVar2.h(lVar3)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                    i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i18 == 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (qVar2.f(str3)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i20 & 38347923) == 38347922) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i20 & 1, z6)) {
                        i3.q qVar3 = i3.q.f13017a;
                        if (i26 != 0) {
                            tVar4 = qVar3;
                        } else {
                            tVar4 = tVar2;
                        }
                        if (i14 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str3;
                        }
                        t e10 = p2.e(tVar4, 1.0f);
                        x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                        int hashCode = Long.hashCode(qVar2.T);
                        o l4 = qVar2.l();
                        t c5 = i3.a.c(e10, qVar2);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(h4.g.f11907f, a10, qVar2);
                        r.J(h4.g.f11906e, l4, qVar2);
                        r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                        r.F(h4.g.f11909h, qVar2);
                        r.J(h4.g.f11905d, c5, qVar2);
                        if (str != null) {
                            qVar2.X(-1881681746);
                            tVar5 = tVar4;
                            qVar = qVar3;
                            ExploreSectionHeaderKt.ExploreSectionHeader(str, null, str4, null, qVar2, ((i20 << 3) & 896) | (i20 & 14), 10);
                            ib.i.o(EchoTheme.INSTANCE, qVar2, EchoTheme.$stable, qVar, qVar2);
                            qVar2.p(false);
                        } else {
                            qVar = qVar3;
                            tVar5 = tVar4;
                            qVar2.X(-1881491468);
                            qVar2.p(false);
                        }
                        r1.d.a(p2.e(qVar, 1.0f), null, false, c3.k.d(1280421700, true, new io.elevenlabs.readerapp.ui.screens.authenticated.a(list, num4, lVar, lVar5, str6), qVar2), qVar2, 3078, 6);
                        if (aVar != null) {
                            qVar2.X(-1880373794);
                            EchoTheme echoTheme = EchoTheme.INSTANCE;
                            int i27 = EchoTheme.$stable;
                            r1.d.g(p2.f(qVar, echoTheme.getSpacings(qVar2, i27).getX2()), qVar2);
                            EchoButtonKt.m1835EchoButton562pCRU(kj.c.R(qVar2, R.string.explore_collection_button_see_all), aVar, r1.d.G(qVar, echoTheme.getSpacings(qVar2, i27).getX5(), u.P, 2), EchoButtonVariant.Secondary, null, null, false, false, new h5.f(500), false, false, qVar2, ((i20 >> 9) & 112) | 100666368, 0, 1776);
                            qVar2 = qVar2;
                            qVar2.p(false);
                        } else {
                            qVar2.X(-1879952876);
                            qVar2.p(false);
                        }
                        qVar2.p(true);
                        num3 = num4;
                        lVar4 = lVar5;
                        str5 = str6;
                        tVar3 = tVar5;
                    } else {
                        qVar2.R();
                        str5 = str3;
                        tVar3 = tVar2;
                        num3 = num2;
                        lVar4 = lVar3;
                    }
                    r10 = qVar2.r();
                    if (r10 == null) {
                        r10.f34012d = new h(str, str2, list, lVar, aVar, tVar3, num3, lVar4, str5, i10, i11);
                        return;
                    }
                    return;
                }
                lVar3 = lVar2;
                i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i18 == 0) {
                }
                i20 = i12;
                if ((i20 & 38347923) == 38347922) {
                }
                if (!qVar2.O(i20 & 1, z6)) {
                }
                r10 = qVar2.r();
                if (r10 == null) {
                }
            }
            num2 = num;
            i16 = i11 & 128;
            if (i16 != 0) {
            }
            lVar3 = lVar2;
            i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i18 == 0) {
            }
            i20 = i12;
            if ((i20 & 38347923) == 38347922) {
            }
            if (!qVar2.O(i20 & 1, z6)) {
            }
            r10 = qVar2.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        num2 = num;
        i16 = i11 & 128;
        if (i16 != 0) {
        }
        lVar3 = lVar2;
        i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i18 == 0) {
        }
        i20 = i12;
        if ((i20 & 38347923) == 38347922) {
        }
        if (!qVar2.O(i20 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final z ExploreLargeGridCollection$lambda$0$0(List list, Integer num, l lVar, l lVar2, String str, r1.u uVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        List list2 = list;
        uVar.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(uVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            sn.k m1405rememberGridLayout8Feqmps = m1405rememberGridLayout8Feqmps(((v) uVar).d(), qVar, 0);
            BookCoverSize bookCoverSize = (BookCoverSize) m1405rememberGridLayout8Feqmps.f31600a;
            int intValue = ((Number) m1405rememberGridLayout8Feqmps.f31601b).intValue();
            boolean f10 = qVar.f(list2) | qVar.f(num) | qVar.d(intValue);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                if (num != null) {
                    list2 = tn.o.b1(list2, num.intValue() * intValue);
                }
                L = tn.o.l0(list2, intValue);
                qVar.h0(L);
            }
            List list3 = (List) L;
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            t G = r1.d.G(e10, echoTheme.getSpacings(qVar, i13).getX5(), u.P, 2);
            u0 u0Var = r1.j.f29228a;
            x a10 = w.a(ib.i.y(echoTheme, qVar, i13), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(G, qVar);
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
            Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c5, h4.g.f11905d, 248483220, list3);
            while (s10.hasNext()) {
                BookGridRow((List) s10.next(), intValue, bookCoverSize, lVar, null, lVar2, str, qVar, 0, 16);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreLargeGridCollection$lambda$1(String str, String str2, List list, l lVar, ho.a aVar, t tVar, Integer num, l lVar2, String str3, int i10, int i11, m mVar, int i12) {
        ExploreLargeGridCollection(str, str2, list, lVar, aVar, tVar, num, lVar2, str3, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* renamed from: LargeBookGridItem--b7W0Lw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1404LargeBookGridItemb7W0Lw(ExploreRead exploreRead, ho.a aVar, BookCoverSize bookCoverSize, float f10, t tVar, l lVar, String str, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        l lVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z6;
        t tVar3;
        l lVar3;
        q qVar;
        r1 r10;
        t tVar4;
        l lVar4;
        String str2;
        boolean z10;
        long j4;
        ho.a aVar2;
        boolean z11;
        ?? r22;
        Double d10;
        String formatSecondsAsDuration;
        q qVar2;
        int i19;
        int i20;
        int i21;
        int i22;
        exploreRead.getClass();
        aVar.getClass();
        bookCoverSize.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(-1521959185);
        if ((i10 & 6) == 0) {
            if (qVar3.h(exploreRead)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(aVar)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.d(bookCoverSize.ordinal())) {
                i20 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i20 = 128;
            }
            i12 |= i20;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.c(f10)) {
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
            if (qVar3.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 32;
            if (i14 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                lVar2 = lVar;
                if (qVar3.h(lVar2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
                i16 = i11 & 64;
                if (i16 != 0) {
                    i12 |= 1572864;
                } else if ((1572864 & i10) == 0) {
                    if (qVar3.f(str)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                    i18 = i12;
                    if ((599187 & i12) == 599186) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar3.O(i18 & 1, z6)) {
                        i3.q qVar4 = i3.q.f13017a;
                        if (i23 != 0) {
                            tVar4 = qVar4;
                        } else {
                            tVar4 = tVar2;
                        }
                        if (i14 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        t e10 = p2.e(tVar4, 1.0f);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i24 = EchoTheme.$stable;
                        t c5 = m3.h.c(e10, echoTheme.getShapes(qVar3, i24).getSm(qVar3, EchoThemeShapes.$stable));
                        if ((i18 & 112) == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Object L = qVar3.L();
                        Object obj = u2.l.f33918a;
                        if (z10 || L == obj) {
                            L = new fm.g(19, aVar);
                            qVar3.h0(L);
                        }
                        t p10 = n.p(c5, false, null, null, null, (ho.a) L, 15);
                        i3.j jVar = i3.d.C0;
                        u0 u0Var = r1.j.f29228a;
                        x a10 = w.a(ib.i.y(echoTheme, qVar3, i24), jVar, qVar3, 48);
                        int hashCode = Long.hashCode(qVar3.T);
                        o l4 = qVar3.l();
                        t c10 = i3.a.c(p10, qVar3);
                        h4.h.f11920i.getClass();
                        t tVar5 = tVar4;
                        h4.f fVar = h4.g.f11903b;
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        h4.e eVar = h4.g.f11907f;
                        r.J(eVar, a10, qVar3);
                        h4.e eVar2 = h4.g.f11906e;
                        r.J(eVar2, l4, qVar3);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar3 = h4.g.f11908g;
                        r.y(qVar3, valueOf, eVar3);
                        h4.d dVar = h4.g.f11909h;
                        r.F(dVar, qVar3);
                        h4.e eVar4 = h4.g.f11905d;
                        r.J(eVar4, c10, qVar3);
                        t w6 = p2.w(p2.f(p2.e(qVar4, 1.0f), f10), i3.d.Z, 2);
                        long j10 = p3.x.f26437l;
                        String coverImageUrl = ExploreKt.coverImageUrl(exploreRead, CoverImageSize.Medium);
                        String title = exploreRead.getTitle();
                        if (lVar4 == null) {
                            qVar3.X(-416609532);
                            qVar3.p(false);
                            j4 = j10;
                            aVar2 = null;
                        } else {
                            qVar3.X(-416609531);
                            if (exploreRead.getPreviewAudioUrl() == null) {
                                qVar3.X(-288001144);
                                qVar3.p(false);
                                j4 = j10;
                                z11 = false;
                                aVar2 = null;
                            } else {
                                qVar3.X(-288001143);
                                boolean f11 = qVar3.f(lVar4) | qVar3.h(exploreRead);
                                Object L2 = qVar3.L();
                                if (!f11) {
                                    j4 = j10;
                                    if (L2 != obj) {
                                        aVar2 = (ho.a) L2;
                                        z11 = false;
                                        qVar3.p(false);
                                    }
                                } else {
                                    j4 = j10;
                                }
                                L2 = new io.elevenlabs.readerapp.ui.components.explore.o(lVar4, exploreRead, 1);
                                qVar3.h0(L2);
                                aVar2 = (ho.a) L2;
                                z11 = false;
                                qVar3.p(false);
                            }
                            qVar3.p(z11);
                        }
                        long j11 = j4;
                        l lVar5 = lVar4;
                        str = str2;
                        ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(coverImageUrl, bookCoverSize, w6, u.P, false, false, j11, j11, title, null, aVar2, kotlin.jvm.internal.m.c(str2, exploreRead.getReadId()), exploreRead.getBlurPlaceholder(), exploreRead.getCoverAspectRatio(), true, null, qVar3, ((i18 >> 3) & 112) | 14155776, 24576, 33336);
                        x a11 = w.a(r1.j.g(echoTheme.getSpacings(qVar3, i24).getX1()), jVar, qVar3, 48);
                        int hashCode2 = Long.hashCode(qVar3.T);
                        o l7 = qVar3.l();
                        t c11 = i3.a.c(qVar4, qVar3);
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        r.J(eVar, a11, qVar3);
                        r.J(eVar2, l7, qVar3);
                        defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
                        r.J(eVar4, c11, qVar3);
                        String title2 = exploreRead.getTitle();
                        EchoThemeTypography typography = echoTheme.getTypography(qVar3, i24);
                        int i25 = EchoThemeTypography.$stable;
                        y0 baseCompact400 = typography.getBaseCompact400(qVar3, i25);
                        EchoThemeColors.Text text = echoTheme.getColors(qVar3, i24).getText();
                        int i26 = EchoThemeColors.Text.$stable;
                        j7.d(title2, null, text.getPrimary(qVar3, i26), 0L, null, 0L, new e5.k(3), 0L, 2, false, 1, 0, null, baseCompact400, qVar3, 0, 24960, 109562);
                        String author = exploreRead.getAuthor();
                        if (author == null) {
                            qVar3.X(-1690085169);
                            author = kj.c.R(qVar3, R.string.home_unknown_author);
                            r22 = 0;
                        } else {
                            r22 = 0;
                            qVar3.X(-1690085634);
                        }
                        qVar3.p(r22);
                        j7.d(author, null, ib.i.b(i24, i26, echoTheme, qVar3, qVar3), 0L, null, 0L, new e5.k(3), 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar3, i24).getSmCompact400(qVar3, i25), qVar3, 0, 24960, 109562);
                        q qVar5 = qVar3;
                        if (exploreRead.getAudioDurationSeconds() != null) {
                            d10 = Double.valueOf(r0.floatValue());
                        } else {
                            d10 = null;
                        }
                        if (d10 == null) {
                            qVar5.X(-852608699);
                            qVar5.p(r22);
                            formatSecondsAsDuration = null;
                        } else {
                            qVar5.X(-1690071492);
                            formatSecondsAsDuration = MinutesFormatterKt.formatSecondsAsDuration(d10.doubleValue(), qVar5, r22);
                            qVar5.p(r22);
                        }
                        if (formatSecondsAsDuration == null) {
                            qVar5.X(-852550388);
                            qVar5.p(r22);
                            qVar2 = qVar5;
                        } else {
                            qVar5.X(-852550387);
                            j7.d(formatSecondsAsDuration, null, echoTheme.getColors(qVar5, i24).getText().getQuaternary(qVar5, i26), 0L, null, 0L, new e5.k(3), 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar5, i24).getSmCompact400(qVar5, i25), qVar5, 0, 24960, 109562);
                            q qVar6 = qVar5;
                            qVar6.p(r22);
                            qVar2 = qVar6;
                        }
                        ExploreReadCardKt.m1168ExploreReadPriceRowFNF3uiM(exploreRead, null, echoTheme.getColors(qVar2, i24).getText().getQuaternary(qVar2, i26), qVar2, i18 & 14, 2);
                        qVar2.p(true);
                        qVar2.p(true);
                        lVar3 = lVar5;
                        tVar3 = tVar5;
                        qVar = qVar2;
                    } else {
                        q qVar7 = qVar3;
                        qVar7.R();
                        tVar3 = tVar2;
                        lVar3 = lVar2;
                        qVar = qVar7;
                    }
                    String str3 = str;
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new f(exploreRead, aVar, bookCoverSize, f10, tVar3, lVar3, str3, i10, i11);
                        return;
                    }
                    return;
                }
                i18 = i12;
                if ((599187 & i12) == 599186) {
                }
                if (!qVar3.O(i18 & 1, z6)) {
                }
                String str32 = str;
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar2 = lVar;
            i16 = i11 & 64;
            if (i16 != 0) {
            }
            i18 = i12;
            if ((599187 & i12) == 599186) {
            }
            if (!qVar3.O(i18 & 1, z6)) {
            }
            String str322 = str;
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        lVar2 = lVar;
        i16 = i11 & 64;
        if (i16 != 0) {
        }
        i18 = i12;
        if ((599187 & i12) == 599186) {
        }
        if (!qVar3.O(i18 & 1, z6)) {
        }
        String str3222 = str;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z LargeBookGridItem__b7W0Lw$lambda$0$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z LargeBookGridItem__b7W0Lw$lambda$1$0$0$0$0(l lVar, ExploreRead exploreRead) {
        lVar.invoke(exploreRead);
        return z.f31622a;
    }

    public static final z LargeBookGridItem__b7W0Lw$lambda$2(ExploreRead exploreRead, ho.a aVar, BookCoverSize bookCoverSize, float f10, t tVar, l lVar, String str, int i10, int i11, m mVar, int i12) {
        m1404LargeBookGridItemb7W0Lw(exploreRead, aVar, bookCoverSize, f10, tVar, lVar, str, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreLargeGridCollection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1266052928);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLargeGridCollectionKt.INSTANCE.m1381getLambda$1469091802$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 11);
        }
    }

    public static final z Preview_ExploreLargeGridCollection$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLargeGridCollection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLargeGridCollection_LimitedRows(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(825023884);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLargeGridCollectionKt.INSTANCE.getLambda$710784370$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 10);
        }
    }

    public static final z Preview_ExploreLargeGridCollection_LimitedRows$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLargeGridCollection_LimitedRows(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLargeGridCollection_MixedAspects(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1125286973);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLargeGridCollectionKt.INSTANCE.m1383getLambda$371744611$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 9);
        }
    }

    public static final z Preview_ExploreLargeGridCollection_MixedAspects$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLargeGridCollection_MixedAspects(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLargeGridCollection_NoHeader(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(57555445);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLargeGridCollectionKt.INSTANCE.m1380getLambda$1466901553$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 4);
        }
    }

    public static final z Preview_ExploreLargeGridCollection_NoHeader$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLargeGridCollection_NoHeader(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLargeGridCollection_NoSeeAll(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(549555732);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLargeGridCollectionKt.INSTANCE.m1386getLambda$974901266$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 7);
        }
    }

    public static final z Preview_ExploreLargeGridCollection_NoSeeAll$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLargeGridCollection_NoSeeAll(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLargeGridCollection_PricingStates(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1797115241);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLargeGridCollectionKt.INSTANCE.getLambda$87861501$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 5);
        }
    }

    public static final z Preview_ExploreLargeGridCollection_PricingStates$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLargeGridCollection_PricingStates(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLargeGridCollection_Squarish(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1198834323);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLargeGridCollectionKt.INSTANCE.getLambda$1571675975$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 8);
        }
    }

    public static final z Preview_ExploreLargeGridCollection_Squarish$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLargeGridCollection_Squarish(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLargeGridCollection_Tablet(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1052038979);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLargeGridCollectionKt.INSTANCE.m1384getLambda$562005737$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 6);
        }
    }

    public static final z Preview_ExploreLargeGridCollection_Tablet$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLargeGridCollection_Tablet(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void pagedBookGrid(t1.t tVar, final ua.b bVar, final int i10, final BookCoverSize bookCoverSize, final l lVar, final l lVar2, final String str) {
        tVar.getClass();
        bVar.getClass();
        bookCoverSize.getClass();
        lVar.getClass();
        t1.t.d(tVar, ((bVar.c() + i10) - 1) / i10, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.e
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                z pagedBookGrid$lambda$0;
                int intValue = ((Integer) obj4).intValue();
                pagedBookGrid$lambda$0 = ExploreLargeGridCollectionKt.pagedBookGrid$lambda$0(i10, bookCoverSize, lVar, lVar2, str, bVar, (t1.b) obj, ((Integer) obj2).intValue(), (m) obj3, intValue);
                return pagedBookGrid$lambda$0;
            }
        }, true, -700451462), 6);
    }

    public static /* synthetic */ void pagedBookGrid$default(t1.t tVar, ua.b bVar, int i10, BookCoverSize bookCoverSize, l lVar, l lVar2, String str, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            lVar2 = null;
        }
        if ((i11 & 32) != 0) {
            str = null;
        }
        pagedBookGrid(tVar, bVar, i10, bookCoverSize, lVar, lVar2, str);
    }

    public static final z pagedBookGrid$lambda$0(int i10, BookCoverSize bookCoverSize, l lVar, l lVar2, String str, ua.b bVar, t1.b bVar2, int i11, m mVar, int i12) {
        int i13;
        boolean z6;
        float f10;
        ExploreRead exploreRead;
        int i14;
        bVar2.getClass();
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
            int i15 = i11 * i10;
            no.g f02 = ae.l.f0(0, i10);
            ArrayList arrayList = new ArrayList(p.a0(f02, 10));
            Iterator it = f02.iterator();
            while (((no.f) it).f24561c) {
                int nextInt = ((y) it).nextInt() + i15;
                if (nextInt < bVar.c()) {
                    exploreRead = (ExploreRead) bVar.b(nextInt);
                } else {
                    exploreRead = null;
                }
                arrayList.add(exploreRead);
            }
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i16 = EchoTheme.$stable;
            float x52 = echoTheme.getSpacings(qVar, i16).getX5();
            float x53 = echoTheme.getSpacings(qVar, i16).getX5();
            if (i11 > 0) {
                qVar.X(1176032316);
                f10 = echoTheme.getSpacings(qVar, i16).getX4();
                qVar.p(false);
            } else {
                qVar.X(1176032636);
                qVar.p(false);
                f10 = 0;
            }
            BookGridRow(arrayList, i10, bookCoverSize, lVar, r1.d.I(i3.q.f13017a, x52, f10, x53, u.P, 8), lVar2, str, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: rememberGridLayout-8Feqmps */
    public static final sn.k m1405rememberGridLayout8Feqmps(float f10, m mVar, int i10) {
        boolean z6;
        BookCoverSize bookCoverSize;
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i11 = EchoTheme.$stable;
        float x42 = echoTheme.getSpacings(mVar, i11).getX4();
        float x52 = echoTheme.getSpacings(mVar, i11).getX5();
        if ((((i10 & 14) ^ 6) > 4 && ((q) mVar).c(f10)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        boolean c5 = z6 | qVar.c(x42) | qVar.c(x52);
        Object L = qVar.L();
        if (c5 || L == u2.l.f33918a) {
            if (h5.f.a(f10, ScreenWidthBreakpoints.INSTANCE.m1985getMediumD9Ej5fM()) >= 0) {
                bookCoverSize = BookCoverSize.XLarge;
            } else {
                bookCoverSize = BookCoverSize.Large;
            }
            L = new sn.k(bookCoverSize, Integer.valueOf(Math.max(2, (int) (((f10 - (x52 * 2)) + x42) / (h5.h.b(bookCoverSize.getSize()) + x42)))));
            qVar.h0(L);
        }
        return (sn.k) L;
    }
}

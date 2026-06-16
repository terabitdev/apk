package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import a2.a0;
import a2.d0;
import a2.v0;
import android.gov.nist.core.Separators;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import ho.l;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.domain.model.ListeningProgressKt;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ReadRowKt;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreCarouselDefaultsKt;
import io.elevenlabs.readerapp.ui.formatter.NumberFormatterKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.MenuKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import o1.k;
import q2.j7;
import q2.y2;
import q2.y4;
import r1.d2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.s;
import r1.w;
import r1.x;
import rd.c1;
import s4.y0;
import t1.z;
import t2.u;
import tn.p;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001ai\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aM\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"", "title", "", "Lio/elevenlabs/domain/model/ReadMeta;", "reads", "Lio/elevenlabs/domain/model/MediaItemState;", "playerQueue", "Li3/t;", "modifier", "Lkotlin/Function1;", "Lsn/z;", "onReadClick", "onReadLongClick", "HomeRecentReadsCarouselV4", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Li3/t;Lho/l;Lho/l;Lu2/m;II)V", "read", "Lio/elevenlabs/domain/model/ListeningProgress;", "progress", "", "isInQueue", "Lkotlin/Function0;", "onPress", "onLongPress", "RecentReadItemV4", "(Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/ListeningProgress;ZLho/a;Lho/a;Li3/t;Lu2/m;II)V", "isCompleted", "isAvailableOffline", "RecentReadStatusRowV4", "(Lio/elevenlabs/domain/model/ListeningProgress;ZZLu2/m;I)V", "Preview_HomeRecentReadsCarouselV4", "(Lu2/m;I)V", "menuExpanded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeRecentReadsCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeRecentReadsCarouselV4(String str, List<ReadMeta> list, List<MediaItemState> list2, t tVar, l lVar, l lVar2, m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        l lVar3;
        int i15;
        int i16;
        l lVar4;
        int i17;
        int i18;
        boolean z6;
        q qVar;
        t tVar2;
        l lVar5;
        l lVar6;
        r1 r10;
        t tVar3;
        l lVar7;
        l lVar8;
        u2.e eVar;
        t tVar4;
        boolean z10;
        int i19;
        i3.q qVar2;
        int i20;
        EchoTheme echoTheme;
        boolean z11;
        Object obj;
        boolean f10;
        Object L;
        boolean z12;
        boolean z13;
        boolean z14;
        Object L2;
        l lVar9;
        l lVar10;
        int i21;
        int i22;
        int i23;
        str.getClass();
        list.getClass();
        list2.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(1546328805);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(list)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(list2)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        int i24 = i11 & 8;
        if (i24 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (qVar3.f(tVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                lVar3 = lVar;
                if (qVar3.h(lVar3)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    lVar4 = lVar2;
                    if (qVar3.h(lVar4)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    i18 = i12;
                    if ((i18 & 74899) == 74898) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar3.O(i18 & 1, z6)) {
                        i3.q qVar4 = i3.q.f13017a;
                        if (i24 != 0) {
                            tVar3 = qVar4;
                        } else {
                            tVar3 = tVar;
                        }
                        u2.e eVar2 = u2.l.f33918a;
                        if (i14 != 0) {
                            Object L3 = qVar3.L();
                            if (L3 == eVar2) {
                                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(10);
                                qVar3.h0(L3);
                            }
                            lVar7 = (l) L3;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i16 != 0) {
                            Object L4 = qVar3.L();
                            if (L4 == eVar2) {
                                L4 = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(11);
                                qVar3.h0(L4);
                            }
                            lVar8 = (l) L4;
                        } else {
                            lVar8 = lVar4;
                        }
                        boolean f11 = qVar3.f(list);
                        Object L5 = qVar3.L();
                        Object obj2 = L5;
                        if (f11 || L5 == eVar2) {
                            ArrayList arrayList = new ArrayList(p.a0(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ReadMetaKt.coverImageUrl((ReadMeta) it.next(), CoverImageSize.Thumbnail));
                            }
                            qVar3.h0(arrayList);
                            obj2 = arrayList;
                        }
                        ExploreCarouselDefaultsKt.PreloadCarouselImages((List) obj2, false, qVar3, 0, 2);
                        t e10 = p2.e(tVar3, 1.0f);
                        x a10 = w.a(j.f29230c, i3.d.B0, qVar3, 0);
                        int hashCode = Long.hashCode(qVar3.T);
                        o l4 = qVar3.l();
                        t c5 = i3.a.c(e10, qVar3);
                        h.f11920i.getClass();
                        f fVar = g.f11903b;
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        r.J(g.f11907f, a10, qVar3);
                        r.J(g.f11906e, l4, qVar3);
                        r.y(qVar3, Integer.valueOf(hashCode), g.f11908g);
                        r.F(g.f11909h, qVar3);
                        r.J(g.f11905d, c5, qVar3);
                        EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                        int i25 = EchoTheme.$stable;
                        j7.d(str, r1.d.G(qVar4, echoTheme2.getSpacings(qVar3, i25).getX5(), u.P, 2), echoTheme2.getColors(qVar3, i25).getText().getTertiary(qVar3, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar3, i25).getBaseRegular500(qVar3, EchoThemeTypography.$stable), qVar3, i18 & 14, 0, 131064);
                        i.o(echoTheme2, qVar3, i25, qVar4, qVar3);
                        z rememberCarouselLazyListState = ExploreCarouselDefaultsKt.rememberCarouselLazyListState(qVar3, 0);
                        boolean f12 = qVar3.f(list);
                        Object L6 = qVar3.L();
                        if (!f12) {
                            eVar = eVar2;
                            if (L6 != eVar) {
                                echoTheme = echoTheme2;
                                qVar2 = qVar4;
                                i20 = i25;
                                tVar4 = tVar3;
                                z10 = false;
                                obj = L6;
                                z11 = true;
                                i19 = 2;
                                String str2 = (String) obj;
                                f10 = qVar3.f(rememberCarouselLazyListState);
                                L = qVar3.L();
                                if (!f10 || L == eVar) {
                                    L = new HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$4$1$1(rememberCarouselLazyListState, null);
                                    qVar3.h0(L);
                                }
                                r.f((ho.p) L, str2, qVar3);
                                o1.g e11 = k.e(new h4.u(26, rememberCarouselLazyListState, o1.m.f24756c, false), qVar3);
                                d2 d10 = r1.d.d(echoTheme.getSpacings(qVar3, i20).getX5(), u.P, i19);
                                r1.h y10 = i.y(echoTheme, qVar3, i20);
                                t e12 = p2.e(qVar2, 1.0f);
                                boolean h10 = qVar3.h(list) | qVar3.h(list2);
                                if ((i18 & 57344) != 16384) {
                                    z12 = z11;
                                } else {
                                    z12 = z10;
                                }
                                boolean z15 = h10 | z12;
                                if ((i18 & 458752) != 131072) {
                                    z13 = z11;
                                } else {
                                    z13 = z10;
                                }
                                z14 = z15 | z13;
                                L2 = qVar3.L();
                                if (z14 && L2 != eVar) {
                                    lVar9 = lVar7;
                                    lVar10 = lVar8;
                                } else {
                                    lVar9 = lVar7;
                                    lVar10 = lVar8;
                                    v0 v0Var = new v0(list, list2, lVar9, lVar10, 10);
                                    qVar3.h0(v0Var);
                                    L2 = v0Var;
                                }
                                c1.d(e12, rememberCarouselLazyListState, d10, y10, null, e11, false, null, (l) L2, qVar3, 6, 424);
                                qVar = qVar3;
                                qVar.p(z11);
                                lVar5 = lVar9;
                                lVar6 = lVar10;
                                tVar2 = tVar4;
                            }
                        } else {
                            eVar = eVar2;
                        }
                        tVar4 = tVar3;
                        z10 = false;
                        qVar2 = qVar4;
                        echoTheme = echoTheme2;
                        i20 = i25;
                        z11 = true;
                        i19 = 2;
                        obj = tn.o.E0(list, null, null, null, new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(12), 31);
                        qVar3.h0(obj);
                        String str22 = (String) obj;
                        f10 = qVar3.f(rememberCarouselLazyListState);
                        L = qVar3.L();
                        if (!f10) {
                        }
                        L = new HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$4$1$1(rememberCarouselLazyListState, null);
                        qVar3.h0(L);
                        r.f((ho.p) L, str22, qVar3);
                        o1.g e112 = k.e(new h4.u(26, rememberCarouselLazyListState, o1.m.f24756c, false), qVar3);
                        d2 d102 = r1.d.d(echoTheme.getSpacings(qVar3, i20).getX5(), u.P, i19);
                        r1.h y102 = i.y(echoTheme, qVar3, i20);
                        t e122 = p2.e(qVar2, 1.0f);
                        boolean h102 = qVar3.h(list) | qVar3.h(list2);
                        if ((i18 & 57344) != 16384) {
                        }
                        boolean z152 = h102 | z12;
                        if ((i18 & 458752) != 131072) {
                        }
                        z14 = z152 | z13;
                        L2 = qVar3.L();
                        if (z14) {
                        }
                        lVar9 = lVar7;
                        lVar10 = lVar8;
                        v0 v0Var2 = new v0(list, list2, lVar9, lVar10, 10);
                        qVar3.h0(v0Var2);
                        L2 = v0Var2;
                        c1.d(e122, rememberCarouselLazyListState, d102, y102, null, e112, false, null, (l) L2, qVar3, 6, 424);
                        qVar = qVar3;
                        qVar.p(z11);
                        lVar5 = lVar9;
                        lVar6 = lVar10;
                        tVar2 = tVar4;
                    } else {
                        qVar = qVar3;
                        qVar.R();
                        tVar2 = tVar;
                        lVar5 = lVar3;
                        lVar6 = lVar4;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.f(str, list, list2, tVar2, lVar5, lVar6, i10, i11);
                        return;
                    }
                    return;
                }
                lVar4 = lVar2;
                i18 = i12;
                if ((i18 & 74899) == 74898) {
                }
                if (!qVar3.O(i18 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar3 = lVar;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            lVar4 = lVar2;
            i18 = i12;
            if ((i18 & 74899) == 74898) {
            }
            if (!qVar3.O(i18 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        lVar3 = lVar;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        lVar4 = lVar2;
        i18 = i12;
        if ((i18 & 74899) == 74898) {
        }
        if (!qVar3.O(i18 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z HomeRecentReadsCarouselV4$lambda$0$0(ReadMeta readMeta) {
        readMeta.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z HomeRecentReadsCarouselV4$lambda$1$0(ReadMeta readMeta) {
        readMeta.getClass();
        return sn.z.f31622a;
    }

    public static final CharSequence HomeRecentReadsCarouselV4$lambda$3$0$0(ReadMeta readMeta) {
        readMeta.getClass();
        return readMeta.getReadId();
    }

    public static final sn.z HomeRecentReadsCarouselV4$lambda$3$2$0(final List list, final List list2, final l lVar, final l lVar2, t1.t tVar) {
        tVar.getClass();
        final io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a aVar = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(13);
        final HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$lambda$3$2$0$$inlined$items$default$1 homeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$lambda$3$2$0$$inlined$items$default$1 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$lambda$3$2$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ReadMeta) obj);
            }

            @Override // ho.l
            public final Void invoke(ReadMeta readMeta) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$lambda$3$2$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$lambda$3$2$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$lambda$3$2$0$$inlined$items$default$4
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
                    i12 = i11 | i14;
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
                boolean z10 = true;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final ReadMeta readMeta = (ReadMeta) list.get(i10);
                    qVar.X(627662101);
                    boolean f10 = qVar.f(readMeta.getReadId()) | qVar.e(readMeta.getLastListenedCharOffset()) | qVar.f(readMeta.getLastListenedAudioSeconds());
                    Object L = qVar.L();
                    Object obj = u2.l.f33918a;
                    if (f10 || L == obj) {
                        L = ListeningProgressKt.getListeningProgress(readMeta);
                        qVar.h0(L);
                    }
                    ListeningProgress listeningProgress = (ListeningProgress) L;
                    boolean f11 = qVar.f(readMeta) | qVar.f(list2);
                    Object L2 = qVar.L();
                    if (f11 || L2 == obj) {
                        List list3 = list2;
                        if (list3 == null || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                if (kotlin.jvm.internal.m.c(((MediaItemState) it.next()).getReadId(), readMeta.getReadId())) {
                                    break;
                                }
                            }
                        }
                        z10 = false;
                        L2 = Boolean.valueOf(z10);
                        qVar.h0(L2);
                    }
                    boolean booleanValue = ((Boolean) L2).booleanValue();
                    boolean f12 = qVar.f(lVar) | qVar.h(readMeta);
                    Object L3 = qVar.L();
                    if (f12 || L3 == obj) {
                        final l lVar3 = lVar;
                        L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$4$2$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1448invoke() {
                                l.this.invoke(readMeta);
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1448invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L3);
                    }
                    ho.a aVar2 = (ho.a) L3;
                    boolean f13 = qVar.f(lVar2) | qVar.h(readMeta);
                    Object L4 = qVar.L();
                    if (f13 || L4 == obj) {
                        final l lVar4 = lVar2;
                        L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt$HomeRecentReadsCarouselV4$4$2$1$2$2$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1449invoke() {
                                l.this.invoke(readMeta);
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1449invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L4);
                    }
                    HomeRecentReadsCarouselKt.RecentReadItemV4(readMeta, listeningProgress, booleanValue, aVar2, (ho.a) L4, ((t1.c) bVar).e(0.85f), qVar, 0, 0);
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

    public static final Object HomeRecentReadsCarouselV4$lambda$3$2$0$0(ReadMeta readMeta) {
        readMeta.getClass();
        return readMeta.getReadId();
    }

    public static final sn.z HomeRecentReadsCarouselV4$lambda$4(String str, List list, List list2, t tVar, l lVar, l lVar2, int i10, int i11, m mVar, int i12) {
        HomeRecentReadsCarouselV4(str, list, list2, tVar, lVar, lVar2, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_HomeRecentReadsCarouselV4(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1016980208);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeRecentReadsCarouselKt.INSTANCE.m1429getLambda$1638447402$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 19);
        }
    }

    public static final sn.z Preview_HomeRecentReadsCarouselV4$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeRecentReadsCarouselV4(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecentReadItemV4(ReadMeta readMeta, ListeningProgress listeningProgress, boolean z6, ho.a aVar, ho.a aVar2, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z10;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        q qVar2 = (q) mVar;
        qVar2.Z(1787144764);
        if ((i10 & 6) == 0) {
            if (qVar2.h(readMeta)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(listeningProgress)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.g(z6)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar2)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i14;
        }
        int i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            if ((74899 & i12) == 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar2.O(i12 & 1, z10)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = r.A(Boolean.FALSE);
                    qVar2.h0(L);
                }
                z0 z0Var = (z0) L;
                String title = readMeta.getTitle();
                Object L2 = qVar2.L();
                if (L2 == eVar) {
                    L2 = new d0(z0Var, 18);
                    qVar2.h0(L2);
                }
                qVar = qVar2;
                t tVar5 = tVar4;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, aVar, tVar5, 0L, false, 0, null, false, (ho.a) L2, c3.k.d(-1597082848, true, new io.elevenlabs.readerapp.ui.screens.authenticated.author.j(readMeta, listeningProgress, z0Var, aVar2, z6), qVar2), qVar, ((i12 >> 6) & 112) | 905969664 | ((i12 >> 9) & 896), 248);
                tVar3 = tVar5;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.ocr.o(readMeta, listeningProgress, z6, aVar, aVar2, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar2.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final boolean RecentReadItemV4$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void RecentReadItemV4$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z RecentReadItemV4$lambda$3$0(z0 z0Var) {
        RecentReadItemV4$lambda$2(z0Var, true);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final sn.z RecentReadItemV4$lambda$4(ReadMeta readMeta, ListeningProgress listeningProgress, z0 z0Var, ho.a aVar, boolean z6, s sVar, m mVar, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        z0 z0Var2;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            k2 a10 = i2.a(j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h.f11920i.getClass();
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
            BookCoverSize bookCoverSize = BookCoverSize.XSmall;
            t f10 = p2.f(qVar2, h5.h.a(bookCoverSize.getSize()));
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(f10, qVar);
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
            String coverImageUrl = ReadMetaKt.coverImageUrl(readMeta, CoverImageSize.Thumbnail);
            long j4 = p3.x.f26437l;
            ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(coverImageUrl, bookCoverSize, null, u.P, false, false, j4, j4, null, null, null, false, readMeta.getBlurPlaceholder(), readMeta.getCoverAspectRatio(), true, null, qVar, 14155824, 24576, 36668);
            qVar.p(true);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i12 = EchoTheme.$stable;
            r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i12).getX3()), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            x a11 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            o l10 = qVar.l();
            t c11 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a11, qVar);
            r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c11, qVar);
            String title = readMeta.getTitle();
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i12);
            int i13 = EchoThemeTypography.$stable;
            y0 baseRegular500 = typography.getBaseRegular500(qVar, i13);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i12).getText();
            int i14 = EchoThemeColors.Text.$stable;
            j7.d(title, null, text.getPrimary(qVar, i14), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, baseRegular500, qVar, 0, 24960, 110586);
            q qVar3 = qVar;
            String description = readMeta.getDescription();
            if (description == null || n.m0(description)) {
                i11 = 0;
                qVar3.X(-2044298488);
                qVar3.p(false);
            } else {
                qVar3.X(-2044689615);
                r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar3, i12).getX0_5()), qVar3);
                j7.d(description, null, i.B(i12, i14, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, echoTheme.getTypography(qVar3, i12).getSmRegular400(qVar3, i13), qVar3, 0, 24960, 110586);
                qVar3 = qVar3;
                i11 = 0;
                qVar3.p(false);
            }
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar3, i12).getX1_5()), qVar3);
            if (readMeta.getCompletedAt() != null) {
                z11 = 1;
            } else {
                z11 = i11;
            }
            RecentReadStatusRowV4(listeningProgress, z11, ReadMetaKt.isAvailableOffline(readMeta), qVar3, i11);
            qVar3.p(true);
            qVar3.p(true);
            boolean RecentReadItemV4$lambda$1 = RecentReadItemV4$lambda$1(z0Var);
            Object L = qVar3.L();
            if (L == u2.l.f33918a) {
                z0Var2 = z0Var;
                L = new d0(z0Var2, 17);
                qVar3.h0(L);
            } else {
                z0Var2 = z0Var;
            }
            ho.a aVar2 = (ho.a) L;
            float f11 = 0;
            MenuKt.m1842MenuILWXrKs(RecentReadItemV4$lambda$1, aVar2, null, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), null, ig.f.H(c3.k.d(2056486864, true, new e(aVar, z6, z0Var2), qVar3)), qVar3, 199728, 20);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z RecentReadItemV4$lambda$4$1$0(z0 z0Var) {
        RecentReadItemV4$lambda$2(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z RecentReadItemV4$lambda$4$2(ho.a aVar, boolean z6, z0 z0Var, m mVar, int i10) {
        boolean z10;
        int i11;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.c(aVar, z0Var, 1);
                qVar.h0(L);
            }
            ho.a aVar2 = (ho.a) L;
            if (z6) {
                i11 = R.string.menu_item_player_remove_from_queue;
            } else {
                i11 = R.string.menu_item_player_add_to_queue;
            }
            MenuKt.MenuItem(aVar2, false, kj.c.R(qVar, i11), Integer.valueOf(io.elevenlabs.ui.R.drawable.playlist_add), false, false, qVar, 0, 50);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z RecentReadItemV4$lambda$4$2$0$0(ho.a aVar, z0 z0Var) {
        RecentReadItemV4$lambda$2(z0Var, false);
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z RecentReadItemV4$lambda$5(ReadMeta readMeta, ListeningProgress listeningProgress, boolean z6, ho.a aVar, ho.a aVar2, t tVar, int i10, int i11, m mVar, int i12) {
        RecentReadItemV4(readMeta, listeningProgress, z6, aVar, aVar2, tVar, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void RecentReadStatusRowV4(ListeningProgress listeningProgress, boolean z6, boolean z10, m mVar, int i10) {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        i3.q qVar;
        i3.q qVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        ListeningProgress listeningProgress2 = listeningProgress;
        q qVar3 = (q) mVar;
        qVar3.Z(-295207459);
        if ((i10 & 6) == 0) {
            if (qVar3.h(listeningProgress2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.g(z6)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.g(z10)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i11 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar3.O(i11 & 1, z11)) {
            if (listeningProgress2.getCurrentUnits() == 0.0d) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z6 && !listeningProgress2.isAtEnd()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z12 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            k2 a10 = i2.a(j.f29228a, i3.d.f13005z0, qVar3, 48);
            int hashCode = Long.hashCode(qVar3.T);
            o l4 = qVar3.l();
            i3.q qVar4 = i3.q.f13017a;
            t c5 = i3.a.c(qVar4, qVar3);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(g.f11907f, a10, qVar3);
            r.J(g.f11906e, l4, qVar3);
            r.y(qVar3, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar3);
            r.J(g.f11905d, c5, qVar3);
            if (z14) {
                qVar3.X(-1830783702);
                t o6 = p2.o(qVar4, 16);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i16 = EchoTheme.$stable;
                EchoThemeColors.Icon icon = echoTheme.getColors(qVar3, i16).getIcon();
                int i17 = EchoThemeColors.Icon.$stable;
                long primary = icon.getPrimary(qVar3, i17);
                long inactive = echoTheme.getColors(qVar3, i16).getIcon().getInactive(qVar3, i17);
                int i18 = i11;
                float f10 = (float) 1.5d;
                boolean h10 = qVar3.h(listeningProgress2);
                Object L = qVar3.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new a0(listeningProgress2, 29);
                    qVar3.h0(L);
                }
                y4.b((ho.a) L, o6, primary, f10, inactive, 1, u.P, qVar3, 3120);
                r1.d.g(p2.s(qVar4, echoTheme.getSpacings(qVar3, i16).getX1_5()), qVar3);
                String B = defpackage.f.B(NumberFormatterKt.formatInteger(listeningProgress2.getProgressPercent(), (m) qVar3, 0), Separators.PERCENT);
                EchoThemeTypography typography = echoTheme.getTypography(qVar3, i16);
                int i19 = EchoThemeTypography.$stable;
                y0 smRegular400 = typography.getSmRegular400(qVar3, i19);
                EchoThemeColors.Text text = echoTheme.getColors(qVar3, i16).getText();
                int i20 = EchoThemeColors.Text.$stable;
                qVar = qVar4;
                j7.d(B, null, text.getTertiary(qVar3, i20), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, smRegular400, qVar3, 0, 0, 131066);
                j7.d(" · ", null, i.B(i16, i20, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar3, i16).getSmRegular400(qVar3, i19), qVar3, 6, 0, 131066);
                listeningProgress2 = listeningProgress;
                j7.d(kj.c.Q(R.string.common_time_left, new Object[]{ReadRowKt.formatDuration(listeningProgress, listeningProgress.getRemainingUnits(), qVar3, i18 & 14)}, qVar3), null, i.B(i16, i20, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 0, false, 1, 0, null, echoTheme.getTypography(qVar3, i16).getSmRegular400(qVar3, i19), qVar3, 0, 24576, 114682);
                qVar3 = qVar3;
                qVar3.p(false);
            } else {
                qVar = qVar4;
                qVar3.X(-1829619776);
                String formatDuration = ReadRowKt.formatDuration(listeningProgress2, listeningProgress2.getTotalUnits(), qVar3, i11 & 14);
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i21 = EchoTheme.$stable;
                j7.d(formatDuration, null, echoTheme2.getColors(qVar3, i21).getText().getTertiary(qVar3, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 1, 0, null, echoTheme2.getTypography(qVar3, i21).getSmRegular400(qVar3, EchoThemeTypography.$stable), qVar3, 0, 24576, 114682);
                qVar3 = qVar3;
                qVar3.p(false);
            }
            if (z13) {
                qVar3.X(-1829350107);
                qVar2 = qVar;
                r1.d.g(p2.s(qVar2, EchoTheme.INSTANCE.getSpacings(qVar3, EchoTheme.$stable).getX1()), qVar3);
                i12 = 16;
                y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.circle_check, qVar3, 0), null, p2.o(qVar2, 16), ReaderColors.INSTANCE.m2394getGreen5000d7_KjU(), qVar3, u3.c.$stable | 432, 0);
                qVar3.p(false);
            } else {
                qVar2 = qVar;
                i12 = 16;
                qVar3.X(-1829038743);
                qVar3.p(false);
            }
            if (z10) {
                qVar3.X(-1828994878);
                r1.d.g(p2.s(qVar2, EchoTheme.INSTANCE.getSpacings(qVar3, EchoTheme.$stable).getX1()), qVar3);
                y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.circle_download, qVar3, 0), null, p2.o(qVar2, i12), ReaderColors.INSTANCE.m2394getGreen5000d7_KjU(), qVar3, u3.c.$stable | 432, 0);
                qVar3.p(false);
            } else {
                qVar3.X(-1828680631);
                qVar3.p(false);
            }
            qVar3.p(true);
        } else {
            qVar3.R();
        }
        r1 r10 = qVar3.r();
        if (r10 != null) {
            r10.f34012d = new d(listeningProgress2, z6, z10, i10);
        }
    }

    public static final float RecentReadStatusRowV4$lambda$0$0$0(ListeningProgress listeningProgress) {
        return listeningProgress.getProgressPercent() / 100.0f;
    }

    public static final sn.z RecentReadStatusRowV4$lambda$1(ListeningProgress listeningProgress, boolean z6, boolean z10, int i10, m mVar, int i11) {
        RecentReadStatusRowV4(listeningProgress, z6, z10, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

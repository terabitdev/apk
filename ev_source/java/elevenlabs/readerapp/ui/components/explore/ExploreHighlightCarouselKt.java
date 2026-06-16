package io.elevenlabs.readerapp.ui.components.explore;

import a2.v0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.u;
import i3.t;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d2;
import r1.p2;
import r1.w;
import r1.x;
import rd.c1;
import t1.z;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"", "title", "subtitle", "", "Lio/elevenlabs/domain/model/ExploreRead;", "reads", "Lkotlin/Function1;", "Lsn/z;", "onReadClick", "Lkotlin/Function0;", "onSeeAllClick", "Li3/t;", "modifier", "onPreviewClick", "playingPreviewReadId", "ExploreHighlightCarousel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lho/l;Lho/a;Li3/t;Lho/l;Ljava/lang/String;Lu2/m;II)V", "Preview_ExploreHighlightCarousel", "(Lu2/m;I)V", "Preview_ExploreHighlightCarousel_NoSeeAll", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreHighlightCarouselKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreHighlightCarousel(String str, String str2, List<ExploreRead> list, ho.l lVar, ho.a aVar, t tVar, ho.l lVar2, String str3, u2.m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        String str4;
        int i17;
        boolean z6;
        u2.q qVar;
        ho.l lVar3;
        String str5;
        r1 r10;
        t tVar3;
        ho.l lVar4;
        int i18;
        Object obj;
        u2.q qVar2;
        int i19;
        t tVar4;
        ?? r32;
        boolean z10;
        boolean z11;
        boolean z12;
        String str6;
        ho.l lVar5;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        list.getClass();
        lVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1566290930);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i12 = i24 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.f(str2)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i12 |= i23;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(list)) {
                i22 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i22 = 128;
            }
            i12 |= i22;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(lVar)) {
                i21 = 2048;
            } else {
                i21 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i21;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.h(aVar)) {
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
            if (qVar3.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                if (qVar3.h(lVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                i16 = i11 & 128;
                if (i16 != 0) {
                    i12 |= 12582912;
                    str4 = str3;
                } else {
                    str4 = str3;
                    if ((i10 & 12582912) == 0) {
                        if (qVar3.f(str4)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                }
                if ((i12 & 4793491) != 4793490) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar3.O(i12 & 1, z6)) {
                    i3.q qVar4 = i3.q.f13017a;
                    if (i25 != 0) {
                        tVar3 = qVar4;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i14 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i16 != 0) {
                        str4 = null;
                    }
                    boolean f10 = qVar3.f(list);
                    Object L = qVar3.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!f10 && L != eVar) {
                        i18 = i12;
                        obj = L;
                    } else {
                        ArrayList arrayList = new ArrayList(tn.p.a0(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ExploreKt.coverImageUrl((ExploreRead) it.next(), CoverImageSize.Medium));
                            i12 = i12;
                        }
                        i18 = i12;
                        qVar3.h0(arrayList);
                        obj = arrayList;
                    }
                    ExploreCarouselDefaultsKt.PreloadCarouselImages((List) obj, false, qVar3, 0, 2);
                    t e10 = p2.e(tVar3, 1.0f);
                    x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
                    int hashCode = Long.hashCode(qVar3.T);
                    c3.o l4 = qVar3.l();
                    t c5 = i3.a.c(e10, qVar3);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar3.b0();
                    t tVar5 = tVar3;
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    r.J(h4.g.f11907f, a10, qVar3);
                    r.J(h4.g.f11906e, l4, qVar3);
                    r.y(qVar3, Integer.valueOf(hashCode), h4.g.f11908g);
                    r.F(h4.g.f11909h, qVar3);
                    r.J(h4.g.f11905d, c5, qVar3);
                    if (str != null) {
                        qVar3.X(-1062562039);
                        i19 = i18;
                        tVar4 = tVar5;
                        ExploreSectionHeaderKt.ExploreSectionHeader(str, null, str2, aVar, qVar3, (i18 & 14) | ((i18 << 3) & 896) | ((i18 >> 3) & 7168), 2);
                        qVar2 = qVar3;
                        ib.i.o(EchoTheme.INSTANCE, qVar2, EchoTheme.$stable, qVar4, qVar2);
                        r32 = 0;
                        qVar2.p(false);
                    } else {
                        qVar2 = qVar3;
                        i19 = i18;
                        tVar4 = tVar5;
                        r32 = 0;
                        qVar2.X(-1062326594);
                        qVar2.p(false);
                    }
                    z rememberCarouselLazyListState = ExploreCarouselDefaultsKt.rememberCarouselLazyListState(qVar2, r32);
                    o1.g e11 = o1.k.e(new u(26, rememberCarouselLazyListState, o1.m.f24756c, false), qVar2);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i26 = EchoTheme.$stable;
                    d2 d10 = r1.d.d(echoTheme.getSpacings(qVar2, i26).getX5(), t2.u.P, 2);
                    r1.h y10 = ib.i.y(echoTheme, qVar2, i26);
                    t e12 = p2.e(qVar4, 1.0f);
                    boolean h10 = qVar2.h(list);
                    if ((i19 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = r32;
                    }
                    boolean z13 = h10 | z10;
                    if ((3670016 & i19) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = r32;
                    }
                    boolean z14 = z13 | z11;
                    if ((29360128 & i19) == 8388608) {
                        z12 = true;
                    } else {
                        z12 = r32;
                    }
                    boolean z15 = z14 | z12;
                    Object L2 = qVar2.L();
                    if (!z15 && L2 != eVar) {
                        str6 = str4;
                        lVar5 = lVar4;
                    } else {
                        str6 = str4;
                        lVar5 = lVar4;
                        v0 v0Var = new v0(list, lVar, lVar5, str6, 7);
                        qVar2.h0(v0Var);
                        L2 = v0Var;
                    }
                    u2.q qVar5 = qVar2;
                    c1.d(e12, rememberCarouselLazyListState, d10, y10, null, e11, false, null, (ho.l) L2, qVar5, 6, 424);
                    qVar = qVar5;
                    qVar.p(true);
                    lVar3 = lVar5;
                    str5 = str6;
                    tVar2 = tVar4;
                } else {
                    qVar = qVar3;
                    qVar.R();
                    lVar3 = lVar2;
                    str5 = str4;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.components.x(str, str2, list, lVar, aVar, tVar2, lVar3, str5, i10, i11, 1);
                    return;
                }
                return;
            }
            i16 = i11 & 128;
            if (i16 != 0) {
            }
            if ((i12 & 4793491) != 4793490) {
            }
            if (qVar3.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        i16 = i11 & 128;
        if (i16 != 0) {
        }
        if ((i12 & 4793491) != 4793490) {
        }
        if (qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ExploreHighlightCarousel$lambda$1$0$0(final List list, final ho.l lVar, final ho.l lVar2, final String str, t1.t tVar) {
        tVar.getClass();
        final ExploreHighlightCarouselKt$ExploreHighlightCarousel$lambda$1$0$0$$inlined$items$default$1 exploreHighlightCarouselKt$ExploreHighlightCarousel$lambda$1$0$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreHighlightCarouselKt$ExploreHighlightCarousel$lambda$1$0$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ExploreRead) obj);
            }

            @Override // ho.l
            public final Void invoke(ExploreRead exploreRead) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreHighlightCarouselKt$ExploreHighlightCarousel$lambda$1$0$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreHighlightCarouselKt$ExploreHighlightCarousel$lambda$1$0$0$$inlined$items$default$4
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
                    qVar.X(-583960340);
                    boolean f10 = qVar.f(lVar) | qVar.h(exploreRead);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar3 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreHighlightCarouselKt$ExploreHighlightCarousel$2$1$1$1$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1167invoke() {
                                ho.l.this.invoke(exploreRead.getReadId());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1167invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ExploreReadCardKt.ExploreReadCard(exploreRead, (ho.a) L, null, lVar2, str, qVar, 0, 4);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreHighlightCarousel$lambda$2(String str, String str2, List list, ho.l lVar, ho.a aVar, t tVar, ho.l lVar2, String str3, int i10, int i11, u2.m mVar, int i12) {
        ExploreHighlightCarousel(str, str2, list, lVar, aVar, tVar, lVar2, str3, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreHighlightCarousel(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1155215277);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreHighlightCarouselKt.INSTANCE.getLambda$546218809$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 6);
        }
    }

    public static final sn.z Preview_ExploreHighlightCarousel$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreHighlightCarousel(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreHighlightCarousel_NoSeeAll(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(471342961);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreHighlightCarouselKt.INSTANCE.getLambda$1972776779$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 7);
        }
    }

    public static final sn.z Preview_ExploreHighlightCarousel_NoSeeAll$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreHighlightCarousel_NoSeeAll(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

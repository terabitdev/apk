package io.elevenlabs.readerapp.ui.components.explore;

import a2.d0;
import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import i3.t;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.readerapp.ui.components.r0;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.ui.components.VideoPlayerKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
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
import p4.b0;
import p4.y;
import q2.j7;
import r1.d2;
import r1.p2;
import r1.w;
import r1.x;
import rd.c1;
import s4.y0;
import t1.z;
import t2.u;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a]\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u000f\u0010\u001b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u0018\u001a\u000f\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u0018¨\u0006 ²\u0006\u000e\u0010\u001d\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, d2 = {"", "title", "subtitle", "", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHeroCarousel$Item;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "Lsn/z;", "onItemClick", "Lkotlin/Function0;", "onSeeAllClick", "Li3/t;", "modifier", "ExploreHeroCarousel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lho/l;Lho/a;Li3/t;Lu2/m;II)V", "backgroundImageUrl", "backgroundVideoUrl", "onClick", "", "reverseLayout", "showSubtitle", "HeroCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/a;Li3/t;ZZLu2/m;II)V", "Preview_ExploreHeroCarousel", "(Lu2/m;I)V", "Preview_ExploreHeroCarousel_NoSubtitles", "Preview_ExploreHeroCarousel_LongText", "Preview_ExploreHeroCarousel_WithVideo", "Preview_ExploreHeroCarousel_Reversed", "videoReady", "", "videoOpacity", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreHeroCarouselKt {
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e2, code lost:
    
        if (r1 == r15) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreHeroCarousel(String str, String str2, List<ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item> list, ho.l lVar, ho.a aVar, t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        r1 r10;
        boolean z10;
        i3.q qVar2;
        int i14;
        int i15;
        Object obj;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        str.getClass();
        list.getClass();
        lVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(2008566156);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.f(str2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(list)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(lVar)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.h(aVar)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        int i21 = i11 & 32;
        if (i21 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            if ((74899 & i12) == 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar3.O(i12 & 1, z6)) {
                i3.q qVar4 = i3.q.f13017a;
                if (i21 != 0) {
                    tVar2 = qVar4;
                }
                boolean f10 = qVar3.f(list);
                Object L = qVar3.L();
                u2.e eVar = u2.l.f33918a;
                Object obj2 = L;
                if (f10 || L == eVar) {
                    ArrayList arrayList = new ArrayList(tn.p.a0(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item) it.next()).getBackgroundImageUrl());
                    }
                    qVar3.h0(arrayList);
                    obj2 = arrayList;
                }
                ExploreCarouselDefaultsKt.PreloadCarouselImages((List) obj2, false, qVar3, 48, 0);
                boolean f11 = qVar3.f(list);
                Object L2 = qVar3.L();
                Object obj3 = L2;
                if (f11 || L2 == eVar) {
                    if (!list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            String subtitle = ((ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item) it2.next()).getSubtitle();
                            if (subtitle != null && !wq.n.m0(subtitle)) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    Boolean valueOf = Boolean.valueOf(z10);
                    qVar3.h0(valueOf);
                    obj3 = valueOf;
                }
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                t e10 = p2.e(tVar2, 1.0f);
                x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
                int hashCode = Long.hashCode(qVar3.T);
                c3.o l4 = qVar3.l();
                t c5 = i3.a.c(e10, qVar3);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar3.b0();
                t tVar3 = tVar2;
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
                if (!wq.n.m0(str)) {
                    qVar3.X(-259487048);
                    qVar2 = qVar4;
                    i14 = 0;
                    ExploreSectionHeaderKt.ExploreSectionHeader(str, null, str2, aVar, qVar3, (i12 & 14) | ((i12 << 3) & 896) | ((i12 >> 3) & 7168), 2);
                    ib.i.o(EchoTheme.INSTANCE, qVar3, EchoTheme.$stable, qVar2, qVar3);
                    qVar3.p(false);
                } else {
                    qVar2 = qVar4;
                    i14 = 0;
                    qVar3.X(-259252564);
                    qVar3.p(false);
                }
                z rememberCarouselLazyListState = ExploreCarouselDefaultsKt.rememberCarouselLazyListState(qVar3, i14);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i22 = EchoTheme.$stable;
                d2 d10 = r1.d.d(echoTheme.getSpacings(qVar3, i22).getX5(), u.P, 2);
                r1.h m10 = ib.i.m(echoTheme, qVar3, i22);
                t e11 = p2.e(qVar2, 1.0f);
                boolean h10 = qVar3.h(list);
                if ((i12 & 7168) == 2048) {
                    i15 = 1;
                } else {
                    i15 = i14;
                }
                int i23 = (h10 ? 1 : 0) | i15 | (qVar3.g(booleanValue) ? 1 : 0);
                Object L3 = qVar3.L();
                if (i23 == 0) {
                    obj = L3;
                }
                j jVar = new j(list, lVar, booleanValue);
                qVar3.h0(jVar);
                obj = jVar;
                c1.d(e11, rememberCarouselLazyListState, d10, m10, null, null, false, null, (ho.l) obj, qVar3, 6, 488);
                u2.q qVar5 = qVar3;
                qVar5.p(true);
                tVar2 = tVar3;
                qVar = qVar5;
            } else {
                qVar3.R();
                qVar = qVar3;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new i(str, str2, list, lVar, aVar, tVar2, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ExploreHeroCarousel$lambda$2$0$0(final List list, final ho.l lVar, final boolean z6, t1.t tVar) {
        tVar.getClass();
        final ExploreHeroCarouselKt$ExploreHeroCarousel$lambda$2$0$0$$inlined$items$default$1 exploreHeroCarouselKt$ExploreHeroCarousel$lambda$2$0$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreHeroCarouselKt$ExploreHeroCarousel$lambda$2$0$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item) obj);
            }

            @Override // ho.l
            public final Void invoke(ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item item) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreHeroCarouselKt$ExploreHeroCarousel$lambda$2$0$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreHeroCarouselKt$ExploreHeroCarousel$lambda$2$0$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z10;
                String str;
                String str2;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(i12 & 1, z10)) {
                    final ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item item = (ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item) list.get(i10);
                    qVar.X(-1898164766);
                    String title = item.getTitle();
                    String subtitle = item.getSubtitle();
                    if (subtitle == null) {
                        str = "";
                    } else {
                        str = subtitle;
                    }
                    String backgroundImageUrl = item.getBackgroundImageUrl();
                    if (backgroundImageUrl == null) {
                        str2 = "";
                    } else {
                        str2 = backgroundImageUrl;
                    }
                    String backgroundVideoUrl = item.getBackgroundVideoUrl();
                    boolean f10 = qVar.f(lVar) | qVar.h(item);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.components.explore.ExploreHeroCarouselKt$ExploreHeroCarousel$2$1$1$1$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1166invoke() {
                                ho.l.this.invoke(item.getDeeplink());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1166invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ExploreHeroCarouselKt.HeroCard(title, str, str2, backgroundVideoUrl, (ho.a) L, p2.s(i3.q.f13017a, 320), item.getSwapTitleSubtitle(), z6, qVar, 196608, 0);
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

    public static final sn.z ExploreHeroCarousel$lambda$3(String str, String str2, List list, ho.l lVar, ho.a aVar, t tVar, int i10, int i11, u2.m mVar, int i12) {
        ExploreHeroCarousel(str, str2, list, lVar, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [int] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeroCard(String str, String str2, String str3, String str4, ho.a aVar, t tVar, boolean z6, boolean z10, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        t tVar2;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        boolean z13;
        boolean z14;
        t tVar3;
        boolean z15;
        r1 r10;
        t tVar4;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        float f10;
        int i19;
        i3.q qVar;
        h4.f fVar;
        boolean z20;
        boolean z21;
        EchoTheme echoTheme;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(171823676);
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
            if (qVar2.f(str2)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i12 |= i24;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.f(str3)) {
                i23 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i23 = 128;
            }
            i12 |= i23;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.f(str4)) {
                i22 = 2048;
            } else {
                i22 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i22;
        }
        if ((i10 & 24576) == 0) {
            aVar2 = aVar;
            if (qVar2.h(aVar2)) {
                i21 = 16384;
            } else {
                i21 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i21;
        } else {
            aVar2 = aVar;
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
                z11 = z6;
                if (qVar2.g(z11)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                i16 = i11 & 128;
                if (i16 != 0) {
                    i12 |= 12582912;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i10 & 12582912) == 0) {
                        if (qVar2.g(z12)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                }
                i18 = i12;
                if ((i18 & 4793491) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (qVar2.O(i18 & 1, z13)) {
                    i3.q qVar3 = i3.q.f13017a;
                    if (i26 != 0) {
                        tVar4 = qVar3;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    }
                    EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                    int i27 = EchoTheme.$stable;
                    EchoThemeShapes shapes = echoTheme2.getShapes(qVar2, i27);
                    int i28 = EchoThemeShapes.$stable;
                    t tVar5 = tVar4;
                    t p10 = l1.n.p(m3.h.c(tVar4, shapes.getXl(qVar2, i28)), false, null, null, null, aVar2, 15);
                    if ((i18 & 29360128) == 8388608) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i18 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z22 = z17 | z18;
                    int i29 = i18 & 14;
                    if (i29 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z23 = z22 | z19;
                    Object L = qVar2.L();
                    u2.e eVar = u2.l.f33918a;
                    if (z23 || L == eVar) {
                        L = new l(0, str2, str, z12);
                        qVar2.h0(L);
                    }
                    t c5 = p4.q.c(p10, true, (ho.l) L);
                    r1.e eVar2 = r1.j.f29230c;
                    i3.j jVar = i3.d.B0;
                    x a10 = w.a(eVar2, jVar, qVar2, 0);
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    t c10 = i3.a.c(c5, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar2 = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar2);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar3 = h4.g.f11907f;
                    r.J(eVar3, a10, qVar2);
                    h4.e eVar4 = h4.g.f11906e;
                    r.J(eVar4, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar5 = h4.g.f11908g;
                    r.y(qVar2, valueOf, eVar5);
                    h4.d dVar = h4.g.f11909h;
                    r.F(dVar, qVar2);
                    h4.e eVar6 = h4.g.f11905d;
                    r.J(eVar6, c10, qVar2);
                    t c11 = m3.h.c(r1.d.j(p2.e(qVar3, 1.0f), 1.7777778f, false), echoTheme2.getShapes(qVar2, i27).getXl(qVar2, i28));
                    long j4 = p3.x.f26427b;
                    t h10 = l1.n.h(c11, j4, h0.f26395b);
                    f1 d10 = r1.p.d(i3.d.f12997a, false);
                    int hashCode2 = Long.hashCode(qVar2.T);
                    c3.o l7 = qVar2.l();
                    t c12 = i3.a.c(h10, qVar2);
                    qVar2.b0();
                    boolean z24 = z12;
                    if (qVar2.S) {
                        qVar2.k(fVar2);
                    } else {
                        qVar2.k0();
                    }
                    r.J(eVar3, d10, qVar2);
                    r.J(eVar4, l7, qVar2);
                    defpackage.f.u(hashCode2, qVar2, eVar5, qVar2, dVar);
                    r.J(eVar6, c12, qVar2);
                    ad.h hVar = new ad.h((Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b));
                    hVar.f1788c = str3;
                    hVar.b();
                    u2.q qVar4 = qVar2;
                    qc.m.b(hVar.a(), null, p2.e(qVar3, 1.0f), null, f4.q.f8839b, null, qVar4, 1573296, 4024);
                    if (str4 == null) {
                        qVar4.X(473899500);
                        z20 = 0;
                        qVar4.p(false);
                        fVar = fVar2;
                        qVar = qVar3;
                        i19 = i29;
                    } else {
                        qVar4.X(473899501);
                        Object L2 = qVar4.L();
                        if (L2 == eVar) {
                            L2 = r.A(Boolean.FALSE);
                            qVar4.h0(L2);
                        }
                        z0 z0Var = (z0) L2;
                        if (HeroCard$lambda$1$0$0$1(z0Var)) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        t a11 = m3.h.a(r1.d.j(p2.e(qVar3, 1.0f), 1.7777778f, false), HeroCard$lambda$1$0$0$3(j1.f.b(f10, null, "videoOpacity", qVar4, 3072, 22)));
                        Uri parse = Uri.parse(str4);
                        Object L3 = qVar4.L();
                        if (L3 == eVar) {
                            L3 = new d0(z0Var, 8);
                            qVar4.h0(L3);
                        }
                        i19 = i29;
                        qVar = qVar3;
                        fVar = fVar2;
                        VideoPlayerKt.m1885VideoPlayer_Ogyb9c(a11, parse, j4, (ho.a) L3, (ho.a) null, (ho.a) null, true, true, false, (Float) null, false, 0, (u2.m) qVar4, 14159232, 0, 3888);
                        qVar4 = qVar4;
                        z20 = 0;
                        qVar4.p(false);
                    }
                    qVar4.p(true);
                    r1.d.g(p2.f(qVar, echoTheme2.getSpacings(qVar4, i27).getX3()), qVar4);
                    x a12 = w.a(r1.j.g(echoTheme2.getSpacings(qVar4, i27).getX1()), jVar, qVar4, z20);
                    int hashCode3 = Long.hashCode(qVar4.T);
                    c3.o l10 = qVar4.l();
                    t c13 = i3.a.c(qVar, qVar4);
                    qVar4.b0();
                    if (qVar4.S) {
                        qVar4.k(fVar);
                    } else {
                        qVar4.k0();
                    }
                    r.J(eVar3, a12, qVar4);
                    r.J(eVar4, l10, qVar4);
                    defpackage.f.u(hashCode3, qVar4, eVar5, qVar4, dVar);
                    r.J(eVar6, c13, qVar4);
                    if (z16) {
                        qVar4.X(1458135564);
                        if (z24) {
                            qVar4.X(1458181444);
                            u2.q qVar5 = qVar4;
                            echoTheme = echoTheme2;
                            i20 = i27;
                            j7.d(str2, null, echoTheme2.getColors(qVar4, i27).getText().getTertiary(qVar4, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 2, 2, null, echoTheme2.getTypography(qVar4, i27).getBaseRegular400(qVar4, EchoThemeTypography.$stable), qVar5, (i18 >> 3) & 14, 221568, 77818);
                            qVar4 = qVar5;
                            qVar4.p(z20);
                        } else {
                            echoTheme = echoTheme2;
                            i20 = i27;
                            qVar4.X(1458520274);
                            qVar4.p(z20);
                        }
                        EchoTheme echoTheme3 = echoTheme;
                        int i30 = i20;
                        u2.q qVar6 = qVar4;
                        j7.d(str, null, echoTheme3.getColors(qVar4, i30).getText().getPrimary(qVar4, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme3.getTypography(qVar4, i30).getBaseCompact500(qVar4, EchoThemeTypography.$stable), qVar6, i19, 24960, 110586);
                        qVar6.p(false);
                        qVar2 = qVar6;
                    } else {
                        qVar4.X(1458845805);
                        EchoThemeTypography typography = echoTheme2.getTypography(qVar4, i27);
                        int i31 = EchoThemeTypography.$stable;
                        y0 baseCompact500 = typography.getBaseCompact500(qVar4, i31);
                        EchoThemeColors.Text text = echoTheme2.getColors(qVar4, i27).getText();
                        int i32 = EchoThemeColors.Text.$stable;
                        u2.q qVar7 = qVar4;
                        j7.d(str, null, text.getPrimary(qVar4, i32), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, baseCompact500, qVar7, i19, 24960, 110586);
                        if (z24) {
                            qVar7.X(1459174436);
                            j7.d(str2, null, ib.i.B(i27, i32, echoTheme2, qVar7, qVar7), 0L, null, 0L, null, 0L, 2, false, 2, 2, null, echoTheme2.getTypography(qVar7, i27).getBaseRegular400(qVar7, i31), qVar7, (i18 >> 3) & 14, 221568, 77818);
                            qVar2 = qVar7;
                            z21 = false;
                            qVar2.p(false);
                        } else {
                            qVar2 = qVar7;
                            z21 = false;
                            qVar2.X(1459513266);
                            qVar2.p(false);
                        }
                        qVar2.p(z21);
                    }
                    qVar2.p(true);
                    qVar2.p(true);
                    z15 = z16;
                    tVar3 = tVar5;
                    z14 = z24;
                } else {
                    qVar2.R();
                    z14 = z12;
                    tVar3 = tVar2;
                    z15 = z11;
                }
                r10 = qVar2.r();
                if (r10 != null) {
                    r10.f34012d = new m(str, str2, str3, str4, aVar, tVar3, z15, z14, i10, i11);
                    return;
                }
                return;
            }
            z11 = z6;
            i16 = i11 & 128;
            if (i16 != 0) {
            }
            i18 = i12;
            if ((i18 & 4793491) != 4793490) {
            }
            if (qVar2.O(i18 & 1, z13)) {
            }
            r10 = qVar2.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        z11 = z6;
        i16 = i11 & 128;
        if (i16 != 0) {
        }
        i18 = i12;
        if ((i18 & 4793491) != 4793490) {
        }
        if (qVar2.O(i18 & 1, z13)) {
        }
        r10 = qVar2.r();
        if (r10 != null) {
        }
    }

    public static final sn.z HeroCard$lambda$0$0(boolean z6, String str, String str2, b0 b0Var) {
        b0Var.getClass();
        y.i(b0Var, 0);
        if (z6 && !wq.n.m0(str)) {
            str2 = defpackage.f.j(str2, ", ", str);
        }
        y.d(str2, b0Var);
        return sn.z.f31622a;
    }

    private static final boolean HeroCard$lambda$1$0$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void HeroCard$lambda$1$0$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final float HeroCard$lambda$1$0$0$3(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z HeroCard$lambda$1$0$0$4$0(z0 z0Var) {
        HeroCard$lambda$1$0$0$2(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z HeroCard$lambda$2(String str, String str2, String str3, String str4, ho.a aVar, t tVar, boolean z6, boolean z10, int i10, int i11, u2.m mVar, int i12) {
        HeroCard(str, str2, str3, str4, aVar, tVar, z6, z10, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreHeroCarousel(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1593249713);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreHeroCarouselKt.INSTANCE.m1118getLambda$1192490315$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 5);
        }
    }

    public static final sn.z Preview_ExploreHeroCarousel$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreHeroCarousel(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreHeroCarousel_LongText(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(441858631);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreHeroCarouselKt.INSTANCE.m1120getLambda$57445727$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 4);
        }
    }

    public static final sn.z Preview_ExploreHeroCarousel_LongText$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreHeroCarousel_LongText(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreHeroCarousel_NoSubtitles(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1816352374);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, c3.k.d(1174231792, true, new k(ExploreFactoryKt.stubReadsExploreHeroCarouselNoSubtitles(), 0), qVar), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 3);
        }
    }

    public static final sn.z Preview_ExploreHeroCarousel_NoSubtitles$lambda$0(ReadsExplorePage.Section.GetReadsExploreHeroCarousel getReadsExploreHeroCarousel, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, c3.k.d(-961490211, true, new k(getReadsExploreHeroCarousel, 1), qVar), qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ExploreHeroCarousel_NoSubtitles$lambda$0$0(ReadsExplorePage.Section.GetReadsExploreHeroCarousel getReadsExploreHeroCarousel, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String title = getReadsExploreHeroCarousel.getTitle();
            String subtitle = getReadsExploreHeroCarousel.getSubtitle();
            List<ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item> items = getReadsExploreHeroCarousel.getItems();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new r0(19);
                qVar.h0(L);
            }
            ExploreHeroCarousel(title, subtitle, items, (ho.l) L, null, null, qVar, 27648, 32);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ExploreHeroCarousel_NoSubtitles$lambda$0$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ExploreHeroCarousel_NoSubtitles$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ExploreHeroCarousel_NoSubtitles(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreHeroCarousel_Reversed(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(761029568);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreHeroCarouselKt.INSTANCE.getLambda$261725210$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 2);
        }
    }

    public static final sn.z Preview_ExploreHeroCarousel_Reversed$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreHeroCarousel_Reversed(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreHeroCarousel_WithVideo(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1718972155);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreHeroCarouselKt.INSTANCE.m1119getLambda$17538069$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 1);
        }
    }

    public static final sn.z Preview_ExploreHeroCarousel_WithVideo$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreHeroCarousel_WithVideo(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import ho.l;
import i3.t;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.components.explore.ExploreHeroCarouselKt;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$HeroCarousel;", "section", "Lkotlin/Function1;", "", "Lsn/z;", "onItemClick", "Li3/t;", "modifier", "HomeHeroCarouselSectionV4", "(Lio/elevenlabs/domain/model/home/HomePageV4$Section$HeroCarousel;Lho/l;Li3/t;Lu2/m;II)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeHeroCarouselSectionKt {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r5 == u2.l.f33918a) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeHeroCarouselSectionV4(HomePageV4.Section.HeroCarousel heroCarousel, l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        l lVar2;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        Object obj;
        int i14;
        int i15;
        heroCarousel.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-292539357);
        if ((i10 & 6) == 0) {
            if (qVar.h(heroCarousel)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        } else {
            lVar2 = lVar;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
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
            if (!qVar.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                boolean f10 = qVar.f(heroCarousel.getItems());
                Object L = qVar.L();
                if (!f10) {
                    obj = L;
                }
                List<HomePageV4.Section.HeroCarousel.HeroItem> items = heroCarousel.getItems();
                ArrayList arrayList = new ArrayList(p.a0(items, 10));
                for (HomePageV4.Section.HeroCarousel.HeroItem heroItem : items) {
                    arrayList.add(new ReadsExplorePage.Section.GetReadsExploreHeroCarousel.Item(heroItem.getTitle(), heroItem.getSubtitle(), heroItem.getSwapTitleSubtitle(), heroItem.getBackgroundImageUrl(), heroItem.getBackgroundVideoUrl(), heroItem.getDeeplink()));
                }
                qVar.h0(arrayList);
                obj = arrayList;
                ExploreHeroCarouselKt.ExploreHeroCarousel(heroCarousel.getTitle(), heroCarousel.getSubtitle(), (List) obj, lVar2, null, tVar4, qVar, ((i12 << 6) & 7168) | 24576 | ((i12 << 9) & 458752), 0);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(heroCarousel, lVar, tVar3, i10, i11, 3);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeHeroCarouselSectionV4$lambda$1(HomePageV4.Section.HeroCarousel heroCarousel, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        HomeHeroCarouselSectionV4(heroCarousel, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static /* synthetic */ z a(HomePageV4.Section.HeroCarousel heroCarousel, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        return HomeHeroCarouselSectionV4$lambda$1(heroCarousel, lVar, tVar, i10, i11, mVar, i12);
    }
}

package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.HomeAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.HomeV3Response;
import io.elevenlabs.data.model.response.HomeV3SubpageResponse;
import io.elevenlabs.data.model.response.HomeV4Response;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.PageData;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.domain.services.HomeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\b2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/data/services/HomeServiceImpl;", "Lio/elevenlabs/domain/services/HomeService;", "Lio/elevenlabs/data/api/HomeAPI;", "homeAPI", "<init>", "(Lio/elevenlabs/data/api/HomeAPI;)V", "", "appStoreCountry", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/home/HomePageV4;", "getHome", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/home/HomePageV3;", "getHomeV3", "(Lwn/c;)Ljava/lang/Object;", "subpageId", "cursor", "", "pageSize", "Lio/elevenlabs/domain/model/PageData;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "getHomeV3Subpage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/HomeAPI;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HomeServiceImpl implements HomeService {
    private final HomeAPI homeAPI;

    public HomeServiceImpl(HomeAPI homeAPI) {
        homeAPI.getClass();
        this.homeAPI = homeAPI;
    }

    public static /* synthetic */ PageData a(HomeV3SubpageResponse homeV3SubpageResponse) {
        return getHomeV3Subpage$lambda$0(homeV3SubpageResponse);
    }

    public static /* synthetic */ HomePageV3 b(HomeV3Response homeV3Response) {
        return getHomeV3$lambda$0(homeV3Response);
    }

    public static /* synthetic */ HomePageV4 c(HomeV4Response homeV4Response) {
        return getHome$lambda$0(homeV4Response);
    }

    public static final HomePageV4 getHome$lambda$0(HomeV4Response homeV4Response) {
        HomePageV4.Section domain;
        homeV4Response.getClass();
        List<HomeV4Response.Section> sections = homeV4Response.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            domain = HomeServiceImplKt.toDomain((HomeV4Response.Section) it.next());
            arrayList.add(domain);
        }
        return new HomePageV4(arrayList);
    }

    public static final HomePageV3 getHomeV3$lambda$0(HomeV3Response homeV3Response) {
        HomePageV3.Section domain;
        homeV3Response.getClass();
        List<HomeV3Response.Section> sections = homeV3Response.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            domain = HomeServiceImplKt.toDomain((HomeV3Response.Section) it.next());
            arrayList.add(domain);
        }
        List<HomeV3Response.Subpage> subpages = homeV3Response.getSubpages();
        ArrayList arrayList2 = new ArrayList(p.a0(subpages, 10));
        for (HomeV3Response.Subpage subpage : subpages) {
            arrayList2.add(new HomePageV3.Subpage(subpage.getId(), subpage.getTitle(), subpage.getIcon_url(), subpage.is_local_only()));
        }
        return new HomePageV3(arrayList, arrayList2);
    }

    public static final PageData getHomeV3Subpage$lambda$0(HomeV3SubpageResponse homeV3SubpageResponse) {
        HomePageV3.Section domain;
        homeV3SubpageResponse.getClass();
        List<HomeV3Response.Section> sections = homeV3SubpageResponse.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            domain = HomeServiceImplKt.toDomain((HomeV3Response.Section) it.next());
            arrayList.add(domain);
        }
        return new PageData(arrayList, homeV3SubpageResponse.getHasMore(), homeV3SubpageResponse.getNextCursor());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.HomeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getHome(String str, wn.c<? super AsyncCallResult<HomePageV4>> cVar) {
        HomeServiceImpl$getHome$1 homeServiceImpl$getHome$1;
        int i10;
        if (cVar instanceof HomeServiceImpl$getHome$1) {
            homeServiceImpl$getHome$1 = (HomeServiceImpl$getHome$1) cVar;
            int i11 = homeServiceImpl$getHome$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeServiceImpl$getHome$1.label = i11 - Integer.MIN_VALUE;
                Object obj = homeServiceImpl$getHome$1.result;
                i10 = homeServiceImpl$getHome$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    HomeAPI homeAPI = this.homeAPI;
                    homeServiceImpl$getHome$1.L$0 = null;
                    homeServiceImpl$getHome$1.label = 1;
                    obj = homeAPI.getHomeV4Data(str, homeServiceImpl$getHome$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(14));
            }
        }
        homeServiceImpl$getHome$1 = new HomeServiceImpl$getHome$1(this, cVar);
        Object obj2 = homeServiceImpl$getHome$1.result;
        i10 = homeServiceImpl$getHome$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(14));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.HomeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getHomeV3(wn.c<? super AsyncCallResult<HomePageV3>> cVar) {
        HomeServiceImpl$getHomeV3$1 homeServiceImpl$getHomeV3$1;
        int i10;
        if (cVar instanceof HomeServiceImpl$getHomeV3$1) {
            homeServiceImpl$getHomeV3$1 = (HomeServiceImpl$getHomeV3$1) cVar;
            int i11 = homeServiceImpl$getHomeV3$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeServiceImpl$getHomeV3$1.label = i11 - Integer.MIN_VALUE;
                Object obj = homeServiceImpl$getHomeV3$1.result;
                i10 = homeServiceImpl$getHomeV3$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    HomeAPI homeAPI = this.homeAPI;
                    homeServiceImpl$getHomeV3$1.label = 1;
                    obj = homeAPI.getHomeV3Data(homeServiceImpl$getHomeV3$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(16));
            }
        }
        homeServiceImpl$getHomeV3$1 = new HomeServiceImpl$getHomeV3$1(this, cVar);
        Object obj2 = homeServiceImpl$getHomeV3$1.result;
        i10 = homeServiceImpl$getHomeV3$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(16));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.HomeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getHomeV3Subpage(String str, String str2, Integer num, wn.c<? super AsyncCallResult<PageData<HomePageV3.Section>>> cVar) {
        HomeServiceImpl$getHomeV3Subpage$1 homeServiceImpl$getHomeV3Subpage$1;
        int i10;
        if (cVar instanceof HomeServiceImpl$getHomeV3Subpage$1) {
            homeServiceImpl$getHomeV3Subpage$1 = (HomeServiceImpl$getHomeV3Subpage$1) cVar;
            int i11 = homeServiceImpl$getHomeV3Subpage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeServiceImpl$getHomeV3Subpage$1.label = i11 - Integer.MIN_VALUE;
                Object obj = homeServiceImpl$getHomeV3Subpage$1.result;
                i10 = homeServiceImpl$getHomeV3Subpage$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    HomeAPI homeAPI = this.homeAPI;
                    homeServiceImpl$getHomeV3Subpage$1.L$0 = null;
                    homeServiceImpl$getHomeV3Subpage$1.L$1 = null;
                    homeServiceImpl$getHomeV3Subpage$1.L$2 = null;
                    homeServiceImpl$getHomeV3Subpage$1.label = 1;
                    obj = homeAPI.getHomeV3Subpage(str, str2, num, homeServiceImpl$getHomeV3Subpage$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(15));
            }
        }
        homeServiceImpl$getHomeV3Subpage$1 = new HomeServiceImpl$getHomeV3Subpage$1(this, cVar);
        Object obj2 = homeServiceImpl$getHomeV3Subpage$1.result;
        i10 = homeServiceImpl$getHomeV3Subpage$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(15));
    }
}

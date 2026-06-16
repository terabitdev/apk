package io.elevenlabs.domain.services;

import a9.a;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.PageData;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.domain.model.home.HomePageV4;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/HomeService;", "", "", "appStoreCountry", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/home/HomePageV4;", "getHome", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/home/HomePageV3;", "getHomeV3", "(Lwn/c;)Ljava/lang/Object;", "subpageId", "cursor", "", "pageSize", "Lio/elevenlabs/domain/model/PageData;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "getHomeV3Subpage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface HomeService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getHomeV3Subpage$default(HomeService homeService, String str, String str2, Integer num, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                num = null;
            }
            return homeService.getHomeV3Subpage(str, str2, num, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: getHomeV3Subpage");
        return null;
    }

    Object getHome(String str, c<? super AsyncCallResult<HomePageV4>> cVar);

    Object getHomeV3(c<? super AsyncCallResult<HomePageV3>> cVar);

    Object getHomeV3Subpage(String str, String str2, Integer num, c<? super AsyncCallResult<PageData<HomePageV3.Section>>> cVar);
}

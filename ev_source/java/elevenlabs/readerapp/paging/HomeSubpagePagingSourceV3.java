package io.elevenlabs.readerapp.paging;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.PageData;
import io.elevenlabs.domain.services.HomeService;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import ta.j1;
import ta.k1;
import ta.l1;
import ta.m1;
import ta.n1;
import ta.o1;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/paging/HomeSubpagePagingSourceV3;", "Lta/n1;", "", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "Lio/elevenlabs/domain/services/HomeService;", "homeService", "subpageId", "<init>", "(Lio/elevenlabs/domain/services/HomeService;Ljava/lang/String;)V", "Lta/j1;", "params", "Lta/m1;", "load", "(Lta/j1;Lwn/c;)Ljava/lang/Object;", "Lta/o1;", RemoteConfigConstants.ResponseFieldKey.STATE, "getRefreshKey", "(Lta/o1;)Ljava/lang/String;", "Lio/elevenlabs/domain/services/HomeService;", "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HomeSubpagePagingSourceV3 extends n1 {
    public static final int $stable = 8;
    private final HomeService homeService;
    private final String subpageId;

    public HomeSubpagePagingSourceV3(HomeService homeService, String str) {
        homeService.getClass();
        str.getClass();
        this.homeService = homeService;
        this.subpageId = str;
    }

    @Override // ta.n1
    public String getRefreshKey(o1 state) {
        state.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // ta.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(j1 j1Var, c<? super m1> cVar) {
        HomeSubpagePagingSourceV3$load$1 homeSubpagePagingSourceV3$load$1;
        int i10;
        AsyncCallResult asyncCallResult;
        if (cVar instanceof HomeSubpagePagingSourceV3$load$1) {
            homeSubpagePagingSourceV3$load$1 = (HomeSubpagePagingSourceV3$load$1) cVar;
            int i11 = homeSubpagePagingSourceV3$load$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeSubpagePagingSourceV3$load$1.label = i11 - Integer.MIN_VALUE;
                Object obj = homeSubpagePagingSourceV3$load$1.result;
                i10 = homeSubpagePagingSourceV3$load$1.label;
                String str = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj);
                    String str2 = (String) j1Var.a();
                    int i12 = j1Var.f32631a;
                    HomeService homeService = this.homeService;
                    String str3 = this.subpageId;
                    Integer num = new Integer(i12);
                    homeSubpagePagingSourceV3$load$1.L$0 = null;
                    homeSubpagePagingSourceV3$load$1.L$1 = null;
                    homeSubpagePagingSourceV3$load$1.I$0 = i12;
                    homeSubpagePagingSourceV3$load$1.label = 1;
                    obj = homeService.getHomeV3Subpage(str3, str2, num, homeSubpagePagingSourceV3$load$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                    PageData pageData = (PageData) ((AsyncCallResult.Success) asyncCallResult).getData();
                    List items = pageData.getItems();
                    if (pageData.getHasMore()) {
                        str = pageData.getNextCursor();
                    }
                    return new l1(str, items);
                }
                if (asyncCallResult instanceof AsyncCallResult.Error) {
                    return new k1(new Exception(((AsyncCallResult.Error) asyncCallResult).getError().toString()));
                }
                c6.p();
                return null;
            }
        }
        homeSubpagePagingSourceV3$load$1 = new HomeSubpagePagingSourceV3$load$1(this, cVar);
        Object obj2 = homeSubpagePagingSourceV3$load$1.result;
        i10 = homeSubpagePagingSourceV3$load$1.label;
        String str4 = null;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
        }
    }
}

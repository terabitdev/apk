package io.elevenlabs.readerapp.paging;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.PageData;
import io.elevenlabs.domain.services.ExploreCollectionsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.z;
import ta.j1;
import ta.k1;
import ta.l1;
import ta.m1;
import ta.n1;
import ta.o1;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR&\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/readerapp/paging/ExploreCollectionItemsPagingSource;", "Lta/n1;", "", "Lio/elevenlabs/domain/model/ExploreRead;", "Lio/elevenlabs/domain/services/ExploreCollectionsService;", "collectionDetailsService", "collectionId", "language", "", "initialItems", "initialNextCursor", "Lkotlin/Function1;", "Lsn/z;", "onPageLoaded", "<init>", "(Lio/elevenlabs/domain/services/ExploreCollectionsService;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lho/l;)V", "Lta/j1;", "params", "Lta/m1;", "load", "(Lta/j1;Lwn/c;)Ljava/lang/Object;", "Lta/o1;", RemoteConfigConstants.ResponseFieldKey.STATE, "getRefreshKey", "(Lta/o1;)Ljava/lang/String;", "Lio/elevenlabs/domain/services/ExploreCollectionsService;", "Ljava/lang/String;", "Ljava/util/List;", "Lho/l;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreCollectionItemsPagingSource extends n1 {
    public static final int $stable = 8;
    private final ExploreCollectionsService collectionDetailsService;
    private final String collectionId;
    private final List<ExploreRead> initialItems;
    private final String initialNextCursor;
    private final String language;
    private final l onPageLoaded;

    public ExploreCollectionItemsPagingSource(ExploreCollectionsService exploreCollectionsService, String str, String str2, List<ExploreRead> list, String str3, l lVar) {
        exploreCollectionsService.getClass();
        str.getClass();
        list.getClass();
        lVar.getClass();
        this.collectionDetailsService = exploreCollectionsService;
        this.collectionId = str;
        this.language = str2;
        this.initialItems = list;
        this.initialNextCursor = str3;
        this.onPageLoaded = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z _init_$lambda$0(List list) {
        list.getClass();
        return z.f31622a;
    }

    @Override // ta.n1
    public String getRefreshKey(o1 state) {
        state.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ta.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(j1 j1Var, c<? super m1> cVar) {
        ExploreCollectionItemsPagingSource$load$1 exploreCollectionItemsPagingSource$load$1;
        int i10;
        AsyncCallResult asyncCallResult;
        if (cVar instanceof ExploreCollectionItemsPagingSource$load$1) {
            exploreCollectionItemsPagingSource$load$1 = (ExploreCollectionItemsPagingSource$load$1) cVar;
            int i11 = exploreCollectionItemsPagingSource$load$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                exploreCollectionItemsPagingSource$load$1.label = i11 - Integer.MIN_VALUE;
                ExploreCollectionItemsPagingSource$load$1 exploreCollectionItemsPagingSource$load$12 = exploreCollectionItemsPagingSource$load$1;
                Object obj = exploreCollectionItemsPagingSource$load$12.result;
                i10 = exploreCollectionItemsPagingSource$load$12.label;
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
                    if (str2 == null) {
                        this.onPageLoaded.invoke(this.initialItems);
                        return new l1(this.initialNextCursor, this.initialItems);
                    }
                    ExploreCollectionsService exploreCollectionsService = this.collectionDetailsService;
                    String str3 = this.collectionId;
                    Integer num = new Integer(j1Var.f32631a);
                    String str4 = this.language;
                    exploreCollectionItemsPagingSource$load$12.L$0 = null;
                    exploreCollectionItemsPagingSource$load$12.L$1 = null;
                    exploreCollectionItemsPagingSource$load$12.label = 1;
                    obj = exploreCollectionsService.getCollectionItems(str3, str2, num, str4, exploreCollectionItemsPagingSource$load$12);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                    PageData pageData = (PageData) ((AsyncCallResult.Success) asyncCallResult).getData();
                    this.onPageLoaded.invoke(pageData.getItems());
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
        exploreCollectionItemsPagingSource$load$1 = new ExploreCollectionItemsPagingSource$load$1(this, cVar);
        ExploreCollectionItemsPagingSource$load$1 exploreCollectionItemsPagingSource$load$122 = exploreCollectionItemsPagingSource$load$1;
        Object obj2 = exploreCollectionItemsPagingSource$load$122.result;
        i10 = exploreCollectionItemsPagingSource$load$122.label;
        String str5 = null;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
        }
    }

    public /* synthetic */ ExploreCollectionItemsPagingSource(ExploreCollectionsService exploreCollectionsService, String str, String str2, List list, String str3, l lVar, int i10, f fVar) {
        this(exploreCollectionsService, str, (i10 & 4) != 0 ? null : str2, list, str3, (i10 & 32) != 0 ? new io.elevenlabs.highlighter.z(14) : lVar);
    }
}

package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.ExploreCollectionsAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.DataModelsToDomainModelsKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ExploreCollectionDetailsV4Response;
import io.elevenlabs.data.model.response.ExploreReadResponseModel;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.PageData;
import io.elevenlabs.domain.services.ExploreCollectionsService;
import ir.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/data/services/ExploreCollectionsServiceImpl;", "Lio/elevenlabs/domain/services/ExploreCollectionsService;", "Lio/elevenlabs/data/api/ExploreCollectionsAPI;", "exploreCollectionsAPI", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/data/api/ExploreCollectionsAPI;Lio/elevenlabs/domain/Logger;)V", "", "collectionId", "language", "Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/CollectionDetailsWithFirstPage;", "getCollectionDetails", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "cursor", "", "pageSize", "Lio/elevenlabs/domain/model/PageData;", "Lio/elevenlabs/domain/model/ExploreRead;", "getCollectionItems", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/ExploreCollectionsAPI;", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreCollectionsServiceImpl implements ExploreCollectionsService {
    private static final String TAG = "ExploreCollectionsService";
    private final ExploreCollectionsAPI exploreCollectionsAPI;
    private final Logger logger;

    public ExploreCollectionsServiceImpl(ExploreCollectionsAPI exploreCollectionsAPI, Logger logger) {
        exploreCollectionsAPI.getClass();
        logger.getClass();
        this.exploreCollectionsAPI = exploreCollectionsAPI;
        this.logger = logger;
    }

    public static /* synthetic */ PageData a(ExploreCollectionDetailsV4Response exploreCollectionDetailsV4Response) {
        return getCollectionItems$lambda$0(exploreCollectionDetailsV4Response);
    }

    public static final PageData getCollectionItems$lambda$0(ExploreCollectionDetailsV4Response exploreCollectionDetailsV4Response) {
        exploreCollectionDetailsV4Response.getClass();
        List<ExploreReadResponseModel> items = exploreCollectionDetailsV4Response.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it.next()));
        }
        return new PageData(arrayList, exploreCollectionDetailsV4Response.getHasMore(), exploreCollectionDetailsV4Response.getNextCursor());
    }

    @Override // io.elevenlabs.domain.services.ExploreCollectionsService
    public Object getCollectionDetails(String str, String str2, wn.c<? super ir.i> cVar) {
        this.logger.log(TAG, "getCollectionDetails - collectionId=" + str);
        final m1 m1Var = new m1(new ExploreCollectionsServiceImpl$getCollectionDetails$2(this, str, str2, null));
        return new ir.i() { // from class: io.elevenlabs.data.services.ExploreCollectionsServiceImpl$getCollectionDetails$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ExploreCollectionsServiceImpl$getCollectionDetails$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ExploreCollectionsServiceImpl$getCollectionDetails$$inlined$map$1$2", f = "ExploreCollectionsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ExploreCollectionsServiceImpl$getCollectionDetails$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), ExploreCollectionsServiceImpl$getCollectionDetails$3$1.INSTANCE);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(map, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // io.elevenlabs.domain.services.ExploreCollectionsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCollectionItems(String str, String str2, Integer num, String str3, wn.c<? super AsyncCallResult<PageData<ExploreRead>>> cVar) {
        ExploreCollectionsServiceImpl$getCollectionItems$1 exploreCollectionsServiceImpl$getCollectionItems$1;
        int i10;
        if (cVar instanceof ExploreCollectionsServiceImpl$getCollectionItems$1) {
            exploreCollectionsServiceImpl$getCollectionItems$1 = (ExploreCollectionsServiceImpl$getCollectionItems$1) cVar;
            int i11 = exploreCollectionsServiceImpl$getCollectionItems$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                exploreCollectionsServiceImpl$getCollectionItems$1.label = i11 - Integer.MIN_VALUE;
                ExploreCollectionsServiceImpl$getCollectionItems$1 exploreCollectionsServiceImpl$getCollectionItems$12 = exploreCollectionsServiceImpl$getCollectionItems$1;
                Object obj = exploreCollectionsServiceImpl$getCollectionItems$12.result;
                i10 = exploreCollectionsServiceImpl$getCollectionItems$12.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    Logger logger = this.logger;
                    StringBuilder s10 = defpackage.f.s("getCollectionItems - collectionId=", str, ", cursor=", str2, ", pageSize=");
                    s10.append(num);
                    logger.log(TAG, s10.toString());
                    ExploreCollectionsAPI exploreCollectionsAPI = this.exploreCollectionsAPI;
                    exploreCollectionsServiceImpl$getCollectionItems$12.L$0 = null;
                    exploreCollectionsServiceImpl$getCollectionItems$12.L$1 = null;
                    exploreCollectionsServiceImpl$getCollectionItems$12.L$2 = null;
                    exploreCollectionsServiceImpl$getCollectionItems$12.L$3 = null;
                    exploreCollectionsServiceImpl$getCollectionItems$12.label = 1;
                    obj = exploreCollectionsAPI.getCollectionDetails(str, "private", str2, num, str3, exploreCollectionsServiceImpl$getCollectionItems$12);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(13));
            }
        }
        exploreCollectionsServiceImpl$getCollectionItems$1 = new ExploreCollectionsServiceImpl$getCollectionItems$1(this, cVar);
        ExploreCollectionsServiceImpl$getCollectionItems$1 exploreCollectionsServiceImpl$getCollectionItems$122 = exploreCollectionsServiceImpl$getCollectionItems$1;
        Object obj2 = exploreCollectionsServiceImpl$getCollectionItems$122.result;
        i10 = exploreCollectionsServiceImpl$getCollectionItems$122.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(13));
    }
}

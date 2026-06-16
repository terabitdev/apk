package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.u0;
import com.google.protobuf.c6;
import fr.d0;
import fr.e0;
import fr.g0;
import io.elevenlabs.data.api.CollectionsAPI;
import io.elevenlabs.data.database.entities.collections.CollectionEntity;
import io.elevenlabs.data.database.entities.collections.CollectionsDao;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;
import io.elevenlabs.data.model.BodyCreateUserCollectionUserCollectionsPost;
import io.elevenlabs.data.model.BodyUpdateUserCollectionUserCollectionsCollectionIdPut;
import io.elevenlabs.data.model.response.CollectionMetaResponse;
import io.elevenlabs.data.model.response.GetCollectionResponse;
import io.elevenlabs.data.model.response.GetReadCollectionsResponse;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionData;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ConnectivityService;
import ir.k1;
import ir.m1;
import ir.q1;
import ir.r;
import ir.t1;
import ir.y1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;
import tn.o;
import tn.p;
import tn.t;
import uf.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001JBC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001d0\u0019H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00192\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J.\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u00192\u0006\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0004\b(\u0010)J0\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J&\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130&2\u0006\u0010.\u001a\u00020 2\u0006\u00100\u001a\u00020/H\u0096@¢\u0006\u0004\b1\u00102J.\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130&2\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020 2\u0006\u00100\u001a\u00020/H\u0096@¢\u0006\u0004\b3\u00104J\u001e\u00106\u001a\b\u0012\u0004\u0012\u0002050&2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b6\u0010#J,\u00109\u001a\b\u0012\u0004\u0012\u0002050&2\u0006\u0010!\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00020 07H\u0096@¢\u0006\u0004\b9\u0010:J&\u0010<\u001a\b\u0012\u0004\u0012\u0002050&2\u0006\u0010!\u001a\u00020 2\u0006\u0010;\u001a\u00020 H\u0096@¢\u0006\u0004\b<\u0010)J$\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0&2\u0006\u0010;\u001a\u00020 H\u0096@¢\u0006\u0004\b=\u0010#J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u0002050&2\u0006\u0010;\u001a\u00020 H\u0096@¢\u0006\u0004\b>\u0010#J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u0002050&2\u0006\u0010;\u001a\u00020 H\u0096@¢\u0006\u0004\b?\u0010#J\u001c\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001d0\u0019H\u0096@¢\u0006\u0004\b@\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010GR\u0014\u0010H\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lio/elevenlabs/data/services/CollectionsServiceImpl;", "Lio/elevenlabs/domain/services/CollectionsService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/data/api/CollectionsAPI;", "collectionsAPI", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "collectionsDao", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lfr/d0;", "coroutineScope", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/data/services/ReadMetadataSaver;", "readMetadataSaver", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/data/api/CollectionsAPI;Lio/elevenlabs/data/database/entities/collections/CollectionsDao;Lio/elevenlabs/domain/DispatcherFactory;Lfr/d0;Lio/elevenlabs/domain/services/ConnectivityService;Lio/elevenlabs/data/services/ReadMetadataSaver;)V", "Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "Lio/elevenlabs/domain/model/CollectionMeta;", "toDomain", "(Lio/elevenlabs/data/database/entities/collections/CollectionEntity;)Lio/elevenlabs/domain/model/CollectionMeta;", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "toEntity", "(Lio/elevenlabs/data/model/response/CollectionMetaResponse;)Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "()Lir/i;", "", "getCollections", "(Lwn/c;)Ljava/lang/Object;", "", "id", "getCollection", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "collectionId", "cursor", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/CollectionData;", "observeCollectionData", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "allowStale", "getCollectionDataAndCacheReads", "(Ljava/lang/String;Ljava/lang/String;ZLwn/c;)Ljava/lang/Object;", "title", "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", ParameterNames.ICON, "addCollection", "(Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionMeta$Icon;Lwn/c;)Ljava/lang/Object;", "updateCollection", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionMeta$Icon;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "deleteCollection", "", "readIds", "addReadsToCollection", "(Ljava/lang/String;Ljava/lang/Iterable;Lwn/c;)Ljava/lang/Object;", "readId", "removeReadFromCollection", "getCollectionsContainingRead", "addReadToReadLater", "removeReadFromReadLater", "getFollowedSeries", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/data/api/CollectionsAPI;", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lfr/d0;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lio/elevenlabs/data/services/ReadMetadataSaver;", ParameterNames.TAG, "Ljava/lang/String;", "CollectionsSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionsServiceImpl implements CollectionsService {
    private final CollectionsAPI collectionsAPI;
    private final CollectionsDao collectionsDao;
    private final ConnectivityService connectivityService;
    private final d0 coroutineScope;
    private final DispatcherFactory dispatcherFactory;
    private final Logger logger;
    private final ReadMetadataSaver readMetadataSaver;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/CollectionsServiceImpl$CollectionsSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class CollectionsSyncException extends Exception {
    }

    public CollectionsServiceImpl(Logger logger, CollectionsAPI collectionsAPI, CollectionsDao collectionsDao, DispatcherFactory dispatcherFactory, @ApplicationCoroutineScope d0 d0Var, ConnectivityService connectivityService, ReadMetadataSaver readMetadataSaver) {
        logger.getClass();
        collectionsAPI.getClass();
        collectionsDao.getClass();
        dispatcherFactory.getClass();
        d0Var.getClass();
        connectivityService.getClass();
        readMetadataSaver.getClass();
        this.logger = logger;
        this.collectionsAPI = collectionsAPI;
        this.collectionsDao = collectionsDao;
        this.dispatcherFactory = dispatcherFactory;
        this.coroutineScope = d0Var;
        this.connectivityService = connectivityService;
        this.readMetadataSaver = readMetadataSaver;
        this.tag = "CollectionsService";
    }

    public static /* synthetic */ CollectionMeta a(CollectionMetaResponse collectionMetaResponse) {
        return addCollection$lambda$0(collectionMetaResponse);
    }

    public static final CollectionMeta addCollection$lambda$0(CollectionMetaResponse collectionMetaResponse) {
        collectionMetaResponse.getClass();
        return CollectionsServiceImplKt.toDomain(collectionMetaResponse);
    }

    public static final z addReadsToCollection$lambda$0(CollectionMetaResponse collectionMetaResponse) {
        collectionMetaResponse.getClass();
        return z.f31622a;
    }

    public static /* synthetic */ CollectionData b(GetCollectionResponse getCollectionResponse) {
        return getCollectionDataAndCacheReads$lambda$0(getCollectionResponse);
    }

    public static /* synthetic */ z c(CollectionMetaResponse collectionMetaResponse) {
        return addReadsToCollection$lambda$0(collectionMetaResponse);
    }

    public static /* synthetic */ List d(GetReadCollectionsResponse getReadCollectionsResponse) {
        return getCollectionsContainingRead$lambda$0(getReadCollectionsResponse);
    }

    public static /* synthetic */ CollectionMeta e(CollectionMetaResponse collectionMetaResponse) {
        return updateCollection$lambda$0(collectionMetaResponse);
    }

    public static /* synthetic */ z f(CollectionMetaResponse collectionMetaResponse) {
        return removeReadFromCollection$lambda$0(collectionMetaResponse);
    }

    public static final CollectionData getCollectionDataAndCacheReads$lambda$0(GetCollectionResponse getCollectionResponse) {
        getCollectionResponse.getClass();
        CollectionMeta domain = CollectionsServiceImplKt.toDomain(getCollectionResponse.getMeta());
        List<ReadMetadataResponseModel> items = getCollectionResponse.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ReadMappingKt.toDomain((ReadMetadataResponseModel) it.next()));
        }
        return new CollectionData(domain, arrayList, getCollectionResponse.getHasMore(), getCollectionResponse.getNextCursor());
    }

    public static final List getCollectionsContainingRead$lambda$0(GetReadCollectionsResponse getReadCollectionsResponse) {
        getReadCollectionsResponse.getClass();
        return getReadCollectionsResponse.getCollectionIds();
    }

    public static final z removeReadFromCollection$lambda$0(CollectionMetaResponse collectionMetaResponse) {
        collectionMetaResponse.getClass();
        return z.f31622a;
    }

    public final CollectionMeta toDomain(CollectionEntity collectionEntity) {
        Date date;
        Date date2;
        String id2 = collectionEntity.getId();
        String title = collectionEntity.getTitle();
        String subtitle = collectionEntity.getSubtitle();
        String description = collectionEntity.getDescription();
        String image_url = collectionEntity.getImage_url();
        Long last_opened_at_unix = collectionEntity.getLast_opened_at_unix();
        xq.d dVar = xq.d.SECONDS;
        CollectionMeta.Icon icon = null;
        if (last_opened_at_unix != null) {
            long longValue = last_opened_at_unix.longValue();
            xq.a aVar = xq.b.f38124b;
            date = new Date(xq.b.d(xq.g.o(longValue, dVar)));
        } else {
            date = null;
        }
        Long updated_at_unix = collectionEntity.getUpdated_at_unix();
        if (updated_at_unix != null) {
            long longValue2 = updated_at_unix.longValue();
            xq.a aVar2 = xq.b.f38124b;
            date2 = new Date(xq.b.d(xq.g.o(longValue2, dVar)));
        } else {
            date2 = null;
        }
        boolean has_unread = collectionEntity.getHas_unread();
        String category = collectionEntity.getCategory();
        Long item_count = collectionEntity.getItem_count();
        boolean c5 = m.c(collectionEntity.is_owner(), Boolean.TRUE);
        String icon2 = collectionEntity.getIcon();
        if (icon2 != null) {
            icon = CollectionsServiceImplKt.toCollectionIcon(icon2);
        }
        return new CollectionMeta(id2, title, subtitle, description, image_url, has_unread, date, date2, category, item_count, c5, icon);
    }

    public final CollectionEntity toEntity(CollectionMetaResponse collectionMetaResponse) {
        return new CollectionEntity(collectionMetaResponse.getId(), collectionMetaResponse.getTitle(), collectionMetaResponse.getSubtitle(), m.c(collectionMetaResponse.getHasUnread(), Boolean.TRUE), collectionMetaResponse.getDescription(), collectionMetaResponse.getImageUrl(), collectionMetaResponse.getLastOpenedAtUnix(), collectionMetaResponse.getUpdatedAtUnix(), collectionMetaResponse.getCategory(), collectionMetaResponse.getItemCount(), collectionMetaResponse.isOwner(), collectionMetaResponse.getIcon());
    }

    public static final CollectionMeta updateCollection$lambda$0(CollectionMetaResponse collectionMetaResponse) {
        collectionMetaResponse.getClass();
        return CollectionsServiceImplKt.toDomain(collectionMetaResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.CollectionsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addCollection(String str, CollectionMeta.Icon icon, wn.c<? super AsyncCallResult<CollectionMeta>> cVar) {
        CollectionsServiceImpl$addCollection$1 collectionsServiceImpl$addCollection$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof CollectionsServiceImpl$addCollection$1) {
            collectionsServiceImpl$addCollection$1 = (CollectionsServiceImpl$addCollection$1) cVar;
            int i11 = collectionsServiceImpl$addCollection$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                collectionsServiceImpl$addCollection$1.label = i11 - Integer.MIN_VALUE;
                Object obj = collectionsServiceImpl$addCollection$1.result;
                i10 = collectionsServiceImpl$addCollection$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    CollectionsAPI collectionsAPI = this.collectionsAPI;
                    String stringValue = CollectionsServiceImplKt.toStringValue(icon);
                    if (stringValue == null) {
                        stringValue = (String) a0.G(CollectionsServiceImplKt.getIconToStringMap(), CollectionMeta.Icon.Folder);
                    }
                    BodyCreateUserCollectionUserCollectionsPost bodyCreateUserCollectionUserCollectionsPost = new BodyCreateUserCollectionUserCollectionsPost(str, stringValue);
                    collectionsServiceImpl$addCollection$1.L$0 = null;
                    collectionsServiceImpl$addCollection$1.L$1 = null;
                    collectionsServiceImpl$addCollection$1.label = 1;
                    obj = collectionsAPI.createCollection(bodyCreateUserCollectionUserCollectionsPost, collectionsServiceImpl$addCollection$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Error)) {
                    if (apiResult instanceof ApiResult.Success) {
                        this.collectionsDao.insert(toEntity((CollectionMetaResponse) ((ApiResult.Success) apiResult).getData()));
                    } else {
                        c6.p();
                        return null;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(6));
            }
        }
        collectionsServiceImpl$addCollection$1 = new CollectionsServiceImpl$addCollection$1(this, cVar);
        Object obj2 = collectionsServiceImpl$addCollection$1.result;
        i10 = collectionsServiceImpl$addCollection$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Error)) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(6));
    }

    @Override // io.elevenlabs.domain.services.CollectionsService
    public Object addReadToReadLater(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        return addReadsToCollection(CollectionMeta.READ_LATER_ID, ig.f.H(str), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.CollectionsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addReadsToCollection(String str, Iterable<String> iterable, wn.c<? super AsyncCallResult<z>> cVar) {
        CollectionsServiceImpl$addReadsToCollection$1 collectionsServiceImpl$addReadsToCollection$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof CollectionsServiceImpl$addReadsToCollection$1) {
            collectionsServiceImpl$addReadsToCollection$1 = (CollectionsServiceImpl$addReadsToCollection$1) cVar;
            int i11 = collectionsServiceImpl$addReadsToCollection$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                collectionsServiceImpl$addReadsToCollection$1.label = i11 - Integer.MIN_VALUE;
                Object obj = collectionsServiceImpl$addReadsToCollection$1.result;
                i10 = collectionsServiceImpl$addReadsToCollection$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    CollectionsAPI collectionsAPI = this.collectionsAPI;
                    BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost = new BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost(o.g1(iterable), t.f33547a);
                    collectionsServiceImpl$addReadsToCollection$1.L$0 = null;
                    collectionsServiceImpl$addReadsToCollection$1.L$1 = null;
                    collectionsServiceImpl$addReadsToCollection$1.label = 1;
                    obj = collectionsAPI.bulkUpdateCollection(str, bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost, collectionsServiceImpl$addReadsToCollection$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Error)) {
                    if (apiResult instanceof ApiResult.Success) {
                        this.collectionsDao.insert(toEntity((CollectionMetaResponse) ((ApiResult.Success) apiResult).getData()));
                    } else {
                        c6.p();
                        return null;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(8));
            }
        }
        collectionsServiceImpl$addReadsToCollection$1 = new CollectionsServiceImpl$addReadsToCollection$1(this, cVar);
        Object obj2 = collectionsServiceImpl$addReadsToCollection$1.result;
        i10 = collectionsServiceImpl$addReadsToCollection$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Error)) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r8 == r4) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // io.elevenlabs.domain.services.CollectionsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteCollection(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        CollectionsServiceImpl$deleteCollection$1 collectionsServiceImpl$deleteCollection$1;
        int i10;
        ApiResult apiResult;
        ApiResult apiResult2;
        CollectionEntity collectionEntity;
        if (cVar instanceof CollectionsServiceImpl$deleteCollection$1) {
            collectionsServiceImpl$deleteCollection$1 = (CollectionsServiceImpl$deleteCollection$1) cVar;
            int i11 = collectionsServiceImpl$deleteCollection$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                collectionsServiceImpl$deleteCollection$1.label = i11 - Integer.MIN_VALUE;
                Object obj = collectionsServiceImpl$deleteCollection$1.result;
                i10 = collectionsServiceImpl$deleteCollection$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            apiResult2 = (ApiResult) collectionsServiceImpl$deleteCollection$1.L$1;
                            sn.a.g(obj);
                            collectionEntity = (CollectionEntity) obj;
                            if (collectionEntity != null) {
                                this.collectionsDao.delete(collectionEntity);
                            }
                            apiResult = apiResult2;
                            return ApiResultExtensionKt.toDomain(apiResult);
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) collectionsServiceImpl$deleteCollection$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    CollectionsAPI collectionsAPI = this.collectionsAPI;
                    collectionsServiceImpl$deleteCollection$1.L$0 = str;
                    collectionsServiceImpl$deleteCollection$1.label = 1;
                    obj = collectionsAPI.deleteCollection(str, collectionsServiceImpl$deleteCollection$1);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Error)) {
                    if (apiResult instanceof ApiResult.Success) {
                        ir.i observeById = this.collectionsDao.observeById(str);
                        collectionsServiceImpl$deleteCollection$1.L$0 = null;
                        collectionsServiceImpl$deleteCollection$1.L$1 = apiResult;
                        collectionsServiceImpl$deleteCollection$1.label = 2;
                        Object w6 = r.w(observeById, collectionsServiceImpl$deleteCollection$1);
                        if (w6 != aVar) {
                            obj = w6;
                            apiResult2 = apiResult;
                            collectionEntity = (CollectionEntity) obj;
                            if (collectionEntity != null) {
                            }
                            apiResult = apiResult2;
                        }
                        return aVar;
                    }
                    c6.p();
                    return null;
                }
                return ApiResultExtensionKt.toDomain(apiResult);
            }
        }
        collectionsServiceImpl$deleteCollection$1 = new CollectionsServiceImpl$deleteCollection$1(this, cVar);
        Object obj2 = collectionsServiceImpl$deleteCollection$1.result;
        i10 = collectionsServiceImpl$deleteCollection$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Error)) {
        }
        return ApiResultExtensionKt.toDomain(apiResult);
    }

    @Override // io.elevenlabs.domain.services.CollectionsService
    public Object getCollection(String str, wn.c<? super ir.i> cVar) {
        final ir.i observeById = this.collectionsDao.observeById(str);
        return new ir.i() { // from class: io.elevenlabs.data.services.CollectionsServiceImpl$getCollection$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.CollectionsServiceImpl$getCollection$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ CollectionsServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.CollectionsServiceImpl$getCollection$$inlined$map$1$2", f = "CollectionsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.CollectionsServiceImpl$getCollection$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(ir.j jVar, CollectionsServiceImpl collectionsServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = collectionsServiceImpl;
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
                    CollectionMeta collectionMeta;
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
                                CollectionEntity collectionEntity = (CollectionEntity) obj;
                                if (collectionEntity != null) {
                                    collectionMeta = this.this$0.toDomain(collectionEntity);
                                } else {
                                    collectionMeta = null;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(collectionMeta, anonymousClass1);
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
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // io.elevenlabs.domain.services.CollectionsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCollectionDataAndCacheReads(String str, String str2, boolean z6, wn.c<? super AsyncCallResult<CollectionData>> cVar) {
        CollectionsServiceImpl$getCollectionDataAndCacheReads$1 collectionsServiceImpl$getCollectionDataAndCacheReads$1;
        int i10;
        String str3;
        boolean z10;
        AsyncCallResult domain;
        AsyncCallResult asyncCallResult;
        Iterator<ReadMetadataResponseModel> it;
        if (cVar instanceof CollectionsServiceImpl$getCollectionDataAndCacheReads$1) {
            collectionsServiceImpl$getCollectionDataAndCacheReads$1 = (CollectionsServiceImpl$getCollectionDataAndCacheReads$1) cVar;
            int i11 = collectionsServiceImpl$getCollectionDataAndCacheReads$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                collectionsServiceImpl$getCollectionDataAndCacheReads$1.label = i11 - Integer.MIN_VALUE;
                CollectionsServiceImpl$getCollectionDataAndCacheReads$1 collectionsServiceImpl$getCollectionDataAndCacheReads$12 = collectionsServiceImpl$getCollectionDataAndCacheReads$1;
                Object obj = collectionsServiceImpl$getCollectionDataAndCacheReads$12.result;
                i10 = collectionsServiceImpl$getCollectionDataAndCacheReads$12.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            z10 = collectionsServiceImpl$getCollectionDataAndCacheReads$12.Z$0;
                            it = (Iterator) collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$3;
                            asyncCallResult = (AsyncCallResult) collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$2;
                            sn.a.g(obj);
                            while (it.hasNext()) {
                                ReadMetadataResponseModel next = it.next();
                                ReadMetadataSaver readMetadataSaver = this.readMetadataSaver;
                                ReadMetaEntityWithChapters entity = ReadMappingKt.toEntity(next);
                                collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$0 = null;
                                collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$1 = null;
                                collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$2 = asyncCallResult;
                                collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$3 = it;
                                collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$4 = null;
                                collectionsServiceImpl$getCollectionDataAndCacheReads$12.Z$0 = z10;
                                collectionsServiceImpl$getCollectionDataAndCacheReads$12.label = 2;
                                if (readMetadataSaver.saveMetaAndChapters(entity, collectionsServiceImpl$getCollectionDataAndCacheReads$12) == aVar) {
                                    return aVar;
                                }
                            }
                            domain = asyncCallResult;
                            return ApiResultExtensionKt.map(domain, new b(3));
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z10 = collectionsServiceImpl$getCollectionDataAndCacheReads$12.Z$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    CollectionsAPI collectionsAPI = this.collectionsAPI;
                    if (z6) {
                        str3 = "max-stale=3600";
                    } else {
                        str3 = "private";
                    }
                    String str4 = str3;
                    collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$0 = null;
                    collectionsServiceImpl$getCollectionDataAndCacheReads$12.L$1 = null;
                    collectionsServiceImpl$getCollectionDataAndCacheReads$12.Z$0 = z6;
                    collectionsServiceImpl$getCollectionDataAndCacheReads$12.label = 1;
                    obj = CollectionsAPI.getById$default(collectionsAPI, str, str4, 0, str2, collectionsServiceImpl$getCollectionDataAndCacheReads$12, 4, null);
                    if (obj != aVar) {
                        z10 = z6;
                    }
                    return aVar;
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    if (domain instanceof AsyncCallResult.Success) {
                        asyncCallResult = domain;
                        it = ((GetCollectionResponse) ((AsyncCallResult.Success) domain).getData()).getItems().iterator();
                        while (it.hasNext()) {
                        }
                        domain = asyncCallResult;
                    } else {
                        c6.p();
                        return null;
                    }
                }
                return ApiResultExtensionKt.map(domain, new b(3));
            }
        }
        collectionsServiceImpl$getCollectionDataAndCacheReads$1 = new CollectionsServiceImpl$getCollectionDataAndCacheReads$1(this, cVar);
        CollectionsServiceImpl$getCollectionDataAndCacheReads$1 collectionsServiceImpl$getCollectionDataAndCacheReads$122 = collectionsServiceImpl$getCollectionDataAndCacheReads$1;
        Object obj2 = collectionsServiceImpl$getCollectionDataAndCacheReads$122.result;
        i10 = collectionsServiceImpl$getCollectionDataAndCacheReads$122.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
        return ApiResultExtensionKt.map(domain, new b(3));
    }

    @Override // io.elevenlabs.domain.services.CollectionsService
    public Object getCollections(wn.c<? super ir.i> cVar) {
        final ir.i all = this.collectionsDao.getAll();
        return new ir.i() { // from class: io.elevenlabs.data.services.CollectionsServiceImpl$getCollections$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.CollectionsServiceImpl$getCollections$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ CollectionsServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.CollectionsServiceImpl$getCollections$$inlined$map$1$2", f = "CollectionsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.CollectionsServiceImpl$getCollections$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(ir.j jVar, CollectionsServiceImpl collectionsServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = collectionsServiceImpl;
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
                    CollectionMeta domain;
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
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    domain = this.this$0.toDomain((CollectionEntity) it.next());
                                    arrayList.add(domain);
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(arrayList, anonymousClass1);
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
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.CollectionsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCollectionsContainingRead(String str, wn.c<? super AsyncCallResult<List<String>>> cVar) {
        CollectionsServiceImpl$getCollectionsContainingRead$1 collectionsServiceImpl$getCollectionsContainingRead$1;
        int i10;
        if (cVar instanceof CollectionsServiceImpl$getCollectionsContainingRead$1) {
            collectionsServiceImpl$getCollectionsContainingRead$1 = (CollectionsServiceImpl$getCollectionsContainingRead$1) cVar;
            int i11 = collectionsServiceImpl$getCollectionsContainingRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                collectionsServiceImpl$getCollectionsContainingRead$1.label = i11 - Integer.MIN_VALUE;
                Object obj = collectionsServiceImpl$getCollectionsContainingRead$1.result;
                i10 = collectionsServiceImpl$getCollectionsContainingRead$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    CollectionsAPI collectionsAPI = this.collectionsAPI;
                    collectionsServiceImpl$getCollectionsContainingRead$1.L$0 = null;
                    collectionsServiceImpl$getCollectionsContainingRead$1.label = 1;
                    obj = collectionsAPI.getUserCollectionsForRead(str, collectionsServiceImpl$getCollectionsContainingRead$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(7));
            }
        }
        collectionsServiceImpl$getCollectionsContainingRead$1 = new CollectionsServiceImpl$getCollectionsContainingRead$1(this, cVar);
        Object obj2 = collectionsServiceImpl$getCollectionsContainingRead$1.result;
        i10 = collectionsServiceImpl$getCollectionsContainingRead$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(7));
    }

    @Override // io.elevenlabs.domain.services.CollectionsService
    public Object getFollowedSeries(wn.c<? super ir.i> cVar) {
        final ir.i all = this.collectionsDao.getAll();
        return new ir.i() { // from class: io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ CollectionsServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1$2", f = "CollectionsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(ir.j jVar, CollectionsServiceImpl collectionsServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = collectionsServiceImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    CollectionMeta domain;
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
                                ArrayList arrayList = new ArrayList();
                                for (T t10 : (List) obj) {
                                    if (m.c(((CollectionEntity) t10).getCategory(), "series")) {
                                        arrayList.add(t10);
                                    }
                                }
                                List a12 = o.a1(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE (r7v4 'a12' java.util.List) = 
                                      (wrap:java.util.Comparator:0x0064: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:101) call: io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$lambda$0$$inlined$sortedByDescending$1.<init>():void type: CONSTRUCTOR)
                                      (r1v1 'arrayList' java.util.ArrayList)
                                     STATIC call: tn.o.a1(java.util.Comparator, java.lang.Iterable):java.util.List A[DECLARE_VAR, MD:(java.util.Comparator, java.lang.Iterable):java.util.List (m)] (LINE:104) in method: io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$lambda$0$$inlined$sortedByDescending$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 33 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = r8 instanceof io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r8
                                    io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1$2$1 r0 = (io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1$2$1 r0 = new io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1$2$1
                                    r0.<init>(r8)
                                L18:
                                    java.lang.Object r8 = r0.result
                                    int r1 = r0.label
                                    r2 = 1
                                    if (r1 == 0) goto L35
                                    if (r1 != r2) goto L2e
                                    java.lang.Object r7 = r0.L$3
                                    ir.j r7 = (ir.j) r7
                                    java.lang.Object r7 = r0.L$1
                                    io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1$2$1 r7 = (io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                                    sn.a.g(r8)
                                    goto La7
                                L2e:
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    com.google.protobuf.c6.x(r7)
                                    r7 = 0
                                    return r7
                                L35:
                                    sn.a.g(r8)
                                    ir.j r8 = r6.$this_unsafeFlow
                                    java.util.List r7 = (java.util.List) r7
                                    java.util.ArrayList r1 = new java.util.ArrayList
                                    r1.<init>()
                                    java.util.Iterator r7 = r7.iterator()
                                L45:
                                    boolean r3 = r7.hasNext()
                                    if (r3 == 0) goto L62
                                    java.lang.Object r3 = r7.next()
                                    r4 = r3
                                    io.elevenlabs.data.database.entities.collections.CollectionEntity r4 = (io.elevenlabs.data.database.entities.collections.CollectionEntity) r4
                                    java.lang.String r4 = r4.getCategory()
                                    java.lang.String r5 = "series"
                                    boolean r4 = kotlin.jvm.internal.m.c(r4, r5)
                                    if (r4 == 0) goto L45
                                    r1.add(r3)
                                    goto L45
                                L62:
                                    io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$lambda$0$$inlined$sortedByDescending$1 r7 = new io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$lambda$0$$inlined$sortedByDescending$1
                                    r7.<init>()
                                    java.util.List r7 = tn.o.a1(r7, r1)
                                    java.util.ArrayList r1 = new java.util.ArrayList
                                    r3 = 10
                                    int r3 = tn.p.a0(r7, r3)
                                    r1.<init>(r3)
                                    java.util.Iterator r7 = r7.iterator()
                                L7a:
                                    boolean r3 = r7.hasNext()
                                    if (r3 == 0) goto L90
                                    java.lang.Object r3 = r7.next()
                                    io.elevenlabs.data.database.entities.collections.CollectionEntity r3 = (io.elevenlabs.data.database.entities.collections.CollectionEntity) r3
                                    io.elevenlabs.data.services.CollectionsServiceImpl r4 = r6.this$0
                                    io.elevenlabs.domain.model.CollectionMeta r3 = io.elevenlabs.data.services.CollectionsServiceImpl.access$toDomain(r4, r3)
                                    r1.add(r3)
                                    goto L7a
                                L90:
                                    r7 = 0
                                    r0.L$0 = r7
                                    r0.L$1 = r7
                                    r0.L$2 = r7
                                    r0.L$3 = r7
                                    r7 = 0
                                    r0.I$0 = r7
                                    r0.label = r2
                                    java.lang.Object r7 = r8.emit(r1, r0)
                                    xn.a r8 = xn.a.f37986a
                                    if (r7 != r8) goto La7
                                    return r8
                                La7:
                                    sn.z r7 = sn.z.f31622a
                                    return r7
                                */
                                throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.services.CollectionsServiceImpl$getFollowedSeries$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                            }
                        }

                        @Override // ir.i
                        public Object collect(ir.j jVar, wn.c cVar2) {
                            Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                            if (collect == xn.a.f37986a) {
                                return collect;
                            }
                            return z.f31622a;
                        }
                    };
                }

                @Override // io.elevenlabs.domain.services.CollectionsService
                public Object observeCollectionData(String str, String str2, wn.c<? super ir.i> cVar) {
                    final m1 m1Var = new m1(new CollectionsServiceImpl$observeCollectionData$2(this, str, str2, null));
                    return new ir.i() { // from class: io.elevenlabs.data.services.CollectionsServiceImpl$observeCollectionData$$inlined$map$1

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.data.services.CollectionsServiceImpl$observeCollectionData$$inlined$map$1$2, reason: invalid class name */
                        /* loaded from: classes3.dex */
                        public static final class AnonymousClass2<T> implements ir.j {
                            final /* synthetic */ ir.j $this_unsafeFlow;

                            @yn.e(c = "io.elevenlabs.data.services.CollectionsServiceImpl$observeCollectionData$$inlined$map$1$2", f = "CollectionsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                            /* renamed from: io.elevenlabs.data.services.CollectionsServiceImpl$observeCollectionData$$inlined$map$1$2$1, reason: invalid class name */
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
                                            AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), CollectionsServiceImpl$observeCollectionData$3$1.INSTANCE);
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

                /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // io.elevenlabs.domain.services.CollectionsService
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object removeReadFromCollection(String str, String str2, wn.c<? super AsyncCallResult<z>> cVar) {
                    CollectionsServiceImpl$removeReadFromCollection$1 collectionsServiceImpl$removeReadFromCollection$1;
                    int i10;
                    ApiResult apiResult;
                    if (cVar instanceof CollectionsServiceImpl$removeReadFromCollection$1) {
                        collectionsServiceImpl$removeReadFromCollection$1 = (CollectionsServiceImpl$removeReadFromCollection$1) cVar;
                        int i11 = collectionsServiceImpl$removeReadFromCollection$1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            collectionsServiceImpl$removeReadFromCollection$1.label = i11 - Integer.MIN_VALUE;
                            Object obj = collectionsServiceImpl$removeReadFromCollection$1.result;
                            i10 = collectionsServiceImpl$removeReadFromCollection$1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj);
                                CollectionsAPI collectionsAPI = this.collectionsAPI;
                                BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost = new BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost(t.f33547a, ig.f.H(str2));
                                collectionsServiceImpl$removeReadFromCollection$1.L$0 = null;
                                collectionsServiceImpl$removeReadFromCollection$1.L$1 = null;
                                collectionsServiceImpl$removeReadFromCollection$1.label = 1;
                                obj = collectionsAPI.bulkUpdateCollection(str, bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost, collectionsServiceImpl$removeReadFromCollection$1);
                                xn.a aVar = xn.a.f37986a;
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            apiResult = (ApiResult) obj;
                            if (!(apiResult instanceof ApiResult.Error)) {
                                if (apiResult instanceof ApiResult.Success) {
                                    this.collectionsDao.insert(toEntity((CollectionMetaResponse) ((ApiResult.Success) apiResult).getData()));
                                } else {
                                    c6.p();
                                    return null;
                                }
                            }
                            return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(5));
                        }
                    }
                    collectionsServiceImpl$removeReadFromCollection$1 = new CollectionsServiceImpl$removeReadFromCollection$1(this, cVar);
                    Object obj2 = collectionsServiceImpl$removeReadFromCollection$1.result;
                    i10 = collectionsServiceImpl$removeReadFromCollection$1.label;
                    if (i10 == 0) {
                    }
                    apiResult = (ApiResult) obj2;
                    if (!(apiResult instanceof ApiResult.Error)) {
                    }
                    return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(5));
                }

                @Override // io.elevenlabs.domain.services.CollectionsService
                public Object removeReadFromReadLater(String str, wn.c<? super AsyncCallResult<z>> cVar) {
                    return removeReadFromCollection(CollectionMeta.READ_LATER_ID, str, cVar);
                }

                @Override // io.elevenlabs.domain.services.CollectionsService
                public ir.i sync() {
                    e0 e0Var;
                    ir.e j4 = r.j(new CollectionsServiceImpl$sync$1(this, null));
                    kr.d F = g0.F(this.coroutineScope, this.dispatcherFactory.getDefault());
                    y1 y1Var = new y1(2000L, Long.MAX_VALUE);
                    n m10 = r.m(j4, 0);
                    q1 a10 = r.a(0, m10.f34359a, (hr.a) m10.f34361c);
                    wn.h hVar = (wn.h) m10.f34362d;
                    ir.i iVar = (ir.i) m10.f34360b;
                    com.google.gson.internal.e eVar = r.f18033c;
                    if (y1Var.equals(t1.f18063a)) {
                        e0Var = e0.f9812a;
                    } else {
                        e0Var = e0.f9815d;
                    }
                    g0.C(F, hVar, e0Var, new u0(y1Var, iVar, a10, eVar, (wn.c) null));
                    return new k1(a10);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // io.elevenlabs.domain.services.CollectionsService
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object updateCollection(String str, String str2, CollectionMeta.Icon icon, wn.c<? super AsyncCallResult<CollectionMeta>> cVar) {
                    CollectionsServiceImpl$updateCollection$1 collectionsServiceImpl$updateCollection$1;
                    int i10;
                    ApiResult apiResult;
                    if (cVar instanceof CollectionsServiceImpl$updateCollection$1) {
                        collectionsServiceImpl$updateCollection$1 = (CollectionsServiceImpl$updateCollection$1) cVar;
                        int i11 = collectionsServiceImpl$updateCollection$1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            collectionsServiceImpl$updateCollection$1.label = i11 - Integer.MIN_VALUE;
                            Object obj = collectionsServiceImpl$updateCollection$1.result;
                            i10 = collectionsServiceImpl$updateCollection$1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj);
                                CollectionsAPI collectionsAPI = this.collectionsAPI;
                                String stringValue = CollectionsServiceImplKt.toStringValue(icon);
                                if (stringValue == null) {
                                    stringValue = (String) a0.G(CollectionsServiceImplKt.getIconToStringMap(), CollectionMeta.Icon.Folder);
                                }
                                BodyUpdateUserCollectionUserCollectionsCollectionIdPut bodyUpdateUserCollectionUserCollectionsCollectionIdPut = new BodyUpdateUserCollectionUserCollectionsCollectionIdPut(str2, stringValue);
                                collectionsServiceImpl$updateCollection$1.L$0 = null;
                                collectionsServiceImpl$updateCollection$1.L$1 = null;
                                collectionsServiceImpl$updateCollection$1.L$2 = null;
                                collectionsServiceImpl$updateCollection$1.label = 1;
                                obj = collectionsAPI.updateCollection(str, bodyUpdateUserCollectionUserCollectionsCollectionIdPut, collectionsServiceImpl$updateCollection$1);
                                xn.a aVar = xn.a.f37986a;
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            apiResult = (ApiResult) obj;
                            if (!(apiResult instanceof ApiResult.Error)) {
                                if (apiResult instanceof ApiResult.Success) {
                                    this.collectionsDao.insert(toEntity((CollectionMetaResponse) ((ApiResult.Success) apiResult).getData()));
                                } else {
                                    c6.p();
                                    return null;
                                }
                            }
                            return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(4));
                        }
                    }
                    collectionsServiceImpl$updateCollection$1 = new CollectionsServiceImpl$updateCollection$1(this, cVar);
                    Object obj2 = collectionsServiceImpl$updateCollection$1.result;
                    i10 = collectionsServiceImpl$updateCollection$1.label;
                    if (i10 == 0) {
                    }
                    apiResult = (ApiResult) obj2;
                    if (!(apiResult instanceof ApiResult.Error)) {
                    }
                    return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(4));
                }
            }

package io.elevenlabs.data.api;

import ct.b;
import ct.f;
import ct.i;
import ct.o;
import ct.p;
import ct.s;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;
import io.elevenlabs.data.model.BodyCreateUserCollectionUserCollectionsPost;
import io.elevenlabs.data.model.BodyUpdateUserCollectionUserCollectionsCollectionIdPut;
import io.elevenlabs.data.model.response.CollectionMetaResponse;
import io.elevenlabs.data.model.response.GetCollectionResponse;
import io.elevenlabs.data.model.response.GetReadCollectionsResponse;
import io.elevenlabs.data.model.response.GetUserCollectionsResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001f\u0010 J \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0006H§@¢\u0006\u0004\b\"\u0010 ¨\u0006#À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/CollectionsAPI;", "", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/GetUserCollectionsResponse;", "getUserCollections", "(Lwn/c;)Ljava/lang/Object;", "", "id", "cacheControl", "", "pageSize", "cursor", "Lio/elevenlabs/data/model/response/GetCollectionResponse;", "getById", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lwn/c;)Ljava/lang/Object;", "collectionId", "readId", "Lsn/z;", "addReadToCollection", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/BodyUpdateUserCollectionUserCollectionsCollectionIdPut;", "body", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "updateCollection", "(Ljava/lang/String;Lio/elevenlabs/data/model/BodyUpdateUserCollectionUserCollectionsCollectionIdPut;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;", "bulkUpdateCollection", "(Ljava/lang/String;Lio/elevenlabs/data/model/BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/BodyCreateUserCollectionUserCollectionsPost;", "createCollection", "(Lio/elevenlabs/data/model/BodyCreateUserCollectionUserCollectionsPost;Lwn/c;)Ljava/lang/Object;", "deleteCollection", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/response/GetReadCollectionsResponse;", "getUserCollectionsForRead", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface CollectionsAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getById$default(CollectionsAPI collectionsAPI, String str, String str2, int i10, String str3, c cVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                i10 = 10;
            }
            int i12 = i10;
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return collectionsAPI.getById(str, str2, i12, str3, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getById");
        return null;
    }

    static /* synthetic */ Object updateCollection$default(CollectionsAPI collectionsAPI, String str, BodyUpdateUserCollectionUserCollectionsCollectionIdPut bodyUpdateUserCollectionUserCollectionsCollectionIdPut, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                bodyUpdateUserCollectionUserCollectionsCollectionIdPut = null;
            }
            return collectionsAPI.updateCollection(str, bodyUpdateUserCollectionUserCollectionsCollectionIdPut, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: updateCollection");
        return null;
    }

    @o("user-collections/{collection_id}/reads/{read_id}")
    Object addReadToCollection(@s("collection_id") String str, @s("read_id") String str2, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/user-collections/{collection_id}/bulk/reads")
    Object bulkUpdateCollection(@s("collection_id") String str, @ct.a BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost, c<? super ApiResult<CollectionMetaResponse>> cVar);

    @o("/v1/reader/user-collections/")
    Object createCollection(@ct.a BodyCreateUserCollectionUserCollectionsPost bodyCreateUserCollectionUserCollectionsPost, c<? super ApiResult<CollectionMetaResponse>> cVar);

    @b("/v1/reader/user-collections/{collection_id}")
    Object deleteCollection(@s("collection_id") String str, c<? super ApiResult<z>> cVar);

    @f("/v1/reader/collections/{id}")
    Object getById(@s("id") String str, @i("Cache-Control") String str2, @t("page_size") int i10, @t("cursor") String str3, c<? super ApiResult<GetCollectionResponse>> cVar);

    @f("/v1/reader/collections")
    Object getUserCollections(c<? super ApiResult<GetUserCollectionsResponse>> cVar);

    @f("/v1/reader/reads/{read_id}/user-collections")
    Object getUserCollectionsForRead(@s("read_id") String str, c<? super ApiResult<GetReadCollectionsResponse>> cVar);

    @p("/v1/reader/user-collections/{collection_id}")
    Object updateCollection(@s("collection_id") String str, @ct.a BodyUpdateUserCollectionUserCollectionsCollectionIdPut bodyUpdateUserCollectionUserCollectionsCollectionIdPut, c<? super ApiResult<CollectionMetaResponse>> cVar);
}

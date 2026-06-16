package io.elevenlabs.domain.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionData;
import io.elevenlabs.domain.model.CollectionMeta;
import ir.i;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b \u0010\rJ,\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!H¦@¢\u0006\u0004\b#\u0010$J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH¦@¢\u0006\u0004\b&\u0010\u0013J$\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00102\u0006\u0010%\u001a\u00020\nH¦@¢\u0006\u0004\b'\u0010\rJ\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\u0006\u0010%\u001a\u00020\nH¦@¢\u0006\u0004\b(\u0010\rJ\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\u0006\u0010%\u001a\u00020\nH¦@¢\u0006\u0004\b)\u0010\rJ\u001c\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002H¦@¢\u0006\u0004\b*\u0010\t¨\u0006+À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/CollectionsService;", "", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "()Lir/i;", "", "Lio/elevenlabs/domain/model/CollectionMeta;", "getCollections", "(Lwn/c;)Ljava/lang/Object;", "", "id", "getCollection", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "collectionId", "cursor", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/CollectionData;", "observeCollectionData", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "allowStale", "getCollectionDataAndCacheReads", "(Ljava/lang/String;Ljava/lang/String;ZLwn/c;)Ljava/lang/Object;", "title", "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", ParameterNames.ICON, "addCollection", "(Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionMeta$Icon;Lwn/c;)Ljava/lang/Object;", "updateCollection", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionMeta$Icon;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "deleteCollection", "", "readIds", "addReadsToCollection", "(Ljava/lang/String;Ljava/lang/Iterable;Lwn/c;)Ljava/lang/Object;", "readId", "removeReadFromCollection", "getCollectionsContainingRead", "addReadToReadLater", "removeReadFromReadLater", "getFollowedSeries", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface CollectionsService {
    Object addCollection(String str, CollectionMeta.Icon icon, c<? super AsyncCallResult<CollectionMeta>> cVar);

    Object addReadToReadLater(String str, c<? super AsyncCallResult<z>> cVar);

    Object addReadsToCollection(String str, Iterable<String> iterable, c<? super AsyncCallResult<z>> cVar);

    Object deleteCollection(String str, c<? super AsyncCallResult<z>> cVar);

    Object getCollection(String str, c<? super i> cVar);

    Object getCollectionDataAndCacheReads(String str, String str2, boolean z6, c<? super AsyncCallResult<CollectionData>> cVar);

    Object getCollections(c<? super i> cVar);

    Object getCollectionsContainingRead(String str, c<? super AsyncCallResult<List<String>>> cVar);

    Object getFollowedSeries(c<? super i> cVar);

    Object observeCollectionData(String str, String str2, c<? super i> cVar);

    Object removeReadFromCollection(String str, String str2, c<? super AsyncCallResult<z>> cVar);

    Object removeReadFromReadLater(String str, c<? super AsyncCallResult<z>> cVar);

    i sync();

    Object updateCollection(String str, String str2, CollectionMeta.Icon icon, c<? super AsyncCallResult<CollectionMeta>> cVar);
}

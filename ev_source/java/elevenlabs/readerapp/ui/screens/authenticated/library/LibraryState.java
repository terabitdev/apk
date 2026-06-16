package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.ReadsService;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\fHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0014\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u00020\bHÖ\u0081\u0004J\n\u00107\u001a\u000208HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018¨\u00069"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryState;", "", "isLibraryVisible", "", "sortBy", "Lio/elevenlabs/domain/services/ReadsService$SortBy;", "hasMore", "limit", "", "readsSyncStatus", "Lio/elevenlabs/domain/model/SyncStatus;", "reads", "", "Lio/elevenlabs/domain/model/ReadMeta;", "playerQueue", "Lio/elevenlabs/domain/model/MediaItemState;", "activeTab", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryTab;", "collections", "Lio/elevenlabs/domain/model/CollectionMeta;", "collectionsSyncStatus", "initialTabSet", "<init>", "(ZLio/elevenlabs/domain/services/ReadsService$SortBy;ZILio/elevenlabs/domain/model/SyncStatus;Ljava/util/List;Ljava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryTab;Ljava/util/List;Lio/elevenlabs/domain/model/SyncStatus;Z)V", "()Z", "getSortBy", "()Lio/elevenlabs/domain/services/ReadsService$SortBy;", "getHasMore", "getLimit", "()I", "getReadsSyncStatus", "()Lio/elevenlabs/domain/model/SyncStatus;", "getReads", "()Ljava/util/List;", "getPlayerQueue", "getActiveTab", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryTab;", "getCollections", "getCollectionsSyncStatus", "getInitialTabSet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class LibraryState {
    public static final int $stable = 8;
    private final LibraryTab activeTab;
    private final List<CollectionMeta> collections;
    private final SyncStatus collectionsSyncStatus;
    private final boolean hasMore;
    private final boolean initialTabSet;
    private final boolean isLibraryVisible;
    private final int limit;
    private final List<MediaItemState> playerQueue;
    private final List<ReadMeta> reads;
    private final SyncStatus readsSyncStatus;
    private final ReadsService.SortBy sortBy;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LibraryState(boolean z6, ReadsService.SortBy sortBy, boolean z10, int i10, SyncStatus syncStatus, List list, List list2, LibraryTab libraryTab, List list3, SyncStatus syncStatus2, boolean z11, int i11, kotlin.jvm.internal.f fVar) {
        this(z6, sortBy, z10, i10, syncStatus, r14 != 0 ? r0 : list, (i11 & 64) != 0 ? r0 : list2, (i11 & 128) != 0 ? LibraryTab.SAVED : libraryTab, (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r0 : list3, (i11 & 512) != 0 ? SyncStatus.SYNCING : syncStatus2, (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z11);
        z6 = (i11 & 1) != 0 ? true : z6;
        sortBy = (i11 & 2) != 0 ? ReadsService.SortBy.UpdatedAt : sortBy;
        z10 = (i11 & 4) != 0 ? true : z10;
        i10 = (i11 & 8) != 0 ? 10 : i10;
        syncStatus = (i11 & 16) != 0 ? SyncStatus.SYNCING : syncStatus;
        int i12 = i11 & 32;
        tn.t tVar = tn.t.f33547a;
    }

    public static /* synthetic */ LibraryState copy$default(LibraryState libraryState, boolean z6, ReadsService.SortBy sortBy, boolean z10, int i10, SyncStatus syncStatus, List list, List list2, LibraryTab libraryTab, List list3, SyncStatus syncStatus2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z6 = libraryState.isLibraryVisible;
        }
        if ((i11 & 2) != 0) {
            sortBy = libraryState.sortBy;
        }
        if ((i11 & 4) != 0) {
            z10 = libraryState.hasMore;
        }
        if ((i11 & 8) != 0) {
            i10 = libraryState.limit;
        }
        if ((i11 & 16) != 0) {
            syncStatus = libraryState.readsSyncStatus;
        }
        if ((i11 & 32) != 0) {
            list = libraryState.reads;
        }
        if ((i11 & 64) != 0) {
            list2 = libraryState.playerQueue;
        }
        if ((i11 & 128) != 0) {
            libraryTab = libraryState.activeTab;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            list3 = libraryState.collections;
        }
        if ((i11 & 512) != 0) {
            syncStatus2 = libraryState.collectionsSyncStatus;
        }
        if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z11 = libraryState.initialTabSet;
        }
        SyncStatus syncStatus3 = syncStatus2;
        boolean z12 = z11;
        LibraryTab libraryTab2 = libraryTab;
        List list4 = list3;
        List list5 = list;
        List list6 = list2;
        SyncStatus syncStatus4 = syncStatus;
        boolean z13 = z10;
        return libraryState.copy(z6, sortBy, z13, i10, syncStatus4, list5, list6, libraryTab2, list4, syncStatus3, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLibraryVisible() {
        return this.isLibraryVisible;
    }

    /* renamed from: component10, reason: from getter */
    public final SyncStatus getCollectionsSyncStatus() {
        return this.collectionsSyncStatus;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getInitialTabSet() {
        return this.initialTabSet;
    }

    /* renamed from: component2, reason: from getter */
    public final ReadsService.SortBy getSortBy() {
        return this.sortBy;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component5, reason: from getter */
    public final SyncStatus getReadsSyncStatus() {
        return this.readsSyncStatus;
    }

    public final List<ReadMeta> component6() {
        return this.reads;
    }

    public final List<MediaItemState> component7() {
        return this.playerQueue;
    }

    /* renamed from: component8, reason: from getter */
    public final LibraryTab getActiveTab() {
        return this.activeTab;
    }

    public final List<CollectionMeta> component9() {
        return this.collections;
    }

    public final LibraryState copy(boolean isLibraryVisible, ReadsService.SortBy sortBy, boolean hasMore, int limit, SyncStatus readsSyncStatus, List<ReadMeta> reads, List<MediaItemState> playerQueue, LibraryTab activeTab, List<CollectionMeta> collections, SyncStatus collectionsSyncStatus, boolean initialTabSet) {
        sortBy.getClass();
        readsSyncStatus.getClass();
        reads.getClass();
        playerQueue.getClass();
        activeTab.getClass();
        collections.getClass();
        collectionsSyncStatus.getClass();
        return new LibraryState(isLibraryVisible, sortBy, hasMore, limit, readsSyncStatus, reads, playerQueue, activeTab, collections, collectionsSyncStatus, initialTabSet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LibraryState)) {
            return false;
        }
        LibraryState libraryState = (LibraryState) other;
        if (this.isLibraryVisible == libraryState.isLibraryVisible && this.sortBy == libraryState.sortBy && this.hasMore == libraryState.hasMore && this.limit == libraryState.limit && this.readsSyncStatus == libraryState.readsSyncStatus && kotlin.jvm.internal.m.c(this.reads, libraryState.reads) && kotlin.jvm.internal.m.c(this.playerQueue, libraryState.playerQueue) && this.activeTab == libraryState.activeTab && kotlin.jvm.internal.m.c(this.collections, libraryState.collections) && this.collectionsSyncStatus == libraryState.collectionsSyncStatus && this.initialTabSet == libraryState.initialTabSet) {
            return true;
        }
        return false;
    }

    public final LibraryTab getActiveTab() {
        return this.activeTab;
    }

    public final List<CollectionMeta> getCollections() {
        return this.collections;
    }

    public final SyncStatus getCollectionsSyncStatus() {
        return this.collectionsSyncStatus;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getInitialTabSet() {
        return this.initialTabSet;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final List<MediaItemState> getPlayerQueue() {
        return this.playerQueue;
    }

    public final List<ReadMeta> getReads() {
        return this.reads;
    }

    public final SyncStatus getReadsSyncStatus() {
        return this.readsSyncStatus;
    }

    public final ReadsService.SortBy getSortBy() {
        return this.sortBy;
    }

    public int hashCode() {
        return Boolean.hashCode(this.initialTabSet) + ((this.collectionsSyncStatus.hashCode() + p.n.d((this.activeTab.hashCode() + p.n.d(p.n.d((this.readsSyncStatus.hashCode() + j0.c.b(this.limit, com.google.android.gms.internal.play_billing.b.f((this.sortBy.hashCode() + (Boolean.hashCode(this.isLibraryVisible) * 31)) * 31, 31, this.hasMore), 31)) * 31, 31, this.reads), 31, this.playerQueue)) * 31, 31, this.collections)) * 31);
    }

    public final boolean isLibraryVisible() {
        return this.isLibraryVisible;
    }

    public String toString() {
        boolean z6 = this.isLibraryVisible;
        ReadsService.SortBy sortBy = this.sortBy;
        boolean z10 = this.hasMore;
        int i10 = this.limit;
        SyncStatus syncStatus = this.readsSyncStatus;
        List<ReadMeta> list = this.reads;
        List<MediaItemState> list2 = this.playerQueue;
        LibraryTab libraryTab = this.activeTab;
        List<CollectionMeta> list3 = this.collections;
        SyncStatus syncStatus2 = this.collectionsSyncStatus;
        boolean z11 = this.initialTabSet;
        StringBuilder sb = new StringBuilder("LibraryState(isLibraryVisible=");
        sb.append(z6);
        sb.append(", sortBy=");
        sb.append(sortBy);
        sb.append(", hasMore=");
        sb.append(z10);
        sb.append(", limit=");
        sb.append(i10);
        sb.append(", readsSyncStatus=");
        sb.append(syncStatus);
        sb.append(", reads=");
        sb.append(list);
        sb.append(", playerQueue=");
        sb.append(list2);
        sb.append(", activeTab=");
        sb.append(libraryTab);
        sb.append(", collections=");
        sb.append(list3);
        sb.append(", collectionsSyncStatus=");
        sb.append(syncStatus2);
        sb.append(", initialTabSet=");
        return p.n.j(Separators.RPAREN, sb, z11);
    }

    public LibraryState(boolean z6, ReadsService.SortBy sortBy, boolean z10, int i10, SyncStatus syncStatus, List<ReadMeta> list, List<MediaItemState> list2, LibraryTab libraryTab, List<CollectionMeta> list3, SyncStatus syncStatus2, boolean z11) {
        sortBy.getClass();
        syncStatus.getClass();
        list.getClass();
        list2.getClass();
        libraryTab.getClass();
        list3.getClass();
        syncStatus2.getClass();
        this.isLibraryVisible = z6;
        this.sortBy = sortBy;
        this.hasMore = z10;
        this.limit = i10;
        this.readsSyncStatus = syncStatus;
        this.reads = list;
        this.playerQueue = list2;
        this.activeTab = libraryTab;
        this.collections = list3;
        this.collectionsSyncStatus = syncStatus2;
        this.initialTabSet = z11;
    }

    public LibraryState() {
        this(false, null, false, 0, null, null, null, null, null, null, false, 2047, null);
    }
}

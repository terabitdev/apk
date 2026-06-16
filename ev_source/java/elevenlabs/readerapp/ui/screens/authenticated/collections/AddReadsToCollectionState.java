package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SyncStatus;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J}\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\u0014\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u00020\u0010HÖ\u0081\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001c¨\u00062"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadsToCollectionState;", "", "collectionId", "", "syncStatus", "Lio/elevenlabs/domain/model/SyncStatus;", "reads", "", "Lio/elevenlabs/domain/model/ReadMeta;", "hasMore", "", "selectedItemsIds", "", "isSubmitLoading", "navigateToCollectionId", "limit", "", "query", "isLoading", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/SyncStatus;Ljava/util/List;ZLjava/util/Set;ZLjava/lang/String;ILjava/lang/String;Z)V", "getCollectionId", "()Ljava/lang/String;", "getSyncStatus", "()Lio/elevenlabs/domain/model/SyncStatus;", "getReads", "()Ljava/util/List;", "getHasMore", "()Z", "getSelectedItemsIds", "()Ljava/util/Set;", "getNavigateToCollectionId", "getLimit", "()I", "getQuery", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AddReadsToCollectionState {
    public static final int $stable = 8;
    private final String collectionId;
    private final boolean hasMore;
    private final boolean isLoading;
    private final boolean isSubmitLoading;
    private final int limit;
    private final String navigateToCollectionId;
    private final String query;
    private final List<ReadMeta> reads;
    private final Set<String> selectedItemsIds;
    private final SyncStatus syncStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AddReadsToCollectionState(String str, SyncStatus syncStatus, List list, boolean z6, Set set, boolean z10, String str2, int i10, String str3, boolean z11, int i11, kotlin.jvm.internal.f fVar) {
        this(str, syncStatus, list, z6, set, z10, str2, i10, str3, r13);
        boolean z12;
        str = (i11 & 1) != 0 ? null : str;
        syncStatus = (i11 & 2) != 0 ? SyncStatus.SYNCING : syncStatus;
        list = (i11 & 4) != 0 ? tn.t.f33547a : list;
        z6 = (i11 & 8) != 0 ? true : z6;
        set = (i11 & 16) != 0 ? tn.v.f33549a : set;
        z10 = (i11 & 32) != 0 ? false : z10;
        str2 = (i11 & 64) != 0 ? null : str2;
        i10 = (i11 & 128) != 0 ? 10 : i10;
        str3 = (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? "" : str3;
        if ((i11 & 512) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
    }

    public static /* synthetic */ AddReadsToCollectionState copy$default(AddReadsToCollectionState addReadsToCollectionState, String str, SyncStatus syncStatus, List list, boolean z6, Set set, boolean z10, String str2, int i10, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addReadsToCollectionState.collectionId;
        }
        if ((i11 & 2) != 0) {
            syncStatus = addReadsToCollectionState.syncStatus;
        }
        if ((i11 & 4) != 0) {
            list = addReadsToCollectionState.reads;
        }
        if ((i11 & 8) != 0) {
            z6 = addReadsToCollectionState.hasMore;
        }
        if ((i11 & 16) != 0) {
            set = addReadsToCollectionState.selectedItemsIds;
        }
        if ((i11 & 32) != 0) {
            z10 = addReadsToCollectionState.isSubmitLoading;
        }
        if ((i11 & 64) != 0) {
            str2 = addReadsToCollectionState.navigateToCollectionId;
        }
        if ((i11 & 128) != 0) {
            i10 = addReadsToCollectionState.limit;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str3 = addReadsToCollectionState.query;
        }
        if ((i11 & 512) != 0) {
            z11 = addReadsToCollectionState.isLoading;
        }
        String str4 = str3;
        boolean z12 = z11;
        String str5 = str2;
        int i12 = i10;
        Set set2 = set;
        boolean z13 = z10;
        return addReadsToCollectionState.copy(str, syncStatus, list, z6, set2, z13, str5, i12, str4, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final List<ReadMeta> component3() {
        return this.reads;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Set<String> component5() {
        return this.selectedItemsIds;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSubmitLoading() {
        return this.isSubmitLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNavigateToCollectionId() {
        return this.navigateToCollectionId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component9, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final AddReadsToCollectionState copy(String collectionId, SyncStatus syncStatus, List<ReadMeta> reads, boolean hasMore, Set<String> selectedItemsIds, boolean isSubmitLoading, String navigateToCollectionId, int limit, String query, boolean isLoading) {
        syncStatus.getClass();
        reads.getClass();
        selectedItemsIds.getClass();
        query.getClass();
        return new AddReadsToCollectionState(collectionId, syncStatus, reads, hasMore, selectedItemsIds, isSubmitLoading, navigateToCollectionId, limit, query, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddReadsToCollectionState)) {
            return false;
        }
        AddReadsToCollectionState addReadsToCollectionState = (AddReadsToCollectionState) other;
        if (kotlin.jvm.internal.m.c(this.collectionId, addReadsToCollectionState.collectionId) && this.syncStatus == addReadsToCollectionState.syncStatus && kotlin.jvm.internal.m.c(this.reads, addReadsToCollectionState.reads) && this.hasMore == addReadsToCollectionState.hasMore && kotlin.jvm.internal.m.c(this.selectedItemsIds, addReadsToCollectionState.selectedItemsIds) && this.isSubmitLoading == addReadsToCollectionState.isSubmitLoading && kotlin.jvm.internal.m.c(this.navigateToCollectionId, addReadsToCollectionState.navigateToCollectionId) && this.limit == addReadsToCollectionState.limit && kotlin.jvm.internal.m.c(this.query, addReadsToCollectionState.query) && this.isLoading == addReadsToCollectionState.isLoading) {
            return true;
        }
        return false;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getNavigateToCollectionId() {
        return this.navigateToCollectionId;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<ReadMeta> getReads() {
        return this.reads;
    }

    public final Set<String> getSelectedItemsIds() {
        return this.selectedItemsIds;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public int hashCode() {
        int hashCode;
        String str = this.collectionId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f((this.selectedItemsIds.hashCode() + com.google.android.gms.internal.play_billing.b.f(p.n.d((this.syncStatus.hashCode() + (hashCode * 31)) * 31, 31, this.reads), 31, this.hasMore)) * 31, 31, this.isSubmitLoading);
        String str2 = this.navigateToCollectionId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return Boolean.hashCode(this.isLoading) + j0.c.c(j0.c.b(this.limit, (f10 + i10) * 31, 31), 31, this.query);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSubmitLoading() {
        return this.isSubmitLoading;
    }

    public String toString() {
        return "AddReadsToCollectionState(collectionId=" + this.collectionId + ", syncStatus=" + this.syncStatus + ", reads=" + this.reads + ", hasMore=" + this.hasMore + ", selectedItemsIds=" + this.selectedItemsIds + ", isSubmitLoading=" + this.isSubmitLoading + ", navigateToCollectionId=" + this.navigateToCollectionId + ", limit=" + this.limit + ", query=" + this.query + ", isLoading=" + this.isLoading + Separators.RPAREN;
    }

    public AddReadsToCollectionState(String str, SyncStatus syncStatus, List<ReadMeta> list, boolean z6, Set<String> set, boolean z10, String str2, int i10, String str3, boolean z11) {
        syncStatus.getClass();
        list.getClass();
        set.getClass();
        str3.getClass();
        this.collectionId = str;
        this.syncStatus = syncStatus;
        this.reads = list;
        this.hasMore = z6;
        this.selectedItemsIds = set;
        this.isSubmitLoading = z10;
        this.navigateToCollectionId = str2;
        this.limit = i10;
        this.query = str3;
        this.isLoading = z11;
    }

    public AddReadsToCollectionState() {
        this(null, null, null, false, null, false, null, 0, null, false, 1023, null);
    }
}

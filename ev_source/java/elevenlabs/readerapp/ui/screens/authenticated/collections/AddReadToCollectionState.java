package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.SyncStatus;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionState;", "", "readId", "", "syncStatus", "Lio/elevenlabs/domain/model/SyncStatus;", "collections", "", "Lio/elevenlabs/domain/model/CollectionMeta;", "addedCollectionIds", "", "closeSheet", "", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/SyncStatus;Ljava/util/List;Ljava/util/Set;Z)V", "getReadId", "()Ljava/lang/String;", "getSyncStatus", "()Lio/elevenlabs/domain/model/SyncStatus;", "getCollections", "()Ljava/util/List;", "getAddedCollectionIds", "()Ljava/util/Set;", "getCloseSheet", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AddReadToCollectionState {
    public static final int $stable = 8;
    private final Set<String> addedCollectionIds;
    private final boolean closeSheet;
    private final List<CollectionMeta> collections;
    private final String readId;
    private final SyncStatus syncStatus;

    public /* synthetic */ AddReadToCollectionState(String str, SyncStatus syncStatus, List list, Set set, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? SyncStatus.SYNCING : syncStatus, (i10 & 4) != 0 ? tn.t.f33547a : list, (i10 & 8) != 0 ? null : set, (i10 & 16) != 0 ? false : z6);
    }

    public static /* synthetic */ AddReadToCollectionState copy$default(AddReadToCollectionState addReadToCollectionState, String str, SyncStatus syncStatus, List list, Set set, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addReadToCollectionState.readId;
        }
        if ((i10 & 2) != 0) {
            syncStatus = addReadToCollectionState.syncStatus;
        }
        if ((i10 & 4) != 0) {
            list = addReadToCollectionState.collections;
        }
        if ((i10 & 8) != 0) {
            set = addReadToCollectionState.addedCollectionIds;
        }
        if ((i10 & 16) != 0) {
            z6 = addReadToCollectionState.closeSheet;
        }
        boolean z10 = z6;
        List list2 = list;
        return addReadToCollectionState.copy(str, syncStatus, list2, set, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final List<CollectionMeta> component3() {
        return this.collections;
    }

    public final Set<String> component4() {
        return this.addedCollectionIds;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCloseSheet() {
        return this.closeSheet;
    }

    public final AddReadToCollectionState copy(String readId, SyncStatus syncStatus, List<CollectionMeta> collections, Set<String> addedCollectionIds, boolean closeSheet) {
        syncStatus.getClass();
        collections.getClass();
        return new AddReadToCollectionState(readId, syncStatus, collections, addedCollectionIds, closeSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddReadToCollectionState)) {
            return false;
        }
        AddReadToCollectionState addReadToCollectionState = (AddReadToCollectionState) other;
        if (kotlin.jvm.internal.m.c(this.readId, addReadToCollectionState.readId) && this.syncStatus == addReadToCollectionState.syncStatus && kotlin.jvm.internal.m.c(this.collections, addReadToCollectionState.collections) && kotlin.jvm.internal.m.c(this.addedCollectionIds, addReadToCollectionState.addedCollectionIds) && this.closeSheet == addReadToCollectionState.closeSheet) {
            return true;
        }
        return false;
    }

    public final Set<String> getAddedCollectionIds() {
        return this.addedCollectionIds;
    }

    public final boolean getCloseSheet() {
        return this.closeSheet;
    }

    public final List<CollectionMeta> getCollections() {
        return this.collections;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public int hashCode() {
        int hashCode;
        String str = this.readId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = p.n.d((this.syncStatus.hashCode() + (hashCode * 31)) * 31, 31, this.collections);
        Set<String> set = this.addedCollectionIds;
        if (set != null) {
            i10 = set.hashCode();
        }
        return Boolean.hashCode(this.closeSheet) + ((d10 + i10) * 31);
    }

    public String toString() {
        String str = this.readId;
        SyncStatus syncStatus = this.syncStatus;
        List<CollectionMeta> list = this.collections;
        Set<String> set = this.addedCollectionIds;
        boolean z6 = this.closeSheet;
        StringBuilder sb = new StringBuilder("AddReadToCollectionState(readId=");
        sb.append(str);
        sb.append(", syncStatus=");
        sb.append(syncStatus);
        sb.append(", collections=");
        sb.append(list);
        sb.append(", addedCollectionIds=");
        sb.append(set);
        sb.append(", closeSheet=");
        return p.n.j(Separators.RPAREN, sb, z6);
    }

    public AddReadToCollectionState(String str, SyncStatus syncStatus, List<CollectionMeta> list, Set<String> set, boolean z6) {
        syncStatus.getClass();
        list.getClass();
        this.readId = str;
        this.syncStatus = syncStatus;
        this.collections = list;
        this.addedCollectionIds = set;
        this.closeSheet = z6;
    }

    public AddReadToCollectionState() {
        this(null, null, null, null, false, 31, null);
    }
}

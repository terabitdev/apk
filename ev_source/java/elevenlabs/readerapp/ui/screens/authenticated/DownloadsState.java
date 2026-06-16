package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003JM\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0014\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020\fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014¨\u0006*"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsState;", "", "meta", "Lio/elevenlabs/domain/model/CollectionMeta;", "isLoading", "", "reads", "", "Lio/elevenlabs/domain/model/ReadMeta;", "selectedFilter", "Lio/elevenlabs/readerapp/ui/screens/authenticated/Filter;", "navigateToReadId", "", "navigateBack", "<init>", "(Lio/elevenlabs/domain/model/CollectionMeta;ZLjava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/Filter;Ljava/lang/String;Z)V", "getMeta", "()Lio/elevenlabs/domain/model/CollectionMeta;", "()Z", "getReads", "()Ljava/util/List;", "getSelectedFilter", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/Filter;", "getNavigateToReadId", "()Ljava/lang/String;", "getNavigateBack", "availableCategories", "getAvailableCategories", "filteredReads", "getFilteredReads", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class DownloadsState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final CollectionMeta meta;
    private final boolean navigateBack;
    private final String navigateToReadId;
    private final List<ReadMeta> reads;
    private final Filter selectedFilter;

    public /* synthetic */ DownloadsState(CollectionMeta collectionMeta, boolean z6, List list, Filter filter, String str, boolean z10, int i10, kotlin.jvm.internal.f fVar) {
        this(collectionMeta, (i10 & 2) != 0 ? true : z6, (i10 & 4) != 0 ? tn.t.f33547a : list, (i10 & 8) != 0 ? Filter.AllReads.INSTANCE : filter, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? false : z10);
    }

    public static final List _get_availableCategories_$lambda$0(ReadMeta readMeta) {
        readMeta.getClass();
        return readMeta.getGenre();
    }

    public static final boolean _get_availableCategories_$lambda$1(String str) {
        str.getClass();
        return !wq.n.m0(str);
    }

    public static /* synthetic */ DownloadsState copy$default(DownloadsState downloadsState, CollectionMeta collectionMeta, boolean z6, List list, Filter filter, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            collectionMeta = downloadsState.meta;
        }
        if ((i10 & 2) != 0) {
            z6 = downloadsState.isLoading;
        }
        if ((i10 & 4) != 0) {
            list = downloadsState.reads;
        }
        if ((i10 & 8) != 0) {
            filter = downloadsState.selectedFilter;
        }
        if ((i10 & 16) != 0) {
            str = downloadsState.navigateToReadId;
        }
        if ((i10 & 32) != 0) {
            z10 = downloadsState.navigateBack;
        }
        String str2 = str;
        boolean z11 = z10;
        return downloadsState.copy(collectionMeta, z6, list, filter, str2, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final CollectionMeta getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<ReadMeta> component3() {
        return this.reads;
    }

    /* renamed from: component4, reason: from getter */
    public final Filter getSelectedFilter() {
        return this.selectedFilter;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNavigateToReadId() {
        return this.navigateToReadId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getNavigateBack() {
        return this.navigateBack;
    }

    public final DownloadsState copy(CollectionMeta meta, boolean isLoading, List<ReadMeta> reads, Filter selectedFilter, String navigateToReadId, boolean navigateBack) {
        meta.getClass();
        reads.getClass();
        selectedFilter.getClass();
        return new DownloadsState(meta, isLoading, reads, selectedFilter, navigateToReadId, navigateBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadsState)) {
            return false;
        }
        DownloadsState downloadsState = (DownloadsState) other;
        if (kotlin.jvm.internal.m.c(this.meta, downloadsState.meta) && this.isLoading == downloadsState.isLoading && kotlin.jvm.internal.m.c(this.reads, downloadsState.reads) && kotlin.jvm.internal.m.c(this.selectedFilter, downloadsState.selectedFilter) && kotlin.jvm.internal.m.c(this.navigateToReadId, downloadsState.navigateToReadId) && this.navigateBack == downloadsState.navigateBack) {
            return true;
        }
        return false;
    }

    public final List<String> getAvailableCategories() {
        vq.f fVar = new vq.f(vq.k.n0(new vq.o(tn.o.j0(this.reads), new w(18)), new s4.j0(26)), true, new w(19));
        a2.p pVar = new a2.p(24);
        ArrayList arrayList = new ArrayList();
        eo.g gVar = new eo.g(new vq.e(fVar), pVar);
        while (gVar.hasNext()) {
            arrayList.add(gVar.next());
        }
        tn.r.c0(arrayList);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return tn.t.f33547a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ig.f.H(next);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(next);
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        return arrayList2;
    }

    public final List<ReadMeta> getFilteredReads() {
        Filter filter = this.selectedFilter;
        if (filter instanceof Filter.AllReads) {
            return this.reads;
        }
        if (filter instanceof Filter.Category) {
            List<ReadMeta> list = this.reads;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ReadMeta) obj).getGenre().contains(((Filter.Category) this.selectedFilter).getCategory())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        c6.p();
        return null;
    }

    public final CollectionMeta getMeta() {
        return this.meta;
    }

    public final boolean getNavigateBack() {
        return this.navigateBack;
    }

    public final String getNavigateToReadId() {
        return this.navigateToReadId;
    }

    public final List<ReadMeta> getReads() {
        return this.reads;
    }

    public final Filter getSelectedFilter() {
        return this.selectedFilter;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.selectedFilter.hashCode() + p.n.d(com.google.android.gms.internal.play_billing.b.f(this.meta.hashCode() * 31, 31, this.isLoading), 31, this.reads)) * 31;
        String str = this.navigateToReadId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.navigateBack) + ((hashCode2 + hashCode) * 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "DownloadsState(meta=" + this.meta + ", isLoading=" + this.isLoading + ", reads=" + this.reads + ", selectedFilter=" + this.selectedFilter + ", navigateToReadId=" + this.navigateToReadId + ", navigateBack=" + this.navigateBack + Separators.RPAREN;
    }

    public DownloadsState(CollectionMeta collectionMeta, boolean z6, List<ReadMeta> list, Filter filter, String str, boolean z10) {
        collectionMeta.getClass();
        list.getClass();
        filter.getClass();
        this.meta = collectionMeta;
        this.isLoading = z6;
        this.reads = list;
        this.selectedFilter = filter;
        this.navigateToReadId = str;
        this.navigateBack = z10;
    }
}

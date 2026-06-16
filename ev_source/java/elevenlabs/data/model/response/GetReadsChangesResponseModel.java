package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JF\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001bR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010 ¨\u00067"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsChangesResponseModel;", "", "", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "reads", "", "deletedReadIds", "", "hasMore", "lastSortId", "<init>", "(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;ZLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsChangesResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "component4", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Lio/elevenlabs/data/model/response/GetReadsChangesResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getReads", "getReads$annotations", "()V", "getDeletedReadIds", "getDeletedReadIds$annotations", "Z", "getHasMore", "getHasMore$annotations", "Ljava/lang/String;", "getLastSortId", "getLastSortId$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetReadsChangesResponseModel {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<String> deletedReadIds;
    private final boolean hasMore;
    private final String lastSortId;
    private final List<ReadMetadataResponseModel> reads;

    static {
        a aVar = new a(23);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), sn.a.d(iVar, new a(24)), null, null};
    }

    public /* synthetic */ GetReadsChangesResponseModel(int i10, List list, List list2, boolean z6, String str, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.reads = list;
            this.deletedReadIds = list2;
            this.hasMore = z6;
            if ((i10 & 8) == 0) {
                this.lastSortId = null;
                return;
            } else {
                this.lastSortId = str;
                return;
            }
        }
        t0.j(i10, 7, GetReadsChangesResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(ReadMetadataResponseModel$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ur.d(g1.f34588a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetReadsChangesResponseModel copy$default(GetReadsChangesResponseModel getReadsChangesResponseModel, List list, List list2, boolean z6, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getReadsChangesResponseModel.reads;
        }
        if ((i10 & 2) != 0) {
            list2 = getReadsChangesResponseModel.deletedReadIds;
        }
        if ((i10 & 4) != 0) {
            z6 = getReadsChangesResponseModel.hasMore;
        }
        if ((i10 & 8) != 0) {
            str = getReadsChangesResponseModel.lastSortId;
        }
        return getReadsChangesResponseModel.copy(list, list2, z6, str);
    }

    public static final /* synthetic */ void write$Self$data_release(GetReadsChangesResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.reads);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.deletedReadIds);
        output.T(serialDesc, 2, self.hasMore);
        if (output.C(serialDesc) || self.lastSortId != null) {
            output.o(serialDesc, 3, g1.f34588a, self.lastSortId);
        }
    }

    public final List<ReadMetadataResponseModel> component1() {
        return this.reads;
    }

    public final List<String> component2() {
        return this.deletedReadIds;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastSortId() {
        return this.lastSortId;
    }

    public final GetReadsChangesResponseModel copy(List<ReadMetadataResponseModel> reads, List<String> deletedReadIds, boolean hasMore, String lastSortId) {
        reads.getClass();
        deletedReadIds.getClass();
        return new GetReadsChangesResponseModel(reads, deletedReadIds, hasMore, lastSortId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetReadsChangesResponseModel)) {
            return false;
        }
        GetReadsChangesResponseModel getReadsChangesResponseModel = (GetReadsChangesResponseModel) other;
        if (m.c(this.reads, getReadsChangesResponseModel.reads) && m.c(this.deletedReadIds, getReadsChangesResponseModel.deletedReadIds) && this.hasMore == getReadsChangesResponseModel.hasMore && m.c(this.lastSortId, getReadsChangesResponseModel.lastSortId)) {
            return true;
        }
        return false;
    }

    public final List<String> getDeletedReadIds() {
        return this.deletedReadIds;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getLastSortId() {
        return this.lastSortId;
    }

    public final List<ReadMetadataResponseModel> getReads() {
        return this.reads;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(n.d(this.reads.hashCode() * 31, 31, this.deletedReadIds), 31, this.hasMore);
        String str = this.lastSortId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        return "GetReadsChangesResponseModel(reads=" + this.reads + ", deletedReadIds=" + this.deletedReadIds + ", hasMore=" + this.hasMore + ", lastSortId=" + this.lastSortId + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsChangesResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsChangesResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetReadsChangesResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getDeletedReadIds$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getLastSortId$annotations() {
    }

    public static /* synthetic */ void getReads$annotations() {
    }

    public GetReadsChangesResponseModel(List<ReadMetadataResponseModel> list, List<String> list2, boolean z6, String str) {
        list.getClass();
        list2.getClass();
        this.reads = list;
        this.deletedReadIds = list2;
        this.hasMore = z6;
        this.lastSortId = str;
    }

    public /* synthetic */ GetReadsChangesResponseModel(List list, List list2, boolean z6, String str, int i10, f fVar) {
        this(list, list2, z6, (i10 & 8) != 0 ? null : str);
    }
}

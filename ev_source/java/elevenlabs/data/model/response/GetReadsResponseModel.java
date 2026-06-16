package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJB\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001f¨\u00067"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsResponseModel;", "", "", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "reads", "", "hasMore", "", "lastSortId", "nextCursor", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetReadsResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getReads", "getReads$annotations", "()V", "Z", "getHasMore", "getHasMore$annotations", "Ljava/lang/String;", "getLastSortId", "getLastSortId$annotations", "getNextCursor", "getNextCursor$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetReadsResponseModel {
    private final boolean hasMore;
    private final String lastSortId;
    private final String nextCursor;
    private final List<ReadMetadataResponseModel> reads;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new b(7)), null, null, null};

    public /* synthetic */ GetReadsResponseModel(int i10, List list, boolean z6, String str, String str2, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.reads = list;
            this.hasMore = z6;
            if ((i10 & 4) == 0) {
                this.lastSortId = null;
            } else {
                this.lastSortId = str;
            }
            if ((i10 & 8) == 0) {
                this.nextCursor = null;
                return;
            } else {
                this.nextCursor = str2;
                return;
            }
        }
        t0.j(i10, 3, GetReadsResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(ReadMetadataResponseModel$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetReadsResponseModel copy$default(GetReadsResponseModel getReadsResponseModel, List list, boolean z6, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getReadsResponseModel.reads;
        }
        if ((i10 & 2) != 0) {
            z6 = getReadsResponseModel.hasMore;
        }
        if ((i10 & 4) != 0) {
            str = getReadsResponseModel.lastSortId;
        }
        if ((i10 & 8) != 0) {
            str2 = getReadsResponseModel.nextCursor;
        }
        return getReadsResponseModel.copy(list, z6, str, str2);
    }

    public static final /* synthetic */ void write$Self$data_release(GetReadsResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.reads);
        output.T(serialDesc, 1, self.hasMore);
        if (output.C(serialDesc) || self.lastSortId != null) {
            output.o(serialDesc, 2, g1.f34588a, self.lastSortId);
        }
        if (output.C(serialDesc) || self.nextCursor != null) {
            output.o(serialDesc, 3, g1.f34588a, self.nextCursor);
        }
    }

    public final List<ReadMetadataResponseModel> component1() {
        return this.reads;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastSortId() {
        return this.lastSortId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final GetReadsResponseModel copy(List<ReadMetadataResponseModel> reads, boolean hasMore, String lastSortId, String nextCursor) {
        reads.getClass();
        return new GetReadsResponseModel(reads, hasMore, lastSortId, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetReadsResponseModel)) {
            return false;
        }
        GetReadsResponseModel getReadsResponseModel = (GetReadsResponseModel) other;
        if (m.c(this.reads, getReadsResponseModel.reads) && this.hasMore == getReadsResponseModel.hasMore && m.c(this.lastSortId, getReadsResponseModel.lastSortId) && m.c(this.nextCursor, getReadsResponseModel.nextCursor)) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getLastSortId() {
        return this.lastSortId;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<ReadMetadataResponseModel> getReads() {
        return this.reads;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(this.reads.hashCode() * 31, 31, this.hasMore);
        String str = this.lastSortId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (f10 + hashCode) * 31;
        String str2 = this.nextCursor;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        List<ReadMetadataResponseModel> list = this.reads;
        boolean z6 = this.hasMore;
        String str = this.lastSortId;
        String str2 = this.nextCursor;
        StringBuilder sb = new StringBuilder("GetReadsResponseModel(reads=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(z6);
        sb.append(", lastSortId=");
        return f.n(sb, str, ", nextCursor=", str2, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetReadsResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getLastSortId$annotations() {
    }

    public static /* synthetic */ void getNextCursor$annotations() {
    }

    public static /* synthetic */ void getReads$annotations() {
    }

    public GetReadsResponseModel(List<ReadMetadataResponseModel> list, boolean z6, String str, String str2) {
        list.getClass();
        this.reads = list;
        this.hasMore = z6;
        this.lastSortId = str;
        this.nextCursor = str2;
    }

    public /* synthetic */ GetReadsResponseModel(List list, boolean z6, String str, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this(list, z6, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}

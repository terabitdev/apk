package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001cR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001eR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010\"¨\u0006:"}, d2 = {"Lio/elevenlabs/data/model/response/GetCollectionResponse;", "", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "meta", "", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", FirebaseAnalytics.Param.ITEMS, "", "hasMore", "", "nextCursor", "<init>", "(Lio/elevenlabs/data/model/response/CollectionMetaResponse;Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/CollectionMetaResponse;Ljava/util/List;ZLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetCollectionResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "()Ljava/lang/String;", "copy", "(Lio/elevenlabs/data/model/response/CollectionMetaResponse;Ljava/util/List;ZLjava/lang/String;)Lio/elevenlabs/data/model/response/GetCollectionResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "getMeta", "getMeta$annotations", "()V", "Ljava/util/List;", "getItems", "getItems$annotations", "Z", "getHasMore", "getHasMore$annotations", "Ljava/lang/String;", "getNextCursor", "getNextCursor$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetCollectionResponse {
    private final boolean hasMore;
    private final List<ReadMetadataResponseModel> items;
    private final CollectionMetaResponse meta;
    private final String nextCursor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(15)), null, null};

    public /* synthetic */ GetCollectionResponse(int i10, CollectionMetaResponse collectionMetaResponse, List list, boolean z6, String str, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.meta = collectionMetaResponse;
            this.items = list;
            this.hasMore = z6;
            if ((i10 & 8) == 0) {
                this.nextCursor = null;
                return;
            } else {
                this.nextCursor = str;
                return;
            }
        }
        t0.j(i10, 7, GetCollectionResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(ReadMetadataResponseModel$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCollectionResponse copy$default(GetCollectionResponse getCollectionResponse, CollectionMetaResponse collectionMetaResponse, List list, boolean z6, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            collectionMetaResponse = getCollectionResponse.meta;
        }
        if ((i10 & 2) != 0) {
            list = getCollectionResponse.items;
        }
        if ((i10 & 4) != 0) {
            z6 = getCollectionResponse.hasMore;
        }
        if ((i10 & 8) != 0) {
            str = getCollectionResponse.nextCursor;
        }
        return getCollectionResponse.copy(collectionMetaResponse, list, z6, str);
    }

    public static final /* synthetic */ void write$Self$data_release(GetCollectionResponse self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, CollectionMetaResponse$$serializer.INSTANCE, self.meta);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.items);
        output.T(serialDesc, 2, self.hasMore);
        if (output.C(serialDesc) || self.nextCursor != null) {
            output.o(serialDesc, 3, g1.f34588a, self.nextCursor);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final CollectionMetaResponse getMeta() {
        return this.meta;
    }

    public final List<ReadMetadataResponseModel> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final GetCollectionResponse copy(CollectionMetaResponse meta, List<ReadMetadataResponseModel> r32, boolean hasMore, String nextCursor) {
        meta.getClass();
        r32.getClass();
        return new GetCollectionResponse(meta, r32, hasMore, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCollectionResponse)) {
            return false;
        }
        GetCollectionResponse getCollectionResponse = (GetCollectionResponse) other;
        if (m.c(this.meta, getCollectionResponse.meta) && m.c(this.items, getCollectionResponse.items) && this.hasMore == getCollectionResponse.hasMore && m.c(this.nextCursor, getCollectionResponse.nextCursor)) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<ReadMetadataResponseModel> getItems() {
        return this.items;
    }

    public final CollectionMetaResponse getMeta() {
        return this.meta;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(n.d(this.meta.hashCode() * 31, 31, this.items), 31, this.hasMore);
        String str = this.nextCursor;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        return "GetCollectionResponse(meta=" + this.meta + ", items=" + this.items + ", hasMore=" + this.hasMore + ", nextCursor=" + this.nextCursor + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCollectionResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCollectionResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetCollectionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    public static /* synthetic */ void getMeta$annotations() {
    }

    public static /* synthetic */ void getNextCursor$annotations() {
    }

    public GetCollectionResponse(CollectionMetaResponse collectionMetaResponse, List<ReadMetadataResponseModel> list, boolean z6, String str) {
        collectionMetaResponse.getClass();
        list.getClass();
        this.meta = collectionMetaResponse;
        this.items = list;
        this.hasMore = z6;
        this.nextCursor = str;
    }

    public /* synthetic */ GetCollectionResponse(CollectionMetaResponse collectionMetaResponse, List list, boolean z6, String str, int i10, f fVar) {
        this(collectionMetaResponse, list, z6, (i10 & 8) != 0 ? null : str);
    }
}

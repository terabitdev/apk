package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.f;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00046785B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001dJB\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001d¨\u00069"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse;", "", "", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;", FirebaseAnalytics.Param.ITEMS, "", "searchId", "", "hasMore", "nextCursor", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;ZLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)Lio/elevenlabs/data/model/response/GetExploreSearchResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "getItems$annotations", "()V", "Ljava/lang/String;", "getSearchId", "getSearchId$annotations", "Z", "getHasMore", "getHasMore$annotations", "getNextCursor", "getNextCursor$annotations", "Companion", "Section", "Result", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetExploreSearchResponse {
    private final boolean hasMore;
    private final List<Section> items;
    private final String nextCursor;
    private final String searchId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new a(19)), null, null, null};

    public /* synthetic */ GetExploreSearchResponse(int i10, List list, String str, boolean z6, String str2, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.items = list;
            if ((i10 & 2) == 0) {
                this.searchId = null;
            } else {
                this.searchId = str;
            }
            if ((i10 & 4) == 0) {
                this.hasMore = false;
            } else {
                this.hasMore = z6;
            }
            if ((i10 & 8) == 0) {
                this.nextCursor = null;
                return;
            } else {
                this.nextCursor = str2;
                return;
            }
        }
        t0.j(i10, 1, GetExploreSearchResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new BackwardCompatibleSearchSectionsSerializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetExploreSearchResponse copy$default(GetExploreSearchResponse getExploreSearchResponse, List list, String str, boolean z6, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getExploreSearchResponse.items;
        }
        if ((i10 & 2) != 0) {
            str = getExploreSearchResponse.searchId;
        }
        if ((i10 & 4) != 0) {
            z6 = getExploreSearchResponse.hasMore;
        }
        if ((i10 & 8) != 0) {
            str2 = getExploreSearchResponse.nextCursor;
        }
        return getExploreSearchResponse.copy(list, str, z6, str2);
    }

    public static final /* synthetic */ void write$Self$data_release(GetExploreSearchResponse self, tr.b output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.items);
        if (output.C(serialDesc) || self.searchId != null) {
            output.o(serialDesc, 1, g1.f34588a, self.searchId);
        }
        if (output.C(serialDesc) || self.hasMore) {
            output.T(serialDesc, 2, self.hasMore);
        }
        if (output.C(serialDesc) || self.nextCursor != null) {
            output.o(serialDesc, 3, g1.f34588a, self.nextCursor);
        }
    }

    public final List<Section> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSearchId() {
        return this.searchId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final GetExploreSearchResponse copy(List<? extends Section> r22, String searchId, boolean hasMore, String nextCursor) {
        r22.getClass();
        return new GetExploreSearchResponse(r22, searchId, hasMore, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetExploreSearchResponse)) {
            return false;
        }
        GetExploreSearchResponse getExploreSearchResponse = (GetExploreSearchResponse) other;
        if (m.c(this.items, getExploreSearchResponse.items) && m.c(this.searchId, getExploreSearchResponse.searchId) && this.hasMore == getExploreSearchResponse.hasMore && m.c(this.nextCursor, getExploreSearchResponse.nextCursor)) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Section> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.items.hashCode() * 31;
        String str = this.searchId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f((hashCode2 + hashCode) * 31, 31, this.hasMore);
        String str2 = this.nextCursor;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return f10 + i10;
    }

    public String toString() {
        return "GetExploreSearchResponse(items=" + this.items + ", searchId=" + this.searchId + ", hasMore=" + this.hasMore + ", nextCursor=" + this.nextCursor + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result;", "", "GlobalRead", "Collection", "Companion", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$Collection;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$GlobalRead;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Result {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.GetExploreSearchResponse.Result", f0Var.b(Result.class), new oo.d[]{f0Var.b(Collection.class), f0Var.b(GlobalRead.class)}, new KSerializer[]{GetExploreSearchResponse$Result$Collection$$serializer.INSTANCE, GetExploreSearchResponse$Result$GlobalRead$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$Collection;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result;", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "collection", "<init>", "(Lio/elevenlabs/data/model/response/CollectionMetaResponse;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/CollectionMetaResponse;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$Collection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "copy", "(Lio/elevenlabs/data/model/response/CollectionMetaResponse;)Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$Collection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "getCollection", "getCollection$annotations", "()V", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class Collection implements Result {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final CollectionMetaResponse collection;

            public /* synthetic */ Collection(int i10, CollectionMetaResponse collectionMetaResponse, c1 c1Var) {
                if (1 == (i10 & 1)) {
                    this.collection = collectionMetaResponse;
                } else {
                    t0.j(i10, 1, GetExploreSearchResponse$Result$Collection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Collection copy$default(Collection collection, CollectionMetaResponse collectionMetaResponse, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    collectionMetaResponse = collection.collection;
                }
                return collection.copy(collectionMetaResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final CollectionMetaResponse getCollection() {
                return this.collection;
            }

            public final Collection copy(CollectionMetaResponse collection) {
                collection.getClass();
                return new Collection(collection);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Collection) && m.c(this.collection, ((Collection) other).collection)) {
                    return true;
                }
                return false;
            }

            public final CollectionMetaResponse getCollection() {
                return this.collection;
            }

            public int hashCode() {
                return this.collection.hashCode();
            }

            public String toString() {
                return "Collection(collection=" + this.collection + Separators.RPAREN;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$Collection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$Collection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetExploreSearchResponse$Result$Collection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getCollection$annotations() {
            }

            public Collection(CollectionMetaResponse collectionMetaResponse) {
                collectionMetaResponse.getClass();
                this.collection = collectionMetaResponse;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$GlobalRead;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result;", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "read", "<init>", "(Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/ReadMetadataResponseModel;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$GlobalRead;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "copy", "(Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;)Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$GlobalRead;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "getRead", "getRead$annotations", "()V", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GlobalRead implements Result {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ReadMetadataResponseModel read;

            public /* synthetic */ GlobalRead(int i10, ReadMetadataResponseModel readMetadataResponseModel, c1 c1Var) {
                if (1 == (i10 & 1)) {
                    this.read = readMetadataResponseModel;
                } else {
                    t0.j(i10, 1, GetExploreSearchResponse$Result$GlobalRead$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ GlobalRead copy$default(GlobalRead globalRead, ReadMetadataResponseModel readMetadataResponseModel, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    readMetadataResponseModel = globalRead.read;
                }
                return globalRead.copy(readMetadataResponseModel);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadMetadataResponseModel getRead() {
                return this.read;
            }

            public final GlobalRead copy(ReadMetadataResponseModel read) {
                read.getClass();
                return new GlobalRead(read);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof GlobalRead) && m.c(this.read, ((GlobalRead) other).read)) {
                    return true;
                }
                return false;
            }

            public final ReadMetadataResponseModel getRead() {
                return this.read;
            }

            public int hashCode() {
                return this.read.hashCode();
            }

            public String toString() {
                return "GlobalRead(read=" + this.read + Separators.RPAREN;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$GlobalRead$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result$GlobalRead;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetExploreSearchResponse$Result$GlobalRead$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getRead$annotations() {
            }

            public GlobalRead(ReadMetadataResponseModel readMetadataResponseModel) {
                readMetadataResponseModel.getClass();
                this.read = readMetadataResponseModel;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;", "", "SearchList", "GlobalRead", "Collection", "GenericItem", "Companion", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$Collection;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GenericItem;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GlobalRead;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$SearchList;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Section {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.GetExploreSearchResponse.Section", f0Var.b(Section.class), new oo.d[]{f0Var.b(Collection.class), f0Var.b(GenericItem.class), f0Var.b(GlobalRead.class), f0Var.b(SearchList.class)}, new KSerializer[]{GetExploreSearchResponse$Section$Collection$$serializer.INSTANCE, GetExploreSearchResponse$Section$GenericItem$$serializer.INSTANCE, GetExploreSearchResponse$Section$GlobalRead$$serializer.INSTANCE, GetExploreSearchResponse$Section$SearchList$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$Collection;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "collection", "<init>", "(Lio/elevenlabs/data/model/response/CollectionMetaResponse;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/CollectionMetaResponse;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$Collection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "copy", "(Lio/elevenlabs/data/model/response/CollectionMetaResponse;)Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$Collection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "getCollection", "getCollection$annotations", "()V", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class Collection implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final CollectionMetaResponse collection;

            public /* synthetic */ Collection(int i10, CollectionMetaResponse collectionMetaResponse, c1 c1Var) {
                if (1 == (i10 & 1)) {
                    this.collection = collectionMetaResponse;
                } else {
                    t0.j(i10, 1, GetExploreSearchResponse$Section$Collection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Collection copy$default(Collection collection, CollectionMetaResponse collectionMetaResponse, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    collectionMetaResponse = collection.collection;
                }
                return collection.copy(collectionMetaResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final CollectionMetaResponse getCollection() {
                return this.collection;
            }

            public final Collection copy(CollectionMetaResponse collection) {
                collection.getClass();
                return new Collection(collection);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Collection) && m.c(this.collection, ((Collection) other).collection)) {
                    return true;
                }
                return false;
            }

            public final CollectionMetaResponse getCollection() {
                return this.collection;
            }

            public int hashCode() {
                return this.collection.hashCode();
            }

            public String toString() {
                return "Collection(collection=" + this.collection + Separators.RPAREN;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$Collection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$Collection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetExploreSearchResponse$Section$Collection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getCollection$annotations() {
            }

            public Collection(CollectionMetaResponse collectionMetaResponse) {
                collectionMetaResponse.getClass();
                this.collection = collectionMetaResponse;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJR\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b7\u0010-\u001a\u0004\b6\u0010\u001a¨\u0006:"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GenericItem;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;", "", "image", "title", "subtitle", ParameterNames.TEXT, "deeplink", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GenericItem;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GenericItem;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getImage$annotations", "()V", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getText", "getText$annotations", "getDeeplink", "getDeeplink$annotations", "getType", "getType$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GenericItem implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String deeplink;
            private final String image;
            private final String subtitle;
            private final String text;
            private final String title;
            private final String type;

            public /* synthetic */ GenericItem(int i10, String str, String str2, String str3, String str4, String str5, String str6, c1 c1Var) {
                if (50 == (i10 & 50)) {
                    if ((i10 & 1) == 0) {
                        this.image = null;
                    } else {
                        this.image = str;
                    }
                    this.title = str2;
                    if ((i10 & 4) == 0) {
                        this.subtitle = null;
                    } else {
                        this.subtitle = str3;
                    }
                    if ((i10 & 8) == 0) {
                        this.text = null;
                    } else {
                        this.text = str4;
                    }
                    this.deeplink = str5;
                    this.type = str6;
                    return;
                }
                t0.j(i10, 50, GetExploreSearchResponse$Section$GenericItem$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ GenericItem copy$default(GenericItem genericItem, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = genericItem.image;
                }
                if ((i10 & 2) != 0) {
                    str2 = genericItem.title;
                }
                if ((i10 & 4) != 0) {
                    str3 = genericItem.subtitle;
                }
                if ((i10 & 8) != 0) {
                    str4 = genericItem.text;
                }
                if ((i10 & 16) != 0) {
                    str5 = genericItem.deeplink;
                }
                if ((i10 & 32) != 0) {
                    str6 = genericItem.type;
                }
                String str7 = str5;
                String str8 = str6;
                return genericItem.copy(str, str2, str3, str4, str7, str8);
            }

            public static final /* synthetic */ void write$Self$data_release(GenericItem self, tr.b output, SerialDescriptor serialDesc) {
                if (output.C(serialDesc) || self.image != null) {
                    output.o(serialDesc, 0, g1.f34588a, self.image);
                }
                output.V(serialDesc, 1, self.title);
                if (output.C(serialDesc) || self.subtitle != null) {
                    output.o(serialDesc, 2, g1.f34588a, self.subtitle);
                }
                if (output.C(serialDesc) || self.text != null) {
                    output.o(serialDesc, 3, g1.f34588a, self.text);
                }
                output.V(serialDesc, 4, self.deeplink);
                output.V(serialDesc, 5, self.type);
            }

            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component5, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* renamed from: component6, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final GenericItem copy(String image, String title, String subtitle, String r11, String deeplink, String type) {
                title.getClass();
                deeplink.getClass();
                type.getClass();
                return new GenericItem(image, title, subtitle, r11, deeplink, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GenericItem)) {
                    return false;
                }
                GenericItem genericItem = (GenericItem) other;
                if (m.c(this.image, genericItem.image) && m.c(this.title, genericItem.title) && m.c(this.subtitle, genericItem.subtitle) && m.c(this.text, genericItem.text) && m.c(this.deeplink, genericItem.deeplink) && m.c(this.type, genericItem.type)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final String getImage() {
                return this.image;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getText() {
                return this.text;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                String str = this.image;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int c5 = j0.c.c(hashCode * 31, 31, this.title);
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i11 = (c5 + hashCode2) * 31;
                String str3 = this.text;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return this.type.hashCode() + j0.c.c((i11 + i10) * 31, 31, this.deeplink);
            }

            public String toString() {
                String str = this.image;
                String str2 = this.title;
                String str3 = this.subtitle;
                String str4 = this.text;
                String str5 = this.deeplink;
                String str6 = this.type;
                StringBuilder s10 = defpackage.f.s("GenericItem(image=", str, ", title=", str2, ", subtitle=");
                defpackage.f.x(s10, str3, ", text=", str4, ", deeplink=");
                return defpackage.f.n(s10, str5, ", type=", str6, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GenericItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GenericItem;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetExploreSearchResponse$Section$GenericItem$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getDeeplink$annotations() {
            }

            public static /* synthetic */ void getImage$annotations() {
            }

            public static /* synthetic */ void getSubtitle$annotations() {
            }

            public static /* synthetic */ void getText$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public static /* synthetic */ void getType$annotations() {
            }

            public GenericItem(String str, String str2, String str3, String str4, String str5, String str6) {
                ib.i.s(str2, str5, str6);
                this.image = str;
                this.title = str2;
                this.subtitle = str3;
                this.text = str4;
                this.deeplink = str5;
                this.type = str6;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ GenericItem(String str, String str2, String str3, String str4, String str5, String str6, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, str3, r6, r7, r8);
                String str7;
                String str8;
                String str9;
                str = (i10 & 1) != 0 ? null : str;
                str3 = (i10 & 4) != 0 ? null : str3;
                if ((i10 & 8) != 0) {
                    str7 = str6;
                    str8 = str5;
                    str9 = null;
                } else {
                    str7 = str6;
                    str8 = str5;
                    str9 = str4;
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GlobalRead;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "read", "<init>", "(Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/ReadMetadataResponseModel;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GlobalRead;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "copy", "(Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;)Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GlobalRead;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "getRead", "getRead$annotations", "()V", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GlobalRead implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ReadMetadataResponseModel read;

            public /* synthetic */ GlobalRead(int i10, ReadMetadataResponseModel readMetadataResponseModel, c1 c1Var) {
                if (1 == (i10 & 1)) {
                    this.read = readMetadataResponseModel;
                } else {
                    t0.j(i10, 1, GetExploreSearchResponse$Section$GlobalRead$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ GlobalRead copy$default(GlobalRead globalRead, ReadMetadataResponseModel readMetadataResponseModel, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    readMetadataResponseModel = globalRead.read;
                }
                return globalRead.copy(readMetadataResponseModel);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadMetadataResponseModel getRead() {
                return this.read;
            }

            public final GlobalRead copy(ReadMetadataResponseModel read) {
                read.getClass();
                return new GlobalRead(read);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof GlobalRead) && m.c(this.read, ((GlobalRead) other).read)) {
                    return true;
                }
                return false;
            }

            public final ReadMetadataResponseModel getRead() {
                return this.read;
            }

            public int hashCode() {
                return this.read.hashCode();
            }

            public String toString() {
                return "GlobalRead(read=" + this.read + Separators.RPAREN;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GlobalRead$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$GlobalRead;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetExploreSearchResponse$Section$GlobalRead$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getRead$annotations() {
            }

            public GlobalRead(ReadMetadataResponseModel readMetadataResponseModel) {
                readMetadataResponseModel.getClass();
                this.read = readMetadataResponseModel;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$SearchList;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Result;", "searches", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$SearchList;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$SearchList;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getSearches", "getSearches$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class SearchList implements Section {
            private final List<Result> searches;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(20))};

            public /* synthetic */ SearchList(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.searches = list;
                } else {
                    t0.j(i10, 3, GetExploreSearchResponse$Section$SearchList$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(Result.INSTANCE.serializer(), 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SearchList copy$default(SearchList searchList, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = searchList.title;
                }
                if ((i10 & 2) != 0) {
                    list = searchList.searches;
                }
                return searchList.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(SearchList self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.searches);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Result> component2() {
                return this.searches;
            }

            public final SearchList copy(String title, List<? extends Result> searches) {
                title.getClass();
                searches.getClass();
                return new SearchList(title, searches);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SearchList)) {
                    return false;
                }
                SearchList searchList = (SearchList) other;
                if (m.c(this.title, searchList.title) && m.c(this.searches, searchList.searches)) {
                    return true;
                }
                return false;
            }

            public final List<Result> getSearches() {
                return this.searches;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.searches.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("SearchList(title=", this.title, ", searches=", Separators.RPAREN, this.searches);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$SearchList$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Section$SearchList;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetExploreSearchResponse$Section$SearchList$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getSearches$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public SearchList(String str, List<? extends Result> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.searches = list;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetExploreSearchResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetExploreSearchResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    @g(with = BackwardCompatibleSearchSectionsSerializer.class)
    public static /* synthetic */ void getItems$annotations() {
    }

    public static /* synthetic */ void getNextCursor$annotations() {
    }

    public static /* synthetic */ void getSearchId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetExploreSearchResponse(List<? extends Section> list, String str, boolean z6, String str2) {
        list.getClass();
        this.items = list;
        this.searchId = str;
        this.hasMore = z6;
        this.nextCursor = str2;
    }

    public /* synthetic */ GetExploreSearchResponse(List list, String str, boolean z6, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this(list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? null : str2);
    }
}

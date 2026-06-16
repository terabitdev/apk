package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0003231B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u001e¨\u00064"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistoryResponse;", "", "", "Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item;", FirebaseAnalytics.Param.ITEMS, "", "hasMore", "", "lastSortId", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetCreditHistoryResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetCreditHistoryResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "getItems$annotations", "()V", "Ljava/lang/Boolean;", "getHasMore", "getHasMore$annotations", "Ljava/lang/String;", "getLastSortId", "getLastSortId$annotations", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetCreditHistoryResponse {
    private final Boolean hasMore;
    private final List<Item> items;
    private final String lastSortId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new a(16)), null, null};

    public /* synthetic */ GetCreditHistoryResponse(int i10, List list, Boolean bool, String str, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.items = list;
            if ((i10 & 2) == 0) {
                this.hasMore = Boolean.FALSE;
            } else {
                this.hasMore = bool;
            }
            if ((i10 & 4) == 0) {
                this.lastSortId = null;
                return;
            } else {
                this.lastSortId = str;
                return;
            }
        }
        t0.j(i10, 1, GetCreditHistoryResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new BackwardCompatibleCreditHistoryItemSerializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCreditHistoryResponse copy$default(GetCreditHistoryResponse getCreditHistoryResponse, List list, Boolean bool, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getCreditHistoryResponse.items;
        }
        if ((i10 & 2) != 0) {
            bool = getCreditHistoryResponse.hasMore;
        }
        if ((i10 & 4) != 0) {
            str = getCreditHistoryResponse.lastSortId;
        }
        return getCreditHistoryResponse.copy(list, bool, str);
    }

    public static final /* synthetic */ void write$Self$data_release(GetCreditHistoryResponse self, tr.b output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.items);
        if (output.C(serialDesc) || !m.c(self.hasMore, Boolean.FALSE)) {
            output.o(serialDesc, 1, ur.g.f34583a, self.hasMore);
        }
        if (output.C(serialDesc) || self.lastSortId != null) {
            output.o(serialDesc, 2, g1.f34588a, self.lastSortId);
        }
    }

    public final List<Item> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastSortId() {
        return this.lastSortId;
    }

    public final GetCreditHistoryResponse copy(List<? extends Item> r22, Boolean hasMore, String lastSortId) {
        r22.getClass();
        return new GetCreditHistoryResponse(r22, hasMore, lastSortId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCreditHistoryResponse)) {
            return false;
        }
        GetCreditHistoryResponse getCreditHistoryResponse = (GetCreditHistoryResponse) other;
        if (m.c(this.items, getCreditHistoryResponse.items) && m.c(this.hasMore, getCreditHistoryResponse.hasMore) && m.c(this.lastSortId, getCreditHistoryResponse.lastSortId)) {
            return true;
        }
        return false;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final String getLastSortId() {
        return this.lastSortId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.items.hashCode() * 31;
        Boolean bool = this.hasMore;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        String str = this.lastSortId;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        List<Item> list = this.items;
        Boolean bool = this.hasMore;
        String str = this.lastSortId;
        StringBuilder sb = new StringBuilder("GetCreditHistoryResponse(items=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(bool);
        sb.append(", lastSortId=");
        return f.l(str, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item;", "", "CreditHistoryItemResponse", "Companion", "Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item$CreditHistoryItemResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Item {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new qr.f("io.elevenlabs.data.model.response.GetCreditHistoryResponse.Item", f0Var.b(Item.class), new oo.d[]{f0Var.b(CreditHistoryItemResponse.class)}, new KSerializer[]{GetCreditHistoryResponse$Item$CreditHistoryItemResponse$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001dJH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001dR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010\u001d¨\u0006;"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item$CreditHistoryItemResponse;", "Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item;", "", "title", "badge", "", "hours", "dateUnix", "expirationDateUnix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/lang/Long;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/lang/Long;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item$CreditHistoryItemResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "()J", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/lang/Long;)Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item$CreditHistoryItemResponse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getBadge", "getBadge$annotations", "Ljava/lang/Long;", "getHours", "getHours$annotations", "J", "getDateUnix", "getDateUnix$annotations", "getExpirationDateUnix", "getExpirationDateUnix$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class CreditHistoryItemResponse implements Item {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String badge;
            private final long dateUnix;
            private final Long expirationDateUnix;
            private final Long hours;
            private final String title;

            public /* synthetic */ CreditHistoryItemResponse(int i10, String str, String str2, Long l4, long j4, Long l7, c1 c1Var) {
                if (15 == (i10 & 15)) {
                    this.title = str;
                    this.badge = str2;
                    this.hours = l4;
                    this.dateUnix = j4;
                    if ((i10 & 16) == 0) {
                        this.expirationDateUnix = null;
                        return;
                    } else {
                        this.expirationDateUnix = l7;
                        return;
                    }
                }
                t0.j(i10, 15, GetCreditHistoryResponse$Item$CreditHistoryItemResponse$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ CreditHistoryItemResponse copy$default(CreditHistoryItemResponse creditHistoryItemResponse, String str, String str2, Long l4, long j4, Long l7, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = creditHistoryItemResponse.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = creditHistoryItemResponse.badge;
                }
                if ((i10 & 4) != 0) {
                    l4 = creditHistoryItemResponse.hours;
                }
                if ((i10 & 8) != 0) {
                    j4 = creditHistoryItemResponse.dateUnix;
                }
                if ((i10 & 16) != 0) {
                    l7 = creditHistoryItemResponse.expirationDateUnix;
                }
                Long l10 = l7;
                Long l11 = l4;
                return creditHistoryItemResponse.copy(str, str2, l11, j4, l10);
            }

            public static final /* synthetic */ void write$Self$data_release(CreditHistoryItemResponse self, tr.b output, SerialDescriptor serialDesc) {
                output.V(serialDesc, 0, self.title);
                output.o(serialDesc, 1, g1.f34588a, self.badge);
                l0 l0Var = l0.f34611a;
                output.o(serialDesc, 2, l0Var, self.hours);
                output.h0(serialDesc, 3, self.dateUnix);
                if (output.C(serialDesc) || self.expirationDateUnix != null) {
                    output.o(serialDesc, 4, l0Var, self.expirationDateUnix);
                }
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBadge() {
                return this.badge;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getHours() {
                return this.hours;
            }

            /* renamed from: component4, reason: from getter */
            public final long getDateUnix() {
                return this.dateUnix;
            }

            /* renamed from: component5, reason: from getter */
            public final Long getExpirationDateUnix() {
                return this.expirationDateUnix;
            }

            public final CreditHistoryItemResponse copy(String title, String badge, Long hours, long dateUnix, Long expirationDateUnix) {
                title.getClass();
                return new CreditHistoryItemResponse(title, badge, hours, dateUnix, expirationDateUnix);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreditHistoryItemResponse)) {
                    return false;
                }
                CreditHistoryItemResponse creditHistoryItemResponse = (CreditHistoryItemResponse) other;
                if (m.c(this.title, creditHistoryItemResponse.title) && m.c(this.badge, creditHistoryItemResponse.badge) && m.c(this.hours, creditHistoryItemResponse.hours) && this.dateUnix == creditHistoryItemResponse.dateUnix && m.c(this.expirationDateUnix, creditHistoryItemResponse.expirationDateUnix)) {
                    return true;
                }
                return false;
            }

            public final String getBadge() {
                return this.badge;
            }

            public final long getDateUnix() {
                return this.dateUnix;
            }

            public final Long getExpirationDateUnix() {
                return this.expirationDateUnix;
            }

            public final Long getHours() {
                return this.hours;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3 = this.title.hashCode() * 31;
                String str = this.badge;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (hashCode3 + hashCode) * 31;
                Long l4 = this.hours;
                if (l4 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = l4.hashCode();
                }
                int g10 = com.google.android.gms.internal.play_billing.b.g(this.dateUnix, (i11 + hashCode2) * 31, 31);
                Long l7 = this.expirationDateUnix;
                if (l7 != null) {
                    i10 = l7.hashCode();
                }
                return g10 + i10;
            }

            public String toString() {
                String str = this.title;
                String str2 = this.badge;
                Long l4 = this.hours;
                long j4 = this.dateUnix;
                Long l7 = this.expirationDateUnix;
                StringBuilder s10 = f.s("CreditHistoryItemResponse(title=", str, ", badge=", str2, ", hours=");
                s10.append(l4);
                s10.append(", dateUnix=");
                s10.append(j4);
                s10.append(", expirationDateUnix=");
                s10.append(l7);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item$CreditHistoryItemResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Item$CreditHistoryItemResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetCreditHistoryResponse$Item$CreditHistoryItemResponse$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getBadge$annotations() {
            }

            public static /* synthetic */ void getDateUnix$annotations() {
            }

            public static /* synthetic */ void getExpirationDateUnix$annotations() {
            }

            public static /* synthetic */ void getHours$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public CreditHistoryItemResponse(String str, String str2, Long l4, long j4, Long l7) {
                str.getClass();
                this.title = str;
                this.badge = str2;
                this.hours = l4;
                this.dateUnix = j4;
                this.expirationDateUnix = l7;
            }

            public /* synthetic */ CreditHistoryItemResponse(String str, String str2, Long l4, long j4, Long l7, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, l4, j4, (i10 & 16) != 0 ? null : l7);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistoryResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCreditHistoryResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetCreditHistoryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    @g(with = BackwardCompatibleCreditHistoryItemSerializer.class)
    public static /* synthetic */ void getItems$annotations() {
    }

    public static /* synthetic */ void getLastSortId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCreditHistoryResponse(List<? extends Item> list, Boolean bool, String str) {
        list.getClass();
        this.items = list;
        this.hasMore = bool;
        this.lastSortId = str;
    }

    public /* synthetic */ GetCreditHistoryResponse(List list, Boolean bool, String str, int i10, kotlin.jvm.internal.f fVar) {
        this(list, (i10 & 2) != 0 ? Boolean.FALSE : bool, (i10 & 4) != 0 ? null : str);
    }
}

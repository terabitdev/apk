package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.h;
import sn.i;
import tn.t;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u008a\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b@\u00108\u001a\u0004\b?\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\bB\u00108\u001a\u0004\bA\u0010\u0018R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010C\u0012\u0004\bE\u00108\u001a\u0004\bD\u0010\u001fR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010C\u0012\u0004\bG\u00108\u001a\u0004\bF\u0010\u001fR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010H\u0012\u0004\bJ\u00108\u001a\u0004\bI\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00105\u0012\u0004\bL\u00108\u001a\u0004\bK\u0010\u0018¨\u0006O"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;", "", "", "collectionId", "title", "subtitle", "description", "category", "shareUrl", "", "meta", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", FirebaseAnalytics.Param.ITEMS, "", "hasMore", "nextCursor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "()Z", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getCollectionId", "getCollectionId$annotations", "()V", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getDescription", "getDescription$annotations", "getCategory", "getCategory$annotations", "getShareUrl", "getShareUrl$annotations", "Ljava/util/List;", "getMeta", "getMeta$annotations", "getItems", "getItems$annotations", "Z", "getHasMore", "getHasMore$annotations", "getNextCursor", "getNextCursor$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ExploreCollectionDetailsV4Response {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String category;
    private final String collectionId;
    private final String description;
    private final boolean hasMore;
    private final List<ExploreReadResponseModel> items;
    private final List<String> meta;
    private final String nextCursor;
    private final String shareUrl;
    private final String subtitle;
    private final String title;

    static {
        io.elevenlabs.data.model.a aVar = new io.elevenlabs.data.model.a(26);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, null, null, null, null, null, sn.a.d(iVar, aVar), sn.a.d(iVar, new io.elevenlabs.data.model.a(27)), null, null};
    }

    public /* synthetic */ ExploreCollectionDetailsV4Response(int i10, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z6, String str7, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.collectionId = str;
            this.title = str2;
            if ((i10 & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str3;
            }
            if ((i10 & 8) == 0) {
                this.description = null;
            } else {
                this.description = str4;
            }
            if ((i10 & 16) == 0) {
                this.category = null;
            } else {
                this.category = str5;
            }
            if ((i10 & 32) == 0) {
                this.shareUrl = null;
            } else {
                this.shareUrl = str6;
            }
            int i11 = i10 & 64;
            t tVar = t.f33547a;
            if (i11 == 0) {
                this.meta = tVar;
            } else {
                this.meta = list;
            }
            if ((i10 & 128) == 0) {
                this.items = tVar;
            } else {
                this.items = list2;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.hasMore = false;
            } else {
                this.hasMore = z6;
            }
            if ((i10 & 512) == 0) {
                this.nextCursor = null;
                return;
            } else {
                this.nextCursor = str7;
                return;
            }
        }
        t0.j(i10, 3, ExploreCollectionDetailsV4Response$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(g1.f34588a, 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ur.d(ExploreReadResponseModel$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ ExploreCollectionDetailsV4Response copy$default(ExploreCollectionDetailsV4Response exploreCollectionDetailsV4Response, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exploreCollectionDetailsV4Response.collectionId;
        }
        if ((i10 & 2) != 0) {
            str2 = exploreCollectionDetailsV4Response.title;
        }
        if ((i10 & 4) != 0) {
            str3 = exploreCollectionDetailsV4Response.subtitle;
        }
        if ((i10 & 8) != 0) {
            str4 = exploreCollectionDetailsV4Response.description;
        }
        if ((i10 & 16) != 0) {
            str5 = exploreCollectionDetailsV4Response.category;
        }
        if ((i10 & 32) != 0) {
            str6 = exploreCollectionDetailsV4Response.shareUrl;
        }
        if ((i10 & 64) != 0) {
            list = exploreCollectionDetailsV4Response.meta;
        }
        if ((i10 & 128) != 0) {
            list2 = exploreCollectionDetailsV4Response.items;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            z6 = exploreCollectionDetailsV4Response.hasMore;
        }
        if ((i10 & 512) != 0) {
            str7 = exploreCollectionDetailsV4Response.nextCursor;
        }
        boolean z10 = z6;
        String str8 = str7;
        List list3 = list;
        List list4 = list2;
        String str9 = str5;
        String str10 = str6;
        return exploreCollectionDetailsV4Response.copy(str, str2, str3, str4, str9, str10, list3, list4, z10, str8);
    }

    public static final /* synthetic */ void write$Self$data_release(ExploreCollectionDetailsV4Response self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.collectionId);
        output.V(serialDesc, 1, self.title);
        if (output.C(serialDesc) || self.subtitle != null) {
            output.o(serialDesc, 2, g1.f34588a, self.subtitle);
        }
        if (output.C(serialDesc) || self.description != null) {
            output.o(serialDesc, 3, g1.f34588a, self.description);
        }
        if (output.C(serialDesc) || self.category != null) {
            output.o(serialDesc, 4, g1.f34588a, self.category);
        }
        if (output.C(serialDesc) || self.shareUrl != null) {
            output.o(serialDesc, 5, g1.f34588a, self.shareUrl);
        }
        boolean C = output.C(serialDesc);
        t tVar = t.f33547a;
        if (C || !m.c(self.meta, tVar)) {
            output.g(serialDesc, 6, (KSerializer) hVarArr[6].getValue(), self.meta);
        }
        if (output.C(serialDesc) || !m.c(self.items, tVar)) {
            output.g(serialDesc, 7, (KSerializer) hVarArr[7].getValue(), self.items);
        }
        if (output.C(serialDesc) || self.hasMore) {
            output.T(serialDesc, 8, self.hasMore);
        }
        if (output.C(serialDesc) || self.nextCursor != null) {
            output.o(serialDesc, 9, g1.f34588a, self.nextCursor);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
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
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component6, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final List<String> component7() {
        return this.meta;
    }

    public final List<ExploreReadResponseModel> component8() {
        return this.items;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final ExploreCollectionDetailsV4Response copy(String collectionId, String title, String subtitle, String description, String category, String shareUrl, List<String> meta, List<ExploreReadResponseModel> r19, boolean hasMore, String nextCursor) {
        collectionId.getClass();
        title.getClass();
        meta.getClass();
        r19.getClass();
        return new ExploreCollectionDetailsV4Response(collectionId, title, subtitle, description, category, shareUrl, meta, r19, hasMore, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExploreCollectionDetailsV4Response)) {
            return false;
        }
        ExploreCollectionDetailsV4Response exploreCollectionDetailsV4Response = (ExploreCollectionDetailsV4Response) other;
        if (m.c(this.collectionId, exploreCollectionDetailsV4Response.collectionId) && m.c(this.title, exploreCollectionDetailsV4Response.title) && m.c(this.subtitle, exploreCollectionDetailsV4Response.subtitle) && m.c(this.description, exploreCollectionDetailsV4Response.description) && m.c(this.category, exploreCollectionDetailsV4Response.category) && m.c(this.shareUrl, exploreCollectionDetailsV4Response.shareUrl) && m.c(this.meta, exploreCollectionDetailsV4Response.meta) && m.c(this.items, exploreCollectionDetailsV4Response.items) && this.hasMore == exploreCollectionDetailsV4Response.hasMore && m.c(this.nextCursor, exploreCollectionDetailsV4Response.nextCursor)) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<ExploreReadResponseModel> getItems() {
        return this.items;
    }

    public final List<String> getMeta() {
        return this.meta;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int c5 = j0.c.c(this.collectionId.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.category;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.shareUrl;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(n.d(n.d((i13 + hashCode4) * 31, 31, this.meta), 31, this.items), 31, this.hasMore);
        String str5 = this.nextCursor;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return f10 + i10;
    }

    public String toString() {
        String str = this.collectionId;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.description;
        String str5 = this.category;
        String str6 = this.shareUrl;
        List<String> list = this.meta;
        List<ExploreReadResponseModel> list2 = this.items;
        boolean z6 = this.hasMore;
        String str7 = this.nextCursor;
        StringBuilder s10 = f.s("ExploreCollectionDetailsV4Response(collectionId=", str, ", title=", str2, ", subtitle=");
        f.x(s10, str3, ", description=", str4, ", category=");
        f.x(s10, str5, ", shareUrl=", str6, ", meta=");
        s10.append(list);
        s10.append(", items=");
        s10.append(list2);
        s10.append(", hasMore=");
        s10.append(z6);
        s10.append(", nextCursor=");
        s10.append(str7);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ExploreCollectionDetailsV4Response$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getCollectionId$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    public static /* synthetic */ void getMeta$annotations() {
    }

    public static /* synthetic */ void getNextCursor$annotations() {
    }

    public static /* synthetic */ void getShareUrl$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public ExploreCollectionDetailsV4Response(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, List<ExploreReadResponseModel> list2, boolean z6, String str7) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.collectionId = str;
        this.title = str2;
        this.subtitle = str3;
        this.description = str4;
        this.category = str5;
        this.shareUrl = str6;
        this.meta = list;
        this.items = list2;
        this.hasMore = z6;
        this.nextCursor = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ExploreCollectionDetailsV4Response(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z6, String str7, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, str4, str5, str6, r14 != 0 ? r1 : list, (i10 & 128) != 0 ? r1 : list2, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? false : z6, (i10 & 512) != 0 ? null : str7);
        str3 = (i10 & 4) != 0 ? null : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        str5 = (i10 & 16) != 0 ? null : str5;
        str6 = (i10 & 32) != 0 ? null : str6;
        int i11 = i10 & 64;
        t tVar = t.f33547a;
    }
}

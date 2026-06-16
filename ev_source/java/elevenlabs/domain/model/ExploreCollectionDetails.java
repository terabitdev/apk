package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.t;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lio/elevenlabs/domain/model/ExploreCollectionDetails;", "", "collectionId", "", "title", "subtitle", "description", "category", "Lio/elevenlabs/domain/model/CollectionCategory;", "shareUrl", "meta", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionCategory;Ljava/lang/String;Ljava/util/List;)V", "getCollectionId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDescription", "getCategory", "()Lio/elevenlabs/domain/model/CollectionCategory;", "getShareUrl", "getMeta", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ExploreCollectionDetails {
    private final CollectionCategory category;
    private final String collectionId;
    private final String description;
    private final List<String> meta;
    private final String shareUrl;
    private final String subtitle;
    private final String title;

    public ExploreCollectionDetails(String str, String str2, String str3, String str4, CollectionCategory collectionCategory, String str5, List<String> list) {
        str.getClass();
        str2.getClass();
        collectionCategory.getClass();
        list.getClass();
        this.collectionId = str;
        this.title = str2;
        this.subtitle = str3;
        this.description = str4;
        this.category = collectionCategory;
        this.shareUrl = str5;
        this.meta = list;
    }

    public static /* synthetic */ ExploreCollectionDetails copy$default(ExploreCollectionDetails exploreCollectionDetails, String str, String str2, String str3, String str4, CollectionCategory collectionCategory, String str5, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exploreCollectionDetails.collectionId;
        }
        if ((i10 & 2) != 0) {
            str2 = exploreCollectionDetails.title;
        }
        if ((i10 & 4) != 0) {
            str3 = exploreCollectionDetails.subtitle;
        }
        if ((i10 & 8) != 0) {
            str4 = exploreCollectionDetails.description;
        }
        if ((i10 & 16) != 0) {
            collectionCategory = exploreCollectionDetails.category;
        }
        if ((i10 & 32) != 0) {
            str5 = exploreCollectionDetails.shareUrl;
        }
        if ((i10 & 64) != 0) {
            list = exploreCollectionDetails.meta;
        }
        String str6 = str5;
        List list2 = list;
        CollectionCategory collectionCategory2 = collectionCategory;
        String str7 = str3;
        return exploreCollectionDetails.copy(str, str2, str7, str4, collectionCategory2, str6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
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
    public final CollectionCategory getCategory() {
        return this.category;
    }

    /* renamed from: component6, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final List<String> component7() {
        return this.meta;
    }

    public final ExploreCollectionDetails copy(String collectionId, String title, String subtitle, String description, CollectionCategory category, String shareUrl, List<String> meta) {
        collectionId.getClass();
        title.getClass();
        category.getClass();
        meta.getClass();
        return new ExploreCollectionDetails(collectionId, title, subtitle, description, category, shareUrl, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExploreCollectionDetails)) {
            return false;
        }
        ExploreCollectionDetails exploreCollectionDetails = (ExploreCollectionDetails) other;
        if (m.c(this.collectionId, exploreCollectionDetails.collectionId) && m.c(this.title, exploreCollectionDetails.title) && m.c(this.subtitle, exploreCollectionDetails.subtitle) && m.c(this.description, exploreCollectionDetails.description) && this.category == exploreCollectionDetails.category && m.c(this.shareUrl, exploreCollectionDetails.shareUrl) && m.c(this.meta, exploreCollectionDetails.meta)) {
            return true;
        }
        return false;
    }

    public final CollectionCategory getCategory() {
        return this.category;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getMeta() {
        return this.meta;
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
        int c5 = c.c(this.collectionId.hashCode() * 31, 31, this.title);
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
        int hashCode3 = (this.category.hashCode() + ((i11 + hashCode2) * 31)) * 31;
        String str3 = this.shareUrl;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return this.meta.hashCode() + ((hashCode3 + i10) * 31);
    }

    public String toString() {
        String str = this.collectionId;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.description;
        CollectionCategory collectionCategory = this.category;
        String str5 = this.shareUrl;
        List<String> list = this.meta;
        StringBuilder s10 = f.s("ExploreCollectionDetails(collectionId=", str, ", title=", str2, ", subtitle=");
        f.x(s10, str3, ", description=", str4, ", category=");
        s10.append(collectionCategory);
        s10.append(", shareUrl=");
        s10.append(str5);
        s10.append(", meta=");
        return h.e(s10, list, Separators.RPAREN);
    }

    public /* synthetic */ ExploreCollectionDetails(String str, String str2, String str3, String str4, CollectionCategory collectionCategory, String str5, List list, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? CollectionCategory.Curated : collectionCategory, str5, (i10 & 64) != 0 ? t.f33547a : list);
    }
}

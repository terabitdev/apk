package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0006\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010$J\t\u0010:\u001a\u00020\rHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÔ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010DJ\u0014\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010H\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010I\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b(\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b*\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001b¨\u0006J"}, d2 = {"Lio/elevenlabs/domain/model/ExploreRead;", "", "readId", "", "title", "author", "articleImageUrl", "audioDurationSeconds", "", "averageRating", "totalRatingCount", "", "pricingType", "Lio/elevenlabs/domain/model/ExplorePricingType;", "listPrice", FirebaseAnalytics.Param.CURRENCY, "addedToLibraryCount", "androidProductId", "previewAudioUrl", "coverImageUrls", "", "coverAspectRatio", "", "blurPlaceholder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Lio/elevenlabs/domain/model/ExplorePricingType;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getTitle", "getAuthor", "getArticleImageUrl", "getAudioDurationSeconds", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAverageRating", "getTotalRatingCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPricingType", "()Lio/elevenlabs/domain/model/ExplorePricingType;", "getListPrice", "getCurrency", "getAddedToLibraryCount", "getAndroidProductId", "getPreviewAudioUrl", "getCoverImageUrls", "()Ljava/util/Map;", "getCoverAspectRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBlurPlaceholder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Lio/elevenlabs/domain/model/ExplorePricingType;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/domain/model/ExploreRead;", "equals", "", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ExploreRead {
    private final Integer addedToLibraryCount;
    private final String androidProductId;
    private final String articleImageUrl;
    private final Float audioDurationSeconds;
    private final String author;
    private final Float averageRating;
    private final String blurPlaceholder;
    private final Double coverAspectRatio;
    private final Map<String, String> coverImageUrls;
    private final String currency;
    private final Float listPrice;
    private final String previewAudioUrl;
    private final ExplorePricingType pricingType;
    private final String readId;
    private final String title;
    private final Integer totalRatingCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ExploreRead(String str, String str2, String str3, String str4, Float f10, Float f11, Integer num, ExplorePricingType explorePricingType, Float f12, String str5, Integer num2, String str6, String str7, Map map, Double d10, String str8, int i10, f fVar) {
        this(str, str2, str3, str4, f10, f11, num, explorePricingType, f12, str5, num2, str6, str7, r17, r18, r19);
        Map map2;
        Double d11;
        String str9;
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i10 & 16384) != 0) {
            d11 = null;
        } else {
            d11 = d10;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            str9 = null;
        } else {
            str9 = str8;
        }
    }

    public static /* synthetic */ ExploreRead copy$default(ExploreRead exploreRead, String str, String str2, String str3, String str4, Float f10, Float f11, Integer num, ExplorePricingType explorePricingType, Float f12, String str5, Integer num2, String str6, String str7, Map map, Double d10, String str8, int i10, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        Float f13;
        Float f14;
        Integer num3;
        ExplorePricingType explorePricingType2;
        Float f15;
        String str13;
        Integer num4;
        String str14;
        String str15;
        Map map2;
        Double d11;
        String str16;
        if ((i10 & 1) != 0) {
            str9 = exploreRead.readId;
        } else {
            str9 = str;
        }
        if ((i10 & 2) != 0) {
            str10 = exploreRead.title;
        } else {
            str10 = str2;
        }
        if ((i10 & 4) != 0) {
            str11 = exploreRead.author;
        } else {
            str11 = str3;
        }
        if ((i10 & 8) != 0) {
            str12 = exploreRead.articleImageUrl;
        } else {
            str12 = str4;
        }
        if ((i10 & 16) != 0) {
            f13 = exploreRead.audioDurationSeconds;
        } else {
            f13 = f10;
        }
        if ((i10 & 32) != 0) {
            f14 = exploreRead.averageRating;
        } else {
            f14 = f11;
        }
        if ((i10 & 64) != 0) {
            num3 = exploreRead.totalRatingCount;
        } else {
            num3 = num;
        }
        if ((i10 & 128) != 0) {
            explorePricingType2 = exploreRead.pricingType;
        } else {
            explorePricingType2 = explorePricingType;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            f15 = exploreRead.listPrice;
        } else {
            f15 = f12;
        }
        if ((i10 & 512) != 0) {
            str13 = exploreRead.currency;
        } else {
            str13 = str5;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            num4 = exploreRead.addedToLibraryCount;
        } else {
            num4 = num2;
        }
        if ((i10 & 2048) != 0) {
            str14 = exploreRead.androidProductId;
        } else {
            str14 = str6;
        }
        if ((i10 & 4096) != 0) {
            str15 = exploreRead.previewAudioUrl;
        } else {
            str15 = str7;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            map2 = exploreRead.coverImageUrls;
        } else {
            map2 = map;
        }
        String str17 = str9;
        if ((i10 & 16384) != 0) {
            d11 = exploreRead.coverAspectRatio;
        } else {
            d11 = d10;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            str16 = exploreRead.blurPlaceholder;
        } else {
            str16 = str8;
        }
        return exploreRead.copy(str17, str10, str11, str12, f13, f14, num3, explorePricingType2, f15, str13, num4, str14, str15, map2, d11, str16);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getAddedToLibraryCount() {
        return this.addedToLibraryCount;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPreviewAudioUrl() {
        return this.previewAudioUrl;
    }

    public final Map<String, String> component14() {
        return this.coverImageUrls;
    }

    /* renamed from: component15, reason: from getter */
    public final Double getCoverAspectRatio() {
        return this.coverAspectRatio;
    }

    /* renamed from: component16, reason: from getter */
    public final String getBlurPlaceholder() {
        return this.blurPlaceholder;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArticleImageUrl() {
        return this.articleImageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getAudioDurationSeconds() {
        return this.audioDurationSeconds;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getAverageRating() {
        return this.averageRating;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getTotalRatingCount() {
        return this.totalRatingCount;
    }

    /* renamed from: component8, reason: from getter */
    public final ExplorePricingType getPricingType() {
        return this.pricingType;
    }

    /* renamed from: component9, reason: from getter */
    public final Float getListPrice() {
        return this.listPrice;
    }

    public final ExploreRead copy(String readId, String title, String author, String articleImageUrl, Float audioDurationSeconds, Float averageRating, Integer totalRatingCount, ExplorePricingType pricingType, Float listPrice, String currency, Integer addedToLibraryCount, String androidProductId, String previewAudioUrl, Map<String, String> coverImageUrls, Double coverAspectRatio, String blurPlaceholder) {
        readId.getClass();
        title.getClass();
        pricingType.getClass();
        return new ExploreRead(readId, title, author, articleImageUrl, audioDurationSeconds, averageRating, totalRatingCount, pricingType, listPrice, currency, addedToLibraryCount, androidProductId, previewAudioUrl, coverImageUrls, coverAspectRatio, blurPlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExploreRead)) {
            return false;
        }
        ExploreRead exploreRead = (ExploreRead) other;
        if (m.c(this.readId, exploreRead.readId) && m.c(this.title, exploreRead.title) && m.c(this.author, exploreRead.author) && m.c(this.articleImageUrl, exploreRead.articleImageUrl) && m.c(this.audioDurationSeconds, exploreRead.audioDurationSeconds) && m.c(this.averageRating, exploreRead.averageRating) && m.c(this.totalRatingCount, exploreRead.totalRatingCount) && this.pricingType == exploreRead.pricingType && m.c(this.listPrice, exploreRead.listPrice) && m.c(this.currency, exploreRead.currency) && m.c(this.addedToLibraryCount, exploreRead.addedToLibraryCount) && m.c(this.androidProductId, exploreRead.androidProductId) && m.c(this.previewAudioUrl, exploreRead.previewAudioUrl) && m.c(this.coverImageUrls, exploreRead.coverImageUrls) && m.c(this.coverAspectRatio, exploreRead.coverAspectRatio) && m.c(this.blurPlaceholder, exploreRead.blurPlaceholder)) {
            return true;
        }
        return false;
    }

    public final Integer getAddedToLibraryCount() {
        return this.addedToLibraryCount;
    }

    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    public final String getArticleImageUrl() {
        return this.articleImageUrl;
    }

    public final Float getAudioDurationSeconds() {
        return this.audioDurationSeconds;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final Float getAverageRating() {
        return this.averageRating;
    }

    public final String getBlurPlaceholder() {
        return this.blurPlaceholder;
    }

    public final Double getCoverAspectRatio() {
        return this.coverAspectRatio;
    }

    public final Map<String, String> getCoverImageUrls() {
        return this.coverImageUrls;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Float getListPrice() {
        return this.listPrice;
    }

    public final String getPreviewAudioUrl() {
        return this.previewAudioUrl;
    }

    public final ExplorePricingType getPricingType() {
        return this.pricingType;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotalRatingCount() {
        return this.totalRatingCount;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int c5 = c.c(this.readId.hashCode() * 31, 31, this.title);
        String str = this.author;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.articleImageUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Float f10 = this.audioDurationSeconds;
        if (f10 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = f10.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Float f11 = this.averageRating;
        if (f11 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f11.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num = this.totalRatingCount;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int hashCode13 = (this.pricingType.hashCode() + ((i14 + hashCode5) * 31)) * 31;
        Float f12 = this.listPrice;
        if (f12 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f12.hashCode();
        }
        int i15 = (hashCode13 + hashCode6) * 31;
        String str3 = this.currency;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        Integer num2 = this.addedToLibraryCount;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str4 = this.androidProductId;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        String str5 = this.previewAudioUrl;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        Map<String, String> map = this.coverImageUrls;
        if (map == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        Double d10 = this.coverAspectRatio;
        if (d10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = d10.hashCode();
        }
        int i21 = (i20 + hashCode12) * 31;
        String str6 = this.blurPlaceholder;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return i21 + i10;
    }

    public String toString() {
        String str = this.readId;
        String str2 = this.title;
        String str3 = this.author;
        String str4 = this.articleImageUrl;
        Float f10 = this.audioDurationSeconds;
        Float f11 = this.averageRating;
        Integer num = this.totalRatingCount;
        ExplorePricingType explorePricingType = this.pricingType;
        Float f12 = this.listPrice;
        String str5 = this.currency;
        Integer num2 = this.addedToLibraryCount;
        String str6 = this.androidProductId;
        String str7 = this.previewAudioUrl;
        Map<String, String> map = this.coverImageUrls;
        Double d10 = this.coverAspectRatio;
        String str8 = this.blurPlaceholder;
        StringBuilder s10 = defpackage.f.s("ExploreRead(readId=", str, ", title=", str2, ", author=");
        defpackage.f.x(s10, str3, ", articleImageUrl=", str4, ", audioDurationSeconds=");
        s10.append(f10);
        s10.append(", averageRating=");
        s10.append(f11);
        s10.append(", totalRatingCount=");
        s10.append(num);
        s10.append(", pricingType=");
        s10.append(explorePricingType);
        s10.append(", listPrice=");
        s10.append(f12);
        s10.append(", currency=");
        s10.append(str5);
        s10.append(", addedToLibraryCount=");
        s10.append(num2);
        s10.append(", androidProductId=");
        s10.append(str6);
        s10.append(", previewAudioUrl=");
        s10.append(str7);
        s10.append(", coverImageUrls=");
        s10.append(map);
        s10.append(", coverAspectRatio=");
        s10.append(d10);
        s10.append(", blurPlaceholder=");
        s10.append(str8);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public ExploreRead(String str, String str2, String str3, String str4, Float f10, Float f11, Integer num, ExplorePricingType explorePricingType, Float f12, String str5, Integer num2, String str6, String str7, Map<String, String> map, Double d10, String str8) {
        str.getClass();
        str2.getClass();
        explorePricingType.getClass();
        this.readId = str;
        this.title = str2;
        this.author = str3;
        this.articleImageUrl = str4;
        this.audioDurationSeconds = f10;
        this.averageRating = f11;
        this.totalRatingCount = num;
        this.pricingType = explorePricingType;
        this.listPrice = f12;
        this.currency = str5;
        this.addedToLibraryCount = num2;
        this.androidProductId = str6;
        this.previewAudioUrl = str7;
        this.coverImageUrls = map;
        this.coverAspectRatio = d10;
        this.blurPlaceholder = str8;
    }
}

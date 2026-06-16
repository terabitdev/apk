package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.f0;
import ur.g1;
import ur.h0;
import ur.r;
import ur.t0;
import ur.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 j2\u00020\u0001:\u0002kjBÍ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019BÇ\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u001e\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001fJØ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u0010\u00107\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010F\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bJ\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bK\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010F\u0012\u0004\bM\u0010I\u001a\u0004\bL\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010N\u0012\u0004\bP\u0010I\u001a\u0004\bO\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010N\u0012\u0004\bR\u0010I\u001a\u0004\bQ\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010S\u0012\u0004\bU\u0010I\u001a\u0004\bT\u0010'R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010F\u0012\u0004\bW\u0010I\u001a\u0004\bV\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\bY\u0010I\u001a\u0004\bX\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bZ\u0010\u001fR\"\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010S\u0012\u0004\b\\\u0010I\u001a\u0004\b[\u0010'R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010]\u0012\u0004\b_\u0010I\u001a\u0004\b^\u0010-R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010F\u0012\u0004\ba\u0010I\u001a\u0004\b`\u0010\u001fR.\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010b\u0012\u0004\bd\u0010I\u001a\u0004\bc\u00100R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010e\u0012\u0004\bg\u0010I\u001a\u0004\bf\u00102R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010F\u0012\u0004\bi\u0010I\u001a\u0004\bh\u0010\u001f¨\u0006l"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "", "", "readId", "title", "author", "articleImageUrl", "", "audioDurationSeconds", "averageRating", "", "totalRatingCount", "pricingType", "listPrice", FirebaseAnalytics.Param.CURRENCY, "addedToLibraryCount", "Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;", "purchaseConfig", "previewAudioUrl", "", "coverImageUrls", "", "coverAspectRatio", "blurPlaceholder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Float;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "()Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;", "component13", "component14", "()Ljava/util/Map;", "component15", "()Ljava/lang/Double;", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreReadResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getReadId", "getReadId$annotations", "()V", "getTitle", "getAuthor", "getArticleImageUrl", "getArticleImageUrl$annotations", "Ljava/lang/Float;", "getAudioDurationSeconds", "getAudioDurationSeconds$annotations", "getAverageRating", "getAverageRating$annotations", "Ljava/lang/Integer;", "getTotalRatingCount", "getTotalRatingCount$annotations", "getPricingType", "getPricingType$annotations", "getListPrice", "getListPrice$annotations", "getCurrency", "getAddedToLibraryCount", "getAddedToLibraryCount$annotations", "Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;", "getPurchaseConfig", "getPurchaseConfig$annotations", "getPreviewAudioUrl", "getPreviewAudioUrl$annotations", "Ljava/util/Map;", "getCoverImageUrls", "getCoverImageUrls$annotations", "Ljava/lang/Double;", "getCoverAspectRatio", "getCoverAspectRatio$annotations", "getBlurPlaceholder", "getBlurPlaceholder$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ExploreReadResponseModel {
    private final Integer addedToLibraryCount;
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
    private final String pricingType;
    private final ReadPurchaseConfigResponseModel purchaseConfig;
    private final String readId;
    private final String title;
    private final Integer totalRatingCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, sn.a.d(i.f31597b, new io.elevenlabs.data.model.a(28)), null, null};

    public /* synthetic */ ExploreReadResponseModel(int i10, String str, String str2, String str3, String str4, Float f10, Float f11, Integer num, String str5, Float f12, String str6, Integer num2, ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel, String str7, Map map, Double d10, String str8, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.readId = str;
            if ((i10 & 2) == 0) {
                this.title = null;
            } else {
                this.title = str2;
            }
            if ((i10 & 4) == 0) {
                this.author = null;
            } else {
                this.author = str3;
            }
            if ((i10 & 8) == 0) {
                this.articleImageUrl = null;
            } else {
                this.articleImageUrl = str4;
            }
            if ((i10 & 16) == 0) {
                this.audioDurationSeconds = null;
            } else {
                this.audioDurationSeconds = f10;
            }
            if ((i10 & 32) == 0) {
                this.averageRating = null;
            } else {
                this.averageRating = f11;
            }
            if ((i10 & 64) == 0) {
                this.totalRatingCount = null;
            } else {
                this.totalRatingCount = num;
            }
            if ((i10 & 128) == 0) {
                this.pricingType = "free";
            } else {
                this.pricingType = str5;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.listPrice = null;
            } else {
                this.listPrice = f12;
            }
            if ((i10 & 512) == 0) {
                this.currency = null;
            } else {
                this.currency = str6;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                this.addedToLibraryCount = null;
            } else {
                this.addedToLibraryCount = num2;
            }
            if ((i10 & 2048) == 0) {
                this.purchaseConfig = null;
            } else {
                this.purchaseConfig = readPurchaseConfigResponseModel;
            }
            if ((i10 & 4096) == 0) {
                this.previewAudioUrl = null;
            } else {
                this.previewAudioUrl = str7;
            }
            if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
                this.coverImageUrls = null;
            } else {
                this.coverImageUrls = map;
            }
            if ((i10 & 16384) == 0) {
                this.coverAspectRatio = null;
            } else {
                this.coverAspectRatio = d10;
            }
            if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) == 0) {
                this.blurPlaceholder = null;
                return;
            } else {
                this.blurPlaceholder = str8;
                return;
            }
        }
        t0.j(i10, 1, ExploreReadResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        g1 g1Var = g1.f34588a;
        return new h0(g1Var, g1Var);
    }

    public static /* synthetic */ ExploreReadResponseModel copy$default(ExploreReadResponseModel exploreReadResponseModel, String str, String str2, String str3, String str4, Float f10, Float f11, Integer num, String str5, Float f12, String str6, Integer num2, ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel, String str7, Map map, Double d10, String str8, int i10, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        Float f13;
        Float f14;
        Integer num3;
        String str13;
        Float f15;
        String str14;
        Integer num4;
        ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel2;
        String str15;
        Map map2;
        Double d11;
        String str16;
        if ((i10 & 1) != 0) {
            str9 = exploreReadResponseModel.readId;
        } else {
            str9 = str;
        }
        if ((i10 & 2) != 0) {
            str10 = exploreReadResponseModel.title;
        } else {
            str10 = str2;
        }
        if ((i10 & 4) != 0) {
            str11 = exploreReadResponseModel.author;
        } else {
            str11 = str3;
        }
        if ((i10 & 8) != 0) {
            str12 = exploreReadResponseModel.articleImageUrl;
        } else {
            str12 = str4;
        }
        if ((i10 & 16) != 0) {
            f13 = exploreReadResponseModel.audioDurationSeconds;
        } else {
            f13 = f10;
        }
        if ((i10 & 32) != 0) {
            f14 = exploreReadResponseModel.averageRating;
        } else {
            f14 = f11;
        }
        if ((i10 & 64) != 0) {
            num3 = exploreReadResponseModel.totalRatingCount;
        } else {
            num3 = num;
        }
        if ((i10 & 128) != 0) {
            str13 = exploreReadResponseModel.pricingType;
        } else {
            str13 = str5;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            f15 = exploreReadResponseModel.listPrice;
        } else {
            f15 = f12;
        }
        if ((i10 & 512) != 0) {
            str14 = exploreReadResponseModel.currency;
        } else {
            str14 = str6;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            num4 = exploreReadResponseModel.addedToLibraryCount;
        } else {
            num4 = num2;
        }
        if ((i10 & 2048) != 0) {
            readPurchaseConfigResponseModel2 = exploreReadResponseModel.purchaseConfig;
        } else {
            readPurchaseConfigResponseModel2 = readPurchaseConfigResponseModel;
        }
        if ((i10 & 4096) != 0) {
            str15 = exploreReadResponseModel.previewAudioUrl;
        } else {
            str15 = str7;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            map2 = exploreReadResponseModel.coverImageUrls;
        } else {
            map2 = map;
        }
        String str17 = str9;
        if ((i10 & 16384) != 0) {
            d11 = exploreReadResponseModel.coverAspectRatio;
        } else {
            d11 = d10;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            str16 = exploreReadResponseModel.blurPlaceholder;
        } else {
            str16 = str8;
        }
        return exploreReadResponseModel.copy(str17, str10, str11, str12, f13, f14, num3, str13, f15, str14, num4, readPurchaseConfigResponseModel2, str15, map2, d11, str16);
    }

    public static final /* synthetic */ void write$Self$data_release(ExploreReadResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.readId);
        if (output.C(serialDesc) || self.title != null) {
            output.o(serialDesc, 1, g1.f34588a, self.title);
        }
        if (output.C(serialDesc) || self.author != null) {
            output.o(serialDesc, 2, g1.f34588a, self.author);
        }
        if (output.C(serialDesc) || self.articleImageUrl != null) {
            output.o(serialDesc, 3, g1.f34588a, self.articleImageUrl);
        }
        if (output.C(serialDesc) || self.audioDurationSeconds != null) {
            output.o(serialDesc, 4, z.f34681a, self.audioDurationSeconds);
        }
        if (output.C(serialDesc) || self.averageRating != null) {
            output.o(serialDesc, 5, z.f34681a, self.averageRating);
        }
        if (output.C(serialDesc) || self.totalRatingCount != null) {
            output.o(serialDesc, 6, f0.f34579a, self.totalRatingCount);
        }
        if (output.C(serialDesc) || !m.c(self.pricingType, "free")) {
            output.V(serialDesc, 7, self.pricingType);
        }
        if (output.C(serialDesc) || self.listPrice != null) {
            output.o(serialDesc, 8, z.f34681a, self.listPrice);
        }
        if (output.C(serialDesc) || self.currency != null) {
            output.o(serialDesc, 9, g1.f34588a, self.currency);
        }
        if (output.C(serialDesc) || self.addedToLibraryCount != null) {
            output.o(serialDesc, 10, f0.f34579a, self.addedToLibraryCount);
        }
        if (output.C(serialDesc) || self.purchaseConfig != null) {
            output.o(serialDesc, 11, ReadPurchaseConfigResponseModel$$serializer.INSTANCE, self.purchaseConfig);
        }
        if (output.C(serialDesc) || self.previewAudioUrl != null) {
            output.o(serialDesc, 12, g1.f34588a, self.previewAudioUrl);
        }
        if (output.C(serialDesc) || self.coverImageUrls != null) {
            output.o(serialDesc, 13, (KSerializer) hVarArr[13].getValue(), self.coverImageUrls);
        }
        if (output.C(serialDesc) || self.coverAspectRatio != null) {
            output.o(serialDesc, 14, r.f34640a, self.coverAspectRatio);
        }
        if (output.C(serialDesc) || self.blurPlaceholder != null) {
            output.o(serialDesc, 15, g1.f34588a, self.blurPlaceholder);
        }
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
    public final ReadPurchaseConfigResponseModel getPurchaseConfig() {
        return this.purchaseConfig;
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
    public final String getPricingType() {
        return this.pricingType;
    }

    /* renamed from: component9, reason: from getter */
    public final Float getListPrice() {
        return this.listPrice;
    }

    public final ExploreReadResponseModel copy(String readId, String title, String author, String articleImageUrl, Float audioDurationSeconds, Float averageRating, Integer totalRatingCount, String pricingType, Float listPrice, String r27, Integer addedToLibraryCount, ReadPurchaseConfigResponseModel purchaseConfig, String previewAudioUrl, Map<String, String> coverImageUrls, Double coverAspectRatio, String blurPlaceholder) {
        readId.getClass();
        pricingType.getClass();
        return new ExploreReadResponseModel(readId, title, author, articleImageUrl, audioDurationSeconds, averageRating, totalRatingCount, pricingType, listPrice, r27, addedToLibraryCount, purchaseConfig, previewAudioUrl, coverImageUrls, coverAspectRatio, blurPlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExploreReadResponseModel)) {
            return false;
        }
        ExploreReadResponseModel exploreReadResponseModel = (ExploreReadResponseModel) other;
        if (m.c(this.readId, exploreReadResponseModel.readId) && m.c(this.title, exploreReadResponseModel.title) && m.c(this.author, exploreReadResponseModel.author) && m.c(this.articleImageUrl, exploreReadResponseModel.articleImageUrl) && m.c(this.audioDurationSeconds, exploreReadResponseModel.audioDurationSeconds) && m.c(this.averageRating, exploreReadResponseModel.averageRating) && m.c(this.totalRatingCount, exploreReadResponseModel.totalRatingCount) && m.c(this.pricingType, exploreReadResponseModel.pricingType) && m.c(this.listPrice, exploreReadResponseModel.listPrice) && m.c(this.currency, exploreReadResponseModel.currency) && m.c(this.addedToLibraryCount, exploreReadResponseModel.addedToLibraryCount) && m.c(this.purchaseConfig, exploreReadResponseModel.purchaseConfig) && m.c(this.previewAudioUrl, exploreReadResponseModel.previewAudioUrl) && m.c(this.coverImageUrls, exploreReadResponseModel.coverImageUrls) && m.c(this.coverAspectRatio, exploreReadResponseModel.coverAspectRatio) && m.c(this.blurPlaceholder, exploreReadResponseModel.blurPlaceholder)) {
            return true;
        }
        return false;
    }

    public final Integer getAddedToLibraryCount() {
        return this.addedToLibraryCount;
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

    public final String getPricingType() {
        return this.pricingType;
    }

    public final ReadPurchaseConfigResponseModel getPurchaseConfig() {
        return this.purchaseConfig;
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
        int hashCode13;
        int hashCode14 = this.readId.hashCode() * 31;
        String str = this.title;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode14 + hashCode) * 31;
        String str2 = this.author;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.articleImageUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Float f10 = this.audioDurationSeconds;
        if (f10 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f10.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Float f11 = this.averageRating;
        if (f11 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = f11.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Integer num = this.totalRatingCount;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int c5 = j0.c.c((i15 + hashCode6) * 31, 31, this.pricingType);
        Float f12 = this.listPrice;
        if (f12 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = f12.hashCode();
        }
        int i16 = (c5 + hashCode7) * 31;
        String str4 = this.currency;
        if (str4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str4.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Integer num2 = this.addedToLibraryCount;
        if (num2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num2.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel = this.purchaseConfig;
        if (readPurchaseConfigResponseModel == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = readPurchaseConfigResponseModel.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        String str5 = this.previewAudioUrl;
        if (str5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str5.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        Map<String, String> map = this.coverImageUrls;
        if (map == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = map.hashCode();
        }
        int i21 = (i20 + hashCode12) * 31;
        Double d10 = this.coverAspectRatio;
        if (d10 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = d10.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        String str6 = this.blurPlaceholder;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return i22 + i10;
    }

    public String toString() {
        String str = this.readId;
        String str2 = this.title;
        String str3 = this.author;
        String str4 = this.articleImageUrl;
        Float f10 = this.audioDurationSeconds;
        Float f11 = this.averageRating;
        Integer num = this.totalRatingCount;
        String str5 = this.pricingType;
        Float f12 = this.listPrice;
        String str6 = this.currency;
        Integer num2 = this.addedToLibraryCount;
        ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel = this.purchaseConfig;
        String str7 = this.previewAudioUrl;
        Map<String, String> map = this.coverImageUrls;
        Double d10 = this.coverAspectRatio;
        String str8 = this.blurPlaceholder;
        StringBuilder s10 = f.s("ExploreReadResponseModel(readId=", str, ", title=", str2, ", author=");
        f.x(s10, str3, ", articleImageUrl=", str4, ", audioDurationSeconds=");
        s10.append(f10);
        s10.append(", averageRating=");
        s10.append(f11);
        s10.append(", totalRatingCount=");
        s10.append(num);
        s10.append(", pricingType=");
        s10.append(str5);
        s10.append(", listPrice=");
        s10.append(f12);
        s10.append(", currency=");
        s10.append(str6);
        s10.append(", addedToLibraryCount=");
        s10.append(num2);
        s10.append(", purchaseConfig=");
        s10.append(readPurchaseConfigResponseModel);
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

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreReadResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ExploreReadResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAddedToLibraryCount$annotations() {
    }

    public static /* synthetic */ void getArticleImageUrl$annotations() {
    }

    public static /* synthetic */ void getAudioDurationSeconds$annotations() {
    }

    public static /* synthetic */ void getAverageRating$annotations() {
    }

    public static /* synthetic */ void getBlurPlaceholder$annotations() {
    }

    public static /* synthetic */ void getCoverAspectRatio$annotations() {
    }

    public static /* synthetic */ void getCoverImageUrls$annotations() {
    }

    public static /* synthetic */ void getListPrice$annotations() {
    }

    public static /* synthetic */ void getPreviewAudioUrl$annotations() {
    }

    public static /* synthetic */ void getPricingType$annotations() {
    }

    public static /* synthetic */ void getPurchaseConfig$annotations() {
    }

    public static /* synthetic */ void getReadId$annotations() {
    }

    public static /* synthetic */ void getTotalRatingCount$annotations() {
    }

    public ExploreReadResponseModel(String str, String str2, String str3, String str4, Float f10, Float f11, Integer num, String str5, Float f12, String str6, Integer num2, ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel, String str7, Map<String, String> map, Double d10, String str8) {
        str.getClass();
        str5.getClass();
        this.readId = str;
        this.title = str2;
        this.author = str3;
        this.articleImageUrl = str4;
        this.audioDurationSeconds = f10;
        this.averageRating = f11;
        this.totalRatingCount = num;
        this.pricingType = str5;
        this.listPrice = f12;
        this.currency = str6;
        this.addedToLibraryCount = num2;
        this.purchaseConfig = readPurchaseConfigResponseModel;
        this.previewAudioUrl = str7;
        this.coverImageUrls = map;
        this.coverAspectRatio = d10;
        this.blurPlaceholder = str8;
    }

    public /* synthetic */ ExploreReadResponseModel(String str, String str2, String str3, String str4, Float f10, Float f11, Integer num, String str5, Float f12, String str6, Integer num2, ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel, String str7, Map map, Double d10, String str8, int i10, kotlin.jvm.internal.f fVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : f10, (i10 & 32) != 0 ? null : f11, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? "free" : str5, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : f12, (i10 & 512) != 0 ? null : str6, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : num2, (i10 & 2048) != 0 ? null : readPurchaseConfigResponseModel, (i10 & 4096) != 0 ? null : str7, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : map, (i10 & 16384) != 0 ? null : d10, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : str8);
    }
}

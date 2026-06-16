package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.PaymentConfig;
import io.elevenlabs.domain.model.ReadDetailsResponse;
import io.elevenlabs.domain.model.ReadMeta;
import io.livekit.android.rpc.RpcError;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010%\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u000fHÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00104J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\u0017\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003JÄ\u0002\u0010`\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00052\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010aJ\u0014\u0010b\u001a\u00020\u00052\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010d\u001a\u00020eHÖ\u0081\u0004J\n\u0010f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010+R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010+R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0010\u00104R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010+R\u001f\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010+R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010+R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010+¨\u0006g"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsState;", "", "readId", "", "readIsInPlayerQueue", "", "readDetails", "Lio/elevenlabs/domain/model/ReadDetailsResponse;", "readMeta", "Lio/elevenlabs/domain/model/ReadMeta;", "isLoadingDetails", "isLoadingAction", "errorMessage", "inLibrary", "pricingType", "Lio/elevenlabs/domain/model/ExplorePricingType;", "isFreeUser", "isEligibleForTrial", FirebaseAnalytics.Event.PURCHASE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;", "paymentConfig", "Lio/elevenlabs/domain/model/PaymentConfig;", "previewUrl", "sampleReadId", "isPlayingPreview", "localizedPrices", "", "Lio/elevenlabs/domain/model/MoneyPrice;", "playingCarouselPreviewReadId", "showRateTitleDialog", "showRatedToast", "isRedeemingCode", "redeemError", "redemptionCode", "shouldRequestStartSelectiveStackPopping", "disabledReason", "isInReadLater", "isReadLaterEnabled", "<init>", "(Ljava/lang/String;ZLio/elevenlabs/domain/model/ReadDetailsResponse;Lio/elevenlabs/domain/model/ReadMeta;ZZLjava/lang/String;ZLio/elevenlabs/domain/model/ExplorePricingType;Ljava/lang/Boolean;ZLio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;Lio/elevenlabs/domain/model/PaymentConfig;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)V", "getReadId", "()Ljava/lang/String;", "getReadIsInPlayerQueue", "()Z", "getReadDetails", "()Lio/elevenlabs/domain/model/ReadDetailsResponse;", "getReadMeta", "()Lio/elevenlabs/domain/model/ReadMeta;", "getErrorMessage", "getInLibrary", "getPricingType", "()Lio/elevenlabs/domain/model/ExplorePricingType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPurchase", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;", "getPaymentConfig", "()Lio/elevenlabs/domain/model/PaymentConfig;", "getPreviewUrl", "getSampleReadId", "getLocalizedPrices", "()Ljava/util/Map;", "getPlayingCarouselPreviewReadId", "getShowRateTitleDialog", "getShowRatedToast", "getRedeemError", "getRedemptionCode", "getShouldRequestStartSelectiveStackPopping", "getDisabledReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "(Ljava/lang/String;ZLio/elevenlabs/domain/model/ReadDetailsResponse;Lio/elevenlabs/domain/model/ReadMeta;ZZLjava/lang/String;ZLio/elevenlabs/domain/model/ExplorePricingType;Ljava/lang/Boolean;ZLio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;Lio/elevenlabs/domain/model/PaymentConfig;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsState;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ReadDetailsState {
    public static final int $stable = 8;
    private final String disabledReason;
    private final String errorMessage;
    private final boolean inLibrary;
    private final boolean isEligibleForTrial;
    private final Boolean isFreeUser;
    private final boolean isInReadLater;
    private final boolean isLoadingAction;
    private final boolean isLoadingDetails;
    private final boolean isPlayingPreview;
    private final boolean isReadLaterEnabled;
    private final boolean isRedeemingCode;
    private final Map<String, MoneyPrice> localizedPrices;
    private final PaymentConfig paymentConfig;
    private final String playingCarouselPreviewReadId;
    private final String previewUrl;
    private final ExplorePricingType pricingType;
    private final PurchaseState purchase;
    private final ReadDetailsResponse readDetails;
    private final String readId;
    private final boolean readIsInPlayerQueue;
    private final ReadMeta readMeta;
    private final String redeemError;
    private final String redemptionCode;
    private final String sampleReadId;
    private final boolean shouldRequestStartSelectiveStackPopping;
    private final boolean showRateTitleDialog;
    private final boolean showRatedToast;

    public /* synthetic */ ReadDetailsState(String str, boolean z6, ReadDetailsResponse readDetailsResponse, ReadMeta readMeta, boolean z10, boolean z11, String str2, boolean z12, ExplorePricingType explorePricingType, Boolean bool, boolean z13, PurchaseState purchaseState, PaymentConfig paymentConfig, String str3, String str4, boolean z14, Map map, String str5, boolean z15, boolean z16, boolean z17, String str6, String str7, boolean z18, String str8, boolean z19, boolean z20, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? null : readDetailsResponse, (i10 & 8) != 0 ? null : readMeta, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? false : z12, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? ExplorePricingType.Free : explorePricingType, (i10 & 512) != 0 ? null : bool, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z13, (i10 & 2048) != 0 ? null : purchaseState, (i10 & 4096) != 0 ? null : paymentConfig, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str3, (i10 & 16384) != 0 ? null : str4, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? false : z14, (i10 & 65536) != 0 ? null : map, (i10 & 131072) != 0 ? null : str5, (i10 & 262144) != 0 ? false : z15, (i10 & 524288) != 0 ? false : z16, (i10 & 1048576) != 0 ? false : z17, (i10 & 2097152) != 0 ? null : str6, (i10 & 4194304) != 0 ? null : str7, (i10 & 8388608) != 0 ? false : z18, (i10 & 16777216) != 0 ? null : str8, (i10 & 33554432) != 0 ? false : z19, (i10 & 67108864) != 0 ? false : z20);
    }

    public static /* synthetic */ ReadDetailsState copy$default(ReadDetailsState readDetailsState, String str, boolean z6, ReadDetailsResponse readDetailsResponse, ReadMeta readMeta, boolean z10, boolean z11, String str2, boolean z12, ExplorePricingType explorePricingType, Boolean bool, boolean z13, PurchaseState purchaseState, PaymentConfig paymentConfig, String str3, String str4, boolean z14, Map map, String str5, boolean z15, boolean z16, boolean z17, String str6, String str7, boolean z18, String str8, boolean z19, boolean z20, int i10, Object obj) {
        boolean z21;
        boolean z22;
        String str9 = (i10 & 1) != 0 ? readDetailsState.readId : str;
        boolean z23 = (i10 & 2) != 0 ? readDetailsState.readIsInPlayerQueue : z6;
        ReadDetailsResponse readDetailsResponse2 = (i10 & 4) != 0 ? readDetailsState.readDetails : readDetailsResponse;
        ReadMeta readMeta2 = (i10 & 8) != 0 ? readDetailsState.readMeta : readMeta;
        boolean z24 = (i10 & 16) != 0 ? readDetailsState.isLoadingDetails : z10;
        boolean z25 = (i10 & 32) != 0 ? readDetailsState.isLoadingAction : z11;
        String str10 = (i10 & 64) != 0 ? readDetailsState.errorMessage : str2;
        boolean z26 = (i10 & 128) != 0 ? readDetailsState.inLibrary : z12;
        ExplorePricingType explorePricingType2 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readDetailsState.pricingType : explorePricingType;
        Boolean bool2 = (i10 & 512) != 0 ? readDetailsState.isFreeUser : bool;
        boolean z27 = (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readDetailsState.isEligibleForTrial : z13;
        PurchaseState purchaseState2 = (i10 & 2048) != 0 ? readDetailsState.purchase : purchaseState;
        PaymentConfig paymentConfig2 = (i10 & 4096) != 0 ? readDetailsState.paymentConfig : paymentConfig;
        String str11 = (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readDetailsState.previewUrl : str3;
        String str12 = str9;
        String str13 = (i10 & 16384) != 0 ? readDetailsState.sampleReadId : str4;
        boolean z28 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readDetailsState.isPlayingPreview : z14;
        Map map2 = (i10 & 65536) != 0 ? readDetailsState.localizedPrices : map;
        String str14 = (i10 & 131072) != 0 ? readDetailsState.playingCarouselPreviewReadId : str5;
        boolean z29 = (i10 & 262144) != 0 ? readDetailsState.showRateTitleDialog : z15;
        boolean z30 = (i10 & 524288) != 0 ? readDetailsState.showRatedToast : z16;
        boolean z31 = (i10 & 1048576) != 0 ? readDetailsState.isRedeemingCode : z17;
        String str15 = (i10 & 2097152) != 0 ? readDetailsState.redeemError : str6;
        String str16 = (i10 & 4194304) != 0 ? readDetailsState.redemptionCode : str7;
        boolean z32 = (i10 & 8388608) != 0 ? readDetailsState.shouldRequestStartSelectiveStackPopping : z18;
        String str17 = (i10 & 16777216) != 0 ? readDetailsState.disabledReason : str8;
        boolean z33 = (i10 & 33554432) != 0 ? readDetailsState.isInReadLater : z19;
        if ((i10 & 67108864) != 0) {
            z22 = z33;
            z21 = readDetailsState.isReadLaterEnabled;
        } else {
            z21 = z20;
            z22 = z33;
        }
        return readDetailsState.copy(str12, z23, readDetailsResponse2, readMeta2, z24, z25, str10, z26, explorePricingType2, bool2, z27, purchaseState2, paymentConfig2, str11, str13, z28, map2, str14, z29, z30, z31, str15, str16, z32, str17, z22, z21);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIsFreeUser() {
        return this.isFreeUser;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsEligibleForTrial() {
        return this.isEligibleForTrial;
    }

    /* renamed from: component12, reason: from getter */
    public final PurchaseState getPurchase() {
        return this.purchase;
    }

    /* renamed from: component13, reason: from getter */
    public final PaymentConfig getPaymentConfig() {
        return this.paymentConfig;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final String getSampleReadId() {
        return this.sampleReadId;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsPlayingPreview() {
        return this.isPlayingPreview;
    }

    public final Map<String, MoneyPrice> component17() {
        return this.localizedPrices;
    }

    /* renamed from: component18, reason: from getter */
    public final String getPlayingCarouselPreviewReadId() {
        return this.playingCarouselPreviewReadId;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getShowRateTitleDialog() {
        return this.showRateTitleDialog;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getReadIsInPlayerQueue() {
        return this.readIsInPlayerQueue;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getShowRatedToast() {
        return this.showRatedToast;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsRedeemingCode() {
        return this.isRedeemingCode;
    }

    /* renamed from: component22, reason: from getter */
    public final String getRedeemError() {
        return this.redeemError;
    }

    /* renamed from: component23, reason: from getter */
    public final String getRedemptionCode() {
        return this.redemptionCode;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getShouldRequestStartSelectiveStackPopping() {
        return this.shouldRequestStartSelectiveStackPopping;
    }

    /* renamed from: component25, reason: from getter */
    public final String getDisabledReason() {
        return this.disabledReason;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsInReadLater() {
        return this.isInReadLater;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsReadLaterEnabled() {
        return this.isReadLaterEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final ReadDetailsResponse getReadDetails() {
        return this.readDetails;
    }

    /* renamed from: component4, reason: from getter */
    public final ReadMeta getReadMeta() {
        return this.readMeta;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoadingDetails() {
        return this.isLoadingDetails;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoadingAction() {
        return this.isLoadingAction;
    }

    /* renamed from: component7, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getInLibrary() {
        return this.inLibrary;
    }

    /* renamed from: component9, reason: from getter */
    public final ExplorePricingType getPricingType() {
        return this.pricingType;
    }

    public final ReadDetailsState copy(String readId, boolean readIsInPlayerQueue, ReadDetailsResponse readDetails, ReadMeta readMeta, boolean isLoadingDetails, boolean isLoadingAction, String errorMessage, boolean inLibrary, ExplorePricingType pricingType, Boolean isFreeUser, boolean isEligibleForTrial, PurchaseState purchase, PaymentConfig paymentConfig, String previewUrl, String sampleReadId, boolean isPlayingPreview, Map<String, MoneyPrice> localizedPrices, String playingCarouselPreviewReadId, boolean showRateTitleDialog, boolean showRatedToast, boolean isRedeemingCode, String redeemError, String redemptionCode, boolean shouldRequestStartSelectiveStackPopping, String disabledReason, boolean isInReadLater, boolean isReadLaterEnabled) {
        pricingType.getClass();
        return new ReadDetailsState(readId, readIsInPlayerQueue, readDetails, readMeta, isLoadingDetails, isLoadingAction, errorMessage, inLibrary, pricingType, isFreeUser, isEligibleForTrial, purchase, paymentConfig, previewUrl, sampleReadId, isPlayingPreview, localizedPrices, playingCarouselPreviewReadId, showRateTitleDialog, showRatedToast, isRedeemingCode, redeemError, redemptionCode, shouldRequestStartSelectiveStackPopping, disabledReason, isInReadLater, isReadLaterEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadDetailsState)) {
            return false;
        }
        ReadDetailsState readDetailsState = (ReadDetailsState) other;
        if (kotlin.jvm.internal.m.c(this.readId, readDetailsState.readId) && this.readIsInPlayerQueue == readDetailsState.readIsInPlayerQueue && kotlin.jvm.internal.m.c(this.readDetails, readDetailsState.readDetails) && kotlin.jvm.internal.m.c(this.readMeta, readDetailsState.readMeta) && this.isLoadingDetails == readDetailsState.isLoadingDetails && this.isLoadingAction == readDetailsState.isLoadingAction && kotlin.jvm.internal.m.c(this.errorMessage, readDetailsState.errorMessage) && this.inLibrary == readDetailsState.inLibrary && this.pricingType == readDetailsState.pricingType && kotlin.jvm.internal.m.c(this.isFreeUser, readDetailsState.isFreeUser) && this.isEligibleForTrial == readDetailsState.isEligibleForTrial && kotlin.jvm.internal.m.c(this.purchase, readDetailsState.purchase) && kotlin.jvm.internal.m.c(this.paymentConfig, readDetailsState.paymentConfig) && kotlin.jvm.internal.m.c(this.previewUrl, readDetailsState.previewUrl) && kotlin.jvm.internal.m.c(this.sampleReadId, readDetailsState.sampleReadId) && this.isPlayingPreview == readDetailsState.isPlayingPreview && kotlin.jvm.internal.m.c(this.localizedPrices, readDetailsState.localizedPrices) && kotlin.jvm.internal.m.c(this.playingCarouselPreviewReadId, readDetailsState.playingCarouselPreviewReadId) && this.showRateTitleDialog == readDetailsState.showRateTitleDialog && this.showRatedToast == readDetailsState.showRatedToast && this.isRedeemingCode == readDetailsState.isRedeemingCode && kotlin.jvm.internal.m.c(this.redeemError, readDetailsState.redeemError) && kotlin.jvm.internal.m.c(this.redemptionCode, readDetailsState.redemptionCode) && this.shouldRequestStartSelectiveStackPopping == readDetailsState.shouldRequestStartSelectiveStackPopping && kotlin.jvm.internal.m.c(this.disabledReason, readDetailsState.disabledReason) && this.isInReadLater == readDetailsState.isInReadLater && this.isReadLaterEnabled == readDetailsState.isReadLaterEnabled) {
            return true;
        }
        return false;
    }

    public final String getDisabledReason() {
        return this.disabledReason;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getInLibrary() {
        return this.inLibrary;
    }

    public final Map<String, MoneyPrice> getLocalizedPrices() {
        return this.localizedPrices;
    }

    public final PaymentConfig getPaymentConfig() {
        return this.paymentConfig;
    }

    public final String getPlayingCarouselPreviewReadId() {
        return this.playingCarouselPreviewReadId;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final ExplorePricingType getPricingType() {
        return this.pricingType;
    }

    public final PurchaseState getPurchase() {
        return this.purchase;
    }

    public final ReadDetailsResponse getReadDetails() {
        return this.readDetails;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final boolean getReadIsInPlayerQueue() {
        return this.readIsInPlayerQueue;
    }

    public final ReadMeta getReadMeta() {
        return this.readMeta;
    }

    public final String getRedeemError() {
        return this.redeemError;
    }

    public final String getRedemptionCode() {
        return this.redemptionCode;
    }

    public final String getSampleReadId() {
        return this.sampleReadId;
    }

    public final boolean getShouldRequestStartSelectiveStackPopping() {
        return this.shouldRequestStartSelectiveStackPopping;
    }

    public final boolean getShowRateTitleDialog() {
        return this.showRateTitleDialog;
    }

    public final boolean getShowRatedToast() {
        return this.showRatedToast;
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
        String str = this.readId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(hashCode * 31, 31, this.readIsInPlayerQueue);
        ReadDetailsResponse readDetailsResponse = this.readDetails;
        if (readDetailsResponse == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = readDetailsResponse.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        ReadMeta readMeta = this.readMeta;
        if (readMeta == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = readMeta.hashCode();
        }
        int f11 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i11 + hashCode3) * 31, 31, this.isLoadingDetails), 31, this.isLoadingAction);
        String str2 = this.errorMessage;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int hashCode14 = (this.pricingType.hashCode() + com.google.android.gms.internal.play_billing.b.f((f11 + hashCode4) * 31, 31, this.inLibrary)) * 31;
        Boolean bool = this.isFreeUser;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int f12 = com.google.android.gms.internal.play_billing.b.f((hashCode14 + hashCode5) * 31, 31, this.isEligibleForTrial);
        PurchaseState purchaseState = this.purchase;
        if (purchaseState == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = purchaseState.hashCode();
        }
        int i12 = (f12 + hashCode6) * 31;
        PaymentConfig paymentConfig = this.paymentConfig;
        if (paymentConfig == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = paymentConfig.hashCode();
        }
        int i13 = (i12 + hashCode7) * 31;
        String str3 = this.previewUrl;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int i14 = (i13 + hashCode8) * 31;
        String str4 = this.sampleReadId;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int f13 = com.google.android.gms.internal.play_billing.b.f((i14 + hashCode9) * 31, 31, this.isPlayingPreview);
        Map<String, MoneyPrice> map = this.localizedPrices;
        if (map == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map.hashCode();
        }
        int i15 = (f13 + hashCode10) * 31;
        String str5 = this.playingCarouselPreviewReadId;
        if (str5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str5.hashCode();
        }
        int f14 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i15 + hashCode11) * 31, 31, this.showRateTitleDialog), 31, this.showRatedToast), 31, this.isRedeemingCode);
        String str6 = this.redeemError;
        if (str6 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str6.hashCode();
        }
        int i16 = (f14 + hashCode12) * 31;
        String str7 = this.redemptionCode;
        if (str7 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str7.hashCode();
        }
        int f15 = com.google.android.gms.internal.play_billing.b.f((i16 + hashCode13) * 31, 31, this.shouldRequestStartSelectiveStackPopping);
        String str8 = this.disabledReason;
        if (str8 != null) {
            i10 = str8.hashCode();
        }
        return Boolean.hashCode(this.isReadLaterEnabled) + com.google.android.gms.internal.play_billing.b.f((f15 + i10) * 31, 31, this.isInReadLater);
    }

    public final boolean isEligibleForTrial() {
        return this.isEligibleForTrial;
    }

    public final Boolean isFreeUser() {
        return this.isFreeUser;
    }

    public final boolean isInReadLater() {
        return this.isInReadLater;
    }

    public final boolean isLoadingAction() {
        return this.isLoadingAction;
    }

    public final boolean isLoadingDetails() {
        return this.isLoadingDetails;
    }

    public final boolean isPlayingPreview() {
        return this.isPlayingPreview;
    }

    public final boolean isReadLaterEnabled() {
        return this.isReadLaterEnabled;
    }

    public final boolean isRedeemingCode() {
        return this.isRedeemingCode;
    }

    public String toString() {
        String str = this.readId;
        boolean z6 = this.readIsInPlayerQueue;
        ReadDetailsResponse readDetailsResponse = this.readDetails;
        ReadMeta readMeta = this.readMeta;
        boolean z10 = this.isLoadingDetails;
        boolean z11 = this.isLoadingAction;
        String str2 = this.errorMessage;
        boolean z12 = this.inLibrary;
        ExplorePricingType explorePricingType = this.pricingType;
        Boolean bool = this.isFreeUser;
        boolean z13 = this.isEligibleForTrial;
        PurchaseState purchaseState = this.purchase;
        PaymentConfig paymentConfig = this.paymentConfig;
        String str3 = this.previewUrl;
        String str4 = this.sampleReadId;
        boolean z14 = this.isPlayingPreview;
        Map<String, MoneyPrice> map = this.localizedPrices;
        String str5 = this.playingCarouselPreviewReadId;
        boolean z15 = this.showRateTitleDialog;
        boolean z16 = this.showRatedToast;
        boolean z17 = this.isRedeemingCode;
        String str6 = this.redeemError;
        String str7 = this.redemptionCode;
        boolean z18 = this.shouldRequestStartSelectiveStackPopping;
        String str8 = this.disabledReason;
        boolean z19 = this.isInReadLater;
        boolean z20 = this.isReadLaterEnabled;
        StringBuilder sb = new StringBuilder("ReadDetailsState(readId=");
        sb.append(str);
        sb.append(", readIsInPlayerQueue=");
        sb.append(z6);
        sb.append(", readDetails=");
        sb.append(readDetailsResponse);
        sb.append(", readMeta=");
        sb.append(readMeta);
        sb.append(", isLoadingDetails=");
        ib.i.t(sb, z10, ", isLoadingAction=", z11, ", errorMessage=");
        defpackage.f.y(sb, str2, ", inLibrary=", z12, ", pricingType=");
        sb.append(explorePricingType);
        sb.append(", isFreeUser=");
        sb.append(bool);
        sb.append(", isEligibleForTrial=");
        sb.append(z13);
        sb.append(", purchase=");
        sb.append(purchaseState);
        sb.append(", paymentConfig=");
        sb.append(paymentConfig);
        sb.append(", previewUrl=");
        sb.append(str3);
        sb.append(", sampleReadId=");
        defpackage.f.y(sb, str4, ", isPlayingPreview=", z14, ", localizedPrices=");
        sb.append(map);
        sb.append(", playingCarouselPreviewReadId=");
        sb.append(str5);
        sb.append(", showRateTitleDialog=");
        ib.i.t(sb, z15, ", showRatedToast=", z16, ", isRedeemingCode=");
        defpackage.f.z(sb, z17, ", redeemError=", str6, ", redemptionCode=");
        defpackage.f.y(sb, str7, ", shouldRequestStartSelectiveStackPopping=", z18, ", disabledReason=");
        defpackage.f.y(sb, str8, ", isInReadLater=", z19, ", isReadLaterEnabled=");
        return p.n.j(Separators.RPAREN, sb, z20);
    }

    public ReadDetailsState(String str, boolean z6, ReadDetailsResponse readDetailsResponse, ReadMeta readMeta, boolean z10, boolean z11, String str2, boolean z12, ExplorePricingType explorePricingType, Boolean bool, boolean z13, PurchaseState purchaseState, PaymentConfig paymentConfig, String str3, String str4, boolean z14, Map<String, MoneyPrice> map, String str5, boolean z15, boolean z16, boolean z17, String str6, String str7, boolean z18, String str8, boolean z19, boolean z20) {
        explorePricingType.getClass();
        this.readId = str;
        this.readIsInPlayerQueue = z6;
        this.readDetails = readDetailsResponse;
        this.readMeta = readMeta;
        this.isLoadingDetails = z10;
        this.isLoadingAction = z11;
        this.errorMessage = str2;
        this.inLibrary = z12;
        this.pricingType = explorePricingType;
        this.isFreeUser = bool;
        this.isEligibleForTrial = z13;
        this.purchase = purchaseState;
        this.paymentConfig = paymentConfig;
        this.previewUrl = str3;
        this.sampleReadId = str4;
        this.isPlayingPreview = z14;
        this.localizedPrices = map;
        this.playingCarouselPreviewReadId = str5;
        this.showRateTitleDialog = z15;
        this.showRatedToast = z16;
        this.isRedeemingCode = z17;
        this.redeemError = str6;
        this.redemptionCode = str7;
        this.shouldRequestStartSelectiveStackPopping = z18;
        this.disabledReason = str8;
        this.isInReadLater = z19;
        this.isReadLaterEnabled = z20;
    }

    public ReadDetailsState() {
        this(null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217727, null);
    }
}

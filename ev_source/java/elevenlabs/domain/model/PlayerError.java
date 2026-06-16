package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.perf.metrics.resource.ResourceType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import z.h;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError;", "", ResourceType.NETWORK, "Unknown", "ApiError", "InsufficientCreditsCode", "InsufficientCredits", "VoiceDesignNotAllowed", "NotFoundError", "DrmAuthenticationFailed", "DrmLicenseError", "DrmLicenseExpired", "DrmProvisioningError", "DrmDeviceNotSupported", "ContentNotLicensed", "SubscriptionRequired", "Lio/elevenlabs/domain/model/PlayerError$ApiError;", "Lio/elevenlabs/domain/model/PlayerError$ContentNotLicensed;", "Lio/elevenlabs/domain/model/PlayerError$DrmAuthenticationFailed;", "Lio/elevenlabs/domain/model/PlayerError$DrmDeviceNotSupported;", "Lio/elevenlabs/domain/model/PlayerError$DrmLicenseError;", "Lio/elevenlabs/domain/model/PlayerError$DrmLicenseExpired;", "Lio/elevenlabs/domain/model/PlayerError$DrmProvisioningError;", "Lio/elevenlabs/domain/model/PlayerError$InsufficientCredits;", "Lio/elevenlabs/domain/model/PlayerError$Network;", "Lio/elevenlabs/domain/model/PlayerError$NotFoundError;", "Lio/elevenlabs/domain/model/PlayerError$SubscriptionRequired;", "Lio/elevenlabs/domain/model/PlayerError$Unknown;", "Lio/elevenlabs/domain/model/PlayerError$VoiceDesignNotAllowed;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PlayerError {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$ApiError;", "Lio/elevenlabs/domain/model/PlayerError;", "code", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ApiError implements PlayerError {
        private final String code;
        private final String message;

        public ApiError(String str, String str2) {
            str2.getClass();
            this.code = str;
            this.message = str2;
        }

        public static /* synthetic */ ApiError copy$default(ApiError apiError, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = apiError.code;
            }
            if ((i10 & 2) != 0) {
                str2 = apiError.message;
            }
            return apiError.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final ApiError copy(String code, String message) {
            message.getClass();
            return new ApiError(code, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApiError)) {
                return false;
            }
            ApiError apiError = (ApiError) other;
            if (m.c(this.code, apiError.code) && m.c(this.message, apiError.message)) {
                return true;
            }
            return false;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode;
            String str = this.code;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.message.hashCode() + (hashCode * 31);
        }

        public String toString() {
            return h.c("ApiError(code=", this.code, ", message=", this.message, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$ContentNotLicensed;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ContentNotLicensed implements PlayerError {
        public static final ContentNotLicensed INSTANCE = new ContentNotLicensed();

        private ContentNotLicensed() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof ContentNotLicensed)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 415789780;
        }

        public String toString() {
            return "ContentNotLicensed";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$DrmAuthenticationFailed;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class DrmAuthenticationFailed implements PlayerError {
        public static final DrmAuthenticationFailed INSTANCE = new DrmAuthenticationFailed();

        private DrmAuthenticationFailed() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof DrmAuthenticationFailed)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -2122381667;
        }

        public String toString() {
            return "DrmAuthenticationFailed";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$DrmDeviceNotSupported;", "Lio/elevenlabs/domain/model/PlayerError;", "errorCode", "", "<init>", "(I)V", "getErrorCode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class DrmDeviceNotSupported implements PlayerError {
        private final int errorCode;

        public DrmDeviceNotSupported(int i10) {
            this.errorCode = i10;
        }

        public static /* synthetic */ DrmDeviceNotSupported copy$default(DrmDeviceNotSupported drmDeviceNotSupported, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = drmDeviceNotSupported.errorCode;
            }
            return drmDeviceNotSupported.copy(i10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        public final DrmDeviceNotSupported copy(int errorCode) {
            return new DrmDeviceNotSupported(errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof DrmDeviceNotSupported) && this.errorCode == ((DrmDeviceNotSupported) other).errorCode) {
                return true;
            }
            return false;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.errorCode);
        }

        public String toString() {
            return b.j(this.errorCode, "DrmDeviceNotSupported(errorCode=", Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$DrmLicenseError;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class DrmLicenseError implements PlayerError {
        public static final DrmLicenseError INSTANCE = new DrmLicenseError();

        private DrmLicenseError() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof DrmLicenseError)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1265728497;
        }

        public String toString() {
            return "DrmLicenseError";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$DrmLicenseExpired;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class DrmLicenseExpired implements PlayerError {
        public static final DrmLicenseExpired INSTANCE = new DrmLicenseExpired();

        private DrmLicenseExpired() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof DrmLicenseExpired)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -719588500;
        }

        public String toString() {
            return "DrmLicenseExpired";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$DrmProvisioningError;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class DrmProvisioningError implements PlayerError {
        public static final DrmProvisioningError INSTANCE = new DrmProvisioningError();

        private DrmProvisioningError() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof DrmProvisioningError)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 934449747;
        }

        public String toString() {
            return "DrmProvisioningError";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$InsufficientCredits;", "Lio/elevenlabs/domain/model/PlayerError;", "code", "Lio/elevenlabs/domain/model/PlayerError$InsufficientCreditsCode;", "message", "", "<init>", "(Lio/elevenlabs/domain/model/PlayerError$InsufficientCreditsCode;Ljava/lang/String;)V", "getCode", "()Lio/elevenlabs/domain/model/PlayerError$InsufficientCreditsCode;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class InsufficientCredits implements PlayerError {
        private final InsufficientCreditsCode code;
        private final String message;

        public InsufficientCredits(InsufficientCreditsCode insufficientCreditsCode, String str) {
            insufficientCreditsCode.getClass();
            this.code = insufficientCreditsCode;
            this.message = str;
        }

        public static /* synthetic */ InsufficientCredits copy$default(InsufficientCredits insufficientCredits, InsufficientCreditsCode insufficientCreditsCode, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                insufficientCreditsCode = insufficientCredits.code;
            }
            if ((i10 & 2) != 0) {
                str = insufficientCredits.message;
            }
            return insufficientCredits.copy(insufficientCreditsCode, str);
        }

        /* renamed from: component1, reason: from getter */
        public final InsufficientCreditsCode getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final InsufficientCredits copy(InsufficientCreditsCode code, String message) {
            code.getClass();
            return new InsufficientCredits(code, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsufficientCredits)) {
                return false;
            }
            InsufficientCredits insufficientCredits = (InsufficientCredits) other;
            if (this.code == insufficientCredits.code && m.c(this.message, insufficientCredits.message)) {
                return true;
            }
            return false;
        }

        public final InsufficientCreditsCode getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.code.hashCode() * 31;
            String str = this.message;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "InsufficientCredits(code=" + this.code + ", message=" + this.message + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$Network;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Network implements PlayerError {
        public static final Network INSTANCE = new Network();

        private Network() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Network)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1776405065;
        }

        public String toString() {
            return ResourceType.NETWORK;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$NotFoundError;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class NotFoundError implements PlayerError {
        public static final NotFoundError INSTANCE = new NotFoundError();

        private NotFoundError() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof NotFoundError)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1839900766;
        }

        public String toString() {
            return "NotFoundError";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$SubscriptionRequired;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SubscriptionRequired implements PlayerError {
        public static final SubscriptionRequired INSTANCE = new SubscriptionRequired();

        private SubscriptionRequired() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof SubscriptionRequired)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1786157325;
        }

        public String toString() {
            return "SubscriptionRequired";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$Unknown;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Unknown implements PlayerError {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Unknown)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 390236115;
        }

        public String toString() {
            return "Unknown";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$VoiceDesignNotAllowed;", "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class VoiceDesignNotAllowed implements PlayerError {
        public static final VoiceDesignNotAllowed INSTANCE = new VoiceDesignNotAllowed();

        private VoiceDesignNotAllowed() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof VoiceDesignNotAllowed)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -67851058;
        }

        public String toString() {
            return "VoiceDesignNotAllowed";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$InsufficientCreditsCode;", "", "apiValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "CREDITS", "PREMIUM_BOOKS", "Companion", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class InsufficientCreditsCode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InsufficientCreditsCode[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String apiValue;
        public static final InsufficientCreditsCode CREDITS = new InsufficientCreditsCode("CREDITS", 0, "insufficient_credits");
        public static final InsufficientCreditsCode PREMIUM_BOOKS = new InsufficientCreditsCode("PREMIUM_BOOKS", 1, "insufficient_premium_books_credits");

        private static final /* synthetic */ InsufficientCreditsCode[] $values() {
            return new InsufficientCreditsCode[]{CREDITS, PREMIUM_BOOKS};
        }

        static {
            InsufficientCreditsCode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
            INSTANCE = new Companion(null);
        }

        private InsufficientCreditsCode(String str, int i10, String str2) {
            this.apiValue = str2;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static InsufficientCreditsCode valueOf(String str) {
            return (InsufficientCreditsCode) Enum.valueOf(InsufficientCreditsCode.class, str);
        }

        public static InsufficientCreditsCode[] values() {
            return (InsufficientCreditsCode[]) $VALUES.clone();
        }

        public final String getApiValue() {
            return this.apiValue;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/model/PlayerError$InsufficientCreditsCode$Companion;", "", "<init>", "()V", "fromApiValue", "Lio/elevenlabs/domain/model/PlayerError$InsufficientCreditsCode;", "value", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final InsufficientCreditsCode fromApiValue(String value) {
                Object obj;
                value.getClass();
                Iterator<E> it = InsufficientCreditsCode.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (m.c(((InsufficientCreditsCode) obj).getApiValue(), value)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                InsufficientCreditsCode insufficientCreditsCode = (InsufficientCreditsCode) obj;
                if (insufficientCreditsCode == null) {
                    return InsufficientCreditsCode.CREDITS;
                }
                return insufficientCreditsCode;
            }

            private Companion() {
            }
        }
    }
}

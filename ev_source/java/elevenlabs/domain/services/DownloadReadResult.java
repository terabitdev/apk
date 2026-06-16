package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.a;
import com.google.firebase.perf.metrics.resource.ResourceType;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult;", "", "InitiatedSuccessfully", "Error", "Lio/elevenlabs/domain/services/DownloadReadResult$Error;", "Lio/elevenlabs/domain/services/DownloadReadResult$InitiatedSuccessfully;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface DownloadReadResult {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult$Error;", "Lio/elevenlabs/domain/services/DownloadReadResult;", "OfflineConversionLimitReached", "InsufficientOfflineDownloadCredits", "UserIsOnFreePlan", "ApiDisplayableMessageError", ResourceType.NETWORK, "Unhandled", "Lio/elevenlabs/domain/services/DownloadReadResult$Error$ApiDisplayableMessageError;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error$InsufficientOfflineDownloadCredits;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error$Network;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error$OfflineConversionLimitReached;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error$Unhandled;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error$UserIsOnFreePlan;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Error extends DownloadReadResult {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult$Error$ApiDisplayableMessageError;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error;", "code", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ApiDisplayableMessageError implements Error {
            private final String code;
            private final String message;

            public ApiDisplayableMessageError(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.code = str;
                this.message = str2;
            }

            public static /* synthetic */ ApiDisplayableMessageError copy$default(ApiDisplayableMessageError apiDisplayableMessageError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = apiDisplayableMessageError.code;
                }
                if ((i10 & 2) != 0) {
                    str2 = apiDisplayableMessageError.message;
                }
                return apiDisplayableMessageError.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final ApiDisplayableMessageError copy(String code, String message) {
                code.getClass();
                message.getClass();
                return new ApiDisplayableMessageError(code, message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApiDisplayableMessageError)) {
                    return false;
                }
                ApiDisplayableMessageError apiDisplayableMessageError = (ApiDisplayableMessageError) other;
                if (m.c(this.code, apiDisplayableMessageError.code) && m.c(this.message, apiDisplayableMessageError.message)) {
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
                return this.message.hashCode() + (this.code.hashCode() * 31);
            }

            public String toString() {
                return h.c("ApiDisplayableMessageError(code=", this.code, ", message=", this.message, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult$Error$InsufficientOfflineDownloadCredits;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error;", "message", "", ParameterNames.REQUIRED, "", "available", "<init>", "(Ljava/lang/String;DD)V", "getMessage", "()Ljava/lang/String;", "getRequired", "()D", "getAvailable", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class InsufficientOfflineDownloadCredits implements Error {
            private final double available;
            private final String message;
            private final double required;

            public InsufficientOfflineDownloadCredits(String str, double d10, double d11) {
                str.getClass();
                this.message = str;
                this.required = d10;
                this.available = d11;
            }

            public static /* synthetic */ InsufficientOfflineDownloadCredits copy$default(InsufficientOfflineDownloadCredits insufficientOfflineDownloadCredits, String str, double d10, double d11, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = insufficientOfflineDownloadCredits.message;
                }
                if ((i10 & 2) != 0) {
                    d10 = insufficientOfflineDownloadCredits.required;
                }
                if ((i10 & 4) != 0) {
                    d11 = insufficientOfflineDownloadCredits.available;
                }
                return insufficientOfflineDownloadCredits.copy(str, d10, d11);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* renamed from: component2, reason: from getter */
            public final double getRequired() {
                return this.required;
            }

            /* renamed from: component3, reason: from getter */
            public final double getAvailable() {
                return this.available;
            }

            public final InsufficientOfflineDownloadCredits copy(String message, double required, double available) {
                message.getClass();
                return new InsufficientOfflineDownloadCredits(message, required, available);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InsufficientOfflineDownloadCredits)) {
                    return false;
                }
                InsufficientOfflineDownloadCredits insufficientOfflineDownloadCredits = (InsufficientOfflineDownloadCredits) other;
                if (m.c(this.message, insufficientOfflineDownloadCredits.message) && Double.compare(this.required, insufficientOfflineDownloadCredits.required) == 0 && Double.compare(this.available, insufficientOfflineDownloadCredits.available) == 0) {
                    return true;
                }
                return false;
            }

            public final double getAvailable() {
                return this.available;
            }

            public final String getMessage() {
                return this.message;
            }

            public final double getRequired() {
                return this.required;
            }

            public int hashCode() {
                return Double.hashCode(this.available) + n.c(this.message.hashCode() * 31, 31, this.required);
            }

            public String toString() {
                return "InsufficientOfflineDownloadCredits(message=" + this.message + ", required=" + this.required + ", available=" + this.available + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult$Error$Network;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Network implements Error {
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
                return -898204070;
            }

            public String toString() {
                return ResourceType.NETWORK;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult$Error$OfflineConversionLimitReached;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error;", "message", "", "limit", "", "canUpgrade", "", "<init>", "(Ljava/lang/String;IZ)V", "getMessage", "()Ljava/lang/String;", "getLimit", "()I", "getCanUpgrade", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OfflineConversionLimitReached implements Error {
            private final boolean canUpgrade;
            private final int limit;
            private final String message;

            public OfflineConversionLimitReached(String str, int i10, boolean z6) {
                str.getClass();
                this.message = str;
                this.limit = i10;
                this.canUpgrade = z6;
            }

            public static /* synthetic */ OfflineConversionLimitReached copy$default(OfflineConversionLimitReached offlineConversionLimitReached, String str, int i10, boolean z6, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = offlineConversionLimitReached.message;
                }
                if ((i11 & 2) != 0) {
                    i10 = offlineConversionLimitReached.limit;
                }
                if ((i11 & 4) != 0) {
                    z6 = offlineConversionLimitReached.canUpgrade;
                }
                return offlineConversionLimitReached.copy(str, i10, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* renamed from: component2, reason: from getter */
            public final int getLimit() {
                return this.limit;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getCanUpgrade() {
                return this.canUpgrade;
            }

            public final OfflineConversionLimitReached copy(String message, int limit, boolean canUpgrade) {
                message.getClass();
                return new OfflineConversionLimitReached(message, limit, canUpgrade);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfflineConversionLimitReached)) {
                    return false;
                }
                OfflineConversionLimitReached offlineConversionLimitReached = (OfflineConversionLimitReached) other;
                if (m.c(this.message, offlineConversionLimitReached.message) && this.limit == offlineConversionLimitReached.limit && this.canUpgrade == offlineConversionLimitReached.canUpgrade) {
                    return true;
                }
                return false;
            }

            public final boolean getCanUpgrade() {
                return this.canUpgrade;
            }

            public final int getLimit() {
                return this.limit;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return Boolean.hashCode(this.canUpgrade) + c.b(this.limit, this.message.hashCode() * 31, 31);
            }

            public String toString() {
                String str = this.message;
                int i10 = this.limit;
                return n.j(Separators.RPAREN, a.o(i10, "OfflineConversionLimitReached(message=", str, ", limit=", ", canUpgrade="), this.canUpgrade);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult$Error$Unhandled;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Unhandled implements Error {
            private final String message;

            public Unhandled(String str) {
                str.getClass();
                this.message = str;
            }

            public static /* synthetic */ Unhandled copy$default(Unhandled unhandled, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unhandled.message;
                }
                return unhandled.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Unhandled copy(String message) {
                message.getClass();
                return new Unhandled(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Unhandled) && m.c(this.message, ((Unhandled) other).message)) {
                    return true;
                }
                return false;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return f.C("Unhandled(message=", this.message, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult$Error$UserIsOnFreePlan;", "Lio/elevenlabs/domain/services/DownloadReadResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class UserIsOnFreePlan implements Error {
            public static final UserIsOnFreePlan INSTANCE = new UserIsOnFreePlan();

            private UserIsOnFreePlan() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof UserIsOnFreePlan)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -398142403;
            }

            public String toString() {
                return "UserIsOnFreePlan";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/DownloadReadResult$InitiatedSuccessfully;", "Lio/elevenlabs/domain/services/DownloadReadResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class InitiatedSuccessfully implements DownloadReadResult {
        public static final InitiatedSuccessfully INSTANCE = new InitiatedSuccessfully();

        private InitiatedSuccessfully() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof InitiatedSuccessfully)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 2057070180;
        }

        public String toString() {
            return "InitiatedSuccessfully";
        }
    }
}

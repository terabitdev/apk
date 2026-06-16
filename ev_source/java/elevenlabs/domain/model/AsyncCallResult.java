package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/AsyncCallResult;", TokenNames.T, "", "Success", "Error", "AsyncCallError", "Lio/elevenlabs/domain/model/AsyncCallResult$Error;", "Lio/elevenlabs/domain/model/AsyncCallResult$Success;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AsyncCallResult<T> {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError;", "", "isNotNetwork", "", "()Z", "ApiError", "UnknownError", "NetworkError", "Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError$ApiError;", "Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError$NetworkError;", "Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError$UnknownError;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface AsyncCallError {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError$ApiError;", "Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError;", "code", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ApiError implements AsyncCallError {
            private final String code;
            private final String message;

            public ApiError(String str, String str2) {
                str.getClass();
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
                code.getClass();
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
                int hashCode2 = this.code.hashCode() * 31;
                String str = this.message;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            @Override // io.elevenlabs.domain.model.AsyncCallResult.AsyncCallError
            public /* bridge */ boolean isNotNetwork() {
                return super.isNotNetwork();
            }

            public String toString() {
                return h.c("ApiError(code=", this.code, ", message=", this.message, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean isNotNetwork(AsyncCallError asyncCallError) {
                return AsyncCallError.super.isNotNetwork();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError$NetworkError;", "Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NetworkError implements AsyncCallError {
            public static final NetworkError INSTANCE = new NetworkError();

            private NetworkError() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof NetworkError)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -111576973;
            }

            @Override // io.elevenlabs.domain.model.AsyncCallResult.AsyncCallError
            public /* bridge */ boolean isNotNetwork() {
                return super.isNotNetwork();
            }

            public String toString() {
                return "NetworkError";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError$UnknownError;", "Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class UnknownError implements AsyncCallError {
            private final String message;

            public UnknownError(String str) {
                str.getClass();
                this.message = str;
            }

            public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknownError.message;
                }
                return unknownError.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final UnknownError copy(String message) {
                message.getClass();
                return new UnknownError(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UnknownError) && m.c(this.message, ((UnknownError) other).message)) {
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

            @Override // io.elevenlabs.domain.model.AsyncCallResult.AsyncCallError
            public /* bridge */ boolean isNotNetwork() {
                return super.isNotNetwork();
            }

            public String toString() {
                return f.C("UnknownError(message=", this.message, Separators.RPAREN);
            }
        }

        default boolean isNotNetwork() {
            return !(this instanceof NetworkError);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0000\"\u0004\b\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/model/AsyncCallResult$Error;", TokenNames.T, "Lio/elevenlabs/domain/model/AsyncCallResult;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError;", "<init>", "(Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError;)V", "getError", "()Lio/elevenlabs/domain/model/AsyncCallResult$AsyncCallError;", "cast", TokenNames.R, "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Error<T> implements AsyncCallResult<T> {
        private final AsyncCallError error;

        public Error(AsyncCallError asyncCallError) {
            asyncCallError.getClass();
            this.error = asyncCallError;
        }

        public static /* synthetic */ Error copy$default(Error error, AsyncCallError asyncCallError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                asyncCallError = error.error;
            }
            return error.copy(asyncCallError);
        }

        public final <R> Error<R> cast() {
            AsyncCallError asyncCallError;
            AsyncCallError asyncCallError2 = this.error;
            if (asyncCallError2 instanceof AsyncCallError.ApiError) {
                asyncCallError = new AsyncCallError.ApiError(((AsyncCallError.ApiError) asyncCallError2).getCode(), ((AsyncCallError.ApiError) this.error).getMessage());
            } else {
                asyncCallError = AsyncCallError.NetworkError.INSTANCE;
                if (!m.c(asyncCallError2, asyncCallError)) {
                    if (asyncCallError2 instanceof AsyncCallError.UnknownError) {
                        asyncCallError = new AsyncCallError.UnknownError(((AsyncCallError.UnknownError) this.error).getMessage());
                    } else {
                        c6.p();
                        return null;
                    }
                }
            }
            return new Error<>(asyncCallError);
        }

        /* renamed from: component1, reason: from getter */
        public final AsyncCallError getError() {
            return this.error;
        }

        public final Error<T> copy(AsyncCallError error) {
            error.getClass();
            return new Error<>(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Error) && m.c(this.error, ((Error) other).error)) {
                return true;
            }
            return false;
        }

        public final AsyncCallError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/model/AsyncCallResult$Success;", TokenNames.T, "Lio/elevenlabs/domain/model/AsyncCallResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lio/elevenlabs/domain/model/AsyncCallResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success<T> implements AsyncCallResult<T> {
        private final T data;

        public Success(T t10) {
            this.data = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T data) {
            return new Success<>(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Success) && m.c(this.data, ((Success) other).data)) {
                return true;
            }
            return false;
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            T t10 = this.data;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.data + Separators.RPAREN;
        }
    }
}

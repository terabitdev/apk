package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.messaging.Constants;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.b;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/ApiResult;", TokenNames.T, "", "Success", "Error", "Lio/elevenlabs/data/model/ApiResult$Error;", "Lio/elevenlabs/data/model/ApiResult$Success;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ApiResult<T> {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/data/model/ApiResult$Success;", TokenNames.T, "Lio/elevenlabs/data/model/ApiResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lio/elevenlabs/data/model/ApiResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success<T> implements ApiResult<T> {
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

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/ApiResult$Error;", TokenNames.T, "Lio/elevenlabs/data/model/ApiResult;", "ApiError", "NetworkError", "UnknownError", "Lio/elevenlabs/data/model/ApiResult$Error$ApiError;", "Lio/elevenlabs/data/model/ApiResult$Error$NetworkError;", "Lio/elevenlabs/data/model/ApiResult$Error$UnknownError;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Error<T> extends ApiResult<T> {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0082\u0004J\n\u0010\t\u001a\u00020\nH\u0096\u0080\u0004¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/data/model/ApiResult$Error$NetworkError;", TokenNames.T, "Lio/elevenlabs/data/model/ApiResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class NetworkError<T> implements Error<T> {
            public boolean equals(Object other) {
                if (other instanceof NetworkError) {
                    return true;
                }
                return super.equals(other);
            }

            public int hashCode() {
                return super.hashCode();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0004HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/data/model/ApiResult$Error$UnknownError;", TokenNames.T, "Lio/elevenlabs/data/model/ApiResult$Error;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class UnknownError<T> implements Error<T> {
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

            public final UnknownError<T> copy(String message) {
                message.getClass();
                return new UnknownError<>(message);
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

            public String toString() {
                return f.C("UnknownError(message=", this.message, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lio/elevenlabs/data/model/ApiResult$Error$ApiError;", TokenNames.T, "Lio/elevenlabs/data/model/ApiResult$Error;", "", "code", "message", "Lkotlinx/serialization/json/b;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "httpStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/b;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/b;", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/b;I)Lio/elevenlabs/data/model/ApiResult$Error$ApiError;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getMessage", "Lkotlinx/serialization/json/b;", "getData", TokenNames.I, "getHttpStatus", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ApiError<T> implements Error<T> {
            private final String code;
            private final b data;
            private final int httpStatus;
            private final String message;

            public ApiError(String str, String str2, b bVar, int i10) {
                str.getClass();
                str2.getClass();
                this.code = str;
                this.message = str2;
                this.data = bVar;
                this.httpStatus = i10;
            }

            public static /* synthetic */ ApiError copy$default(ApiError apiError, String str, String str2, b bVar, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = apiError.code;
                }
                if ((i11 & 2) != 0) {
                    str2 = apiError.message;
                }
                if ((i11 & 4) != 0) {
                    bVar = apiError.data;
                }
                if ((i11 & 8) != 0) {
                    i10 = apiError.httpStatus;
                }
                return apiError.copy(str, str2, bVar, i10);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* renamed from: component3, reason: from getter */
            public final b getData() {
                return this.data;
            }

            /* renamed from: component4, reason: from getter */
            public final int getHttpStatus() {
                return this.httpStatus;
            }

            public final ApiError<T> copy(String code, String message, b data, int httpStatus) {
                code.getClass();
                message.getClass();
                return new ApiError<>(code, message, data, httpStatus);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApiError)) {
                    return false;
                }
                ApiError apiError = (ApiError) other;
                if (m.c(this.code, apiError.code) && m.c(this.message, apiError.message) && m.c(this.data, apiError.data) && this.httpStatus == apiError.httpStatus) {
                    return true;
                }
                return false;
            }

            public final String getCode() {
                return this.code;
            }

            public final b getData() {
                return this.data;
            }

            public final int getHttpStatus() {
                return this.httpStatus;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                int hashCode;
                int c5 = c.c(this.code.hashCode() * 31, 31, this.message);
                b bVar = this.data;
                if (bVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = bVar.hashCode();
                }
                return Integer.hashCode(this.httpStatus) + ((c5 + hashCode) * 31);
            }

            public String toString() {
                String str = this.code;
                String str2 = this.message;
                b bVar = this.data;
                int i10 = this.httpStatus;
                StringBuilder s10 = f.s("ApiError(code=", str, ", message=", str2, ", data=");
                s10.append(bVar);
                s10.append(", httpStatus=");
                s10.append(i10);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            public /* synthetic */ ApiError(String str, String str2, b bVar, int i10, int i11, kotlin.jvm.internal.f fVar) {
                this(str, str2, bVar, (i11 & 8) != 0 ? 0 : i10);
            }
        }
    }
}

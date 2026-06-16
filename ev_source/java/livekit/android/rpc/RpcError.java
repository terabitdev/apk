package io.livekit.android.rpc;

import android.gov.nist.javax.sip.header.ParameterNames;
import as.l8;
import com.google.firebase.messaging.Constants;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.util.StringByteUtilsKt;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$RpcError;
import rd.c1;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0002\u001f B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006!"}, d2 = {"Lio/livekit/android/rpc/RpcError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "message", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, ParameterNames.CAUSE, "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getCode", "()I", "getData", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toProto", "Llivekit/LivekitModels$RpcError;", "toString", "BuiltinRpcError", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class RpcError extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_MESSAGE_BYTES = 256;
    private final Throwable cause;
    private final int code;
    private final String data;
    private final String message;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lio/livekit/android/rpc/RpcError$BuiltinRpcError;", "", "code", "", "message", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "create", "Lio/livekit/android/rpc/RpcError;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, ParameterNames.CAUSE, "", "APPLICATION_ERROR", "CONNECTION_TIMEOUT", "RESPONSE_TIMEOUT", "RECIPIENT_DISCONNECTED", "RESPONSE_PAYLOAD_TOO_LARGE", "SEND_FAILED", "UNSUPPORTED_METHOD", "RECIPIENT_NOT_FOUND", "REQUEST_PAYLOAD_TOO_LARGE", "UNSUPPORTED_SERVER", "UNSUPPORTED_VERSION", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class BuiltinRpcError extends Enum<BuiltinRpcError> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BuiltinRpcError[] $VALUES;
        private final int code;
        private final String message;
        public static final BuiltinRpcError APPLICATION_ERROR = new BuiltinRpcError("APPLICATION_ERROR", 0, 1500, "Application error in method handler");
        public static final BuiltinRpcError CONNECTION_TIMEOUT = new BuiltinRpcError("CONNECTION_TIMEOUT", 1, 1501, "Connection timeout");
        public static final BuiltinRpcError RESPONSE_TIMEOUT = new BuiltinRpcError("RESPONSE_TIMEOUT", 2, 1502, "Response timeout");
        public static final BuiltinRpcError RECIPIENT_DISCONNECTED = new BuiltinRpcError("RECIPIENT_DISCONNECTED", 3, 1503, "Recipient disconnected");
        public static final BuiltinRpcError RESPONSE_PAYLOAD_TOO_LARGE = new BuiltinRpcError("RESPONSE_PAYLOAD_TOO_LARGE", 4, 1504, "Response payload too large");
        public static final BuiltinRpcError SEND_FAILED = new BuiltinRpcError("SEND_FAILED", 5, 1505, "Failed to send");
        public static final BuiltinRpcError UNSUPPORTED_METHOD = new BuiltinRpcError("UNSUPPORTED_METHOD", 6, 1400, "Method not supported at destination");
        public static final BuiltinRpcError RECIPIENT_NOT_FOUND = new BuiltinRpcError("RECIPIENT_NOT_FOUND", 7, 1401, "Recipient not found");
        public static final BuiltinRpcError REQUEST_PAYLOAD_TOO_LARGE = new BuiltinRpcError("REQUEST_PAYLOAD_TOO_LARGE", 8, 1402, "Request payload too large");
        public static final BuiltinRpcError UNSUPPORTED_SERVER = new BuiltinRpcError("UNSUPPORTED_SERVER", 9, 1403, "RPC not supported by server");
        public static final BuiltinRpcError UNSUPPORTED_VERSION = new BuiltinRpcError("UNSUPPORTED_VERSION", 10, 1404, "Unsupported RPC version");

        private static final /* synthetic */ BuiltinRpcError[] $values() {
            return new BuiltinRpcError[]{APPLICATION_ERROR, CONNECTION_TIMEOUT, RESPONSE_TIMEOUT, RECIPIENT_DISCONNECTED, RESPONSE_PAYLOAD_TOO_LARGE, SEND_FAILED, UNSUPPORTED_METHOD, RECIPIENT_NOT_FOUND, REQUEST_PAYLOAD_TOO_LARGE, UNSUPPORTED_SERVER, UNSUPPORTED_VERSION};
        }

        static {
            BuiltinRpcError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private BuiltinRpcError(String str, int i10, int i11, String str2) {
            super(str, i10);
            this.code = i11;
            this.message = str2;
        }

        public static /* synthetic */ RpcError create$default(BuiltinRpcError builtinRpcError, String str, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = "";
                }
                if ((i10 & 2) != 0) {
                    th = null;
                }
                return builtinRpcError.create(str, th);
            }
            a9.a.y("Super calls with default arguments not supported in this target, function: create");
            return null;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static BuiltinRpcError valueOf(String str) {
            return (BuiltinRpcError) Enum.valueOf(BuiltinRpcError.class, str);
        }

        public static BuiltinRpcError[] values() {
            return (BuiltinRpcError[]) $VALUES.clone();
        }

        public final RpcError create(String r42, Throwable r52) {
            r42.getClass();
            return new RpcError(this.code, this.message, r42, r52);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RpcError(int i10, String str, String str2, Throwable th) {
        super(str);
        str.getClass();
        str2.getClass();
        this.code = i10;
        this.message = str;
        this.data = str2;
        this.cause = th;
    }

    public static /* synthetic */ RpcError copy$default(RpcError rpcError, int i10, String str, String str2, Throwable th, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = rpcError.code;
        }
        if ((i11 & 2) != 0) {
            str = rpcError.message;
        }
        if ((i11 & 4) != 0) {
            str2 = rpcError.data;
        }
        if ((i11 & 8) != 0) {
            th = rpcError.cause;
        }
        return rpcError.copy(i10, str, str2, th);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component4, reason: from getter */
    public final Throwable getCause() {
        return this.cause;
    }

    public final RpcError copy(int code, String message, String r42, Throwable r52) {
        message.getClass();
        r42.getClass();
        return new RpcError(code, message, r42, r52);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RpcError)) {
            return false;
        }
        RpcError rpcError = (RpcError) other;
        if (this.code == rpcError.code && m.c(this.message, rpcError.message) && m.c(this.data, rpcError.data) && m.c(this.cause, rpcError.cause)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getData() {
        return this.data;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(c.c(Integer.hashCode(this.code) * 31, 31, this.message), 31, this.data);
        Throwable th = this.cause;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return c5 + hashCode;
    }

    public final LivekitModels$RpcError toProto() {
        l8 newBuilder = LivekitModels$RpcError.newBuilder();
        newBuilder.b(this.code);
        newBuilder.d(getMessage());
        newBuilder.c(this.data);
        LivekitModels$RpcError livekitModels$RpcError = (LivekitModels$RpcError) newBuilder.build();
        livekitModels$RpcError.getClass();
        return livekitModels$RpcError;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "RpcError(code=" + this.code + ", message=" + this.message + ", data=" + this.data + ", cause=" + this.cause + ')';
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/livekit/android/rpc/RpcError$Companion;", "", "()V", "MAX_MESSAGE_BYTES", "", "fromProto", "Lio/livekit/android/rpc/RpcError;", "proto", "Llivekit/LivekitModels$RpcError;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final RpcError fromProto(LivekitModels$RpcError proto) {
            proto.getClass();
            int code = proto.getCode();
            String message = proto.getMessage();
            if (message == null) {
                message = "";
            }
            String truncateBytes = StringByteUtilsKt.truncateBytes(message, RpcError.MAX_MESSAGE_BYTES);
            String data = proto.getData();
            data.getClass();
            return new RpcError(code, truncateBytes, StringByteUtilsKt.truncateBytes(data, RTCEngine.MAX_DATA_PACKET_SIZE), null, 8, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ RpcError(int i10, String str, String str2, Throwable th, int i11, f fVar) {
        this(i10, str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : th);
    }
}

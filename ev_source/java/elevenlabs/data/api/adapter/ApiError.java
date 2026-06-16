package io.elevenlabs.data.api.adapter;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.t0;
import vr.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lio/elevenlabs/data/api/adapter/ApiError;", "", "Lio/elevenlabs/data/api/adapter/ApiError$Detail;", "detail", "<init>", "(Lio/elevenlabs/data/api/adapter/ApiError$Detail;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/api/adapter/ApiError$Detail;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/api/adapter/ApiError;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/api/adapter/ApiError$Detail;", "copy", "(Lio/elevenlabs/data/api/adapter/ApiError$Detail;)Lio/elevenlabs/data/api/adapter/ApiError;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/api/adapter/ApiError$Detail;", "getDetail", "Companion", "Detail", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ApiError {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Detail detail;

    public /* synthetic */ ApiError(int i10, Detail detail, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.detail = detail;
        } else {
            t0.j(i10, 1, ApiError$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ApiError copy$default(ApiError apiError, Detail detail, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            detail = apiError.detail;
        }
        return apiError.copy(detail);
    }

    /* renamed from: component1, reason: from getter */
    public final Detail getDetail() {
        return this.detail;
    }

    public final ApiError copy(Detail detail) {
        detail.getClass();
        return new ApiError(detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ApiError) && m.c(this.detail, ((ApiError) other).detail)) {
            return true;
        }
        return false;
    }

    public final Detail getDetail() {
        return this.detail;
    }

    public int hashCode() {
        return this.detail.hashCode();
    }

    public String toString() {
        return "ApiError(detail=" + this.detail + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, d2 = {"Lio/elevenlabs/data/api/adapter/ApiError$Detail;", "", "", "status", "message", "Lkotlinx/serialization/json/b;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/b;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/b;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/api/adapter/ApiError$Detail;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/b;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/b;)Lio/elevenlabs/data/api/adapter/ApiError$Detail;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "getMessage", "Lkotlinx/serialization/json/b;", "getData", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final /* data */ class Detail {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final b data;
        private final String message;
        private final String status;

        public /* synthetic */ Detail(int i10, String str, String str2, b bVar, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.status = str;
                this.message = str2;
                if ((i10 & 4) == 0) {
                    this.data = null;
                    return;
                } else {
                    this.data = bVar;
                    return;
                }
            }
            t0.j(i10, 3, ApiError$Detail$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static /* synthetic */ Detail copy$default(Detail detail, String str, String str2, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = detail.status;
            }
            if ((i10 & 2) != 0) {
                str2 = detail.message;
            }
            if ((i10 & 4) != 0) {
                bVar = detail.data;
            }
            return detail.copy(str, str2, bVar);
        }

        public static final /* synthetic */ void write$Self$data_release(Detail self, tr.b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.status);
            output.V(serialDesc, 1, self.message);
            if (output.C(serialDesc) || self.data != null) {
                output.o(serialDesc, 2, l.f35878a, self.data);
            }
        }

        /* renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final b getData() {
            return this.data;
        }

        public final Detail copy(String status, String message, b data) {
            status.getClass();
            message.getClass();
            return new Detail(status, message, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) other;
            if (m.c(this.status, detail.status) && m.c(this.message, detail.message) && m.c(this.data, detail.data)) {
                return true;
            }
            return false;
        }

        public final b getData() {
            return this.data;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode;
            int c5 = c.c(this.status.hashCode() * 31, 31, this.message);
            b bVar = this.data;
            if (bVar == null) {
                hashCode = 0;
            } else {
                hashCode = bVar.hashCode();
            }
            return c5 + hashCode;
        }

        public String toString() {
            String str = this.status;
            String str2 = this.message;
            b bVar = this.data;
            StringBuilder s10 = f.s("Detail(status=", str, ", message=", str2, ", data=");
            s10.append(bVar);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/api/adapter/ApiError$Detail$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/api/adapter/ApiError$Detail;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ApiError$Detail$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Detail(String str, String str2, b bVar) {
            str.getClass();
            str2.getClass();
            this.status = str;
            this.message = str2;
            this.data = bVar;
        }

        public /* synthetic */ Detail(String str, String str2, b bVar, int i10, kotlin.jvm.internal.f fVar) {
            this(str, str2, (i10 & 4) != 0 ? null : bVar);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/api/adapter/ApiError$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/api/adapter/ApiError;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ApiError$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ApiError(Detail detail) {
        detail.getClass();
        this.detail = detail;
    }
}

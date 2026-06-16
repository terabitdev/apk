package io.elevenlabs.data.api;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lio/elevenlabs/data/api/InitialMessagePayload;", "Lio/elevenlabs/data/api/MessagePayload;", "", "stream_id", "", "position", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;JLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/api/InitialMessagePayload;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lio/elevenlabs/data/api/InitialMessagePayload;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStream_id", "J", "getPosition", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class InitialMessagePayload extends MessagePayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long position;
    private final String stream_id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InitialMessagePayload(int i10, String str, long j4, c1 c1Var) {
        super(null);
        if (3 == (i10 & 3)) {
            this.stream_id = str;
            this.position = j4;
            return;
        }
        t0.j(i10, 3, InitialMessagePayload$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ InitialMessagePayload copy$default(InitialMessagePayload initialMessagePayload, String str, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initialMessagePayload.stream_id;
        }
        if ((i10 & 2) != 0) {
            j4 = initialMessagePayload.position;
        }
        return initialMessagePayload.copy(str, j4);
    }

    public static final /* synthetic */ void write$Self$data_release(InitialMessagePayload self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.stream_id);
        output.h0(serialDesc, 1, self.position);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStream_id() {
        return this.stream_id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    public final InitialMessagePayload copy(String stream_id, long position) {
        stream_id.getClass();
        return new InitialMessagePayload(stream_id, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialMessagePayload)) {
            return false;
        }
        InitialMessagePayload initialMessagePayload = (InitialMessagePayload) other;
        if (m.c(this.stream_id, initialMessagePayload.stream_id) && this.position == initialMessagePayload.position) {
            return true;
        }
        return false;
    }

    public final long getPosition() {
        return this.position;
    }

    public final String getStream_id() {
        return this.stream_id;
    }

    public int hashCode() {
        return Long.hashCode(this.position) + (this.stream_id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("InitialMessagePayload(stream_id=", this.stream_id, this.position, ", position=");
        r10.append(Separators.RPAREN);
        return r10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/api/InitialMessagePayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/api/InitialMessagePayload;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return InitialMessagePayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialMessagePayload(String str, long j4) {
        super(null);
        str.getClass();
        this.stream_id = str;
        this.position = j4;
    }
}

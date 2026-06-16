package io.elevenlabs.data.api;

import android.gov.nist.core.Separators;
import io.elevenlabs.data.model.response.Alignment;
import io.elevenlabs.data.model.response.Alignment$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ<\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b\u0007\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010\u001c¨\u00061"}, d2 = {"Lio/elevenlabs/data/api/WebSocketDataResponse;", "Lio/elevenlabs/data/api/WebSocketResponse;", "Lio/elevenlabs/data/model/response/Alignment;", "alignment", "", "audio", "", "isFinal", "streamId", "<init>", "(Lio/elevenlabs/data/model/response/Alignment;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/Alignment;Ljava/lang/String;ZLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/api/WebSocketDataResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/Alignment;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "copy", "(Lio/elevenlabs/data/model/response/Alignment;Ljava/lang/String;ZLjava/lang/String;)Lio/elevenlabs/data/api/WebSocketDataResponse;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/Alignment;", "getAlignment", "Ljava/lang/String;", "getAudio", "Z", "getStreamId", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class WebSocketDataResponse implements WebSocketResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Alignment alignment;
    private final String audio;
    private final boolean isFinal;
    private final String streamId;

    public /* synthetic */ WebSocketDataResponse(int i10, Alignment alignment, String str, boolean z6, String str2, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.alignment = alignment;
            this.audio = str;
            this.isFinal = z6;
            this.streamId = str2;
            return;
        }
        t0.j(i10, 15, WebSocketDataResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ WebSocketDataResponse copy$default(WebSocketDataResponse webSocketDataResponse, Alignment alignment, String str, boolean z6, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = webSocketDataResponse.alignment;
        }
        if ((i10 & 2) != 0) {
            str = webSocketDataResponse.audio;
        }
        if ((i10 & 4) != 0) {
            z6 = webSocketDataResponse.isFinal;
        }
        if ((i10 & 8) != 0) {
            str2 = webSocketDataResponse.streamId;
        }
        return webSocketDataResponse.copy(alignment, str, z6, str2);
    }

    public static final /* synthetic */ void write$Self$data_release(WebSocketDataResponse self, b output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, Alignment$$serializer.INSTANCE, self.alignment);
        output.o(serialDesc, 1, g1.f34588a, self.audio);
        output.T(serialDesc, 2, self.isFinal);
        output.V(serialDesc, 3, self.streamId);
    }

    /* renamed from: component1, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAudio() {
        return this.audio;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFinal() {
        return this.isFinal;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStreamId() {
        return this.streamId;
    }

    public final WebSocketDataResponse copy(Alignment alignment, String audio, boolean isFinal, String streamId) {
        streamId.getClass();
        return new WebSocketDataResponse(alignment, audio, isFinal, streamId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketDataResponse)) {
            return false;
        }
        WebSocketDataResponse webSocketDataResponse = (WebSocketDataResponse) other;
        if (m.c(this.alignment, webSocketDataResponse.alignment) && m.c(this.audio, webSocketDataResponse.audio) && this.isFinal == webSocketDataResponse.isFinal && m.c(this.streamId, webSocketDataResponse.streamId)) {
            return true;
        }
        return false;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public int hashCode() {
        int hashCode;
        Alignment alignment = this.alignment;
        int i10 = 0;
        if (alignment == null) {
            hashCode = 0;
        } else {
            hashCode = alignment.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.audio;
        if (str != null) {
            i10 = str.hashCode();
        }
        return this.streamId.hashCode() + com.google.android.gms.internal.play_billing.b.f((i11 + i10) * 31, 31, this.isFinal);
    }

    public final boolean isFinal() {
        return this.isFinal;
    }

    public String toString() {
        return "WebSocketDataResponse(alignment=" + this.alignment + ", audio=" + this.audio + ", isFinal=" + this.isFinal + ", streamId=" + this.streamId + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/api/WebSocketDataResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/api/WebSocketDataResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return WebSocketDataResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WebSocketDataResponse(Alignment alignment, String str, boolean z6, String str2) {
        str2.getClass();
        this.alignment = alignment;
        this.audio = str;
        this.isFinal = z6;
        this.streamId = str2;
    }
}

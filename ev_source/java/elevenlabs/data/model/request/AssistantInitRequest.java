package io.elevenlabs.data.model.request;

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
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u0018¨\u00060"}, d2 = {"Lio/elevenlabs/data/model/request/AssistantInitRequest;", "", "", "readId", "", "position", "voiceId", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/request/AssistantInitRequest;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lio/elevenlabs/data/model/request/AssistantInitRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReadId", "getReadId$annotations", "()V", "J", "getPosition", "getPosition$annotations", "getVoiceId", "getVoiceId$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class AssistantInitRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long position;
    private final String readId;
    private final String voiceId;

    public /* synthetic */ AssistantInitRequest(int i10, String str, long j4, String str2, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.readId = str;
            this.position = j4;
            this.voiceId = str2;
            return;
        }
        t0.j(i10, 7, AssistantInitRequest$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ AssistantInitRequest copy$default(AssistantInitRequest assistantInitRequest, String str, long j4, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = assistantInitRequest.readId;
        }
        if ((i10 & 2) != 0) {
            j4 = assistantInitRequest.position;
        }
        if ((i10 & 4) != 0) {
            str2 = assistantInitRequest.voiceId;
        }
        return assistantInitRequest.copy(str, j4, str2);
    }

    public static final /* synthetic */ void write$Self$data_release(AssistantInitRequest self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.readId);
        output.h0(serialDesc, 1, self.position);
        output.V(serialDesc, 2, self.voiceId);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    public final AssistantInitRequest copy(String readId, long position, String voiceId) {
        readId.getClass();
        voiceId.getClass();
        return new AssistantInitRequest(readId, position, voiceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssistantInitRequest)) {
            return false;
        }
        AssistantInitRequest assistantInitRequest = (AssistantInitRequest) other;
        if (m.c(this.readId, assistantInitRequest.readId) && this.position == assistantInitRequest.position && m.c(this.voiceId, assistantInitRequest.voiceId)) {
            return true;
        }
        return false;
    }

    public final long getPosition() {
        return this.position;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        return this.voiceId.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.position, this.readId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.readId;
        long j4 = this.position;
        return h.d(com.google.android.gms.internal.play_billing.b.r("AssistantInitRequest(readId=", str, j4, ", position="), ", voiceId=", this.voiceId, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/AssistantInitRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/request/AssistantInitRequest;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AssistantInitRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getPosition$annotations() {
    }

    public static /* synthetic */ void getReadId$annotations() {
    }

    public static /* synthetic */ void getVoiceId$annotations() {
    }

    public AssistantInitRequest(String str, long j4, String str2) {
        str.getClass();
        str2.getClass();
        this.readId = str;
        this.position = j4;
        this.voiceId = str2;
    }
}

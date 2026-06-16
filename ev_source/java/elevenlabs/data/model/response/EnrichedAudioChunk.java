package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u0007\u0010\u001d¨\u0006-"}, d2 = {"Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "", "Lio/elevenlabs/data/model/response/Alignment;", "alignment", "", "audio", "", "isFinal", "<init>", "(Lio/elevenlabs/data/model/response/Alignment;Ljava/lang/String;Z)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/Alignment;Ljava/lang/String;ZLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/EnrichedAudioChunk;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/Alignment;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Lio/elevenlabs/data/model/response/Alignment;Ljava/lang/String;Z)Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/Alignment;", "getAlignment", "Ljava/lang/String;", "getAudio", "Z", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class EnrichedAudioChunk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Alignment alignment;
    private final String audio;
    private final boolean isFinal;

    public /* synthetic */ EnrichedAudioChunk(int i10, Alignment alignment, String str, boolean z6, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.alignment = alignment;
            this.audio = str;
            this.isFinal = z6;
            return;
        }
        t0.j(i10, 7, EnrichedAudioChunk$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ EnrichedAudioChunk copy$default(EnrichedAudioChunk enrichedAudioChunk, Alignment alignment, String str, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = enrichedAudioChunk.alignment;
        }
        if ((i10 & 2) != 0) {
            str = enrichedAudioChunk.audio;
        }
        if ((i10 & 4) != 0) {
            z6 = enrichedAudioChunk.isFinal;
        }
        return enrichedAudioChunk.copy(alignment, str, z6);
    }

    public static final /* synthetic */ void write$Self$data_release(EnrichedAudioChunk self, tr.b output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, Alignment$$serializer.INSTANCE, self.alignment);
        output.o(serialDesc, 1, g1.f34588a, self.audio);
        output.T(serialDesc, 2, self.isFinal);
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

    public final EnrichedAudioChunk copy(Alignment alignment, String audio, boolean isFinal) {
        return new EnrichedAudioChunk(alignment, audio, isFinal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrichedAudioChunk)) {
            return false;
        }
        EnrichedAudioChunk enrichedAudioChunk = (EnrichedAudioChunk) other;
        if (m.c(this.alignment, enrichedAudioChunk.alignment) && m.c(this.audio, enrichedAudioChunk.audio) && this.isFinal == enrichedAudioChunk.isFinal) {
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
        return Boolean.hashCode(this.isFinal) + ((i11 + i10) * 31);
    }

    public final boolean isFinal() {
        return this.isFinal;
    }

    public String toString() {
        Alignment alignment = this.alignment;
        String str = this.audio;
        boolean z6 = this.isFinal;
        StringBuilder sb = new StringBuilder("EnrichedAudioChunk(alignment=");
        sb.append(alignment);
        sb.append(", audio=");
        sb.append(str);
        sb.append(", isFinal=");
        return n.j(Separators.RPAREN, sb, z6);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/EnrichedAudioChunk$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return EnrichedAudioChunk$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EnrichedAudioChunk(Alignment alignment, String str, boolean z6) {
        this.alignment = alignment;
        this.audio = str;
        this.isFinal = z6;
    }
}

package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.r;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00060"}, d2 = {"Lio/elevenlabs/data/model/response/VoiceDesignPreviewItem;", "", "", "generatedVoiceId", "audioBase64", "", "durationSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/VoiceDesignPreviewItem;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lio/elevenlabs/data/model/response/VoiceDesignPreviewItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGeneratedVoiceId", "getGeneratedVoiceId$annotations", "()V", "getAudioBase64", "getAudioBase64$annotations", "Ljava/lang/Double;", "getDurationSeconds", "getDurationSeconds$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class VoiceDesignPreviewItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String audioBase64;
    private final Double durationSeconds;
    private final String generatedVoiceId;

    public /* synthetic */ VoiceDesignPreviewItem(int i10, String str, String str2, Double d10, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.generatedVoiceId = str;
            this.audioBase64 = str2;
            if ((i10 & 4) == 0) {
                this.durationSeconds = null;
                return;
            } else {
                this.durationSeconds = d10;
                return;
            }
        }
        t0.j(i10, 3, VoiceDesignPreviewItem$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ VoiceDesignPreviewItem copy$default(VoiceDesignPreviewItem voiceDesignPreviewItem, String str, String str2, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voiceDesignPreviewItem.generatedVoiceId;
        }
        if ((i10 & 2) != 0) {
            str2 = voiceDesignPreviewItem.audioBase64;
        }
        if ((i10 & 4) != 0) {
            d10 = voiceDesignPreviewItem.durationSeconds;
        }
        return voiceDesignPreviewItem.copy(str, str2, d10);
    }

    public static final /* synthetic */ void write$Self$data_release(VoiceDesignPreviewItem self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.generatedVoiceId);
        output.V(serialDesc, 1, self.audioBase64);
        if (output.C(serialDesc) || self.durationSeconds != null) {
            output.o(serialDesc, 2, r.f34640a, self.durationSeconds);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getGeneratedVoiceId() {
        return this.generatedVoiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAudioBase64() {
        return this.audioBase64;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getDurationSeconds() {
        return this.durationSeconds;
    }

    public final VoiceDesignPreviewItem copy(String generatedVoiceId, String audioBase64, Double durationSeconds) {
        generatedVoiceId.getClass();
        audioBase64.getClass();
        return new VoiceDesignPreviewItem(generatedVoiceId, audioBase64, durationSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceDesignPreviewItem)) {
            return false;
        }
        VoiceDesignPreviewItem voiceDesignPreviewItem = (VoiceDesignPreviewItem) other;
        if (m.c(this.generatedVoiceId, voiceDesignPreviewItem.generatedVoiceId) && m.c(this.audioBase64, voiceDesignPreviewItem.audioBase64) && m.c(this.durationSeconds, voiceDesignPreviewItem.durationSeconds)) {
            return true;
        }
        return false;
    }

    public final String getAudioBase64() {
        return this.audioBase64;
    }

    public final Double getDurationSeconds() {
        return this.durationSeconds;
    }

    public final String getGeneratedVoiceId() {
        return this.generatedVoiceId;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(this.generatedVoiceId.hashCode() * 31, 31, this.audioBase64);
        Double d10 = this.durationSeconds;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        String str = this.generatedVoiceId;
        String str2 = this.audioBase64;
        Double d10 = this.durationSeconds;
        StringBuilder s10 = f.s("VoiceDesignPreviewItem(generatedVoiceId=", str, ", audioBase64=", str2, ", durationSeconds=");
        s10.append(d10);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/VoiceDesignPreviewItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/VoiceDesignPreviewItem;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return VoiceDesignPreviewItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAudioBase64$annotations() {
    }

    public static /* synthetic */ void getDurationSeconds$annotations() {
    }

    public static /* synthetic */ void getGeneratedVoiceId$annotations() {
    }

    public VoiceDesignPreviewItem(String str, String str2, Double d10) {
        str.getClass();
        str2.getClass();
        this.generatedVoiceId = str;
        this.audioBase64 = str2;
        this.durationSeconds = d10;
    }

    public /* synthetic */ VoiceDesignPreviewItem(String str, String str2, Double d10, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : d10);
    }
}

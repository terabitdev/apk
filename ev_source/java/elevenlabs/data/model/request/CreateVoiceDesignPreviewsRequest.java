package io.elevenlabs.data.model.request;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001a¨\u00060"}, d2 = {"Lio/elevenlabs/data/model/request/CreateVoiceDesignPreviewsRequest;", "", "", "voiceDescription", "", "loudness", "guidanceScale", "<init>", "(Ljava/lang/String;FF)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;FFLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/request/CreateVoiceDesignPreviewsRequest;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "copy", "(Ljava/lang/String;FF)Lio/elevenlabs/data/model/request/CreateVoiceDesignPreviewsRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoiceDescription", "getVoiceDescription$annotations", "()V", TokenNames.F, "getLoudness", "getLoudness$annotations", "getGuidanceScale", "getGuidanceScale$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class CreateVoiceDesignPreviewsRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float guidanceScale;
    private final float loudness;
    private final String voiceDescription;

    public /* synthetic */ CreateVoiceDesignPreviewsRequest(int i10, String str, float f10, float f11, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.voiceDescription = str;
            if ((i10 & 2) == 0) {
                this.loudness = 0.5f;
            } else {
                this.loudness = f10;
            }
            if ((i10 & 4) == 0) {
                this.guidanceScale = 5.0f;
                return;
            } else {
                this.guidanceScale = f11;
                return;
            }
        }
        t0.j(i10, 1, CreateVoiceDesignPreviewsRequest$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ CreateVoiceDesignPreviewsRequest copy$default(CreateVoiceDesignPreviewsRequest createVoiceDesignPreviewsRequest, String str, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createVoiceDesignPreviewsRequest.voiceDescription;
        }
        if ((i10 & 2) != 0) {
            f10 = createVoiceDesignPreviewsRequest.loudness;
        }
        if ((i10 & 4) != 0) {
            f11 = createVoiceDesignPreviewsRequest.guidanceScale;
        }
        return createVoiceDesignPreviewsRequest.copy(str, f10, f11);
    }

    public static final /* synthetic */ void write$Self$data_release(CreateVoiceDesignPreviewsRequest self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.voiceDescription);
        if (output.C(serialDesc) || Float.compare(self.loudness, 0.5f) != 0) {
            output.N(serialDesc, 1, self.loudness);
        }
        if (output.C(serialDesc) || Float.compare(self.guidanceScale, 5.0f) != 0) {
            output.N(serialDesc, 2, self.guidanceScale);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getVoiceDescription() {
        return this.voiceDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLoudness() {
        return this.loudness;
    }

    /* renamed from: component3, reason: from getter */
    public final float getGuidanceScale() {
        return this.guidanceScale;
    }

    public final CreateVoiceDesignPreviewsRequest copy(String voiceDescription, float loudness, float guidanceScale) {
        voiceDescription.getClass();
        return new CreateVoiceDesignPreviewsRequest(voiceDescription, loudness, guidanceScale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateVoiceDesignPreviewsRequest)) {
            return false;
        }
        CreateVoiceDesignPreviewsRequest createVoiceDesignPreviewsRequest = (CreateVoiceDesignPreviewsRequest) other;
        if (m.c(this.voiceDescription, createVoiceDesignPreviewsRequest.voiceDescription) && Float.compare(this.loudness, createVoiceDesignPreviewsRequest.loudness) == 0 && Float.compare(this.guidanceScale, createVoiceDesignPreviewsRequest.guidanceScale) == 0) {
            return true;
        }
        return false;
    }

    public final float getGuidanceScale() {
        return this.guidanceScale;
    }

    public final float getLoudness() {
        return this.loudness;
    }

    public final String getVoiceDescription() {
        return this.voiceDescription;
    }

    public int hashCode() {
        return Float.hashCode(this.guidanceScale) + com.google.android.gms.internal.play_billing.b.c(this.loudness, this.voiceDescription.hashCode() * 31, 31);
    }

    public String toString() {
        return "CreateVoiceDesignPreviewsRequest(voiceDescription=" + this.voiceDescription + ", loudness=" + this.loudness + ", guidanceScale=" + this.guidanceScale + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/CreateVoiceDesignPreviewsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/request/CreateVoiceDesignPreviewsRequest;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return CreateVoiceDesignPreviewsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getGuidanceScale$annotations() {
    }

    public static /* synthetic */ void getLoudness$annotations() {
    }

    public static /* synthetic */ void getVoiceDescription$annotations() {
    }

    public CreateVoiceDesignPreviewsRequest(String str, float f10, float f11) {
        str.getClass();
        this.voiceDescription = str;
        this.loudness = f10;
        this.guidanceScale = f11;
    }

    public /* synthetic */ CreateVoiceDesignPreviewsRequest(String str, float f10, float f11, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? 0.5f : f10, (i10 & 4) != 0 ? 5.0f : f11);
    }
}

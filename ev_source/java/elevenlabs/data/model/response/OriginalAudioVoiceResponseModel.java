package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.g1;
import ur.t0;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lio/elevenlabs/data/model/response/OriginalAudioVoiceResponseModel;", "", "", "voiceName", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/OriginalAudioVoiceResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/OriginalAudioVoiceResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoiceName", "getVoiceName$annotations", "()V", "getImageUrl", "getImageUrl$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class OriginalAudioVoiceResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String imageUrl;
    private final String voiceName;

    public /* synthetic */ OriginalAudioVoiceResponseModel(int i10, String str, String str2, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.voiceName = str;
            if ((i10 & 2) == 0) {
                this.imageUrl = null;
                return;
            } else {
                this.imageUrl = str2;
                return;
            }
        }
        t0.j(i10, 1, OriginalAudioVoiceResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ OriginalAudioVoiceResponseModel copy$default(OriginalAudioVoiceResponseModel originalAudioVoiceResponseModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = originalAudioVoiceResponseModel.voiceName;
        }
        if ((i10 & 2) != 0) {
            str2 = originalAudioVoiceResponseModel.imageUrl;
        }
        return originalAudioVoiceResponseModel.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$data_release(OriginalAudioVoiceResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.voiceName);
        if (output.C(serialDesc) || self.imageUrl != null) {
            output.o(serialDesc, 1, g1.f34588a, self.imageUrl);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getVoiceName() {
        return this.voiceName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final OriginalAudioVoiceResponseModel copy(String voiceName, String imageUrl) {
        voiceName.getClass();
        return new OriginalAudioVoiceResponseModel(voiceName, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OriginalAudioVoiceResponseModel)) {
            return false;
        }
        OriginalAudioVoiceResponseModel originalAudioVoiceResponseModel = (OriginalAudioVoiceResponseModel) other;
        if (m.c(this.voiceName, originalAudioVoiceResponseModel.voiceName) && m.c(this.imageUrl, originalAudioVoiceResponseModel.imageUrl)) {
            return true;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getVoiceName() {
        return this.voiceName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.voiceName.hashCode() * 31;
        String str = this.imageUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return h.c("OriginalAudioVoiceResponseModel(voiceName=", this.voiceName, ", imageUrl=", this.imageUrl, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/OriginalAudioVoiceResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/OriginalAudioVoiceResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return OriginalAudioVoiceResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getVoiceName$annotations() {
    }

    public OriginalAudioVoiceResponseModel(String str, String str2) {
        str.getClass();
        this.voiceName = str;
        this.imageUrl = str2;
    }

    public /* synthetic */ OriginalAudioVoiceResponseModel(String str, String str2, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}

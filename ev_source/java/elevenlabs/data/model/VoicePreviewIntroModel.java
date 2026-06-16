package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u0019¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/VoicePreviewIntroModel;", "", "", "previewUrl", "imageUrl", DiagnosticsEntry.NAME_KEY, "subtitle", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/VoicePreviewIntroModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/VoicePreviewIntroModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPreviewUrl", "getPreviewUrl$annotations", "()V", "getImageUrl", "getImageUrl$annotations", "getName", "getName$annotations", "getSubtitle", "getSubtitle$annotations", "getMetadata", "getMetadata$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class VoicePreviewIntroModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String imageUrl;
    private final String metadata;
    private final String name;
    private final String previewUrl;
    private final String subtitle;

    public /* synthetic */ VoicePreviewIntroModel(int i10, String str, String str2, String str3, String str4, String str5, c1 c1Var) {
        if (31 == (i10 & 31)) {
            this.previewUrl = str;
            this.imageUrl = str2;
            this.name = str3;
            this.subtitle = str4;
            this.metadata = str5;
            return;
        }
        t0.j(i10, 31, VoicePreviewIntroModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ VoicePreviewIntroModel copy$default(VoicePreviewIntroModel voicePreviewIntroModel, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voicePreviewIntroModel.previewUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = voicePreviewIntroModel.imageUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = voicePreviewIntroModel.name;
        }
        if ((i10 & 8) != 0) {
            str4 = voicePreviewIntroModel.subtitle;
        }
        if ((i10 & 16) != 0) {
            str5 = voicePreviewIntroModel.metadata;
        }
        String str6 = str5;
        String str7 = str3;
        return voicePreviewIntroModel.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$data_release(VoicePreviewIntroModel self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.previewUrl);
        output.V(serialDesc, 1, self.imageUrl);
        output.V(serialDesc, 2, self.name);
        output.V(serialDesc, 3, self.subtitle);
        output.V(serialDesc, 4, self.metadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    public final VoicePreviewIntroModel copy(String previewUrl, String imageUrl, String name, String subtitle, String metadata) {
        previewUrl.getClass();
        imageUrl.getClass();
        name.getClass();
        subtitle.getClass();
        metadata.getClass();
        return new VoicePreviewIntroModel(previewUrl, imageUrl, name, subtitle, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoicePreviewIntroModel)) {
            return false;
        }
        VoicePreviewIntroModel voicePreviewIntroModel = (VoicePreviewIntroModel) other;
        if (m.c(this.previewUrl, voicePreviewIntroModel.previewUrl) && m.c(this.imageUrl, voicePreviewIntroModel.imageUrl) && m.c(this.name, voicePreviewIntroModel.name) && m.c(this.subtitle, voicePreviewIntroModel.subtitle) && m.c(this.metadata, voicePreviewIntroModel.metadata)) {
            return true;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return this.metadata.hashCode() + c.c(c.c(c.c(this.previewUrl.hashCode() * 31, 31, this.imageUrl), 31, this.name), 31, this.subtitle);
    }

    public String toString() {
        String str = this.previewUrl;
        String str2 = this.imageUrl;
        String str3 = this.name;
        String str4 = this.subtitle;
        String str5 = this.metadata;
        StringBuilder s10 = f.s("VoicePreviewIntroModel(previewUrl=", str, ", imageUrl=", str2, ", name=");
        f.x(s10, str3, ", subtitle=", str4, ", metadata=");
        return f.l(str5, Separators.RPAREN, s10);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/VoicePreviewIntroModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/VoicePreviewIntroModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return VoicePreviewIntroModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getPreviewUrl$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public VoicePreviewIntroModel(String str, String str2, String str3, String str4, String str5) {
        c.v(str, str2, str3, str4, str5);
        this.previewUrl = str;
        this.imageUrl = str2;
        this.name = str3;
        this.subtitle = str4;
        this.metadata = str5;
    }
}

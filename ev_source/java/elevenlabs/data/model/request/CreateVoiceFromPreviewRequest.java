package io.elevenlabs.data.model.request;

import a2.m;
import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.a;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.g1;
import ur.h0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBO\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001d¨\u00064"}, d2 = {"Lio/elevenlabs/data/model/request/CreateVoiceFromPreviewRequest;", "", "", "generatedVoiceId", "voiceName", "voiceDescription", "", "labels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/request/CreateVoiceFromPreviewRequest;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/elevenlabs/data/model/request/CreateVoiceFromPreviewRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGeneratedVoiceId", "getGeneratedVoiceId$annotations", "()V", "getVoiceName", "getVoiceName$annotations", "getVoiceDescription", "getVoiceDescription$annotations", "Ljava/util/Map;", "getLabels", "getLabels$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class CreateVoiceFromPreviewRequest {
    private final String generatedVoiceId;
    private final Map<String, String> labels;
    private final String voiceDescription;
    private final String voiceName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, a.d(i.f31597b, new m(11))};

    public /* synthetic */ CreateVoiceFromPreviewRequest(int i10, String str, String str2, String str3, Map map, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.generatedVoiceId = str;
            this.voiceName = str2;
            this.voiceDescription = str3;
            if ((i10 & 8) == 0) {
                this.labels = null;
                return;
            } else {
                this.labels = map;
                return;
            }
        }
        t0.j(i10, 7, CreateVoiceFromPreviewRequest$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        g1 g1Var = g1.f34588a;
        return new h0(g1Var, g1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateVoiceFromPreviewRequest copy$default(CreateVoiceFromPreviewRequest createVoiceFromPreviewRequest, String str, String str2, String str3, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createVoiceFromPreviewRequest.generatedVoiceId;
        }
        if ((i10 & 2) != 0) {
            str2 = createVoiceFromPreviewRequest.voiceName;
        }
        if ((i10 & 4) != 0) {
            str3 = createVoiceFromPreviewRequest.voiceDescription;
        }
        if ((i10 & 8) != 0) {
            map = createVoiceFromPreviewRequest.labels;
        }
        return createVoiceFromPreviewRequest.copy(str, str2, str3, map);
    }

    public static final /* synthetic */ void write$Self$data_release(CreateVoiceFromPreviewRequest self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.generatedVoiceId);
        output.V(serialDesc, 1, self.voiceName);
        output.V(serialDesc, 2, self.voiceDescription);
        if (output.C(serialDesc) || self.labels != null) {
            output.o(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.labels);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getGeneratedVoiceId() {
        return this.generatedVoiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVoiceName() {
        return this.voiceName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVoiceDescription() {
        return this.voiceDescription;
    }

    public final Map<String, String> component4() {
        return this.labels;
    }

    public final CreateVoiceFromPreviewRequest copy(String generatedVoiceId, String voiceName, String voiceDescription, Map<String, String> labels) {
        generatedVoiceId.getClass();
        voiceName.getClass();
        voiceDescription.getClass();
        return new CreateVoiceFromPreviewRequest(generatedVoiceId, voiceName, voiceDescription, labels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateVoiceFromPreviewRequest)) {
            return false;
        }
        CreateVoiceFromPreviewRequest createVoiceFromPreviewRequest = (CreateVoiceFromPreviewRequest) other;
        if (kotlin.jvm.internal.m.c(this.generatedVoiceId, createVoiceFromPreviewRequest.generatedVoiceId) && kotlin.jvm.internal.m.c(this.voiceName, createVoiceFromPreviewRequest.voiceName) && kotlin.jvm.internal.m.c(this.voiceDescription, createVoiceFromPreviewRequest.voiceDescription) && kotlin.jvm.internal.m.c(this.labels, createVoiceFromPreviewRequest.labels)) {
            return true;
        }
        return false;
    }

    public final String getGeneratedVoiceId() {
        return this.generatedVoiceId;
    }

    public final Map<String, String> getLabels() {
        return this.labels;
    }

    public final String getVoiceDescription() {
        return this.voiceDescription;
    }

    public final String getVoiceName() {
        return this.voiceName;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(c.c(this.generatedVoiceId.hashCode() * 31, 31, this.voiceName), 31, this.voiceDescription);
        Map<String, String> map = this.labels;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        String str = this.generatedVoiceId;
        String str2 = this.voiceName;
        String str3 = this.voiceDescription;
        Map<String, String> map = this.labels;
        StringBuilder s10 = f.s("CreateVoiceFromPreviewRequest(generatedVoiceId=", str, ", voiceName=", str2, ", voiceDescription=");
        s10.append(str3);
        s10.append(", labels=");
        s10.append(map);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/CreateVoiceFromPreviewRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/request/CreateVoiceFromPreviewRequest;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return CreateVoiceFromPreviewRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getGeneratedVoiceId$annotations() {
    }

    public static /* synthetic */ void getLabels$annotations() {
    }

    public static /* synthetic */ void getVoiceDescription$annotations() {
    }

    public static /* synthetic */ void getVoiceName$annotations() {
    }

    public CreateVoiceFromPreviewRequest(String str, String str2, String str3, Map<String, String> map) {
        ib.i.s(str, str2, str3);
        this.generatedVoiceId = str;
        this.voiceName = str2;
        this.voiceDescription = str3;
        this.labels = map;
    }

    public /* synthetic */ CreateVoiceFromPreviewRequest(String str, String str2, String str3, Map map, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : map);
    }
}

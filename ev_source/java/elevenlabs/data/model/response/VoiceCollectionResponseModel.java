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
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J<\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0018¨\u00061"}, d2 = {"Lio/elevenlabs/data/model/response/VoiceCollectionResponseModel;", "", "", "id", "title", "backgroundColor", "coverImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/VoiceCollectionResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/VoiceCollectionResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "getCoverImageUrl", "getCoverImageUrl$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class VoiceCollectionResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String backgroundColor;
    private final String coverImageUrl;
    private final String id;
    private final String title;

    public /* synthetic */ VoiceCollectionResponseModel(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.id = str;
            this.title = str2;
            if ((i10 & 4) == 0) {
                this.backgroundColor = null;
            } else {
                this.backgroundColor = str3;
            }
            if ((i10 & 8) == 0) {
                this.coverImageUrl = null;
                return;
            } else {
                this.coverImageUrl = str4;
                return;
            }
        }
        t0.j(i10, 3, VoiceCollectionResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ VoiceCollectionResponseModel copy$default(VoiceCollectionResponseModel voiceCollectionResponseModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voiceCollectionResponseModel.id;
        }
        if ((i10 & 2) != 0) {
            str2 = voiceCollectionResponseModel.title;
        }
        if ((i10 & 4) != 0) {
            str3 = voiceCollectionResponseModel.backgroundColor;
        }
        if ((i10 & 8) != 0) {
            str4 = voiceCollectionResponseModel.coverImageUrl;
        }
        return voiceCollectionResponseModel.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$data_release(VoiceCollectionResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.id);
        output.V(serialDesc, 1, self.title);
        if (output.C(serialDesc) || self.backgroundColor != null) {
            output.o(serialDesc, 2, g1.f34588a, self.backgroundColor);
        }
        if (output.C(serialDesc) || self.coverImageUrl != null) {
            output.o(serialDesc, 3, g1.f34588a, self.coverImageUrl);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    public final VoiceCollectionResponseModel copy(String id2, String title, String backgroundColor, String coverImageUrl) {
        id2.getClass();
        title.getClass();
        return new VoiceCollectionResponseModel(id2, title, backgroundColor, coverImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceCollectionResponseModel)) {
            return false;
        }
        VoiceCollectionResponseModel voiceCollectionResponseModel = (VoiceCollectionResponseModel) other;
        if (m.c(this.id, voiceCollectionResponseModel.id) && m.c(this.title, voiceCollectionResponseModel.title) && m.c(this.backgroundColor, voiceCollectionResponseModel.backgroundColor) && m.c(this.coverImageUrl, voiceCollectionResponseModel.coverImageUrl)) {
            return true;
        }
        return false;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.backgroundColor;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.coverImageUrl;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        return f.n(f.s("VoiceCollectionResponseModel(id=", str, ", title=", str2, ", backgroundColor="), this.backgroundColor, ", coverImageUrl=", this.coverImageUrl, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/VoiceCollectionResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/VoiceCollectionResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return VoiceCollectionResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getCoverImageUrl$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public VoiceCollectionResponseModel(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.backgroundColor = str3;
        this.coverImageUrl = str4;
    }

    public /* synthetic */ VoiceCollectionResponseModel(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}

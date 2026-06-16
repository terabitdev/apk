package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import ib.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\u001eR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001e¨\u00068"}, d2 = {"Lio/elevenlabs/data/model/response/PronunciationResponse;", "", "", "id", "originalText", "spokenText", "", "createdAtUnix", "updatedAtUnix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/PronunciationResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/elevenlabs/data/model/response/PronunciationResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getOriginalText", "getOriginalText$annotations", "getSpokenText", "getSpokenText$annotations", "J", "getCreatedAtUnix", "getCreatedAtUnix$annotations", "getUpdatedAtUnix", "getUpdatedAtUnix$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class PronunciationResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long createdAtUnix;
    private final String id;
    private final String originalText;
    private final String spokenText;
    private final long updatedAtUnix;

    public /* synthetic */ PronunciationResponse(int i10, String str, String str2, String str3, long j4, long j10, c1 c1Var) {
        if (31 == (i10 & 31)) {
            this.id = str;
            this.originalText = str2;
            this.spokenText = str3;
            this.createdAtUnix = j4;
            this.updatedAtUnix = j10;
            return;
        }
        t0.j(i10, 31, PronunciationResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ PronunciationResponse copy$default(PronunciationResponse pronunciationResponse, String str, String str2, String str3, long j4, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pronunciationResponse.id;
        }
        if ((i10 & 2) != 0) {
            str2 = pronunciationResponse.originalText;
        }
        if ((i10 & 4) != 0) {
            str3 = pronunciationResponse.spokenText;
        }
        if ((i10 & 8) != 0) {
            j4 = pronunciationResponse.createdAtUnix;
        }
        if ((i10 & 16) != 0) {
            j10 = pronunciationResponse.updatedAtUnix;
        }
        long j11 = j10;
        String str4 = str3;
        return pronunciationResponse.copy(str, str2, str4, j4, j11);
    }

    public static final /* synthetic */ void write$Self$data_release(PronunciationResponse self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.id);
        output.V(serialDesc, 1, self.originalText);
        output.V(serialDesc, 2, self.spokenText);
        output.h0(serialDesc, 3, self.createdAtUnix);
        output.h0(serialDesc, 4, self.updatedAtUnix);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginalText() {
        return this.originalText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSpokenText() {
        return this.spokenText;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public final PronunciationResponse copy(String id2, String originalText, String spokenText, long createdAtUnix, long updatedAtUnix) {
        id2.getClass();
        originalText.getClass();
        spokenText.getClass();
        return new PronunciationResponse(id2, originalText, spokenText, createdAtUnix, updatedAtUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PronunciationResponse)) {
            return false;
        }
        PronunciationResponse pronunciationResponse = (PronunciationResponse) other;
        if (m.c(this.id, pronunciationResponse.id) && m.c(this.originalText, pronunciationResponse.originalText) && m.c(this.spokenText, pronunciationResponse.spokenText) && this.createdAtUnix == pronunciationResponse.createdAtUnix && this.updatedAtUnix == pronunciationResponse.updatedAtUnix) {
            return true;
        }
        return false;
    }

    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOriginalText() {
        return this.originalText;
    }

    public final String getSpokenText() {
        return this.spokenText;
    }

    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public int hashCode() {
        return Long.hashCode(this.updatedAtUnix) + com.google.android.gms.internal.play_billing.b.g(this.createdAtUnix, j0.c.c(j0.c.c(this.id.hashCode() * 31, 31, this.originalText), 31, this.spokenText), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.originalText;
        String str3 = this.spokenText;
        long j4 = this.createdAtUnix;
        long j10 = this.updatedAtUnix;
        StringBuilder s10 = f.s("PronunciationResponse(id=", str, ", originalText=", str2, ", spokenText=");
        s10.append(str3);
        s10.append(", createdAtUnix=");
        s10.append(j4);
        s10.append(", updatedAtUnix=");
        s10.append(j10);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/PronunciationResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/PronunciationResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return PronunciationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCreatedAtUnix$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getOriginalText$annotations() {
    }

    public static /* synthetic */ void getSpokenText$annotations() {
    }

    public static /* synthetic */ void getUpdatedAtUnix$annotations() {
    }

    public PronunciationResponse(String str, String str2, String str3, long j4, long j10) {
        i.s(str, str2, str3);
        this.id = str;
        this.originalText = str2;
        this.spokenText = str3;
        this.createdAtUnix = j4;
        this.updatedAtUnix = j10;
    }
}

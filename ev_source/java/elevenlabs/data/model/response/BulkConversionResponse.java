package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001c¨\u00060"}, d2 = {"Lio/elevenlabs/data/model/response/BulkConversionResponse;", "", "", "readId", "voiceId", "", "Lio/elevenlabs/data/model/response/ChapterConversionResult;", "chapters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/BulkConversionResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/BulkConversionResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReadId", "getReadId$annotations", "()V", "getVoiceId", "getVoiceId$annotations", "Ljava/util/List;", "getChapters", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BulkConversionResponse {
    private final List<ChapterConversionResult> chapters;
    private final String readId;
    private final String voiceId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new io.elevenlabs.data.model.a(19))};

    public /* synthetic */ BulkConversionResponse(int i10, String str, String str2, List list, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.readId = str;
            this.voiceId = str2;
            this.chapters = list;
            return;
        }
        t0.j(i10, 7, BulkConversionResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(ChapterConversionResult$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulkConversionResponse copy$default(BulkConversionResponse bulkConversionResponse, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bulkConversionResponse.readId;
        }
        if ((i10 & 2) != 0) {
            str2 = bulkConversionResponse.voiceId;
        }
        if ((i10 & 4) != 0) {
            list = bulkConversionResponse.chapters;
        }
        return bulkConversionResponse.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$data_release(BulkConversionResponse self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.readId);
        output.V(serialDesc, 1, self.voiceId);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.chapters);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    public final List<ChapterConversionResult> component3() {
        return this.chapters;
    }

    public final BulkConversionResponse copy(String readId, String voiceId, List<ChapterConversionResult> chapters) {
        readId.getClass();
        voiceId.getClass();
        chapters.getClass();
        return new BulkConversionResponse(readId, voiceId, chapters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulkConversionResponse)) {
            return false;
        }
        BulkConversionResponse bulkConversionResponse = (BulkConversionResponse) other;
        if (m.c(this.readId, bulkConversionResponse.readId) && m.c(this.voiceId, bulkConversionResponse.voiceId) && m.c(this.chapters, bulkConversionResponse.chapters)) {
            return true;
        }
        return false;
    }

    public final List<ChapterConversionResult> getChapters() {
        return this.chapters;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        return this.chapters.hashCode() + j0.c.c(this.readId.hashCode() * 31, 31, this.voiceId);
    }

    public String toString() {
        String str = this.readId;
        String str2 = this.voiceId;
        return z.h.e(f.s("BulkConversionResponse(readId=", str, ", voiceId=", str2, ", chapters="), this.chapters, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/BulkConversionResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/BulkConversionResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BulkConversionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getReadId$annotations() {
    }

    public static /* synthetic */ void getVoiceId$annotations() {
    }

    public BulkConversionResponse(String str, String str2, List<ChapterConversionResult> list) {
        j0.c.w(str, str2, list);
        this.readId = str;
        this.voiceId = str2;
        this.chapters = list;
    }
}

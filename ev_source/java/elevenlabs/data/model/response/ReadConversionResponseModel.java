package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.model.BigDecimalJson;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0003AB@B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u0014R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0017R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\b:\u00102\u001a\u0004\b9\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010\u0014R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010\u001c¨\u0006C"}, d2 = {"Lio/elevenlabs/data/model/response/ReadConversionResponseModel;", "", "", "readId", "voiceId", "Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status;", "status", "Lio/elevenlabs/data/model/BigDecimalJson;", "progress", "message", "", "chapterIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status;Lio/elevenlabs/data/model/BigDecimalJson;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status;Lio/elevenlabs/data/model/BigDecimalJson;Ljava/lang/String;Ljava/lang/Long;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status;", "component4", "()Lio/elevenlabs/data/model/BigDecimalJson;", "component5", "component6", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status;Lio/elevenlabs/data/model/BigDecimalJson;Ljava/lang/String;Ljava/lang/Long;)Lio/elevenlabs/data/model/response/ReadConversionResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReadConversionResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getReadId", "getReadId$annotations", "()V", "getVoiceId", "getVoiceId$annotations", "Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status;", "getStatus", "getStatus$annotations", "Lio/elevenlabs/data/model/BigDecimalJson;", "getProgress", "getProgress$annotations", "getMessage", "getMessage$annotations", "Ljava/lang/Long;", "getChapterIndex", "getChapterIndex$annotations", "Companion", "Status", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadConversionResponseModel {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long chapterIndex;
    private final String message;
    private final BigDecimalJson progress;
    private final String readId;
    private final Status status;
    private final String voiceId;

    static {
        c cVar = new c(4);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, null, sn.a.d(iVar, cVar), sn.a.d(iVar, new c(5)), null, null};
    }

    public /* synthetic */ ReadConversionResponseModel(int i10, String str, String str2, Status status, BigDecimalJson bigDecimalJson, String str3, Long l4, c1 c1Var) {
        if (31 == (i10 & 31)) {
            this.readId = str;
            this.voiceId = str2;
            this.status = status;
            this.progress = bigDecimalJson;
            this.message = str3;
            if ((i10 & 32) == 0) {
                this.chapterIndex = null;
                return;
            } else {
                this.chapterIndex = l4;
                return;
            }
        }
        t0.j(i10, 31, ReadConversionResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Status.INSTANCE.serializer();
    }

    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), BigDecimalJson.INSTANCE.serializer(), new KSerializer[0]);
    }

    public static /* synthetic */ ReadConversionResponseModel copy$default(ReadConversionResponseModel readConversionResponseModel, String str, String str2, Status status, BigDecimalJson bigDecimalJson, String str3, Long l4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readConversionResponseModel.readId;
        }
        if ((i10 & 2) != 0) {
            str2 = readConversionResponseModel.voiceId;
        }
        if ((i10 & 4) != 0) {
            status = readConversionResponseModel.status;
        }
        if ((i10 & 8) != 0) {
            bigDecimalJson = readConversionResponseModel.progress;
        }
        if ((i10 & 16) != 0) {
            str3 = readConversionResponseModel.message;
        }
        if ((i10 & 32) != 0) {
            l4 = readConversionResponseModel.chapterIndex;
        }
        String str4 = str3;
        Long l7 = l4;
        return readConversionResponseModel.copy(str, str2, status, bigDecimalJson, str4, l7);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadConversionResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.readId);
        output.V(serialDesc, 1, self.voiceId);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.status);
        output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.progress);
        output.o(serialDesc, 4, g1.f34588a, self.message);
        if (output.C(serialDesc) || self.chapterIndex != null) {
            output.o(serialDesc, 5, l0.f34611a, self.chapterIndex);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component3, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimalJson getProgress() {
        return this.progress;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getChapterIndex() {
        return this.chapterIndex;
    }

    public final ReadConversionResponseModel copy(String readId, String voiceId, Status status, BigDecimalJson progress, String message, Long chapterIndex) {
        readId.getClass();
        voiceId.getClass();
        status.getClass();
        progress.getClass();
        return new ReadConversionResponseModel(readId, voiceId, status, progress, message, chapterIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadConversionResponseModel)) {
            return false;
        }
        ReadConversionResponseModel readConversionResponseModel = (ReadConversionResponseModel) other;
        if (m.c(this.readId, readConversionResponseModel.readId) && m.c(this.voiceId, readConversionResponseModel.voiceId) && this.status == readConversionResponseModel.status && m.c(this.progress, readConversionResponseModel.progress) && m.c(this.message, readConversionResponseModel.message) && m.c(this.chapterIndex, readConversionResponseModel.chapterIndex)) {
            return true;
        }
        return false;
    }

    public final Long getChapterIndex() {
        return this.chapterIndex;
    }

    public final String getMessage() {
        return this.message;
    }

    public final BigDecimalJson getProgress() {
        return this.progress;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.progress.hashCode() + ((this.status.hashCode() + j0.c.c(this.readId.hashCode() * 31, 31, this.voiceId)) * 31)) * 31;
        String str = this.message;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        Long l4 = this.chapterIndex;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.readId;
        String str2 = this.voiceId;
        Status status = this.status;
        BigDecimalJson bigDecimalJson = this.progress;
        String str3 = this.message;
        Long l4 = this.chapterIndex;
        StringBuilder s10 = f.s("ReadConversionResponseModel(readId=", str, ", voiceId=", str2, ", status=");
        s10.append(status);
        s10.append(", progress=");
        s10.append(bigDecimalJson);
        s10.append(", message=");
        s10.append(str3);
        s10.append(", chapterIndex=");
        s10.append(l4);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PENDING", "CONVERTING", "FINISHED", "FAILED", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class Status extends Enum<Status> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final Status PENDING = new Status("PENDING", 0, "pending");
        public static final Status CONVERTING = new Status("CONVERTING", 1, "converting");
        public static final Status FINISHED = new Status("FINISHED", 2, "finished");
        public static final Status FAILED = new Status("FAILED", 3, "failed");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, CONVERTING, FINISHED, FAILED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = sn.a.d(i.f31597b, new c(6));
        }

        private Status(String str, int i10, String str2) {
            super(str, i10);
            this.value = str2;
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.response.ReadConversionResponseModel.Status", values(), new String[]{"pending", "converting", "finished", "failed"}, new Annotation[][]{null, null, null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Status;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Status.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReadConversionResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReadConversionResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadConversionResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getChapterIndex$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public static /* synthetic */ void getReadId$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static /* synthetic */ void getVoiceId$annotations() {
    }

    public ReadConversionResponseModel(String str, String str2, Status status, BigDecimalJson bigDecimalJson, String str3, Long l4) {
        str.getClass();
        str2.getClass();
        status.getClass();
        bigDecimalJson.getClass();
        this.readId = str;
        this.voiceId = str2;
        this.status = status;
        this.progress = bigDecimalJson;
        this.message = str3;
        this.chapterIndex = l4;
    }

    public /* synthetic */ ReadConversionResponseModel(String str, String str2, Status status, BigDecimalJson bigDecimalJson, String str3, Long l4, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, status, bigDecimalJson, str3, (i10 & 32) != 0 ? null : l4);
    }
}

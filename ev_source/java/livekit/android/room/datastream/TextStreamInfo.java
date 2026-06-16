package io.livekit.android.room.datastream;

import android.gov.nist.javax.sip.parser.TokenNames;
import as.f7;
import as.l7;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.FirebasePerformance;
import com.google.protobuf.c6;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$DataStream;
import p.n;
import rd.c1;
import tn.a0;
import tn.t;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0001LBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0094\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001dJ\u0010\u00103\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b3\u0010(J\u001a\u00106\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\"R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bE\u0010\u001dR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010+R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010-R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010/¨\u0006M"}, d2 = {"Lio/livekit/android/room/datastream/TextStreamInfo;", "Lio/livekit/android/room/datastream/StreamInfo;", "", "id", "topic", "", "timestampMs", "totalSize", "", "attributes", "Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;", "operationType", "", "version", "replyToStreamId", "", "attachedStreamIds", "", "generated", "Las/l7;", "encryptionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;ILjava/lang/String;Ljava/util/List;ZLas/l7;)V", "Llivekit/LivekitModels$DataStream$Header;", "header", "Llivekit/LivekitModels$DataStream$TextHeader;", "textHeader", "(Llivekit/LivekitModels$DataStream$Header;Llivekit/LivekitModels$DataStream$TextHeader;Las/l7;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/util/Map;", "component6", "()Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;", "component7", "()I", "component8", "component9", "()Ljava/util/List;", "component10", "()Z", "component11", "()Las/l7;", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;ILjava/lang/String;Ljava/util/List;ZLas/l7;)Lio/livekit/android/room/datastream/TextStreamInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTopic", "J", "getTimestampMs", "Ljava/lang/Long;", "getTotalSize", "Ljava/util/Map;", "getAttributes", "Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;", "getOperationType", TokenNames.I, "getVersion", "getReplyToStreamId", "Ljava/util/List;", "getAttachedStreamIds", "Z", "getGenerated", "Las/l7;", "getEncryptionType", "OperationType", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class TextStreamInfo extends StreamInfo {
    private final List<String> attachedStreamIds;
    private final Map<String, String> attributes;
    private final l7 encryptionType;
    private final boolean generated;
    private final String id;
    private final OperationType operationType;
    private final String replyToStreamId;
    private final long timestampMs;
    private final String topic;
    private final Long totalSize;
    private final int version;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextStreamInfo(LivekitModels$DataStream.Header header, LivekitModels$DataStream.TextHeader textHeader, l7 l7Var) {
        this(r1, r2, r3, r0, r6, r7, r8, r9, r14 == null ? t.f33547a : r14, textHeader.getGenerated(), l7Var);
        Long l4;
        header.getClass();
        textHeader.getClass();
        l7Var.getClass();
        String streamId = header.getStreamId();
        streamId.getClass();
        String topic = header.getTopic();
        topic.getClass();
        long timestamp = header.getTimestamp();
        String str = null;
        if (header.hasTotalLength()) {
            l4 = Long.valueOf(header.getTotalLength());
        } else {
            l4 = null;
        }
        Map<String, String> attributesMap = header.getAttributesMap();
        attributesMap.getClass();
        Map S = a0.S(attributesMap);
        OperationType.Companion companion = OperationType.INSTANCE;
        f7 operationType = textHeader.getOperationType();
        operationType.getClass();
        OperationType fromProto = companion.fromProto(operationType);
        int version = textHeader.getVersion();
        String replyToStreamId = textHeader.getReplyToStreamId();
        if (replyToStreamId != null && replyToStreamId.length() != 0) {
            str = textHeader.getReplyToStreamId();
        }
        String str2 = str;
        List<String> attachedStreamIdsList = textHeader.getAttachedStreamIdsList();
    }

    public static /* synthetic */ TextStreamInfo copy$default(TextStreamInfo textStreamInfo, String str, String str2, long j4, Long l4, Map map, OperationType operationType, int i10, String str3, List list, boolean z6, l7 l7Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textStreamInfo.id;
        }
        if ((i11 & 2) != 0) {
            str2 = textStreamInfo.topic;
        }
        if ((i11 & 4) != 0) {
            j4 = textStreamInfo.timestampMs;
        }
        if ((i11 & 8) != 0) {
            l4 = textStreamInfo.totalSize;
        }
        if ((i11 & 16) != 0) {
            map = textStreamInfo.attributes;
        }
        if ((i11 & 32) != 0) {
            operationType = textStreamInfo.operationType;
        }
        if ((i11 & 64) != 0) {
            i10 = textStreamInfo.version;
        }
        if ((i11 & 128) != 0) {
            str3 = textStreamInfo.replyToStreamId;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            list = textStreamInfo.attachedStreamIds;
        }
        if ((i11 & 512) != 0) {
            z6 = textStreamInfo.generated;
        }
        if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            l7Var = textStreamInfo.encryptionType;
        }
        boolean z10 = z6;
        l7 l7Var2 = l7Var;
        String str4 = str3;
        List list2 = list;
        long j10 = j4;
        return textStreamInfo.copy(str, str2, j10, l4, map, operationType, i10, str4, list2, z10, l7Var2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getGenerated() {
        return this.generated;
    }

    /* renamed from: component11, reason: from getter */
    public final l7 getEncryptionType() {
        return this.encryptionType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getTotalSize() {
        return this.totalSize;
    }

    public final Map<String, String> component5() {
        return this.attributes;
    }

    /* renamed from: component6, reason: from getter */
    public final OperationType getOperationType() {
        return this.operationType;
    }

    /* renamed from: component7, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component8, reason: from getter */
    public final String getReplyToStreamId() {
        return this.replyToStreamId;
    }

    public final List<String> component9() {
        return this.attachedStreamIds;
    }

    public final TextStreamInfo copy(String id2, String topic, long timestampMs, Long totalSize, Map<String, String> attributes, OperationType operationType, int version, String replyToStreamId, List<String> attachedStreamIds, boolean generated, l7 encryptionType) {
        id2.getClass();
        topic.getClass();
        attributes.getClass();
        operationType.getClass();
        attachedStreamIds.getClass();
        encryptionType.getClass();
        return new TextStreamInfo(id2, topic, timestampMs, totalSize, attributes, operationType, version, replyToStreamId, attachedStreamIds, generated, encryptionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStreamInfo)) {
            return false;
        }
        TextStreamInfo textStreamInfo = (TextStreamInfo) other;
        if (m.c(this.id, textStreamInfo.id) && m.c(this.topic, textStreamInfo.topic) && this.timestampMs == textStreamInfo.timestampMs && m.c(this.totalSize, textStreamInfo.totalSize) && m.c(this.attributes, textStreamInfo.attributes) && this.operationType == textStreamInfo.operationType && this.version == textStreamInfo.version && m.c(this.replyToStreamId, textStreamInfo.replyToStreamId) && m.c(this.attachedStreamIds, textStreamInfo.attachedStreamIds) && this.generated == textStreamInfo.generated && this.encryptionType == textStreamInfo.encryptionType) {
            return true;
        }
        return false;
    }

    public final List<String> getAttachedStreamIds() {
        return this.attachedStreamIds;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public l7 getEncryptionType() {
        return this.encryptionType;
    }

    public final boolean getGenerated() {
        return this.generated;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public String getId() {
        return this.id;
    }

    public final OperationType getOperationType() {
        return this.operationType;
    }

    public final String getReplyToStreamId() {
        return this.replyToStreamId;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public long getTimestampMs() {
        return this.timestampMs;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public String getTopic() {
        return this.topic;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public Long getTotalSize() {
        return this.totalSize;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int g10 = b.g(this.timestampMs, c.c(this.id.hashCode() * 31, 31, this.topic), 31);
        Long l4 = this.totalSize;
        int i10 = 0;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        int b10 = c.b(this.version, (this.operationType.hashCode() + f.a(this.attributes, (g10 + hashCode) * 31, 31)) * 31, 31);
        String str = this.replyToStreamId;
        if (str != null) {
            i10 = str.hashCode();
        }
        return this.encryptionType.hashCode() + b.f(n.d((b10 + i10) * 31, 31, this.attachedStreamIds), 31, this.generated);
    }

    public String toString() {
        return "TextStreamInfo(id=" + this.id + ", topic=" + this.topic + ", timestampMs=" + this.timestampMs + ", totalSize=" + this.totalSize + ", attributes=" + this.attributes + ", operationType=" + this.operationType + ", version=" + this.version + ", replyToStreamId=" + this.replyToStreamId + ", attachedStreamIds=" + this.attachedStreamIds + ", generated=" + this.generated + ", encryptionType=" + this.encryptionType + ')';
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;", "", "<init>", "(Ljava/lang/String;I)V", "Las/f7;", "toProto", "()Las/f7;", "Companion", "CREATE", "UPDATE", FirebasePerformance.HttpMethod.DELETE, "REACTION", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class OperationType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OperationType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OperationType CREATE = new OperationType("CREATE", 0);
        public static final OperationType UPDATE = new OperationType("UPDATE", 1);
        public static final OperationType DELETE = new OperationType(FirebasePerformance.HttpMethod.DELETE, 2);
        public static final OperationType REACTION = new OperationType("REACTION", 3);

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OperationType.values().length];
                try {
                    iArr[OperationType.CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OperationType.UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OperationType.DELETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OperationType.REACTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ OperationType[] $values() {
            return new OperationType[]{CREATE, UPDATE, DELETE, REACTION};
        }

        static {
            OperationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
            INSTANCE = new Companion(null);
        }

        private OperationType(String str, int i10) {
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static OperationType valueOf(String str) {
            return (OperationType) Enum.valueOf(OperationType.class, str);
        }

        public static OperationType[] values() {
            return (OperationType[]) $VALUES.clone();
        }

        public final f7 toProto() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return f7.REACTION;
                        }
                        c6.p();
                        return null;
                    }
                    return f7.DELETE;
                }
                return f7.UPDATE;
            }
            return f7.CREATE;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/room/datastream/TextStreamInfo$OperationType$Companion;", "", "<init>", "()V", "Las/f7;", "operationType", "Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;", "fromProto", "(Las/f7;)Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[f7.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[4] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final OperationType fromProto(f7 operationType) {
                operationType.getClass();
                int ordinal = operationType.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    c6.p();
                                    return null;
                                }
                                c6.t("Unrecognized operation type!");
                                return null;
                            }
                            return OperationType.REACTION;
                        }
                        return OperationType.DELETE;
                    }
                    return OperationType.UPDATE;
                }
                return OperationType.CREATE;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStreamInfo(String str, String str2, long j4, Long l4, Map<String, String> map, OperationType operationType, int i10, String str3, List<String> list, boolean z6, l7 l7Var) {
        super(str, str2, j4, l4, map, l7Var, null);
        str.getClass();
        str2.getClass();
        map.getClass();
        operationType.getClass();
        list.getClass();
        l7Var.getClass();
        this.id = str;
        this.topic = str2;
        this.timestampMs = j4;
        this.totalSize = l4;
        this.attributes = map;
        this.operationType = operationType;
        this.version = i10;
        this.replyToStreamId = str3;
        this.attachedStreamIds = list;
        this.generated = z6;
        this.encryptionType = l7Var;
    }
}

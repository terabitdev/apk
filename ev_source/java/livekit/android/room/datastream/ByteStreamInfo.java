package io.livekit.android.room.datastream;

import as.l7;
import com.google.android.gms.internal.play_billing.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import j0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$DataStream;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!Jp\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b6\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b7\u0010\u0016R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010!¨\u0006:"}, d2 = {"Lio/livekit/android/room/datastream/ByteStreamInfo;", "Lio/livekit/android/room/datastream/StreamInfo;", "", "id", "topic", "", "timestampMs", "totalSize", "", "attributes", "mimeType", DiagnosticsEntry.NAME_KEY, "Las/l7;", "encryptionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Las/l7;)V", "Llivekit/LivekitModels$DataStream$Header;", "header", "Llivekit/LivekitModels$DataStream$ByteHeader;", "byteHeader", "(Llivekit/LivekitModels$DataStream$Header;Llivekit/LivekitModels$DataStream$ByteHeader;Las/l7;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/util/Map;", "component6", "component7", "component8", "()Las/l7;", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Las/l7;)Lio/livekit/android/room/datastream/ByteStreamInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTopic", "J", "getTimestampMs", "Ljava/lang/Long;", "getTotalSize", "Ljava/util/Map;", "getAttributes", "getMimeType", "getName", "Las/l7;", "getEncryptionType", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ByteStreamInfo extends StreamInfo {
    private final Map<String, String> attributes;
    private final l7 encryptionType;
    private final String id;
    private final String mimeType;
    private final String name;
    private final long timestampMs;
    private final String topic;
    private final Long totalSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ByteStreamInfo(LivekitModels$DataStream.Header header, LivekitModels$DataStream.ByteHeader byteHeader, l7 l7Var) {
        this(r1, r2, r3, r5, r6, r7, byteHeader.getName(), l7Var);
        Long l4;
        header.getClass();
        byteHeader.getClass();
        l7Var.getClass();
        String streamId = header.getStreamId();
        streamId.getClass();
        String topic = header.getTopic();
        topic.getClass();
        long timestamp = header.getTimestamp();
        if (header.hasTotalLength()) {
            l4 = Long.valueOf(header.getTotalLength());
        } else {
            l4 = null;
        }
        Long l7 = l4;
        Map<String, String> attributesMap = header.getAttributesMap();
        attributesMap.getClass();
        Map S = a0.S(attributesMap);
        String mimeType = header.getMimeType();
        mimeType.getClass();
    }

    public static /* synthetic */ ByteStreamInfo copy$default(ByteStreamInfo byteStreamInfo, String str, String str2, long j4, Long l4, Map map, String str3, String str4, l7 l7Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = byteStreamInfo.id;
        }
        if ((i10 & 2) != 0) {
            str2 = byteStreamInfo.topic;
        }
        if ((i10 & 4) != 0) {
            j4 = byteStreamInfo.timestampMs;
        }
        if ((i10 & 8) != 0) {
            l4 = byteStreamInfo.totalSize;
        }
        if ((i10 & 16) != 0) {
            map = byteStreamInfo.attributes;
        }
        if ((i10 & 32) != 0) {
            str3 = byteStreamInfo.mimeType;
        }
        if ((i10 & 64) != 0) {
            str4 = byteStreamInfo.name;
        }
        if ((i10 & 128) != 0) {
            l7Var = byteStreamInfo.encryptionType;
        }
        l7 l7Var2 = l7Var;
        String str5 = str3;
        Long l7 = l4;
        long j10 = j4;
        return byteStreamInfo.copy(str, str2, j10, l7, map, str5, str4, l7Var2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final l7 getEncryptionType() {
        return this.encryptionType;
    }

    public final ByteStreamInfo copy(String id2, String topic, long timestampMs, Long totalSize, Map<String, String> attributes, String mimeType, String name, l7 encryptionType) {
        id2.getClass();
        topic.getClass();
        attributes.getClass();
        mimeType.getClass();
        encryptionType.getClass();
        return new ByteStreamInfo(id2, topic, timestampMs, totalSize, attributes, mimeType, name, encryptionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ByteStreamInfo)) {
            return false;
        }
        ByteStreamInfo byteStreamInfo = (ByteStreamInfo) other;
        if (m.c(this.id, byteStreamInfo.id) && m.c(this.topic, byteStreamInfo.topic) && this.timestampMs == byteStreamInfo.timestampMs && m.c(this.totalSize, byteStreamInfo.totalSize) && m.c(this.attributes, byteStreamInfo.attributes) && m.c(this.mimeType, byteStreamInfo.mimeType) && m.c(this.name, byteStreamInfo.name) && this.encryptionType == byteStreamInfo.encryptionType) {
            return true;
        }
        return false;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public l7 getEncryptionType() {
        return this.encryptionType;
    }

    @Override // io.livekit.android.room.datastream.StreamInfo
    public String getId() {
        return this.id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
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
        int c5 = c.c(f.a(this.attributes, (g10 + hashCode) * 31, 31), 31, this.mimeType);
        String str = this.name;
        if (str != null) {
            i10 = str.hashCode();
        }
        return this.encryptionType.hashCode() + ((c5 + i10) * 31);
    }

    public String toString() {
        return "ByteStreamInfo(id=" + this.id + ", topic=" + this.topic + ", timestampMs=" + this.timestampMs + ", totalSize=" + this.totalSize + ", attributes=" + this.attributes + ", mimeType=" + this.mimeType + ", name=" + this.name + ", encryptionType=" + this.encryptionType + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamInfo(String str, String str2, long j4, Long l4, Map<String, String> map, String str3, String str4, l7 l7Var) {
        super(str, str2, j4, l4, map, l7Var, null);
        str.getClass();
        str2.getClass();
        map.getClass();
        str3.getClass();
        l7Var.getClass();
        this.id = str;
        this.topic = str2;
        this.timestampMs = j4;
        this.totalSize = l4;
        this.attributes = map;
        this.mimeType = str3;
        this.name = str4;
        this.encryptionType = l7Var;
    }
}

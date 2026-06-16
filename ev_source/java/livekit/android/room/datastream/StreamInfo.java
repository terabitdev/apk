package io.livekit.android.room.datastream;

import as.l7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001BG\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Lio/livekit/android/room/datastream/StreamInfo;", "", "", "id", "topic", "", "timestampMs", "totalSize", "", "attributes", "Las/l7;", "encryptionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Las/l7;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTopic", "J", "getTimestampMs", "()J", "Ljava/lang/Long;", "getTotalSize", "()Ljava/lang/Long;", "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "Las/l7;", "getEncryptionType", "()Las/l7;", "Lio/livekit/android/room/datastream/ByteStreamInfo;", "Lio/livekit/android/room/datastream/TextStreamInfo;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class StreamInfo {
    private final Map<String, String> attributes;
    private final l7 encryptionType;
    private final String id;
    private final long timestampMs;
    private final String topic;
    private final Long totalSize;

    private StreamInfo(String str, String str2, long j4, Long l4, Map<String, String> map, l7 l7Var) {
        this.id = str;
        this.topic = str2;
        this.timestampMs = j4;
        this.totalSize = l4;
        this.attributes = map;
        this.encryptionType = l7Var;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public l7 getEncryptionType() {
        return this.encryptionType;
    }

    public String getId() {
        return this.id;
    }

    public long getTimestampMs() {
        return this.timestampMs;
    }

    public String getTopic() {
        return this.topic;
    }

    public Long getTotalSize() {
        return this.totalSize;
    }

    public /* synthetic */ StreamInfo(String str, String str2, long j4, Long l4, Map map, l7 l7Var, f fVar) {
        this(str, str2, j4, l4, map, l7Var);
    }
}

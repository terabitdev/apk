package io.livekit.android.room.datastream;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.room.participant.Participant;
import j0.c;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.t;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0019Jh\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lio/livekit/android/room/datastream/StreamBytesOptions;", "", "topic", "", "attributes", "", "streamId", "destinationIdentities", "", "Lio/livekit/android/room/participant/Participant$Identity;", "mimeType", DiagnosticsEntry.NAME_KEY, "totalSize", "", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAttributes", "()Ljava/util/Map;", "getDestinationIdentities", "()Ljava/util/List;", "getMimeType", "()Ljava/lang/String;", "getName", "getStreamId", "getTopic", "getTotalSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lio/livekit/android/room/datastream/StreamBytesOptions;", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class StreamBytesOptions {
    private final Map<String, String> attributes;
    private final List<Participant.Identity> destinationIdentities;
    private final String mimeType;
    private final String name;
    private final String streamId;
    private final String topic;
    private final Long totalSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StreamBytesOptions(String str, Map map, String str2, List list, String str3, String str4, Long l4, int i10, f fVar) {
        this(str, map, str2, (i10 & 8) != 0 ? t.f33547a : list, (i10 & 16) != 0 ? "application/octet-stream" : str3, (i10 & 32) != 0 ? "unknown" : str4, (i10 & 64) != 0 ? null : l4);
        str = (i10 & 1) != 0 ? "" : str;
        map = (i10 & 2) != 0 ? u.f33548a : map;
        if ((i10 & 4) != 0) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        }
    }

    public static /* synthetic */ StreamBytesOptions copy$default(StreamBytesOptions streamBytesOptions, String str, Map map, String str2, List list, String str3, String str4, Long l4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = streamBytesOptions.topic;
        }
        if ((i10 & 2) != 0) {
            map = streamBytesOptions.attributes;
        }
        if ((i10 & 4) != 0) {
            str2 = streamBytesOptions.streamId;
        }
        if ((i10 & 8) != 0) {
            list = streamBytesOptions.destinationIdentities;
        }
        if ((i10 & 16) != 0) {
            str3 = streamBytesOptions.mimeType;
        }
        if ((i10 & 32) != 0) {
            str4 = streamBytesOptions.name;
        }
        if ((i10 & 64) != 0) {
            l4 = streamBytesOptions.totalSize;
        }
        String str5 = str4;
        Long l7 = l4;
        String str6 = str3;
        String str7 = str2;
        return streamBytesOptions.copy(str, map, str7, list, str6, str5, l7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    public final Map<String, String> component2() {
        return this.attributes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStreamId() {
        return this.streamId;
    }

    public final List<Participant.Identity> component4() {
        return this.destinationIdentities;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getTotalSize() {
        return this.totalSize;
    }

    public final StreamBytesOptions copy(String topic, Map<String, String> attributes, String streamId, List<Participant.Identity> destinationIdentities, String mimeType, String name, Long totalSize) {
        topic.getClass();
        attributes.getClass();
        streamId.getClass();
        destinationIdentities.getClass();
        mimeType.getClass();
        name.getClass();
        return new StreamBytesOptions(topic, attributes, streamId, destinationIdentities, mimeType, name, totalSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamBytesOptions)) {
            return false;
        }
        StreamBytesOptions streamBytesOptions = (StreamBytesOptions) other;
        if (m.c(this.topic, streamBytesOptions.topic) && m.c(this.attributes, streamBytesOptions.attributes) && m.c(this.streamId, streamBytesOptions.streamId) && m.c(this.destinationIdentities, streamBytesOptions.destinationIdentities) && m.c(this.mimeType, streamBytesOptions.mimeType) && m.c(this.name, streamBytesOptions.name) && m.c(this.totalSize, streamBytesOptions.totalSize)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final List<Participant.Identity> getDestinationIdentities() {
        return this.destinationIdentities;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final Long getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(c.c(n.d(c.c(defpackage.f.a(this.attributes, this.topic.hashCode() * 31, 31), 31, this.streamId), 31, this.destinationIdentities), 31, this.mimeType), 31, this.name);
        Long l4 = this.totalSize;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        return "StreamBytesOptions(topic=" + this.topic + ", attributes=" + this.attributes + ", streamId=" + this.streamId + ", destinationIdentities=" + this.destinationIdentities + ", mimeType=" + this.mimeType + ", name=" + this.name + ", totalSize=" + this.totalSize + ')';
    }

    public StreamBytesOptions(String str, Map<String, String> map, String str2, List<Participant.Identity> list, String str3, String str4, Long l4) {
        str.getClass();
        map.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        this.topic = str;
        this.attributes = map;
        this.streamId = str2;
        this.destinationIdentities = list;
        this.mimeType = str3;
        this.name = str4;
        this.totalSize = l4;
    }

    public StreamBytesOptions() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}

package io.livekit.android.room.datastream;

import defpackage.f;
import io.livekit.android.room.datastream.TextStreamInfo;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0084\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\rHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lio/livekit/android/room/datastream/StreamTextOptions;", "", "topic", "", "attributes", "", "streamId", "destinationIdentities", "", "Lio/livekit/android/room/participant/Participant$Identity;", "operationType", "Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;", "version", "", "attachedStreamIds", "replyToStreamId", "totalSize", "", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;ILjava/util/List;Ljava/lang/String;Ljava/lang/Long;)V", "getAttachedStreamIds", "()Ljava/util/List;", "getAttributes", "()Ljava/util/Map;", "getDestinationIdentities", "getOperationType", "()Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;", "getReplyToStreamId", "()Ljava/lang/String;", "getStreamId", "getTopic", "getTotalSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lio/livekit/android/room/datastream/TextStreamInfo$OperationType;ILjava/util/List;Ljava/lang/String;Ljava/lang/Long;)Lio/livekit/android/room/datastream/StreamTextOptions;", "equals", "", "other", "hashCode", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class StreamTextOptions {
    private final List<String> attachedStreamIds;
    private final Map<String, String> attributes;
    private final List<Participant.Identity> destinationIdentities;
    private final TextStreamInfo.OperationType operationType;
    private final String replyToStreamId;
    private final String streamId;
    private final String topic;
    private final Long totalSize;
    private final int version;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StreamTextOptions(java.lang.String r2, java.util.Map r3, java.lang.String r4, java.util.List r5, io.livekit.android.room.datastream.TextStreamInfo.OperationType r6, int r7, java.util.List r8, java.lang.String r9, java.lang.Long r10, int r11, kotlin.jvm.internal.f r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            tn.u r3 = tn.u.f33548a
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L1b
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r4.getClass()
        L1b:
            r12 = r11 & 8
            tn.t r0 = tn.t.f33547a
            if (r12 == 0) goto L22
            r5 = r0
        L22:
            r12 = r11 & 16
            if (r12 == 0) goto L28
            io.livekit.android.room.datastream.TextStreamInfo$OperationType r6 = io.livekit.android.room.datastream.TextStreamInfo.OperationType.CREATE
        L28:
            r12 = r11 & 32
            if (r12 == 0) goto L2d
            r7 = 0
        L2d:
            r12 = r11 & 64
            if (r12 == 0) goto L32
            r8 = r0
        L32:
            r12 = r11 & 128(0x80, float:1.8E-43)
            r0 = 0
            if (r12 == 0) goto L38
            r9 = r0
        L38:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L47
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L51
        L47:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L51:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.room.datastream.StreamTextOptions.<init>(java.lang.String, java.util.Map, java.lang.String, java.util.List, io.livekit.android.room.datastream.TextStreamInfo$OperationType, int, java.util.List, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.f):void");
    }

    public static /* synthetic */ StreamTextOptions copy$default(StreamTextOptions streamTextOptions, String str, Map map, String str2, List list, TextStreamInfo.OperationType operationType, int i10, List list2, String str3, Long l4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = streamTextOptions.topic;
        }
        if ((i11 & 2) != 0) {
            map = streamTextOptions.attributes;
        }
        if ((i11 & 4) != 0) {
            str2 = streamTextOptions.streamId;
        }
        if ((i11 & 8) != 0) {
            list = streamTextOptions.destinationIdentities;
        }
        if ((i11 & 16) != 0) {
            operationType = streamTextOptions.operationType;
        }
        if ((i11 & 32) != 0) {
            i10 = streamTextOptions.version;
        }
        if ((i11 & 64) != 0) {
            list2 = streamTextOptions.attachedStreamIds;
        }
        if ((i11 & 128) != 0) {
            str3 = streamTextOptions.replyToStreamId;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            l4 = streamTextOptions.totalSize;
        }
        String str4 = str3;
        Long l7 = l4;
        int i12 = i10;
        List list3 = list2;
        TextStreamInfo.OperationType operationType2 = operationType;
        String str5 = str2;
        return streamTextOptions.copy(str, map, str5, list, operationType2, i12, list3, str4, l7);
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
    public final TextStreamInfo.OperationType getOperationType() {
        return this.operationType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final List<String> component7() {
        return this.attachedStreamIds;
    }

    /* renamed from: component8, reason: from getter */
    public final String getReplyToStreamId() {
        return this.replyToStreamId;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getTotalSize() {
        return this.totalSize;
    }

    public final StreamTextOptions copy(String topic, Map<String, String> attributes, String streamId, List<Participant.Identity> destinationIdentities, TextStreamInfo.OperationType operationType, int version, List<String> attachedStreamIds, String replyToStreamId, Long totalSize) {
        topic.getClass();
        attributes.getClass();
        streamId.getClass();
        destinationIdentities.getClass();
        operationType.getClass();
        attachedStreamIds.getClass();
        return new StreamTextOptions(topic, attributes, streamId, destinationIdentities, operationType, version, attachedStreamIds, replyToStreamId, totalSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamTextOptions)) {
            return false;
        }
        StreamTextOptions streamTextOptions = (StreamTextOptions) other;
        if (m.c(this.topic, streamTextOptions.topic) && m.c(this.attributes, streamTextOptions.attributes) && m.c(this.streamId, streamTextOptions.streamId) && m.c(this.destinationIdentities, streamTextOptions.destinationIdentities) && this.operationType == streamTextOptions.operationType && this.version == streamTextOptions.version && m.c(this.attachedStreamIds, streamTextOptions.attachedStreamIds) && m.c(this.replyToStreamId, streamTextOptions.replyToStreamId) && m.c(this.totalSize, streamTextOptions.totalSize)) {
            return true;
        }
        return false;
    }

    public final List<String> getAttachedStreamIds() {
        return this.attachedStreamIds;
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final List<Participant.Identity> getDestinationIdentities() {
        return this.destinationIdentities;
    }

    public final TextStreamInfo.OperationType getOperationType() {
        return this.operationType;
    }

    public final String getReplyToStreamId() {
        return this.replyToStreamId;
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

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int d10 = n.d(c.b(this.version, (this.operationType.hashCode() + n.d(c.c(f.a(this.attributes, this.topic.hashCode() * 31, 31), 31, this.streamId), 31, this.destinationIdentities)) * 31, 31), 31, this.attachedStreamIds);
        String str = this.replyToStreamId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (d10 + hashCode) * 31;
        Long l4 = this.totalSize;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "StreamTextOptions(topic=" + this.topic + ", attributes=" + this.attributes + ", streamId=" + this.streamId + ", destinationIdentities=" + this.destinationIdentities + ", operationType=" + this.operationType + ", version=" + this.version + ", attachedStreamIds=" + this.attachedStreamIds + ", replyToStreamId=" + this.replyToStreamId + ", totalSize=" + this.totalSize + ')';
    }

    public StreamTextOptions(String str, Map<String, String> map, String str2, List<Participant.Identity> list, TextStreamInfo.OperationType operationType, int i10, List<String> list2, String str3, Long l4) {
        str.getClass();
        map.getClass();
        str2.getClass();
        list.getClass();
        operationType.getClass();
        list2.getClass();
        this.topic = str;
        this.attributes = map;
        this.streamId = str2;
        this.destinationIdentities = list;
        this.operationType = operationType;
        this.version = i10;
        this.attachedStreamIds = list2;
        this.replyToStreamId = str3;
        this.totalSize = l4;
    }

    public StreamTextOptions() {
        this(null, null, null, null, null, 0, null, null, null, 511, null);
    }
}

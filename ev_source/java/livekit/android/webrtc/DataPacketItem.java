package io.livekit.android.webrtc;

import com.google.firebase.messaging.Constants;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lio/livekit/android/webrtc/DataPacketItem;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/nio/ByteBuffer;", "sequence", "", "(Ljava/nio/ByteBuffer;I)V", "getData", "()Ljava/nio/ByteBuffer;", "getSequence", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class DataPacketItem {
    private final ByteBuffer data;
    private final int sequence;

    public DataPacketItem(ByteBuffer byteBuffer, int i10) {
        byteBuffer.getClass();
        this.data = byteBuffer;
        this.sequence = i10;
    }

    public static /* synthetic */ DataPacketItem copy$default(DataPacketItem dataPacketItem, ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            byteBuffer = dataPacketItem.data;
        }
        if ((i11 & 2) != 0) {
            i10 = dataPacketItem.sequence;
        }
        return dataPacketItem.copy(byteBuffer, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final ByteBuffer getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSequence() {
        return this.sequence;
    }

    public final DataPacketItem copy(ByteBuffer data, int sequence) {
        data.getClass();
        return new DataPacketItem(data, sequence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataPacketItem)) {
            return false;
        }
        DataPacketItem dataPacketItem = (DataPacketItem) other;
        if (m.c(this.data, dataPacketItem.data) && this.sequence == dataPacketItem.sequence) {
            return true;
        }
        return false;
    }

    public final ByteBuffer getData() {
        return this.data;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        return Integer.hashCode(this.sequence) + (this.data.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataPacketItem(data=");
        sb.append(this.data);
        sb.append(", sequence=");
        return j0.c.m(sb, this.sequence, ')');
    }
}

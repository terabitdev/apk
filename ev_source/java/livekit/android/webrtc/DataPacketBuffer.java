package io.livekit.android.webrtc;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lio/livekit/android/webrtc/DataPacketBuffer;", "", "", "extraCapacity", "<init>", "(J)V", "Lsn/z;", SDPKeywords.CLEAR, "()V", "Lio/livekit/android/webrtc/DataPacketItem;", "item", "queue", "(Lio/livekit/android/webrtc/DataPacketItem;)V", "dequeue", "()Lio/livekit/android/webrtc/DataPacketItem;", "", "getAll", "()Ljava/util/List;", "", "sequence", "popToSequence", "(I)Ljava/util/List;", "size", "trim", "byteSize", "()J", "()I", "J", "Ljava/util/Deque;", "buffer", "Ljava/util/Deque;", "totalSize", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DataPacketBuffer {
    private final Deque<DataPacketItem> buffer;
    private final long extraCapacity;
    private long totalSize;

    public DataPacketBuffer(long j4) {
        this.extraCapacity = j4;
        this.buffer = new LinkedList();
    }

    public final synchronized long byteSize() {
        return this.totalSize;
    }

    public final synchronized void clear() {
        this.buffer.clear();
        this.totalSize = 0L;
    }

    public final synchronized DataPacketItem dequeue() {
        if (this.buffer.isEmpty()) {
            return null;
        }
        DataPacketItem removeFirst = this.buffer.removeFirst();
        this.totalSize -= removeFirst.getData().capacity();
        return removeFirst;
    }

    public final synchronized List<DataPacketItem> getAll() {
        return o.g1(this.buffer);
    }

    public final synchronized List<DataPacketItem> popToSequence(int sequence) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        while (!this.buffer.isEmpty() && this.buffer.getFirst().getSequence() <= sequence) {
            DataPacketItem dequeue = dequeue();
            dequeue.getClass();
            arrayList.add(dequeue);
        }
        return arrayList;
    }

    public final synchronized void queue(DataPacketItem item) {
        item.getClass();
        this.buffer.add(item);
        this.totalSize += item.getData().capacity();
    }

    public final synchronized int size() {
        return this.buffer.size();
    }

    public final synchronized void trim(long size) {
        while (!this.buffer.isEmpty() && this.totalSize > this.extraCapacity + size) {
            dequeue();
        }
    }

    public DataPacketBuffer() {
        this(0L, 1, null);
    }

    public /* synthetic */ DataPacketBuffer(long j4, int i10, f fVar) {
        this((i10 & 1) != 0 ? 0L : j4);
    }
}

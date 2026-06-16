package io.elevenlabs.data.services;

import android.gov.nist.core.Separators;
import io.elevenlabs.data.model.response.EnrichedAudioChunk;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/data/services/ChunkWithAlignmentPosition;", "", "chunk", "Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "alignmentPosition", "", "chunkIndex", "", "<init>", "(Lio/elevenlabs/data/model/response/EnrichedAudioChunk;JI)V", "getChunk", "()Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "getAlignmentPosition", "()J", "getChunkIndex", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ChunkWithAlignmentPosition {
    private final long alignmentPosition;
    private final EnrichedAudioChunk chunk;
    private final int chunkIndex;

    public ChunkWithAlignmentPosition(EnrichedAudioChunk enrichedAudioChunk, long j4, int i10) {
        enrichedAudioChunk.getClass();
        this.chunk = enrichedAudioChunk;
        this.alignmentPosition = j4;
        this.chunkIndex = i10;
    }

    public static /* synthetic */ ChunkWithAlignmentPosition copy$default(ChunkWithAlignmentPosition chunkWithAlignmentPosition, EnrichedAudioChunk enrichedAudioChunk, long j4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enrichedAudioChunk = chunkWithAlignmentPosition.chunk;
        }
        if ((i11 & 2) != 0) {
            j4 = chunkWithAlignmentPosition.alignmentPosition;
        }
        if ((i11 & 4) != 0) {
            i10 = chunkWithAlignmentPosition.chunkIndex;
        }
        return chunkWithAlignmentPosition.copy(enrichedAudioChunk, j4, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final EnrichedAudioChunk getChunk() {
        return this.chunk;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAlignmentPosition() {
        return this.alignmentPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChunkIndex() {
        return this.chunkIndex;
    }

    public final ChunkWithAlignmentPosition copy(EnrichedAudioChunk chunk, long alignmentPosition, int chunkIndex) {
        chunk.getClass();
        return new ChunkWithAlignmentPosition(chunk, alignmentPosition, chunkIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChunkWithAlignmentPosition)) {
            return false;
        }
        ChunkWithAlignmentPosition chunkWithAlignmentPosition = (ChunkWithAlignmentPosition) other;
        if (m.c(this.chunk, chunkWithAlignmentPosition.chunk) && this.alignmentPosition == chunkWithAlignmentPosition.alignmentPosition && this.chunkIndex == chunkWithAlignmentPosition.chunkIndex) {
            return true;
        }
        return false;
    }

    public final long getAlignmentPosition() {
        return this.alignmentPosition;
    }

    public final EnrichedAudioChunk getChunk() {
        return this.chunk;
    }

    public final int getChunkIndex() {
        return this.chunkIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.chunkIndex) + com.google.android.gms.internal.play_billing.b.g(this.alignmentPosition, this.chunk.hashCode() * 31, 31);
    }

    public String toString() {
        return "ChunkWithAlignmentPosition(chunk=" + this.chunk + ", alignmentPosition=" + this.alignmentPosition + ", chunkIndex=" + this.chunkIndex + Separators.RPAREN;
    }
}

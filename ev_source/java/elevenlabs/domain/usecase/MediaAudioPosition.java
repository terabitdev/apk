package io.elevenlabs.domain.usecase;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/usecase/MediaAudioPosition;", "", "chapterIndex", "", "startTimeSeconds", "", "endTimeSeconds", "<init>", "(IDD)V", "getChapterIndex", "()I", "getStartTimeSeconds", "()D", "getEndTimeSeconds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class MediaAudioPosition {
    private final int chapterIndex;
    private final double endTimeSeconds;
    private final double startTimeSeconds;

    public MediaAudioPosition(int i10, double d10, double d11) {
        this.chapterIndex = i10;
        this.startTimeSeconds = d10;
        this.endTimeSeconds = d11;
    }

    public static /* synthetic */ MediaAudioPosition copy$default(MediaAudioPosition mediaAudioPosition, int i10, double d10, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mediaAudioPosition.chapterIndex;
        }
        if ((i11 & 2) != 0) {
            d10 = mediaAudioPosition.startTimeSeconds;
        }
        if ((i11 & 4) != 0) {
            d11 = mediaAudioPosition.endTimeSeconds;
        }
        return mediaAudioPosition.copy(i10, d10, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final double getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final double getEndTimeSeconds() {
        return this.endTimeSeconds;
    }

    public final MediaAudioPosition copy(int chapterIndex, double startTimeSeconds, double endTimeSeconds) {
        return new MediaAudioPosition(chapterIndex, startTimeSeconds, endTimeSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaAudioPosition)) {
            return false;
        }
        MediaAudioPosition mediaAudioPosition = (MediaAudioPosition) other;
        if (this.chapterIndex == mediaAudioPosition.chapterIndex && Double.compare(this.startTimeSeconds, mediaAudioPosition.startTimeSeconds) == 0 && Double.compare(this.endTimeSeconds, mediaAudioPosition.endTimeSeconds) == 0) {
            return true;
        }
        return false;
    }

    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    public final double getEndTimeSeconds() {
        return this.endTimeSeconds;
    }

    public final double getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    public int hashCode() {
        return Double.hashCode(this.endTimeSeconds) + n.c(Integer.hashCode(this.chapterIndex) * 31, 31, this.startTimeSeconds);
    }

    public String toString() {
        return "MediaAudioPosition(chapterIndex=" + this.chapterIndex + ", startTimeSeconds=" + this.startTimeSeconds + ", endTimeSeconds=" + this.endTimeSeconds + Separators.RPAREN;
    }
}

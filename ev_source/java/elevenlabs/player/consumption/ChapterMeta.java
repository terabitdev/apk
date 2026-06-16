package io.elevenlabs.player.consumption;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.PlaybackSource;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/player/consumption/ChapterMeta;", "", "audioFileNumber", "", "playbackSource", "Lio/elevenlabs/domain/model/PlaybackSource;", "isReadMediaType", "", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/PlaybackSource;Z)V", "getAudioFileNumber", "()Ljava/lang/String;", "getPlaybackSource", "()Lio/elevenlabs/domain/model/PlaybackSource;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ChapterMeta {
    private final String audioFileNumber;
    private final boolean isReadMediaType;
    private final PlaybackSource playbackSource;

    public ChapterMeta(String str, PlaybackSource playbackSource, boolean z6) {
        playbackSource.getClass();
        this.audioFileNumber = str;
        this.playbackSource = playbackSource;
        this.isReadMediaType = z6;
    }

    public static /* synthetic */ ChapterMeta copy$default(ChapterMeta chapterMeta, String str, PlaybackSource playbackSource, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = chapterMeta.audioFileNumber;
        }
        if ((i10 & 2) != 0) {
            playbackSource = chapterMeta.playbackSource;
        }
        if ((i10 & 4) != 0) {
            z6 = chapterMeta.isReadMediaType;
        }
        return chapterMeta.copy(str, playbackSource, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final PlaybackSource getPlaybackSource() {
        return this.playbackSource;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsReadMediaType() {
        return this.isReadMediaType;
    }

    public final ChapterMeta copy(String audioFileNumber, PlaybackSource playbackSource, boolean isReadMediaType) {
        playbackSource.getClass();
        return new ChapterMeta(audioFileNumber, playbackSource, isReadMediaType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChapterMeta)) {
            return false;
        }
        ChapterMeta chapterMeta = (ChapterMeta) other;
        if (m.c(this.audioFileNumber, chapterMeta.audioFileNumber) && this.playbackSource == chapterMeta.playbackSource && this.isReadMediaType == chapterMeta.isReadMediaType) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final PlaybackSource getPlaybackSource() {
        return this.playbackSource;
    }

    public int hashCode() {
        int hashCode;
        String str = this.audioFileNumber;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.isReadMediaType) + ((this.playbackSource.hashCode() + (hashCode * 31)) * 31);
    }

    public final boolean isReadMediaType() {
        return this.isReadMediaType;
    }

    public String toString() {
        String str = this.audioFileNumber;
        PlaybackSource playbackSource = this.playbackSource;
        boolean z6 = this.isReadMediaType;
        StringBuilder sb = new StringBuilder("ChapterMeta(audioFileNumber=");
        sb.append(str);
        sb.append(", playbackSource=");
        sb.append(playbackSource);
        sb.append(", isReadMediaType=");
        return n.j(Separators.RPAREN, sb, z6);
    }
}

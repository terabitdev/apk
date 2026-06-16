package io.elevenlabs.domain.services.player;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Chapter;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/services/player/AudioPositionUpdate;", "", "positionSeconds", "", "currentChapter", "Lio/elevenlabs/domain/model/Chapter;", "<init>", "(DLio/elevenlabs/domain/model/Chapter;)V", "getPositionSeconds", "()D", "getCurrentChapter", "()Lio/elevenlabs/domain/model/Chapter;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AudioPositionUpdate {
    private final Chapter currentChapter;
    private final double positionSeconds;

    public AudioPositionUpdate(double d10, Chapter chapter) {
        this.positionSeconds = d10;
        this.currentChapter = chapter;
    }

    public static /* synthetic */ AudioPositionUpdate copy$default(AudioPositionUpdate audioPositionUpdate, double d10, Chapter chapter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = audioPositionUpdate.positionSeconds;
        }
        if ((i10 & 2) != 0) {
            chapter = audioPositionUpdate.currentChapter;
        }
        return audioPositionUpdate.copy(d10, chapter);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPositionSeconds() {
        return this.positionSeconds;
    }

    /* renamed from: component2, reason: from getter */
    public final Chapter getCurrentChapter() {
        return this.currentChapter;
    }

    public final AudioPositionUpdate copy(double positionSeconds, Chapter currentChapter) {
        return new AudioPositionUpdate(positionSeconds, currentChapter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioPositionUpdate)) {
            return false;
        }
        AudioPositionUpdate audioPositionUpdate = (AudioPositionUpdate) other;
        if (Double.compare(this.positionSeconds, audioPositionUpdate.positionSeconds) == 0 && m.c(this.currentChapter, audioPositionUpdate.currentChapter)) {
            return true;
        }
        return false;
    }

    public final Chapter getCurrentChapter() {
        return this.currentChapter;
    }

    public final double getPositionSeconds() {
        return this.positionSeconds;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Double.hashCode(this.positionSeconds) * 31;
        Chapter chapter = this.currentChapter;
        if (chapter == null) {
            hashCode = 0;
        } else {
            hashCode = chapter.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AudioPositionUpdate(positionSeconds=" + this.positionSeconds + ", currentChapter=" + this.currentChapter + Separators.RPAREN;
    }
}

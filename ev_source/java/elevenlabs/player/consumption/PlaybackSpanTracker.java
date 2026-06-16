package io.elevenlabs.player.consumption;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import io.elevenlabs.domain.model.ConsumptionSpan;
import io.livekit.android.room.SignalClient;
import java.util.UUID;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J%\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lio/elevenlabs/player/consumption/PlaybackSpanTracker;", "", "<init>", "()V", "", "endSeconds", "Lio/elevenlabs/domain/model/ConsumptionSpan;", "buildSpan", "(D)Lio/elevenlabs/domain/model/ConsumptionSpan;", "Lsn/z;", SDPKeywords.CLEAR, "", "readId", "startSeconds", "Lio/elevenlabs/player/consumption/SpanMeta;", "meta", "startSpan", "(Ljava/lang/String;DLio/elevenlabs/player/consumption/SpanMeta;)V", "stopSpan", "currentSeconds", "flush", "(DLio/elevenlabs/player/consumption/SpanMeta;)Lio/elevenlabs/domain/model/ConsumptionSpan;", "reset", "activeReadId", "Ljava/lang/String;", "activeStartSeconds", "D", "", "activeStartWallTimeMs", "J", "activeMeta", "Lio/elevenlabs/player/consumption/SpanMeta;", "", "getHasActiveSpan", "()Z", "hasActiveSpan", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlaybackSpanTracker {
    private SpanMeta activeMeta;
    private String activeReadId;
    private double activeStartSeconds;
    private long activeStartWallTimeMs;

    private final ConsumptionSpan buildSpan(double endSeconds) {
        SpanMeta spanMeta;
        String str = this.activeReadId;
        if (str == null || (spanMeta = this.activeMeta) == null || endSeconds <= this.activeStartSeconds) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.activeStartWallTimeMs;
        if (currentTimeMillis <= 0) {
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return new ConsumptionSpan(uuid, str, spanMeta.getAudioFileNumber(), this.activeStartSeconds, endSeconds, null, null, this.activeStartWallTimeMs / SignalClient.CLOSE_REASON_NORMAL_CLOSURE, spanMeta.getPlaybackSpeed(), currentTimeMillis / 1000.0d, spanMeta.getAudioType(), spanMeta.getPlaybackSource(), spanMeta.getDeviceOnline(), spanMeta.getVoiceId(), 96, null);
    }

    private final void clear() {
        this.activeReadId = null;
        this.activeStartSeconds = 0.0d;
        this.activeStartWallTimeMs = 0L;
        this.activeMeta = null;
    }

    public final ConsumptionSpan flush(double currentSeconds, SpanMeta meta) {
        ConsumptionSpan consumptionSpan;
        meta.getClass();
        synchronized (this) {
            String str = this.activeReadId;
            if (str == null) {
                consumptionSpan = null;
            } else {
                ConsumptionSpan buildSpan = buildSpan(currentSeconds);
                this.activeStartSeconds = currentSeconds;
                this.activeStartWallTimeMs = System.currentTimeMillis();
                this.activeReadId = str;
                this.activeMeta = meta;
                consumptionSpan = buildSpan;
            }
        }
        return consumptionSpan;
    }

    public final boolean getHasActiveSpan() {
        boolean z6;
        synchronized (this) {
            if (this.activeReadId != null) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        return z6;
    }

    public final void reset() {
        synchronized (this) {
            clear();
        }
    }

    public final void startSpan(String readId, double startSeconds, SpanMeta meta) {
        readId.getClass();
        meta.getClass();
        synchronized (this) {
            this.activeReadId = readId;
            this.activeStartSeconds = startSeconds;
            this.activeStartWallTimeMs = System.currentTimeMillis();
            this.activeMeta = meta;
        }
    }

    public final ConsumptionSpan stopSpan(double endSeconds) {
        ConsumptionSpan buildSpan;
        synchronized (this) {
            buildSpan = buildSpan(endSeconds);
            clear();
        }
        return buildSpan;
    }
}

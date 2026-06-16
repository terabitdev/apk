package io.elevenlabs.player.consumption;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import defpackage.f;
import fr.a2;
import fr.d0;
import fr.g0;
import fr.k1;
import ho.l;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.ConsumptionSpan;
import io.elevenlabs.domain.model.PlaybackSource;
import io.elevenlabs.domain.services.ConsumptionTrackingService;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00013BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u000b\u001a\u001c\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R.\u0010\u000b\u001a\u001c\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010'\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lio/elevenlabs/player/consumption/ConsumptionCoordinator;", "", "Lio/elevenlabs/domain/services/ConsumptionTrackingService;", "trackingService", "Lio/elevenlabs/domain/Logger;", "logger", "Lfr/d0;", "scope", "Lkotlin/Function1;", "Lwn/c;", "Lio/elevenlabs/player/consumption/ConsumptionCoordinator$SnapshotData;", "snapshotProvider", "<init>", "(Lio/elevenlabs/domain/services/ConsumptionTrackingService;Lio/elevenlabs/domain/Logger;Lfr/d0;Lho/l;)V", "Lsn/z;", "startPeriodicFlush", "()V", "", "readId", "", "startSeconds", "Lio/elevenlabs/player/consumption/SpanMeta;", "meta", "reason", "startSpan", "(Ljava/lang/String;DLio/elevenlabs/player/consumption/SpanMeta;Ljava/lang/String;)V", "", "playerPositionMs", "maxEndSeconds", "stopAtCurrentPosition", "(JLjava/lang/Double;Lwn/c;)Ljava/lang/Object;", "currentSeconds", "flush", "(DLio/elevenlabs/player/consumption/SpanMeta;)V", "reset", "Lio/elevenlabs/domain/services/ConsumptionTrackingService;", "Lio/elevenlabs/domain/Logger;", "Lfr/d0;", "Lho/l;", ParameterNames.TAG, "Ljava/lang/String;", "Lio/elevenlabs/player/consumption/PlaybackSpanTracker;", "tracker", "Lio/elevenlabs/player/consumption/PlaybackSpanTracker;", "Lfr/k1;", "flushJob", "Lfr/k1;", "", "getHasActiveSpan", "()Z", "hasActiveSpan", "SnapshotData", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConsumptionCoordinator {
    private k1 flushJob;
    private final Logger logger;
    private final d0 scope;
    private final l snapshotProvider;
    private final String tag;
    private final PlaybackSpanTracker tracker;
    private final ConsumptionTrackingService trackingService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/player/consumption/ConsumptionCoordinator$SnapshotData;", "", "positionSeconds", "", "meta", "Lio/elevenlabs/player/consumption/SpanMeta;", "<init>", "(DLio/elevenlabs/player/consumption/SpanMeta;)V", "getPositionSeconds", "()D", "getMeta", "()Lio/elevenlabs/player/consumption/SpanMeta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SnapshotData {
        private final SpanMeta meta;
        private final double positionSeconds;

        public SnapshotData(double d10, SpanMeta spanMeta) {
            spanMeta.getClass();
            this.positionSeconds = d10;
            this.meta = spanMeta;
        }

        public static /* synthetic */ SnapshotData copy$default(SnapshotData snapshotData, double d10, SpanMeta spanMeta, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = snapshotData.positionSeconds;
            }
            if ((i10 & 2) != 0) {
                spanMeta = snapshotData.meta;
            }
            return snapshotData.copy(d10, spanMeta);
        }

        /* renamed from: component1, reason: from getter */
        public final double getPositionSeconds() {
            return this.positionSeconds;
        }

        /* renamed from: component2, reason: from getter */
        public final SpanMeta getMeta() {
            return this.meta;
        }

        public final SnapshotData copy(double positionSeconds, SpanMeta meta) {
            meta.getClass();
            return new SnapshotData(positionSeconds, meta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SnapshotData)) {
                return false;
            }
            SnapshotData snapshotData = (SnapshotData) other;
            if (Double.compare(this.positionSeconds, snapshotData.positionSeconds) == 0 && m.c(this.meta, snapshotData.meta)) {
                return true;
            }
            return false;
        }

        public final SpanMeta getMeta() {
            return this.meta;
        }

        public final double getPositionSeconds() {
            return this.positionSeconds;
        }

        public int hashCode() {
            return this.meta.hashCode() + (Double.hashCode(this.positionSeconds) * 31);
        }

        public String toString() {
            return "SnapshotData(positionSeconds=" + this.positionSeconds + ", meta=" + this.meta + Separators.RPAREN;
        }
    }

    public ConsumptionCoordinator(ConsumptionTrackingService consumptionTrackingService, Logger logger, d0 d0Var, l lVar) {
        consumptionTrackingService.getClass();
        logger.getClass();
        d0Var.getClass();
        this.trackingService = consumptionTrackingService;
        this.logger = logger;
        this.scope = d0Var;
        this.snapshotProvider = lVar;
        this.tag = "ConsumptionCoordinator";
        this.tracker = new PlaybackSpanTracker();
    }

    private final void startPeriodicFlush() {
        l lVar = this.snapshotProvider;
        if (lVar == null) {
            return;
        }
        k1 k1Var = this.flushJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.flushJob = g0.D(this.scope, null, null, new ConsumptionCoordinator$startPeriodicFlush$1(lVar, this, null), 3);
    }

    public static /* synthetic */ void startSpan$default(ConsumptionCoordinator consumptionCoordinator, String str, double d10, SpanMeta spanMeta, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = "play";
        }
        consumptionCoordinator.startSpan(str, d10, spanMeta, str2);
    }

    public static /* synthetic */ Object stopAtCurrentPosition$default(ConsumptionCoordinator consumptionCoordinator, long j4, Double d10, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d10 = null;
        }
        return consumptionCoordinator.stopAtCurrentPosition(j4, d10, cVar);
    }

    public final void flush(double currentSeconds, SpanMeta meta) {
        meta.getClass();
        ConsumptionSpan flush = this.tracker.flush(currentSeconds, meta);
        if (flush == null) {
            return;
        }
        this.logger.log(this.tag, "Span flushed: file=" + flush.getAudioFileNumber() + Separators.SP + flush.getStartSeconds() + "s-" + flush.getEndSeconds() + "s speed=" + flush.getPlaybackSpeed() + " realTime=" + flush.getRealTimeDurationSeconds() + "s type=" + flush.getType() + " source=" + flush.getPlaybackSource() + " online=" + flush.getDeviceOnline());
        g0.D(this.scope, null, null, new ConsumptionCoordinator$flush$1(this, flush, null), 3);
    }

    public final boolean getHasActiveSpan() {
        return this.tracker.getHasActiveSpan();
    }

    public final void reset() {
        this.tracker.reset();
        k1 k1Var = this.flushJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
    }

    public final void startSpan(String readId, double startSeconds, SpanMeta meta, String reason) {
        readId.getClass();
        meta.getClass();
        reason.getClass();
        this.tracker.startSpan(readId, startSeconds, meta);
        Logger logger = this.logger;
        String str = this.tag;
        String audioFileNumber = meta.getAudioFileNumber();
        AudioType audioType = meta.getAudioType();
        PlaybackSource playbackSource = meta.getPlaybackSource();
        boolean deviceOnline = meta.getDeviceOnline();
        StringBuilder s10 = f.s("Span started (", reason, "): read=", readId, " file=");
        s10.append(audioFileNumber);
        s10.append(" pos=");
        s10.append(startSeconds);
        s10.append("s type=");
        s10.append(audioType);
        s10.append(" source=");
        s10.append(playbackSource);
        s10.append(" online=");
        s10.append(deviceOnline);
        logger.log(str, s10.toString());
        startPeriodicFlush();
    }

    public final Object stopAtCurrentPosition(long j4, Double d10, c<? super z> cVar) {
        if (this.tracker.getHasActiveSpan()) {
            if (j4 < 0) {
                j4 = 0;
            }
            double d11 = j4 / 1000.0d;
            if (d10 != null) {
                double doubleValue = d10.doubleValue();
                if (d11 > doubleValue) {
                    d11 = doubleValue;
                }
            }
            ConsumptionSpan stopSpan = this.tracker.stopSpan(d11);
            if (stopSpan != null) {
                this.logger.log(this.tag, "Span stopped: file=" + stopSpan.getAudioFileNumber() + Separators.SP + stopSpan.getStartSeconds() + "s-" + stopSpan.getEndSeconds() + "s speed=" + stopSpan.getPlaybackSpeed() + " realTime=" + stopSpan.getRealTimeDurationSeconds() + "s");
                k1 k1Var = this.flushJob;
                if (k1Var != null) {
                    k1Var.cancel((CancellationException) null);
                }
                Object Q = g0.Q(a2.f9800a, new ConsumptionCoordinator$stopAtCurrentPosition$2(this, stopSpan, null), cVar);
                if (Q == a.f37986a) {
                    return Q;
                }
            }
        }
        return z.f31622a;
    }

    public /* synthetic */ ConsumptionCoordinator(ConsumptionTrackingService consumptionTrackingService, Logger logger, d0 d0Var, l lVar, int i10, kotlin.jvm.internal.f fVar) {
        this(consumptionTrackingService, logger, d0Var, (i10 & 8) != 0 ? null : lVar);
    }
}

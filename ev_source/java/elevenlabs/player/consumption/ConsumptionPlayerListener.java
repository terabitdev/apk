package io.elevenlabs.player.consumption;

import fr.d0;
import fr.g0;
import fr.k1;
import ho.a;
import ho.q;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import w7.a1;
import w7.b1;
import w7.d;
import w7.d1;
import w7.e1;
import w7.f1;
import w7.f2;
import w7.g1;
import w7.h1;
import w7.o;
import w7.q1;
import w7.r0;
import w7.r1;
import w7.u0;
import w7.w0;
import w7.w1;
import w7.y1;
import y7.c;
import z7.j0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012*\u0010\u0010\u001a&\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R8\u0010\u0010\u001a&\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010/R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102¨\u00064"}, d2 = {"Lio/elevenlabs/player/consumption/ConsumptionPlayerListener;", "Lw7/f1;", "Lw7/h1;", "player", "Lio/elevenlabs/player/consumption/ConsumptionCoordinator;", "consumption", "Lfr/d0;", "scope", "Lkotlin/Function0;", "", "readIdProvider", "Lkotlin/Function3;", "", "Lwn/c;", "Lio/elevenlabs/player/consumption/ChapterMeta;", "", "chapterMetaResolver", "", "playbackSpeedProvider", "", "deviceOnlineProvider", "voiceIdProvider", "<init>", "(Lw7/h1;Lio/elevenlabs/player/consumption/ConsumptionCoordinator;Lfr/d0;Lho/a;Lho/q;Lho/a;Lho/a;Lho/a;)V", "windowIndex", "", "positionSeconds", "reason", "Lsn/z;", "startSpan", "(IDLjava/lang/String;)V", "windowDurationSeconds", "(I)Ljava/lang/Double;", "reasonLabel", "(I)Ljava/lang/String;", "Lw7/g1;", "oldPosition", "newPosition", "onPositionDiscontinuity", "(Lw7/g1;Lw7/g1;I)V", "isPlaying", "onIsPlayingChanged", "(Z)V", "Lw7/h1;", "Lio/elevenlabs/player/consumption/ConsumptionCoordinator;", "Lfr/d0;", "Lho/a;", "Lho/q;", "Lfr/k1;", "pendingStartSpanJob", "Lfr/k1;", "pendingStopSpanJob", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConsumptionPlayerListener implements f1 {
    private final q chapterMetaResolver;
    private final ConsumptionCoordinator consumption;
    private final a deviceOnlineProvider;
    private k1 pendingStartSpanJob;
    private k1 pendingStopSpanJob;
    private final a playbackSpeedProvider;
    private final h1 player;
    private final a readIdProvider;
    private final d0 scope;
    private final a voiceIdProvider;

    public ConsumptionPlayerListener(h1 h1Var, ConsumptionCoordinator consumptionCoordinator, d0 d0Var, a aVar, q qVar, a aVar2, a aVar3, a aVar4) {
        h1Var.getClass();
        consumptionCoordinator.getClass();
        d0Var.getClass();
        aVar.getClass();
        qVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        this.player = h1Var;
        this.consumption = consumptionCoordinator;
        this.scope = d0Var;
        this.readIdProvider = aVar;
        this.chapterMetaResolver = qVar;
        this.playbackSpeedProvider = aVar2;
        this.deviceOnlineProvider = aVar3;
        this.voiceIdProvider = aVar4;
    }

    private final String reasonLabel(int reason) {
        if (reason != 0) {
            if (reason != 1 && reason != 2) {
                return "discontinuity";
            }
            return "seek";
        }
        return "auto-advance";
    }

    private final void startSpan(int windowIndex, double positionSeconds, String reason) {
        String str = (String) this.readIdProvider.invoke();
        if (str == null) {
            return;
        }
        float floatValue = ((Number) this.playbackSpeedProvider.invoke()).floatValue();
        boolean booleanValue = ((Boolean) this.deviceOnlineProvider.invoke()).booleanValue();
        String str2 = (String) this.voiceIdProvider.invoke();
        k1 k1Var = this.pendingStartSpanJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.pendingStartSpanJob = g0.D(this.scope, null, null, new ConsumptionPlayerListener$startSpan$1(this, str, windowIndex, positionSeconds, str2, booleanValue, floatValue, reason, null), 3);
    }

    public static /* synthetic */ void startSpan$default(ConsumptionPlayerListener consumptionPlayerListener, int i10, double d10, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "play";
        }
        consumptionPlayerListener.startSpan(i10, d10, str);
    }

    private final Double windowDurationSeconds(int windowIndex) {
        r1 currentTimeline = this.player.getCurrentTimeline();
        currentTimeline.getClass();
        if (!currentTimeline.p() && windowIndex >= 0 && windowIndex < currentTimeline.o()) {
            q1 q1Var = new q1();
            currentTimeline.n(windowIndex, q1Var);
            if (j0.k0(q1Var.f36563m) > 0) {
                return Double.valueOf(j0.k0(q1Var.f36563m) / 1000.0d);
            }
            return null;
        }
        return null;
    }

    @Override // w7.f1
    public void onIsPlayingChanged(boolean isPlaying) {
        if (!isPlaying) {
            this.pendingStopSpanJob = g0.D(this.scope, null, null, new ConsumptionPlayerListener$onIsPlayingChanged$1(this, this.player.getCurrentPosition(), windowDurationSeconds(this.player.getCurrentMediaItemIndex()), null), 3);
            return;
        }
        k1 k1Var = this.pendingStopSpanJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.pendingStopSpanJob = null;
        if (!this.consumption.getHasActiveSpan()) {
            long currentPosition = this.player.getCurrentPosition();
            if (currentPosition < 0) {
                currentPosition = 0;
            }
            startSpan$default(this, this.player.getCurrentMediaItemIndex(), currentPosition / 1000.0d, null, 4, null);
        }
    }

    @Override // w7.f1
    public void onPositionDiscontinuity(g1 oldPosition, g1 newPosition, int reason) {
        oldPosition.getClass();
        newPosition.getClass();
        if (reason == 1 || reason == 0) {
            g0.D(this.scope, null, null, new ConsumptionPlayerListener$onPositionDiscontinuity$1(this, oldPosition, windowDurationSeconds(oldPosition.f36354b), null), 3);
            if (this.player.getPlayWhenReady()) {
                startSpan(newPosition.f36354b, newPosition.f36358f / 1000.0d, reasonLabel(reason));
            }
        }
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onCues(c cVar) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(d dVar) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(d1 d1Var) {
    }

    @Override // w7.f1
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(o oVar) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z6) {
    }

    @Override // w7.f1
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z6) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j4) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(u0 u0Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onMetadata(w0 w0Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(b1 b1Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onPlayerError(a1 a1Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(a1 a1Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(u0 u0Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j4) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j4) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z6) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z6) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(w1 w1Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onTracksChanged(y1 y1Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(f2 f2Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z6) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onEvents(h1 h1Var, e1 e1Var) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onMediaItemTransition(r0 r0Var, int i10) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z6, int i10) {
    }

    @Override // w7.f1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z6, int i10) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // w7.f1
    public /* bridge */ /* synthetic */ void onTimelineChanged(r1 r1Var, int i10) {
    }

    @Override // w7.f1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
    }
}

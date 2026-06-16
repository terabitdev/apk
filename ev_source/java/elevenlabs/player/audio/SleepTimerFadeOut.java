package io.elevenlabs.player.audio;

import fr.d0;
import fr.g0;
import fr.k1;
import fr.z;
import io.elevenlabs.domain.Logger;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import w7.h1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/player/audio/SleepTimerFadeOut;", "", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/Logger;)V", "Lfr/d0;", "scope", "Lw7/h1;", "player", "Lfr/z;", "mainDispatcher", "Lsn/z;", "start", "(Lfr/d0;Lw7/h1;Lfr/z;)V", "cancel", "()V", "Lio/elevenlabs/domain/Logger;", "Lfr/k1;", "fadeJob", "Lfr/k1;", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SleepTimerFadeOut {
    private static final double FADE_VELOCITY = 3.5d;
    private static final int STEP_COUNT = 150;
    private static final long STEP_INTERVAL_MS = 33;
    private static final String TAG = "SleepTimerFadeOut";
    private k1 fadeJob;
    private final Logger logger;

    public SleepTimerFadeOut(Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    public final void cancel() {
        k1 k1Var = this.fadeJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.fadeJob = null;
    }

    public final void start(d0 scope, h1 player, z mainDispatcher) {
        scope.getClass();
        player.getClass();
        mainDispatcher.getClass();
        cancel();
        this.fadeJob = g0.D(scope, mainDispatcher, null, new SleepTimerFadeOut$start$1(player, this, null), 2);
    }
}

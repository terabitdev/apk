package io.elevenlabs.player.audio;

import ae.l;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.protobuf.c6;
import fr.g0;
import g8.i0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import or.a;
import or.d;
import sn.m;
import sn.z;
import t2.u;
import w7.f1;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lio/elevenlabs/player/audio/LoopingAudioPlayer;", "", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;)V", "", "volume", "Lsn/z;", "setVolume", "(F)V", "internalStop", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "file", "Lsn/m;", "startLooping-BWLJW6A", "(Landroid/content/Context;Ljava/io/File;Ljava/lang/Float;Lwn/c;)Ljava/lang/Object;", "startLooping", "pause", "(Lwn/c;)Ljava/lang/Object;", "resume", "stop", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/Logger;", "Lor/a;", "mutex", "Lor/a;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "Lw7/f1;", "playerListener", "Lw7/f1;", "currentFile", "Ljava/io/File;", "currentVolume", TokenNames.F, "", "isPrepared", "Z", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class LoopingAudioPlayer {
    private static final float DEFAULT_VOLUME = 0.25f;
    private static final String TAG = "LoopingAudioPlayer";
    private File currentFile;
    private float currentVolume;
    private final DispatcherFactory dispatcherFactory;
    private ExoPlayer exoPlayer;
    private boolean isPrepared;
    private final Logger logger;
    private final a mutex;
    private f1 playerListener;

    public LoopingAudioPlayer(DispatcherFactory dispatcherFactory, Logger logger) {
        dispatcherFactory.getClass();
        logger.getClass();
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
        this.mutex = d.a();
        this.currentVolume = DEFAULT_VOLUME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalStop() {
        ExoPlayer exoPlayer = this.exoPlayer;
        f1 f1Var = this.playerListener;
        if (exoPlayer != null && f1Var != null) {
            ((i0) exoPlayer).removeListener(f1Var);
        }
        if (exoPlayer != null) {
            i0 i0Var = (i0) exoPlayer;
            i0Var.stop();
            i0Var.release();
        }
        this.exoPlayer = null;
        this.playerListener = null;
        this.currentFile = null;
        this.isPrepared = false;
        this.logger.log(TAG, "Stopped soundscape playback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVolume(float volume) {
        float l4 = l.l(volume, u.P, 1.0f);
        this.currentVolume = l4;
        ExoPlayer exoPlayer = this.exoPlayer;
        if (exoPlayer != null) {
            ((i0) exoPlayer).setVolume(l4);
        }
        this.logger.log(TAG, "Updated soundscape volume to: " + this.currentVolume);
    }

    /* renamed from: startLooping-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m1002startLoopingBWLJW6A$default(LoopingAudioPlayer loopingAudioPlayer, Context context, File file, Float f10, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = null;
        }
        return loopingAudioPlayer.m1003startLoopingBWLJW6A(context, file, f10, cVar);
    }

    public final Object pause(c<? super z> cVar) {
        Object Q = g0.Q(this.dispatcherFactory.getMain(), new LoopingAudioPlayer$pause$2(this, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return z.f31622a;
    }

    public final Object resume(c<? super z> cVar) {
        Object Q = g0.Q(this.dispatcherFactory.getMain(), new LoopingAudioPlayer$resume$2(this, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: startLooping-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1003startLoopingBWLJW6A(Context context, File file, Float f10, c<? super m> cVar) {
        LoopingAudioPlayer$startLooping$1 loopingAudioPlayer$startLooping$1;
        int i10;
        if (cVar instanceof LoopingAudioPlayer$startLooping$1) {
            loopingAudioPlayer$startLooping$1 = (LoopingAudioPlayer$startLooping$1) cVar;
            int i11 = loopingAudioPlayer$startLooping$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                loopingAudioPlayer$startLooping$1.label = i11 - Integer.MIN_VALUE;
                Object obj = loopingAudioPlayer$startLooping$1.result;
                i10 = loopingAudioPlayer$startLooping$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    fr.z main = this.dispatcherFactory.getMain();
                    LoopingAudioPlayer$startLooping$2 loopingAudioPlayer$startLooping$2 = new LoopingAudioPlayer$startLooping$2(this, file, f10, context, null);
                    loopingAudioPlayer$startLooping$1.L$0 = null;
                    loopingAudioPlayer$startLooping$1.L$1 = null;
                    loopingAudioPlayer$startLooping$1.L$2 = null;
                    loopingAudioPlayer$startLooping$1.label = 1;
                    obj = g0.Q(main, loopingAudioPlayer$startLooping$2, loopingAudioPlayer$startLooping$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ((m) obj).f31603a;
            }
        }
        loopingAudioPlayer$startLooping$1 = new LoopingAudioPlayer$startLooping$1(this, cVar);
        Object obj2 = loopingAudioPlayer$startLooping$1.result;
        i10 = loopingAudioPlayer$startLooping$1.label;
        if (i10 == 0) {
        }
        return ((m) obj2).f31603a;
    }

    public final Object stop(c<? super z> cVar) {
        Object Q = g0.Q(this.dispatcherFactory.getMain(), new LoopingAudioPlayer$stop$2(this, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return z.f31622a;
    }
}

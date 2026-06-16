package io.elevenlabs.player.audio;

import ae.l;
import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.protobuf.c6;
import fr.d0;
import g8.i0;
import gg.b;
import ho.p;
import io.elevenlabs.domain.Logger;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import or.a;
import sn.m;
import sn.z;
import t2.u;
import w7.a1;
import w7.b1;
import w7.d;
import w7.d1;
import w7.e1;
import w7.f1;
import w7.f2;
import w7.g0;
import w7.g1;
import w7.h0;
import w7.h1;
import w7.j0;
import w7.k0;
import w7.l0;
import w7.m0;
import w7.n0;
import w7.o;
import w7.r0;
import w7.r1;
import w7.u0;
import w7.w0;
import w7.w1;
import w7.y1;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.audio.LoopingAudioPlayer$startLooping$2", f = "LoopingAudioPlayer.kt", l = {174}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lsn/m;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)Lsn/m;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class LoopingAudioPlayer$startLooping$2 extends i implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ File $file;
    final /* synthetic */ Float $volume;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ LoopingAudioPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopingAudioPlayer$startLooping$2(LoopingAudioPlayer loopingAudioPlayer, File file, Float f10, Context context, c<? super LoopingAudioPlayer$startLooping$2> cVar) {
        super(2, cVar);
        this.this$0 = loopingAudioPlayer;
        this.$file = file;
        this.$volume = f10;
        this.$context = context;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LoopingAudioPlayer$startLooping$2(this.this$0, this.$file, this.$volume, this.$context, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super m> cVar) {
        return ((LoopingAudioPlayer$startLooping$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        r10 = r7.exoPlayer;
     */
    /* JADX WARN: Type inference failed for: r10v6, types: [w7.h0, w7.i0] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        final LoopingAudioPlayer loopingAudioPlayer;
        final File file;
        Float f10;
        Context context;
        File file2;
        i0 i0Var;
        Logger logger;
        float f11;
        float f12;
        k0 k0Var;
        m0 m0Var;
        j0 j0Var;
        ExoPlayer exoPlayer;
        Logger logger2;
        float f13;
        int i10 = this.label;
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 == 1) {
                context = (Context) this.L$4;
                f10 = (Float) this.L$3;
                file = (File) this.L$2;
                loopingAudioPlayer = (LoopingAudioPlayer) this.L$1;
                aVar = (a) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            aVar = this.this$0.mutex;
            loopingAudioPlayer = this.this$0;
            file = this.$file;
            f10 = this.$volume;
            context = this.$context;
            this.L$0 = aVar;
            this.L$1 = loopingAudioPlayer;
            this.L$2 = file;
            this.L$3 = f10;
            this.L$4 = context;
            this.I$0 = 0;
            this.label = 1;
            Object a10 = aVar.a(this);
            xn.a aVar2 = xn.a.f37986a;
            if (a10 == aVar2) {
                return aVar2;
            }
        }
        try {
            file2 = loopingAudioPlayer.currentFile;
            boolean c5 = kotlin.jvm.internal.m.c(file2, file);
            Object obj2 = z.f31622a;
            if (!c5 || exoPlayer == null || !((i0) exoPlayer).isPlaying()) {
                loopingAudioPlayer.internalStop();
                try {
                    f1 f1Var = new f1() { // from class: io.elevenlabs.player.audio.LoopingAudioPlayer$startLooping$2$1$listener$1
                        @Override // w7.f1
                        public void onPlaybackStateChanged(int playbackState) {
                            Logger logger3;
                            if (playbackState == 3) {
                                LoopingAudioPlayer.this.isPrepared = true;
                                logger3 = LoopingAudioPlayer.this.logger;
                                ib.i.r("Started looping soundscape: ", file.getName(), logger3, "LoopingAudioPlayer");
                            }
                        }

                        @Override // w7.f1
                        public void onPlayerError(a1 error) {
                            Logger logger3;
                            error.getClass();
                            logger3 = LoopingAudioPlayer.this.logger;
                            logger3.logError("LoopingAudioPlayer", "ExoPlayer error while looping soundscape", error);
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onCues(y7.c cVar) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(g1 g1Var, g1 g1Var2, int i11) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(d dVar) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i11) {
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
                        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
                        }

                        @Override // w7.f1
                        @Deprecated
                        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
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
                        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i11) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(a1 a1Var) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(u0 u0Var) {
                        }

                        @Override // w7.f1
                        @Deprecated
                        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i11) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i11) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j4) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j4) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
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
                        public /* bridge */ /* synthetic */ void onVolumeChanged(float f14) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i11, boolean z10) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onEvents(h1 h1Var, e1 e1Var) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onMediaItemTransition(r0 r0Var, int i11) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i11) {
                        }

                        @Override // w7.f1
                        @Deprecated
                        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i11) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i11, int i12) {
                        }

                        @Override // w7.f1
                        public /* bridge */ /* synthetic */ void onTimelineChanged(r1 r1Var, int i11) {
                        }
                    };
                    i0Var = new g8.p(context).a();
                    i0Var.setAudioAttributes(new d(2, 0, 1, 1, 0, false, true), false);
                    i0Var.setRepeatMode(1);
                    if (f10 == null) {
                        f11 = loopingAudioPlayer.currentVolume;
                    } else {
                        f11 = f10.floatValue();
                    }
                    loopingAudioPlayer.currentVolume = l.l(f11, u.P, 1.0f);
                    f12 = loopingAudioPlayer.currentVolume;
                    i0Var.setVolume(f12);
                    i0Var.f10736m.a(f1Var);
                    g0 g0Var = new g0();
                    lb.a aVar3 = new lb.a();
                    List list = Collections.EMPTY_LIST;
                    gh.w1 w1Var = gh.w1.f11531e;
                    k0 k0Var2 = new k0();
                    n0 n0Var = n0.f36483d;
                    Uri fromFile = Uri.fromFile(file);
                    if (((Uri) aVar3.f21640e) == null || ((UUID) aVar3.f21639d) != null) {
                        z6 = true;
                    }
                    b.y(z6);
                    if (fromFile != null) {
                        k0Var = k0Var2;
                        if (((UUID) aVar3.f21639d) != null) {
                            j0Var = new j0(aVar3);
                        } else {
                            j0Var = null;
                        }
                        m0Var = new m0(fromFile, null, j0Var, null, list, null, w1Var, -9223372036854775807L);
                    } else {
                        k0Var = k0Var2;
                        m0Var = null;
                    }
                    i0Var.setMediaItem(new r0("", new h0(g0Var), m0Var, new l0(k0Var), u0.L, n0Var));
                    i0Var.prepare();
                    i0Var.setPlayWhenReady(true);
                    try {
                        loopingAudioPlayer.exoPlayer = i0Var;
                        loopingAudioPlayer.playerListener = f1Var;
                        loopingAudioPlayer.currentFile = file;
                    } catch (Exception e10) {
                        e = e10;
                        logger = loopingAudioPlayer.logger;
                        logger.logError("LoopingAudioPlayer", "Failed to start looping audio", e);
                        if (i0Var != null) {
                            i0Var.release();
                        }
                        loopingAudioPlayer.internalStop();
                        obj2 = new sn.l(e);
                        m mVar = new m(obj2);
                        aVar.n(null);
                        return mVar;
                    }
                } catch (Exception e11) {
                    e = e11;
                    i0Var = null;
                }
            } else {
                logger2 = loopingAudioPlayer.logger;
                logger2.log("LoopingAudioPlayer", "File is already playing, updating volume to " + f10);
                if (f10 != null) {
                    f13 = f10.floatValue();
                } else {
                    f13 = 0.25f;
                }
                loopingAudioPlayer.setVolume(f13);
            }
            m mVar2 = new m(obj2);
            aVar.n(null);
            return mVar2;
        } catch (Throwable th) {
            aVar.n(null);
            throw th;
        }
    }
}

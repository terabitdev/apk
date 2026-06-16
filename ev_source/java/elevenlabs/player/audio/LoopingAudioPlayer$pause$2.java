package io.elevenlabs.player.audio;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.protobuf.c6;
import fr.d0;
import g8.i0;
import ho.p;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import or.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.audio.LoopingAudioPlayer$pause$2", f = "LoopingAudioPlayer.kt", l = {174}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class LoopingAudioPlayer$pause$2 extends i implements p {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LoopingAudioPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopingAudioPlayer$pause$2(LoopingAudioPlayer loopingAudioPlayer, c<? super LoopingAudioPlayer$pause$2> cVar) {
        super(2, cVar);
        this.this$0 = loopingAudioPlayer;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LoopingAudioPlayer$pause$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((LoopingAudioPlayer$pause$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        LoopingAudioPlayer loopingAudioPlayer;
        ExoPlayer exoPlayer;
        ExoPlayer exoPlayer2;
        Logger logger;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
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
            this.L$0 = aVar;
            this.L$1 = loopingAudioPlayer;
            this.I$0 = 0;
            this.label = 1;
            Object a10 = aVar.a(this);
            xn.a aVar2 = xn.a.f37986a;
            if (a10 == aVar2) {
                return aVar2;
            }
        }
        try {
            exoPlayer = loopingAudioPlayer.exoPlayer;
            if (exoPlayer != null && ((i0) exoPlayer).isPlaying()) {
                exoPlayer2 = loopingAudioPlayer.exoPlayer;
                if (exoPlayer2 != null) {
                    ((i0) exoPlayer2).setPlayWhenReady(false);
                }
                logger = loopingAudioPlayer.logger;
                logger.log("LoopingAudioPlayer", "Paused soundscape playback");
            }
            aVar.n(null);
            return z.f31622a;
        } catch (Throwable th) {
            aVar.n(null);
            throw th;
        }
    }
}

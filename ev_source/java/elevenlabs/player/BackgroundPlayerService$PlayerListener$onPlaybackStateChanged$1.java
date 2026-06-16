package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import sn.z;
import w7.h1;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$1 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        long j4;
        int i11;
        long j10;
        if (this.label == 0) {
            sn.a.g(obj);
            Logger logger = this.this$0.getLogger();
            String str = this.this$0.tag;
            i10 = this.this$0.pendingSeekChapterIndex;
            j4 = this.this$0.pendingSeekPositionMs;
            logger.log(str, "Performing initial seek to chapter " + i10 + " at " + j4 + "ms");
            h1 player = this.this$0.getPlayer();
            i11 = this.this$0.pendingSeekChapterIndex;
            j10 = this.this$0.pendingSeekPositionMs;
            player.seekTo(i11, j10);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

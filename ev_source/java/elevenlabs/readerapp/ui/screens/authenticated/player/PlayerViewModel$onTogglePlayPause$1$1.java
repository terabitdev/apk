package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.player.PlayerService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$onTogglePlayPause$1$1", f = "PlayerViewModel.kt", l = {839, 849, 850}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$onTogglePlayPause$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $firstChapterNumber;
    final /* synthetic */ PlayerState $this_queueStateUpdate;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$onTogglePlayPause$1$1(PlayerViewModel playerViewModel, PlayerState playerState, String str, wn.c<? super PlayerViewModel$onTogglePlayPause$1$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$this_queueStateUpdate = playerState;
        this.$firstChapterNumber = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$onTogglePlayPause$1$1(this.this$0, this.$this_queueStateUpdate, this.$firstChapterNumber, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$onTogglePlayPause$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        if (r12.togglePlayPause(r11) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r12.seekToChapter(0, 0, r11) != r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r5.updateAudioPosition(r6, r7, 0.0d, r10) == r4) goto L31;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PlayerViewModel$onTogglePlayPause$1$1 playerViewModel$onTogglePlayPause$1$1;
        Exception exc;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                playerViewModel$onTogglePlayPause$1$1 = this;
                PlayerService playerService = (PlayerService) playerViewModel$onTogglePlayPause$1$1.this$0.playerService.get();
                playerViewModel$onTogglePlayPause$1$1.label = 3;
            } else {
                try {
                    sn.a.g(obj);
                    playerViewModel$onTogglePlayPause$1$1 = this;
                } catch (Exception e10) {
                    exc = e10;
                    playerViewModel$onTogglePlayPause$1$1 = this;
                    ib.i.r("Error updating position on restart: ", exc.getMessage(), playerViewModel$onTogglePlayPause$1$1.this$0.logger, playerViewModel$onTogglePlayPause$1$1.this$0.tag);
                    PlayerService playerService2 = (PlayerService) playerViewModel$onTogglePlayPause$1$1.this$0.playerService.get();
                    playerViewModel$onTogglePlayPause$1$1.label = 2;
                }
            }
        } else {
            sn.a.g(obj);
            try {
                ReadsService readsService = (ReadsService) this.this$0.readsService.get();
                String readId = this.$this_queueStateUpdate.getContentState().getReadMeta().getReadId();
                String str = this.$firstChapterNumber;
                this.label = 1;
                playerViewModel$onTogglePlayPause$1$1 = this;
            } catch (Exception e11) {
                e = e11;
                playerViewModel$onTogglePlayPause$1$1 = this;
            }
            try {
            } catch (Exception e12) {
                e = e12;
                exc = e;
                ib.i.r("Error updating position on restart: ", exc.getMessage(), playerViewModel$onTogglePlayPause$1$1.this$0.logger, playerViewModel$onTogglePlayPause$1$1.this$0.tag);
                PlayerService playerService22 = (PlayerService) playerViewModel$onTogglePlayPause$1$1.this$0.playerService.get();
                playerViewModel$onTogglePlayPause$1$1.label = 2;
            }
        }
        PlayerService playerService222 = (PlayerService) playerViewModel$onTogglePlayPause$1$1.this$0.playerService.get();
        playerViewModel$onTogglePlayPause$1$1.label = 2;
    }
}

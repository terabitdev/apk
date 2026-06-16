package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.player.PlayerService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$delete$1$1", f = "PlayerViewModel.kt", l = {1962, 1963, 1964}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$delete$1$1 extends yn.i implements ho.p {
    final /* synthetic */ PlayerState $this_queueStateUpdate;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$delete$1$1(PlayerViewModel playerViewModel, PlayerState playerState, wn.c<? super PlayerViewModel$delete$1$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$this_queueStateUpdate = playerState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$delete$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$delete$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r6.removeDownloadsForRead(r0, r5) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r6.remove(r0, r5) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r6.release(r5) == r4) goto L43;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        int i10 = this.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        this.this$0.queueStateUpdate(new i1(8));
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                aVar = this.this$0.offlineReadsService;
                OfflineReadsService offlineReadsService = (OfflineReadsService) aVar.get();
                String readId = this.$this_queueStateUpdate.getReadId();
                this.label = 3;
            } else {
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            PlayerService playerService = (PlayerService) this.this$0.playerService.get();
            this.label = 1;
        }
        ReadsService readsService = (ReadsService) this.this$0.readsService.get();
        String readId2 = this.$this_queueStateUpdate.getReadId();
        this.label = 2;
    }
}

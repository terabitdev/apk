package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1$1$readMeta$1", f = "PlayerViewModel.kt", l = {1033}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/domain/model/ReadMeta;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerViewModel$load$1$1$1$readMeta$1 extends yn.i implements ho.l {
    final /* synthetic */ PlayerState $this_queueStateUpdate;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$load$1$1$1$readMeta$1(PlayerViewModel playerViewModel, PlayerState playerState, wn.c<? super PlayerViewModel$load$1$1$1$readMeta$1> cVar) {
        super(1, cVar);
        this.this$0 = playerViewModel;
        this.$this_queueStateUpdate = playerState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(wn.c<?> cVar) {
        return new PlayerViewModel$load$1$1$1$readMeta$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super ReadMeta> cVar) {
        return ((PlayerViewModel$load$1$1$1$readMeta$1) create(cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        ReadsService readsService = (ReadsService) this.this$0.readsService.get();
        String readId = this.$this_queueStateUpdate.getReadId();
        this.label = 1;
        Object read = readsService.getRead(readId, this);
        xn.a aVar = xn.a.f37986a;
        if (read == aVar) {
            return aVar;
        }
        return read;
    }
}

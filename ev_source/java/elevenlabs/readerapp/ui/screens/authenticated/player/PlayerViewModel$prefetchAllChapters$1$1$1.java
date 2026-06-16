package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$prefetchAllChapters$1$1$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$prefetchAllChapters$1$1$1 extends yn.i implements ho.p {
    final /* synthetic */ List<Integer> $chunk;
    final /* synthetic */ String $readId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$prefetchAllChapters$1$1$1(List<Integer> list, PlayerViewModel playerViewModel, String str, wn.c<? super PlayerViewModel$prefetchAllChapters$1$1$1> cVar) {
        super(2, cVar);
        this.$chunk = list;
        this.this$0 = playerViewModel;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        PlayerViewModel$prefetchAllChapters$1$1$1 playerViewModel$prefetchAllChapters$1$1$1 = new PlayerViewModel$prefetchAllChapters$1$1$1(this.$chunk, this.this$0, this.$readId, cVar);
        playerViewModel$prefetchAllChapters$1$1$1.L$0 = obj;
        return playerViewModel$prefetchAllChapters$1$1$1;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$prefetchAllChapters$1$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        fr.d0 d0Var = (fr.d0) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            List<Integer> list = this.$chunk;
            PlayerViewModel playerViewModel = this.this$0;
            String str = this.$readId;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                fr.g0.D(d0Var, null, null, new PlayerViewModel$prefetchAllChapters$1$1$1$1$1(playerViewModel, str, ((Number) it.next()).intValue(), null), 3);
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

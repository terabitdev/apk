package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueContract;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$onItemRemove$1", f = "PlayerQueueViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerQueueViewModel$onItemRemove$1 extends i implements p {
    final /* synthetic */ MediaItemState $item;
    int label;
    final /* synthetic */ PlayerQueueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerQueueViewModel$onItemRemove$1(PlayerQueueViewModel playerQueueViewModel, MediaItemState mediaItemState, wn.c<? super PlayerQueueViewModel$onItemRemove$1> cVar) {
        super(2, cVar);
        this.this$0 = playerQueueViewModel;
        this.$item = mediaItemState;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PlayerQueueViewModel$onItemRemove$1(this.this$0, this.$item, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PlayerQueueViewModel$onItemRemove$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            PlayerService playerService = this.this$0.playerService;
            String readId = this.$item.getReadId();
            this.label = 1;
            Object removeFromQueue = playerService.removeFromQueue(readId, this);
            xn.a aVar = xn.a.f37986a;
            if (removeFromQueue == aVar) {
                return aVar;
            }
        }
        PlayerQueueViewModel playerQueueViewModel = this.this$0;
        MediaItemState mediaItemState = this.$item;
        PlayerQueueContract.DomainState domainState = (PlayerQueueContract.DomainState) playerQueueViewModel.getStateFlow().getValue();
        if (domainState instanceof PlayerQueueContract.DomainState.Data) {
            Analytics analytics = playerQueueViewModel.analytics;
            String readId2 = mediaItemState.getReadId();
            MediaItemState fallbackActiveItem = ((PlayerQueueContract.DomainState.Data) domainState).getFallbackActiveItem();
            if (fallbackActiveItem == null || (str = fallbackActiveItem.getReadId()) == null) {
                str = "unknown";
            }
            analytics.log(new Analytics.Event.PlayerRemoveFromQueueClicked(Analytics.Event.PlayerRemoveFromQueueClicked.Source.PlayerQueue, readId2, null, str, 4, null));
        }
        return z.f31622a;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueContract;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$onItemClick$1", f = "PlayerQueueViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerQueueViewModel$onItemClick$1 extends i implements p {
    final /* synthetic */ MediaItemState $item;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ PlayerQueueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerQueueViewModel$onItemClick$1(PlayerQueueViewModel playerQueueViewModel, MediaItemState mediaItemState, wn.c<? super PlayerQueueViewModel$onItemClick$1> cVar) {
        super(2, cVar);
        this.this$0 = playerQueueViewModel;
        this.$item = mediaItemState;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PlayerQueueViewModel$onItemClick$1(this.this$0, this.$item, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PlayerQueueViewModel$onItemClick$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        MediaItemState mediaItemState;
        PlayerQueueContract.DomainState.Data data;
        String str;
        PlayerQueueViewModel playerQueueViewModel;
        String str2;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                data = (PlayerQueueContract.DomainState.Data) this.L$4;
                playerQueueViewModel = (PlayerQueueViewModel) this.L$2;
                mediaItemState = (MediaItemState) this.L$1;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            PlayerQueueViewModel playerQueueViewModel2 = this.this$0;
            mediaItemState = this.$item;
            PlayerQueueContract.DomainState domainState = (PlayerQueueContract.DomainState) playerQueueViewModel2.getStateFlow().getValue();
            if (domainState instanceof PlayerQueueContract.DomainState.Data) {
                data = (PlayerQueueContract.DomainState.Data) domainState;
                String readId = mediaItemState.getReadId();
                MediaItemState currentItem = data.getQueue().getCurrentItem();
                if (currentItem != null) {
                    str = currentItem.getReadId();
                } else {
                    str = null;
                }
                if (!m.c(readId, str)) {
                    PlayerService playerService = playerQueueViewModel2.playerService;
                    String readId2 = mediaItemState.getReadId();
                    this.L$0 = null;
                    this.L$1 = mediaItemState;
                    this.L$2 = playerQueueViewModel2;
                    this.L$3 = null;
                    this.L$4 = data;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    Object seekToItem = playerService.seekToItem(readId2, this);
                    xn.a aVar = xn.a.f37986a;
                    if (seekToItem == aVar) {
                        return aVar;
                    }
                    playerQueueViewModel = playerQueueViewModel2;
                }
            }
            return z.f31622a;
        }
        Analytics analytics = playerQueueViewModel.analytics;
        String readId3 = mediaItemState.getReadId();
        MediaItemState fallbackActiveItem = data.getFallbackActiveItem();
        if (fallbackActiveItem == null || (str2 = fallbackActiveItem.getReadId()) == null) {
            str2 = "unknown";
        }
        analytics.log(new Analytics.Event.PlayerQueueScreenItemClicked(readId3, str2));
        return z.f31622a;
    }
}

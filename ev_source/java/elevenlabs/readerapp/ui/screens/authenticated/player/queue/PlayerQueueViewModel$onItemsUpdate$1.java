package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.services.player.PlayerService;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import tn.t;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$onItemsUpdate$1", f = "PlayerQueueViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerQueueViewModel$onItemsUpdate$1 extends i implements p {
    final /* synthetic */ MediaItemState $draggedItem;
    final /* synthetic */ List<MediaItemState> $items;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PlayerQueueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerQueueViewModel$onItemsUpdate$1(PlayerQueueViewModel playerQueueViewModel, MediaItemState mediaItemState, List<MediaItemState> list, wn.c<? super PlayerQueueViewModel$onItemsUpdate$1> cVar) {
        super(2, cVar);
        this.this$0 = playerQueueViewModel;
        this.$draggedItem = mediaItemState;
        this.$items = list;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PlayerQueueViewModel$onItemsUpdate$1(this.this$0, this.$draggedItem, this.$items, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PlayerQueueViewModel$onItemsUpdate$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        List<MediaItemState> list;
        String str;
        int i10;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            MediaQueueState mediaQueueState = (MediaQueueState) this.this$0.playerService.observeQueueState().getValue();
            if (mediaQueueState != null) {
                list = mediaQueueState.getItems();
            } else {
                list = null;
            }
            if (list == null) {
                list = t.f33547a;
            }
            Analytics analytics = this.this$0.analytics;
            MediaItemState mediaItemState = this.this$0.fallbackActiveItem;
            if (mediaItemState == null || (str = mediaItemState.getReadId()) == null) {
                str = "unknown";
            }
            String str2 = str;
            String readId = this.$draggedItem.getReadId();
            List<MediaItemState> list2 = this.$items;
            MediaItemState mediaItemState2 = this.$draggedItem;
            Iterator<MediaItemState> it = list2.iterator();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = -1;
                if (it.hasNext()) {
                    if (m.c(it.next().getReadId(), mediaItemState2.getReadId())) {
                        break;
                    }
                    i13++;
                } else {
                    i13 = -1;
                    break;
                }
            }
            int i14 = i13 + 1;
            MediaItemState mediaItemState3 = this.$draggedItem;
            Iterator<MediaItemState> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m.c(it2.next().getReadId(), mediaItemState3.getReadId())) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (mediaQueueState != null) {
                i10 = mediaQueueState.getCurrentIndex();
            }
            analytics.log(new Analytics.Event.PlayerQueueScreenItemsReordered(readId, str2, i12, i14, i10));
            PlayerService playerService = this.this$0.playerService;
            List<MediaItemState> list3 = this.$items;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object futureQueue = playerService.setFutureQueue(list3, this);
            xn.a aVar = xn.a.f37986a;
            if (futureQueue == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}

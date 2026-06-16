package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueContract;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toUiState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerQueueUiMapperKt {
    public static final PlayerQueueContract.UiState toUiState(PlayerQueueContract.DomainState domainState) {
        domainState.getClass();
        if (domainState instanceof PlayerQueueContract.DomainState.Initial) {
            return PlayerQueueContract.UiState.Loading.INSTANCE;
        }
        if (domainState instanceof PlayerQueueContract.DomainState.Data) {
            PlayerQueueContract.DomainState.Data data = (PlayerQueueContract.DomainState.Data) domainState;
            MediaItemState currentItem = data.getQueue().getCurrentItem();
            if (currentItem == null && (currentItem = data.getFallbackActiveItem()) == null) {
                return PlayerQueueContract.UiState.Loading.INSTANCE;
            }
            if (data.getQueue().getCurrentItem() == null && data.getQueue().getItems().isEmpty()) {
                return new PlayerQueueContract.UiState.EmptyQueue(currentItem);
            }
            List<MediaItemState> subList = data.getQueue().getItems().subList(data.getQueue().getCurrentIndex() + 1, data.getQueue().getItems().size());
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : subList) {
                if (hashSet.add(((MediaItemState) obj).getReadId())) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return new PlayerQueueContract.UiState.EmptyQueue(currentItem);
            }
            return new PlayerQueueContract.UiState.NonEmptyQueue(currentItem, arrayList);
        }
        c6.p();
        return null;
    }
}

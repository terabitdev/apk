package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import ho.p;
import io.elevenlabs.domain.model.MediaItemState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class PlayerQueueScreenKt$PlayerQueueScreen$4$1 extends j implements p {
    public PlayerQueueScreenKt$PlayerQueueScreen$4$1(Object obj) {
        super(2, 0, PlayerQueueViewModel.class, obj, "onItemsUpdate", "onItemsUpdate(Lio/elevenlabs/domain/model/MediaItemState;Ljava/util/List;)V");
    }

    public final void invoke(MediaItemState mediaItemState, List<MediaItemState> list) {
        mediaItemState.getClass();
        list.getClass();
        ((PlayerQueueViewModel) this.receiver).onItemsUpdate(mediaItemState, list);
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((MediaItemState) obj, (List<MediaItemState>) obj2);
        return z.f31622a;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import ho.l;
import io.elevenlabs.domain.model.MediaItemState;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class PlayerQueueScreenKt$PlayerQueueScreen$3$1 extends j implements l {
    public PlayerQueueScreenKt$PlayerQueueScreen$3$1(Object obj) {
        super(1, 0, PlayerQueueViewModel.class, obj, "onItemClick", "onItemClick(Lio/elevenlabs/domain/model/MediaItemState;)V");
    }

    public final void invoke(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        ((PlayerQueueViewModel) this.receiver).onItemClick(mediaItemState);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MediaItemState) obj);
        return z.f31622a;
    }
}

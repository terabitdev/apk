package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerContract;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class MiniPlayerKt$MiniPlayer$3$1 extends j implements l {
    public MiniPlayerKt$MiniPlayer$3$1(Object obj) {
        super(1, 0, MiniPlayerViewModel.class, obj, "onEvent", "onEvent(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;)V");
    }

    public final void invoke(MiniPlayerContract.Event event) {
        event.getClass();
        ((MiniPlayerViewModel) this.receiver).onEvent(event);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MiniPlayerContract.Event) obj);
        return z.f31622a;
    }
}

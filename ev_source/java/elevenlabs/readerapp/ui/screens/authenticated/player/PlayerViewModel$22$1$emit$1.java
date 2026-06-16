package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.PlayerError;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$22$1", f = "PlayerViewModel.kt", l = {575}, m = "emit", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerViewModel$22$1$emit$1 extends yn.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlayerViewModel.AnonymousClass22.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerViewModel$22$1$emit$1(PlayerViewModel.AnonymousClass22.AnonymousClass1<? super T> anonymousClass1, wn.c<? super PlayerViewModel$22$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass1;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((PlayerError) null, (wn.c<? super sn.z>) this);
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel", f = "PlayerViewModel.kt", l = {1162, 1162}, m = "loadHtmlContent", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerViewModel$loadHtmlContent$1 extends yn.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$loadHtmlContent$1(PlayerViewModel playerViewModel, wn.c<? super PlayerViewModel$loadHtmlContent$1> cVar) {
        super(cVar);
        this.this$0 = playerViewModel;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object loadHtmlContent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadHtmlContent = this.this$0.loadHtmlContent(null, null, this);
        return loadHtmlContent;
    }
}

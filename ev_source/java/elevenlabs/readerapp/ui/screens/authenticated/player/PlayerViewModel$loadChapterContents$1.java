package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel", f = "PlayerViewModel.kt", l = {1280}, m = "loadChapterContents", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerViewModel$loadChapterContents$1 extends yn.c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$loadChapterContents$1(PlayerViewModel playerViewModel, wn.c<? super PlayerViewModel$loadChapterContents$1> cVar) {
        super(cVar);
        this.this$0 = playerViewModel;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object loadChapterContents;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadChapterContents = this.this$0.loadChapterContents(null, null, null, this);
        return loadChapterContents;
    }
}

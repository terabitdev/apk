package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.OptimizedReadPreparation;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$loadChapterContentForBookmark$prepared$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/elevenlabs/domain/model/OptimizedReadPreparation;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerViewModel$loadChapterContentForBookmark$prepared$1 extends yn.i implements ho.p {
    /* synthetic */ Object L$0;
    int label;

    public PlayerViewModel$loadChapterContentForBookmark$prepared$1(wn.c<? super PlayerViewModel$loadChapterContentForBookmark$prepared$1> cVar) {
        super(2, cVar);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        PlayerViewModel$loadChapterContentForBookmark$prepared$1 playerViewModel$loadChapterContentForBookmark$prepared$1 = new PlayerViewModel$loadChapterContentForBookmark$prepared$1(cVar);
        playerViewModel$loadChapterContentForBookmark$prepared$1.L$0 = obj;
        return playerViewModel$loadChapterContentForBookmark$prepared$1;
    }

    @Override // ho.p
    public final Object invoke(OptimizedReadPreparation optimizedReadPreparation, wn.c<? super Boolean> cVar) {
        return ((PlayerViewModel$loadChapterContentForBookmark$prepared$1) create(optimizedReadPreparation, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        OptimizedReadPreparation optimizedReadPreparation = (OptimizedReadPreparation) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            return Boolean.valueOf(optimizedReadPreparation instanceof OptimizedReadPreparation.Ready);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

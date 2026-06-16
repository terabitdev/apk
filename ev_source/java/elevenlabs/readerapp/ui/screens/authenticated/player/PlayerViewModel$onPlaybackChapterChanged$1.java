package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$onPlaybackChapterChanged$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$onPlaybackChapterChanged$1 extends yn.i implements ho.p {
    final /* synthetic */ int $chapterIndex;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$onPlaybackChapterChanged$1(PlayerViewModel playerViewModel, int i10, wn.c<? super PlayerViewModel$onPlaybackChapterChanged$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$chapterIndex = i10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$onPlaybackChapterChanged$1(this.this$0, this.$chapterIndex, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$onPlaybackChapterChanged$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            String readId = ((PlayerState) this.this$0.getStateFlow().getValue()).getReadId();
            sn.z zVar = sn.z.f31622a;
            if (readId != null) {
                this.this$0.ensureWindowLoaded(readId, this.$chapterIndex);
                return zVar;
            }
            return zVar;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

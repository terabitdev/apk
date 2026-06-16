package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.OfflineReadsService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$removeChapterDownload$1", f = "PlayerViewModel.kt", l = {2546}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$removeChapterDownload$1 extends yn.i implements ho.p {
    final /* synthetic */ int $chapterIndex;
    final /* synthetic */ ReadMeta $readMeta;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$removeChapterDownload$1(PlayerViewModel playerViewModel, ReadMeta readMeta, int i10, wn.c<? super PlayerViewModel$removeChapterDownload$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$readMeta = readMeta;
        this.$chapterIndex = i10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$removeChapterDownload$1(this.this$0, this.$readMeta, this.$chapterIndex, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$removeChapterDownload$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            aVar = this.this$0.offlineReadsService;
            OfflineReadsService offlineReadsService = (OfflineReadsService) aVar.get();
            String readId = this.$readMeta.getReadId();
            int i11 = this.$chapterIndex;
            this.label = 1;
            Object removeChapterDownload = offlineReadsService.removeChapterDownload(readId, i11, this);
            xn.a aVar2 = xn.a.f37986a;
            if (removeChapterDownload == aVar2) {
                return aVar2;
            }
        }
        return sn.z.f31622a;
    }
}

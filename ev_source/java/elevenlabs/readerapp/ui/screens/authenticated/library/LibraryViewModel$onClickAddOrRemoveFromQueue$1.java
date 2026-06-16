package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$onClickAddOrRemoveFromQueue$1", f = "LibraryViewModel.kt", l = {224, 237}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class LibraryViewModel$onClickAddOrRemoveFromQueue$1 extends yn.i implements ho.p {
    final /* synthetic */ ReadMeta $readMeta;
    int label;
    final /* synthetic */ LibraryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$onClickAddOrRemoveFromQueue$1(LibraryViewModel libraryViewModel, ReadMeta readMeta, wn.c<? super LibraryViewModel$onClickAddOrRemoveFromQueue$1> cVar) {
        super(2, cVar);
        this.this$0 = libraryViewModel;
        this.$readMeta = readMeta;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new LibraryViewModel$onClickAddOrRemoveFromQueue$1(this.this$0, this.$readMeta, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((LibraryViewModel$onClickAddOrRemoveFromQueue$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        if (r9.addToQueue(r0, r8) == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r9.removeFromQueue(r0, r8) == r3) goto L26;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ToastService toastService;
        ToastService toastService2;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    toastService2 = this.this$0.toastService;
                    ToastService.showToast$default(toastService2, this.this$0.stringProvider.getString(R.string.player_queue_result_toast_added_to_queue), null, ToastService.ToastVariant.SUCCESS, 2, null);
                    this.this$0.getAnalytics().log(new Analytics.Event.PlayerAddToQueueClicked(Analytics.Event.PlayerAddToQueueClicked.Source.LibrarySwipeAction, this.$readMeta.getReadId(), null));
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                toastService = this.this$0.toastService;
                ToastService.showToast$default(toastService, this.this$0.stringProvider.getString(R.string.player_queue_result_toast_removed_from_queue), null, ToastService.ToastVariant.SUCCESS, 2, null);
                this.this$0.getAnalytics().log(new Analytics.Event.PlayerRemoveFromQueueClicked(Analytics.Event.PlayerRemoveFromQueueClicked.Source.LibrarySwipeAction, this.$readMeta.getReadId(), null, null, 12, null));
            }
        } else {
            sn.a.g(obj);
            List<MediaItemState> playerQueue = ((LibraryState) this.this$0.getStateFlow().getValue()).getPlayerQueue();
            ReadMeta readMeta = this.$readMeta;
            xn.a aVar = xn.a.f37986a;
            if (playerQueue == null || !playerQueue.isEmpty()) {
                Iterator<T> it = playerQueue.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.m.c(((MediaItemState) it.next()).getReadId(), readMeta.getReadId())) {
                        PlayerService playerService = this.this$0.playerService;
                        String readId = this.$readMeta.getReadId();
                        this.label = 1;
                    }
                }
            }
            PlayerService playerService2 = this.this$0.playerService;
            ReadMeta readMeta2 = this.$readMeta;
            this.label = 2;
        }
        return sn.z.f31622a;
    }
}

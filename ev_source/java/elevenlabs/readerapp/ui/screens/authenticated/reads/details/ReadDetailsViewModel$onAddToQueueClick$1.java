package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$onAddToQueueClick$1", f = "ReadDetailsViewModel.kt", l = {167}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$onAddToQueueClick$1 extends yn.i implements ho.p {
    Object L$0;
    int label;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$onAddToQueueClick$1(ReadDetailsViewModel readDetailsViewModel, wn.c<? super ReadDetailsViewModel$onAddToQueueClick$1> cVar) {
        super(2, cVar);
        this.this$0 = readDetailsViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsViewModel$onAddToQueueClick$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsViewModel$onAddToQueueClick$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadMeta readMeta;
        ToastService toastService;
        StringProvider stringProvider;
        Analytics analytics;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                readMeta = (ReadMeta) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            readMeta = ((ReadDetailsState) this.this$0.getStateFlow().getValue()).getReadMeta();
            if (readMeta != null) {
                PlayerService playerService = this.this$0.playerService;
                this.L$0 = readMeta;
                this.label = 1;
                Object addToQueue = playerService.addToQueue(readMeta, this);
                xn.a aVar = xn.a.f37986a;
                if (addToQueue == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
        toastService = this.this$0.toastService;
        stringProvider = this.this$0.stringProvider;
        ToastService.showToast$default(toastService, stringProvider.getString(R.string.player_queue_result_toast_added_to_queue), null, ToastService.ToastVariant.SUCCESS, 2, null);
        analytics = this.this$0.analytics;
        analytics.log(new Analytics.Event.PlayerAddToQueueClicked(Analytics.Event.PlayerAddToQueueClicked.Source.ReadDetailsMoreActions, readMeta.getReadId(), null));
        return sn.z.f31622a;
    }
}

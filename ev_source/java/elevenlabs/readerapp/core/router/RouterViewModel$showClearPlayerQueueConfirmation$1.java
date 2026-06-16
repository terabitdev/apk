package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.readerapp.core.router.ClearPlayerQueueConfirmation;
import ir.z1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$showClearPlayerQueueConfirmation$1", f = "RouterViewModel.kt", l = {322}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterViewModel$showClearPlayerQueueConfirmation$1 extends yn.i implements ho.p {
    final /* synthetic */ Analytics.Event.PlayerAddToQueueClicked.Source $addToQueueSource;
    final /* synthetic */ String $collectionId;
    final /* synthetic */ Analytics.Event.PlayerActivationSource $playerActivationSource;
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ RouterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterViewModel$showClearPlayerQueueConfirmation$1(RouterViewModel routerViewModel, Analytics.Event.PlayerAddToQueueClicked.Source source, String str, String str2, Analytics.Event.PlayerActivationSource playerActivationSource, wn.c<? super RouterViewModel$showClearPlayerQueueConfirmation$1> cVar) {
        super(2, cVar);
        this.this$0 = routerViewModel;
        this.$addToQueueSource = source;
        this.$readId = str;
        this.$collectionId = str2;
        this.$playerActivationSource = playerActivationSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState invokeSuspend$lambda$0(MediaQueueState mediaQueueState, int i10, String str, Analytics.Event.PlayerActivationSource playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source source, String str2, RouterState routerState) {
        int i11;
        List<MediaItemState> items;
        if (mediaQueueState != null && (items = mediaQueueState.getItems()) != null) {
            i11 = items.size();
        } else {
            i11 = -1;
        }
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, new ClearPlayerQueueConfirmation.Shown(i10, i11, str, playerActivationSource, source, str2), false, false, false, false, false, null, null, null, null, null, 262015, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterViewModel$showClearPlayerQueueConfirmation$1(this.this$0, this.$addToQueueSource, this.$readId, this.$collectionId, this.$playerActivationSource, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterViewModel$showClearPlayerQueueConfirmation$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [no.g, no.e] */
    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int size;
        int i10;
        List<MediaItemState> items;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            z1 observeQueueState = this.this$0.playerService.observeQueueState();
            this.label = 1;
            obj = ir.r.u(observeQueueState, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        final MediaQueueState mediaQueueState = (MediaQueueState) obj;
        int i12 = 0;
        if (mediaQueueState != null && (size = mediaQueueState.getItems().size() - ae.l.n(mediaQueueState.getCurrentIndex(), new no.e(0, mediaQueueState.getItems().size(), 1))) >= 0) {
            i12 = size;
        }
        final int i13 = i12;
        Analytics analytics = this.this$0.getAnalytics();
        Analytics.Event.PlayerAddToQueueClicked.Source source = this.$addToQueueSource;
        String str = this.$readId;
        String str2 = this.$collectionId;
        if (mediaQueueState != null && (items = mediaQueueState.getItems()) != null) {
            i10 = items.size();
        } else {
            i10 = -1;
        }
        analytics.log(new Analytics.Event.PlayerQueueConfirmationShown(source, str, str2, i10, i13));
        RouterViewModel routerViewModel = this.this$0;
        final String str3 = this.$readId;
        final Analytics.Event.PlayerActivationSource playerActivationSource = this.$playerActivationSource;
        final Analytics.Event.PlayerAddToQueueClicked.Source source2 = this.$addToQueueSource;
        final String str4 = this.$collectionId;
        routerViewModel.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.core.router.h0
            @Override // ho.l
            public final Object invoke(Object obj2) {
                RouterState invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = RouterViewModel$showClearPlayerQueueConfirmation$1.invokeSuspend$lambda$0(MediaQueueState.this, i13, str3, playerActivationSource, source2, str4, (RouterState) obj2);
                return invokeSuspend$lambda$0;
            }
        });
        return sn.z.f31622a;
    }
}

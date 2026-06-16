package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
import ir.r;
import java.util.List;
import jr.j;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListBaseViewModel$handleObserveVoices$1", f = "VoicesListBaseViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicesListBaseViewModel$handleObserveVoices$1 extends i implements p {
    int label;
    final /* synthetic */ VoicesListBaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicesListBaseViewModel$handleObserveVoices$1(VoicesListBaseViewModel voicesListBaseViewModel, wn.c<? super VoicesListBaseViewModel$handleObserveVoices$1> cVar) {
        super(2, cVar);
        this.this$0 = voicesListBaseViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicesListBaseViewModel$handleObserveVoices$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicesListBaseViewModel$handleObserveVoices$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConnectivityService connectivityService;
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
            connectivityService = this.this$0.connectivityService;
            j G = r.G(connectivityService.getIsConnected(), new VoicesListBaseViewModel$handleObserveVoices$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            Object collect = G.collect(anonymousClass2, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListBaseViewModel$handleObserveVoices$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2<T> implements ir.j {
        final /* synthetic */ VoicesListBaseViewModel this$0;

        public AnonymousClass2(VoicesListBaseViewModel voicesListBaseViewModel) {
            this.this$0 = voicesListBaseViewModel;
        }

        public static final VoicesListContract.State emit$lambda$0(List list, VoicesListContract.State state) {
            state.getClass();
            return VoicesListContract.State.copy$default(state, null, list, 1, null);
        }

        public final Object emit(List<Voice> list, wn.c<? super z> cVar) {
            if (!list.isEmpty()) {
                this.this$0.queueStateUpdate(new c(list, 0));
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((List<Voice>) obj, (wn.c<? super z>) cVar);
        }
    }
}

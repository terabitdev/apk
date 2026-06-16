package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadRecommendedVoices$1;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadRecommendedVoices$1", f = "VoicePickerExploreViewModel.kt", l = {119}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerExploreViewModel$loadRecommendedVoices$1 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerExploreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerExploreViewModel$loadRecommendedVoices$1(VoicePickerExploreViewModel voicePickerExploreViewModel, wn.c<? super VoicePickerExploreViewModel$loadRecommendedVoices$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerExploreViewModel;
    }

    public static final VoicePickerExploreContract.State invokeSuspend$lambda$0(VoicePickerExploreContract.State state) {
        return VoicePickerExploreContract.State.copy$default(state, VoicePickerExploreContract.RecommendedVoicesState.Loading.INSTANCE, null, null, 6, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerExploreViewModel$loadRecommendedVoices$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerExploreViewModel$loadRecommendedVoices$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            this.this$0.queueStateUpdate(new f(2));
            connectivityService = this.this$0.connectivityService;
            ir.i o6 = r.o(r.G(connectivityService.getIsConnected(), new VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
            this.label = 1;
            Object collect = o6.collect(anonymousClass3, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadRecommendedVoices$1$3 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3<T> implements ir.j {
        final /* synthetic */ VoicePickerExploreViewModel this$0;

        public AnonymousClass3(VoicePickerExploreViewModel voicePickerExploreViewModel) {
            this.this$0 = voicePickerExploreViewModel;
        }

        public static final VoicePickerExploreContract.State emit$lambda$0(AsyncCallResult asyncCallResult, VoicePickerExploreContract.State state) {
            state.getClass();
            return VoicePickerExploreContract.State.copy$default(state, new VoicePickerExploreContract.RecommendedVoicesState.Loaded(asyncCallResult), null, null, 6, null);
        }

        public final Object emit(final AsyncCallResult<ExploreVoiceSections> asyncCallResult, wn.c<? super z> cVar) {
            this.this$0.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.i
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerExploreContract.State emit$lambda$0;
                    emit$lambda$0 = VoicePickerExploreViewModel$loadRecommendedVoices$1.AnonymousClass3.emit$lambda$0(AsyncCallResult.this, (VoicePickerExploreContract.State) obj);
                    return emit$lambda$0;
                }
            });
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AsyncCallResult<ExploreVoiceSections>) obj, (wn.c<? super z>) cVar);
        }
    }
}

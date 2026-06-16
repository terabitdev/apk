package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$setVoiceId$1$1", f = "VoiceDetailsScreen.kt", l = {126, 126}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDetailsViewModel$setVoiceId$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $voiceId;
    int label;
    final /* synthetic */ VoiceDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDetailsViewModel$setVoiceId$1$1(VoiceDetailsViewModel voiceDetailsViewModel, String str, wn.c<? super VoiceDetailsViewModel$setVoiceId$1$1> cVar) {
        super(2, cVar);
        this.this$0 = voiceDetailsViewModel;
        this.$voiceId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDetailsViewModel$setVoiceId$1$1(this.this$0, this.$voiceId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDetailsViewModel$setVoiceId$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (((ir.i) r5).collect(r0, r4) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r5 == r3) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        int i10 = this.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            aVar = this.this$0.voicesService;
            VoicesService voicesService = (VoicesService) aVar.get();
            String str = this.$voiceId;
            this.label = 1;
            obj = voicesService.getVoice(str, this);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        this.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$setVoiceId$1$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ VoiceDetailsViewModel this$0;

        public AnonymousClass1(VoiceDetailsViewModel voiceDetailsViewModel) {
            this.this$0 = voiceDetailsViewModel;
        }

        public static final VoiceDetailsState emit$lambda$0(VoiceDetailsViewModel voiceDetailsViewModel, AsyncCallResult asyncCallResult, VoiceDetailsState voiceDetailsState) {
            ResolveErrorMessageUseCase resolveErrorMessageUseCase;
            voiceDetailsState.getClass();
            resolveErrorMessageUseCase = voiceDetailsViewModel.resolveErrorMessageUseCase;
            return VoiceDetailsState.copy$default(voiceDetailsState, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, false, false, false, null, 252, null);
        }

        public static final VoiceDetailsState emit$lambda$1(AsyncCallResult asyncCallResult, VoiceDetailsViewModel voiceDetailsViewModel, VoiceDetailsState voiceDetailsState) {
            DispatcherFactory dispatcherFactory;
            voiceDetailsState.getClass();
            AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
            if (((Voice) success.getData()).getCategory() == VoiceCategory.Famous) {
                voiceDetailsViewModel.queueStateUpdate(new q(0));
                s7.a h10 = c1.h(voiceDetailsViewModel);
                dispatcherFactory = voiceDetailsViewModel.getDispatcherFactory();
                g0.D(h10, dispatcherFactory.getDefault(), null, new VoiceDetailsViewModel$setVoiceId$1$1$1$2$2(voiceDetailsViewModel, asyncCallResult, null), 2);
            }
            return VoiceDetailsState.copy$default(voiceDetailsState, false, null, null, (Voice) success.getData(), false, false, false, null, 246, null);
        }

        public static final VoiceDetailsState emit$lambda$1$0(VoiceDetailsState voiceDetailsState) {
            voiceDetailsState.getClass();
            return VoiceDetailsState.copy$default(voiceDetailsState, false, null, null, null, false, false, true, null, 191, null);
        }

        public final Object emit(AsyncCallResult<Voice> asyncCallResult, wn.c<? super z> cVar) {
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                VoiceDetailsViewModel voiceDetailsViewModel = this.this$0;
                voiceDetailsViewModel.queueStateUpdate(new p(voiceDetailsViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
            } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                VoiceDetailsViewModel voiceDetailsViewModel2 = this.this$0;
                voiceDetailsViewModel2.queueStateUpdate(new p((AsyncCallResult.Success) asyncCallResult, voiceDetailsViewModel2));
            } else {
                c6.p();
                return null;
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AsyncCallResult<Voice>) obj, (wn.c<? super z>) cVar);
        }
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$completeAgeOnlyOnboarding$1$1", f = "OnboardingScreen.kt", l = {234, 237, 250, 253}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class OnboardingViewModel$completeAgeOnlyOnboarding$1$1 extends yn.i implements ho.p {
    final /* synthetic */ OnboardingState $this_queueStateUpdate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel$completeAgeOnlyOnboarding$1$1(OnboardingState onboardingState, OnboardingViewModel onboardingViewModel, wn.c<? super OnboardingViewModel$completeAgeOnlyOnboarding$1$1> cVar) {
        super(2, cVar);
        this.$this_queueStateUpdate = onboardingState;
        this.this$0 = onboardingViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        OnboardingViewModel$completeAgeOnlyOnboarding$1$1 onboardingViewModel$completeAgeOnlyOnboarding$1$1 = new OnboardingViewModel$completeAgeOnlyOnboarding$1$1(this.$this_queueStateUpdate, this.this$0, cVar);
        onboardingViewModel$completeAgeOnlyOnboarding$1$1.L$0 = obj;
        return onboardingViewModel$completeAgeOnlyOnboarding$1$1;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((OnboardingViewModel$completeAgeOnlyOnboarding$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0116, code lost:
    
        if (r14.completeAgeOnboarding(r13) != r7) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0118, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fd, code lost:
    
        if (r14.setDefaultVoice(r0, r13) != r7) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r14 == r7) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r14.markVoiceAsRecent(r8, r13) == r7) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        Voice voice;
        jl.a aVar2;
        Voice voice2;
        jl.a aVar3;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        jl.a aVar4;
        RecentVoicesService recentVoicesService;
        Voice voice3 = this.label;
        sn.z zVar = sn.z.f31622a;
        xn.a aVar5 = xn.a.f37986a;
        if (voice3 != 0) {
            if (voice3 != 1) {
                if (voice3 != 2) {
                    if (voice3 != 3) {
                        if (voice3 == 4) {
                            sn.a.g(obj);
                            this.this$0.queueStateUpdate(new w(2));
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                    aVar4 = this.this$0.onboardingService;
                    OnboardingService onboardingService = (OnboardingService) aVar4.get();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                } else {
                    Voice voice4 = (Voice) this.L$1;
                    sn.a.g(obj);
                    voice2 = voice4;
                    AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                    if (asyncCallResult instanceof AsyncCallResult.Error) {
                        aVar3 = this.this$0.toastService;
                        Object obj2 = aVar3.get();
                        obj2.getClass();
                        ToastService toastService = (ToastService) obj2;
                        resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
                        ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                        this.this$0.queueStateUpdate(new w(1));
                        return zVar;
                    }
                    voice = voice2;
                    if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                        c6.p();
                        return null;
                    }
                    aVar2 = this.this$0.voicesService;
                    VoicesService voicesService = (VoicesService) aVar2.get();
                    String voiceId = voice.getVoiceId();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                }
            } else {
                Voice voice5 = (Voice) this.L$1;
                sn.a.g(obj);
                voice3 = voice5;
                boolean fromVoiceLibrary = voice3.getFromVoiceLibrary();
                voice = voice3;
                if (fromVoiceLibrary) {
                    aVar = this.this$0.voicesService;
                    VoicesService voicesService2 = (VoicesService) aVar.get();
                    String voiceId2 = voice3.getVoiceId();
                    this.L$0 = null;
                    this.L$1 = voice3;
                    this.L$2 = null;
                    this.label = 2;
                    obj = voicesService2.addVoice(voiceId2, this);
                    voice2 = voice3;
                }
                aVar2 = this.this$0.voicesService;
                VoicesService voicesService3 = (VoicesService) aVar2.get();
                String voiceId3 = voice.getVoiceId();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
            }
        } else {
            sn.a.g(obj);
            if (!this.$this_queueStateUpdate.getVoicesSuggestions().isEmpty()) {
                Voice voice6 = (Voice) tn.o.w0(this.$this_queueStateUpdate.getVoicesSuggestions());
                recentVoicesService = this.this$0.recentVoicesService;
                String voiceId4 = voice6.getVoiceId();
                this.L$0 = null;
                this.L$1 = voice6;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 1;
                voice3 = voice6;
            }
            aVar4 = this.this$0.onboardingService;
            OnboardingService onboardingService2 = (OnboardingService) aVar4.get();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        }
    }
}

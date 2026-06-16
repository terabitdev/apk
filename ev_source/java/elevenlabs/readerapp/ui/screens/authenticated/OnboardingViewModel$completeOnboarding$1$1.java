package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.protobuf.c6;
import fr.k1;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$completeOnboarding$1$1", f = "OnboardingScreen.kt", l = {174, 176, 203, 216, 220, 221}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class OnboardingViewModel$completeOnboarding$1$1 extends yn.i implements ho.p {
    final /* synthetic */ OnboardingState $this_queueStateUpdate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ OnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel$completeOnboarding$1$1(OnboardingState onboardingState, OnboardingViewModel onboardingViewModel, wn.c<? super OnboardingViewModel$completeOnboarding$1$1> cVar) {
        super(2, cVar);
        this.$this_queueStateUpdate = onboardingState;
        this.this$0 = onboardingViewModel;
    }

    public static final OnboardingState invokeSuspend$lambda$1(OnboardingViewModel onboardingViewModel, AsyncCallResult asyncCallResult, OnboardingState onboardingState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = onboardingViewModel.resolveErrorMessageUseCase;
        return OnboardingState.copy$default(onboardingState, null, false, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, false, false, null, null, false, 1909, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        OnboardingViewModel$completeOnboarding$1$1 onboardingViewModel$completeOnboarding$1$1 = new OnboardingViewModel$completeOnboarding$1$1(this.$this_queueStateUpdate, this.this$0, cVar);
        onboardingViewModel$completeOnboarding$1$1.L$0 = obj;
        return onboardingViewModel$completeOnboarding$1$1;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((OnboardingViewModel$completeOnboarding$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01d0, code lost:
    
        if (fr.g0.k(r12, r11) == r4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01a5, code lost:
    
        if (r0.setDefaultVoice(r12, r11) == r4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b7, code lost:
    
        if (r12 == r4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0095, code lost:
    
        if (r12 == r4) goto L155;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007f  */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        String str;
        Object obj2;
        jl.a aVar2;
        Voice voice;
        jl.a aVar3;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        jl.a aVar4;
        AsyncCallResult asyncCallResult;
        jl.a aVar5;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase2;
        k1 k1Var;
        jl.a aVar6;
        OnboardingService onboardingService;
        String str2;
        RecentVoicesService recentVoicesService;
        Object obj3 = this.label;
        sn.z zVar = sn.z.f31622a;
        xn.a aVar7 = xn.a.f37986a;
        switch (obj3) {
            case 0:
                sn.a.g(obj);
                String selectedVoiceId = this.$this_queueStateUpdate.getSelectedVoiceId();
                if (selectedVoiceId == null) {
                    Voice voice2 = (Voice) tn.o.y0(this.$this_queueStateUpdate.getVoicesSuggestions());
                    if (voice2 != null) {
                        selectedVoiceId = voice2.getVoiceId();
                    } else {
                        str2 = null;
                        if (str2 != null) {
                            recentVoicesService = this.this$0.recentVoicesService;
                            this.L$0 = null;
                            this.L$1 = str2;
                            this.L$2 = null;
                            this.I$0 = 0;
                            this.label = 1;
                            Object markVoiceAsRecent = recentVoicesService.markVoiceAsRecent(str2, this);
                            obj3 = str2;
                            break;
                        }
                        k1Var = this.this$0.lastPreviewPlayJob;
                        if (k1Var != null) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 5;
                            break;
                        }
                        aVar6 = this.this$0.onboardingService;
                        onboardingService = (OnboardingService) aVar6.get();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 6;
                        if (onboardingService.complete(this) == aVar7) {
                            return aVar7;
                        }
                        return zVar;
                    }
                }
                str2 = selectedVoiceId;
                if (str2 != null) {
                }
                k1Var = this.this$0.lastPreviewPlayJob;
                if (k1Var != null) {
                }
                aVar6 = this.this$0.onboardingService;
                onboardingService = (OnboardingService) aVar6.get();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                if (onboardingService.complete(this) == aVar7) {
                }
            case 1:
                String str3 = (String) this.L$1;
                sn.a.g(obj);
                obj3 = str3;
                aVar = this.this$0.onboardingService;
                OnboardingService onboardingService2 = (OnboardingService) aVar.get();
                OnboardingSurvey survey = this.$this_queueStateUpdate.getSurvey();
                this.L$0 = null;
                this.L$1 = obj3;
                this.L$2 = null;
                this.label = 2;
                obj = onboardingService2.sendOnboarding(survey, this);
                str = obj3;
                break;
            case 2:
                String str4 = (String) this.L$1;
                sn.a.g(obj);
                str = str4;
                AsyncCallResult asyncCallResult2 = (AsyncCallResult) obj;
                if (asyncCallResult2 instanceof AsyncCallResult.Error) {
                    aVar3 = this.this$0.toastService;
                    Object obj4 = aVar3.get();
                    obj4.getClass();
                    ToastService toastService = (ToastService) obj4;
                    resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
                    AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult2;
                    ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, error, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                    OnboardingViewModel onboardingViewModel = this.this$0;
                    onboardingViewModel.queueStateUpdate(new h1(onboardingViewModel, error, 0));
                    return zVar;
                }
                if (asyncCallResult2 instanceof AsyncCallResult.Success) {
                    Iterator<T> it = this.$this_queueStateUpdate.getVoicesSuggestions().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (kotlin.jvm.internal.m.c(((Voice) obj2).getVoiceId(), str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Voice voice3 = (Voice) obj2;
                    if (voice3 != null) {
                        if (voice3.getFromVoiceLibrary()) {
                            aVar2 = this.this$0.voicesService;
                            VoicesService voicesService = (VoicesService) aVar2.get();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = voice3;
                            this.label = 3;
                            Object addVoice = voicesService.addVoice(str, this);
                            if (addVoice != aVar7) {
                                voice = voice3;
                                obj = addVoice;
                                asyncCallResult = (AsyncCallResult) obj;
                                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                                    aVar5 = this.this$0.toastService;
                                    Object obj5 = aVar5.get();
                                    obj5.getClass();
                                    ToastService toastService2 = (ToastService) obj5;
                                    resolveErrorMessageUseCase2 = this.this$0.resolveErrorMessageUseCase;
                                    ToastService.showToast$default(toastService2, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase2, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                                    this.this$0.queueStateUpdate(new w(3));
                                    return zVar;
                                }
                                if (asyncCallResult instanceof AsyncCallResult.Success) {
                                    voice3 = voice;
                                } else {
                                    c6.p();
                                    return null;
                                }
                            }
                            return aVar7;
                        }
                        aVar4 = this.this$0.voicesService;
                        VoicesService voicesService2 = (VoicesService) aVar4.get();
                        String voiceId = voice3.getVoiceId();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 4;
                        break;
                    }
                    this.this$0.queueStateUpdate(new w(4));
                    k1Var = this.this$0.lastPreviewPlayJob;
                    if (k1Var != null) {
                    }
                    aVar6 = this.this$0.onboardingService;
                    onboardingService = (OnboardingService) aVar6.get();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 6;
                    if (onboardingService.complete(this) == aVar7) {
                    }
                } else {
                    c6.p();
                    return null;
                }
                break;
            case 3:
                voice = (Voice) this.L$3;
                sn.a.g(obj);
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                }
                break;
            case 4:
                sn.a.g(obj);
                this.this$0.queueStateUpdate(new w(4));
                k1Var = this.this$0.lastPreviewPlayJob;
                if (k1Var != null) {
                }
                aVar6 = this.this$0.onboardingService;
                onboardingService = (OnboardingService) aVar6.get();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                if (onboardingService.complete(this) == aVar7) {
                }
                break;
            case 5:
                sn.a.g(obj);
                aVar6 = this.this$0.onboardingService;
                onboardingService = (OnboardingService) aVar6.get();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                if (onboardingService.complete(this) == aVar7) {
                }
                break;
            case 6:
                sn.a.g(obj);
                return zVar;
            default:
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$loadVoiceSuggestions$1$1", f = "OnboardingScreen.kt", l = {312, 330}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class OnboardingViewModel$loadVoiceSuggestions$1$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ OnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingViewModel$loadVoiceSuggestions$1$1(OnboardingViewModel onboardingViewModel, wn.c<? super OnboardingViewModel$loadVoiceSuggestions$1$1> cVar) {
        super(2, cVar);
        this.this$0 = onboardingViewModel;
    }

    public static final OnboardingState invokeSuspend$lambda$0(OnboardingViewModel onboardingViewModel, AsyncCallResult asyncCallResult, OnboardingState onboardingState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = onboardingViewModel.resolveErrorMessageUseCase;
        return OnboardingState.copy$default(onboardingState, null, false, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, false, false, null, null, false, 2037, null);
    }

    public static final OnboardingState invokeSuspend$lambda$1(OnboardingViewModel onboardingViewModel, AsyncCallResult asyncCallResult, OnboardingState onboardingState) {
        OnboardingState updatePages;
        updatePages = onboardingViewModel.updatePages(OnboardingState.copy$default(onboardingState, (OnboardingSurvey) ((AsyncCallResult.Success) asyncCallResult).getData(), false, null, null, null, null, false, false, null, null, false, 2046, null));
        return updatePages;
    }

    public static final OnboardingState invokeSuspend$lambda$2(OnboardingViewModel onboardingViewModel, AsyncCallResult asyncCallResult, OnboardingState onboardingState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = onboardingViewModel.resolveErrorMessageUseCase;
        return OnboardingState.copy$default(onboardingState, null, false, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, false, false, null, null, false, 2037, null);
    }

    public static final OnboardingState invokeSuspend$lambda$3(AsyncCallResult asyncCallResult, OnboardingState onboardingState) {
        return OnboardingState.copy$default(onboardingState, null, false, (List) ((AsyncCallResult.Success) asyncCallResult).getData(), null, null, null, false, false, null, null, false, 2041, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new OnboardingViewModel$loadVoiceSuggestions$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((OnboardingViewModel$loadVoiceSuggestions$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r7 == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0032, code lost:
    
        if (r7 == r4) goto L57;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        jl.a aVar2;
        int i10 = this.label;
        sn.z zVar = sn.z.f31622a;
        xn.a aVar3 = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                    if (asyncCallResult instanceof AsyncCallResult.Error) {
                        OnboardingViewModel onboardingViewModel = this.this$0;
                        onboardingViewModel.queueStateUpdate(new h1(onboardingViewModel, (AsyncCallResult.Error) asyncCallResult, 2));
                        return zVar;
                    }
                    if (asyncCallResult instanceof AsyncCallResult.Success) {
                        this.this$0.queueStateUpdate(new l0((AsyncCallResult.Success) asyncCallResult, 2));
                        return zVar;
                    }
                    c6.p();
                    return null;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            aVar = this.this$0.onboardingService;
            OnboardingService onboardingService = (OnboardingService) aVar.get();
            this.label = 1;
            obj = onboardingService.getOnboarding(this);
        }
        AsyncCallResult asyncCallResult2 = (AsyncCallResult) obj;
        if (asyncCallResult2 instanceof AsyncCallResult.Error) {
            OnboardingViewModel onboardingViewModel2 = this.this$0;
            onboardingViewModel2.queueStateUpdate(new h1(onboardingViewModel2, (AsyncCallResult.Error) asyncCallResult2, 1));
            return zVar;
        }
        if (asyncCallResult2 instanceof AsyncCallResult.Success) {
            OnboardingViewModel onboardingViewModel3 = this.this$0;
            onboardingViewModel3.queueStateUpdate(new i1(onboardingViewModel3, (AsyncCallResult.Success) asyncCallResult2, 0));
            aVar2 = this.this$0.onboardingService;
            OnboardingService onboardingService2 = (OnboardingService) aVar2.get();
            this.label = 2;
            obj = onboardingService2.getSuggestedVoices(this);
        } else {
            c6.p();
            return null;
        }
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.VoiceDesignCreatedVoice;
import io.elevenlabs.domain.services.VoiceDesignService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import ir.i1;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel$saveVoice$1$1", f = "VoiceDesignViewModel.kt", l = {224, 235}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDesignViewModel$saveVoice$1$1 extends yn.i implements p {
    final /* synthetic */ VoiceDesignContract.PreviewItem $selectedPreview;
    final /* synthetic */ String $voiceDescription;
    final /* synthetic */ String $voiceName;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ VoiceDesignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDesignViewModel$saveVoice$1$1(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.PreviewItem previewItem, String str, String str2, wn.c<? super VoiceDesignViewModel$saveVoice$1$1> cVar) {
        super(2, cVar);
        this.this$0 = voiceDesignViewModel;
        this.$selectedPreview = previewItem;
        this.$voiceName = str;
        this.$voiceDescription = str2;
    }

    public static final VoiceDesignContract.State invokeSuspend$lambda$1(VoiceDesignViewModel voiceDesignViewModel, AsyncCallResult asyncCallResult, VoiceDesignContract.State state) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = voiceDesignViewModel.resolveErrorMessage;
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, null, false, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, false, 14207, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDesignViewModel$saveVoice$1$1(this.this$0, this.$selectedPreview, this.$voiceName, this.$voiceDescription, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDesignViewModel$saveVoice$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r7.addVoice(r4, r6) == r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r7 == r3) goto L45;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VoiceDesignService voiceDesignService;
        Analytics analytics;
        Logger logger;
        VoiceDesignCreatedVoice voiceDesignCreatedVoice;
        VoicesService voicesService;
        Analytics analytics2;
        i1 i1Var;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    voiceDesignCreatedVoice = (VoiceDesignCreatedVoice) this.L$1;
                    sn.a.g(obj);
                    analytics2 = this.this$0.analytics;
                    analytics2.log(Analytics.Event.VoiceDesignSaveSuccess.INSTANCE);
                    this.this$0.queueStateUpdate(new i(0));
                    i1Var = this.this$0.mutableEffectsFlow;
                    i1Var.tryEmit(new VoiceDesignContract.Effect.VoiceCreated(voiceDesignCreatedVoice.getVoiceId(), voiceDesignCreatedVoice.getName()));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            voiceDesignService = this.this$0.voiceDesignService;
            String generatedVoiceId = this.$selectedPreview.getGeneratedVoiceId();
            String str = this.$voiceName;
            String str2 = this.$voiceDescription;
            this.label = 1;
            obj = voiceDesignService.createVoiceFromPreview(generatedVoiceId, str, str2, this);
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            voiceDesignCreatedVoice = (VoiceDesignCreatedVoice) ((AsyncCallResult.Success) asyncCallResult).getData();
            voicesService = this.this$0.voicesService;
            String voiceId = voiceDesignCreatedVoice.getVoiceId();
            this.L$0 = null;
            this.L$1 = voiceDesignCreatedVoice;
            this.label = 2;
        } else {
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                analytics = this.this$0.analytics;
                analytics.log(Analytics.Event.VoiceDesignSaveError.INSTANCE);
                logger = this.this$0.logger;
                logger.logError(VoiceDesignViewModel.TAG, "Failed to save designed voice", null);
                VoiceDesignViewModel voiceDesignViewModel = this.this$0;
                voiceDesignViewModel.queueStateUpdate(new j(voiceDesignViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
                return z.f31622a;
            }
            c6.p();
            return null;
        }
    }
}

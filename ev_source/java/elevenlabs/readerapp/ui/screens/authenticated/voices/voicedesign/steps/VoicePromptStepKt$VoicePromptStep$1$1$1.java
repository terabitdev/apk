package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt$VoicePromptStep$1$1$1", f = "VoicePromptStep.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePromptStepKt$VoicePromptStep$1$1$1 extends yn.i implements p {
    final /* synthetic */ z0 $input$delegate;
    final /* synthetic */ VoiceDesignContract.State $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePromptStepKt$VoicePromptStep$1$1$1(VoiceDesignContract.State state, z0 z0Var, wn.c<? super VoicePromptStepKt$VoicePromptStep$1$1$1> cVar) {
        super(2, cVar);
        this.$state = state;
        this.$input$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePromptStepKt$VoicePromptStep$1$1$1(this.$state, this.$input$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePromptStepKt$VoicePromptStep$1$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String VoicePromptStep$lambda$0$1;
        if (this.label == 0) {
            sn.a.g(obj);
            VoicePromptStep$lambda$0$1 = VoicePromptStepKt.VoicePromptStep$lambda$0$1(this.$input$delegate);
            if (!m.c(VoicePromptStep$lambda$0$1, this.$state.getVoiceDescription())) {
                this.$input$delegate.setValue(this.$state.getVoiceDescription());
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

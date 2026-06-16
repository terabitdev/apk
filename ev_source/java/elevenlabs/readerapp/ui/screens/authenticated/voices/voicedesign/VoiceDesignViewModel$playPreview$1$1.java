package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel$playPreview$1$1", f = "VoiceDesignViewModel.kt", l = {353}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDesignViewModel$playPreview$1$1 extends yn.i implements p {
    final /* synthetic */ VoiceDesignContract.PreviewItem $preview;
    final /* synthetic */ String $previewId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VoiceDesignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDesignViewModel$playPreview$1$1(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.PreviewItem previewItem, String str, wn.c<? super VoiceDesignViewModel$playPreview$1$1> cVar) {
        super(2, cVar);
        this.this$0 = voiceDesignViewModel;
        this.$preview = previewItem;
        this.$previewId = str;
    }

    public static final VoiceDesignContract.State invokeSuspend$lambda$0(String str, VoiceDesignContract.State state) {
        if (m.c(state.getPlayingPreviewId(), str)) {
            return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 16127, null);
        }
        return state;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        VoiceDesignViewModel$playPreview$1$1 voiceDesignViewModel$playPreview$1$1 = new VoiceDesignViewModel$playPreview$1$1(this.this$0, this.$preview, this.$previewId, cVar);
        voiceDesignViewModel$playPreview$1$1.L$0 = obj;
        return voiceDesignViewModel$playPreview$1$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDesignViewModel$playPreview$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        AudioPreviewService audioPreviewService;
        d0 d0Var = (d0) this.L$0;
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
            audioPreviewService = this.this$0.audioPreviewService;
            String audioFileUri = this.$preview.getAudioFileUri();
            this.L$0 = d0Var;
            this.label = 1;
            Object play = audioPreviewService.play(audioFileUri, this);
            xn.a aVar = xn.a.f37986a;
            if (play == aVar) {
                return aVar;
            }
        }
        g0.o(d0Var);
        this.this$0.queueStateUpdate(new h(this.$previewId, 0));
        return z.f31622a;
    }
}

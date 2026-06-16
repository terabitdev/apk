package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import android.net.Uri;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.VoiceDesignPreview;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1", f = "VoiceDesignViewModel.kt", l = {145}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Landroid/net/Uri;", "<anonymous>", "(Lfr/d0;)Landroid/net/Uri;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1 extends yn.i implements p {
    final /* synthetic */ VoiceDesignPreview $preview;
    int label;
    final /* synthetic */ VoiceDesignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignPreview voiceDesignPreview, wn.c<? super VoiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1> cVar) {
        super(2, cVar);
        this.this$0 = voiceDesignViewModel;
        this.$preview = voiceDesignPreview;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1(this.this$0, this.$preview, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super Uri> cVar) {
        return ((VoiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VoiceDesignAudioStorage voiceDesignAudioStorage;
        String str;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        voiceDesignAudioStorage = this.this$0.voiceDesignAudioStorage;
        str = this.this$0.sessionId;
        String generatedVoiceId = this.$preview.getGeneratedVoiceId();
        String audioBase64 = this.$preview.getAudioBase64();
        this.label = 1;
        Object savePreviewAudio = voiceDesignAudioStorage.savePreviewAudio(str, generatedVoiceId, audioBase64, this);
        xn.a aVar = xn.a.f37986a;
        if (savePreviewAudio == aVar) {
            return aVar;
        }
        return savePreviewAudio;
    }
}

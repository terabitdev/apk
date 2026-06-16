package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$togglePreview$1$1", f = "VoiceDetailsScreen.kt", l = {214}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDetailsViewModel$togglePreview$1$1 extends yn.i implements ho.p {
    final /* synthetic */ VoiceDetailsState $this_queueStateUpdate;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ VoiceDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDetailsViewModel$togglePreview$1$1(VoiceDetailsState voiceDetailsState, VoiceDetailsViewModel voiceDetailsViewModel, wn.c<? super VoiceDetailsViewModel$togglePreview$1$1> cVar) {
        super(2, cVar);
        this.$this_queueStateUpdate = voiceDetailsState;
        this.this$0 = voiceDetailsViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDetailsViewModel$togglePreview$1$1(this.$this_queueStateUpdate, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDetailsViewModel$togglePreview$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AsyncCallResult asyncCallResult;
        jl.a aVar;
        jl.a aVar2;
        jl.a aVar3;
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
            String previewUrl = this.$this_queueStateUpdate.getVoice().getPreviewUrl();
            asyncCallResult = null;
            if (previewUrl != null) {
                aVar = this.this$0.audioPreviewService;
                AudioPreviewService audioPreviewService = (AudioPreviewService) aVar.get();
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = audioPreviewService.play(previewUrl, this);
                xn.a aVar4 = xn.a.f37986a;
                if (obj == aVar4) {
                    return aVar4;
                }
            }
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                aVar2 = this.this$0.toastService;
                Object obj2 = aVar2.get();
                obj2.getClass();
                ToastService toastService = (ToastService) obj2;
                aVar3 = this.this$0.stringProvider;
                ToastService.showToast$default(toastService, ((StringProvider) aVar3.get()).getString(R.string.voices_error_playing_preview), null, ToastService.ToastVariant.ERROR, 2, null);
            }
            this.this$0.queueStateUpdate(new q(1));
            return z.f31622a;
        }
        asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
        }
        this.this$0.queueStateUpdate(new q(1));
        return z.f31622a;
    }
}

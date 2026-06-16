package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$deleteVoice$1", f = "VoicePickerSharedRepository.kt", l = {465}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$deleteVoice$1 extends yn.i implements p {
    final /* synthetic */ String $voiceId;
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$deleteVoice$1(VoicePickerSharedRepository voicePickerSharedRepository, String str, wn.c<? super VoicePickerSharedRepository$deleteVoice$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSharedRepository;
        this.$voiceId = str;
    }

    public static final VoicePickerSharedContract.State invokeSuspend$lambda$0(String str, VoicePickerSharedContract.State state) {
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, null, null, kd.a.K(state.getDeleteVoiceInProgressIds(), str), false, 6143, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSharedRepository$deleteVoice$1(this.this$0, this.$voiceId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSharedRepository$deleteVoice$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VoicesService voicesService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
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
            voicesService = this.this$0.voicesService;
            String str = this.$voiceId;
            this.label = 1;
            obj = voicesService.removeVoice(str, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            VoicePickerSharedRepository voicePickerSharedRepository = this.this$0;
            resolveErrorMessageUseCase = voicePickerSharedRepository.resolveErrorMessageUseCase;
            voicePickerSharedRepository.showErrorToast(resolveErrorMessageUseCase.invoke((AsyncCallResult.Error) asyncCallResult, new Integer(R.string.voices_failed_to_remove_voice)));
        }
        this.this$0.updateState(new f(this.$voiceId, 0));
        return z.f31622a;
    }
}

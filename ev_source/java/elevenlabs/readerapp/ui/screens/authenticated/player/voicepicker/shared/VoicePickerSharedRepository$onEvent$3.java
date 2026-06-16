package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$onEvent$3", f = "VoicePickerSharedRepository.kt", l = {141}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$onEvent$3 extends yn.i implements p {
    final /* synthetic */ VoicePickerSharedContract.Event $event;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$onEvent$3(VoicePickerSharedRepository voicePickerSharedRepository, VoicePickerSharedContract.Event event, wn.c<? super VoicePickerSharedRepository$onEvent$3> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSharedRepository;
        this.$event = event;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        VoicePickerSharedRepository$onEvent$3 voicePickerSharedRepository$onEvent$3 = new VoicePickerSharedRepository$onEvent$3(this.this$0, this.$event, cVar);
        voicePickerSharedRepository$onEvent$3.L$0 = obj;
        return voicePickerSharedRepository$onEvent$3;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSharedRepository$onEvent$3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        RecentVoicesService recentVoicesService;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                VoicePickerSharedRepository voicePickerSharedRepository = this.this$0;
                VoicePickerSharedContract.Event event = this.$event;
                recentVoicesService = voicePickerSharedRepository.recentVoicesService;
                String voiceId = ((VoicePickerSharedContract.Event.SelectVoice) event).getVoice().getVoiceId();
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                Object markVoiceAsRecent = recentVoicesService.markVoiceAsRecent(voiceId, this);
                xn.a aVar = xn.a.f37986a;
                if (markVoiceAsRecent == aVar) {
                    return aVar;
                }
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }
}

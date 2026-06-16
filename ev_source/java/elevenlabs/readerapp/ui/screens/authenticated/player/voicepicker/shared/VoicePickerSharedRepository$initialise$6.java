package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.VoicesService;
import ir.j1;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$6", f = "VoicePickerSharedRepository.kt", l = {364}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$initialise$6 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$initialise$6(VoicePickerSharedRepository voicePickerSharedRepository, wn.c<? super VoicePickerSharedRepository$initialise$6> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSharedRepository;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSharedRepository$initialise$6(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSharedRepository$initialise$6) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VoicesService voicesService;
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
            ir.i voices = voicesService.voices();
            final VoicePickerSharedRepository voicePickerSharedRepository = this.this$0;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$6.1
                public final Object emit(List<Voice> list, wn.c<? super z> cVar) {
                    j1 j1Var;
                    j1Var = VoicePickerSharedRepository.this.mutableVoices;
                    Object emit = j1Var.emit(list, cVar);
                    if (emit == xn.a.f37986a) {
                        return emit;
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((List<Voice>) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = voices.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}

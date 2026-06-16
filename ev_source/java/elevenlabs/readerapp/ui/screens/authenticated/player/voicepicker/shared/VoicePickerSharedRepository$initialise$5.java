package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.VoicesService;
import ir.r;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$5", f = "VoicePickerSharedRepository.kt", l = {360}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$initialise$5 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$initialise$5(VoicePickerSharedRepository voicePickerSharedRepository, wn.c<? super VoicePickerSharedRepository$initialise$5> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSharedRepository;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSharedRepository$initialise$5(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSharedRepository$initialise$5) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            ir.i sync = voicesService.sync();
            this.label = 1;
            Object k4 = r.k(sync, this);
            xn.a aVar = xn.a.f37986a;
            if (k4 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}

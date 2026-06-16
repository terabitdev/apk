package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.AvailableFilters;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.FiltersState;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$loadAvailableFilters$1", f = "VoicePickerSharedRepository.kt", l = {534}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$loadAvailableFilters$1 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$loadAvailableFilters$1(VoicePickerSharedRepository voicePickerSharedRepository, wn.c<? super VoicePickerSharedRepository$loadAvailableFilters$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSharedRepository;
    }

    public static final VoicePickerSharedContract.State invokeSuspend$lambda$0(AsyncCallResult asyncCallResult, VoicePickerSharedContract.State state) {
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, FiltersState.copy$default(state.getFilters(), (AvailableFilters) ((AsyncCallResult.Success) asyncCallResult).getData(), null, null, null, null, null, null, 126, null), false, null, null, null, null, false, 8127, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSharedRepository$loadAvailableFilters$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSharedRepository$loadAvailableFilters$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        CommunityVoicesService communityVoicesService;
        Logger logger;
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
            communityVoicesService = this.this$0.communityVoicesService;
            this.label = 1;
            obj = communityVoicesService.getFilters(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            logger = this.this$0.logger;
            Logger.logWarning$default(logger, "VoicePickerSharedRepo", "Error loading community voices: " + asyncCallResult, null, 4, null);
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.updateState(new i((AsyncCallResult.Success) asyncCallResult, 0));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}

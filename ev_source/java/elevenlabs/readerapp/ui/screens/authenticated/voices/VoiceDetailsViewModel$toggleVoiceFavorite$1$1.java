package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import com.google.protobuf.c6;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceKt;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$toggleVoiceFavorite$1$1", f = "VoiceDetailsScreen.kt", l = {175, SensibleDefaults.X_OFFSET}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDetailsViewModel$toggleVoiceFavorite$1$1 extends yn.i implements ho.p {
    final /* synthetic */ VoiceDetailsState $this_queueStateUpdate;
    Object L$0;
    int label;
    final /* synthetic */ VoiceDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDetailsViewModel$toggleVoiceFavorite$1$1(VoiceDetailsState voiceDetailsState, VoiceDetailsViewModel voiceDetailsViewModel, wn.c<? super VoiceDetailsViewModel$toggleVoiceFavorite$1$1> cVar) {
        super(2, cVar);
        this.$this_queueStateUpdate = voiceDetailsState;
        this.this$0 = voiceDetailsViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDetailsViewModel$toggleVoiceFavorite$1$1(this.$this_queueStateUpdate, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDetailsViewModel$toggleVoiceFavorite$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        FavoriteVoicesService favoriteVoicesService;
        VoiceDetailsViewModel voiceDetailsViewModel;
        FavoriteVoicesService favoriteVoicesService2;
        VoiceDetailsViewModel voiceDetailsViewModel2;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    voiceDetailsViewModel = (VoiceDetailsViewModel) this.L$0;
                    sn.a.g(obj);
                    voiceDetailsViewModel.showResultToast((AsyncCallResult) obj, R.string.voice_details_added_to_favorites);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                voiceDetailsViewModel2 = (VoiceDetailsViewModel) this.L$0;
                sn.a.g(obj);
                voiceDetailsViewModel2.showResultToast((AsyncCallResult) obj, R.string.voices_toast_voice_removed);
            }
        } else {
            sn.a.g(obj);
            Voice voice = this.$this_queueStateUpdate.getVoice();
            xn.a aVar = xn.a.f37986a;
            if (voice != null && VoiceKt.isFavorited(voice)) {
                VoiceDetailsViewModel voiceDetailsViewModel3 = this.this$0;
                favoriteVoicesService2 = voiceDetailsViewModel3.favoriteVoicesService;
                String voiceId = this.$this_queueStateUpdate.getVoiceId();
                this.L$0 = voiceDetailsViewModel3;
                this.label = 1;
                Object removeFavorite = favoriteVoicesService2.removeFavorite(voiceId, this);
                if (removeFavorite != aVar) {
                    voiceDetailsViewModel2 = voiceDetailsViewModel3;
                    obj = removeFavorite;
                    voiceDetailsViewModel2.showResultToast((AsyncCallResult) obj, R.string.voices_toast_voice_removed);
                }
            } else {
                VoiceDetailsViewModel voiceDetailsViewModel4 = this.this$0;
                favoriteVoicesService = voiceDetailsViewModel4.favoriteVoicesService;
                String voiceId2 = this.$this_queueStateUpdate.getVoiceId();
                this.L$0 = voiceDetailsViewModel4;
                this.label = 2;
                Object addFavorite = favoriteVoicesService.addFavorite(voiceId2, this);
                if (addFavorite != aVar) {
                    voiceDetailsViewModel = voiceDetailsViewModel4;
                    obj = addFavorite;
                    voiceDetailsViewModel.showResultToast((AsyncCallResult) obj, R.string.voice_details_added_to_favorites);
                }
            }
            return aVar;
        }
        this.this$0.queueStateUpdate(new q(2));
        return z.f31622a;
    }
}

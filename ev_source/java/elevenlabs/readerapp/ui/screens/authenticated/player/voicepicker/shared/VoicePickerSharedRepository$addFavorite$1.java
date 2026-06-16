package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$addFavorite$1", f = "VoicePickerSharedRepository.kt", l = {449}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/Voice;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$addFavorite$1 extends yn.i implements l {
    final /* synthetic */ String $voiceId;
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$addFavorite$1(VoicePickerSharedRepository voicePickerSharedRepository, String str, wn.c<? super VoicePickerSharedRepository$addFavorite$1> cVar) {
        super(1, cVar);
        this.this$0 = voicePickerSharedRepository;
        this.$voiceId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(wn.c<?> cVar) {
        return new VoicePickerSharedRepository$addFavorite$1(this.this$0, this.$voiceId, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super AsyncCallResult<Voice>> cVar) {
        return ((VoicePickerSharedRepository$addFavorite$1) create(cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        FavoriteVoicesService favoriteVoicesService;
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
        favoriteVoicesService = this.this$0.favoritesService;
        String str = this.$voiceId;
        this.label = 1;
        Object addFavorite = favoriteVoicesService.addFavorite(str, this);
        xn.a aVar = xn.a.f37986a;
        if (addFavorite == aVar) {
            return aVar;
        }
        return addFavorite;
    }
}

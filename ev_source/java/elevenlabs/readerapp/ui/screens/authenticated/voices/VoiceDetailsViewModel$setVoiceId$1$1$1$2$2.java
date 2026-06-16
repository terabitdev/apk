package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.ReadsExploreService;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$setVoiceId$1$1$1$2$2", f = "VoiceDetailsScreen.kt", l = {143}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDetailsViewModel$setVoiceId$1$1$1$2$2 extends yn.i implements ho.p {
    final /* synthetic */ AsyncCallResult<Voice> $result;
    int label;
    final /* synthetic */ VoiceDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDetailsViewModel$setVoiceId$1$1$1$2$2(VoiceDetailsViewModel voiceDetailsViewModel, AsyncCallResult<Voice> asyncCallResult, wn.c<? super VoiceDetailsViewModel$setVoiceId$1$1$1$2$2> cVar) {
        super(2, cVar);
        this.this$0 = voiceDetailsViewModel;
        this.$result = asyncCallResult;
    }

    public static final VoiceDetailsState invokeSuspend$lambda$0(AsyncCallResult asyncCallResult, VoiceDetailsState voiceDetailsState) {
        AsyncCallResult.Success success;
        List list = null;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            success = (AsyncCallResult.Success) asyncCallResult;
        } else {
            success = null;
        }
        if (success != null) {
            list = (List) success.getData();
        }
        if (list == null) {
            list = tn.t.f33547a;
        }
        return VoiceDetailsState.copy$default(voiceDetailsState, false, null, null, null, false, false, false, list, 63, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDetailsViewModel$setVoiceId$1$1$1$2$2(this.this$0, this.$result, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDetailsViewModel$setVoiceId$1$1$1$2$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
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
            aVar = this.this$0.readsExploreService;
            ReadsExploreService readsExploreService = (ReadsExploreService) aVar.get();
            String i11 = defpackage.f.i("voice:", ((Voice) ((AsyncCallResult.Success) this.$result).getData()).getVoiceId());
            this.label = 1;
            obj = readsExploreService.getExploreReads(i11, this);
            xn.a aVar2 = xn.a.f37986a;
            if (obj == aVar2) {
                return aVar2;
            }
        }
        this.this$0.queueStateUpdate(new o((AsyncCallResult) obj, 1));
        return z.f31622a;
    }
}

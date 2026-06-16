package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.readerapp.ui.models.UiAction;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$onEditPronunciation$1", f = "PronunciationsListScreen.kt", l = {160}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PronunciationsListViewModel$onEditPronunciation$1 extends yn.i implements ho.p {
    final /* synthetic */ Pronunciation $pronunciation;
    int label;
    final /* synthetic */ PronunciationsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationsListViewModel$onEditPronunciation$1(PronunciationsListViewModel pronunciationsListViewModel, Pronunciation pronunciation, wn.c<? super PronunciationsListViewModel$onEditPronunciation$1> cVar) {
        super(2, cVar);
        this.this$0 = pronunciationsListViewModel;
        this.$pronunciation = pronunciation;
    }

    public static final PronunciationsListState invokeSuspend$lambda$0(String str, Pronunciation pronunciation, PronunciationsListState pronunciationsListState) {
        return PronunciationsListState.copy$default(pronunciationsListState, null, false, new UiAction.Pending(new sn.k(str, pronunciation)), null, null, 27, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PronunciationsListViewModel$onEditPronunciation$1(this.this$0, this.$pronunciation, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PronunciationsListViewModel$onEditPronunciation$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            ir.i defaultVoiceId = voicesService.defaultVoiceId();
            this.label = 1;
            obj = ir.r.u(defaultVoiceId, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        this.this$0.queueStateUpdate(new q((String) obj, this.$pronunciation, 0));
        return z.f31622a;
    }
}

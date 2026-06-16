package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.services.AssistantInteractionMode;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$initializeAssistant$3", f = "AskAssistantViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAssistantViewModel$initializeAssistant$3 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ AskAssistantViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAssistantViewModel$initializeAssistant$3(AskAssistantViewModel askAssistantViewModel, wn.c<? super AskAssistantViewModel$initializeAssistant$3> cVar) {
        super(2, cVar);
        this.this$0 = askAssistantViewModel;
    }

    public static final AssistantContract.State invokeSuspend$lambda$0$0(boolean z6, AssistantContract.State state) {
        return AssistantContract.State.copy$default(state, null, null, null, false, false, z6, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097119, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AskAssistantViewModel$initializeAssistant$3(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AskAssistantViewModel$initializeAssistant$3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Long l4;
        long j4;
        String str2;
        AskAssistantViewModel$initializeAssistant$3 askAssistantViewModel$initializeAssistant$3;
        Object m949startSessionyxL6bBk$default;
        float f10;
        int i10 = this.label;
        boolean z6 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                m949startSessionyxL6bBk$default = ((sn.m) obj).f31603a;
                askAssistantViewModel$initializeAssistant$3 = this;
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            AssistantSessionService assistantSessionService = this.this$0.assistantSessionService;
            str = this.this$0.readId;
            if (str == null) {
                str = "";
            }
            String str3 = str;
            l4 = this.this$0.position;
            if (l4 != null) {
                j4 = l4.longValue();
            } else {
                j4 = 0;
            }
            str2 = this.this$0.voiceId;
            this.label = 1;
            askAssistantViewModel$initializeAssistant$3 = this;
            m949startSessionyxL6bBk$default = AssistantSessionService.m949startSessionyxL6bBk$default(assistantSessionService, str3, j4, str2, false, askAssistantViewModel$initializeAssistant$3, 8, null);
            xn.a aVar = xn.a.f37986a;
            if (m949startSessionyxL6bBk$default == aVar) {
                return aVar;
            }
        }
        AskAssistantViewModel askAssistantViewModel = askAssistantViewModel$initializeAssistant$3.this$0;
        if (!(m949startSessionyxL6bBk$default instanceof sn.l)) {
            if (((AssistantContract.State) askAssistantViewModel.getStateFlow().getValue()).getInteractionMode() != AssistantInteractionMode.TEXT && !((AssistantContract.State) askAssistantViewModel.getStateFlow().getValue()).isMicMuted()) {
                z6 = false;
            }
            askAssistantViewModel.assistantSessionService.setMicMuted(z6);
            AssistantSessionService assistantSessionService2 = askAssistantViewModel.assistantSessionService;
            if (((AssistantContract.State) askAssistantViewModel.getStateFlow().getValue()).isAudioMuted()) {
                f10 = t2.u.P;
            } else {
                f10 = 1.0f;
            }
            assistantSessionService2.setVolume(f10);
            askAssistantViewModel.queueStateUpdate(new q(z6, 1));
        }
        return sn.z.f31622a;
    }
}

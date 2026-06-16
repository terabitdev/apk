package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.services.AssistantPreferencesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$initialize$2", f = "AskAssistantViewModel.kt", l = {150}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAssistantViewModel$initialize$2 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ AskAssistantViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAssistantViewModel$initialize$2(AskAssistantViewModel askAssistantViewModel, wn.c<? super AskAssistantViewModel$initialize$2> cVar) {
        super(2, cVar);
        this.this$0 = askAssistantViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AskAssistantViewModel$initialize$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AskAssistantViewModel$initialize$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        AssistantPreferencesService assistantPreferencesService;
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
            assistantPreferencesService = this.this$0.assistantPreferencesService;
            ir.i hasAcceptedTerms = assistantPreferencesService.hasAcceptedTerms();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            Object collect = hasAcceptedTerms.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$initialize$2$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ AskAssistantViewModel this$0;

        public AnonymousClass1(AskAssistantViewModel askAssistantViewModel) {
            this.this$0 = askAssistantViewModel;
        }

        public static final AssistantContract.State emit$lambda$0(boolean z6, AssistantContract.State state) {
            state.getClass();
            return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, !z6, null, false, false, false, false, false, 2080767, null);
        }

        public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
            this.this$0.logger.log("AskAssistantViewModel", "Collected new terms acceptance status: hasAccepted=" + z6);
            this.this$0.queueStateUpdate(new q(z6, 0));
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) cVar);
        }
    }
}

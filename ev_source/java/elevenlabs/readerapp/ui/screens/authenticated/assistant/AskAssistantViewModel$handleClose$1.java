package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$handleClose$1", f = "AskAssistantViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAssistantViewModel$handleClose$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ AskAssistantViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAssistantViewModel$handleClose$1(AskAssistantViewModel askAssistantViewModel, wn.c<? super AskAssistantViewModel$handleClose$1> cVar) {
        super(2, cVar);
        this.this$0 = askAssistantViewModel;
    }

    public static final AssistantContract.State invokeSuspend$lambda$0(AssistantContract.State state) {
        return new AssistantContract.State(null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097151, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AskAssistantViewModel$handleClose$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AskAssistantViewModel$handleClose$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.this$0.endSession();
            this.this$0.queueStateUpdate(new o(0));
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

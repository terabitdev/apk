package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import ir.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentScreenKt$AskAgentScreen$2$1", f = "AskAgentScreen.kt", l = {69}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAgentScreenKt$AskAgentScreen$2$1 extends yn.i implements p {
    final /* synthetic */ ho.a $onBack;
    final /* synthetic */ AskAgentViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAgentScreenKt$AskAgentScreen$2$1(AskAgentViewModel askAgentViewModel, ho.a aVar, wn.c<? super AskAgentScreenKt$AskAgentScreen$2$1> cVar) {
        super(2, cVar);
        this.$vm = askAgentViewModel;
        this.$onBack = aVar;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AskAgentScreenKt$AskAgentScreen$2$1(this.$vm, this.$onBack, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AskAgentScreenKt$AskAgentScreen$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            n1 controlEvents = this.$vm.getControlEvents();
            final ho.a aVar = this.$onBack;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentScreenKt$AskAgentScreen$2$1.1
                public final Object emit(AskAgentContract.ControlEvent controlEvent, wn.c<? super z> cVar) {
                    if (m.c(controlEvent, AskAgentContract.ControlEvent.Close.INSTANCE)) {
                        ho.a.this.invoke();
                        return z.f31622a;
                    }
                    c6.p();
                    return null;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((AskAgentContract.ControlEvent) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = controlEvents.collect(jVar, this);
            xn.a aVar2 = xn.a.f37986a;
            if (collect == aVar2) {
                return aVar2;
            }
        }
        c6.u();
        return null;
    }
}

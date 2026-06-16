package io.elevenlabs.readerapp.ui.components;

import com.google.protobuf.c6;
import io.elevenlabs.readerapp.ui.models.UiAction;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.components.HandleUiActionKt$HandleUiAction$1$1", f = "HandleUiAction.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class HandleUiActionKt$HandleUiAction$1$1 extends yn.i implements ho.p {
    final /* synthetic */ UiAction<T> $action;
    final /* synthetic */ ho.l $handler;
    final /* synthetic */ ho.a $onHandled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandleUiActionKt$HandleUiAction$1$1(UiAction<? extends T> uiAction, ho.l lVar, ho.a aVar, wn.c<? super HandleUiActionKt$HandleUiAction$1$1> cVar) {
        super(2, cVar);
        this.$action = uiAction;
        this.$handler = lVar;
        this.$onHandled = aVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new HandleUiActionKt$HandleUiAction$1$1(this.$action, this.$handler, this.$onHandled, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((HandleUiActionKt$HandleUiAction$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            Object obj2 = this.$action;
            if (obj2 instanceof UiAction.Pending) {
                this.$handler.invoke(((UiAction.Pending) obj2).getData());
                this.$onHandled.invoke();
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

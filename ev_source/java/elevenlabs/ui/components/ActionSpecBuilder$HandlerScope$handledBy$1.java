package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.ActionSpecBuilder$HandlerScope$handledBy$1", f = "SwipeToActionBox.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ActionSpecBuilder$HandlerScope$handledBy$1 extends yn.i implements ho.l {
    final /* synthetic */ ho.a $fn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionSpecBuilder$HandlerScope$handledBy$1(ho.a aVar, wn.c<? super ActionSpecBuilder$HandlerScope$handledBy$1> cVar) {
        super(1, cVar);
        this.$fn = aVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(wn.c<?> cVar) {
        return new ActionSpecBuilder$HandlerScope$handledBy$1(this.$fn, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super Boolean> cVar) {
        return ((ActionSpecBuilder$HandlerScope$handledBy$1) create(cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.$fn.invoke();
            return Boolean.TRUE;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.ActionSpec$Companion$noActions$1", f = "SwipeToActionBox.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/elevenlabs/ui/components/ActionConfig;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ActionSpec$Companion$noActions$1 extends yn.i implements ho.p {
    int label;

    public ActionSpec$Companion$noActions$1(wn.c<? super ActionSpec$Companion$noActions$1> cVar) {
        super(2, cVar);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ActionSpec$Companion$noActions$1(cVar);
    }

    @Override // ho.p
    public final Object invoke(ActionConfig actionConfig, wn.c<? super Boolean> cVar) {
        return ((ActionSpec$Companion$noActions$1) create(actionConfig, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            return Boolean.TRUE;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

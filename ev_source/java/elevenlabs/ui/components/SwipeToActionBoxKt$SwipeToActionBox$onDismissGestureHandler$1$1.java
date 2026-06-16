package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.SwipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1", f = "SwipeToActionBox.kt", l = {143}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "side", "Lio/elevenlabs/ui/components/BoxSide;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SwipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1 extends yn.i implements ho.p {
    final /* synthetic */ ActionSpec $actionSpec;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1(ActionSpec actionSpec, wn.c<? super SwipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1> cVar) {
        super(2, cVar);
        this.$actionSpec = actionSpec;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        SwipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1 swipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1 = new SwipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1(this.$actionSpec, cVar);
        swipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1.L$0 = obj;
        return swipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1;
    }

    @Override // ho.p
    public final Object invoke(BoxSide boxSide, wn.c<? super Boolean> cVar) {
        return ((SwipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1) create(boxSide, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        List<ActionConfig> endSide;
        boolean z6;
        BoxSide boxSide = (BoxSide) this.L$0;
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
            BoxSide boxSide2 = BoxSide.START;
            ActionSpec actionSpec = this.$actionSpec;
            if (boxSide == boxSide2) {
                endSide = actionSpec.getStartSide();
            } else {
                endSide = actionSpec.getEndSide();
            }
            z6 = false;
            ActionConfig actionConfig = (ActionConfig) tn.o.z0(0, endSide);
            if (actionConfig != null) {
                ho.p onAction = this.$actionSpec.getOnAction();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = onAction.invoke(actionConfig, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z6);
        }
        z6 = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z6);
    }
}

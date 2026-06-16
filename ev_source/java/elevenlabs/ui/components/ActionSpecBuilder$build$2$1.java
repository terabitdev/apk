package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.ActionSpecBuilder$build$2$1", f = "SwipeToActionBox.kt", l = {746}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cfg", "Lio/elevenlabs/ui/components/ActionConfig;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ActionSpecBuilder$build$2$1 extends yn.i implements ho.p {
    final /* synthetic */ Map<ActionConfig, u2.s2> $fresh;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActionSpecBuilder$build$2$1(Map<ActionConfig, ? extends u2.s2> map, wn.c<? super ActionSpecBuilder$build$2$1> cVar) {
        super(2, cVar);
        this.$fresh = map;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        ActionSpecBuilder$build$2$1 actionSpecBuilder$build$2$1 = new ActionSpecBuilder$build$2$1(this.$fresh, cVar);
        actionSpecBuilder$build$2$1.L$0 = obj;
        return actionSpecBuilder$build$2$1;
    }

    @Override // ho.p
    public final Object invoke(ActionConfig actionConfig, wn.c<? super Boolean> cVar) {
        return ((ActionSpecBuilder$build$2$1) create(actionConfig, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean z6;
        ho.l lVar;
        ActionConfig actionConfig = (ActionConfig) this.L$0;
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
            u2.s2 s2Var = this.$fresh.get(actionConfig);
            if (s2Var != null && (lVar = (ho.l) s2Var.getValue()) != null) {
                this.L$0 = null;
                this.label = 1;
                obj = lVar.invoke(this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                z6 = false;
                return Boolean.valueOf(z6);
            }
        }
        z6 = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z6);
    }
}

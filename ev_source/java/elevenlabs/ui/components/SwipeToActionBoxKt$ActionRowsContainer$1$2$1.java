package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class SwipeToActionBoxKt$ActionRowsContainer$1$2$1 extends kotlin.jvm.internal.j implements ho.l {
    final /* synthetic */ ActionSpec $actionSpec;
    final /* synthetic */ fr.d0 $scope;
    final /* synthetic */ n1.p $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionBoxKt$ActionRowsContainer$1$2$1(fr.d0 d0Var, ActionSpec actionSpec, n1.p pVar) {
        super(1, kotlin.jvm.internal.l.class, "handleActionTap", "ActionRowsContainer$lambda$1$handleActionTap(Lkotlinx/coroutines/CoroutineScope;Lio/elevenlabs/ui/components/ActionSpec;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lio/elevenlabs/ui/components/ActionConfig;)V", 0);
        this.$scope = d0Var;
        this.$actionSpec = actionSpec;
        this.$state = pVar;
    }

    public final void invoke(ActionConfig actionConfig) {
        actionConfig.getClass();
        SwipeToActionBoxKt.ActionRowsContainer$lambda$1$handleActionTap(this.$scope, this.$actionSpec, this.$state, actionConfig);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ActionConfig) obj);
        return sn.z.f31622a;
    }
}

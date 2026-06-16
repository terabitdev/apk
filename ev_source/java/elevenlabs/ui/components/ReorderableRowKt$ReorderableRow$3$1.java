package io.elevenlabs.ui.components;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReorderableRowKt$ReorderableRow$3$1 implements PointerInputEventHandler {
    final /* synthetic */ DragDropState $dragDropState;
    final /* synthetic */ u2.z0 $overscrollJob$delegate;
    final /* synthetic */ fr.d0 $scope;

    public ReorderableRowKt$ReorderableRow$3$1(DragDropState dragDropState, u2.z0 z0Var, fr.d0 d0Var) {
        this.$dragDropState = dragDropState;
        this.$overscrollJob$delegate = z0Var;
        this.$scope = d0Var;
    }

    public static final sn.z invoke$lambda$0(DragDropState dragDropState, o3.b bVar) {
        dragDropState.m1830onDragStartk4lQ0M(bVar.f24764a);
        return sn.z.f31622a;
    }

    public static final sn.z invoke$lambda$1(DragDropState dragDropState, u2.z0 z0Var) {
        fr.k1 ReorderableRow$lambda$3;
        dragDropState.onDragInterrupted();
        ReorderableRow$lambda$3 = ReorderableRowKt.ReorderableRow$lambda$3(z0Var);
        if (ReorderableRow$lambda$3 != null) {
            ReorderableRow$lambda$3.cancel((CancellationException) null);
        }
        return sn.z.f31622a;
    }

    public static final sn.z invoke$lambda$2(DragDropState dragDropState, u2.z0 z0Var) {
        fr.k1 ReorderableRow$lambda$3;
        dragDropState.onDragInterrupted();
        ReorderableRow$lambda$3 = ReorderableRowKt.ReorderableRow$lambda$3(z0Var);
        if (ReorderableRow$lambda$3 != null) {
            ReorderableRow$lambda$3.cancel((CancellationException) null);
        }
        return sn.z.f31622a;
    }

    public static final sn.z invoke$lambda$3(DragDropState dragDropState, c4.a0 a0Var, u2.z0 z0Var, fr.d0 d0Var, c4.v vVar, o3.b bVar) {
        fr.k1 ReorderableRow$lambda$3;
        fr.k1 ReorderableRow$lambda$32;
        vVar.getClass();
        vVar.a();
        dragDropState.m1829onDragk4lQ0M(bVar.f24764a);
        ReorderableRow$lambda$3 = ReorderableRowKt.ReorderableRow$lambda$3(z0Var);
        sn.z zVar = sn.z.f31622a;
        if (ReorderableRow$lambda$3 == null || !ReorderableRow$lambda$3.isActive()) {
            float checkForOverScroll = dragDropState.checkForOverScroll();
            Float valueOf = Float.valueOf(checkForOverScroll);
            if (checkForOverScroll == t2.u.P) {
                valueOf = null;
            }
            if (valueOf != null) {
                z0Var.setValue(fr.g0.D(d0Var, null, null, new ReorderableRowKt$ReorderableRow$3$1$4$2$1(dragDropState, valueOf.floatValue(), null), 3));
                return zVar;
            }
            ReorderableRow$lambda$32 = ReorderableRowKt.ReorderableRow$lambda$3(z0Var);
            if (ReorderableRow$lambda$32 != null) {
                ReorderableRow$lambda$32.cancel((CancellationException) null);
            }
        }
        return zVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c4.a0 a0Var, wn.c<? super sn.z> cVar) {
        DragDropState dragDropState = this.$dragDropState;
        a2 a2Var = new a2(dragDropState, 0);
        u2.z0 z0Var = this.$overscrollJob$delegate;
        b2 b2Var = new b2(dragDropState, z0Var, 0);
        b2 b2Var2 = new b2(dragDropState, z0Var, 1);
        c2 c2Var = new c2(dragDropState, a0Var, z0Var, this.$scope);
        float f10 = n1.y0.f24033a;
        Object m10 = n1.g.m(a0Var, new n1.w0(a2Var, b2Var, b2Var2, c2Var, null), cVar);
        sn.z zVar = sn.z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (m10 != aVar) {
            m10 = zVar;
        }
        if (m10 == aVar) {
            return m10;
        }
        return zVar;
    }
}

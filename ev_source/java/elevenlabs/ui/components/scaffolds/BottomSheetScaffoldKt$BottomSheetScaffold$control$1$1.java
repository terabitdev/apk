package io.elevenlabs.ui.components.scaffolds;

import fr.d0;
import fr.g0;
import io.elevenlabs.data.database.entities.reads.h;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.u5;
import sn.z;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/elevenlabs/ui/components/scaffolds/BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1", "Lio/elevenlabs/ui/components/scaffolds/BottomSheetControl;", "Lsn/z;", "close", "()V", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1 implements BottomSheetControl {
    final /* synthetic */ s2 $currentOnDismiss;
    final /* synthetic */ d0 $scope;
    final /* synthetic */ u5 $sheetState;

    public BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1(d0 d0Var, u5 u5Var, s2 s2Var) {
        this.$scope = d0Var;
        this.$sheetState = u5Var;
        this.$currentOnDismiss = s2Var;
    }

    public static /* synthetic */ z a(u5 u5Var, s2 s2Var, Throwable th) {
        return close$lambda$0(u5Var, s2Var, th);
    }

    public static final z close$lambda$0(u5 u5Var, s2 s2Var, Throwable th) {
        if (!u5Var.d()) {
            ((ho.a) s2Var.getValue()).invoke();
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.ui.components.scaffolds.BottomSheetControl
    public void close() {
        g0.D(this.$scope, null, null, new BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1$close$1(this.$sheetState, null), 3).invokeOnCompletion(new h(this.$sheetState, this.$currentOnDismiss, 23));
    }
}

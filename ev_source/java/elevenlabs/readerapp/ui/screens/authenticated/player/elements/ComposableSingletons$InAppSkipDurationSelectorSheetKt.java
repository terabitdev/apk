package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$InAppSkipDurationSelectorSheetKt {
    public static final ComposableSingletons$InAppSkipDurationSelectorSheetKt INSTANCE = new ComposableSingletons$InAppSkipDurationSelectorSheetKt();
    private static ho.q lambda$2029582497 = new c3.j(new f(2), false, 2029582497);

    public static final sn.z lambda_2029582497$lambda$0(BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        bottomSheetControl.getClass();
        HeaderKt.EchoHeader(kj.c.R(mVar, R.string.player_preferences_controls_select_action), null, null, c3.k.d(1542749463, true, new e(bottomSheetControl, 1), mVar), null, mVar, 3072, 22);
        return sn.z.f31622a;
    }

    public static final sn.z lambda_2029582497$lambda$0$0(BottomSheetControl bottomSheetControl, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(bottomSheetControl);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new b(bottomSheetControl, 3);
                qVar.h0(L);
            }
            CloseButtonKt.CloseButton((ho.a) L, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_2029582497$lambda$0$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public final ho.q getLambda$2029582497$app_productionRelease() {
        return lambda$2029582497;
    }
}

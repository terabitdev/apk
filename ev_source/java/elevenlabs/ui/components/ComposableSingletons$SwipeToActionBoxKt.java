package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SwipeToActionBoxKt {
    public static final ComposableSingletons$SwipeToActionBoxKt INSTANCE = new ComposableSingletons$SwipeToActionBoxKt();
    private static ho.p lambda$302957945 = new c3.j(new n0(20), false, 302957945);

    /* renamed from: lambda$-1061626336 */
    private static ho.p f668lambda$1061626336 = new c3.j(new n0(21), false, -1061626336);

    public static final sn.z lambda_302957945$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SwipeToActionBoxKt.TestingSwipeToActionBoxContent(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1061626336$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SwipeToActionBoxKt.TestingSwipeToActionBoxContent(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1061626336$ui_release */
    public final ho.p m1824getLambda$1061626336$ui_release() {
        return f668lambda$1061626336;
    }

    public final ho.p getLambda$302957945$ui_release() {
        return lambda$302957945;
    }
}

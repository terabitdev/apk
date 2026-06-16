package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SelectableBadgeBoxKt {
    public static final ComposableSingletons$SelectableBadgeBoxKt INSTANCE = new ComposableSingletons$SelectableBadgeBoxKt();

    /* renamed from: lambda$-239422764 */
    private static ho.p f664lambda$239422764 = new c3.j(new n0(7), false, -239422764);
    private static ho.p lambda$1109497035 = new c3.j(new n0(8), false, 1109497035);
    private static ho.p lambda$1302428236 = new c3.j(new n0(9), false, 1302428236);
    private static ho.p lambda$1495359437 = new c3.j(new n0(10), false, 1495359437);

    public static final sn.z lambda_1109497035$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d("Selected with badge", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262142);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1302428236$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d("Unselected no badge", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262142);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1495359437$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d("Unselected with badge", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262142);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__239422764$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d("Selected no badge", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262142);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-239422764$ui_release */
    public final ho.p m1820getLambda$239422764$ui_release() {
        return f664lambda$239422764;
    }

    public final ho.p getLambda$1109497035$ui_release() {
        return lambda$1109497035;
    }

    public final ho.p getLambda$1302428236$ui_release() {
        return lambda$1302428236;
    }

    public final ho.p getLambda$1495359437$ui_release() {
        return lambda$1495359437;
    }
}

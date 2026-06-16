package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SelectableBoxKt {
    public static final ComposableSingletons$SelectableBoxKt INSTANCE = new ComposableSingletons$SelectableBoxKt();
    private static ho.p lambda$740042356 = new c3.j(new n0(11), false, 740042356);

    /* renamed from: lambda$-654756821 */
    private static ho.p f665lambda$654756821 = new c3.j(new n0(12), false, -654756821);

    public static final sn.z lambda_740042356$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d("Unselected", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262142);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__654756821$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d("Selected", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262142);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-654756821$ui_release */
    public final ho.p m1821getLambda$654756821$ui_release() {
        return f665lambda$654756821;
    }

    public final ho.p getLambda$740042356$ui_release() {
        return lambda$740042356;
    }
}

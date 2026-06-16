package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HintKt {
    public static final ComposableSingletons$HintKt INSTANCE = new ComposableSingletons$HintKt();
    private static ho.p lambda$1829776294 = new c3.j(new j(28), false, 1829776294);
    private static ho.p lambda$495529245 = new c3.j(new j(29), false, 495529245);

    public static final sn.z lambda_1829776294$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d("Hint", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262142);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_495529245$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d("Hint that takes few lines minimum. It will be a very long text.", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262142);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$1829776294$ui_release() {
        return lambda$1829776294;
    }

    public final ho.p getLambda$495529245$ui_release() {
        return lambda$495529245;
    }
}

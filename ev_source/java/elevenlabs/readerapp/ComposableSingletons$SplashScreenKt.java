package io.elevenlabs.readerapp;

import ho.q;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import r1.z1;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SplashScreenKt {
    public static final ComposableSingletons$SplashScreenKt INSTANCE = new ComposableSingletons$SplashScreenKt();
    private static q lambda$1339584156 = new c3.j(new Object(), false, 1339584156);

    /* JADX INFO: Access modifiers changed from: private */
    public static final z lambda_1339584156$lambda$0(z1 z1Var, m mVar, int i10) {
        boolean z6;
        int i11;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(r1.d.D(p2.d(i3.q.f13017a, 1.0f), z1Var), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final q getLambda$1339584156$app_productionRelease() {
        return lambda$1339584156;
    }
}

package io.elevenlabs.readerapp;

import io.elevenlabs.highlighter.y;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Lsn/z;", "SplashScreen", "(Lu2/m;I)V", "Preview_SplashScreen", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SplashScreenKt {
    public static final void Preview_SplashScreen(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-539597002);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SplashScreen(qVar, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 14);
        }
    }

    public static final z Preview_SplashScreen$lambda$0(int i10, m mVar, int i11) {
        Preview_SplashScreen(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void SplashScreen(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-110073267);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            k5.a(null, null, null, null, null, 0, 0L, 0L, null, ComposableSingletons$SplashScreenKt.INSTANCE.getLambda$1339584156$app_productionRelease(), qVar, 805306368, 511);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 15);
        }
    }

    public static final z SplashScreen$lambda$0(int i10, m mVar, int i11) {
        SplashScreen(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

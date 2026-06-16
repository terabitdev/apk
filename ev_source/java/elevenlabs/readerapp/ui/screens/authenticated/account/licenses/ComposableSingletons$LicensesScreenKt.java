package io.elevenlabs.readerapp.ui.screens.authenticated.account.licenses;

import a2.f;
import c3.j;
import ho.q;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d;
import r1.p2;
import r1.z1;
import sn.z;
import u2.m;
import wn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$LicensesScreenKt {
    public static final ComposableSingletons$LicensesScreenKt INSTANCE = new ComposableSingletons$LicensesScreenKt();

    /* renamed from: lambda$-1622340061 */
    private static q f227lambda$1622340061 = new j(new f(3), false, -1622340061);

    public static final z lambda__1622340061$lambda$0(z1 z1Var, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            e.c(d.D(p2.d(i3.q.f13017a, 1.0f), z1Var), null, null, null, null, false, false, false, null, null, null, null, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1622340061$app_productionRelease */
    public final q m1262getLambda$1622340061$app_productionRelease() {
        return f227lambda$1622340061;
    }
}

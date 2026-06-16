package io.elevenlabs.readerapp.ui;

import em.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import na.c0;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lna/c0;", "nav", "Lsn/z;", "DevScreen", "(Lna/c0;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DevScreenKt {
    public static final void DevScreen(c0 c0Var, m mVar, int i10) {
        boolean z6;
        c0Var.getClass();
        q qVar = (q) mVar;
        qVar.Z(-790567024);
        int i11 = i10 & 1;
        if (i11 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!qVar.O(i11, z6)) {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(c0Var, i10, 0);
        }
    }

    public static final z DevScreen$lambda$0(c0 c0Var, int i10, m mVar, int i11) {
        DevScreen(c0Var, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static /* synthetic */ z a(c0 c0Var, int i10, m mVar, int i11) {
        return DevScreen$lambda$0(c0Var, i10, mVar, i11);
    }
}

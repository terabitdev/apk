package io.elevenlabs.readerapp.ui.screens.authenticated.account.licenses;

import c3.k;
import defpackage.d;
import hm.b;
import ho.a;
import i3.f;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import r1.l2;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "LicensesScreen", "(Lho/a;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LicensesScreenKt {
    public static final void LicensesScreen(a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-777650350);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            k5.a(null, k.d(-485129970, true, new hm.a(0, aVar), qVar), null, null, null, 0, 0L, 0L, null, ComposableSingletons$LicensesScreenKt.INSTANCE.m1262getLambda$1622340061$app_productionRelease(), qVar, 805306416, 509);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(aVar, i10, 0);
        }
    }

    public static final z LicensesScreen$lambda$0(a aVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((t) null, c.R(qVar, R.string.settings_licenses), k.d(347202515, true, new d(1, aVar), qVar), (ho.q) null, (f) null, qVar, 384, 25);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z LicensesScreen$lambda$0$0(a aVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z LicensesScreen$lambda$1(a aVar, int i10, m mVar, int i11) {
        LicensesScreen(aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

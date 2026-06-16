package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AccountSignOutWarningDialogKt {
    public static final ComposableSingletons$AccountSignOutWarningDialogKt INSTANCE = new ComposableSingletons$AccountSignOutWarningDialogKt();

    /* renamed from: lambda$-377751989 */
    private static p f211lambda$377751989 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(20), false, -377751989);
    private static p lambda$777613676 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(21), false, 777613676);

    public static final z lambda_777613676$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.components.explore.b(20);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.components.explore.b(21);
                qVar.h0(L2);
            }
            AccountSignOutWarningDialogKt.AccountSignOutWarningGenericDialog(aVar, (ho.a) L2, qVar, 54);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__377751989$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.components.explore.b(19);
                qVar.h0(L);
            }
            AccountSignOutWarningDialogKt.AccountSignOutWarningDialogContent((ho.a) L, qVar, 6);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-377751989$app_productionRelease */
    public final p m1239getLambda$377751989$app_productionRelease() {
        return f211lambda$377751989;
    }

    public final p getLambda$777613676$app_productionRelease() {
        return lambda$777613676;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ContentPreferencesScreenKt {
    public static final ComposableSingletons$ContentPreferencesScreenKt INSTANCE = new ComposableSingletons$ContentPreferencesScreenKt();
    private static ho.p lambda$1802214765 = new c3.j(new l(0), false, 1802214765);

    public static final z lambda_1802214765$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Boolean bool = Boolean.TRUE;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new j(28);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k(0);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new k(1);
                qVar.h0(L3);
            }
            ho.a aVar2 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new k(2);
                qVar.h0(L4);
            }
            ho.a aVar3 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new k(3);
                qVar.h0(L5);
            }
            ContentPreferencesScreenKt.ContentPreferencesScreenUI(bool, lVar, aVar, aVar2, aVar3, (ho.a) L5, qVar, 224694);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1802214765$lambda$0$0$0(boolean z6) {
        return z.f31622a;
    }

    public final ho.p getLambda$1802214765$app_productionRelease() {
        return lambda$1802214765;
    }
}

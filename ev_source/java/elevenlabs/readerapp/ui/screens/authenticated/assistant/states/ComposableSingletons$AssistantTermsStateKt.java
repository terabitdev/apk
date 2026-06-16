package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states;

import a2.e3;
import c3.j;
import ho.a;
import ho.p;
import im.d;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.a7;
import sn.z;
import t2.u;
import u2.e;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AssistantTermsStateKt {
    public static final ComposableSingletons$AssistantTermsStateKt INSTANCE = new ComposableSingletons$AssistantTermsStateKt();
    private static p lambda$264941741 = new j(new e3(29), false, 264941741);
    private static p lambda$1395185106 = new j(new d(0), false, 1395185106);

    public static final z lambda_1395185106$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            a7.a(null, null, 0L, 0L, u.P, u.P, null, lambda$264941741, qVar, 12582912, 127);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_264941741$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new a2.m(25);
                qVar.h0(L);
            }
            a aVar = (a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a2.m(26);
                qVar.h0(L2);
            }
            AssistantTermsStateKt.AssistantTermsState(aVar, (a) L2, null, qVar, 54, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$1395185106$app_productionRelease() {
        return lambda$1395185106;
    }

    public final p getLambda$264941741$app_productionRelease() {
        return lambda$264941741;
    }
}

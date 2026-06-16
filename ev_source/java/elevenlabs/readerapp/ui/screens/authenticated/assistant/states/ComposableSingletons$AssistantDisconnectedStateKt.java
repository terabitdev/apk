package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states;

import a2.e3;
import c3.j;
import ho.a;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.a7;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AssistantDisconnectedStateKt {
    public static final ComposableSingletons$AssistantDisconnectedStateKt INSTANCE = new ComposableSingletons$AssistantDisconnectedStateKt();
    private static p lambda$1281543177 = new j(new e3(23), false, 1281543177);
    private static p lambda$106073198 = new j(new e3(24), false, 106073198);
    private static p lambda$197541222 = new j(new e3(25), false, 197541222);

    /* renamed from: lambda$-1421835381 */
    private static p f262lambda$1421835381 = new j(new e3(26), false, -1421835381);

    public static final z lambda_106073198$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            a7.a(null, null, 0L, 0L, u.P, u.P, null, lambda$1281543177, qVar, 12582912, 127);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1281543177$lambda$0(m mVar, int i10) {
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
                L = new a2.m(22);
                qVar.h0(L);
            }
            AssistantDisconnectedStateKt.AssistantDisconnectedState((a) L, null, null, qVar, 6, 6);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_197541222$lambda$0(m mVar, int i10) {
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
                L = new a2.m(23);
                qVar.h0(L);
            }
            AssistantDisconnectedStateKt.AssistantDisconnectedState((a) L, null, "Network error. Please check your connection.", qVar, 390, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1421835381$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            a7.a(null, null, 0L, 0L, u.P, u.P, null, lambda$197541222, qVar, 12582912, 127);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1421835381$app_productionRelease */
    public final p m1298getLambda$1421835381$app_productionRelease() {
        return f262lambda$1421835381;
    }

    public final p getLambda$106073198$app_productionRelease() {
        return lambda$106073198;
    }

    public final p getLambda$1281543177$app_productionRelease() {
        return lambda$1281543177;
    }

    public final p getLambda$197541222$app_productionRelease() {
        return lambda$197541222;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AssistantMenuKt {
    public static final ComposableSingletons$AssistantMenuKt INSTANCE = new ComposableSingletons$AssistantMenuKt();
    private static ho.p lambda$1168504118 = new c3.j(new y(1), false, 1168504118);

    public static final sn.z lambda_1168504118$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new z(0);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new z(1);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new z(2);
                qVar.h0(L3);
            }
            AssistantMenuKt.AssistantMenu(true, aVar, aVar2, (ho.a) L3, false, qVar, 28086);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$1168504118$app_productionRelease() {
        return lambda$1168504118;
    }
}

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
public final class ComposableSingletons$AccountPreferencesKt {
    public static final ComposableSingletons$AccountPreferencesKt INSTANCE = new ComposableSingletons$AccountPreferencesKt();
    private static p lambda$664424771 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(19), false, 664424771);

    public static final z lambda_664424771$lambda$0(m mVar, int i10) {
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
                L = new io.elevenlabs.readerapp.ui.components.explore.b(15);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.components.explore.b(16);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.components.explore.b(17);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new io.elevenlabs.readerapp.ui.components.explore.b(18);
                qVar.h0(L4);
            }
            AccountPreferencesKt.AccountPreferences(aVar, aVar2, aVar3, (ho.a) L4, qVar, 3510);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$664424771$app_productionRelease() {
        return lambda$664424771;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.j;
import ho.p;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.readerapp.ui.previews.HomeFactoryKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeAccountButtonKt {
    public static final ComposableSingletons$HomeAccountButtonKt INSTANCE = new ComposableSingletons$HomeAccountButtonKt();

    /* renamed from: lambda$-977844541 */
    private static p f375lambda$977844541 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(5), false, -977844541);

    /* renamed from: lambda$-1981976641 */
    private static p f374lambda$1981976641 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(6), false, -1981976641);

    public static final z lambda__1981976641$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            User stubUser = HomeFactoryKt.stubUser();
            Boolean bool = Boolean.FALSE;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(13);
                qVar.h0(L);
            }
            HomeAccountButtonKt.HomeAccountButtonV4(stubUser, bool, (ho.a) L, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__977844541$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            User stubUser = HomeFactoryKt.stubUser();
            Boolean bool = Boolean.TRUE;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(12);
                qVar.h0(L);
            }
            HomeAccountButtonKt.HomeAccountButtonV4(stubUser, bool, (ho.a) L, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1981976641$app_productionRelease */
    public final p m1425getLambda$1981976641$app_productionRelease() {
        return f374lambda$1981976641;
    }

    /* renamed from: getLambda$-977844541$app_productionRelease */
    public final p m1426getLambda$977844541$app_productionRelease() {
        return f375lambda$977844541;
    }
}

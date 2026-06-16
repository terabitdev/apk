package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory;

import c3.j;
import ho.q;
import io.elevenlabs.ui.components.LoaderKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HoursHistoryScreenKt {
    public static final ComposableSingletons$HoursHistoryScreenKt INSTANCE = new ComposableSingletons$HoursHistoryScreenKt();

    /* renamed from: lambda$-2038271362 */
    private static q f542lambda$2038271362 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(13), false, -2038271362);

    public static final z lambda__2038271362$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            LoaderKt.LoaderRow(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-2038271362$app_productionRelease */
    public final q m1647getLambda$2038271362$app_productionRelease() {
        return f542lambda$2038271362;
    }
}

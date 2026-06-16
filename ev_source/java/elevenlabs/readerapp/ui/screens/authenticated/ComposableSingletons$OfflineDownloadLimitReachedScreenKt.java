package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$OfflineDownloadLimitReachedScreenKt {
    public static final ComposableSingletons$OfflineDownloadLimitReachedScreenKt INSTANCE = new ComposableSingletons$OfflineDownloadLimitReachedScreenKt();

    /* renamed from: lambda$-1822224156 */
    private static ho.p f184lambda$1822224156 = new c3.j(new b(10), false, -1822224156);

    public static final sn.z lambda__1822224156$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.offline_downloads_unavailable_body);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new d(21);
                qVar.h0(L);
            }
            OfflineDownloadLimitReachedScreenKt.OfflineDownloadLimitReachedScreen(R, (ho.a) L, qVar, 48);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1822224156$app_productionRelease */
    public final ho.p m1193getLambda$1822224156$app_productionRelease() {
        return f184lambda$1822224156;
    }
}

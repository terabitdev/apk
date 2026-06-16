package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewAddReadToCollectionErrorDefaultGroupPreviewAddReadToCollectionErrorKt {
    public static final ComposableSingletons$PreviewAddReadToCollectionErrorDefaultGroupPreviewAddReadToCollectionErrorKt INSTANCE = new ComposableSingletons$PreviewAddReadToCollectionErrorDefaultGroupPreviewAddReadToCollectionErrorKt();
    private static ho.p lambda$56621132 = new c3.j(new i0(15), false, 56621132);

    public static final sn.z lambda_56621132$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AddReadToCollectionScreenKt.Preview_AddReadToCollection_Error(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$56621132$app_productionRelease() {
        return lambda$56621132;
    }
}

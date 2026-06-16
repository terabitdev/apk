package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewLibraryScreenCollectionsloadedDefaultGroupPreviewLibraryScreenCollectionsloadedKt {
    public static final ComposableSingletons$PreviewLibraryScreenCollectionsloadedDefaultGroupPreviewLibraryScreenCollectionsloadedKt INSTANCE = new ComposableSingletons$PreviewLibraryScreenCollectionsloadedDefaultGroupPreviewLibraryScreenCollectionsloadedKt();

    /* renamed from: lambda$-508461978 */
    private static ho.p f404lambda$508461978 = new c3.j(new b(19), false, -508461978);

    public static /* synthetic */ sn.z a(u2.m mVar, int i10) {
        return lambda__508461978$lambda$0(mVar, i10);
    }

    public static final sn.z lambda__508461978$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            LibraryScreenKt.Preview_LibraryScreen_Collections_loaded(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-508461978$app_productionRelease */
    public final ho.p m1461getLambda$508461978$app_productionRelease() {
        return f404lambda$508461978;
    }
}

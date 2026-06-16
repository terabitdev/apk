package io.elevenlabs.readerapp;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewSplashScreenDefaultGroupPreviewSplashScreenKt {
    public static final ComposableSingletons$PreviewSplashScreenDefaultGroupPreviewSplashScreenKt INSTANCE = new ComposableSingletons$PreviewSplashScreenDefaultGroupPreviewSplashScreenKt();

    /* renamed from: lambda$-261611337, reason: not valid java name */
    private static p f48lambda$261611337 = new c3.j(new Object(), false, -261611337);

    /* JADX INFO: Access modifiers changed from: private */
    public static final z lambda__261611337$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SplashScreenKt.Preview_SplashScreen(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-261611337$app_productionRelease, reason: not valid java name */
    public final p m1004getLambda$261611337$app_productionRelease() {
        return f48lambda$261611337;
    }
}

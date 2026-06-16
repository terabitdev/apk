package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewSoundscapesScreenLoadingDefaultGroupPreviewSoundscapesScreenLoading1Kt {
    public static final ComposableSingletons$PreviewSoundscapesScreenLoadingDefaultGroupPreviewSoundscapesScreenLoading1Kt INSTANCE = new ComposableSingletons$PreviewSoundscapesScreenLoadingDefaultGroupPreviewSoundscapesScreenLoading1Kt();

    /* renamed from: lambda$-1093583970 */
    private static p f457lambda$1093583970 = new c3.j(new a(6), false, -1093583970);

    public static final z lambda__1093583970$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SoundscapesScreenKt.Preview_SoundscapesScreen_Loading(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1093583970$app_productionRelease */
    public final p m1534getLambda$1093583970$app_productionRelease() {
        return f457lambda$1093583970;
    }
}

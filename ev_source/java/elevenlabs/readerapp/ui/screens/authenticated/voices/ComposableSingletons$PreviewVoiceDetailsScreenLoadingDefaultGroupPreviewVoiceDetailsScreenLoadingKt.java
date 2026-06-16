package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewVoiceDetailsScreenLoadingDefaultGroupPreviewVoiceDetailsScreenLoadingKt {
    public static final ComposableSingletons$PreviewVoiceDetailsScreenLoadingDefaultGroupPreviewVoiceDetailsScreenLoadingKt INSTANCE = new ComposableSingletons$PreviewVoiceDetailsScreenLoadingDefaultGroupPreviewVoiceDetailsScreenLoadingKt();
    private static ho.p lambda$61638252 = new c3.j(new a(3), false, 61638252);

    public static final z lambda_61638252$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoiceDetailsScreenKt.Preview_VoiceDetailsScreen_Loading(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final ho.p getLambda$61638252$app_productionRelease() {
        return lambda$61638252;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewAddPronunciationScreenUIErrorDefaultGroupPreviewAddPronunciationScreenUIErrorKt {
    public static final ComposableSingletons$PreviewAddPronunciationScreenUIErrorDefaultGroupPreviewAddPronunciationScreenUIErrorKt INSTANCE = new ComposableSingletons$PreviewAddPronunciationScreenUIErrorDefaultGroupPreviewAddPronunciationScreenUIErrorKt();
    private static ho.p lambda$592977535 = new c3.j(new a(1), false, 592977535);

    public static final z lambda_592977535$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PronunciationScreenKt.Preview_AddPronunciationScreenUI_Error(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final ho.p getLambda$592977535$app_productionRelease() {
        return lambda$592977535;
    }
}

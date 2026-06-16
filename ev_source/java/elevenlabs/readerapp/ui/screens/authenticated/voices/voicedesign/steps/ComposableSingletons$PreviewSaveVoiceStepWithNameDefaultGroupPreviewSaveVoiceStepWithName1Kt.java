package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewSaveVoiceStepWithNameDefaultGroupPreviewSaveVoiceStepWithName1Kt {
    public static final ComposableSingletons$PreviewSaveVoiceStepWithNameDefaultGroupPreviewSaveVoiceStepWithName1Kt INSTANCE = new ComposableSingletons$PreviewSaveVoiceStepWithNameDefaultGroupPreviewSaveVoiceStepWithName1Kt();

    /* renamed from: lambda$-1833087061 */
    private static p f629lambda$1833087061 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.series.a(17), false, -1833087061);

    public static final z lambda__1833087061$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SaveVoiceStepKt.Preview_SaveVoiceStep_WithName(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1833087061$app_productionRelease */
    public final p m1759getLambda$1833087061$app_productionRelease() {
        return f629lambda$1833087061;
    }
}

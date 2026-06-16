package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.components;

import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import lm.e;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewUsageCategoryCardTextToAudioWithInfoTooltipDefaultGroupPreviewUsageCategoryCardTextToAudioWithInfoTooltipKt {
    public static final ComposableSingletons$PreviewUsageCategoryCardTextToAudioWithInfoTooltipDefaultGroupPreviewUsageCategoryCardTextToAudioWithInfoTooltipKt INSTANCE = new ComposableSingletons$PreviewUsageCategoryCardTextToAudioWithInfoTooltipDefaultGroupPreviewUsageCategoryCardTextToAudioWithInfoTooltipKt();
    private static p lambda$809388670 = new j(new e(24), false, 809388670);

    public static /* synthetic */ z a(m mVar, int i10) {
        return lambda_809388670$lambda$0(mVar, i10);
    }

    public static final z lambda_809388670$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            UsageCategoryCardKt.Preview_UsageCategoryCard_TextToAudio_WithInfoTooltip(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$809388670$app_productionRelease() {
        return lambda$809388670;
    }
}

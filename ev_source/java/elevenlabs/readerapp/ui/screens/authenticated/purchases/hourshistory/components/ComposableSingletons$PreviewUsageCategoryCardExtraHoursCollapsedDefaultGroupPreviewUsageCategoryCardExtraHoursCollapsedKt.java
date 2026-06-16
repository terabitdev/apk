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
public final class ComposableSingletons$PreviewUsageCategoryCardExtraHoursCollapsedDefaultGroupPreviewUsageCategoryCardExtraHoursCollapsedKt {
    public static final ComposableSingletons$PreviewUsageCategoryCardExtraHoursCollapsedDefaultGroupPreviewUsageCategoryCardExtraHoursCollapsedKt INSTANCE = new ComposableSingletons$PreviewUsageCategoryCardExtraHoursCollapsedDefaultGroupPreviewUsageCategoryCardExtraHoursCollapsedKt();

    /* renamed from: lambda$-419953410 */
    private static p f546lambda$419953410 = new j(new e(19), false, -419953410);

    public static /* synthetic */ z a(m mVar, int i10) {
        return lambda__419953410$lambda$0(mVar, i10);
    }

    public static final z lambda__419953410$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            UsageCategoryCardKt.Preview_UsageCategoryCard_ExtraHours_Collapsed(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-419953410$app_productionRelease */
    public final p m1653getLambda$419953410$app_productionRelease() {
        return f546lambda$419953410;
    }
}

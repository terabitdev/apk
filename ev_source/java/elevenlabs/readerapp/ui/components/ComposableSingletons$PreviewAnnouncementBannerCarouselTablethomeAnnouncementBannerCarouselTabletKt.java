package io.elevenlabs.readerapp.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewAnnouncementBannerCarouselTablethomeAnnouncementBannerCarouselTabletKt {
    public static final ComposableSingletons$PreviewAnnouncementBannerCarouselTablethomeAnnouncementBannerCarouselTabletKt INSTANCE = new ComposableSingletons$PreviewAnnouncementBannerCarouselTablethomeAnnouncementBannerCarouselTabletKt();
    private static ho.p lambda$1005595999 = new c3.j(new im.d(22), false, 1005595999);

    public static final sn.z lambda_1005595999$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AnnouncementBannerCarouselKt.Preview_AnnouncementBannerCarousel_Tablet(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$1005595999$app_productionRelease() {
        return lambda$1005595999;
    }
}

package io.elevenlabs.readerapp.ui.components.explore;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewExploreBookCoverBlurPlaceholderexploreBookCoverBlurPlaceholderKt {
    public static final ComposableSingletons$PreviewExploreBookCoverBlurPlaceholderexploreBookCoverBlurPlaceholderKt INSTANCE = new ComposableSingletons$PreviewExploreBookCoverBlurPlaceholderexploreBookCoverBlurPlaceholderKt();

    /* renamed from: lambda$-1699818908 */
    private static ho.p f143lambda$1699818908 = new c3.j(new c(14), false, -1699818908);

    public static final z lambda__1699818908$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreBookCoverKt.Preview_ExploreBookCover_BlurPlaceholder(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1699818908$app_productionRelease */
    public final ho.p m1145getLambda$1699818908$app_productionRelease() {
        return f143lambda$1699818908;
    }
}

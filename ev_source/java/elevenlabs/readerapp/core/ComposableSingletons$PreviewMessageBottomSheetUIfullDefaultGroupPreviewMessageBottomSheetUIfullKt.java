package io.elevenlabs.readerapp.core;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewMessageBottomSheetUIfullDefaultGroupPreviewMessageBottomSheetUIfullKt {
    public static final ComposableSingletons$PreviewMessageBottomSheetUIfullDefaultGroupPreviewMessageBottomSheetUIfullKt INSTANCE = new ComposableSingletons$PreviewMessageBottomSheetUIfullDefaultGroupPreviewMessageBottomSheetUIfullKt();

    /* renamed from: lambda$-1416678334 */
    private static ho.p f49lambda$1416678334 = new c3.j(new a(0), false, -1416678334);

    public static final z lambda__1416678334$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MessageBottomSheetOverlayKt.Preview_MessageBottomSheetUI_full(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1416678334$app_productionRelease */
    public final ho.p m1010getLambda$1416678334$app_productionRelease() {
        return f49lambda$1416678334;
    }
}

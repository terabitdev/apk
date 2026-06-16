package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.CenteredCloseHeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$CreateCollectionSheetKt {
    public static final ComposableSingletons$CreateCollectionSheetKt INSTANCE = new ComposableSingletons$CreateCollectionSheetKt();

    /* renamed from: lambda$-177805088 */
    private static ho.q f300lambda$177805088 = new c3.j(new h0(8), false, -177805088);

    public static final sn.z lambda__177805088$lambda$0(BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        bottomSheetControl.getClass();
        String R = kj.c.R(mVar, R.string.new_collection_title);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new g0(bottomSheetControl, 1);
            qVar.h0(L);
        }
        CenteredCloseHeaderKt.CenteredCloseHeader(R, (ho.a) L, qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z lambda__177805088$lambda$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-177805088$app_productionRelease */
    public final ho.q m1344getLambda$177805088$app_productionRelease() {
        return f300lambda$177805088;
    }
}

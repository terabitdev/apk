package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.CenteredCloseHeaderKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AddReadToCollectionScreenKt {
    public static final ComposableSingletons$AddReadToCollectionScreenKt INSTANCE = new ComposableSingletons$AddReadToCollectionScreenKt();

    /* renamed from: lambda$-1363745998 */
    private static ho.q f288lambda$1363745998 = new c3.j(new h0(0), false, -1363745998);

    /* renamed from: lambda$-316069993 */
    private static ho.p f289lambda$316069993 = new c3.j(new i0(0), false, -316069993);
    private static ho.p lambda$128317760 = new c3.j(new i0(1), false, 128317760);

    /* renamed from: lambda$-1251467553 */
    private static ho.p f287lambda$1251467553 = new c3.j(new i0(2), false, -1251467553);

    public static final sn.z lambda_128317760$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AddReadToCollectionScreenKt.EmptyMessage(kj.c.R(qVar, R.string.library_no_collections_found), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1251467553$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            LoaderKt.LoaderRow(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1363745998$lambda$0(BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        bottomSheetControl.getClass();
        String R = kj.c.R(mVar, R.string.add_collection_title);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new g0(bottomSheetControl, 0);
            qVar.h0(L);
        }
        CenteredCloseHeaderKt.CenteredCloseHeader(R, (ho.a) L, qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1363745998$lambda$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__316069993$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AddReadToCollectionScreenKt.EmptyMessage(kj.c.R(qVar, R.string.error_unknown_error), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1251467553$app_productionRelease */
    public final ho.p m1331getLambda$1251467553$app_productionRelease() {
        return f287lambda$1251467553;
    }

    /* renamed from: getLambda$-1363745998$app_productionRelease */
    public final ho.q m1332getLambda$1363745998$app_productionRelease() {
        return f288lambda$1363745998;
    }

    /* renamed from: getLambda$-316069993$app_productionRelease */
    public final ho.p m1333getLambda$316069993$app_productionRelease() {
        return f289lambda$316069993;
    }

    public final ho.p getLambda$128317760$app_productionRelease() {
        return lambda$128317760;
    }
}

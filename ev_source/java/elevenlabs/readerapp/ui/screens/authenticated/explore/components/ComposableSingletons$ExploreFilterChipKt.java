package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import ho.p;
import i3.t;
import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ExploreFilterChipKt {
    public static final ComposableSingletons$ExploreFilterChipKt INSTANCE = new ComposableSingletons$ExploreFilterChipKt();

    /* renamed from: lambda$-989502668 */
    private static p f326lambda$989502668 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(4), false, -989502668);
    private static p lambda$1015416533 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(5), false, 1015416533);
    private static p lambda$246015450 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(6), false, 246015450);

    /* renamed from: lambda$-752273056 */
    private static p f325lambda$752273056 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(7), false, -752273056);
    private static p lambda$1758037098 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(3), false, 1758037098);

    public static final z lambda_1015416533$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(12);
                qVar.h0(L);
            }
            ExploreFilterChipKt.ExploreFilterChip("Science Fiction", true, null, null, null, (ho.a) L, null, null, qVar, 196662, 220);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1758037098$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.close_circle;
            t s10 = p2.s(i3.q.f13017a, 200);
            Integer valueOf = Integer.valueOf(i11);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(13);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(14);
                qVar.h0(L2);
            }
            ExploreFilterChipKt.ExploreFilterChip("This is a very long filter label that should truncate", true, s10, null, valueOf, aVar, (ho.a) L2, "Remove filter", qVar, 14352822, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_246015450$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Integer valueOf = Integer.valueOf(R.drawable.close_circle);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(7);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(10);
                qVar.h0(L2);
            }
            ExploreFilterChipKt.ExploreFilterChip("Magic", true, null, null, valueOf, aVar, (ho.a) L2, "Remove Magic filter", qVar, 14352438, 12);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__752273056$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Integer valueOf = Integer.valueOf(R.drawable.close_circle);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(8);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(9);
                qVar.h0(L2);
            }
            ExploreFilterChipKt.ExploreFilterChip("Fantasy + 2", true, null, null, valueOf, aVar, (ho.a) L2, "Remove genre filters", qVar, 14352438, 12);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__989502668$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(11);
                qVar.h0(L);
            }
            ExploreFilterChipKt.ExploreFilterChip("Fantasy", false, null, null, null, (ho.a) L, null, null, qVar, 196662, 220);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-752273056$app_productionRelease */
    public final p m1370getLambda$752273056$app_productionRelease() {
        return f325lambda$752273056;
    }

    /* renamed from: getLambda$-989502668$app_productionRelease */
    public final p m1371getLambda$989502668$app_productionRelease() {
        return f326lambda$989502668;
    }

    public final p getLambda$1015416533$app_productionRelease() {
        return lambda$1015416533;
    }

    public final p getLambda$1758037098$app_productionRelease() {
        return lambda$1758037098;
    }

    public final p getLambda$246015450$app_productionRelease() {
        return lambda$246015450;
    }
}

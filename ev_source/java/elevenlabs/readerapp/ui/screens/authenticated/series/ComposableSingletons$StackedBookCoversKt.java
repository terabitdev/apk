package io.elevenlabs.readerapp.ui.screens.authenticated.series;

import c3.j;
import ho.p;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import java.util.ArrayList;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$StackedBookCoversKt {
    public static final ComposableSingletons$StackedBookCoversKt INSTANCE = new ComposableSingletons$StackedBookCoversKt();

    /* renamed from: lambda$-824000490 */
    private static p f616lambda$824000490 = new j(new a(6), false, -824000490);
    private static p lambda$872696233 = new j(new a(7), false, 872696233);

    /* renamed from: lambda$-1707509480 */
    private static p f615lambda$1707509480 = new j(new a(8), false, -1707509480);

    /* renamed from: lambda$-10812757 */
    private static p f614lambda$10812757 = new j(new a(9), false, -10812757);
    private static p lambda$1703948826 = new j(new a(10), false, 1703948826);

    /* renamed from: lambda$-894321747 */
    private static p f617lambda$894321747 = new j(new a(11), false, -894321747);

    public static final z lambda_1703948826$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ArrayList arrayList = new ArrayList(5);
            for (int i11 = 0; i11 < 5; i11++) {
                arrayList.add("https://picsum.photos/200/300?random=" + i11);
            }
            StackedBookCoversKt.StackedBookCovers(arrayList, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_872696233$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, f616lambda$824000490, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__10812757$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, f615lambda$1707509480, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1707509480$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ArrayList arrayList = new ArrayList(3);
            for (int i11 = 0; i11 < 3; i11++) {
                arrayList.add("https://picsum.photos/200/300?random=" + i11);
            }
            StackedBookCoversKt.StackedBookCovers(arrayList, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__824000490$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add("https://picsum.photos/200/300?random=0");
            StackedBookCoversKt.StackedBookCovers(arrayList, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__894321747$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, lambda$1703948826, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-10812757$app_productionRelease */
    public final p m1742getLambda$10812757$app_productionRelease() {
        return f614lambda$10812757;
    }

    /* renamed from: getLambda$-1707509480$app_productionRelease */
    public final p m1743getLambda$1707509480$app_productionRelease() {
        return f615lambda$1707509480;
    }

    /* renamed from: getLambda$-824000490$app_productionRelease */
    public final p m1744getLambda$824000490$app_productionRelease() {
        return f616lambda$824000490;
    }

    /* renamed from: getLambda$-894321747$app_productionRelease */
    public final p m1745getLambda$894321747$app_productionRelease() {
        return f617lambda$894321747;
    }

    public final p getLambda$1703948826$app_productionRelease() {
        return lambda$1703948826;
    }

    public final p getLambda$872696233$app_productionRelease() {
        return lambda$872696233;
    }
}

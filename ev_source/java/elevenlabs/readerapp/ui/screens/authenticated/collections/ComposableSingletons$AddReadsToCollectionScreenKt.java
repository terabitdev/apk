package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.EmptyScreenKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.LoaderKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AddReadsToCollectionScreenKt {
    public static final ComposableSingletons$AddReadsToCollectionScreenKt INSTANCE = new ComposableSingletons$AddReadsToCollectionScreenKt();
    private static ho.q lambda$918815243 = new c3.j(new h0(1), false, 918815243);
    private static ho.q lambda$490133570 = new c3.j(new h0(2), false, 490133570);
    private static ho.q lambda$2072485635 = new c3.j(new h0(3), false, 2072485635);

    /* renamed from: lambda$-2142140766 */
    private static ho.q f290lambda$2142140766 = new c3.j(new h0(4), false, -2142140766);

    public static final sn.z lambda_2072485635$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
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

    public static final sn.z lambda_490133570$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        bVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(bVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ErrorScreenKt.m1836ErrorScreenV9fs2A(((t1.c) bVar).d(i3.q.f13017a, 0.7f), null, kj.c.R(qVar, R.string.library_error_refreshing_reads), null, null, 0L, qVar, 0, 58);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_918815243$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EmptyScreenKt.EmptyScreen(null, kj.c.R(qVar, R.string.library_no_reads), qVar, 0, 1);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__2142140766$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
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

    /* renamed from: getLambda$-2142140766$app_productionRelease */
    public final ho.q m1334getLambda$2142140766$app_productionRelease() {
        return f290lambda$2142140766;
    }

    public final ho.q getLambda$2072485635$app_productionRelease() {
        return lambda$2072485635;
    }

    public final ho.q getLambda$490133570$app_productionRelease() {
        return lambda$490133570;
    }

    public final ho.q getLambda$918815243$app_productionRelease() {
        return lambda$918815243;
    }
}

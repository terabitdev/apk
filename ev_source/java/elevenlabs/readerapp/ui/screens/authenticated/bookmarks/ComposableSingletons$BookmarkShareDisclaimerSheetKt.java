package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$BookmarkShareDisclaimerSheetKt {
    public static final ComposableSingletons$BookmarkShareDisclaimerSheetKt INSTANCE = new ComposableSingletons$BookmarkShareDisclaimerSheetKt();
    private static p lambda$131822061 = new c3.j(new m(0), false, 131822061);

    public static final z lambda_131822061$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new a(7);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(8);
                qVar.h0(L2);
            }
            BookmarkShareDisclaimerSheetKt.BookmarkShareDisclaimerSheetUI(aVar, (ho.a) L2, qVar, 54);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$131822061$app_productionRelease() {
        return lambda$131822061;
    }
}

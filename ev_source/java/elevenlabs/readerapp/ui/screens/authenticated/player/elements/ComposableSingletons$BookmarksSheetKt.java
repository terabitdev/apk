package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$BookmarksSheetKt {
    public static final ComposableSingletons$BookmarksSheetKt INSTANCE = new ComposableSingletons$BookmarksSheetKt();
    private static ho.q lambda$1967945360 = new c3.j(new f(1), false, 1967945360);

    public static final sn.z lambda_1967945360$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2359getX7D9Ej5fM()), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.q getLambda$1967945360$app_productionRelease() {
        return lambda$1967945360;
    }
}

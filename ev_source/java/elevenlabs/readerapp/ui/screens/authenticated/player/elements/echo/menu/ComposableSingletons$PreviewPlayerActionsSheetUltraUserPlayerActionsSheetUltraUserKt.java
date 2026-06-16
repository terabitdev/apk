package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu;

import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import lm.e;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewPlayerActionsSheetUltraUserPlayerActionsSheetUltraUserKt {
    public static final ComposableSingletons$PreviewPlayerActionsSheetUltraUserPlayerActionsSheetUltraUserKt INSTANCE = new ComposableSingletons$PreviewPlayerActionsSheetUltraUserPlayerActionsSheetUltraUserKt();

    /* renamed from: lambda$-1774753839 */
    private static p f448lambda$1774753839 = new j(new e(2), false, -1774753839);

    public static /* synthetic */ z a(m mVar, int i10) {
        return lambda__1774753839$lambda$0(mVar, i10);
    }

    public static final z lambda__1774753839$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerActionsSheetKt.Preview_PlayerActionsSheet_UltraUser(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1774753839$app_productionRelease */
    public final p m1515getLambda$1774753839$app_productionRelease() {
        return f448lambda$1774753839;
    }
}

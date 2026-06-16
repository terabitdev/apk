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
public final class ComposableSingletons$PreviewPlayerActionsSheetNoVoiceChatPlayerActionsSheetNoVoiceChatKt {
    public static final ComposableSingletons$PreviewPlayerActionsSheetNoVoiceChatPlayerActionsSheetNoVoiceChatKt INSTANCE = new ComposableSingletons$PreviewPlayerActionsSheetNoVoiceChatPlayerActionsSheetNoVoiceChatKt();

    /* renamed from: lambda$-399362863, reason: not valid java name */
    private static p f447lambda$399362863 = new j(new e(0), false, -399362863);

    /* JADX INFO: Access modifiers changed from: private */
    public static final z lambda__399362863$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerActionsSheetKt.Preview_PlayerActionsSheet_NoVoiceChat(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-399362863$app_productionRelease, reason: not valid java name */
    public final p m1514getLambda$399362863$app_productionRelease() {
        return f447lambda$399362863;
    }
}

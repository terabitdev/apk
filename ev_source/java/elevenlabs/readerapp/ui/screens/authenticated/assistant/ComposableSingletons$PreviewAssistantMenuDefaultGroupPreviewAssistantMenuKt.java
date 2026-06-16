package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewAssistantMenuDefaultGroupPreviewAssistantMenuKt {
    public static final ComposableSingletons$PreviewAssistantMenuDefaultGroupPreviewAssistantMenuKt INSTANCE = new ComposableSingletons$PreviewAssistantMenuDefaultGroupPreviewAssistantMenuKt();

    /* renamed from: lambda$-1779541533 */
    private static ho.p f238lambda$1779541533 = new c3.j(new y(8), false, -1779541533);

    public static final sn.z lambda__1779541533$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AssistantMenuKt.Preview_AssistantMenu(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1779541533$app_productionRelease */
    public final ho.p m1274getLambda$1779541533$app_productionRelease() {
        return f238lambda$1779541533;
    }
}

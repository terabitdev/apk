package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewWriteScreenInputDefaultGroupPreviewWriteScreenInputKt {
    public static final ComposableSingletons$PreviewWriteScreenInputDefaultGroupPreviewWriteScreenInputKt INSTANCE = new ComposableSingletons$PreviewWriteScreenInputDefaultGroupPreviewWriteScreenInputKt();

    /* renamed from: lambda$-677877308 */
    private static ho.p f579lambda$677877308 = new c3.j(new m(3), false, -677877308);

    public static final sn.z lambda__677877308$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WriteScreenKt.Preview_WriteScreen_Input(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-677877308$app_productionRelease */
    public final ho.p m1686getLambda$677877308$app_productionRelease() {
        return f579lambda$677877308;
    }
}

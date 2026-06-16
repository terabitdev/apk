package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states;

import c3.j;
import ho.p;
import im.d;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewAssistantDisconnectedStateWithErrorAskAssistantStatesDisconnectedStateWithErrorKt {
    public static final ComposableSingletons$PreviewAssistantDisconnectedStateWithErrorAskAssistantStatesDisconnectedStateWithErrorKt INSTANCE = new ComposableSingletons$PreviewAssistantDisconnectedStateWithErrorAskAssistantStatesDisconnectedStateWithErrorKt();

    /* renamed from: lambda$-1770943827 */
    private static p f264lambda$1770943827 = new j(new d(2), false, -1770943827);

    public static final z lambda__1770943827$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AssistantDisconnectedStateKt.Preview_AssistantDisconnectedState_WithError(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1770943827$app_productionRelease */
    public final p m1300getLambda$1770943827$app_productionRelease() {
        return f264lambda$1770943827;
    }
}

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
public final class ComposableSingletons$PreviewAssistantTermsStateAskAssistantStatesTermsStateKt {
    public static final ComposableSingletons$PreviewAssistantTermsStateAskAssistantStatesTermsStateKt INSTANCE = new ComposableSingletons$PreviewAssistantTermsStateAskAssistantStatesTermsStateKt();
    private static p lambda$1094793525 = new j(new d(4), false, 1094793525);

    public static final z lambda_1094793525$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AssistantTermsStateKt.Preview_AssistantTermsState(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$1094793525$app_productionRelease() {
        return lambda$1094793525;
    }
}

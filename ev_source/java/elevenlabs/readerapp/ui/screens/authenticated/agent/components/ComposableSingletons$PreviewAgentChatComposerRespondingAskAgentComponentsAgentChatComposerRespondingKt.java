package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import c3.j;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewAgentChatComposerRespondingAskAgentComponentsAgentChatComposerRespondingKt {
    public static final ComposableSingletons$PreviewAgentChatComposerRespondingAskAgentComponentsAgentChatComposerRespondingKt INSTANCE = new ComposableSingletons$PreviewAgentChatComposerRespondingAskAgentComponentsAgentChatComposerRespondingKt();

    /* renamed from: lambda$-1413350994 */
    private static p f234lambda$1413350994 = new j(new h(22), false, -1413350994);

    public static final z lambda__1413350994$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AgentChatComposerKt.Preview_AgentChatComposer_Responding(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1413350994$app_productionRelease */
    public final p m1269getLambda$1413350994$app_productionRelease() {
        return f234lambda$1413350994;
    }
}

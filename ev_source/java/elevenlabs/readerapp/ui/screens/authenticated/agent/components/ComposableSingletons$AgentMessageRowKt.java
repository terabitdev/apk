package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import c3.j;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AgentMessageRowKt {
    public static final ComposableSingletons$AgentMessageRowKt INSTANCE = new ComposableSingletons$AgentMessageRowKt();
    private static p lambda$1197204631 = new j(new h(19), false, 1197204631);

    /* renamed from: lambda$-1504959099 */
    private static p f232lambda$1504959099 = new j(new h(20), false, -1504959099);

    public static final z lambda_1197204631$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AgentMessageRowKt.AgentMessageRow(new ChatMessage("Hey I want a refund", true, 0L, 4, null), r1.d.E(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX4()), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1504959099$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AgentMessageRowKt.AgentMessageRow(new ChatMessage("I see. For purchases made through the Google Play Store, you'll need to request your refund directly through their platform. Here's the link to their refund process: https://support.google.com/googleplay/answer/15574897?hl=en", false, 0L, 4, null), r1.d.E(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX4()), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1504959099$app_productionRelease */
    public final p m1267getLambda$1504959099$app_productionRelease() {
        return f232lambda$1504959099;
    }

    public final p getLambda$1197204631$app_productionRelease() {
        return lambda$1197204631;
    }
}

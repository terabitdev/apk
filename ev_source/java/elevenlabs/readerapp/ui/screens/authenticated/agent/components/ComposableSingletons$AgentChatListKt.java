package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import c3.j;
import ho.p;
import ho.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.TypingIndicatorKt;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import sn.z;
import t2.u;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AgentChatListKt {
    public static final ComposableSingletons$AgentChatListKt INSTANCE = new ComposableSingletons$AgentChatListKt();
    private static q lambda$1694287854 = new j(new a2.f(29), false, 1694287854);

    /* renamed from: lambda$-2080694477 */
    private static q f231lambda$2080694477 = new j(new f(0), false, -2080694477);

    /* renamed from: lambda$-1607423489 */
    private static p f230lambda$1607423489 = new j(new h(18), false, -1607423489);

    public static final z lambda_1694287854$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AgentChatListKt.ChatStartedHeader(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1607423489$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AgentChatListKt.AgentChatList(ig.f.I(new ChatMessage("Hey I want a refund", true, 0L, 4, null), new ChatMessage("I can certainly help you with that. To make sure I give you the right information, could you please tell me where you purchased your ElevenReader subscription? Was it through the Apple App Store, Google Play Store, or directly on our ElevenReader website?", false, 0L, 4, null), new ChatMessage("I bought on google play store", true, 0L, 4, null)), true, r1.d.G(p2.e(i3.q.f13017a, 1.0f), u.P, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX4(), 1), null, null, qVar, 48, 24);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__2080694477$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            TypingIndicatorKt.TypingIndicator(null, qVar, 0, 1);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1607423489$app_productionRelease */
    public final p m1265getLambda$1607423489$app_productionRelease() {
        return f230lambda$1607423489;
    }

    /* renamed from: getLambda$-2080694477$app_productionRelease */
    public final q m1266getLambda$2080694477$app_productionRelease() {
        return f231lambda$2080694477;
    }

    public final q getLambda$1694287854$app_productionRelease() {
        return lambda$1694287854;
    }
}

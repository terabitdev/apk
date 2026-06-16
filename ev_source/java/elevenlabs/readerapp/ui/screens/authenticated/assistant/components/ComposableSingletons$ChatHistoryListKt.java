package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.j;
import ho.p;
import ho.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ChatHistoryListKt {
    public static final ComposableSingletons$ChatHistoryListKt INSTANCE = new ComposableSingletons$ChatHistoryListKt();
    private static q lambda$547432830 = new j(new f(1), false, 547432830);
    private static p lambda$1483402790 = new j(new h(28), false, 1483402790);
    private static p lambda$1467339782 = new j(new h(29), false, 1467339782);

    public static final z lambda_1467339782$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ChatHistoryListKt.ChatHistoryList(ig.f.I(new ChatMessage("Hello! How can I help you today?", false, 1000L), new ChatMessage("What is this book actually about?", true, 2000L)), null, true, qVar, 384, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1483402790$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ChatHistoryListKt.ChatHistoryList(ig.f.I(new ChatMessage("Hello! How can I help you today?", false, 1000L), new ChatMessage("What is this book actually about?", true, 2000L), new ChatMessage("Sure! So the book is about a story about lorem ipsum dolor sit amet.", false, 3000L)), null, false, qVar, 384, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_547432830$lambda$0(t1.b bVar, m mVar, int i10) {
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

    public final p getLambda$1467339782$app_productionRelease() {
        return lambda$1467339782;
    }

    public final p getLambda$1483402790$app_productionRelease() {
        return lambda$1483402790;
    }

    public final q getLambda$547432830$app_productionRelease() {
        return lambda$547432830;
    }
}

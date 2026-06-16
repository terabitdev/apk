package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ChatMessageBubbleKt {
    public static final ComposableSingletons$ChatMessageBubbleKt INSTANCE = new ComposableSingletons$ChatMessageBubbleKt();

    /* renamed from: lambda$-1587135245 */
    private static p f247lambda$1587135245 = new j(new c(2), false, -1587135245);

    /* renamed from: lambda$-42934946 */
    private static p f248lambda$42934946 = new j(new c(3), false, -42934946);

    public static final z lambda__1587135245$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ChatMessageBubbleKt.UserMessageBubble("What is this book actually about?", null, qVar, 6, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__42934946$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ChatMessageBubbleKt.AssistantMessageBubble("Sure! So the book is about a story about lorem ipsum dolor sit amet, consectetur adipiscing elit.", null, qVar, 6, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1587135245$app_productionRelease */
    public final p m1283getLambda$1587135245$app_productionRelease() {
        return f247lambda$1587135245;
    }

    /* renamed from: getLambda$-42934946$app_productionRelease */
    public final p m1284getLambda$42934946$app_productionRelease() {
        return f248lambda$42934946;
    }
}

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
public final class ComposableSingletons$PreviewChatInputEmptyAskAssistantComponentsChatInputEmptyKt {
    public static final ComposableSingletons$PreviewChatInputEmptyAskAssistantComponentsChatInputEmptyKt INSTANCE = new ComposableSingletons$PreviewChatInputEmptyAskAssistantComponentsChatInputEmptyKt();

    /* renamed from: lambda$-1137576811 */
    private static p f252lambda$1137576811 = new j(new c(9), false, -1137576811);

    public static final z lambda__1137576811$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ChatInputKt.Preview_ChatInput_Empty(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1137576811$app_productionRelease */
    public final p m1288getLambda$1137576811$app_productionRelease() {
        return f252lambda$1137576811;
    }
}

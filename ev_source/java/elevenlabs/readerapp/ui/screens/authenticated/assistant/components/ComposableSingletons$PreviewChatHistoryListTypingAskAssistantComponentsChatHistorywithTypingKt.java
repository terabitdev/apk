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
public final class ComposableSingletons$PreviewChatHistoryListTypingAskAssistantComponentsChatHistorywithTypingKt {
    public static final ComposableSingletons$PreviewChatHistoryListTypingAskAssistantComponentsChatHistorywithTypingKt INSTANCE = new ComposableSingletons$PreviewChatHistoryListTypingAskAssistantComponentsChatHistorywithTypingKt();

    /* renamed from: lambda$-1548404971 */
    private static p f251lambda$1548404971 = new j(new c(8), false, -1548404971);

    public static final z lambda__1548404971$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ChatHistoryListKt.Preview_ChatHistoryList_Typing(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1548404971$app_productionRelease */
    public final p m1287getLambda$1548404971$app_productionRelease() {
        return f251lambda$1548404971;
    }
}

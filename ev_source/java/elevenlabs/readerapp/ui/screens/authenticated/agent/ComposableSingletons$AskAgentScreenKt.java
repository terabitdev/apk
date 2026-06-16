package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.t;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AskAgentScreenKt {
    public static final ComposableSingletons$AskAgentScreenKt INSTANCE = new ComposableSingletons$AskAgentScreenKt();
    private static p lambda$87571999 = new c3.j(new j(0), false, 87571999);
    private static p lambda$319085793 = new c3.j(new j(1), false, 319085793);

    public static final z lambda_319085793$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AskAgentContract.State state = new AskAgentContract.State(AssistantStatus.DISCONNECTED, t.f33547a, false, "We couldn't reach support right now. Please try again.", false, false, 52, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new i(4);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(5);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new i(5);
                qVar.h0(L3);
            }
            ho.a aVar2 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new i(6);
                qVar.h0(L4);
            }
            ho.a aVar3 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new i(7);
                qVar.h0(L5);
            }
            AskAgentScreenKt.AskAgentScreenUi(state, aVar, lVar, aVar2, aVar3, (ho.a) L5, qVar, 224688);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_319085793$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_87571999$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AskAgentContract.State state = new AskAgentContract.State(AssistantStatus.CONNECTED, ig.f.I(new ChatMessage("Hey I want a refund", true, 0L, 4, null), new ChatMessage("I can certainly help you with that. Could you please tell me where you purchased your ElevenReader subscription? Was it through the Apple App Store, Google Play Store, or directly on our ElevenReader website?", false, 0L, 4, null), new ChatMessage("I bought on google play store", true, 0L, 4, null)), false, null, false, false, 60, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new i(0);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(4);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new i(1);
                qVar.h0(L3);
            }
            ho.a aVar2 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new i(2);
                qVar.h0(L4);
            }
            ho.a aVar3 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new i(3);
                qVar.h0(L5);
            }
            AskAgentScreenKt.AskAgentScreenUi(state, aVar, lVar, aVar2, aVar3, (ho.a) L5, qVar, 224688);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_87571999$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public final p getLambda$319085793$app_productionRelease() {
        return lambda$319085793;
    }

    public final p getLambda$87571999$app_productionRelease() {
        return lambda$87571999;
    }
}

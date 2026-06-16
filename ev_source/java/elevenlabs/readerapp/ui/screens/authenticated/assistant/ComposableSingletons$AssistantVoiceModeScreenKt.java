package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AssistantVoiceModeScreenKt {
    public static final ComposableSingletons$AssistantVoiceModeScreenKt INSTANCE = new ComposableSingletons$AssistantVoiceModeScreenKt();
    private static ho.p lambda$693375903 = new c3.j(new y(5), false, 693375903);
    private static ho.p lambda$661343648 = new c3.j(new y(6), false, 661343648);
    private static ho.p lambda$13172192 = new c3.j(new y(7), false, 13172192);

    public static final sn.z lambda_13172192$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        List list;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            list = AssistantVoiceModeScreenKt.placeholderPromptSuggestions;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(13);
                qVar.h0(L);
            }
            AssistantVoiceModeScreenKt.AssistantVoiceModeUI("", list, (ho.l) L, null, true, true, qVar, 221574, 8);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_13172192$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda_661343648$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        List list;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            list = AssistantVoiceModeScreenKt.placeholderPromptSuggestions;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(15);
                qVar.h0(L);
            }
            AssistantVoiceModeScreenKt.AssistantVoiceModeUI("", list, (ho.l) L, null, false, false, qVar, 221574, 8);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_661343648$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda_693375903$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        List list;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            list = AssistantVoiceModeScreenKt.placeholderPromptSuggestions;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(14);
                qVar.h0(L);
            }
            AssistantVoiceModeScreenKt.AssistantVoiceModeUI("", list, (ho.l) L, null, false, false, qVar, 221574, 8);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_693375903$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public final ho.p getLambda$13172192$app_productionRelease() {
        return lambda$13172192;
    }

    public final ho.p getLambda$661343648$app_productionRelease() {
        return lambda$661343648;
    }

    public final ho.p getLambda$693375903$app_productionRelease() {
        return lambda$693375903;
    }
}

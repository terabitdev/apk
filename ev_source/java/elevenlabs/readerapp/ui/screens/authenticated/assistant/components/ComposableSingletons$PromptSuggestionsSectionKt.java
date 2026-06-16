package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.j;
import ho.p;
import ig.f;
import io.elevenlabs.readerapp.ui.components.r0;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PromptSuggestionsSectionKt {
    public static final ComposableSingletons$PromptSuggestionsSectionKt INSTANCE = new ComposableSingletons$PromptSuggestionsSectionKt();

    /* renamed from: lambda$-1002009066 */
    private static p f257lambda$1002009066 = new j(new c(18), false, -1002009066);

    public static final z lambda__1002009066$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List I = f.I("What's this about?", "Summarise this", "Tell me more", "Who is the author?", "What are the key points?", "Foo bar?", "Bar foo?");
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new r0(27);
                qVar.h0(L);
            }
            PromptSuggestionsSectionKt.PromptSuggestionsSection(I, (ho.l) L, null, qVar, 54, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1002009066$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1002009066$app_productionRelease */
    public final p m1293getLambda$1002009066$app_productionRelease() {
        return f257lambda$1002009066;
    }
}

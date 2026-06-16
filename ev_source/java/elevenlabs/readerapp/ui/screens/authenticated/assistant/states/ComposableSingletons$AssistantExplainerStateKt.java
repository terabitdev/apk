package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states;

import a2.e3;
import c3.j;
import ho.a;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.a7;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AssistantExplainerStateKt {
    public static final ComposableSingletons$AssistantExplainerStateKt INSTANCE = new ComposableSingletons$AssistantExplainerStateKt();
    private static p lambda$2015578189 = new j(new e3(27), false, 2015578189);

    /* renamed from: lambda$-814712718 */
    private static p f263lambda$814712718 = new j(new e3(28), false, -814712718);

    public static final z lambda_2015578189$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new a2.m(24);
                qVar.h0(L);
            }
            AssistantExplainerStateKt.AssistantExplainerState((a) L, null, qVar, 6, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__814712718$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            a7.a(null, null, 0L, 0L, u.P, u.P, null, lambda$2015578189, qVar, 12582912, 127);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-814712718$app_productionRelease */
    public final p m1299getLambda$814712718$app_productionRelease() {
        return f263lambda$814712718;
    }

    public final p getLambda$2015578189$app_productionRelease() {
        return lambda$2015578189;
    }
}

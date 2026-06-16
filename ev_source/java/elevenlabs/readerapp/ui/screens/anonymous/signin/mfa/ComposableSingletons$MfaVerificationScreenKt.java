package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import ho.p;
import io.elevenlabs.domain.model.MfaState;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MfaVerificationScreenKt {
    public static final ComposableSingletons$MfaVerificationScreenKt INSTANCE = new ComposableSingletons$MfaVerificationScreenKt();

    /* renamed from: lambda$-2011307041 */
    private static p f176lambda$2011307041 = new c3.j(new a(0), false, -2011307041);

    public static final z lambda__2011307041$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MfaVerificationState mfaVerificationState = new MfaVerificationState(false, false, new MfaState.Phone(new Object(), "test_id"), false, 10, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new i(5);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new Object();
                qVar.h0(L2);
            }
            MfaVerificationScreenKt.MfaVerificationScreenUi(mfaVerificationState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__2011307041$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-2011307041$app_productionRelease */
    public final p m1185getLambda$2011307041$app_productionRelease() {
        return f176lambda$2011307041;
    }
}

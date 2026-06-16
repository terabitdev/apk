package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import ho.q;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EmailSignInFormUIKt {
    public static final ComposableSingletons$EmailSignInFormUIKt INSTANCE = new ComposableSingletons$EmailSignInFormUIKt();

    /* renamed from: lambda$-987455882 */
    private static q f168lambda$987455882 = new c3.j(new j(0), false, -987455882);

    public static final z lambda__987455882$lambda$0(l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SignInAccountBannedMessageTextKt.m1184SignInAccountBannedMessageTextFNF3uiM(l2Var.b(i3.q.f13017a, 1.0f, false), null, 0L, qVar, 0, 6);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-987455882$app_productionRelease */
    public final q m1176getLambda$987455882$app_productionRelease() {
        return f168lambda$987455882;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import a2.t0;
import c3.k;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt;
import ho.q;
import ho.r;
import i3.t;
import io.elevenlabs.readerapp.ui.components.l;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.b8;
import q2.c3;
import q2.f0;
import r1.p2;
import r1.y;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$CustomerCenterSheetKt {
    public static final ComposableSingletons$CustomerCenterSheetKt INSTANCE = new ComposableSingletons$CustomerCenterSheetKt();
    private static q lambda$498549638 = new c3.j(new a2.f(26), false, 498549638);

    /* renamed from: lambda$-146789865 */
    private static r f214lambda$146789865 = new c3.j(new l(4), false, -146789865);

    public static final z lambda_498549638$lambda$0(BottomSheetControl bottomSheetControl, m mVar, int i10) {
        bottomSheetControl.getClass();
        return z.f31622a;
    }

    public static final z lambda__146789865$lambda$0(y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        f0 m1253customerCenterColorSchemeRFnl5yQ;
        long m1252contrastingOn8_81llA;
        b8 m1254customerCenterTypographyek8zF_U;
        yVar.getClass();
        bottomSheetControl.getClass();
        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
        int i11 = ElevenLabsTheme.$stable;
        long m2017getPrimary0d7_KjU = elevenLabsTheme.getColor(mVar, i11).getButtonBackground().m2017getPrimary0d7_KjU();
        m1253customerCenterColorSchemeRFnl5yQ = CustomerCenterSheetKt.m1253customerCenterColorSchemeRFnl5yQ(m2017getPrimary0d7_KjU, elevenLabsTheme.getColor(mVar, i11).getButtonBackground().m2015getDangerConfirm0d7_KjU(), mVar, 0);
        m1252contrastingOn8_81llA = CustomerCenterSheetKt.m1252contrastingOn8_81llA(m2017getPrimary0d7_KjU);
        m1254customerCenterTypographyek8zF_U = CustomerCenterSheetKt.m1254customerCenterTypographyek8zF_U(m1252contrastingOn8_81llA, mVar, 0);
        c3.b(m1253customerCenterColorSchemeRFnl5yQ, null, m1254customerCenterTypographyek8zF_U, k.d(-694535445, true, new t0(bottomSheetControl, 7), mVar), mVar, 3072, 2);
        return z.f31622a;
    }

    public static final z lambda__146789865$lambda$0$0(BottomSheetControl bottomSheetControl, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            boolean h10 = qVar.h(bottomSheetControl);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new g(bottomSheetControl, 0);
                qVar.h0(L);
            }
            CustomerCenterKt.CustomerCenter(e10, null, (ho.a) L, qVar, 6, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__146789865$lambda$0$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    /* renamed from: getLambda$-146789865$app_productionRelease */
    public final r m1242getLambda$146789865$app_productionRelease() {
        return f214lambda$146789865;
    }

    public final q getLambda$498549638$app_productionRelease() {
        return lambda$498549638;
    }
}

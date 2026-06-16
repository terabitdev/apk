package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import ho.p;
import ho.q;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EmailSignUpFormUIKt {
    public static final ComposableSingletons$EmailSignUpFormUIKt INSTANCE = new ComposableSingletons$EmailSignUpFormUIKt();

    /* renamed from: lambda$-210787318 */
    private static q f169lambda$210787318 = new c3.j(new j(1), false, -210787318);
    private static p lambda$1475846261 = new c3.j(new i(3), false, 1475846261);

    public static final z lambda_1475846261$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.signup_consent_to_receive_product_updates);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            j7.d(R, null, defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodySmall500(), qVar, 0, 0, 131066);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__210787318$lambda$0(l2 l2Var, u2.m mVar, int i10) {
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

    /* renamed from: getLambda$-210787318$app_productionRelease */
    public final q m1177getLambda$210787318$app_productionRelease() {
        return f169lambda$210787318;
    }

    public final p getLambda$1475846261$app_productionRelease() {
        return lambda$1475846261;
    }
}

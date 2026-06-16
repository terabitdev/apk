package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ManageContentInterestsScreenKt {
    public static final ComposableSingletons$ManageContentInterestsScreenKt INSTANCE = new ComposableSingletons$ManageContentInterestsScreenKt();
    private static ho.q lambda$1103809167;
    private static ho.q lambda$735168184;

    static {
        final int i10 = 0;
        lambda$1103809167 = new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.m
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda_1103809167$lambda$0;
                z lambda_735168184$lambda$0;
                int i11 = i10;
                u1.m mVar = (u1.m) obj;
                u2.m mVar2 = (u2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i11) {
                    case 0:
                        lambda_1103809167$lambda$0 = ComposableSingletons$ManageContentInterestsScreenKt.lambda_1103809167$lambda$0(mVar, mVar2, intValue);
                        return lambda_1103809167$lambda$0;
                    default:
                        lambda_735168184$lambda$0 = ComposableSingletons$ManageContentInterestsScreenKt.lambda_735168184$lambda$0(mVar, mVar2, intValue);
                        return lambda_735168184$lambda$0;
                }
            }
        }, false, 1103809167);
        final int i11 = 1;
        lambda$735168184 = new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.m
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda_1103809167$lambda$0;
                z lambda_735168184$lambda$0;
                int i112 = i11;
                u1.m mVar = (u1.m) obj;
                u2.m mVar2 = (u2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i112) {
                    case 0:
                        lambda_1103809167$lambda$0 = ComposableSingletons$ManageContentInterestsScreenKt.lambda_1103809167$lambda$0(mVar, mVar2, intValue);
                        return lambda_1103809167$lambda$0;
                    default:
                        lambda_735168184$lambda$0 = ComposableSingletons$ManageContentInterestsScreenKt.lambda_735168184$lambda$0(mVar, mVar2, intValue);
                        return lambda_735168184$lambda$0;
                }
            }
        }, false, 735168184);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z lambda_1103809167$lambda$0(u1.m mVar, u2.m mVar2, int i10) {
        boolean z6;
        mVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar2;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.onboarding_v2_genre_subtitle);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            j7.d(R, p2.e(i3.q.f13017a, 1.0f), echoTheme.getColors(qVar, i11).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, 48, 0, 131064);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z lambda_735168184$lambda$0(u1.m mVar, u2.m mVar2, int i10) {
        boolean z6;
        mVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar2;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX6()), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final ho.q getLambda$1103809167$app_productionRelease() {
        return lambda$1103809167;
    }

    public final ho.q getLambda$735168184$app_productionRelease() {
        return lambda$735168184;
    }
}

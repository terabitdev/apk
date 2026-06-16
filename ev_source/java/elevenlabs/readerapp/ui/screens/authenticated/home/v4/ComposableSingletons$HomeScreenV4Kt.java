package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsScreenKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeScreenV4Kt {
    public static final ComposableSingletons$HomeScreenV4Kt INSTANCE = new ComposableSingletons$HomeScreenV4Kt();

    /* renamed from: lambda$-1396007387 */
    private static ho.p f371lambda$1396007387 = new c3.j(new b(0), false, -1396007387);

    /* renamed from: lambda$-587776037 */
    private static ho.p f372lambda$587776037 = new c3.j(new b(1), false, -587776037);

    /* renamed from: lambda$-802376801 */
    private static ho.r f373lambda$802376801;
    private static ho.r lambda$368859567;

    static {
        final int i10 = 0;
        f373lambda$802376801 = new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.c
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                z lambda__802376801$lambda$0;
                z lambda_368859567$lambda$0;
                switch (i10) {
                    case 0:
                        lambda__802376801$lambda$0 = ComposableSingletons$HomeScreenV4Kt.lambda__802376801$lambda$0((l2) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return lambda__802376801$lambda$0;
                    default:
                        lambda_368859567$lambda$0 = ComposableSingletons$HomeScreenV4Kt.lambda_368859567$lambda$0((r1.s) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return lambda_368859567$lambda$0;
                }
            }
        }, false, -802376801);
        final int i11 = 1;
        lambda$368859567 = new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.c
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                z lambda__802376801$lambda$0;
                z lambda_368859567$lambda$0;
                switch (i11) {
                    case 0:
                        lambda__802376801$lambda$0 = ComposableSingletons$HomeScreenV4Kt.lambda__802376801$lambda$0((l2) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return lambda__802376801$lambda$0;
                    default:
                        lambda_368859567$lambda$0 = ComposableSingletons$HomeScreenV4Kt.lambda_368859567$lambda$0((r1.s) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return lambda_368859567$lambda$0;
                }
            }
        }, false, 368859567);
    }

    public static final z lambda_368859567$lambda$0(r1.s sVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        sVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new a(bottomSheetControl, 1);
            qVar.h0(L);
        }
        DailyStreakSettingsScreenKt.DailyStreakSettingsScreen((ho.a) L, null, qVar, 0, 2);
        return z.f31622a;
    }

    public static final z lambda_368859567$lambda$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z lambda__1396007387$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__587776037$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__802376801$lambda$0(l2 l2Var, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        l2Var.getClass();
        bottomSheetControl.getClass();
        int i11 = R.drawable.close;
        String R = kj.c.R(mVar, R.string.accessibility_bottom_sheet_dialog_close);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new a(bottomSheetControl, 0);
            qVar.h0(L);
        }
        ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
        return z.f31622a;
    }

    public static final z lambda__802376801$lambda$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1396007387$app_productionRelease */
    public final ho.p m1422getLambda$1396007387$app_productionRelease() {
        return f371lambda$1396007387;
    }

    /* renamed from: getLambda$-587776037$app_productionRelease */
    public final ho.p m1423getLambda$587776037$app_productionRelease() {
        return f372lambda$587776037;
    }

    /* renamed from: getLambda$-802376801$app_productionRelease */
    public final ho.r m1424getLambda$802376801$app_productionRelease() {
        return f373lambda$802376801;
    }

    public final ho.r getLambda$368859567$app_productionRelease() {
        return lambda$368859567;
    }
}

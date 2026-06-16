package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import f4.f1;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.l2;
import r1.p2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeScreenV3Kt {

    /* renamed from: lambda$-1064061713 */
    private static ho.r f357lambda$1064061713;

    /* renamed from: lambda$-1087910177 */
    private static ho.r f358lambda$1087910177;

    /* renamed from: lambda$-1400259025 */
    private static ho.q f359lambda$1400259025;

    /* renamed from: lambda$-1581793352 */
    private static ho.q f360lambda$1581793352;
    public static final ComposableSingletons$HomeScreenV3Kt INSTANCE = new ComposableSingletons$HomeScreenV3Kt();

    /* renamed from: lambda$-1951858779 */
    private static ho.p f361lambda$1951858779 = new c3.j(new b(0), false, -1951858779);
    private static ho.p lambda$1476413915 = new c3.j(new b(1), false, 1476413915);
    private static ho.p lambda$761174933 = new c3.j(new b(2), false, 761174933);

    static {
        final int i10 = 0;
        f358lambda$1087910177 = new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.c
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                z lambda__1087910177$lambda$0;
                z lambda__1064061713$lambda$0;
                switch (i10) {
                    case 0:
                        lambda__1087910177$lambda$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1087910177$lambda$0((l2) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return lambda__1087910177$lambda$0;
                    default:
                        lambda__1064061713$lambda$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1064061713$lambda$0((r1.s) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return lambda__1064061713$lambda$0;
                }
            }
        }, false, -1087910177);
        final int i11 = 1;
        f357lambda$1064061713 = new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.c
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                z lambda__1087910177$lambda$0;
                z lambda__1064061713$lambda$0;
                switch (i11) {
                    case 0:
                        lambda__1087910177$lambda$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1087910177$lambda$0((l2) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return lambda__1087910177$lambda$0;
                    default:
                        lambda__1064061713$lambda$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1064061713$lambda$0((r1.s) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return lambda__1064061713$lambda$0;
                }
            }
        }, false, -1064061713);
        final int i12 = 0;
        f360lambda$1581793352 = new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.d
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda__1581793352$lambda$0;
                z lambda__1400259025$lambda$0;
                int i13 = i12;
                t1.b bVar = (t1.b) obj;
                u2.m mVar = (u2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i13) {
                    case 0:
                        lambda__1581793352$lambda$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1581793352$lambda$0(bVar, mVar, intValue);
                        return lambda__1581793352$lambda$0;
                    default:
                        lambda__1400259025$lambda$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1400259025$lambda$0(bVar, mVar, intValue);
                        return lambda__1400259025$lambda$0;
                }
            }
        }, false, -1581793352);
        final int i13 = 1;
        f359lambda$1400259025 = new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.d
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda__1581793352$lambda$0;
                z lambda__1400259025$lambda$0;
                int i132 = i13;
                t1.b bVar = (t1.b) obj;
                u2.m mVar = (u2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i132) {
                    case 0:
                        lambda__1581793352$lambda$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1581793352$lambda$0(bVar, mVar, intValue);
                        return lambda__1581793352$lambda$0;
                    default:
                        lambda__1400259025$lambda$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1400259025$lambda$0(bVar, mVar, intValue);
                        return lambda__1400259025$lambda$0;
                }
            }
        }, false, -1400259025);
    }

    public static final z lambda_1476413915$lambda$0(u2.m mVar, int i10) {
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

    public static final z lambda_761174933$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MiniPlayerKt.Preview_MiniPlayer_Visible_Playing(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1064061713$lambda$0(r1.s sVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
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

    public static final z lambda__1064061713$lambda$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z lambda__1087910177$lambda$0(l2 l2Var, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
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

    public static final z lambda__1087910177$lambda$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z lambda__1400259025$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomeScreenV3Kt.LoaderItem(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1581793352$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        bVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(bVar)) {
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
            i3.t d10 = ((t1.c) bVar).d(p2.e(i3.q.f13017a, 1.0f), 0.65f);
            f1 d11 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1951858779$lambda$0(u2.m mVar, int i10) {
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

    /* renamed from: getLambda$-1064061713$app_productionRelease */
    public final ho.r m1407getLambda$1064061713$app_productionRelease() {
        return f357lambda$1064061713;
    }

    /* renamed from: getLambda$-1087910177$app_productionRelease */
    public final ho.r m1408getLambda$1087910177$app_productionRelease() {
        return f358lambda$1087910177;
    }

    /* renamed from: getLambda$-1400259025$app_productionRelease */
    public final ho.q m1409getLambda$1400259025$app_productionRelease() {
        return f359lambda$1400259025;
    }

    /* renamed from: getLambda$-1581793352$app_productionRelease */
    public final ho.q m1410getLambda$1581793352$app_productionRelease() {
        return f360lambda$1581793352;
    }

    /* renamed from: getLambda$-1951858779$app_productionRelease */
    public final ho.p m1411getLambda$1951858779$app_productionRelease() {
        return f361lambda$1951858779;
    }

    public final ho.p getLambda$1476413915$app_productionRelease() {
        return lambda$1476413915;
    }

    public final ho.p getLambda$761174933$app_productionRelease() {
        return lambda$761174933;
    }
}

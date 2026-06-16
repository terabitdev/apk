package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.PlayerActionButton;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayerPreferencesScreenKt {
    public static final ComposableSingletons$PlayerPreferencesScreenKt INSTANCE = new ComposableSingletons$PlayerPreferencesScreenKt();

    /* renamed from: lambda$-824779134 */
    private static ho.q f409lambda$824779134 = new c3.j(new Object(), false, -824779134);

    /* renamed from: lambda$-702544447 */
    private static ho.p f408lambda$702544447 = new c3.j(new e(3), false, -702544447);

    public static final sn.z lambda__702544447$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        ho.a aVar;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerPreferencesState playerPreferencesState = new PlayerPreferencesState(new UserConfig.PlayerConfig(16L, PlayerFontFamily.LIBRE, PlayerTheme.SKY, PlayerActionButton.SLEEP_TIMER, PlayerDisplayMode.Text), new PlayerPreferences(null, null, null, null, null, null, false, false, 255, null), false, false, false, null, null, 124, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new i(0);
                qVar.h0(L);
            }
            ho.a aVar2 = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new i(4);
                qVar.h0(L2);
            }
            ho.a aVar3 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new i1(22);
                qVar.h0(L3);
            }
            ho.l lVar = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new i1(23);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new i1(24);
                qVar.h0(L5);
            }
            ho.l lVar3 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new e(1);
                qVar.h0(L6);
            }
            ho.p pVar = (ho.p) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new i1(25);
                qVar.h0(L7);
            }
            ho.l lVar4 = (ho.l) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new e(2);
                qVar.h0(L8);
            }
            ho.p pVar2 = (ho.p) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new i1(26);
                qVar.h0(L9);
            }
            ho.l lVar5 = (ho.l) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new i1(27);
                qVar.h0(L10);
            }
            ho.l lVar6 = (ho.l) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new i1(28);
                qVar.h0(L11);
            }
            ho.l lVar7 = (ho.l) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new i(1);
                qVar.h0(L12);
            }
            ho.a aVar4 = (ho.a) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                aVar = aVar2;
                L13 = new i(2);
                qVar.h0(L13);
            } else {
                aVar = aVar2;
            }
            ho.a aVar5 = (ho.a) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new i(3);
                qVar.h0(L14);
            }
            PlayerPreferencesScreenKt.PlayerPreferencesScreenUI(playerPreferencesState, aVar, aVar3, lVar, lVar2, lVar3, pVar, lVar4, pVar2, lVar5, lVar6, lVar7, aVar4, aVar5, (ho.a) L14, qVar, 920350128, 28086);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$10$0(PlayerFontFamily playerFontFamily) {
        playerFontFamily.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$2$0(long j4) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$3$0(PlayerTheme playerTheme) {
        playerTheme.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$4$0(BluetoothButton bluetoothButton) {
        bluetoothButton.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$5$0(BluetoothButton bluetoothButton, BluetoothButtonAction bluetoothButtonAction) {
        bluetoothButton.getClass();
        bluetoothButtonAction.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$6$0(InAppSkipDirection inAppSkipDirection) {
        inAppSkipDirection.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$7$0(InAppSkipDirection inAppSkipDirection, SkipDuration skipDuration) {
        inAppSkipDirection.getClass();
        skipDuration.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$8$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__702544447$lambda$0$9$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__824779134$lambda$0(BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        bottomSheetControl.getClass();
        HeaderKt.EchoHeader(kj.c.R(mVar, R.string.player_customize_choose_a_font), null, null, c3.k.d(-1927995016, true, new g(bottomSheetControl, 0), mVar), null, mVar, 3072, 22);
        return sn.z.f31622a;
    }

    public static final sn.z lambda__824779134$lambda$0$0(BottomSheetControl bottomSheetControl, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(bottomSheetControl);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new h(bottomSheetControl, 0);
                qVar.h0(L);
            }
            CloseButtonKt.CloseButton((ho.a) L, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__824779134$lambda$0$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-702544447$app_productionRelease */
    public final ho.p m1470getLambda$702544447$app_productionRelease() {
        return f408lambda$702544447;
    }

    /* renamed from: getLambda$-824779134$app_productionRelease */
    public final ho.q m1471getLambda$824779134$app_productionRelease() {
        return f409lambda$824779134;
    }
}

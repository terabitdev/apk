package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import a2.k3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BluetoothActionSelectorSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.InAppSkipDurationSelectorSheetKt;
import io.elevenlabs.ui.components.ActionRowItemKt;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.SelectableBoxKt;
import io.elevenlabs.ui.components.ShadowKt;
import io.elevenlabs.ui.components.SliderKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsTypographyKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.c7;
import q2.d5;
import q2.j7;
import q2.k5;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.p2;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u009d\u0002\u0010 \u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\n2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\n2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b \u0010!\u001a\u001d\u0010#\u001a\u00020\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b#\u0010$\u001a;\u0010(\u001a\u00020\u00012\b\u0010%\u001a\u0004\u0018\u00010\u001b2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b(\u0010)\u001a-\u0010+\u001a\u00020\u00012\b\u0010*\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b+\u0010,\u001a-\u0010.\u001a\u00020\u00012\b\u0010-\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b.\u0010/\u001a5\u00104\u001a\u00020\u00012\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b4\u00105\u001aI\u0010<\u001a\u00020\u00012\b\b\u0001\u00107\u001a\u0002062\b\b\u0001\u00108\u001a\u0002062\u0006\u00109\u001a\u00020\u00182\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010;\u001a\u00020\u0018H\u0003¢\u0006\u0004\b<\u0010=\u001a+\u0010?\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00182\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b?\u0010@\u001a3\u0010B\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u00182\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010E\u001a\u0002002\u0006\u0010D\u001a\u00020\u001bH\u0003¢\u0006\u0004\bE\u0010F\u001a\u0013\u0010H\u001a\u00020G*\u00020\u001bH\u0002¢\u0006\u0004\bH\u0010I\u001a\u000f\u0010J\u001a\u00020\u0001H\u0007¢\u0006\u0004\bJ\u0010K¨\u0006N²\u0006\f\u0010M\u001a\u00020L8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerPreferencesViewModel;", "vm", "PlayerPreferencesScreen", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerPreferencesViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerPreferencesState;", RemoteConfigConstants.ResponseFieldKey.STATE, "onFontSelectClick", "Lkotlin/Function1;", "", "onFontSizeChanged", "Lio/elevenlabs/domain/model/PlayerTheme;", "onThemeSelect", "Lio/elevenlabs/domain/model/BluetoothButton;", "onBluetoothButtonClick", "Lkotlin/Function2;", "Lio/elevenlabs/domain/model/BluetoothButtonAction;", "onBluetoothActionSelected", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;", "onInAppSkipDurationButtonClick", "Lio/elevenlabs/domain/model/SkipDuration;", "onInAppSkipDurationSelected", "", "onToggleAutoFullscreen", "onToggleTapToShowControls", "Lio/elevenlabs/domain/model/PlayerFontFamily;", "onFontFamilyChanged", "onCloseFontsDialog", "onCloseActionSelector", "onCloseInAppSkipDurationSelector", "PlayerPreferencesScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerPreferencesState;Lho/a;Lho/a;Lho/l;Lho/l;Lho/l;Lho/p;Lho/l;Lho/p;Lho/l;Lho/l;Lho/l;Lho/a;Lho/a;Lho/a;Lu2/m;II)V", "onClick", "FontFamilySelect", "(Lho/a;Lu2/m;I)V", "currentFont", "onFontSelected", "onDismiss", "FontPickerSheet", "(Lio/elevenlabs/domain/model/PlayerFontFamily;Lho/l;Lho/a;Lu2/m;I)V", "fontSize", "FontSizeSelect", "(Ljava/lang/Long;Lho/l;Lu2/m;I)V", "currentTheme", "ThemeSelect", "(Lio/elevenlabs/domain/model/PlayerTheme;Lho/l;Lu2/m;I)V", "", "section", Constants.ScionAnalytics.PARAM_LABEL, "currentValue", "PreferenceActionRow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/a;Lu2/m;I)V", "", "labelRes", "descriptionRes", "checked", "onToggle", "clickable", "PreferenceToggleRow", "(IIZLho/l;ZLu2/m;II)V", "enabled", "AutoFullscreenRow", "(ZLho/l;Lu2/m;I)V", "autoFullscreenEnabled", "TapToShowControlsRow", "(ZZLho/l;Lu2/m;I)V", "fontFamily", "getFontName", "(Lio/elevenlabs/domain/model/PlayerFontFamily;Lu2/m;I)Ljava/lang/String;", "Lw4/u;", "getRealFontFamily", "(Lio/elevenlabs/domain/model/PlayerFontFamily;)Lw4/u;", "Preview_PlayerPreferencesScreen", "(Lu2/m;I)V", "", "alpha", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerPreferencesScreenKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[BluetoothButton.values().length];
            try {
                iArr[BluetoothButton.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BluetoothButton.PREVIOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BluetoothButton.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BluetoothButton.BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InAppSkipDirection.values().length];
            try {
                iArr2[InAppSkipDirection.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InAppSkipDirection.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PlayerTheme.values().length];
            try {
                iArr3[PlayerTheme.SKY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PlayerTheme.FALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PlayerTheme.HIGHLIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PlayerTheme.CLASSIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PlayerFontFamily.values().length];
            try {
                iArr4[PlayerFontFamily.INTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[PlayerFontFamily.LIBRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[PlayerFontFamily.OPEN_DYSLEXIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private static final void AutoFullscreenRow(boolean z6, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        ho.l lVar2;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-404135914);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            int i14 = i11 << 6;
            z11 = z6;
            lVar2 = lVar;
            PreferenceToggleRow(R.string.player_preferences_auto_fullscreen, R.string.player_preferences_auto_fullscreen_description, z11, lVar2, true, qVar, (i14 & 896) | 24576 | (i14 & 7168), 0);
        } else {
            z11 = z6;
            lVar2 = lVar;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.m(lVar2, i10, z11);
        }
    }

    public static final sn.z AutoFullscreenRow$lambda$0(boolean z6, ho.l lVar, int i10, u2.m mVar, int i11) {
        AutoFullscreenRow(z6, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void FontFamilySelect(ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1603068568);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            aVar2 = aVar;
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.player_customize_font), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.text_size), Integer.valueOf(io.elevenlabs.ui.R.drawable.chevron_right), aVar2, qVar, (i11 << 12) & 57344, 2);
        } else {
            aVar2 = aVar;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 9);
        }
    }

    public static final sn.z FontFamilySelect$lambda$0(ho.a aVar, int i10, u2.m mVar, int i11) {
        FontFamilySelect(aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void FontPickerSheet(final PlayerFontFamily playerFontFamily, final ho.l lVar, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int ordinal;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-258124220);
        if ((i10 & 6) == 0) {
            if (playerFontFamily == null) {
                ordinal = -1;
            } else {
                ordinal = playerFontFamily.ordinal();
            }
            if (qVar.d(ordinal)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar, null, false, null, ComposableSingletons$PlayerPreferencesScreenKt.INSTANCE.m1471getLambda$824779134$app_productionRelease(), c3.k.d(-2059148335, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.u
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    sn.z FontPickerSheet$lambda$0;
                    int intValue = ((Integer) obj4).intValue();
                    FontPickerSheet$lambda$0 = PlayerPreferencesScreenKt.FontPickerSheet$lambda$0(ho.l.this, playerFontFamily, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue);
                    return FontPickerSheet$lambda$0;
                }
            }, qVar), qVar, ((i11 >> 3) & 112) | 1769472, 29);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 16, lVar, (Object) playerFontFamily, (Object) aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final sn.z FontPickerSheet$lambda$0(ho.l lVar, PlayerFontFamily playerFontFamily, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        i3.q qVar;
        int i11;
        Object obj = lVar;
        Object obj2 = bottomSheetControl;
        yVar.getClass();
        obj2.getClass();
        i3.q qVar2 = i3.q.f13017a;
        boolean z6 = true;
        i3.t y10 = l1.n.y(p2.e(qVar2, 1.0f), l1.n.x(mVar), true, true);
        int i12 = 0;
        r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, mVar, 0);
        u2.q qVar3 = (u2.q) mVar;
        int hashCode = Long.hashCode(qVar3.T);
        c3.o l4 = qVar3.l();
        i3.t c5 = i3.a.c(y10, mVar);
        h4.h.f11920i.getClass();
        ho.a aVar = h4.g.f11903b;
        h4.f2 f2Var = qVar3.f33969a;
        qVar3.b0();
        if (qVar3.S) {
            qVar3.k(aVar);
        } else {
            qVar3.k0();
        }
        u2.r.J(h4.g.f11907f, a10, mVar);
        u2.r.J(h4.g.f11906e, l4, mVar);
        u2.r.y(mVar, Integer.valueOf(hashCode), h4.g.f11908g);
        u2.r.F(h4.g.f11909h, mVar);
        u2.r.J(h4.g.f11905d, c5, mVar);
        qVar3.X(1492552777);
        int i13 = 0;
        for (Object obj3 : PlayerFontFamily.getEntries()) {
            int i14 = i13 + 1;
            if (i13 >= 0) {
                PlayerFontFamily playerFontFamily2 = (PlayerFontFamily) obj3;
                int i15 = i13;
                String fontName = getFontName(playerFontFamily2, mVar, i12);
                boolean h10 = qVar3.h(obj2) | qVar3.f(obj) | qVar3.d(playerFontFamily2.ordinal());
                Object L = qVar3.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new c3.b(obj2, obj, playerFontFamily2, 17);
                    qVar3.h0(L);
                }
                u2.q qVar4 = qVar3;
                i3.q qVar5 = qVar2;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(fontName, (ho.a) L, null, 0L, false, 0, null, false, null, c3.k.d(-1456689452, z6, new fm.o(playerFontFamily2, playerFontFamily, fontName, 13), mVar), mVar, 805306368, 508);
                if (i15 != ig.f.y(PlayerFontFamily.getEntries())) {
                    qVar4.X(430172293);
                    qVar = qVar5;
                    DividerKt.m1827DivideriJQMabo(r1.d.G(qVar, EchoTheme.INSTANCE.getSpacings(mVar, EchoTheme.$stable).getX5(), t2.u.P, 2), 0L, mVar, 0, 2);
                    i11 = 0;
                    qVar4.p(false);
                } else {
                    qVar = qVar5;
                    i11 = 0;
                    qVar4.X(430269354);
                    qVar4.p(false);
                }
                qVar3 = qVar4;
                i12 = i11;
                qVar2 = qVar;
                i13 = i14;
                z6 = true;
                obj = lVar;
                obj2 = bottomSheetControl;
            } else {
                ig.f.U();
                throw null;
            }
        }
        u2.q qVar6 = qVar3;
        qVar6.p(i12);
        r1.d.g(p2.f(qVar2, EchoTheme.INSTANCE.getSpacings(mVar, EchoTheme.$stable).getX5()), mVar);
        qVar6.p(true);
        return sn.z.f31622a;
    }

    public static final sn.z FontPickerSheet$lambda$0$0$0$0$0(BottomSheetControl bottomSheetControl, ho.l lVar, PlayerFontFamily playerFontFamily) {
        bottomSheetControl.close();
        lVar.invoke(playerFontFamily);
        return sn.z.f31622a;
    }

    public static final sn.z FontPickerSheet$lambda$0$0$0$1(PlayerFontFamily playerFontFamily, PlayerFontFamily playerFontFamily2, String str, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        float f10;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t E = r1.d.E(e10, echoTheme.getSpacings(qVar, i11).getX5());
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t I = r1.d.I(new r1.m1(1.0f, true), t2.u.P, echoTheme.getSpacings(qVar, i11).getX3(), echoTheme.getSpacings(qVar, i11).getX4(), echoTheme.getSpacings(qVar, i11).getX3(), 1);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(I, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i11);
            int i12 = EchoThemeTypography.$stable;
            s4.y0 a12 = s4.y0.a(typography.getBaseRegular600(qVar, i12), 0L, 0L, null, getRealFontFamily(playerFontFamily), null, 0L, 0, 0L, null, null, 16777183);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i11).getText();
            int i13 = EchoThemeColors.Text.$stable;
            j7.d(str, null, text.getPrimary(qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a12, qVar, 0, 0, 131066);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX1()), qVar);
            j7.d(kj.c.R(qVar, R.string.player_customize_family_name_preview_text), null, ib.i.b(i11, i13, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s4.y0.a(echoTheme.getTypography(qVar, i11).getSmRegular500(qVar, i12), 0L, 0L, null, getRealFontFamily(playerFontFamily), null, 0L, 0, 0L, null, null, 16777183), qVar, 0, 0, 131066);
            qVar.p(true);
            if (playerFontFamily == playerFontFamily2) {
                f10 = 1.0f;
            } else {
                f10 = t2.u.P;
            }
            s2 b10 = j1.f.b(f10, null, "alpha", qVar, 3072, 22);
            i3.t o6 = p2.o(qVar2, 48);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(o6, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.checkmark_1, qVar, 0), null, r1.d.E(l1.n.h(p2.o(m3.h.a(qVar2, FontPickerSheet$lambda$0$0$0$1$0$1(b10)), 24), ib.i.v(i11, i13, echoTheme, qVar, qVar), echoTheme.getShapes(qVar, i11).getFull(qVar, EchoThemeShapes.$stable)), 5), echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), qVar, u3.c.$stable | 48, 0);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final float FontPickerSheet$lambda$0$0$0$1$0$1(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z FontPickerSheet$lambda$1(PlayerFontFamily playerFontFamily, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        FontPickerSheet(playerFontFamily, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void FontSizeSelect(Long l4, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        long j4;
        boolean z10;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(443508462);
        if ((i10 & 6) == 0) {
            if (qVar.f(l4)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i14 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(e10, elevenLabsTheme.getSpacings(qVar, i14).m2357getX5D9Ej5fM(), t2.u.P, 2);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l7, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            if (l4 != null) {
                j4 = l4.longValue();
            } else {
                j4 = 16;
            }
            float f10 = (float) j4;
            int i15 = i11;
            no.c cVar = new no.c(8.0f, 40.0f);
            String R = kj.c.R(qVar, R.string.player_customize_accessibility_font_size);
            if ((i15 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L = qVar.L();
            if (z10 || L == u2.l.f33918a) {
                L = new t(lVar, 0);
                qVar.h0(L);
            }
            SliderKt.Slider(f10, (ho.l) L, R, null, null, null, cVar, qVar, 0, 56);
            i3.t e11 = p2.e(qVar2, 1.0f);
            k2 a11 = i2.a(r1.j.f29234g, i3.d.f13004y0, qVar, 6);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c10 = i3.a.c(e11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            j7.d(kj.c.R(qVar, R.string.player_customize_font_size_smallest), null, defpackage.f.A(elevenLabsTheme, qVar, i14), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getBodyTiny500(), qVar, 0, 0, 131066);
            u2.q qVar3 = qVar;
            if (l4 != null) {
                qVar3.X(338131073);
                j7.d(kj.c.Q(R.string.player_customize_font_size_pts, new Object[]{l4}, qVar3), null, defpackage.f.A(elevenLabsTheme, qVar3, i14), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i14).getBodyTiny500(), qVar3, 0, 0, 131066);
                qVar3 = qVar3;
                qVar3.p(false);
            } else {
                qVar3.X(338372718);
                qVar3.p(false);
            }
            u2.q qVar4 = qVar3;
            j7.d(kj.c.R(qVar3, R.string.player_customize_font_size_largest), null, defpackage.f.A(elevenLabsTheme, qVar3, i14), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i14).getBodyTiny500(), qVar4, 0, 0, 131066);
            qVar = qVar4;
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(l4, lVar, i10, 2);
        }
    }

    public static final sn.z FontSizeSelect$lambda$0$0$0(ho.l lVar, float f10) {
        lVar.invoke(Long.valueOf(jo.a.z(f10)));
        return sn.z.f31622a;
    }

    public static final sn.z FontSizeSelect$lambda$1(Long l4, ho.l lVar, int i10, u2.m mVar, int i11) {
        FontSizeSelect(l4, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void PlayerPreferencesScreen(ho.a aVar, PlayerPreferencesViewModel playerPreferencesViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        PlayerPreferencesViewModel playerPreferencesViewModel2;
        boolean z6;
        PlayerPreferencesViewModel playerPreferencesViewModel3;
        q7.c cVar;
        final PlayerPreferencesViewModel playerPreferencesViewModel4;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        boolean h12;
        Object L3;
        boolean h13;
        Object L4;
        boolean h14;
        Object L5;
        boolean h15;
        Object L6;
        boolean h16;
        Object L7;
        boolean h17;
        Object L8;
        boolean h18;
        Object L9;
        boolean h19;
        Object L10;
        boolean h20;
        Object L11;
        boolean h21;
        Object L12;
        boolean h22;
        Object L13;
        int i13;
        int i14;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2004648111);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                playerPreferencesViewModel2 = playerPreferencesViewModel;
                if (qVar.h(playerPreferencesViewModel2)) {
                    i13 = 32;
                    i12 |= i13;
                }
            } else {
                playerPreferencesViewModel2 = playerPreferencesViewModel;
            }
            i13 = 16;
            i12 |= i13;
        } else {
            playerPreferencesViewModel2 = playerPreferencesViewModel;
        }
        int i15 = i12;
        if ((i15 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i15 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 2) != 0) {
                    i15 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    playerPreferencesViewModel4 = (PlayerPreferencesViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(PlayerPreferencesViewModel.class), a10, null, o6, cVar, qVar);
                    i15 &= -113;
                    qVar.q();
                    PlayerPreferencesState playerPreferencesState = (PlayerPreferencesState) rd.c1.m(playerPreferencesViewModel4.getStateFlow(), qVar, 0).getValue();
                    h10 = qVar.h(playerPreferencesViewModel4);
                    L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!h10 || L == eVar) {
                        final int i16 = 0;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.v
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z PlayerPreferencesScreen$lambda$0$0;
                                sn.z PlayerPreferencesScreen$lambda$10$0;
                                sn.z PlayerPreferencesScreen$lambda$11$0;
                                sn.z PlayerPreferencesScreen$lambda$12$0;
                                switch (i16) {
                                    case 0:
                                        PlayerPreferencesScreen$lambda$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$0$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$0$0;
                                    case 1:
                                        PlayerPreferencesScreen$lambda$10$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$10$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$10$0;
                                    case 2:
                                        PlayerPreferencesScreen$lambda$11$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$11$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$11$0;
                                    default:
                                        PlayerPreferencesScreen$lambda$12$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$12$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$12$0;
                                }
                            }
                        };
                        qVar.h0(L);
                    }
                    ho.a aVar2 = (ho.a) L;
                    h11 = qVar.h(playerPreferencesViewModel4);
                    L2 = qVar.L();
                    if (!h11 || L2 == eVar) {
                        L2 = new r(playerPreferencesViewModel4, 4);
                        qVar.h0(L2);
                    }
                    ho.l lVar = (ho.l) L2;
                    h12 = qVar.h(playerPreferencesViewModel4);
                    L3 = qVar.L();
                    if (!h12 || L3 == eVar) {
                        L3 = new r(playerPreferencesViewModel4, 5);
                        qVar.h0(L3);
                    }
                    ho.l lVar2 = (ho.l) L3;
                    h13 = qVar.h(playerPreferencesViewModel4);
                    L4 = qVar.L();
                    if (!h13 || L4 == eVar) {
                        L4 = new r(playerPreferencesViewModel4, 6);
                        qVar.h0(L4);
                    }
                    ho.l lVar3 = (ho.l) L4;
                    h14 = qVar.h(playerPreferencesViewModel4);
                    L5 = qVar.L();
                    if (!h14 || L5 == eVar) {
                        L5 = new q(playerPreferencesViewModel4, 0);
                        qVar.h0(L5);
                    }
                    ho.p pVar = (ho.p) L5;
                    h15 = qVar.h(playerPreferencesViewModel4);
                    L6 = qVar.L();
                    if (!h15 || L6 == eVar) {
                        L6 = new r(playerPreferencesViewModel4, 0);
                        qVar.h0(L6);
                    }
                    ho.l lVar4 = (ho.l) L6;
                    h16 = qVar.h(playerPreferencesViewModel4);
                    L7 = qVar.L();
                    if (!h16 || L7 == eVar) {
                        L7 = new q(playerPreferencesViewModel4, 1);
                        qVar.h0(L7);
                    }
                    ho.p pVar2 = (ho.p) L7;
                    h17 = qVar.h(playerPreferencesViewModel4);
                    L8 = qVar.L();
                    if (!h17 || L8 == eVar) {
                        L8 = new r(playerPreferencesViewModel4, 1);
                        qVar.h0(L8);
                    }
                    ho.l lVar5 = (ho.l) L8;
                    h18 = qVar.h(playerPreferencesViewModel4);
                    L9 = qVar.L();
                    if (!h18 || L9 == eVar) {
                        L9 = new r(playerPreferencesViewModel4, 2);
                        qVar.h0(L9);
                    }
                    ho.l lVar6 = (ho.l) L9;
                    h19 = qVar.h(playerPreferencesViewModel4);
                    L10 = qVar.L();
                    if (!h19 || L10 == eVar) {
                        L10 = new r(playerPreferencesViewModel4, 3);
                        qVar.h0(L10);
                    }
                    ho.l lVar7 = (ho.l) L10;
                    h20 = qVar.h(playerPreferencesViewModel4);
                    L11 = qVar.L();
                    if (!h20 || L11 == eVar) {
                        final int i17 = 1;
                        L11 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.v
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z PlayerPreferencesScreen$lambda$0$0;
                                sn.z PlayerPreferencesScreen$lambda$10$0;
                                sn.z PlayerPreferencesScreen$lambda$11$0;
                                sn.z PlayerPreferencesScreen$lambda$12$0;
                                switch (i17) {
                                    case 0:
                                        PlayerPreferencesScreen$lambda$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$0$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$0$0;
                                    case 1:
                                        PlayerPreferencesScreen$lambda$10$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$10$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$10$0;
                                    case 2:
                                        PlayerPreferencesScreen$lambda$11$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$11$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$11$0;
                                    default:
                                        PlayerPreferencesScreen$lambda$12$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$12$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$12$0;
                                }
                            }
                        };
                        qVar.h0(L11);
                    }
                    ho.a aVar3 = (ho.a) L11;
                    h21 = qVar.h(playerPreferencesViewModel4);
                    L12 = qVar.L();
                    if (!h21 || L12 == eVar) {
                        final int i18 = 2;
                        L12 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.v
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z PlayerPreferencesScreen$lambda$0$0;
                                sn.z PlayerPreferencesScreen$lambda$10$0;
                                sn.z PlayerPreferencesScreen$lambda$11$0;
                                sn.z PlayerPreferencesScreen$lambda$12$0;
                                switch (i18) {
                                    case 0:
                                        PlayerPreferencesScreen$lambda$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$0$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$0$0;
                                    case 1:
                                        PlayerPreferencesScreen$lambda$10$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$10$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$10$0;
                                    case 2:
                                        PlayerPreferencesScreen$lambda$11$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$11$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$11$0;
                                    default:
                                        PlayerPreferencesScreen$lambda$12$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$12$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$12$0;
                                }
                            }
                        };
                        qVar.h0(L12);
                    }
                    ho.a aVar4 = (ho.a) L12;
                    h22 = qVar.h(playerPreferencesViewModel4);
                    L13 = qVar.L();
                    if (!h22 || L13 == eVar) {
                        final int i19 = 3;
                        L13 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.v
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z PlayerPreferencesScreen$lambda$0$0;
                                sn.z PlayerPreferencesScreen$lambda$10$0;
                                sn.z PlayerPreferencesScreen$lambda$11$0;
                                sn.z PlayerPreferencesScreen$lambda$12$0;
                                switch (i19) {
                                    case 0:
                                        PlayerPreferencesScreen$lambda$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$0$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$0$0;
                                    case 1:
                                        PlayerPreferencesScreen$lambda$10$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$10$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$10$0;
                                    case 2:
                                        PlayerPreferencesScreen$lambda$11$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$11$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$11$0;
                                    default:
                                        PlayerPreferencesScreen$lambda$12$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$12$0(playerPreferencesViewModel4);
                                        return PlayerPreferencesScreen$lambda$12$0;
                                }
                            }
                        };
                        qVar.h0(L13);
                    }
                    PlayerPreferencesScreenUI(playerPreferencesState, aVar, aVar2, lVar, lVar2, lVar3, pVar, lVar4, pVar2, lVar5, lVar6, lVar7, aVar3, aVar4, (ho.a) L13, qVar, (i15 << 3) & 112, 0);
                    playerPreferencesViewModel3 = playerPreferencesViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            playerPreferencesViewModel4 = playerPreferencesViewModel2;
            qVar.q();
            PlayerPreferencesState playerPreferencesState2 = (PlayerPreferencesState) rd.c1.m(playerPreferencesViewModel4.getStateFlow(), qVar, 0).getValue();
            h10 = qVar.h(playerPreferencesViewModel4);
            L = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (!h10) {
            }
            final int i162 = 0;
            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.v
                @Override // ho.a
                public final Object invoke() {
                    sn.z PlayerPreferencesScreen$lambda$0$0;
                    sn.z PlayerPreferencesScreen$lambda$10$0;
                    sn.z PlayerPreferencesScreen$lambda$11$0;
                    sn.z PlayerPreferencesScreen$lambda$12$0;
                    switch (i162) {
                        case 0:
                            PlayerPreferencesScreen$lambda$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$0$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$0$0;
                        case 1:
                            PlayerPreferencesScreen$lambda$10$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$10$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$10$0;
                        case 2:
                            PlayerPreferencesScreen$lambda$11$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$11$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$11$0;
                        default:
                            PlayerPreferencesScreen$lambda$12$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$12$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$12$0;
                    }
                }
            };
            qVar.h0(L);
            ho.a aVar22 = (ho.a) L;
            h11 = qVar.h(playerPreferencesViewModel4);
            L2 = qVar.L();
            if (!h11) {
            }
            L2 = new r(playerPreferencesViewModel4, 4);
            qVar.h0(L2);
            ho.l lVar8 = (ho.l) L2;
            h12 = qVar.h(playerPreferencesViewModel4);
            L3 = qVar.L();
            if (!h12) {
            }
            L3 = new r(playerPreferencesViewModel4, 5);
            qVar.h0(L3);
            ho.l lVar22 = (ho.l) L3;
            h13 = qVar.h(playerPreferencesViewModel4);
            L4 = qVar.L();
            if (!h13) {
            }
            L4 = new r(playerPreferencesViewModel4, 6);
            qVar.h0(L4);
            ho.l lVar32 = (ho.l) L4;
            h14 = qVar.h(playerPreferencesViewModel4);
            L5 = qVar.L();
            if (!h14) {
            }
            L5 = new q(playerPreferencesViewModel4, 0);
            qVar.h0(L5);
            ho.p pVar3 = (ho.p) L5;
            h15 = qVar.h(playerPreferencesViewModel4);
            L6 = qVar.L();
            if (!h15) {
            }
            L6 = new r(playerPreferencesViewModel4, 0);
            qVar.h0(L6);
            ho.l lVar42 = (ho.l) L6;
            h16 = qVar.h(playerPreferencesViewModel4);
            L7 = qVar.L();
            if (!h16) {
            }
            L7 = new q(playerPreferencesViewModel4, 1);
            qVar.h0(L7);
            ho.p pVar22 = (ho.p) L7;
            h17 = qVar.h(playerPreferencesViewModel4);
            L8 = qVar.L();
            if (!h17) {
            }
            L8 = new r(playerPreferencesViewModel4, 1);
            qVar.h0(L8);
            ho.l lVar52 = (ho.l) L8;
            h18 = qVar.h(playerPreferencesViewModel4);
            L9 = qVar.L();
            if (!h18) {
            }
            L9 = new r(playerPreferencesViewModel4, 2);
            qVar.h0(L9);
            ho.l lVar62 = (ho.l) L9;
            h19 = qVar.h(playerPreferencesViewModel4);
            L10 = qVar.L();
            if (!h19) {
            }
            L10 = new r(playerPreferencesViewModel4, 3);
            qVar.h0(L10);
            ho.l lVar72 = (ho.l) L10;
            h20 = qVar.h(playerPreferencesViewModel4);
            L11 = qVar.L();
            if (!h20) {
            }
            final int i172 = 1;
            L11 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.v
                @Override // ho.a
                public final Object invoke() {
                    sn.z PlayerPreferencesScreen$lambda$0$0;
                    sn.z PlayerPreferencesScreen$lambda$10$0;
                    sn.z PlayerPreferencesScreen$lambda$11$0;
                    sn.z PlayerPreferencesScreen$lambda$12$0;
                    switch (i172) {
                        case 0:
                            PlayerPreferencesScreen$lambda$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$0$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$0$0;
                        case 1:
                            PlayerPreferencesScreen$lambda$10$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$10$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$10$0;
                        case 2:
                            PlayerPreferencesScreen$lambda$11$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$11$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$11$0;
                        default:
                            PlayerPreferencesScreen$lambda$12$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$12$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$12$0;
                    }
                }
            };
            qVar.h0(L11);
            ho.a aVar32 = (ho.a) L11;
            h21 = qVar.h(playerPreferencesViewModel4);
            L12 = qVar.L();
            if (!h21) {
            }
            final int i182 = 2;
            L12 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.v
                @Override // ho.a
                public final Object invoke() {
                    sn.z PlayerPreferencesScreen$lambda$0$0;
                    sn.z PlayerPreferencesScreen$lambda$10$0;
                    sn.z PlayerPreferencesScreen$lambda$11$0;
                    sn.z PlayerPreferencesScreen$lambda$12$0;
                    switch (i182) {
                        case 0:
                            PlayerPreferencesScreen$lambda$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$0$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$0$0;
                        case 1:
                            PlayerPreferencesScreen$lambda$10$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$10$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$10$0;
                        case 2:
                            PlayerPreferencesScreen$lambda$11$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$11$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$11$0;
                        default:
                            PlayerPreferencesScreen$lambda$12$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$12$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$12$0;
                    }
                }
            };
            qVar.h0(L12);
            ho.a aVar42 = (ho.a) L12;
            h22 = qVar.h(playerPreferencesViewModel4);
            L13 = qVar.L();
            if (!h22) {
            }
            final int i192 = 3;
            L13 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.v
                @Override // ho.a
                public final Object invoke() {
                    sn.z PlayerPreferencesScreen$lambda$0$0;
                    sn.z PlayerPreferencesScreen$lambda$10$0;
                    sn.z PlayerPreferencesScreen$lambda$11$0;
                    sn.z PlayerPreferencesScreen$lambda$12$0;
                    switch (i192) {
                        case 0:
                            PlayerPreferencesScreen$lambda$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$0$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$0$0;
                        case 1:
                            PlayerPreferencesScreen$lambda$10$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$10$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$10$0;
                        case 2:
                            PlayerPreferencesScreen$lambda$11$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$11$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$11$0;
                        default:
                            PlayerPreferencesScreen$lambda$12$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$12$0(playerPreferencesViewModel4);
                            return PlayerPreferencesScreen$lambda$12$0;
                    }
                }
            };
            qVar.h0(L13);
            PlayerPreferencesScreenUI(playerPreferencesState2, aVar, aVar22, lVar8, lVar22, lVar32, pVar3, lVar42, pVar22, lVar52, lVar62, lVar72, aVar32, aVar42, (ho.a) L13, qVar, (i15 << 3) & 112, 0);
            playerPreferencesViewModel3 = playerPreferencesViewModel4;
        } else {
            qVar.R();
            playerPreferencesViewModel3 = playerPreferencesViewModel2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(aVar, playerPreferencesViewModel3, i10, i11, 14);
        }
    }

    public static final sn.z PlayerPreferencesScreen$lambda$0$0(PlayerPreferencesViewModel playerPreferencesViewModel) {
        playerPreferencesViewModel.onFontSelectClick();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$1$0(PlayerPreferencesViewModel playerPreferencesViewModel, long j4) {
        playerPreferencesViewModel.onFontSizeChanged(j4);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$10$0(PlayerPreferencesViewModel playerPreferencesViewModel) {
        playerPreferencesViewModel.closeFontsDialog();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$11$0(PlayerPreferencesViewModel playerPreferencesViewModel) {
        playerPreferencesViewModel.closeActionSelector();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$12$0(PlayerPreferencesViewModel playerPreferencesViewModel) {
        playerPreferencesViewModel.closeInAppSkipDurationSelector();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$13(ho.a aVar, PlayerPreferencesViewModel playerPreferencesViewModel, int i10, int i11, u2.m mVar, int i12) {
        PlayerPreferencesScreen(aVar, playerPreferencesViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$2$0(PlayerPreferencesViewModel playerPreferencesViewModel, PlayerTheme playerTheme) {
        playerTheme.getClass();
        playerPreferencesViewModel.selectTheme(playerTheme);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$3$0(PlayerPreferencesViewModel playerPreferencesViewModel, BluetoothButton bluetoothButton) {
        bluetoothButton.getClass();
        playerPreferencesViewModel.onBluetoothButtonClick(bluetoothButton);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$4$0(PlayerPreferencesViewModel playerPreferencesViewModel, BluetoothButton bluetoothButton, BluetoothButtonAction bluetoothButtonAction) {
        bluetoothButton.getClass();
        bluetoothButtonAction.getClass();
        playerPreferencesViewModel.selectBluetoothAction(bluetoothButton, bluetoothButtonAction);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$5$0(PlayerPreferencesViewModel playerPreferencesViewModel, InAppSkipDirection inAppSkipDirection) {
        inAppSkipDirection.getClass();
        playerPreferencesViewModel.onInAppSkipDurationButtonClick(inAppSkipDirection);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$6$0(PlayerPreferencesViewModel playerPreferencesViewModel, InAppSkipDirection inAppSkipDirection, SkipDuration skipDuration) {
        inAppSkipDirection.getClass();
        skipDuration.getClass();
        playerPreferencesViewModel.selectInAppSkipDuration(inAppSkipDirection, skipDuration);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$7$0(PlayerPreferencesViewModel playerPreferencesViewModel, boolean z6) {
        playerPreferencesViewModel.toggleAutoFullscreen(z6);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$8$0(PlayerPreferencesViewModel playerPreferencesViewModel, boolean z6) {
        playerPreferencesViewModel.toggleTapToShowControls(z6);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreen$lambda$9$0(PlayerPreferencesViewModel playerPreferencesViewModel, PlayerFontFamily playerFontFamily) {
        playerFontFamily.getClass();
        playerPreferencesViewModel.onFontFamilyChanged(playerFontFamily);
        return sn.z.f31622a;
    }

    public static final void PlayerPreferencesScreenUI(final PlayerPreferencesState playerPreferencesState, final ho.a aVar, final ho.a aVar2, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, final ho.p pVar, final ho.l lVar4, final ho.p pVar2, final ho.l lVar5, final ho.l lVar6, final ho.l lVar7, final ho.a aVar3, final ho.a aVar4, final ho.a aVar5, u2.m mVar, final int i10, final int i11) {
        int i12;
        ho.a aVar6;
        ho.a aVar7;
        ho.l lVar8;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1156599129);
        if ((i10 & 6) == 0) {
            if (qVar.h(playerPreferencesState)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i12 = i27 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar6 = aVar;
            if (qVar.h(aVar6)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i12 |= i26;
        } else {
            aVar6 = aVar;
        }
        if ((i10 & 384) == 0) {
            aVar7 = aVar2;
            if (qVar.h(aVar7)) {
                i25 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i25 = 128;
            }
            i12 |= i25;
        } else {
            aVar7 = aVar2;
        }
        if ((i10 & 3072) == 0) {
            lVar8 = lVar;
            if (qVar.h(lVar8)) {
                i24 = 2048;
            } else {
                i24 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i24;
        } else {
            lVar8 = lVar;
        }
        int i28 = i10 & 24576;
        int i29 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i28 == 0) {
            if (qVar.h(lVar2)) {
                i23 = 16384;
            } else {
                i23 = 8192;
            }
            i12 |= i23;
        }
        if ((i10 & 196608) == 0) {
            if (qVar.h(lVar3)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i12 |= i22;
        }
        if ((i10 & 1572864) == 0) {
            if (qVar.h(pVar)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i12 |= i21;
        }
        if ((i10 & 12582912) == 0) {
            if (qVar.h(lVar4)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        if ((i10 & 100663296) == 0) {
            if (qVar.h(pVar2)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i12 |= i19;
        }
        if ((i10 & 805306368) == 0) {
            if (qVar.h(lVar5)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i12 |= i18;
        }
        if ((i11 & 6) == 0) {
            if (qVar.h(lVar6)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i11 | i17;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.h(lVar7)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        if ((i11 & 384) == 0) {
            if (qVar.h(aVar3)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i11 & 3072) == 0) {
            if (qVar.h(aVar4)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
        }
        if ((i11 & 24576) == 0) {
            if (qVar.h(aVar5)) {
                i29 = 16384;
            }
            i13 |= i29;
        }
        int i30 = i13;
        if ((i12 & 306783379) == 306783378 && (i30 & 9363) == 9362) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (qVar.O(i12 & 1, z6)) {
            final ho.a aVar8 = aVar6;
            final ho.a aVar9 = aVar7;
            final ho.l lVar9 = lVar8;
            k5.a(null, null, null, null, null, 0, 0L, 0L, null, c3.k.d(131306728, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.z
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    sn.z PlayerPreferencesScreenUI$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    PlayerPreferencesScreenUI$lambda$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreenUI$lambda$0(PlayerPreferencesState.this, pVar2, aVar5, lVar7, aVar3, aVar8, aVar9, lVar9, lVar2, lVar4, lVar3, lVar5, lVar6, pVar, aVar4, (r1.z1) obj, (u2.m) obj2, intValue);
                    return PlayerPreferencesScreenUI$lambda$0;
                }
            }, qVar), qVar, 805306368, 511);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.a0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z PlayerPreferencesScreenUI$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    PlayerPreferencesScreenUI$lambda$1 = PlayerPreferencesScreenKt.PlayerPreferencesScreenUI$lambda$1(PlayerPreferencesState.this, aVar, aVar2, lVar, lVar2, lVar3, pVar, lVar4, pVar2, lVar5, lVar6, lVar7, aVar3, aVar4, aVar5, i10, i11, (u2.m) obj, intValue);
                    return PlayerPreferencesScreenUI$lambda$1;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sn.z PlayerPreferencesScreenUI$lambda$0(PlayerPreferencesState playerPreferencesState, ho.p pVar, ho.a aVar, ho.l lVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5, ho.l lVar6, ho.l lVar7, ho.p pVar2, ho.a aVar5, r1.z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        BluetoothButtonAction nextButtonAction;
        boolean f10;
        Object L;
        ?? r12;
        SkipDuration inAppForwardSeekDuration;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t o6 = r1.d.o(r1.d.D(l1.n.h(p2.d(qVar2, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), z1Var), z1Var);
            f4.f1 d10 = r1.p.d(i3.d.f12998b, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(o6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.t d11 = p2.d(qVar2, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(d11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            HeaderActionsKt.EchoThemeHeaderActions(null, kj.c.R(qVar, R.string.player_preferences_title), c3.k.d(-729124119, true, new g(aVar3, 1), qVar), null, qVar, 384, 9);
            ShadowKt.m1876BottomShadowOverlayPZHvWI(p2.d(qVar2, 1.0f), ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), 0L, c3.k.d(-237914100, true, new io.elevenlabs.readerapp.core.router.o(aVar4, playerPreferencesState, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, 1), qVar), qVar, 3078, 4);
            qVar.p(true);
            qVar.p(true);
            BluetoothButton showActionSelectorFor = playerPreferencesState.getShowActionSelectorFor();
            Object obj = u2.l.f33918a;
            PlayerFontFamily playerFontFamily = null;
            if (showActionSelectorFor == null) {
                qVar.X(-948518796);
                qVar.p(false);
            } else {
                qVar.X(-948518795);
                int i13 = WhenMappings.$EnumSwitchMapping$0[showActionSelectorFor.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                PlayerPreferences playerPreferences = playerPreferencesState.getPlayerPreferences();
                                if (playerPreferences != null) {
                                    nextButtonAction = playerPreferences.getBackButtonAction();
                                    if (nextButtonAction == null) {
                                        nextButtonAction = BluetoothButtonAction.NOTHING;
                                    }
                                    f10 = qVar.f(pVar2) | qVar.d(showActionSelectorFor.ordinal());
                                    L = qVar.L();
                                    if (!f10 || L == obj) {
                                        L = new d2(pVar2, showActionSelectorFor, 2);
                                        qVar.h0(L);
                                    }
                                    BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet(showActionSelectorFor, nextButtonAction, (ho.l) L, aVar5, qVar, 0);
                                    qVar.p(false);
                                }
                                nextButtonAction = null;
                                if (nextButtonAction == null) {
                                }
                                f10 = qVar.f(pVar2) | qVar.d(showActionSelectorFor.ordinal());
                                L = qVar.L();
                                if (!f10) {
                                }
                                L = new d2(pVar2, showActionSelectorFor, 2);
                                qVar.h0(L);
                                BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet(showActionSelectorFor, nextButtonAction, (ho.l) L, aVar5, qVar, 0);
                                qVar.p(false);
                            } else {
                                c6.p();
                                return null;
                            }
                        } else {
                            PlayerPreferences playerPreferences2 = playerPreferencesState.getPlayerPreferences();
                            if (playerPreferences2 != null) {
                                nextButtonAction = playerPreferences2.getForwardButtonAction();
                                if (nextButtonAction == null) {
                                }
                                f10 = qVar.f(pVar2) | qVar.d(showActionSelectorFor.ordinal());
                                L = qVar.L();
                                if (!f10) {
                                }
                                L = new d2(pVar2, showActionSelectorFor, 2);
                                qVar.h0(L);
                                BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet(showActionSelectorFor, nextButtonAction, (ho.l) L, aVar5, qVar, 0);
                                qVar.p(false);
                            }
                            nextButtonAction = null;
                            if (nextButtonAction == null) {
                            }
                            f10 = qVar.f(pVar2) | qVar.d(showActionSelectorFor.ordinal());
                            L = qVar.L();
                            if (!f10) {
                            }
                            L = new d2(pVar2, showActionSelectorFor, 2);
                            qVar.h0(L);
                            BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet(showActionSelectorFor, nextButtonAction, (ho.l) L, aVar5, qVar, 0);
                            qVar.p(false);
                        }
                    } else {
                        PlayerPreferences playerPreferences3 = playerPreferencesState.getPlayerPreferences();
                        if (playerPreferences3 != null) {
                            nextButtonAction = playerPreferences3.getPreviousButtonAction();
                            if (nextButtonAction == null) {
                            }
                            f10 = qVar.f(pVar2) | qVar.d(showActionSelectorFor.ordinal());
                            L = qVar.L();
                            if (!f10) {
                            }
                            L = new d2(pVar2, showActionSelectorFor, 2);
                            qVar.h0(L);
                            BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet(showActionSelectorFor, nextButtonAction, (ho.l) L, aVar5, qVar, 0);
                            qVar.p(false);
                        }
                        nextButtonAction = null;
                        if (nextButtonAction == null) {
                        }
                        f10 = qVar.f(pVar2) | qVar.d(showActionSelectorFor.ordinal());
                        L = qVar.L();
                        if (!f10) {
                        }
                        L = new d2(pVar2, showActionSelectorFor, 2);
                        qVar.h0(L);
                        BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet(showActionSelectorFor, nextButtonAction, (ho.l) L, aVar5, qVar, 0);
                        qVar.p(false);
                    }
                } else {
                    PlayerPreferences playerPreferences4 = playerPreferencesState.getPlayerPreferences();
                    if (playerPreferences4 != null) {
                        nextButtonAction = playerPreferences4.getNextButtonAction();
                        if (nextButtonAction == null) {
                        }
                        f10 = qVar.f(pVar2) | qVar.d(showActionSelectorFor.ordinal());
                        L = qVar.L();
                        if (!f10) {
                        }
                        L = new d2(pVar2, showActionSelectorFor, 2);
                        qVar.h0(L);
                        BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet(showActionSelectorFor, nextButtonAction, (ho.l) L, aVar5, qVar, 0);
                        qVar.p(false);
                    }
                    nextButtonAction = null;
                    if (nextButtonAction == null) {
                    }
                    f10 = qVar.f(pVar2) | qVar.d(showActionSelectorFor.ordinal());
                    L = qVar.L();
                    if (!f10) {
                    }
                    L = new d2(pVar2, showActionSelectorFor, 2);
                    qVar.h0(L);
                    BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet(showActionSelectorFor, nextButtonAction, (ho.l) L, aVar5, qVar, 0);
                    qVar.p(false);
                }
            }
            InAppSkipDirection showInAppSkipDurationSelectorFor = playerPreferencesState.getShowInAppSkipDurationSelectorFor();
            PlayerPreferences playerPreferences5 = playerPreferencesState.getPlayerPreferences();
            if (showInAppSkipDurationSelectorFor != null && playerPreferences5 != null) {
                qVar.X(-947627452);
                int i14 = WhenMappings.$EnumSwitchMapping$1[showInAppSkipDurationSelectorFor.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        inAppForwardSeekDuration = playerPreferences5.getInAppBackwardSeekDuration();
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    inAppForwardSeekDuration = playerPreferences5.getInAppForwardSeekDuration();
                }
                boolean f11 = qVar.f(pVar) | qVar.d(showInAppSkipDurationSelectorFor.ordinal());
                Object L2 = qVar.L();
                if (f11 || L2 == obj) {
                    L2 = new d2(pVar, showInAppSkipDurationSelectorFor, 3);
                    qVar.h0(L2);
                }
                InAppSkipDurationSelectorSheetKt.InAppSkipDurationSelectorSheet(showInAppSkipDurationSelectorFor, inAppForwardSeekDuration, (ho.l) L2, aVar, qVar, 0);
                r12 = 0;
                qVar.p(false);
            } else {
                r12 = 0;
                qVar.X(-947145030);
                qVar.p(false);
            }
            if (playerPreferencesState.getShowFontsDialog()) {
                qVar.X(-947067871);
                UserConfig.PlayerConfig playerConfig = playerPreferencesState.getPlayerConfig();
                if (playerConfig != null) {
                    playerFontFamily = playerConfig.getFontFamily();
                }
                FontPickerSheet(playerFontFamily, lVar, aVar2, qVar, r12);
                qVar.p(r12);
            } else {
                qVar.X(-946859334);
                qVar.p(r12);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$0$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.EchoThemeBackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$0$0$1(ho.a aVar, PlayerPreferencesState playerPreferencesState, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5, ho.l lVar6, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        Long l4;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t y10 = l1.n.y(p2.d(qVar2, 1.0f), l1.n.x(qVar), true, true);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t G = r1.d.G(y10, t2.u.P, echoTheme.getSpacings(qVar, i11).getX2(), 1);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l7, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            String R = kj.c.R(qVar, R.string.player_preferences_appearance);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i11);
            int i12 = EchoThemeTypography.$stable;
            s4.y0 lgRegular600 = typography.getLgRegular600(qVar, i12);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i11).getText();
            int i13 = EchoThemeColors.Text.$stable;
            j7.d(R, r1.d.G(qVar2, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2), text.getPrimary(qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, lgRegular600, qVar, 0, 0, 131064);
            ib.i.z(echoTheme, qVar, i11, qVar2, qVar);
            FontFamilySelect(aVar, qVar, 0);
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            UserConfig.PlayerConfig playerConfig = playerPreferencesState.getPlayerConfig();
            PlayerTheme playerTheme = null;
            if (playerConfig != null) {
                l4 = Long.valueOf(playerConfig.getFontSize());
            } else {
                l4 = null;
            }
            FontSizeSelect(l4, lVar, qVar, 0);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX5()), qVar);
            UserConfig.PlayerConfig playerConfig2 = playerPreferencesState.getPlayerConfig();
            if (playerConfig2 != null) {
                playerTheme = playerConfig2.getTheme();
            }
            ThemeSelect(playerTheme, lVar2, qVar, 0);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX6()), qVar);
            String R2 = kj.c.R(qVar, R.string.player_preferences_skip_controls);
            j7.d(R2, r1.d.G(qVar2, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2), ib.i.v(i11, i13, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getLgRegular600(qVar, i12), qVar, 0, 0, 131064);
            ib.i.z(echoTheme, qVar, i11, qVar2, qVar);
            PlayerPreferences playerPreferences = playerPreferencesState.getPlayerPreferences();
            u2.e eVar = u2.l.f33918a;
            if (playerPreferences == null) {
                qVar.X(870830905);
                qVar.p(false);
            } else {
                qVar.X(870830906);
                String R3 = kj.c.R(qVar, R.string.player_preferences_controls_forward_button);
                String R4 = kj.c.R(qVar, InAppSkipDurationSelectorSheetKt.inAppSkipDurationLabel(InAppSkipDirection.FORWARD, playerPreferences.getInAppForwardSeekDuration()));
                boolean f10 = qVar.f(lVar3);
                Object L = qVar.L();
                if (f10 || L == eVar) {
                    L = new l(lVar3, 2);
                    qVar.h0(L);
                }
                PreferenceActionRow(R2, R3, R4, (ho.a) L, qVar, 0);
                ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
                String R5 = kj.c.R(qVar, R.string.player_preferences_controls_back_button);
                String R6 = kj.c.R(qVar, InAppSkipDurationSelectorSheetKt.inAppSkipDurationLabel(InAppSkipDirection.BACKWARD, playerPreferences.getInAppBackwardSeekDuration()));
                boolean f11 = qVar.f(lVar3);
                Object L2 = qVar.L();
                if (f11 || L2 == eVar) {
                    L2 = new l(lVar3, 3);
                    qVar.h0(L2);
                }
                PreferenceActionRow(R2, R5, R6, (ho.a) L2, qVar, 0);
                qVar.p(false);
            }
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX6()), qVar);
            String R7 = kj.c.R(qVar, R.string.player_preferences_media_controls);
            j7.d(R7, r1.d.G(qVar2, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2), ib.i.v(i11, i13, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getLgRegular600(qVar, i12), qVar, 0, 0, 131064);
            ib.i.z(echoTheme, qVar, i11, qVar2, qVar);
            PlayerPreferences playerPreferences2 = playerPreferencesState.getPlayerPreferences();
            if (playerPreferences2 == null) {
                qVar.X(872631230);
                qVar.p(false);
            } else {
                qVar.X(872631231);
                String R8 = kj.c.R(qVar, R.string.player_preferences_controls_next_button);
                String actionLabel = BluetoothActionSelectorSheetKt.getActionLabel(playerPreferences2.getNextButtonAction(), qVar, 0);
                boolean f12 = qVar.f(lVar4);
                Object L3 = qVar.L();
                if (f12 || L3 == eVar) {
                    L3 = new l(lVar4, 4);
                    qVar.h0(L3);
                }
                PreferenceActionRow(R7, R8, actionLabel, (ho.a) L3, qVar, 0);
                ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
                String R9 = kj.c.R(qVar, R.string.player_preferences_controls_previous_button);
                String actionLabel2 = BluetoothActionSelectorSheetKt.getActionLabel(playerPreferences2.getPreviousButtonAction(), qVar, 0);
                boolean f13 = qVar.f(lVar4);
                Object L4 = qVar.L();
                if (f13 || L4 == eVar) {
                    L4 = new l(lVar4, 5);
                    qVar.h0(L4);
                }
                PreferenceActionRow(R7, R9, actionLabel2, (ho.a) L4, qVar, 0);
                ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
                String R10 = kj.c.R(qVar, R.string.player_preferences_controls_forward_button);
                String actionLabel3 = BluetoothActionSelectorSheetKt.getActionLabel(playerPreferences2.getForwardButtonAction(), qVar, 0);
                boolean f14 = qVar.f(lVar4);
                Object L5 = qVar.L();
                if (f14 || L5 == eVar) {
                    L5 = new l(lVar4, 6);
                    qVar.h0(L5);
                }
                PreferenceActionRow(R7, R10, actionLabel3, (ho.a) L5, qVar, 0);
                ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
                String R11 = kj.c.R(qVar, R.string.player_preferences_controls_back_button);
                String actionLabel4 = BluetoothActionSelectorSheetKt.getActionLabel(playerPreferences2.getBackButtonAction(), qVar, 0);
                boolean f15 = qVar.f(lVar4);
                Object L6 = qVar.L();
                if (f15 || L6 == eVar) {
                    L6 = new l(lVar4, 7);
                    qVar.h0(L6);
                }
                PreferenceActionRow(R7, R11, actionLabel4, (ho.a) L6, qVar, 0);
                qVar.p(false);
            }
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX6()), qVar);
            j7.d(kj.c.R(qVar, R.string.player_preferences_behaviour), r1.d.G(qVar2, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2), ib.i.v(i11, i13, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getLgRegular600(qVar, i12), qVar, 0, 0, 131064);
            ib.i.z(echoTheme, qVar, i11, qVar2, qVar);
            PlayerPreferences playerPreferences3 = playerPreferencesState.getPlayerPreferences();
            if (playerPreferences3 == null) {
                qVar.X(875150476);
                qVar.p(false);
            } else {
                qVar.X(875150477);
                AutoFullscreenRow(playerPreferences3.getAutoFullscreenEnabled(), lVar5, qVar, 0);
                ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
                TapToShowControlsRow(playerPreferences3.getTapToShowControlsEnabled(), playerPreferences3.getAutoFullscreenEnabled(), lVar6, qVar, 0);
                qVar.p(false);
            }
            ib.i.C(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable, qVar2, qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$0$0$1$0$0$0$0(ho.l lVar) {
        lVar.invoke(InAppSkipDirection.FORWARD);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$0$0$1$0$0$1$0(ho.l lVar) {
        lVar.invoke(InAppSkipDirection.BACKWARD);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$0$0$1$0$1$0$0(ho.l lVar) {
        lVar.invoke(BluetoothButton.NEXT);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$0$0$1$0$1$1$0(ho.l lVar) {
        lVar.invoke(BluetoothButton.PREVIOUS);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$0$0$1$0$1$2$0(ho.l lVar) {
        lVar.invoke(BluetoothButton.FORWARD);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$0$0$1$0$1$3$0(ho.l lVar) {
        lVar.invoke(BluetoothButton.BACK);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$1$0$0(ho.p pVar, BluetoothButton bluetoothButton, BluetoothButtonAction bluetoothButtonAction) {
        bluetoothButtonAction.getClass();
        pVar.invoke(bluetoothButton, bluetoothButtonAction);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$0$2$0(ho.p pVar, InAppSkipDirection inAppSkipDirection, SkipDuration skipDuration) {
        skipDuration.getClass();
        pVar.invoke(inAppSkipDirection, skipDuration);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerPreferencesScreenUI$lambda$1(PlayerPreferencesState playerPreferencesState, ho.a aVar, ho.a aVar2, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.p pVar, ho.l lVar4, ho.p pVar2, ho.l lVar5, ho.l lVar6, ho.l lVar7, ho.a aVar3, ho.a aVar4, ho.a aVar5, int i10, int i11, u2.m mVar, int i12) {
        PlayerPreferencesScreenUI(playerPreferencesState, aVar, aVar2, lVar, lVar2, lVar3, pVar, lVar4, pVar2, lVar5, lVar6, lVar7, aVar3, aVar4, aVar5, mVar, u2.r.M(i10 | 1), u2.r.M(i11));
        return sn.z.f31622a;
    }

    private static final void PreferenceActionRow(String str, final String str2, final String str3, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1656358395);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.f(str3)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            qVar = qVar2;
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(str + ": " + str2 + ", " + str3, aVar, null, 0L, false, 0, null, false, null, c3.k.d(730366687, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.b0
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    sn.z PreferenceActionRow$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    PreferenceActionRow$lambda$0 = PlayerPreferencesScreenKt.PreferenceActionRow$lambda$0(str2, str3, (r1.s) obj, (u2.m) obj2, intValue);
                    return PreferenceActionRow$lambda$0;
                }
            }, qVar2), qVar, ((i11 >> 6) & 112) | 805306368, 508);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c0(str, str2, str3, aVar, i10, 0);
        }
    }

    public static final sn.z PreferenceActionRow$lambda$0(String str, String str2, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t G = r1.d.G(e10, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2);
            k2 a10 = i2.a(r1.j.f29234g, i3.d.f13005z0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t G2 = r1.d.G(new r1.m1(1.0f, true), t2.u.P, echoTheme.getSpacings(qVar, i11).getX3(), 1);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(G2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i11);
            int i12 = EchoThemeTypography.$stable;
            s4.y0 baseRegular500 = typography.getBaseRegular500(qVar, i12);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i11).getText();
            int i13 = EchoThemeColors.Text.$stable;
            j7.d(str, null, text.getPrimary(qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar, 0, 0, 131066);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX1()), qVar);
            j7.d(str2, null, ib.i.B(i11, i13, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getSmRegular500(qVar, i12), qVar, 0, 0, 131066);
            qVar.p(true);
            y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.chevron_right, qVar, 0), null, p2.o(qVar2, 20), echoTheme.getColors(qVar, i11).getIcon().getSecondary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PreferenceActionRow$lambda$1(String str, String str2, String str3, ho.a aVar, int i10, u2.m mVar, int i11) {
        PreferenceActionRow(str, str2, str3, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PreferenceToggleRow(final int i10, final int i11, final boolean z6, final ho.l lVar, boolean z10, u2.m mVar, final int i12, final int i13) {
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        u2.q qVar;
        final boolean z13;
        u2.r1 r10;
        final boolean z14;
        boolean z15;
        boolean z16;
        int i16;
        int i17;
        int i18;
        int i19;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1776759367);
        if ((i12 & 6) == 0) {
            if (qVar2.d(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i14 = i19 | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (qVar2.d(i11)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i14 |= i18;
        }
        if ((i12 & 384) == 0) {
            if (qVar2.g(z6)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i14 |= i17;
        }
        if ((i12 & 3072) == 0) {
            if (qVar2.h(lVar)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i14 |= i16;
        }
        int i20 = i13 & 16;
        if (i20 != 0) {
            i14 |= 24576;
        } else if ((i12 & 24576) == 0) {
            z11 = z10;
            if (qVar2.g(z11)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i14 |= i15;
            boolean z17 = false;
            if ((i14 & 9363) == 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!qVar2.O(i14 & 1, z12)) {
                if (i20 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                final String R = kj.c.R(qVar2, i10);
                int i21 = 57344 & i14;
                if (i21 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i14 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z18 = z16 | z15;
                if ((i14 & 896) == 256) {
                    z17 = true;
                }
                boolean z19 = z18 | z17;
                Object L = qVar2.L();
                if (z19 || L == u2.l.f33918a) {
                    L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.w
                        @Override // ho.a
                        public final Object invoke() {
                            sn.z PreferenceToggleRow$lambda$0$0;
                            PreferenceToggleRow$lambda$0$0 = PlayerPreferencesScreenKt.PreferenceToggleRow$lambda$0$0(z14, lVar, z6);
                            return PreferenceToggleRow$lambda$0$0;
                        }
                    };
                    qVar2.h0(L);
                }
                qVar = qVar2;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(R, (ho.a) L, null, 0L, z14, 0, null, false, null, c3.k.d(-1420790187, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.x
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        sn.z PreferenceToggleRow$lambda$1;
                        int intValue = ((Integer) obj3).intValue();
                        PreferenceToggleRow$lambda$1 = PlayerPreferencesScreenKt.PreferenceToggleRow$lambda$1(z6, z14, R, i11, (r1.s) obj, (u2.m) obj2, intValue);
                        return PreferenceToggleRow$lambda$1;
                    }
                }, qVar2), qVar, i21 | 805306368, 492);
                z13 = z14;
            } else {
                qVar = qVar2;
                qVar.R();
                z13 = z11;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.y
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z PreferenceToggleRow$lambda$2;
                        int intValue = ((Integer) obj2).intValue();
                        PreferenceToggleRow$lambda$2 = PlayerPreferencesScreenKt.PreferenceToggleRow$lambda$2(i10, i11, z6, lVar, z13, i12, i13, (u2.m) obj, intValue);
                        return PreferenceToggleRow$lambda$2;
                    }
                };
                return;
            }
            return;
        }
        z11 = z10;
        boolean z172 = false;
        if ((i14 & 9363) == 9362) {
        }
        if (!qVar2.O(i14 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z PreferenceToggleRow$lambda$0$0(boolean z6, ho.l lVar, boolean z10) {
        if (z6) {
            lVar.invoke(Boolean.valueOf(!z10));
        }
        return sn.z.f31622a;
    }

    public static final sn.z PreferenceToggleRow$lambda$1(boolean z6, boolean z10, String str, int i10, r1.s sVar, u2.m mVar, int i11) {
        boolean z11;
        boolean z12;
        long inactive;
        boolean z13;
        long inactive2;
        sVar.getClass();
        if ((i11 & 17) != 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z11)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i12 = EchoTheme.$stable;
            i3.t G = r1.d.G(e10, echoTheme.getSpacings(qVar, i12).getX5(), t2.u.P, 2);
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c5, qVar);
            i3.t G2 = r1.d.G(p2.e(qVar2, 1.0f), t2.u.P, echoTheme.getSpacings(qVar, i12).getX3(), 1);
            k2 a11 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 54);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(G2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a11, qVar);
            u2.r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c10, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            r1.m1 m1Var = new r1.m1(1.0f, true);
            r1.x a12 = r1.w.a(r1.j.f29233f, jVar, qVar, 54);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a12, qVar);
            u2.r.J(eVar3, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c11, qVar);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i12);
            int i13 = EchoThemeTypography.$stable;
            s4.y0 baseRegular500 = typography.getBaseRegular500(qVar, i13);
            if (z10) {
                inactive = ib.i.g(733907148, i12, echoTheme, qVar, qVar).getPrimary(qVar, EchoThemeColors.Text.$stable);
                z12 = false;
            } else {
                z12 = false;
                inactive = ib.i.g(733908269, i12, echoTheme, qVar, qVar).getInactive(qVar, EchoThemeColors.Text.$stable);
            }
            qVar.p(z12);
            j7.d(str, null, inactive, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, baseRegular500, qVar, 0, 24960, 110586);
            String R = kj.c.R(qVar, i10);
            s4.y0 smRegular500 = echoTheme.getTypography(qVar, i12).getSmRegular500(qVar, i13);
            if (z10) {
                inactive2 = ib.i.g(733916461, i12, echoTheme, qVar, qVar).getTertiary(qVar, EchoThemeColors.Text.$stable);
                z13 = false;
            } else {
                z13 = false;
                inactive2 = ib.i.g(733917613, i12, echoTheme, qVar, qVar).getInactive(qVar, EchoThemeColors.Text.$stable);
            }
            qVar.p(z13);
            j7.d(R, r1.d.I(qVar2, t2.u.P, echoTheme.getSpacings(qVar, i12).getX1(), t2.u.P, t2.u.P, 13), inactive2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, smRegular500, qVar, 0, 0, 131064);
            qVar.p(true);
            r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i12).getX3()), qVar);
            EchoThemeColors.Component component = echoTheme.getColors(qVar, i12).getComponent();
            int i14 = EchoThemeColors.Component.$stable;
            long toggleBackgroundActive = component.getToggleBackgroundActive(qVar, i14);
            long toggleForegroundActive = echoTheme.getColors(qVar, i12).getComponent().getToggleForegroundActive(qVar, i14);
            EchoThemeColors.Border border = echoTheme.getColors(qVar, i12).getBorder();
            int i15 = EchoThemeColors.Border.$stable;
            long septenaryAlpha = border.getSeptenaryAlpha(qVar, i15);
            long toggleBackgroundInactive = echoTheme.getColors(qVar, i12).getComponent().getToggleBackgroundInactive(qVar, i14);
            c7.a(z6, null, z10, d5.n(toggleForegroundActive, toggleBackgroundActive, septenaryAlpha, echoTheme.getColors(qVar, i12).getComponent().getToggleForegroundInactive(qVar, i14), toggleBackgroundInactive, echoTheme.getColors(qVar, i12).getBorder().getSeptenaryAlpha(qVar, i15), echoTheme.getColors(qVar, i12).getComponent().getToggleForegroundInactive(qVar, i14), echoTheme.getColors(qVar, i12).getComponent().getToggleBackgroundInactive(qVar, i14), echoTheme.getColors(qVar, i12).getBorder().getSeptenaryAlpha(qVar, i15), echoTheme.getColors(qVar, i12).getComponent().getToggleForegroundInactive(qVar, i14), echoTheme.getColors(qVar, i12).getComponent().getToggleBackgroundInactive(qVar, i14), echoTheme.getColors(qVar, i12).getBorder().getSeptenaryAlpha(qVar, i15), qVar, 34952), qVar, 48, 76);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PreferenceToggleRow$lambda$2(int i10, int i11, boolean z6, ho.l lVar, boolean z10, int i12, int i13, u2.m mVar, int i14) {
        PreferenceToggleRow(i10, i11, z6, lVar, z10, mVar, u2.r.M(i12 | 1), i13);
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerPreferencesScreen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1859356453);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerPreferencesScreenKt.INSTANCE.m1470getLambda$702544447$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 12);
        }
    }

    public static final sn.z Preview_PlayerPreferencesScreen$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerPreferencesScreen(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void TapToShowControlsRow(boolean z6, boolean z10, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        ho.l lVar2;
        int i12;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1190408059);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar.O(i11 & 1, z11)) {
            z12 = z6;
            z13 = z10;
            lVar2 = lVar;
            PreferenceToggleRow(R.string.player_preferences_tap_to_show_controls, R.string.player_preferences_tap_to_show_controls_description, z12, lVar2, z13, qVar, ((i11 << 6) & 896) | ((i11 << 3) & 7168) | ((i11 << 9) & 57344), 0);
        } else {
            z12 = z6;
            z13 = z10;
            lVar2 = lVar;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.d(z12, z13, lVar2, i10);
        }
    }

    public static final sn.z TapToShowControlsRow$lambda$0(boolean z6, boolean z10, ho.l lVar, int i10, u2.m mVar, int i11) {
        TapToShowControlsRow(z6, z10, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void ThemeSelect(PlayerTheme playerTheme, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        PlayerTheme playerTheme2;
        char c5;
        String R;
        boolean z10;
        boolean z11;
        int i12;
        int ordinal;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(443971393);
        if ((i10 & 6) == 0) {
            if (playerTheme == null) {
                ordinal = -1;
            } else {
                ordinal = playerTheme.ordinal();
            }
            if (qVar.d(ordinal)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = i11;
        if ((i14 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i14 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(e10, elevenLabsTheme.getSpacings(qVar, i15).m2357getX5D9Ej5fM(), t2.u.P, 2);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c10, qVar);
            i3.q qVar3 = qVar2;
            j7.d(kj.c.R(qVar, R.string.player_customize_theme), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i15).getSubtitleMedium700(), qVar, 0, 0, 131070);
            qVar = qVar;
            ib.i.A(elevenLabsTheme, qVar, i15, qVar3, qVar);
            qVar.p(true);
            int i16 = 2;
            i3.t G2 = r1.d.G(l1.n.t(p2.e(qVar3, 1.0f), l1.n.x(qVar), 14), elevenLabsTheme.getSpacings(qVar, i15).m2357getX5D9Ej5fM(), t2.u.P, 2);
            boolean z12 = false;
            k2 a11 = i2.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i15).m2355getX3D9Ej5fM()), i3.d.f13004y0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(G2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            qVar.X(-934155606);
            tn.e eVar5 = (tn.e) PlayerTheme.getEntries();
            eVar5.getClass();
            g1.a1 a1Var = new g1.a1(eVar5, 9);
            while (a1Var.hasNext()) {
                PlayerTheme playerTheme3 = (PlayerTheme) a1Var.next();
                int i17 = WhenMappings.$EnumSwitchMapping$2[playerTheme3.ordinal()];
                if (i17 != 1) {
                    if (i17 != i16) {
                        if (i17 != 3) {
                            c5 = 4;
                            if (i17 == 4) {
                                qVar.X(-934145836);
                                R = kj.c.R(qVar, R.string.player_customize_theme_classic);
                                qVar.p(z12);
                            } else {
                                throw com.google.android.gms.internal.play_billing.b.h(-934156021, qVar, z12);
                            }
                        } else {
                            c5 = 4;
                            qVar.X(-934148938);
                            R = kj.c.R(qVar, R.string.player_customize_theme_highlight);
                            qVar.p(z12);
                        }
                    } else {
                        c5 = 4;
                        qVar.X(-934151951);
                        R = kj.c.R(qVar, R.string.player_customize_theme_fall);
                        qVar.p(z12);
                    }
                } else {
                    c5 = 4;
                    qVar.X(-934154768);
                    R = kj.c.R(qVar, R.string.player_customize_theme_sky);
                    qVar.p(z12);
                }
                r1.x a12 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
                int hashCode3 = Long.hashCode(qVar.T);
                c3.o l10 = qVar.l();
                i3.t c12 = i3.a.c(qVar3, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, a12, qVar);
                u2.r.J(h4.g.f11906e, l10, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode3), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c12, qVar);
                if ((i14 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = z12;
                }
                boolean d10 = qVar.d(playerTheme3.ordinal()) | z10;
                Object L = qVar.L();
                if (d10 || L == u2.l.f33918a) {
                    L = new s(lVar, playerTheme3, 0);
                    qVar.h0(L);
                }
                ho.a aVar = (ho.a) L;
                if (playerTheme == playerTheme3) {
                    z11 = true;
                } else {
                    z11 = z12;
                }
                String str = R;
                SelectableBoxKt.m1873SelectableBox3f6hBDE(aVar, z11, str, p2.o(qVar3, 100), p3.x.f26437l, null, c3.k.d(1566612961, true, new q(playerTheme3, 2), qVar), qVar, 1600512, 32);
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                r1.d.g(p2.f(qVar3, elevenLabsTheme2.getSpacings(qVar, i18).m2350getX1D9Ej5fM()), qVar);
                u2.q qVar4 = qVar;
                j7.d(str, null, defpackage.f.A(elevenLabsTheme2, qVar, i18), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar, i18).getBodyTiny500(), qVar4, 0, 0, 131066);
                qVar = qVar4;
                qVar.p(true);
                z12 = z12;
                qVar3 = qVar3;
                i16 = i16;
            }
            playerTheme2 = playerTheme;
            qVar.p(z12);
            qVar.p(true);
        } else {
            playerTheme2 = playerTheme;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(playerTheme2, lVar, i10, 1);
        }
    }

    public static final sn.z ThemeSelect$lambda$1$0$0$0(ho.l lVar, PlayerTheme playerTheme) {
        lVar.invoke(playerTheme);
        return sn.z.f31622a;
    }

    public static final sn.z ThemeSelect$lambda$1$0$1(PlayerTheme playerTheme, u2.m mVar, int i10) {
        boolean z6;
        long m2005getSecondary0d7_KjU;
        int i11;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i12 = ElevenLabsTheme.$stable;
            if (elevenLabsTheme.getColor(qVar, i12).isDark()) {
                qVar.X(-2018459182);
                qVar.p(false);
                m2005getSecondary0d7_KjU = p3.h0.c(452984831);
            } else {
                qVar.X(-2018457398);
                m2005getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar, i12).getBackground().m2005getSecondary0d7_KjU();
                qVar.p(false);
            }
            i3.t E = r1.d.E(l1.n.h(d10, m2005getSecondary0d7_KjU, p3.h0.f26395b), elevenLabsTheme.getSpacings(qVar, i12).m2355getX3D9Ej5fM());
            f4.f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            int i13 = WhenMappings.$EnumSwitchMapping$2[playerTheme.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            i11 = R.drawable.book_cover_classic;
                        } else {
                            c6.p();
                            return null;
                        }
                    } else {
                        i11 = R.drawable.book_cover_highlight;
                    }
                } else {
                    i11 = R.drawable.book_cover_fall;
                }
            } else {
                i11 = R.drawable.book_cover_sky;
            }
            l1.n.c(kd.a.M(i11, qVar, 0), null, m3.h.c(BoxShadowKt.boxShadow$default(p2.d(qVar2, 1.0f), new BoxShadow[]{new BoxShadow(p3.h0.c(855638016), (float) 5.75d, (float) (-1.92d), (Float.floatToRawIntBits((float) 0.19d) << 32) | (Float.floatToRawIntBits((float) 2.3d) & 4294967295L), false, 16, null)}, null, false, 6, null), elevenLabsTheme.getShapes(qVar, i12).getMd()), null, null, t2.u.P, null, qVar, u3.c.$stable | 48, 120);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ThemeSelect$lambda$2(PlayerTheme playerTheme, ho.l lVar, int i10, u2.m mVar, int i11) {
        ThemeSelect(playerTheme, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final String getFontName(PlayerFontFamily playerFontFamily, u2.m mVar, int i10) {
        int i11 = WhenMappings.$EnumSwitchMapping$3[playerFontFamily.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    u2.q qVar = (u2.q) mVar;
                    qVar.X(-1730340165);
                    String R = kj.c.R(qVar, R.string.player_customize_family_name_open_dyslexic);
                    qVar.p(false);
                    return R;
                }
                throw com.google.android.gms.internal.play_billing.b.h(-1730347913, (u2.q) mVar, false);
            }
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(-1730343681);
            String R2 = kj.c.R(qVar2, R.string.player_customize_family_name_libre_baskerville);
            qVar2.p(false);
            return R2;
        }
        u2.q qVar3 = (u2.q) mVar;
        qVar3.X(-1730346573);
        String R3 = kj.c.R(qVar3, R.string.player_customize_family_name_inter);
        qVar3.p(false);
        return R3;
    }

    private static final w4.u getRealFontFamily(PlayerFontFamily playerFontFamily) {
        int i10 = WhenMappings.$EnumSwitchMapping$3[playerFontFamily.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return ElevenLabsTypographyKt.getOpenDyslexic();
                }
                c6.p();
                return null;
            }
            return ElevenLabsTypographyKt.getLibre();
        }
        return ElevenLabsTypographyKt.getInter();
    }
}

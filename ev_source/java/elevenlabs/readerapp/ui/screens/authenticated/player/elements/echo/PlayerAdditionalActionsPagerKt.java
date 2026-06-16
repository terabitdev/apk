package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import a2.t0;
import c3.f;
import c3.j;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.f2;
import h4.g;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.readerapp.ui.screens.authenticated.r0;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.VoiceAvatarKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.components.ButtonIconContainerSize;
import io.elevenlabs.ui.echo.components.ButtonIconKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.p2;
import r1.u0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import w1.h;
import w1.h0;
import w1.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u008b\u0001\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aI\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aI\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u000f\u0010\u001b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerAdditionalActionsUsedVoiceState;", "usedVoiceState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerAdditionalActionsSoundscapesState;", "soundscapesState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsSleepTimerState;", "sleepTimerState", "", "showQueue", "showTeaser", "Lkotlin/Function0;", "Lsn/z;", "onClickVoice", "onClickChapters", "onClickSoundscapes", "onClickSearch", "onClickQueue", "onClickSleepTimer", "PlayerAdditionalActionsPager", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerAdditionalActionsUsedVoiceState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerAdditionalActionsSoundscapesState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsSleepTimerState;ZZLho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lu2/m;II)V", "PageZero", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerAdditionalActionsUsedVoiceState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerAdditionalActionsSoundscapesState;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "PageOne", "(ZLio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsSleepTimerState;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "Preview_PlayerAdditionalActionsPager", "(Lu2/m;I)V", "Preview_PlayerAdditionalActionsPager_PageZero", "Preview_PlayerAdditionalActionsPager_PageOne", "Preview_PlayerAdditionalActionsPager_PageOne_Active", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerAdditionalActionsPagerKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlayerAdditionalActionsSoundscapesState.values().length];
            try {
                iArr[PlayerAdditionalActionsSoundscapesState.Enabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerAdditionalActionsSoundscapesState.Disabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlayerButtonsSleepTimerState.values().length];
            try {
                iArr2[PlayerButtonsSleepTimerState.NotSet.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlayerButtonsSleepTimerState.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final void PageOne(boolean z6, PlayerButtonsSleepTimerState playerButtonsSleepTimerState, ho.a aVar, ho.a aVar2, ho.a aVar3, m mVar, int i10) {
        int i11;
        ho.a aVar4;
        ho.a aVar5;
        boolean z10;
        q qVar;
        long quaternary;
        long quaternary2;
        String R;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        q qVar2 = (q) mVar;
        qVar2.Z(-552930604);
        if ((i10 & 6) == 0) {
            if (qVar2.g(z6)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.d(playerButtonsSleepTimerState.ordinal())) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            aVar4 = aVar2;
            if (qVar2.h(aVar4)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        } else {
            aVar4 = aVar2;
        }
        if ((i10 & 24576) == 0) {
            aVar5 = aVar3;
            if (qVar2.h(aVar5)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        } else {
            aVar5 = aVar3;
        }
        if ((i11 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar2.O(i11 & 1, z10)) {
            int i17 = R.drawable.ic_moon_star;
            int i18 = WhenMappings.$EnumSwitchMapping$1[playerButtonsSleepTimerState.ordinal()];
            if (i18 != 1) {
                if (i18 == 2) {
                    qVar2.X(1209648507);
                    quaternary = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getIcon().getPrimary(qVar2, EchoThemeColors.Icon.$stable);
                    qVar2.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(1209642875, qVar2, false);
                }
            } else {
                qVar2.X(1209645822);
                quaternary = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getIcon().getQuaternary(qVar2, EchoThemeColors.Icon.$stable);
                qVar2.p(false);
            }
            String R2 = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.player_sleep_timer_accessibility_set_timer);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i19 = EchoTheme.$stable;
            float x32 = echoTheme.getSpacings(qVar2, i19).getX3();
            ButtonIconContainerSize.WrapIcon wrapIcon = new ButtonIconContainerSize.WrapIcon(new d2(x32, x32, x32, x32));
            int i20 = ButtonIconContainerSize.WrapIcon.$stable << 18;
            ButtonIconKt.m1961ButtonIconFhKo8ac(i17, R2, aVar, null, u.P, quaternary, wrapIcon, null, false, qVar2, (i11 & 896) | i20, 408);
            int i21 = R.drawable.ic_magnifying_glass;
            EchoThemeColors.Icon icon = echoTheme.getColors(qVar2, i19).getIcon();
            int i22 = EchoThemeColors.Icon.$stable;
            long quaternary3 = icon.getQuaternary(qVar2, i22);
            String R3 = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.search_accessibility_search);
            float x33 = echoTheme.getSpacings(qVar2, i19).getX3();
            ButtonIconKt.m1961ButtonIconFhKo8ac(i21, R3, aVar4, null, u.P, quaternary3, new ButtonIconContainerSize.WrapIcon(new d2(x33, x33, x33, x33)), null, false, qVar2, ((i11 >> 3) & 896) | i20, 408);
            int i23 = R.drawable.ic_text_indent_left;
            if (z6) {
                qVar2.X(-1154750375);
                quaternary2 = echoTheme.getColors(qVar2, i19).getIcon().getPrimary(qVar2, i22);
                qVar2.p(false);
            } else {
                qVar2.X(-1154691754);
                quaternary2 = echoTheme.getColors(qVar2, i19).getIcon().getQuaternary(qVar2, i22);
                qVar2.p(false);
            }
            long j4 = quaternary2;
            if (z6) {
                qVar2.X(-1154589082);
                R = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.player_accessibility_hide_queue);
                qVar2.p(false);
            } else {
                qVar2.X(-1154479962);
                R = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.player_accessibility_show_queue);
                qVar2.p(false);
            }
            float x34 = echoTheme.getSpacings(qVar2, i19).getX3();
            qVar = qVar2;
            ButtonIconKt.m1961ButtonIconFhKo8ac(i23, R, aVar5, null, u.P, j4, new ButtonIconContainerSize.WrapIcon(new d2(x34, x34, x34, x34)), null, false, qVar, ((i11 >> 6) & 896) | i20, 408);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r0(z6, playerButtonsSleepTimerState, aVar, aVar2, aVar3, i10);
        }
    }

    public static final z PageOne$lambda$0(boolean z6, PlayerButtonsSleepTimerState playerButtonsSleepTimerState, ho.a aVar, ho.a aVar2, ho.a aVar3, int i10, m mVar, int i11) {
        PageOne(z6, playerButtonsSleepTimerState, aVar, aVar2, aVar3, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void PageZero(PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState, PlayerAdditionalActionsSoundscapesState playerAdditionalActionsSoundscapesState, ho.a aVar, ho.a aVar2, ho.a aVar3, m mVar, int i10) {
        int i11;
        ho.a aVar4;
        ho.a aVar5;
        boolean z6;
        q qVar;
        long primary;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        q qVar2 = (q) mVar;
        qVar2.Z(1731649050);
        if ((i10 & 6) == 0) {
            if (qVar2.f(playerAdditionalActionsUsedVoiceState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.d(playerAdditionalActionsSoundscapesState.ordinal())) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            aVar4 = aVar2;
            if (qVar2.h(aVar4)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        } else {
            aVar4 = aVar2;
        }
        if ((i10 & 24576) == 0) {
            aVar5 = aVar3;
            if (qVar2.h(aVar5)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        } else {
            aVar5 = aVar3;
        }
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            String R = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.player_accessibility_select_voice);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i17 = EchoTheme.$stable;
            float x32 = echoTheme.getSpacings(qVar2, i17).getX3();
            ButtonIconContainerSize.WrapIcon wrapIcon = new ButtonIconContainerSize.WrapIcon(new d2(x32, x32, x32, x32));
            j d10 = k.d(-1394099774, true, new t0(playerAdditionalActionsUsedVoiceState, 8), qVar2);
            int i18 = ButtonIconContainerSize.WrapIcon.$stable << 18;
            ButtonIconKt.m1962ButtonIconbFRE0qE(d10, R, aVar, null, null, u.P, wrapIcon, null, 0L, false, qVar2, (i11 & 896) | 6 | i18, 952);
            int i19 = R.drawable.ic_bullet_list;
            EchoThemeColors.Icon icon = echoTheme.getColors(qVar2, i17).getIcon();
            int i20 = EchoThemeColors.Icon.$stable;
            long quaternary = icon.getQuaternary(qVar2, i20);
            String R2 = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.player_chapters_title);
            float x33 = echoTheme.getSpacings(qVar2, i17).getX3();
            ButtonIconKt.m1961ButtonIconFhKo8ac(i19, R2, aVar4, null, u.P, quaternary, new ButtonIconContainerSize.WrapIcon(new d2(x33, x33, x33, x33)), null, false, qVar2, ((i11 >> 3) & 896) | i18, 408);
            int i21 = R.drawable.ic_sound_fx;
            int i22 = WhenMappings.$EnumSwitchMapping$0[playerAdditionalActionsSoundscapesState.ordinal()];
            if (i22 != 1) {
                if (i22 == 2) {
                    qVar2.X(1962443204);
                    primary = echoTheme.getColors(qVar2, i17).getIcon().getQuaternary(qVar2, i20);
                    qVar2.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(1962436859, qVar2, false);
                }
            } else {
                qVar2.X(1962440193);
                primary = echoTheme.getColors(qVar2, i17).getIcon().getPrimary(qVar2, i20);
                qVar2.p(false);
            }
            long j4 = primary;
            String R3 = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.player_soundscapes_accessibility_add_button);
            float x34 = echoTheme.getSpacings(qVar2, i17).getX3();
            qVar = qVar2;
            ButtonIconKt.m1961ButtonIconFhKo8ac(i21, R3, aVar5, null, u.P, j4, new ButtonIconContainerSize.WrapIcon(new d2(x34, x34, x34, x34)), null, false, qVar, ((i11 >> 6) & 896) | i18, 408);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new f(playerAdditionalActionsUsedVoiceState, playerAdditionalActionsSoundscapesState, aVar, aVar2, aVar3, i10, 5);
        }
    }

    public static final z PageZero$lambda$0(PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState, m mVar, int i10) {
        boolean z6;
        String str;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String voiceId = playerAdditionalActionsUsedVoiceState.getVoiceId();
            if (voiceId == null) {
                voiceId = "";
            }
            String str2 = voiceId;
            String voiceImage = playerAdditionalActionsUsedVoiceState.getVoiceImage();
            if (voiceImage != null && voiceImage.length() > 0) {
                str = voiceImage;
            } else {
                str = null;
            }
            VoiceAvatarKt.VoiceAvatar(str2, str, p2.o(r1.d.E(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX3()), 24), false, false, qVar, 0, 24);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PageZero$lambda$1(PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState, PlayerAdditionalActionsSoundscapesState playerAdditionalActionsSoundscapesState, ho.a aVar, ho.a aVar2, ho.a aVar3, int i10, m mVar, int i11) {
        PageZero(playerAdditionalActionsUsedVoiceState, playerAdditionalActionsSoundscapesState, aVar, aVar2, aVar3, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void PlayerAdditionalActionsPager(final PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState, final PlayerAdditionalActionsSoundscapesState playerAdditionalActionsSoundscapesState, final PlayerButtonsSleepTimerState playerButtonsSleepTimerState, final boolean z6, final boolean z10, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, final ho.a aVar4, final ho.a aVar5, final ho.a aVar6, m mVar, final int i10, final int i11) {
        int i12;
        boolean z11;
        ho.a aVar7;
        ho.a aVar8;
        ho.a aVar9;
        ho.a aVar10;
        ho.a aVar11;
        int i13;
        boolean z12;
        q qVar;
        boolean z13;
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
        playerAdditionalActionsUsedVoiceState.getClass();
        playerAdditionalActionsSoundscapesState.getClass();
        playerButtonsSleepTimerState.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(1534549526);
        int i24 = 4;
        if ((i10 & 6) == 0) {
            if (qVar2.f(playerAdditionalActionsUsedVoiceState)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.d(playerAdditionalActionsSoundscapesState.ordinal())) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.d(playerButtonsSleepTimerState.ordinal())) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            z11 = z6;
            if (qVar2.g(z11)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        } else {
            z11 = z6;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.g(z10)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i19;
        }
        if ((196608 & i10) == 0) {
            aVar7 = aVar;
            if (qVar2.h(aVar7)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        } else {
            aVar7 = aVar;
        }
        if ((1572864 & i10) == 0) {
            aVar8 = aVar2;
            if (qVar2.h(aVar8)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        } else {
            aVar8 = aVar2;
        }
        if ((12582912 & i10) == 0) {
            aVar9 = aVar3;
            if (qVar2.h(aVar9)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        } else {
            aVar9 = aVar3;
        }
        if ((100663296 & i10) == 0) {
            aVar10 = aVar4;
            if (qVar2.h(aVar10)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i12 |= i15;
        } else {
            aVar10 = aVar4;
        }
        if ((805306368 & i10) == 0) {
            aVar11 = aVar5;
            if (qVar2.h(aVar11)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i12 |= i14;
        } else {
            aVar11 = aVar5;
        }
        if ((i11 & 6) == 0) {
            if (!qVar2.h(aVar6)) {
                i24 = 2;
            }
            i13 = i11 | i24;
        } else {
            i13 = i11;
        }
        if ((306783379 & i12) == 306783378 && (i13 & 3) == 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (qVar2.O(i12 & 1, z12)) {
            Object L = qVar2.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new a(15);
                qVar2.h0(L);
            }
            int i25 = i12;
            w1.c b10 = h0.b(0, (ho.a) L, qVar2, 390, 2);
            Boolean valueOf = Boolean.valueOf(z10);
            if ((i25 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean f10 = z13 | qVar2.f(b10);
            Object L2 = qVar2.L();
            if (f10 || L2 == eVar) {
                L2 = new PlayerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1(z10, b10, null);
                qVar2.h0(L2);
            }
            r.f((p) L2, valueOf, qVar2);
            final boolean z14 = z11;
            final ho.a aVar12 = aVar7;
            final ho.a aVar13 = aVar8;
            final ho.a aVar14 = aVar9;
            final ho.a aVar15 = aVar10;
            final ho.a aVar16 = aVar11;
            qVar = qVar2;
            gg.b.d(b10, p2.e(i3.q.f13017a, 1.0f), null, h.f35997a, 0, u.P, null, null, false, null, null, null, k.d(-1563582889, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.b
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    z PlayerAdditionalActionsPager$lambda$2;
                    int intValue = ((Integer) obj4).intValue();
                    PlayerAdditionalActionsPager$lambda$2 = PlayerAdditionalActionsPagerKt.PlayerAdditionalActionsPager$lambda$2(PlayerAdditionalActionsUsedVoiceState.this, playerAdditionalActionsSoundscapesState, aVar12, aVar13, aVar14, z14, playerButtonsSleepTimerState, aVar6, aVar15, aVar16, (w) obj, ((Integer) obj2).intValue(), (m) obj3, intValue);
                    return PlayerAdditionalActionsPager$lambda$2;
                }
            }, qVar2), qVar, 3120, 24576, 16372);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.c
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z PlayerAdditionalActionsPager$lambda$3;
                    int intValue = ((Integer) obj2).intValue();
                    PlayerAdditionalActionsPager$lambda$3 = PlayerAdditionalActionsPagerKt.PlayerAdditionalActionsPager$lambda$3(PlayerAdditionalActionsUsedVoiceState.this, playerAdditionalActionsSoundscapesState, playerButtonsSleepTimerState, z6, z10, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, i10, i11, (m) obj, intValue);
                    return PlayerAdditionalActionsPager$lambda$3;
                }
            };
        }
    }

    public static final int PlayerAdditionalActionsPager$lambda$0$0() {
        return 2;
    }

    public static final z PlayerAdditionalActionsPager$lambda$2(PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState, PlayerAdditionalActionsSoundscapesState playerAdditionalActionsSoundscapesState, ho.a aVar, ho.a aVar2, ho.a aVar3, boolean z6, PlayerButtonsSleepTimerState playerButtonsSleepTimerState, ho.a aVar4, ho.a aVar5, ho.a aVar6, w wVar, int i10, m mVar, int i11) {
        wVar.getClass();
        t e10 = p2.e(i3.q.f13017a, 1.0f);
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i12 = EchoTheme.$stable;
        t I = r1.d.I(e10, echoTheme.getSpacings(mVar, i12).getX5(), u.P, echoTheme.getSpacings(mVar, i12).getX5(), echoTheme.getSpacings(mVar, i12).getX4(), 2);
        u0 u0Var = r1.j.f29228a;
        k2 a10 = i2.a(r1.j.h(echoTheme.getSpacings(mVar, i12).getX14(), i3.d.C0), i3.d.f13005z0, mVar, 48);
        q qVar = (q) mVar;
        int hashCode = Long.hashCode(qVar.T);
        o l4 = qVar.l();
        t c5 = i3.a.c(I, mVar);
        h4.h.f11920i.getClass();
        h4.f fVar = g.f11903b;
        f2 f2Var = qVar.f33969a;
        qVar.b0();
        if (qVar.S) {
            qVar.k(fVar);
        } else {
            qVar.k0();
        }
        r.J(g.f11907f, a10, mVar);
        r.J(g.f11906e, l4, mVar);
        r.y(mVar, Integer.valueOf(hashCode), g.f11908g);
        r.F(g.f11909h, mVar);
        r.J(g.f11905d, c5, mVar);
        if (i10 != 0) {
            if (i10 != 1) {
                qVar.X(-1917565817);
                qVar.p(false);
            } else {
                qVar.X(907965142);
                PageOne(z6, playerButtonsSleepTimerState, aVar4, aVar5, aVar6, mVar, 0);
                qVar.p(false);
            }
        } else {
            qVar.X(907954761);
            PageZero(playerAdditionalActionsUsedVoiceState, playerAdditionalActionsSoundscapesState, aVar, aVar2, aVar3, mVar, 0);
            qVar.p(false);
        }
        qVar.p(true);
        return z.f31622a;
    }

    public static final z PlayerAdditionalActionsPager$lambda$3(PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState, PlayerAdditionalActionsSoundscapesState playerAdditionalActionsSoundscapesState, PlayerButtonsSleepTimerState playerButtonsSleepTimerState, boolean z6, boolean z10, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, int i10, int i11, m mVar, int i12) {
        PlayerAdditionalActionsPager(playerAdditionalActionsUsedVoiceState, playerAdditionalActionsSoundscapesState, playerButtonsSleepTimerState, z6, z10, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, mVar, r.M(i10 | 1), r.M(i11));
        return z.f31622a;
    }

    public static final void Preview_PlayerAdditionalActionsPager(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-212251425);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState = new PlayerAdditionalActionsUsedVoiceState("voice123", null);
            PlayerAdditionalActionsSoundscapesState playerAdditionalActionsSoundscapesState = PlayerAdditionalActionsSoundscapesState.Disabled;
            PlayerButtonsSleepTimerState playerButtonsSleepTimerState = PlayerButtonsSleepTimerState.NotSet;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new a(19);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(20);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(21);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(22);
                qVar.h0(L4);
            }
            ho.a aVar4 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new a(23);
                qVar.h0(L5);
            }
            ho.a aVar5 = (ho.a) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new a(24);
                qVar.h0(L6);
            }
            PlayerAdditionalActionsPager(playerAdditionalActionsUsedVoiceState, playerAdditionalActionsSoundscapesState, playerButtonsSleepTimerState, false, false, aVar, aVar2, aVar3, aVar4, aVar5, (ho.a) L6, qVar, 920350128, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 27);
        }
    }

    public static final z Preview_PlayerAdditionalActionsPager$lambda$1(int i10, m mVar, int i11) {
        Preview_PlayerAdditionalActionsPager(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerAdditionalActionsPager_PageOne(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1496824089);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t I = r1.d.I(p2.e(n.h(i3.q.f13017a, echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), 1.0f), echoTheme.getSpacings(qVar, i11).getX5(), u.P, echoTheme.getSpacings(qVar, i11).getX5(), echoTheme.getSpacings(qVar, i11).getX4(), 2);
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(r1.j.h(echoTheme.getSpacings(qVar, i11).getX14(), i3.d.C0), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerButtonsSleepTimerState playerButtonsSleepTimerState = PlayerButtonsSleepTimerState.NotSet;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new a(16);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(17);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(18);
                qVar.h0(L3);
            }
            PageOne(false, playerButtonsSleepTimerState, aVar, aVar2, (ho.a) L3, qVar, 28086);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 26);
        }
    }

    public static final z Preview_PlayerAdditionalActionsPager_PageOne$lambda$1(int i10, m mVar, int i11) {
        Preview_PlayerAdditionalActionsPager_PageOne(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerAdditionalActionsPager_PageOne_Active(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-949532232);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t I = r1.d.I(p2.e(n.h(i3.q.f13017a, echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), 1.0f), echoTheme.getSpacings(qVar, i11).getX5(), u.P, echoTheme.getSpacings(qVar, i11).getX5(), echoTheme.getSpacings(qVar, i11).getX4(), 2);
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(r1.j.h(echoTheme.getSpacings(qVar, i11).getX14(), i3.d.C0), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerButtonsSleepTimerState playerButtonsSleepTimerState = PlayerButtonsSleepTimerState.Active;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new a(25);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(26);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(27);
                qVar.h0(L3);
            }
            PageOne(true, playerButtonsSleepTimerState, aVar, aVar2, (ho.a) L3, qVar, 28086);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 28);
        }
    }

    public static final z Preview_PlayerAdditionalActionsPager_PageOne_Active$lambda$1(int i10, m mVar, int i11) {
        Preview_PlayerAdditionalActionsPager_PageOne_Active(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerAdditionalActionsPager_PageZero(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1282656655);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t I = r1.d.I(p2.e(n.h(i3.q.f13017a, echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), 1.0f), echoTheme.getSpacings(qVar, i11).getX5(), u.P, echoTheme.getSpacings(qVar, i11).getX5(), echoTheme.getSpacings(qVar, i11).getX4(), 2);
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(r1.j.h(echoTheme.getSpacings(qVar, i11).getX14(), i3.d.C0), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState = new PlayerAdditionalActionsUsedVoiceState("voice123", null);
            PlayerAdditionalActionsSoundscapesState playerAdditionalActionsSoundscapesState = PlayerAdditionalActionsSoundscapesState.Disabled;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new a(28);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(29);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new d(0);
                qVar.h0(L3);
            }
            PageZero(playerAdditionalActionsUsedVoiceState, playerAdditionalActionsSoundscapesState, aVar, aVar2, (ho.a) L3, qVar, 28080);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 29);
        }
    }

    public static final z Preview_PlayerAdditionalActionsPager_PageZero$lambda$1(int i10, m mVar, int i11) {
        Preview_PlayerAdditionalActionsPager_PageZero(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

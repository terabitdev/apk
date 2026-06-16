package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import a2.t0;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.readerapp.ui.formatter.NumberFormatterKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.AutoScalingTextKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.echo.components.ButtonIconContainerSize;
import io.elevenlabs.ui.echo.components.ButtonIconKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p;
import r1.p2;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001au\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u000f\u0010\u0019\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/SkipDuration;", "", "rewindIcon", "(Lio/elevenlabs/domain/model/SkipDuration;)I", "fastForwardIcon", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsPlayButtonState;", "playButtonState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsSpeedState;", "speedState", "forwardSeekDuration", "backwardSeekDuration", "Lkotlin/Function0;", "Lsn/z;", "onCreateBookmark", "onClickSeekBack", "onClickSeekForward", "onClickPlayPause", "onClickSpeed", "PlayerButtons", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsPlayButtonState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsSpeedState;Lio/elevenlabs/domain/model/SkipDuration;Lio/elevenlabs/domain/model/SkipDuration;Lho/a;Lho/a;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "Preview_PlayerButtons_idle", "(Lu2/m;I)V", "Preview_PlayerButtons_playing", "Preview_PlayerButtons_restart", "Preview_PlayerButtons_loading", "Preview_PlayerButtons_sleepTimer", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerButtonsKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SkipDuration.values().length];
            try {
                iArr[SkipDuration.SECONDS_15.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkipDuration.SECONDS_30.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlayerButtonsPlayButtonState.values().length];
            try {
                iArr2[PlayerButtonsPlayButtonState.Playing.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlayerButtonsPlayButtonState.Paused.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PlayerButtonsPlayButtonState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PlayerButtonsPlayButtonState.RequiresRestart.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void PlayerButtons(PlayerButtonsPlayButtonState playerButtonsPlayButtonState, PlayerButtonsSpeedState playerButtonsSpeedState, SkipDuration skipDuration, SkipDuration skipDuration2, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, m mVar, int i10) {
        int i11;
        ho.a aVar6;
        ho.a aVar7;
        ho.a aVar8;
        ho.a aVar9;
        boolean z6;
        PlayerButtonsPlayButtonState playerButtonsPlayButtonState2;
        q qVar;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        playerButtonsPlayButtonState.getClass();
        playerButtonsSpeedState.getClass();
        skipDuration.getClass();
        skipDuration2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1539567461);
        if ((i10 & 6) == 0) {
            if (qVar2.d(playerButtonsPlayButtonState.ordinal())) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i11 = i22 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(playerButtonsSpeedState)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i11 |= i21;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.d(skipDuration.ordinal())) {
                i20 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i20 = 128;
            }
            i11 |= i20;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.d(skipDuration2.ordinal())) {
                i19 = 2048;
            } else {
                i19 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i19;
        }
        if ((i10 & 24576) == 0) {
            aVar6 = aVar;
            if (qVar2.h(aVar6)) {
                i18 = 16384;
            } else {
                i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i18;
        } else {
            aVar6 = aVar;
        }
        if ((196608 & i10) == 0) {
            aVar7 = aVar2;
            if (qVar2.h(aVar7)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i11 |= i17;
        } else {
            aVar7 = aVar2;
        }
        if ((1572864 & i10) == 0) {
            aVar8 = aVar3;
            if (qVar2.h(aVar8)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i11 |= i16;
        } else {
            aVar8 = aVar3;
        }
        if ((12582912 & i10) == 0) {
            aVar9 = aVar4;
            if (qVar2.h(aVar9)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i11 |= i15;
        } else {
            aVar9 = aVar4;
        }
        if ((100663296 & i10) == 0) {
            if (qVar2.h(aVar5)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i11 |= i14;
        }
        if ((38347923 & i11) != 38347922) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i23 = EchoTheme.$stable;
            t G = r1.d.G(r1.d.I(e10, u.P, echoTheme.getSpacings(qVar2, i23).getX1(), u.P, echoTheme.getSpacings(qVar2, i23).getX5(), 5), echoTheme.getSpacings(qVar2, i23).getX6(), u.P, 2);
            k2 a10 = i2.a(j.f29234g, i3.d.f13005z0, qVar2, 54);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c5 = i3.a.c(G, qVar2);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar2.b0();
            int i24 = i11;
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(g.f11907f, a10, qVar2);
            r.J(g.f11906e, l4, qVar2);
            r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar2);
            r.J(g.f11905d, c5, qVar2);
            ButtonIconKt.m1961ButtonIconFhKo8ac(R.drawable.ic_bookmark, kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.bookmark_button_accessibility), aVar6, null, u.P, echoTheme.getColors(qVar2, i23).getIcon().getQuaternary(qVar2, EchoThemeColors.Icon.$stable), null, null, false, qVar2, (i24 >> 6) & 896, 472);
            qVar = qVar2;
            ButtonIconKt.m1961ButtonIconFhKo8ac(rewindIcon(skipDuration2), kj.c.Q(io.elevenlabs.readerapp.R.string.player_accessibility_seek_back_seconds, new Object[]{Integer.valueOf(skipDuration2.getSeconds())}, qVar), aVar7, null, u.P, 0L, null, null, false, qVar2, (i24 >> 9) & 896, 504);
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i25 = iArr[playerButtonsPlayButtonState.ordinal()];
            if (i25 != 1) {
                if (i25 != 2) {
                    if (i25 != 3 && i25 != 4) {
                        c6.p();
                        return;
                    }
                    i12 = R.drawable.restart;
                } else {
                    i12 = R.drawable.ic_play;
                }
            } else {
                i12 = R.drawable.ic_pause;
            }
            int i26 = i12;
            int i27 = iArr[playerButtonsPlayButtonState.ordinal()];
            if (i27 != 1) {
                if (i27 != 2) {
                    if (i27 != 3) {
                        if (i27 == 4) {
                            i13 = io.elevenlabs.readerapp.R.string.player_accessibility_restart;
                        } else {
                            c6.p();
                            return;
                        }
                    } else {
                        i13 = io.elevenlabs.readerapp.R.string.player_accessibility_play;
                    }
                } else {
                    i13 = io.elevenlabs.readerapp.R.string.player_accessibility_play;
                }
            } else {
                i13 = io.elevenlabs.readerapp.R.string.player_accessibility_pause;
            }
            String R = kj.c.R(qVar, i13);
            playerButtonsPlayButtonState2 = playerButtonsPlayButtonState;
            if (playerButtonsPlayButtonState2 == PlayerButtonsPlayButtonState.Loading) {
                z10 = true;
            } else {
                z10 = false;
            }
            float x32 = echoTheme.getSpacings(qVar, i23).getX3();
            ButtonIconKt.m1961ButtonIconFhKo8ac(i26, R, aVar9, null, 32, 0L, new ButtonIconContainerSize.WrapIcon(new d2(x32, x32, x32, x32)), null, z10, qVar, ((i24 >> 15) & 896) | 24576 | (ButtonIconContainerSize.WrapIcon.$stable << 18), 168);
            ButtonIconKt.m1961ButtonIconFhKo8ac(fastForwardIcon(skipDuration), kj.c.Q(io.elevenlabs.readerapp.R.string.player_accessibility_seek_forward_seconds, new Object[]{Integer.valueOf(skipDuration.getSeconds())}, qVar), aVar8, null, u.P, 0L, null, null, false, qVar, (i24 >> 12) & 896, 504);
            ButtonIconKt.m1962ButtonIconbFRE0qE(k.d(-1245257391, true, new t0(playerButtonsSpeedState, 9), qVar), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_accessibility_adjust_playback_speed), aVar5, null, null, u.P, new ButtonIconContainerSize.Fixed(44, null), null, 0L, false, qVar, ((i24 >> 18) & 896) | 6 | (ButtonIconContainerSize.Fixed.$stable << 18), 952);
            qVar.p(true);
        } else {
            playerButtonsPlayButtonState2 = playerButtonsPlayButtonState;
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.g(playerButtonsPlayButtonState2, playerButtonsSpeedState, skipDuration, skipDuration2, aVar, aVar2, aVar3, aVar4, aVar5, i10, 1);
        }
    }

    public static final z PlayerButtons$lambda$0$0(PlayerButtonsSpeedState playerButtonsSpeedState, m mVar, int i10) {
        boolean z6;
        long tertiary;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            f1 d10 = p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
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
            String B = defpackage.f.B(NumberFormatterKt.formatFloat(playerButtonsSpeedState.getSpeed(), qVar, 0), "x");
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            y0 smCompact500 = echoTheme.getTypography(qVar, i11).getSmCompact500(qVar, EchoThemeTypography.$stable);
            if (playerButtonsSpeedState.isActive()) {
                qVar.X(-1474646250);
                tertiary = echoTheme.getColors(qVar, i11).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable);
                qVar.p(false);
            } else {
                tertiary = i.g(-1474555947, i11, echoTheme, qVar, qVar).getTertiary(qVar, EchoThemeColors.Text.$stable);
                qVar.p(false);
            }
            AutoScalingTextKt.m1775AutoScalingTextpB_G1vE(B, null, smCompact500, tertiary, new e5.k(3), 0, false, 0L, 0, qVar, 0, 482);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PlayerButtons$lambda$1(PlayerButtonsPlayButtonState playerButtonsPlayButtonState, PlayerButtonsSpeedState playerButtonsSpeedState, SkipDuration skipDuration, SkipDuration skipDuration2, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, int i10, m mVar, int i11) {
        PlayerButtons(playerButtonsPlayButtonState, playerButtonsSpeedState, skipDuration, skipDuration2, aVar, aVar2, aVar3, aVar4, aVar5, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerButtons_idle(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-993291738);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerButtonsKt.INSTANCE.getLambda$845140096$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 2);
        }
    }

    public static final z Preview_PlayerButtons_idle$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerButtons_idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerButtons_loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(624653254);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerButtonsKt.INSTANCE.m1504getLambda$75538644$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 1);
        }
    }

    public static final z Preview_PlayerButtons_loading$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerButtons_loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerButtons_playing(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1405226296);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerButtonsKt.INSTANCE.getLambda$705034398$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 3);
        }
    }

    public static final z Preview_PlayerButtons_playing$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerButtons_playing(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerButtons_restart(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(116777561);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerButtonsKt.INSTANCE.m1503getLambda$583414337$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 0);
        }
    }

    public static final z Preview_PlayerButtons_restart$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerButtons_restart(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerButtons_sleepTimer(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-968107392);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerButtonsKt.INSTANCE.getLambda$271215962$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 4);
        }
    }

    public static final z Preview_PlayerButtons_sleepTimer$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerButtons_sleepTimer(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final int fastForwardIcon(SkipDuration skipDuration) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[skipDuration.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return R.drawable.fast_forward_30s;
            }
            c6.p();
            return 0;
        }
        return R.drawable.fast_forward_15s;
    }

    private static final int rewindIcon(SkipDuration skipDuration) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[skipDuration.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return R.drawable.rewind_30s;
            }
            c6.p();
            return 0;
        }
        return R.drawable.rewind_15s;
    }
}

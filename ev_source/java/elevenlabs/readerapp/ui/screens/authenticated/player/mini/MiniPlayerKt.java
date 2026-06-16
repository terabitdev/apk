package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import androidx.lifecycle.o;
import androidx.lifecycle.t;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import ho.l;
import ho.p;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ReadSmallRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerContract;
import io.elevenlabs.ui.components.ContainerShadowKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import oo.g;
import p3.h0;
import p3.s;
import p4.b0;
import p4.y;
import q2.j7;
import q2.y2;
import r1.i1;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.w;
import r1.x;
import rd.c1;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aK\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aa\u0010 \u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010!\u001a\u00020\bH\u0001¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\bH\u0001¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\bH\u0001¢\u0006\u0004\b$\u0010\"\u001a\u000f\u0010%\u001a\u00020\bH\u0001¢\u0006\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lh5/f;", "padding", "", "showDividerWhenHidden", "Lp3/x;", "surfaceColor", "Lkotlin/Function1;", "", "Lsn/z;", "navigateToPlayer", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerViewModel;", "viewModel", "MiniPlayer-GSIvlCE", "(FZJLho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerViewModel;Lu2/m;II)V", "MiniPlayer", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState;", "uiState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;", "onEvent", "MiniPlayerUI-i2-NWbI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState;Lho/l;FZJLu2/m;II)V", "MiniPlayerUI", "title", "author", "coverImageUrl", "Lio/elevenlabs/domain/model/ReadSource;", "source", "originalFileType", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState;", "playButtonState", "MiniPlayerContainer-ikp_DcA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/ReadSource;Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState;Lho/l;JLu2/m;I)V", "MiniPlayerContainer", "Preview_MiniPlayer_Visible_Playing", "(Lu2/m;I)V", "Preview_MiniPlayer_Visible_Paused", "Preview_MiniPlayer_Visible_LongText", "Preview_MiniPlayer_Visible_Loading", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MiniPlayerKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b9  */
    /* renamed from: MiniPlayer-GSIvlCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1520MiniPlayerGSIvlCE(float f10, boolean z6, long j4, l lVar, MiniPlayerViewModel miniPlayerViewModel, m mVar, int i10, int i11) {
        float f11;
        int i12;
        boolean z10;
        int i13;
        long j10;
        MiniPlayerViewModel miniPlayerViewModel2;
        boolean z11;
        float f12;
        boolean z12;
        r1 r10;
        float f13;
        boolean z13;
        q7.c cVar;
        boolean z14;
        Object L;
        boolean h10;
        Object L2;
        boolean h11;
        Object L3;
        int i14;
        int i15;
        int i16;
        int i17;
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1242076953);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                f11 = f10;
                if (qVar.c(f11)) {
                    i17 = 4;
                    i12 = i17 | i10;
                }
            } else {
                f11 = f10;
            }
            i17 = 2;
            i12 = i17 | i10;
        } else {
            f11 = f10;
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            z10 = z6;
            if (qVar.g(z10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) != 0) {
                j10 = j4;
                if ((i11 & 4) == 0 && qVar.e(j10)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
            } else {
                j10 = j4;
            }
            if ((i10 & 3072) == 0) {
                if (qVar.h(lVar)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
            }
            if ((i10 & 24576) != 0) {
                if ((i11 & 16) == 0) {
                    miniPlayerViewModel2 = miniPlayerViewModel;
                    if (qVar.h(miniPlayerViewModel2)) {
                        i14 = 16384;
                        i12 |= i14;
                    }
                } else {
                    miniPlayerViewModel2 = miniPlayerViewModel;
                }
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i12 |= i14;
            } else {
                miniPlayerViewModel2 = miniPlayerViewModel;
            }
            boolean z15 = true;
            if ((i12 & 9363) == 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar.O(i12 & 1, z11)) {
                qVar.T();
                if ((i10 & 1) != 0 && !qVar.y()) {
                    qVar.R();
                    if ((i11 & 1) != 0) {
                        i12 &= -15;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                } else {
                    if ((i11 & 1) != 0) {
                        f11 = EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX3();
                        i12 &= -15;
                    }
                    if (i18 != 0) {
                        z10 = true;
                    }
                    if ((i11 & 4) != 0) {
                        j10 = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getFill().getInput(qVar, EchoThemeColors.Fill.$stable);
                        i12 &= -897;
                    }
                    int i19 = i12;
                    long j11 = j10;
                    if ((i11 & 16) != 0) {
                        androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                        if (a10 != null) {
                            pl.f o6 = tb.a.o(a10, qVar);
                            if (a10 instanceof o) {
                                cVar = ((o) a10).getDefaultViewModelCreationExtras();
                            } else {
                                cVar = q7.a.f28123b;
                            }
                            miniPlayerViewModel2 = (MiniPlayerViewModel) gg.b.j0(e0.f20562a.b(MiniPlayerViewModel.class), a10, null, o6, cVar, qVar);
                            i12 = i19 & (-57345);
                            j10 = j11;
                        } else {
                            c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                    } else {
                        f13 = f11;
                        j10 = j11;
                        z13 = z10;
                        i12 = i19;
                        qVar.q();
                        z0 l4 = c1.l(miniPlayerViewModel2.getUiStateFlow(), MiniPlayerContract.UiState.Hidden.INSTANCE, qVar, 48);
                        boolean h12 = qVar.h(miniPlayerViewModel2);
                        if ((i12 & 7168) != 2048) {
                            z15 = false;
                        }
                        z14 = h12 | z15;
                        L = qVar.L();
                        u2.e eVar = u2.l.f33918a;
                        if (!z14 || L == eVar) {
                            L = new MiniPlayerKt$MiniPlayer$1$1(miniPlayerViewModel2, lVar, null);
                            qVar.h0(L);
                        }
                        r.f((p) L, z.f31622a, qVar);
                        h10 = qVar.h(miniPlayerViewModel2);
                        L2 = qVar.L();
                        if (!h10 || L2 == eVar) {
                            L2 = new e(miniPlayerViewModel2, 3);
                            qVar.h0(L2);
                        }
                        ComposeExtensionsKt.OnLifecycleEvent((l) L2, qVar, 0);
                        MiniPlayerContract.UiState uiState = (MiniPlayerContract.UiState) l4.getValue();
                        h11 = qVar.h(miniPlayerViewModel2);
                        L3 = qVar.L();
                        if (!h11 || L3 == eVar) {
                            L3 = new MiniPlayerKt$MiniPlayer$3$1(miniPlayerViewModel2);
                            qVar.h0(L3);
                        }
                        long j12 = j10;
                        m1522MiniPlayerUIi2NWbI(uiState, (l) ((g) L3), f13, z13, j12, qVar, (i12 << 6) & 65408, 0);
                        j10 = j12;
                        qVar = qVar;
                        f12 = f13;
                        z12 = z13;
                    }
                }
                f13 = f11;
                z13 = z10;
                qVar.q();
                z0 l42 = c1.l(miniPlayerViewModel2.getUiStateFlow(), MiniPlayerContract.UiState.Hidden.INSTANCE, qVar, 48);
                boolean h122 = qVar.h(miniPlayerViewModel2);
                if ((i12 & 7168) != 2048) {
                }
                z14 = h122 | z15;
                L = qVar.L();
                u2.e eVar2 = u2.l.f33918a;
                if (!z14) {
                }
                L = new MiniPlayerKt$MiniPlayer$1$1(miniPlayerViewModel2, lVar, null);
                qVar.h0(L);
                r.f((p) L, z.f31622a, qVar);
                h10 = qVar.h(miniPlayerViewModel2);
                L2 = qVar.L();
                if (!h10) {
                }
                L2 = new e(miniPlayerViewModel2, 3);
                qVar.h0(L2);
                ComposeExtensionsKt.OnLifecycleEvent((l) L2, qVar, 0);
                MiniPlayerContract.UiState uiState2 = (MiniPlayerContract.UiState) l42.getValue();
                h11 = qVar.h(miniPlayerViewModel2);
                L3 = qVar.L();
                if (!h11) {
                }
                L3 = new MiniPlayerKt$MiniPlayer$3$1(miniPlayerViewModel2);
                qVar.h0(L3);
                long j122 = j10;
                m1522MiniPlayerUIi2NWbI(uiState2, (l) ((g) L3), f13, z13, j122, qVar, (i12 << 6) & 65408, 0);
                j10 = j122;
                qVar = qVar;
                f12 = f13;
                z12 = z13;
            } else {
                qVar.R();
                f12 = f11;
                z12 = z10;
            }
            MiniPlayerViewModel miniPlayerViewModel3 = miniPlayerViewModel2;
            long j13 = j10;
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new d(f12, z12, j13, lVar, miniPlayerViewModel3, i10, i11);
                return;
            }
            return;
        }
        z10 = z6;
        if ((i10 & 384) != 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) != 0) {
        }
        boolean z152 = true;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar.O(i12 & 1, z11)) {
        }
        MiniPlayerViewModel miniPlayerViewModel32 = miniPlayerViewModel2;
        long j132 = j10;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    /* renamed from: MiniPlayerContainer-ikp_DcA */
    private static final void m1521MiniPlayerContainerikp_DcA(final String str, final String str2, final String str3, final ReadSource readSource, final String str4, final MiniPlayerContract.PlayButtonState playButtonState, final l lVar, long j4, m mVar, final int i10) {
        int i11;
        final l lVar2;
        long j10;
        h4.f fVar;
        int i12;
        int i13;
        final l lVar3;
        int i14;
        u2.e eVar;
        q qVar;
        q qVar2 = (q) mVar;
        qVar2.Z(661240998);
        if ((i10 & 6) == 0) {
            i11 = (qVar2.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= qVar2.f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= qVar2.f(str3) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= qVar2.d(readSource == null ? -1 : readSource.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i10 & 24576) == 0) {
            i11 |= qVar2.f(str4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i10) == 0) {
            i11 |= (262144 & i10) == 0 ? qVar2.f(playButtonState) : qVar2.h(playButtonState) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= qVar2.h(lVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= qVar2.e(j4) ? 8388608 : 4194304;
        }
        if (qVar2.O(i11 & 1, (4793491 & i11) != 4793490)) {
            String R = kj.c.R(qVar2, R.string.mini_player_accessibility_click_to_open);
            String R2 = kj.c.R(qVar2, R.string.mini_player_accessibility_pause);
            String R3 = kj.c.R(qVar2, R.string.mini_player_accessibility_play);
            String Q = kj.c.Q(R.string.player_accessibility_seek_back_seconds, new Object[]{15}, qVar2);
            i3.q qVar3 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar3, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            EchoThemeShapes shapes = echoTheme.getShapes(qVar2, i15);
            int i16 = i11;
            int i17 = EchoThemeShapes.$stable;
            i3.t c5 = h.c(e10, shapes.getTwoXl(qVar2, i17));
            int i18 = i16 & 3670016;
            boolean z6 = i18 == 1048576;
            Object L = qVar2.L();
            u2.e eVar2 = u2.l.f33918a;
            if (z6 || L == eVar2) {
                final int i19 = 1;
                L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.b
                    @Override // ho.a
                    public final Object invoke() {
                        z MiniPlayerContainer_ikp_DcA$lambda$1$2$0;
                        z MiniPlayerContainer_ikp_DcA$lambda$0$0;
                        z MiniPlayerContainer_ikp_DcA$lambda$1$1$0;
                        switch (i19) {
                            case 0:
                                MiniPlayerContainer_ikp_DcA$lambda$1$2$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$1$2$0(lVar);
                                return MiniPlayerContainer_ikp_DcA$lambda$1$2$0;
                            case 1:
                                MiniPlayerContainer_ikp_DcA$lambda$0$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$0$0(lVar);
                                return MiniPlayerContainer_ikp_DcA$lambda$0$0;
                            default:
                                MiniPlayerContainer_ikp_DcA$lambda$1$1$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$1$1$0(lVar);
                                return MiniPlayerContainer_ikp_DcA$lambda$1$1$0;
                        }
                    }
                };
                qVar2.h0(L);
            }
            i3.t H = r1.d.H(n.j(1, echoTheme.getColors(qVar2, i15).getBorder().getSeptenaryAlpha(qVar2, EchoThemeColors.Border.$stable), n.h(n.p(c5, false, R, null, null, (ho.a) L, 13), j4, h0.f26395b), echoTheme.getShapes(qVar2, i15).getTwoXl(qVar2, i17)), echoTheme.getSpacings(qVar2, i15).getX2(), echoTheme.getSpacings(qVar2, i15).getX2(), echoTheme.getSpacings(qVar2, i15).getX4(), echoTheme.getSpacings(qVar2, i15).getX2());
            k2 a10 = i2.a(j.f29228a, i3.d.f13005z0, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c10 = i3.a.c(H, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            h4.e eVar3 = h4.g.f11907f;
            r.J(eVar3, a10, qVar2);
            h4.e eVar4 = h4.g.f11906e;
            r.J(eVar4, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar5 = h4.g.f11908g;
            r.y(qVar2, valueOf, eVar5);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar2);
            h4.e eVar6 = h4.g.f11905d;
            r.J(eVar6, c10, qVar2);
            int i20 = i16 >> 3;
            ReadSmallRowKt.m1092ReadSmallRowAvatarDzVHIIc(str3, u.P, readSource, str4, qVar2, ((i16 >> 6) & 14) | (i20 & 896) | (i20 & 7168), 2);
            if (!(((double) 1.0f) > 0.0d)) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t t10 = r1.d.t(new m1(1.0f, true), i1.f29224a);
            i3.l lVar4 = i3.d.f12997a;
            f1 d10 = r1.p.d(lVar4, false);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c11 = i3.a.c(t10, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                fVar = fVar2;
                qVar2.k(fVar);
            } else {
                fVar = fVar2;
                qVar2.k0();
            }
            r.J(eVar3, d10, qVar2);
            r.J(eVar4, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar5, qVar2, dVar);
            r.J(eVar6, c11, qVar2);
            i3.t e11 = p2.e(qVar3, 1.0f);
            x a11 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode3 = Long.hashCode(qVar2.T);
            c3.o l10 = qVar2.l();
            i3.t c12 = i3.a.c(e11, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(eVar3, a11, qVar2);
            r.J(eVar4, l10, qVar2);
            defpackage.f.u(hashCode3, qVar2, eVar5, qVar2, dVar);
            r.J(eVar6, c12, qVar2);
            i3.t I = r1.d.I(n.i(), echoTheme.getSpacings(qVar2, i15).getX4(), u.P, u.P, u.P, 14);
            EchoThemeTypography typography = echoTheme.getTypography(qVar2, i15);
            int i21 = EchoThemeTypography.$stable;
            h4.f fVar3 = fVar;
            j7.d(str2, I, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(typography.getSmRegular400(qVar2, i21), echoTheme.getColors(qVar2, i15).getText().getSecondary(qVar2, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar2, i20 & 14, 0, 131068);
            j7.d(str, r1.d.I(n.i(), echoTheme.getSpacings(qVar2, i15).getX4(), u.P, u.P, u.P, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i15).getBaseRegular500(qVar2, i21), qVar2, i16 & 14, 0, 131068);
            qVar2.p(true);
            i3.t e12 = p2.e(qVar3, 1.0f);
            f1 d11 = r1.p.d(lVar4, false);
            int hashCode4 = Long.hashCode(qVar2.T);
            c3.o l11 = qVar2.l();
            i3.t c13 = i3.a.c(e12, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar3);
            } else {
                qVar2.k0();
            }
            r.J(eVar3, d11, qVar2);
            r.J(eVar4, l11, qVar2);
            defpackage.f.u(hashCode4, qVar2, eVar5, qVar2, dVar);
            r.J(eVar6, c13, qVar2);
            i3.l lVar5 = i3.d.f13000d;
            r1.t tVar = r1.t.f29349a;
            i3.t c14 = p2.c(p2.s(tVar.b(qVar3, lVar5), echoTheme.getSpacings(qVar2, i15).getX4()), 1.0f);
            s sVar = p3.t.Companion;
            j10 = j4;
            p3.x xVar = new p3.x(j10);
            long j11 = p3.x.f26437l;
            r1.p.a(n.g(c14, s.a(sVar, ig.f.I(xVar, new p3.x(j11)), u.P, u.P, 14), null, 6), qVar2, 0);
            r1.p.a(n.g(p2.c(p2.s(tVar.b(qVar3, i3.d.f13002f), echoTheme.getSpacings(qVar2, i15).getX4()), 1.0f), s.a(sVar, ig.f.I(new p3.x(j11), new p3.x(j10)), u.P, u.P, 14), null, 6), qVar2, 0);
            qVar2.p(true);
            qVar2.p(true);
            r1.d.g(p2.s(qVar3, echoTheme.getSpacings(qVar2, i15).getX0_5()), qVar2);
            if (playButtonState instanceof MiniPlayerContract.PlayButtonState.Loading) {
                qVar2.X(-157149860);
                LoaderKt.m1840LoadereopBjH0(r1.d.E(p2.o(qVar3, 40), echoTheme.getSpacings(qVar2, i15).getX2_5()), echoTheme.getColors(qVar2, i15).getIcon().getPrimary(qVar2, EchoThemeColors.Icon.$stable), 0L, null, qVar2, 0, 12);
                qVar = qVar2;
                qVar.p(false);
                lVar2 = lVar;
                i13 = i18;
                eVar = eVar2;
                i12 = i17;
            } else if (playButtonState instanceof MiniPlayerContract.PlayButtonState.Active) {
                qVar2.X(-156796026);
                i12 = i17;
                i3.t c15 = h.c(p2.o(qVar3, 40), echoTheme.getShapes(qVar2, i15).getMd(qVar2, i12));
                MiniPlayerContract.PlayButtonState.Active active = (MiniPlayerContract.PlayButtonState.Active) playButtonState;
                String str5 = active.isPlaying() ? R2 : R3;
                i13 = i18;
                boolean z10 = i13 == 1048576;
                Object L2 = qVar2.L();
                if (z10 || L2 == eVar2) {
                    final int i22 = 2;
                    lVar3 = lVar;
                    L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.b
                        @Override // ho.a
                        public final Object invoke() {
                            z MiniPlayerContainer_ikp_DcA$lambda$1$2$0;
                            z MiniPlayerContainer_ikp_DcA$lambda$0$0;
                            z MiniPlayerContainer_ikp_DcA$lambda$1$1$0;
                            switch (i22) {
                                case 0:
                                    MiniPlayerContainer_ikp_DcA$lambda$1$2$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$1$2$0(lVar3);
                                    return MiniPlayerContainer_ikp_DcA$lambda$1$2$0;
                                case 1:
                                    MiniPlayerContainer_ikp_DcA$lambda$0$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$0$0(lVar3);
                                    return MiniPlayerContainer_ikp_DcA$lambda$0$0;
                                default:
                                    MiniPlayerContainer_ikp_DcA$lambda$1$1$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$1$1$0(lVar3);
                                    return MiniPlayerContainer_ikp_DcA$lambda$1$1$0;
                            }
                        }
                    };
                    qVar2.h0(L2);
                } else {
                    lVar3 = lVar;
                }
                i3.t E = r1.d.E(n.p(c15, false, str5, null, null, (ho.a) L2, 13), echoTheme.getSpacings(qVar2, i15).getX2());
                if (active.isPlaying()) {
                    i14 = io.elevenlabs.ui.R.drawable.ic_pause;
                } else {
                    i14 = io.elevenlabs.ui.R.drawable.ic_play;
                }
                lVar2 = lVar3;
                eVar = eVar2;
                y2.a(kd.a.M(i14, qVar2, 0), null, E, echoTheme.getColors(qVar2, i15).getIcon().getPrimary(qVar2, EchoThemeColors.Icon.$stable), qVar2, u3.c.$stable | 48, 0);
                qVar = qVar2;
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(410571126, qVar2, false);
            }
            r1.d.g(p2.s(qVar3, echoTheme.getSpacings(qVar, i15).getX0_5()), qVar);
            i3.t c16 = h.c(p2.o(qVar3, 40), echoTheme.getShapes(qVar, i15).getMd(qVar, i12));
            boolean z11 = i13 == 1048576;
            Object L3 = qVar.L();
            if (z11 || L3 == eVar) {
                final int i23 = 0;
                L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.b
                    @Override // ho.a
                    public final Object invoke() {
                        z MiniPlayerContainer_ikp_DcA$lambda$1$2$0;
                        z MiniPlayerContainer_ikp_DcA$lambda$0$0;
                        z MiniPlayerContainer_ikp_DcA$lambda$1$1$0;
                        switch (i23) {
                            case 0:
                                MiniPlayerContainer_ikp_DcA$lambda$1$2$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$1$2$0(lVar2);
                                return MiniPlayerContainer_ikp_DcA$lambda$1$2$0;
                            case 1:
                                MiniPlayerContainer_ikp_DcA$lambda$0$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$0$0(lVar2);
                                return MiniPlayerContainer_ikp_DcA$lambda$0$0;
                            default:
                                MiniPlayerContainer_ikp_DcA$lambda$1$1$0 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$1$1$0(lVar2);
                                return MiniPlayerContainer_ikp_DcA$lambda$1$1$0;
                        }
                    }
                };
                qVar.h0(L3);
            }
            q qVar4 = qVar;
            y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.rewind_15s, qVar, 0), Q, r1.d.E(n.p(c16, false, Q, null, null, (ho.a) L3, 13), echoTheme.getSpacings(qVar, i15).getX2()), echoTheme.getColors(qVar, i15).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar4, u3.c.$stable, 0);
            qVar2 = qVar4;
            qVar2.p(true);
        } else {
            lVar2 = lVar;
            j10 = j4;
            qVar2.R();
        }
        r1 r10 = qVar2.r();
        if (r10 != null) {
            final long j12 = j10;
            final l lVar6 = lVar2;
            r10.f34012d = new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.c
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z MiniPlayerContainer_ikp_DcA$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    MiniPlayerContainer_ikp_DcA$lambda$2 = MiniPlayerKt.MiniPlayerContainer_ikp_DcA$lambda$2(str, str2, str3, readSource, str4, playButtonState, lVar6, j12, i10, (m) obj, intValue);
                    return MiniPlayerContainer_ikp_DcA$lambda$2;
                }
            };
        }
    }

    public static final z MiniPlayerContainer_ikp_DcA$lambda$0$0(l lVar) {
        lVar.invoke(MiniPlayerContract.Event.ClickContainer.INSTANCE);
        return z.f31622a;
    }

    public static final z MiniPlayerContainer_ikp_DcA$lambda$1$1$0(l lVar) {
        lVar.invoke(MiniPlayerContract.Event.ClickPlayPause.INSTANCE);
        return z.f31622a;
    }

    public static final z MiniPlayerContainer_ikp_DcA$lambda$1$2$0(l lVar) {
        lVar.invoke(MiniPlayerContract.Event.ClickSeekBackward.INSTANCE);
        return z.f31622a;
    }

    public static final z MiniPlayerContainer_ikp_DcA$lambda$2(String str, String str2, String str3, ReadSource readSource, String str4, MiniPlayerContract.PlayButtonState playButtonState, l lVar, long j4, int i10, m mVar, int i11) {
        m1521MiniPlayerContainerikp_DcA(str, str2, str3, readSource, str4, playButtonState, lVar, j4, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        if ((r27 & 16) != 0) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0083  */
    /* renamed from: MiniPlayerUI-i2-NWbI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1522MiniPlayerUIi2NWbI(MiniPlayerContract.UiState uiState, l lVar, float f10, boolean z6, long j4, m mVar, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        long j10;
        boolean z11;
        q qVar;
        boolean z12;
        long j11;
        r1 r10;
        long j12;
        int i14;
        int i15;
        int i16;
        boolean h10;
        int i17;
        uiState.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(810418744);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar2.f(uiState);
            } else {
                h10 = qVar2.h(uiState);
            }
            if (h10) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.c(f10)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        int i18 = i11 & 8;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            z10 = z6;
            if (qVar2.g(z10)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i10 & 24576) != 0) {
                j10 = j4;
                if ((i11 & 16) == 0 && qVar2.e(j10)) {
                    i14 = 16384;
                } else {
                    i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i14;
            } else {
                j10 = j4;
            }
            if ((i12 & 9363) == 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar2.O(i12 & 1, z11)) {
                qVar2.T();
                if ((i10 & 1) != 0 && !qVar2.y()) {
                    qVar2.R();
                } else {
                    if (i18 != 0) {
                        z10 = true;
                    }
                    if ((i11 & 16) != 0) {
                        j10 = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getFill().getInput(qVar2, EchoThemeColors.Fill.$stable);
                        i12 &= -57345;
                    }
                    qVar2.q();
                    String R = kj.c.R(qVar2, R.string.mini_player_accessibility_click_to_open);
                    boolean z13 = uiState instanceof MiniPlayerContract.UiState.Hidden;
                    i3.q qVar3 = i3.q.f13017a;
                    if (z13) {
                        qVar2.X(1174053476);
                        if (z10) {
                            qVar2.X(1174092567);
                            ContainerShadowKt.ContainerShadow(p2.e(qVar3, 1.0f), qVar2, 6, 0);
                            qVar2.p(false);
                        } else {
                            qVar2.X(1174172330);
                            qVar2.p(false);
                        }
                        qVar2.p(false);
                        qVar = qVar2;
                        j12 = j10;
                    } else if (uiState instanceof MiniPlayerContract.UiState.Shown) {
                        qVar2.X(1174269577);
                        i3.t E = r1.d.E(r1.d.t(n.g(p2.e(qVar3, 1.0f), s.b(p3.t.Companion, ig.f.I(new p3.x(p3.x.f26437l), new p3.x(p3.x.b(0.8f, j10))), 0.5f, u.P, 12), null, 6), i1.f29224a), f10);
                        boolean f11 = qVar2.f(R);
                        Object L = qVar2.L();
                        if (f11 || L == u2.l.f33918a) {
                            L = new e(R, 2);
                            qVar2.h0(L);
                        }
                        i3.t c5 = p4.q.c(E, true, (l) L);
                        f1 d10 = r1.p.d(i3.d.f13001e, false);
                        int hashCode = Long.hashCode(qVar2.T);
                        c3.o l4 = qVar2.l();
                        i3.t c10 = i3.a.c(c5, qVar2);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(h4.g.f11907f, d10, qVar2);
                        r.J(h4.g.f11906e, l4, qVar2);
                        r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                        r.F(h4.g.f11909h, qVar2);
                        r.J(h4.g.f11905d, c10, qVar2);
                        MiniPlayerContract.UiState.Shown shown = (MiniPlayerContract.UiState.Shown) uiState;
                        j12 = j10;
                        m1521MiniPlayerContainerikp_DcA(shown.getTitle(), shown.getAuthor(), shown.getCoverImageUrl(), shown.getSource(), shown.getOriginalFileType(), shown.getPlayButtonState(), lVar, j12, qVar2, ((i12 << 15) & 3670016) | ((i12 << 9) & 29360128));
                        qVar = qVar2;
                        qVar.p(true);
                        qVar.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(1423345303, qVar2, false);
                    }
                    z12 = z10;
                    j11 = j12;
                }
            } else {
                qVar = qVar2;
                qVar.R();
                z12 = z10;
                j11 = j10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new d(uiState, lVar, f10, z12, j11, i10, i11);
                return;
            }
            return;
        }
        z10 = z6;
        if ((i10 & 24576) != 0) {
        }
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar2.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z MiniPlayerUI_i2_NWbI$lambda$0$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z MiniPlayerUI_i2_NWbI$lambda$2(MiniPlayerContract.UiState uiState, l lVar, float f10, boolean z6, long j4, int i10, int i11, m mVar, int i12) {
        m1522MiniPlayerUIi2NWbI(uiState, lVar, f10, z6, j4, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z MiniPlayer_GSIvlCE$lambda$1$0(MiniPlayerViewModel miniPlayerViewModel, t tVar) {
        tVar.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                miniPlayerViewModel.onEvent(MiniPlayerContract.Event.LifecyclePause.INSTANCE);
            }
        } else {
            miniPlayerViewModel.onEvent(MiniPlayerContract.Event.LifecycleResume.INSTANCE);
        }
        return z.f31622a;
    }

    public static final z MiniPlayer_GSIvlCE$lambda$3(float f10, boolean z6, long j4, l lVar, MiniPlayerViewModel miniPlayerViewModel, int i10, int i11, m mVar, int i12) {
        m1520MiniPlayerGSIvlCE(f10, z6, j4, lVar, miniPlayerViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_MiniPlayer_Visible_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1011557332);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$MiniPlayerKt.INSTANCE.getLambda$1502238598$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 7);
        }
    }

    public static final z Preview_MiniPlayer_Visible_Loading$lambda$0(int i10, m mVar, int i11) {
        Preview_MiniPlayer_Visible_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_MiniPlayer_Visible_LongText(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(180682039);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$MiniPlayerKt.INSTANCE.getLambda$798944541$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 9);
        }
    }

    public static final z Preview_MiniPlayer_Visible_LongText$lambda$0(int i10, m mVar, int i11) {
        Preview_MiniPlayer_Visible_LongText(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_MiniPlayer_Visible_Paused(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(334739484);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$MiniPlayerKt.INSTANCE.m1517getLambda$969643646$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 6);
        }
    }

    public static final z Preview_MiniPlayer_Visible_Paused$lambda$0(int i10, m mVar, int i11) {
        Preview_MiniPlayer_Visible_Paused(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_MiniPlayer_Visible_Playing(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-338653026);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$MiniPlayerKt.INSTANCE.m1516getLambda$2119824392$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 8);
        }
    }

    public static final z Preview_MiniPlayer_Visible_Playing$lambda$0(int i10, m mVar, int i11) {
        Preview_MiniPlayer_Visible_Playing(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

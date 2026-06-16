package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import a2.t0;
import androidx.room.m0;
import ap.s0;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import dt.c0;
import dt.n;
import dt.o0;
import f4.f1;
import fr.d0;
import h4.f;
import h4.g;
import h4.h;
import ho.l;
import ho.p;
import i3.t;
import i4.j1;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.readerapp.ui.components.PlayerQueueRowKt;
import io.elevenlabs.readerapp.ui.components.ReadSmallRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpec;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.SwipeToActionBoxKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.extensions.SafeHapticFeedback;
import io.elevenlabs.ui.extensions.SafeHapticFeedbackKt;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.WebrtcBuildVersion;
import n1.h2;
import q2.y2;
import r1.c3;
import r1.d2;
import r1.j;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import rd.c1;
import t1.b0;
import t1.i;
import t1.z;
import t2.u;
import u2.a0;
import u2.f0;
import u2.h0;
import u2.i0;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001ag\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010 \u001a\u00020\u0006H\u0001¢\u0006\u0004\b \u0010\u001f\u001a\u000f\u0010!\u001a\u00020\u0006H\u0001¢\u0006\u0004\b!\u0010\u001f¨\u0006#²\u0006\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lh5/f;", "bottomPadding", "Lio/elevenlabs/domain/model/MediaItemState;", "fallbackMediaItem", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueViewModel;", "viewModel", "Lsn/z;", "PlayerQueueScreen-Kz89ssw", "(FLio/elevenlabs/domain/model/MediaItemState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueViewModel;Lu2/m;II)V", "PlayerQueueScreen", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "onItemClick", "Lkotlin/Function2;", "", "onItemsUpdate", "onItemRemove", "PlayerQueueUI-AjpBEmI", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState;Lho/l;Lho/p;Lho/l;Lu2/m;I)V", "PlayerQueueUI", "Lkotlin/Function0;", "currentItemSlot", "Lt1/t;", "queueContent", "Lt1/z;", "lazyListState", "PlayerQueueLayout-Kz89ssw", "(FLho/p;Lho/l;Lt1/z;Lu2/m;I)V", "PlayerQueueLayout", "Preview_PlayerPlaylistScreen_NonEmptyQueue", "(Lu2/m;I)V", "Preview_PlayerPlaylistScreen_EmptyQueue", "Preview_PlayerPlaylistScreen_Loading", "queueItems", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerQueueScreenKt {
    /* renamed from: PlayerQueueLayout-Kz89ssw */
    private static final void m1524PlayerQueueLayoutKz89ssw(float f10, p pVar, l lVar, z zVar, m mVar, int i10) {
        int i11;
        z zVar2;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(947296040);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            zVar2 = zVar;
            if (qVar.f(zVar2)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        } else {
            zVar2 = zVar;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            o1 o1Var = new o1(u0.e(qVar).f29154l, 16);
            i3.q qVar2 = i3.q.f13017a;
            t d10 = p2.d(r1.d.P(qVar2, o1Var), 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(d10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
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
            pVar.invoke(qVar, Integer.valueOf((i11 >> 3) & 14));
            DividerKt.m1827DivideriJQMabo(p2.e(qVar2, 1.0f), 0L, qVar, 6, 2);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i16 = EchoTheme.$stable;
            c1.c(p2.d(qVar2, 1.0f), zVar2, new d2(echoTheme.getSpacings(qVar, i16).getX2_5(), echoTheme.getSpacings(qVar, i16).getX6(), echoTheme.getSpacings(qVar, i16).getX2_5(), f10), false, null, null, null, false, null, lVar, qVar, ((i11 >> 6) & 112) | 6 | ((i11 << 21) & 1879048192), 504);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.b(f10, pVar, lVar, zVar, i10);
        }
    }

    public static final sn.z PlayerQueueLayout_Kz89ssw$lambda$1(float f10, p pVar, l lVar, z zVar, int i10, m mVar, int i11) {
        m1524PlayerQueueLayoutKz89ssw(f10, pVar, lVar, zVar, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if ((r17 & 4) != 0) goto L119;
     */
    /* renamed from: PlayerQueueScreen-Kz89ssw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1525PlayerQueueScreenKz89ssw(float f10, MediaItemState mediaItemState, PlayerQueueViewModel playerQueueViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        q7.e f02;
        int i13;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(1895971983);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(mediaItemState)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0 && qVar.h(playerQueueViewModel)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            int i16 = i10 & 1;
            u2.e eVar = u2.l.f33918a;
            if (i16 != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 4) != 0) {
                    boolean h10 = qVar.h(mediaItemState);
                    Object L = qVar.L();
                    if (h10 || L == eVar) {
                        L = new a(mediaItemState, 0);
                        qVar.h0(L);
                    }
                    l lVar = (l) L;
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            f02 = m0.f0(((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras(), lVar);
                        } else {
                            f02 = m0.f0(q7.a.f28123b, lVar);
                        }
                        playerQueueViewModel = (PlayerQueueViewModel) gg.b.j0(e0.f20562a.b(PlayerQueueViewModel.class), a10, null, o6, f02, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                z0 l4 = c1.l(playerQueueViewModel.getUiState(), PlayerQueueContract.UiState.Loading.INSTANCE, qVar, 48);
                boolean h11 = qVar.h(playerQueueViewModel);
                Object L2 = qVar.L();
                if (h11 || L2 == eVar) {
                    L2 = new a(playerQueueViewModel, 1);
                    qVar.h0(L2);
                }
                r.c(sn.z.f31622a, (l) L2, qVar);
                PlayerQueueContract.UiState uiState = (PlayerQueueContract.UiState) l4.getValue();
                boolean h12 = qVar.h(playerQueueViewModel);
                Object L3 = qVar.L();
                if (h12 || L3 == eVar) {
                    L3 = new PlayerQueueScreenKt$PlayerQueueScreen$3$1(playerQueueViewModel);
                    qVar.h0(L3);
                }
                l lVar2 = (l) ((oo.g) L3);
                boolean h13 = qVar.h(playerQueueViewModel);
                Object L4 = qVar.L();
                if (h13 || L4 == eVar) {
                    L4 = new PlayerQueueScreenKt$PlayerQueueScreen$4$1(playerQueueViewModel);
                    qVar.h0(L4);
                }
                p pVar = (p) ((oo.g) L4);
                boolean h14 = qVar.h(playerQueueViewModel);
                Object L5 = qVar.L();
                if (h14 || L5 == eVar) {
                    L5 = new PlayerQueueScreenKt$PlayerQueueScreen$5$1(playerQueueViewModel);
                    qVar.h0(L5);
                }
                m1526PlayerQueueUIAjpBEmI(f10, uiState, lVar2, pVar, (l) ((oo.g) L5), qVar, i12 & 14);
            }
        } else {
            qVar.R();
        }
        PlayerQueueViewModel playerQueueViewModel2 = playerQueueViewModel;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(f10, mediaItemState, playerQueueViewModel2, i10, i11, 0);
        }
    }

    public static final PlayerQueueViewModel PlayerQueueScreen_Kz89ssw$lambda$0$0(MediaItemState mediaItemState, PlayerQueueViewModel.Factory factory) {
        factory.getClass();
        return factory.create(mediaItemState);
    }

    public static final h0 PlayerQueueScreen_Kz89ssw$lambda$1$0(final PlayerQueueViewModel playerQueueViewModel, i0 i0Var) {
        i0Var.getClass();
        return new h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueScreen_Kz89ssw$lambda$1$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                PlayerQueueViewModel.this.onScreenClosed();
            }
        };
    }

    public static final sn.z PlayerQueueScreen_Kz89ssw$lambda$5(float f10, MediaItemState mediaItemState, PlayerQueueViewModel playerQueueViewModel, int i10, int i11, m mVar, int i12) {
        m1525PlayerQueueScreenKz89ssw(f10, mediaItemState, playerQueueViewModel, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* renamed from: PlayerQueueUI-AjpBEmI */
    private static final void m1526PlayerQueueUIAjpBEmI(float f10, PlayerQueueContract.UiState uiState, l lVar, p pVar, l lVar2, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        c0 c0Var;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        boolean h10;
        int i15;
        int i16;
        q qVar = (q) mVar;
        qVar.Z(1696042552);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar.f(uiState);
            } else {
                h10 = qVar.h(uiState);
            }
            if (h10) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(pVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar2)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            SafeHapticFeedback safeHapticFeedback = SafeHapticFeedbackKt.safeHapticFeedback(qVar, 0);
            z a10 = b0.a(0, qVar, 3);
            if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !qVar.f(uiState))) {
                z10 = false;
            } else {
                z10 = true;
            }
            Object L = qVar.L();
            Object obj = u2.l.f33918a;
            if (z10 || L == obj) {
                boolean z13 = uiState instanceof PlayerQueueContract.UiState.EmptyQueue;
                List<MediaItemState> list = tn.t.f33547a;
                if (!z13 && !(uiState instanceof PlayerQueueContract.UiState.Loading)) {
                    if (uiState instanceof PlayerQueueContract.UiState.NonEmptyQueue) {
                        list = ((PlayerQueueContract.UiState.NonEmptyQueue) uiState).getQueue();
                    } else {
                        c6.p();
                        return;
                    }
                }
                L = r.A(list);
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            boolean f11 = qVar.f(z0Var) | qVar.h(safeHapticFeedback);
            Object L2 = qVar.L();
            if (f11 || L2 == obj) {
                L2 = new PlayerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1(safeHapticFeedback, z0Var, null);
                qVar.h0(L2);
            }
            ho.r rVar = (ho.r) L2;
            a10.getClass();
            rVar.getClass();
            qVar.X(-645045624);
            float f12 = 0;
            d2 d2Var = new d2(f12, f12, f12, f12);
            float f13 = dt.o.f8193a;
            qVar.X(1347434050);
            boolean f14 = qVar.f(a10);
            Object L3 = qVar.L();
            if (f14 || L3 == obj) {
                L3 = new dt.b0(a10, 0);
                qVar.h0(L3);
            }
            ho.a aVar = (ho.a) L3;
            qVar.p(false);
            aVar.getClass();
            qVar.X(996643712);
            Object L4 = qVar.L();
            if (L4 == obj) {
                Object a0Var = new a0(r.q(qVar));
                qVar.h0(a0Var);
                L4 = a0Var;
            }
            d0 d0Var = ((a0) L4).f33799a;
            z0 H = r.H(aVar, qVar);
            z0 H2 = r.H(100L, qVar);
            qVar.X(1852585201);
            boolean f15 = qVar.f(a10) | qVar.f(d0Var) | qVar.e(100L);
            Object L5 = qVar.L();
            if (f15 || L5 == obj) {
                L5 = new o0(a10, d0Var, new s0(H, H2, 7));
                qVar.h0(L5);
            }
            o0 o0Var = (o0) L5;
            qVar.p(false);
            qVar.p(false);
            h5.c cVar = (h5.c) qVar.j(j1.f13129h);
            float d02 = cVar.d0(f13);
            Object L6 = qVar.L();
            if (L6 == obj) {
                Object a0Var2 = new a0(r.q(qVar));
                qVar.h0(a0Var2);
                L6 = a0Var2;
            }
            d0 d0Var2 = ((a0) L6).f33799a;
            z0 H3 = r.H(rVar, qVar);
            h5.m mVar2 = (h5.m) qVar.j(j1.f13135n);
            dt.a aVar2 = new dt.a(cVar.d0(r1.d.m(d2Var, mVar2)), cVar.d0(r1.d.l(d2Var, mVar2)), cVar.d0(f12), cVar.d0(f12));
            qVar.X(1347465600);
            boolean f16 = qVar.f(a10);
            Object L7 = qVar.L();
            if (f16 || L7 == obj) {
                L7 = new dt.b0(a10, 1);
                qVar.h0(L7);
            }
            qVar.p(false);
            f0 s10 = r.s((ho.a) L7);
            Object obj2 = (h2) s10.getValue();
            qVar.X(1347468268);
            boolean f17 = qVar.f(obj2) | qVar.f(d0Var2) | qVar.f(a10) | qVar.c(f13) | qVar.f(d2Var) | qVar.f(o0Var);
            Object L8 = qVar.L();
            if (f17 || L8 == obj) {
                int ordinal = ((h2) s10.getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        c0Var = c0.f8097c;
                    } else {
                        c6.p();
                        return;
                    }
                } else {
                    c0Var = c0.f8096b;
                }
                c0 c0Var2 = c0Var;
                o0Var.getClass();
                mVar2.getClass();
                L8 = new dt.e0(new android.javax.sip.o(a10, 14), d0Var2, H3, d02, aVar2, o0Var, mVar2, c0Var2);
                qVar.h0(L8);
            }
            dt.e0 e0Var = (dt.e0) L8;
            qVar.p(false);
            qVar.p(false);
            ActionConfig actionConfig = new ActionConfig(R.drawable.trash, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_queue_item_swipe_action_remove_title), ReaderColors.INSTANCE.m2447getRed4000d7_KjU(), true, false, 16, null);
            if (uiState instanceof PlayerQueueContract.UiState.Loading) {
                qVar.X(809726297);
                p lambda$709542494$app_productionRelease = ComposableSingletons$PlayerQueueScreenKt.INSTANCE.getLambda$709542494$app_productionRelease();
                Object L9 = qVar.L();
                if (L9 == obj) {
                    L9 = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(20);
                    qVar.h0(L9);
                }
                m1524PlayerQueueLayoutKz89ssw(f10, lambda$709542494$app_productionRelease, (l) L9, a10, qVar, (i11 & 14) | 432);
                qVar.p(false);
            } else if (uiState instanceof PlayerQueueContract.UiState.EmptyQueue) {
                qVar.X(810725582);
                c3.j d10 = k.d(-1242887417, true, new t0((PlayerQueueContract.UiState.EmptyQueue) uiState, 10), qVar);
                Object L10 = qVar.L();
                if (L10 == obj) {
                    L10 = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(28);
                    qVar.h0(L10);
                }
                m1524PlayerQueueLayoutKz89ssw(f10, d10, (l) L10, a10, qVar, (i11 & 14) | 432);
                qVar.p(false);
            } else if (uiState instanceof PlayerQueueContract.UiState.NonEmptyQueue) {
                qVar.X(812050863);
                boolean z14 = true;
                c3.j d11 = k.d(-957751514, true, new t0((PlayerQueueContract.UiState.NonEmptyQueue) uiState, 11), qVar);
                boolean f18 = qVar.f(z0Var) | qVar.h(actionConfig);
                if ((57344 & i11) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean f19 = f18 | z11 | qVar.f(e0Var);
                if ((i11 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean h11 = f19 | z12 | qVar.h(safeHapticFeedback);
                if ((i11 & 7168) != 2048) {
                    z14 = false;
                }
                boolean z15 = h11 | z14;
                Object L11 = qVar.L();
                if (z15 || L11 == obj) {
                    Object mVar3 = new id.m(z0Var, actionConfig, lVar2, e0Var, lVar, safeHapticFeedback, pVar);
                    qVar.h0(mVar3);
                    L11 = mVar3;
                }
                m1524PlayerQueueLayoutKz89ssw(f10, d11, (l) L11, a10, qVar, (i11 & 14) | 48);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(2104333784, qVar, false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(f10, uiState, lVar, pVar, lVar2, i10);
        }
    }

    public static final List<MediaItemState> PlayerQueueUI_AjpBEmI$lambda$1(z0 z0Var) {
        return (List) z0Var.getValue();
    }

    public static final sn.z PlayerQueueUI_AjpBEmI$lambda$4$0(t1.t tVar) {
        tVar.getClass();
        ((i) tVar).u(3, new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(22), new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(23), ComposableSingletons$PlayerQueueScreenKt.INSTANCE.getLambda$310816351$app_productionRelease());
        return sn.z.f31622a;
    }

    public static final Object PlayerQueueUI_AjpBEmI$lambda$4$0$1(int i10) {
        return "shimmering_row";
    }

    public static final sn.z PlayerQueueUI_AjpBEmI$lambda$5(PlayerQueueContract.UiState uiState, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerQueueRowKt.PlayerQueueActiveRow(((PlayerQueueContract.UiState.EmptyQueue) uiState).getCurrentItem(), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerQueueUI_AjpBEmI$lambda$6$0(t1.t tVar) {
        tVar.getClass();
        ((i) tVar).t("empty_queue", "empty_queue", ComposableSingletons$PlayerQueueScreenKt.INSTANCE.getLambda$69262001$app_productionRelease());
        return sn.z.f31622a;
    }

    public static final sn.z PlayerQueueUI_AjpBEmI$lambda$7(PlayerQueueContract.UiState uiState, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerQueueRowKt.PlayerQueueActiveRow(((PlayerQueueContract.UiState.NonEmptyQueue) uiState).getCurrentItem(), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerQueueUI_AjpBEmI$lambda$8$0(final z0 z0Var, final ActionConfig actionConfig, final l lVar, final dt.e0 e0Var, final l lVar2, final SafeHapticFeedback safeHapticFeedback, final p pVar, t1.t tVar) {
        tVar.getClass();
        final List<MediaItemState> PlayerQueueUI_AjpBEmI$lambda$1 = PlayerQueueUI_AjpBEmI$lambda$1(z0Var);
        final io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a aVar = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(29);
        final d dVar = new d(0);
        ((i) tVar).u(PlayerQueueUI_AjpBEmI$lambda$1.size(), new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI_AjpBEmI$lambda$8$0$$inlined$items$1
            public final Object invoke(int i10) {
                return l.this.invoke(PlayerQueueUI_AjpBEmI$lambda$1.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI_AjpBEmI$lambda$8$0$$inlined$items$2
            public final Object invoke(int i10) {
                return l.this.invoke(PlayerQueueUI_AjpBEmI$lambda$1.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI_AjpBEmI$lambda$8$0$$inlined$items$3
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                final t1.b bVar2;
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    bVar2 = bVar;
                    if (((q) mVar).f(bVar2)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
                } else {
                    bVar2 = bVar;
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((q) mVar).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final MediaItemState mediaItemState = (MediaItemState) PlayerQueueUI_AjpBEmI$lambda$1.get(i10);
                    qVar.X(1659719023);
                    final ActionConfig actionConfig2 = actionConfig;
                    final l lVar3 = lVar;
                    ActionSpec actionSpec = SwipeToActionBoxKt.actionSpec(k.d(867801144, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$actionSpec$1
                        public final void invoke(ActionSpecBuilder actionSpecBuilder, m mVar2, int i15) {
                            boolean z10;
                            boolean h10;
                            int i16;
                            actionSpecBuilder.getClass();
                            if ((i15 & 6) == 0) {
                                if ((i15 & 8) == 0) {
                                    h10 = ((q) mVar2).f(actionSpecBuilder);
                                } else {
                                    h10 = ((q) mVar2).h(actionSpecBuilder);
                                }
                                if (h10) {
                                    i16 = 4;
                                } else {
                                    i16 = 2;
                                }
                                i15 |= i16;
                            }
                            if ((i15 & 19) != 18) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q qVar2 = (q) mVar2;
                            if (qVar2.O(i15 & 1, z10)) {
                                boolean h11 = qVar2.h(ActionConfig.this) | qVar2.f(lVar3) | qVar2.h(mediaItemState);
                                final ActionConfig actionConfig3 = ActionConfig.this;
                                final l lVar4 = lVar3;
                                final MediaItemState mediaItemState2 = mediaItemState;
                                Object L = qVar2.L();
                                u2.e eVar = u2.l.f33918a;
                                if (h11 || L == eVar) {
                                    L = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$actionSpec$1$1$1
                                        public final void invoke(ActionSpecBuilder.HandlerScope handlerScope) {
                                            handlerScope.getClass();
                                            ActionConfig actionConfig4 = ActionConfig.this;
                                            final l lVar5 = lVar4;
                                            final MediaItemState mediaItemState3 = mediaItemState2;
                                            handlerScope.handledBy(actionConfig4, new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$actionSpec$1$1$1.1
                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m1530invoke() {
                                                    l.this.invoke(mediaItemState3);
                                                }

                                                @Override // ho.a
                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                    m1530invoke();
                                                    return sn.z.f31622a;
                                                }
                                            });
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((ActionSpecBuilder.HandlerScope) obj);
                                            return sn.z.f31622a;
                                        }
                                    };
                                    qVar2.h0(L);
                                }
                                actionSpecBuilder.handlers((l) L);
                                boolean h12 = qVar2.h(ActionConfig.this);
                                final ActionConfig actionConfig4 = ActionConfig.this;
                                Object L2 = qVar2.L();
                                if (h12 || L2 == eVar) {
                                    L2 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$actionSpec$1$2$1
                                        public final void invoke(ActionSpecBuilder.PlacementScope placementScope) {
                                            placementScope.getClass();
                                            placementScope.setStartSide(ig.f.H(ActionConfig.this));
                                            placementScope.setEndSide(ig.f.H(ActionConfig.this));
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((ActionSpecBuilder.PlacementScope) obj);
                                            return sn.z.f31622a;
                                        }
                                    };
                                    qVar2.h0(L2);
                                }
                                actionSpecBuilder.placement((l) L2);
                                return;
                            }
                            qVar2.R();
                        }

                        @Override // ho.q
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((ActionSpecBuilder) obj, (m) obj2, ((Number) obj3).intValue());
                            return sn.z.f31622a;
                        }
                    }, qVar), qVar, 6);
                    String j4 = defpackage.f.j(mediaItemState.getAuthor(), " - ", mediaItemState.getTitle());
                    t e10 = p2.e(i3.q.f13017a, 1.0f);
                    final dt.e0 e0Var2 = e0Var;
                    final l lVar4 = lVar2;
                    final SafeHapticFeedback safeHapticFeedback2 = safeHapticFeedback;
                    final p pVar2 = pVar;
                    final z0 z0Var2 = z0Var;
                    SwipeToActionBoxKt.SwipeToActionBox(j4, e10, null, actionSpec, null, null, k.d(-319178441, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$1
                        public final void invoke(m mVar2, int i15) {
                            boolean z10;
                            if ((i15 & 3) != 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q qVar2 = (q) mVar2;
                            if (qVar2.O(i15 & 1, z10)) {
                                t1.b bVar3 = t1.b.this;
                                dt.e0 e0Var3 = e0Var2;
                                String readId = mediaItemState.getReadId();
                                t e11 = p2.e(i3.q.f13017a, 1.0f);
                                final MediaItemState mediaItemState2 = mediaItemState;
                                final l lVar5 = lVar4;
                                final SafeHapticFeedback safeHapticFeedback3 = safeHapticFeedback2;
                                final p pVar3 = pVar2;
                                final z0 z0Var3 = z0Var2;
                                rd.s0.d(bVar3, e0Var3, readId, e11, false, null, k.d(-1677038435, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$1.1
                                    public final void invoke(dt.j jVar, boolean z11, m mVar3, int i16) {
                                        final dt.j jVar2;
                                        int i17;
                                        boolean z12;
                                        int i18;
                                        jVar.getClass();
                                        if ((i16 & 6) == 0) {
                                            jVar2 = jVar;
                                            if (((q) mVar3).f(jVar2)) {
                                                i18 = 4;
                                            } else {
                                                i18 = 2;
                                            }
                                            i17 = i16 | i18;
                                        } else {
                                            jVar2 = jVar;
                                            i17 = i16;
                                        }
                                        if ((i17 & 131) != 130) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        q qVar3 = (q) mVar3;
                                        if (qVar3.O(i17 & 1, z12)) {
                                            float x1_5 = EchoTheme.INSTANCE.getSpacings(qVar3, EchoTheme.$stable).getX1_5();
                                            String title = MediaItemState.this.getTitle();
                                            String author = MediaItemState.this.getAuthor();
                                            String coverUrl = MediaItemState.this.getCoverUrl();
                                            String Q = kj.c.Q(io.elevenlabs.readerapp.R.string.player_accessibility_play_item, new Object[]{MediaItemState.this.getTitle()}, qVar3);
                                            ReadSource readSource = MediaItemState.this.getReadSource();
                                            String originalFileType = MediaItemState.this.getOriginalFileType();
                                            boolean f10 = qVar3.f(lVar5) | qVar3.h(MediaItemState.this);
                                            final l lVar6 = lVar5;
                                            final MediaItemState mediaItemState3 = MediaItemState.this;
                                            Object L = qVar3.L();
                                            if (f10 || L == u2.l.f33918a) {
                                                L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$1$1$1$1
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1527invoke() {
                                                        l.this.invoke(mediaItemState3);
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1527invoke();
                                                        return sn.z.f31622a;
                                                    }
                                                };
                                                qVar3.h0(L);
                                            }
                                            ho.a aVar2 = (ho.a) L;
                                            final SafeHapticFeedback safeHapticFeedback4 = safeHapticFeedback3;
                                            final p pVar4 = pVar3;
                                            final MediaItemState mediaItemState4 = MediaItemState.this;
                                            final z0 z0Var4 = z0Var3;
                                            ReadSmallRowKt.m1091ReadSmallRowgMrHQkA(title, author, coverUrl, readSource, originalFileType, aVar2, k.d(552714753, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt.PlayerQueueUI.5.1.3.1.1.2
                                                public final void invoke(m mVar4, int i19) {
                                                    boolean z13;
                                                    if ((i19 & 3) != 2) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    q qVar4 = (q) mVar4;
                                                    if (qVar4.O(i19 & 1, z13)) {
                                                        dt.j jVar3 = dt.j.this;
                                                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                                                        int i20 = EchoTheme.$stable;
                                                        float x32 = echoTheme.getSpacings(qVar4, i20).getX3();
                                                        i3.q qVar5 = i3.q.f13017a;
                                                        t I = r1.d.I(qVar5, x32, u.P, u.P, u.P, 14);
                                                        boolean h10 = qVar4.h(safeHapticFeedback4);
                                                        final SafeHapticFeedback safeHapticFeedback5 = safeHapticFeedback4;
                                                        Object L2 = qVar4.L();
                                                        u2.e eVar = u2.l.f33918a;
                                                        if (h10 || L2 == eVar) {
                                                            L2 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$1$1$2$1$1
                                                                @Override // ho.l
                                                                public /* synthetic */ Object invoke(Object obj) {
                                                                    m1528invokek4lQ0M(((o3.b) obj).f24764a);
                                                                    return sn.z.f31622a;
                                                                }

                                                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                                                public final void m1528invokek4lQ0M(long j10) {
                                                                    SafeHapticFeedback.this.mo1982performHapticFeedbackCdsT49E(23);
                                                                }
                                                            };
                                                            qVar4.h0(L2);
                                                        }
                                                        l lVar7 = (l) L2;
                                                        boolean f11 = qVar4.f(pVar4) | qVar4.h(mediaItemState4) | qVar4.f(z0Var4) | qVar4.h(safeHapticFeedback4);
                                                        final p pVar5 = pVar4;
                                                        final MediaItemState mediaItemState5 = mediaItemState4;
                                                        final SafeHapticFeedback safeHapticFeedback6 = safeHapticFeedback4;
                                                        final z0 z0Var5 = z0Var4;
                                                        Object L3 = qVar4.L();
                                                        if (f11 || L3 == eVar) {
                                                            L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$5$1$3$1$1$2$2$1
                                                                /* renamed from: invoke, reason: collision with other method in class */
                                                                public final void m1529invoke() {
                                                                    List PlayerQueueUI_AjpBEmI$lambda$12;
                                                                    p pVar6 = p.this;
                                                                    MediaItemState mediaItemState6 = mediaItemState5;
                                                                    PlayerQueueUI_AjpBEmI$lambda$12 = PlayerQueueScreenKt.PlayerQueueUI_AjpBEmI$lambda$1(z0Var5);
                                                                    pVar6.invoke(mediaItemState6, PlayerQueueUI_AjpBEmI$lambda$12);
                                                                    safeHapticFeedback6.mo1982performHapticFeedbackCdsT49E(13);
                                                                }

                                                                @Override // ho.a
                                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                                    m1529invoke();
                                                                    return sn.z.f31622a;
                                                                }
                                                            };
                                                            qVar4.h0(L3);
                                                        }
                                                        ho.a aVar3 = (ho.a) L3;
                                                        n nVar = (n) jVar3;
                                                        nVar.getClass();
                                                        I.getClass();
                                                        lVar7.getClass();
                                                        aVar3.getClass();
                                                        t a10 = i3.a.a(new dt.m(nVar, dt.c.f8095a, lVar7, aVar3, 0), I);
                                                        f1 d10 = r1.p.d(i3.d.f12997a, false);
                                                        int hashCode = Long.hashCode(qVar4.T);
                                                        o l4 = qVar4.l();
                                                        t c5 = i3.a.c(a10, qVar4);
                                                        h.f11920i.getClass();
                                                        f fVar = g.f11903b;
                                                        qVar4.b0();
                                                        if (qVar4.S) {
                                                            qVar4.k(fVar);
                                                        } else {
                                                            qVar4.k0();
                                                        }
                                                        r.J(g.f11907f, d10, qVar4);
                                                        r.J(g.f11906e, l4, qVar4);
                                                        r.y(qVar4, Integer.valueOf(hashCode), g.f11908g);
                                                        r.F(g.f11909h, qVar4);
                                                        r.J(g.f11905d, c5, qVar4);
                                                        y2.a(kd.a.M(R.drawable.playlist_drag, qVar4, 0), null, p2.o(qVar5, 20), echoTheme.getColors(qVar4, i20).getIcon().getInactive(qVar4, EchoThemeColors.Icon.$stable), qVar4, u3.c.$stable | 432, 0);
                                                        qVar4.p(true);
                                                        return;
                                                    }
                                                    qVar4.R();
                                                }

                                                @Override // ho.p
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke((m) obj, ((Number) obj2).intValue());
                                                    return sn.z.f31622a;
                                                }
                                            }, qVar3), x1_5, Q, qVar3, 1572864, 0);
                                            return;
                                        }
                                        qVar3.R();
                                    }

                                    @Override // ho.r
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                        invoke((dt.j) obj, ((Boolean) obj2).booleanValue(), (m) obj3, ((Number) obj4).intValue());
                                        return sn.z.f31622a;
                                    }
                                }, qVar2), qVar2, 1575936);
                                return;
                            }
                            qVar2.R();
                        }

                        @Override // ho.p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((m) obj, ((Number) obj2).intValue());
                            return sn.z.f31622a;
                        }
                    }, qVar), qVar, 1572912, 52);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
        return sn.z.f31622a;
    }

    public static final Object PlayerQueueUI_AjpBEmI$lambda$8$0$0(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        return mediaItemState.getReadId();
    }

    public static final Object PlayerQueueUI_AjpBEmI$lambda$8$0$1(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        return "playlist_queue_item";
    }

    public static final sn.z PlayerQueueUI_AjpBEmI$lambda$9(float f10, PlayerQueueContract.UiState uiState, l lVar, p pVar, l lVar2, int i10, m mVar, int i11) {
        m1526PlayerQueueUIAjpBEmI(f10, uiState, lVar, pVar, lVar2, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerPlaylistScreen_EmptyQueue(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(155388710);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t h10 = l1.n.h(i3.q.f13017a, echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
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
            float x62 = echoTheme.getSpacings(qVar, i11).getX6();
            PlayerQueueContract.UiState.EmptyQueue emptyQueue = new PlayerQueueContract.UiState.EmptyQueue(new MediaItemState(WebrtcBuildVersion.maint_version, "The Origins of Efficiency", "Charles T. Munger, Peter D. Kaufman, Warren Buffett, John Collison", null, null, null));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(24);
                qVar.h0(L);
            }
            l lVar = (l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.a(6);
                qVar.h0(L2);
            }
            p pVar = (p) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(25);
                qVar.h0(L3);
            }
            m1526PlayerQueueUIAjpBEmI(x62, emptyQueue, lVar, pVar, (l) L3, qVar, 28032);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 11);
        }
    }

    public static final sn.z Preview_PlayerPlaylistScreen_EmptyQueue$lambda$0$0$0(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_EmptyQueue$lambda$0$1$0(MediaItemState mediaItemState, List list) {
        mediaItemState.getClass();
        list.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_EmptyQueue$lambda$0$2$0(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_EmptyQueue$lambda$1(int i10, m mVar, int i11) {
        Preview_PlayerPlaylistScreen_EmptyQueue(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerPlaylistScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-2071778424);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t h10 = l1.n.h(i3.q.f13017a, echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
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
            float x62 = echoTheme.getSpacings(qVar, i11).getX6();
            PlayerQueueContract.UiState.Loading loading = PlayerQueueContract.UiState.Loading.INSTANCE;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(26);
                qVar.h0(L);
            }
            l lVar = (l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.a(7);
                qVar.h0(L2);
            }
            p pVar = (p) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(27);
                qVar.h0(L3);
            }
            m1526PlayerQueueUIAjpBEmI(x62, loading, lVar, pVar, (l) L3, qVar, 28080);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 12);
        }
    }

    public static final sn.z Preview_PlayerPlaylistScreen_Loading$lambda$0$0$0(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_Loading$lambda$0$1$0(MediaItemState mediaItemState, List list) {
        mediaItemState.getClass();
        list.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_Loading$lambda$0$2$0(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_Loading$lambda$1(int i10, m mVar, int i11) {
        Preview_PlayerPlaylistScreen_Loading(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerPlaylistScreen_NonEmptyQueue(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-358003779);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t h10 = l1.n.h(i3.q.f13017a, echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
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
            float x62 = echoTheme.getSpacings(qVar, i11).getX6();
            PlayerQueueContract.UiState.NonEmptyQueue nonEmptyQueue = new PlayerQueueContract.UiState.NonEmptyQueue(new MediaItemState(WebrtcBuildVersion.maint_version, "The Origins of Efficiency", "Charles T. Munger, Peter D. Kaufman, Warren Buffett, John Collison", null, null, null), ig.f.H(new MediaItemState("1", "Poor Charlie’s Almanack: The Essential Wit and Wisdom of Charles T. Munger", "Charles T. Munger, Peter D. Kaufman, Warren Buffett, John Collison", null, null, null)));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(1);
                qVar.h0(L);
            }
            l lVar = (l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.a(8);
                qVar.h0(L2);
            }
            p pVar = (p) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(21);
                qVar.h0(L3);
            }
            m1526PlayerQueueUIAjpBEmI(x62, nonEmptyQueue, lVar, pVar, (l) L3, qVar, 28032);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 10);
        }
    }

    public static final sn.z Preview_PlayerPlaylistScreen_NonEmptyQueue$lambda$0$0$0(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_NonEmptyQueue$lambda$0$1$0(MediaItemState mediaItemState, List list) {
        mediaItemState.getClass();
        list.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_NonEmptyQueue$lambda$0$2$0(MediaItemState mediaItemState) {
        mediaItemState.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerPlaylistScreen_NonEmptyQueue$lambda$1(int i10, m mVar, int i11) {
        Preview_PlayerPlaylistScreen_NonEmptyQueue(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

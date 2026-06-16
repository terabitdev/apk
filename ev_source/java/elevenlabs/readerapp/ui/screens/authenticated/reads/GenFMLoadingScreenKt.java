package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i1.y0;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.VideoPlayerKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.p2;
import r1.z1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0011\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001b²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"", "readId", "Lkotlin/Function1;", "Lsn/z;", "onNavigateToPlayer", "Lkotlin/Function0;", "onNavigateToLibrary", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/GenFMLoadingViewModel;", "vm", "GenFMLoadingScreen", "(Ljava/lang/String;Lho/l;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/GenFMLoadingViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/GenFMLoadingState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "GenFMLoadingUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/GenFMLoadingState;Lho/l;Lho/a;Lu2/m;II)V", "Preview_GenFMLoadingScreen", "(Lu2/m;I)V", "Preview_GenFMLoadingScreen_Error", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/LoadingMessage;", "initialLoaderMessages", "Ljava/util/List;", "loopingLoaderMessages", "", "initialAnimationCompleted", "currentMessage", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GenFMLoadingScreenKt {
    private static final List<LoadingMessage> initialLoaderMessages;
    private static final List<LoadingMessage> loopingLoaderMessages;

    static {
        xq.a aVar = xq.b.f38124b;
        xq.d dVar = xq.d.SECONDS;
        initialLoaderMessages = ig.f.I(new LoadingMessage(xq.g.n(3, dVar), null, null), new LoadingMessage(xq.g.n(2, dVar), Integer.valueOf(R.string.genfm_loading_getting_ready), null), new LoadingMessage(xq.g.n(2, dVar), Integer.valueOf(R.string.genfm_loading_warming_studio), null), new LoadingMessage(xq.g.n(2, dVar), Integer.valueOf(R.string.genfm_loading_picking_voices), null), new LoadingMessage(xq.g.n(2, dVar), Integer.valueOf(R.string.genfm_loading_looking_cohost), null), new LoadingMessage(xq.g.n(5, dVar), Integer.valueOf(R.string.genfm_loading_found_them), null), new LoadingMessage(xq.g.n(6, dVar), Integer.valueOf(R.string.genfm_loading_hello_hosts), null), new LoadingMessage(xq.g.n(3, dVar), Integer.valueOf(R.string.genfm_loading_testing_mics), null));
        loopingLoaderMessages = ig.f.I(new LoadingMessage(xq.g.n(0, dVar), Integer.valueOf(R.string.genfm_loading_adding_personality), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_sparkling_umms), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_brewing_coffee), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_conversation_flowing), null), new LoadingMessage(xq.g.n(5, dVar), Integer.valueOf(R.string.genfm_loading_adding_natural_reactions), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_witty_banter), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_teaching_interrupt), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_chemistry), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_stay_on_topic), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_expert_insights), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_fascinating_observations), null), new LoadingMessage(xq.g.n(5, dVar), Integer.valueOf(R.string.genfm_loading_sound_natural), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_perfecting_timing), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_thoughtful_pauses), null), new LoadingMessage(xq.g.n(5, dVar), Integer.valueOf(R.string.genfm_loading_energy_levels), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_enthusiasm), null), new LoadingMessage(xq.g.n(5, dVar), Integer.valueOf(R.string.genfm_loading_podcast_magic), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_running_script), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_last_soundcheck), null), new LoadingMessage(xq.g.n(5, dVar), Integer.valueOf(R.string.genfm_loading_flows), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_insight), null), new LoadingMessage(xq.g.n(4, dVar), Integer.valueOf(R.string.genfm_loading_time_for_banter), null), new LoadingMessage(xq.g.n(5, dVar), null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenFMLoadingScreen(String str, ho.l lVar, ho.a aVar, GenFMLoadingViewModel genFMLoadingViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        GenFMLoadingViewModel genFMLoadingViewModel2;
        boolean z6;
        GenFMLoadingViewModel genFMLoadingViewModel3;
        q7.c cVar;
        GenFMLoadingViewModel genFMLoadingViewModel4;
        int i13;
        boolean z10;
        boolean z11;
        Object L;
        int i14;
        boolean z12;
        boolean z13;
        Object L2;
        boolean z14;
        Object L3;
        boolean h10;
        Object L4;
        int i15;
        int i16;
        int i17;
        int i18;
        str.getClass();
        lVar.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-687203153);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                genFMLoadingViewModel2 = genFMLoadingViewModel;
                if (qVar.h(genFMLoadingViewModel2)) {
                    i15 = 2048;
                    i12 |= i15;
                }
            } else {
                genFMLoadingViewModel2 = genFMLoadingViewModel;
            }
            i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i15;
        } else {
            genFMLoadingViewModel2 = genFMLoadingViewModel;
        }
        int i19 = i12;
        boolean z15 = false;
        if ((i19 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i19 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 8) != 0) {
                    i19 &= -7169;
                }
            } else if ((i11 & 8) != 0) {
                r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    int i20 = i19 & (-7169);
                    genFMLoadingViewModel4 = (GenFMLoadingViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(GenFMLoadingViewModel.class), a10, null, o6, cVar, qVar);
                    i13 = i20;
                    qVar.q();
                    GenFMLoadingState genFMLoadingState = (GenFMLoadingState) u2.r.o(genFMLoadingViewModel4.getStateFlow(), qVar, 0).getValue();
                    boolean h11 = qVar.h(genFMLoadingViewModel4);
                    if ((i13 & 14) != 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = h11 | z10;
                    L = qVar.L();
                    Object obj = u2.l.f33918a;
                    if (!z11 || L == obj) {
                        L = new GenFMLoadingScreenKt$GenFMLoadingScreen$1$1(genFMLoadingViewModel4, str, null);
                        qVar.h0(L);
                    }
                    u2.r.f((ho.p) L, str, qVar);
                    Boolean valueOf = Boolean.valueOf(genFMLoadingState.getNavigateBack());
                    boolean f10 = qVar.f(genFMLoadingState);
                    i14 = i13 & 896;
                    if (i14 != 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = f10 | z12;
                    L2 = qVar.L();
                    if (!z13 || L2 == obj) {
                        L2 = new GenFMLoadingScreenKt$GenFMLoadingScreen$2$1(genFMLoadingState, aVar, null);
                        qVar.h0(L2);
                    }
                    u2.r.f((ho.p) L2, valueOf, qVar);
                    Boolean valueOf2 = Boolean.valueOf(genFMLoadingState.getNavigateToPlayer());
                    String readId = genFMLoadingState.getReadId();
                    boolean f11 = qVar.f(genFMLoadingState);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    }
                    z14 = f11 | z15;
                    L3 = qVar.L();
                    if (!z14 || L3 == obj) {
                        L3 = new GenFMLoadingScreenKt$GenFMLoadingScreen$3$1(genFMLoadingState, lVar, null);
                        qVar.h0(L3);
                    }
                    u2.r.g(valueOf2, readId, (ho.p) L3, qVar);
                    h10 = qVar.h(genFMLoadingViewModel4);
                    L4 = qVar.L();
                    if (!h10 || L4 == obj) {
                        L4 = new o(genFMLoadingViewModel4, 0);
                        qVar.h0(L4);
                    }
                    GenFMLoadingUI(genFMLoadingState, (ho.l) L4, aVar, qVar, i14, 0);
                    genFMLoadingViewModel3 = genFMLoadingViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            i13 = i19;
            genFMLoadingViewModel4 = genFMLoadingViewModel2;
            qVar.q();
            GenFMLoadingState genFMLoadingState2 = (GenFMLoadingState) u2.r.o(genFMLoadingViewModel4.getStateFlow(), qVar, 0).getValue();
            boolean h112 = qVar.h(genFMLoadingViewModel4);
            if ((i13 & 14) != 4) {
            }
            z11 = h112 | z10;
            L = qVar.L();
            Object obj2 = u2.l.f33918a;
            if (!z11) {
            }
            L = new GenFMLoadingScreenKt$GenFMLoadingScreen$1$1(genFMLoadingViewModel4, str, null);
            qVar.h0(L);
            u2.r.f((ho.p) L, str, qVar);
            Boolean valueOf3 = Boolean.valueOf(genFMLoadingState2.getNavigateBack());
            boolean f102 = qVar.f(genFMLoadingState2);
            i14 = i13 & 896;
            if (i14 != 256) {
            }
            z13 = f102 | z12;
            L2 = qVar.L();
            if (!z13) {
            }
            L2 = new GenFMLoadingScreenKt$GenFMLoadingScreen$2$1(genFMLoadingState2, aVar, null);
            qVar.h0(L2);
            u2.r.f((ho.p) L2, valueOf3, qVar);
            Boolean valueOf22 = Boolean.valueOf(genFMLoadingState2.getNavigateToPlayer());
            String readId2 = genFMLoadingState2.getReadId();
            boolean f112 = qVar.f(genFMLoadingState2);
            if ((i13 & 112) == 32) {
            }
            z14 = f112 | z15;
            L3 = qVar.L();
            if (!z14) {
            }
            L3 = new GenFMLoadingScreenKt$GenFMLoadingScreen$3$1(genFMLoadingState2, lVar, null);
            qVar.h0(L3);
            u2.r.g(valueOf22, readId2, (ho.p) L3, qVar);
            h10 = qVar.h(genFMLoadingViewModel4);
            L4 = qVar.L();
            if (!h10) {
            }
            L4 = new o(genFMLoadingViewModel4, 0);
            qVar.h0(L4);
            GenFMLoadingUI(genFMLoadingState2, (ho.l) L4, aVar, qVar, i14, 0);
            genFMLoadingViewModel3 = genFMLoadingViewModel4;
        } else {
            qVar.R();
            genFMLoadingViewModel3 = genFMLoadingViewModel2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) str, lVar, aVar, (Object) genFMLoadingViewModel3, i10, i11, 26);
        }
    }

    public static final sn.z GenFMLoadingScreen$lambda$3$0(GenFMLoadingViewModel genFMLoadingViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(genFMLoadingViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z GenFMLoadingScreen$lambda$4(String str, ho.l lVar, ho.a aVar, GenFMLoadingViewModel genFMLoadingViewModel, int i10, int i11, u2.m mVar, int i12) {
        GenFMLoadingScreen(str, lVar, aVar, genFMLoadingViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenFMLoadingUI(GenFMLoadingState genFMLoadingState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        boolean z6;
        u2.q qVar;
        ho.l lVar3;
        ho.a aVar3;
        u2.r1 r10;
        ho.l lVar4;
        ho.a aVar4;
        int i16;
        genFMLoadingState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(347240337);
        if ((i10 & 6) == 0) {
            if (qVar2.f(genFMLoadingState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar2.h(lVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar2 = aVar;
                if (qVar2.h(aVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i12 & 1, z6)) {
                    u2.e eVar = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar2.L();
                        if (L == eVar) {
                            L = new j(14);
                            qVar2.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == eVar) {
                            L2 = new c(1);
                            qVar2.h0(L2);
                        }
                        aVar4 = (ho.a) L2;
                    } else {
                        aVar4 = aVar2;
                    }
                    Object L3 = qVar2.L();
                    if (L3 == eVar) {
                        L3 = u2.r.A(Boolean.FALSE);
                        qVar2.h0(L3);
                    }
                    z0 z0Var = (z0) L3;
                    i3.q qVar3 = i3.q.f13017a;
                    i3.t a10 = m3.h.a(qVar3, t2.u.P);
                    int i18 = R.raw.genfm_song;
                    long j4 = p3.x.f26427b;
                    Object L4 = qVar2.L();
                    if (L4 == eVar) {
                        L4 = new n(z0Var, 1);
                        qVar2.h0(L4);
                    }
                    ho.a aVar5 = aVar4;
                    VideoPlayerKt.m1884VideoPlayer_Ogyb9c(a10, i18, j4, (ho.a) null, (ho.a) L4, (ho.a) null, true, false, true, (Float) null, false, 0, (u2.m) qVar2, 102261126, 0, 3752);
                    qVar = qVar2;
                    k5.a(l1.n.h(p2.d(qVar3, 1.0f), j4, p3.h0.f26395b), null, null, null, null, 0, j4, j4, null, c3.k.d(1221428576, true, new p(z0Var, genFMLoadingState, aVar5, lVar4), qVar2), qVar, 819462150, 318);
                    lVar3 = lVar4;
                    aVar3 = aVar5;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    lVar3 = lVar2;
                    aVar3 = aVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c((Object) genFMLoadingState, lVar3, aVar3, i10, i11, 20);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            if ((i12 & 147) != 146) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar2 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        if ((i12 & 147) != 146) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z GenFMLoadingUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    private static final boolean GenFMLoadingUI$lambda$3(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void GenFMLoadingUI$lambda$4(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z GenFMLoadingUI$lambda$5$0(z0 z0Var) {
        GenFMLoadingUI$lambda$4(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z GenFMLoadingUI$lambda$6(z0 z0Var, GenFMLoadingState genFMLoadingState, ho.a aVar, ho.l lVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
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
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t D = r1.d.D(p2.d(qVar3, 1.0f), z1Var);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(D, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar2);
            i3.t d11 = p2.d(qVar3, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29234g, i3.d.C0, qVar2, 54);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(d11, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, a10, qVar2);
            u2.r.J(eVar2, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c10, qVar2);
            boolean GenFMLoadingUI$lambda$3 = GenFMLoadingUI$lambda$3(z0Var);
            i3.t e10 = p2.e(p2.u(qVar3, t2.u.P, 500, 1), 1.0f);
            r1.z zVar = r1.z.f29398a;
            i3.t c11 = zVar.c(e10, 0.6f, true);
            i3.l lVar2 = i3.d.f13001e;
            i1.l.b(Boolean.valueOf(GenFMLoadingUI$lambda$3), c11, null, lVar2, "video", null, c3.k.d(541853377, true, new q(z0Var, 0), qVar2), qVar2, 1600512, 36);
            i3.t e11 = p2.e(zVar.c(qVar3, 0.4f, true), 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar2, i13, e11);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode3 = Long.hashCode(qVar2.T);
            c3.o l10 = qVar2.l();
            i3.t c12 = i3.a.c(x10, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, a11, qVar2);
            u2.r.J(eVar2, l10, qVar2);
            defpackage.f.u(hashCode3, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c12, qVar2);
            boolean m02 = wq.n.m0(genFMLoadingState.getError());
            u2.e eVar5 = u2.l.f33918a;
            if (m02) {
                qVar2.X(1540416522);
                Object L = qVar2.L();
                if (L == eVar5) {
                    L = u2.r.A(tn.o.w0(initialLoaderMessages));
                    qVar2.h0(L);
                }
                z0 z0Var2 = (z0) L;
                LoadingMessage GenFMLoadingUI$lambda$6$0$0$1$1 = GenFMLoadingUI$lambda$6$0$0$1$1(z0Var2);
                Object L2 = qVar2.L();
                if (L2 == eVar5) {
                    L2 = new GenFMLoadingScreenKt$GenFMLoadingUI$4$1$1$2$1$1(z0Var2, null);
                    qVar2.h0(L2);
                }
                u2.r.f((ho.p) L2, GenFMLoadingUI$lambda$6$0$0$1$1, qVar2);
                LoadingMessage GenFMLoadingUI$lambda$6$0$0$1$12 = GenFMLoadingUI$lambda$6$0$0$1$1(z0Var2);
                i3.t c13 = zVar.c(qVar3, 1.0f, true);
                Object L3 = qVar2.L();
                if (L3 == eVar5) {
                    L3 = new j(15);
                    qVar2.h0(L3);
                }
                ho.l lVar3 = (ho.l) L3;
                Object L4 = qVar2.L();
                if (L4 == eVar5) {
                    L4 = new j(1);
                    qVar2.h0(L4);
                }
                i1.l.b(GenFMLoadingUI$lambda$6$0$0$1$12, c13, lVar3, null, "message", (ho.l) L4, ComposableSingletons$GenFMLoadingScreenKt.INSTANCE.getLambda$1637749807$app_productionRelease(), qVar2, 1794432, 8);
                String R = kj.c.R(qVar2, R.string.genfm_notify_when_ready);
                ButtonVariant buttonVariant = ButtonVariant.Dark;
                ButtonSize buttonSize = ButtonSize.Medium;
                i3.t e12 = p2.e(qVar3, 1.0f);
                boolean f10 = qVar2.f(aVar);
                Object L5 = qVar2.L();
                if (f10 || L5 == eVar5) {
                    L5 = new f(1, aVar);
                    qVar2.h0(L5);
                }
                ButtonKt.Button(R, (ho.a) L5, e12, buttonSize, buttonVariant, null, null, false, false, false, qVar2, 28032, 992);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar2.X(1543567238);
                i3.t c14 = zVar.c(qVar3, 1.0f, true);
                f1 d12 = r1.p.d(lVar2, false);
                int hashCode4 = Long.hashCode(qVar2.T);
                c3.o l11 = qVar2.l();
                i3.t c15 = i3.a.c(c14, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(eVar, d12, qVar2);
                u2.r.J(eVar2, l11, qVar2);
                defpackage.f.u(hashCode4, qVar2, eVar3, qVar2, dVar);
                u2.r.J(eVar4, c15, qVar2);
                j7.d(genFMLoadingState.getError(), p2.e(qVar3, 1.0f), p3.x.f26431f, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i13).getTitleLarge700Inter(), qVar2, 432, 0, 130040);
                qVar2.p(true);
                String R2 = kj.c.R(qVar2, R.string.common_retry);
                ButtonVariant buttonVariant2 = ButtonVariant.Dark;
                ButtonSize buttonSize2 = ButtonSize.Medium;
                i3.t e13 = p2.e(qVar3, 1.0f);
                boolean f11 = qVar2.f(lVar);
                Object L6 = qVar2.L();
                if (f11 || L6 == eVar5) {
                    L6 = new a(lVar, 1);
                    qVar2.h0(L6);
                }
                ButtonKt.Button(R2, (ho.a) L6, e13, buttonSize2, buttonVariant2, null, null, false, false, false, qVar2, 28032, 992);
                qVar = qVar2;
                qVar.p(false);
            }
            p.n.t(qVar, true, true, true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z GenFMLoadingUI$lambda$6$0$0$0(z0 z0Var, i1.o oVar, boolean z6, u2.m mVar, int i10) {
        oVar.getClass();
        i3.q qVar = i3.q.f13017a;
        if (!z6) {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(1866898187);
            i3.t d10 = p2.d(qVar, 1.0f);
            int i11 = R.raw.genfm_loading;
            long j4 = p3.x.f26427b;
            Object L = qVar2.L();
            if (L == u2.l.f33918a) {
                L = new n(z0Var, 0);
                qVar2.h0(L);
            }
            VideoPlayerKt.m1884VideoPlayer_Ogyb9c(d10, i11, j4, (ho.a) null, (ho.a) L, (ho.a) null, false, false, false, (Float) null, false, 0, (u2.m) qVar2, 24966, 0, 4072);
            qVar2.p(false);
        } else {
            u2.q qVar3 = (u2.q) mVar;
            qVar3.X(1867274279);
            VideoPlayerKt.m1884VideoPlayer_Ogyb9c(p2.d(qVar, 1.0f), R.raw.genfm_looping, p3.x.f26427b, (ho.a) null, (ho.a) null, (ho.a) null, true, false, false, (Float) null, false, 0, (u2.m) qVar3, 1573254, 0, 4024);
            qVar3.p(false);
        }
        return sn.z.f31622a;
    }

    public static final sn.z GenFMLoadingUI$lambda$6$0$0$0$0$0(z0 z0Var) {
        GenFMLoadingUI$lambda$4(z0Var, true);
        return sn.z.f31622a;
    }

    public static final LoadingMessage GenFMLoadingUI$lambda$6$0$0$1$1(z0 z0Var) {
        return (LoadingMessage) z0Var.getValue();
    }

    public static final i1.m0 GenFMLoadingUI$lambda$6$0$0$1$4$0(i1.q qVar) {
        qVar.getClass();
        return i1.l.c(y0.e(j1.e.s(220, 0, null, 6), 2).a(y0.l(new j(11), j1.e.s(220, 0, null, 6))), y0.f(j1.e.s(220, 0, null, 6), 2).a(y0.o(new j(12), j1.e.s(220, 0, null, 6))));
    }

    public static final int GenFMLoadingUI$lambda$6$0$0$1$4$0$0(int i10) {
        return i10 / 3;
    }

    public static final int GenFMLoadingUI$lambda$6$0$0$1$4$0$1(int i10) {
        return (-i10) / 3;
    }

    public static final Object GenFMLoadingUI$lambda$6$0$0$1$5$0(LoadingMessage loadingMessage) {
        loadingMessage.getClass();
        return loadingMessage.getMessage();
    }

    public static final sn.z GenFMLoadingUI$lambda$6$0$0$1$6$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z GenFMLoadingUI$lambda$6$0$0$1$8$0(ho.l lVar) {
        lVar.invoke(new j(13));
        return sn.z.f31622a;
    }

    public static final sn.z GenFMLoadingUI$lambda$6$0$0$1$8$0$0(GenFMLoadingViewModel genFMLoadingViewModel) {
        genFMLoadingViewModel.getClass();
        genFMLoadingViewModel.retry();
        return sn.z.f31622a;
    }

    public static final sn.z GenFMLoadingUI$lambda$7(GenFMLoadingState genFMLoadingState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        GenFMLoadingUI(genFMLoadingState, lVar, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_GenFMLoadingScreen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(677981795);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            GenFMLoadingUI(new GenFMLoadingState(null, false, false, null, false, 31, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 15);
        }
    }

    public static final sn.z Preview_GenFMLoadingScreen$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_GenFMLoadingScreen(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_GenFMLoadingScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2142616396);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            GenFMLoadingUI(new GenFMLoadingState(null, false, false, "Some error", false, 23, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 16);
        }
    }

    public static final sn.z Preview_GenFMLoadingScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_GenFMLoadingScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

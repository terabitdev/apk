package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import a2.k3;
import a2.o0;
import androidx.fragment.app.n0;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i1.j2;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.domain.model.BasicReadMeta;
import io.elevenlabs.domain.model.GenreTilesGridRow;
import io.elevenlabs.domain.model.HighlightedCollectionsRowSection;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.model.ReadFromFollowingSection;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.StatsCarouselSection;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.AnnouncementBannerCarouselKt;
import io.elevenlabs.readerapp.ui.components.MiniReadGridKt;
import io.elevenlabs.readerapp.ui.components.WhatsNewPopupKt;
import io.elevenlabs.readerapp.ui.components.homev3.CategorieReadsRowKt;
import io.elevenlabs.readerapp.ui.components.homev3.EmptyStateSectionKt;
import io.elevenlabs.readerapp.ui.components.homev3.GenreTilesGridRowKt;
import io.elevenlabs.readerapp.ui.components.homev3.HighlightedCollectionsRowKt;
import io.elevenlabs.readerapp.ui.components.homev3.ReadFromFollowingRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.HomeActionListSectionV2Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.HomeReadsCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.HomeStatsCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.t0;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ChipIconPosition;
import io.elevenlabs.ui.components.ChipKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.SearchButtonKt;
import io.elevenlabs.ui.components.SectionHeaderStyle;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.headers.EchoHeaderStyle;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import q2.y2;
import r1.c3;
import r1.d2;
import r1.i0;
import r1.l2;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import sn.z;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a©\u0001\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aÙ\u0001\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001as\u0010\u001f\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0004\b!\u0010\"\u001as\u0010'\u001a\u00020\u0001*\u00020#2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b'\u0010(\u001a3\u0010-\u001a\u00020\u00012\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00072\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0004\b-\u0010.\u001a\u000f\u0010/\u001a\u00020\u0001H\u0007¢\u0006\u0004\b/\u0010\"\u001a\u000f\u00100\u001a\u00020\u0001H\u0007¢\u0006\u0004\b0\u0010\"\u001a\u000f\u00101\u001a\u00020\u0001H\u0007¢\u0006\u0004\b1\u0010\"\u001a\u000f\u00102\u001a\u00020\u0001H\u0007¢\u0006\u0004\b2\u0010\"\u001a\u000f\u00103\u001a\u00020\u0001H\u0007¢\u0006\u0004\b3\u0010\"\u001a\u000f\u00104\u001a\u00020\u0001H\u0007¢\u0006\u0004\b4\u0010\"¨\u0006<²\u0006\u000e\u00106\u001a\u0002058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00107\u001a\u0002058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u0002088\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010:\u001a\u0002058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010;\u001a\u0002088\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onNavigateToSettings", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeViewModelV3;", "vm", "bottomBar", "Lkotlin/Function2;", "", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToRead", "onNavigateToPlayer", "Lkotlin/Function1;", "onNavigateToDeeplink", "onNavigateToSearch", "onNavigateToVoiceDesign", "Li1/j2;", "sharedTransitionScope", "Li1/o;", "animatedContentScope", "HomeScreenV3", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeViewModelV3;Lho/p;Lho/p;Lho/p;Lho/l;Lho/a;Lho/a;Li1/j2;Li1/o;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeStateV3;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lua/b;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "subpagePagingItems", "action", "miniPlayer", "HomeScreenV3UI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeStateV3;Lua/b;Lho/l;Lho/a;Lho/p;Lho/p;Lho/l;Lho/l;Lho/a;Lho/a;Li1/j2;Li1/o;Lu2/m;III)V", "Lt1/t;", "homeItems", "(Lt1/t;Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeStateV3;Lua/b;Lho/l;Lho/l;Lho/l;)V", "LoaderItem", "(Lu2/m;I)V", "Lt1/b;", "section", "Li3/t;", "modifier", "HomeSectionContent", "(Lt1/b;Lio/elevenlabs/domain/model/home/HomePageV3$Section;Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeStateV3;Lho/l;Lho/l;Lho/l;Li3/t;Lu2/m;I)V", "Lio/elevenlabs/domain/model/home/HomePageV3;", "homePage", "selectedSubpageId", "onChipClick", "SubpageChipsRow", "(Lio/elevenlabs/domain/model/home/HomePageV3;Ljava/lang/String;Lho/l;Lu2/m;I)V", "Preview_HomeScreenV3_idle", "Preview_HomeScreenV3_loading", "Preview_HomeScreenV3_error", "Preview_HomeScreenV3_loaded", "Preview_HomeScreenV3_warning", "Preview_HomeScreenV3_playing", "", "shouldRequestPermission", "hasCheckedPermission", "", "headerHeight", "headerVisible", "miniPlayerHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeScreenV3Kt {
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeScreenV3(ho.a aVar, HomeViewModelV3 homeViewModelV3, ho.p pVar, ho.p pVar2, ho.p pVar3, ho.l lVar, ho.a aVar2, ho.a aVar3, j2 j2Var, i1.o oVar, u2.m mVar, int i10, int i11) {
        int i12;
        HomeViewModelV3 homeViewModelV32;
        boolean z6;
        HomeViewModelV3 homeViewModelV33;
        q7.c cVar;
        HomeViewModelV3 homeViewModelV34;
        boolean h10;
        Object L;
        Object obj;
        Object L2;
        z0 z0Var;
        Object L3;
        boolean h11;
        Object L4;
        boolean h12;
        Object L5;
        int i13;
        boolean h13;
        Object L6;
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
        aVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        j2Var.getClass();
        oVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1036037905);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                homeViewModelV32 = homeViewModelV3;
                if (qVar.h(homeViewModelV32)) {
                    i22 = 32;
                    i12 |= i22;
                }
            } else {
                homeViewModelV32 = homeViewModelV3;
            }
            i22 = 16;
            i12 |= i22;
        } else {
            homeViewModelV32 = homeViewModelV3;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(pVar)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(pVar2)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(pVar3)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i19;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(lVar)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        }
        if ((1572864 & i10) == 0) {
            if (qVar.h(aVar2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((12582912 & i10) == 0) {
            if (qVar.h(aVar3)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((100663296 & i10) == 0) {
            if (qVar.f(j2Var)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i12 |= i15;
        }
        if ((805306368 & i10) == 0) {
            if (qVar.h(oVar)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i12 |= i14;
        }
        if ((306783379 & i12) != 306783378) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                int i24 = i11 & 2;
            } else if ((i11 & 2) != 0) {
                r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    homeViewModelV34 = (HomeViewModelV3) gg.b.j0(e0.f20562a.b(HomeViewModelV3.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    boolean rememberIsAppInForeground = ComposeExtensionsKt.rememberIsAppInForeground(qVar, 0);
                    Boolean valueOf = Boolean.valueOf(rememberIsAppInForeground);
                    h10 = qVar.h(homeViewModelV34) | qVar.g(rememberIsAppInForeground);
                    L = qVar.L();
                    obj = u2.l.f33918a;
                    if (!h10 || L == obj) {
                        L = new HomeScreenV3Kt$HomeScreenV3$1$1(homeViewModelV34, rememberIsAppInForeground, null);
                        qVar.h0(L);
                    }
                    u2.r.f((ho.p) L, valueOf, qVar);
                    L2 = qVar.L();
                    if (L2 == obj) {
                        L2 = u2.r.A(Boolean.FALSE);
                        qVar.h0(L2);
                    }
                    z0Var = (z0) L2;
                    L3 = qVar.L();
                    if (L3 == obj) {
                        L3 = u2.r.A(Boolean.FALSE);
                        qVar.h0(L3);
                    }
                    z0 z0Var2 = (z0) L3;
                    n0 n0Var = new n0(2);
                    h11 = qVar.h(homeViewModelV34);
                    L4 = qVar.L();
                    if (!h11 || L4 == obj) {
                        L4 = new g(homeViewModelV34, 1);
                        qVar.h0(L4);
                    }
                    j.j C = android.support.v4.media.session.b.C(n0Var, (ho.l) L4, qVar, 0);
                    h12 = qVar.h(homeViewModelV34);
                    L5 = qVar.L();
                    if (!h12 || L5 == obj) {
                        L5 = new HomeScreenV3Kt$HomeScreenV3$2$1(homeViewModelV34, z0Var2, z0Var, null);
                        qVar.h0(L5);
                    }
                    z zVar = z.f31622a;
                    u2.r.f((ho.p) L5, zVar, qVar);
                    if (!HomeScreenV3$lambda$2(z0Var)) {
                        qVar.X(-968527628);
                        boolean h14 = qVar.h(C);
                        Object L7 = qVar.L();
                        if (h14 || L7 == obj) {
                            L7 = new HomeScreenV3Kt$HomeScreenV3$3$1(C, z0Var, null);
                            qVar.h0(L7);
                        }
                        u2.r.f((ho.p) L7, zVar, qVar);
                        i13 = 0;
                        qVar.p(false);
                    } else {
                        i13 = 0;
                        qVar.X(-968344077);
                        qVar.p(false);
                    }
                    HomeStateV3 homeStateV3 = (HomeStateV3) u2.r.o(homeViewModelV34.getStateFlow(), qVar, i13).getValue();
                    ua.b a11 = ua.d.a(homeViewModelV34.getSubpagePagingData(), qVar);
                    boolean showNotificationPrimerSheet = homeStateV3.getShowNotificationPrimerSheet();
                    NotificationPrimerSource notificationPrimerSource = homeStateV3.getNotificationPrimerSource();
                    NotificationPrimerModel notificationPrimerModel = homeStateV3.getNotificationPrimerModel();
                    h13 = qVar.h(homeViewModelV34);
                    L6 = qVar.L();
                    if (!h13 || L6 == obj) {
                        L6 = new a(homeViewModelV34, 2);
                        qVar.h0(L6);
                    }
                    NotificationPrimerBottomSheetKt.NotificationPrimerOverlay(showNotificationPrimerSheet, notificationPrimerSource, notificationPrimerModel, (ho.a) L6, c3.k.d(-1331359508, true, new io.elevenlabs.readerapp.ui.screens.authenticated.explore.l(homeStateV3, a11, homeViewModelV34, aVar, pVar, pVar2, lVar, aVar2, aVar3, j2Var, oVar, pVar3), qVar), qVar, 24576);
                    homeViewModelV33 = homeViewModelV34;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            homeViewModelV34 = homeViewModelV32;
            qVar.q();
            boolean rememberIsAppInForeground2 = ComposeExtensionsKt.rememberIsAppInForeground(qVar, 0);
            Boolean valueOf2 = Boolean.valueOf(rememberIsAppInForeground2);
            h10 = qVar.h(homeViewModelV34) | qVar.g(rememberIsAppInForeground2);
            L = qVar.L();
            obj = u2.l.f33918a;
            if (!h10) {
            }
            L = new HomeScreenV3Kt$HomeScreenV3$1$1(homeViewModelV34, rememberIsAppInForeground2, null);
            qVar.h0(L);
            u2.r.f((ho.p) L, valueOf2, qVar);
            L2 = qVar.L();
            if (L2 == obj) {
            }
            z0Var = (z0) L2;
            L3 = qVar.L();
            if (L3 == obj) {
            }
            z0 z0Var22 = (z0) L3;
            n0 n0Var2 = new n0(2);
            h11 = qVar.h(homeViewModelV34);
            L4 = qVar.L();
            if (!h11) {
            }
            L4 = new g(homeViewModelV34, 1);
            qVar.h0(L4);
            j.j C2 = android.support.v4.media.session.b.C(n0Var2, (ho.l) L4, qVar, 0);
            h12 = qVar.h(homeViewModelV34);
            L5 = qVar.L();
            if (!h12) {
            }
            L5 = new HomeScreenV3Kt$HomeScreenV3$2$1(homeViewModelV34, z0Var22, z0Var, null);
            qVar.h0(L5);
            z zVar2 = z.f31622a;
            u2.r.f((ho.p) L5, zVar2, qVar);
            if (!HomeScreenV3$lambda$2(z0Var)) {
            }
            HomeStateV3 homeStateV32 = (HomeStateV3) u2.r.o(homeViewModelV34.getStateFlow(), qVar, i13).getValue();
            ua.b a112 = ua.d.a(homeViewModelV34.getSubpagePagingData(), qVar);
            boolean showNotificationPrimerSheet2 = homeStateV32.getShowNotificationPrimerSheet();
            NotificationPrimerSource notificationPrimerSource2 = homeStateV32.getNotificationPrimerSource();
            NotificationPrimerModel notificationPrimerModel2 = homeStateV32.getNotificationPrimerModel();
            h13 = qVar.h(homeViewModelV34);
            L6 = qVar.L();
            if (!h13) {
            }
            L6 = new a(homeViewModelV34, 2);
            qVar.h0(L6);
            NotificationPrimerBottomSheetKt.NotificationPrimerOverlay(showNotificationPrimerSheet2, notificationPrimerSource2, notificationPrimerModel2, (ho.a) L6, c3.k.d(-1331359508, true, new io.elevenlabs.readerapp.ui.screens.authenticated.explore.l(homeStateV32, a112, homeViewModelV34, aVar, pVar, pVar2, lVar, aVar2, aVar3, j2Var, oVar, pVar3), qVar), qVar, 24576);
            homeViewModelV33 = homeViewModelV34;
        } else {
            qVar.R();
            homeViewModelV33 = homeViewModelV32;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new f(aVar, homeViewModelV33, pVar, pVar2, pVar3, lVar, aVar2, aVar3, j2Var, oVar, i10, i11);
        }
    }

    public static final z HomeScreenV3$lambda$10$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.hideNotificationPrimer();
        return z.f31622a;
    }

    public static final z HomeScreenV3$lambda$11(HomeStateV3 homeStateV3, ua.b bVar, HomeViewModelV3 homeViewModelV3, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar, ho.a aVar2, ho.a aVar3, j2 j2Var, i1.o oVar, ho.p pVar3, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(homeViewModelV3);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (h10 || L == eVar) {
                L = new g(homeViewModelV3, 0);
                qVar.h0(L);
            }
            ho.l lVar2 = (ho.l) L;
            c3.j d10 = c3.k.d(-1141865190, true, new m(pVar3, 0), qVar);
            boolean f10 = qVar.f(pVar2);
            Object L2 = qVar.L();
            if (f10 || L2 == eVar) {
                L2 = new e(pVar2, 1);
                qVar.h0(L2);
            }
            HomeScreenV3UI(homeStateV3, bVar, lVar2, aVar, pVar, d10, (ho.l) L2, lVar, aVar2, aVar3, j2Var, oVar, qVar, 196672, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV3$lambda$11$0$0(HomeViewModelV3 homeViewModelV3, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(homeViewModelV3);
        return z.f31622a;
    }

    public static final z HomeScreenV3$lambda$11$1(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(pVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new e(pVar, 0);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(t2.u.P, false, 0L, (ho.l) L, null, qVar, 0, 23);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV3$lambda$11$1$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return z.f31622a;
    }

    public static final z HomeScreenV3$lambda$11$2$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.HomeItems);
        return z.f31622a;
    }

    public static final z HomeScreenV3$lambda$12(ho.a aVar, HomeViewModelV3 homeViewModelV3, ho.p pVar, ho.p pVar2, ho.p pVar3, ho.l lVar, ho.a aVar2, ho.a aVar3, j2 j2Var, i1.o oVar, int i10, int i11, u2.m mVar, int i12) {
        HomeScreenV3(aVar, homeViewModelV3, pVar, pVar2, pVar3, lVar, aVar2, aVar3, j2Var, oVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final boolean HomeScreenV3$lambda$2(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void HomeScreenV3$lambda$3(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final boolean HomeScreenV3$lambda$5(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void HomeScreenV3$lambda$6(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z HomeScreenV3$lambda$7$0(HomeViewModelV3 homeViewModelV3, Map map) {
        boolean z6;
        map.getClass();
        Boolean bool = (Boolean) map.get("android.permission.POST_NOTIFICATIONS");
        if (bool != null) {
            z6 = bool.booleanValue();
        } else {
            z6 = false;
        }
        homeViewModelV3.onNotificationPermissionResult(z6);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeScreenV3UI(HomeStateV3 homeStateV3, ua.b bVar, ho.l lVar, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar2, ho.l lVar3, ho.a aVar2, ho.a aVar3, j2 j2Var, i1.o oVar, u2.m mVar, int i10, int i11, int i12) {
        int i13;
        ho.a aVar4;
        int i14;
        int i15;
        ho.p pVar3;
        int i16;
        int i17;
        ho.p pVar4;
        int i18;
        int i19;
        ho.l lVar4;
        int i20;
        int i21;
        ho.l lVar5;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z6;
        u2.q qVar;
        ho.a aVar5;
        i1.o oVar2;
        ho.l lVar6;
        ho.a aVar6;
        ho.p pVar5;
        ho.a aVar7;
        j2 j2Var2;
        ho.l lVar7;
        ho.p pVar6;
        u2.r1 r10;
        int i36;
        ho.a aVar8;
        ho.p pVar7;
        int i37;
        ho.l lVar8;
        ho.l lVar9;
        ho.a aVar9;
        j2 j2Var3;
        i1.o oVar3;
        int i38;
        boolean h10;
        int i39;
        int i40;
        homeStateV3.getClass();
        bVar.getClass();
        lVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(771422785);
        if ((i10 & 6) == 0) {
            if (qVar2.h(homeStateV3)) {
                i40 = 4;
            } else {
                i40 = 2;
            }
            i13 = i40 | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar2.f(bVar);
            } else {
                h10 = qVar2.h(bVar);
            }
            if (h10) {
                i39 = 32;
            } else {
                i39 = 16;
            }
            i13 |= i39;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i38 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i38 = 128;
            }
            i13 |= i38;
        }
        int i41 = i12 & 8;
        if (i41 != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            aVar4 = aVar;
            if (qVar2.h(aVar4)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                pVar3 = pVar;
                if (qVar2.h(pVar3)) {
                    i16 = 16384;
                } else {
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i16;
                i17 = i12 & 32;
                if (i17 != 0) {
                    i13 |= 196608;
                    pVar4 = pVar2;
                } else {
                    pVar4 = pVar2;
                    if ((i10 & 196608) == 0) {
                        if (qVar2.h(pVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    lVar4 = lVar2;
                } else {
                    lVar4 = lVar2;
                    if ((i10 & 1572864) == 0) {
                        if (qVar2.h(lVar4)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                    lVar5 = lVar3;
                } else {
                    lVar5 = lVar3;
                    if ((i10 & 12582912) == 0) {
                        if (qVar2.h(lVar5)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                }
                i23 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i23 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    i24 = i23;
                    if (qVar2.h(aVar2)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i13 |= i25;
                    i26 = i12 & 512;
                    if (i26 == 0) {
                        i27 = i26;
                        i28 = i13 | 805306368;
                    } else {
                        if ((i10 & 805306368) == 0) {
                            i27 = i26;
                            if (qVar2.h(aVar3)) {
                                i29 = 536870912;
                            } else {
                                i29 = 268435456;
                            }
                            i13 |= i29;
                        } else {
                            i27 = i26;
                        }
                        i28 = i13;
                    }
                    i30 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i30 == 0) {
                        i31 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (qVar2.f(j2Var)) {
                            i32 = 4;
                        } else {
                            i32 = 2;
                        }
                        i31 = i11 | i32;
                    } else {
                        i31 = i11;
                    }
                    i33 = i12 & 2048;
                    if (i33 == 0) {
                        i31 |= 48;
                    } else if ((i11 & 48) == 0) {
                        i34 = i33;
                        if (qVar2.h(oVar)) {
                            i35 = 32;
                        } else {
                            i35 = 16;
                        }
                        i31 |= i35;
                        if ((i28 & 306783379) != 306783378 && (i31 & 19) == 18) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (qVar2.O(i28 & 1, z6)) {
                            Object obj = u2.l.f33918a;
                            if (i41 != 0) {
                                Object L = qVar2.L();
                                if (L == obj) {
                                    L = new o(1);
                                    qVar2.h0(L);
                                }
                                aVar8 = (ho.a) L;
                                i36 = i15;
                            } else {
                                i36 = i15;
                                aVar8 = aVar4;
                            }
                            if (i36 != 0) {
                                pVar7 = ComposableSingletons$HomeScreenV3Kt.INSTANCE.m1411getLambda$1951858779$app_productionRelease();
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i17 != 0) {
                                pVar4 = ComposableSingletons$HomeScreenV3Kt.INSTANCE.getLambda$1476413915$app_productionRelease();
                            }
                            ho.p pVar8 = pVar4;
                            if (i19 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == obj) {
                                    L2 = new u(15);
                                    qVar2.h0(L2);
                                }
                                lVar8 = (ho.l) L2;
                                i37 = i30;
                            } else {
                                i37 = i30;
                                lVar8 = lVar4;
                            }
                            if (i21 != 0) {
                                Object L3 = qVar2.L();
                                if (L3 == obj) {
                                    L3 = new u(16);
                                    qVar2.h0(L3);
                                }
                                lVar9 = (ho.l) L3;
                            } else {
                                lVar9 = lVar5;
                            }
                            if (i24 != 0) {
                                Object L4 = qVar2.L();
                                if (L4 == obj) {
                                    L4 = new o(2);
                                    qVar2.h0(L4);
                                }
                                aVar7 = (ho.a) L4;
                            } else {
                                aVar7 = aVar2;
                            }
                            if (i27 != 0) {
                                Object L5 = qVar2.L();
                                if (L5 == obj) {
                                    L5 = new o(3);
                                    qVar2.h0(L5);
                                }
                                aVar9 = (ho.a) L5;
                            } else {
                                aVar9 = aVar3;
                            }
                            if (i37 != 0) {
                                j2Var3 = null;
                            } else {
                                j2Var3 = j2Var;
                            }
                            if (i34 != 0) {
                                oVar3 = null;
                            } else {
                                oVar3 = oVar;
                            }
                            long primary = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable);
                            WeakHashMap weakHashMap = c3.f29142x;
                            qVar = qVar2;
                            k5.a(null, null, pVar7, null, null, 0, primary, 0L, new i0(u0.e(qVar2).f29154l, new o1(u0.e(qVar2).f29154l, 16)), c3.k.d(1414749586, true, new io.elevenlabs.readerapp.ui.screens.authenticated.explore.n(homeStateV3, bVar, lVar, lVar8, lVar9, aVar9, j2Var3, oVar3, aVar7, aVar8, pVar8), qVar2), qVar, ((i28 >> 6) & 896) | 805306368, 187);
                            j2 j2Var4 = j2Var3;
                            lVar7 = lVar8;
                            aVar6 = aVar8;
                            aVar5 = aVar9;
                            pVar6 = pVar8;
                            j2Var2 = j2Var4;
                            oVar2 = oVar3;
                            lVar6 = lVar9;
                            pVar5 = pVar7;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            aVar5 = aVar3;
                            oVar2 = oVar;
                            lVar6 = lVar5;
                            aVar6 = aVar4;
                            pVar5 = pVar3;
                            aVar7 = aVar2;
                            j2Var2 = j2Var;
                            lVar7 = lVar4;
                            pVar6 = pVar4;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.m(homeStateV3, bVar, lVar, aVar6, pVar5, pVar6, lVar7, lVar6, aVar7, aVar5, j2Var2, oVar2, i10, i11, i12);
                            return;
                        }
                        return;
                    }
                    i34 = i33;
                    if ((i28 & 306783379) != 306783378) {
                    }
                    z6 = true;
                    if (qVar2.O(i28 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                i24 = i23;
                i26 = i12 & 512;
                if (i26 == 0) {
                }
                i30 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i30 == 0) {
                }
                i33 = i12 & 2048;
                if (i33 == 0) {
                }
                i34 = i33;
                if ((i28 & 306783379) != 306783378) {
                }
                z6 = true;
                if (qVar2.O(i28 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            pVar3 = pVar;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            i19 = i12 & 64;
            if (i19 != 0) {
            }
            i21 = i12 & 128;
            if (i21 != 0) {
            }
            i23 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i23 != 0) {
            }
            i24 = i23;
            i26 = i12 & 512;
            if (i26 == 0) {
            }
            i30 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i30 == 0) {
            }
            i33 = i12 & 2048;
            if (i33 == 0) {
            }
            i34 = i33;
            if ((i28 & 306783379) != 306783378) {
            }
            z6 = true;
            if (qVar2.O(i28 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar4 = aVar;
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        pVar3 = pVar;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        i19 = i12 & 64;
        if (i19 != 0) {
        }
        i21 = i12 & 128;
        if (i21 != 0) {
        }
        i23 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i23 != 0) {
        }
        i24 = i23;
        i26 = i12 & 512;
        if (i26 == 0) {
        }
        i30 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i30 == 0) {
        }
        i33 = i12 & 2048;
        if (i33 == 0) {
        }
        i34 = i33;
        if ((i28 & 306783379) != 306783378) {
        }
        z6 = true;
        if (qVar2.O(i28 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z HomeScreenV3UI$lambda$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$2$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0(final HomeStateV3 homeStateV3, final ua.b bVar, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, ho.a aVar, j2 j2Var, i1.o oVar, ho.a aVar2, ho.a aVar3, ho.p pVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        z0 z0Var;
        x0 x0Var;
        i3.q qVar;
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
            Object[] objArr = new Object[0];
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new o(0);
                qVar2.h0(L);
            }
            x0 x0Var2 = (x0) f3.m.e(objArr, (ho.a) L, qVar2, 48);
            final float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(HomeScreenV3UI$lambda$5$0$1(x0Var2), (u2.m) qVar2, 0);
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = u2.r.A(Boolean.TRUE);
                qVar2.h0(L2);
            }
            z0 z0Var2 = (z0) L2;
            Object L3 = qVar2.L();
            if (L3 == eVar) {
                L3 = new r(z0Var2, 2);
                qVar2.h0(L3);
            }
            b4.a rememberUiVisibilityNestedScrollConnection = AnimatedVisibilityContainersKt.rememberUiVisibilityNestedScrollConnection(null, (ho.l) L3, qVar2, 48, 1);
            Object L4 = qVar2.L();
            if (L4 == eVar) {
                L4 = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
            }
            x0 x0Var3 = (x0) L4;
            final float rememberPxToDp2 = ComposeExtensionsKt.rememberPxToDp(HomeScreenV3UI$lambda$5$0$8(x0Var3), (u2.m) qVar2, 0);
            i3.q qVar3 = i3.q.f13017a;
            i3.t a10 = b4.f.a(p2.c(p2.d(qVar3, 1.0f), 1.0f), rememberUiVisibilityNestedScrollConnection, null);
            boolean c5 = qVar2.c(rememberPxToDp) | qVar2.h(homeStateV3) | qVar2.h(bVar) | qVar2.f(lVar) | qVar2.f(lVar2) | qVar2.f(lVar3) | qVar2.c(rememberPxToDp2);
            Object L5 = qVar2.L();
            if (!c5 && L5 != eVar) {
                x0Var = x0Var3;
                qVar = qVar3;
                z0Var = z0Var2;
            } else {
                z0Var = z0Var2;
                x0Var = x0Var3;
                qVar = qVar3;
                L5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.p
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z HomeScreenV3UI$lambda$5$0$10$0;
                        HomeScreenV3UI$lambda$5$0$10$0 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$10$0(HomeStateV3.this, bVar, lVar, lVar2, lVar3, rememberPxToDp, rememberPxToDp2, (t1.t) obj);
                        return HomeScreenV3UI$lambda$5$0$10$0;
                    }
                };
                qVar2.h0(L5);
            }
            x0 x0Var4 = x0Var;
            i3.q qVar4 = qVar;
            c1.c(a10, null, z1Var, false, null, null, null, false, null, (ho.l) L5, qVar2, (i11 << 6) & 896, 506);
            if (!wq.n.m0(homeStateV3.getError())) {
                qVar2.X(292225278);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(r1.d.D(qVar4, z1Var), null, homeStateV3.getError(), c3.k.d(1824022899, true, new m(lVar, 1), qVar2), null, EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable), qVar2, 3072, 18);
                qVar2.p(false);
            } else {
                qVar2.X(292748496);
                qVar2.p(false);
            }
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(homeStateV3.isLoading(), null, EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable), qVar2, 0, 2);
            AnimatedVisibilityContainersKt.AnimatedSlideTopVisibility(HomeScreenV3UI$lambda$5$0$4(z0Var), c3.k.d(-255461831, true, new id.l(x0Var2, j2Var, oVar, aVar2, lVar, aVar3), qVar2), qVar2, 48);
            i3.t D = r1.d.D(p2.d(qVar4, 1.0f), z1Var);
            f1 d10 = r1.p.d(i3.d.Z, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c10 = i3.a.c(D, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, d10, qVar2);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c10, qVar2);
            i3.t e10 = p2.e(qVar4, 1.0f);
            Object L6 = qVar2.L();
            if (L6 == eVar) {
                L6 = new i(x0Var4, 1);
                qVar2.h0(L6);
            }
            i3.t q = f4.i0.q(e10, (ho.l) L6);
            f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c11 = i3.a.c(q, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar2, d11, qVar2);
            u2.r.J(eVar3, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
            u2.r.J(eVar5, c11, qVar2);
            j0.c.r(0, pVar, qVar2, true, true);
            if (homeStateV3.getShowDailyStreakSettings()) {
                qVar2.X(296111934);
                boolean f10 = qVar2.f(lVar);
                Object L7 = qVar2.L();
                if (f10 || L7 == eVar) {
                    L7 = new h(lVar, 2);
                    qVar2.h0(L7);
                }
                ComposableSingletons$HomeScreenV3Kt composableSingletons$HomeScreenV3Kt = ComposableSingletons$HomeScreenV3Kt.INSTANCE;
                BottomSheetScaffoldKt.m1897BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, (ho.a) L7, composableSingletons$HomeScreenV3Kt.m1408getLambda$1087910177$app_productionRelease(), composableSingletons$HomeScreenV3Kt.m1407getLambda$1064061713$app_productionRelease(), (u2.m) qVar2, 1769472, 15);
                qVar2.p(false);
            } else {
                qVar2.X(296898032);
                qVar2.p(false);
            }
            if (homeStateV3.getShowWhatsNewPopup()) {
                qVar2.X(296949585);
                boolean f11 = qVar2.f(lVar);
                Object L8 = qVar2.L();
                if (f11 || L8 == eVar) {
                    L8 = new h(lVar, 3);
                    qVar2.h0(L8);
                }
                ho.a aVar4 = (ho.a) L8;
                boolean f12 = qVar2.f(lVar) | qVar2.f(aVar);
                Object L9 = qVar2.L();
                if (f12 || L9 == eVar) {
                    L9 = new k(lVar, aVar);
                    qVar2.h0(L9);
                }
                WhatsNewPopupKt.WhatsNewPopup(aVar4, (ho.a) L9, qVar2, 0);
                qVar2.p(false);
            } else {
                qVar2.X(297225392);
                qVar2.p(false);
            }
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final x0 HomeScreenV3UI$lambda$5$0$0$0() {
        return new u2.f1(250);
    }

    private static final int HomeScreenV3UI$lambda$5$0$1(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    public static final z HomeScreenV3UI$lambda$5$0$10$0(HomeStateV3 homeStateV3, ua.b bVar, ho.l lVar, ho.l lVar2, ho.l lVar3, float f10, float f11, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.g(f10, 2), true, 1585946663), 3);
        if (homeStateV3.getPage() != null) {
            homeItems(tVar, homeStateV3, bVar, lVar, lVar2, lVar3);
        }
        t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.g(f11, 3), true, -172244578), 3);
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$10$0$0(float f10, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, f10), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$10$0$1(float f10, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, f10), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$11(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new h(lVar, 0);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$11$0$0(ho.l lVar) {
        lVar.invoke(new u(4));
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$11$0$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.loadPage();
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$12(x0 x0Var, j2 j2Var, i1.o oVar, ho.a aVar, ho.l lVar, ho.a aVar2, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(x0Var);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new i(x0Var, 0);
                qVar.h0(L);
            }
            HeaderKt.EchoHeader(c3.k.d(1072901120, true, new j(j2Var, oVar, 0), qVar), f4.i0.q(i3.q.f13017a, (ho.l) L), c3.k.d(1379247874, true, new io.elevenlabs.readerapp.ui.screens.authenticated.a(j2Var, oVar, aVar, lVar, aVar2), qVar), EchoHeaderStyle.Large, null, null, qVar, 3462, 48);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$12$0$0(x0 x0Var, h5.l lVar) {
        HomeScreenV3UI$lambda$5$0$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$12$1(j2 j2Var, i1.o oVar, l2 l2Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
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
            u3.c M = kd.a.M(R.drawable.logo, qVar, 0);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            long primary = echoTheme.getColors(qVar, i13).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable);
            i3.q qVar2 = i3.q.f13017a;
            y2.a(M, null, p2.o(qVar2, 26), primary, qVar, u3.c.$stable | 432, 0);
            r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i13).getX2()), qVar);
            j7.d(kj.c.R(qVar, R.string.home_home), SearchButtonKt.headerTitleSharedElement(l2Var.b(qVar2, 1.0f, true), j2Var, oVar, qVar, 0), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar, i13).getTwoXlRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 24960, 110588);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$12$2(j2 j2Var, i1.o oVar, ho.a aVar, ho.l lVar, ho.a aVar2, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.string.search_accessibility_search;
            ButtonIconSize buttonIconSize = ButtonIconSize.Medium;
            float f10 = 2;
            i3.q qVar2 = i3.q.f13017a;
            i3.t searchButtonSharedElement = SearchButtonKt.searchButtonSharedElement(r1.d.I(qVar2, t2.u.P, f10, t2.u.P, t2.u.P, 13), j2Var, oVar, qVar, 6);
            boolean f11 = qVar.f(aVar) | qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f11 || L == eVar) {
                L = new k(aVar, lVar, 0);
                qVar.h0(L);
            }
            SearchButtonKt.SearchButton(i11, (ho.a) L, searchButtonSharedElement, buttonIconSize, qVar, 3072, 0);
            int i12 = io.elevenlabs.ui.R.drawable.people_circle;
            String R = kj.c.R(qVar, R.string.home_accessibility_settings);
            ButtonIconVariant buttonIconVariant = ButtonIconVariant.Menu;
            i3.t I = r1.d.I(qVar2, t2.u.P, f10, t2.u.P, t2.u.P, 13);
            boolean f12 = qVar.f(aVar2) | qVar.f(lVar);
            Object L2 = qVar.L();
            if (f12 || L2 == eVar) {
                L2 = new k(aVar2, lVar, 1);
                qVar.h0(L2);
            }
            ButtonIconKt.ButtonIcon(i12, R, (ho.a) L2, I, buttonIconVariant, buttonIconSize, false, false, false, qVar, 224256, 448);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$12$2$0$0(ho.a aVar, ho.l lVar) {
        aVar.invoke();
        lVar.invoke(new u(19));
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$12$2$0$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(Analytics.Event.HomeClickedSearchButton.INSTANCE);
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$12$2$1$0(ho.a aVar, ho.l lVar) {
        aVar.invoke();
        lVar.invoke(new u(13));
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$12$2$1$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(Analytics.Event.HomeClickedAccountButton.INSTANCE);
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$13$0$0(x0 x0Var, h5.l lVar) {
        HomeScreenV3UI$lambda$5$0$9(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$14$0(ho.l lVar) {
        lVar.invoke(new u(2));
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$14$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.closeDailyStreakSettings();
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$15$0(ho.l lVar) {
        lVar.invoke(new u(14));
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$15$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.closeWhatsNew();
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$16$0(ho.l lVar, ho.a aVar) {
        lVar.invoke(new u(5));
        aVar.invoke();
        return z.f31622a;
    }

    public static final z HomeScreenV3UI$lambda$5$0$16$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.closeWhatsNew();
        return z.f31622a;
    }

    private static final void HomeScreenV3UI$lambda$5$0$2(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final boolean HomeScreenV3UI$lambda$5$0$4(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void HomeScreenV3UI$lambda$5$0$5(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z HomeScreenV3UI$lambda$5$0$6$0(z0 z0Var, boolean z6) {
        HomeScreenV3UI$lambda$5$0$5(z0Var, z6);
        return z.f31622a;
    }

    private static final int HomeScreenV3UI$lambda$5$0$8(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void HomeScreenV3UI$lambda$5$0$9(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final z HomeScreenV3UI$lambda$6(HomeStateV3 homeStateV3, ua.b bVar, ho.l lVar, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar2, ho.l lVar3, ho.a aVar2, ho.a aVar3, j2 j2Var, i1.o oVar, int i10, int i11, int i12, u2.m mVar, int i13) {
        HomeScreenV3UI(homeStateV3, bVar, lVar, aVar, pVar, pVar2, lVar2, lVar3, aVar2, aVar3, j2Var, oVar, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return z.f31622a;
    }

    private static final void HomeSectionContent(t1.b bVar, HomePageV3.Section section, HomeStateV3 homeStateV3, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, i3.t tVar, u2.m mVar, int i10) {
        int i11;
        HomeStateV3 homeStateV32;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-299420395);
        if ((i10 & 6) == 0) {
            if (qVar.f(bVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(section)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            homeStateV32 = homeStateV3;
            if (qVar.h(homeStateV32)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        } else {
            homeStateV32 = homeStateV3;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar2)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i14;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(lVar3)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i11 |= i13;
        }
        if ((1572864 & i10) == 0) {
            if (qVar.f(tVar)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i11 |= i12;
        }
        if ((599187 & i11) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            boolean z29 = section instanceof HomePageV3.Section.RecentReadsSection;
            u2.e eVar = u2.l.f33918a;
            if (z29) {
                qVar.X(614454040);
                if (!homeStateV32.getRecentReads().isEmpty()) {
                    qVar.X(614518644);
                    String title = ((HomePageV3.Section.RecentReadsSection) section).getTitle();
                    List<ReadMeta> recentReads = homeStateV3.getRecentReads();
                    List<MediaItemState> playerQueue = homeStateV3.getPlayerQueue();
                    if ((i11 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    int i19 = i11 & 7168;
                    if (i19 == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z30 = z26 | z27;
                    Object L = qVar.L();
                    if (z30 || L == eVar) {
                        final int i20 = 0;
                        L = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.l
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                z HomeSectionContent$lambda$0$0;
                                z HomeSectionContent$lambda$2$0;
                                z HomeSectionContent$lambda$3$0;
                                z HomeSectionContent$lambda$4$0;
                                z HomeSectionContent$lambda$5$0;
                                z HomeSectionContent$lambda$7$0;
                                z HomeSectionContent$lambda$9$0;
                                switch (i20) {
                                    case 0:
                                        HomeSectionContent$lambda$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$0$0(lVar2, lVar, (ReadMeta) obj);
                                        return HomeSectionContent$lambda$0$0;
                                    case 1:
                                        HomeSectionContent$lambda$2$0 = HomeScreenV3Kt.HomeSectionContent$lambda$2$0(lVar2, lVar, (GenreTilesGridRow.Tile) obj);
                                        return HomeSectionContent$lambda$2$0;
                                    case 2:
                                        HomeSectionContent$lambda$3$0 = HomeScreenV3Kt.HomeSectionContent$lambda$3$0(lVar2, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                        return HomeSectionContent$lambda$3$0;
                                    case 3:
                                        HomeSectionContent$lambda$4$0 = HomeScreenV3Kt.HomeSectionContent$lambda$4$0(lVar2, lVar, (MiniReadGridSection.Item) obj);
                                        return HomeSectionContent$lambda$4$0;
                                    case 4:
                                        HomeSectionContent$lambda$5$0 = HomeScreenV3Kt.HomeSectionContent$lambda$5$0(lVar2, lVar, (HighlightedCollectionsRowSection.Item) obj);
                                        return HomeSectionContent$lambda$5$0;
                                    case 5:
                                        HomeSectionContent$lambda$7$0 = HomeScreenV3Kt.HomeSectionContent$lambda$7$0(lVar2, lVar, (HomePageV3.Section.HomeActionList.HomeActionItem) obj);
                                        return HomeSectionContent$lambda$7$0;
                                    default:
                                        HomeSectionContent$lambda$9$0 = HomeScreenV3Kt.HomeSectionContent$lambda$9$0(lVar2, lVar, (String) obj);
                                        return HomeSectionContent$lambda$9$0;
                                }
                            }
                        };
                        qVar.h0(L);
                    }
                    ho.l lVar4 = (ho.l) L;
                    if (i19 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    Object L2 = qVar.L();
                    if (z28 || L2 == eVar) {
                        L2 = new n(lVar, 0);
                        qVar.h0(L2);
                    }
                    int i21 = (i11 >> 12) & 896;
                    z25 = false;
                    HomeReadsCarouselKt.HomeReadsCarouselV3(title, recentReads, tVar, playerQueue, lVar4, (ho.l) L2, qVar, i21, 0);
                    qVar = qVar;
                    qVar.p(false);
                } else {
                    z25 = false;
                    qVar.X(615140845);
                    qVar.p(false);
                }
                qVar.p(z25);
            } else if (section instanceof HomePageV3.Section.GenreTilesGridRow) {
                qVar.X(615215989);
                HomePageV3.Section.GenreTilesGridRow genreTilesGridRow = (HomePageV3.Section.GenreTilesGridRow) section;
                String title2 = genreTilesGridRow.getData().getTitle();
                List<GenreTilesGridRow.Tile> items = genreTilesGridRow.getData().getItems();
                if ((458752 & i11) == 131072) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z31 = z23 | z24;
                Object L3 = qVar.L();
                if (z31 || L3 == eVar) {
                    final int i22 = 1;
                    L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.l
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z HomeSectionContent$lambda$0$0;
                            z HomeSectionContent$lambda$2$0;
                            z HomeSectionContent$lambda$3$0;
                            z HomeSectionContent$lambda$4$0;
                            z HomeSectionContent$lambda$5$0;
                            z HomeSectionContent$lambda$7$0;
                            z HomeSectionContent$lambda$9$0;
                            switch (i22) {
                                case 0:
                                    HomeSectionContent$lambda$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                    return HomeSectionContent$lambda$0$0;
                                case 1:
                                    HomeSectionContent$lambda$2$0 = HomeScreenV3Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (GenreTilesGridRow.Tile) obj);
                                    return HomeSectionContent$lambda$2$0;
                                case 2:
                                    HomeSectionContent$lambda$3$0 = HomeScreenV3Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                    return HomeSectionContent$lambda$3$0;
                                case 3:
                                    HomeSectionContent$lambda$4$0 = HomeScreenV3Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                    return HomeSectionContent$lambda$4$0;
                                case 4:
                                    HomeSectionContent$lambda$5$0 = HomeScreenV3Kt.HomeSectionContent$lambda$5$0(lVar3, lVar, (HighlightedCollectionsRowSection.Item) obj);
                                    return HomeSectionContent$lambda$5$0;
                                case 5:
                                    HomeSectionContent$lambda$7$0 = HomeScreenV3Kt.HomeSectionContent$lambda$7$0(lVar3, lVar, (HomePageV3.Section.HomeActionList.HomeActionItem) obj);
                                    return HomeSectionContent$lambda$7$0;
                                default:
                                    HomeSectionContent$lambda$9$0 = HomeScreenV3Kt.HomeSectionContent$lambda$9$0(lVar3, lVar, (String) obj);
                                    return HomeSectionContent$lambda$9$0;
                            }
                        }
                    };
                    qVar.h0(L3);
                }
                GenreTilesGridRowKt.GenreTilesGridRowV3(title2, items, (ho.l) L3, tVar, qVar, (i11 >> 9) & 7168, 0);
                qVar.p(false);
            } else if (section instanceof HomePageV3.Section.FeaturedCardList) {
                qVar.X(615674355);
                HomePageV3.Section.FeaturedCardList featuredCardList = (HomePageV3.Section.FeaturedCardList) section;
                String title3 = featuredCardList.getData().getTitle();
                List<AnnouncementBannerCarouselSection.Banner> items2 = featuredCardList.getData().getItems();
                if ((458752 & i11) == 131072) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z32 = z21 | z22;
                Object L4 = qVar.L();
                if (z32 || L4 == eVar) {
                    final int i23 = 2;
                    L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.l
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z HomeSectionContent$lambda$0$0;
                            z HomeSectionContent$lambda$2$0;
                            z HomeSectionContent$lambda$3$0;
                            z HomeSectionContent$lambda$4$0;
                            z HomeSectionContent$lambda$5$0;
                            z HomeSectionContent$lambda$7$0;
                            z HomeSectionContent$lambda$9$0;
                            switch (i23) {
                                case 0:
                                    HomeSectionContent$lambda$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                    return HomeSectionContent$lambda$0$0;
                                case 1:
                                    HomeSectionContent$lambda$2$0 = HomeScreenV3Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (GenreTilesGridRow.Tile) obj);
                                    return HomeSectionContent$lambda$2$0;
                                case 2:
                                    HomeSectionContent$lambda$3$0 = HomeScreenV3Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                    return HomeSectionContent$lambda$3$0;
                                case 3:
                                    HomeSectionContent$lambda$4$0 = HomeScreenV3Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                    return HomeSectionContent$lambda$4$0;
                                case 4:
                                    HomeSectionContent$lambda$5$0 = HomeScreenV3Kt.HomeSectionContent$lambda$5$0(lVar3, lVar, (HighlightedCollectionsRowSection.Item) obj);
                                    return HomeSectionContent$lambda$5$0;
                                case 5:
                                    HomeSectionContent$lambda$7$0 = HomeScreenV3Kt.HomeSectionContent$lambda$7$0(lVar3, lVar, (HomePageV3.Section.HomeActionList.HomeActionItem) obj);
                                    return HomeSectionContent$lambda$7$0;
                                default:
                                    HomeSectionContent$lambda$9$0 = HomeScreenV3Kt.HomeSectionContent$lambda$9$0(lVar3, lVar, (String) obj);
                                    return HomeSectionContent$lambda$9$0;
                            }
                        }
                    };
                    qVar.h0(L4);
                }
                AnnouncementBannerCarouselKt.AnnouncementBannerCarousel(title3, items2, (ho.l) L4, tVar, qVar, (i11 >> 9) & 7168, 0);
                qVar.p(false);
            } else if (section instanceof HomePageV3.Section.MiniReadGrid) {
                qVar.X(616190133);
                List<MiniReadGridSection.Item> items3 = ((HomePageV3.Section.MiniReadGrid) section).getData().getItems();
                if ((458752 & i11) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z33 = z19 | z20;
                Object L5 = qVar.L();
                if (z33 || L5 == eVar) {
                    final int i24 = 3;
                    L5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.l
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z HomeSectionContent$lambda$0$0;
                            z HomeSectionContent$lambda$2$0;
                            z HomeSectionContent$lambda$3$0;
                            z HomeSectionContent$lambda$4$0;
                            z HomeSectionContent$lambda$5$0;
                            z HomeSectionContent$lambda$7$0;
                            z HomeSectionContent$lambda$9$0;
                            switch (i24) {
                                case 0:
                                    HomeSectionContent$lambda$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                    return HomeSectionContent$lambda$0$0;
                                case 1:
                                    HomeSectionContent$lambda$2$0 = HomeScreenV3Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (GenreTilesGridRow.Tile) obj);
                                    return HomeSectionContent$lambda$2$0;
                                case 2:
                                    HomeSectionContent$lambda$3$0 = HomeScreenV3Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                    return HomeSectionContent$lambda$3$0;
                                case 3:
                                    HomeSectionContent$lambda$4$0 = HomeScreenV3Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                    return HomeSectionContent$lambda$4$0;
                                case 4:
                                    HomeSectionContent$lambda$5$0 = HomeScreenV3Kt.HomeSectionContent$lambda$5$0(lVar3, lVar, (HighlightedCollectionsRowSection.Item) obj);
                                    return HomeSectionContent$lambda$5$0;
                                case 5:
                                    HomeSectionContent$lambda$7$0 = HomeScreenV3Kt.HomeSectionContent$lambda$7$0(lVar3, lVar, (HomePageV3.Section.HomeActionList.HomeActionItem) obj);
                                    return HomeSectionContent$lambda$7$0;
                                default:
                                    HomeSectionContent$lambda$9$0 = HomeScreenV3Kt.HomeSectionContent$lambda$9$0(lVar3, lVar, (String) obj);
                                    return HomeSectionContent$lambda$9$0;
                            }
                        }
                    };
                    qVar.h0(L5);
                }
                MiniReadGridKt.MiniReadGrid(items3, (ho.l) L5, tVar, qVar, (i11 >> 12) & 896, 0);
                qVar = qVar;
                qVar.p(false);
            } else if (section instanceof HomePageV3.Section.HighlightedCollectionsRow) {
                qVar.X(616658884);
                HomePageV3.Section.HighlightedCollectionsRow highlightedCollectionsRow = (HomePageV3.Section.HighlightedCollectionsRow) section;
                String title4 = highlightedCollectionsRow.getData().getTitle();
                List<HighlightedCollectionsRowSection.Item> items4 = highlightedCollectionsRow.getData().getItems();
                if ((458752 & i11) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z34 = z17 | z18;
                Object L6 = qVar.L();
                if (z34 || L6 == eVar) {
                    final int i25 = 4;
                    L6 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.l
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z HomeSectionContent$lambda$0$0;
                            z HomeSectionContent$lambda$2$0;
                            z HomeSectionContent$lambda$3$0;
                            z HomeSectionContent$lambda$4$0;
                            z HomeSectionContent$lambda$5$0;
                            z HomeSectionContent$lambda$7$0;
                            z HomeSectionContent$lambda$9$0;
                            switch (i25) {
                                case 0:
                                    HomeSectionContent$lambda$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                    return HomeSectionContent$lambda$0$0;
                                case 1:
                                    HomeSectionContent$lambda$2$0 = HomeScreenV3Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (GenreTilesGridRow.Tile) obj);
                                    return HomeSectionContent$lambda$2$0;
                                case 2:
                                    HomeSectionContent$lambda$3$0 = HomeScreenV3Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                    return HomeSectionContent$lambda$3$0;
                                case 3:
                                    HomeSectionContent$lambda$4$0 = HomeScreenV3Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                    return HomeSectionContent$lambda$4$0;
                                case 4:
                                    HomeSectionContent$lambda$5$0 = HomeScreenV3Kt.HomeSectionContent$lambda$5$0(lVar3, lVar, (HighlightedCollectionsRowSection.Item) obj);
                                    return HomeSectionContent$lambda$5$0;
                                case 5:
                                    HomeSectionContent$lambda$7$0 = HomeScreenV3Kt.HomeSectionContent$lambda$7$0(lVar3, lVar, (HomePageV3.Section.HomeActionList.HomeActionItem) obj);
                                    return HomeSectionContent$lambda$7$0;
                                default:
                                    HomeSectionContent$lambda$9$0 = HomeScreenV3Kt.HomeSectionContent$lambda$9$0(lVar3, lVar, (String) obj);
                                    return HomeSectionContent$lambda$9$0;
                            }
                        }
                    };
                    qVar.h0(L6);
                }
                HighlightedCollectionsRowKt.HighlightedCollectionsRowV3(title4, items4, (ho.l) L6, tVar, qVar, (i11 >> 9) & 7168, 0);
                qVar.p(false);
            } else if (section instanceof HomePageV3.Section.StatsCarousel) {
                qVar.X(617215272);
                StatsCarouselSection data = ((HomePageV3.Section.StatsCarousel) section).getData();
                long targetStreakGoalMinutes = homeStateV3.getTargetStreakGoalMinutes();
                if ((i11 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                Object L7 = qVar.L();
                if (z16 || L7 == eVar) {
                    L7 = new h(lVar, 1);
                    qVar.h0(L7);
                }
                HomeStatsCarouselKt.HomeStatsCarouselV3(data, targetStreakGoalMinutes, tVar, (ho.a) L7, qVar, (i11 >> 12) & 896, 0);
                qVar = qVar;
                qVar.p(false);
            } else if (section instanceof HomePageV3.Section.HomeActionList) {
                qVar.X(19919173);
                HomePageV3.Section.HomeActionList homeActionList = (HomePageV3.Section.HomeActionList) section;
                if ((458752 & i11) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z35 = z14 | z15;
                Object L8 = qVar.L();
                if (z35 || L8 == eVar) {
                    final int i26 = 5;
                    L8 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.l
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z HomeSectionContent$lambda$0$0;
                            z HomeSectionContent$lambda$2$0;
                            z HomeSectionContent$lambda$3$0;
                            z HomeSectionContent$lambda$4$0;
                            z HomeSectionContent$lambda$5$0;
                            z HomeSectionContent$lambda$7$0;
                            z HomeSectionContent$lambda$9$0;
                            switch (i26) {
                                case 0:
                                    HomeSectionContent$lambda$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                    return HomeSectionContent$lambda$0$0;
                                case 1:
                                    HomeSectionContent$lambda$2$0 = HomeScreenV3Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (GenreTilesGridRow.Tile) obj);
                                    return HomeSectionContent$lambda$2$0;
                                case 2:
                                    HomeSectionContent$lambda$3$0 = HomeScreenV3Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                    return HomeSectionContent$lambda$3$0;
                                case 3:
                                    HomeSectionContent$lambda$4$0 = HomeScreenV3Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                    return HomeSectionContent$lambda$4$0;
                                case 4:
                                    HomeSectionContent$lambda$5$0 = HomeScreenV3Kt.HomeSectionContent$lambda$5$0(lVar3, lVar, (HighlightedCollectionsRowSection.Item) obj);
                                    return HomeSectionContent$lambda$5$0;
                                case 5:
                                    HomeSectionContent$lambda$7$0 = HomeScreenV3Kt.HomeSectionContent$lambda$7$0(lVar3, lVar, (HomePageV3.Section.HomeActionList.HomeActionItem) obj);
                                    return HomeSectionContent$lambda$7$0;
                                default:
                                    HomeSectionContent$lambda$9$0 = HomeScreenV3Kt.HomeSectionContent$lambda$9$0(lVar3, lVar, (String) obj);
                                    return HomeSectionContent$lambda$9$0;
                            }
                        }
                    };
                    qVar.h0(L8);
                }
                HomeActionListSectionV2Kt.HomeActionListSectionV3(homeActionList, (ho.l) L8, tVar, qVar, ((i11 >> 12) & 896) | ((i11 >> 3) & 14), 0);
                qVar = qVar;
                qVar.p(false);
            } else if (section instanceof HomePageV3.Section.CategoryReadsRow) {
                qVar.X(617862397);
                HomePageV3.Section.CategoryReadsRow categoryReadsRow = (HomePageV3.Section.CategoryReadsRow) section;
                String title5 = categoryReadsRow.getData().getTitle();
                String deeplink = categoryReadsRow.getData().getDeeplink();
                List<BasicReadMeta> reads = categoryReadsRow.getData().getReads();
                ArrayList arrayList = new ArrayList(tn.p.a0(reads, 10));
                for (BasicReadMeta basicReadMeta : reads) {
                    arrayList.add(new BasicReadMeta(basicReadMeta.getReadId(), basicReadMeta.getTitle(), basicReadMeta.getImageUrl()));
                }
                SectionHeaderStyle sectionHeaderStyle = SectionHeaderStyle.Large;
                if ((i11 & 57344) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z36 = z13 | z12;
                Object L9 = qVar.L();
                if (z36 || L9 == eVar) {
                    final int i27 = 6;
                    L9 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.l
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z HomeSectionContent$lambda$0$0;
                            z HomeSectionContent$lambda$2$0;
                            z HomeSectionContent$lambda$3$0;
                            z HomeSectionContent$lambda$4$0;
                            z HomeSectionContent$lambda$5$0;
                            z HomeSectionContent$lambda$7$0;
                            z HomeSectionContent$lambda$9$0;
                            switch (i27) {
                                case 0:
                                    HomeSectionContent$lambda$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$0$0(lVar2, lVar, (ReadMeta) obj);
                                    return HomeSectionContent$lambda$0$0;
                                case 1:
                                    HomeSectionContent$lambda$2$0 = HomeScreenV3Kt.HomeSectionContent$lambda$2$0(lVar2, lVar, (GenreTilesGridRow.Tile) obj);
                                    return HomeSectionContent$lambda$2$0;
                                case 2:
                                    HomeSectionContent$lambda$3$0 = HomeScreenV3Kt.HomeSectionContent$lambda$3$0(lVar2, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                    return HomeSectionContent$lambda$3$0;
                                case 3:
                                    HomeSectionContent$lambda$4$0 = HomeScreenV3Kt.HomeSectionContent$lambda$4$0(lVar2, lVar, (MiniReadGridSection.Item) obj);
                                    return HomeSectionContent$lambda$4$0;
                                case 4:
                                    HomeSectionContent$lambda$5$0 = HomeScreenV3Kt.HomeSectionContent$lambda$5$0(lVar2, lVar, (HighlightedCollectionsRowSection.Item) obj);
                                    return HomeSectionContent$lambda$5$0;
                                case 5:
                                    HomeSectionContent$lambda$7$0 = HomeScreenV3Kt.HomeSectionContent$lambda$7$0(lVar2, lVar, (HomePageV3.Section.HomeActionList.HomeActionItem) obj);
                                    return HomeSectionContent$lambda$7$0;
                                default:
                                    HomeSectionContent$lambda$9$0 = HomeScreenV3Kt.HomeSectionContent$lambda$9$0(lVar2, lVar, (String) obj);
                                    return HomeSectionContent$lambda$9$0;
                            }
                        }
                    };
                    qVar.h0(L9);
                }
                CategorieReadsRowKt.CategorieReadsRowV3(lVar3, title5, deeplink, arrayList, sectionHeaderStyle, (ho.l) L9, tVar, qVar, ((i11 >> 15) & 14) | 24576 | (i11 & 3670016), 0);
                qVar = qVar;
                qVar.p(false);
            } else if (section instanceof HomePageV3.Section.EmptyState) {
                qVar.X(618668211);
                EmptyStateSectionKt.EmptyStateSectionV3(((HomePageV3.Section.EmptyState) section).getData(), lVar3, ((t1.c) bVar).d(tVar, 0.65f), qVar, (i11 >> 12) & 112, 0);
                qVar.p(false);
                qVar = qVar;
            } else if (section instanceof HomePageV3.Section.ReadFromFollowing) {
                qVar.X(618939523);
                HomePageV3.Section.ReadFromFollowing readFromFollowing = (HomePageV3.Section.ReadFromFollowing) section;
                ReadFromFollowingSection data2 = readFromFollowing.getData();
                if ((i11 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean h10 = z10 | qVar.h(section);
                if ((i11 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z37 = z11 | h10;
                Object L10 = qVar.L();
                if (z37 || L10 == eVar) {
                    L10 = new c3.b(lVar2, readFromFollowing, lVar, 15);
                    qVar.h0(L10);
                }
                ReadFromFollowingRowKt.ReadFromFollowingRowV3(data2, l1.n.p(tVar, false, null, null, null, (ho.a) L10, 15), null, qVar, 0, 4);
                qVar = qVar;
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(19823073, qVar, false);
            }
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.e(bVar, section, homeStateV3, lVar, lVar2, lVar3, tVar, i10);
        }
    }

    public static final z HomeSectionContent$lambda$0$0(ho.l lVar, ho.l lVar2, ReadMeta readMeta) {
        readMeta.getClass();
        lVar.invoke(readMeta.getReadId());
        lVar2.invoke(new u(12));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$0$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(Analytics.Event.HomeClickedContinueListeningRead.INSTANCE);
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$1$0(ho.l lVar, ReadMeta readMeta) {
        readMeta.getClass();
        lVar.invoke(new r(readMeta, 1));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$1$0$0(ReadMeta readMeta, HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.onClickAddOrRemoveFromQueue(readMeta);
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$10$0(ho.l lVar, HomePageV3.Section section, ho.l lVar2) {
        lVar.invoke(((HomePageV3.Section.ReadFromFollowing) section).getData().getRead().getReadId());
        lVar2.invoke(new u(18));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$10$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.fireFilteredItemClickOnCurrentTab();
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$11(t1.b bVar, HomePageV3.Section section, HomeStateV3 homeStateV3, ho.l lVar, ho.l lVar2, ho.l lVar3, i3.t tVar, int i10, u2.m mVar, int i11) {
        HomeSectionContent(bVar, section, homeStateV3, lVar, lVar2, lVar3, tVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$2$0(ho.l lVar, ho.l lVar2, GenreTilesGridRow.Tile tile) {
        tile.getClass();
        lVar.invoke(tile.getDeeplink());
        lVar2.invoke(new r(tile, 5));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$2$0$0(GenreTilesGridRow.Tile tile, HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(new Analytics.Event.HomeClickedDiscoverGenreTile(tile.getAnalyticsId()));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$3$0(ho.l lVar, ho.l lVar2, AnnouncementBannerCarouselSection.Banner banner) {
        banner.getClass();
        lVar.invoke(banner.getDeeplink());
        String analyticsId = banner.getAnalyticsId();
        if (analyticsId != null) {
            lVar2.invoke(new q(analyticsId, 1));
        }
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$3$0$0$0(String str, HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(new Analytics.Event.HomeClickedWhatsNewAnnouncement(str));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$4$0(ho.l lVar, ho.l lVar2, MiniReadGridSection.Item item) {
        item.getClass();
        lVar.invoke(item.getDeeplink());
        String analyticsId = item.getAnalyticsId();
        if (analyticsId != null) {
            lVar2.invoke(new q(analyticsId, 0));
        }
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$4$0$0$0(String str, HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(new Analytics.Event.HomeClickedTopPicksRead(str));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$5$0(ho.l lVar, ho.l lVar2, HighlightedCollectionsRowSection.Item item) {
        item.getClass();
        lVar.invoke(item.getDeeplink());
        lVar2.invoke(new r(item, 4));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$5$0$0(HighlightedCollectionsRowSection.Item item, HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(new Analytics.Event.HomeClickedTopPicksCollectionBanner(item.getAnalyticsId()));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$6$0(ho.l lVar) {
        lVar.invoke(new u(17));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$6$0$0(HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.onDailyGoalClicked();
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$7$0(ho.l lVar, ho.l lVar2, HomePageV3.Section.HomeActionList.HomeActionItem homeActionItem) {
        homeActionItem.getClass();
        lVar.invoke(homeActionItem.getDeeplink());
        lVar2.invoke(new r(homeActionItem, 3));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$7$0$0(HomePageV3.Section.HomeActionList.HomeActionItem homeActionItem, HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(new Analytics.Event.HomeClickedUploadBannerButton(homeActionItem.getAnalyticsId()));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$9$0(ho.l lVar, ho.l lVar2, String str) {
        str.getClass();
        lVar.invoke(str);
        lVar2.invoke(new q(str, 3));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$9$0$0(String str, HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.getAnalytics().log(new Analytics.Event.HomeClickedTrendingReleaseRead(str));
        return z.f31622a;
    }

    public static final void LoaderItem(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1451211931);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(p2.e(i3.q.f13017a, 1.0f), 16);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
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
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 29);
        }
    }

    public static final z LoaderItem$lambda$1(int i10, u2.m mVar, int i11) {
        LoaderItem(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeScreenV3_error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2022719453);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HomeStateV3 homeStateV3 = new HomeStateV3(false, false, "Some error", null, null, null, 0L, false, null, null, null, false, false, null, null, 32761, null);
            ua.b rememberPreviewLazyPagingItems = io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.rememberPreviewLazyPagingItems(new ta.z0(new a7.u(new ta.z(null), 3), ta.z0.f32777e, ta.z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new u(11);
                qVar.h0(L);
            }
            HomeScreenV3UI(homeStateV3, rememberPreviewLazyPagingItems, (ho.l) L, null, null, null, null, null, null, null, null, null, qVar, 448, 0, 4088);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 28);
        }
    }

    public static final z Preview_HomeScreenV3_error$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_HomeScreenV3_error$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_HomeScreenV3_error(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeScreenV3_idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(369445773);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HomeStateV3 homeStateV3 = new HomeStateV3(false, false, null, null, null, null, 0L, false, null, null, null, false, false, null, null, 32767, null);
            ua.b rememberPreviewLazyPagingItems = io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.rememberPreviewLazyPagingItems(new ta.z0(new a7.u(new ta.z(null), 3), ta.z0.f32777e, ta.z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new u(7);
                qVar.h0(L);
            }
            HomeScreenV3UI(homeStateV3, rememberPreviewLazyPagingItems, (ho.l) L, null, null, null, null, null, null, null, null, null, qVar, 448, 0, 4088);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 26);
        }
    }

    public static final z Preview_HomeScreenV3_idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_HomeScreenV3_idle$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_HomeScreenV3_idle(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeScreenV3_loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(667006014);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            tn.t tVar = tn.t.f33547a;
            HomeStateV3 homeStateV3 = new HomeStateV3(false, false, null, new HomePageV3(tVar, tVar), null, null, 0L, false, null, null, null, false, false, null, null, 32757, null);
            ua.b rememberPreviewLazyPagingItems = io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.rememberPreviewLazyPagingItems(new ta.z0(new a7.u(new ta.z(null), 3), ta.z0.f32777e, ta.z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new u(10);
                qVar.h0(L);
            }
            HomeScreenV3UI(homeStateV3, rememberPreviewLazyPagingItems, (ho.l) L, null, null, null, null, null, null, null, null, null, qVar, 448, 0, 4088);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 27);
        }
    }

    public static final z Preview_HomeScreenV3_loaded$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_HomeScreenV3_loaded$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_HomeScreenV3_loaded(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeScreenV3_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1320681583);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HomeStateV3 homeStateV3 = new HomeStateV3(false, true, null, null, null, null, 0L, false, null, null, null, false, false, null, null, 32765, null);
            ua.b rememberPreviewLazyPagingItems = io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.rememberPreviewLazyPagingItems(new ta.z0(new a7.u(new ta.z(null), 3), ta.z0.f32777e, ta.z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new u(3);
                qVar.h0(L);
            }
            HomeScreenV3UI(homeStateV3, rememberPreviewLazyPagingItems, (ho.l) L, null, null, null, null, null, null, null, null, null, qVar, 448, 0, 4088);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 24);
        }
    }

    public static final z Preview_HomeScreenV3_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_HomeScreenV3_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_HomeScreenV3_loading(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeScreenV3_playing(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-783669117);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            tn.t tVar = tn.t.f33547a;
            HomeStateV3 homeStateV3 = new HomeStateV3(false, false, null, new HomePageV3(tVar, tVar), null, null, 0L, false, null, null, null, false, false, null, null, 32757, null);
            ua.b rememberPreviewLazyPagingItems = io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.rememberPreviewLazyPagingItems(new ta.z0(new a7.u(new ta.z(null), 3), ta.z0.f32777e, ta.z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new u(1);
                qVar.h0(L);
            }
            HomeScreenV3UI(homeStateV3, rememberPreviewLazyPagingItems, (ho.l) L, null, null, ComposableSingletons$HomeScreenV3Kt.INSTANCE.getLambda$761174933$app_productionRelease(), null, null, null, null, null, null, qVar, 197056, 0, 4056);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 23);
        }
    }

    public static final z Preview_HomeScreenV3_playing$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_HomeScreenV3_playing$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_HomeScreenV3_playing(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeScreenV3_warning(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1202499057);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            tn.t tVar = tn.t.f33547a;
            HomeStateV3 homeStateV3 = new HomeStateV3(false, false, null, new HomePageV3(tVar, tVar), null, null, 0L, false, null, null, null, false, false, null, null, 32757, null);
            ua.b rememberPreviewLazyPagingItems = io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.rememberPreviewLazyPagingItems(new ta.z0(new a7.u(new ta.z(null), 3), ta.z0.f32777e, ta.z0.f32778f, new q2.z0(21)), qVar, 0);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new u(6);
                qVar.h0(L);
            }
            HomeScreenV3UI(homeStateV3, rememberPreviewLazyPagingItems, (ho.l) L, null, null, null, null, null, null, null, null, null, qVar, 448, 0, 4088);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 25);
        }
    }

    public static final z Preview_HomeScreenV3_warning$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_HomeScreenV3_warning$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_HomeScreenV3_warning(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void SubpageChipsRow(HomePageV3 homePageV3, String str, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1779315292);
        if ((i10 & 6) == 0) {
            if (qVar.h(homePageV3)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z11 = false;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.t e10 = p2.e(i3.q.f13017a, 1.0f);
            float f10 = 8;
            r1.h g10 = r1.j.g(f10);
            float f11 = 20;
            d2 f12 = r1.d.f(f11, t2.u.P, f11, f10, 2);
            boolean h10 = qVar.h(homePageV3);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = z10 | h10;
            if ((i11 & 896) == 256) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object L = qVar.L();
            if (z13 || L == u2.l.f33918a) {
                L = new o0(homePageV3, str, lVar, 19);
                qVar.h0(L);
            }
            c1.d(e10, null, f12, g10, null, null, false, null, (ho.l) L, qVar, 24966, 490);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 14, homePageV3, str, lVar);
        }
    }

    public static final z SubpageChipsRow$lambda$0$0(HomePageV3 homePageV3, final String str, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        final List<HomePageV3.Subpage> subpages = homePageV3.getSubpages();
        final HomeScreenV3Kt$SubpageChipsRow$lambda$0$0$$inlined$items$default$1 homeScreenV3Kt$SubpageChipsRow$lambda$0$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt$SubpageChipsRow$lambda$0$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((HomePageV3.Subpage) obj);
            }

            @Override // ho.l
            public final Void invoke(HomePageV3.Subpage subpage) {
                return null;
            }
        };
        ((t1.i) tVar).u(subpages.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt$SubpageChipsRow$lambda$0$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(subpages.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt$SubpageChipsRow$lambda$0$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar).d(i10)) {
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
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final HomePageV3.Subpage subpage = (HomePageV3.Subpage) subpages.get(i10);
                    qVar.X(480061316);
                    String title = subpage.getTitle();
                    String iconUrl = subpage.getIconUrl();
                    boolean c5 = kotlin.jvm.internal.m.c(str, subpage.getId());
                    ChipIconPosition chipIconPosition = ChipIconPosition.Start;
                    boolean f10 = qVar.f(lVar) | qVar.h(subpage);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt$SubpageChipsRow$1$1$1$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1413invoke() {
                                ho.l.this.invoke(subpage.getId());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1413invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ChipKt.Chip(title, null, c5, null, iconUrl, chipIconPosition, (ho.a) L, null, null, qVar, 196608, 394);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        return z.f31622a;
    }

    public static final z SubpageChipsRow$lambda$1(HomePageV3 homePageV3, String str, ho.l lVar, int i10, u2.m mVar, int i11) {
        SubpageChipsRow(homePageV3, str, lVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final /* synthetic */ void access$LoaderItem(u2.m mVar, int i10) {
        LoaderItem(mVar, i10);
    }

    public static final void homeItems(t1.t tVar, final HomeStateV3 homeStateV3, ua.b bVar, final ho.l lVar, final ho.l lVar2, final ho.l lVar3) {
        HomeStateV3 homeStateV32;
        ho.l lVar4;
        tVar.getClass();
        homeStateV3.getClass();
        bVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        HomePageV3 page = homeStateV3.getPage();
        page.getClass();
        final List<HomePageV3.Section> sections = page.getSections();
        final HomeScreenV3Kt$homeItems$$inlined$items$default$1 homeScreenV3Kt$homeItems$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt$homeItems$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((HomePageV3.Section) obj);
            }

            @Override // ho.l
            public final Void invoke(HomePageV3.Section section) {
                return null;
            }
        };
        ((t1.i) tVar).u(sections.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt$homeItems$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(sections.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt$homeItems$$inlined$items$default$4
            public final void invoke(t1.b bVar2, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar2)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar).d(i10)) {
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
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    HomePageV3.Section section = (HomePageV3.Section) sections.get(i10);
                    qVar.X(68638770);
                    HomeScreenV3Kt.homeItems$content(bVar2, homeStateV3, lVar, lVar2, lVar3, section, qVar, i12 & 14);
                    ib.i.A(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable, i3.q.f13017a, qVar);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        if (!page.getSubpages().isEmpty()) {
            if (page.getSubpages().size() > 1) {
                homeStateV32 = homeStateV3;
                lVar4 = lVar;
                t1.t.c(tVar, null, null, new c3.j(new j(homeStateV32, lVar4, 1), true, 461732367), 3);
            } else {
                homeStateV32 = homeStateV3;
                lVar4 = lVar;
            }
            t1.t.d(tVar, bVar.c(), null, new c3.j(new t0(bVar, homeStateV32, lVar4, lVar2, lVar3), true, -1262770335), 6);
            if (homeItems$initialLoadInProgress(bVar)) {
                t1.t.c(tVar, null, null, ComposableSingletons$HomeScreenV3Kt.INSTANCE.m1410getLambda$1581793352$app_productionRelease(), 3);
            } else if (homeItems$subpageLoadMoreInProgress(bVar)) {
                t1.t.c(tVar, null, null, ComposableSingletons$HomeScreenV3Kt.INSTANCE.m1409getLambda$1400259025$app_productionRelease(), 3);
            }
        }
    }

    public static final void homeItems$content(t1.b bVar, HomeStateV3 homeStateV3, ho.l lVar, ho.l lVar2, ho.l lVar3, HomePageV3.Section section, u2.m mVar, int i10) {
        HomeSectionContent(bVar, section, homeStateV3, lVar, lVar2, lVar3, t1.b.a(bVar, i3.q.f13017a, null, 7), mVar, i10 & 126);
    }

    public static /* synthetic */ void homeItems$default(t1.t tVar, HomeStateV3 homeStateV3, ua.b bVar, ho.l lVar, ho.l lVar2, ho.l lVar3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar2 = new u(8);
        }
        ho.l lVar4 = lVar2;
        if ((i10 & 16) != 0) {
            lVar3 = new u(9);
        }
        homeItems(tVar, homeStateV3, bVar, lVar, lVar4, lVar3);
    }

    private static final boolean homeItems$initialLoadInProgress(ua.b bVar) {
        if ((bVar.d().f32555a instanceof ta.r) && bVar.c() == 0) {
            return true;
        }
        return false;
    }

    public static final z homeItems$lambda$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z homeItems$lambda$1(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z homeItems$lambda$3(HomeStateV3 homeStateV3, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV3 page = homeStateV3.getPage();
            String selectedSubpageId = homeStateV3.getSelectedSubpageId();
            if (selectedSubpageId == null) {
                selectedSubpageId = "";
            }
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new n(lVar, 1);
                qVar.h0(L);
            }
            SubpageChipsRow(page, selectedSubpageId, (ho.l) L, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z homeItems$lambda$3$0$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new q(str, 2));
        return z.f31622a;
    }

    public static final z homeItems$lambda$3$0$0$0(String str, HomeViewModelV3 homeViewModelV3) {
        homeViewModelV3.getClass();
        homeViewModelV3.selectTab(str);
        return z.f31622a;
    }

    public static final z homeItems$lambda$4(ua.b bVar, HomeStateV3 homeStateV3, ho.l lVar, ho.l lVar2, ho.l lVar3, t1.b bVar2, int i10, u2.m mVar, int i11) {
        int i12;
        boolean z6;
        int i13;
        int i14;
        bVar2.getClass();
        if ((i11 & 6) == 0) {
            if (((u2.q) mVar).f(bVar2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (((u2.q) mVar).d(i10)) {
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
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i12 & 1, z6)) {
            HomePageV3.Section section = (HomePageV3.Section) bVar.b(i10);
            if (section == null) {
                qVar.X(427547233);
                qVar.p(false);
            } else {
                qVar.X(427547234);
                homeItems$content(bVar2, homeStateV3, lVar, lVar2, lVar3, section, qVar, i12 & 14);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    private static final boolean homeItems$subpageLoadMoreInProgress(ua.b bVar) {
        return bVar.d().f32557c instanceof ta.r;
    }
}

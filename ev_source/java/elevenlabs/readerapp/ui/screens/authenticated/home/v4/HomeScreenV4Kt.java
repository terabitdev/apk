package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import androidx.fragment.app.n0;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i1.j2;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.AnnouncementBannerCarouselKt;
import io.elevenlabs.readerapp.ui.components.MiniReadGridKt;
import io.elevenlabs.readerapp.ui.components.WhatsNewPopupKt;
import io.elevenlabs.readerapp.ui.components.explore.LocalExplorePricesKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeAccountButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeActionListSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeHeroCarouselSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeHighlightedCarouselSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeMediumCarouselSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeStatsCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeWarningSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.SearchButtonKt;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.headers.EchoHeaderStyle;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
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
import r1.c3;
import r1.l2;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import sn.z;
import u2.h0;
import u2.i0;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u009b\u0001\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a»\u0001\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001ao\u0010\u001d\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001ao\u0010#\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010%\u001a\u00020\u00012\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b%\u0010&¨\u0006.²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020*8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020*8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onNavigateToSettings", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeViewModelV4;", "vm", "bottomBar", "Lkotlin/Function2;", "", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToRead", "onNavigateToPlayer", "Lkotlin/Function1;", "onNavigateToDeeplink", "onNavigateToVoiceDesign", "Li1/j2;", "sharedTransitionScope", "Li1/o;", "animatedContentScope", "HomeScreenV4", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeViewModelV4;Lho/p;Lho/p;Lho/p;Lho/l;Lho/a;Li1/j2;Li1/o;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "miniPlayer", "HomeScreenV4UI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;Lho/l;Lho/a;Lho/p;Lho/p;Lho/l;Lho/l;Lho/a;Li1/j2;Li1/o;Lu2/m;II)V", "Lt1/t;", "Lio/elevenlabs/domain/model/home/HomePageV4;", "page", "homeItems", "(Lt1/t;Lio/elevenlabs/domain/model/home/HomePageV4;Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;Lho/l;Lho/l;Lho/l;)V", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "section", "Li3/t;", "modifier", "HomeSectionContent", "(Lio/elevenlabs/domain/model/home/HomePageV4$Section;Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;Lho/l;Lho/l;Lho/l;Li3/t;Lu2/m;I)V", "Preview_HomeScreenV4", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;Lu2/m;I)V", "", "shouldRequestPermission", "hasCheckedPermission", "", "headerHeight", "headerVisible", "miniPlayerHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeScreenV4Kt {
    /* JADX WARN: Removed duplicated region for block: B:111:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeScreenV4(ho.a aVar, HomeViewModelV4 homeViewModelV4, ho.p pVar, ho.p pVar2, ho.p pVar3, ho.l lVar, ho.a aVar2, j2 j2Var, i1.o oVar, u2.m mVar, int i10, int i11) {
        int i12;
        HomeViewModelV4 homeViewModelV42;
        boolean z6;
        HomeViewModelV4 homeViewModelV43;
        q7.c cVar;
        int i13;
        boolean h10;
        Object L;
        u2.e eVar;
        boolean h11;
        Object L2;
        Object L3;
        z0 z0Var;
        Object L4;
        boolean h12;
        Object L5;
        boolean h13;
        Object L6;
        int i14;
        boolean h14;
        Object L7;
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
        j2Var.getClass();
        oVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1001955235);
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
                homeViewModelV42 = homeViewModelV4;
                if (qVar.h(homeViewModelV42)) {
                    i22 = 32;
                    i12 |= i22;
                }
            } else {
                homeViewModelV42 = homeViewModelV4;
            }
            i22 = 16;
            i12 |= i22;
        } else {
            homeViewModelV42 = homeViewModelV4;
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
            if (qVar.f(j2Var)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((100663296 & i10) == 0) {
            if (qVar.h(oVar)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i12 |= i15;
        }
        if ((38347923 & i12) != 38347922) {
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
                    i13 = 0;
                    homeViewModelV42 = (HomeViewModelV4) gg.b.j0(e0.f20562a.b(HomeViewModelV4.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    boolean rememberIsAppInForeground = ComposeExtensionsKt.rememberIsAppInForeground(qVar, i13);
                    Boolean valueOf = Boolean.valueOf(rememberIsAppInForeground);
                    h10 = qVar.h(homeViewModelV42) | qVar.g(rememberIsAppInForeground);
                    L = qVar.L();
                    eVar = u2.l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new HomeScreenV4Kt$HomeScreenV4$1$1(homeViewModelV42, rememberIsAppInForeground, null);
                        qVar.h0(L);
                    }
                    u2.r.f((ho.p) L, valueOf, qVar);
                    h11 = qVar.h(homeViewModelV42);
                    L2 = qVar.L();
                    if (!h11 || L2 == eVar) {
                        L2 = new h(homeViewModelV42, 0);
                        qVar.h0(L2);
                    }
                    z zVar = z.f31622a;
                    u2.r.c(zVar, (ho.l) L2, qVar);
                    L3 = qVar.L();
                    if (L3 == eVar) {
                        L3 = u2.r.A(Boolean.FALSE);
                        qVar.h0(L3);
                    }
                    z0Var = (z0) L3;
                    L4 = qVar.L();
                    if (L4 == eVar) {
                        L4 = u2.r.A(Boolean.FALSE);
                        qVar.h0(L4);
                    }
                    z0 z0Var2 = (z0) L4;
                    n0 n0Var = new n0(2);
                    h12 = qVar.h(homeViewModelV42);
                    L5 = qVar.L();
                    if (!h12 || L5 == eVar) {
                        L5 = new h(homeViewModelV42, 1);
                        qVar.h0(L5);
                    }
                    j.j C = android.support.v4.media.session.b.C(n0Var, (ho.l) L5, qVar, 0);
                    h13 = qVar.h(homeViewModelV42);
                    L6 = qVar.L();
                    if (!h13 || L6 == eVar) {
                        L6 = new HomeScreenV4Kt$HomeScreenV4$3$1(homeViewModelV42, z0Var2, z0Var, null);
                        qVar.h0(L6);
                    }
                    u2.r.f((ho.p) L6, zVar, qVar);
                    if (!HomeScreenV4$lambda$3(z0Var)) {
                        qVar.X(-772551456);
                        boolean h15 = qVar.h(C);
                        Object L8 = qVar.L();
                        if (h15 || L8 == eVar) {
                            L8 = new HomeScreenV4Kt$HomeScreenV4$4$1(C, z0Var, null);
                            qVar.h0(L8);
                        }
                        u2.r.f((ho.p) L8, zVar, qVar);
                        i14 = 0;
                        qVar.p(false);
                    } else {
                        i14 = 0;
                        qVar.X(-772367905);
                        qVar.p(false);
                    }
                    HomeStateV4 homeStateV4 = (HomeStateV4) u2.r.o(homeViewModelV42.getStateFlow(), qVar, i14).getValue();
                    boolean showNotificationPrimerSheet = homeStateV4.getShowNotificationPrimerSheet();
                    NotificationPrimerSource notificationPrimerSource = homeStateV4.getNotificationPrimerSource();
                    NotificationPrimerModel notificationPrimerModel = homeStateV4.getNotificationPrimerModel();
                    h14 = qVar.h(homeViewModelV42);
                    L7 = qVar.L();
                    if (!h14 || L7 == eVar) {
                        L7 = new a(homeViewModelV42, 2);
                        qVar.h0(L7);
                    }
                    HomeViewModelV4 homeViewModelV44 = homeViewModelV42;
                    NotificationPrimerBottomSheetKt.NotificationPrimerOverlay(showNotificationPrimerSheet, notificationPrimerSource, notificationPrimerModel, (ho.a) L7, c3.k.d(-420362272, true, new i(homeStateV4, homeViewModelV44, aVar, pVar, pVar2, lVar, aVar2, j2Var, oVar, pVar3), qVar), qVar, 24576);
                    homeViewModelV43 = homeViewModelV44;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            i13 = 0;
            qVar.q();
            boolean rememberIsAppInForeground2 = ComposeExtensionsKt.rememberIsAppInForeground(qVar, i13);
            Boolean valueOf2 = Boolean.valueOf(rememberIsAppInForeground2);
            h10 = qVar.h(homeViewModelV42) | qVar.g(rememberIsAppInForeground2);
            L = qVar.L();
            eVar = u2.l.f33918a;
            if (!h10) {
            }
            L = new HomeScreenV4Kt$HomeScreenV4$1$1(homeViewModelV42, rememberIsAppInForeground2, null);
            qVar.h0(L);
            u2.r.f((ho.p) L, valueOf2, qVar);
            h11 = qVar.h(homeViewModelV42);
            L2 = qVar.L();
            if (!h11) {
            }
            L2 = new h(homeViewModelV42, 0);
            qVar.h0(L2);
            z zVar2 = z.f31622a;
            u2.r.c(zVar2, (ho.l) L2, qVar);
            L3 = qVar.L();
            if (L3 == eVar) {
            }
            z0Var = (z0) L3;
            L4 = qVar.L();
            if (L4 == eVar) {
            }
            z0 z0Var22 = (z0) L4;
            n0 n0Var2 = new n0(2);
            h12 = qVar.h(homeViewModelV42);
            L5 = qVar.L();
            if (!h12) {
            }
            L5 = new h(homeViewModelV42, 1);
            qVar.h0(L5);
            j.j C2 = android.support.v4.media.session.b.C(n0Var2, (ho.l) L5, qVar, 0);
            h13 = qVar.h(homeViewModelV42);
            L6 = qVar.L();
            if (!h13) {
            }
            L6 = new HomeScreenV4Kt$HomeScreenV4$3$1(homeViewModelV42, z0Var22, z0Var, null);
            qVar.h0(L6);
            u2.r.f((ho.p) L6, zVar2, qVar);
            if (!HomeScreenV4$lambda$3(z0Var)) {
            }
            HomeStateV4 homeStateV42 = (HomeStateV4) u2.r.o(homeViewModelV42.getStateFlow(), qVar, i14).getValue();
            boolean showNotificationPrimerSheet2 = homeStateV42.getShowNotificationPrimerSheet();
            NotificationPrimerSource notificationPrimerSource2 = homeStateV42.getNotificationPrimerSource();
            NotificationPrimerModel notificationPrimerModel2 = homeStateV42.getNotificationPrimerModel();
            h14 = qVar.h(homeViewModelV42);
            L7 = qVar.L();
            if (!h14) {
            }
            L7 = new a(homeViewModelV42, 2);
            qVar.h0(L7);
            HomeViewModelV4 homeViewModelV442 = homeViewModelV42;
            NotificationPrimerBottomSheetKt.NotificationPrimerOverlay(showNotificationPrimerSheet2, notificationPrimerSource2, notificationPrimerModel2, (ho.a) L7, c3.k.d(-420362272, true, new i(homeStateV42, homeViewModelV442, aVar, pVar, pVar2, lVar, aVar2, j2Var, oVar, pVar3), qVar), qVar, 24576);
            homeViewModelV43 = homeViewModelV442;
        } else {
            qVar.R();
            homeViewModelV43 = homeViewModelV42;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.h(aVar, homeViewModelV43, pVar, pVar2, pVar3, lVar, aVar2, j2Var, oVar, i10, i11);
        }
    }

    public static final h0 HomeScreenV4$lambda$1$0(final HomeViewModelV4 homeViewModelV4, i0 i0Var) {
        i0Var.getClass();
        return new h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt$HomeScreenV4$lambda$1$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                HomeViewModelV4.this.stopPreview();
            }
        };
    }

    public static final z HomeScreenV4$lambda$11$0(HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.hideNotificationPrimer();
        return z.f31622a;
    }

    public static final z HomeScreenV4$lambda$12(HomeStateV4 homeStateV4, HomeViewModelV4 homeViewModelV4, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar, ho.a aVar2, j2 j2Var, i1.o oVar, ho.p pVar3, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(homeViewModelV4);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (h10 || L == eVar) {
                L = new h(homeViewModelV4, 2);
                qVar.h0(L);
            }
            ho.l lVar2 = (ho.l) L;
            c3.j d10 = c3.k.d(-588321842, true, new l(pVar3, 0), qVar);
            boolean f10 = qVar.f(pVar2);
            Object L2 = qVar.L();
            if (f10 || L2 == eVar) {
                L2 = new m(pVar2, 0);
                qVar.h0(L2);
            }
            HomeScreenV4UI(homeStateV4, lVar2, aVar, pVar, d10, (ho.l) L2, lVar, aVar2, j2Var, oVar, qVar, 24576, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV4$lambda$12$0$0(HomeViewModelV4 homeViewModelV4, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(homeViewModelV4);
        return z.f31622a;
    }

    public static final z HomeScreenV4$lambda$12$1(ho.p pVar, u2.m mVar, int i10) {
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
                L = new m(pVar, 1);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(t2.u.P, false, 0L, (ho.l) L, null, qVar, 0, 23);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV4$lambda$12$1$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return z.f31622a;
    }

    public static final z HomeScreenV4$lambda$12$2$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.HomeItems);
        return z.f31622a;
    }

    public static final z HomeScreenV4$lambda$13(ho.a aVar, HomeViewModelV4 homeViewModelV4, ho.p pVar, ho.p pVar2, ho.p pVar3, ho.l lVar, ho.a aVar2, j2 j2Var, i1.o oVar, int i10, int i11, u2.m mVar, int i12) {
        HomeScreenV4(aVar, homeViewModelV4, pVar, pVar2, pVar3, lVar, aVar2, j2Var, oVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final boolean HomeScreenV4$lambda$3(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void HomeScreenV4$lambda$4(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final boolean HomeScreenV4$lambda$6(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void HomeScreenV4$lambda$7(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z HomeScreenV4$lambda$8$0(HomeViewModelV4 homeViewModelV4, Map map) {
        boolean z6;
        map.getClass();
        Boolean bool = (Boolean) map.get("android.permission.POST_NOTIFICATIONS");
        if (bool != null) {
            z6 = bool.booleanValue();
        } else {
            z6 = false;
        }
        homeViewModelV4.onNotificationPermissionResult(z6);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeScreenV4UI(HomeStateV4 homeStateV4, ho.l lVar, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar2, ho.l lVar3, ho.a aVar2, j2 j2Var, i1.o oVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        int i13;
        int i14;
        ho.p pVar3;
        int i15;
        int i16;
        ho.p pVar4;
        int i17;
        int i18;
        ho.l lVar4;
        int i19;
        int i20;
        int i21;
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
        boolean z6;
        ho.l lVar5;
        j2 j2Var2;
        ho.a aVar4;
        ho.p pVar5;
        ho.p pVar6;
        ho.l lVar6;
        ho.a aVar5;
        i1.o oVar2;
        u2.r1 r10;
        ho.a aVar6;
        ho.p pVar7;
        ho.p pVar8;
        ho.l lVar7;
        int i32;
        ho.l lVar8;
        int i33;
        ho.a aVar7;
        j2 j2Var3;
        i1.o oVar3;
        int i34;
        int i35;
        homeStateV4.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(442672065);
        if ((i10 & 6) == 0) {
            if (qVar.h(homeStateV4)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i12 = i35 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i34 = 32;
            } else {
                i34 = 16;
            }
            i12 |= i34;
        }
        int i36 = i11 & 4;
        if (i36 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            aVar3 = aVar;
            if (qVar.h(aVar3)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                pVar3 = pVar;
                if (qVar.h(pVar3)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    pVar4 = pVar2;
                    if (qVar.h(pVar4)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 32;
                    if (i18 == 0) {
                        i12 |= 196608;
                    } else if ((196608 & i10) == 0) {
                        lVar4 = lVar2;
                        if (qVar.h(lVar4)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                        i20 = i11 & 64;
                        if (i20 != 0) {
                            i12 |= 1572864;
                        } else if ((1572864 & i10) == 0) {
                            if (qVar.h(lVar3)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                            int i37 = i12;
                            i22 = i11 & 128;
                            if (i22 == 0) {
                                i24 = i37 | 12582912;
                                i23 = i22;
                            } else if ((i10 & 12582912) == 0) {
                                i23 = i22;
                                if (qVar.h(aVar2)) {
                                    i25 = 8388608;
                                } else {
                                    i25 = 4194304;
                                }
                                i24 = i37 | i25;
                            } else {
                                i23 = i22;
                                i24 = i37;
                            }
                            i26 = i11 & RpcError.MAX_MESSAGE_BYTES;
                            if (i26 == 0) {
                                i24 |= 100663296;
                            } else if ((i10 & 100663296) == 0) {
                                i27 = i26;
                                if (qVar.f(j2Var)) {
                                    i28 = 67108864;
                                } else {
                                    i28 = 33554432;
                                }
                                i24 |= i28;
                                i29 = i11 & 512;
                                if (i29 != 0) {
                                    i24 |= 805306368;
                                } else if ((i10 & 805306368) == 0) {
                                    i30 = i29;
                                    if (qVar.h(oVar)) {
                                        i31 = 536870912;
                                    } else {
                                        i31 = 268435456;
                                    }
                                    i24 |= i31;
                                    if ((i24 & 306783379) == 306783378) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!qVar.O(i24 & 1, z6)) {
                                        Object obj = u2.l.f33918a;
                                        if (i36 != 0) {
                                            Object L = qVar.L();
                                            if (L == obj) {
                                                L = new o(1);
                                                qVar.h0(L);
                                            }
                                            aVar6 = (ho.a) L;
                                        } else {
                                            aVar6 = aVar3;
                                        }
                                        if (i14 != 0) {
                                            pVar7 = ComposableSingletons$HomeScreenV4Kt.INSTANCE.m1422getLambda$1396007387$app_productionRelease();
                                        } else {
                                            pVar7 = pVar3;
                                        }
                                        if (i16 != 0) {
                                            pVar8 = ComposableSingletons$HomeScreenV4Kt.INSTANCE.m1423getLambda$587776037$app_productionRelease();
                                        } else {
                                            pVar8 = pVar4;
                                        }
                                        if (i18 != 0) {
                                            Object L2 = qVar.L();
                                            if (L2 == obj) {
                                                L2 = new r(8);
                                                qVar.h0(L2);
                                            }
                                            lVar7 = (ho.l) L2;
                                        } else {
                                            lVar7 = lVar4;
                                        }
                                        if (i20 != 0) {
                                            Object L3 = qVar.L();
                                            if (L3 == obj) {
                                                L3 = new r(9);
                                                qVar.h0(L3);
                                            }
                                            int i38 = i27;
                                            lVar8 = (ho.l) L3;
                                            i32 = i38;
                                        } else {
                                            i32 = i27;
                                            lVar8 = lVar3;
                                        }
                                        if (i23 != 0) {
                                            Object L4 = qVar.L();
                                            if (L4 == obj) {
                                                L4 = new o(2);
                                                qVar.h0(L4);
                                            }
                                            int i39 = i30;
                                            aVar7 = (ho.a) L4;
                                            i33 = i39;
                                        } else {
                                            i33 = i30;
                                            aVar7 = aVar2;
                                        }
                                        if (i32 != 0) {
                                            j2Var3 = null;
                                        } else {
                                            j2Var3 = j2Var;
                                        }
                                        if (i33 != 0) {
                                            oVar3 = null;
                                        } else {
                                            oVar3 = oVar;
                                        }
                                        u2.r.b(new fe.h0[]{LocalExplorePricesKt.getLocalExplorePrices().a(homeStateV4.getLocalizedPrices()), LocalExplorePricesKt.getLocalIsFreeUser().a(homeStateV4.isFreeUser())}, c3.k.d(-763038271, true, new i(pVar7, homeStateV4, lVar, lVar7, lVar8, aVar7, j2Var3, oVar3, aVar6, pVar8), qVar), qVar, 56);
                                        pVar5 = pVar7;
                                        lVar6 = lVar7;
                                        lVar5 = lVar8;
                                        aVar5 = aVar7;
                                        j2Var2 = j2Var3;
                                        oVar2 = oVar3;
                                        aVar4 = aVar6;
                                        pVar6 = pVar8;
                                    } else {
                                        qVar.R();
                                        lVar5 = lVar3;
                                        j2Var2 = j2Var;
                                        aVar4 = aVar3;
                                        pVar5 = pVar3;
                                        pVar6 = pVar4;
                                        lVar6 = lVar4;
                                        aVar5 = aVar2;
                                        oVar2 = oVar;
                                    }
                                    r10 = qVar.r();
                                    if (r10 == null) {
                                        r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.f(homeStateV4, lVar, aVar4, pVar5, pVar6, lVar6, lVar5, aVar5, j2Var2, oVar2, i10, i11);
                                        return;
                                    }
                                    return;
                                }
                                i30 = i29;
                                if ((i24 & 306783379) == 306783378) {
                                }
                                if (!qVar.O(i24 & 1, z6)) {
                                }
                                r10 = qVar.r();
                                if (r10 == null) {
                                }
                            }
                            i27 = i26;
                            i29 = i11 & 512;
                            if (i29 != 0) {
                            }
                            i30 = i29;
                            if ((i24 & 306783379) == 306783378) {
                            }
                            if (!qVar.O(i24 & 1, z6)) {
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                            }
                        }
                        int i372 = i12;
                        i22 = i11 & 128;
                        if (i22 == 0) {
                        }
                        i26 = i11 & RpcError.MAX_MESSAGE_BYTES;
                        if (i26 == 0) {
                        }
                        i27 = i26;
                        i29 = i11 & 512;
                        if (i29 != 0) {
                        }
                        i30 = i29;
                        if ((i24 & 306783379) == 306783378) {
                        }
                        if (!qVar.O(i24 & 1, z6)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    lVar4 = lVar2;
                    i20 = i11 & 64;
                    if (i20 != 0) {
                    }
                    int i3722 = i12;
                    i22 = i11 & 128;
                    if (i22 == 0) {
                    }
                    i26 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i26 == 0) {
                    }
                    i27 = i26;
                    i29 = i11 & 512;
                    if (i29 != 0) {
                    }
                    i30 = i29;
                    if ((i24 & 306783379) == 306783378) {
                    }
                    if (!qVar.O(i24 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                pVar4 = pVar2;
                i18 = i11 & 32;
                if (i18 == 0) {
                }
                lVar4 = lVar2;
                i20 = i11 & 64;
                if (i20 != 0) {
                }
                int i37222 = i12;
                i22 = i11 & 128;
                if (i22 == 0) {
                }
                i26 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i26 == 0) {
                }
                i27 = i26;
                i29 = i11 & 512;
                if (i29 != 0) {
                }
                i30 = i29;
                if ((i24 & 306783379) == 306783378) {
                }
                if (!qVar.O(i24 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            pVar3 = pVar;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            pVar4 = pVar2;
            i18 = i11 & 32;
            if (i18 == 0) {
            }
            lVar4 = lVar2;
            i20 = i11 & 64;
            if (i20 != 0) {
            }
            int i372222 = i12;
            i22 = i11 & 128;
            if (i22 == 0) {
            }
            i26 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i26 == 0) {
            }
            i27 = i26;
            i29 = i11 & 512;
            if (i29 != 0) {
            }
            i30 = i29;
            if ((i24 & 306783379) == 306783378) {
            }
            if (!qVar.O(i24 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        aVar3 = aVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        pVar3 = pVar;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        pVar4 = pVar2;
        i18 = i11 & 32;
        if (i18 == 0) {
        }
        lVar4 = lVar2;
        i20 = i11 & 64;
        if (i20 != 0) {
        }
        int i3722222 = i12;
        i22 = i11 & 128;
        if (i22 == 0) {
        }
        i26 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i26 == 0) {
        }
        i27 = i26;
        i29 = i11 & 512;
        if (i29 != 0) {
        }
        i30 = i29;
        if ((i24 & 306783379) == 306783378) {
        }
        if (!qVar.O(i24 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeScreenV4UI$lambda$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$2$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0(ho.p pVar, final HomeStateV4 homeStateV4, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, final ho.a aVar, final j2 j2Var, final i1.o oVar, final ho.a aVar2, final ho.p pVar2, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            long primary = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable);
            WeakHashMap weakHashMap = c3.f29142x;
            k5.a(null, null, pVar, null, null, 0, primary, 0L, new r1.i0(u0.e(qVar).f29154l, new o1(u0.e(qVar).f29154l, 16)), c3.k.d(-1585924526, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.q
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z HomeScreenV4UI$lambda$4$0$0;
                    int intValue = ((Integer) obj3).intValue();
                    HomeScreenV4UI$lambda$4$0$0 = HomeScreenV4Kt.HomeScreenV4UI$lambda$4$0$0(HomeStateV4.this, lVar, lVar2, lVar3, aVar, j2Var, oVar, aVar2, pVar2, (z1) obj, (u2.m) obj2, intValue);
                    return HomeScreenV4UI$lambda$4$0$0;
                }
            }, qVar), qVar, 805306368, 187);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0(final HomeStateV4 homeStateV4, ho.l lVar, final ho.l lVar2, final ho.l lVar3, ho.a aVar, j2 j2Var, i1.o oVar, ho.a aVar2, ho.p pVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        Object obj;
        i3.q qVar;
        float f10;
        u2.e eVar;
        int i12;
        final ho.l lVar4 = lVar;
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
            u2.e eVar2 = u2.l.f33918a;
            if (L == eVar2) {
                L = new o(0);
                qVar2.h0(L);
            }
            x0 x0Var = (x0) f3.m.e(objArr, (ho.a) L, qVar2, 48);
            final float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(HomeScreenV4UI$lambda$4$0$0$1(x0Var), (u2.m) qVar2, 0);
            Object L2 = qVar2.L();
            if (L2 == eVar2) {
                L2 = u2.r.A(Boolean.TRUE);
                qVar2.h0(L2);
            }
            z0 z0Var = (z0) L2;
            Object L3 = qVar2.L();
            if (L3 == eVar2) {
                L3 = new t(z0Var, 7);
                qVar2.h0(L3);
            }
            b4.a rememberUiVisibilityNestedScrollConnection = AnimatedVisibilityContainersKt.rememberUiVisibilityNestedScrollConnection(null, (ho.l) L3, qVar2, 48, 1);
            Object L4 = qVar2.L();
            if (L4 == eVar2) {
                L4 = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
            }
            x0 x0Var2 = (x0) L4;
            final float rememberPxToDp2 = ComposeExtensionsKt.rememberPxToDp(HomeScreenV4UI$lambda$4$0$0$8(x0Var2), (u2.m) qVar2, 0);
            i3.q qVar3 = i3.q.f13017a;
            i3.t a10 = b4.f.a(r1.d.D(p2.c(p2.d(qVar3, 1.0f), 1.0f), z1Var), rememberUiVisibilityNestedScrollConnection, null);
            boolean c5 = qVar2.c(rememberPxToDp) | qVar2.h(homeStateV4) | qVar2.f(lVar4) | qVar2.f(lVar2) | qVar2.f(lVar3) | qVar2.c(rememberPxToDp2);
            Object L5 = qVar2.L();
            if (!c5 && L5 != eVar2) {
                qVar = qVar3;
                obj = L5;
                f10 = 1.0f;
            } else {
                qVar = qVar3;
                f10 = 1.0f;
                obj = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.p
                    @Override // ho.l
                    public final Object invoke(Object obj2) {
                        z HomeScreenV4UI$lambda$4$0$0$10$0;
                        HomeScreenV4UI$lambda$4$0$0$10$0 = HomeScreenV4Kt.HomeScreenV4UI$lambda$4$0$0$10$0(HomeStateV4.this, rememberPxToDp, lVar4, lVar2, lVar3, rememberPxToDp2, (t1.t) obj2);
                        return HomeScreenV4UI$lambda$4$0$0$10$0;
                    }
                };
                lVar4 = lVar4;
                qVar2.h0(obj);
            }
            c1.c(a10, null, null, false, null, null, null, false, null, (ho.l) obj, qVar2, 0, 510);
            u2.q qVar4 = qVar2;
            if (!wq.n.m0(homeStateV4.getError())) {
                qVar4.X(-1635967203);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(r1.d.D(qVar, z1Var), null, homeStateV4.getError(), c3.k.d(128841267, true, new l(lVar4, 1), qVar4), null, EchoTheme.INSTANCE.getColors(qVar4, EchoTheme.$stable).getBackground().getPrimary(qVar4, EchoThemeColors.Background.$stable), qVar4, 3072, 18);
                qVar4 = qVar4;
                qVar4.p(false);
            } else {
                qVar4.X(-1635443024);
                qVar4.p(false);
            }
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(homeStateV4.isLoading(), null, EchoTheme.INSTANCE.getColors(qVar4, EchoTheme.$stable).getBackground().getPrimary(qVar4, EchoThemeColors.Background.$stable), qVar4, 0, 2);
            AnimatedVisibilityContainersKt.AnimatedSlideTopVisibility(HomeScreenV4UI$lambda$4$0$0$4(z0Var), c3.k.d(625406713, true, new id.l(x0Var, j2Var, oVar, homeStateV4, aVar2, lVar4), qVar4), qVar4, 48);
            i3.t D = r1.d.D(p2.d(qVar, f10), z1Var);
            f1 d10 = r1.p.d(i3.d.Z, false);
            int hashCode = Long.hashCode(qVar4.T);
            c3.o l4 = qVar4.l();
            i3.t c10 = i3.a.c(D, qVar4);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar4.b0();
            if (qVar4.S) {
                qVar4.k(fVar);
            } else {
                qVar4.k0();
            }
            h4.e eVar3 = h4.g.f11907f;
            u2.r.J(eVar3, d10, qVar4);
            h4.e eVar4 = h4.g.f11906e;
            u2.r.J(eVar4, l4, qVar4);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar5 = h4.g.f11908g;
            u2.r.y(qVar4, valueOf, eVar5);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar4);
            h4.e eVar6 = h4.g.f11905d;
            u2.r.J(eVar6, c10, qVar4);
            i3.t e10 = p2.e(qVar, f10);
            Object L6 = qVar4.L();
            if (L6 == eVar2) {
                L6 = new j(x0Var2, 1);
                qVar4.h0(L6);
            }
            i3.t q = f4.i0.q(e10, (ho.l) L6);
            f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar4.T);
            c3.o l7 = qVar4.l();
            i3.t c11 = i3.a.c(q, qVar4);
            qVar4.b0();
            if (qVar4.S) {
                qVar4.k(fVar);
            } else {
                qVar4.k0();
            }
            u2.r.J(eVar3, d11, qVar4);
            u2.r.J(eVar4, l7, qVar4);
            defpackage.f.u(hashCode2, qVar4, eVar5, qVar4, dVar);
            u2.r.J(eVar6, c11, qVar4);
            j0.c.r(0, pVar, qVar4, true, true);
            if (homeStateV4.getShowDailyStreakSettings()) {
                qVar4.X(-1633426660);
                boolean f11 = qVar4.f(lVar4);
                Object L7 = qVar4.L();
                if (f11 || L7 == eVar2) {
                    L7 = new g(lVar4, 1);
                    qVar4.h0(L7);
                }
                ComposableSingletons$HomeScreenV4Kt composableSingletons$HomeScreenV4Kt = ComposableSingletons$HomeScreenV4Kt.INSTANCE;
                ho.r m1424getLambda$802376801$app_productionRelease = composableSingletons$HomeScreenV4Kt.m1424getLambda$802376801$app_productionRelease();
                ho.r lambda$368859567$app_productionRelease = composableSingletons$HomeScreenV4Kt.getLambda$368859567$app_productionRelease();
                eVar = eVar2;
                u2.q qVar5 = qVar4;
                BottomSheetScaffoldKt.m1897BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, (ho.a) L7, m1424getLambda$802376801$app_productionRelease, lambda$368859567$app_productionRelease, (u2.m) qVar5, 1769472, 15);
                qVar4 = qVar5;
                qVar4.p(false);
            } else {
                eVar = eVar2;
                qVar4.X(-1632638640);
                qVar4.p(false);
            }
            if (homeStateV4.getShowWhatsNewPopup()) {
                qVar4.X(-1632587087);
                boolean f12 = qVar4.f(lVar4);
                Object L8 = qVar4.L();
                if (f12 || L8 == eVar) {
                    L8 = new g(lVar4, 2);
                    qVar4.h0(L8);
                }
                ho.a aVar3 = (ho.a) L8;
                boolean f13 = qVar4.f(lVar4) | qVar4.f(aVar);
                Object L9 = qVar4.L();
                if (f13 || L9 == eVar) {
                    L9 = new n(lVar4, aVar);
                    qVar4.h0(L9);
                }
                WhatsNewPopupKt.WhatsNewPopup(aVar3, (ho.a) L9, qVar4, 0);
                qVar4.p(false);
            } else {
                qVar4.X(-1632311280);
                qVar4.p(false);
            }
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final x0 HomeScreenV4UI$lambda$4$0$0$0$0() {
        return new u2.f1(250);
    }

    private static final int HomeScreenV4UI$lambda$4$0$0$1(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$10$0(HomeStateV4 homeStateV4, float f10, ho.l lVar, ho.l lVar2, ho.l lVar3, float f11, t1.t tVar) {
        t1.t tVar2;
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.g(f10, 4), true, -1196071705), 3);
        HomePageV4 page = homeStateV4.getPage();
        if (page != null) {
            tVar2 = tVar;
            homeItems(tVar2, page, homeStateV4, lVar, lVar2, lVar3);
        } else {
            tVar2 = tVar;
        }
        t1.t.c(tVar2, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.g(f11, 5), true, -831657378), 3);
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$10$0$0(float f10, t1.b bVar, u2.m mVar, int i10) {
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

    public static final z HomeScreenV4UI$lambda$4$0$0$10$0$2(float f10, t1.b bVar, u2.m mVar, int i10) {
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

    public static final z HomeScreenV4UI$lambda$4$0$0$11(ho.l lVar, u2.m mVar, int i10) {
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
                L = new g(lVar, 0);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$11$0$0(ho.l lVar) {
        lVar.invoke(new r(11));
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$11$0$0$0(HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.loadPage();
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$12(x0 x0Var, final j2 j2Var, final i1.o oVar, HomeStateV4 homeStateV4, ho.a aVar, ho.l lVar, u2.m mVar, int i10) {
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
                L = new j(x0Var, 0);
                qVar.h0(L);
            }
            HeaderKt.EchoHeader(c3.k.d(-49066816, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.k
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z HomeScreenV4UI$lambda$4$0$0$12$1;
                    int intValue = ((Integer) obj3).intValue();
                    HomeScreenV4UI$lambda$4$0$0$12$1 = HomeScreenV4Kt.HomeScreenV4UI$lambda$4$0$0$12$1(j2.this, oVar, (l2) obj, (u2.m) obj2, intValue);
                    return HomeScreenV4UI$lambda$4$0$0$12$1;
                }
            }, qVar), f4.i0.q(i3.q.f13017a, (ho.l) L), c3.k.d(710492098, true, new fm.o(homeStateV4, aVar, lVar, 12), qVar), EchoHeaderStyle.Large, null, null, qVar, 3462, 48);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$12$0$0(x0 x0Var, h5.l lVar) {
        HomeScreenV4UI$lambda$4$0$0$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$12$1(j2 j2Var, i1.o oVar, l2 l2Var, u2.m mVar, int i10) {
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
            j7.d(kj.c.R(qVar, R.string.home_home), SearchButtonKt.headerTitleSharedElement(l2Var.b(i3.q.f13017a, 1.0f, true), j2Var, oVar, qVar, 0), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, EchoTheme.INSTANCE.getTypography(qVar, EchoTheme.$stable).getTwoXlCompact500(qVar, EchoThemeTypography.$stable), qVar, 0, 24960, 110588);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$12$2(HomeStateV4 homeStateV4, ho.a aVar, ho.l lVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            User user = homeStateV4.getUser();
            Boolean isFreeUser = homeStateV4.isFreeUser();
            boolean f10 = qVar.f(aVar) | qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new n(aVar, lVar);
                qVar.h0(L);
            }
            HomeAccountButtonKt.HomeAccountButtonV4(user, isFreeUser, (ho.a) L, null, qVar, 0, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$12$2$0$0(ho.a aVar, ho.l lVar) {
        aVar.invoke();
        lVar.invoke(new r(2));
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$12$2$0$0$0(HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.getAnalytics().log(Analytics.Event.HomeClickedAccountButton.INSTANCE);
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$13$0$0(x0 x0Var, h5.l lVar) {
        HomeScreenV4UI$lambda$4$0$0$9(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$14$0(ho.l lVar) {
        lVar.invoke(new r(12));
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$14$0$0(HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.closeDailyStreakSettings();
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$15$0(ho.l lVar) {
        lVar.invoke(new r(1));
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$15$0$0(HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.closeWhatsNew();
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$16$0(ho.l lVar, ho.a aVar) {
        lVar.invoke(new r(4));
        aVar.invoke();
        return z.f31622a;
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$16$0$0(HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.closeWhatsNew();
        return z.f31622a;
    }

    private static final void HomeScreenV4UI$lambda$4$0$0$2(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final boolean HomeScreenV4UI$lambda$4$0$0$4(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void HomeScreenV4UI$lambda$4$0$0$5(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z HomeScreenV4UI$lambda$4$0$0$6$0(z0 z0Var, boolean z6) {
        HomeScreenV4UI$lambda$4$0$0$5(z0Var, z6);
        return z.f31622a;
    }

    private static final int HomeScreenV4UI$lambda$4$0$0$8(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void HomeScreenV4UI$lambda$4$0$0$9(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final z HomeScreenV4UI$lambda$5(HomeStateV4 homeStateV4, ho.l lVar, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar2, ho.l lVar3, ho.a aVar2, j2 j2Var, i1.o oVar, int i10, int i11, u2.m mVar, int i12) {
        HomeScreenV4UI(homeStateV4, lVar, aVar, pVar, pVar2, lVar2, lVar3, aVar2, j2Var, oVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void HomeSectionContent(HomePageV4.Section section, HomeStateV4 homeStateV4, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, i3.t tVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
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
        i3.t tVar2 = tVar;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(431249747);
        if ((i10 & 6) == 0) {
            if (qVar2.h(section)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(homeStateV4)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(lVar3)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.f(tVar2)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            boolean z29 = section instanceof HomePageV4.Section.RecentReadsSection;
            u2.e eVar = u2.l.f33918a;
            if (z29) {
                qVar2.X(1114377061);
                String title = ((HomePageV4.Section.RecentReadsSection) section).getTitle();
                List<ReadMeta> recentReads = homeStateV4.getRecentReads();
                List<MediaItemState> playerQueue = homeStateV4.getPlayerQueue();
                if ((i11 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                int i18 = i11 & 896;
                if (i18 == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z30 = z26 | z27;
                Object L = qVar2.L();
                if (z30 || L == eVar) {
                    final int i19 = 0;
                    L = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.d
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z HomeSectionContent$lambda$0$0;
                            z HomeSectionContent$lambda$8$0;
                            z HomeSectionContent$lambda$10$0;
                            z HomeSectionContent$lambda$2$0;
                            z HomeSectionContent$lambda$3$0;
                            z HomeSectionContent$lambda$4$0;
                            z HomeSectionContent$lambda$6$0;
                            switch (i19) {
                                case 0:
                                    HomeSectionContent$lambda$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$0$0(lVar2, lVar, (ReadMeta) obj);
                                    return HomeSectionContent$lambda$0$0;
                                case 1:
                                    HomeSectionContent$lambda$8$0 = HomeScreenV4Kt.HomeSectionContent$lambda$8$0(lVar2, lVar, (String) obj);
                                    return HomeSectionContent$lambda$8$0;
                                case 2:
                                    HomeSectionContent$lambda$10$0 = HomeScreenV4Kt.HomeSectionContent$lambda$10$0(lVar2, lVar, (String) obj);
                                    return HomeSectionContent$lambda$10$0;
                                case 3:
                                    HomeSectionContent$lambda$2$0 = HomeScreenV4Kt.HomeSectionContent$lambda$2$0(lVar2, lVar, (HomePageV4.Section.HomeActionList.HomeActionItem) obj);
                                    return HomeSectionContent$lambda$2$0;
                                case 4:
                                    HomeSectionContent$lambda$3$0 = HomeScreenV4Kt.HomeSectionContent$lambda$3$0(lVar2, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                    return HomeSectionContent$lambda$3$0;
                                case 5:
                                    HomeSectionContent$lambda$4$0 = HomeScreenV4Kt.HomeSectionContent$lambda$4$0(lVar2, lVar, (MiniReadGridSection.Item) obj);
                                    return HomeSectionContent$lambda$4$0;
                                default:
                                    HomeSectionContent$lambda$6$0 = HomeScreenV4Kt.HomeSectionContent$lambda$6$0(lVar2, lVar, (String) obj);
                                    return HomeSectionContent$lambda$6$0;
                            }
                        }
                    };
                    qVar2.h0(L);
                }
                ho.l lVar4 = (ho.l) L;
                if (i18 == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                Object L2 = qVar2.L();
                if (z28 || L2 == eVar) {
                    final int i20 = 1;
                    L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.f
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z HomeSectionContent$lambda$9$0;
                            z HomeSectionContent$lambda$1$0;
                            switch (i20) {
                                case 0:
                                    HomeSectionContent$lambda$9$0 = HomeScreenV4Kt.HomeSectionContent$lambda$9$0(lVar, (ExploreRead) obj);
                                    return HomeSectionContent$lambda$9$0;
                                default:
                                    HomeSectionContent$lambda$1$0 = HomeScreenV4Kt.HomeSectionContent$lambda$1$0(lVar, (ReadMeta) obj);
                                    return HomeSectionContent$lambda$1$0;
                            }
                        }
                    };
                    qVar2.h0(L2);
                }
                qVar = qVar2;
                HomeRecentReadsCarouselKt.HomeRecentReadsCarouselV4(title, recentReads, playerQueue, tVar2, lVar4, (ho.l) L2, qVar, (i11 >> 6) & 7168, 0);
                qVar.p(false);
            } else {
                u2.q qVar3 = qVar2;
                if (section instanceof HomePageV4.Section.HomeActionList) {
                    qVar3.X(2114174723);
                    HomePageV4.Section.HomeActionList homeActionList = (HomePageV4.Section.HomeActionList) section;
                    if ((i11 & 57344) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i11 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z31 = z24 | z25;
                    Object L3 = qVar3.L();
                    if (z31 || L3 == eVar) {
                        final int i21 = 3;
                        L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.d
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                z HomeSectionContent$lambda$0$0;
                                z HomeSectionContent$lambda$8$0;
                                z HomeSectionContent$lambda$10$0;
                                z HomeSectionContent$lambda$2$0;
                                z HomeSectionContent$lambda$3$0;
                                z HomeSectionContent$lambda$4$0;
                                z HomeSectionContent$lambda$6$0;
                                switch (i21) {
                                    case 0:
                                        HomeSectionContent$lambda$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                        return HomeSectionContent$lambda$0$0;
                                    case 1:
                                        HomeSectionContent$lambda$8$0 = HomeScreenV4Kt.HomeSectionContent$lambda$8$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$8$0;
                                    case 2:
                                        HomeSectionContent$lambda$10$0 = HomeScreenV4Kt.HomeSectionContent$lambda$10$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$10$0;
                                    case 3:
                                        HomeSectionContent$lambda$2$0 = HomeScreenV4Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (HomePageV4.Section.HomeActionList.HomeActionItem) obj);
                                        return HomeSectionContent$lambda$2$0;
                                    case 4:
                                        HomeSectionContent$lambda$3$0 = HomeScreenV4Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                        return HomeSectionContent$lambda$3$0;
                                    case 5:
                                        HomeSectionContent$lambda$4$0 = HomeScreenV4Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                        return HomeSectionContent$lambda$4$0;
                                    default:
                                        HomeSectionContent$lambda$6$0 = HomeScreenV4Kt.HomeSectionContent$lambda$6$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$6$0;
                                }
                            }
                        };
                        qVar3.h0(L3);
                    }
                    HomeActionListSectionKt.HomeActionListSectionV4(homeActionList, (ho.l) L3, tVar, qVar3, (i11 & 14) | ((i11 >> 9) & 896), 0);
                    qVar3.p(false);
                } else if (section instanceof HomePageV4.Section.FeaturedCardList) {
                    qVar3.X(1115265366);
                    HomePageV4.Section.FeaturedCardList featuredCardList = (HomePageV4.Section.FeaturedCardList) section;
                    String title2 = featuredCardList.getData().getTitle();
                    List<AnnouncementBannerCarouselSection.Banner> items = featuredCardList.getData().getItems();
                    if ((57344 & i11) == 16384) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if ((i11 & 896) == 256) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean z32 = z22 | z23;
                    Object L4 = qVar3.L();
                    if (z32 || L4 == eVar) {
                        final int i22 = 4;
                        L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.d
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                z HomeSectionContent$lambda$0$0;
                                z HomeSectionContent$lambda$8$0;
                                z HomeSectionContent$lambda$10$0;
                                z HomeSectionContent$lambda$2$0;
                                z HomeSectionContent$lambda$3$0;
                                z HomeSectionContent$lambda$4$0;
                                z HomeSectionContent$lambda$6$0;
                                switch (i22) {
                                    case 0:
                                        HomeSectionContent$lambda$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                        return HomeSectionContent$lambda$0$0;
                                    case 1:
                                        HomeSectionContent$lambda$8$0 = HomeScreenV4Kt.HomeSectionContent$lambda$8$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$8$0;
                                    case 2:
                                        HomeSectionContent$lambda$10$0 = HomeScreenV4Kt.HomeSectionContent$lambda$10$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$10$0;
                                    case 3:
                                        HomeSectionContent$lambda$2$0 = HomeScreenV4Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (HomePageV4.Section.HomeActionList.HomeActionItem) obj);
                                        return HomeSectionContent$lambda$2$0;
                                    case 4:
                                        HomeSectionContent$lambda$3$0 = HomeScreenV4Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                        return HomeSectionContent$lambda$3$0;
                                    case 5:
                                        HomeSectionContent$lambda$4$0 = HomeScreenV4Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                        return HomeSectionContent$lambda$4$0;
                                    default:
                                        HomeSectionContent$lambda$6$0 = HomeScreenV4Kt.HomeSectionContent$lambda$6$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$6$0;
                                }
                            }
                        };
                        qVar3.h0(L4);
                    }
                    AnnouncementBannerCarouselKt.AnnouncementBannerCarousel(title2, items, (ho.l) L4, tVar, qVar3, (i11 >> 6) & 7168, 0);
                    qVar3 = qVar3;
                    qVar3.p(false);
                } else if (section instanceof HomePageV4.Section.MiniReadGrid) {
                    qVar3.X(1115780152);
                    List<MiniReadGridSection.Item> items2 = ((HomePageV4.Section.MiniReadGrid) section).getData().getItems();
                    if ((i11 & 57344) == 16384) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if ((i11 & 896) == 256) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean z33 = z20 | z21;
                    Object L5 = qVar3.L();
                    if (z33 || L5 == eVar) {
                        final int i23 = 5;
                        L5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.d
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                z HomeSectionContent$lambda$0$0;
                                z HomeSectionContent$lambda$8$0;
                                z HomeSectionContent$lambda$10$0;
                                z HomeSectionContent$lambda$2$0;
                                z HomeSectionContent$lambda$3$0;
                                z HomeSectionContent$lambda$4$0;
                                z HomeSectionContent$lambda$6$0;
                                switch (i23) {
                                    case 0:
                                        HomeSectionContent$lambda$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                        return HomeSectionContent$lambda$0$0;
                                    case 1:
                                        HomeSectionContent$lambda$8$0 = HomeScreenV4Kt.HomeSectionContent$lambda$8$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$8$0;
                                    case 2:
                                        HomeSectionContent$lambda$10$0 = HomeScreenV4Kt.HomeSectionContent$lambda$10$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$10$0;
                                    case 3:
                                        HomeSectionContent$lambda$2$0 = HomeScreenV4Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (HomePageV4.Section.HomeActionList.HomeActionItem) obj);
                                        return HomeSectionContent$lambda$2$0;
                                    case 4:
                                        HomeSectionContent$lambda$3$0 = HomeScreenV4Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                        return HomeSectionContent$lambda$3$0;
                                    case 5:
                                        HomeSectionContent$lambda$4$0 = HomeScreenV4Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                        return HomeSectionContent$lambda$4$0;
                                    default:
                                        HomeSectionContent$lambda$6$0 = HomeScreenV4Kt.HomeSectionContent$lambda$6$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$6$0;
                                }
                            }
                        };
                        qVar3.h0(L5);
                    }
                    MiniReadGridKt.MiniReadGrid(items2, (ho.l) L5, tVar, qVar3, (i11 >> 9) & 896, 0);
                    qVar3.p(false);
                } else if (section instanceof HomePageV4.Section.StatsCarousel) {
                    qVar3.X(2114217309);
                    HomePageV4.Section.StatsCarousel statsCarousel = (HomePageV4.Section.StatsCarousel) section;
                    long targetStreakGoalMinutes = homeStateV4.getTargetStreakGoalMinutes();
                    if ((i11 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    Object L6 = qVar3.L();
                    if (z19 || L6 == eVar) {
                        L6 = new g(lVar, 3);
                        qVar3.h0(L6);
                    }
                    HomeStatsCarouselKt.HomeStatsCarouselSectionV4(statsCarousel, targetStreakGoalMinutes, (ho.a) L6, tVar, qVar3, (i11 & 14) | ((i11 >> 6) & 7168), 0);
                    qVar3 = qVar3;
                    qVar3.p(false);
                } else if (section instanceof HomePageV4.Section.HeroCarousel) {
                    qVar3.X(2114226412);
                    HomePageV4.Section.HeroCarousel heroCarousel = (HomePageV4.Section.HeroCarousel) section;
                    if ((i11 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i11 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z34 = z17 | z18;
                    Object L7 = qVar3.L();
                    if (z34 || L7 == eVar) {
                        final int i24 = 6;
                        L7 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.d
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                z HomeSectionContent$lambda$0$0;
                                z HomeSectionContent$lambda$8$0;
                                z HomeSectionContent$lambda$10$0;
                                z HomeSectionContent$lambda$2$0;
                                z HomeSectionContent$lambda$3$0;
                                z HomeSectionContent$lambda$4$0;
                                z HomeSectionContent$lambda$6$0;
                                switch (i24) {
                                    case 0:
                                        HomeSectionContent$lambda$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$0$0(lVar3, lVar, (ReadMeta) obj);
                                        return HomeSectionContent$lambda$0$0;
                                    case 1:
                                        HomeSectionContent$lambda$8$0 = HomeScreenV4Kt.HomeSectionContent$lambda$8$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$8$0;
                                    case 2:
                                        HomeSectionContent$lambda$10$0 = HomeScreenV4Kt.HomeSectionContent$lambda$10$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$10$0;
                                    case 3:
                                        HomeSectionContent$lambda$2$0 = HomeScreenV4Kt.HomeSectionContent$lambda$2$0(lVar3, lVar, (HomePageV4.Section.HomeActionList.HomeActionItem) obj);
                                        return HomeSectionContent$lambda$2$0;
                                    case 4:
                                        HomeSectionContent$lambda$3$0 = HomeScreenV4Kt.HomeSectionContent$lambda$3$0(lVar3, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                        return HomeSectionContent$lambda$3$0;
                                    case 5:
                                        HomeSectionContent$lambda$4$0 = HomeScreenV4Kt.HomeSectionContent$lambda$4$0(lVar3, lVar, (MiniReadGridSection.Item) obj);
                                        return HomeSectionContent$lambda$4$0;
                                    default:
                                        HomeSectionContent$lambda$6$0 = HomeScreenV4Kt.HomeSectionContent$lambda$6$0(lVar3, lVar, (String) obj);
                                        return HomeSectionContent$lambda$6$0;
                                }
                            }
                        };
                        qVar3.h0(L7);
                    }
                    HomeHeroCarouselSectionKt.HomeHeroCarouselSectionV4(heroCarousel, (ho.l) L7, tVar, qVar3, (i11 & 14) | ((i11 >> 9) & 896), 0);
                    qVar3.p(false);
                } else {
                    ho.a aVar = null;
                    if (section instanceof HomePageV4.Section.HighlightedCarousel) {
                        qVar3.X(1116882698);
                        HomePageV4.Section.HighlightedCarousel highlightedCarousel = (HomePageV4.Section.HighlightedCarousel) section;
                        String deeplink = highlightedCarousel.getDeeplink();
                        if (deeplink == null) {
                            qVar3.X(1117185660);
                            qVar3.p(false);
                        } else {
                            qVar3.X(1117185661);
                            if ((i11 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean f10 = z13 | qVar3.f(deeplink);
                            Object L8 = qVar3.L();
                            if (f10 || L8 == eVar) {
                                L8 = new e(lVar3, deeplink, 0);
                                qVar3.h0(L8);
                            }
                            aVar = (ho.a) L8;
                            qVar3.p(false);
                        }
                        String playingPreviewReadId = homeStateV4.getPlayingPreviewReadId();
                        if ((i11 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i25 = i11 & 896;
                        if (i25 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z35 = z14 | z15;
                        Object L9 = qVar3.L();
                        if (z35 || L9 == eVar) {
                            final int i26 = 1;
                            L9 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.d
                                @Override // ho.l
                                public final Object invoke(Object obj) {
                                    z HomeSectionContent$lambda$0$0;
                                    z HomeSectionContent$lambda$8$0;
                                    z HomeSectionContent$lambda$10$0;
                                    z HomeSectionContent$lambda$2$0;
                                    z HomeSectionContent$lambda$3$0;
                                    z HomeSectionContent$lambda$4$0;
                                    z HomeSectionContent$lambda$6$0;
                                    switch (i26) {
                                        case 0:
                                            HomeSectionContent$lambda$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$0$0(lVar2, lVar, (ReadMeta) obj);
                                            return HomeSectionContent$lambda$0$0;
                                        case 1:
                                            HomeSectionContent$lambda$8$0 = HomeScreenV4Kt.HomeSectionContent$lambda$8$0(lVar2, lVar, (String) obj);
                                            return HomeSectionContent$lambda$8$0;
                                        case 2:
                                            HomeSectionContent$lambda$10$0 = HomeScreenV4Kt.HomeSectionContent$lambda$10$0(lVar2, lVar, (String) obj);
                                            return HomeSectionContent$lambda$10$0;
                                        case 3:
                                            HomeSectionContent$lambda$2$0 = HomeScreenV4Kt.HomeSectionContent$lambda$2$0(lVar2, lVar, (HomePageV4.Section.HomeActionList.HomeActionItem) obj);
                                            return HomeSectionContent$lambda$2$0;
                                        case 4:
                                            HomeSectionContent$lambda$3$0 = HomeScreenV4Kt.HomeSectionContent$lambda$3$0(lVar2, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                            return HomeSectionContent$lambda$3$0;
                                        case 5:
                                            HomeSectionContent$lambda$4$0 = HomeScreenV4Kt.HomeSectionContent$lambda$4$0(lVar2, lVar, (MiniReadGridSection.Item) obj);
                                            return HomeSectionContent$lambda$4$0;
                                        default:
                                            HomeSectionContent$lambda$6$0 = HomeScreenV4Kt.HomeSectionContent$lambda$6$0(lVar2, lVar, (String) obj);
                                            return HomeSectionContent$lambda$6$0;
                                    }
                                }
                            };
                            qVar3.h0(L9);
                        }
                        ho.l lVar5 = (ho.l) L9;
                        if (i25 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        Object L10 = qVar3.L();
                        if (z16 || L10 == eVar) {
                            final int i27 = 0;
                            L10 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.f
                                @Override // ho.l
                                public final Object invoke(Object obj) {
                                    z HomeSectionContent$lambda$9$0;
                                    z HomeSectionContent$lambda$1$0;
                                    switch (i27) {
                                        case 0:
                                            HomeSectionContent$lambda$9$0 = HomeScreenV4Kt.HomeSectionContent$lambda$9$0(lVar, (ExploreRead) obj);
                                            return HomeSectionContent$lambda$9$0;
                                        default:
                                            HomeSectionContent$lambda$1$0 = HomeScreenV4Kt.HomeSectionContent$lambda$1$0(lVar, (ReadMeta) obj);
                                            return HomeSectionContent$lambda$1$0;
                                    }
                                }
                            };
                            qVar3.h0(L10);
                        }
                        qVar = qVar3;
                        HomeHighlightedCarouselSectionKt.HomeHighlightedCarouselSectionV4(highlightedCarousel, lVar5, aVar, tVar, (ho.l) L10, playingPreviewReadId, qVar, ((i11 >> 6) & 7168) | (i11 & 14), 0);
                        qVar.p(false);
                    } else if (section instanceof HomePageV4.Section.MediumCarousel) {
                        qVar3.X(2114258504);
                        HomePageV4.Section.MediumCarousel mediumCarousel = (HomePageV4.Section.MediumCarousel) section;
                        if ((i11 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((i11 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z36 = z11 | z10;
                        Object L11 = qVar3.L();
                        if (z36 || L11 == eVar) {
                            final int i28 = 2;
                            L11 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.d
                                @Override // ho.l
                                public final Object invoke(Object obj) {
                                    z HomeSectionContent$lambda$0$0;
                                    z HomeSectionContent$lambda$8$0;
                                    z HomeSectionContent$lambda$10$0;
                                    z HomeSectionContent$lambda$2$0;
                                    z HomeSectionContent$lambda$3$0;
                                    z HomeSectionContent$lambda$4$0;
                                    z HomeSectionContent$lambda$6$0;
                                    switch (i28) {
                                        case 0:
                                            HomeSectionContent$lambda$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$0$0(lVar2, lVar, (ReadMeta) obj);
                                            return HomeSectionContent$lambda$0$0;
                                        case 1:
                                            HomeSectionContent$lambda$8$0 = HomeScreenV4Kt.HomeSectionContent$lambda$8$0(lVar2, lVar, (String) obj);
                                            return HomeSectionContent$lambda$8$0;
                                        case 2:
                                            HomeSectionContent$lambda$10$0 = HomeScreenV4Kt.HomeSectionContent$lambda$10$0(lVar2, lVar, (String) obj);
                                            return HomeSectionContent$lambda$10$0;
                                        case 3:
                                            HomeSectionContent$lambda$2$0 = HomeScreenV4Kt.HomeSectionContent$lambda$2$0(lVar2, lVar, (HomePageV4.Section.HomeActionList.HomeActionItem) obj);
                                            return HomeSectionContent$lambda$2$0;
                                        case 4:
                                            HomeSectionContent$lambda$3$0 = HomeScreenV4Kt.HomeSectionContent$lambda$3$0(lVar2, lVar, (AnnouncementBannerCarouselSection.Banner) obj);
                                            return HomeSectionContent$lambda$3$0;
                                        case 5:
                                            HomeSectionContent$lambda$4$0 = HomeScreenV4Kt.HomeSectionContent$lambda$4$0(lVar2, lVar, (MiniReadGridSection.Item) obj);
                                            return HomeSectionContent$lambda$4$0;
                                        default:
                                            HomeSectionContent$lambda$6$0 = HomeScreenV4Kt.HomeSectionContent$lambda$6$0(lVar2, lVar, (String) obj);
                                            return HomeSectionContent$lambda$6$0;
                                    }
                                }
                            };
                            qVar3.h0(L11);
                        }
                        ho.l lVar6 = (ho.l) L11;
                        String deeplink2 = mediumCarousel.getDeeplink();
                        if (deeplink2 == null) {
                            qVar3.X(1117801692);
                            qVar3.p(false);
                        } else {
                            qVar3.X(1117801693);
                            if ((i11 & 57344) == 16384) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean f11 = qVar3.f(deeplink2) | z12;
                            Object L12 = qVar3.L();
                            if (f11 || L12 == eVar) {
                                L12 = new e(lVar3, deeplink2, 1);
                                qVar3.h0(L12);
                            }
                            aVar = (ho.a) L12;
                            qVar3.p(false);
                        }
                        tVar2 = tVar;
                        HomeMediumCarouselSectionKt.HomeMediumCarouselSectionV4(mediumCarousel, lVar6, aVar, tVar2, qVar3, (i11 & 14) | ((i11 >> 6) & 7168), 0);
                        qVar = qVar3;
                        qVar.p(false);
                    } else {
                        qVar = qVar3;
                        tVar2 = tVar;
                        if (section instanceof HomePageV4.Section.WarningSection) {
                            qVar.X(2114273756);
                            HomeWarningSectionKt.HomeWarningSectionV4(((HomePageV4.Section.WarningSection) section).getMarkdown(), tVar2, qVar, (i11 >> 12) & 112, 0);
                            qVar.p(false);
                        } else {
                            throw com.google.android.gms.internal.play_billing.b.h(2114158752, qVar, false);
                        }
                    }
                }
                qVar = qVar3;
            }
            tVar2 = tVar;
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.e(section, homeStateV4, lVar, lVar2, lVar3, tVar2, i10, 8);
        }
    }

    public static final z HomeSectionContent$lambda$0$0(ho.l lVar, ho.l lVar2, ReadMeta readMeta) {
        readMeta.getClass();
        lVar.invoke(readMeta.getReadId());
        lVar2.invoke(new r(3));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$0$0$0(HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.getAnalytics().log(Analytics.Event.HomeClickedContinueListeningRead.INSTANCE);
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$1$0(ho.l lVar, ReadMeta readMeta) {
        readMeta.getClass();
        lVar.invoke(new t(readMeta, 5));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$1$0$0(ReadMeta readMeta, HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.onClickAddOrRemoveFromQueue(readMeta);
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$10$0(ho.l lVar, ho.l lVar2, String str) {
        str.getClass();
        lVar.invoke(str);
        lVar2.invoke(new s(str, 5));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$10$0$0(String str, HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.getAnalytics().log(new Analytics.Event.HomeClickedSectionItem("medium-carousel_v4", str));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$11$0$0(ho.l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$12(HomePageV4.Section section, HomeStateV4 homeStateV4, ho.l lVar, ho.l lVar2, ho.l lVar3, i3.t tVar, int i10, u2.m mVar, int i11) {
        HomeSectionContent(section, homeStateV4, lVar, lVar2, lVar3, tVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$2$0(ho.l lVar, ho.l lVar2, HomePageV4.Section.HomeActionList.HomeActionItem homeActionItem) {
        homeActionItem.getClass();
        lVar.invoke(homeActionItem.getDeeplink());
        lVar2.invoke(new t(homeActionItem, 8));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$2$0$0(HomePageV4.Section.HomeActionList.HomeActionItem homeActionItem, HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.getAnalytics().log(new Analytics.Event.HomeClickedUploadBannerButton(homeActionItem.getAnalyticsId()));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$3$0(ho.l lVar, ho.l lVar2, AnnouncementBannerCarouselSection.Banner banner) {
        banner.getClass();
        lVar.invoke(banner.getDeeplink());
        String analyticsId = banner.getAnalyticsId();
        if (analyticsId != null) {
            lVar2.invoke(new s(analyticsId, 3));
        }
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$3$0$0$0(String str, HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.getAnalytics().log(new Analytics.Event.HomeClickedWhatsNewAnnouncement(str));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$4$0(ho.l lVar, ho.l lVar2, MiniReadGridSection.Item item) {
        item.getClass();
        lVar.invoke(item.getDeeplink());
        String analyticsId = item.getAnalyticsId();
        if (analyticsId != null) {
            lVar2.invoke(new s(analyticsId, 2));
        }
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$4$0$0$0(String str, HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.getAnalytics().log(new Analytics.Event.HomeClickedTopPicksRead(str));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$5$0(ho.l lVar) {
        lVar.invoke(new r(5));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$5$0$0(HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.onDailyGoalClicked();
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$6$0(ho.l lVar, ho.l lVar2, String str) {
        str.getClass();
        lVar.invoke(str);
        lVar2.invoke(new s(str, 1));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$6$0$0(String str, HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.getAnalytics().log(new Analytics.Event.HomeClickedSectionItem("hero-carousel_v4", str));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$7$0$0(ho.l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$8$0(ho.l lVar, ho.l lVar2, String str) {
        str.getClass();
        lVar.invoke(str);
        lVar2.invoke(new s(str, 4));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$8$0$0(String str, HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.getAnalytics().log(new Analytics.Event.HomeClickedSectionItem("highlighted-carousel_v4", str));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$9$0(ho.l lVar, ExploreRead exploreRead) {
        exploreRead.getClass();
        lVar.invoke(new t(exploreRead, 6));
        return z.f31622a;
    }

    public static final z HomeSectionContent$lambda$9$0$0(ExploreRead exploreRead, HomeViewModelV4 homeViewModelV4) {
        homeViewModelV4.getClass();
        homeViewModelV4.playPreview(exploreRead);
        return z.f31622a;
    }

    public static final void Preview_HomeScreenV4(HomeStateV4 homeStateV4, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        HomeStateV4 homeStateV42;
        int i12;
        homeStateV4.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1937468073);
        if ((i10 & 6) == 0) {
            if (qVar.h(homeStateV4)) {
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
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new r(10);
                qVar.h0(L);
            }
            homeStateV42 = homeStateV4;
            HomeScreenV4UI(homeStateV42, (ho.l) L, null, null, null, null, null, null, null, null, qVar, (i11 & 14) | 48, 1020);
        } else {
            homeStateV42 = homeStateV4;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new em.a(homeStateV42, i10, 6);
        }
    }

    public static final z Preview_HomeScreenV4$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_HomeScreenV4$lambda$1(HomeStateV4 homeStateV4, int i10, u2.m mVar, int i11) {
        Preview_HomeScreenV4(homeStateV4, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void homeItems(t1.t tVar, HomePageV4 homePageV4, final HomeStateV4 homeStateV4, final ho.l lVar, final ho.l lVar2, final ho.l lVar3) {
        List<HomePageV4.Section> sections = homePageV4.getSections();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : sections) {
            if (!(((HomePageV4.Section) obj) instanceof HomePageV4.Section.RecentReadsSection) || !homeStateV4.getRecentReads().isEmpty()) {
                arrayList.add(obj);
            }
        }
        final HomeScreenV4Kt$homeItems$$inlined$items$default$1 homeScreenV4Kt$homeItems$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt$homeItems$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((HomePageV4.Section) obj2);
            }

            @Override // ho.l
            public final Void invoke(HomePageV4.Section section) {
                return null;
            }
        };
        ((t1.i) tVar).u(arrayList.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt$homeItems$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(arrayList.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt$homeItems$$inlined$items$default$4
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
                    HomePageV4.Section section = (HomePageV4.Section) arrayList.get(i10);
                    qVar.X(-901585815);
                    HomeStateV4 homeStateV42 = homeStateV4;
                    ho.l lVar4 = lVar;
                    ho.l lVar5 = lVar2;
                    ho.l lVar6 = lVar3;
                    i3.q qVar2 = i3.q.f13017a;
                    HomeScreenV4Kt.HomeSectionContent(section, homeStateV42, lVar4, lVar5, lVar6, t1.b.a(bVar, qVar2, null, 7), qVar, 0);
                    r1.d.g(p2.f(qVar2, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX8()), qVar);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                invoke((t1.b) obj2, ((Number) obj3).intValue(), (u2.m) obj4, ((Number) obj5).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
    }

    public static /* synthetic */ void homeItems$default(t1.t tVar, HomePageV4 homePageV4, HomeStateV4 homeStateV4, ho.l lVar, ho.l lVar2, ho.l lVar3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar2 = new r(6);
        }
        ho.l lVar4 = lVar2;
        if ((i10 & 16) != 0) {
            lVar3 = new r(7);
        }
        homeItems(tVar, homePageV4, homeStateV4, lVar, lVar4, lVar3);
    }

    public static final z homeItems$lambda$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z homeItems$lambda$1(String str) {
        str.getClass();
        return z.f31622a;
    }
}

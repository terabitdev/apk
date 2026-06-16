package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i1.j2;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.PageFilter;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.readerapp.ui.components.explore.LocalExplorePricesKt;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFilterTopBarKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreSectionContentKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.t0;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.SearchButtonKt;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.headers.EchoHeaderStyle;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.livekit.android.rpc.RpcError;
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
import r1.l2;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.z1;
import rd.c1;
import s4.j0;
import s4.y0;
import sn.z;
import t1.b0;
import t2.u;
import tn.a0;
import u2.h0;
import u2.i0;
import u2.r1;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aó\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aw\u0010#\u001a\u00020\u0004*\u00020 2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b#\u0010$\u001a'\u0010(\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010'\u001a\u00020&H\u0003¢\u0006\u0004\b(\u0010)\u001a\u001d\u0010*\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b*\u0010+\u001ai\u0010.\u001a\u00020\u0004*\u00020 2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160,2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b.\u0010/\u001a\u000f\u00100\u001a\u00020\u0004H\u0007¢\u0006\u0004\b0\u00101\u001a\u000f\u00102\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u00101\u001a\u000f\u00103\u001a\u00020\u0004H\u0007¢\u0006\u0004\b3\u00101\u001a\u000f\u00104\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u00101\u001a\u000f\u00105\u001a\u00020\u0004H\u0007¢\u0006\u0004\b5\u00101\u001a\u000f\u00106\u001a\u00020\u0004H\u0007¢\u0006\u0004\b6\u00101\u001a\u000f\u00107\u001a\u00020\u0004H\u0007¢\u0006\u0004\b7\u00101\u001a\u000f\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u00101\u001a\u000f\u00109\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u00101¨\u0006@²\u0006\u000e\u0010;\u001a\u00020:8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010<\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010=\u001a\u00020:8\n@\nX\u008a\u008e\u0002²\u0006 \u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030,0>8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreViewModel;", "viewModel", "Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToRead", "Lkotlin/Function2;", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToPlayer", "Lkotlin/Function0;", "onNavigateToSearch", "onNavigateToDeeplink", "bottomBar", "Li1/j2;", "sharedTransitionScope", "Li1/o;", "animatedContentScope", "ExploreScreen", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreViewModel;Lho/l;Lho/p;Lho/a;Lho/l;Lho/p;Li1/j2;Li1/o;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lua/b;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "filteredContent", "action", "miniPlayer", "Lio/elevenlabs/domain/model/ExploreRead;", "onPreviewClick", "", "onFilterChipToggled", "ExploreScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreState;Lua/b;Lho/l;Lho/p;Lho/p;Lho/a;Lho/l;Lho/l;Lho/l;Lho/p;Li1/j2;Li1/o;Lu2/m;III)V", "Lt1/t;", "playingPreviewReadId", "onClearFilters", "exploreFilteredContent", "(Lt1/t;Lua/b;Lho/l;Lho/l;Lho/l;Ljava/lang/String;Lho/a;)V", "onRetry", "Li3/t;", "modifier", "ExploreErrorState", "(Lho/a;Li3/t;Lu2/m;II)V", "ExploreFilteredEmptyState", "(Lho/a;Lu2/m;I)V", "", "sections", "exploreGeneralContent", "(Lt1/t;Ljava/util/List;Lho/l;Lho/l;Lho/l;Ljava/lang/String;)V", "Preview_ExploreScreen_idle", "(Lu2/m;I)V", "Preview_ExploreScreen_loading", "Preview_ExploreScreen_error", "Preview_ExploreScreen_loaded", "Preview_ExploreScreen_playing", "Preview_ExploreScreen_withFilters", "Preview_ExploreFilteredEmptyState", "Preview_ExploreErrorState", "Preview_ExploreScreen_withActiveFilters", "", "headerHeight", "headerVisible", "miniPlayerHeight", "", "lastFilters", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ExploreErrorState(ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-38198172);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i10 | i15;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i14 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                i3.t e10 = p2.e(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                i3.t F = r1.d.F(e10, echoTheme.getSpacings(qVar, i17).getX8(), echoTheme.getSpacings(qVar, i17).getX16());
                i3.j jVar = i3.d.C0;
                u0 u0Var = r1.j.f29228a;
                x a10 = w.a(r1.j.g(echoTheme.getSpacings(qVar, i17).getX6()), jVar, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(F, qVar);
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
                i3.t tVar5 = tVar4;
                y2.a(kd.a.M(R.drawable.ic_circle_info, qVar, 0), null, p2.o(qVar2, 40), echoTheme.getColors(qVar, i17).getIcon().getTertiary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
                x a11 = w.a(ib.i.m(echoTheme, qVar, i17), jVar, qVar, 48);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(qVar2, qVar);
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
                String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.error_screen_title);
                EchoThemeTypography typography = echoTheme.getTypography(qVar, i17);
                int i18 = EchoThemeTypography.$stable;
                y0 lgRegular500 = typography.getLgRegular500(qVar, i18);
                EchoThemeColors.Text text = echoTheme.getColors(qVar, i17).getText();
                int i19 = EchoThemeColors.Text.$stable;
                j7.d(R, null, text.getPrimary(qVar, i19), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, lgRegular500, qVar, 0, 0, 130042);
                j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.error_screen_content), null, ib.i.b(i17, i19, echoTheme, qVar, qVar), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i17).getBaseRegular400(qVar, i18), qVar, 0, 0, 130042);
                qVar.p(true);
                FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.common_retry), aVar, p2.e(qVar2, 1.0f), null, null, null, false, false, false, qVar, ((i14 << 3) & 112) | 384, 504);
                qVar = qVar;
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.b(aVar, tVar3, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i12;
        if ((i14 & 19) == 18) {
        }
        if (!qVar.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ExploreErrorState$lambda$1(ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ExploreErrorState(aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void ExploreFilteredEmptyState(ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        ho.a aVar2 = aVar;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-459406257);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            i3.t F = r1.d.F(e10, echoTheme.getSpacings(qVar, i13).getX8(), echoTheme.getSpacings(qVar, i13).getX16());
            i3.j jVar = i3.d.C0;
            u0 u0Var = r1.j.f29228a;
            x a10 = w.a(r1.j.g(echoTheme.getSpacings(qVar, i13).getX6()), jVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(F, qVar);
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
            int i14 = i11;
            y2.a(kd.a.M(R.drawable.ic_circle_info, qVar, 0), null, p2.o(qVar2, 40), echoTheme.getColors(qVar, i13).getIcon().getTertiary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
            x a11 = w.a(ib.i.m(echoTheme, qVar, i13), jVar, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(qVar2, qVar);
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
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.explore_no_filter_results_title);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i13);
            int i15 = EchoThemeTypography.$stable;
            y0 lgRegular500 = typography.getLgRegular500(qVar, i15);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i13).getText();
            int i16 = EchoThemeColors.Text.$stable;
            j7.d(R, null, text.getPrimary(qVar, i16), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, lgRegular500, qVar, 0, 0, 130042);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.explore_no_filter_results_subtitle), null, ib.i.b(i13, i16, echoTheme, qVar, qVar), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i13).getBaseRegular400(qVar, i15), qVar, 0, 0, 130042);
            qVar.p(true);
            aVar2 = aVar;
            FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.explore_no_filter_results_button), aVar2, p2.e(qVar2, 1.0f), null, null, null, false, false, false, qVar, ((i14 << 3) & 112) | 384, 504);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 7);
        }
    }

    public static final z ExploreFilteredEmptyState$lambda$1(ho.a aVar, int i10, u2.m mVar, int i11) {
        ExploreFilteredEmptyState(aVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreScreen(ExploreViewModel exploreViewModel, final ho.l lVar, ho.p pVar, ho.a aVar, final ho.l lVar2, ho.p pVar2, j2 j2Var, i1.o oVar, u2.m mVar, int i10, int i11) {
        final ExploreViewModel exploreViewModel2;
        int i12;
        ho.a aVar2;
        ho.p pVar3;
        boolean z6;
        q7.c cVar;
        int i13;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        boolean h12;
        Object L3;
        int i14;
        boolean z10;
        boolean z11;
        Object L4;
        boolean z12;
        boolean z13;
        Object L5;
        boolean h13;
        Object L6;
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
        lVar.getClass();
        pVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        pVar2.getClass();
        j2Var.getClass();
        oVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(594096160);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                exploreViewModel2 = exploreViewModel;
                if (qVar.h(exploreViewModel2)) {
                    i22 = 4;
                    i12 = i22 | i10;
                }
            } else {
                exploreViewModel2 = exploreViewModel;
            }
            i22 = 2;
            i12 = i22 | i10;
        } else {
            exploreViewModel2 = exploreViewModel;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(pVar)) {
                i20 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i20 = 128;
            }
            i12 |= i20;
        }
        if ((i10 & 3072) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i19 = 2048;
            } else {
                i19 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i19;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar2)) {
                i18 = 16384;
            } else {
                i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i18;
        }
        if ((196608 & i10) == 0) {
            pVar3 = pVar2;
            if (qVar.h(pVar3)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        } else {
            pVar3 = pVar2;
        }
        if ((1572864 & i10) == 0) {
            if (qVar.f(j2Var)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i12 |= i16;
        }
        if ((12582912 & i10) == 0) {
            if (qVar.h(oVar)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i12 |= i15;
        }
        if ((4793491 & i12) != 4793490) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
            } else if ((i11 & 1) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    exploreViewModel2 = (ExploreViewModel) gg.b.j0(e0.f20562a.b(ExploreViewModel.class), a10, null, o6, cVar, qVar);
                    i12 &= -15;
                    i13 = 0;
                    qVar.q();
                    h10 = qVar.h(exploreViewModel2);
                    L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new ExploreScreenKt$ExploreScreen$1$1(exploreViewModel2, null);
                        qVar.h0(L);
                    }
                    z zVar = z.f31622a;
                    u2.r.f((ho.p) L, zVar, qVar);
                    h11 = qVar.h(exploreViewModel2);
                    L2 = qVar.L();
                    if (!h11 || L2 == eVar) {
                        final int i23 = 0;
                        L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.h
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                h0 ExploreScreen$lambda$1$0;
                                z ExploreScreen$lambda$2$0;
                                z ExploreScreen$lambda$6$0;
                                switch (i23) {
                                    case 0:
                                        ExploreScreen$lambda$1$0 = ExploreScreenKt.ExploreScreen$lambda$1$0(exploreViewModel2, (i0) obj);
                                        return ExploreScreen$lambda$1$0;
                                    case 1:
                                        ExploreScreen$lambda$2$0 = ExploreScreenKt.ExploreScreen$lambda$2$0(exploreViewModel2, (ho.l) obj);
                                        return ExploreScreen$lambda$2$0;
                                    default:
                                        ExploreScreen$lambda$6$0 = ExploreScreenKt.ExploreScreen$lambda$6$0(exploreViewModel2, (ExploreRead) obj);
                                        return ExploreScreen$lambda$6$0;
                                }
                            }
                        };
                        qVar.h0(L2);
                    }
                    u2.r.c(zVar, (ho.l) L2, qVar);
                    ExploreState exploreState = (ExploreState) u2.r.o(exploreViewModel2.getStateFlow(), qVar, i13).getValue();
                    ua.b a11 = ua.d.a(exploreViewModel2.getFilteredContentPagingData(), qVar);
                    h12 = qVar.h(exploreViewModel2);
                    L3 = qVar.L();
                    if (!h12 || L3 == eVar) {
                        final int i24 = 1;
                        L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.h
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                h0 ExploreScreen$lambda$1$0;
                                z ExploreScreen$lambda$2$0;
                                z ExploreScreen$lambda$6$0;
                                switch (i24) {
                                    case 0:
                                        ExploreScreen$lambda$1$0 = ExploreScreenKt.ExploreScreen$lambda$1$0(exploreViewModel2, (i0) obj);
                                        return ExploreScreen$lambda$1$0;
                                    case 1:
                                        ExploreScreen$lambda$2$0 = ExploreScreenKt.ExploreScreen$lambda$2$0(exploreViewModel2, (ho.l) obj);
                                        return ExploreScreen$lambda$2$0;
                                    default:
                                        ExploreScreen$lambda$6$0 = ExploreScreenKt.ExploreScreen$lambda$6$0(exploreViewModel2, (ExploreRead) obj);
                                        return ExploreScreen$lambda$6$0;
                                }
                            }
                        };
                        qVar.h0(L3);
                    }
                    ho.l lVar3 = (ho.l) L3;
                    c3.j d10 = c3.k.d(-1753829852, true, new d(pVar, 1), qVar);
                    boolean h15 = qVar.h(exploreViewModel2);
                    i14 = i12;
                    if ((i12 & 57344) != 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | h15;
                    L4 = qVar.L();
                    if (!z11 || L4 == eVar) {
                        final int i25 = 0;
                        L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.i
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                z ExploreScreen$lambda$4$0;
                                z ExploreScreen$lambda$5$0;
                                switch (i25) {
                                    case 0:
                                        ExploreScreen$lambda$4$0 = ExploreScreenKt.ExploreScreen$lambda$4$0(exploreViewModel2, lVar2, (String) obj);
                                        return ExploreScreen$lambda$4$0;
                                    default:
                                        ExploreScreen$lambda$5$0 = ExploreScreenKt.ExploreScreen$lambda$5$0(exploreViewModel2, lVar2, (String) obj);
                                        return ExploreScreen$lambda$5$0;
                                }
                            }
                        };
                        qVar.h0(L4);
                    }
                    ho.l lVar4 = (ho.l) L4;
                    boolean h16 = qVar.h(exploreViewModel2);
                    if ((i14 & 112) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = h16 | z12;
                    L5 = qVar.L();
                    if (!z13 || L5 == eVar) {
                        final int i26 = 1;
                        L5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.i
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                z ExploreScreen$lambda$4$0;
                                z ExploreScreen$lambda$5$0;
                                switch (i26) {
                                    case 0:
                                        ExploreScreen$lambda$4$0 = ExploreScreenKt.ExploreScreen$lambda$4$0(exploreViewModel2, lVar, (String) obj);
                                        return ExploreScreen$lambda$4$0;
                                    default:
                                        ExploreScreen$lambda$5$0 = ExploreScreenKt.ExploreScreen$lambda$5$0(exploreViewModel2, lVar, (String) obj);
                                        return ExploreScreen$lambda$5$0;
                                }
                            }
                        };
                        qVar.h0(L5);
                    }
                    ho.l lVar5 = (ho.l) L5;
                    h13 = qVar.h(exploreViewModel2);
                    L6 = qVar.L();
                    if (!h13 || L6 == eVar) {
                        final int i27 = 2;
                        L6 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.h
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                h0 ExploreScreen$lambda$1$0;
                                z ExploreScreen$lambda$2$0;
                                z ExploreScreen$lambda$6$0;
                                switch (i27) {
                                    case 0:
                                        ExploreScreen$lambda$1$0 = ExploreScreenKt.ExploreScreen$lambda$1$0(exploreViewModel2, (i0) obj);
                                        return ExploreScreen$lambda$1$0;
                                    case 1:
                                        ExploreScreen$lambda$2$0 = ExploreScreenKt.ExploreScreen$lambda$2$0(exploreViewModel2, (ho.l) obj);
                                        return ExploreScreen$lambda$2$0;
                                    default:
                                        ExploreScreen$lambda$6$0 = ExploreScreenKt.ExploreScreen$lambda$6$0(exploreViewModel2, (ExploreRead) obj);
                                        return ExploreScreen$lambda$6$0;
                                }
                            }
                        };
                        qVar.h0(L6);
                    }
                    ho.l lVar6 = (ho.l) L6;
                    h14 = qVar.h(exploreViewModel2);
                    L7 = qVar.L();
                    if (!h14 || L7 == eVar) {
                        L7 = new d(exploreViewModel2, 2);
                        qVar.h0(L7);
                    }
                    ExploreScreenUI(exploreState, a11, lVar3, pVar3, d10, aVar2, lVar4, lVar5, lVar6, (ho.p) L7, j2Var, oVar, qVar, ((i14 >> 6) & 7168) | 24640 | (458752 & (i14 << 6)), (i14 >> 18) & 126, 0);
                    qVar = qVar;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            i13 = 0;
            qVar.q();
            h10 = qVar.h(exploreViewModel2);
            L = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (!h10) {
            }
            L = new ExploreScreenKt$ExploreScreen$1$1(exploreViewModel2, null);
            qVar.h0(L);
            z zVar2 = z.f31622a;
            u2.r.f((ho.p) L, zVar2, qVar);
            h11 = qVar.h(exploreViewModel2);
            L2 = qVar.L();
            if (!h11) {
            }
            final int i232 = 0;
            L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.h
                @Override // ho.l
                public final Object invoke(Object obj) {
                    h0 ExploreScreen$lambda$1$0;
                    z ExploreScreen$lambda$2$0;
                    z ExploreScreen$lambda$6$0;
                    switch (i232) {
                        case 0:
                            ExploreScreen$lambda$1$0 = ExploreScreenKt.ExploreScreen$lambda$1$0(exploreViewModel2, (i0) obj);
                            return ExploreScreen$lambda$1$0;
                        case 1:
                            ExploreScreen$lambda$2$0 = ExploreScreenKt.ExploreScreen$lambda$2$0(exploreViewModel2, (ho.l) obj);
                            return ExploreScreen$lambda$2$0;
                        default:
                            ExploreScreen$lambda$6$0 = ExploreScreenKt.ExploreScreen$lambda$6$0(exploreViewModel2, (ExploreRead) obj);
                            return ExploreScreen$lambda$6$0;
                    }
                }
            };
            qVar.h0(L2);
            u2.r.c(zVar2, (ho.l) L2, qVar);
            ExploreState exploreState2 = (ExploreState) u2.r.o(exploreViewModel2.getStateFlow(), qVar, i13).getValue();
            ua.b a112 = ua.d.a(exploreViewModel2.getFilteredContentPagingData(), qVar);
            h12 = qVar.h(exploreViewModel2);
            L3 = qVar.L();
            if (!h12) {
            }
            final int i242 = 1;
            L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.h
                @Override // ho.l
                public final Object invoke(Object obj) {
                    h0 ExploreScreen$lambda$1$0;
                    z ExploreScreen$lambda$2$0;
                    z ExploreScreen$lambda$6$0;
                    switch (i242) {
                        case 0:
                            ExploreScreen$lambda$1$0 = ExploreScreenKt.ExploreScreen$lambda$1$0(exploreViewModel2, (i0) obj);
                            return ExploreScreen$lambda$1$0;
                        case 1:
                            ExploreScreen$lambda$2$0 = ExploreScreenKt.ExploreScreen$lambda$2$0(exploreViewModel2, (ho.l) obj);
                            return ExploreScreen$lambda$2$0;
                        default:
                            ExploreScreen$lambda$6$0 = ExploreScreenKt.ExploreScreen$lambda$6$0(exploreViewModel2, (ExploreRead) obj);
                            return ExploreScreen$lambda$6$0;
                    }
                }
            };
            qVar.h0(L3);
            ho.l lVar32 = (ho.l) L3;
            c3.j d102 = c3.k.d(-1753829852, true, new d(pVar, 1), qVar);
            boolean h152 = qVar.h(exploreViewModel2);
            i14 = i12;
            if ((i12 & 57344) != 16384) {
            }
            z11 = z10 | h152;
            L4 = qVar.L();
            if (!z11) {
            }
            final int i252 = 0;
            L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.i
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z ExploreScreen$lambda$4$0;
                    z ExploreScreen$lambda$5$0;
                    switch (i252) {
                        case 0:
                            ExploreScreen$lambda$4$0 = ExploreScreenKt.ExploreScreen$lambda$4$0(exploreViewModel2, lVar2, (String) obj);
                            return ExploreScreen$lambda$4$0;
                        default:
                            ExploreScreen$lambda$5$0 = ExploreScreenKt.ExploreScreen$lambda$5$0(exploreViewModel2, lVar2, (String) obj);
                            return ExploreScreen$lambda$5$0;
                    }
                }
            };
            qVar.h0(L4);
            ho.l lVar42 = (ho.l) L4;
            boolean h162 = qVar.h(exploreViewModel2);
            if ((i14 & 112) != 32) {
            }
            z13 = h162 | z12;
            L5 = qVar.L();
            if (!z13) {
            }
            final int i262 = 1;
            L5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.i
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z ExploreScreen$lambda$4$0;
                    z ExploreScreen$lambda$5$0;
                    switch (i262) {
                        case 0:
                            ExploreScreen$lambda$4$0 = ExploreScreenKt.ExploreScreen$lambda$4$0(exploreViewModel2, lVar, (String) obj);
                            return ExploreScreen$lambda$4$0;
                        default:
                            ExploreScreen$lambda$5$0 = ExploreScreenKt.ExploreScreen$lambda$5$0(exploreViewModel2, lVar, (String) obj);
                            return ExploreScreen$lambda$5$0;
                    }
                }
            };
            qVar.h0(L5);
            ho.l lVar52 = (ho.l) L5;
            h13 = qVar.h(exploreViewModel2);
            L6 = qVar.L();
            if (!h13) {
            }
            final int i272 = 2;
            L6 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.h
                @Override // ho.l
                public final Object invoke(Object obj) {
                    h0 ExploreScreen$lambda$1$0;
                    z ExploreScreen$lambda$2$0;
                    z ExploreScreen$lambda$6$0;
                    switch (i272) {
                        case 0:
                            ExploreScreen$lambda$1$0 = ExploreScreenKt.ExploreScreen$lambda$1$0(exploreViewModel2, (i0) obj);
                            return ExploreScreen$lambda$1$0;
                        case 1:
                            ExploreScreen$lambda$2$0 = ExploreScreenKt.ExploreScreen$lambda$2$0(exploreViewModel2, (ho.l) obj);
                            return ExploreScreen$lambda$2$0;
                        default:
                            ExploreScreen$lambda$6$0 = ExploreScreenKt.ExploreScreen$lambda$6$0(exploreViewModel2, (ExploreRead) obj);
                            return ExploreScreen$lambda$6$0;
                    }
                }
            };
            qVar.h0(L6);
            ho.l lVar62 = (ho.l) L6;
            h14 = qVar.h(exploreViewModel2);
            L7 = qVar.L();
            if (!h14) {
            }
            L7 = new d(exploreViewModel2, 2);
            qVar.h0(L7);
            ExploreScreenUI(exploreState2, a112, lVar32, pVar3, d102, aVar2, lVar42, lVar52, lVar62, (ho.p) L7, j2Var, oVar, qVar, ((i14 >> 6) & 7168) | 24640 | (458752 & (i14 << 6)), (i14 >> 18) & 126, 0);
            qVar = qVar;
        } else {
            qVar.R();
        }
        ExploreViewModel exploreViewModel3 = exploreViewModel2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.x(exploreViewModel3, lVar, pVar, aVar, lVar2, pVar2, j2Var, oVar, i10, i11);
        }
    }

    public static final h0 ExploreScreen$lambda$1$0(final ExploreViewModel exploreViewModel, i0 i0Var) {
        i0Var.getClass();
        return new h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreScreenKt$ExploreScreen$lambda$1$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                ExploreViewModel.this.stopPreview();
            }
        };
    }

    public static final z ExploreScreen$lambda$2$0(ExploreViewModel exploreViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(exploreViewModel);
        return z.f31622a;
    }

    public static final z ExploreScreen$lambda$3(ho.p pVar, u2.m mVar, int i10) {
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
                L = new s(pVar, 3);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(u.P, false, 0L, (ho.l) L, null, qVar, 0, 23);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreScreen$lambda$3$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return z.f31622a;
    }

    public static final z ExploreScreen$lambda$4$0(ExploreViewModel exploreViewModel, ho.l lVar, String str) {
        str.getClass();
        exploreViewModel.getAnalytics().log(new Analytics.Event.ExploreClickedDeeplink(str));
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z ExploreScreen$lambda$5$0(ExploreViewModel exploreViewModel, ho.l lVar, String str) {
        str.getClass();
        exploreViewModel.getAnalytics().log(new Analytics.Event.ExploreClickedReadItem(str));
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z ExploreScreen$lambda$6$0(ExploreViewModel exploreViewModel, ExploreRead exploreRead) {
        exploreRead.getClass();
        exploreViewModel.playPreview(exploreRead);
        return z.f31622a;
    }

    public static final z ExploreScreen$lambda$7$0(ExploreViewModel exploreViewModel, String str, boolean z6) {
        str.getClass();
        exploreViewModel.getAnalytics().log(new Analytics.Event.ExploreClickedFilterChip(str, z6));
        return z.f31622a;
    }

    public static final z ExploreScreen$lambda$8(ExploreViewModel exploreViewModel, ho.l lVar, ho.p pVar, ho.a aVar, ho.l lVar2, ho.p pVar2, j2 j2Var, i1.o oVar, int i10, int i11, u2.m mVar, int i12) {
        ExploreScreen(exploreViewModel, lVar, pVar, aVar, lVar2, pVar2, j2Var, oVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ExploreScreenUI(ExploreState exploreState, ua.b bVar, ho.l lVar, ho.p pVar, ho.p pVar2, ho.a aVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.p pVar3, j2 j2Var, i1.o oVar, u2.m mVar, int i10, int i11, int i12) {
        int i13;
        boolean h10;
        int i14;
        ho.l lVar5;
        int i15;
        int i16;
        ho.p pVar4;
        int i17;
        int i18;
        int i19;
        int i20;
        ho.a aVar2;
        int i21;
        int i22;
        ho.l lVar6;
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
        int i36;
        int i37;
        int i38;
        boolean z6;
        ua.b bVar2;
        ho.p pVar5;
        ho.l lVar7;
        ho.l lVar8;
        j2 j2Var2;
        ho.a aVar3;
        ho.l lVar9;
        ho.p pVar6;
        ho.p pVar7;
        i1.o oVar2;
        r1 r10;
        ua.b bVar3;
        ho.l lVar10;
        int i39;
        ho.p pVar8;
        ho.p pVar9;
        int i40;
        ho.l lVar11;
        int i41;
        ho.l lVar12;
        ho.l lVar13;
        ho.p pVar10;
        j2 j2Var3;
        i1.o oVar3;
        int i42;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(957352410);
        if ((i10 & 6) == 0) {
            if (qVar.h(exploreState)) {
                i42 = 4;
            } else {
                i42 = 2;
            }
            i13 = i42 | i10;
        } else {
            i13 = i10;
        }
        int i43 = i12 & 2;
        if (i43 != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar.f(bVar);
            } else {
                h10 = qVar.h(bVar);
            }
            if (h10) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        int i44 = i12 & 4;
        if (i44 != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            lVar5 = lVar;
            if (qVar.h(lVar5)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i13 |= i15;
            i16 = i12 & 8;
            if (i16 == 0) {
                i13 |= 3072;
            } else if ((i10 & 3072) == 0) {
                pVar4 = pVar;
                if (qVar.h(pVar4)) {
                    i17 = 2048;
                } else {
                    i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i13 |= i17;
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (qVar.h(pVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i13 |= i19;
                    i20 = i12 & 32;
                    if (i20 == 0) {
                        i13 |= 196608;
                        aVar2 = aVar;
                    } else {
                        aVar2 = aVar;
                        if ((i10 & 196608) == 0) {
                            if (qVar.h(aVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    i22 = i12 & 64;
                    if (i22 == 0) {
                        i13 |= 1572864;
                        lVar6 = lVar2;
                    } else {
                        lVar6 = lVar2;
                        if ((i10 & 1572864) == 0) {
                            if (qVar.h(lVar6)) {
                                i23 = 1048576;
                            } else {
                                i23 = 524288;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 128;
                    if (i24 == 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (qVar.h(lVar3)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & RpcError.MAX_MESSAGE_BYTES;
                    if (i26 == 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        i27 = i26;
                        if (qVar.h(lVar4)) {
                            i28 = 67108864;
                        } else {
                            i28 = 33554432;
                        }
                        i13 |= i28;
                        i29 = i12 & 512;
                        if (i29 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            i30 = i29;
                            if (qVar.h(pVar3)) {
                                i31 = 536870912;
                            } else {
                                i31 = 268435456;
                            }
                            i13 |= i31;
                            i32 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                            if (i32 == 0) {
                                i34 = i11 | 6;
                                i33 = i32;
                            } else if ((i11 & 6) == 0) {
                                i33 = i32;
                                if (qVar.f(j2Var)) {
                                    i35 = 4;
                                } else {
                                    i35 = 2;
                                }
                                i34 = i11 | i35;
                            } else {
                                i33 = i32;
                                i34 = i11;
                            }
                            i36 = i12 & 2048;
                            if (i36 == 0) {
                                i34 |= 48;
                            } else if ((i11 & 48) == 0) {
                                i37 = i36;
                                if (qVar.h(oVar)) {
                                    i38 = 32;
                                } else {
                                    i38 = 16;
                                }
                                i34 |= i38;
                                if ((i13 & 306783379) != 306783378 && (i34 & 19) == 18) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                if (qVar.O(i13 & 1, z6)) {
                                    int i45 = i30;
                                    if (i43 != 0) {
                                        bVar3 = null;
                                    } else {
                                        bVar3 = bVar;
                                    }
                                    u2.e eVar = u2.l.f33918a;
                                    if (i44 != 0) {
                                        Object L = qVar.L();
                                        if (L == eVar) {
                                            L = new k(0);
                                            qVar.h0(L);
                                        }
                                        lVar10 = (ho.l) L;
                                    } else {
                                        lVar10 = lVar5;
                                    }
                                    if (i16 != 0) {
                                        pVar8 = ComposableSingletons$ExploreScreenKt.INSTANCE.m1364getLambda$686466570$app_productionRelease();
                                        i39 = i22;
                                    } else {
                                        i39 = i22;
                                        pVar8 = pVar4;
                                    }
                                    if (i18 != 0) {
                                        pVar9 = ComposableSingletons$ExploreScreenKt.INSTANCE.getLambda$958028800$app_productionRelease();
                                    } else {
                                        pVar9 = pVar2;
                                    }
                                    if (i20 != 0) {
                                        Object L2 = qVar.L();
                                        if (L2 == eVar) {
                                            L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(6);
                                            qVar.h0(L2);
                                        }
                                        aVar2 = (ho.a) L2;
                                    }
                                    ho.a aVar4 = aVar2;
                                    if (i39 != 0) {
                                        Object L3 = qVar.L();
                                        if (L3 == eVar) {
                                            L3 = new k(1);
                                            qVar.h0(L3);
                                        }
                                        int i46 = i33;
                                        lVar11 = (ho.l) L3;
                                        i40 = i46;
                                    } else {
                                        i40 = i33;
                                        lVar11 = lVar6;
                                    }
                                    if (i24 != 0) {
                                        Object L4 = qVar.L();
                                        if (L4 == eVar) {
                                            L4 = new k(2);
                                            qVar.h0(L4);
                                        }
                                        int i47 = i37;
                                        lVar12 = (ho.l) L4;
                                        i41 = i47;
                                    } else {
                                        i41 = i37;
                                        lVar12 = lVar3;
                                    }
                                    if (i27 != 0) {
                                        lVar13 = null;
                                    } else {
                                        lVar13 = lVar4;
                                    }
                                    if (i45 != 0) {
                                        Object L5 = qVar.L();
                                        if (L5 == eVar) {
                                            L5 = new a(2);
                                            qVar.h0(L5);
                                        }
                                        pVar10 = (ho.p) L5;
                                    } else {
                                        pVar10 = pVar3;
                                    }
                                    if (i40 != 0) {
                                        j2Var3 = null;
                                    } else {
                                        j2Var3 = j2Var;
                                    }
                                    if (i41 != 0) {
                                        oVar3 = null;
                                    } else {
                                        oVar3 = oVar;
                                    }
                                    u2.r.b(new fe.h0[]{LocalExplorePricesKt.getLocalExplorePrices().a(exploreState.getLocalizedPrices()), LocalExplorePricesKt.getLocalIsFreeUser().a(exploreState.isFreeUser())}, c3.k.d(413675162, true, new l(j2Var3, pVar8, exploreState, lVar10, pVar10, bVar3, lVar11, lVar12, lVar13, pVar9, oVar3, aVar4), qVar), qVar, 56);
                                    j2Var2 = j2Var3;
                                    pVar6 = pVar8;
                                    lVar9 = lVar10;
                                    pVar7 = pVar10;
                                    bVar2 = bVar3;
                                    lVar6 = lVar11;
                                    lVar7 = lVar12;
                                    lVar8 = lVar13;
                                    pVar5 = pVar9;
                                    oVar2 = oVar3;
                                    aVar3 = aVar4;
                                } else {
                                    qVar.R();
                                    bVar2 = bVar;
                                    pVar5 = pVar2;
                                    lVar7 = lVar3;
                                    lVar8 = lVar4;
                                    j2Var2 = j2Var;
                                    aVar3 = aVar2;
                                    lVar9 = lVar5;
                                    pVar6 = pVar4;
                                    pVar7 = pVar3;
                                    oVar2 = oVar;
                                }
                                r10 = qVar.r();
                                if (r10 != null) {
                                    r10.f34012d = new m(exploreState, bVar2, lVar9, pVar6, pVar5, aVar3, lVar6, lVar7, lVar8, pVar7, j2Var2, oVar2, i10, i11, i12);
                                    return;
                                }
                                return;
                            }
                            i37 = i36;
                            if ((i13 & 306783379) != 306783378) {
                            }
                            z6 = true;
                            if (qVar.O(i13 & 1, z6)) {
                            }
                            r10 = qVar.r();
                            if (r10 != null) {
                            }
                        }
                        i30 = i29;
                        i32 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                        if (i32 == 0) {
                        }
                        i36 = i12 & 2048;
                        if (i36 == 0) {
                        }
                        i37 = i36;
                        if ((i13 & 306783379) != 306783378) {
                        }
                        z6 = true;
                        if (qVar.O(i13 & 1, z6)) {
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                        }
                    }
                    i27 = i26;
                    i29 = i12 & 512;
                    if (i29 != 0) {
                    }
                    i30 = i29;
                    i32 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i32 == 0) {
                    }
                    i36 = i12 & 2048;
                    if (i36 == 0) {
                    }
                    i37 = i36;
                    if ((i13 & 306783379) != 306783378) {
                    }
                    z6 = true;
                    if (qVar.O(i13 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                i20 = i12 & 32;
                if (i20 == 0) {
                }
                i22 = i12 & 64;
                if (i22 == 0) {
                }
                i24 = i12 & 128;
                if (i24 == 0) {
                }
                i26 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i26 == 0) {
                }
                i27 = i26;
                i29 = i12 & 512;
                if (i29 != 0) {
                }
                i30 = i29;
                i32 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i32 == 0) {
                }
                i36 = i12 & 2048;
                if (i36 == 0) {
                }
                i37 = i36;
                if ((i13 & 306783379) != 306783378) {
                }
                z6 = true;
                if (qVar.O(i13 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            pVar4 = pVar;
            i18 = i12 & 16;
            if (i18 != 0) {
            }
            i20 = i12 & 32;
            if (i20 == 0) {
            }
            i22 = i12 & 64;
            if (i22 == 0) {
            }
            i24 = i12 & 128;
            if (i24 == 0) {
            }
            i26 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i26 == 0) {
            }
            i27 = i26;
            i29 = i12 & 512;
            if (i29 != 0) {
            }
            i30 = i29;
            i32 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i32 == 0) {
            }
            i36 = i12 & 2048;
            if (i36 == 0) {
            }
            i37 = i36;
            if ((i13 & 306783379) != 306783378) {
            }
            z6 = true;
            if (qVar.O(i13 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar5 = lVar;
        i16 = i12 & 8;
        if (i16 == 0) {
        }
        pVar4 = pVar;
        i18 = i12 & 16;
        if (i18 != 0) {
        }
        i20 = i12 & 32;
        if (i20 == 0) {
        }
        i22 = i12 & 64;
        if (i22 == 0) {
        }
        i24 = i12 & 128;
        if (i24 == 0) {
        }
        i26 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i26 == 0) {
        }
        i27 = i26;
        i29 = i12 & 512;
        if (i29 != 0) {
        }
        i30 = i29;
        i32 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i32 == 0) {
        }
        i36 = i12 & 2048;
        if (i36 == 0) {
        }
        i37 = i36;
        if ((i13 & 306783379) != 306783378) {
        }
        z6 = true;
        if (qVar.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z ExploreScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$2$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$3$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$4$0(String str, boolean z6) {
        str.getClass();
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5(j2 j2Var, ho.p pVar, ExploreState exploreState, ho.l lVar, ho.p pVar2, ua.b bVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.p pVar3, i1.o oVar, ho.a aVar, u2.m mVar, int i10) {
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
            k5.a(null, null, pVar, null, null, 0, primary, 0L, new r1.i0(u0.e(qVar).f29154l, new o1(u0.e(qVar).f29154l, 16)), c3.k.d(507247849, true, new n(exploreState, lVar, pVar2, bVar, lVar2, lVar3, lVar4, pVar3, j2Var, oVar, aVar), qVar), qVar, 805306368, 187);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0(final ExploreState exploreState, final ho.l lVar, final ho.p pVar, final ua.b bVar, final ho.l lVar2, final ho.l lVar3, final ho.l lVar4, ho.p pVar2, j2 j2Var, i1.o oVar, ho.a aVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        h4.e eVar;
        i3.l lVar5;
        i3.q qVar;
        h4.e eVar2;
        h4.d dVar;
        ho.a aVar3;
        h4.e eVar3;
        t1.z zVar;
        z1 z1Var2;
        u2.q qVar2;
        Object obj;
        h4.e eVar4;
        boolean z10;
        ho.a aVar4;
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
        u2.q qVar3 = (u2.q) mVar;
        if (qVar3.O(i11 & 1, z6)) {
            i3.q qVar4 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar4, 1.0f);
            i3.l lVar6 = i3.d.f12997a;
            f1 d11 = r1.p.d(lVar6, false);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c5 = i3.a.c(d10, qVar3);
            h4.h.f11920i.getClass();
            ho.a aVar5 = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(aVar5);
            } else {
                qVar3.k0();
            }
            h4.e eVar5 = h4.g.f11907f;
            u2.r.J(eVar5, d11, qVar3);
            h4.e eVar6 = h4.g.f11906e;
            u2.r.J(eVar6, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar7 = h4.g.f11908g;
            u2.r.y(qVar3, valueOf, eVar7);
            h4.d dVar2 = h4.g.f11909h;
            u2.r.F(dVar2, qVar3);
            int i13 = i11;
            h4.e eVar8 = h4.g.f11905d;
            u2.r.J(eVar8, c5, qVar3);
            Object[] objArr = new Object[0];
            Object L = qVar3.L();
            Object obj2 = u2.l.f33918a;
            if (L == obj2) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(5);
                qVar3.h0(L);
            }
            x0 x0Var = (x0) f3.m.e(objArr, (ho.a) L, qVar3, 48);
            final float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(ExploreScreenUI$lambda$5$0$0$0$1(x0Var), (u2.m) qVar3, 0);
            Object L2 = qVar3.L();
            if (L2 == obj2) {
                L2 = u2.r.A(Boolean.TRUE);
                qVar3.h0(L2);
            }
            z0 z0Var = (z0) L2;
            Object L3 = qVar3.L();
            if (L3 == obj2) {
                L3 = new s(z0Var, 4);
                qVar3.h0(L3);
            }
            b4.a rememberUiVisibilityNestedScrollConnection = AnimatedVisibilityContainersKt.rememberUiVisibilityNestedScrollConnection(null, (ho.l) L3, qVar3, 48, 1);
            t1.z a10 = b0.a(0, qVar3, 3);
            Object L4 = qVar3.L();
            if (L4 == obj2) {
                L4 = com.google.android.gms.internal.play_billing.b.t(0, qVar3);
            }
            x0 x0Var2 = (x0) L4;
            final float rememberPxToDp2 = ComposeExtensionsKt.rememberPxToDp(ExploreScreenUI$lambda$5$0$0$0$8(x0Var2), (u2.m) qVar3, 0);
            Object L5 = qVar3.L();
            if (L5 == obj2) {
                L5 = u2.r.A(exploreState.getActiveFilters());
                qVar3.h0(L5);
            }
            z0 z0Var2 = (z0) L5;
            Map<String, List<String>> activeFilters = exploreState.getActiveFilters();
            boolean h10 = qVar3.h(exploreState) | qVar3.f(a10);
            Object L6 = qVar3.L();
            if (!h10 && L6 != obj2) {
                aVar2 = aVar5;
            } else {
                aVar2 = aVar5;
                L6 = new ExploreScreenKt$ExploreScreenUI$6$1$1$1$1$1(exploreState, a10, z0Var2, null);
                qVar3.h0(L6);
            }
            u2.r.f((ho.p) L6, activeFilters, qVar3);
            if (exploreState.getGeneralContentError() != null && exploreState.getGeneralContent() == null && !exploreState.isInitialLoading()) {
                qVar3.X(1713765660);
                i3.t D = r1.d.D(p2.d(qVar4, 1.0f), z1Var);
                boolean f10 = qVar3.f(lVar);
                Object L7 = qVar3.L();
                if (f10 || L7 == obj2) {
                    L7 = new e(lVar, 2);
                    qVar3.h0(L7);
                }
                z10 = false;
                ExploreErrorState((ho.a) L7, D, qVar3, 0, 0);
                qVar3.p(false);
                eVar = eVar5;
                z1Var2 = z1Var;
                qVar2 = qVar3;
                eVar4 = eVar8;
                lVar5 = lVar6;
                eVar2 = eVar6;
                dVar = dVar2;
                aVar3 = aVar2;
                eVar3 = eVar7;
                obj = obj2;
            } else {
                qVar3.X(1714138466);
                final boolean z11 = !exploreState.getActiveFilters().isEmpty();
                i3.t a11 = b4.f.a(p2.d(qVar4, 1.0f), rememberUiVisibilityNestedScrollConnection, null);
                boolean c10 = qVar3.c(rememberPxToDp) | qVar3.h(exploreState) | qVar3.f(lVar) | qVar3.f(pVar) | qVar3.g(z11) | qVar3.h(bVar) | qVar3.f(lVar2) | qVar3.f(lVar3) | qVar3.f(lVar4) | qVar3.c(rememberPxToDp2);
                Object L8 = qVar3.L();
                if (!c10 && L8 != obj2) {
                    eVar = eVar5;
                    lVar5 = lVar6;
                    qVar = qVar4;
                    eVar2 = eVar6;
                    dVar = dVar2;
                    aVar3 = aVar2;
                    eVar3 = eVar7;
                    zVar = a10;
                } else {
                    eVar = eVar5;
                    lVar5 = lVar6;
                    qVar = qVar4;
                    eVar2 = eVar6;
                    dVar = dVar2;
                    aVar3 = aVar2;
                    eVar3 = eVar7;
                    zVar = a10;
                    L8 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.j
                        @Override // ho.l
                        public final Object invoke(Object obj3) {
                            z ExploreScreenUI$lambda$5$0$0$0$15$0;
                            ExploreScreenUI$lambda$5$0$0$0$15$0 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$15$0(ExploreState.this, z11, bVar, lVar2, lVar3, lVar4, rememberPxToDp, lVar, pVar, rememberPxToDp2, (t1.t) obj3);
                            return ExploreScreenUI$lambda$5$0$0$0$15$0;
                        }
                    };
                    qVar3.h0(L8);
                }
                z1Var2 = z1Var;
                qVar2 = qVar3;
                obj = obj2;
                eVar4 = eVar8;
                c1.c(a11, zVar, z1Var2, false, null, null, null, false, null, (ho.l) L8, qVar2, (i13 << 6) & 896, 504);
                z10 = false;
                qVar2.p(false);
                qVar4 = qVar;
            }
            i3.t D2 = r1.d.D(p2.d(qVar4, 1.0f), z1Var2);
            f1 d12 = r1.p.d(i3.d.Z, z10);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c11 = i3.a.c(D2, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                aVar4 = aVar3;
                qVar2.k(aVar4);
            } else {
                aVar4 = aVar3;
                qVar2.k0();
            }
            h4.e eVar9 = eVar;
            u2.r.J(eVar9, d12, qVar2);
            h4.e eVar10 = eVar2;
            u2.r.J(eVar10, l7, qVar2);
            h4.e eVar11 = eVar3;
            h4.d dVar3 = dVar;
            defpackage.f.u(hashCode2, qVar2, eVar11, qVar2, dVar3);
            u2.r.J(eVar4, c11, qVar2);
            i3.t e10 = p2.e(qVar4, 1.0f);
            Object L9 = qVar2.L();
            if (L9 == obj) {
                L9 = new f(x0Var2, 1);
                qVar2.h0(L9);
            }
            i3.t q = f4.i0.q(e10, (ho.l) L9);
            f1 d13 = r1.p.d(lVar5, false);
            int hashCode3 = Long.hashCode(qVar2.T);
            c3.o l10 = qVar2.l();
            i3.t c12 = i3.a.c(q, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(aVar4);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar9, d13, qVar2);
            u2.r.J(eVar10, l10, qVar2);
            defpackage.f.u(hashCode3, qVar2, eVar11, qVar2, dVar3);
            u2.r.J(eVar4, c12, qVar2);
            j0.c.r(0, pVar2, qVar2, true, true);
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(exploreState.isInitialLoading(), null, EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable), qVar2, 0, 2);
            AnimatedVisibilityContainersKt.AnimatedSlideTopVisibility(ExploreScreenUI$lambda$5$0$0$0$4(z0Var), c3.k.d(1333568796, true, new h2.d(x0Var, j2Var, oVar, aVar, 4), qVar2), qVar2, 48);
            qVar2.p(true);
        } else {
            qVar3.R();
        }
        return z.f31622a;
    }

    public static final x0 ExploreScreenUI$lambda$5$0$0$0$0$0() {
        return new u2.f1(250);
    }

    private static final int ExploreScreenUI$lambda$5$0$0$0$1(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    public static final Map<String, List<String>> ExploreScreenUI$lambda$5$0$0$0$11(z0 z0Var) {
        return (Map) z0Var.getValue();
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$14$0(ho.l lVar) {
        lVar.invoke(new io.elevenlabs.readerapp.ui.screens.authenticated.author.f(29));
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$14$0$0(ExploreViewModel exploreViewModel) {
        exploreViewModel.getClass();
        exploreViewModel.retry();
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0(ExploreState exploreState, boolean z6, ua.b bVar, ho.l lVar, ho.l lVar2, ho.l lVar3, float f10, ho.l lVar4, ho.p pVar, float f11, t1.t tVar) {
        t1.t tVar2;
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new g(f10, 0), true, -630459062), 3);
        if (!exploreState.getPageFilters().isEmpty()) {
            t1.t.c(tVar, null, null, new c3.j(new fm.o(exploreState, lVar4, pVar, 11), true, -1074523441), 3);
        }
        if (z6 && bVar != null) {
            exploreFilteredContent(tVar, bVar, lVar, lVar2, lVar3, exploreState.getPlayingPreviewReadId(), new e(lVar4, 1));
        } else if (!z6 && exploreState.getGeneralContent() != null) {
            tVar2 = tVar;
            exploreGeneralContent(tVar2, exploreState.getGeneralContent().getSections(), lVar, lVar2, lVar3, exploreState.getPlayingPreviewReadId());
            t1.t.c(tVar2, null, null, new c3.j(new g(f11, 1), true, -1653592461), 3);
            t1.t.c(tVar2, null, null, ComposableSingletons$ExploreScreenKt.INSTANCE.m1360getLambda$1469584110$app_productionRelease(), 3);
            return z.f31622a;
        }
        tVar2 = tVar;
        t1.t.c(tVar2, null, null, new c3.j(new g(f11, 1), true, -1653592461), 3);
        t1.t.c(tVar2, null, null, ComposableSingletons$ExploreScreenKt.INSTANCE.m1360getLambda$1469584110$app_productionRelease(), 3);
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$0(float f10, t1.b bVar, u2.m mVar, int i10) {
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

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$1(ExploreState exploreState, ho.l lVar, ho.p pVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List<PageFilter> pageFilters = exploreState.getPageFilters();
            Map<String, List<String>> activeFilters = exploreState.getActiveFilters();
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                L = new d(lVar, 0);
                qVar.h0(L);
            }
            ho.p pVar2 = (ho.p) L;
            boolean f11 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                L2 = new s(lVar, 2);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            boolean f12 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f12 || L3 == eVar) {
                L3 = new e(lVar, 0);
                qVar.h0(L3);
            }
            ExploreFilterTopBarKt.ExploreFilterTopBar(pageFilters, activeFilters, pVar2, lVar2, (ho.a) L3, null, pVar, qVar, 0, 32);
            r1.d.g(p2.f(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX5()), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0(ho.l lVar, String str, List list) {
        str.getClass();
        list.getClass();
        lVar.invoke(new o(str, list));
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0$0(String str, List list, ExploreViewModel exploreViewModel) {
        exploreViewModel.getClass();
        exploreViewModel.updateFilter(str, list);
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new r(str, 1));
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0$0(String str, ExploreViewModel exploreViewModel) {
        exploreViewModel.getClass();
        exploreViewModel.clearFilter(str);
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$1$2$0(ho.l lVar) {
        lVar.invoke(new io.elevenlabs.readerapp.ui.screens.authenticated.author.f(28));
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$1$2$0$0(ExploreViewModel exploreViewModel) {
        exploreViewModel.getClass();
        exploreViewModel.resetAllFilters();
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$2(ho.l lVar) {
        lVar.invoke(new io.elevenlabs.readerapp.ui.screens.authenticated.author.f(27));
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$2$0(ExploreViewModel exploreViewModel) {
        exploreViewModel.getClass();
        exploreViewModel.resetAllFilters();
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$15$0$3(float f10, t1.b bVar, u2.m mVar, int i10) {
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

    public static final z ExploreScreenUI$lambda$5$0$0$0$16$0$0(x0 x0Var, h5.l lVar) {
        ExploreScreenUI$lambda$5$0$0$0$9(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$17(x0 x0Var, j2 j2Var, i1.o oVar, ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.home_explore);
            boolean f10 = qVar.f(x0Var);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new f(x0Var, 0);
                qVar.h0(L);
            }
            i3.q qVar2 = i3.q.f13017a;
            HeaderKt.EchoHeader(R, f4.i0.q(qVar2, (ho.l) L), SearchButtonKt.headerTitleSharedElement(qVar2, j2Var, oVar, qVar, 6), c3.k.d(1505934482, true, new fm.o(j2Var, oVar, aVar, 10), qVar), EchoHeaderStyle.Large, qVar, 27648, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$17$0$0(x0 x0Var, h5.l lVar) {
        ExploreScreenUI$lambda$5$0$0$0$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$17$1(j2 j2Var, i1.o oVar, ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SearchButtonKt.SearchButton(io.elevenlabs.readerapp.R.string.search_accessibility_search, aVar, SearchButtonKt.searchButtonSharedElement(i3.q.f13017a, j2Var, oVar, qVar, 6), ButtonIconSize.Medium, qVar, 3072, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    private static final void ExploreScreenUI$lambda$5$0$0$0$2(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final boolean ExploreScreenUI$lambda$5$0$0$0$4(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void ExploreScreenUI$lambda$5$0$0$0$5(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z ExploreScreenUI$lambda$5$0$0$0$6$0(z0 z0Var, boolean z6) {
        ExploreScreenUI$lambda$5$0$0$0$5(z0Var, z6);
        return z.f31622a;
    }

    private static final int ExploreScreenUI$lambda$5$0$0$0$8(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void ExploreScreenUI$lambda$5$0$0$0$9(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final z ExploreScreenUI$lambda$6(ExploreState exploreState, ua.b bVar, ho.l lVar, ho.p pVar, ho.p pVar2, ho.a aVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.p pVar3, j2 j2Var, i1.o oVar, int i10, int i11, int i12, u2.m mVar, int i13) {
        ExploreScreenUI(exploreState, bVar, lVar, pVar, pVar2, aVar, lVar2, lVar3, lVar4, pVar3, j2Var, oVar, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return z.f31622a;
    }

    public static final void Preview_ExploreErrorState(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(656737264);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(4);
                qVar.h0(L);
            }
            ExploreErrorState((ho.a) L, null, qVar, 6, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 18);
        }
    }

    public static final z Preview_ExploreErrorState$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ExploreErrorState(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreFilteredEmptyState(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1116884190);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(3);
                qVar.h0(L);
            }
            ExploreFilteredEmptyState((ho.a) L, qVar, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 16);
        }
    }

    public static final z Preview_ExploreFilteredEmptyState$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ExploreFilteredEmptyState(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreScreen_error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1823268892);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ExploreScreenUI(new ExploreState(false, null, null, "Error message", null, null, null, null, null, null, 1014, null), null, null, null, null, null, null, null, null, null, null, null, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 14);
        }
    }

    public static final z Preview_ExploreScreen_error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreScreen_error(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreScreen_idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1433176466);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ExploreScreenUI(new ExploreState(false, null, null, null, null, null, null, null, null, null, 1023, null), null, null, null, null, null, null, null, null, null, null, null, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 11);
        }
    }

    public static final z Preview_ExploreScreen_idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreScreen_idle(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreScreen_loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(233217181);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ExploreScreenUI(new ExploreState(false, null, ExploreFactoryKt.stubReadsExplorePage(), null, null, "en", null, null, null, null, 986, null), null, null, null, null, null, null, null, null, null, null, null, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 13);
        }
    }

    public static final z Preview_ExploreScreen_loaded$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreScreen_loaded(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreScreen_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-463473168);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ExploreScreenUI(new ExploreState(true, null, null, null, null, null, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 19);
        }
    }

    public static final z Preview_ExploreScreen_loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreScreen_loading(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreScreen_playing(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-995955906);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ExploreScreenUI(new ExploreState(false, null, ExploreFactoryKt.stubReadsExplorePage(), null, null, "en", null, null, null, null, 986, null), null, null, null, ComposableSingletons$ExploreScreenKt.INSTANCE.m1363getLambda$639092294$app_productionRelease(), null, null, null, null, null, null, null, qVar, 24576, 0, 4078);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 15);
        }
    }

    public static final z Preview_ExploreScreen_playing$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreScreen_playing(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreScreen_withActiveFilters(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(651104605);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadsExplorePage stubReadsExplorePage = ExploreFactoryKt.stubReadsExplorePage();
            List<ReadsExplorePage.Section> sections = stubReadsExplorePage.getSections();
            sections.getClass();
            ExploreScreenUI(new ExploreState(false, stubReadsExplorePage.getPageFilters(), stubReadsExplorePage, null, a0.J(new sn.k(FirebaseAnalytics.Param.PRICE, ig.f.H("free")), new sn.k("genre", ig.f.I("Romance", "History")), new sn.k("sort_by", ig.f.H("newest"))), "en", null, null, null, null, 968, null), ua.d.a(new a7.u(new ta.z0(new a7.u(new ta.z(sections, null), 3), ta.z0.f32777e, ta.z0.f32778f, new io.elevenlabs.readerapp.ui.components.e(sections, 6)), 3), qVar), null, null, null, null, null, null, null, null, null, null, qVar, 64, 0, 4092);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 17);
        }
    }

    public static final z Preview_ExploreScreen_withActiveFilters$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreScreen_withActiveFilters(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreScreen_withFilters(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1263063671);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadsExplorePage stubReadsExplorePage = ExploreFactoryKt.stubReadsExplorePage();
            ExploreScreenUI(new ExploreState(false, stubReadsExplorePage.getPageFilters(), stubReadsExplorePage, null, null, "en", null, null, null, null, 984, null), null, null, null, null, null, null, null, null, null, null, null, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 12);
        }
    }

    public static final z Preview_ExploreScreen_withFilters$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreScreen_withFilters(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void exploreFilteredContent(t1.t tVar, final ua.b bVar, ho.l lVar, ho.l lVar2, ho.l lVar3, String str, final ho.a aVar) {
        rq.f fVar = bVar.d().f32555a;
        if (fVar instanceof ta.r) {
            t1.t.c(tVar, null, null, ComposableSingletons$ExploreScreenKt.INSTANCE.m1359getLambda$1111805383$app_productionRelease(), 3);
            return;
        }
        if (fVar instanceof ta.q) {
            final int i10 = 1;
            t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.b
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z exploreFilteredContent$lambda$4;
                    z exploreFilteredContent$lambda$0;
                    z exploreFilteredContent$lambda$1;
                    switch (i10) {
                        case 0:
                            exploreFilteredContent$lambda$4 = ExploreScreenKt.exploreFilteredContent$lambda$4((ua.b) bVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                            return exploreFilteredContent$lambda$4;
                        case 1:
                            exploreFilteredContent$lambda$0 = ExploreScreenKt.exploreFilteredContent$lambda$0((ua.b) bVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                            return exploreFilteredContent$lambda$0;
                        default:
                            exploreFilteredContent$lambda$1 = ExploreScreenKt.exploreFilteredContent$lambda$1((ho.a) bVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                            return exploreFilteredContent$lambda$1;
                    }
                }
            }, true, -1167423070), 3);
            return;
        }
        if (fVar instanceof ta.s) {
            if (bVar.c() == 0) {
                final int i11 = 2;
                t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.b
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z exploreFilteredContent$lambda$4;
                        z exploreFilteredContent$lambda$0;
                        z exploreFilteredContent$lambda$1;
                        switch (i11) {
                            case 0:
                                exploreFilteredContent$lambda$4 = ExploreScreenKt.exploreFilteredContent$lambda$4((ua.b) aVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                return exploreFilteredContent$lambda$4;
                            case 1:
                                exploreFilteredContent$lambda$0 = ExploreScreenKt.exploreFilteredContent$lambda$0((ua.b) aVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                return exploreFilteredContent$lambda$0;
                            default:
                                exploreFilteredContent$lambda$1 = ExploreScreenKt.exploreFilteredContent$lambda$1((ho.a) aVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                return exploreFilteredContent$lambda$1;
                        }
                    }
                }, true, -492651428), 3);
                return;
            }
            t1.i iVar = (t1.i) tVar;
            iVar.u(bVar.c(), new s(bVar, 5), new j0(bVar), new c3.j(new t0(bVar, lVar, lVar2, lVar3, str, 1), true, 1263121098));
            rq.f fVar2 = bVar.d().f32557c;
            if (fVar2 instanceof ta.r) {
                t1.t.c(iVar, null, null, ComposableSingletons$ExploreScreenKt.INSTANCE.m1361getLambda$1629468615$app_productionRelease(), 3);
                return;
            } else {
                if (fVar2 instanceof ta.q) {
                    final int i12 = 0;
                    t1.t.c(iVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.b
                        @Override // ho.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            z exploreFilteredContent$lambda$4;
                            z exploreFilteredContent$lambda$0;
                            z exploreFilteredContent$lambda$1;
                            switch (i12) {
                                case 0:
                                    exploreFilteredContent$lambda$4 = ExploreScreenKt.exploreFilteredContent$lambda$4((ua.b) bVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                    return exploreFilteredContent$lambda$4;
                                case 1:
                                    exploreFilteredContent$lambda$0 = ExploreScreenKt.exploreFilteredContent$lambda$0((ua.b) bVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                    return exploreFilteredContent$lambda$0;
                                default:
                                    exploreFilteredContent$lambda$1 = ExploreScreenKt.exploreFilteredContent$lambda$1((ho.a) bVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                    return exploreFilteredContent$lambda$1;
                            }
                        }
                    }, true, -1452674078), 3);
                    return;
                }
                return;
            }
        }
        c6.p();
    }

    public static final z exploreFilteredContent$lambda$0(ua.b bVar, t1.b bVar2, u2.m mVar, int i10) {
        boolean z6;
        bVar2.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(bVar);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new c(bVar, 0);
                qVar.h0(L);
            }
            ExploreErrorState((ho.a) L, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z exploreFilteredContent$lambda$0$0$0(ua.b bVar) {
        bVar.e();
        return z.f31622a;
    }

    public static final z exploreFilteredContent$lambda$1(ho.a aVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreFilteredEmptyState(aVar, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final Object exploreFilteredContent$lambda$2(ua.b bVar, int i10) {
        ReadsExplorePage.Section section = (ReadsExplorePage.Section) ((ta.p) bVar.f34252c.getValue()).get(i10);
        if (section != null) {
            String str = "";
            if (section instanceof ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel) {
                ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel getReadsExploreHighlightedCarousel = (ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel) section;
                String deeplink = getReadsExploreHighlightedCarousel.getDeeplink();
                if (deeplink == null) {
                    String title = getReadsExploreHighlightedCarousel.getTitle();
                    if (title != null) {
                        str = title;
                    }
                } else {
                    str = deeplink;
                }
                return p.n.h(i10, "highlight:", ":", str);
            }
            if (section instanceof ReadsExplorePage.Section.GetReadsExploreSmallGrid) {
                ReadsExplorePage.Section.GetReadsExploreSmallGrid getReadsExploreSmallGrid = (ReadsExplorePage.Section.GetReadsExploreSmallGrid) section;
                String deeplink2 = getReadsExploreSmallGrid.getDeeplink();
                if (deeplink2 == null) {
                    String title2 = getReadsExploreSmallGrid.getTitle();
                    if (title2 != null) {
                        str = title2;
                    }
                } else {
                    str = deeplink2;
                }
                return p.n.h(i10, "small:", ":", str);
            }
            if (section instanceof ReadsExplorePage.Section.GetReadsExploreLargeGrid) {
                ReadsExplorePage.Section.GetReadsExploreLargeGrid getReadsExploreLargeGrid = (ReadsExplorePage.Section.GetReadsExploreLargeGrid) section;
                String deeplink3 = getReadsExploreLargeGrid.getDeeplink();
                if (deeplink3 == null) {
                    String title3 = getReadsExploreLargeGrid.getTitle();
                    if (title3 != null) {
                        str = title3;
                    }
                } else {
                    str = deeplink3;
                }
                return p.n.h(i10, "large:", ":", str);
            }
            if (section instanceof ReadsExplorePage.Section.GetReadsExploreCardCollection) {
                ReadsExplorePage.Section.GetReadsExploreCardCollection getReadsExploreCardCollection = (ReadsExplorePage.Section.GetReadsExploreCardCollection) section;
                String deeplink4 = getReadsExploreCardCollection.getDeeplink();
                if (deeplink4 == null) {
                    String title4 = getReadsExploreCardCollection.getTitle();
                    if (title4 != null) {
                        str = title4;
                    }
                } else {
                    str = deeplink4;
                }
                return p.n.h(i10, "card:", ":", str);
            }
            if (section instanceof ReadsExplorePage.Section.GetReadsExploreHeroCarousel) {
                return p.n.h(i10, "hero:", ":", ((ReadsExplorePage.Section.GetReadsExploreHeroCarousel) section).getTitle());
            }
            if (section instanceof ReadsExplorePage.Section.GetReadsExploreVoiceCollection) {
                return p.n.h(i10, "voice:", ":", ((ReadsExplorePage.Section.GetReadsExploreVoiceCollection) section).getTitle());
            }
            if (section instanceof ReadsExplorePage.Section.GetReadsExploreTitleSubtitle) {
                String title5 = ((ReadsExplorePage.Section.GetReadsExploreTitleSubtitle) section).getTitle();
                if (title5 != null) {
                    str = title5;
                }
                return p.n.h(i10, "title-subtitle:", ":", str);
            }
            c6.p();
            return null;
        }
        return Integer.valueOf(i10);
    }

    public static final z exploreFilteredContent$lambda$3(ua.b bVar, ho.l lVar, ho.l lVar2, ho.l lVar3, String str, t1.b bVar2, int i10, u2.m mVar, int i11) {
        int i12;
        boolean z6;
        int i13;
        bVar2.getClass();
        if ((i11 & 48) == 0) {
            if (((u2.q) mVar).d(i10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i11 | i13;
        } else {
            i12 = i11;
        }
        if ((i12 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i12 & 1, z6)) {
            ReadsExplorePage.Section section = (ReadsExplorePage.Section) bVar.b(i10);
            if (section == null) {
                qVar.X(1432214836);
                qVar.p(false);
            } else {
                qVar.X(1432214837);
                ExploreSectionContentKt.ExploreSectionContent(section, lVar, lVar2, lVar3, str, true, qVar, 196608, 0);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z exploreFilteredContent$lambda$4(ua.b bVar, t1.b bVar2, u2.m mVar, int i10) {
        boolean z6;
        bVar2.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(bVar);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new c(bVar, 1);
                qVar.h0(L);
            }
            ExploreErrorState((ho.a) L, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z exploreFilteredContent$lambda$4$0$0(ua.b bVar) {
        bVar.e();
        return z.f31622a;
    }

    private static final void exploreGeneralContent(t1.t tVar, final List<? extends ReadsExplorePage.Section> list, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, final String str) {
        if (list.isEmpty()) {
            t1.t.c(tVar, null, null, ComposableSingletons$ExploreScreenKt.INSTANCE.m1362getLambda$1853951691$app_productionRelease(), 3);
            return;
        }
        final ExploreScreenKt$exploreGeneralContent$$inlined$items$default$1 exploreScreenKt$exploreGeneralContent$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreScreenKt$exploreGeneralContent$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ReadsExplorePage.Section) obj);
            }

            @Override // ho.l
            public final Void invoke(ReadsExplorePage.Section section) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreScreenKt$exploreGeneralContent$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreScreenKt$exploreGeneralContent$$inlined$items$default$4
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
                    ReadsExplorePage.Section section = (ReadsExplorePage.Section) list.get(i10);
                    qVar.X(-1934077712);
                    ExploreSectionContentKt.ExploreSectionContent(section, lVar, lVar2, lVar3, str, true, qVar, 196608, 0);
                    r1.d.g(p2.f(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX8()), qVar);
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
    }
}

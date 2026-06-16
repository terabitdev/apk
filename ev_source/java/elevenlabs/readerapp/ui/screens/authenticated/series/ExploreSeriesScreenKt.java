package io.elevenlabs.readerapp.ui.screens.authenticated.series;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import f4.i0;
import h4.g;
import h4.h;
import ho.l;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.ui.components.PaletteUtilsKt;
import io.elevenlabs.readerapp.ui.components.b0;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.screens.authenticated.c0;
import io.elevenlabs.readerapp.ui.screens.authenticated.d0;
import io.elevenlabs.readerapp.ui.screens.authenticated.e0;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.CollectionDetailHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreLargeGridCollectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.components.EchoBackButtonKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.GlassModifiersKt;
import io.elevenlabs.ui.extensions.GlassState;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.m2;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.s;
import p3.x;
import r1.d2;
import r1.j;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.v;
import r1.w;
import rd.c1;
import sn.z;
import ta.r;
import tn.y;
import u2.m;
import u2.q;
import u2.r1;
import u2.x0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 ²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/domain/model/ExploreCollectionDetails;", "collectionDetails", "Lua/b;", "Lio/elevenlabs/domain/model/ExploreRead;", "itemsPagingItems", "Lkotlin/Function0;", "", "onGoBack", "Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToRead", "onShareClick", "onPreviewClick", "playingPreviewReadId", "miniPlayer", "ExploreSeriesScreenUI", "(Lio/elevenlabs/domain/model/ExploreCollectionDetails;Lua/b;Lho/a;Lho/l;Lho/a;Lho/l;Ljava/lang/String;Lho/p;Lu2/m;II)V", "Lp3/x;", "headerColor", "Li3/t;", "modifier", "Lh5/f;", "topPadding", "SeriesContent-lQd7feU", "(Lio/elevenlabs/domain/model/ExploreCollectionDetails;JLua/b;Lho/l;Lho/l;Ljava/lang/String;Li3/t;Lho/p;FLu2/m;II)V", "SeriesContent", "Preview_ExploreSeriesScreen_Content", "(Lu2/m;I)V", "", "headerHeight", "miniPlayerHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreSeriesScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if (r4 != false) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreSeriesScreenUI(ExploreCollectionDetails exploreCollectionDetails, ua.b bVar, ho.a aVar, l lVar, ho.a aVar2, l lVar2, String str, p pVar, m mVar, int i10, int i11) {
        int i12;
        l lVar3;
        int i13;
        int i14;
        String str2;
        int i15;
        boolean z6;
        q qVar;
        String str3;
        l lVar4;
        r1 r10;
        l lVar5;
        String str4;
        boolean z10;
        ua.b bVar2;
        String str5;
        boolean z11;
        GlassState glassState;
        int i16;
        l lVar6;
        String str6;
        int i17;
        ExploreCollectionDetails exploreCollectionDetails2;
        i3.q qVar2;
        q qVar3;
        boolean z12;
        ExploreRead exploreRead;
        boolean z13;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean h10;
        int i22;
        int i23;
        ho.a aVar3 = aVar;
        ho.a aVar4 = aVar2;
        exploreCollectionDetails.getClass();
        bVar.getClass();
        aVar3.getClass();
        lVar.getClass();
        aVar4.getClass();
        pVar.getClass();
        q qVar4 = (q) mVar;
        qVar4.Z(-1373804817);
        if ((i10 & 6) == 0) {
            if (qVar4.h(exploreCollectionDetails)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar4.f(bVar);
            } else {
                h10 = qVar4.h(bVar);
            }
            if (h10) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar4.h(aVar3)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (qVar4.h(lVar)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (qVar4.h(aVar4)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i19;
        }
        int i24 = i11 & 32;
        if (i24 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            lVar3 = lVar2;
            if (qVar4.h(lVar3)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                str2 = str;
                if (qVar4.f(str2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                if ((12582912 & i10) == 0) {
                    if (qVar4.h(pVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((4793491 & i12) != 4793490) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar4.O(i12 & 1, z6)) {
                    if (i24 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (bVar.c() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        bVar2 = bVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null && (exploreRead = (ExploreRead) ((ta.p) bVar2.f34252c.getValue()).get(0)) != null && (str5 = ExploreKt.coverImageUrl(exploreRead, CoverImageSize.Large)) != null) {
                        if (str5.length() > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    str5 = null;
                    x rememberAnimatedHeaderColor = PaletteUtilsKt.rememberAnimatedHeaderColor(str5, true, true, !(bVar.d().f32555a instanceof r), qVar4, 432);
                    View view = (View) qVar4.j(AndroidCompositionLocals_androidKt.f2295f);
                    if (rememberAnimatedHeaderColor != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z11);
                    boolean h11 = qVar4.h(view) | qVar4.g(z11);
                    Object L = qVar4.L();
                    u2.e eVar = u2.l.f33918a;
                    if (h11 || L == eVar) {
                        L = new c0(view, 1, z11);
                        qVar4.h0(L);
                    }
                    u2.r.c(valueOf, (l) L, qVar4);
                    Object[] objArr = new Object[0];
                    Object L2 = qVar4.L();
                    if (L2 == eVar) {
                        L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(14);
                        qVar4.h0(L2);
                    }
                    x0 x0Var = (x0) f3.m.e(objArr, (ho.a) L2, qVar4, 48);
                    float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(ExploreSeriesScreenUI$lambda$4(x0Var), (m) qVar4, 0);
                    GlassState rememberGlassState = GlassModifiersKt.rememberGlassState(qVar4, 0);
                    i3.q qVar5 = i3.q.f13017a;
                    t d10 = p2.d(qVar5, 1.0f);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i25 = EchoTheme.$stable;
                    t h12 = n.h(d10, echoTheme.getColors(qVar4, i25).getBackground().getPrimary(qVar4, EchoThemeColors.Background.$stable), h0.f26395b);
                    i3.l lVar7 = i3.d.f12997a;
                    f1 d11 = r1.p.d(lVar7, false);
                    int hashCode = Long.hashCode(qVar4.T);
                    o l4 = qVar4.l();
                    t c5 = i3.a.c(h12, qVar4);
                    h.f11920i.getClass();
                    h4.f fVar = g.f11903b;
                    qVar4.b0();
                    if (qVar4.S) {
                        qVar4.k(fVar);
                    } else {
                        qVar4.k0();
                    }
                    h4.e eVar2 = g.f11907f;
                    u2.r.J(eVar2, d11, qVar4);
                    h4.e eVar3 = g.f11906e;
                    u2.r.J(eVar3, l4, qVar4);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    h4.e eVar4 = g.f11908g;
                    u2.r.y(qVar4, valueOf2, eVar4);
                    h4.d dVar = g.f11909h;
                    u2.r.F(dVar, qVar4);
                    h4.e eVar5 = g.f11905d;
                    u2.r.J(eVar5, c5, qVar4);
                    t glassSource = GlassModifiersKt.glassSource(p2.d(qVar5, 1.0f), rememberGlassState);
                    f1 d12 = r1.p.d(lVar7, false);
                    int hashCode2 = Long.hashCode(qVar4.T);
                    o l7 = qVar4.l();
                    t c10 = i3.a.c(glassSource, qVar4);
                    qVar4.b0();
                    if (qVar4.S) {
                        qVar4.k(fVar);
                    } else {
                        qVar4.k0();
                    }
                    u2.r.J(eVar2, d12, qVar4);
                    u2.r.J(eVar3, l7, qVar4);
                    defpackage.f.u(hashCode2, qVar4, eVar4, qVar4, dVar);
                    u2.r.J(eVar5, c10, qVar4);
                    if (rememberAnimatedHeaderColor == null) {
                        qVar4.X(-52318318);
                        t d13 = p2.d(qVar5, 1.0f);
                        f1 d14 = r1.p.d(i3.d.f13001e, false);
                        int hashCode3 = Long.hashCode(qVar4.T);
                        o l10 = qVar4.l();
                        t c11 = i3.a.c(d13, qVar4);
                        qVar4.b0();
                        if (qVar4.S) {
                            qVar4.k(fVar);
                        } else {
                            qVar4.k0();
                        }
                        u2.r.J(eVar2, d14, qVar4);
                        u2.r.J(eVar3, l10, qVar4);
                        defpackage.f.u(hashCode3, qVar4, eVar4, qVar4, dVar);
                        u2.r.J(eVar5, c11, qVar4);
                        glassState = rememberGlassState;
                        z12 = true;
                        LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar4, 0, 15);
                        qVar3 = qVar4;
                        qVar3.p(true);
                        qVar3.p(false);
                        i16 = 0;
                        lVar6 = lVar5;
                        str6 = str4;
                        i17 = i25;
                        exploreCollectionDetails2 = exploreCollectionDetails;
                        qVar2 = qVar5;
                    } else {
                        glassState = rememberGlassState;
                        qVar4.X(-52190009);
                        int i26 = i12 >> 3;
                        int i27 = (i12 & 14) | 512 | ((i12 << 3) & 896) | (i12 & 7168) | (57344 & i26) | (i26 & 458752) | (i12 & 29360128);
                        i16 = 0;
                        lVar6 = lVar5;
                        str6 = str4;
                        i17 = i25;
                        exploreCollectionDetails2 = exploreCollectionDetails;
                        qVar2 = qVar5;
                        m1746SeriesContentlQd7feU(exploreCollectionDetails2, rememberAnimatedHeaderColor.f26440a, bVar, lVar, lVar6, str6, r1.d.y(qVar5), pVar, rememberPxToDp, qVar4, i27, 0);
                        qVar3 = qVar4;
                        qVar3.p(false);
                        z12 = true;
                    }
                    qVar3.p(z12);
                    t glassButtonEffect = GlassModifiersKt.glassButtonEffect(qVar2, glassState, qVar3, (GlassState.$stable << 3) | 6);
                    boolean f10 = qVar3.f(x0Var);
                    Object L3 = qVar3.L();
                    if (f10 || L3 == eVar) {
                        L3 = new b0(x0Var, 4);
                        qVar3.h0(L3);
                    }
                    t q = i0.q(qVar2, (l) L3);
                    int i28 = i17;
                    d2 d2Var = new d2(echoTheme.getSpacings(qVar3, i28).getX5(), echoTheme.getSpacings(qVar3, i28).getX6(), echoTheme.getSpacings(qVar3, i28).getX5(), i16);
                    aVar3 = aVar;
                    aVar4 = aVar2;
                    HeaderKt.m1896HeaderShfnhV8(q, k.d(1687675846, true, new defpackage.b(aVar3, glassButtonEffect, 12), qVar3), echoTheme.getSpacings(qVar3, i28).getX1(), k.d(1535998724, true, new d0(exploreCollectionDetails2, aVar4, glassButtonEffect, 1), qVar3), echoTheme.getSpacings(qVar3, i28).getX0(), ComposableSingletons$ExploreSeriesScreenKt.INSTANCE.getLambda$2053551859$app_productionRelease(), d2Var, null, null, 0L, qVar3, 199728, 896);
                    qVar3.p(true);
                    qVar = qVar3;
                    str3 = str6;
                    lVar4 = lVar6;
                } else {
                    qVar4.R();
                    qVar = qVar4;
                    str3 = str2;
                    lVar4 = lVar3;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new e0(exploreCollectionDetails, bVar, aVar3, lVar, aVar4, lVar4, str3, pVar, i10, i11, 1);
                    return;
                }
                return;
            }
            str2 = str;
            if ((12582912 & i10) == 0) {
            }
            if ((4793491 & i12) != 4793490) {
            }
            if (qVar4.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar3 = lVar2;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        str2 = str;
        if ((12582912 & i10) == 0) {
        }
        if ((4793491 & i12) != 4793490) {
        }
        if (qVar4.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final u2.h0 ExploreSeriesScreenUI$lambda$2$0(View view, boolean z6, u2.i0 i0Var) {
        Activity activity;
        Window window;
        i0Var.getClass();
        Context context = view.getContext();
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null && (window = activity.getWindow()) != null) {
            final m2 m2Var = new m2(window, view);
            final boolean E = m2Var.f20144a.E();
            m2Var.a(!z6);
            return new u2.h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt$ExploreSeriesScreenUI$lambda$2$0$$inlined$onDispose$2
                @Override // u2.h0
                public void dispose() {
                    m2.this.a(E);
                }
            };
        }
        return new u2.h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt$ExploreSeriesScreenUI$lambda$2$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
            }
        };
    }

    public static final x0 ExploreSeriesScreenUI$lambda$3$0() {
        return new u2.f1(250);
    }

    private static final int ExploreSeriesScreenUI$lambda$4(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void ExploreSeriesScreenUI$lambda$5(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final z ExploreSeriesScreenUI$lambda$6$1$0(x0 x0Var, h5.l lVar) {
        ExploreSeriesScreenUI$lambda$5(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z ExploreSeriesScreenUI$lambda$6$2(ho.a aVar, t tVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        int i11;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(l2Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.GhostWhite;
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new fm.g(23, aVar);
                qVar.h0(L);
            }
            EchoBackButtonKt.EchoBackButton((ho.a) L, tVar, echoButtonVariant, null, qVar, 384, 8);
            r1.d.g(l2Var.b(i3.q.f13017a, 1.0f, true), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreSeriesScreenUI$lambda$6$2$0$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z ExploreSeriesScreenUI$lambda$6$3(ExploreCollectionDetails exploreCollectionDetails, ho.a aVar, t tVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (exploreCollectionDetails.getShareUrl() != null) {
                qVar.X(356507668);
                EchoIconButtonKt.EchoIconButton(R.drawable.share_android, aVar, tVar, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.share_read_share), EchoButtonVariant.GhostWhite, EchoButtonSize.Medium, false, false, false, qVar, 221184, 448);
                qVar.p(false);
            } else {
                qVar.X(356934910);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreSeriesScreenUI$lambda$7(ExploreCollectionDetails exploreCollectionDetails, ua.b bVar, ho.a aVar, l lVar, ho.a aVar2, l lVar2, String str, p pVar, int i10, int i11, m mVar, int i12) {
        ExploreSeriesScreenUI(exploreCollectionDetails, bVar, aVar, lVar, aVar2, lVar2, str, pVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreSeriesScreen_Content(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1451358443);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$ExploreSeriesScreenKt.INSTANCE.m1738getLambda$1737505919$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 23);
        }
    }

    public static final z Preview_ExploreSeriesScreen_Content$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreSeriesScreen_Content(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* renamed from: SeriesContent-lQd7feU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1746SeriesContentlQd7feU(final ExploreCollectionDetails exploreCollectionDetails, final long j4, final ua.b bVar, final l lVar, final l lVar2, final String str, t tVar, p pVar, float f10, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        boolean z6;
        q qVar;
        t tVar3;
        float f12;
        r1 r10;
        t tVar4;
        float f13;
        boolean z10;
        String str2;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean h10;
        int i21;
        int i22;
        int i23;
        p pVar2 = pVar;
        q qVar2 = (q) mVar;
        qVar2.Z(1549153759);
        if ((i10 & 6) == 0) {
            if (qVar2.h(exploreCollectionDetails)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.e(j4)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                h10 = qVar2.f(bVar);
            } else {
                h10 = qVar2.h(bVar);
            }
            if (h10) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(lVar2)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i19;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.f(str)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        }
        int i24 = i11 & 64;
        if (i24 != 0) {
            i12 |= 1572864;
        } else if ((1572864 & i10) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
            if ((12582912 & i10) == 0) {
                if (qVar2.h(pVar2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            i14 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i14 == 0) {
                i12 |= 100663296;
            } else if ((100663296 & i10) == 0) {
                f11 = f10;
                if (qVar2.c(f11)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i12 |= i15;
                i16 = i12;
                if ((i16 & 38347923) != 38347922) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i16 & 1, z6)) {
                    i3.q qVar3 = i3.q.f13017a;
                    if (i24 != 0) {
                        tVar4 = qVar3;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f11;
                    }
                    Object L = qVar2.L();
                    u2.e eVar = u2.l.f33918a;
                    if (L == eVar) {
                        L = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
                    }
                    x0 x0Var = (x0) L;
                    final float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(SeriesContent_lQd7feU$lambda$1(x0Var), (m) qVar2, 0);
                    no.g f02 = ae.l.f0(0, Math.min(5, bVar.c()));
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = f02.iterator();
                    while (((no.f) it).f24561c) {
                        ExploreRead exploreRead = (ExploreRead) ((ta.p) bVar.f34252c.getValue()).get(((y) it).nextInt());
                        if (exploreRead != null) {
                            str2 = ExploreKt.coverImageUrl(exploreRead, CoverImageSize.Large);
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                    t d10 = p2.d(tVar4, 1.0f);
                    r1.x a10 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
                    t tVar5 = tVar4;
                    int hashCode = Long.hashCode(qVar2.T);
                    o l4 = qVar2.l();
                    t c5 = i3.a.c(d10, qVar2);
                    h.f11920i.getClass();
                    h4.f fVar = g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar2 = g.f11907f;
                    u2.r.J(eVar2, a10, qVar2);
                    h4.e eVar3 = g.f11906e;
                    u2.r.J(eVar3, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar4 = g.f11908g;
                    u2.r.y(qVar2, valueOf, eVar4);
                    h4.d dVar = g.f11909h;
                    u2.r.F(dVar, qVar2);
                    h4.e eVar5 = g.f11905d;
                    u2.r.J(eVar5, c5, qVar2);
                    final float f14 = f13;
                    if (1.0f > 0.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    m1 m1Var = new m1(1.0f, true);
                    i3.l lVar3 = i3.d.f12997a;
                    f1 d11 = r1.p.d(lVar3, false);
                    int hashCode2 = Long.hashCode(qVar2.T);
                    o l7 = qVar2.l();
                    t c10 = i3.a.c(m1Var, qVar2);
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(eVar2, d11, qVar2);
                    u2.r.J(eVar3, l7, qVar2);
                    defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
                    u2.r.J(eVar5, c10, qVar2);
                    qVar = qVar2;
                    r1.d.a(p2.e(qVar3, 1.0f), null, false, k.d(333376077, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.series.d
                        @Override // ho.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            z SeriesContent_lQd7feU$lambda$4$0$0;
                            int intValue = ((Integer) obj3).intValue();
                            SeriesContent_lQd7feU$lambda$4$0$0 = ExploreSeriesScreenKt.SeriesContent_lQd7feU$lambda$4$0$0(rememberPxToDp, exploreCollectionDetails, j4, f14, arrayList, bVar, lVar, lVar2, str, (r1.u) obj, (m) obj2, intValue);
                            return SeriesContent_lQd7feU$lambda$4$0$0;
                        }
                    }, qVar2), qVar, 3078, 6);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i25 = EchoTheme.$stable;
                    long primary = echoTheme.getColors(qVar, i25).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable);
                    i3.l lVar4 = i3.d.Z;
                    r1.t tVar6 = r1.t.f29349a;
                    r1.p.a(n.g(p2.f(p2.e(tVar6.b(qVar3, lVar4), 1.0f), echoTheme.getSpacings(qVar, i25).getX8()), s.b(p3.t.Companion, ig.f.I(new x(x.b(t2.u.P, primary)), new x(primary)), t2.u.P, t2.u.P, 14), null, 6), qVar, 0);
                    t b10 = tVar6.b(qVar3, lVar4);
                    Object L2 = qVar.L();
                    if (L2 == eVar) {
                        L2 = new b0(x0Var, 3);
                        qVar.h0(L2);
                    }
                    t q = i0.q(b10, (l) L2);
                    f1 d12 = r1.p.d(lVar3, false);
                    int hashCode3 = Long.hashCode(qVar.T);
                    o l10 = qVar.l();
                    t c11 = i3.a.c(q, qVar);
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(eVar2, d12, qVar);
                    u2.r.J(eVar3, l10, qVar);
                    defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
                    u2.r.J(eVar5, c11, qVar);
                    pVar2 = pVar;
                    j0.c.r((i16 >> 21) & 14, pVar2, qVar, true, true);
                    qVar.p(true);
                    f12 = f14;
                    tVar3 = tVar5;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    tVar3 = tVar2;
                    f12 = f11;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.h0(exploreCollectionDetails, j4, bVar, lVar, lVar2, str, tVar3, pVar2, f12, i10, i11);
                    return;
                }
                return;
            }
            f11 = f10;
            i16 = i12;
            if ((i16 & 38347923) != 38347922) {
            }
            if (qVar2.O(i16 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        if ((12582912 & i10) == 0) {
        }
        i14 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i14 == 0) {
        }
        f11 = f10;
        i16 = i12;
        if ((i16 & 38347923) != 38347922) {
        }
        if (qVar2.O(i16 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final int SeriesContent_lQd7feU$lambda$1(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void SeriesContent_lQd7feU$lambda$2(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final z SeriesContent_lQd7feU$lambda$4$0$0(float f10, final ExploreCollectionDetails exploreCollectionDetails, final long j4, final float f11, final List list, final ua.b bVar, final l lVar, final l lVar2, final String str, r1.u uVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        uVar.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(uVar)) {
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
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            sn.k m1405rememberGridLayout8Feqmps = ExploreLargeGridCollectionKt.m1405rememberGridLayout8Feqmps(((v) uVar).d(), qVar, 0);
            final BookCoverSize bookCoverSize = (BookCoverSize) m1405rememberGridLayout8Feqmps.f31600a;
            final int intValue = ((Number) m1405rememberGridLayout8Feqmps.f31601b).intValue();
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            float x32 = EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX3();
            if (f10 >= x32) {
                x32 = f10;
            }
            d2 f12 = r1.d.f(t2.u.P, t2.u.P, t2.u.P, x32, 7);
            boolean h10 = qVar.h(exploreCollectionDetails) | qVar.e(j4) | qVar.c(f11) | qVar.h(list) | qVar.h(bVar) | qVar.d(intValue) | qVar.d(bookCoverSize.ordinal()) | qVar.f(lVar) | qVar.f(lVar2) | qVar.f(str);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.series.c
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z SeriesContent_lQd7feU$lambda$4$0$0$0$0;
                        SeriesContent_lQd7feU$lambda$4$0$0$0$0 = ExploreSeriesScreenKt.SeriesContent_lQd7feU$lambda$4$0$0$0$0(ua.b.this, intValue, bookCoverSize, lVar, lVar2, str, exploreCollectionDetails, j4, f11, list, (t1.t) obj);
                        return SeriesContent_lQd7feU$lambda$4$0$0$0$0;
                    }
                };
                qVar.h0(L);
            }
            c1.c(e10, null, f12, false, null, null, null, false, null, (l) L, qVar, 6, 506);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SeriesContent_lQd7feU$lambda$4$0$0$0$0(ua.b bVar, int i10, BookCoverSize bookCoverSize, l lVar, l lVar2, String str, ExploreCollectionDetails exploreCollectionDetails, long j4, float f10, List list, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new b(exploreCollectionDetails, j4, f10, list), true, 1031635224), 3);
        ComposableSingletons$ExploreSeriesScreenKt composableSingletons$ExploreSeriesScreenKt = ComposableSingletons$ExploreSeriesScreenKt.INSTANCE;
        t1.t.c(tVar, null, null, composableSingletons$ExploreSeriesScreenKt.getLambda$420730049$app_productionRelease(), 3);
        ExploreLargeGridCollectionKt.pagedBookGrid(tVar, bVar, i10, bookCoverSize, lVar, lVar2, str);
        if ((bVar.d().f32555a instanceof r) && bVar.c() == 0) {
            t1.t.c(tVar, null, null, composableSingletons$ExploreSeriesScreenKt.m1737getLambda$117846243$app_productionRelease(), 3);
        }
        if (bVar.d().f32557c instanceof r) {
            t1.t.c(tVar, null, null, composableSingletons$ExploreSeriesScreenKt.m1739getLambda$424364666$app_productionRelease(), 3);
        }
        return z.f31622a;
    }

    public static final z SeriesContent_lQd7feU$lambda$4$0$0$0$0$0(ExploreCollectionDetails exploreCollectionDetails, long j4, float f10, List list, t1.b bVar, m mVar, int i10) {
        boolean z6;
        c3.j jVar;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String title = exploreCollectionDetails.getTitle();
            String subtitle = exploreCollectionDetails.getSubtitle();
            String description = exploreCollectionDetails.getDescription();
            List<String> meta = exploreCollectionDetails.getMeta();
            if (!list.isEmpty()) {
                qVar.X(-1340514006);
                jVar = k.d(-1474351074, true, new io.elevenlabs.readerapp.ui.components.w(list, 2), qVar);
                qVar.p(false);
            } else {
                qVar.X(-1340259930);
                qVar.p(false);
                jVar = null;
            }
            CollectionDetailHeaderKt.m1378CollectionDetailHeaderZfqMctQ(title, subtitle, description, meta, j4, f10, jVar, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SeriesContent_lQd7feU$lambda$4$0$0$0$0$0$0(List list, r1.y yVar, m mVar, int i10) {
        boolean z6;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, 16), qVar);
            StackedBookCoversKt.StackedBookCovers(tn.o.b1(list, 5), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SeriesContent_lQd7feU$lambda$4$0$1$0(x0 x0Var, h5.l lVar) {
        SeriesContent_lQd7feU$lambda$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z SeriesContent_lQd7feU$lambda$5(ExploreCollectionDetails exploreCollectionDetails, long j4, ua.b bVar, l lVar, l lVar2, String str, t tVar, p pVar, float f10, int i10, int i11, m mVar, int i12) {
        m1746SeriesContentlQd7feU(exploreCollectionDetails, j4, bVar, lVar, lVar2, str, tVar, pVar, f10, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }
}

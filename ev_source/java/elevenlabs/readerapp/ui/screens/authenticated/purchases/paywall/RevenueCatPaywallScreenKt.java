package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import androidx.lifecycle.o;
import c3.k;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.ui.revenuecatui.PaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import f4.f1;
import h4.h;
import ho.p;
import i3.j;
import i3.t;
import i4.i0;
import ib.i;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.PlanBadgeKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import r1.c3;
import r1.l2;
import r1.m1;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\r\u0012\u0004\u0012\u00020\u00050\r2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0017\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u001a¨\u0006 ²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, d2 = {"Lio/elevenlabs/domain/services/ProductsService$PaywallSource;", "productsSource", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "analyticsSource", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/paywall/RevenueCatPaywallViewModel;", "vm", "RevenueCatPaywallScreen", "(Lio/elevenlabs/domain/services/ProductsService$PaywallSource;Lio/elevenlabs/domain/Analytics$Event$PaywallSource;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/paywall/RevenueCatPaywallViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/paywall/RevenueCatPaywallState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "", "RevenueCatPaywallScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/paywall/RevenueCatPaywallState;Lho/l;Lho/l;Lu2/m;II)V", "onDone", "SubscribeSuccessScreen", "(Lho/a;Lu2/m;I)V", "Li3/t;", "modifier", "PaywallScreenNavigationBar", "(Lho/a;Li3/t;Lu2/m;II)V", "Preview_RevenueCatPaywallScreen_idle", "(Lu2/m;I)V", "Preview_RevenueCatPaywallScreen_loading", "Preview_RevenueCatPaywallScreen_error", "visible", "", "animationProgress", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RevenueCatPaywallScreenKt {
    public static final void PaywallScreenNavigationBar(final ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        t tVar2;
        int i14;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(591244033);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar2 = i3.q.f13017a;
            } else {
                tVar2 = tVar;
            }
            HeaderActionsKt.HeaderActions(tVar2, (String) null, (ho.q) null, k.d(-78903429, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.c
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z PaywallScreenNavigationBar$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    PaywallScreenNavigationBar$lambda$0 = RevenueCatPaywallScreenKt.PaywallScreenNavigationBar$lambda$0(ho.a.this, (l2) obj, (m) obj2, intValue);
                    return PaywallScreenNavigationBar$lambda$0;
                }
            }, qVar), (i3.f) null, qVar, ((i12 >> 3) & 14) | 3072, 22);
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new im.b(aVar, tVar2, i10, i11, 4);
        }
    }

    public static final z PaywallScreenNavigationBar$lambda$0(ho.a aVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoIconButtonKt.EchoIconButton(R.drawable.close, aVar, i0.x(i3.q.f13017a, "paywall-header-close"), kj.c.R(qVar, R.string.accessibility_bottom_sheet_dialog_close), EchoButtonVariant.Ghost, EchoButtonSize.Medium, false, false, false, qVar, 221568, 448);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PaywallScreenNavigationBar$lambda$1(ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        PaywallScreenNavigationBar(aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_RevenueCatPaywallScreen_error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1318318045);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            RevenueCatPaywallScreenUI(new RevenueCatPaywallState(null, null, false, null, "Can't make purchase", false, null, false, null, false, false, 2031, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 4);
        }
    }

    public static final z Preview_RevenueCatPaywallScreen_error$lambda$0(int i10, m mVar, int i11) {
        Preview_RevenueCatPaywallScreen_error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_RevenueCatPaywallScreen_idle(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1780502511);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            RevenueCatPaywallScreenUI(new RevenueCatPaywallState(null, null, false, null, null, false, null, false, null, false, false, 2047, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 5);
        }
    }

    public static final z Preview_RevenueCatPaywallScreen_idle$lambda$0(int i10, m mVar, int i11) {
        Preview_RevenueCatPaywallScreen_idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_RevenueCatPaywallScreen_loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(24966441);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            RevenueCatPaywallScreenUI(new RevenueCatPaywallState(null, null, true, null, null, false, null, false, null, false, false, 2043, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 3);
        }
    }

    public static final z Preview_RevenueCatPaywallScreen_loading$lambda$0(int i10, m mVar, int i11) {
        Preview_RevenueCatPaywallScreen_loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RevenueCatPaywallScreen(ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2, ho.a aVar, RevenueCatPaywallViewModel revenueCatPaywallViewModel, m mVar, int i10, int i11) {
        int i12;
        RevenueCatPaywallViewModel revenueCatPaywallViewModel2;
        boolean z6;
        q qVar;
        RevenueCatPaywallViewModel revenueCatPaywallViewModel3;
        q qVar2;
        q7.c cVar;
        int i13;
        RevenueCatPaywallViewModel revenueCatPaywallViewModel4;
        boolean z10;
        boolean z11;
        boolean z12;
        Object L;
        boolean z13;
        Object L2;
        boolean h10;
        Object L3;
        boolean h11;
        Object L4;
        int i14;
        int i15;
        int i16;
        int i17;
        paywallSource.getClass();
        paywallSource2.getClass();
        aVar.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(1838308493);
        if ((i10 & 6) == 0) {
            if (qVar3.d(paywallSource.ordinal())) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.d(paywallSource2.ordinal())) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(aVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                revenueCatPaywallViewModel2 = revenueCatPaywallViewModel;
                if (qVar3.h(revenueCatPaywallViewModel2)) {
                    i14 = 2048;
                    i12 |= i14;
                }
            } else {
                revenueCatPaywallViewModel2 = revenueCatPaywallViewModel;
            }
            i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i14;
        } else {
            revenueCatPaywallViewModel2 = revenueCatPaywallViewModel;
        }
        boolean z14 = true;
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i12 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 8) != 0) {
                    RevenueCatPaywallViewModel revenueCatPaywallViewModel5 = revenueCatPaywallViewModel2;
                    i13 = i12 & (-7169);
                    revenueCatPaywallViewModel4 = revenueCatPaywallViewModel5;
                    qVar2 = qVar3;
                    qVar2.q();
                    boolean h12 = qVar2.h(revenueCatPaywallViewModel4);
                    if ((i13 & 14) == 4) {
                    }
                    boolean z15 = z10 | h12;
                    if ((i13 & 112) == 32) {
                    }
                    z12 = z15 | z11;
                    L = qVar2.L();
                    u2.e eVar = l.f33918a;
                    if (!z12) {
                    }
                    L = new RevenueCatPaywallScreenKt$RevenueCatPaywallScreen$1$1(revenueCatPaywallViewModel4, paywallSource, paywallSource2, null);
                    qVar2.h0(L);
                    r.g(paywallSource, paywallSource2, (p) L, qVar2);
                    z0 o6 = r.o(revenueCatPaywallViewModel4.getStateFlow(), qVar2, 0);
                    Boolean valueOf = Boolean.valueOf(RevenueCatPaywallScreen$lambda$1(o6).getDismiss());
                    boolean f10 = qVar2.f(o6) | qVar2.h(revenueCatPaywallViewModel4);
                    if ((i13 & 896) != 256) {
                    }
                    z13 = f10 | z14;
                    L2 = qVar2.L();
                    if (!z13) {
                    }
                    L2 = new RevenueCatPaywallScreenKt$RevenueCatPaywallScreen$2$1(revenueCatPaywallViewModel4, aVar, o6, null);
                    qVar2.h0(L2);
                    r.f((p) L2, valueOf, qVar2);
                    RevenueCatPaywallState RevenueCatPaywallScreen$lambda$1 = RevenueCatPaywallScreen$lambda$1(o6);
                    h10 = qVar2.h(revenueCatPaywallViewModel4);
                    L3 = qVar2.L();
                    if (!h10) {
                    }
                    L3 = new f(revenueCatPaywallViewModel4, 2);
                    qVar2.h0(L3);
                    ho.l lVar = (ho.l) L3;
                    h11 = qVar2.h(revenueCatPaywallViewModel4);
                    L4 = qVar2.L();
                    if (!h11) {
                    }
                    L4 = new f(revenueCatPaywallViewModel4, 3);
                    qVar2.h0(L4);
                    q qVar4 = qVar2;
                    RevenueCatPaywallScreenUI(RevenueCatPaywallScreen$lambda$1, lVar, (ho.l) L4, qVar4, 0, 0);
                    qVar = qVar4;
                    revenueCatPaywallViewModel3 = revenueCatPaywallViewModel4;
                }
            } else if ((i11 & 8) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                if (a10 != null) {
                    qVar2 = qVar3;
                    pl.f o10 = tb.a.o(a10, qVar2);
                    if (a10 instanceof o) {
                        cVar = ((o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    revenueCatPaywallViewModel2 = (RevenueCatPaywallViewModel) gg.b.j0(e0.f20562a.b(RevenueCatPaywallViewModel.class), a10, null, o10, cVar, qVar2);
                    i12 &= -7169;
                    RevenueCatPaywallViewModel revenueCatPaywallViewModel6 = revenueCatPaywallViewModel2;
                    i13 = i12;
                    revenueCatPaywallViewModel4 = revenueCatPaywallViewModel6;
                    qVar2.q();
                    boolean h122 = qVar2.h(revenueCatPaywallViewModel4);
                    if ((i13 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z152 = z10 | h122;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z152 | z11;
                    L = qVar2.L();
                    u2.e eVar2 = l.f33918a;
                    if (!z12 || L == eVar2) {
                        L = new RevenueCatPaywallScreenKt$RevenueCatPaywallScreen$1$1(revenueCatPaywallViewModel4, paywallSource, paywallSource2, null);
                        qVar2.h0(L);
                    }
                    r.g(paywallSource, paywallSource2, (p) L, qVar2);
                    z0 o62 = r.o(revenueCatPaywallViewModel4.getStateFlow(), qVar2, 0);
                    Boolean valueOf2 = Boolean.valueOf(RevenueCatPaywallScreen$lambda$1(o62).getDismiss());
                    boolean f102 = qVar2.f(o62) | qVar2.h(revenueCatPaywallViewModel4);
                    if ((i13 & 896) != 256) {
                        z14 = false;
                    }
                    z13 = f102 | z14;
                    L2 = qVar2.L();
                    if (!z13 || L2 == eVar2) {
                        L2 = new RevenueCatPaywallScreenKt$RevenueCatPaywallScreen$2$1(revenueCatPaywallViewModel4, aVar, o62, null);
                        qVar2.h0(L2);
                    }
                    r.f((p) L2, valueOf2, qVar2);
                    RevenueCatPaywallState RevenueCatPaywallScreen$lambda$12 = RevenueCatPaywallScreen$lambda$1(o62);
                    h10 = qVar2.h(revenueCatPaywallViewModel4);
                    L3 = qVar2.L();
                    if (!h10 || L3 == eVar2) {
                        L3 = new f(revenueCatPaywallViewModel4, 2);
                        qVar2.h0(L3);
                    }
                    ho.l lVar2 = (ho.l) L3;
                    h11 = qVar2.h(revenueCatPaywallViewModel4);
                    L4 = qVar2.L();
                    if (!h11 || L4 == eVar2) {
                        L4 = new f(revenueCatPaywallViewModel4, 3);
                        qVar2.h0(L4);
                    }
                    q qVar42 = qVar2;
                    RevenueCatPaywallScreenUI(RevenueCatPaywallScreen$lambda$12, lVar2, (ho.l) L4, qVar42, 0, 0);
                    qVar = qVar42;
                    revenueCatPaywallViewModel3 = revenueCatPaywallViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar3;
            RevenueCatPaywallViewModel revenueCatPaywallViewModel62 = revenueCatPaywallViewModel2;
            i13 = i12;
            revenueCatPaywallViewModel4 = revenueCatPaywallViewModel62;
            qVar2.q();
            boolean h1222 = qVar2.h(revenueCatPaywallViewModel4);
            if ((i13 & 14) == 4) {
            }
            boolean z1522 = z10 | h1222;
            if ((i13 & 112) == 32) {
            }
            z12 = z1522 | z11;
            L = qVar2.L();
            u2.e eVar22 = l.f33918a;
            if (!z12) {
            }
            L = new RevenueCatPaywallScreenKt$RevenueCatPaywallScreen$1$1(revenueCatPaywallViewModel4, paywallSource, paywallSource2, null);
            qVar2.h0(L);
            r.g(paywallSource, paywallSource2, (p) L, qVar2);
            z0 o622 = r.o(revenueCatPaywallViewModel4.getStateFlow(), qVar2, 0);
            Boolean valueOf22 = Boolean.valueOf(RevenueCatPaywallScreen$lambda$1(o622).getDismiss());
            boolean f1022 = qVar2.f(o622) | qVar2.h(revenueCatPaywallViewModel4);
            if ((i13 & 896) != 256) {
            }
            z13 = f1022 | z14;
            L2 = qVar2.L();
            if (!z13) {
            }
            L2 = new RevenueCatPaywallScreenKt$RevenueCatPaywallScreen$2$1(revenueCatPaywallViewModel4, aVar, o622, null);
            qVar2.h0(L2);
            r.f((p) L2, valueOf22, qVar2);
            RevenueCatPaywallState RevenueCatPaywallScreen$lambda$122 = RevenueCatPaywallScreen$lambda$1(o622);
            h10 = qVar2.h(revenueCatPaywallViewModel4);
            L3 = qVar2.L();
            if (!h10) {
            }
            L3 = new f(revenueCatPaywallViewModel4, 2);
            qVar2.h0(L3);
            ho.l lVar22 = (ho.l) L3;
            h11 = qVar2.h(revenueCatPaywallViewModel4);
            L4 = qVar2.L();
            if (!h11) {
            }
            L4 = new f(revenueCatPaywallViewModel4, 3);
            qVar2.h0(L4);
            q qVar422 = qVar2;
            RevenueCatPaywallScreenUI(RevenueCatPaywallScreen$lambda$122, lVar22, (ho.l) L4, qVar422, 0, 0);
            qVar = qVar422;
            revenueCatPaywallViewModel3 = revenueCatPaywallViewModel4;
        } else {
            qVar = qVar3;
            qVar.R();
            revenueCatPaywallViewModel3 = revenueCatPaywallViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) paywallSource, (Object) paywallSource2, aVar, (Object) revenueCatPaywallViewModel3, i10, i11, 24);
        }
    }

    public static final RevenueCatPaywallState RevenueCatPaywallScreen$lambda$1(s2 s2Var) {
        return (RevenueCatPaywallState) s2Var.getValue();
    }

    public static final z RevenueCatPaywallScreen$lambda$3$0(RevenueCatPaywallViewModel revenueCatPaywallViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(revenueCatPaywallViewModel);
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreen$lambda$4$0(RevenueCatPaywallViewModel revenueCatPaywallViewModel, boolean z6) {
        revenueCatPaywallViewModel.onDismiss(z6);
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreen$lambda$5(ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2, ho.a aVar, RevenueCatPaywallViewModel revenueCatPaywallViewModel, int i10, int i11, m mVar, int i12) {
        RevenueCatPaywallScreen(paywallSource, paywallSource2, aVar, revenueCatPaywallViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0245  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RevenueCatPaywallScreenUI(RevenueCatPaywallState revenueCatPaywallState, ho.l lVar, ho.l lVar2, m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        int i14;
        ho.l lVar4;
        int i15;
        boolean z6;
        final ho.l lVar5;
        ho.l lVar6;
        q qVar;
        r1 r10;
        final ho.l lVar7;
        boolean z10;
        final ho.l lVar8;
        u2.e eVar;
        ?? r14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i16;
        revenueCatPaywallState.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(19773230);
        if ((i10 & 6) == 0) {
            if (qVar2.h(revenueCatPaywallState)) {
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
            lVar3 = lVar;
            if (qVar2.h(lVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                lVar4 = lVar2;
                if (qVar2.h(lVar4)) {
                    i15 = 256;
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
                    u2.e eVar2 = l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar2.L();
                        if (L == eVar2) {
                            L = new g(2);
                            qVar2.h0(L);
                        }
                        lVar5 = (ho.l) L;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == eVar2) {
                            L2 = new g(3);
                            qVar2.h0(L2);
                        }
                        lVar7 = (ho.l) L2;
                    } else {
                        lVar7 = lVar4;
                    }
                    i3.q qVar3 = i3.q.f13017a;
                    t d10 = p2.d(qVar3, 1.0f);
                    i3.l lVar9 = i3.d.f12997a;
                    f1 d11 = r1.p.d(lVar9, false);
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    t c5 = i3.a.c(d10, qVar2);
                    h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar3 = h4.g.f11907f;
                    r.J(eVar3, d11, qVar2);
                    h4.e eVar4 = h4.g.f11906e;
                    r.J(eVar4, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar5 = h4.g.f11908g;
                    r.y(qVar2, valueOf, eVar5);
                    h4.d dVar = h4.g.f11909h;
                    r.F(dVar, qVar2);
                    h4.e eVar6 = h4.g.f11905d;
                    r.J(eVar6, c5, qVar2);
                    if (revenueCatPaywallState.getOffering() != null) {
                        qVar2.X(1339843467);
                        if ((i12 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        Object L3 = qVar2.L();
                        if (z15 || L3 == eVar2) {
                            final int i18 = 1;
                            L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.b
                                @Override // ho.a
                                public final Object invoke() {
                                    z RevenueCatPaywallScreenUI$lambda$2$2$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$0$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$1$0$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$1$1$0;
                                    switch (i18) {
                                        case 0:
                                            RevenueCatPaywallScreenUI$lambda$2$2$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$2$0(lVar7);
                                            return RevenueCatPaywallScreenUI$lambda$2$2$0;
                                        case 1:
                                            RevenueCatPaywallScreenUI$lambda$2$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$0$0(lVar7);
                                            return RevenueCatPaywallScreenUI$lambda$2$0$0;
                                        case 2:
                                            RevenueCatPaywallScreenUI$lambda$2$1$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$0$0(lVar7);
                                            return RevenueCatPaywallScreenUI$lambda$2$1$0$0;
                                        default:
                                            RevenueCatPaywallScreenUI$lambda$2$1$1$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$1$0(lVar7);
                                            return RevenueCatPaywallScreenUI$lambda$2$1$1$0;
                                    }
                                }
                            };
                            qVar2.h0(L3);
                        }
                        PaywallOptions build = new PaywallOptions.Builder((ho.a) L3).setOffering(revenueCatPaywallState.getOffering()).setListener(new RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2(lVar5)).build();
                        z10 = false;
                        PaywallKt.Paywall(build, qVar2, 0);
                        qVar2.p(false);
                    } else {
                        z10 = false;
                        qVar2.X(1341364730);
                        qVar2.p(false);
                    }
                    if (!n.m0(revenueCatPaywallState.getError())) {
                        qVar2.X(1341418112);
                        t d12 = p2.d(qVar3, 1.0f);
                        f1 d13 = r1.p.d(lVar9, z10);
                        int hashCode2 = Long.hashCode(qVar2.T);
                        c3.o l7 = qVar2.l();
                        t c10 = i3.a.c(d12, qVar2);
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(eVar3, d13, qVar2);
                        r.J(eVar4, l7, qVar2);
                        defpackage.f.u(hashCode2, qVar2, eVar5, qVar2, dVar);
                        r.J(eVar6, c10, qVar2);
                        ho.l lVar10 = lVar7;
                        t d14 = p2.d(qVar3, 1.0f);
                        lVar8 = lVar10;
                        String error = revenueCatPaywallState.getError();
                        if ((i12 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        Object L4 = qVar2.L();
                        if (z13 || L4 == eVar2) {
                            final int i19 = 2;
                            L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.b
                                @Override // ho.a
                                public final Object invoke() {
                                    z RevenueCatPaywallScreenUI$lambda$2$2$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$0$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$1$0$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$1$1$0;
                                    switch (i19) {
                                        case 0:
                                            RevenueCatPaywallScreenUI$lambda$2$2$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$2$0(lVar5);
                                            return RevenueCatPaywallScreenUI$lambda$2$2$0;
                                        case 1:
                                            RevenueCatPaywallScreenUI$lambda$2$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$0$0(lVar5);
                                            return RevenueCatPaywallScreenUI$lambda$2$0$0;
                                        case 2:
                                            RevenueCatPaywallScreenUI$lambda$2$1$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$0$0(lVar5);
                                            return RevenueCatPaywallScreenUI$lambda$2$1$0$0;
                                        default:
                                            RevenueCatPaywallScreenUI$lambda$2$1$1$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$1$0(lVar5);
                                            return RevenueCatPaywallScreenUI$lambda$2$1$1$0;
                                    }
                                }
                            };
                            qVar2.h0(L4);
                        }
                        eVar = eVar2;
                        r14 = 0;
                        ErrorScreenKt.m1837ErrorScreenuDo3WH8(d14, null, error, 0L, (ho.a) L4, qVar2, 6, 10);
                        if ((i12 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        Object L5 = qVar2.L();
                        if (z14 || L5 == eVar) {
                            final int i20 = 3;
                            L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.b
                                @Override // ho.a
                                public final Object invoke() {
                                    z RevenueCatPaywallScreenUI$lambda$2$2$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$0$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$1$0$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$1$1$0;
                                    switch (i20) {
                                        case 0:
                                            RevenueCatPaywallScreenUI$lambda$2$2$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$2$0(lVar8);
                                            return RevenueCatPaywallScreenUI$lambda$2$2$0;
                                        case 1:
                                            RevenueCatPaywallScreenUI$lambda$2$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$0$0(lVar8);
                                            return RevenueCatPaywallScreenUI$lambda$2$0$0;
                                        case 2:
                                            RevenueCatPaywallScreenUI$lambda$2$1$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$0$0(lVar8);
                                            return RevenueCatPaywallScreenUI$lambda$2$1$0$0;
                                        default:
                                            RevenueCatPaywallScreenUI$lambda$2$1$1$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$1$0(lVar8);
                                            return RevenueCatPaywallScreenUI$lambda$2$1$1$0;
                                    }
                                }
                            };
                            qVar2.h0(L5);
                        }
                        PaywallScreenNavigationBar((ho.a) L5, p2.e(qVar3, 1.0f), qVar2, 48, 0);
                        qVar2.p(true);
                        qVar2.p(false);
                    } else {
                        lVar8 = lVar7;
                        eVar = eVar2;
                        qVar2.X(1341842874);
                        qVar2.p(z10);
                        r14 = z10;
                    }
                    if (!revenueCatPaywallState.isLoading() && !revenueCatPaywallState.getPurchaseRefreshing()) {
                        z11 = r14;
                    } else {
                        z11 = true;
                    }
                    FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(z11, null, 0L, qVar2, 0, 6);
                    q qVar4 = qVar2;
                    if (revenueCatPaywallState.getPurchaseCompleted()) {
                        qVar4.X(1341955311);
                        if ((i12 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = r14;
                        }
                        Object L6 = qVar4.L();
                        if (z12 || L6 == eVar) {
                            final int i21 = 0;
                            L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.b
                                @Override // ho.a
                                public final Object invoke() {
                                    z RevenueCatPaywallScreenUI$lambda$2$2$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$0$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$1$0$0;
                                    z RevenueCatPaywallScreenUI$lambda$2$1$1$0;
                                    switch (i21) {
                                        case 0:
                                            RevenueCatPaywallScreenUI$lambda$2$2$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$2$0(lVar8);
                                            return RevenueCatPaywallScreenUI$lambda$2$2$0;
                                        case 1:
                                            RevenueCatPaywallScreenUI$lambda$2$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$0$0(lVar8);
                                            return RevenueCatPaywallScreenUI$lambda$2$0$0;
                                        case 2:
                                            RevenueCatPaywallScreenUI$lambda$2$1$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$0$0(lVar8);
                                            return RevenueCatPaywallScreenUI$lambda$2$1$0$0;
                                        default:
                                            RevenueCatPaywallScreenUI$lambda$2$1$1$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$1$0(lVar8);
                                            return RevenueCatPaywallScreenUI$lambda$2$1$1$0;
                                    }
                                }
                            };
                            qVar4.h0(L6);
                        }
                        SubscribeSuccessScreen((ho.a) L6, qVar4, r14);
                        qVar4.p(r14);
                    } else {
                        qVar4.X(1342058138);
                        qVar4.p(r14);
                    }
                    qVar4.p(true);
                    lVar6 = lVar8;
                    qVar = qVar4;
                } else {
                    qVar2.R();
                    lVar5 = lVar3;
                    lVar6 = lVar4;
                    qVar = qVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(revenueCatPaywallState, lVar5, lVar6, i10, i11, 18);
                    return;
                }
                return;
            }
            lVar4 = lVar2;
            if ((i12 & 147) != 146) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar3 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        lVar4 = lVar2;
        if ((i12 & 147) != 146) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z RevenueCatPaywallScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreenUI$lambda$1$0(boolean z6) {
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreenUI$lambda$2$0$0(ho.l lVar) {
        lVar.invoke(Boolean.FALSE);
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreenUI$lambda$2$1$0$0(ho.l lVar) {
        lVar.invoke(new g(1));
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreenUI$lambda$2$1$0$0$0(RevenueCatPaywallViewModel revenueCatPaywallViewModel) {
        revenueCatPaywallViewModel.getClass();
        revenueCatPaywallViewModel.loadOfferings();
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreenUI$lambda$2$1$1$0(ho.l lVar) {
        lVar.invoke(Boolean.FALSE);
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreenUI$lambda$2$2$0(ho.l lVar) {
        lVar.invoke(Boolean.TRUE);
        return z.f31622a;
    }

    public static final z RevenueCatPaywallScreenUI$lambda$3(RevenueCatPaywallState revenueCatPaywallState, ho.l lVar, ho.l lVar2, int i10, int i11, m mVar, int i12) {
        RevenueCatPaywallScreenUI(revenueCatPaywallState, lVar, lVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void SubscribeSuccessScreen(ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        float f10;
        float f11;
        float f12;
        int i12;
        ho.a aVar2 = aVar;
        q qVar = (q) mVar;
        qVar.Z(-1255819488);
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
            t d10 = p2.d(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            t h10 = l1.n.h(d10, echoTheme.getColors(qVar, i13).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d11 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, d11, qVar);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar);
            Object L = qVar.L();
            u2.e eVar5 = l.f33918a;
            if (L == eVar5) {
                L = r.A(Boolean.FALSE);
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            if (SubscribeSuccessScreen$lambda$0$1(z0Var)) {
                f10 = 1.0f;
            } else {
                f10 = u.P;
            }
            s2 b10 = j1.f.b(f10, null, null, qVar, 0, 30);
            Object L2 = qVar.L();
            if (L2 == eVar5) {
                L2 = new RevenueCatPaywallScreenKt$SubscribeSuccessScreen$1$1$1(z0Var, null);
                qVar.h0(L2);
            }
            r.f((p) L2, z.f31622a, qVar);
            r1.d.g(m3.h.h(p2.d(qVar2, 1.0f), kd.a.M(io.elevenlabs.readerapp.R.drawable.elevenreader_icon, qVar, 0), null, f4.q.f8840c, u.P, null, 54), qVar);
            t d12 = p2.d(qVar2, 1.0f);
            WeakHashMap weakHashMap = c3.f29142x;
            t F = r1.d.F(r1.d.P(d12, new o1(u0.e(qVar).f29154l, 32)), 20, 16);
            j jVar = i3.d.C0;
            r1.f fVar2 = r1.j.f29232e;
            x a10 = w.a(fVar2, jVar, qVar, 54);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(F, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            int i14 = i11;
            r.J(eVar, a10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f;
            }
            r1.d.g(new m1(f11, true), qVar);
            t e10 = p2.e(qVar2, 1.0f);
            float SubscribeSuccessScreen$lambda$0$3 = SubscribeSuccessScreen$lambda$0$3(b10);
            t a11 = m3.h.a(m3.h.j(e10, SubscribeSuccessScreen$lambda$0$3, SubscribeSuccessScreen$lambda$0$3), SubscribeSuccessScreen$lambda$0$3(b10));
            x a12 = w.a(fVar2, jVar, qVar, 54);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            t c11 = i3.a.c(a11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a12, qVar);
            r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c11, qVar);
            l1.n.c(kd.a.M(io.elevenlabs.readerapp.R.drawable.subscription_success, qVar, 0), null, r1.d.I(p2.t(qVar2, 200, 400), u.P, u.P, u.P, echoTheme.getSpacings(qVar, i13).getX10(), 7), null, f4.q.f8842e, u.P, null, qVar, u3.c.$stable | 24624, 104);
            t I = r1.d.I(qVar2, u.P, u.P, u.P, echoTheme.getSpacings(qVar, i13).getX4(), 7);
            f1 d13 = r1.p.d(i3.d.f12997a, false);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            t c12 = i3.a.c(I, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d13, qVar);
            r.J(eVar2, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c12, qVar);
            PlanBadgeKt.PlanBadge(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.plan_ultra), true, null, qVar, 48, 4);
            qVar.p(true);
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.subscription_purchased_title);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i13);
            int i15 = EchoThemeTypography.$stable;
            y0 xlRegular600 = typography.getXlRegular600(qVar, i15);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i13).getText();
            int i16 = EchoThemeColors.Text.$stable;
            j7.d(R, r1.d.I(qVar2, u.P, u.P, u.P, echoTheme.getSpacings(qVar, i13).getX4(), 7), text.getPrimary(qVar, i16), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, xlRegular600, qVar, 0, 0, 130040);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.subscription_purchased_subtitle), null, i.B(i13, i16, echoTheme, qVar, qVar), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i13).getBaseRegular500(qVar, i15), qVar, 0, 0, 130042);
            qVar.p(true);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f12 = Float.MAX_VALUE;
            } else {
                f12 = 1.0f;
            }
            r1.d.g(new m1(f12, true), qVar);
            aVar2 = aVar;
            FullWidthButtonKt.FullWidthButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.one_time_purchase_cta), aVar2, p2.e(qVar2, 1.0f), null, null, null, false, false, false, qVar, ((i14 << 3) & 112) | 384, 504);
            qVar = qVar;
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 11);
        }
    }

    private static final boolean SubscribeSuccessScreen$lambda$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void SubscribeSuccessScreen$lambda$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final float SubscribeSuccessScreen$lambda$0$3(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final z SubscribeSuccessScreen$lambda$1(ho.a aVar, int i10, m mVar, int i11) {
        SubscribeSuccessScreen(aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

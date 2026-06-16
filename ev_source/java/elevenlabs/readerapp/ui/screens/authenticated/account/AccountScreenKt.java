package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import a2.k3;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.AccountFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSectionDividerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSectionsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSignOutWarningDialogKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSummaryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.CustomerCenterSheetKt;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.ShadowKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.k5;
import r1.c3;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import sn.z;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001aO\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u000f\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u000f\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u0019\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u000f\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u000f\u0010 \u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010\u0019¨\u0006%²\u0006\u000e\u0010\"\u001a\u00020!8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountNavigator;", "navigator", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountViewModel;", "vm", "Lkotlin/Function1;", "", "Lsn/z;", "onCustomerCenterAction", "AccountScreen", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountNavigator;Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountViewModel;Lho/l;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "AccountScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountState;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountNavigator;Lu2/m;I)V", "", "isLoadingPasswordReset", "Lkotlin/Function0;", "onSignOut", "onResetPassword", "onNavigateDev", "onNavigateToDeleteAccount", "BottomActions", "(ZLho/a;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "Preview_AccountScreen", "(Lu2/m;I)V", "Preview_AccountScreen_Loading", "Preview_AccountScreen_Error", "Preview_AccountScreen_Credits_Free", "Preview_AccountScreen_Credits_Paid", "Preview_Credits_Update", "Preview_AccountScreen_Loading_PasswordReset", "Preview_AccountScreen_Loading_RestorePurchases", "", "hours", "plan", "isPaid", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountScreenKt {
    public static final void AccountScreen(AccountNavigator accountNavigator, AccountViewModel accountViewModel, ho.l lVar, u2.m mVar, int i10, int i11) {
        int i12;
        AccountViewModel accountViewModel2;
        ho.l lVar2;
        int i13;
        boolean z6;
        q7.c cVar;
        int i14;
        boolean h10;
        int i15;
        accountNavigator.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-623842168);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar.f(accountNavigator);
            } else {
                h10 = qVar.h(accountNavigator);
            }
            if (h10) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                accountViewModel2 = accountViewModel;
                if (qVar.h(accountViewModel2)) {
                    i14 = 32;
                    i12 |= i14;
                }
            } else {
                accountViewModel2 = accountViewModel;
            }
            i14 = 16;
            i12 |= i14;
        } else {
            accountViewModel2 = accountViewModel;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((i10 & 384) == 0) {
                if (qVar.h(lVar2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
        }
        boolean z10 = true;
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            int i17 = i10 & 1;
            u2.e eVar = u2.l.f33918a;
            if (i17 != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else {
                if ((i11 & 2) != 0) {
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        accountViewModel2 = (AccountViewModel) gg.b.j0(e0.f20562a.b(AccountViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -113;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                if (i16 != 0) {
                    Object L = qVar.L();
                    if (L == eVar) {
                        L = new j(21);
                        qVar.h0(L);
                    }
                    lVar2 = (ho.l) L;
                }
            }
            qVar.q();
            AccountState accountState = (AccountState) c1.m(accountViewModel2.getStateFlow(), qVar, 0).getValue();
            Boolean valueOf = Boolean.valueOf(accountState.getShowCustomerCenter());
            String pendingCustomerCenterAction = accountState.getPendingCustomerCenterAction();
            boolean h11 = qVar.h(accountState) | qVar.h(accountViewModel2);
            if ((i12 & 896) != 256) {
                z10 = false;
            }
            boolean z11 = h11 | z10;
            Object L2 = qVar.L();
            if (z11 || L2 == eVar) {
                L2 = new AccountScreenKt$AccountScreen$2$1(accountState, accountViewModel2, lVar2, null);
                qVar.h0(L2);
            }
            u2.r.g(valueOf, pendingCustomerCenterAction, (ho.p) L2, qVar);
            boolean h12 = qVar.h(accountViewModel2);
            Object L3 = qVar.L();
            if (h12 || L3 == eVar) {
                L3 = new f(accountViewModel2, 0);
                qVar.h0(L3);
            }
            AccountScreenUI(accountState, (ho.l) L3, accountNavigator, qVar, (i12 << 6) & 896);
        } else {
            qVar.R();
        }
        ho.l lVar3 = lVar2;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(accountNavigator, accountViewModel2, lVar3, i10, i11, 21, false);
        }
    }

    public static final z AccountScreen$lambda$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z AccountScreen$lambda$2$0(AccountViewModel accountViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(accountViewModel);
        return z.f31622a;
    }

    public static final z AccountScreen$lambda$3(AccountNavigator accountNavigator, AccountViewModel accountViewModel, ho.l lVar, int i10, int i11, u2.m mVar, int i12) {
        AccountScreen(accountNavigator, accountViewModel, lVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void AccountScreenUI(AccountState accountState, ho.l lVar, AccountNavigator accountNavigator, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        boolean h10;
        int i12;
        int i13;
        int i14;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(460143099);
        if ((i10 & 6) == 0) {
            if (qVar2.h(accountState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                h10 = qVar2.f(accountNavigator);
            } else {
                h10 = qVar2.h(accountNavigator);
            }
            if (h10) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            qVar = qVar2;
            k5.a(null, null, null, null, null, 0, 0L, 0L, null, c3.k.d(1334331338, true, new b(accountState, lVar, accountNavigator), qVar2), qVar, 805306368, 511);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 12, lVar, (Object) accountState, (Object) accountNavigator);
        }
    }

    public static final z AccountScreenUI$lambda$0(AccountState accountState, ho.l lVar, final AccountNavigator accountNavigator, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        AccountState accountState2;
        ho.l lVar2;
        boolean z10;
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
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t o6 = r1.d.o(r1.d.D(l1.n.h(p2.d(qVar2, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b), z1Var), z1Var);
            i3.l lVar3 = i3.d.f12998b;
            f1 d10 = r1.p.d(lVar3, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(o6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.t d11 = p2.d(qVar2, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(d11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            final int i13 = 0;
            final int i14 = 1;
            HeaderActionsKt.EchoThemeHeaderActions(null, kj.c.R(qVar, R.string.account_header_title), c3.k.d(-141403253, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.a
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z AccountScreenUI$lambda$0$0$0$0;
                    z AccountScreenUI$lambda$0$0$0$1;
                    int i15 = i13;
                    l2 l2Var = (l2) obj;
                    u2.m mVar2 = (u2.m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i15) {
                        case 0:
                            AccountScreenUI$lambda$0$0$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$0$0$0(accountNavigator, l2Var, mVar2, intValue);
                            return AccountScreenUI$lambda$0$0$0$0;
                        default:
                            AccountScreenUI$lambda$0$0$0$1 = AccountScreenKt.AccountScreenUI$lambda$0$0$0$1(accountNavigator, l2Var, mVar2, intValue);
                            return AccountScreenUI$lambda$0$0$0$1;
                    }
                }
            }, qVar), c3.k.d(-1474202454, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.a
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z AccountScreenUI$lambda$0$0$0$0;
                    z AccountScreenUI$lambda$0$0$0$1;
                    int i15 = i14;
                    l2 l2Var = (l2) obj;
                    u2.m mVar2 = (u2.m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i15) {
                        case 0:
                            AccountScreenUI$lambda$0$0$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$0$0$0(accountNavigator, l2Var, mVar2, intValue);
                            return AccountScreenUI$lambda$0$0$0$0;
                        default:
                            AccountScreenUI$lambda$0$0$0$1 = AccountScreenKt.AccountScreenUI$lambda$0$0$0$1(accountNavigator, l2Var, mVar2, intValue);
                            return AccountScreenUI$lambda$0$0$0$1;
                    }
                }
            }, qVar), qVar, 3456, 1);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t e10 = p2.e(new m1(1.0f, true), 1.0f);
            f1 d12 = r1.p.d(lVar3, false);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(e10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d12, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            if (!accountState.isLoading()) {
                qVar.X(33055369);
                accountState2 = accountState;
                lVar2 = lVar;
                ShadowKt.m1876BottomShadowOverlayPZHvWI(p2.d(qVar2, 1.0f), ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), 0L, c3.k.d(-542185555, true, new b(accountState2, accountNavigator, lVar2), qVar), qVar, 3078, 4);
                qVar = qVar;
                qVar.p(false);
            } else {
                accountState2 = accountState;
                lVar2 = lVar;
                qVar.X(36146906);
                qVar.p(false);
            }
            if (!accountState2.isLoadingPasswordReset() && !accountState2.isLoading()) {
                z10 = false;
            } else {
                z10 = true;
            }
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(z10, null, 0L, qVar, 0, 6);
            qVar.p(true);
            qVar.p(true);
            boolean showCustomerCenter = accountState2.getShowCustomerCenter();
            u2.e eVar5 = u2.l.f33918a;
            if (showCustomerCenter) {
                qVar.X(705949712);
                boolean f10 = qVar.f(lVar2);
                Object L = qVar.L();
                if (f10 || L == eVar5) {
                    L = new c(lVar2, 0);
                    qVar.h0(L);
                }
                CustomerCenterSheetKt.CustomerCenterSheet((ho.a) L, qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(706086174);
                qVar.p(false);
            }
            qVar.p(true);
            if (accountState2.getShowSignOutConfirmDialog()) {
                qVar.X(1147426122);
                boolean f11 = qVar.f(lVar2);
                Object L2 = qVar.L();
                if (f11 || L2 == eVar5) {
                    L2 = new c(lVar2, 1);
                    qVar.h0(L2);
                }
                ho.a aVar = (ho.a) L2;
                boolean f12 = qVar.f(lVar2);
                Object L3 = qVar.L();
                if (f12 || L3 == eVar5) {
                    L3 = new c(lVar2, 2);
                    qVar.h0(L3);
                }
                AccountSignOutWarningDialogKt.AccountSignOutWarningGenericDialog(aVar, (ho.a) L3, qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(1147624088);
                qVar.p(false);
            }
            if (accountState2.getShowSignOutWarningSheet()) {
                qVar.X(1147675362);
                boolean f13 = qVar.f(lVar2);
                Object L4 = qVar.L();
                if (f13 || L4 == eVar5) {
                    L4 = new c(lVar2, 3);
                    qVar.h0(L4);
                }
                ho.a aVar2 = (ho.a) L4;
                boolean f14 = qVar.f(lVar2);
                Object L5 = qVar.L();
                if (f14 || L5 == eVar5) {
                    L5 = new c(lVar2, 4);
                    qVar.h0(L5);
                }
                AccountSignOutWarningDialogKt.AccountSignOutWarningDownloadedReadsDialog(aVar2, (ho.a) L5, qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(1147881016);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$0(AccountNavigator accountNavigator, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(accountNavigator);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new AccountScreenKt$AccountScreenUI$1$1$1$1$1$1(accountNavigator);
                qVar.h0(L);
            }
            BackButtonKt.EchoThemeBackButton((ho.a) L, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$1(AccountNavigator accountNavigator, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = io.elevenlabs.ui.R.drawable.gift;
            String R = kj.c.R(qVar, R.string.referal_sheet_title);
            boolean h10 = qVar.h(accountNavigator);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new e(accountNavigator, 8);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, ButtonIconVariant.Menu, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$1$0$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToFriendReferral();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0(AccountState accountState, AccountNavigator accountNavigator, ho.l lVar, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        AccountPage.Section.Credits credits;
        AccountPage.Section.CreditsUnlimited creditsUnlimited;
        u2.e eVar;
        List<AccountPage.Section> sections;
        List<AccountPage.Section> sections2;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t y10 = l1.n.y(p2.d(qVar2, 1.0f), l1.n.x(qVar), true, true);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(y10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            User user = accountState.getUser();
            AccountPage page = accountState.getPage();
            List<AccountPage.Section> list = null;
            if (page != null && (sections2 = page.getSections()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : sections2) {
                    if (obj instanceof AccountPage.Section.Credits) {
                        arrayList.add(obj);
                    }
                }
                credits = (AccountPage.Section.Credits) tn.o.y0(arrayList);
            } else {
                credits = null;
            }
            AccountPage page2 = accountState.getPage();
            if (page2 != null && (sections = page2.getSections()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : sections) {
                    if (obj2 instanceof AccountPage.Section.CreditsUnlimited) {
                        arrayList2.add(obj2);
                    }
                }
                creditsUnlimited = (AccountPage.Section.CreditsUnlimited) tn.o.y0(arrayList2);
            } else {
                creditsUnlimited = null;
            }
            boolean h10 = qVar.h(accountNavigator);
            Object L = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (h10 || L == eVar2) {
                L = new e(accountNavigator, 0);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            boolean h11 = qVar.h(accountNavigator);
            Object L2 = qVar.L();
            if (h11 || L2 == eVar2) {
                L2 = new e(accountNavigator, 2);
                qVar.h0(L2);
            }
            AccountSummaryKt.AccountSummary(user, credits, creditsUnlimited, aVar, (ho.a) L2, qVar, 0);
            AccountPage page3 = accountState.getPage();
            if (page3 != null) {
                list = page3.getSections();
            }
            List<AccountPage.Section> list2 = list;
            if (!wq.n.m0(accountState.getError())) {
                qVar.X(910350806);
                r1.d.g(p2.f(qVar2, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX6()), qVar);
                eVar = eVar2;
                ErrorScreenKt.m1836ErrorScreenV9fs2A(p2.e(qVar2, 1.0f), null, accountState.getError(), null, null, 0L, qVar, 6, 58);
                qVar = qVar;
                qVar.p(false);
            } else {
                eVar = eVar2;
                qVar.X(910678507);
                qVar.p(false);
            }
            if (list2 == null) {
                list2 = tn.t.f33547a;
            }
            List<AccountPage.Section> list3 = list2;
            boolean h12 = qVar.h(accountNavigator);
            Object L3 = qVar.L();
            if (h12 || L3 == eVar) {
                L3 = new e(accountNavigator, 3);
                qVar.h0(L3);
            }
            ho.a aVar2 = (ho.a) L3;
            boolean h13 = qVar.h(accountNavigator);
            Object L4 = qVar.L();
            if (h13 || L4 == eVar) {
                L4 = new e(accountNavigator, 4);
                qVar.h0(L4);
            }
            ho.a aVar3 = (ho.a) L4;
            boolean h14 = qVar.h(accountNavigator);
            Object L5 = qVar.L();
            if (h14 || L5 == eVar) {
                L5 = new e(accountNavigator, 5);
                qVar.h0(L5);
            }
            ho.a aVar4 = (ho.a) L5;
            boolean f10 = qVar.f(lVar);
            Object L6 = qVar.L();
            if (f10 || L6 == eVar) {
                L6 = new c(lVar, 5);
                qVar.h0(L6);
            }
            ho.a aVar5 = (ho.a) L6;
            boolean h15 = qVar.h(accountNavigator);
            Object L7 = qVar.L();
            if (h15 || L7 == eVar) {
                L7 = new e(accountNavigator, 6);
                qVar.h0(L7);
            }
            ho.a aVar6 = (ho.a) L7;
            u2.q qVar3 = qVar;
            AccountSectionsKt.AccountSections(list3, aVar2, aVar3, aVar4, aVar5, aVar6, qVar3, 0);
            boolean isLoadingPasswordReset = accountState.isLoadingPasswordReset();
            boolean f11 = qVar3.f(lVar);
            Object L8 = qVar3.L();
            if (f11 || L8 == eVar) {
                L8 = new c(lVar, 6);
                qVar3.h0(L8);
            }
            ho.a aVar7 = (ho.a) L8;
            boolean f12 = qVar3.f(lVar);
            Object L9 = qVar3.L();
            if (f12 || L9 == eVar) {
                L9 = new c(lVar, 7);
                qVar3.h0(L9);
            }
            ho.a aVar8 = (ho.a) L9;
            boolean h16 = qVar3.h(accountNavigator);
            Object L10 = qVar3.L();
            if (h16 || L10 == eVar) {
                L10 = new e(accountNavigator, 7);
                qVar3.h0(L10);
            }
            ho.a aVar9 = (ho.a) L10;
            boolean h17 = qVar3.h(accountNavigator);
            Object L11 = qVar3.L();
            if (h17 || L11 == eVar) {
                L11 = new e(accountNavigator, 1);
                qVar3.h0(L11);
            }
            BottomActions(isLoadingPasswordReset, aVar7, aVar8, aVar9, (ho.a) L11, qVar3, 0);
            ib.i.C(ElevenLabsTheme.INSTANCE, qVar3, ElevenLabsTheme.$stable, qVar2, qVar3);
            qVar3.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$0$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToGetMoreCredits();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$1$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToPaywall();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$10$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToDeleteAccount();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$2$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToFriendReferral();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$3$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToContentPreferences();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$4$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToLicences();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$5$0(ho.l lVar) {
        lVar.invoke(new j(19));
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$5$0$0(AccountViewModel accountViewModel) {
        accountViewModel.getClass();
        accountViewModel.showCustomerCenter();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$6$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToHoursHistory();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$7$0(ho.l lVar) {
        lVar.invoke(new j(14));
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$7$0$0(AccountViewModel accountViewModel) {
        accountViewModel.getClass();
        accountViewModel.startSignOutFlow();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$8$0(ho.l lVar) {
        lVar.invoke(new j(20));
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$8$0$0(AccountViewModel accountViewModel) {
        accountViewModel.getClass();
        accountViewModel.resetPassword();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$0$2$0$0$9$0(AccountNavigator accountNavigator) {
        accountNavigator.navigateToDev();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$1$0(ho.l lVar) {
        lVar.invoke(new j(6));
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$0$1$0$0(AccountViewModel accountViewModel) {
        accountViewModel.getClass();
        accountViewModel.dismissCustomerCenter();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$1$0(ho.l lVar) {
        lVar.invoke(new j(17));
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$1$0$0(AccountViewModel accountViewModel) {
        accountViewModel.getClass();
        accountViewModel.dismissSignOutConfirmation();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$2$0(ho.l lVar) {
        lVar.invoke(new j(16));
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$2$0$0(AccountViewModel accountViewModel) {
        accountViewModel.getClass();
        accountViewModel.confirmSignOut();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$3$0(ho.l lVar) {
        lVar.invoke(new j(22));
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$3$0$0(AccountViewModel accountViewModel) {
        accountViewModel.getClass();
        accountViewModel.dismissSignOutConfirmation();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$4$0(ho.l lVar) {
        lVar.invoke(new j(15));
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$0$4$0$0(AccountViewModel accountViewModel) {
        accountViewModel.getClass();
        accountViewModel.confirmSignOut();
        return z.f31622a;
    }

    public static final z AccountScreenUI$lambda$1(AccountState accountState, ho.l lVar, AccountNavigator accountNavigator, int i10, u2.m mVar, int i11) {
        AccountScreenUI(accountState, lVar, accountNavigator, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void BottomActions(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, u2.m mVar, int i10) {
        int i11;
        ho.a aVar5;
        ho.a aVar6;
        ho.a aVar7;
        boolean z10;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1067257779);
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
            aVar5 = aVar;
            if (qVar2.h(aVar5)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        } else {
            aVar5 = aVar;
        }
        if ((i10 & 384) == 0) {
            aVar6 = aVar2;
            if (qVar2.h(aVar6)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        } else {
            aVar6 = aVar2;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar3)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            aVar7 = aVar4;
            if (qVar2.h(aVar7)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        } else {
            aVar7 = aVar4;
        }
        if ((i11 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar2.O(i11 & 1, z10)) {
            AccountSectionDividerKt.AccountSectionDivider(kj.c.R(qVar2, R.string.settings_label_danger_zone), qVar2, 0, 0);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i17 = EchoTheme.$stable;
            i3.q qVar3 = i3.q.f13017a;
            ib.i.o(echoTheme, qVar2, i17, qVar3, qVar2);
            i3.t e10 = p2.e(qVar3, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i18 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(e10, elevenLabsTheme.getSpacings(qVar2, i18).m2357getX5D9Ej5fM(), t2.u.P, 2);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(G, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            i3.t e11 = p2.e(qVar3, 1.0f);
            String R = kj.c.R(qVar2, R.string.settings_delete_account);
            FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Text;
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            boolean z11 = !z6;
            FullWidthButtonKt.EchoThemeFullWidthButton(R, aVar7, e11, fullWidthButtonSize, fullWidthButtonVariant, null, false, z11, false, qVar2, ((i11 >> 9) & 112) | 28032, 352);
            ib.i.p(elevenLabsTheme, qVar2, i18, qVar3, qVar2);
            FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar2, R.string.settings_reset_password), aVar6, p2.e(qVar3, 1.0f), fullWidthButtonSize, fullWidthButtonVariant, null, false, z11, false, qVar2, ((i11 >> 3) & 112) | 28032, 352);
            ib.i.p(elevenLabsTheme, qVar2, i18, qVar3, qVar2);
            FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar2, R.string.settings_sign_out), aVar5, p2.e(qVar3, 1.0f), fullWidthButtonSize, FullWidthButtonVariant.Primary, null, false, z11, false, qVar2, (i11 & 112) | 28032, 352);
            qVar = qVar2;
            qVar.X(1529971929);
            qVar.p(false);
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(u0.e(qVar).f29154l), qVar);
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(z6, aVar, aVar2, aVar3, aVar4, i10, 0);
        }
    }

    public static final z BottomActions$lambda$1(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, int i10, u2.m mVar, int i11) {
        BottomActions(z6, aVar, aVar2, aVar3, aVar4, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountScreen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(232833075);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AccountState accountState = new AccountState(new User("abc", "john.doe@elevenlabs.io", null, "John Doe"), false, null, null, false, null, false, false, false, false, null, 2046, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new j(10);
                qVar.h0(L);
            }
            AccountScreenUI(accountState, (ho.l) L, AccountFactoryKt.stubAccountNavigator(), qVar, 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 6);
        }
    }

    public static final z Preview_AccountScreen$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_AccountScreen$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AccountScreen(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountScreen_Credits_Free(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-718810869);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AccountState accountState = new AccountState(new User("abc", "john.doe@elevenlabs.io", null, "John Doe"), false, null, AccountFactoryKt.stubAccountPageFree(), false, null, false, false, false, false, null, 2022, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new j(8);
                qVar.h0(L);
            }
            AccountScreenUI(accountState, (ho.l) L, AccountFactoryKt.stubAccountNavigator(), qVar, 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 3);
        }
    }

    public static final z Preview_AccountScreen_Credits_Free$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_AccountScreen_Credits_Free$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AccountScreen_Credits_Free(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountScreen_Credits_Paid(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1123864405);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AccountState accountState = new AccountState(new User("abc", "john.doe@elevenlabs.io", null, "John Doe"), false, null, AccountFactoryKt.stubAccountPagePaid(), false, null, false, false, false, false, null, 2022, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new j(12);
                qVar.h0(L);
            }
            AccountScreenUI(accountState, (ho.l) L, AccountFactoryKt.stubAccountNavigator(), qVar, 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 7);
        }
    }

    public static final z Preview_AccountScreen_Credits_Paid$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_AccountScreen_Credits_Paid$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AccountScreen_Credits_Paid(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(945316458);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AccountState accountState = new AccountState(new User("abc", "john.doe@elevenlabs.io", null, "John Doe"), false, null, null, false, "Some error", false, false, false, false, null, 1998, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new j(7);
                qVar.h0(L);
            }
            AccountScreenUI(accountState, (ho.l) L, AccountFactoryKt.stubAccountNavigator(), qVar, 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 2);
        }
    }

    public static final z Preview_AccountScreen_Error$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_AccountScreen_Error$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AccountScreen_Error(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-643883274);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AccountState accountState = new AccountState(new User("abc", "john.doe@elevenlabs.io", null, "John Doe"), false, null, null, true, null, false, false, false, false, null, 2030, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new j(11);
                qVar.h0(L);
            }
            AccountScreenUI(accountState, (ho.l) L, AccountFactoryKt.stubAccountNavigator(), qVar, 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 5);
        }
    }

    public static final z Preview_AccountScreen_Loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_AccountScreen_Loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AccountScreen_Loading(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountScreen_Loading_PasswordReset(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(510819585);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AccountState accountState = new AccountState(new User("abc", "john.doe@elevenlabs.io", null, "John Doe"), true, null, null, false, null, false, false, false, false, null, 2028, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new j(9);
                qVar.h0(L);
            }
            AccountScreenUI(accountState, (ho.l) L, AccountFactoryKt.stubAccountNavigator(), qVar, 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 4);
        }
    }

    public static final z Preview_AccountScreen_Loading_PasswordReset$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_AccountScreen_Loading_PasswordReset$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AccountScreen_Loading_PasswordReset(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountScreen_Loading_RestorePurchases(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(590907381);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AccountState accountState = new AccountState(new User("abc", "john.doe@elevenlabs.io", null, "John Doe"), false, null, null, false, null, false, false, false, false, null, 2030, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new j(13);
                qVar.h0(L);
            }
            AccountScreenUI(accountState, (ho.l) L, AccountFactoryKt.stubAccountNavigator(), qVar, 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 8);
        }
    }

    public static final z Preview_AccountScreen_Loading_RestorePurchases$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_AccountScreen_Loading_RestorePurchases$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AccountScreen_Loading_RestorePurchases(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_Credits_Update(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-974824972);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = com.google.android.gms.internal.play_billing.b.t(400, qVar);
            }
            x0 x0Var = (x0) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = u2.r.A("free");
                qVar.h0(L2);
            }
            z0 z0Var = (z0) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = u2.r.A(Boolean.FALSE);
                qVar.h0(L3);
            }
            z0 z0Var2 = (z0) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new AccountScreenKt$Preview_Credits_Update$1$1(x0Var, z0Var, z0Var2, null);
                qVar.h0(L4);
            }
            u2.r.f((ho.p) L4, z.f31622a, qVar);
            AccountState accountState = new AccountState(new User("abc", "john.doe@elevenlabs.io", null, "John Doe"), false, null, new AccountPage(ig.f.I(AccountPage.Section.Credits.copy$default(AccountFactoryKt.stubCreditsSection(), Preview_Credits_Update$lambda$4(z0Var), Preview_Credits_Update$lambda$7(z0Var2), false, String.valueOf(Preview_Credits_Update$lambda$1(x0Var)), null, null, 0, 116, null), AccountFactoryKt.stubHelpfulResources())), false, null, false, false, false, false, null, 2022, null);
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new j(18);
                qVar.h0(L5);
            }
            AccountScreenUI(accountState, (ho.l) L5, AccountFactoryKt.stubAccountNavigator(), qVar, 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 9);
        }
    }

    private static final int Preview_Credits_Update$lambda$1(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    public static final z Preview_Credits_Update$lambda$10$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_Credits_Update$lambda$11(int i10, u2.m mVar, int i11) {
        Preview_Credits_Update(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_Credits_Update$lambda$2(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final String Preview_Credits_Update$lambda$4(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final boolean Preview_Credits_Update$lambda$7(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void Preview_Credits_Update$lambda$8(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }
}

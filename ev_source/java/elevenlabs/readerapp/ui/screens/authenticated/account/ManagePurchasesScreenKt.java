package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import a2.n2;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import i4.j1;
import i4.q2;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.ActionRowItemKt;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.ShadowKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.k5;
import r1.l2;
import r1.p2;
import r1.z1;
import rd.c1;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aC\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "onNavigateToHoursHistory", "onNavigateToBookPurchases", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManagePurchasesViewModel;", "vm", "ManagePurchasesScreen", "(Lho/a;Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManagePurchasesViewModel;Lu2/m;II)V", "", "isLoadingRestorePurchases", "onRestorePurchases", "ManagePurchasesScreenUI", "(ZLho/a;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "Preview_ManagePurchasesScreen", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ManagePurchasesScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if ((r19 & 8) != 0) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagePurchasesScreen(ho.a aVar, ho.a aVar2, ho.a aVar3, ManagePurchasesViewModel managePurchasesViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ManagePurchasesViewModel managePurchasesViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(221684303);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar3)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                managePurchasesViewModel2 = managePurchasesViewModel;
                if (qVar.h(managePurchasesViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                managePurchasesViewModel2 = managePurchasesViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            managePurchasesViewModel2 = managePurchasesViewModel;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 8) != 0) {
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        managePurchasesViewModel2 = (ManagePurchasesViewModel) gg.b.j0(e0.f20562a.b(ManagePurchasesViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                boolean isLoadingRestorePurchases = ((ManagePurchasesState) c1.m(managePurchasesViewModel2.getStateFlow(), qVar, 0).getValue()).isLoadingRestorePurchases();
                boolean h10 = qVar.h(managePurchasesViewModel2);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new w(managePurchasesViewModel2, 0);
                    qVar.h0(L);
                }
                ManagePurchasesScreenUI(isLoadingRestorePurchases, (ho.a) L, aVar, aVar2, aVar3, qVar, (i12 << 6) & 65408);
            }
        } else {
            qVar.R();
        }
        ManagePurchasesViewModel managePurchasesViewModel3 = managePurchasesViewModel2;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l(aVar, aVar2, aVar3, managePurchasesViewModel3, i10, i11);
        }
    }

    public static final z ManagePurchasesScreen$lambda$0$0(ManagePurchasesViewModel managePurchasesViewModel) {
        managePurchasesViewModel.restorePurchases();
        return z.f31622a;
    }

    public static final z ManagePurchasesScreen$lambda$1(ho.a aVar, ho.a aVar2, ho.a aVar3, ManagePurchasesViewModel managePurchasesViewModel, int i10, int i11, u2.m mVar, int i12) {
        ManagePurchasesScreen(aVar, aVar2, aVar3, managePurchasesViewModel, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void ManagePurchasesScreenUI(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(316639022);
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
            if (qVar2.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
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
            if (qVar2.h(aVar4)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar2.O(i11 & 1, z10)) {
            qVar = qVar2;
            k5.a(null, null, null, null, null, 0, 0L, 0L, null, c3.k.d(-1125001219, true, new x(aVar2, z6, (q2) qVar2.j(j1.f13138r), aVar3, aVar, aVar4), qVar2), qVar, 805306368, 511);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(z6, aVar, aVar2, aVar3, aVar4, i10, 1);
        }
    }

    public static final z ManagePurchasesScreenUI$lambda$0(ho.a aVar, boolean z6, q2 q2Var, ho.a aVar2, ho.a aVar3, ho.a aVar4, z1 z1Var, u2.m mVar, int i10) {
        int i11;
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
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t o6 = r1.d.o(r1.d.D(l1.n.h(p2.d(qVar2, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b), z1Var), z1Var);
            i3.l lVar = i3.d.f12998b;
            f1 d10 = r1.p.d(lVar, false);
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
            HeaderActionsKt.EchoThemeHeaderActions(null, kj.c.R(qVar, R.string.account_manage_purchases), c3.k.d(-1524827970, true, new p(2, aVar), qVar), null, qVar, 384, 9);
            i3.t d12 = p2.d(qVar2, 1.0f);
            f1 d13 = r1.p.d(lVar, false);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(d12, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d13, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            ShadowKt.m1876BottomShadowOverlayPZHvWI(p2.d(qVar2, 1.0f), ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), 0L, c3.k.d(234582363, true, new n2(q2Var, aVar2, aVar3, aVar4, 3), qVar), qVar, 3078, 4);
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(z6, null, 0L, qVar, 0, 6);
            p.n.t(qVar, true, true, true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ManagePurchasesScreenUI$lambda$0$0$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.EchoThemeBackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ManagePurchasesScreenUI$lambda$0$0$0$1$0(q2 q2Var, ho.a aVar, ho.a aVar2, ho.a aVar3, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
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
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t G = r1.d.G(y10, t2.u.P, echoTheme.getSpacings(qVar, i11).getX2(), 1);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
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
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            int i12 = io.elevenlabs.ui.R.drawable.user_checked_filled;
            String R = kj.c.R(qVar, R.string.account_settings_manage_subscription_play_store);
            Integer valueOf = Integer.valueOf(i12);
            boolean h10 = qVar.h(q2Var);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new w(q2Var, 1);
                qVar.h0(L);
            }
            ActionRowItemKt.ActionRowItem(R, null, valueOf, null, (ho.a) L, qVar, 0, 10);
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_settings_listening_hours_history), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.user_headphones_filled), null, aVar, qVar, 0, 10);
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_restore_purchases), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.reload), null, aVar2, qVar, 0, 10);
            ib.i.o(echoTheme, qVar, i11, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_settings_view_purchase_history), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.history_alt), null, aVar3, qVar, 0, 10);
            ib.i.C(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable, qVar2, qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ManagePurchasesScreenUI$lambda$0$0$0$1$0$0$0$0(q2 q2Var) {
        q2Var.openUri("https://play.google.com/store/account/subscriptions");
        return z.f31622a;
    }

    public static final z ManagePurchasesScreenUI$lambda$1(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, int i10, u2.m mVar, int i11) {
        ManagePurchasesScreenUI(z6, aVar, aVar2, aVar3, aVar4, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ManagePurchasesScreen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1732516659);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ManagePurchasesScreenKt.INSTANCE.m1221getLambda$576182259$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 14);
        }
    }

    public static final z Preview_ManagePurchasesScreen$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ManagePurchasesScreen(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final /* synthetic */ void access$ManagePurchasesScreenUI(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, u2.m mVar, int i10) {
        ManagePurchasesScreenUI(z6, aVar, aVar2, aVar3, aVar4, mVar, i10);
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.p2;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2 \b\u0002\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0015²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"", "readId", "Lkotlin/Function1;", "", "Lsn/z;", "onClose", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/RateTitleViewModel;", "vm", "RateTitleSheet", "(Ljava/lang/String;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/RateTitleViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/RateTitleState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "RateTitleSheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/RateTitleState;Lho/l;Lu2/m;II)V", "Preview_RateTitleSheet_Idle", "(Lu2/m;I)V", "Preview_RateTitleSheet_Rated", "Preview_RateTitleSheet_Loading", "", MetaStatKeys.KEY_RATING, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RateTitleSheetKt {
    public static final void Preview_RateTitleSheet_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2027064286);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            RateTitleSheetUI(new RateTitleState(null, null, false, false, 15, null), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 3);
        }
    }

    public static final sn.z Preview_RateTitleSheet_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_RateTitleSheet_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_RateTitleSheet_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1464698496);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            RateTitleSheetUI(new RateTitleState("abc", 3L, true, false, 8, null), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 4);
        }
    }

    public static final sn.z Preview_RateTitleSheet_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_RateTitleSheet_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_RateTitleSheet_Rated(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-820804600);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            RateTitleSheetUI(new RateTitleState("abc", 3L, false, false, 12, null), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 2);
        }
    }

    public static final sn.z Preview_RateTitleSheet_Rated$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_RateTitleSheet_Rated(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if ((r21 & 4) != 0) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RateTitleSheet(String str, ho.l lVar, RateTitleViewModel rateTitleViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        RateTitleViewModel rateTitleViewModel2;
        boolean z6;
        RateTitleViewModel rateTitleViewModel3;
        q7.c cVar;
        boolean z10;
        int i13;
        int i14;
        int i15;
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1134053080);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                rateTitleViewModel2 = rateTitleViewModel;
                if (qVar.h(rateTitleViewModel2)) {
                    i13 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i13;
                }
            } else {
                rateTitleViewModel2 = rateTitleViewModel;
            }
            i13 = 128;
            i12 |= i13;
        } else {
            rateTitleViewModel2 = rateTitleViewModel;
        }
        boolean z11 = false;
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 4) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        rateTitleViewModel2 = (RateTitleViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(RateTitleViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                final RateTitleViewModel rateTitleViewModel4 = rateTitleViewModel2;
                int i16 = i12;
                qVar.q();
                final RateTitleState rateTitleState = (RateTitleState) u2.r.o(rateTitleViewModel4.getStateFlow(), qVar, 0).getValue();
                boolean h10 = qVar.h(rateTitleViewModel4);
                if ((i16 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z10 | h10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z12 || L == eVar) {
                    L = new RateTitleSheetKt$RateTitleSheet$1$1(rateTitleViewModel4, str, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, str, qVar);
                String R = kj.c.R(qVar, R.string.rating_title);
                if ((i16 & 112) == 32) {
                    z11 = true;
                }
                boolean f10 = qVar.f(rateTitleState) | z11 | qVar.h(rateTitleViewModel4);
                Object L2 = qVar.L();
                if (f10 || L2 == eVar) {
                    L2 = new c3.b(lVar, rateTitleState, rateTitleViewModel4, 26);
                    qVar.h0(L2);
                }
                BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, (ho.a) L2, R, true, null, null, c3.k.d(501546981, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.n0
                    @Override // ho.r
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        sn.z RateTitleSheet$lambda$2;
                        int intValue = ((Integer) obj4).intValue();
                        RateTitleSheet$lambda$2 = RateTitleSheetKt.RateTitleSheet$lambda$2(RateTitleState.this, rateTitleViewModel4, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue);
                        return RateTitleSheet$lambda$2;
                    }
                }, qVar), qVar, 1575936, 49);
                qVar = qVar;
                rateTitleViewModel3 = rateTitleViewModel4;
            }
        } else {
            qVar.R();
            rateTitleViewModel3 = rateTitleViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(str, lVar, rateTitleViewModel3, i10, i11, 22);
        }
    }

    public static final sn.z RateTitleSheet$lambda$1$0(ho.l lVar, RateTitleState rateTitleState, RateTitleViewModel rateTitleViewModel) {
        lVar.invoke(Boolean.valueOf(rateTitleState.getClose()));
        rateTitleViewModel.onClosed();
        return sn.z.f31622a;
    }

    public static final sn.z RateTitleSheet$lambda$2(RateTitleState rateTitleState, RateTitleViewModel rateTitleViewModel, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        Boolean valueOf = Boolean.valueOf(rateTitleState.getClose());
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(rateTitleState) | qVar.h(bottomSheetControl);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            L = new RateTitleSheetKt$RateTitleSheet$3$1$1(rateTitleState, bottomSheetControl, null);
            qVar.h0(L);
        }
        u2.r.f((ho.p) L, valueOf, qVar);
        boolean h10 = qVar.h(rateTitleViewModel);
        Object L2 = qVar.L();
        if (h10 || L2 == eVar) {
            L2 = new u(rateTitleViewModel, 4);
            qVar.h0(L2);
        }
        RateTitleSheetUI(rateTitleState, (ho.l) L2, qVar, 0, 0);
        return sn.z.f31622a;
    }

    public static final sn.z RateTitleSheet$lambda$2$1$0(RateTitleViewModel rateTitleViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(rateTitleViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z RateTitleSheet$lambda$3(String str, ho.l lVar, RateTitleViewModel rateTitleViewModel, int i10, int i11, u2.m mVar, int i12) {
        RateTitleSheet(str, lVar, rateTitleViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RateTitleSheetUI(RateTitleState rateTitleState, ho.l lVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        boolean z6;
        ho.l lVar3;
        r1 r10;
        ho.l lVar4;
        String R;
        ho.l lVar5;
        int i15;
        rateTitleState.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(452069178);
        if ((i10 & 6) == 0) {
            if (qVar.f(rateTitleState)) {
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
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
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
                Object obj = u2.l.f33918a;
                if (i16 != 0) {
                    Object L = qVar.L();
                    if (L == obj) {
                        L = new e0(15);
                        qVar.h0(L);
                    }
                    lVar4 = (ho.l) L;
                } else {
                    lVar4 = lVar2;
                }
                boolean f10 = qVar.f(rateTitleState.getUserRating());
                Object L2 = qVar.L();
                if (f10 || L2 == obj) {
                    L2 = u2.r.A(rateTitleState.getUserRating());
                    qVar.h0(L2);
                }
                final z0 z0Var = (z0) L2;
                i3.q qVar2 = i3.q.f13017a;
                i3.t e10 = p2.e(qVar2, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                i3.t E = r1.d.E(e10, echoTheme.getSpacings(qVar, i17).getX5());
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
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
                r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i17).getX5()), qVar);
                i3.t e11 = p2.e(qVar2, 1.0f);
                k2 a11 = i2.a(r1.j.f29233f, i3.d.f13004y0, qVar, 6);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(e11, qVar);
                qVar.b0();
                ho.l lVar6 = lVar4;
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar, a11, qVar);
                u2.r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                u2.r.J(eVar4, c10, qVar);
                qVar.X(-1587136751);
                final long j4 = 1;
                while (j4 < 6) {
                    String valueOf2 = String.valueOf(j4);
                    boolean f11 = qVar.f(z0Var) | qVar.e(j4);
                    Object L3 = qVar.L();
                    if (f11 || L3 == obj) {
                        L3 = new b5.e(j4, z0Var);
                        qVar.h0(L3);
                    }
                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(valueOf2, (ho.a) L3, null, 0L, false, 0, null, false, null, c3.k.d(902048666, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.o0
                        @Override // ho.q
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            sn.z RateTitleSheetUI$lambda$4$0$1;
                            int intValue = ((Integer) obj4).intValue();
                            RateTitleSheetUI$lambda$4$0$1 = RateTitleSheetKt.RateTitleSheetUI$lambda$4$0$1(j4, z0Var, (r1.s) obj2, (u2.m) obj3, intValue);
                            return RateTitleSheetUI$lambda$4$0$1;
                        }
                    }, qVar), qVar, 805306368, 508);
                    j4++;
                    qVar2 = qVar2;
                    z0Var = z0Var;
                    obj = obj;
                }
                Object obj2 = obj;
                z0 z0Var2 = z0Var;
                i3.q qVar3 = qVar2;
                qVar.p(false);
                qVar.p(true);
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i18 = EchoTheme.$stable;
                ib.i.o(echoTheme2, qVar, i18, qVar3, qVar);
                if (rateTitleState.getUserRating() == null) {
                    qVar.X(1612129403);
                    R = kj.c.R(qVar, R.string.rating_tap_to_rate);
                    qVar.p(false);
                } else {
                    qVar.X(1612233408);
                    R = kj.c.R(qVar, R.string.rating_thanks);
                    qVar.p(false);
                }
                boolean z10 = false;
                j7.d(R, null, echoTheme2.getColors(qVar, i18).getText().getTertiary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar, i18).getXsRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131066);
                qVar = qVar;
                r1.d.g(p2.f(qVar3, echoTheme2.getSpacings(qVar, i18).getX10()), qVar);
                String R2 = kj.c.R(qVar, R.string.rating_submit);
                boolean isLoading = rateTitleState.isLoading();
                EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
                i3.t e12 = p2.e(qVar3, 1.0f);
                boolean f12 = qVar.f(z0Var2);
                if ((i14 & 112) == 32) {
                    z10 = true;
                }
                boolean z11 = f12 | z10;
                Object L4 = qVar.L();
                if (!z11 && L4 != obj2) {
                    lVar5 = lVar6;
                } else {
                    lVar5 = lVar6;
                    L4 = new x(lVar5, z0Var2, 1);
                    qVar.h0(L4);
                }
                EchoButtonKt.m1835EchoButton562pCRU(R2, (ho.a) L4, e12, null, echoButtonSize, null, false, true, null, isLoading, false, qVar, 12607872, 0, 1384);
                qVar.p(true);
                lVar3 = lVar5;
            } else {
                qVar.R();
                lVar3 = lVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.p((Object) rateTitleState, lVar3, i10, i11, 19);
                return;
            }
            return;
        }
        lVar2 = lVar;
        i14 = i12;
        if ((i14 & 19) == 18) {
        }
        if (!qVar.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z RateTitleSheetUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    private static final Long RateTitleSheetUI$lambda$2(z0 z0Var) {
        return (Long) z0Var.getValue();
    }

    public static final sn.z RateTitleSheetUI$lambda$4$0$0$0(long j4, z0 z0Var) {
        z0Var.setValue(Long.valueOf(j4));
        return sn.z.f31622a;
    }

    public static final sn.z RateTitleSheetUI$lambda$4$0$1(long j4, z0 z0Var, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        long j10;
        long tertiary;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            u3.c M = kd.a.M(io.elevenlabs.ui.R.drawable.star_big, qVar, 0);
            Long RateTitleSheetUI$lambda$2 = RateTitleSheetUI$lambda$2(z0Var);
            if (RateTitleSheetUI$lambda$2 != null) {
                j10 = RateTitleSheetUI$lambda$2.longValue();
            } else {
                j10 = 0;
            }
            if (j4 <= j10) {
                qVar.X(-678345357);
                tertiary = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getText().getPrimary(qVar, EchoThemeColors.Text.$stable);
                qVar.p(false);
            } else {
                qVar.X(-678255054);
                tertiary = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getText().getTertiary(qVar, EchoThemeColors.Text.$stable);
                qVar.p(false);
            }
            y2.a(M, null, null, tertiary, qVar, u3.c.$stable | 48, 4);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z RateTitleSheetUI$lambda$4$1$0(ho.l lVar, z0 z0Var) {
        Long RateTitleSheetUI$lambda$2 = RateTitleSheetUI$lambda$2(z0Var);
        if (RateTitleSheetUI$lambda$2 != null) {
            lVar.invoke(new u(RateTitleSheetUI$lambda$2, 3));
        }
        return sn.z.f31622a;
    }

    public static final sn.z RateTitleSheetUI$lambda$4$1$0$0(Long l4, RateTitleViewModel rateTitleViewModel) {
        rateTitleViewModel.getClass();
        rateTitleViewModel.submit(l4.longValue());
        return sn.z.f31622a;
    }

    public static final sn.z RateTitleSheetUI$lambda$5(RateTitleState rateTitleState, ho.l lVar, int i10, int i11, u2.m mVar, int i12) {
        RateTitleSheetUI(rateTitleState, lVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}

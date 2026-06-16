package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory;

import a2.n2;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.ActiveCreditPack;
import io.elevenlabs.domain.model.UsageSection;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.v;
import io.elevenlabs.readerapp.ui.formatter.DateFormatterKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.components.UsageCategoryCardKt;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.primitives.VerticalGradientKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.c3;
import r1.d2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.y;
import r1.z1;
import rd.c1;
import s4.y0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aY\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0017\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u000f\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001a\u001a\u000f\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001a\u001a\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0002¢\u0006\u0004\b \u0010!¨\u0006#²\u0006\u0010\u0010\"\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "onNavigateToGetMoreCredits", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/hourshistory/HoursHistoryViewModel;", "vm", "HoursHistoryScreen", "(Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/hourshistory/HoursHistoryViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/hourshistory/HoursHistoryState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "HoursHistoryScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/hourshistory/HoursHistoryState;Lho/a;Lho/a;Lho/l;Lu2/m;II)V", "onToggleExtraHours", "", "onInfoClick", "onRetry", "UsageSectionList", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/hourshistory/HoursHistoryState;Lho/a;Lho/l;Lho/a;Lu2/m;I)V", "", "Lio/elevenlabs/domain/model/ActiveCreditPack;", "packs", "ActiveCreditPackList", "(Ljava/util/List;Lu2/m;I)V", "Preview_HoursHistoryScreen_Loading", "(Lu2/m;I)V", "Preview_HoursHistoryScreen_Error", "Preview_HoursHistoryScreen_Loaded", "Preview_HoursHistoryScreen_ExtraHours_Expanded", "Preview_HoursHistoryScreen_ExtraHours_Disabled", "Lio/elevenlabs/domain/model/UsageSection;", "stubUsageSections", "()Ljava/util/List;", "tooltipText", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HoursHistoryScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final void ActiveCreditPackList(List<ActiveCreditPack> list, m mVar, int i10) {
        int i11;
        boolean z6;
        ?? r12;
        q qVar;
        int i12;
        q qVar2 = (q) mVar;
        qVar2.Z(-46171849);
        if ((i10 & 6) == 0) {
            if (qVar2.h(list)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        boolean z10 = false;
        boolean z11 = true;
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            float f10 = 1.0f;
            t e10 = p2.e(qVar3, 1.0f);
            u0 u0Var = j.f29228a;
            x a10 = w.a(ib.i.m(EchoTheme.INSTANCE, qVar2, EchoTheme.$stable), i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c5 = i3.a.c(e10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(h4.g.f11907f, a10, qVar2);
            r.J(h4.g.f11906e, l4, qVar2);
            r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar2);
            Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar2, c5, h4.g.f11905d, -1845556167, list);
            q qVar4 = qVar2;
            while (s10.hasNext()) {
                ActiveCreditPack activeCreditPack = (ActiveCreditPack) s10.next();
                t e11 = p2.e(qVar3, f10);
                k2 a11 = i2.a(j.f29228a, i3.d.f13005z0, qVar4, 48);
                int hashCode2 = Long.hashCode(qVar4.T);
                o l7 = qVar4.l();
                t c10 = i3.a.c(e11, qVar4);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar2);
                } else {
                    qVar4.k0();
                }
                r.J(h4.g.f11907f, a11, qVar4);
                r.J(h4.g.f11906e, l7, qVar4);
                r.y(qVar4, Integer.valueOf(hashCode2), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar4);
                r.J(h4.g.f11905d, c10, qVar4);
                String label = activeCreditPack.getLabel();
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i13 = EchoTheme.$stable;
                EchoThemeTypography typography = echoTheme.getTypography(qVar4, i13);
                int i14 = EchoThemeTypography.$stable;
                y0 xsRegular400 = typography.getXsRegular400(qVar4, i14);
                EchoThemeColors.Text text = echoTheme.getColors(qVar4, i13).getText();
                int i15 = EchoThemeColors.Text.$stable;
                long tertiary = text.getTertiary(qVar4, i15);
                i3.q qVar5 = qVar3;
                boolean z12 = z11;
                float f11 = f10;
                q qVar6 = qVar4;
                j7.d(label, null, tertiary, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, xsRegular400, qVar6, 0, 0, 131066);
                if (f11 <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                r1.d.g(new m1(f11, z12), qVar6);
                j7.d(kj.c.Q(R.string.usage_pack_expires_at, new Object[]{DateFormatterKt.formatDate(activeCreditPack.getExpiresAt(), qVar6, 0)}, qVar6), null, ib.i.B(i13, i15, echoTheme, qVar6, qVar6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar6, i13).getXsRegular400(qVar6, i14), qVar6, 0, 0, 131066);
                q qVar7 = qVar6;
                qVar7.p(z12);
                f10 = f11;
                z11 = z12;
                qVar3 = qVar5;
                z10 = false;
                qVar4 = qVar7;
            }
            boolean z13 = z11;
            qVar4.p(z10);
            qVar4.p(z13);
            r12 = z13;
            qVar = qVar4;
        } else {
            r12 = 1;
            qVar2.R();
            qVar = qVar2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new v(i10, r12, list);
        }
    }

    public static final z ActiveCreditPackList$lambda$1(List list, int i10, m mVar, int i11) {
        ActiveCreditPackList(list, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if ((r17 & 4) != 0) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HoursHistoryScreen(ho.a aVar, ho.a aVar2, HoursHistoryViewModel hoursHistoryViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        aVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1690922589);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0 && qVar.h(hoursHistoryViewModel)) {
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
                        hoursHistoryViewModel = (HoursHistoryViewModel) gg.b.j0(e0.f20562a.b(HoursHistoryViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                HoursHistoryState hoursHistoryState = (HoursHistoryState) r.o(hoursHistoryViewModel.getStateFlow(), qVar, 0).getValue();
                boolean h10 = qVar.h(hoursHistoryViewModel);
                Object L = qVar.L();
                if (h10 || L == l.f33918a) {
                    L = new g(hoursHistoryViewModel, 0);
                    qVar.h0(L);
                }
                HoursHistoryScreenUI(hoursHistoryState, aVar, aVar2, (ho.l) L, qVar, (i12 << 3) & 1008, 0);
                qVar = qVar;
            }
        } else {
            qVar.R();
        }
        HoursHistoryViewModel hoursHistoryViewModel2 = hoursHistoryViewModel;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(aVar, (Object) aVar2, (Object) hoursHistoryViewModel2, i10, i11, 17);
        }
    }

    public static final z HoursHistoryScreen$lambda$0$0(HoursHistoryViewModel hoursHistoryViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(hoursHistoryViewModel);
        return z.f31622a;
    }

    public static final z HoursHistoryScreen$lambda$1(ho.a aVar, ho.a aVar2, HoursHistoryViewModel hoursHistoryViewModel, int i10, int i11, m mVar, int i12) {
        HoursHistoryScreen(aVar, aVar2, hoursHistoryViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HoursHistoryScreenUI(HoursHistoryState hoursHistoryState, ho.a aVar, ho.a aVar2, ho.l lVar, m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        int i13;
        int i14;
        ho.a aVar4;
        int i15;
        int i16;
        ho.l lVar2;
        int i17;
        boolean z6;
        final ho.a aVar5;
        ho.a aVar6;
        ho.l lVar3;
        r1 r10;
        ho.a aVar7;
        int i18;
        q qVar = (q) mVar;
        qVar.Z(-200993199);
        if ((i10 & 6) == 0) {
            if (qVar.h(hoursHistoryState)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            aVar3 = aVar;
            if (qVar.h(aVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar4 = aVar2;
                if (qVar.h(aVar4)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    lVar2 = lVar;
                    if (qVar.h(lVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    if ((i12 & 1171) == 1170) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar.O(i12 & 1, z6)) {
                        u2.e eVar = l.f33918a;
                        if (i19 != 0) {
                            Object L = qVar.L();
                            if (L == eVar) {
                                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(10);
                                qVar.h0(L);
                            }
                            aVar5 = (ho.a) L;
                        } else {
                            aVar5 = aVar3;
                        }
                        if (i14 != 0) {
                            Object L2 = qVar.L();
                            if (L2 == eVar) {
                                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(11);
                                qVar.h0(L2);
                            }
                            aVar7 = (ho.a) L2;
                        } else {
                            aVar7 = aVar4;
                        }
                        if (i16 != 0) {
                            Object L3 = qVar.L();
                            if (L3 == eVar) {
                                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(1);
                                qVar.h0(L3);
                            }
                            lVar2 = (ho.l) L3;
                        }
                        Object L4 = qVar.L();
                        if (L4 == eVar) {
                            L4 = r.A(null);
                            qVar.h0(L4);
                        }
                        z0 z0Var = (z0) L4;
                        lVar3 = lVar2;
                        ho.a aVar8 = aVar7;
                        k5.a(null, k.d(353923853, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.c
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                z HoursHistoryScreenUI$lambda$6;
                                int intValue = ((Integer) obj2).intValue();
                                HoursHistoryScreenUI$lambda$6 = HoursHistoryScreenKt.HoursHistoryScreenUI$lambda$6(ho.a.this, (m) obj, intValue);
                                return HoursHistoryScreenUI$lambda$6;
                            }
                        }, qVar), null, null, null, 0, 0L, 0L, null, k.d(-118538654, true, new n2(hoursHistoryState, lVar2, aVar7, z0Var, 9), qVar), qVar, 805306416, 509);
                        qVar = qVar;
                        final String HoursHistoryScreenUI$lambda$4 = HoursHistoryScreenUI$lambda$4(z0Var);
                        if (HoursHistoryScreenUI$lambda$4 != null) {
                            qVar.X(-601639074);
                            Object L5 = qVar.L();
                            if (L5 == eVar) {
                                L5 = new b(z0Var, 2);
                                qVar.h0(L5);
                            }
                            BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, u.P, (ho.a) L5, kj.c.R(qVar, R.string.account_settings_listening_hours_history), (ho.r) k.d(582990500, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.d
                                @Override // ho.r
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    z HoursHistoryScreenUI$lambda$9;
                                    int intValue = ((Integer) obj4).intValue();
                                    HoursHistoryScreenUI$lambda$9 = HoursHistoryScreenKt.HoursHistoryScreenUI$lambda$9(HoursHistoryScreenUI$lambda$4, (y) obj, (BottomSheetControl) obj2, (m) obj3, intValue);
                                    return HoursHistoryScreenUI$lambda$9;
                                }
                            }, qVar), (m) qVar, 1597440, 15);
                            qVar.p(false);
                        } else {
                            qVar.X(-600944271);
                            qVar.p(false);
                        }
                        aVar6 = aVar8;
                    } else {
                        qVar.R();
                        aVar5 = aVar3;
                        aVar6 = aVar4;
                        lVar3 = lVar2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) hoursHistoryState, (Object) aVar5, (Object) aVar6, (Object) lVar3, i10, i11, 23);
                        return;
                    }
                    return;
                }
                lVar2 = lVar;
                if ((i12 & 1171) == 1170) {
                }
                if (!qVar.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            aVar4 = aVar2;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            lVar2 = lVar;
            if ((i12 & 1171) == 1170) {
            }
            if (!qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        aVar3 = aVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar4 = aVar2;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        lVar2 = lVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HoursHistoryScreenUI$lambda$10(HoursHistoryState hoursHistoryState, ho.a aVar, ho.a aVar2, ho.l lVar, int i10, int i11, m mVar, int i12) {
        HoursHistoryScreenUI(hoursHistoryState, aVar, aVar2, lVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$2$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    private static final String HoursHistoryScreenUI$lambda$4(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z HoursHistoryScreenUI$lambda$6(final ho.a aVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.EchoThemeHeaderActions(null, kj.c.R(qVar, R.string.account_settings_listening_hours_history), k.d(-1486221814, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.f
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z HoursHistoryScreenUI$lambda$6$0;
                    int intValue = ((Integer) obj3).intValue();
                    HoursHistoryScreenUI$lambda$6$0 = HoursHistoryScreenKt.HoursHistoryScreenUI$lambda$6$0(ho.a.this, (l2) obj, (m) obj2, intValue);
                    return HoursHistoryScreenUI$lambda$6$0;
                }
            }, qVar), null, qVar, 384, 9);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$6$0(ho.a aVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.EchoThemeBackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$7(HoursHistoryState hoursHistoryState, ho.l lVar, ho.a aVar, z0 z0Var, z1 z1Var, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(z1Var)) {
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
            i3.q qVar2 = i3.q.f13017a;
            t o6 = r1.d.o(r1.d.D(p2.d(qVar2, 1.0f), z1Var), z1Var);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(o6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (f10 || L == eVar) {
                L = new b(lVar, 0);
                qVar.h0(L);
            }
            ho.a aVar2 = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new i(z0Var, 1);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            boolean f11 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f11 || L3 == eVar) {
                L3 = new b(lVar, 1);
                qVar.h0(L3);
            }
            UsageSectionList(hoursHistoryState, aVar2, lVar2, (ho.a) L3, qVar, 384);
            if (!n.m0(hoursHistoryState.getLoadingMoreError()) && hoursHistoryState.getSections().isEmpty()) {
                qVar.X(-412991334);
                qVar.p(false);
            } else {
                qVar.X(-414073420);
                i3.l lVar3 = i3.d.Z;
                r1.t tVar = r1.t.f29349a;
                t f12 = p2.f(p2.e(tVar.b(qVar2, lVar3), 1.0f), 120);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i13 = EchoTheme.$stable;
                EchoThemeColors.Background background = echoTheme.getColors(qVar, i13).getBackground();
                int i14 = EchoThemeColors.Background.$stable;
                VerticalGradientKt.VerticalGradient(f12, ig.f.I(new p3.x(p3.x.b(u.P, background.getPrimary(qVar, i14))), new p3.x(ib.i.D(i13, i14, echoTheme, qVar, qVar))), qVar, 0, 0);
                FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar, R.string.account_get_more_hours), aVar, r1.d.I(p2.e(tVar.b(qVar2, lVar3), 1.0f), echoTheme.getSpacings(qVar, i13).getX5(), u.P, echoTheme.getSpacings(qVar, i13).getX5(), echoTheme.getSpacings(qVar, i13).getX5(), 2), FullWidthButtonSize.Medium, FullWidthButtonVariant.Primary, null, false, false, false, qVar, 27648, 480);
                qVar = qVar;
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$7$0$0$0(ho.l lVar) {
        lVar.invoke(new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(2));
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$7$0$0$0$0(HoursHistoryViewModel hoursHistoryViewModel) {
        hoursHistoryViewModel.getClass();
        hoursHistoryViewModel.toggleExtraHoursExpanded();
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$7$0$1$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$7$0$2$0(ho.l lVar) {
        lVar.invoke(new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(3));
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$7$0$2$0$0(HoursHistoryViewModel hoursHistoryViewModel) {
        hoursHistoryViewModel.getClass();
        hoursHistoryViewModel.refresh();
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$8$0(z0 z0Var) {
        z0Var.setValue(null);
        return z.f31622a;
    }

    public static final z HoursHistoryScreenUI$lambda$9(String str, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i11 = EchoTheme.$stable;
        y0 baseRegular400 = echoTheme.getTypography(mVar, i11).getBaseRegular400(mVar, EchoThemeTypography.$stable);
        long secondary = echoTheme.getColors(mVar, i11).getText().getSecondary(mVar, EchoThemeColors.Text.$stable);
        t e10 = p2.e(i3.q.f13017a, 1.0f);
        WeakHashMap weakHashMap = c3.f29142x;
        j7.d(str, r1.d.F(r1.d.P(e10, new o1(u0.e(mVar).f29155m, 32)), echoTheme.getSpacings(mVar, i11).getX5(), echoTheme.getSpacings(mVar, i11).getX4()), secondary, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular400, mVar, 0, 0, 131064);
        return z.f31622a;
    }

    public static final void Preview_HoursHistoryScreen_Error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1655200450);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HoursHistoryScreenUI(new HoursHistoryState(false, "This is error", null, false, false, 28, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 2);
        }
    }

    public static final z Preview_HoursHistoryScreen_Error$lambda$0(int i10, m mVar, int i11) {
        Preview_HoursHistoryScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HoursHistoryScreen_ExtraHours_Disabled(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1315225078);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HoursHistoryScreenUI(new HoursHistoryState(false, null, ig.f.I(new UsageSection.UsageProgress("Text to Audio", "5h left", 5, 24, true, null, null, 64, null), new UsageSection.UsageExtraHours("Extra Hours", "0h left", 0, 1, false, "Hours from one-time purchases.", "No active packs", tn.t.f33547a)), false, false, 27, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 29);
        }
    }

    public static final z Preview_HoursHistoryScreen_ExtraHours_Disabled$lambda$0(int i10, m mVar, int i11) {
        Preview_HoursHistoryScreen_ExtraHours_Disabled(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HoursHistoryScreen_ExtraHours_Expanded(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1234487571);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HoursHistoryScreenUI(new HoursHistoryState(false, null, stubUsageSections(), true, false, 19, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 0);
        }
    }

    public static final z Preview_HoursHistoryScreen_ExtraHours_Expanded$lambda$0(int i10, m mVar, int i11) {
        Preview_HoursHistoryScreen_ExtraHours_Expanded(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HoursHistoryScreen_Loaded(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1093625455);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HoursHistoryScreenUI(new HoursHistoryState(false, null, stubUsageSections(), false, false, 27, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 1);
        }
    }

    public static final z Preview_HoursHistoryScreen_Loaded$lambda$0(int i10, m mVar, int i11) {
        Preview_HoursHistoryScreen_Loaded(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HoursHistoryScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1323588682);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HoursHistoryScreenUI(new HoursHistoryState(true, null, null, false, false, 30, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 28);
        }
    }

    public static final z Preview_HoursHistoryScreen_Loading$lambda$0(int i10, m mVar, int i11) {
        Preview_HoursHistoryScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void UsageSectionList(final HoursHistoryState hoursHistoryState, final ho.a aVar, final ho.l lVar, final ho.a aVar2, m mVar, final int i10) {
        int i11;
        ho.a aVar3;
        boolean z6;
        HoursHistoryState hoursHistoryState2;
        ho.a aVar4;
        q qVar;
        r1 r10;
        p pVar;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        q qVar2 = (q) mVar;
        qVar2.Z(6328750);
        if ((i10 & 6) == 0) {
            if (qVar2.h(hoursHistoryState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            aVar3 = aVar2;
            if (qVar2.h(aVar3)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        } else {
            aVar3 = aVar2;
        }
        boolean z11 = false;
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            if (!n.m0(hoursHistoryState.getLoadingMoreError()) && hoursHistoryState.getSections().isEmpty()) {
                qVar2.X(-438543720);
                ErrorScreenKt.m1837ErrorScreenuDo3WH8(null, null, hoursHistoryState.getLoadingMoreError(), 0L, aVar3, qVar2, (i11 << 3) & 57344, 11);
                qVar2.p(false);
                r10 = qVar2.r();
                if (r10 != null) {
                    final int i16 = 0;
                    pVar = new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.a
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z UsageSectionList$lambda$0;
                            z UsageSectionList$lambda$2;
                            switch (i16) {
                                case 0:
                                    int intValue = ((Integer) obj2).intValue();
                                    UsageSectionList$lambda$0 = HoursHistoryScreenKt.UsageSectionList$lambda$0(hoursHistoryState, aVar, lVar, aVar2, i10, (m) obj, intValue);
                                    return UsageSectionList$lambda$0;
                                default:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    UsageSectionList$lambda$2 = HoursHistoryScreenKt.UsageSectionList$lambda$2(hoursHistoryState, aVar, lVar, aVar2, i10, (m) obj, intValue2);
                                    return UsageSectionList$lambda$2;
                            }
                        }
                    };
                    r10.f34012d = pVar;
                }
                return;
            }
            hoursHistoryState2 = hoursHistoryState;
            aVar4 = aVar;
            qVar2.X(-438455308);
            qVar2.p(false);
            t d10 = p2.d(i3.q.f13017a, 1.0f);
            d2 f10 = r1.d.f(u.P, u.P, u.P, 96, 7);
            boolean h10 = qVar2.h(hoursHistoryState2);
            if ((i11 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = h10 | z10;
            if ((i11 & 112) == 32) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object L = qVar2.L();
            if (z13 || L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.o(hoursHistoryState2, lVar, aVar4, 2);
                qVar2.h0(L);
            }
            c1.c(d10, null, f10, false, null, null, null, false, null, (ho.l) L, qVar2, 390, 506);
            qVar = qVar2;
        } else {
            hoursHistoryState2 = hoursHistoryState;
            aVar4 = aVar;
            qVar = qVar2;
            qVar.R();
        }
        r10 = qVar.r();
        if (r10 != null) {
            final int i17 = 1;
            final HoursHistoryState hoursHistoryState3 = hoursHistoryState2;
            final ho.a aVar5 = aVar4;
            pVar = new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.a
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z UsageSectionList$lambda$0;
                    z UsageSectionList$lambda$2;
                    switch (i17) {
                        case 0:
                            int intValue = ((Integer) obj2).intValue();
                            UsageSectionList$lambda$0 = HoursHistoryScreenKt.UsageSectionList$lambda$0(hoursHistoryState3, aVar5, lVar, aVar2, i10, (m) obj, intValue);
                            return UsageSectionList$lambda$0;
                        default:
                            int intValue2 = ((Integer) obj2).intValue();
                            UsageSectionList$lambda$2 = HoursHistoryScreenKt.UsageSectionList$lambda$2(hoursHistoryState3, aVar5, lVar, aVar2, i10, (m) obj, intValue2);
                            return UsageSectionList$lambda$2;
                    }
                }
            };
            r10.f34012d = pVar;
        }
    }

    public static final z UsageSectionList$lambda$0(HoursHistoryState hoursHistoryState, ho.a aVar, ho.l lVar, ho.a aVar2, int i10, m mVar, int i11) {
        UsageSectionList(hoursHistoryState, aVar, lVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final z UsageSectionList$lambda$1$0(final HoursHistoryState hoursHistoryState, final ho.l lVar, final ho.a aVar, t1.t tVar) {
        tVar.getClass();
        final List<UsageSection> sections = hoursHistoryState.getSections();
        final HoursHistoryScreenKt$UsageSectionList$lambda$1$0$$inlined$items$default$1 hoursHistoryScreenKt$UsageSectionList$lambda$1$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt$UsageSectionList$lambda$1$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((UsageSection) obj);
            }

            @Override // ho.l
            public final Void invoke(UsageSection usageSection) {
                return null;
            }
        };
        ((t1.i) tVar).u(sections.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt$UsageSectionList$lambda$1$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(sections.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt$UsageSectionList$lambda$1$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z6;
                String str;
                ho.a aVar2;
                String str2;
                ho.a aVar3;
                int i13;
                int i14;
                i3.l lVar2 = i3.d.f12997a;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
                } else {
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
                    final UsageSection usageSection = (UsageSection) sections.get(i10);
                    qVar.X(-1857595090);
                    boolean z10 = usageSection instanceof UsageSection.UsageProgress;
                    i3.q qVar2 = i3.q.f13017a;
                    Object obj = l.f33918a;
                    if (z10) {
                        qVar.X(-752658514);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i15 = EchoTheme.$stable;
                        t F = r1.d.F(qVar2, echoTheme.getSpacings(qVar, i15).getX5(), echoTheme.getSpacings(qVar, i15).getX3());
                        f1 d10 = r1.p.d(lVar2, false);
                        int hashCode = Long.hashCode(qVar.T);
                        o l4 = qVar.l();
                        t c5 = i3.a.c(F, qVar);
                        h4.h.f11920i.getClass();
                        ho.a aVar4 = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(aVar4);
                        } else {
                            qVar.k0();
                        }
                        r.J(h4.g.f11907f, d10, qVar);
                        r.J(h4.g.f11906e, l4, qVar);
                        r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                        r.F(h4.g.f11909h, qVar);
                        r.J(h4.g.f11905d, c5, qVar);
                        UsageSection.UsageProgress usageProgress = (UsageSection.UsageProgress) usageSection;
                        Date resetsAt = usageProgress.getResetsAt();
                        if (resetsAt == null) {
                            qVar.X(-552141581);
                            qVar.p(false);
                            str2 = null;
                        } else {
                            qVar.X(-552141580);
                            String Q = kj.c.Q(R.string.usage_resets_at, new Object[]{DateFormatterKt.formatDate(resetsAt, qVar, 0)}, qVar);
                            qVar.p(false);
                            str2 = Q;
                        }
                        String label = usageProgress.getLabel();
                        String valueLabel = usageProgress.getValueLabel();
                        int progressCurrent = usageProgress.getProgressCurrent();
                        int progressTotal = usageProgress.getProgressTotal();
                        boolean enabled = usageProgress.getEnabled();
                        String infoTooltip = usageProgress.getInfoTooltip();
                        final String infoTooltip2 = usageProgress.getInfoTooltip();
                        if (infoTooltip2 == null) {
                            qVar.X(-551596291);
                            qVar.p(false);
                            aVar3 = null;
                        } else {
                            qVar.X(-551596290);
                            boolean f10 = qVar.f(lVar) | qVar.f(infoTooltip2);
                            Object L = qVar.L();
                            if (f10 || L == obj) {
                                final ho.l lVar3 = lVar;
                                L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt$UsageSectionList$2$1$1$1$1$1$1
                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m1651invoke() {
                                        ho.l.this.invoke(infoTooltip2);
                                    }

                                    @Override // ho.a
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m1651invoke();
                                        return z.f31622a;
                                    }
                                };
                                qVar.h0(L);
                            }
                            qVar.p(false);
                            aVar3 = (ho.a) L;
                        }
                        UsageCategoryCardKt.UsageCategoryCard(label, valueLabel, progressCurrent, progressTotal, enabled, null, infoTooltip, aVar3, null, false, str2, false, null, null, qVar, 0, 0, 15136);
                        qVar.p(true);
                        qVar.p(false);
                    } else {
                        ho.a aVar5 = null;
                        if (usageSection instanceof UsageSection.UsageExtraHours) {
                            qVar.X(-752626299);
                            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                            int i16 = EchoTheme.$stable;
                            t F2 = r1.d.F(qVar2, echoTheme2.getSpacings(qVar, i16).getX5(), echoTheme2.getSpacings(qVar, i16).getX3());
                            f1 d11 = r1.p.d(lVar2, false);
                            int hashCode2 = Long.hashCode(qVar.T);
                            o l7 = qVar.l();
                            t c10 = i3.a.c(F2, qVar);
                            h4.h.f11920i.getClass();
                            ho.a aVar6 = h4.g.f11903b;
                            qVar.b0();
                            if (qVar.S) {
                                qVar.k(aVar6);
                            } else {
                                qVar.k0();
                            }
                            r.J(h4.g.f11907f, d11, qVar);
                            r.J(h4.g.f11906e, l7, qVar);
                            r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
                            r.F(h4.g.f11909h, qVar);
                            r.J(h4.g.f11905d, c10, qVar);
                            UsageSection.UsageExtraHours usageExtraHours = (UsageSection.UsageExtraHours) usageSection;
                            ActiveCreditPack activeCreditPack = (ActiveCreditPack) tn.o.y0(usageExtraHours.getPacks());
                            if (activeCreditPack == null) {
                                qVar.X(-554023878);
                                qVar.p(false);
                                str = null;
                            } else {
                                qVar.X(-554023877);
                                String Q2 = kj.c.Q(R.string.usage_pack_expires_at, new Object[]{DateFormatterKt.formatDate(activeCreditPack.getExpiresAt(), qVar, 0)}, qVar);
                                qVar.p(false);
                                str = Q2;
                            }
                            String label2 = usageExtraHours.getLabel();
                            String valueLabel2 = usageExtraHours.getValueLabel();
                            int progressCurrent2 = usageExtraHours.getProgressCurrent();
                            int progressTotal2 = usageExtraHours.getProgressTotal();
                            boolean enabled2 = usageExtraHours.getEnabled();
                            String infoTooltip3 = usageExtraHours.getInfoTooltip();
                            final String infoTooltip4 = usageExtraHours.getInfoTooltip();
                            if (infoTooltip4 == null) {
                                qVar.X(-553463212);
                            } else {
                                qVar.X(-553463211);
                                boolean f11 = qVar.f(lVar) | qVar.f(infoTooltip4);
                                Object L2 = qVar.L();
                                if (f11 || L2 == obj) {
                                    final ho.l lVar4 = lVar;
                                    L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt$UsageSectionList$2$1$1$2$1$1$1
                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m1652invoke() {
                                            ho.l.this.invoke(infoTooltip4);
                                        }

                                        @Override // ho.a
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m1652invoke();
                                            return z.f31622a;
                                        }
                                    };
                                    qVar.h0(L2);
                                }
                                aVar5 = (ho.a) L2;
                            }
                            qVar.p(false);
                            ho.a aVar7 = aVar5;
                            String packsSummaryLabel = usageExtraHours.getPacksSummaryLabel();
                            boolean z11 = !usageExtraHours.getPacks().isEmpty();
                            boolean isExtraHoursExpanded = hoursHistoryState.isExtraHoursExpanded();
                            if (usageExtraHours.getEnabled()) {
                                aVar2 = aVar;
                            } else {
                                aVar2 = null;
                            }
                            UsageCategoryCardKt.UsageCategoryCard(label2, valueLabel2, progressCurrent2, progressTotal2, enabled2, null, infoTooltip3, aVar7, packsSummaryLabel, z11, str, isExtraHoursExpanded, aVar2, k.d(954189748, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt$UsageSectionList$2$1$1$2$2
                                public final void invoke(m mVar2, int i17) {
                                    boolean z12;
                                    if ((i17 & 3) != 2) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    q qVar3 = (q) mVar2;
                                    if (qVar3.O(i17 & 1, z12)) {
                                        HoursHistoryScreenKt.ActiveCreditPackList(((UsageSection.UsageExtraHours) UsageSection.this).getPacks(), qVar3, 0);
                                    } else {
                                        qVar3.R();
                                    }
                                }

                                @Override // ho.p
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((m) obj2, ((Number) obj3).intValue());
                                    return z.f31622a;
                                }
                            }, qVar), qVar, 0, 3072, 32);
                            qVar.p(true);
                            qVar.p(false);
                        } else {
                            throw com.google.android.gms.internal.play_billing.b.h(-752659083, qVar, false);
                        }
                    }
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        if (hoursHistoryState.isLoadingMore()) {
            t1.t.c(tVar, null, null, ComposableSingletons$HoursHistoryScreenKt.INSTANCE.m1647getLambda$2038271362$app_productionRelease(), 3);
        }
        return z.f31622a;
    }

    public static final z UsageSectionList$lambda$2(HoursHistoryState hoursHistoryState, ho.a aVar, ho.l lVar, ho.a aVar2, int i10, m mVar, int i11) {
        UsageSectionList(hoursHistoryState, aVar, lVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final List<UsageSection> stubUsageSections() {
        return ig.f.I(new UsageSection.UsageProgress("Text to Audio", "16h left", 16, 24, true, null, new Date(1780000000000L)), new UsageSection.UsageExtraHours("Extra Hours", "10h left", 10, 20, true, "Hours from one-time purchases. Each pack expires one year after purchase.", "2 packs active", ig.f.I(new ActiveCreditPack("4 hours", new Date(1782592000000L)), new ActiveCreditPack("6 hours", new Date(1792960000000L)))));
    }
}

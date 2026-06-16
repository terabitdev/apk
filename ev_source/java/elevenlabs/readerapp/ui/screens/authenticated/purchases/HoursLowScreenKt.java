package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import a2.n2;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.SubscriptionProduct;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.readerapp.ui.previews.ProductsFactoryKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.ShadowKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.extensions.ContextExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.k5;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a;\u0010\b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a_\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2 \b\u0002\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "", "Lsn/z;", "onSubscribeClick", "Lkotlin/Function0;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/HoursLowViewModel;", "vm", "HoursLowScreen", "(Lho/l;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/HoursLowViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/HoursLowState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "HoursLowScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/HoursLowState;Lho/l;Lho/l;Lho/a;Lu2/m;II)V", "Preview_HoursLowScreen_Loading", "(Lu2/m;I)V", "Preview_HoursLowScreen_Error", "Preview_HoursLowScreen_Loaded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HoursLowScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if ((r17 & 4) != 0) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HoursLowScreen(ho.l lVar, ho.a aVar, HoursLowViewModel hoursLowViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        lVar.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1003857839);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0 && qVar.h(hoursLowViewModel)) {
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
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        hoursLowViewModel = (HoursLowViewModel) gg.b.j0(e0.f20562a.b(HoursLowViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                HoursLowState HoursLowScreen$lambda$0 = HoursLowScreen$lambda$0(u2.r.o(hoursLowViewModel.getStateFlow(), qVar, 0));
                boolean h10 = qVar.h(hoursLowViewModel);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new o(hoursLowViewModel, 0);
                    qVar.h0(L);
                }
                HoursLowScreenUI(HoursLowScreen$lambda$0, (ho.l) L, lVar, aVar, qVar, (i12 << 6) & 8064, 0);
                qVar = qVar;
            }
        } else {
            qVar.R();
        }
        HoursLowViewModel hoursLowViewModel2 = hoursLowViewModel;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(lVar, aVar, hoursLowViewModel2, i10, i11, 13);
        }
    }

    private static final HoursLowState HoursLowScreen$lambda$0(s2 s2Var) {
        return (HoursLowState) s2Var.getValue();
    }

    public static final sn.z HoursLowScreen$lambda$1$0(HoursLowViewModel hoursLowViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(hoursLowViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreen$lambda$2(ho.l lVar, ho.a aVar, HoursLowViewModel hoursLowViewModel, int i10, int i11, u2.m mVar, int i12) {
        HoursLowScreen(lVar, aVar, hoursLowViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HoursLowScreenUI(HoursLowState hoursLowState, ho.l lVar, ho.l lVar2, ho.a aVar, u2.m mVar, int i10, int i11) {
        Object obj;
        int i12;
        ho.l lVar3;
        int i13;
        int i14;
        ho.l lVar4;
        int i15;
        int i16;
        int i17;
        boolean z6;
        u2.q qVar;
        ho.l lVar5;
        ho.l lVar6;
        ho.a aVar2;
        u2.r1 r10;
        ho.l lVar7;
        ho.l lVar8;
        ho.a aVar3;
        int i18;
        hoursLowState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1554866141);
        if ((i10 & 6) == 0) {
            obj = hoursLowState;
            if (qVar2.h(obj)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            obj = hoursLowState;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
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
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (qVar2.h(aVar)) {
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
                    if (!qVar2.O(i12 & 1, z6)) {
                        Object obj2 = u2.l.f33918a;
                        if (i19 != 0) {
                            Object L = qVar2.L();
                            if (L == obj2) {
                                L = new k(8);
                                qVar2.h0(L);
                            }
                            lVar7 = (ho.l) L;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i14 != 0) {
                            Object L2 = qVar2.L();
                            if (L2 == obj2) {
                                L2 = new k(9);
                                qVar2.h0(L2);
                            }
                            lVar8 = (ho.l) L2;
                        } else {
                            lVar8 = lVar4;
                        }
                        if (i16 != 0) {
                            Object L3 = qVar2.L();
                            if (L3 == obj2) {
                                L3 = new d(3);
                                qVar2.h0(L3);
                            }
                            aVar3 = (ho.a) L3;
                        } else {
                            aVar3 = aVar;
                        }
                        aVar2 = aVar3;
                        qVar = qVar2;
                        k5.a(null, c3.k.d(495765479, true, new e(2, aVar3), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(-379162894, true, new n2(obj, aVar3, lVar7, lVar8, 8), qVar2), qVar, 805306416, 509);
                        lVar5 = lVar7;
                        lVar6 = lVar8;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        lVar5 = lVar3;
                        lVar6 = lVar4;
                        aVar2 = aVar;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.core.l(hoursLowState, lVar5, lVar6, aVar2, i10, i11);
                        return;
                    }
                    return;
                }
                if ((i12 & 1171) == 1170) {
                }
                if (!qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar4 = lVar2;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            if ((i12 & 1171) == 1170) {
            }
            if (!qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        lVar3 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        lVar4 = lVar2;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z HoursLowScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$3(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderKt.Header("", null, c3.k.d(-1622104405, true, new c(aVar, 2), qVar), null, null, 0, qVar, 390, 58);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$3$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CloseButtonKt.CloseButton(aVar, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4(HoursLowState hoursLowState, ho.a aVar, ho.l lVar, ho.l lVar2, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        HoursLowState hoursLowState2;
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
            i3.t D = r1.d.D(p2.d(qVar2, 1.0f), z1Var);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t h10 = l1.n.h(D, ib.i.d(elevenLabsTheme, qVar, i13), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            if (hoursLowState.getPurchasedProduct() != null) {
                qVar.X(323325680);
                OneTimeCreditsPurchaseSuccessScreenKt.OneTimeCreditsPurchaseSuccessScreen(hoursLowState.getPurchasedProduct(), aVar, qVar, 0);
                qVar.p(false);
                hoursLowState2 = hoursLowState;
            } else if (hoursLowState.getData() != null) {
                qVar.X(323752178);
                i3.t f10 = ib.i.f(elevenLabsTheme, qVar, i13, p2.d(qVar2, 1.0f));
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(f10, qVar);
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
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                hoursLowState2 = hoursLowState;
                ShadowKt.m1876BottomShadowOverlayPZHvWI(p2.e(new m1(1.0f, true), 1.0f), elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM(), 0L, c3.k.d(-820739435, true, new fm.o(hoursLowState2, lVar2, lVar, 22), qVar), qVar, 3072, 4);
                qVar = qVar;
                qVar.p(true);
                FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(hoursLowState2.isLoadingPurchase(), null, 0L, qVar, 0, 6);
                qVar.p(false);
            } else {
                hoursLowState2 = hoursLowState;
                qVar.X(329858806);
                qVar.p(false);
            }
            if (!wq.n.m0(hoursLowState2.getError())) {
                qVar.X(329917086);
                u2.q qVar3 = qVar;
                ErrorScreenKt.m1836ErrorScreenV9fs2A(p2.d(qVar2, 1.0f), null, hoursLowState2.getError(), c3.k.d(1506042859, true, new n(lVar, 0), qVar), null, 0L, qVar3, 3078, 50);
                qVar = qVar3;
                qVar.p(false);
            } else {
                qVar.X(330370678);
                qVar.p(false);
            }
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(hoursLowState2.isLoading(), null, 0L, qVar, 0, 6);
            if (!wq.n.m0(hoursLowState2.getPurchaseError())) {
                qVar.X(330501188);
                String R = kj.c.R(qVar, R.string.common_something_went_wrong);
                String purchaseError = hoursLowState2.getPurchaseError();
                String R2 = kj.c.R(qVar, R.string.common_ok);
                boolean f11 = qVar.f(lVar);
                Object L = qVar.L();
                u2.e eVar5 = u2.l.f33918a;
                if (f11 || L == eVar5) {
                    L = new a(lVar, 3);
                    qVar.h0(L);
                }
                ho.a aVar2 = (ho.a) L;
                boolean f12 = qVar.f(lVar);
                Object L2 = qVar.L();
                if (f12 || L2 == eVar5) {
                    L2 = new a(lVar, 4);
                    qVar.h0(L2);
                }
                u2.q qVar4 = qVar;
                ConfirmationDialogKt.ConfirmationDialog(aVar2, (ho.a) L2, R, purchaseError, null, R2, false, qVar4, 1597440, 0);
                qVar = qVar4;
                qVar.p(false);
            } else {
                qVar.X(330962902);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$0$0(HoursLowState hoursLowState, ho.l lVar, ho.l lVar2, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        h4.e eVar;
        u2.q qVar;
        h4.e eVar2;
        h4.d dVar;
        h4.e eVar3;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t y10 = l1.n.y(p2.d(qVar3, 1.0f), l1.n.x(qVar2), true, true);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(y10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar4 = h4.g.f11907f;
            u2.r.J(eVar4, a10, qVar2);
            h4.e eVar5 = h4.g.f11906e;
            u2.r.J(eVar5, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar6 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar6);
            h4.d dVar2 = h4.g.f11909h;
            u2.r.F(dVar2, qVar2);
            h4.e eVar7 = h4.g.f11905d;
            u2.r.J(eVar7, c5, qVar2);
            i3.k kVar = i3.d.f13005z0;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            r1.h h10 = r1.j.h(elevenLabsTheme.getSpacings(qVar2, i11).m2353getX2D9Ej5fM(), i3.d.C0);
            i3.t I = r1.d.I(p2.e(qVar3, 1.0f), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar2, i11).m2356getX4D9Ej5fM(), 7);
            k2 a11 = i2.a(h10, kVar, qVar2, 48);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(I, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar4, a11, qVar2);
            u2.r.J(eVar5, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar6, qVar2, dVar2);
            u2.r.J(eVar7, c10, qVar2);
            l1.n.c(kd.a.M(io.elevenlabs.ui.R.drawable.clock__time__timer, qVar2, 0), null, p2.o(qVar3, 32), null, null, t2.u.P, new p3.n(defpackage.f.b(elevenLabsTheme, qVar2, i11), 5), qVar2, u3.c.$stable | 432, 56);
            j7.d(MinutesFormatterKt.formatMinutesToHoursOrMinutesShort(hoursLowState.getData().getCurrentMinutes(), qVar2, 0), null, defpackage.f.b(elevenLabsTheme, qVar2, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i11).getTitleXLarge700Eleven(), qVar2, 0, 0, 131066);
            qVar2.p(true);
            r1.d.g(p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, i11).m2356getX4D9Ej5fM()), qVar2);
            j7.d(hoursLowState.getData().getTitle(), p2.e(qVar3, 1.0f), defpackage.f.b(elevenLabsTheme, qVar2, i11), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i11).getTitleMedium500(), qVar2, 48, 0, 130040);
            ib.i.p(elevenLabsTheme, qVar2, i11, qVar3, qVar2);
            j7.d(hoursLowState.getData().getSubtitle(), p2.e(qVar3, 1.0f), ib.i.w(elevenLabsTheme, qVar2, i11), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i11).getBodyMedium500(), qVar2, 48, 0, 130040);
            r1.d.g(p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, i11).m2360getX8D9Ej5fM()), qVar2);
            List<SubscriptionProduct> subscriptionProducts = hoursLowState.getData().getSubscriptionProducts();
            boolean isEmpty = subscriptionProducts.isEmpty();
            u2.e eVar8 = u2.l.f33918a;
            if (!isEmpty) {
                qVar2.X(-144507491);
                boolean f10 = qVar2.f(lVar);
                Object L = qVar2.L();
                if (f10 || L == eVar8) {
                    L = new r(lVar, 2);
                    qVar2.h0(L);
                }
                SubscriptionProductsListKt.SubscriptionProductsList(subscriptionProducts, (ho.l) L, qVar2, 0);
                i3.t e10 = p2.e(r1.d.E(qVar3, elevenLabsTheme.getSpacings(qVar2, i11).m2356getX4D9Ej5fM()), 1.0f);
                f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode3 = Long.hashCode(qVar2.T);
                c3.o l10 = qVar2.l();
                i3.t c11 = i3.a.c(e10, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(eVar4, d10, qVar2);
                eVar3 = eVar5;
                u2.r.J(eVar3, l10, qVar2);
                eVar = eVar6;
                defpackage.f.u(hashCode3, qVar2, eVar, qVar2, dVar2);
                u2.r.J(eVar7, c11, qVar2);
                qVar = qVar2;
                eVar2 = eVar7;
                dVar = dVar2;
                DividerKt.m1828DividerLightiJQMabo(p2.s(qVar3, 120), 0L, qVar, 6, 2);
                qVar.p(true);
                qVar.p(false);
            } else {
                eVar = eVar6;
                qVar = qVar2;
                eVar2 = eVar7;
                dVar = dVar2;
                eVar3 = eVar5;
                qVar.X(-143825181);
                qVar.p(false);
            }
            Activity findActivity = ContextExtensionsKt.findActivity((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
            List<OneTimeCreditsProduct> oneTimeProducts = hoursLowState.getData().getOneTimeProducts();
            boolean f11 = qVar.f(lVar2) | qVar.h(findActivity);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar8) {
                L2 = new f(lVar2, findActivity, 5);
                qVar.h0(L2);
            }
            OneTimeCreditProductsListKt.OneTimeCreditProductsList(oneTimeProducts, (ho.l) L2, qVar, 0);
            ib.i.p(elevenLabsTheme, qVar, i11, qVar3, qVar);
            i3.t I2 = r1.d.I(p2.e(qVar3, 1.0f), t2.u.P, elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM(), t2.u.P, elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM(), 5);
            f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c12 = i3.a.c(I2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar4, d11, qVar);
            u2.r.J(eVar3, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar, qVar, dVar);
            u2.r.J(eVar2, c12, qVar);
            u2.q qVar4 = qVar;
            j7.d(kj.c.R(qVar, R.string.hours_page_subscribers_info), r1.d.I(p2.e(qVar3, 1.0f), t2.u.P, elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM(), t2.u.P, t2.u.P, 13), ib.i.w(elevenLabsTheme, qVar, i11), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodySmall500(), qVar4, 0, 0, 130040);
            qVar4.p(true);
            qVar4.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$0$0$0$1$0(ho.l lVar, SubscriptionProduct subscriptionProduct) {
        subscriptionProduct.getClass();
        lVar.invoke(subscriptionProduct.getId());
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$0$0$0$3$0(ho.l lVar, Activity activity, OneTimeCreditsProduct oneTimeCreditsProduct) {
        oneTimeCreditsProduct.getClass();
        lVar.invoke(new f(activity, oneTimeCreditsProduct, 6));
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$0$0$0$3$0$0(Activity activity, OneTimeCreditsProduct oneTimeCreditsProduct, HoursLowViewModel hoursLowViewModel) {
        hoursLowViewModel.getClass();
        if (activity != null) {
            hoursLowViewModel.purchaseProduct(activity, oneTimeCreditsProduct);
        }
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$1(ho.l lVar, u2.m mVar, int i10) {
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
                L = new a(lVar, 2);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$1$0$0(ho.l lVar) {
        lVar.invoke(new k(10));
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$1$0$0$0(HoursLowViewModel hoursLowViewModel) {
        hoursLowViewModel.getClass();
        hoursLowViewModel.load();
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$2$0(ho.l lVar) {
        lVar.invoke(new k(12));
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$2$0$0(HoursLowViewModel hoursLowViewModel) {
        hoursLowViewModel.getClass();
        hoursLowViewModel.closePurchaseError();
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$3$0(ho.l lVar) {
        lVar.invoke(new k(11));
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$4$0$3$0$0(HoursLowViewModel hoursLowViewModel) {
        hoursLowViewModel.getClass();
        hoursLowViewModel.closePurchaseError();
        return sn.z.f31622a;
    }

    public static final sn.z HoursLowScreenUI$lambda$5(HoursLowState hoursLowState, ho.l lVar, ho.l lVar2, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        HoursLowScreenUI(hoursLowState, lVar, lVar2, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_HoursLowScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-892859209);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HoursLowScreenUI(new HoursLowState(false, null, "This is an error", null, null, false, null, null, 251, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 15);
        }
    }

    public static final sn.z Preview_HoursLowScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_HoursLowScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_HoursLowScreen_Loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-53632026);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HoursLowScreenUI(new HoursLowState(false, null, null, null, null, false, null, ProductsFactoryKt.stubOneTimeProductsPage(qVar, 0), 126, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 14);
        }
    }

    public static final sn.z Preview_HoursLowScreen_Loaded$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_HoursLowScreen_Loaded(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_HoursLowScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-933741525);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            HoursLowScreenUI(new HoursLowState(true, null, null, null, null, false, null, null, 254, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 16);
        }
    }

    public static final sn.z Preview_HoursLowScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_HoursLowScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

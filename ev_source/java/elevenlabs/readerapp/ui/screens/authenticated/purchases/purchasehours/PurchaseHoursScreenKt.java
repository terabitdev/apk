package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import a2.n2;
import a2.v0;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import io.elevenlabs.domain.model.SubscriptionProduct;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.OneTimeCreditProductsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.OneTimeCreditsPurchaseSuccessScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.SubscriptionProductsListKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.extensions.ContextExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.k5;
import q2.y4;
import r1.l2;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.z1;
import rd.c1;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001aI\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001ao\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u000f\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u000f\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u000f\u0010\u0016\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0011\u001a\u000f\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function1;", "", "onNavigateToSubscribe", "onNavigateToFriendReferral", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/purchasehours/PurchaseHoursViewModel;", "vm", "PurchaseHoursScreen", "(Lho/a;Lho/l;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/purchasehours/PurchaseHoursViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/purchasehours/PurchaseHoursState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "PurchaseHoursScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/purchasehours/PurchaseHoursState;Lho/l;Lho/a;Lho/l;Lho/a;Lu2/m;II)V", "Preview_PurchaseCreditsScreen_Loading", "(Lu2/m;I)V", "Preview_PurchaseCreditsScreen_Error", "Preview_PurchaseCreditsScreen_Content", "Preview_PurchaseCreditsScreen_Content_Minutes", "Preview_PurchaseCreditsScreen_Purchase_Loading", "Preview_PurchaseCreditsScreen_Purchase_Error", "Preview_PurchaseCreditsScreen_Purchase_Success", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PurchaseHoursScreenKt {
    public static final void Preview_PurchaseCreditsScreen_Content(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(875416785);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.getLambda$890986107$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 10);
        }
    }

    public static final z Preview_PurchaseCreditsScreen_Content$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PurchaseCreditsScreen_Content(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PurchaseCreditsScreen_Content_Minutes(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1846139729);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.getLambda$1783112443$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 7);
        }
    }

    public static final z Preview_PurchaseCreditsScreen_Content_Minutes$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PurchaseCreditsScreen_Content_Minutes(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PurchaseCreditsScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1362559198);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.getLambda$778236748$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 12);
        }
    }

    public static final z Preview_PurchaseCreditsScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PurchaseCreditsScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PurchaseCreditsScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1729791406);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.getLambda$1745360728$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 6);
        }
    }

    public static final z Preview_PurchaseCreditsScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PurchaseCreditsScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PurchaseCreditsScreen_Purchase_Error(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(368144994);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.getLambda$643206520$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 8);
        }
    }

    public static final z Preview_PurchaseCreditsScreen_Purchase_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PurchaseCreditsScreen_Purchase_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PurchaseCreditsScreen_Purchase_Loading(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1510790930);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.getLambda$830330500$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 11);
        }
    }

    public static final z Preview_PurchaseCreditsScreen_Purchase_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PurchaseCreditsScreen_Purchase_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PurchaseCreditsScreen_Purchase_Success(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-542927033);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.getLambda$1798194397$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 9);
        }
    }

    public static final z Preview_PurchaseCreditsScreen_Purchase_Success$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PurchaseCreditsScreen_Purchase_Success(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if ((r20 & 8) != 0) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PurchaseHoursScreen(ho.a aVar, ho.l lVar, ho.a aVar2, PurchaseHoursViewModel purchaseHoursViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        PurchaseHoursViewModel purchaseHoursViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(-300630960);
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
            if (qVar.h(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                purchaseHoursViewModel2 = purchaseHoursViewModel;
                if (qVar.h(purchaseHoursViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                purchaseHoursViewModel2 = purchaseHoursViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            purchaseHoursViewModel2 = purchaseHoursViewModel;
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
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof o) {
                            cVar = ((o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        purchaseHoursViewModel2 = (PurchaseHoursViewModel) gg.b.j0(e0.f20562a.b(PurchaseHoursViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                PurchaseHoursState purchaseHoursState = (PurchaseHoursState) r.o(purchaseHoursViewModel2.getStateFlow(), qVar, 0).getValue();
                boolean h10 = qVar.h(purchaseHoursViewModel2);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new i(purchaseHoursViewModel2, 0);
                    qVar.h0(L);
                }
                PurchaseHoursScreenUI(purchaseHoursState, (ho.l) L, aVar, lVar, aVar2, qVar, (i12 << 6) & 65408, 0);
            }
        } else {
            qVar.R();
        }
        PurchaseHoursViewModel purchaseHoursViewModel3 = purchaseHoursViewModel2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l(aVar, lVar, aVar2, purchaseHoursViewModel3, i10, i11);
        }
    }

    public static final z PurchaseHoursScreen$lambda$0$0(PurchaseHoursViewModel purchaseHoursViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(purchaseHoursViewModel);
        return z.f31622a;
    }

    public static final z PurchaseHoursScreen$lambda$1(ho.a aVar, ho.l lVar, ho.a aVar2, PurchaseHoursViewModel purchaseHoursViewModel, int i10, int i11, u2.m mVar, int i12) {
        PurchaseHoursScreen(aVar, lVar, aVar2, purchaseHoursViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PurchaseHoursScreenUI(PurchaseHoursState purchaseHoursState, ho.l lVar, ho.a aVar, ho.l lVar2, ho.a aVar2, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        int i14;
        ho.a aVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z6;
        q qVar;
        ho.l lVar4;
        ho.l lVar5;
        ho.a aVar4;
        ho.a aVar5;
        r1 r10;
        ho.l lVar6;
        int i20;
        final ho.a aVar6;
        ho.l lVar7;
        final ho.a aVar7;
        int i21;
        q qVar2 = (q) mVar;
        qVar2.Z(-873370240);
        if ((i10 & 6) == 0) {
            if (qVar2.h(purchaseHoursState)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
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
                aVar3 = aVar;
                if (qVar2.h(aVar3)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (qVar2.h(lVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (qVar2.h(aVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        if ((i12 & 9363) != 9362) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar2.O(i12 & 1, z6)) {
                            Object obj = u2.l.f33918a;
                            if (i22 != 0) {
                                Object L = qVar2.L();
                                if (L == obj) {
                                    L = new m(1);
                                    qVar2.h0(L);
                                }
                                lVar6 = (ho.l) L;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i14 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == obj) {
                                    L2 = new c(5);
                                    qVar2.h0(L2);
                                }
                                aVar6 = (ho.a) L2;
                                i20 = i18;
                            } else {
                                i20 = i18;
                                aVar6 = aVar3;
                            }
                            if (i16 != 0) {
                                Object L3 = qVar2.L();
                                if (L3 == obj) {
                                    L3 = new m(2);
                                    qVar2.h0(L3);
                                }
                                lVar7 = (ho.l) L3;
                            } else {
                                lVar7 = lVar2;
                            }
                            if (i20 != 0) {
                                Object L4 = qVar2.L();
                                if (L4 == obj) {
                                    L4 = new c(6);
                                    qVar2.h0(L4);
                                }
                                aVar7 = (ho.a) L4;
                            } else {
                                aVar7 = aVar2;
                            }
                            lVar4 = lVar7;
                            qVar = qVar2;
                            k5.a(null, c3.k.d(-418000580, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.e
                                @Override // ho.p
                                public final Object invoke(Object obj2, Object obj3) {
                                    z PurchaseHoursScreenUI$lambda$4;
                                    int intValue = ((Integer) obj3).intValue();
                                    PurchaseHoursScreenUI$lambda$4 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$4(ho.a.this, aVar7, (u2.m) obj2, intValue);
                                    return PurchaseHoursScreenUI$lambda$4;
                                }
                            }, qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(797418449, true, new n2(purchaseHoursState, lVar6, aVar6, lVar7, 10), qVar2), qVar, 805306416, 509);
                            lVar5 = lVar6;
                            aVar4 = aVar6;
                            aVar5 = aVar7;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            lVar4 = lVar2;
                            lVar5 = lVar3;
                            aVar4 = aVar3;
                            aVar5 = aVar2;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(purchaseHoursState, lVar5, aVar4, lVar4, aVar5, i10, i11);
                            return;
                        }
                        return;
                    }
                    if ((i12 & 9363) != 9362) {
                    }
                    if (qVar2.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                if ((i12 & 9363) != 9362) {
                }
                if (qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            aVar3 = aVar;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            if ((i12 & 9363) != 9362) {
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
        aVar3 = aVar;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        if ((i12 & 9363) != 9362) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z PurchaseHoursScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$2$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$4(ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((t) null, (String) null, c3.k.d(-144399999, true, new d(aVar, 0), qVar), c3.k.d(-538803838, true, new d(aVar2, 1), qVar), (i3.f) null, qVar, 3456, 19);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$4$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
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

    public static final z PurchaseHoursScreenUI$lambda$4$1(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.gift_1__present;
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.referal_sheet_title);
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new g(aVar, 3);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, ButtonIconVariant.Menu, ButtonIconSize.Small, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$4$1$0$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final z PurchaseHoursScreenUI$lambda$5(PurchaseHoursState purchaseHoursState, final ho.l lVar, ho.a aVar, ho.l lVar2, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.e eVar;
        boolean z10;
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
            t h10 = n.h(r1.d.o(r1.d.D(p2.d(qVar2, 1.0f), z1Var), z1Var), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            r.J(eVar2, d10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            r.J(eVar5, c5, qVar);
            boolean isLoading = purchaseHoursState.isLoading();
            u2.e eVar6 = u2.l.f33918a;
            if (isLoading) {
                qVar.X(-1150838747);
                t d11 = p2.d(qVar2, 1.0f);
                f1 d12 = r1.p.d(i3.d.f12998b, false);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                t c10 = i3.a.c(d11, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar2, d12, qVar);
                r.J(eVar3, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                r.J(eVar5, c10, qVar);
                eVar = eVar6;
                y4.a(r1.d.I(qVar2, u.P, 40, u.P, u.P, 13), 0L, u.P, 0L, 0, u.P, qVar, 6, 62);
                qVar = qVar;
                qVar.p(true);
                qVar.p(false);
            } else {
                eVar = eVar6;
                if (!wq.n.m0(purchaseHoursState.getError())) {
                    qVar.X(-1150432802);
                    ErrorScreenKt.m1836ErrorScreenV9fs2A(p2.d(qVar2, 1.0f), null, purchaseHoursState.getError(), c3.k.d(-1468659138, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.f
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z PurchaseHoursScreenUI$lambda$5$0$1;
                            int intValue = ((Integer) obj2).intValue();
                            PurchaseHoursScreenUI$lambda$5$0$1 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$5$0$1(ho.l.this, (u2.m) obj, intValue);
                            return PurchaseHoursScreenUI$lambda$5$0$1;
                        }
                    }, qVar), null, 0L, qVar, 3078, 50);
                    qVar.p(false);
                } else if (purchaseHoursState.getPurchasedProduct() != null) {
                    qVar.X(-1149870555);
                    OneTimeCreditsPurchaseSuccessScreenKt.OneTimeCreditsPurchaseSuccessScreen(purchaseHoursState.getPurchasedProduct(), aVar, qVar, 0);
                    qVar.p(false);
                } else {
                    if (purchaseHoursState.getData() != null) {
                        qVar.X(-1149505158);
                        Activity findActivity = ContextExtensionsKt.findActivity((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
                        t d13 = p2.d(qVar2, 1.0f);
                        f1 d14 = r1.p.d(i3.d.f13001e, false);
                        int hashCode3 = Long.hashCode(qVar.T);
                        c3.o l10 = qVar.l();
                        t c11 = i3.a.c(d13, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        r.J(eVar2, d14, qVar);
                        r.J(eVar3, l10, qVar);
                        defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
                        r.J(eVar5, c11, qVar);
                        t F = r1.d.F(p2.d(qVar2, 1.0f), 20, 16);
                        boolean h11 = qVar.h(purchaseHoursState) | qVar.f(lVar2) | qVar.f(lVar) | qVar.h(findActivity);
                        Object L = qVar.L();
                        eVar = eVar;
                        if (h11 || L == eVar) {
                            v0 v0Var = new v0(purchaseHoursState, lVar2, lVar, findActivity, 11);
                            qVar.h0(v0Var);
                            L = v0Var;
                        }
                        c1.c(F, null, null, false, null, null, null, false, null, (ho.l) L, qVar, 6, 510);
                        qVar = qVar;
                        FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(purchaseHoursState.isLoadingPurchase(), null, 0L, qVar, 0, 6);
                        z10 = true;
                        qVar.p(true);
                        qVar.p(false);
                    } else {
                        z10 = true;
                        qVar.X(-1145292661);
                        qVar.p(false);
                    }
                    qVar.p(z10);
                    if (wq.n.m0(purchaseHoursState.getPurchaseError())) {
                        qVar.X(434844607);
                        String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.common_something_went_wrong);
                        String purchaseError = purchaseHoursState.getPurchaseError();
                        String R2 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.common_ok);
                        boolean f10 = qVar.f(lVar);
                        Object L2 = qVar.L();
                        if (f10 || L2 == eVar) {
                            L2 = new g(lVar, 0);
                            qVar.h0(L2);
                        }
                        ho.a aVar2 = (ho.a) L2;
                        boolean f11 = qVar.f(lVar);
                        Object L3 = qVar.L();
                        if (f11 || L3 == eVar) {
                            L3 = new g(lVar, 1);
                            qVar.h0(L3);
                        }
                        ConfirmationDialogKt.ConfirmationDialog(aVar2, (ho.a) L3, R, purchaseError, null, R2, false, qVar, 1597440, 0);
                        qVar.p(false);
                    } else {
                        qVar.X(435271601);
                        qVar.p(false);
                    }
                }
            }
            z10 = true;
            qVar.p(z10);
            if (wq.n.m0(purchaseHoursState.getPurchaseError())) {
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$1(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new g(lVar, 2);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$1$0$0(ho.l lVar) {
        lVar.invoke(new m(4));
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$1$0$0$0(PurchaseHoursViewModel purchaseHoursViewModel) {
        purchaseHoursViewModel.getClass();
        purchaseHoursViewModel.fetchData();
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$2$0$0(PurchaseHoursState purchaseHoursState, final ho.l lVar, ho.l lVar2, Activity activity, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new d(purchaseHoursState, 2), true, -1656529583), 3);
        final List<SubscriptionProduct> subscriptionProducts = purchaseHoursState.getData().getSubscriptionProducts();
        if (subscriptionProducts == null) {
            subscriptionProducts = tn.t.f33547a;
        }
        if (!subscriptionProducts.isEmpty()) {
            t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.j
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z PurchaseHoursScreenUI$lambda$5$0$2$0$0$1;
                    int intValue = ((Integer) obj3).intValue();
                    PurchaseHoursScreenUI$lambda$5$0$2$0$0$1 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$5$0$2$0$0$1(subscriptionProducts, lVar, (t1.b) obj, (u2.m) obj2, intValue);
                    return PurchaseHoursScreenUI$lambda$5$0$2$0$0$1;
                }
            }, true, 1121943916), 3);
            t1.t.c(tVar, null, null, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.m1666getLambda$1904014941$app_productionRelease(), 3);
        }
        t1.t.c(tVar, null, null, new c3.j(new fm.o(purchaseHoursState, lVar2, activity, 24), true, -1680708024), 3);
        t1.t.c(tVar, null, null, ComposableSingletons$PurchaseHoursScreenKt.INSTANCE.getLambda$1353451145$app_productionRelease(), 3);
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$2$0$0$0(PurchaseHoursState purchaseHoursState, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            r1.h g10 = r1.j.g(elevenLabsTheme.getSpacings(qVar, i11).m2350getX1D9Ej5fM());
            t I = r1.d.I(i3.q.f13017a, u.P, u.P, u.P, elevenLabsTheme.getSpacings(qVar, i11).m2358getX6D9Ej5fM(), 7);
            x a10 = w.a(g10, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            j7.d(purchaseHoursState.getData().getTitle(), null, defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getTitleMedium500(), qVar, 0, 0, 131066);
            j7.d(purchaseHoursState.getData().getSubtitle(), null, defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getSubtitleLarge400(), qVar, 0, 0, 131066);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$2$0$0$1(List list, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new k(lVar, 3);
                qVar.h0(L);
            }
            SubscriptionProductsListKt.SubscriptionProductsList(list, (ho.l) L, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$2$0$0$1$0$0(ho.l lVar, SubscriptionProduct subscriptionProduct) {
        subscriptionProduct.getClass();
        lVar.invoke(subscriptionProduct.getId());
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$2$0$0$2(PurchaseHoursState purchaseHoursState, ho.l lVar, Activity activity, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        List<OneTimeCreditsProduct> list;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            OneTimeProductsPage data = purchaseHoursState.getData();
            if (data != null) {
                list = data.getOneTimeProducts();
            } else {
                list = null;
            }
            if (list == null) {
                list = tn.t.f33547a;
            }
            boolean f10 = qVar.f(lVar) | qVar.h(activity);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new h(lVar, activity);
                qVar.h0(L);
            }
            OneTimeCreditProductsListKt.OneTimeCreditProductsList(list, (ho.l) L, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0(ho.l lVar, Activity activity, OneTimeCreditsProduct oneTimeCreditsProduct) {
        oneTimeCreditsProduct.getClass();
        lVar.invoke(new h(activity, oneTimeCreditsProduct));
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0$0(Activity activity, OneTimeCreditsProduct oneTimeCreditsProduct, PurchaseHoursViewModel purchaseHoursViewModel) {
        purchaseHoursViewModel.getClass();
        if (activity != null) {
            purchaseHoursViewModel.purchaseProduct(activity, oneTimeCreditsProduct);
        }
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$1$0(ho.l lVar) {
        lVar.invoke(new m(3));
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$1$0$0(PurchaseHoursViewModel purchaseHoursViewModel) {
        purchaseHoursViewModel.getClass();
        purchaseHoursViewModel.closePurchaseError();
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$2$0(ho.l lVar) {
        lVar.invoke(new m(5));
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$5$2$0$0(PurchaseHoursViewModel purchaseHoursViewModel) {
        purchaseHoursViewModel.getClass();
        purchaseHoursViewModel.closePurchaseError();
        return z.f31622a;
    }

    public static final z PurchaseHoursScreenUI$lambda$6(PurchaseHoursState purchaseHoursState, ho.l lVar, ho.a aVar, ho.l lVar2, ho.a aVar2, int i10, int i11, u2.m mVar, int i12) {
        PurchaseHoursScreenUI(purchaseHoursState, lVar, aVar, lVar2, aVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final /* synthetic */ void access$PurchaseHoursScreenUI(PurchaseHoursState purchaseHoursState, ho.l lVar, ho.a aVar, ho.l lVar2, ho.a aVar2, u2.m mVar, int i10, int i11) {
        PurchaseHoursScreenUI(purchaseHoursState, lVar, aVar, lVar2, aVar2, mVar, i10, i11);
    }
}

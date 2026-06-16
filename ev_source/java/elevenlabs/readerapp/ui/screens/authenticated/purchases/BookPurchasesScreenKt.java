package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import a2.n2;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.BookPurchaseHistoryItem;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.previews.CustomerFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesState;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.RowWithInvertedMeasurementKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.w0;
import q2.j7;
import q2.k5;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import t1.b0;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aI\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001ao\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u000f\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u000f\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0011¨\u0006\u0018²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "onNavigateToExplore", "Lkotlin/Function1;", "", "onNavigateToReadReturn", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookPurchasesViewModel;", "vm", "BookPurchasesScreen", "(Lho/a;Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookPurchasesViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookPurchasesState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "BookPurchasesScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookPurchasesState;Lho/a;Lho/a;Lho/l;Lho/l;Lu2/m;II)V", "ShimmerItem", "(Lu2/m;I)V", "Preview_BookPurchasesScreen_Loading", "Preview_BookPurchasesScreen_Error", "Preview_BookPurchasesScreen_Loaded", "Preview_BookPurchasesScreen_Loaded_empty", "", "menuExpanded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookPurchasesScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if ((r20 & 8) != 0) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookPurchasesScreen(ho.a aVar, ho.a aVar2, ho.l lVar, BookPurchasesViewModel bookPurchasesViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        BookPurchasesViewModel bookPurchasesViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1360992031);
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
            if (qVar.h(lVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                bookPurchasesViewModel2 = bookPurchasesViewModel;
                if (qVar.h(bookPurchasesViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                bookPurchasesViewModel2 = bookPurchasesViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            bookPurchasesViewModel2 = bookPurchasesViewModel;
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
                        bookPurchasesViewModel2 = (BookPurchasesViewModel) gg.b.j0(e0.f20562a.b(BookPurchasesViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                BookPurchasesState BookPurchasesScreen$lambda$0 = BookPurchasesScreen$lambda$0(c1.m(bookPurchasesViewModel2.getStateFlow(), qVar, 0));
                boolean h10 = qVar.h(bookPurchasesViewModel2);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new b(bookPurchasesViewModel2, 0);
                    qVar.h0(L);
                }
                BookPurchasesScreenUI(BookPurchasesScreen$lambda$0, aVar, aVar2, lVar, (ho.l) L, qVar, (i12 << 3) & 8176, 0);
            }
        } else {
            qVar.R();
        }
        BookPurchasesViewModel bookPurchasesViewModel3 = bookPurchasesViewModel2;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l(aVar, aVar2, lVar, (MviViewModel) bookPurchasesViewModel3, i10, i11, 21);
        }
    }

    private static final BookPurchasesState BookPurchasesScreen$lambda$0(s2 s2Var) {
        return (BookPurchasesState) s2Var.getValue();
    }

    public static final sn.z BookPurchasesScreen$lambda$1$0(BookPurchasesViewModel bookPurchasesViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(bookPurchasesViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreen$lambda$2(ho.a aVar, ho.a aVar2, ho.l lVar, BookPurchasesViewModel bookPurchasesViewModel, int i10, int i11, u2.m mVar, int i12) {
        BookPurchasesScreen(aVar, aVar2, lVar, bookPurchasesViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookPurchasesScreenUI(BookPurchasesState bookPurchasesState, ho.a aVar, ho.a aVar2, ho.l lVar, ho.l lVar2, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        int i13;
        int i14;
        Object obj;
        int i15;
        int i16;
        ho.l lVar3;
        int i17;
        int i18;
        Object obj2;
        int i19;
        boolean z6;
        u2.q qVar;
        ho.a aVar4;
        Object obj3;
        ho.l lVar4;
        Object obj4;
        u2.r1 r10;
        ho.a aVar5;
        Object obj5;
        ho.l lVar5;
        Object obj6;
        boolean h10;
        int i20;
        bookPurchasesState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(566900175);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar2.f(bookPurchasesState);
            } else {
                h10 = qVar2.h(bookPurchasesState);
            }
            if (h10) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            aVar3 = aVar;
            if (qVar2.h(aVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                obj = aVar2;
                if (qVar2.h(obj)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    lVar3 = lVar;
                    if (qVar2.h(lVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        obj2 = lVar2;
                        if (qVar2.h(obj2)) {
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
                            Object obj7 = u2.l.f33918a;
                            if (i21 != 0) {
                                Object L = qVar2.L();
                                if (L == obj7) {
                                    L = new d(0);
                                    qVar2.h0(L);
                                }
                                aVar5 = (ho.a) L;
                            } else {
                                aVar5 = aVar3;
                            }
                            if (i14 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == obj7) {
                                    L2 = new d(1);
                                    qVar2.h0(L2);
                                }
                                obj5 = (ho.a) L2;
                            } else {
                                obj5 = obj;
                            }
                            if (i16 != 0) {
                                Object L3 = qVar2.L();
                                if (L3 == obj7) {
                                    L3 = new k(4);
                                    qVar2.h0(L3);
                                }
                                lVar5 = (ho.l) L3;
                            } else {
                                lVar5 = lVar3;
                            }
                            if (i18 != 0) {
                                Object L4 = qVar2.L();
                                if (L4 == obj7) {
                                    L4 = new k(5);
                                    qVar2.h0(L4);
                                }
                                obj6 = (ho.l) L4;
                            } else {
                                obj6 = obj2;
                            }
                            qVar = qVar2;
                            k5.a(null, c3.k.d(1121817227, true, new e(0, aVar5), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(649354720, true, new n2(bookPurchasesState, lVar5, obj6, obj5, 7), qVar2), qVar, 805306416, 509);
                            obj4 = obj6;
                            obj3 = obj5;
                            lVar4 = lVar5;
                            aVar4 = aVar5;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            aVar4 = aVar3;
                            obj3 = obj;
                            lVar4 = lVar3;
                            obj4 = obj2;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(bookPurchasesState, aVar4, obj3, lVar4, obj4, i10, i11, 7);
                            return;
                        }
                        return;
                    }
                    obj2 = lVar2;
                    if ((i12 & 9363) != 9362) {
                    }
                    if (qVar2.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                lVar3 = lVar;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                obj2 = lVar2;
                if ((i12 & 9363) != 9362) {
                }
                if (qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            obj = aVar2;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            lVar3 = lVar;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            obj2 = lVar2;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar3 = aVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        obj = aVar2;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        lVar3 = lVar;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        obj2 = lVar2;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z BookPurchasesScreenUI$lambda$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreenUI$lambda$3$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreenUI$lambda$4(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.EchoThemeHeaderActions(null, null, c3.k.d(-718328440, true, new c(aVar, 0), qVar), null, qVar, 384, 11);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreenUI$lambda$4$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
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
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreenUI$lambda$5(BookPurchasesState bookPurchasesState, ho.l lVar, ho.l lVar2, ho.a aVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        float f10;
        float f11;
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
            i3.t o6 = r1.d.o(r1.d.D(p2.d(qVar2, 1.0f), z1Var), z1Var);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
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
            t1.z a10 = b0.a(0, qVar, 3);
            i3.t d11 = p2.d(qVar2, 1.0f);
            boolean h10 = qVar.h(bookPurchasesState) | qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar5 = u2.l.f33918a;
            if (h10 || L == eVar5) {
                L = new f(bookPurchasesState, lVar, 2);
                qVar.h0(L);
            }
            c1.c(d11, a10, null, false, null, null, null, false, null, (ho.l) L, qVar, 6, 508);
            u2.q qVar3 = qVar;
            if (bookPurchasesState instanceof BookPurchasesState.Error) {
                qVar3.X(906421762);
                String error = ((BookPurchasesState.Error) bookPurchasesState).getError();
                boolean f12 = qVar3.f(lVar2);
                Object L2 = qVar3.L();
                if (f12 || L2 == eVar5) {
                    L2 = new a(lVar2, 0);
                    qVar3.h0(L2);
                }
                ErrorScreenKt.m1837ErrorScreenuDo3WH8(null, null, error, 0L, (ho.a) L2, qVar3, 0, 11);
                qVar3.p(false);
                z10 = true;
            } else if ((bookPurchasesState instanceof BookPurchasesState.Loaded) && ((BookPurchasesState.Loaded) bookPurchasesState).getItems().isEmpty()) {
                qVar3.X(906709008);
                i3.t d12 = p2.d(qVar2, 1.0f);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i13 = ElevenLabsTheme.$stable;
                i3.t F = r1.d.F(d12, elevenLabsTheme.getSpacings(qVar3, i13).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar3, i13).m2356getX4D9Ej5fM());
                r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar3, 48);
                int hashCode2 = Long.hashCode(qVar3.T);
                c3.o l7 = qVar3.l();
                i3.t c10 = i3.a.c(F, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar, a11, qVar3);
                u2.r.J(eVar2, l7, qVar3);
                defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
                u2.r.J(eVar4, c10, qVar3);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f10 = Float.MAX_VALUE;
                } else {
                    f10 = 1.0f;
                }
                r1.d.g(new m1(f10, true), qVar3);
                l1.n.c(kd.a.M(R.drawable.empty_state_notes, qVar3, 0), null, p2.f(qVar2, 188), null, null, t2.u.P, null, qVar3, u3.c.$stable | 432, 120);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar3, i13).m2360getX8D9Ej5fM()), qVar3);
                j7.d(kj.c.R(qVar3, R.string.book_purchase_history_empty_title), null, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i13).getTitleMedium700(), qVar3, 0, 0, 130046);
                ib.i.A(elevenLabsTheme, qVar3, i13, qVar2, qVar3);
                j7.d(kj.c.R(qVar3, R.string.book_purchase_history_empty_description), null, ib.i.w(elevenLabsTheme, qVar3, i13), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i13).getBodySmall500(), qVar3, 0, 0, 130042);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar3, i13).m2360getX8D9Ej5fM()), qVar3);
                i3.t e10 = p2.e(qVar2, 1.0f);
                r1.x a12 = r1.w.a(ib.i.n(elevenLabsTheme, qVar3, i13), i3.d.B0, qVar3, 0);
                int hashCode3 = Long.hashCode(qVar3.T);
                c3.o l10 = qVar3.l();
                i3.t c11 = i3.a.c(e10, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar, a12, qVar3);
                u2.r.J(eVar2, l10, qVar3);
                defpackage.f.u(hashCode3, qVar3, eVar3, qVar3, dVar);
                u2.r.J(eVar4, c11, qVar3);
                FullWidthButtonKt.FullWidthButton(kj.c.R(qVar3, R.string.book_purchase_history_empty_cta), aVar, p2.e(qVar2, 1.0f), FullWidthButtonSize.Medium, FullWidthButtonVariant.Subscriptions, null, false, false, false, qVar3, 28032, 480);
                qVar3 = qVar3;
                qVar3.p(true);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f11 = Float.MAX_VALUE;
                } else {
                    f11 = 1.0f;
                }
                z10 = true;
                r1.d.g(new m1(f11, true), qVar3);
                qVar3.p(true);
                qVar3.p(false);
            } else {
                z10 = true;
                qVar3.X(908842428);
                qVar3.p(false);
            }
            qVar3.p(z10);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreenUI$lambda$5$0$0$0(BookPurchasesState bookPurchasesState, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        if (bookPurchasesState instanceof BookPurchasesState.Loading) {
            t1.t.c(tVar, null, null, ComposableSingletons$BookPurchasesScreenKt.INSTANCE.m1634getLambda$2136912234$app_productionRelease(), 3);
        }
        if (bookPurchasesState instanceof BookPurchasesState.Loaded) {
            final List<BookPurchaseHistoryItem> items = ((BookPurchasesState.Loaded) bookPurchasesState).getItems();
            final BookPurchasesScreenKt$BookPurchasesScreenUI$lambda$5$0$0$0$$inlined$items$default$1 bookPurchasesScreenKt$BookPurchasesScreenUI$lambda$5$0$0$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt$BookPurchasesScreenUI$lambda$5$0$0$0$$inlined$items$default$1
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((BookPurchaseHistoryItem) obj);
                }

                @Override // ho.l
                public final Void invoke(BookPurchaseHistoryItem bookPurchaseHistoryItem) {
                    return null;
                }
            };
            ((t1.i) tVar).u(items.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt$BookPurchasesScreenUI$lambda$5$0$0$0$$inlined$items$default$3
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(items.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt$BookPurchasesScreenUI$lambda$5$0$0$0$$inlined$items$default$4
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
                        BookPurchaseHistoryItem bookPurchaseHistoryItem = (BookPurchaseHistoryItem) items.get(i10);
                        qVar.X(1199820474);
                        r1.e eVar = r1.j.f29230c;
                        i3.j jVar = i3.d.B0;
                        r1.x a10 = r1.w.a(eVar, jVar, qVar, 0);
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.q qVar2 = i3.q.f13017a;
                        i3.t c5 = i3.a.c(qVar2, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        h4.e eVar2 = h4.g.f11907f;
                        u2.r.J(eVar2, a10, qVar);
                        h4.e eVar3 = h4.g.f11906e;
                        u2.r.J(eVar3, l4, qVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar4 = h4.g.f11908g;
                        u2.r.y(qVar, valueOf, eVar4);
                        h4.d dVar = h4.g.f11909h;
                        u2.r.F(dVar, qVar);
                        h4.e eVar5 = h4.g.f11905d;
                        u2.r.J(eVar5, c5, qVar);
                        i3.t e10 = p2.e(qVar2, 1.0f);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        int i15 = ElevenLabsTheme.$stable;
                        i3.t F = r1.d.F(e10, elevenLabsTheme.getSpacings(qVar, i15).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM());
                        r1.x a11 = r1.w.a(eVar, jVar, qVar, 0);
                        int hashCode2 = Long.hashCode(qVar.T);
                        c3.o l7 = qVar.l();
                        i3.t c10 = i3.a.c(F, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(eVar2, a11, qVar);
                        u2.r.J(eVar3, l7, qVar);
                        defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                        u2.r.J(eVar5, c10, qVar);
                        RowWithInvertedMeasurementKt.RowWithInvertedMeasurement(p2.e(qVar2, 1.0f), ib.i.n(elevenLabsTheme, qVar, i15), i3.d.f13005z0, c3.k.d(-1751258865, true, new BookPurchasesScreenKt$BookPurchasesScreenUI$6$1$1$1$1$1$1$1(bookPurchaseHistoryItem, lVar), qVar), qVar, 3462, 0);
                        qVar.p(true);
                        DividerKt.m1828DividerLightiJQMabo(null, 0L, qVar, 0, 3);
                        qVar.p(true);
                        qVar.p(false);
                        return;
                    }
                    qVar.R();
                }

                @Override // ho.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                    return sn.z.f31622a;
                }
            }, true, 802480018));
        }
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreenUI$lambda$5$0$1$0(ho.l lVar) {
        lVar.invoke(new k(3));
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreenUI$lambda$5$0$1$0$0(BookPurchasesViewModel bookPurchasesViewModel) {
        bookPurchasesViewModel.getClass();
        bookPurchasesViewModel.load();
        return sn.z.f31622a;
    }

    public static final sn.z BookPurchasesScreenUI$lambda$6(BookPurchasesState bookPurchasesState, ho.a aVar, ho.a aVar2, ho.l lVar, ho.l lVar2, int i10, int i11, u2.m mVar, int i12) {
        BookPurchasesScreenUI(bookPurchasesState, aVar, aVar2, lVar, lVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_BookPurchasesScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(67078743);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookPurchasesScreenUI(new BookPurchasesState.Error("Some error"), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 5);
        }
    }

    public static final sn.z Preview_BookPurchasesScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookPurchasesScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_BookPurchasesScreen_Loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1479026492);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookPurchasesScreenUI(new BookPurchasesState.Loaded(CustomerFactoryKt.stubBookPurchaseHistoryItems()), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 9);
        }
    }

    public static final sn.z Preview_BookPurchasesScreen_Loaded$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookPurchasesScreen_Loaded(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_BookPurchasesScreen_Loaded_empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-132587602);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookPurchasesScreenUI(new BookPurchasesState.Loaded(tn.t.f33547a), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 7);
        }
    }

    public static final sn.z Preview_BookPurchasesScreen_Loaded_empty$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookPurchasesScreen_Loaded_empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_BookPurchasesScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-592922141);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookPurchasesScreenUI(BookPurchasesState.Loading.INSTANCE, null, null, null, null, qVar, 6, 30);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 6);
        }
    }

    public static final sn.z Preview_BookPurchasesScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookPurchasesScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ShimmerItem(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1462454922);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t v9 = p2.v(p2.e(qVar2, 1.0f), null, 3);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            i3.t a10 = fl.h.a(r1.d.F(v9, elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM()), qVar);
            i3.k kVar = i3.d.f13005z0;
            u0 u0Var = r1.j.f29228a;
            k2 a11 = i2.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM()), kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(a10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a11, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            r1.x a12 = r1.w.a(ib.i.n(elevenLabsTheme, qVar, i11), i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            float f10 = 12;
            i3.t f11 = p2.f(p2.e(qVar2, 0.5f), f10);
            long m2067getHighlight0d7_KjU = elevenLabsTheme.getColor(qVar, i11).getLoadingShimmer().m2067getHighlight0d7_KjU();
            w0 w0Var = h0.f26395b;
            r1.p.a(l1.n.h(f11, m2067getHighlight0d7_KjU, w0Var), qVar, 0);
            r1.p.a(l1.n.h(p2.f(p2.e(qVar2, 0.4f), 10), elevenLabsTheme.getColor(qVar, i11).getLoadingShimmer().m2067getHighlight0d7_KjU(), w0Var), qVar, 0);
            qVar.p(true);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            r1.d.g(new m1(1.0f, true), qVar);
            r1.p.a(l1.n.h(p2.f(p2.s(qVar2, 50), f10), elevenLabsTheme.getColor(qVar, i11).getLoadingShimmer().m2067getHighlight0d7_KjU(), w0Var), qVar, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 8);
        }
    }

    public static final sn.z ShimmerItem$lambda$1(int i10, u2.m mVar, int i11) {
        ShimmerItem(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

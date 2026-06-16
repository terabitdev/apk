package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import a2.a2;
import androidx.lifecycle.r1;
import androidx.room.m0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.BookRefundReason;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import io.elevenlabs.ui.components.SelectKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import u2.s2;
import u2.z0;
import y4.d0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aI\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022 \b\u0002\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u000f\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u001c²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"", "readId", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookRefundViewModel;", "vm", "BookRefundScreen", "(Ljava/lang/String;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookRefundViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookRefundState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "BookRefundScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookRefundState;Lho/a;Lho/l;Lu2/m;II)V", "Lio/elevenlabs/domain/model/BookRefundReason;", "readableText", "(Lio/elevenlabs/domain/model/BookRefundReason;Lu2/m;I)Ljava/lang/String;", "Preview_BookRefundScreen_Idle", "(Lu2/m;I)V", "Preview_BookRefundScreen_Loading", "Preview_BookRefundScreen_ReasonSelected", "Preview_BookRefundScreen_ReasonSelected_Other", "", "showRefundReasonSelect", "inputReasonText", "", "alpha", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookRefundScreenKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookRefundReason.values().length];
            try {
                iArr[BookRefundReason.NarratorDislike.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookRefundReason.PoorAudioQuality.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookRefundReason.ContentNotExpected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BookRefundReason.StoryNotEnjoyed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BookRefundReason.AccidentalPurchase.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BookRefundReason.AlreadyOwn.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BookRefundReason.WrongBook.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BookRefundReason.DifferentFormat.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BookRefundReason.WrongLanguage.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BookRefundReason.ChangedMind.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BookRefundReason.Other.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if ((r20 & 4) != 0) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookRefundScreen(String str, ho.a aVar, BookRefundViewModel bookRefundViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        BookRefundViewModel bookRefundViewModel2;
        boolean z6;
        q7.c cVar;
        boolean z10;
        int i13;
        int i14;
        int i15;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(126157219);
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
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                bookRefundViewModel2 = bookRefundViewModel;
                if (qVar.h(bookRefundViewModel2)) {
                    i13 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i13;
                }
            } else {
                bookRefundViewModel2 = bookRefundViewModel;
            }
            i13 = 128;
            i12 |= i13;
        } else {
            bookRefundViewModel2 = bookRefundViewModel;
        }
        boolean z11 = true;
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
                        bookRefundViewModel2 = (BookRefundViewModel) gg.b.j0(e0.f20562a.b(BookRefundViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                BookRefundViewModel bookRefundViewModel3 = bookRefundViewModel2;
                qVar.q();
                boolean h10 = qVar.h(bookRefundViewModel3);
                if ((i12 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z10 | h10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z12 || L == eVar) {
                    L = new BookRefundScreenKt$BookRefundScreen$1$1(bookRefundViewModel3, str, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, str, qVar);
                BookRefundState bookRefundState = (BookRefundState) c1.m(bookRefundViewModel3.getStateFlow(), qVar, 0).getValue();
                Boolean valueOf = Boolean.valueOf(bookRefundState.getGoBack());
                boolean f10 = qVar.f(bookRefundState);
                int i16 = i12 & 112;
                if (i16 != 32) {
                    z11 = false;
                }
                boolean z13 = f10 | z11;
                Object L2 = qVar.L();
                if (z13 || L2 == eVar) {
                    L2 = new BookRefundScreenKt$BookRefundScreen$2$1(bookRefundState, aVar, null);
                    qVar.h0(L2);
                }
                u2.r.f((ho.p) L2, valueOf, qVar);
                boolean h11 = qVar.h(bookRefundViewModel3);
                Object L3 = qVar.L();
                if (h11 || L3 == eVar) {
                    L3 = new j(bookRefundViewModel3, 0);
                    qVar.h0(L3);
                }
                BookRefundScreenUI(bookRefundState, aVar, (ho.l) L3, qVar, i16, 0);
                bookRefundViewModel2 = bookRefundViewModel3;
            }
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(str, aVar, bookRefundViewModel2, i10, i11, 12);
        }
    }

    public static final sn.z BookRefundScreen$lambda$2$0(BookRefundViewModel bookRefundViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(bookRefundViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreen$lambda$3(String str, ho.a aVar, BookRefundViewModel bookRefundViewModel, int i10, int i11, u2.m mVar, int i12) {
        BookRefundScreen(str, aVar, bookRefundViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookRefundScreenUI(BookRefundState bookRefundState, ho.a aVar, ho.l lVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        int i13;
        int i14;
        ho.l lVar2;
        int i15;
        boolean z6;
        u2.q qVar;
        ho.a aVar3;
        ho.l lVar3;
        u2.r1 r10;
        ho.a aVar4;
        ho.l lVar4;
        int i16;
        bookRefundState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(922865172);
        if ((i10 & 6) == 0) {
            if (qVar2.f(bookRefundState)) {
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
            aVar2 = aVar;
            if (qVar2.h(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                lVar2 = lVar;
                if (qVar2.h(lVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
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
                    Object obj = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar2.L();
                        if (L == obj) {
                            L = new d(2);
                            qVar2.h0(L);
                        }
                        aVar4 = (ho.a) L;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == obj) {
                            L2 = new k(6);
                            qVar2.h0(L2);
                        }
                        lVar4 = (ho.l) L2;
                    } else {
                        lVar4 = lVar2;
                    }
                    qVar = qVar2;
                    k5.a(null, c3.k.d(787380184, true, new e(1, aVar4), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(-1473029021, true, new i(bookRefundState, lVar4), qVar2), qVar, 805306416, 509);
                    ho.a aVar5 = aVar4;
                    lVar3 = lVar4;
                    aVar3 = aVar5;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    aVar3 = aVar2;
                    lVar3 = lVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(bookRefundState, aVar3, lVar3, i10, i11, 11);
                    return;
                }
                return;
            }
            lVar2 = lVar;
            if ((i12 & 147) != 146) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar2 = aVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        lVar2 = lVar;
        if ((i12 & 147) != 146) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z BookRefundScreenUI$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$2(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, kj.c.R(qVar, R.string.book_purchase_refund_title), c3.k.d(1658932403, true, new c(aVar, 1), qVar), (ho.q) null, (i3.f) null, qVar, 384, 25);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$2$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, t2.u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3(BookRefundState bookRefundState, ho.l lVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        String readableText;
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
            i3.t o6 = r1.d.o(r1.d.D(p2.d(qVar2, 1.0f), z1Var), z1Var);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t f10 = ib.i.f(elevenLabsTheme, qVar, i13, o6);
            u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM()), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f10, qVar);
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
            j7.d(kj.c.R(qVar, R.string.book_purchase_refund_reason_description), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBody(), qVar, 0, 0, 131070);
            u2.q qVar3 = qVar;
            Object L = qVar3.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = u2.r.A(Boolean.FALSE);
                qVar3.h0(L);
            }
            z0 z0Var = (z0) L;
            BookRefundReason refundReason = bookRefundState.getRefundReason();
            if (refundReason == null) {
                qVar3.X(-1053502650);
                qVar3.p(false);
                readableText = null;
            } else {
                qVar3.X(-588173285);
                readableText = readableText(refundReason, qVar3, 0);
                qVar3.p(false);
            }
            if (readableText == null) {
                qVar3.X(-588172031);
                readableText = kj.c.R(qVar3, R.string.book_purchase_refund_reason);
            } else {
                qVar3.X(-588173829);
            }
            qVar3.p(false);
            Object L2 = qVar3.L();
            if (L2 == eVar) {
                L2 = new h(z0Var, 3);
                qVar3.h0(L2);
            }
            SelectKt.Select(readableText, null, (ho.a) L2, null, qVar3, 384, 10);
            if (bookRefundState.getRefundReason() == BookRefundReason.Other) {
                qVar3.X(-1053279480);
                Object L3 = qVar3.L();
                if (L3 == eVar) {
                    L3 = u2.r.A("");
                    qVar3.h0(L3);
                }
                z0 z0Var2 = (z0) L3;
                String BookRefundScreenUI$lambda$3$0$5 = BookRefundScreenUI$lambda$3$0$5(z0Var2);
                boolean f11 = qVar3.f(lVar);
                Object L4 = qVar3.L();
                if (f11 || L4 == eVar) {
                    L4 = new f(lVar, z0Var2, 4);
                    qVar3.h0(L4);
                }
                InputKt.Input(BookRefundScreenUI$lambda$3$0$5, (ho.l) L4, p2.e(qVar2, 1.0f), (i3.t) null, (InputState) null, (String) null, (String) null, "", (ho.p) null, (a2) null, (a2.z1) null, (d0) null, false, 0, (u2.m) qVar3, 12583296, 0, 16248);
                qVar3 = qVar3;
                qVar3.p(false);
            } else {
                qVar3.X(-1052867211);
                qVar3.p(false);
            }
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            r1.d.g(new m1(1.0f, true), qVar3);
            String R = kj.c.R(qVar3, R.string.book_purchase_refund_return);
            boolean isLoading = bookRefundState.isLoading();
            if (bookRefundState.getRefundReason() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            i3.t e10 = p2.e(qVar2, 1.0f);
            boolean f12 = qVar3.f(lVar);
            Object L5 = qVar3.L();
            if (f12 || L5 == eVar) {
                L5 = new a(lVar, 1);
                qVar3.h0(L5);
            }
            u2.q qVar4 = qVar3;
            FullWidthButtonKt.FullWidthButton(R, (ho.a) L5, e10, null, null, null, isLoading, z10, false, qVar4, 384, 312);
            u2.q qVar5 = qVar4;
            if (BookRefundScreenUI$lambda$3$0$1(z0Var)) {
                qVar5.X(-1052355556);
                Object L6 = qVar5.L();
                if (L6 == eVar) {
                    L6 = new h(z0Var, 1);
                    qVar5.h0(L6);
                }
                BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, (ho.a) L6, false, (ho.r) c3.k.d(-9248727, true, new io.elevenlabs.readerapp.core.h(z0Var, lVar, bookRefundState, 13), qVar5), (u2.m) qVar5, 1597440, 47);
                qVar5 = qVar5;
                qVar5.p(false);
            } else {
                qVar5.X(-1049010315);
                qVar5.p(false);
            }
            qVar5.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final boolean BookRefundScreenUI$lambda$3$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final sn.z BookRefundScreenUI$lambda$3$0$10(z0 z0Var, ho.l lVar, BookRefundState bookRefundState, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        z0 z0Var2 = z0Var;
        ho.l lVar2 = lVar;
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = new h(z0Var2, 0);
            qVar.h0(L);
        }
        boolean z6 = true;
        boolean z10 = 0;
        m0.a((ho.a) L, true, 54, qVar, 0);
        i3.q qVar2 = i3.q.f13017a;
        i3.t e10 = p2.e(qVar2, 1.0f);
        r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
        int hashCode = Long.hashCode(qVar.T);
        c3.o l4 = qVar.l();
        i3.t c5 = i3.a.c(e10, qVar);
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
        HeaderActionsKt.HeaderActions((i3.t) null, kj.c.R(qVar, R.string.book_purchase_refund_reason), c3.k.d(-1297505030, true, new c(z0Var2, 5), qVar), (ho.q) null, (i3.f) null, qVar, 384, 25);
        qVar.X(-1353602443);
        int i11 = 0;
        for (Object obj : BookRefundReason.getEntries()) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                BookRefundReason bookRefundReason = (BookRefundReason) obj;
                String readableText = readableText(bookRefundReason, qVar, z10);
                boolean f10 = qVar.f(lVar2) | qVar.d(bookRefundReason.ordinal());
                Object L2 = qVar.L();
                if (f10 || L2 == eVar) {
                    L2 = new c3.b(lVar2, bookRefundReason, z0Var2, 24);
                    qVar.h0(L2);
                }
                i3.q qVar3 = qVar2;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(readableText, (ho.a) L2, null, 0L, false, 0, null, false, null, c3.k.d(2104445205, z6, new i(bookRefundReason, bookRefundState, 1), qVar), qVar, 805306368, 508);
                DividerKt.m1827DivideriJQMabo(r1.d.G(qVar3, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), t2.u.P, 2), 0L, qVar, 0, 2);
                qVar2 = qVar3;
                z10 = z10;
                i11 = i12;
                eVar = eVar;
                z6 = true;
                z0Var2 = z0Var;
                lVar2 = lVar;
            } else {
                ig.f.U();
                throw null;
            }
        }
        qVar.p(z10);
        ib.i.C(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable, qVar2, qVar);
        qVar.p(true);
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$10$0$0(z0 z0Var) {
        BookRefundScreenUI$lambda$3$0$2(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$10$1$0(z0 z0Var, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new h(z0Var, 2);
                qVar.h0(L);
            }
            BackButtonWithBackgroundKt.BackButtonWithBackground((ho.a) L, t2.u.P, qVar, 6, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$10$1$0$0$0(z0 z0Var) {
        BookRefundScreenUI$lambda$3$0$2(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$10$1$1$0$0(ho.l lVar, BookRefundReason bookRefundReason, z0 z0Var) {
        lVar.invoke(new f(bookRefundReason, z0Var, 3));
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$10$1$1$0$0$0(BookRefundReason bookRefundReason, z0 z0Var, BookRefundViewModel bookRefundViewModel) {
        bookRefundViewModel.getClass();
        bookRefundViewModel.selectReason(bookRefundReason);
        BookRefundScreenUI$lambda$3$0$2(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$10$1$1$1(BookRefundReason bookRefundReason, BookRefundState bookRefundState, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        float f10;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            i3.t f11 = ib.i.f(elevenLabsTheme, qVar, i11, e10);
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f11, qVar);
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
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t I = r1.d.I(new m1(1.0f, true), t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM(), t2.u.P, 11);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(I, qVar);
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
            j7.d(readableText(bookRefundReason, qVar, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium700(), qVar, 0, 0, 131070);
            qVar.p(true);
            if (bookRefundReason == bookRefundState.getRefundReason()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.checkmark_1, qVar, 0), null, r1.d.E(l1.n.h(p2.o(m3.h.a(qVar2, BookRefundScreenUI$lambda$3$0$10$1$1$1$0$1(j1.f.b(f10, null, "alpha", qVar, 3072, 22))), 24), defpackage.f.b(elevenLabsTheme, qVar, i11), elevenLabsTheme.getShapes(qVar, i11).getFull()), 5), ib.i.d(elevenLabsTheme, qVar, i11), qVar, u3.c.$stable | 48, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final float BookRefundScreenUI$lambda$3$0$10$1$1$1$0$1(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    private static final void BookRefundScreenUI$lambda$3$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$3$0(z0 z0Var) {
        BookRefundScreenUI$lambda$3$0$2(z0Var, true);
        return sn.z.f31622a;
    }

    private static final String BookRefundScreenUI$lambda$3$0$5(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$7$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new p(str, 1));
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$7$0$0(String str, BookRefundViewModel bookRefundViewModel) {
        bookRefundViewModel.getClass();
        bookRefundViewModel.setInputReasonText(str);
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$8$0(ho.l lVar) {
        lVar.invoke(new k(7));
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$8$0$0(BookRefundViewModel bookRefundViewModel) {
        bookRefundViewModel.getClass();
        bookRefundViewModel.proceed();
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$3$0$9$0(z0 z0Var) {
        BookRefundScreenUI$lambda$3$0$2(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z BookRefundScreenUI$lambda$4(BookRefundState bookRefundState, ho.a aVar, ho.l lVar, int i10, int i11, u2.m mVar, int i12) {
        BookRefundScreenUI(bookRefundState, aVar, lVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_BookRefundScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(162160125);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookRefundScreenUI(new BookRefundState(null, false, null, null, false, 31, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 11);
        }
    }

    public static final sn.z Preview_BookRefundScreen_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookRefundScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_BookRefundScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(613280555);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookRefundScreenUI(new BookRefundState(null, true, BookRefundReason.WrongBook, null, false, 25, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 13);
        }
    }

    public static final sn.z Preview_BookRefundScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookRefundScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_BookRefundScreen_ReasonSelected(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-226803288);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookRefundScreenUI(new BookRefundState(null, false, BookRefundReason.WrongBook, null, false, 27, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 12);
        }
    }

    public static final sn.z Preview_BookRefundScreen_ReasonSelected$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookRefundScreen_ReasonSelected(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_BookRefundScreen_ReasonSelected_Other(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1303361241);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookRefundScreenUI(new BookRefundState(null, false, BookRefundReason.Other, null, false, 27, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 10);
        }
    }

    public static final sn.z Preview_BookRefundScreen_ReasonSelected_Other$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookRefundScreen_ReasonSelected_Other(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final String readableText(BookRefundReason bookRefundReason, u2.m mVar, int i10) {
        bookRefundReason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[bookRefundReason.ordinal()]) {
            case 1:
                u2.q qVar = (u2.q) mVar;
                qVar.X(334040454);
                String R = kj.c.R(qVar, R.string.book_purchase_refund_reason_narrator_dislike);
                qVar.p(false);
                return R;
            case 2:
                u2.q qVar2 = (u2.q) mVar;
                qVar2.X(334043464);
                String R2 = kj.c.R(qVar2, R.string.book_purchase_refund_reason_poor_audio_quality);
                qVar2.p(false);
                return R2;
            case 3:
                u2.q qVar3 = (u2.q) mVar;
                qVar3.X(334046602);
                String R3 = kj.c.R(qVar3, R.string.book_purchase_refund_reason_content_not_expected);
                qVar3.p(false);
                return R3;
            case 4:
                u2.q qVar4 = (u2.q) mVar;
                qVar4.X(334049703);
                String R4 = kj.c.R(qVar4, R.string.book_purchase_refund_reason_story_not_enjoyed);
                qVar4.p(false);
                return R4;
            case 5:
                u2.q qVar5 = (u2.q) mVar;
                qVar5.X(334052809);
                String R5 = kj.c.R(qVar5, R.string.book_purchase_refund_reason_accidental_purchase);
                qVar5.p(false);
                return R5;
            case 6:
                u2.q qVar6 = (u2.q) mVar;
                qVar6.X(334055713);
                String R6 = kj.c.R(qVar6, R.string.book_purchase_refund_reason_already_own);
                qVar6.p(false);
                return R6;
            case 7:
                u2.q qVar7 = (u2.q) mVar;
                qVar7.X(334058336);
                String R7 = kj.c.R(qVar7, R.string.book_purchase_refund_reason_wrong_book);
                qVar7.p(false);
                return R7;
            case 8:
                u2.q qVar8 = (u2.q) mVar;
                qVar8.X(334061126);
                String R8 = kj.c.R(qVar8, R.string.book_purchase_refund_reason_different_format);
                qVar8.p(false);
                return R8;
            case 9:
                u2.q qVar9 = (u2.q) mVar;
                qVar9.X(334064036);
                String R9 = kj.c.R(qVar9, R.string.book_purchase_refund_reason_wrong_language);
                qVar9.p(false);
                return R9;
            case 10:
                u2.q qVar10 = (u2.q) mVar;
                qVar10.X(334066818);
                String R10 = kj.c.R(qVar10, R.string.book_purchase_refund_reason_changed_mind);
                qVar10.p(false);
                return R10;
            case 11:
                u2.q qVar11 = (u2.q) mVar;
                qVar11.X(334069339);
                String R11 = kj.c.R(qVar11, R.string.book_purchase_refund_reason_other);
                qVar11.p(false);
                return R11;
            default:
                throw com.google.android.gms.internal.play_billing.b.h(334040201, (u2.q) mVar, false);
        }
    }
}

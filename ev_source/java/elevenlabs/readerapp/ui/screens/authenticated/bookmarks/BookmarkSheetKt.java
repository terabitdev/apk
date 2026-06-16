package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ActionRowKt;
import io.elevenlabs.readerapp.ui.previews.BookmarksFactoryKt;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a_\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0017²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"", "bookmarkId", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/Bookmark;", "onPlayClick", "Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkViewModel;", "vm", "BookmarkSheet", "(Ljava/lang/String;Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkViewModel;Lu2/m;II)V", BackgroundPlayerAction.Bookmark.ACTION_ID, "action", "onClose", "BookmarkDialogUI", "(Lio/elevenlabs/domain/model/Bookmark;Lho/l;Lho/a;Lho/l;Lu2/m;II)V", "Preview_BookmarkSheet", "(Lu2/m;I)V", "Preview_BookmarkSheetShareable", "", "showEditSheet", "showDeleteConfirmation", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookmarkSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BookmarkDialogUI(Bookmark bookmark, ho.l lVar, ho.a aVar, ho.l lVar2, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        int i16;
        ho.l lVar4;
        int i17;
        boolean z6;
        ho.l lVar5;
        ho.a aVar3;
        ho.l lVar6;
        r1 r10;
        ho.l lVar7;
        ho.a aVar4;
        ho.l lVar8;
        boolean z10;
        boolean z11;
        ho.a aVar5;
        ho.l lVar9;
        boolean z12;
        int i18;
        q qVar = (q) mVar;
        qVar.Z(-1364550909);
        if ((i10 & 6) == 0) {
            if (qVar.h(bookmark)) {
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
            lVar3 = lVar;
            if (qVar.h(lVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar2 = aVar;
                if (qVar.h(aVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    lVar4 = lVar2;
                    if (qVar.h(lVar4)) {
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
                        u2.e eVar = u2.l.f33918a;
                        if (i19 != 0) {
                            Object L = qVar.L();
                            if (L == eVar) {
                                L = new i(3);
                                qVar.h0(L);
                            }
                            lVar7 = (ho.l) L;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i14 != 0) {
                            Object L2 = qVar.L();
                            if (L2 == eVar) {
                                L2 = new a(6);
                                qVar.h0(L2);
                            }
                            aVar4 = (ho.a) L2;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i16 != 0) {
                            Object L3 = qVar.L();
                            if (L3 == eVar) {
                                L3 = new i(4);
                                qVar.h0(L3);
                            }
                            lVar8 = (ho.l) L3;
                        } else {
                            lVar8 = lVar4;
                        }
                        Object L4 = qVar.L();
                        if (L4 == eVar) {
                            L4 = r.A(Boolean.FALSE);
                            qVar.h0(L4);
                        }
                        z0 z0Var = (z0) L4;
                        Object L5 = qVar.L();
                        if (L5 == eVar) {
                            L5 = r.A(Boolean.FALSE);
                            qVar.h0(L5);
                        }
                        z0 z0Var2 = (z0) L5;
                        x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                        ho.a aVar6 = aVar4;
                        int hashCode = Long.hashCode(qVar.T);
                        o l4 = qVar.l();
                        i3.q qVar2 = i3.q.f13017a;
                        t c5 = i3.a.c(qVar2, qVar);
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
                        String R = kj.c.R(qVar, R.string.bookmark_options_sheet_listen);
                        int i20 = io.elevenlabs.ui.R.drawable.headphones;
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        int i21 = ElevenLabsTheme.$stable;
                        long b10 = defpackage.f.b(elevenLabsTheme, qVar, i21);
                        t e10 = p2.e(qVar2, 1.0f);
                        if ((i12 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean h10 = z10 | qVar.h(bookmark);
                        Object L6 = qVar.L();
                        if (h10 || L6 == eVar) {
                            L6 = new a2.q(lVar8, bookmark, 20);
                            qVar.h0(L6);
                        }
                        ho.l lVar10 = lVar8;
                        ho.l lVar11 = lVar7;
                        ActionRowKt.m1021ActionRowT042LqI(i20, R, b10, (ho.a) L6, e10, qVar, 24576, 0);
                        String R2 = kj.c.R(qVar, R.string.bookmark_options_sheet_edit);
                        int i22 = io.elevenlabs.ui.R.drawable.pencil;
                        long b11 = defpackage.f.b(elevenLabsTheme, qVar, i21);
                        t e11 = p2.e(qVar2, 1.0f);
                        Object L7 = qVar.L();
                        if (L7 == eVar) {
                            L7 = new b(z0Var, 3);
                            qVar.h0(L7);
                        }
                        ActionRowKt.m1021ActionRowT042LqI(i22, R2, b11, (ho.a) L7, e11, qVar, 27648, 0);
                        String R3 = kj.c.R(qVar, R.string.bookmark_options_sheet_delete);
                        int i23 = io.elevenlabs.ui.R.drawable.trash_can;
                        long m2015getDangerConfirm0d7_KjU = elevenLabsTheme.getColor(qVar, i21).getButtonBackground().m2015getDangerConfirm0d7_KjU();
                        t e12 = p2.e(qVar2, 1.0f);
                        Object L8 = qVar.L();
                        if (L8 == eVar) {
                            L8 = new b(z0Var2, 4);
                            qVar.h0(L8);
                        }
                        ActionRowKt.m1021ActionRowT042LqI(i23, R3, m2015getDangerConfirm0d7_KjU, (ho.a) L8, e12, qVar, 27648, 0);
                        boolean z13 = true;
                        qVar.p(true);
                        if (BookmarkDialogUI$lambda$4(z0Var)) {
                            qVar.X(530650354);
                            String bookmarkId = bookmark.getBookmarkId();
                            Object L9 = qVar.L();
                            if (L9 == eVar) {
                                L9 = new b(z0Var, 5);
                                qVar.h0(L9);
                            }
                            EditBookmarkSheetKt.EditBookmarkSheet(bookmarkId, (ho.a) L9, null, qVar, 48, 4);
                            z11 = false;
                            qVar.p(false);
                        } else {
                            z11 = false;
                            qVar.X(530785855);
                            qVar.p(false);
                        }
                        if (BookmarkDialogUI$lambda$7(z0Var2)) {
                            qVar.X(530840105);
                            Object L10 = qVar.L();
                            if (L10 == eVar) {
                                L10 = new b(z0Var2, 2);
                                qVar.h0(L10);
                            }
                            ho.a aVar7 = (ho.a) L10;
                            if ((i12 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i12 & 896) != 256) {
                                z13 = z11;
                            }
                            boolean z14 = z12 | z13;
                            Object L11 = qVar.L();
                            if (!z14 && L11 != eVar) {
                                aVar5 = aVar6;
                                lVar9 = lVar11;
                            } else {
                                aVar5 = aVar6;
                                lVar9 = lVar11;
                                L11 = new c3.b(lVar9, aVar5, z0Var2, 12);
                                qVar.h0(L11);
                            }
                            ConfirmationDialogKt.ConfirmationDialog(aVar7, (ho.a) L11, kj.c.R(qVar, R.string.bookmark_delete_confirmation_title), kj.c.R(qVar, R.string.bookmark_delete_confirmation_message), kj.c.R(qVar, R.string.common_cancel), kj.c.R(qVar, R.string.bookmark_delete_confirmation_confirm), true, qVar, 1572870, 0);
                            qVar = qVar;
                            qVar.p(z11);
                        } else {
                            aVar5 = aVar6;
                            lVar9 = lVar11;
                            qVar.X(531476287);
                            qVar.p(z11);
                        }
                        lVar5 = lVar9;
                        aVar3 = aVar5;
                        lVar6 = lVar10;
                    } else {
                        qVar.R();
                        lVar5 = lVar3;
                        aVar3 = aVar2;
                        lVar6 = lVar4;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) bookmark, lVar5, aVar3, (Object) lVar6, i10, i11, 9);
                        return;
                    }
                    return;
                }
                lVar4 = lVar2;
                if ((i12 & 1171) == 1170) {
                }
                if (!qVar.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            aVar2 = aVar;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            lVar4 = lVar2;
            if ((i12 & 1171) == 1170) {
            }
            if (!qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        lVar3 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        lVar4 = lVar2;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z BookmarkDialogUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z BookmarkDialogUI$lambda$10$0(z0 z0Var) {
        BookmarkDialogUI$lambda$5(z0Var, false);
        return z.f31622a;
    }

    public static final z BookmarkDialogUI$lambda$11$0(z0 z0Var) {
        BookmarkDialogUI$lambda$8(z0Var, false);
        return z.f31622a;
    }

    public static final z BookmarkDialogUI$lambda$12$0(ho.l lVar, ho.a aVar, z0 z0Var) {
        lVar.invoke(new h(aVar, 4));
        BookmarkDialogUI$lambda$8(z0Var, false);
        return z.f31622a;
    }

    public static final z BookmarkDialogUI$lambda$12$0$0(ho.a aVar, BookmarkViewModel bookmarkViewModel) {
        bookmarkViewModel.getClass();
        bookmarkViewModel.deleteBookmark();
        aVar.invoke();
        return z.f31622a;
    }

    public static final z BookmarkDialogUI$lambda$13(Bookmark bookmark, ho.l lVar, ho.a aVar, ho.l lVar2, int i10, int i11, u2.m mVar, int i12) {
        BookmarkDialogUI(bookmark, lVar, aVar, lVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z BookmarkDialogUI$lambda$2$0(Bookmark bookmark) {
        bookmark.getClass();
        return z.f31622a;
    }

    private static final boolean BookmarkDialogUI$lambda$4(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void BookmarkDialogUI$lambda$5(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final boolean BookmarkDialogUI$lambda$7(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void BookmarkDialogUI$lambda$8(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z BookmarkDialogUI$lambda$9$0$0(ho.l lVar, Bookmark bookmark) {
        lVar.invoke(bookmark);
        return z.f31622a;
    }

    public static final z BookmarkDialogUI$lambda$9$1$0(z0 z0Var) {
        BookmarkDialogUI$lambda$5(z0Var, true);
        return z.f31622a;
    }

    public static final z BookmarkDialogUI$lambda$9$2$0(z0 z0Var) {
        BookmarkDialogUI$lambda$8(z0Var, true);
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if ((r24 & 8) != 0) goto L137;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookmarkSheet(String str, ho.a aVar, ho.l lVar, BookmarkViewModel bookmarkViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        BookmarkViewModel bookmarkViewModel2;
        boolean z6;
        BookmarkViewModel bookmarkViewModel3;
        q7.c cVar;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1977757928);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
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
                bookmarkViewModel2 = bookmarkViewModel;
                if (qVar.h(bookmarkViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                bookmarkViewModel2 = bookmarkViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            bookmarkViewModel2 = bookmarkViewModel;
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
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        bookmarkViewModel2 = (BookmarkViewModel) gg.b.j0(e0.f20562a.b(BookmarkViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                BookmarkViewModel bookmarkViewModel4 = bookmarkViewModel2;
                int i17 = i12;
                qVar.q();
                boolean h10 = qVar.h(bookmarkViewModel4);
                if ((i17 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z10 | h10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z12 || L == eVar) {
                    L = new BookmarkSheetKt$BookmarkSheet$1$1(bookmarkViewModel4, str, null);
                    qVar.h0(L);
                }
                r.f((p) L, str, qVar);
                Bookmark bookmark = ((BookmarkState) r.o(bookmarkViewModel4.getStateFlow(), qVar, 0).getValue()).getBookmark();
                if (bookmark != null) {
                    qVar.X(-1024722325);
                    boolean h11 = qVar.h(bookmarkViewModel4);
                    if ((i17 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z13 = z11 | h11;
                    Object L2 = qVar.L();
                    if (z13 || L2 == eVar) {
                        L2 = new a2.q(bookmarkViewModel4, aVar, 19);
                        qVar.h0(L2);
                    }
                    BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, u.P, (ho.a) L2, kj.c.R(qVar, R.string.bookmark_options_sheet_title), (ho.r) c3.k.d(-346022421, true, new io.elevenlabs.readerapp.core.h(bookmark, bookmarkViewModel4, lVar, 5), qVar), (u2.m) qVar, 1572864, 15);
                    qVar = qVar;
                    qVar.p(false);
                } else {
                    qVar.X(-1024292758);
                    qVar.p(false);
                }
                bookmarkViewModel3 = bookmarkViewModel4;
            }
        } else {
            qVar.R();
            bookmarkViewModel3 = bookmarkViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) str, (Object) aVar, lVar, (Object) bookmarkViewModel3, i10, i11, 10);
        }
    }

    public static final z BookmarkSheet$lambda$1$0(BookmarkViewModel bookmarkViewModel, ho.a aVar) {
        bookmarkViewModel.clear();
        aVar.invoke();
        return z.f31622a;
    }

    public static final z BookmarkSheet$lambda$2(Bookmark bookmark, BookmarkViewModel bookmarkViewModel, ho.l lVar, y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        q qVar = (q) mVar;
        boolean h10 = qVar.h(bookmarkViewModel);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new j(bookmarkViewModel, 0);
            qVar.h0(L);
        }
        ho.l lVar2 = (ho.l) L;
        boolean h11 = qVar.h(bottomSheetControl);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new g(bottomSheetControl, 1);
            qVar.h0(L2);
        }
        BookmarkDialogUI(bookmark, lVar2, (ho.a) L2, lVar, qVar, 0, 0);
        return z.f31622a;
    }

    public static final z BookmarkSheet$lambda$2$0$0(BookmarkViewModel bookmarkViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(bookmarkViewModel);
        return z.f31622a;
    }

    public static final z BookmarkSheet$lambda$2$1$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z BookmarkSheet$lambda$3(String str, ho.a aVar, ho.l lVar, BookmarkViewModel bookmarkViewModel, int i10, int i11, u2.m mVar, int i12) {
        BookmarkSheet(str, aVar, lVar, bookmarkViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_BookmarkSheet(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-152584989);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookmarkDialogUI(Bookmark.copy$default(BookmarksFactoryKt.stubBookmark(), null, null, 0L, 0L, null, null, null, null, null, null, null, 1919, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 10);
        }
    }

    public static final z Preview_BookmarkSheet$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookmarkSheet(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_BookmarkSheetShareable(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1461917490);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            BookmarkDialogUI(Bookmark.copy$default(BookmarksFactoryKt.stubBookmark(), null, null, 0L, 0L, null, null, null, null, null, null, null, 1919, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 11);
        }
    }

    public static final z Preview_BookmarkSheetShareable$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookmarkSheetShareable(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

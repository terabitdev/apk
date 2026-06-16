package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import a2.a2;
import a2.z1;
import c3.o;
import com.google.protobuf.c6;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.formatter.OffsetRangeToTimeFormatterKt;
import io.elevenlabs.readerapp.ui.previews.BookmarksFactoryKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
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
import y4.d0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aE\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\r\u0012\u0004\u0012\u00020\u00030\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "bookmarkId", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/EditBookmarkViewModel;", "vm", "EditBookmarkSheet", "(Ljava/lang/String;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/EditBookmarkViewModel;Lu2/m;II)V", "Lio/elevenlabs/domain/model/Bookmark;", BackgroundPlayerAction.Bookmark.ACTION_ID, "Lio/elevenlabs/ui/components/scaffolds/BottomSheetControl;", "control", "Lkotlin/Function1;", "action", "EditBookmarkDialogUI", "(Lio/elevenlabs/domain/model/Bookmark;Lio/elevenlabs/ui/components/scaffolds/BottomSheetControl;Lho/l;Lu2/m;II)V", "Preview_EditBookmarkSheet_Idle", "(Lu2/m;I)V", "Preview_EditBookmarkSheet_WithExistingNote", "note", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EditBookmarkSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void EditBookmarkDialogUI(Bookmark bookmark, BottomSheetControl bottomSheetControl, ho.l lVar, u2.m mVar, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        int i14;
        ho.l lVar2;
        int i15;
        boolean z6;
        q qVar;
        Object obj2;
        ho.l lVar3;
        r1 r10;
        ho.l lVar4;
        InputState inputState;
        int i16;
        boolean z10;
        boolean z11;
        Object fVar;
        boolean z12;
        ho.l lVar5;
        Object obj3;
        int i17;
        q qVar2 = (q) mVar;
        qVar2.Z(-1046445801);
        if ((i10 & 6) == 0) {
            if (qVar2.h(bookmark)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            obj = bottomSheetControl;
            if (qVar2.h(obj)) {
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
                    if (i18 != 0) {
                        obj = null;
                    }
                    Object obj4 = u2.l.f33918a;
                    if (i14 != 0) {
                        Object L = qVar2.L();
                        if (L == obj4) {
                            L = new i(6);
                            qVar2.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    boolean f10 = qVar2.f(bookmark.getBookmarkId());
                    Object L2 = qVar2.L();
                    if (f10 || L2 == obj4) {
                        String note = bookmark.getNote();
                        if (note == null) {
                            note = "";
                        }
                        L2 = r.A(note);
                        qVar2.h0(L2);
                    }
                    z0 z0Var = (z0) L2;
                    String note2 = bookmark.getNote();
                    boolean f11 = qVar2.f(z0Var) | qVar2.h(bookmark);
                    Object L3 = qVar2.L();
                    if (f11 || L3 == obj4) {
                        L3 = new EditBookmarkSheetKt$EditBookmarkDialogUI$2$1(bookmark, z0Var, null);
                        qVar2.h0(L3);
                    }
                    r.f((p) L3, note2, qVar2);
                    i3.q qVar3 = i3.q.f13017a;
                    t y10 = n.y(p2.e(qVar3, 1.0f), n.x(qVar2), true, true);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i19 = ElevenLabsTheme.$stable;
                    t G = r1.d.G(y10, elevenLabsTheme.getSpacings(qVar2, i19).m2357getX5D9Ej5fM(), u.P, 2);
                    x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                    int hashCode = Long.hashCode(qVar2.T);
                    o l4 = qVar2.l();
                    t c5 = i3.a.c(G, qVar2);
                    h4.h.f11920i.getClass();
                    ho.a aVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(aVar);
                    } else {
                        qVar2.k0();
                    }
                    r.J(h4.g.f11907f, a10, qVar2);
                    r.J(h4.g.f11906e, l4, qVar2);
                    r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                    r.F(h4.g.f11909h, qVar2);
                    r.J(h4.g.f11905d, c5, qVar2);
                    Object obj5 = obj;
                    j7.d(bookmark.getText(), r1.d.G(qVar3, u.P, elevenLabsTheme.getSpacings(qVar2, i19).m2356getX4D9Ej5fM(), 1), defpackage.f.b(elevenLabsTheme, qVar2, i19), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i19).getBookText(), qVar2, 0, 0, 131064);
                    j7.d(OffsetRangeToTimeFormatterKt.toSpokenDurationRangeText(new sn.k(Long.valueOf(bookmark.getStartOffsetInclusive()), Long.valueOf(bookmark.getEndOffsetExclusive()))), r1.d.I(qVar3, u.P, u.P, u.P, elevenLabsTheme.getSpacings(qVar2, i19).m2356getX4D9Ej5fM(), 7), ib.i.w(elevenLabsTheme, qVar2, i19), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i19).getBodySmall500(), qVar2, 0, 0, 131064);
                    String EditBookmarkDialogUI$lambda$2 = EditBookmarkDialogUI$lambda$2(z0Var);
                    String R = kj.c.R(qVar2, R.string.bookmarking_add_note_placeholder);
                    if (EditBookmarkDialogUI$lambda$2(z0Var).length() > 0) {
                        inputState = InputState.Active;
                    } else {
                        inputState = InputState.Default;
                    }
                    InputState inputState2 = inputState;
                    a2 a2Var = new a2(true, 1, 120);
                    t e10 = p2.e(qVar3, 1.0f);
                    t e11 = p2.e(qVar3, 1.0f);
                    boolean f12 = qVar2.f(z0Var);
                    Object L4 = qVar2.L();
                    if (f12 || L4 == obj4) {
                        L4 = new h(z0Var, 5);
                        qVar2.h0(L4);
                    }
                    InputKt.Input(EditBookmarkDialogUI$lambda$2, (ho.l) L4, e10, e11, inputState2, (String) null, (String) null, R, (p) null, a2Var, (z1) null, (d0) null, false, 4, (u2.m) qVar2, 3456, 3456, 3424);
                    r1.d.g(p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, i19).m2351getX10D9Ej5fM()), qVar2);
                    if (bookmark.getNote() != null) {
                        i16 = R.string.bookmarking_edit_note_action_title;
                    } else {
                        i16 = R.string.bookmarking_add_note_action;
                    }
                    String R2 = kj.c.R(qVar2, i16);
                    if (EditBookmarkDialogUI$lambda$2(z0Var).length() > 0 && !kotlin.jvm.internal.m.c(EditBookmarkDialogUI$lambda$2(z0Var), bookmark.getNote())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ButtonSize buttonSize = ButtonSize.Medium;
                    t I = r1.d.I(p2.e(qVar3, 1.0f), u.P, u.P, u.P, elevenLabsTheme.getSpacings(qVar2, i19).m2358getX6D9Ej5fM(), 7);
                    if ((i12 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean h10 = qVar2.h(bookmark) | z11 | qVar2.f(z0Var) | qVar2.h(obj5);
                    Object L5 = qVar2.L();
                    if (!h10 && L5 != obj4) {
                        fVar = L5;
                        obj3 = obj5;
                        lVar5 = lVar4;
                        z12 = true;
                    } else {
                        z12 = true;
                        lVar5 = lVar4;
                        fVar = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f(6, lVar5, obj5, bookmark, z0Var);
                        obj3 = obj5;
                        qVar2.h0(fVar);
                    }
                    ButtonKt.Button(R2, (ho.a) fVar, I, buttonSize, null, null, null, false, z10, false, qVar2, 3072, 752);
                    qVar = qVar2;
                    qVar.p(z12);
                    lVar3 = lVar5;
                    obj2 = obj3;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    obj2 = obj;
                    lVar3 = lVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.f(bookmark, obj2, lVar3, i10, i11, 24, false);
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
        obj = bottomSheetControl;
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

    public static final z EditBookmarkDialogUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    private static final String EditBookmarkDialogUI$lambda$2(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z EditBookmarkDialogUI$lambda$5$0$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }

    public static final z EditBookmarkDialogUI$lambda$5$1$0(ho.l lVar, BottomSheetControl bottomSheetControl, Bookmark bookmark, z0 z0Var) {
        lVar.invoke(new io.elevenlabs.data.database.entities.reads.h(bookmark, z0Var, 7));
        if (bottomSheetControl != null) {
            bottomSheetControl.close();
        }
        return z.f31622a;
    }

    public static final z EditBookmarkDialogUI$lambda$5$1$0$0(Bookmark bookmark, z0 z0Var, EditBookmarkViewModel editBookmarkViewModel) {
        editBookmarkViewModel.getClass();
        editBookmarkViewModel.updateBookmarkNote(bookmark, EditBookmarkDialogUI$lambda$2(z0Var));
        return z.f31622a;
    }

    public static final z EditBookmarkDialogUI$lambda$6(Bookmark bookmark, BottomSheetControl bottomSheetControl, ho.l lVar, int i10, int i11, u2.m mVar, int i12) {
        EditBookmarkDialogUI(bookmark, bottomSheetControl, lVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if ((r22 & 4) != 0) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditBookmarkSheet(String str, ho.a aVar, EditBookmarkViewModel editBookmarkViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        EditBookmarkViewModel editBookmarkViewModel2;
        boolean z6;
        EditBookmarkViewModel editBookmarkViewModel3;
        q7.c cVar;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        str.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-2081704843);
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
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                editBookmarkViewModel2 = editBookmarkViewModel;
                if (qVar.h(editBookmarkViewModel2)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i14;
                }
            } else {
                editBookmarkViewModel2 = editBookmarkViewModel;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            editBookmarkViewModel2 = editBookmarkViewModel;
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
                        editBookmarkViewModel2 = (EditBookmarkViewModel) gg.b.j0(e0.f20562a.b(EditBookmarkViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                EditBookmarkViewModel editBookmarkViewModel4 = editBookmarkViewModel2;
                int i17 = i12;
                qVar.q();
                boolean h10 = qVar.h(editBookmarkViewModel4);
                if ((i17 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = z10 | h10;
                Object L = qVar.L();
                if (z11 || L == u2.l.f33918a) {
                    L = new EditBookmarkSheetKt$EditBookmarkSheet$1$1(editBookmarkViewModel4, str, null);
                    qVar.h0(L);
                }
                r.f((p) L, str, qVar);
                Bookmark bookmark = ((EditBookmarkState) r.o(editBookmarkViewModel4.getStateFlow(), qVar, 0).getValue()).getBookmark();
                if (bookmark != null) {
                    qVar.X(-1035883874);
                    if (bookmark.getNote() != null) {
                        i13 = R.string.bookmarking_edit_note_title;
                    } else {
                        i13 = R.string.bookmarking_add_note_title;
                    }
                    BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar2, kj.c.R(qVar, i13), true, null, null, c3.k.d(-851957427, true, new io.elevenlabs.readerapp.e(bookmark, editBookmarkViewModel4, 3), qVar), qVar, (i17 & 112) | 1575936, 49);
                    qVar = qVar;
                    qVar.p(false);
                } else {
                    qVar.X(-1035408179);
                    qVar.p(false);
                }
                editBookmarkViewModel3 = editBookmarkViewModel4;
            }
        } else {
            qVar.R();
            editBookmarkViewModel3 = editBookmarkViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(str, aVar, editBookmarkViewModel3, i10, i11, 23);
        }
    }

    public static final z EditBookmarkSheet$lambda$1(Bookmark bookmark, EditBookmarkViewModel editBookmarkViewModel, y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        q qVar = (q) mVar;
        boolean h10 = qVar.h(editBookmarkViewModel);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new h(editBookmarkViewModel, 6);
            qVar.h0(L);
        }
        EditBookmarkDialogUI(bookmark, bottomSheetControl, (ho.l) L, qVar, i10 & 112, 0);
        return z.f31622a;
    }

    public static final z EditBookmarkSheet$lambda$1$0$0(EditBookmarkViewModel editBookmarkViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(editBookmarkViewModel);
        return z.f31622a;
    }

    public static final z EditBookmarkSheet$lambda$2(String str, ho.a aVar, EditBookmarkViewModel editBookmarkViewModel, int i10, int i11, u2.m mVar, int i12) {
        EditBookmarkSheet(str, aVar, editBookmarkViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_EditBookmarkSheet_Idle(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-667043720);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EditBookmarkDialogUI(Bookmark.copy$default(BookmarksFactoryKt.stubBookmark(), null, null, 0L, 0L, null, null, null, null, null, null, null, 1919, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 12);
        }
    }

    public static final z Preview_EditBookmarkSheet_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EditBookmarkSheet_Idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_EditBookmarkSheet_WithExistingNote(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1189183977);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EditBookmarkDialogUI(Bookmark.copy$default(BookmarksFactoryKt.stubBookmark(), null, null, 0L, 0L, null, null, null, "This is an existing note that shows how the dialog looks with content", null, null, null, 1919, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 13);
        }
    }

    public static final z Preview_EditBookmarkSheet_WithExistingNote$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EditBookmarkSheet_WithExistingNote(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

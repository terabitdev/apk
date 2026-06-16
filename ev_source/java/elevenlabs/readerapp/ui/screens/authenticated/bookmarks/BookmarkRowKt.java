package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import i3.t;
import id.x0;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.ocr.o;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.readerapp.ui.formatter.OffsetRangeToTimeFormatterKt;
import io.elevenlabs.readerapp.ui.previews.BookmarksFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.PillButtonKt;
import io.elevenlabs.ui.components.PillButtonVariant;
import io.elevenlabs.ui.components.SwipeToActionBoxKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import r1.p2;
import r1.u0;
import r1.v0;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/domain/model/Bookmark;", BackgroundPlayerAction.Bookmark.ACTION_ID, "", "isLastItem", "Lkotlin/Function0;", "Lsn/z;", "onEditNote", "onDelete", "onListenClick", "Li3/t;", "modifier", "BookmarkRow", "(Lio/elevenlabs/domain/model/Bookmark;ZLho/a;Lho/a;Lho/a;Li3/t;Lu2/m;II)V", "Preview_BookmarkRow", "(Lu2/m;I)V", "showDeleteConfirmation", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookmarkRowKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookmarkRow(Bookmark bookmark, boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z10;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        bookmark.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        q qVar = (q) mVar;
        qVar.Z(317283935);
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
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar3)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i14;
        }
        int i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            if ((74899 & i12) == 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = r.A(Boolean.FALSE);
                    qVar.h0(L);
                }
                z0 z0Var = (z0) L;
                t tVar5 = tVar4;
                SwipeToActionBoxKt.SwipeToActionBox(bookmark.getText(), null, null, SwipeToActionBoxKt.actionSpec(c3.k.d(-2144662027, true, new defpackage.b(new ActionConfig(R.drawable.trash, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.swipe_action_delete), ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getButtonBackground().m2015getDangerConfirm0d7_KjU(), false, false, 24, null), z0Var, 7), qVar), qVar, 6), null, null, c3.k.d(-40576686, true, new x0(tVar4, z6, bookmark, aVar3, aVar), qVar), qVar, 1572864, 54);
                if (BookmarkRow$lambda$1(z0Var)) {
                    qVar.X(-1013880480);
                    Object L2 = qVar.L();
                    if (L2 == eVar) {
                        L2 = new b(z0Var, 0);
                        qVar.h0(L2);
                    }
                    ho.a aVar4 = (ho.a) L2;
                    if ((i12 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object L3 = qVar.L();
                    if (z11 || L3 == eVar) {
                        L3 = new c(aVar2, z0Var, 0);
                        qVar.h0(L3);
                    }
                    ConfirmationDialogKt.ConfirmationDialog(aVar4, (ho.a) L3, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.bookmark_delete_confirmation_title), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.bookmark_delete_confirmation_message), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.common_cancel), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.bookmark_delete_confirmation_confirm), true, qVar, 1572870, 0);
                    qVar.p(false);
                } else {
                    qVar.X(-1013324061);
                    qVar.p(false);
                }
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new o(bookmark, z6, aVar, aVar2, aVar3, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final boolean BookmarkRow$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void BookmarkRow$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z BookmarkRow$lambda$3(ActionConfig actionConfig, z0 z0Var, ActionSpecBuilder actionSpecBuilder, u2.m mVar, int i10) {
        boolean z6;
        boolean h10;
        int i11;
        actionSpecBuilder.getClass();
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = ((q) mVar).f(actionSpecBuilder);
            } else {
                h10 = ((q) mVar).h(actionSpecBuilder);
            }
            if (h10) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h11 = qVar.h(actionConfig);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (h11 || L == eVar) {
                L = new io.elevenlabs.data.database.entities.reads.h(actionConfig, z0Var, 6);
                qVar.h0(L);
            }
            actionSpecBuilder.handlers((ho.l) L);
            boolean h12 = qVar.h(actionConfig);
            Object L2 = qVar.L();
            if (h12 || L2 == eVar) {
                L2 = new h(actionConfig, 2);
                qVar.h0(L2);
            }
            actionSpecBuilder.placement((ho.l) L2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z BookmarkRow$lambda$3$0$0(ActionConfig actionConfig, z0 z0Var, ActionSpecBuilder.HandlerScope handlerScope) {
        handlerScope.getClass();
        handlerScope.handledBy(actionConfig, new b(z0Var, 1));
        return z.f31622a;
    }

    public static final z BookmarkRow$lambda$3$0$0$0(z0 z0Var) {
        BookmarkRow$lambda$2(z0Var, true);
        return z.f31622a;
    }

    public static final z BookmarkRow$lambda$3$1$0(ActionConfig actionConfig, ActionSpecBuilder.PlacementScope placementScope) {
        placementScope.getClass();
        placementScope.setEndSide(ig.f.H(actionConfig));
        return z.f31622a;
    }

    public static final z BookmarkRow$lambda$4(t tVar, boolean z6, Bookmark bookmark, ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            t e10 = p2.e(tVar, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t F = r1.d.F(n.h(e10, ib.i.d(elevenLabsTheme, qVar, i11), h0.f26395b), elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM());
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            x a10 = w.a(eVar, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(F, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            r.J(eVar2, a10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            r.J(eVar5, c5, qVar);
            i3.q qVar2 = i3.q.f13017a;
            t e11 = p2.e(qVar2, 1.0f);
            x a11 = w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i11).m2350getX1D9Ej5fM()), jVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(e11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar2, a11, qVar);
            r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            r.J(eVar5, c10, qVar);
            j7.d(OffsetRangeToTimeFormatterKt.toSpokenDurationRangeText(new sn.k(Long.valueOf(bookmark.getStartOffsetInclusive()), Long.valueOf(bookmark.getEndOffsetExclusive()))), null, p3.x.b(0.4f, elevenLabsTheme.getColor(qVar, i11).getText().m2185getPrimary0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyXSmall500(), qVar, 0, 0, 131066);
            j7.d(bookmark.getText(), null, defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium700(), qVar, 0, 0, 131066);
            q qVar3 = qVar;
            String note = bookmark.getNote();
            if (note != null && note.length() != 0) {
                qVar3.X(-1313829774);
                String note2 = bookmark.getNote();
                note2.getClass();
                j7.d(note2, null, ib.i.w(elevenLabsTheme, qVar3, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i11).getBodySmall500(), qVar3, 0, 0, 131066);
                qVar3 = qVar3;
                qVar3.p(false);
            } else {
                qVar3.X(-1313610108);
                qVar3.p(false);
            }
            qVar3.p(true);
            r1.d.b(r1.d.I(p2.e(qVar2, 1.0f), u.P, elevenLabsTheme.getSpacings(qVar3, i11).m2355getX3D9Ej5fM(), u.P, u.P, 13), ib.i.n(elevenLabsTheme, qVar3, i11), ib.i.n(elevenLabsTheme, qVar3, i11), null, 0, 0, c3.k.d(-531282131, true, new defpackage.b(aVar, aVar2, 8), qVar3), qVar3, 1572864, 56);
            if (!z6) {
                qVar3.X(1708220007);
                DividerKt.m1827DivideriJQMabo(r1.d.I(p2.e(qVar2, 1.0f), u.P, elevenLabsTheme.getSpacings(qVar3, i11).m2353getX2D9Ej5fM(), u.P, u.P, 13), elevenLabsTheme.getColor(qVar3, i11).getDivider().m2058getLightLine0d7_KjU(), qVar3, 0, 0);
                qVar3.p(false);
            } else {
                qVar3.X(1708484282);
                qVar3.p(false);
            }
            qVar3.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z BookmarkRow$lambda$4$0$1(ho.a aVar, ho.a aVar2, v0 v0Var, u2.m mVar, int i10) {
        boolean z6;
        v0Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PillButtonKt.PillButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.bookmark_listen), R.drawable.headphones, aVar, null, null, qVar, 0, 24);
            PillButtonKt.PillButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.bookmark_edit_note), R.drawable.text_edit, aVar2, PillButtonVariant.Secondary, null, qVar, 3072, 16);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z BookmarkRow$lambda$5$0(z0 z0Var) {
        BookmarkRow$lambda$2(z0Var, false);
        return z.f31622a;
    }

    public static final z BookmarkRow$lambda$6$0(ho.a aVar, z0 z0Var) {
        aVar.invoke();
        BookmarkRow$lambda$2(z0Var, false);
        return z.f31622a;
    }

    public static final z BookmarkRow$lambda$7(Bookmark bookmark, boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, t tVar, int i10, int i11, u2.m mVar, int i12) {
        BookmarkRow(bookmark, z6, aVar, aVar2, aVar3, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_BookmarkRow(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(929038317);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            r1.h n2 = ib.i.n(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable);
            t y10 = n.y(i3.q.f13017a, n.x(qVar), true, true);
            x a10 = w.a(n2, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(y10, qVar);
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
            Bookmark copy$default = Bookmark.copy$default(BookmarksFactoryKt.stubBookmark(), null, null, 0L, 0L, null, null, null, "This is a test note", null, null, null, 1919, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new a(0);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(1);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(2);
                qVar.h0(L3);
            }
            BookmarkRow(copy$default, false, aVar, aVar2, (ho.a) L3, null, qVar, 28080, 32);
            Bookmark copy$default2 = Bookmark.copy$default(BookmarksFactoryKt.stubBookmark(), null, null, 0L, 0L, null, null, null, null, null, null, null, 1919, null);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(3);
                qVar.h0(L4);
            }
            ho.a aVar3 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new a(4);
                qVar.h0(L5);
            }
            ho.a aVar4 = (ho.a) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new a(5);
                qVar.h0(L6);
            }
            BookmarkRow(copy$default2, true, aVar3, aVar4, (ho.a) L6, null, qVar, 28080, 32);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 8);
        }
    }

    public static final z Preview_BookmarkRow$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_BookmarkRow(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}

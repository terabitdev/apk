package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import a2.o2;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.BookmarksFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.p2;
import rd.c1;
import s4.y0;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001aE\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0016²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "readId", "Lkotlin/Function0;", "Lsn/z;", "onClose", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/Bookmark;", "onSeekToBookmark", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ReadBookmarksViewModel;", "vm", "BookmarksSheet", "(Ljava/lang/String;Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ReadBookmarksViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ReadBookmarksState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "BookmarksSheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ReadBookmarksState;Lho/a;Lho/l;Lho/l;Lu2/m;II)V", "Preview_BookmarksSheet_Empty", "(Lu2/m;I)V", "Preview_BookmarksSheet_WithBookmarks", "Preview_BookmarksSheet_Downloading", "editingBookmarkId", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookmarksSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookmarksSheet(String str, ho.a aVar, ho.l lVar, ReadBookmarksViewModel readBookmarksViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        ho.l lVar2;
        int i13;
        ReadBookmarksViewModel readBookmarksViewModel2;
        boolean z6;
        ho.l lVar3;
        ReadBookmarksViewModel readBookmarksViewModel3;
        r1 r10;
        ho.l lVar4;
        q7.c cVar;
        int i14;
        ReadBookmarksViewModel readBookmarksViewModel4;
        boolean z10;
        boolean z11;
        Object L;
        int i15;
        int i16;
        int i17;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1481766582);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        } else {
            aVar2 = aVar;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) != 0) {
                if ((i11 & 8) == 0) {
                    readBookmarksViewModel2 = readBookmarksViewModel;
                    if (qVar.h(readBookmarksViewModel2)) {
                        i15 = 2048;
                        i12 |= i15;
                    }
                } else {
                    readBookmarksViewModel2 = readBookmarksViewModel;
                }
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i12 |= i15;
            } else {
                readBookmarksViewModel2 = readBookmarksViewModel;
            }
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                qVar.T();
                int i19 = i10 & 1;
                u2.e eVar = u2.l.f33918a;
                if (i19 != 0 && !qVar.y()) {
                    qVar.R();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    lVar4 = lVar2;
                } else {
                    if (i18 != 0) {
                        Object L2 = qVar.L();
                        if (L2 == eVar) {
                            L2 = new o(6);
                            qVar.h0(L2);
                        }
                        lVar4 = (ho.l) L2;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                        if (a10 != null) {
                            pl.f o6 = tb.a.o(a10, qVar);
                            if (a10 instanceof androidx.lifecycle.o) {
                                cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                            } else {
                                cVar = q7.a.f28123b;
                            }
                            i14 = i12 & (-7169);
                            readBookmarksViewModel4 = (ReadBookmarksViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ReadBookmarksViewModel.class), a10, null, o6, cVar, qVar);
                            qVar.q();
                            boolean h10 = qVar.h(readBookmarksViewModel4);
                            if ((i14 & 14) != 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 = z10 | h10;
                            L = qVar.L();
                            if (!z11 || L == eVar) {
                                L = new BookmarksSheetKt$BookmarksSheet$2$1(readBookmarksViewModel4, str, null);
                                qVar.h0(L);
                            }
                            u2.r.f((ho.p) L, str, qVar);
                            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar2, false, (ho.r) c3.k.d(-272085272, true, new io.elevenlabs.readerapp.core.h((ReadBookmarksState) u2.r.o(readBookmarksViewModel4.getStateFlow(), qVar, 0).getValue(), lVar4, readBookmarksViewModel4, 8), qVar), (u2.m) qVar, ((i14 << 9) & 57344) | 1572864, 47);
                            qVar = qVar;
                            lVar3 = lVar4;
                            readBookmarksViewModel3 = readBookmarksViewModel4;
                        } else {
                            c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                    }
                }
                i14 = i12;
                readBookmarksViewModel4 = readBookmarksViewModel2;
                qVar.q();
                boolean h102 = qVar.h(readBookmarksViewModel4);
                if ((i14 & 14) != 4) {
                }
                z11 = z10 | h102;
                L = qVar.L();
                if (!z11) {
                }
                L = new BookmarksSheetKt$BookmarksSheet$2$1(readBookmarksViewModel4, str, null);
                qVar.h0(L);
                u2.r.f((ho.p) L, str, qVar);
                BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar2, false, (ho.r) c3.k.d(-272085272, true, new io.elevenlabs.readerapp.core.h((ReadBookmarksState) u2.r.o(readBookmarksViewModel4.getStateFlow(), qVar, 0).getValue(), lVar4, readBookmarksViewModel4, 8), qVar), (u2.m) qVar, ((i14 << 9) & 57344) | 1572864, 47);
                qVar = qVar;
                lVar3 = lVar4;
                readBookmarksViewModel3 = readBookmarksViewModel4;
            } else {
                qVar.R();
                lVar3 = lVar2;
                readBookmarksViewModel3 = readBookmarksViewModel2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) str, (Object) aVar, lVar3, (Object) readBookmarksViewModel3, i10, i11, 17);
                return;
            }
            return;
        }
        lVar2 = lVar;
        if ((i10 & 3072) != 0) {
        }
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z BookmarksSheet$lambda$0$0(Bookmark bookmark) {
        bookmark.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z BookmarksSheet$lambda$2(ReadBookmarksState readBookmarksState, ho.l lVar, ReadBookmarksViewModel readBookmarksViewModel, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        HeaderKt.Header(kj.c.R(mVar, R.string.bookmarks_page_title), null, c3.k.d(1423565220, true, new fm.o(readBookmarksState, readBookmarksViewModel, bottomSheetControl, 15), mVar), null, null, 0, mVar, 384, 58);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(bottomSheetControl, 1);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(readBookmarksViewModel);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new d(readBookmarksViewModel, 0);
            qVar.h0(L2);
        }
        BookmarksSheetUI(readBookmarksState, aVar, lVar, (ho.l) L2, qVar, 0, 0);
        return sn.z.f31622a;
    }

    public static final sn.z BookmarksSheet$lambda$2$0(ReadBookmarksState readBookmarksState, ReadBookmarksViewModel readBookmarksViewModel, BottomSheetControl bottomSheetControl, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, 0);
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
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            boolean isEmpty = readBookmarksState.getBookmarks().isEmpty();
            u2.e eVar = u2.l.f33918a;
            if (!isEmpty) {
                qVar.X(-691646693);
                int i11 = io.elevenlabs.ui.R.drawable.download;
                String R = kj.c.R(qVar, R.string.bookmark_download_title);
                boolean h10 = qVar.h(readBookmarksViewModel) | qVar.h(bottomSheetControl);
                Object L = qVar.L();
                if (h10 || L == eVar) {
                    L = new a2.q(readBookmarksViewModel, bottomSheetControl, 27);
                    qVar.h0(L);
                }
                ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, readBookmarksState.isDownloading(), false, false, qVar, 221184, 392);
                r1.d.g(p2.s(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2355getX3D9Ej5fM()), qVar);
                qVar.p(false);
            } else {
                qVar.X(-690971110);
                qVar.p(false);
            }
            int i12 = io.elevenlabs.ui.R.drawable.close;
            String R2 = kj.c.R(qVar, io.elevenlabs.ui.R.string.accessibility_bottom_sheet_dialog_close);
            boolean h11 = qVar.h(bottomSheetControl);
            Object L2 = qVar.L();
            if (h11 || L2 == eVar) {
                L2 = new b(bottomSheetControl, 0);
                qVar.h0(L2);
            }
            ButtonIconKt.ButtonIcon(i12, R2, (ho.a) L2, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z BookmarksSheet$lambda$2$0$0$0$0(ReadBookmarksViewModel readBookmarksViewModel, BottomSheetControl bottomSheetControl) {
        readBookmarksViewModel.downloadBookmarks();
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z BookmarksSheet$lambda$2$0$0$1$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z BookmarksSheet$lambda$2$1$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z BookmarksSheet$lambda$2$2$0(ReadBookmarksViewModel readBookmarksViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(readBookmarksViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z BookmarksSheet$lambda$3(String str, ho.a aVar, ho.l lVar, ReadBookmarksViewModel readBookmarksViewModel, int i10, int i11, u2.m mVar, int i12) {
        BookmarksSheet(str, aVar, lVar, readBookmarksViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BookmarksSheetUI(ReadBookmarksState readBookmarksState, ho.a aVar, ho.l lVar, ho.l lVar2, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        ho.l lVar4;
        int i13;
        boolean z6;
        ho.l lVar5;
        r1 r10;
        ho.l lVar6;
        boolean z10;
        boolean z11;
        z0 z0Var;
        ho.l lVar7;
        u2.e eVar;
        boolean z12;
        int i14;
        int i15;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1168019735);
        if ((i10 & 6) == 0) {
            if (qVar.h(readBookmarksState)) {
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
            lVar3 = lVar;
            if (qVar.h(lVar3)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            lVar3 = lVar;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            lVar4 = lVar2;
            if (qVar.h(lVar4)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                u2.e eVar2 = u2.l.f33918a;
                if (i17 != 0) {
                    Object L = qVar.L();
                    if (L == eVar2) {
                        L = new o(7);
                        qVar.h0(L);
                    }
                    lVar6 = (ho.l) L;
                } else {
                    lVar6 = lVar4;
                }
                Object L2 = qVar.L();
                if (L2 == eVar2) {
                    L2 = u2.r.A(null);
                    qVar.h0(L2);
                }
                z0 z0Var2 = (z0) L2;
                boolean isEmpty = readBookmarksState.getBookmarks().isEmpty();
                i3.q qVar2 = i3.q.f13017a;
                if (isEmpty) {
                    qVar.X(1349409524);
                    i3.t d10 = p2.d(qVar2, 1.0f);
                    f1 d11 = r1.p.d(i3.d.f13001e, false);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c5 = i3.a.c(d10, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(h4.g.f11907f, d11, qVar);
                    u2.r.J(h4.g.f11906e, l4, qVar);
                    u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar);
                    u2.r.J(h4.g.f11905d, c5, qVar);
                    String R = kj.c.R(qVar, R.string.bookmarks_page_empty);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i18 = ElevenLabsTheme.$stable;
                    y0 bodyLarge500 = elevenLabsTheme.getTypo(qVar, i18).getBodyLarge500();
                    long b10 = defpackage.f.b(elevenLabsTheme, qVar, i18);
                    eVar = eVar2;
                    j7.d(R, null, b10, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bodyLarge500, qVar, 0, 0, 131066);
                    qVar.p(true);
                    qVar.p(false);
                    lVar7 = lVar6;
                    z12 = false;
                    qVar = qVar;
                    z0Var = z0Var2;
                } else {
                    boolean z13 = true;
                    qVar.X(1349784841);
                    i3.t d12 = p2.d(qVar2, 1.0f);
                    boolean h10 = qVar.h(readBookmarksState);
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z14 = z10 | h10;
                    if ((i12 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z15 = z11 | z14;
                    if ((i12 & 112) != 32) {
                        z13 = false;
                    }
                    boolean z16 = z15 | z13;
                    Object L3 = qVar.L();
                    if (!z16 && L3 != eVar2) {
                        lVar7 = lVar6;
                        z0Var = z0Var2;
                    } else {
                        ho.l lVar8 = lVar3;
                        z0Var = z0Var2;
                        o2 o2Var = new o2(readBookmarksState, lVar6, lVar8, aVar, z0Var, 4);
                        lVar7 = lVar6;
                        qVar.h0(o2Var);
                        L3 = o2Var;
                    }
                    eVar = eVar2;
                    z12 = false;
                    c1.c(d12, null, null, false, null, null, null, false, null, (ho.l) L3, qVar, 6, 510);
                    qVar = qVar;
                    qVar.p(false);
                }
                if (BookmarksSheetUI$lambda$2(z0Var) != null) {
                    qVar.X(1350640906);
                    String BookmarksSheetUI$lambda$2 = BookmarksSheetUI$lambda$2(z0Var);
                    BookmarksSheetUI$lambda$2.getClass();
                    Object L4 = qVar.L();
                    if (L4 == eVar) {
                        L4 = new p(z0Var, 3);
                        qVar.h0(L4);
                    }
                    EditBookmarkSheetKt.EditBookmarkSheet(BookmarksSheetUI$lambda$2, (ho.a) L4, null, qVar, 48, 4);
                    qVar.p(z12);
                } else {
                    qVar.X(1350778329);
                    qVar.p(z12);
                }
                lVar5 = lVar7;
            } else {
                qVar.R();
                lVar5 = lVar4;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) readBookmarksState, (Object) aVar, lVar, (Object) lVar5, i10, i11, 18);
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

    public static final sn.z BookmarksSheetUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    private static final String BookmarksSheetUI$lambda$2(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z BookmarksSheetUI$lambda$5$0(final ReadBookmarksState readBookmarksState, final ho.l lVar, final ho.l lVar2, final ho.a aVar, final z0 z0Var, t1.t tVar) {
        tVar.getClass();
        final List<Bookmark> bookmarks = readBookmarksState.getBookmarks();
        final o oVar = new o(3);
        final BookmarksSheetKt$BookmarksSheetUI$lambda$5$0$$inlined$items$default$1 bookmarksSheetKt$BookmarksSheetUI$lambda$5$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt$BookmarksSheetUI$lambda$5$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Bookmark) obj);
            }

            @Override // ho.l
            public final Void invoke(Bookmark bookmark) {
                return null;
            }
        };
        ((t1.i) tVar).u(bookmarks.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt$BookmarksSheetUI$lambda$5$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(bookmarks.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt$BookmarksSheetUI$lambda$5$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(bookmarks.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt$BookmarksSheetUI$lambda$5$0$$inlined$items$default$4
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
                    i12 = i14 | i11;
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
                    final Bookmark bookmark = (Bookmark) bookmarks.get(i10);
                    qVar.X(-1840155365);
                    boolean c5 = kotlin.jvm.internal.m.c(bookmark, tn.o.G0(readBookmarksState.getBookmarks()));
                    boolean h10 = qVar.h(bookmark);
                    Object L = qVar.L();
                    Object obj = u2.l.f33918a;
                    if (h10 || L == obj) {
                        final z0 z0Var2 = z0Var;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt$BookmarksSheetUI$3$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1487invoke() {
                                z0Var2.setValue(Bookmark.this.getBookmarkId());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1487invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ho.a aVar2 = (ho.a) L;
                    boolean f10 = qVar.f(lVar) | qVar.h(bookmark);
                    Object L2 = qVar.L();
                    if (f10 || L2 == obj) {
                        final ho.l lVar3 = lVar;
                        L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt$BookmarksSheetUI$3$1$2$2$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1488invoke() {
                                ho.l lVar4 = ho.l.this;
                                final Bookmark bookmark2 = bookmark;
                                lVar4.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt$BookmarksSheetUI$3$1$2$2$1.1
                                    public final void invoke(ReadBookmarksViewModel readBookmarksViewModel) {
                                        readBookmarksViewModel.getClass();
                                        readBookmarksViewModel.deleteBookmark(Bookmark.this);
                                    }

                                    @Override // ho.l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((ReadBookmarksViewModel) obj2);
                                        return sn.z.f31622a;
                                    }
                                });
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1488invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L2);
                    }
                    ho.a aVar3 = (ho.a) L2;
                    boolean f11 = qVar.f(lVar2) | qVar.h(bookmark) | qVar.f(aVar);
                    Object L3 = qVar.L();
                    if (f11 || L3 == obj) {
                        final ho.l lVar4 = lVar2;
                        final ho.a aVar4 = aVar;
                        L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt$BookmarksSheetUI$3$1$2$3$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1489invoke() {
                                ho.l.this.invoke(bookmark);
                                aVar4.invoke();
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1489invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L3);
                    }
                    BookmarkRowKt.BookmarkRow(bookmark, c5, aVar2, aVar3, (ho.a) L3, null, qVar, 0, 32);
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
        t1.t.c(tVar, null, null, ComposableSingletons$BookmarksSheetKt.INSTANCE.getLambda$1967945360$app_productionRelease(), 3);
        return sn.z.f31622a;
    }

    public static final Object BookmarksSheetUI$lambda$5$0$0(Bookmark bookmark) {
        bookmark.getClass();
        return bookmark.getBookmarkId();
    }

    public static final sn.z BookmarksSheetUI$lambda$6$0(z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z BookmarksSheetUI$lambda$7(ReadBookmarksState readBookmarksState, ho.a aVar, ho.l lVar, ho.l lVar2, int i10, int i11, u2.m mVar, int i12) {
        BookmarksSheetUI(readBookmarksState, aVar, lVar, lVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_BookmarksSheet_Downloading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2084464105);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadBookmarksState readBookmarksState = new ReadBookmarksState("test-id", "Test Title", ig.f.H(BookmarksFactoryKt.stubBookmark()), true);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new c(2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new o(8);
                qVar.h0(L2);
            }
            BookmarksSheetUI(readBookmarksState, aVar, (ho.l) L2, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 9);
        }
    }

    public static final sn.z Preview_BookmarksSheet_Downloading$lambda$1$0(Bookmark bookmark) {
        bookmark.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_BookmarksSheet_Downloading$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_BookmarksSheet_Downloading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_BookmarksSheet_Empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(97289802);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadBookmarksState readBookmarksState = new ReadBookmarksState(null, null, null, false, 15, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new c(0);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new o(4);
                qVar.h0(L2);
            }
            BookmarksSheetUI(readBookmarksState, aVar, (ho.l) L2, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 10);
        }
    }

    public static final sn.z Preview_BookmarksSheet_Empty$lambda$1$0(Bookmark bookmark) {
        bookmark.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_BookmarksSheet_Empty$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_BookmarksSheet_Empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_BookmarksSheet_WithBookmarks(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(838817364);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadBookmarksState readBookmarksState = new ReadBookmarksState("test-id", "Test Title", BookmarksFactoryKt.stubBookmarksList(15), false, 8, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new c(1);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new o(5);
                qVar.h0(L2);
            }
            BookmarksSheetUI(readBookmarksState, aVar, (ho.l) L2, null, qVar, 432, 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 11);
        }
    }

    public static final sn.z Preview_BookmarksSheet_WithBookmarks$lambda$1$0(Bookmark bookmark) {
        bookmark.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_BookmarksSheet_WithBookmarks$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_BookmarksSheet_WithBookmarks(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import io.elevenlabs.domain.model.Bookmark;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15265a;

    public /* synthetic */ i(int i10) {
        this.f15265a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        BookmarkShareDetailsState hideDisclaimer$lambda$0;
        z BookmarkDialogUI$lambda$0$0;
        z BookmarkDialogUI$lambda$2$0;
        BookmarkState clear$lambda$0;
        z EditBookmarkDialogUI$lambda$0$0;
        switch (this.f15265a) {
            case 0:
                return BookmarkShareDetailsViewModel$loadVideo$1$1.h((BookmarkShareDetailsState) obj);
            case 1:
                return BookmarkShareDetailsScreenKt.b((m.a) obj);
            case 2:
                hideDisclaimer$lambda$0 = BookmarkShareDetailsViewModel.hideDisclaimer$lambda$0((BookmarkShareDetailsState) obj);
                return hideDisclaimer$lambda$0;
            case 3:
                BookmarkDialogUI$lambda$0$0 = BookmarkSheetKt.BookmarkDialogUI$lambda$0$0((ho.l) obj);
                return BookmarkDialogUI$lambda$0$0;
            case 4:
                BookmarkDialogUI$lambda$2$0 = BookmarkSheetKt.BookmarkDialogUI$lambda$2$0((Bookmark) obj);
                return BookmarkDialogUI$lambda$2$0;
            case 5:
                clear$lambda$0 = BookmarkViewModel.clear$lambda$0((BookmarkState) obj);
                return clear$lambda$0;
            default:
                EditBookmarkDialogUI$lambda$0$0 = EditBookmarkSheetKt.EditBookmarkDialogUI$lambda$0$0((ho.l) obj);
                return EditBookmarkDialogUI$lambda$0$0;
        }
    }
}

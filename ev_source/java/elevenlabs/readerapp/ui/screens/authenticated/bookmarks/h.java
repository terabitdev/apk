package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsViewModel$checkReadImportStatus$1;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15264b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f15263a = i10;
        this.f15264b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        BookmarkShareDetailsState invokeSuspend$lambda$0;
        z BookmarkRow$lambda$3$1$0;
        BookmarkShareDetailsState showDisclaimer$lambda$0;
        z BookmarkDialogUI$lambda$12$0$0;
        z EditBookmarkDialogUI$lambda$5$0$0;
        z EditBookmarkSheet$lambda$1$0$0;
        switch (this.f15263a) {
            case 0:
                return BookmarkShareDetailsViewModel$checkReadImportStatus$1.AnonymousClass1.a((ReadMeta) this.f15264b, (BookmarkShareDetailsState) obj);
            case 1:
                invokeSuspend$lambda$0 = BookmarkShareDetailsViewModel$loadVideo$1$1.invokeSuspend$lambda$0((AsyncCallResult.Success) this.f15264b, (BookmarkShareDetailsState) obj);
                return invokeSuspend$lambda$0;
            case 2:
                BookmarkRow$lambda$3$1$0 = BookmarkRowKt.BookmarkRow$lambda$3$1$0((ActionConfig) this.f15264b, (ActionSpecBuilder.PlacementScope) obj);
                return BookmarkRow$lambda$3$1$0;
            case 3:
                showDisclaimer$lambda$0 = BookmarkShareDetailsViewModel.showDisclaimer$lambda$0((BookmarkShareAction) this.f15264b, (BookmarkShareDetailsState) obj);
                return showDisclaimer$lambda$0;
            case 4:
                BookmarkDialogUI$lambda$12$0$0 = BookmarkSheetKt.BookmarkDialogUI$lambda$12$0$0((ho.a) this.f15264b, (BookmarkViewModel) obj);
                return BookmarkDialogUI$lambda$12$0$0;
            case 5:
                EditBookmarkDialogUI$lambda$5$0$0 = EditBookmarkSheetKt.EditBookmarkDialogUI$lambda$5$0$0((z0) this.f15264b, (String) obj);
                return EditBookmarkDialogUI$lambda$5$0$0;
            default:
                EditBookmarkSheet$lambda$1$0$0 = EditBookmarkSheetKt.EditBookmarkSheet$lambda$1$0$0((EditBookmarkViewModel) this.f15264b, (ho.l) obj);
                return EditBookmarkSheet$lambda$1$0$0;
        }
    }
}

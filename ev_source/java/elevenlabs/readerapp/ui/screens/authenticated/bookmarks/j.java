package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookmarkViewModel f15267b;

    public /* synthetic */ j(BookmarkViewModel bookmarkViewModel, int i10) {
        this.f15266a = i10;
        this.f15267b = bookmarkViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z BookmarkSheet$lambda$2$0$0;
        BookmarkState deleteBookmark$lambda$0;
        switch (this.f15266a) {
            case 0:
                BookmarkSheet$lambda$2$0$0 = BookmarkSheetKt.BookmarkSheet$lambda$2$0$0(this.f15267b, (ho.l) obj);
                return BookmarkSheet$lambda$2$0$0;
            default:
                deleteBookmark$lambda$0 = BookmarkViewModel.deleteBookmark$lambda$0(this.f15267b, (BookmarkState) obj);
                return deleteBookmark$lambda$0;
        }
    }
}

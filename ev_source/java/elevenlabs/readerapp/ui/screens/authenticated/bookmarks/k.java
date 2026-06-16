package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15269b;

    public /* synthetic */ k(String str, int i10) {
        this.f15268a = i10;
        this.f15269b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        BookmarkState bookmarkId$lambda$0;
        EditBookmarkState bookmarkId$lambda$02;
        switch (this.f15268a) {
            case 0:
                bookmarkId$lambda$0 = BookmarkViewModel.setBookmarkId$lambda$0(this.f15269b, (BookmarkState) obj);
                return bookmarkId$lambda$0;
            default:
                bookmarkId$lambda$02 = EditBookmarkViewModel.setBookmarkId$lambda$0(this.f15269b, (EditBookmarkState) obj);
                return bookmarkId$lambda$02;
        }
    }
}

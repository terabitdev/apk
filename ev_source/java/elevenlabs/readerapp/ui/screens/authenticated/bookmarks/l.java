package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bookmark f15271b;

    public /* synthetic */ l(Bookmark bookmark, int i10) {
        this.f15270a = i10;
        this.f15271b = bookmark;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        BookmarkState invokeSuspend$lambda$0;
        EditBookmarkState invokeSuspend$lambda$02;
        switch (this.f15270a) {
            case 0:
                invokeSuspend$lambda$0 = BookmarkViewModel.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$0(this.f15271b, (BookmarkState) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = EditBookmarkViewModel.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$0(this.f15271b, (EditBookmarkState) obj);
                return invokeSuspend$lambda$02;
        }
    }
}

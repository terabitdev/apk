package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import android.content.Context;
import android.net.Uri;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookmarkShareDetailsState f15255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f15257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j.j f15258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BookmarkShareDetailsViewModel f15259f;

    public /* synthetic */ e(Context context, Uri uri, j.j jVar, BookmarkShareDetailsState bookmarkShareDetailsState, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        this.f15254a = 0;
        this.f15256c = context;
        this.f15257d = uri;
        this.f15258e = jVar;
        this.f15255b = bookmarkShareDetailsState;
        this.f15259f = bookmarkShareDetailsViewModel;
    }

    @Override // ho.a
    public final Object invoke() {
        z BookmarkShareDetailsScreen$lambda$3$7$0;
        z BookmarkShareDetailsScreen$lambda$3$4$0;
        z BookmarkShareDetailsScreen$lambda$3$5$0;
        z BookmarkShareDetailsScreen$lambda$3$6$0;
        switch (this.f15254a) {
            case 0:
                BookmarkShareDetailsScreen$lambda$3$7$0 = BookmarkShareDetailsScreenKt.BookmarkShareDetailsScreen$lambda$3$7$0(this.f15256c, this.f15257d, this.f15258e, this.f15255b, this.f15259f);
                return BookmarkShareDetailsScreen$lambda$3$7$0;
            case 1:
                j.j jVar = this.f15258e;
                BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel = this.f15259f;
                BookmarkShareDetailsScreen$lambda$3$4$0 = BookmarkShareDetailsScreenKt.BookmarkShareDetailsScreen$lambda$3$4$0(this.f15255b, this.f15256c, this.f15257d, jVar, bookmarkShareDetailsViewModel);
                return BookmarkShareDetailsScreen$lambda$3$4$0;
            case 2:
                BookmarkShareDetailsScreen$lambda$3$5$0 = BookmarkShareDetailsScreenKt.BookmarkShareDetailsScreen$lambda$3$5$0(this.f15256c, this.f15257d, this.f15258e, this.f15259f, this.f15255b);
                return BookmarkShareDetailsScreen$lambda$3$5$0;
            default:
                BookmarkShareDetailsScreen$lambda$3$6$0 = BookmarkShareDetailsScreenKt.BookmarkShareDetailsScreen$lambda$3$6$0(this.f15256c, this.f15257d, this.f15258e, this.f15259f, this.f15255b);
                return BookmarkShareDetailsScreen$lambda$3$6$0;
        }
    }

    public /* synthetic */ e(Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, BookmarkShareDetailsState bookmarkShareDetailsState, int i10) {
        this.f15254a = i10;
        this.f15256c = context;
        this.f15257d = uri;
        this.f15258e = jVar;
        this.f15259f = bookmarkShareDetailsViewModel;
        this.f15255b = bookmarkShareDetailsState;
    }

    public /* synthetic */ e(BookmarkShareDetailsState bookmarkShareDetailsState, Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        this.f15254a = 1;
        this.f15255b = bookmarkShareDetailsState;
        this.f15256c = context;
        this.f15257d = uri;
        this.f15258e = jVar;
        this.f15259f = bookmarkShareDetailsViewModel;
    }
}

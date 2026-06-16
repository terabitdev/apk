package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import android.content.Context;
import android.net.Uri;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f15250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f15251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j.j f15252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BookmarkShareDetailsViewModel f15253e;

    public /* synthetic */ d(Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, int i10) {
        this.f15249a = i10;
        this.f15250b = context;
        this.f15251c = uri;
        this.f15252d = jVar;
        this.f15253e = bookmarkShareDetailsViewModel;
    }

    @Override // ho.a
    public final Object invoke() {
        z BookmarkShareDetailsScreen$lambda$3$5$0$0;
        z BookmarkShareDetailsScreen$lambda$3$6$0$0;
        switch (this.f15249a) {
            case 0:
                BookmarkShareDetailsScreen$lambda$3$5$0$0 = BookmarkShareDetailsScreenKt.BookmarkShareDetailsScreen$lambda$3$5$0$0(this.f15250b, this.f15251c, this.f15252d, this.f15253e);
                return BookmarkShareDetailsScreen$lambda$3$5$0$0;
            default:
                BookmarkShareDetailsScreen$lambda$3$6$0$0 = BookmarkShareDetailsScreenKt.BookmarkShareDetailsScreen$lambda$3$6$0$0(this.f15250b, this.f15251c, this.f15252d, this.f15253e);
                return BookmarkShareDetailsScreen$lambda$3$6$0$0;
        }
    }
}

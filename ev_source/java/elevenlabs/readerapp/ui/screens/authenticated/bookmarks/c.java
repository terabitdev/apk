package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.ChapterListItemKt;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f15248c;

    public /* synthetic */ c(ho.a aVar, z0 z0Var, int i10) {
        this.f15246a = i10;
        this.f15247b = aVar;
        this.f15248c = z0Var;
    }

    @Override // ho.a
    public final Object invoke() {
        z BookmarkRow$lambda$6$0;
        z RecentReadItemV4$lambda$4$2$0$0;
        z ChapterListItem$lambda$5$3$2$0;
        switch (this.f15246a) {
            case 0:
                BookmarkRow$lambda$6$0 = BookmarkRowKt.BookmarkRow$lambda$6$0(this.f15247b, this.f15248c);
                return BookmarkRow$lambda$6$0;
            case 1:
                RecentReadItemV4$lambda$4$2$0$0 = HomeRecentReadsCarouselKt.RecentReadItemV4$lambda$4$2$0$0(this.f15247b, this.f15248c);
                return RecentReadItemV4$lambda$4$2$0$0;
            default:
                ChapterListItem$lambda$5$3$2$0 = ChapterListItemKt.ChapterListItem$lambda$5$3$2$0(this.f15247b, this.f15248c);
                return ChapterListItem$lambda$5$3$2$0;
        }
    }
}

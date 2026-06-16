package io.elevenlabs.data.database.entities.bookmarks;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookmarksDao_Impl f14008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BookmarkEntity f14009c;

    public /* synthetic */ b(BookmarksDao_Impl bookmarksDao_Impl, BookmarkEntity bookmarkEntity, int i10) {
        this.f14007a = i10;
        this.f14008b = bookmarksDao_Impl;
        this.f14009c = bookmarkEntity;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z insert$lambda$0;
        z update$lambda$0;
        z deleteBookmark$lambda$0;
        switch (this.f14007a) {
            case 0:
                insert$lambda$0 = BookmarksDao_Impl.insert$lambda$0(this.f14008b, this.f14009c, (mb.a) obj);
                return insert$lambda$0;
            case 1:
                update$lambda$0 = BookmarksDao_Impl.update$lambda$0(this.f14008b, this.f14009c, (mb.a) obj);
                return update$lambda$0;
            default:
                deleteBookmark$lambda$0 = BookmarksDao_Impl.deleteBookmark$lambda$0(this.f14008b, this.f14009c, (mb.a) obj);
                return deleteBookmark$lambda$0;
        }
    }
}

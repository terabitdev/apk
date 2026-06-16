package io.elevenlabs.data.database.entities.bookmarks;

import ho.l;
import io.elevenlabs.data.database.entities.bookmarks.BookmarkEntity;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BookmarksDao_Impl f14005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BookmarkEntity.SyncState f14006d;

    public /* synthetic */ a(String str, BookmarksDao_Impl bookmarksDao_Impl, BookmarkEntity.SyncState syncState, int i10) {
        this.f14003a = i10;
        this.f14004b = str;
        this.f14005c = bookmarksDao_Impl;
        this.f14006d = syncState;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f14003a) {
            case 0:
                return BookmarksDao_Impl.a(this.f14004b, this.f14005c, this.f14006d, (mb.a) obj);
            case 1:
                return BookmarksDao_Impl.e(this.f14004b, this.f14005c, this.f14006d, (mb.a) obj);
            default:
                return BookmarksDao_Impl.c(this.f14004b, this.f14005c, this.f14006d, (mb.a) obj);
        }
    }
}

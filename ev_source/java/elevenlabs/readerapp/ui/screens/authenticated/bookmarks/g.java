package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15262b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f15261a = i10;
        this.f15262b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z BookmarkShareDetailsScreen$lambda$3$3$0;
        z BookmarkSheet$lambda$2$1$0;
        switch (this.f15261a) {
            case 0:
                BookmarkShareDetailsScreen$lambda$3$3$0 = BookmarkShareDetailsScreenKt.BookmarkShareDetailsScreen$lambda$3$3$0((BookmarkShareDetailsViewModel) this.f15262b);
                return BookmarkShareDetailsScreen$lambda$3$3$0;
            default:
                BookmarkSheet$lambda$2$1$0 = BookmarkSheetKt.BookmarkSheet$lambda$2$1$0((BottomSheetControl) this.f15262b);
                return BookmarkSheet$lambda$2$1$0;
        }
    }
}

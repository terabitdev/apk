package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.readerapp.core.MviViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MviViewModel f16071b;

    public /* synthetic */ d(MviViewModel mviViewModel, int i10) {
        this.f16070a = i10;
        this.f16071b = mviViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z BookmarksSheet$lambda$2$2$0;
        sn.z ContentSearchSheet$lambda$1$0$0;
        switch (this.f16070a) {
            case 0:
                BookmarksSheet$lambda$2$2$0 = BookmarksSheetKt.BookmarksSheet$lambda$2$2$0((ReadBookmarksViewModel) this.f16071b, (ho.l) obj);
                return BookmarksSheet$lambda$2$2$0;
            default:
                ContentSearchSheet$lambda$1$0$0 = ContentSearchSheetKt.ContentSearchSheet$lambda$1$0$0((ContentSearchViewModel) this.f16071b, (ho.l) obj);
                return ContentSearchSheet$lambda$1$0$0;
        }
    }
}

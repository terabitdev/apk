package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16115b;

    public /* synthetic */ k(String str, int i10) {
        this.f16114a = i10;
        this.f16115b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ContentSearchState onQueryChanged$lambda$0;
        ReadBookmarksState initialize$lambda$0;
        switch (this.f16114a) {
            case 0:
                onQueryChanged$lambda$0 = ContentSearchViewModel.onQueryChanged$lambda$0(this.f16115b, (ContentSearchState) obj);
                return onQueryChanged$lambda$0;
            default:
                initialize$lambda$0 = ReadBookmarksViewModel.initialize$lambda$0(this.f16115b, (ReadBookmarksState) obj);
                return initialize$lambda$0;
        }
    }
}

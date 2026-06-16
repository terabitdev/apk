package io.elevenlabs.readerapp.ui.screens.authenticated.search;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchViewModel f17041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17042c;

    public /* synthetic */ j(String str, SearchViewModel searchViewModel) {
        this.f17040a = 3;
        this.f17042c = str;
        this.f17041b = searchViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        SearchState onExploreGenericItemClicked$lambda$0;
        SearchState onExploreReadClicked$lambda$0;
        SearchState onExploreCollectionClicked$lambda$0;
        SearchState onQueryChanged$lambda$0;
        switch (this.f17040a) {
            case 0:
                onExploreGenericItemClicked$lambda$0 = SearchViewModel.onExploreGenericItemClicked$lambda$0(this.f17041b, this.f17042c, (SearchState) obj);
                return onExploreGenericItemClicked$lambda$0;
            case 1:
                onExploreReadClicked$lambda$0 = SearchViewModel.onExploreReadClicked$lambda$0(this.f17041b, this.f17042c, (SearchState) obj);
                return onExploreReadClicked$lambda$0;
            case 2:
                onExploreCollectionClicked$lambda$0 = SearchViewModel.onExploreCollectionClicked$lambda$0(this.f17041b, this.f17042c, (SearchState) obj);
                return onExploreCollectionClicked$lambda$0;
            default:
                onQueryChanged$lambda$0 = SearchViewModel.onQueryChanged$lambda$0(this.f17042c, this.f17041b, (SearchState) obj);
                return onQueryChanged$lambda$0;
        }
    }

    public /* synthetic */ j(SearchViewModel searchViewModel, String str, int i10) {
        this.f17040a = i10;
        this.f17041b = searchViewModel;
        this.f17042c = str;
    }
}

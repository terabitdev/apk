package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import ho.l;
import ho.p;
import ho.r;
import ho.s;
import i1.j2;
import i1.o;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchCorpus;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchState;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel;
import io.elevenlabs.ui.components.LandscapistImageKt;
import java.util.List;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements p {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15479a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15484f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f15485x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ sn.d f15486y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f15487z0;

    public /* synthetic */ h(ho.a aVar, t tVar, xk.a aVar2, vk.i iVar, l lVar, u3.c cVar, r rVar, s sVar, r rVar2, int i10, int i11) {
        this.f15480b = aVar;
        this.f15487z0 = tVar;
        this.f15484f = aVar2;
        this.Y = iVar;
        this.f15481c = lVar;
        this.Z = cVar;
        this.f15485x0 = rVar;
        this.f15486y0 = sVar;
        this.A0 = rVar2;
        this.f15482d = i10;
        this.f15483e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreLargeGridCollection$lambda$1;
        z HomeScreenV4$lambda$13;
        z ReadDetailsScreen$lambda$16;
        z SearchScreenUI$lambda$10;
        z SearchScreen$lambda$3;
        z LandscapistCoilImage$lambda$1;
        switch (this.f15479a) {
            case 0:
                ExploreLargeGridCollection$lambda$1 = ExploreLargeGridCollectionKt.ExploreLargeGridCollection$lambda$1((String) this.f15484f, (String) this.Y, (List) this.f15485x0, this.f15481c, this.f15480b, (t) this.f15487z0, (Integer) this.A0, (l) this.f15486y0, (String) this.Z, this.f15482d, this.f15483e, (m) obj, ((Integer) obj2).intValue());
                return ExploreLargeGridCollection$lambda$1;
            case 1:
                HomeScreenV4$lambda$13 = HomeScreenV4Kt.HomeScreenV4$lambda$13(this.f15480b, (HomeViewModelV4) this.f15484f, (p) this.Y, (p) this.Z, (p) this.f15485x0, this.f15481c, (ho.a) this.f15486y0, (j2) this.f15487z0, (o) this.A0, this.f15482d, this.f15483e, (m) obj, ((Integer) obj2).intValue());
                return HomeScreenV4$lambda$13;
            case 2:
                ReadDetailsScreen$lambda$16 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$16((String) this.f15484f, (String) this.Y, this.f15480b, (p) this.Z, this.f15481c, (l) this.f15486y0, (l) this.f15485x0, (ho.a) this.f15487z0, (ReadDetailsViewModel) this.A0, this.f15482d, this.f15483e, (m) obj, ((Integer) obj2).intValue());
                return ReadDetailsScreen$lambda$16;
            case 3:
                SearchScreenUI$lambda$10 = SearchScreenKt.SearchScreenUI$lambda$10((SearchState) this.f15484f, this.f15481c, (l) this.f15486y0, (l) this.Y, (l) this.Z, (l) this.f15485x0, this.f15480b, (j2) this.f15487z0, (o) this.A0, this.f15482d, this.f15483e, (m) obj, ((Integer) obj2).intValue());
                return SearchScreenUI$lambda$10;
            case 4:
                SearchScreen$lambda$3 = SearchScreenKt.SearchScreen$lambda$3((SearchCorpus) this.f15484f, this.f15480b, this.f15481c, (l) this.f15486y0, (l) this.Y, (l) this.Z, (j2) this.f15485x0, (o) this.f15487z0, (SearchViewModel) this.A0, this.f15482d, this.f15483e, (m) obj, ((Integer) obj2).intValue());
                return SearchScreen$lambda$3;
            default:
                LandscapistCoilImage$lambda$1 = LandscapistImageKt.LandscapistCoilImage$lambda$1(this.f15480b, (t) this.f15487z0, (xk.a) this.f15484f, (vk.i) this.Y, this.f15481c, (u3.c) this.Z, (r) this.f15485x0, (s) this.f15486y0, (r) this.A0, this.f15482d, this.f15483e, (m) obj, ((Integer) obj2).intValue());
                return LandscapistCoilImage$lambda$1;
        }
    }

    public /* synthetic */ h(ho.a aVar, HomeViewModelV4 homeViewModelV4, p pVar, p pVar2, p pVar3, l lVar, ho.a aVar2, j2 j2Var, o oVar, int i10, int i11) {
        this.f15480b = aVar;
        this.f15484f = homeViewModelV4;
        this.Y = pVar;
        this.Z = pVar2;
        this.f15485x0 = pVar3;
        this.f15481c = lVar;
        this.f15486y0 = aVar2;
        this.f15487z0 = j2Var;
        this.A0 = oVar;
        this.f15482d = i10;
        this.f15483e = i11;
    }

    public /* synthetic */ h(SearchCorpus searchCorpus, ho.a aVar, l lVar, l lVar2, l lVar3, l lVar4, j2 j2Var, o oVar, SearchViewModel searchViewModel, int i10, int i11) {
        this.f15484f = searchCorpus;
        this.f15480b = aVar;
        this.f15481c = lVar;
        this.f15486y0 = lVar2;
        this.Y = lVar3;
        this.Z = lVar4;
        this.f15485x0 = j2Var;
        this.f15487z0 = oVar;
        this.A0 = searchViewModel;
        this.f15482d = i10;
        this.f15483e = i11;
    }

    public /* synthetic */ h(SearchState searchState, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, ho.a aVar, j2 j2Var, o oVar, int i10, int i11) {
        this.f15484f = searchState;
        this.f15481c = lVar;
        this.f15486y0 = lVar2;
        this.Y = lVar3;
        this.Z = lVar4;
        this.f15485x0 = lVar5;
        this.f15480b = aVar;
        this.f15487z0 = j2Var;
        this.A0 = oVar;
        this.f15482d = i10;
        this.f15483e = i11;
    }

    public /* synthetic */ h(String str, String str2, ho.a aVar, p pVar, l lVar, l lVar2, l lVar3, ho.a aVar2, ReadDetailsViewModel readDetailsViewModel, int i10, int i11) {
        this.f15484f = str;
        this.Y = str2;
        this.f15480b = aVar;
        this.Z = pVar;
        this.f15481c = lVar;
        this.f15486y0 = lVar2;
        this.f15485x0 = lVar3;
        this.f15487z0 = aVar2;
        this.A0 = readDetailsViewModel;
        this.f15482d = i10;
        this.f15483e = i11;
    }

    public /* synthetic */ h(String str, String str2, List list, l lVar, ho.a aVar, t tVar, Integer num, l lVar2, String str3, int i10, int i11) {
        this.f15484f = str;
        this.Y = str2;
        this.f15485x0 = list;
        this.f15481c = lVar;
        this.f15480b = aVar;
        this.f15487z0 = tVar;
        this.A0 = num;
        this.f15486y0 = lVar2;
        this.Z = str3;
        this.f15482d = i10;
        this.f15483e = i11;
    }
}

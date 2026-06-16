package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$loadLibrary$1;
import java.util.List;
import java.util.Set;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17047c;

    public /* synthetic */ l(Object obj, Object obj2, int i10) {
        this.f17045a = i10;
        this.f17046b = obj;
        this.f17047c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z SearchScreenUI$lambda$9$0$0$1$0;
        switch (this.f17045a) {
            case 0:
                return SearchViewModel$loadExplore$1.h((SearchViewModel) this.f17046b, (AsyncCallResult.Error) this.f17047c, (SearchState) obj);
            case 1:
                return SearchViewModel$loadExplore$1.d((AsyncCallResult) this.f17046b, (Set) this.f17047c, (SearchState) obj);
            case 2:
                return SearchViewModel$loadLibrary$1.AnonymousClass1.d((SearchViewModel) this.f17046b, (List) this.f17047c, (SearchState) obj);
            default:
                SearchScreenUI$lambda$9$0$0$1$0 = SearchScreenKt.SearchScreenUI$lambda$9$0$0$1$0((ho.l) this.f17046b, (z0) this.f17047c, (String) obj);
                return SearchScreenUI$lambda$9$0$0$1$0;
        }
    }
}

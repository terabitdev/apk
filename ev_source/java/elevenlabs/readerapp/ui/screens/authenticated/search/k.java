package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.SearchResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel;
import java.util.Date;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17044b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f17043a = i10;
        this.f17044b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        SearchState invokeSuspend$lambda$0;
        SearchState emit$lambda$0;
        z SearchScreenUI$lambda$9$0$0$1$0$0;
        z SearchListColumn$lambda$2$0$8$1$0$0;
        SearchState corpus$lambda$0;
        switch (this.f17043a) {
            case 0:
                invokeSuspend$lambda$0 = SearchViewModel.AnonymousClass1.C00491.invokeSuspend$lambda$0((Date) this.f17044b, (SearchState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                emit$lambda$0 = SearchViewModel.AnonymousClass3.AnonymousClass1.emit$lambda$0((MediaQueueState) this.f17044b, (SearchState) obj);
                return emit$lambda$0;
            case 2:
                SearchScreenUI$lambda$9$0$0$1$0$0 = SearchScreenKt.SearchScreenUI$lambda$9$0$0$1$0$0((z0) this.f17044b, (SearchViewModel) obj);
                return SearchScreenUI$lambda$9$0$0$1$0$0;
            case 3:
                SearchListColumn$lambda$2$0$8$1$0$0 = SearchScreenKt.SearchListColumn$lambda$2$0$8$1$0$0((SearchResult) this.f17044b, (SearchViewModel) obj);
                return SearchListColumn$lambda$2$0$8$1$0$0;
            default:
                corpus$lambda$0 = SearchViewModel.setCorpus$lambda$0((SearchCorpus) this.f17044b, (SearchState) obj);
                return corpus$lambda$0;
        }
    }
}

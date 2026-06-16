package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import a7.u;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.readerapp.paging.ExploreFilteredContentPagingSource;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import sn.z;
import ta.e0;
import ta.n1;
import ta.w0;
import ta.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$special$$inlined$flatMapLatest$1", f = "ExploreViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ExploreViewModel$special$$inlined$flatMapLatest$1 extends yn.i implements ho.q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ExploreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreViewModel$special$$inlined$flatMapLatest$1(wn.c cVar, ExploreViewModel exploreViewModel) {
        super(3, cVar);
        this.this$0 = exploreViewModel;
    }

    public final Object invoke(ir.j jVar, ExploreViewModel.PagingKey pagingKey, wn.c<? super z> cVar) {
        ExploreViewModel$special$$inlined$flatMapLatest$1 exploreViewModel$special$$inlined$flatMapLatest$1 = new ExploreViewModel$special$$inlined$flatMapLatest$1(cVar, this.this$0);
        exploreViewModel$special$$inlined$flatMapLatest$1.L$0 = jVar;
        exploreViewModel$special$$inlined$flatMapLatest$1.L$1 = pagingKey;
        return exploreViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i iVar;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            ir.j jVar = (ir.j) this.L$0;
            final ExploreViewModel.PagingKey pagingKey = (ExploreViewModel.PagingKey) this.L$1;
            if (pagingKey.getActiveFilters().isEmpty()) {
                iVar = new u(new z0(new u(new ta.z(null), 3), z0.f32777e, z0.f32778f, new q2.z0(21)), 3);
            } else {
                w0 w0Var = new w0(1, 1, 1, 32);
                final ExploreViewModel exploreViewModel = this.this$0;
                iVar = new e0(new j1.c(new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$filteredContentPagingData$2$1
                    @Override // ho.a
                    public final n1 invoke() {
                        String str;
                        ReadsExploreService readsExploreService = ExploreViewModel.this.readsExploreService;
                        String languageCode = pagingKey.getLanguageCode();
                        String currencyCode = pagingKey.getCurrencyCode();
                        Map<String, List<String>> activeFilters = pagingKey.getActiveFilters();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, List<String>> entry : activeFilters.entrySet()) {
                            if (!kotlin.jvm.internal.m.c(entry.getKey(), "sort_by")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        List<String> list = pagingKey.getActiveFilters().get("sort_by");
                        if (list != null) {
                            str = (String) tn.o.y0(list);
                        } else {
                            str = null;
                        }
                        String str2 = str;
                        Logger logger = ExploreViewModel.this.logger;
                        final ExploreViewModel exploreViewModel2 = ExploreViewModel.this;
                        return new ExploreFilteredContentPagingSource(readsExploreService, languageCode, currencyCode, linkedHashMap, str2, logger, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$filteredContentPagingData$2$1.2
                            public final void invoke(List<? extends ReadsExplorePage.Section> list2) {
                                list2.getClass();
                                ExploreViewModel.this.fetchPricesForSections(list2);
                            }

                            @Override // ho.l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((List<? extends ReadsExplorePage.Section>) obj2);
                                return z.f31622a;
                            }
                        });
                    }
                }, null, 1), w0Var).f32574e;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object r10 = ir.r.r(jVar, iVar, this);
            xn.a aVar = xn.a.f37986a;
            if (r10 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ir.j) obj, (ExploreViewModel.PagingKey) obj2, (wn.c<? super z>) obj3);
    }
}

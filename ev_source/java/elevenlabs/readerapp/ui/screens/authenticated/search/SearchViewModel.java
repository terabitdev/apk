package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import androidx.lifecycle.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.ui.ShowkasePreviewGroup;
import ir.r;
import ir.z1;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020#2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020#2\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b-\u0010+J\u0015\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020(¢\u0006\u0004\b/\u0010+J\u0015\u00101\u001a\u00020#2\u0006\u00100\u001a\u00020(¢\u0006\u0004\b1\u0010+J\r\u00102\u001a\u00020\u001e¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u001e¢\u0006\u0004\b4\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@¨\u0006C"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/ReadsExploreService;", "readsExploreService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "getCurrentTimeUseCase", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/ReadsExploreService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;)V", "loadLibrary", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchState;)Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchState;", "loadExplore", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "Lsn/z;", "onClickAddOrRemoveFromQueue", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchCorpus;", "corpus", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setCorpus", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchCorpus;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "load", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", FirebaseAnalytics.Event.SEARCH, "onQueryChanged", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "collectionId", "onExploreCollectionClicked", "readId", "onExploreReadClicked", "deeplink", "onExploreGenericItemClicked", "logSearchResultClickLibrary", "()V", "logSearchResultClickExplore", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/ReadsExploreService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/StringProvider;", "Lfr/k1;", "libraryLoadJob", "Lfr/k1;", "exploreLoadJob", "debounceJob", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SearchViewModel extends MviViewModel<SearchState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private k1 debounceJob;
    private k1 exploreLoadJob;
    private final GetCurrentTimeUseCase getCurrentTimeUseCase;
    private k1 libraryLoadJob;
    private final Logger logger;
    private final PlayerService playerService;
    private final ReadsExploreService readsExploreService;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private final ToastService toastService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$1", f = "SearchViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$1$1", f = "SearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "it", "Lsn/z;", "<anonymous>", "(Ljava/util/Date;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00491 extends yn.i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00491(SearchViewModel searchViewModel, wn.c<? super C00491> cVar) {
                super(2, cVar);
                this.this$0 = searchViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SearchState invokeSuspend$lambda$0(Date date, SearchState searchState) {
                return SearchState.copy$default(searchState, null, null, false, null, false, 0, false, null, null, false, null, null, null, date, null, 24575, null);
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00491 c00491 = new C00491(this.this$0, cVar);
                c00491.L$0 = obj;
                return c00491;
            }

            @Override // ho.p
            public final Object invoke(Date date, wn.c<? super z> cVar) {
                return ((C00491) create(date, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                Date date = (Date) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new k(date, 0));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
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
                GetCurrentTimeUseCase getCurrentTimeUseCase = SearchViewModel.this.getCurrentTimeUseCase;
                xq.a aVar = xq.b.f38124b;
                ir.i mo959invokeLRDsOJo = getCurrentTimeUseCase.mo959invokeLRDsOJo(xq.g.n(1, xq.d.MINUTES));
                C00491 c00491 = new C00491(SearchViewModel.this, null);
                this.label = 1;
                Object l4 = r.l(mo959invokeLRDsOJo, c00491, this);
                xn.a aVar2 = xn.a.f37986a;
                if (l4 == aVar2) {
                    return aVar2;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$2", f = "SearchViewModel.kt", l = {59, 59}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements p {
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (ir.r.k((ir.i) r5, r4) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            if (r5 == r3) goto L15;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            xn.a aVar = xn.a.f37986a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        return z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                PlayerService playerService = SearchViewModel.this.playerService;
                this.label = 1;
                obj = playerService.connect(this);
            }
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchCorpus.values().length];
            try {
                iArr[SearchCorpus.LIBRARY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchCorpus.EXPLORE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchCorpus.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel(DispatcherFactory dispatcherFactory, ReadsService readsService, ReadsExploreService readsExploreService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, GetCurrentTimeUseCase getCurrentTimeUseCase, Logger logger, Analytics analytics, PlayerService playerService, ToastService toastService, StringProvider stringProvider) {
        super(new SearchState(SearchCorpus.BOTH, null, false, null, false, 0, false, null, null, false, null, null, null, new Date(), null, 24574, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        readsService.getClass();
        readsExploreService.getClass();
        resolveErrorMessageUseCase.getClass();
        getCurrentTimeUseCase.getClass();
        logger.getClass();
        analytics.getClass();
        playerService.getClass();
        toastService.getClass();
        stringProvider.getClass();
        this.readsService = readsService;
        this.readsExploreService = readsExploreService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.getCurrentTimeUseCase = getCurrentTimeUseCase;
        this.logger = logger;
        this.analytics = analytics;
        this.playerService = playerService;
        this.toastService = toastService;
        this.stringProvider = stringProvider;
        load();
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchState load$lambda$0(SearchViewModel searchViewModel, SearchState searchState) {
        searchState.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[searchState.getCorpus().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    searchViewModel.loadLibrary(searchState);
                    searchViewModel.loadExplore(searchState);
                    return searchState;
                }
                c6.p();
                return null;
            }
            searchViewModel.loadExplore(searchState);
            return searchState;
        }
        searchViewModel.loadLibrary(searchState);
        return searchState;
    }

    private final SearchState loadExplore(SearchState searchState) {
        if (!searchState.getExploreHasMore()) {
            return searchState;
        }
        k1 k1Var = this.exploreLoadJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.exploreLoadJob = g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new SearchViewModel$loadExplore$1(this, searchState, null), 2);
        return SearchState.copy$default(searchState, null, null, false, null, false, 0, true, null, null, false, null, "", null, null, null, 30655, null);
    }

    private final SearchState loadLibrary(SearchState searchState) {
        if (!searchState.getLibraryHasMore()) {
            return searchState;
        }
        k1 k1Var = this.libraryLoadJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.libraryLoadJob = g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new SearchViewModel$loadLibrary$1(this, searchState, null), 2);
        return SearchState.copy$default(searchState, null, null, true, null, false, 0, false, null, null, false, null, null, null, null, null, 32763, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchState onExploreCollectionClicked$lambda$0(SearchViewModel searchViewModel, String str, SearchState searchState) {
        searchState.getClass();
        if (searchState.getExploreSearchId() == null) {
            return searchState;
        }
        g0.D(c1.h(searchViewModel), searchViewModel.getDispatcherFactory().getDefault(), null, new SearchViewModel$onExploreCollectionClicked$1$1(searchViewModel, searchState, str, null), 2);
        return searchState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchState onExploreGenericItemClicked$lambda$0(SearchViewModel searchViewModel, String str, SearchState searchState) {
        searchState.getClass();
        if (searchState.getExploreSearchId() == null) {
            return searchState;
        }
        g0.D(c1.h(searchViewModel), searchViewModel.getDispatcherFactory().getDefault(), null, new SearchViewModel$onExploreGenericItemClicked$1$1(searchViewModel, searchState, str, null), 2);
        return searchState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchState onExploreReadClicked$lambda$0(SearchViewModel searchViewModel, String str, SearchState searchState) {
        searchState.getClass();
        if (searchState.getExploreSearchId() == null) {
            return searchState;
        }
        g0.D(c1.h(searchViewModel), searchViewModel.getDispatcherFactory().getDefault(), null, new SearchViewModel$onExploreReadClicked$1$1(searchViewModel, searchState, str, null), 2);
        return searchState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchState onQueryChanged$lambda$0(String str, SearchViewModel searchViewModel, SearchState searchState) {
        boolean z6;
        boolean z10;
        searchState.getClass();
        if (m.c(str, searchState.getQuery())) {
            return searchState;
        }
        k1 k1Var = searchViewModel.debounceJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        searchViewModel.debounceJob = g0.D(c1.h(searchViewModel), searchViewModel.getDispatcherFactory().getDefault(), null, new SearchViewModel$onQueryChanged$1$1(searchViewModel, null), 2);
        if (searchState.getCorpus() != SearchCorpus.EXPLORE_ONLY) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (searchState.getCorpus() != SearchCorpus.LIBRARY_ONLY) {
            z10 = true;
        } else {
            z10 = false;
        }
        return SearchState.copy$default(searchState, null, str, z6, null, true, 10, z10, t.f33547a, null, true, null, null, null, null, null, 31753, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchState setCorpus$lambda$0(SearchCorpus searchCorpus, SearchState searchState) {
        searchState.getClass();
        return SearchState.copy$default(searchState, searchCorpus, null, false, null, false, 0, false, null, null, false, null, null, null, null, null, 32766, null);
    }

    public final MviViewModel.StateUpdate load() {
        return queueStateUpdate(new h(this, 1));
    }

    public final void logSearchResultClickExplore() {
        this.analytics.log(new Analytics.Event.HomeClickedSearchResult(ShowkasePreviewGroup.EXPLORE));
    }

    public final void logSearchResultClickLibrary() {
        this.analytics.log(new Analytics.Event.HomeClickedSearchResult("library"));
    }

    public final void onClickAddOrRemoveFromQueue(ReadMeta readMeta) {
        readMeta.getClass();
        MviViewModel.launch$default(this, null, new SearchViewModel$onClickAddOrRemoveFromQueue$1(this, readMeta, null), 1, null);
    }

    public final MviViewModel.StateUpdate onExploreCollectionClicked(String collectionId) {
        collectionId.getClass();
        return queueStateUpdate(new j(this, collectionId, 2));
    }

    public final MviViewModel.StateUpdate onExploreGenericItemClicked(String deeplink) {
        deeplink.getClass();
        return queueStateUpdate(new j(this, deeplink, 0));
    }

    public final MviViewModel.StateUpdate onExploreReadClicked(String readId) {
        readId.getClass();
        return queueStateUpdate(new j(this, readId, 1));
    }

    public final MviViewModel.StateUpdate onQueryChanged(String search) {
        search.getClass();
        return queueStateUpdate(new j(search, this));
    }

    public final MviViewModel.StateUpdate setCorpus(SearchCorpus corpus) {
        corpus.getClass();
        return queueStateUpdate(new k(corpus, 4));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$3", f = "SearchViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements p {
        int label;

        public AnonymousClass3(wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                z1 observeQueueState = SearchViewModel.this.playerService.observeQueueState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SearchViewModel.this);
                this.label = 1;
                Object collect = observeQueueState.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            c6.u();
            return null;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ SearchViewModel this$0;

            public AnonymousClass1(SearchViewModel searchViewModel) {
                this.this$0 = searchViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SearchState emit$lambda$0(MediaQueueState mediaQueueState, SearchState searchState) {
                List<MediaItemState> list;
                searchState.getClass();
                if (mediaQueueState != null) {
                    list = mediaQueueState.getItems();
                } else {
                    list = null;
                }
                if (list == null) {
                    list = t.f33547a;
                }
                return SearchState.copy$default(searchState, null, null, false, null, false, 0, false, null, null, false, null, null, null, null, list, 16383, null);
            }

            public final Object emit(MediaQueueState mediaQueueState, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new k(mediaQueueState, 1));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((MediaQueueState) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.ExploreCollectionsService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.paging.ExploreCollectionItemsPagingSource;
import io.elevenlabs.readerapp.ui.delegates.AudioPreviewPlayback;
import io.elevenlabs.readerapp.ui.delegates.PriceFetcher;
import io.elevenlabs.readerapp.ui.delegates.PriceFetcherKt;
import io.elevenlabs.readerapp.ui.models.UiAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel;
import ir.z1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import ta.n1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CBQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ/\u0010!\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b&\u0010\u001bJ\r\u0010'\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0019¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u0019¢\u0006\u0004\b-\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0;\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0;0:8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/ExploreCollectionViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/ExploreCollectionState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ExploreCollectionsService;", "exploreCollectionsService", "Lio/elevenlabs/domain/services/ReadsExploreService;", "readsExploreService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ExploreCollectionsService;Lio/elevenlabs/domain/services/ReadsExploreService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/services/PurchasesService;Lio/elevenlabs/domain/services/AudioPreviewService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;)V", "", "collectionId", "Lsn/z;", "doInit", "(Ljava/lang/String;)V", "loadCollectionDetails", "", "Lio/elevenlabs/domain/model/ExploreRead;", "initialItems", "initialNextCursor", "initItemsPagingData", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", FirebaseAnalytics.Param.ITEMS, "fetchPricesFromItems", "(Ljava/util/List;)V", "init", "clearTriggerNavigateBack", "()V", "read", "playPreview", "(Lio/elevenlabs/domain/model/ExploreRead;)V", "stopPreview", "onRetry", "Lio/elevenlabs/domain/services/ExploreCollectionsService;", "Lio/elevenlabs/domain/services/ReadsExploreService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "audioPreview", "Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "priceFetcher", "Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "Lir/i;", "Lta/z0;", "_itemsPagingData", "Lir/i;", "language", "Ljava/lang/String;", "getItemsPagingData", "()Lir/i;", "itemsPagingData", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreCollectionViewModel extends MviViewModel<ExploreCollectionState> {
    private static final String TAG = "ExploreCollectionScreen";
    private ir.i _itemsPagingData;
    private final Analytics analytics;
    private final AudioPreviewPlayback audioPreview;
    private final CustomerService customerService;
    private final ExploreCollectionsService exploreCollectionsService;
    private String language;
    private final Logger logger;
    private final PriceFetcher priceFetcher;
    private final ReadsExploreService readsExploreService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreCollectionViewModel(DispatcherFactory dispatcherFactory, ExploreCollectionsService exploreCollectionsService, ReadsExploreService readsExploreService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, CustomerService customerService, PurchasesService purchasesService, AudioPreviewService audioPreviewService, Analytics analytics, Logger logger) {
        super(new ExploreCollectionState(null, null, false, null, null, null, null, null, 255, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        exploreCollectionsService.getClass();
        readsExploreService.getClass();
        resolveErrorMessageUseCase.getClass();
        customerService.getClass();
        purchasesService.getClass();
        audioPreviewService.getClass();
        analytics.getClass();
        logger.getClass();
        this.exploreCollectionsService = exploreCollectionsService;
        this.readsExploreService = readsExploreService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.customerService = customerService;
        this.analytics = analytics;
        this.logger = logger;
        this.audioPreview = new AudioPreviewPlayback(audioPreviewService, androidx.lifecycle.c1.h(this), dispatcherFactory.getIo());
        this.priceFetcher = new PriceFetcher(purchasesService, logger, androidx.lifecycle.c1.h(this), dispatcherFactory.getIo());
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreCollectionState clearTriggerNavigateBack$lambda$0(ExploreCollectionState exploreCollectionState) {
        exploreCollectionState.getClass();
        return ExploreCollectionState.copy$default(exploreCollectionState, null, null, false, null, UiAction.Reset.INSTANCE, null, null, null, 239, null);
    }

    private final void doInit(String collectionId) {
        this.priceFetcher.reset();
        this._itemsPagingData = null;
        queueStateUpdate(new k0(collectionId, 4));
        this.language = this.readsExploreService.getPersistedExploreLanguage();
        loadCollectionDetails(collectionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreCollectionState doInit$lambda$0(String str, ExploreCollectionState exploreCollectionState) {
        exploreCollectionState.getClass();
        return ExploreCollectionState.copy$default(exploreCollectionState, str, null, true, null, null, null, null, null, 240, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchPricesFromItems(List<ExploreRead> items) {
        this.priceFetcher.fetchPrices(PriceFetcherKt.extractProductIds(items));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initItemsPagingData(String collectionId, List<ExploreRead> initialItems, String initialNextCursor) {
        this._itemsPagingData = ta.l.b(new ta.e0(new j1.c(new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f(this, collectionId, initialItems, initialNextCursor, 2), null, 1), new ta.w0(20, 3, 20, 48)).f32574e, androidx.lifecycle.c1.h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1 initItemsPagingData$lambda$0(ExploreCollectionViewModel exploreCollectionViewModel, String str, List list, String str2) {
        return new ExploreCollectionItemsPagingSource(exploreCollectionViewModel.exploreCollectionsService, str, exploreCollectionViewModel.language, list, str2, new ExploreCollectionViewModel$initItemsPagingData$1$1(exploreCollectionViewModel));
    }

    private final void loadCollectionDetails(String collectionId) {
        fr.g0.D(androidx.lifecycle.c1.h(this), null, null, new ExploreCollectionViewModel$loadCollectionDetails$1(this, collectionId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z playPreview$lambda$0(ExploreCollectionViewModel exploreCollectionViewModel, ExploreRead exploreRead) {
        exploreCollectionViewModel.analytics.log(new Analytics.Event.ExploreClickedPreview(exploreRead.getReadId()));
        return sn.z.f31622a;
    }

    public final void clearTriggerNavigateBack() {
        queueStateUpdate(new w(21));
    }

    public final ir.i getItemsPagingData() {
        ir.i iVar = this._itemsPagingData;
        if (iVar == null) {
            return new a7.u(new ta.z0(new a7.u(new ta.z(null), 3), ta.z0.f32777e, ta.z0.f32778f, new q2.z0(21)), 3);
        }
        return iVar;
    }

    public final void init(String collectionId) {
        collectionId.getClass();
        this.logger.log(TAG, "init - collectionId=".concat(collectionId));
        if (((ExploreCollectionState) getStateFlow().getValue()).getCollectionId() != null) {
            return;
        }
        doInit(collectionId);
    }

    public final void onRetry() {
        String collectionId = ((ExploreCollectionState) getStateFlow().getValue()).getCollectionId();
        if (collectionId == null) {
            return;
        }
        doInit(collectionId);
    }

    public final void playPreview(ExploreRead read) {
        read.getClass();
        String previewAudioUrl = read.getPreviewAudioUrl();
        if (previewAudioUrl == null) {
            return;
        }
        this.audioPreview.toggle(read.getReadId(), previewAudioUrl, new v(this, read, 2));
    }

    public final void stopPreview() {
        this.audioPreview.stop();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$1", f = "ExploreCollectionViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                final ir.i customer = ExploreCollectionViewModel.this.customerService.getCustomer();
                ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ExploreCollectionViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        Boolean valueOf = Boolean.valueOf(((Customer) obj).isFreeUser());
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(valueOf, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(ExploreCollectionViewModel.this);
                this.label = 1;
                Object collect = o6.collect(anonymousClass2, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements ir.j {
            final /* synthetic */ ExploreCollectionViewModel this$0;

            public AnonymousClass2(ExploreCollectionViewModel exploreCollectionViewModel) {
                this.this$0 = exploreCollectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ExploreCollectionState emit$lambda$0(boolean z6, ExploreCollectionState exploreCollectionState) {
                exploreCollectionState.getClass();
                return ExploreCollectionState.copy$default(exploreCollectionState, null, null, false, null, null, Boolean.valueOf(z6), null, null, 223, null);
            }

            public final Object emit(final boolean z6, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.j0
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        ExploreCollectionState emit$lambda$0;
                        emit$lambda$0 = ExploreCollectionViewModel.AnonymousClass1.AnonymousClass2.emit$lambda$0(z6, (ExploreCollectionState) obj);
                        return emit$lambda$0;
                    }
                });
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$2", f = "ExploreCollectionViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                z1 playingReadId = ExploreCollectionViewModel.this.audioPreview.getPlayingReadId();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ExploreCollectionViewModel.this);
                this.label = 1;
                Object collect = playingReadId.collect(anonymousClass1, this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ ExploreCollectionViewModel this$0;

            public AnonymousClass1(ExploreCollectionViewModel exploreCollectionViewModel) {
                this.this$0 = exploreCollectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ExploreCollectionState emit$lambda$0(String str, ExploreCollectionState exploreCollectionState) {
                exploreCollectionState.getClass();
                return ExploreCollectionState.copy$default(exploreCollectionState, null, null, false, null, null, null, str, null, 191, null);
            }

            public final Object emit(String str, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new k0(str, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((String) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$3", f = "ExploreCollectionViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        int label;

        public AnonymousClass3(wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                z1 prices = ExploreCollectionViewModel.this.priceFetcher.getPrices();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ExploreCollectionViewModel.this);
                this.label = 1;
                Object collect = prices.collect(anonymousClass1, this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ ExploreCollectionViewModel this$0;

            public AnonymousClass1(ExploreCollectionViewModel exploreCollectionViewModel) {
                this.this$0 = exploreCollectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ExploreCollectionState emit$lambda$0(Map map, ExploreCollectionState exploreCollectionState) {
                exploreCollectionState.getClass();
                return ExploreCollectionState.copy$default(exploreCollectionState, null, null, false, null, null, null, null, map, 127, null);
            }

            public final Object emit(Map<String, MoneyPrice> map, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new l0(map, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((Map<String, MoneyPrice>) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }
}

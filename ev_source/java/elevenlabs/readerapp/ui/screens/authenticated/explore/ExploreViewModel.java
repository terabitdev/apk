package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import android.gov.nist.core.Separators;
import androidx.lifecycle.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import fr.d0;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.CurrencyUtilsKt;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.delegates.AudioPreviewPlayback;
import io.elevenlabs.readerapp.ui.delegates.PriceFetcher;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel;
import ir.d1;
import ir.z1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002JIBQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020(¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u001a¢\u0006\u0004\b1\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR#\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0D0C8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ReadsExploreService;", "readsExploreService", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsExploreService;Lio/elevenlabs/domain/services/UserConfigService;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/services/PurchasesService;Lio/elevenlabs/domain/services/AudioPreviewService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;)V", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, FirebaseAnalytics.Param.CURRENCY, "Lsn/z;", "loadInitialData", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "sections", "fetchPricesForSections", "(Ljava/util/List;)V", "retry", "()V", SubscriberAttributeKt.JSON_NAME_KEY, "values", "updateFilter", "(Ljava/lang/String;Ljava/util/List;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "clearFilter", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "resetAllFilters", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/ExploreRead;", "read", "playPreview", "(Lio/elevenlabs/domain/model/ExploreRead;)V", "stopPreview", "Lio/elevenlabs/domain/services/ReadsExploreService;", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/Logger;", "Lfr/k1;", "initialLoadJob", "Lfr/k1;", "Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "audioPreview", "Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "priceFetcher", "Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "Lir/i;", "Lta/z0;", "filteredContentPagingData", "Lir/i;", "getFilteredContentPagingData", "()Lir/i;", "Companion", "PagingKey", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreViewModel extends MviViewModel<ExploreState> {
    private static final int PAGING_MAX_SIZE = 200;
    private static final int PAGING_PAGE_SIZE = 1;
    private static final int PAGING_PREFETCH_DISTANCE = 1;
    private static final String TAG = "ExploreViewModel";
    private final Analytics analytics;
    private final AudioPreviewPlayback audioPreview;
    private final CustomerService customerService;
    private final ir.i filteredContentPagingData;
    private k1 initialLoadJob;
    private final Logger logger;
    private final PriceFetcher priceFetcher;
    private final ReadsExploreService readsExploreService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final UserConfigService userConfigService;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006HÆ\u0003J=\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreViewModel$PagingKey;", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "", "currencyCode", "activeFilters", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getLanguageCode", "()Ljava/lang/String;", "getCurrencyCode", "getActiveFilters", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class PagingKey {
        private final Map<String, List<String>> activeFilters;
        private final String currencyCode;
        private final String languageCode;

        /* JADX WARN: Multi-variable type inference failed */
        public PagingKey(String str, String str2, Map<String, ? extends List<String>> map) {
            map.getClass();
            this.languageCode = str;
            this.currencyCode = str2;
            this.activeFilters = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PagingKey copy$default(PagingKey pagingKey, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pagingKey.languageCode;
            }
            if ((i10 & 2) != 0) {
                str2 = pagingKey.currencyCode;
            }
            if ((i10 & 4) != 0) {
                map = pagingKey.activeFilters;
            }
            return pagingKey.copy(str, str2, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLanguageCode() {
            return this.languageCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final Map<String, List<String>> component3() {
            return this.activeFilters;
        }

        public final PagingKey copy(String languageCode, String currencyCode, Map<String, ? extends List<String>> activeFilters) {
            activeFilters.getClass();
            return new PagingKey(languageCode, currencyCode, activeFilters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PagingKey)) {
                return false;
            }
            PagingKey pagingKey = (PagingKey) other;
            if (kotlin.jvm.internal.m.c(this.languageCode, pagingKey.languageCode) && kotlin.jvm.internal.m.c(this.currencyCode, pagingKey.currencyCode) && kotlin.jvm.internal.m.c(this.activeFilters, pagingKey.activeFilters)) {
                return true;
            }
            return false;
        }

        public final Map<String, List<String>> getActiveFilters() {
            return this.activeFilters;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final String getLanguageCode() {
            return this.languageCode;
        }

        public int hashCode() {
            int hashCode;
            String str = this.languageCode;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = hashCode * 31;
            String str2 = this.currencyCode;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return this.activeFilters.hashCode() + ((i11 + i10) * 31);
        }

        public String toString() {
            String str = this.languageCode;
            String str2 = this.currencyCode;
            Map<String, List<String>> map = this.activeFilters;
            StringBuilder s10 = defpackage.f.s("PagingKey(languageCode=", str, ", currencyCode=", str2, ", activeFilters=");
            s10.append(map);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreViewModel(DispatcherFactory dispatcherFactory, ReadsExploreService readsExploreService, UserConfigService userConfigService, CustomerService customerService, PurchasesService purchasesService, AudioPreviewService audioPreviewService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics, Logger logger) {
        super(new ExploreState(false, null, null, null, null, null, null, null, null, null, 1023, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        readsExploreService.getClass();
        userConfigService.getClass();
        customerService.getClass();
        purchasesService.getClass();
        audioPreviewService.getClass();
        resolveErrorMessageUseCase.getClass();
        analytics.getClass();
        logger.getClass();
        this.readsExploreService = readsExploreService;
        this.userConfigService = userConfigService;
        this.customerService = customerService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.analytics = analytics;
        this.logger = logger;
        this.audioPreview = new AudioPreviewPlayback(audioPreviewService, c1.h(this), dispatcherFactory.getIo());
        this.priceFetcher = new PriceFetcher(purchasesService, logger, c1.h(this), dispatcherFactory.getIo());
        final z1 stateFlow = getStateFlow();
        this.filteredContentPagingData = ta.l.b(ir.r.G(ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$special$$inlined$map$1$2", f = "ExploreViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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
                                ExploreState exploreState = (ExploreState) obj;
                                ExploreViewModel.PagingKey pagingKey = new ExploreViewModel.PagingKey(exploreState.getLanguageCode(), exploreState.getCurrencyCode(), exploreState.getActiveFilters());
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(pagingKey, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }), new ExploreViewModel$special$$inlined$flatMapLatest$1(null, this)), c1.h(this));
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass4(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreState clearFilter$lambda$0(String str, ExploreState exploreState) {
        exploreState.getClass();
        LinkedHashMap T = a0.T(exploreState.getActiveFilters());
        T.remove(str);
        return ExploreViewModelKt.access$withUpdatedFilters(exploreState, T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchPricesForSections(List<? extends ReadsExplorePage.Section> sections) {
        this.priceFetcher.fetchPrices(ExploreViewModelKt.access$extractProductIds(sections));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadInitialData(String languageCode, String currency) {
        k1 k1Var = this.initialLoadJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.priceFetcher.reset();
        queueStateUpdate(new k(3));
        this.initialLoadJob = launch(getDispatcherFactory().getIo(), new ExploreViewModel$loadInitialData$2(this, languageCode, currency, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreState loadInitialData$lambda$0(ExploreState exploreState) {
        exploreState.getClass();
        return ExploreState.copy$default(exploreState, true, null, null, null, null, null, null, null, null, null, 1014, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z playPreview$lambda$0(ExploreViewModel exploreViewModel, ExploreRead exploreRead) {
        exploreViewModel.analytics.log(new Analytics.Event.ExploreClickedPreview(exploreRead.getReadId()));
        return z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreState resetAllFilters$lambda$0(ExploreState exploreState) {
        exploreState.getClass();
        return ExploreState.copy$default(exploreState, false, null, null, null, u.f33548a, null, null, null, null, null, 1007, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreState updateFilter$lambda$0(List list, String str, ExploreState exploreState) {
        exploreState.getClass();
        LinkedHashMap T = a0.T(exploreState.getActiveFilters());
        if (list.isEmpty()) {
            T.remove(str);
        } else {
            T.put(str, list);
        }
        return ExploreViewModelKt.access$withUpdatedFilters(exploreState, T);
    }

    public final MviViewModel.StateUpdate clearFilter(String key) {
        key.getClass();
        return queueStateUpdate(new r(key, 2));
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final ir.i getFilteredContentPagingData() {
        return this.filteredContentPagingData;
    }

    public final void playPreview(final ExploreRead read) {
        read.getClass();
        String previewAudioUrl = read.getPreviewAudioUrl();
        if (previewAudioUrl == null) {
            return;
        }
        this.audioPreview.toggle(read.getReadId(), previewAudioUrl, new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.p
            @Override // ho.a
            public final Object invoke() {
                z playPreview$lambda$0;
                playPreview$lambda$0 = ExploreViewModel.playPreview$lambda$0(ExploreViewModel.this, read);
                return playPreview$lambda$0;
            }
        });
    }

    public final MviViewModel.StateUpdate resetAllFilters() {
        return queueStateUpdate(new k(4));
    }

    public final void retry() {
        ExploreState exploreState = (ExploreState) getStateFlow().getValue();
        loadInitialData(exploreState.getLanguageCode(), exploreState.getCurrencyCode());
    }

    public final void stopPreview() {
        this.audioPreview.stop();
    }

    public final void updateFilter(String key, List<String> values) {
        key.getClass();
        values.getClass();
        this.analytics.log(new Analytics.Event.ExploreClickedFilterBy(key));
        queueStateUpdate(new o(values, key));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$4", f = "ExploreViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends yn.i implements ho.p {
        int label;

        public AnonymousClass4(wn.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass4(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass4) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                final ir.i customer = ExploreViewModel.this.customerService.getCustomer();
                ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$4$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$4$invokeSuspend$$inlined$map$1$2", f = "ExploreViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(ExploreViewModel.this);
                this.label = 1;
                Object collect = o6.collect(anonymousClass2, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$4$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements ir.j {
            final /* synthetic */ ExploreViewModel this$0;

            public AnonymousClass2(ExploreViewModel exploreViewModel) {
                this.this$0 = exploreViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ExploreState emit$lambda$0(boolean z6, ExploreState exploreState) {
                exploreState.getClass();
                return ExploreState.copy$default(exploreState, false, null, null, null, null, null, null, null, null, Boolean.valueOf(z6), 511, null);
            }

            public final Object emit(final boolean z6, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.t
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        ExploreState emit$lambda$0;
                        emit$lambda$0 = ExploreViewModel.AnonymousClass4.AnonymousClass2.emit$lambda$0(z6, (ExploreState) obj);
                        return emit$lambda$0;
                    }
                });
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$2", f = "ExploreViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
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
                z1 playingReadId = ExploreViewModel.this.audioPreview.getPlayingReadId();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ExploreViewModel.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ ExploreViewModel this$0;

            public AnonymousClass1(ExploreViewModel exploreViewModel) {
                this.this$0 = exploreViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ExploreState emit$lambda$0(String str, ExploreState exploreState) {
                exploreState.getClass();
                return ExploreState.copy$default(exploreState, false, null, null, null, null, null, null, null, str, null, 767, null);
            }

            public final Object emit(String str, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new r(str, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((String) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$3", f = "ExploreViewModel.kt", l = {112}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
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
                z1 prices = ExploreViewModel.this.priceFetcher.getPrices();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ExploreViewModel.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ ExploreViewModel this$0;

            public AnonymousClass1(ExploreViewModel exploreViewModel) {
                this.this$0 = exploreViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ExploreState emit$lambda$0(Map map, ExploreState exploreState) {
                exploreState.getClass();
                return ExploreState.copy$default(exploreState, false, null, null, null, null, null, null, map, null, null, 895, null);
            }

            public final Object emit(Map<String, MoneyPrice> map, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new s(map, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((Map<String, MoneyPrice>) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1", f = "ExploreViewModel.kt", l = {100}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1$2", f = "ExploreViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "language", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "Lsn/k;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;)Lsn/k;"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends yn.i implements ho.q {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
                super(3, cVar);
            }

            @Override // ho.q
            public final Object invoke(String str, String str2, wn.c<? super sn.k> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
                anonymousClass2.L$0 = str;
                anonymousClass2.L$1 = str2;
                return anonymousClass2.invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.L$0;
                String str2 = (String) this.L$1;
                if (this.label == 0) {
                    sn.a.g(obj);
                    return new sn.k(str, str2);
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
                ir.i observePersistedExploreLanguage = ExploreViewModel.this.readsExploreService.observePersistedExploreLanguage();
                final ir.i config = ExploreViewModel.this.userConfigService.getConfig();
                d1 d1Var = new d1(observePersistedExploreLanguage, ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ExploreViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        String storeCountryCode = ((UserConfig) obj).getStoreCountryCode();
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(storeCountryCode, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                }), new AnonymousClass2(null), 1);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(ExploreViewModel.this);
                this.label = 1;
                Object collect = d1Var.collect(anonymousClass3, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3<T> implements ir.j {
            final /* synthetic */ ExploreViewModel this$0;

            public AnonymousClass3(ExploreViewModel exploreViewModel) {
                this.this$0 = exploreViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ExploreState emit$lambda$0(String str, String str2, ExploreState exploreState) {
                exploreState.getClass();
                return ExploreState.copy$default(exploreState, false, null, null, null, null, str, str2, null, null, null, 927, null);
            }

            public final Object emit(sn.k kVar, wn.c<? super z> cVar) {
                String str = (String) kVar.f31600a;
                String deriveStoreCurrencyCode = CurrencyUtilsKt.deriveStoreCurrencyCode((String) kVar.f31601b, this.this$0.logger, ExploreViewModel.TAG);
                this.this$0.queueStateUpdate(new q(str, deriveStoreCurrencyCode, 0));
                this.this$0.loadInitialData(str, deriveStoreCurrencyCode);
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((sn.k) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}

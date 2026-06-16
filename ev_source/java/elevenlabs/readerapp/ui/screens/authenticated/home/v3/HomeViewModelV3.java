package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import com.revenuecat.purchases.utils.EventsFileHelper;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.NotificationPrimerData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.HomeService;
import io.elevenlabs.domain.services.NavigationService;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.services.WhatsNewService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.paging.HomeSubpagePagingSourceV3;
import ir.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import ta.e0;
import ta.n1;
import ta.w0;
import ta.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020%¢\u0006\u0004\b+\u0010'J\r\u0010,\u001a\u00020%¢\u0006\u0004\b,\u0010'J\u0015\u0010/\u001a\u00020%2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020%2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020%¢\u0006\u0004\b5\u0010'J\u0015\u00107\u001a\u00020(2\u0006\u00106\u001a\u00020-¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020%¢\u0006\u0004\b9\u0010'J\u0015\u0010<\u001a\u00020(2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020(2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020(2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010FR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010JR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010KR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010LR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010MR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010NR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010OR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010S\u001a\u0004\bT\u0010UR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010VR$\u0010Z\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001d\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X0W8F¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeViewModelV3;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v3/HomeStateV3;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/HomeService;", "homeService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionsService", "Lio/elevenlabs/domain/services/NavigationService;", "navigationService", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/WhatsNewService;", "whatsNewService", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "notificationPermissionService", "Lio/elevenlabs/domain/services/RuntimePermissionsService;", "runtimePermissionsService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/HomeService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/UserConfigService;Lio/elevenlabs/domain/services/CollectionsService;Lio/elevenlabs/domain/services/NavigationService;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/WhatsNewService;Lio/elevenlabs/domain/Configuration;Lio/elevenlabs/domain/services/NotificationPermissionService;Lio/elevenlabs/domain/services/RuntimePermissionsService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/PurchasesService;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "loadPage", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lsn/z;", "onDailyGoalClicked", "()V", "closeDailyStreakSettings", "closeWhatsNew", "", "isScreenVisible", "onScreenVisibleChange", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "subpageId", "selectTab", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "fireFilteredItemClickOnCurrentTab", "granted", "onNotificationPermissionResult", "(Z)V", "hideNotificationPrimer", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "onClickAddOrRemoveFromQueue", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "initSubpagePagingData", "(Ljava/lang/String;)V", "Lio/elevenlabs/domain/model/NotificationPrimerData;", "primerData", "showNotificationPrimer", "(Lio/elevenlabs/domain/model/NotificationPrimerData;)V", "Lio/elevenlabs/domain/services/HomeService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/domain/services/CollectionsService;", "Lio/elevenlabs/domain/services/NavigationService;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/services/WhatsNewService;", "Lio/elevenlabs/domain/Configuration;", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "Lio/elevenlabs/domain/services/RuntimePermissionsService;", "getRuntimePermissionsService", "()Lio/elevenlabs/domain/services/RuntimePermissionsService;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/PurchasesService;", "Lir/i;", "Lta/z0;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "_subpagePagingData", "Lir/i;", "getSubpagePagingData", "()Lir/i;", "subpagePagingData", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeViewModelV3 extends MviViewModel<HomeStateV3> {
    public static final int $stable = 8;
    private ir.i _subpagePagingData;
    private final Analytics analytics;
    private final CollectionsService collectionsService;
    private final Configuration configuration;
    private final HomeService homeService;
    private final NavigationService navigationService;
    private final NotificationPermissionService notificationPermissionService;
    private final PlayerService playerService;
    private final PurchasesService purchasesService;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final RuntimePermissionsService runtimePermissionsService;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    private final UserConfigService userConfigService;
    private final WhatsNewService whatsNewService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$1", f = "HomeViewModelV3.kt", l = {EventsFileHelper.MAX_EVENT_PROPERTY_SIZE}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

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
                PurchasesService purchasesService = HomeViewModelV3.this.purchasesService;
                this.label = 1;
                Object ensureAuthenticated = purchasesService.ensureAuthenticated(this);
                xn.a aVar = xn.a.f37986a;
                if (ensureAuthenticated == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$10", f = "HomeViewModelV3.kt", l = {154}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$10, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass10 extends yn.i implements ho.p {
        int label;

        public AnonymousClass10(wn.c<? super AnonymousClass10> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass10(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass10) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                ir.i primerRequests = HomeViewModelV3.this.notificationPermissionService.primerRequests();
                final HomeViewModelV3 homeViewModelV3 = HomeViewModelV3.this;
                ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3.10.1
                    public final Object emit(NotificationPrimerData notificationPrimerData, wn.c<? super z> cVar) {
                        HomeViewModelV3.this.showNotificationPrimer(notificationPrimerData);
                        return z.f31622a;
                    }

                    @Override // ir.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                        return emit((NotificationPrimerData) obj2, (wn.c<? super z>) cVar);
                    }
                };
                this.label = 1;
                Object collect = primerRequests.collect(jVar, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$2", f = "HomeViewModelV3.kt", l = {84, 84}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$2, reason: invalid class name */
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
                PlayerService playerService = HomeViewModelV3.this.playerService;
                this.label = 1;
                obj = playerService.connect(this);
            }
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$5", f = "HomeViewModelV3.kt", l = {107}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5 extends yn.i implements ho.p {
        int label;

        public AnonymousClass5(wn.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass5(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass5) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                final z1 stateFlow = HomeViewModelV3.this.getStateFlow();
                jr.j G = ir.r.G(ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$5$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$5$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$5$invokeSuspend$$inlined$map$1$2", f = "HomeViewModelV3.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        Boolean valueOf = Boolean.valueOf(((HomeStateV3) obj).isScreenVisible());
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
                }), new HomeViewModelV3$5$invokeSuspend$$inlined$flatMapLatest$1(null, HomeViewModelV3.this));
                this.label = 1;
                Object k4 = ir.r.k(G, this);
                xn.a aVar = xn.a.f37986a;
                if (k4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$9", f = "HomeViewModelV3.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$9, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass9 extends yn.i implements ho.p {
        int label;

        public AnonymousClass9(wn.c<? super AnonymousClass9> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass9(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass9) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sn.a.g(obj);
                if (!HomeViewModelV3.this.configuration.isE2eTesting() && HomeViewModelV3.this.whatsNewService.shouldShowWhatsNew()) {
                    HomeViewModelV3.this.whatsNewService.onWhatsNewShown();
                    HomeViewModelV3.this.queueStateUpdate(new u(0));
                }
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HomeViewModelV3(DispatcherFactory dispatcherFactory, HomeService homeService, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, UserConfigService userConfigService, CollectionsService collectionsService, NavigationService navigationService, PlayerService playerService, ToastService toastService, StringProvider stringProvider, WhatsNewService whatsNewService, Configuration configuration, NotificationPermissionService notificationPermissionService, RuntimePermissionsService runtimePermissionsService, Analytics analytics, PurchasesService purchasesService) {
        super(new HomeStateV3(false, false, null, null, null, null, 0L, false, null, null, null, false, false, null, null, 32767, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        homeService.getClass();
        readsService.getClass();
        resolveErrorMessageUseCase.getClass();
        userConfigService.getClass();
        collectionsService.getClass();
        navigationService.getClass();
        playerService.getClass();
        toastService.getClass();
        stringProvider.getClass();
        whatsNewService.getClass();
        configuration.getClass();
        notificationPermissionService.getClass();
        runtimePermissionsService.getClass();
        analytics.getClass();
        purchasesService.getClass();
        Logger logger = null;
        this.homeService = homeService;
        this.readsService = readsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.userConfigService = userConfigService;
        this.collectionsService = collectionsService;
        this.navigationService = navigationService;
        this.playerService = playerService;
        this.toastService = toastService;
        this.stringProvider = stringProvider;
        this.whatsNewService = whatsNewService;
        this.configuration = configuration;
        this.notificationPermissionService = notificationPermissionService;
        this.runtimePermissionsService = runtimePermissionsService;
        this.analytics = analytics;
        this.purchasesService = purchasesService;
        analytics.log(Analytics.Event.HomeViewedPage.INSTANCE);
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass4(null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass5(null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass6(null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass7(null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass8(null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass9(null), 2);
        MviViewModel.launch$default(this, null, new AnonymousClass10(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 closeDailyStreakSettings$lambda$0(HomeStateV3 homeStateV3) {
        homeStateV3.getClass();
        return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, null, 0L, false, null, null, null, false, false, null, null, 32639, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 closeWhatsNew$lambda$0(HomeStateV3 homeStateV3) {
        homeStateV3.getClass();
        return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, null, 0L, false, null, null, null, false, false, null, null, 30719, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 fireFilteredItemClickOnCurrentTab$lambda$0(HomeViewModelV3 homeViewModelV3, HomeStateV3 homeStateV3) {
        homeStateV3.getClass();
        String selectedSubpageId = homeStateV3.getSelectedSubpageId();
        if (selectedSubpageId != null) {
            homeViewModelV3.analytics.log(new Analytics.Event.HomeClickedFilteredItem(selectedSubpageId));
        }
        return homeStateV3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 hideNotificationPrimer$lambda$0(HomeStateV3 homeStateV3) {
        homeStateV3.getClass();
        return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, null, 0L, false, null, null, null, false, false, null, null, 4095, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSubpagePagingData(String subpageId) {
        this._subpagePagingData = ta.l.b(new e0(new j1.c(new k(this, subpageId, 3), null, 1), new w0(20, 3, 20, 48)).f32574e, c1.h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1 initSubpagePagingData$lambda$0(HomeViewModelV3 homeViewModelV3, String str) {
        return new HomeSubpagePagingSourceV3(homeViewModelV3.homeService, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 loadPage$lambda$0(HomeViewModelV3 homeViewModelV3, HomeStateV3 homeStateV3) {
        homeStateV3.getClass();
        if (homeStateV3.isLoading()) {
            return homeStateV3;
        }
        g0.D(c1.h(homeViewModelV3), homeViewModelV3.getDispatcherFactory().getDefault(), null, new HomeViewModelV3$loadPage$1$1(homeViewModelV3, null), 2);
        return HomeStateV3.copy$default(homeStateV3, false, true, "", null, null, null, 0L, false, null, null, null, false, false, null, null, 32761, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 onDailyGoalClicked$lambda$0(HomeStateV3 homeStateV3) {
        homeStateV3.getClass();
        return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, null, 0L, true, null, null, null, false, false, null, null, 32639, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 onScreenVisibleChange$lambda$0(boolean z6, HomeStateV3 homeStateV3) {
        homeStateV3.getClass();
        return HomeStateV3.copy$default(homeStateV3, z6, false, null, null, null, null, 0L, false, null, null, null, false, false, null, null, 32766, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 selectTab$lambda$0(HomeViewModelV3 homeViewModelV3, String str, HomeStateV3 homeStateV3) {
        List<HomePageV3.Subpage> subpages;
        Object obj;
        homeStateV3.getClass();
        HomePageV3 page = homeStateV3.getPage();
        if (page != null && (subpages = page.getSubpages()) != null) {
            Iterator<T> it = subpages.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.m.c(((HomePageV3.Subpage) obj).getId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            HomePageV3.Subpage subpage = (HomePageV3.Subpage) obj;
            if (subpage != null) {
                homeViewModelV3.analytics.log(new Analytics.Event.HomeClickedFilterPills(subpage.getId()));
                if (kotlin.jvm.internal.m.c(subpage.getId(), "recents")) {
                    homeViewModelV3.navigationService.navigate(new Destination.Authorized.Library(ReadsService.SortBy.UpdatedAt));
                    return homeStateV3;
                }
                homeViewModelV3.initSubpagePagingData(subpage.getId());
                return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, null, 0L, false, null, null, subpage.getId(), false, false, null, null, 31743, null);
            }
        }
        return homeStateV3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationPrimer(NotificationPrimerData primerData) {
        queueStateUpdate(new r(primerData, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV3 showNotificationPrimer$lambda$0(NotificationPrimerData notificationPrimerData, HomeStateV3 homeStateV3) {
        homeStateV3.getClass();
        return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, null, 0L, false, null, null, null, false, true, notificationPrimerData.getSource(), notificationPrimerData.getModel(), 4095, null);
    }

    public final MviViewModel.StateUpdate closeDailyStreakSettings() {
        return queueStateUpdate(new u(23));
    }

    public final MviViewModel.StateUpdate closeWhatsNew() {
        return queueStateUpdate(new u(20));
    }

    public final MviViewModel.StateUpdate fireFilteredItemClickOnCurrentTab() {
        return queueStateUpdate(new g(this, 2));
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final RuntimePermissionsService getRuntimePermissionsService() {
        return this.runtimePermissionsService;
    }

    public final ir.i getSubpagePagingData() {
        ir.i iVar = this._subpagePagingData;
        if (iVar == null) {
            return new a7.u(new z0(new a7.u(new ta.z(null), 3), z0.f32777e, z0.f32778f, new q2.z0(21)), 3);
        }
        return iVar;
    }

    public final MviViewModel.StateUpdate hideNotificationPrimer() {
        return queueStateUpdate(new u(21));
    }

    public final MviViewModel.StateUpdate loadPage() {
        return queueStateUpdate(new g(this, 3));
    }

    public final void onClickAddOrRemoveFromQueue(ReadMeta readMeta) {
        readMeta.getClass();
        MviViewModel.launch$default(this, null, new HomeViewModelV3$onClickAddOrRemoveFromQueue$1(this, readMeta, null), 1, null);
    }

    public final void onDailyGoalClicked() {
        this.analytics.log(Analytics.Event.HomeClickedListeningGoal.INSTANCE);
        queueStateUpdate(new u(22));
    }

    public final void onNotificationPermissionResult(boolean granted) {
        g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new HomeViewModelV3$onNotificationPermissionResult$1(this, granted, null), 2);
    }

    public final MviViewModel.StateUpdate onScreenVisibleChange(boolean isScreenVisible) {
        return queueStateUpdate(new io.elevenlabs.ocr.t(isScreenVisible, 3));
    }

    public final MviViewModel.StateUpdate selectTab(String subpageId) {
        subpageId.getClass();
        return queueStateUpdate(new t(this, (Object) subpageId, 3));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6", f = "HomeViewModelV3.kt", l = {116}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass6 extends yn.i implements ho.p {
        int label;

        public AnonymousClass6(wn.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass6(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass6) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                final z1 stateFlow = HomeViewModelV3.this.getStateFlow();
                ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6$invokeSuspend$$inlined$map$1$2", f = "HomeViewModelV3.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            boolean z6;
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
                                        HomeStateV3 homeStateV3 = (HomeStateV3) obj;
                                        if (homeStateV3.isScreenVisible() && kotlin.jvm.internal.m.c(homeStateV3.getSelectedSubpageId(), "for-you")) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        Boolean valueOf = Boolean.valueOf(z6);
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HomeViewModelV3.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements ir.j {
            final /* synthetic */ HomeViewModelV3 this$0;

            public AnonymousClass2(HomeViewModelV3 homeViewModelV3) {
                this.this$0 = homeViewModelV3;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
            
                if (r9 == r5) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(boolean z6, wn.c<? super z> cVar) {
                HomeViewModelV3$6$2$emit$1 homeViewModelV3$6$2$emit$1;
                int i10;
                if (cVar instanceof HomeViewModelV3$6$2$emit$1) {
                    homeViewModelV3$6$2$emit$1 = (HomeViewModelV3$6$2$emit$1) cVar;
                    int i11 = homeViewModelV3$6$2$emit$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        homeViewModelV3$6$2$emit$1.label = i11 - Integer.MIN_VALUE;
                        Object obj = homeViewModelV3$6$2$emit$1.result;
                        i10 = homeViewModelV3$6$2$emit$1.label;
                        z zVar = z.f31622a;
                        xn.a aVar = xn.a.f37986a;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    sn.a.g(obj);
                                    return zVar;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z6 = homeViewModelV3$6$2$emit$1.Z$0;
                            sn.a.g(obj);
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                            homeViewModelV3$6$2$emit$1.Z$0 = z6;
                            homeViewModelV3$6$2$emit$1.label = 2;
                            if (((ir.i) obj).collect(anonymousClass1, homeViewModelV3$6$2$emit$1) == aVar) {
                                return aVar;
                            }
                            return zVar;
                        }
                        sn.a.g(obj);
                        if (z6) {
                            ReadsService readsService = this.this$0.readsService;
                            Boolean bool = Boolean.FALSE;
                            ReadsService.SortBy sortBy = ReadsService.SortBy.UpdatedAt;
                            homeViewModelV3$6$2$emit$1.Z$0 = z6;
                            homeViewModelV3$6$2$emit$1.label = 1;
                            obj = readsService.getReads(5, bool, sortBy, homeViewModelV3$6$2$emit$1);
                        }
                        return zVar;
                    }
                }
                homeViewModelV3$6$2$emit$1 = new HomeViewModelV3$6$2$emit$1(this, cVar);
                Object obj2 = homeViewModelV3$6$2$emit$1.result;
                i10 = homeViewModelV3$6$2$emit$1.label;
                z zVar2 = z.f31622a;
                xn.a aVar2 = xn.a.f37986a;
                if (i10 == 0) {
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6$2$1, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1<T> implements ir.j {
                final /* synthetic */ HomeViewModelV3 this$0;

                public AnonymousClass1(HomeViewModelV3 homeViewModelV3) {
                    this.this$0 = homeViewModelV3;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final HomeStateV3 emit$lambda$0(List list, HomeStateV3 homeStateV3) {
                    homeStateV3.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (T t10 : list) {
                        if (!ReadMetaKt.isAtEnd((ReadMeta) t10)) {
                            arrayList.add(t10);
                        }
                    }
                    return HomeStateV3.copy$default(homeStateV3, false, false, null, null, arrayList, null, 0L, false, null, null, null, false, false, null, null, 32751, null);
                }

                public final Object emit(List<ReadMeta> list, wn.c<? super z> cVar) {
                    this.this$0.queueStateUpdate(new s(list, 0));
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                    return emit((List<ReadMeta>) obj, (wn.c<? super z>) cVar);
                }
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$3", f = "HomeViewModelV3.kt", l = {89}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$3, reason: invalid class name */
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
                z1 observeQueueState = HomeViewModelV3.this.playerService.observeQueueState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeViewModelV3.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ HomeViewModelV3 this$0;

            public AnonymousClass1(HomeViewModelV3 homeViewModelV3) {
                this.this$0 = homeViewModelV3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV3 emit$lambda$0(MediaQueueState mediaQueueState, HomeStateV3 homeStateV3) {
                List<MediaItemState> list;
                homeStateV3.getClass();
                if (mediaQueueState != null) {
                    list = mediaQueueState.getItems();
                } else {
                    list = null;
                }
                if (list == null) {
                    list = tn.t.f33547a;
                }
                return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, list, 0L, false, null, null, null, false, false, null, null, 32735, null);
            }

            public final Object emit(MediaQueueState mediaQueueState, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new r(mediaQueueState, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((MediaQueueState) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$7", f = "HomeViewModelV3.kt", l = {130, 130}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$7, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass7 extends yn.i implements ho.p {
        int label;

        public AnonymousClass7(wn.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass7(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass7) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (((ir.i) r5).collect(r0, r4) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
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
                CollectionsService collectionsService = HomeViewModelV3.this.collectionsService;
                this.label = 1;
                obj = collectionsService.getFollowedSeries(this);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeViewModelV3.this);
            this.label = 2;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$7$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ HomeViewModelV3 this$0;

            public AnonymousClass1(HomeViewModelV3 homeViewModelV3) {
                this.this$0 = homeViewModelV3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV3 emit$lambda$0(List list, HomeStateV3 homeStateV3) {
                homeStateV3.getClass();
                return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, null, 0L, false, null, list, null, false, false, null, null, 32255, null);
            }

            public final Object emit(List<CollectionMeta> list, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new s(list, 1));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((List<CollectionMeta>) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$8", f = "HomeViewModelV3.kt", l = {136}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$8, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass8 extends yn.i implements ho.p {
        int label;

        public AnonymousClass8(wn.c<? super AnonymousClass8> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass8(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass8) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                ir.i config = HomeViewModelV3.this.userConfigService.getConfig();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeViewModelV3.this);
                this.label = 1;
                Object collect = config.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$8$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ HomeViewModelV3 this$0;

            public AnonymousClass1(HomeViewModelV3 homeViewModelV3) {
                this.this$0 = homeViewModelV3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV3 emit$lambda$0(UserConfig userConfig, HomeViewModelV3 homeViewModelV3, HomeStateV3 homeStateV3) {
                homeStateV3.getClass();
                if (homeStateV3.getTargetStreakGoalMinutes() > 0 && homeStateV3.getTargetStreakGoalMinutes() != userConfig.getDailyStreakMinutes()) {
                    homeViewModelV3.loadPage();
                }
                return HomeStateV3.copy$default(homeStateV3, false, false, null, null, null, null, userConfig.getDailyStreakMinutes(), false, null, null, null, false, false, null, null, 32703, null);
            }

            public final Object emit(UserConfig userConfig, wn.c<? super z> cVar) {
                HomeViewModelV3 homeViewModelV3 = this.this$0;
                homeViewModelV3.queueStateUpdate(new t(userConfig, homeViewModelV3, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((UserConfig) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4", f = "HomeViewModelV3.kt", l = {98}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4, reason: invalid class name */
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
                final z1 stateFlow = HomeViewModelV3.this.getStateFlow();
                final ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$invokeSuspend$$inlined$map$1$2", f = "HomeViewModelV3.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        Boolean valueOf = Boolean.valueOf(((HomeStateV3) obj).isScreenVisible());
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
                ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$invokeSuspend$$inlined$filter$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$invokeSuspend$$inlined$filter$1$2", f = "HomeViewModelV3.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                        if (((Boolean) obj).booleanValue()) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(obj, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
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
                };
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(HomeViewModelV3.this, null);
                this.label = 1;
                Object l4 = ir.r.l(iVar, anonymousClass3, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$3", f = "HomeViewModelV3.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lsn/z;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$4$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ HomeViewModelV3 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(HomeViewModelV3 homeViewModelV3, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.this$0 = homeViewModelV3;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass3(this.this$0, cVar);
            }

            public final Object invoke(boolean z6, wn.c<? super z> cVar) {
                return ((AnonymousClass3) create(Boolean.valueOf(z6), cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.loadPage();
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }

            @Override // ho.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (wn.c<? super z>) obj2);
            }
        }
    }
}

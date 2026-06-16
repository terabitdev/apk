package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.NotificationPrimerData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.HomeService;
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
import io.elevenlabs.readerapp.ui.delegates.AudioPreviewPlayback;
import io.elevenlabs.readerapp.ui.delegates.PriceFetcher;
import ir.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0099\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020.¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020.¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020)¢\u0006\u0004\b4\u0010+J\r\u00105\u001a\u00020)¢\u0006\u0004\b5\u0010+J\u0015\u00108\u001a\u00020)2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020.2\u0006\u0010:\u001a\u000206¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020)¢\u0006\u0004\b=\u0010+J\u0015\u0010@\u001a\u00020.2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020.2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010JR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010KR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010LR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010MR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010NR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010OR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010PR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010QR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010U\u001a\u0004\bV\u0010WR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006_"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeViewModelV4;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/HomeService;", "homeService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/WhatsNewService;", "whatsNewService", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "notificationPermissionService", "Lio/elevenlabs/domain/services/RuntimePermissionsService;", "runtimePermissionsService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/HomeService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/UserConfigService;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/WhatsNewService;Lio/elevenlabs/domain/Configuration;Lio/elevenlabs/domain/services/NotificationPermissionService;Lio/elevenlabs/domain/services/RuntimePermissionsService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/PurchasesService;Lio/elevenlabs/domain/services/AudioPreviewService;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "loadPage", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/ExploreRead;", "read", "Lsn/z;", "playPreview", "(Lio/elevenlabs/domain/model/ExploreRead;)V", "stopPreview", "()V", "onDailyGoalClicked", "closeDailyStreakSettings", "closeWhatsNew", "", "isScreenVisible", "onScreenVisibleChange", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "granted", "onNotificationPermissionResult", "(Z)V", "hideNotificationPrimer", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "onClickAddOrRemoveFromQueue", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "Lio/elevenlabs/domain/model/NotificationPrimerData;", "primerData", "showNotificationPrimer", "(Lio/elevenlabs/domain/model/NotificationPrimerData;)V", "Lio/elevenlabs/domain/services/HomeService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/services/AuthService;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/services/WhatsNewService;", "Lio/elevenlabs/domain/Configuration;", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "Lio/elevenlabs/domain/services/RuntimePermissionsService;", "getRuntimePermissionsService", "()Lio/elevenlabs/domain/services/RuntimePermissionsService;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/PurchasesService;", "Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "audioPreview", "Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "priceFetcher", "Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeViewModelV4 extends MviViewModel<HomeStateV4> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final AudioPreviewPlayback audioPreview;
    private final AuthService authService;
    private final Configuration configuration;
    private final CustomerService customerService;
    private final HomeService homeService;
    private final NotificationPermissionService notificationPermissionService;
    private final PlayerService playerService;
    private final PriceFetcher priceFetcher;
    private final PurchasesService purchasesService;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final RuntimePermissionsService runtimePermissionsService;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    private final UserConfigService userConfigService;
    private final WhatsNewService whatsNewService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$1", f = "HomeViewModelV4.kt", l = {79}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$1, reason: invalid class name */
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
                PurchasesService purchasesService = HomeViewModelV4.this.purchasesService;
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
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$10", f = "HomeViewModelV4.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$10, reason: invalid class name */
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
            if (this.label == 0) {
                sn.a.g(obj);
                if (!HomeViewModelV4.this.configuration.isE2eTesting() && HomeViewModelV4.this.whatsNewService.shouldShowWhatsNew()) {
                    HomeViewModelV4.this.whatsNewService.onWhatsNewShown();
                    HomeViewModelV4.this.queueStateUpdate(new r(0));
                }
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$11", f = "HomeViewModelV4.kt", l = {159}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$11, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass11 extends yn.i implements ho.p {
        int label;

        public AnonymousClass11(wn.c<? super AnonymousClass11> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass11(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass11) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                ir.i primerRequests = HomeViewModelV4.this.notificationPermissionService.primerRequests();
                final HomeViewModelV4 homeViewModelV4 = HomeViewModelV4.this;
                ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4.11.1
                    public final Object emit(NotificationPrimerData notificationPrimerData, wn.c<? super z> cVar) {
                        HomeViewModelV4.this.showNotificationPrimer(notificationPrimerData);
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
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$2", f = "HomeViewModelV4.kt", l = {83, 83}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$2, reason: invalid class name */
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
                PlayerService playerService = HomeViewModelV4.this.playerService;
                this.label = 1;
                obj = playerService.connect(this);
            }
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$5", f = "HomeViewModelV4.kt", l = {106}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$5, reason: invalid class name */
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
                final z1 stateFlow = HomeViewModelV4.this.getStateFlow();
                jr.j G = ir.r.G(ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$5$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$5$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$5$invokeSuspend$$inlined$map$1$2", f = "HomeViewModelV4.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        Boolean valueOf = Boolean.valueOf(((HomeStateV4) obj).isScreenVisible());
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
                }), new HomeViewModelV4$5$invokeSuspend$$inlined$flatMapLatest$1(null, HomeViewModelV4.this));
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HomeViewModelV4(DispatcherFactory dispatcherFactory, HomeService homeService, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, UserConfigService userConfigService, CustomerService customerService, AuthService authService, PlayerService playerService, ToastService toastService, StringProvider stringProvider, WhatsNewService whatsNewService, Configuration configuration, NotificationPermissionService notificationPermissionService, RuntimePermissionsService runtimePermissionsService, Analytics analytics, PurchasesService purchasesService, AudioPreviewService audioPreviewService, Logger logger) {
        super(new HomeStateV4(false, false, null, null, null, null, 0L, false, null, null, null, null, false, false, null, null, 65535, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        homeService.getClass();
        readsService.getClass();
        resolveErrorMessageUseCase.getClass();
        userConfigService.getClass();
        customerService.getClass();
        authService.getClass();
        playerService.getClass();
        toastService.getClass();
        stringProvider.getClass();
        whatsNewService.getClass();
        configuration.getClass();
        notificationPermissionService.getClass();
        runtimePermissionsService.getClass();
        analytics.getClass();
        purchasesService.getClass();
        audioPreviewService.getClass();
        logger.getClass();
        Logger logger2 = null;
        this.homeService = homeService;
        this.readsService = readsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.userConfigService = userConfigService;
        this.customerService = customerService;
        this.authService = authService;
        this.playerService = playerService;
        this.toastService = toastService;
        this.stringProvider = stringProvider;
        this.whatsNewService = whatsNewService;
        this.configuration = configuration;
        this.notificationPermissionService = notificationPermissionService;
        this.runtimePermissionsService = runtimePermissionsService;
        this.analytics = analytics;
        this.purchasesService = purchasesService;
        this.audioPreview = new AudioPreviewPlayback(audioPreviewService, c1.h(this), dispatcherFactory.getIo());
        this.priceFetcher = new PriceFetcher(purchasesService, logger, c1.h(this), dispatcherFactory.getIo());
        analytics.log(Analytics.Event.HomeViewedPage.INSTANCE);
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass4(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass5(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass6(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass7(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass8(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass9(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass10(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass11(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass12(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass13(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV4 closeDailyStreakSettings$lambda$0(HomeStateV4 homeStateV4) {
        homeStateV4.getClass();
        return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, false, null, null, null, null, false, false, null, null, 65407, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV4 closeWhatsNew$lambda$0(HomeStateV4 homeStateV4) {
        homeStateV4.getClass();
        return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, false, null, null, null, null, false, false, null, null, 61439, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV4 hideNotificationPrimer$lambda$0(HomeStateV4 homeStateV4) {
        homeStateV4.getClass();
        return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, false, null, null, null, null, false, false, null, null, 8191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV4 loadPage$lambda$0(HomeViewModelV4 homeViewModelV4, HomeStateV4 homeStateV4) {
        homeStateV4.getClass();
        if (homeStateV4.isLoading()) {
            return homeStateV4;
        }
        MviViewModel.launch$default(homeViewModelV4, null, new HomeViewModelV4$loadPage$1$1(homeViewModelV4, null), 1, null);
        return HomeStateV4.copy$default(homeStateV4, false, true, "", null, null, null, 0L, false, null, null, null, null, false, false, null, null, 65529, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV4 onDailyGoalClicked$lambda$0(HomeStateV4 homeStateV4) {
        homeStateV4.getClass();
        return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, true, null, null, null, null, false, false, null, null, 65407, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV4 onScreenVisibleChange$lambda$0(boolean z6, HomeStateV4 homeStateV4) {
        homeStateV4.getClass();
        return HomeStateV4.copy$default(homeStateV4, z6, false, null, null, null, null, 0L, false, null, null, null, null, false, false, null, null, 65534, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z playPreview$lambda$0(HomeViewModelV4 homeViewModelV4, ExploreRead exploreRead) {
        homeViewModelV4.analytics.log(new Analytics.Event.ExploreClickedPreview(exploreRead.getReadId()));
        return z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationPrimer(NotificationPrimerData primerData) {
        queueStateUpdate(new t(primerData, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeStateV4 showNotificationPrimer$lambda$0(NotificationPrimerData notificationPrimerData, HomeStateV4 homeStateV4) {
        homeStateV4.getClass();
        return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, false, null, null, null, null, false, true, notificationPrimerData.getSource(), notificationPrimerData.getModel(), 8191, null);
    }

    public final MviViewModel.StateUpdate closeDailyStreakSettings() {
        return queueStateUpdate(new r(14));
    }

    public final MviViewModel.StateUpdate closeWhatsNew() {
        return queueStateUpdate(new r(16));
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final RuntimePermissionsService getRuntimePermissionsService() {
        return this.runtimePermissionsService;
    }

    public final MviViewModel.StateUpdate hideNotificationPrimer() {
        return queueStateUpdate(new r(15));
    }

    public final MviViewModel.StateUpdate loadPage() {
        return queueStateUpdate(new h(this, 3));
    }

    public final void onClickAddOrRemoveFromQueue(ReadMeta readMeta) {
        readMeta.getClass();
        MviViewModel.launch$default(this, null, new HomeViewModelV4$onClickAddOrRemoveFromQueue$1(this, readMeta, null), 1, null);
    }

    public final void onDailyGoalClicked() {
        this.analytics.log(Analytics.Event.HomeClickedListeningGoal.INSTANCE);
        queueStateUpdate(new r(13));
    }

    public final void onNotificationPermissionResult(boolean granted) {
        MviViewModel.launch$default(this, null, new HomeViewModelV4$onNotificationPermissionResult$1(this, granted, null), 1, null);
    }

    public final MviViewModel.StateUpdate onScreenVisibleChange(boolean isScreenVisible) {
        return queueStateUpdate(new u(isScreenVisible, 1));
    }

    public final void playPreview(ExploreRead read) {
        read.getClass();
        String previewAudioUrl = read.getPreviewAudioUrl();
        if (previewAudioUrl == null) {
            return;
        }
        this.audioPreview.toggle(read.getReadId(), previewAudioUrl, new e(this, read, 2));
    }

    public final void stopPreview() {
        this.audioPreview.stop();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6", f = "HomeViewModelV4.kt", l = {114}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6, reason: invalid class name */
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
                final z1 stateFlow = HomeViewModelV4.this.getStateFlow();
                final ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$invokeSuspend$$inlined$map$1$2", f = "HomeViewModelV4.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        Boolean valueOf = Boolean.valueOf(((HomeStateV4) obj).isScreenVisible());
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
                ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$invokeSuspend$$inlined$filter$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$invokeSuspend$$inlined$filter$1$2", f = "HomeViewModelV4.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(HomeViewModelV4.this, null);
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
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$3", f = "HomeViewModelV4.kt", l = {115, 119}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lsn/z;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ HomeViewModelV4 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(HomeViewModelV4 homeViewModelV4, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.this$0 = homeViewModelV4;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass3(this.this$0, cVar);
            }

            public final Object invoke(boolean z6, wn.c<? super z> cVar) {
                return ((AnonymousClass3) create(Boolean.valueOf(z6), cVar)).invokeSuspend(z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                if (((ir.i) r6).collect(r0, r5) == r3) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                return r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
            
                if (r6 == r3) goto L15;
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
                    ReadsService readsService = this.this$0.readsService;
                    Boolean bool = Boolean.FALSE;
                    ReadsService.SortBy sortBy = ReadsService.SortBy.UpdatedAt;
                    this.label = 1;
                    obj = readsService.getReads(5, bool, sortBy, this);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 2;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$6$3$1, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1<T> implements ir.j {
                final /* synthetic */ HomeViewModelV4 this$0;

                public AnonymousClass1(HomeViewModelV4 homeViewModelV4) {
                    this.this$0 = homeViewModelV4;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final HomeStateV4 emit$lambda$0(List list, HomeStateV4 homeStateV4) {
                    homeStateV4.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (T t10 : list) {
                        if (!ReadMetaKt.isAtEnd((ReadMeta) t10)) {
                            arrayList.add(t10);
                        }
                    }
                    return HomeStateV4.copy$default(homeStateV4, false, false, null, null, arrayList, null, 0L, false, null, null, null, null, false, false, null, null, 65519, null);
                }

                public final Object emit(List<ReadMeta> list, wn.c<? super z> cVar) {
                    this.this$0.queueStateUpdate(new t(list, 2));
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                    return emit((List<ReadMeta>) obj, (wn.c<? super z>) cVar);
                }
            }

            @Override // ho.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (wn.c<? super z>) obj2);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$9", f = "HomeViewModelV4.kt", l = {141}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$9, reason: invalid class name */
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
                ir.i config = HomeViewModelV4.this.userConfigService.getConfig();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeViewModelV4.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$9$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ HomeViewModelV4 this$0;

            public AnonymousClass1(HomeViewModelV4 homeViewModelV4) {
                this.this$0 = homeViewModelV4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV4 emit$lambda$0(UserConfig userConfig, HomeViewModelV4 homeViewModelV4, HomeStateV4 homeStateV4) {
                homeStateV4.getClass();
                if (homeStateV4.getTargetStreakGoalMinutes() > 0 && homeStateV4.getTargetStreakGoalMinutes() != userConfig.getDailyStreakMinutes()) {
                    homeViewModelV4.loadPage();
                }
                return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, userConfig.getDailyStreakMinutes(), false, null, null, null, null, false, false, null, null, 65471, null);
            }

            public final Object emit(UserConfig userConfig, wn.c<? super z> cVar) {
                HomeViewModelV4 homeViewModelV4 = this.this$0;
                homeViewModelV4.queueStateUpdate(new v(userConfig, homeViewModelV4));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((UserConfig) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$12", f = "HomeViewModelV4.kt", l = {165}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$12, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass12 extends yn.i implements ho.p {
        int label;

        public AnonymousClass12(wn.c<? super AnonymousClass12> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass12(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass12) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                z1 playingReadId = HomeViewModelV4.this.audioPreview.getPlayingReadId();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeViewModelV4.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$12$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ HomeViewModelV4 this$0;

            public AnonymousClass1(HomeViewModelV4 homeViewModelV4) {
                this.this$0 = homeViewModelV4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV4 emit$lambda$0(String str, HomeStateV4 homeStateV4) {
                homeStateV4.getClass();
                return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, false, null, null, null, str, false, false, null, null, 63487, null);
            }

            public final Object emit(String str, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new s(str, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((String) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$13", f = "HomeViewModelV4.kt", l = {171}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$13, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass13 extends yn.i implements ho.p {
        int label;

        public AnonymousClass13(wn.c<? super AnonymousClass13> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass13(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass13) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                z1 prices = HomeViewModelV4.this.priceFetcher.getPrices();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeViewModelV4.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$13$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ HomeViewModelV4 this$0;

            public AnonymousClass1(HomeViewModelV4 homeViewModelV4) {
                this.this$0 = homeViewModelV4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV4 emit$lambda$0(Map map, HomeStateV4 homeStateV4) {
                homeStateV4.getClass();
                return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, false, null, null, map, null, false, false, null, null, 64511, null);
            }

            public final Object emit(Map<String, MoneyPrice> map, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new t(map, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((Map<String, MoneyPrice>) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$3", f = "HomeViewModelV4.kt", l = {88}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$3, reason: invalid class name */
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
                z1 observeQueueState = HomeViewModelV4.this.playerService.observeQueueState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeViewModelV4.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ HomeViewModelV4 this$0;

            public AnonymousClass1(HomeViewModelV4 homeViewModelV4) {
                this.this$0 = homeViewModelV4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV4 emit$lambda$0(MediaQueueState mediaQueueState, HomeStateV4 homeStateV4) {
                List<MediaItemState> list;
                homeStateV4.getClass();
                if (mediaQueueState != null) {
                    list = mediaQueueState.getItems();
                } else {
                    list = null;
                }
                if (list == null) {
                    list = tn.t.f33547a;
                }
                return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, list, 0L, false, null, null, null, null, false, false, null, null, 65503, null);
            }

            public final Object emit(MediaQueueState mediaQueueState, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new t(mediaQueueState, 1));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((MediaQueueState) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$7", f = "HomeViewModelV4.kt", l = {129}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$7, reason: invalid class name */
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
                final ir.i customer = HomeViewModelV4.this.customerService.getCustomer();
                ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$7$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$7$invokeSuspend$$inlined$map$1$2", f = "HomeViewModelV4.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HomeViewModelV4.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$7$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements ir.j {
            final /* synthetic */ HomeViewModelV4 this$0;

            public AnonymousClass2(HomeViewModelV4 homeViewModelV4) {
                this.this$0 = homeViewModelV4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV4 emit$lambda$0(boolean z6, HomeStateV4 homeStateV4) {
                homeStateV4.getClass();
                return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, false, Boolean.valueOf(z6), null, null, null, false, false, null, null, 65279, null);
            }

            public final Object emit(boolean z6, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new u(z6, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$8", f = "HomeViewModelV4.kt", l = {135}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$8, reason: invalid class name */
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
                ir.i user = HomeViewModelV4.this.authService.user();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeViewModelV4.this);
                this.label = 1;
                Object collect = user.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$8$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ HomeViewModelV4 this$0;

            public AnonymousClass1(HomeViewModelV4 homeViewModelV4) {
                this.this$0 = homeViewModelV4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HomeStateV4 emit$lambda$0(User user, HomeStateV4 homeStateV4) {
                homeStateV4.getClass();
                return HomeStateV4.copy$default(homeStateV4, false, false, null, null, null, null, 0L, false, null, user, null, null, false, false, null, null, 65023, null);
            }

            public final Object emit(User user, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new t(user, 3));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((User) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4", f = "HomeViewModelV4.kt", l = {97}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4, reason: invalid class name */
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
                final z1 stateFlow = HomeViewModelV4.this.getStateFlow();
                final ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$invokeSuspend$$inlined$map$1$2", f = "HomeViewModelV4.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        Boolean valueOf = Boolean.valueOf(((HomeStateV4) obj).isScreenVisible());
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
                ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$invokeSuspend$$inlined$filter$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$invokeSuspend$$inlined$filter$1$2", f = "HomeViewModelV4.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(HomeViewModelV4.this, null);
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
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$3", f = "HomeViewModelV4.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lsn/z;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$4$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ HomeViewModelV4 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(HomeViewModelV4 homeViewModelV4, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.this$0 = homeViewModelV4;
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

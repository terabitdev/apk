package io.elevenlabs.readerapp.core.router;

import a2.o0;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.webkit.URLUtil;
import androidx.lifecycle.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.SingularService;
import io.elevenlabs.domain.services.WhatsNewService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.DevicePerformanceMeasurer;
import io.elevenlabs.readerapp.core.CrashlyticsLogger;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.core.NavigationDispatcher;
import io.elevenlabs.readerapp.core.router.ClearPlayerQueueConfirmation;
import io.elevenlabs.readerapp.core.router.PendingShare;
import io.elevenlabs.readerapp.ui.models.UiAction;
import ir.d1;
import ir.t1;
import ir.z1;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 x2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001xB\u009d\u0001\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020&¢\u0006\u0004\b-\u0010.J\u001b\u00101\u001a\u00020,2\f\u00100\u001a\b\u0012\u0004\u0012\u00020&0/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020,¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020,2\u0006\u00105\u001a\u00020&¢\u0006\u0004\b6\u0010.J\u0015\u00108\u001a\u00020#2\u0006\u00107\u001a\u00020&¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020,¢\u0006\u0004\b:\u00104J\r\u0010;\u001a\u00020#¢\u0006\u0004\b;\u0010%J\u0018\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020&H\u0086@¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020=2\u0006\u0010<\u001a\u00020&H\u0086@¢\u0006\u0004\b@\u0010?J/\u0010G\u001a\u00020F2\u0006\u0010<\u001a\u00020&2\b\u0010A\u001a\u0004\u0018\u00010&2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bG\u0010HJ\u001d\u0010M\u001a\u00020,2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020,¢\u0006\u0004\bO\u00104J\r\u0010P\u001a\u00020,¢\u0006\u0004\bP\u00104J\u0018\u0010S\u001a\u00020#2\u0006\u0010R\u001a\u00020QH\u0096@¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020,¢\u0006\u0004\bU\u00104J\u001f\u0010X\u001a\u00020,2\u0010\u0010W\u001a\f\u0012\u0004\u0012\u00020&0/j\u0002`V¢\u0006\u0004\bX\u00102J\u001d\u0010]\u001a\u00020#2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020#H\u0014¢\u0006\u0004\b_\u0010%J\u0017\u0010a\u001a\u00020,2\b\u0010`\u001a\u0004\u0018\u00010&¢\u0006\u0004\ba\u0010.J\r\u0010b\u001a\u00020,¢\u0006\u0004\bb\u00104J\r\u0010c\u001a\u00020,¢\u0006\u0004\bc\u00104J\u000f\u0010d\u001a\u00020,H\u0002¢\u0006\u0004\bd\u00104R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010eR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010eR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010lR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010mR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010nR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010oR\u001d\u0010q\u001a\b\u0012\u0004\u0012\u00020=0p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bq\u0010sR\u0014\u0010t\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006y"}, d2 = {"Lio/elevenlabs/readerapp/core/router/RouterViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/core/router/RouterState;", "Lio/elevenlabs/readerapp/core/NavigationDispatcher;", "Ljl/a;", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/services/OnboardingService;", "onboardingService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/SingularService;", "singularService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/services/MessagesService;", "messagesService", "Lio/elevenlabs/domain/usecase/DevicePerformanceMeasurer;", "devicePerformanceMeasurer", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/services/WhatsNewService;", "whatsNewService", "Lio/elevenlabs/readerapp/core/CrashlyticsLogger;", "crashlyticsLogger", "Lio/elevenlabs/domain/services/FeatureFlagService;", "featureFlagService", "<init>", "(Ljl/a;Ljl/a;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Ljl/a;Ljl/a;Ljl/a;Ljl/a;Lio/elevenlabs/domain/usecase/DevicePerformanceMeasurer;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/services/WhatsNewService;Lio/elevenlabs/readerapp/core/CrashlyticsLogger;Lio/elevenlabs/domain/services/FeatureFlagService;)V", "Lsn/z;", "logDevicePerformanceAnalytics", "()V", "", "title", ParameterNames.TEXT, "onTextShare", "(Ljava/lang/String;Ljava/lang/String;)V", "uri", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onFileShare", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "uris", "onImageShare", "(Ljava/util/List;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onShareConsumed", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "deepLink", "onDeepLink", "actionId", "dispatchCustomerCenterAction", "(Ljava/lang/String;)V", "onDeepLinkConsumed", "onWinBackAutoShowConsumed", "readId", "", "isReadInLibrary", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "shouldConfirmBeforeNavigatingToPlayer", "collectionId", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "playerActivationSource", "Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "addToQueueSource", "Lfr/k1;", "showClearPlayerQueueConfirmation", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;)Lfr/k1;", "Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation$Shown;", "confirmation", "Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationClicked$Decision;", "decision", "hideClearPlayerQueueConfirmation", "(Lio/elevenlabs/readerapp/core/router/ClearPlayerQueueConfirmation$Shown;Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationClicked$Decision;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "showImportSheet", "hideImportSheet", "Lio/elevenlabs/domain/model/Destination;", FirebaseAnalytics.Param.DESTINATION, "requestNavigation", "(Lio/elevenlabs/domain/model/Destination;Lwn/c;)Ljava/lang/Object;", "clearPendingNavigation", "Lio/elevenlabs/readerapp/core/router/StackPoppingRoutes;", "routes", "requestStartSelectiveStackPopping", "Lna/c0;", "navController", "Landroidx/lifecycle/b0;", "lifecycleOwner", "setupSelectiveStackPopping", "(Lna/c0;Landroidx/lifecycle/b0;)V", "onCleared", "route", "onRouteChanged", "markMessageAsRead", "closeMessage", "clearStartSelectiveStackPopping", "Ljl/a;", "Lio/elevenlabs/domain/Logger;", "getLogger", "()Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/usecase/DevicePerformanceMeasurer;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/services/WhatsNewService;", "Lio/elevenlabs/readerapp/core/CrashlyticsLogger;", "Lir/z1;", "isHomeV4Enabled", "Lir/z1;", "()Lir/z1;", ParameterNames.TAG, "Ljava/lang/String;", "collectionJob", "Lfr/k1;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RouterViewModel extends MviViewModel<RouterState> implements NavigationDispatcher {

    @Deprecated
    public static final String CUSTOMER_CENTER_DEEPLINK_PREFIX = "deeplink:";

    @Deprecated
    public static final String SUPPORT_ALIAS_DEEPLINK = "elevenlabs://support";
    private final Analytics analytics;
    private final jl.a authService;
    private k1 collectionJob;
    private final CrashlyticsLogger crashlyticsLogger;
    private final jl.a customerService;
    private final DevicePerformanceMeasurer devicePerformanceMeasurer;
    private final z1 isHomeV4Enabled;
    private final Logger logger;
    private final jl.a messagesService;
    private final jl.a onboardingService;
    private final PlayerService playerService;
    private final jl.a readsService;
    private final jl.a singularService;
    private final String tag;
    private final WhatsNewService whatsNewService;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$1", f = "RouterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
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
            if (this.label == 0) {
                sn.a.g(obj);
                ((OnboardingService) RouterViewModel.this.onboardingService.get()).recordAppSession();
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$3", f = "RouterViewModel.kt", l = {212, 212}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$3, reason: invalid class name */
    /* loaded from: classes3.dex */
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
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                PlayerService playerService = RouterViewModel.this.playerService;
                this.label = 1;
                obj = playerService.connect(this);
            }
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterViewModel(jl.a aVar, jl.a aVar2, DispatcherFactory dispatcherFactory, Logger logger, Analytics analytics, jl.a aVar3, jl.a aVar4, jl.a aVar5, jl.a aVar6, DevicePerformanceMeasurer devicePerformanceMeasurer, PlayerService playerService, WhatsNewService whatsNewService, CrashlyticsLogger crashlyticsLogger, FeatureFlagService featureFlagService) {
        super(new RouterState(null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262143, null), dispatcherFactory, logger);
        aVar.getClass();
        aVar2.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        analytics.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        devicePerformanceMeasurer.getClass();
        playerService.getClass();
        whatsNewService.getClass();
        crashlyticsLogger.getClass();
        featureFlagService.getClass();
        this.authService = aVar;
        this.onboardingService = aVar2;
        this.logger = logger;
        this.analytics = analytics;
        this.readsService = aVar3;
        this.singularService = aVar4;
        this.customerService = aVar5;
        this.messagesService = aVar6;
        this.devicePerformanceMeasurer = devicePerformanceMeasurer;
        this.playerService = playerService;
        this.whatsNewService = whatsNewService;
        this.crashlyticsLogger = crashlyticsLogger;
        this.isHomeV4Enabled = ir.r.E(FeatureFlagService.isFlagEnabled$default(featureFlagService, FeatureFlagService.Flag.HOME_V4_ENABLED, false, false, 4, null), c1.h(this), t1.f18063a, Boolean.FALSE);
        this.tag = "RouterViewModel";
        logger.log("RouterViewModel", "init - " + this);
        whatsNewService.onNewSession();
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        this.collectionJob = fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass2(null), 2);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState clearPendingNavigation$lambda$0(RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 245759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MviViewModel.StateUpdate clearStartSelectiveStackPopping() {
        return queueStateUpdate(new a0(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState clearStartSelectiveStackPopping$lambda$0(RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, UiAction.Reset.INSTANCE, null, null, 229375, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState closeMessage$lambda$0(RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 131071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState hideClearPlayerQueueConfirmation$lambda$0(RouterViewModel routerViewModel, ClearPlayerQueueConfirmation.Shown shown, Analytics.Event.PlayerQueueConfirmationClicked.Decision decision, RouterState routerState) {
        routerState.getClass();
        routerViewModel.analytics.log(new Analytics.Event.PlayerQueueConfirmationClicked(shown.getAddToQueueSource(), shown.getReadId(), shown.getCollectionId(), shown.getQueueSize(), shown.getReadsRemaining(), decision));
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, ClearPlayerQueueConfirmation.Hidden.INSTANCE, false, false, false, false, false, null, null, null, null, null, 262015, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState hideImportSheet$lambda$0(RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262079, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState markMessageAsRead$lambda$0(RouterViewModel routerViewModel, RouterState routerState) {
        routerState.getClass();
        if (routerState.getMessageToDisplay() == null) {
            return routerState;
        }
        fr.g0.D(c1.h(routerViewModel), routerViewModel.getDispatcherFactory().getDefault(), null, new RouterViewModel$markMessageAsRead$1$1(routerViewModel, routerState, null), 2);
        return routerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onDeepLink$lambda$0(RouterViewModel routerViewModel, String str, RouterState routerState) {
        routerState.getClass();
        ib.i.r("onDeepLink: ", str, routerViewModel.logger, routerViewModel.tag);
        return RouterState.copy$default(routerState, null, null, null, null, str, false, false, null, false, false, false, false, false, null, null, null, null, null, 262127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onDeepLinkConsumed$lambda$0(RouterViewModel routerViewModel, RouterState routerState) {
        routerState.getClass();
        routerViewModel.logger.log(routerViewModel.tag, "onDeeplinkConsumed");
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onFileShare$lambda$0(RouterViewModel routerViewModel, String str, RouterState routerState) {
        routerState.getClass();
        routerViewModel.logger.log(routerViewModel.tag, "onFileShare / " + str.length());
        routerViewModel.analytics.log(Analytics.Event.ShareImportFile.INSTANCE);
        return RouterState.copy$default(routerState, null, null, null, new PendingShare.File(str), null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262135, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onImageShare$lambda$0(RouterViewModel routerViewModel, List list, RouterState routerState) {
        routerState.getClass();
        routerViewModel.logger.log(routerViewModel.tag, "onMultipleFileShare / " + list.size());
        routerViewModel.analytics.log(Analytics.Event.ShareImportFile.INSTANCE);
        return RouterState.copy$default(routerState, null, null, null, new PendingShare.Images(list), null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262135, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onRouteChanged$lambda$0(String str, RouterViewModel routerViewModel, RouterState routerState) {
        routerState.getClass();
        if (str != null) {
            routerViewModel.logger.log("Navigation", "Navigated to ".concat(str));
            Logger logger = routerViewModel.logger;
            Map<String, ? extends Object> singletonMap = Collections.singletonMap("current_screen", str);
            singletonMap.getClass();
            logger.setExtras(singletonMap);
        }
        if (kotlin.jvm.internal.m.c(routerState.getOnboardingCompleted(), Boolean.TRUE) && !routerState.getHasRedeemDeepLink() && !routerState.getShouldShowPaywall() && !routerState.getWinBackAvailable() && routerState.getPendingDeepLink() == null && routerState.getPendingShare() == null && routerState.isFreeUser() != null) {
            long time = new Date().getTime();
            if ((routerState.getLastMessageCheckTimestamp() == null || time - routerState.getLastMessageCheckTimestamp().longValue() >= 10) && routerState.getMessageToDisplay() == null) {
                fr.g0.D(c1.h(routerViewModel), routerViewModel.getDispatcherFactory().getDefault(), null, new RouterViewModel$onRouteChanged$1$1(routerViewModel, null), 2);
                return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, Long.valueOf(time), null, 196607, null);
            }
        }
        return routerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onShareConsumed$lambda$0(RouterViewModel routerViewModel, RouterState routerState) {
        routerState.getClass();
        routerViewModel.logger.log(routerViewModel.tag, "onShareConsumed");
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262135, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onTextShare$lambda$0(String str, RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, new PendingShare.Link(str), null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262135, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onTextShare$lambda$1(String str, String str2, RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, new PendingShare.Text(str, str2), null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262135, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState onWinBackAutoShowConsumed$lambda$0(RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 260095, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState requestNavigation$lambda$0(Destination destination, RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, destination, null, null, null, 245759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState requestStartSelectiveStackPopping$lambda$0(List list, RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, new UiAction.Pending(list), null, null, 229375, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupSelectiveStackPopping$isRouteToClear(String str, kotlin.jvm.internal.d0 d0Var) {
        if (str != null) {
            Iterable iterable = (Iterable) d0Var.f20559a;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (wq.n.a0(str, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouterState showImportSheet$lambda$0(RouterState routerState) {
        routerState.getClass();
        return RouterState.copy$default(routerState, null, null, null, null, null, false, true, null, false, false, false, false, false, null, null, null, null, null, 262079, null);
    }

    public final MviViewModel.StateUpdate clearPendingNavigation() {
        return queueStateUpdate(new a0(8));
    }

    public final MviViewModel.StateUpdate closeMessage() {
        return queueStateUpdate(new a0(11));
    }

    public final void dispatchCustomerCenterAction(String actionId) {
        actionId.getClass();
        this.logger.log(this.tag, "CustomerCenter custom action received: ".concat(actionId));
        if (!wq.u.W(actionId, CUSTOMER_CENTER_DEEPLINK_PREFIX, false)) {
            return;
        }
        String u02 = wq.n.u0(actionId, CUSTOMER_CENTER_DEEPLINK_PREFIX);
        if (u02.equals(SUPPORT_ALIAS_DEEPLINK)) {
            u02 = "elevenlabs://askSupportAgent";
        }
        onDeepLink(u02);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final MviViewModel.StateUpdate hideClearPlayerQueueConfirmation(ClearPlayerQueueConfirmation.Shown confirmation, Analytics.Event.PlayerQueueConfirmationClicked.Decision decision) {
        confirmation.getClass();
        decision.getClass();
        return queueStateUpdate(new o0(this, confirmation, decision, 9));
    }

    public final MviViewModel.StateUpdate hideImportSheet() {
        return queueStateUpdate(new a0(10));
    }

    /* renamed from: isHomeV4Enabled, reason: from getter */
    public final z1 getIsHomeV4Enabled() {
        return this.isHomeV4Enabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isReadInLibrary(String str, wn.c<? super Boolean> cVar) {
        RouterViewModel$isReadInLibrary$1 routerViewModel$isReadInLibrary$1;
        int i10;
        xn.a aVar;
        Object u6;
        if (cVar instanceof RouterViewModel$isReadInLibrary$1) {
            routerViewModel$isReadInLibrary$1 = (RouterViewModel$isReadInLibrary$1) cVar;
            int i11 = routerViewModel$isReadInLibrary$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                routerViewModel$isReadInLibrary$1.label = i11 - Integer.MIN_VALUE;
                Object obj = routerViewModel$isReadInLibrary$1.result;
                i10 = routerViewModel$isReadInLibrary$1.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return obj;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsService readsService = (ReadsService) this.readsService.get();
                    routerViewModel$isReadInLibrary$1.L$0 = null;
                    routerViewModel$isReadInLibrary$1.label = 1;
                    obj = readsService.isReadInLibrary(str, routerViewModel$isReadInLibrary$1);
                }
                routerViewModel$isReadInLibrary$1.L$0 = null;
                routerViewModel$isReadInLibrary$1.label = 2;
                u6 = ir.r.u((ir.i) obj, routerViewModel$isReadInLibrary$1);
                if (u6 != aVar) {
                    return aVar;
                }
                return u6;
            }
        }
        routerViewModel$isReadInLibrary$1 = new RouterViewModel$isReadInLibrary$1(this, cVar);
        Object obj2 = routerViewModel$isReadInLibrary$1.result;
        i10 = routerViewModel$isReadInLibrary$1.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        routerViewModel$isReadInLibrary$1.L$0 = null;
        routerViewModel$isReadInLibrary$1.label = 2;
        u6 = ir.r.u((ir.i) obj2, routerViewModel$isReadInLibrary$1);
        if (u6 != aVar) {
        }
    }

    public final void logDevicePerformanceAnalytics() {
        MviViewModel.launch$default(this, null, new RouterViewModel$logDevicePerformanceAnalytics$1(this, null), 1, null);
    }

    public final MviViewModel.StateUpdate markMessageAsRead() {
        return queueStateUpdate(new r(this, 4));
    }

    @Override // io.elevenlabs.readerapp.core.MviViewModel, androidx.lifecycle.j1
    public void onCleared() {
        this.logger.log(this.tag, "onCleared - this=" + this);
        this.collectionJob.cancel((CancellationException) null);
    }

    public final MviViewModel.StateUpdate onDeepLink(String deepLink) {
        deepLink.getClass();
        return queueStateUpdate(new c0(this, deepLink, 2));
    }

    public final MviViewModel.StateUpdate onDeepLinkConsumed() {
        return queueStateUpdate(new r(this, 3));
    }

    public final MviViewModel.StateUpdate onFileShare(String uri) {
        uri.getClass();
        return queueStateUpdate(new c0(this, uri, 0));
    }

    public final MviViewModel.StateUpdate onImageShare(List<String> uris) {
        uris.getClass();
        return queueStateUpdate(new io.elevenlabs.data.database.entities.reads.h(this, uris, 4));
    }

    public final MviViewModel.StateUpdate onRouteChanged(String route) {
        return queueStateUpdate(new c0(this, route));
    }

    public final MviViewModel.StateUpdate onShareConsumed() {
        return queueStateUpdate(new r(this, 2));
    }

    public final void onTextShare(String title, String text) {
        Integer num;
        int i10;
        Logger logger = this.logger;
        String str = this.tag;
        Integer num2 = null;
        if (title != null) {
            num = Integer.valueOf(title.length());
        } else {
            num = null;
        }
        if (text != null) {
            num2 = Integer.valueOf(text.length());
        }
        logger.log(str, "onTextShare / " + num + " / " + num2);
        Analytics analytics = this.analytics;
        if (text != null) {
            i10 = text.length();
        } else {
            i10 = 0;
        }
        analytics.log(new Analytics.Event.ShareImportText(i10));
        if (text != null && !wq.n.m0(text)) {
            if (URLUtil.isValidUrl(text)) {
                queueStateUpdate(new m(text, 1));
            } else {
                queueStateUpdate(new d0(0, title, text));
            }
        }
    }

    public final void onWinBackAutoShowConsumed() {
        this.logger.log(this.tag, "Recording win-back auto-show cooldown");
        ((OnboardingService) this.onboardingService.get()).seenWinBackPaywall();
        queueStateUpdate(new a0(9));
    }

    @Override // io.elevenlabs.readerapp.core.NavigationDispatcher
    public Object requestNavigation(Destination destination, wn.c<? super sn.z> cVar) {
        queueStateUpdate(new g0(destination, 2));
        return sn.z.f31622a;
    }

    public final MviViewModel.StateUpdate requestStartSelectiveStackPopping(List<String> routes) {
        routes.getClass();
        return queueStateUpdate(new g0(routes, 3));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    public final void setupSelectiveStackPopping(na.c0 navController, androidx.lifecycle.b0 lifecycleOwner) {
        navController.getClass();
        lifecycleOwner.getClass();
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.f20559a = tn.t.f33547a;
        fr.g0.D(c1.f(lifecycleOwner), null, null, new RouterViewModel$setupSelectiveStackPopping$1(navController, new Object(), obj, this, obj2, null), 3);
    }

    public final Object shouldConfirmBeforeNavigatingToPlayer(final String str, wn.c<? super Boolean> cVar) {
        final z1 observeQueueState = this.playerService.observeQueueState();
        return ir.r.u(new ir.i() { // from class: io.elevenlabs.readerapp.core.router.RouterViewModel$shouldConfirmBeforeNavigatingToPlayer$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$shouldConfirmBeforeNavigatingToPlayer$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ String $readId$inlined;
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$shouldConfirmBeforeNavigatingToPlayer$$inlined$map$1$2", f = "RouterViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$shouldConfirmBeforeNavigatingToPlayer$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
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

                public AnonymousClass2(ir.j jVar, String str) {
                    this.$this_unsafeFlow = jVar;
                    this.$readId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Type inference failed for: r6v0, types: [no.g, no.e] */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    Boolean bool;
                    List<MediaItemState> items;
                    boolean z6;
                    T t10;
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
                                MediaQueueState mediaQueueState = (MediaQueueState) obj;
                                if (mediaQueueState != null && (items = mediaQueueState.getItems()) != null) {
                                    if (items.size() - ae.l.n(mediaQueueState.getCurrentIndex(), new no.e(0, items.size(), 1)) > 1) {
                                        Iterator<T> it = items.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                t10 = it.next();
                                                if (kotlin.jvm.internal.m.c(((MediaItemState) t10).getReadId(), this.$readId$inlined)) {
                                                    break;
                                                }
                                            } else {
                                                t10 = (T) null;
                                                break;
                                            }
                                        }
                                        if (t10 == null) {
                                            z6 = true;
                                            bool = Boolean.valueOf(z6);
                                        }
                                    }
                                    z6 = false;
                                    bool = Boolean.valueOf(z6);
                                } else {
                                    bool = Boolean.FALSE;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(bool, anonymousClass1);
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
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, str), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        }, cVar);
    }

    public final k1 showClearPlayerQueueConfirmation(String readId, String collectionId, Analytics.Event.PlayerActivationSource playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source addToQueueSource) {
        readId.getClass();
        playerActivationSource.getClass();
        addToQueueSource.getClass();
        return MviViewModel.launch$default(this, null, new RouterViewModel$showClearPlayerQueueConfirmation$1(this, addToQueueSource, readId, collectionId, playerActivationSource, null), 1, null);
    }

    public final MviViewModel.StateUpdate showImportSheet() {
        return queueStateUpdate(new a0(13));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/readerapp/core/router/RouterViewModel$Companion;", "", "<init>", "()V", "CUSTOMER_CENTER_DEEPLINK_PREFIX", "", "SUPPORT_ALIAS_DEEPLINK", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2", f = "RouterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$2", f = "RouterViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00242 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ RouterViewModel this$0;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$2$1", f = "RouterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/Customer;", "customer", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/Customer;)V"}, k = 3, mv = {2, 3, 0})
            /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$2$1, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends yn.i implements ho.p {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ RouterViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(RouterViewModel routerViewModel, wn.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = routerViewModel;
                }

                @Override // yn.a
                public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // ho.p
                public final Object invoke(Customer customer, wn.c<? super sn.z> cVar) {
                    return ((AnonymousClass1) create(customer, cVar)).invokeSuspend(sn.z.f31622a);
                }

                @Override // yn.a
                public final Object invokeSuspend(Object obj) {
                    String str;
                    Customer customer = (Customer) this.L$0;
                    if (this.label == 0) {
                        sn.a.g(obj);
                        CrashlyticsLogger crashlyticsLogger = this.this$0.crashlyticsLogger;
                        if (customer != null) {
                            str = customer.getId();
                        } else {
                            str = null;
                        }
                        crashlyticsLogger.setUserId(str);
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00242(RouterViewModel routerViewModel, wn.c<? super C00242> cVar) {
                super(2, cVar);
                this.this$0 = routerViewModel;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                return new C00242(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
                return ((C00242) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                    ir.i customerOrNull = ((CustomerService) this.this$0.customerService.get()).getCustomerOrNull();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    Object l4 = ir.r.l(customerOrNull, anonymousClass1, this);
                    xn.a aVar = xn.a.f37986a;
                    if (l4 == aVar) {
                        return aVar;
                    }
                }
                return sn.z.f31622a;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$5", f = "RouterViewModel.kt", l = {171}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$5, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass5 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ RouterViewModel this$0;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$5$1", f = "RouterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "deepLink", "Lsn/z;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 3, 0})
            /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$5$1, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends yn.i implements ho.p {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ RouterViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(RouterViewModel routerViewModel, wn.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = routerViewModel;
                }

                @Override // yn.a
                public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // ho.p
                public final Object invoke(String str, wn.c<? super sn.z> cVar) {
                    return ((AnonymousClass1) create(str, cVar)).invokeSuspend(sn.z.f31622a);
                }

                @Override // yn.a
                public final Object invokeSuspend(Object obj) {
                    String str = (String) this.L$0;
                    if (this.label == 0) {
                        sn.a.g(obj);
                        this.this$0.onDeepLink(str);
                        if (wq.n.a0(str, "redeem", false)) {
                            this.this$0.queueStateUpdate(new b0(1));
                        }
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(RouterViewModel routerViewModel, wn.c<? super AnonymousClass5> cVar) {
                super(2, cVar);
                this.this$0 = routerViewModel;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass5(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass5) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                    ir.i deepLinkFlow = ((SingularService) this.this$0.singularService.get()).getDeepLinkFlow();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    Object l4 = ir.r.l(deepLinkFlow, anonymousClass1, this);
                    xn.a aVar = xn.a.f37986a;
                    if (l4 == aVar) {
                        return aVar;
                    }
                }
                return sn.z.f31622a;
            }
        }

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            fr.d0 d0Var = (fr.d0) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                fr.g0.D(d0Var, null, null, new AnonymousClass1(RouterViewModel.this, null), 3);
                fr.g0.D(d0Var, null, null, new C00242(RouterViewModel.this, null), 3);
                fr.g0.D(d0Var, null, null, new AnonymousClass3(RouterViewModel.this, null), 3);
                fr.g0.D(d0Var, null, null, new AnonymousClass4(RouterViewModel.this, null), 3);
                fr.g0.D(d0Var, null, null, new AnonymousClass5(RouterViewModel.this, null), 3);
                fr.g0.D(d0Var, null, null, new AnonymousClass6(RouterViewModel.this, null), 3);
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$6", f = "RouterViewModel.kt", l = {191}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$6, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass6 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ RouterViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(RouterViewModel routerViewModel, wn.c<? super AnonymousClass6> cVar) {
                super(2, cVar);
                this.this$0 = routerViewModel;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass6(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass6) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                    d1 d1Var = new d1(((CustomerService) this.this$0.customerService.get()).getCustomer(), ((OnboardingService) this.this$0.onboardingService.get()).shouldShowPaywall(), new AnonymousClass1(null), 1);
                    C00252 c00252 = new C00252(this.this$0);
                    this.label = 1;
                    Object collect = d1Var.collect(c00252, this);
                    xn.a aVar = xn.a.f37986a;
                    if (collect == aVar) {
                        return aVar;
                    }
                }
                return sn.z.f31622a;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$6$1", f = "RouterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/readerapp/core/router/PaywallTrigger;", "customer", "Lio/elevenlabs/domain/model/Customer;", "shouldShow", ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$6$1, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends yn.i implements ho.q {
                /* synthetic */ Object L$0;
                /* synthetic */ boolean Z$0;
                int label;

                public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
                    super(3, cVar);
                }

                public final Object invoke(Customer customer, boolean z6, wn.c<? super PaywallTrigger> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
                    anonymousClass1.L$0 = customer;
                    anonymousClass1.Z$0 = z6;
                    return anonymousClass1.invokeSuspend(sn.z.f31622a);
                }

                @Override // yn.a
                public final Object invokeSuspend(Object obj) {
                    boolean z6;
                    Customer customer = (Customer) this.L$0;
                    boolean z10 = this.Z$0;
                    if (this.label == 0) {
                        sn.a.g(obj);
                        boolean canUpgrade = customer.getCanUpgrade();
                        boolean isFreeUser = customer.isFreeUser();
                        boolean z11 = false;
                        if (customer.isFreeUser() && z10) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (customer.isWinBackEligible() && customer.getCanUpgrade()) {
                            z11 = true;
                        }
                        return new PaywallTrigger(canUpgrade, isFreeUser, z6, z11);
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }

                @Override // ho.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Customer) obj, ((Boolean) obj2).booleanValue(), (wn.c<? super PaywallTrigger>) obj3);
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$6$2, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C00252<T> implements ir.j {
                final /* synthetic */ RouterViewModel this$0;

                public C00252(RouterViewModel routerViewModel) {
                    this.this$0 = routerViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RouterState emit$lambda$0(PaywallTrigger paywallTrigger, RouterViewModel routerViewModel, boolean z6, RouterState routerState) {
                    boolean z10;
                    routerState.getClass();
                    boolean canUpgrade = paywallTrigger.getCanUpgrade();
                    boolean isFreeUser = paywallTrigger.isFreeUser();
                    boolean shouldShowPaywall = paywallTrigger.getShouldShowPaywall();
                    if (paywallTrigger.getShouldShowPaywall() && ((OnboardingService) routerViewModel.onboardingService.get()).hasUserSeenPaywall()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, shouldShowPaywall, z10, z6, canUpgrade, Boolean.valueOf(isFreeUser), null, null, null, null, 246271, null);
                }

                public final Object emit(PaywallTrigger paywallTrigger, wn.c<? super sn.z> cVar) {
                    boolean z6;
                    if (paywallTrigger.isWinBackEligible() && !((OnboardingService) this.this$0.onboardingService.get()).isWinBackCooldownActive()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.this$0.getLogger().log(this.this$0.tag, "shouldShowPaywall=" + paywallTrigger.getShouldShowPaywall() + " winBackAvailable=" + z6);
                    RouterViewModel routerViewModel = this.this$0;
                    routerViewModel.queueStateUpdate(new f0(paywallTrigger, routerViewModel, z6));
                    return sn.z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                    return emit((PaywallTrigger) obj, (wn.c<? super sn.z>) cVar);
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$1", f = "RouterViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ RouterViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RouterViewModel routerViewModel, wn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = routerViewModel;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass1(this.this$0, cVar);
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
                    ir.i isSignedIn = ((AuthService) this.this$0.authService.get()).isSignedIn();
                    C00231 c00231 = new C00231(this.this$0, null);
                    this.label = 1;
                    Object l4 = ir.r.l(isSignedIn, c00231, this);
                    xn.a aVar = xn.a.f37986a;
                    if (l4 == aVar) {
                        return aVar;
                    }
                }
                return sn.z.f31622a;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$1$1", f = "RouterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lsn/z;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
            /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C00231 extends yn.i implements ho.p {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ RouterViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00231(RouterViewModel routerViewModel, wn.c<? super C00231> cVar) {
                    super(2, cVar);
                    this.this$0 = routerViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RouterState invokeSuspend$lambda$0(boolean z6, RouterState routerState) {
                    return RouterState.copy$default(routerState, Boolean.valueOf(z6), null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262142, null);
                }

                @Override // yn.a
                public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                    C00231 c00231 = new C00231(this.this$0, cVar);
                    c00231.Z$0 = ((Boolean) obj).booleanValue();
                    return c00231;
                }

                public final Object invoke(boolean z6, wn.c<? super sn.z> cVar) {
                    return ((C00231) create(Boolean.valueOf(z6), cVar)).invokeSuspend(sn.z.f31622a);
                }

                @Override // yn.a
                public final Object invokeSuspend(Object obj) {
                    boolean z6 = this.Z$0;
                    if (this.label == 0) {
                        sn.a.g(obj);
                        this.this$0.getLogger().log(this.this$0.tag, "Signed status change: " + z6);
                        this.this$0.queueStateUpdate(new e0(z6, 0));
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }

                @Override // ho.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) obj2);
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$3", f = "RouterViewModel.kt", l = {157, 157}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ RouterViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RouterViewModel routerViewModel, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.this$0 = routerViewModel;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass3(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            
                if (((ir.i) r5).collect(r0, r4) == r3) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                return r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
            
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
                            return sn.z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    OnboardingService onboardingService = (OnboardingService) this.this$0.onboardingService.get();
                    this.label = 1;
                    obj = onboardingService.hasCompletedOnboarding(this);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 2;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$3$1, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1<T> implements ir.j {
                final /* synthetic */ RouterViewModel this$0;

                public AnonymousClass1(RouterViewModel routerViewModel) {
                    this.this$0 = routerViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RouterState emit$lambda$0(boolean z6, RouterState routerState) {
                    routerState.getClass();
                    return RouterState.copy$default(routerState, null, Boolean.valueOf(z6), null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262141, null);
                }

                public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
                    this.this$0.getLogger().log(this.this$0.tag, "Onboarding status change: " + z6);
                    this.this$0.queueStateUpdate(new e0(z6, 1));
                    return sn.z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                    return emit(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) cVar);
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$2$4", f = "RouterViewModel.kt", l = {164, 164}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$4, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass4 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ RouterViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(RouterViewModel routerViewModel, wn.c<? super AnonymousClass4> cVar) {
                super(2, cVar);
                this.this$0 = routerViewModel;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass4(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass4) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            
                if (((ir.i) r5).collect(r0, r4) == r3) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                return r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
            
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
                            return sn.z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    OnboardingService onboardingService = (OnboardingService) this.this$0.onboardingService.get();
                    this.label = 1;
                    obj = onboardingService.hasCompletedAgeOnboarding(this);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 2;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.core.router.RouterViewModel$2$4$1, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1<T> implements ir.j {
                final /* synthetic */ RouterViewModel this$0;

                public AnonymousClass1(RouterViewModel routerViewModel) {
                    this.this$0 = routerViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RouterState emit$lambda$0(boolean z6, RouterState routerState) {
                    routerState.getClass();
                    return RouterState.copy$default(routerState, null, null, Boolean.valueOf(z6), null, null, false, false, null, false, false, false, false, false, null, null, null, null, null, 262139, null);
                }

                public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
                    this.this$0.getLogger().log(this.this$0.tag, "Age onboarding status change: " + z6);
                    this.this$0.queueStateUpdate(new e0(z6, 2));
                    return sn.z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                    return emit(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) cVar);
                }
            }
        }
    }
}

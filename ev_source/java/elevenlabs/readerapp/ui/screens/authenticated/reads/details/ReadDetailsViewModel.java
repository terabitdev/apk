package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.app.Activity;
import androidx.lifecycle.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.model.ReadDetailsSection;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.domain.services.NavigationService;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.delegates.AudioPreviewPlayback;
import io.elevenlabs.readerapp.ui.delegates.PriceFetcher;
import io.elevenlabs.readerapp.ui.delegates.PriceFetcherKt;
import ir.i1;
import ir.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0081\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0081\u0001B\u0085\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010$J\r\u0010(\u001a\u00020\"¢\u0006\u0004\b(\u0010$J\u0015\u0010+\u001a\u00020\"2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\"¢\u0006\u0004\b-\u0010$J\r\u0010.\u001a\u00020\"¢\u0006\u0004\b.\u0010$J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u0010$J\u0017\u00102\u001a\u00020\"2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\"2\u0006\u00101\u001a\u0002002\b\u00104\u001a\u0004\u0018\u000100¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\"2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\"¢\u0006\u0004\b;\u0010$J\r\u0010<\u001a\u00020\"¢\u0006\u0004\b<\u0010$J\u0015\u0010?\u001a\u00020\"2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\"¢\u0006\u0004\bA\u0010$J\r\u0010B\u001a\u00020\"¢\u0006\u0004\bB\u0010$J\u0015\u0010E\u001a\u00020\"2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\"¢\u0006\u0004\bG\u0010$J\r\u0010H\u001a\u00020\"¢\u0006\u0004\bH\u0010$J\u000f\u0010I\u001a\u00020\"H\u0002¢\u0006\u0004\bI\u0010$J\u0017\u0010K\u001a\u00020\"2\u0006\u0010J\u001a\u000200H\u0002¢\u0006\u0004\bK\u00103J\u0017\u0010L\u001a\u00020\"2\u0006\u0010J\u001a\u000200H\u0002¢\u0006\u0004\bL\u00103J\u0017\u0010M\u001a\u00020\"2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bM\u00103J\u001f\u0010N\u001a\u00020\"2\u0006\u00101\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002¢\u0006\u0004\bN\u00106J\u0017\u0010O\u001a\u00020\"2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bO\u00103J\u0017\u0010R\u001a\u00020Q2\u0006\u0010P\u001a\u000200H\u0002¢\u0006\u0004\bR\u0010SJ\u001d\u0010W\u001a\u00020\"2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0TH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\"2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bY\u00103J \u0010Z\u001a\u00020\"2\u0006\u0010>\u001a\u00020=2\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\bZ\u0010[J0\u0010`\u001a\u00020\"2\u0006\u00101\u001a\u0002002\u0006\u0010]\u001a\u00020\\2\u0006\u0010>\u001a\u00020=2\u0006\u0010_\u001a\u00020^H\u0082@¢\u0006\u0004\b`\u0010aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010gR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010hR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010iR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010jR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010kR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010jR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010lR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020n0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020n0}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Ljl/a;", "Lio/elevenlabs/domain/services/NavigationService;", "navigationService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionsService", "Lio/elevenlabs/domain/services/FeatureFlagService;", "featureFlagService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/PurchasesService;Lio/elevenlabs/domain/services/AudioPreviewService;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/player/PlayerService;Ljl/a;Lio/elevenlabs/domain/services/CustomerService;Ljl/a;Lio/elevenlabs/domain/services/FeatureFlagService;)V", "Lsn/z;", "onAddToQueueClick", "()V", "onRemoveFromQueueClick", "onAddToReadLaterClick", "onRemoveFromReadLaterClick", "refreshReadLaterMembership", "Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;", "source", "onShareClick", "(Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;)V", "onAddToCollectionClick", "onHelpClick", "navigateToPaywall", "", "readId", "openPlayer", "(Ljava/lang/String;)V", "code", "init", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/elevenlabs/domain/model/ExploreRead;", "read", "playCarouselPreview", "(Lio/elevenlabs/domain/model/ExploreRead;)V", "stopAllPreviews", "togglePreview", "Landroid/app/Activity;", "activity", "purchaseRead", "(Landroid/app/Activity;)V", "onRetry", "onRateTitleClick", "", "ratingSaved", "onRateTitleDialogClose", "(Z)V", "onToastClick", "onStartSelectiveStackPoppingRequested", "cancelInflightReadLater", "message", "showReadLaterToast", "showReadLaterErrorToast", "doInitRegular", "doInitRedeemReadCode", "loadReadDetails", "androidProductId", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "loadStoreProduct", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "Lio/elevenlabs/domain/model/ReadDetailsSection;", "sections", "fetchCarouselPrices", "(Ljava/util/List;)V", "handleAddToLibrarySuccess", "proceedPurchase", "(Landroid/app/Activity;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/RawOneTimeProduct;", "product", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;", FirebaseAnalytics.Event.PURCHASE, "purchaseWithGooglePlay", "(Ljava/lang/String;Lio/elevenlabs/domain/model/RawOneTimeProduct;Landroid/app/Activity;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/PurchasesService;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Ljl/a;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/services/FeatureFlagService;", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsControlEvent;", "mutableControlEventsFlow", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "priceFetcher", "Lio/elevenlabs/readerapp/ui/delegates/PriceFetcher;", "Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "audioPreview", "Lio/elevenlabs/readerapp/ui/delegates/AudioPreviewPlayback;", "Lfr/k1;", "readLaterJob", "Lfr/k1;", "Lio/elevenlabs/domain/services/ToastService$Toast;", "readLaterToast", "Lio/elevenlabs/domain/services/ToastService$Toast;", "Lir/i;", "getControlEventsFlow", "()Lir/i;", "controlEventsFlow", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel extends MviViewModel<ReadDetailsState> {
    private static final String API_ERROR_READ_NOT_PURCHASED = "read_not_purchased";
    private static final String TAG = "ReadDetailsViewModel";
    private final Analytics analytics;
    private final AudioPreviewPlayback audioPreview;
    private final jl.a collectionsService;
    private final CustomerService customerService;
    private final FeatureFlagService featureFlagService;
    private final Logger logger;
    private final i1 mutableControlEventsFlow;
    private final jl.a navigationService;
    private final PlayerService playerService;
    private final PriceFetcher priceFetcher;
    private final PurchasesService purchasesService;
    private k1 readLaterJob;
    private ToastService.Toast readLaterToast;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$6", f = "ReadDetailsViewModel.kt", l = {138, 138}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$6, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass6 extends yn.i implements ho.p {
        int label;

        public AnonymousClass6(wn.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass6(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass6) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                PlayerService playerService = ReadDetailsViewModel.this.playerService;
                this.label = 1;
                obj = playerService.connect(this);
            }
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel(DispatcherFactory dispatcherFactory, Logger logger, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ReadsService readsService, ToastService toastService, Analytics analytics, PurchasesService purchasesService, AudioPreviewService audioPreviewService, StringProvider stringProvider, PlayerService playerService, jl.a aVar, CustomerService customerService, jl.a aVar2, FeatureFlagService featureFlagService) {
        super(new ReadDetailsState(null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217727, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        logger.getClass();
        resolveErrorMessageUseCase.getClass();
        readsService.getClass();
        toastService.getClass();
        analytics.getClass();
        purchasesService.getClass();
        audioPreviewService.getClass();
        stringProvider.getClass();
        playerService.getClass();
        aVar.getClass();
        customerService.getClass();
        aVar2.getClass();
        featureFlagService.getClass();
        this.logger = logger;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.readsService = readsService;
        this.toastService = toastService;
        this.analytics = analytics;
        this.purchasesService = purchasesService;
        this.stringProvider = stringProvider;
        this.playerService = playerService;
        this.navigationService = aVar;
        this.customerService = customerService;
        this.collectionsService = aVar2;
        this.featureFlagService = featureFlagService;
        this.mutableControlEventsFlow = ir.r.a(0, 1, hr.a.f12537b);
        this.priceFetcher = new PriceFetcher(purchasesService, logger, c1.h(this), dispatcherFactory.getIo());
        this.audioPreview = new AudioPreviewPlayback(audioPreviewService, c1.h(this), dispatcherFactory.getIo());
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass4(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass5(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass6(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass7(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass8(null), 1, null);
    }

    private final void cancelInflightReadLater() {
        k1 k1Var = this.readLaterJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.readLaterJob = null;
        ToastService.Toast toast = this.readLaterToast;
        if (toast != null) {
            this.toastService.pop(toast);
        }
        this.readLaterToast = null;
    }

    private final void doInitRedeemReadCode(String readId, String code) {
        this.logger.log(TAG, defpackage.f.k("redeemReadCode - readId=", readId, ", code=", code));
        this.analytics.log(Analytics.Event.PaymentRedeemedCode.INSTANCE);
        queueStateUpdate(new l0(readId, code));
        fr.g0.D(c1.h(this), null, null, new ReadDetailsViewModel$doInitRedeemReadCode$2(this, readId, code, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState doInitRedeemReadCode$lambda$0(String str, String str2, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, str, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, true, null, str2, false, null, false, false, 126877626, null);
    }

    private final void doInitRegular(String readId) {
        this.logger.log(TAG, "doInitRegular - readId=" + readId);
        queueStateUpdate(new k0(readId, 3));
        loadReadDetails(readId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState doInitRegular$lambda$0(String str, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, str, false, null, null, true, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217642, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchCarouselPrices(List<? extends ReadDetailsSection> sections) {
        Iterable iterable;
        ArrayList arrayList = new ArrayList();
        for (ReadDetailsSection readDetailsSection : sections) {
            if (readDetailsSection instanceof ReadDetailsSection.ReadsV2) {
                iterable = PriceFetcherKt.extractProductIds(((ReadDetailsSection.ReadsV2) readDetailsSection).getData().getItems());
            } else if (readDetailsSection instanceof ReadDetailsSection.Reads) {
                iterable = PriceFetcherKt.extractProductIdsFromReadMeta(((ReadDetailsSection.Reads) readDetailsSection).getData().getItems());
            } else {
                iterable = tn.t.f33547a;
            }
            tn.o.g0(iterable, arrayList);
        }
        this.priceFetcher.fetchPrices(tn.o.g1(tn.o.k1(arrayList)));
    }

    private final void handleAddToLibrarySuccess(String readId) {
        this.analytics.log(new Analytics.Event.ExploreClickedAddToReads(readId));
        this.toastService.showToast(new ToastService.Toast.Action(this.stringProvider.getString(R.string.read_details_toast_saved_title), this.stringProvider.getString(R.string.read_details_toast_saved_text), defpackage.f.i("reader://read/", readId)));
        queueStateUpdate(new h0(this, readId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState handleAddToLibrarySuccess$lambda$0(ReadDetailsViewModel readDetailsViewModel, String str, ReadDetailsState readDetailsState) {
        boolean z6;
        readDetailsState.getClass();
        if (readDetailsState.getSampleReadId() != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        fr.g0.D(c1.h(readDetailsViewModel), null, null, new ReadDetailsViewModel$handleAddToLibrarySuccess$1$1(z6, readDetailsViewModel, str, null), 3);
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217695, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadReadDetails(String readId) {
        fr.g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new ReadDetailsViewModel$loadReadDetails$1(this, readId, null), 2);
        MviViewModel.launch$default(this, null, new ReadDetailsViewModel$loadReadDetails$2(this, readId, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MviViewModel.StateUpdate loadStoreProduct(String androidProductId) {
        return queueStateUpdate(new h0(androidProductId, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState loadStoreProduct$lambda$0(String str, ReadDetailsViewModel readDetailsViewModel, ReadDetailsState readDetailsState) {
        String str2;
        readDetailsState.getClass();
        PurchaseState purchase = readDetailsState.getPurchase();
        if (purchase != null) {
            str2 = purchase.getProductId();
        } else {
            str2 = null;
        }
        if (kotlin.jvm.internal.m.c(str2, str) && (readDetailsState.getPurchase().isLoadingPurchase() || readDetailsState.getPurchase().getProduct() != null)) {
            ib.i.r("loadStoreProduct: skipping — already loading or product loaded for ", str, readDetailsViewModel.logger, TAG);
            return readDetailsState;
        }
        readDetailsViewModel.logger.log(TAG, "loadStoreProduct: " + str);
        MviViewModel.launch$default(readDetailsViewModel, null, new ReadDetailsViewModel$loadStoreProduct$1$1(readDetailsViewModel, str, null), 1, null);
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, true, null, false, null, null, false, new PurchaseState(str, null, false, true, null, 22, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState onAddToReadLaterClick$lambda$0(ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, true, false, 100663295, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState onRateTitleClick$lambda$0(ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, true, false, false, null, null, false, null, false, false, 133955583, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState onRateTitleDialogClose$lambda$0(boolean z6, ReadDetailsViewModel readDetailsViewModel, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        if (z6) {
            fr.g0.D(c1.h(readDetailsViewModel), null, null, new ReadDetailsViewModel$onRateTitleDialogClose$1$1(readDetailsViewModel, null), 3);
        }
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, z6, false, null, null, false, null, false, false, 133431295, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState onRemoveFromReadLaterClick$lambda$0(ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 100663295, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState onStartSelectiveStackPoppingRequested$lambda$0(ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 125829119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState onToastClick$lambda$0(ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 133693439, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState openPlayer$lambda$0(ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, true, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217695, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z playCarouselPreview$lambda$0(ReadDetailsViewModel readDetailsViewModel, ExploreRead exploreRead) {
        readDetailsViewModel.analytics.log(new Analytics.Event.ExploreClickedPreview(exploreRead.getReadId()));
        return sn.z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object proceedPurchase(Activity activity, String str, wn.c<? super sn.z> cVar) {
        ReadDetailsViewModel$proceedPurchase$1 readDetailsViewModel$proceedPurchase$1;
        Object obj;
        int i10;
        RawOneTimeProduct product;
        Activity activity2;
        PurchaseState purchaseState;
        RawOneTimeProduct rawOneTimeProduct;
        String str2;
        if (cVar instanceof ReadDetailsViewModel$proceedPurchase$1) {
            readDetailsViewModel$proceedPurchase$1 = (ReadDetailsViewModel$proceedPurchase$1) cVar;
            int i11 = readDetailsViewModel$proceedPurchase$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readDetailsViewModel$proceedPurchase$1.label = i11 - Integer.MIN_VALUE;
                ReadDetailsViewModel$proceedPurchase$1 readDetailsViewModel$proceedPurchase$12 = readDetailsViewModel$proceedPurchase$1;
                obj = readDetailsViewModel$proceedPurchase$12.result;
                i10 = readDetailsViewModel$proceedPurchase$12.label;
                sn.z zVar = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    RawOneTimeProduct rawOneTimeProduct2 = (RawOneTimeProduct) readDetailsViewModel$proceedPurchase$12.L$3;
                    PurchaseState purchaseState2 = (PurchaseState) readDetailsViewModel$proceedPurchase$12.L$2;
                    String str3 = (String) readDetailsViewModel$proceedPurchase$12.L$1;
                    Activity activity3 = (Activity) readDetailsViewModel$proceedPurchase$12.L$0;
                    sn.a.g(obj);
                    rawOneTimeProduct = rawOneTimeProduct2;
                    purchaseState = purchaseState2;
                    activity2 = activity3;
                    str2 = str3;
                } else {
                    sn.a.g(obj);
                    PurchaseState purchase = ((ReadDetailsState) getStateFlow().getValue()).getPurchase();
                    if (purchase != null && (product = purchase.getProduct()) != null) {
                        this.analytics.log(Analytics.Event.PaymentIntendedPurchase.INSTANCE);
                        ReadsService readsService = this.readsService;
                        readDetailsViewModel$proceedPurchase$12.L$0 = activity;
                        readDetailsViewModel$proceedPurchase$12.L$1 = str;
                        readDetailsViewModel$proceedPurchase$12.L$2 = purchase;
                        readDetailsViewModel$proceedPurchase$12.L$3 = product;
                        readDetailsViewModel$proceedPurchase$12.label = 1;
                        Object addExploreRead = readsService.addExploreRead(str, readDetailsViewModel$proceedPurchase$12);
                        if (addExploreRead != obj2) {
                            activity2 = activity;
                            purchaseState = purchase;
                            rawOneTimeProduct = product;
                            obj = addExploreRead;
                            str2 = str;
                        }
                        return obj2;
                    }
                    return zVar;
                }
                if (!(((AsyncCallResult) obj) instanceof AsyncCallResult.Success)) {
                    handleAddToLibrarySuccess(str2);
                    queueStateUpdate(new g0(purchaseState, 10));
                    return zVar;
                }
                readDetailsViewModel$proceedPurchase$12.L$0 = null;
                readDetailsViewModel$proceedPurchase$12.L$1 = null;
                readDetailsViewModel$proceedPurchase$12.L$2 = null;
                readDetailsViewModel$proceedPurchase$12.L$3 = null;
                readDetailsViewModel$proceedPurchase$12.L$4 = null;
                readDetailsViewModel$proceedPurchase$12.label = 2;
                if (purchaseWithGooglePlay(str2, rawOneTimeProduct, activity2, purchaseState, readDetailsViewModel$proceedPurchase$12) == obj2) {
                    return obj2;
                }
                return zVar;
            }
        }
        readDetailsViewModel$proceedPurchase$1 = new ReadDetailsViewModel$proceedPurchase$1(this, cVar);
        ReadDetailsViewModel$proceedPurchase$1 readDetailsViewModel$proceedPurchase$122 = readDetailsViewModel$proceedPurchase$1;
        obj = readDetailsViewModel$proceedPurchase$122.result;
        i10 = readDetailsViewModel$proceedPurchase$122.label;
        sn.z zVar2 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        if (!(((AsyncCallResult) obj) instanceof AsyncCallResult.Success)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState proceedPurchase$lambda$0(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215679, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseRead$lambda$0(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, true, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215679, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007e, code lost:
    
        if (r2 == r8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object purchaseWithGooglePlay(String str, RawOneTimeProduct rawOneTimeProduct, Activity activity, PurchaseState purchaseState, wn.c<? super sn.z> cVar) {
        ReadDetailsViewModel$purchaseWithGooglePlay$1 readDetailsViewModel$purchaseWithGooglePlay$1;
        int i10;
        PurchaseState purchaseState2;
        AsyncCallResult asyncCallResult;
        String str2;
        PurchaseState purchaseState3;
        AsyncCallResult asyncCallResult2;
        String str3 = str;
        if (cVar instanceof ReadDetailsViewModel$purchaseWithGooglePlay$1) {
            readDetailsViewModel$purchaseWithGooglePlay$1 = (ReadDetailsViewModel$purchaseWithGooglePlay$1) cVar;
            int i11 = readDetailsViewModel$purchaseWithGooglePlay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readDetailsViewModel$purchaseWithGooglePlay$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readDetailsViewModel$purchaseWithGooglePlay$1.result;
                i10 = readDetailsViewModel$purchaseWithGooglePlay$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            purchaseState3 = (PurchaseState) readDetailsViewModel$purchaseWithGooglePlay$1.L$3;
                            str2 = (String) readDetailsViewModel$purchaseWithGooglePlay$1.L$0;
                            sn.a.g(obj);
                            asyncCallResult2 = (AsyncCallResult) obj;
                            if (!(asyncCallResult2 instanceof AsyncCallResult.Error)) {
                                String invoke$default = ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult2, null, 2, null);
                                queueStateUpdate(new g0(purchaseState3, 7));
                                ToastService.showToast$default(this.toastService, invoke$default, null, ToastService.ToastVariant.ERROR, 2, null);
                            } else if (asyncCallResult2 instanceof AsyncCallResult.Success) {
                                handleAddToLibrarySuccess(str2);
                                queueStateUpdate(new g0(purchaseState3, 8));
                            } else {
                                c6.p();
                                return null;
                            }
                            return sn.z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PurchaseState purchaseState4 = (PurchaseState) readDetailsViewModel$purchaseWithGooglePlay$1.L$3;
                    String str4 = (String) readDetailsViewModel$purchaseWithGooglePlay$1.L$0;
                    sn.a.g(obj);
                    purchaseState2 = purchaseState4;
                    str3 = str4;
                } else {
                    sn.a.g(obj);
                    PurchasesService purchasesService = this.purchasesService;
                    String id2 = rawOneTimeProduct.getId();
                    readDetailsViewModel$purchaseWithGooglePlay$1.L$0 = str3;
                    readDetailsViewModel$purchaseWithGooglePlay$1.L$1 = null;
                    readDetailsViewModel$purchaseWithGooglePlay$1.L$2 = null;
                    purchaseState2 = purchaseState;
                    readDetailsViewModel$purchaseWithGooglePlay$1.L$3 = purchaseState2;
                    readDetailsViewModel$purchaseWithGooglePlay$1.label = 1;
                    obj = purchasesService.purchaseRead(str3, id2, activity, readDetailsViewModel$purchaseWithGooglePlay$1);
                }
                asyncCallResult = (AsyncCallResult) obj;
                this.logger.log(TAG, "purchaseResult: " + asyncCallResult);
                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                    String invoke$default2 = ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null);
                    queueStateUpdate(new g0(purchaseState2, 0));
                    ToastService.showToast$default(this.toastService, invoke$default2, null, ToastService.ToastVariant.ERROR, 2, null);
                } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                    PurchasesService.ReadPurchaseResult readPurchaseResult = (PurchasesService.ReadPurchaseResult) ((AsyncCallResult.Success) asyncCallResult).getData();
                    if (kotlin.jvm.internal.m.c(readPurchaseResult, PurchasesService.ReadPurchaseResult.Cancelled.INSTANCE)) {
                        queueStateUpdate(new g0(purchaseState2, 1));
                    } else if (kotlin.jvm.internal.m.c(readPurchaseResult, PurchasesService.ReadPurchaseResult.Error.BillingUnavailable.INSTANCE)) {
                        queueStateUpdate(new g0(purchaseState2, 2));
                        ToastService.showToast$default(this.toastService, this.stringProvider.invoke(R.string.read_purchase_google_play_not_configured_error), null, ToastService.ToastVariant.ERROR, 2, null);
                    } else if (kotlin.jvm.internal.m.c(readPurchaseResult, PurchasesService.ReadPurchaseResult.Error.ConnectionError.INSTANCE)) {
                        queueStateUpdate(new g0(purchaseState2, 3));
                        ToastService.showToast$default(this.toastService, this.stringProvider.invoke(R.string.error_network_error), null, ToastService.ToastVariant.ERROR, 2, null);
                    } else if (kotlin.jvm.internal.m.c(readPurchaseResult, PurchasesService.ReadPurchaseResult.Error.ItemNotAvailable.INSTANCE)) {
                        queueStateUpdate(new g0(purchaseState2, 4));
                        ToastService.showToast$default(this.toastService, this.stringProvider.invoke(R.string.read_purchase_item_is_not_available), null, ToastService.ToastVariant.ERROR, 2, null);
                    } else if (kotlin.jvm.internal.m.c(readPurchaseResult, PurchasesService.ReadPurchaseResult.Error.UnknownError.INSTANCE)) {
                        queueStateUpdate(new g0(purchaseState2, 5));
                        ToastService.showToast$default(this.toastService, this.stringProvider.invoke(R.string.read_purchase_purchase_cannot_be_verified_now_error), null, ToastService.ToastVariant.ERROR, 2, null);
                    } else if (kotlin.jvm.internal.m.c(readPurchaseResult, PurchasesService.ReadPurchaseResult.PurchasePending.INSTANCE)) {
                        queueStateUpdate(new g0(purchaseState2, 6));
                        ToastService.showToast$default(this.toastService, this.stringProvider.invoke(R.string.read_purchase_still_processing_error), null, ToastService.ToastVariant.ERROR, 2, null);
                    } else {
                        if (kotlin.jvm.internal.m.c(readPurchaseResult, PurchasesService.ReadPurchaseResult.PurchaseSuccess.INSTANCE)) {
                            this.analytics.log(Analytics.Event.PaidReadUnlocked.INSTANCE);
                            ReadsService readsService = this.readsService;
                            readDetailsViewModel$purchaseWithGooglePlay$1.L$0 = str3;
                            readDetailsViewModel$purchaseWithGooglePlay$1.L$1 = null;
                            readDetailsViewModel$purchaseWithGooglePlay$1.L$2 = null;
                            readDetailsViewModel$purchaseWithGooglePlay$1.L$3 = purchaseState2;
                            readDetailsViewModel$purchaseWithGooglePlay$1.L$4 = null;
                            readDetailsViewModel$purchaseWithGooglePlay$1.label = 2;
                            obj = readsService.addExploreRead(str3, readDetailsViewModel$purchaseWithGooglePlay$1);
                            if (obj != aVar) {
                                str2 = str3;
                                purchaseState3 = purchaseState2;
                                asyncCallResult2 = (AsyncCallResult) obj;
                                if (!(asyncCallResult2 instanceof AsyncCallResult.Error)) {
                                }
                            }
                            return aVar;
                        }
                        c6.p();
                        return null;
                    }
                } else {
                    c6.p();
                    return null;
                }
                return sn.z.f31622a;
            }
        }
        readDetailsViewModel$purchaseWithGooglePlay$1 = new ReadDetailsViewModel$purchaseWithGooglePlay$1(this, cVar);
        Object obj2 = readDetailsViewModel$purchaseWithGooglePlay$1.result;
        i10 = readDetailsViewModel$purchaseWithGooglePlay$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        this.logger.log(TAG, "purchaseResult: " + asyncCallResult);
        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
        }
        return sn.z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$0(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$1(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$2(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$3(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$4(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$5(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$6(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$7(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadDetailsState purchaseWithGooglePlay$lambda$8(PurchaseState purchaseState, ReadDetailsState readDetailsState) {
        readDetailsState.getClass();
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, PurchaseState.copy$default(purchaseState, null, null, false, false, null, 27, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showReadLaterErrorToast(String message) {
        ToastService.Toast.Message message2 = new ToastService.Toast.Message(message, null, ToastService.ToastVariant.ERROR, 2, null);
        this.readLaterToast = message2;
        this.toastService.showToast(message2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showReadLaterToast(String message) {
        ToastService.Toast.Message message2 = new ToastService.Toast.Message(message, null, ToastService.ToastVariant.NEUTRAL, 2, null);
        this.readLaterToast = message2;
        this.toastService.showToast(message2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z togglePreview$lambda$0(ReadDetailsViewModel readDetailsViewModel, String str) {
        readDetailsViewModel.analytics.log(new Analytics.Event.ExploreClickedPreview(str));
        return sn.z.f31622a;
    }

    public final ir.i getControlEventsFlow() {
        return new ir.k1(this.mutableControlEventsFlow);
    }

    public final void init(String readId, String code) {
        readId.getClass();
        this.logger.log(TAG, defpackage.f.k("init - readId=", readId, ", code=", code));
        if (((ReadDetailsState) getStateFlow().getValue()).getReadId() != null) {
            return;
        }
        if (code == null) {
            doInitRegular(readId);
        } else {
            doInitRedeemReadCode(readId, code);
        }
    }

    public final void navigateToPaywall() {
        ((NavigationService) this.navigationService.get()).navigate(new Destination.Authorized.Paywall(ProductsService.PaywallSource.DEFAULT, Analytics.Event.PaywallSource.PremiumContent));
    }

    public final void onAddToCollectionClick() {
        String readId = ((ReadDetailsState) getStateFlow().getValue()).getReadId();
        if (readId == null) {
            return;
        }
        this.analytics.log(new Analytics.Event.ReadDetailsClickedAddToCollection(readId));
    }

    public final void onAddToQueueClick() {
        MviViewModel.launch$default(this, null, new ReadDetailsViewModel$onAddToQueueClick$1(this, null), 1, null);
    }

    public final void onAddToReadLaterClick() {
        String readId = ((ReadDetailsState) getStateFlow().getValue()).getReadId();
        if (readId == null) {
            return;
        }
        this.logger.log(TAG, "onAddToReadLaterClick - readId=".concat(readId));
        cancelInflightReadLater();
        queueStateUpdate(new t(25));
        this.readLaterJob = MviViewModel.launch$default(this, null, new ReadDetailsViewModel$onAddToReadLaterClick$2(this, readId, null), 1, null);
    }

    public final void onHelpClick() {
        String readId = ((ReadDetailsState) getStateFlow().getValue()).getReadId();
        if (readId == null) {
            return;
        }
        this.analytics.log(new Analytics.Event.ReadDetailsClickedHelp(readId));
    }

    public final void onRateTitleClick() {
        queueStateUpdate(new t(27));
    }

    public final void onRateTitleDialogClose(boolean ratingSaved) {
        queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.account.g(ratingSaved, this, 2));
    }

    public final void onRemoveFromQueueClick() {
        MviViewModel.launch$default(this, null, new ReadDetailsViewModel$onRemoveFromQueueClick$1(this, null), 1, null);
    }

    public final void onRemoveFromReadLaterClick() {
        String readId = ((ReadDetailsState) getStateFlow().getValue()).getReadId();
        if (readId == null) {
            return;
        }
        this.logger.log(TAG, "onRemoveFromReadLaterClick - readId=".concat(readId));
        cancelInflightReadLater();
        queueStateUpdate(new t(23));
        this.readLaterJob = MviViewModel.launch$default(this, null, new ReadDetailsViewModel$onRemoveFromReadLaterClick$2(this, readId, null), 1, null);
    }

    public final void onRetry() {
        ReadDetailsState readDetailsState = (ReadDetailsState) getStateFlow().getValue();
        String readId = readDetailsState.getReadId();
        if (readId == null) {
            return;
        }
        String redemptionCode = readDetailsState.getRedemptionCode();
        if (redemptionCode == null) {
            doInitRegular(readId);
        } else {
            doInitRedeemReadCode(readId, redemptionCode);
        }
    }

    public final void onShareClick(Analytics.Event.ReadDetailsActionSource source) {
        source.getClass();
        String readId = ((ReadDetailsState) getStateFlow().getValue()).getReadId();
        if (readId == null) {
            return;
        }
        this.analytics.log(new Analytics.Event.ReadDetailsClickedShare(source, readId));
    }

    public final void onStartSelectiveStackPoppingRequested() {
        queueStateUpdate(new t(24));
    }

    public final void onToastClick() {
        queueStateUpdate(new t(26));
    }

    public final void openPlayer(String readId) {
        if (readId == null) {
            ToastService.showToast$default(this.toastService, this.stringProvider.getString(R.string.error_unknown_error), null, ToastService.ToastVariant.ERROR, 2, null);
        } else {
            queueStateUpdate(new t(28));
            fr.g0.D(c1.h(this), null, null, new ReadDetailsViewModel$openPlayer$2(this, readId, null), 3);
        }
    }

    public final void playCarouselPreview(ExploreRead read) {
        read.getClass();
        String previewAudioUrl = read.getPreviewAudioUrl();
        if (previewAudioUrl == null) {
            return;
        }
        this.audioPreview.toggle(read.getReadId(), previewAudioUrl, new z(this, read, 5));
    }

    public final void purchaseRead(Activity activity) {
        String readId;
        activity.getClass();
        PurchaseState purchase = ((ReadDetailsState) getStateFlow().getValue()).getPurchase();
        if (purchase != null && (readId = ((ReadDetailsState) getStateFlow().getValue()).getReadId()) != null) {
            if (!wq.n.m0(purchase.getError())) {
                ToastService.showToast$default(this.toastService, purchase.getError(), null, ToastService.ToastVariant.ERROR, 2, null);
            } else {
                if (purchase.isLoading()) {
                    return;
                }
                queueStateUpdate(new g0(purchase, 9));
                MviViewModel.launch$default(this, null, new ReadDetailsViewModel$purchaseRead$2(this, activity, readId, null), 1, null);
            }
        }
    }

    public final void refreshReadLaterMembership() {
        String readId = ((ReadDetailsState) getStateFlow().getValue()).getReadId();
        if (readId == null) {
            return;
        }
        cancelInflightReadLater();
        this.readLaterJob = MviViewModel.launch$default(this, null, new ReadDetailsViewModel$refreshReadLaterMembership$1(this, readId, null), 1, null);
    }

    public final void stopAllPreviews() {
        this.audioPreview.stop();
    }

    public final void togglePreview() {
        String readId;
        String previewUrl = ((ReadDetailsState) getStateFlow().getValue()).getPreviewUrl();
        if (previewUrl == null || (readId = ((ReadDetailsState) getStateFlow().getValue()).getReadId()) == null) {
            return;
        }
        this.audioPreview.toggle(readId, previewUrl, new z(this, readId, 4));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$1", f = "ReadDetailsViewModel.kt", l = {100}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$1, reason: invalid class name */
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
                final z1 stateFlow = ReadDetailsViewModel.this.getStateFlow();
                jr.j G = ir.r.G(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ReadDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        String readId = ((ReadDetailsState) obj).getReadId();
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(readId, anonymousClass1);
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
                }, new ReadDetailsViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, ReadDetailsViewModel.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(ReadDetailsViewModel.this);
                this.label = 1;
                Object collect = G.collect(anonymousClass3, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3<T> implements ir.j {
            final /* synthetic */ ReadDetailsViewModel this$0;

            public AnonymousClass3(ReadDetailsViewModel readDetailsViewModel) {
                this.this$0 = readDetailsViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ReadDetailsState emit$lambda$0(boolean z6, ReadDetailsState readDetailsState) {
                readDetailsState.getClass();
                return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, z6, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217599, null);
            }

            public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new i0(z6, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$2", f = "ReadDetailsViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$2, reason: invalid class name */
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
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                final ir.i customer = ReadDetailsViewModel.this.customerService.getCustomer();
                ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$2$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$2$invokeSuspend$$inlined$map$1$2", f = "ReadDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                C00482 c00482 = new C00482(ReadDetailsViewModel.this);
                this.label = 1;
                Object collect = o6.collect(c00482, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00482<T> implements ir.j {
            final /* synthetic */ ReadDetailsViewModel this$0;

            public C00482(ReadDetailsViewModel readDetailsViewModel) {
                this.this$0 = readDetailsViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ReadDetailsState emit$lambda$0(boolean z6, ReadDetailsState readDetailsState) {
                readDetailsState.getClass();
                return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, Boolean.valueOf(z6), false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217215, null);
            }

            public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new i0(z6, 1));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$3", f = "ReadDetailsViewModel.kt", l = {115}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$3, reason: invalid class name */
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
                z1 isEligibleForTrial = ReadDetailsViewModel.this.purchasesService.getIsEligibleForTrial();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReadDetailsViewModel.this);
                this.label = 1;
                Object collect = isEligibleForTrial.collect(anonymousClass1, this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ ReadDetailsViewModel this$0;

            public AnonymousClass1(ReadDetailsViewModel readDetailsViewModel) {
                this.this$0 = readDetailsViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ReadDetailsState emit$lambda$0(boolean z6, ReadDetailsState readDetailsState) {
                readDetailsState.getClass();
                return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, z6, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134216703, null);
            }

            public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new i0(z6, 2));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$4", f = "ReadDetailsViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends yn.i implements ho.p {
        int label;

        public AnonymousClass4(wn.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass4(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass4) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                z1 prices = ReadDetailsViewModel.this.priceFetcher.getPrices();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReadDetailsViewModel.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$4$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ ReadDetailsViewModel this$0;

            public AnonymousClass1(ReadDetailsViewModel readDetailsViewModel) {
                this.this$0 = readDetailsViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ReadDetailsState emit$lambda$0(Map map, ReadDetailsState readDetailsState) {
                readDetailsState.getClass();
                return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, map, null, false, false, false, null, null, false, null, false, false, 134152191, null);
            }

            public final Object emit(Map<String, MoneyPrice> map, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new j0(map, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((Map<String, MoneyPrice>) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$5", f = "ReadDetailsViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5 extends yn.i implements ho.p {
        int label;

        public AnonymousClass5(wn.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass5(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass5) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                z1 playingReadId = ReadDetailsViewModel.this.audioPreview.getPlayingReadId();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReadDetailsViewModel.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$5$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ ReadDetailsViewModel this$0;

            public AnonymousClass1(ReadDetailsViewModel readDetailsViewModel) {
                this.this$0 = readDetailsViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ReadDetailsState emit$lambda$0(String str, ReadDetailsState readDetailsState) {
                boolean z6;
                String str2;
                readDetailsState.getClass();
                if (str != null && str.equals(readDetailsState.getReadId())) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z10 = z6;
                if (str != null && !str.equals(readDetailsState.getReadId())) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, z10, null, str2, false, false, false, null, null, false, null, false, false, 134053887, null);
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
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$8", f = "ReadDetailsViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$8, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass8 extends yn.i implements ho.p {
        int label;

        public AnonymousClass8(wn.c<? super AnonymousClass8> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass8(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass8) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                ir.i isFlagEnabled$default = FeatureFlagService.isFlagEnabled$default(ReadDetailsViewModel.this.featureFlagService, FeatureFlagService.Flag.READ_LATER_ENABLED, false, false, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReadDetailsViewModel.this);
                this.label = 1;
                Object collect = isFlagEnabled$default.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$8$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ ReadDetailsViewModel this$0;

            public AnonymousClass1(ReadDetailsViewModel readDetailsViewModel) {
                this.this$0 = readDetailsViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ReadDetailsState emit$lambda$0(boolean z6, ReadDetailsState readDetailsState) {
                readDetailsState.getClass();
                return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, z6, 67108863, null);
            }

            public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new i0(z6, 3));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super sn.z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$7", f = "ReadDetailsViewModel.kt", l = {142, 145}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$7, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass7 extends yn.i implements ho.p {
        Object L$0;
        int label;

        public AnonymousClass7(wn.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass7(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass7) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        
            if (r0.collect(r2, r5) == r3) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
            if (r6 == r3) goto L16;
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
                    if (i10 != 2) {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                    c6.u();
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                final z1 stateFlow = ReadDetailsViewModel.this.getStateFlow();
                ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$7$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$7$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$7$invokeSuspend$$inlined$mapNotNull$1$2", f = "ReadDetailsViewModel.kt", l = {52}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$7$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
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

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
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
                                        String readId = ((ReadDetailsState) obj).getReadId();
                                        if (readId != null) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(readId, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
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
                };
                this.label = 1;
                obj = ir.r.u(iVar, this);
            }
            z1 observeQueueState = ReadDetailsViewModel.this.playerService.observeQueueState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReadDetailsViewModel.this, (String) obj);
            this.L$0 = null;
            this.label = 2;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$7$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ String $readId;
            final /* synthetic */ ReadDetailsViewModel this$0;

            public AnonymousClass1(ReadDetailsViewModel readDetailsViewModel, String str) {
                this.this$0 = readDetailsViewModel;
                this.$readId = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ReadDetailsState emit$lambda$0(MediaQueueState mediaQueueState, String str, ReadDetailsState readDetailsState) {
                List<MediaItemState> items;
                readDetailsState.getClass();
                boolean z6 = false;
                if (mediaQueueState != null && (items = mediaQueueState.getItems()) != null && !items.isEmpty()) {
                    Iterator<T> it = items.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (kotlin.jvm.internal.m.c(((MediaItemState) it.next()).getReadId(), str)) {
                            z6 = true;
                            break;
                        }
                    }
                }
                return ReadDetailsState.copy$default(readDetailsState, null, z6, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217725, null);
            }

            public final Object emit(MediaQueueState mediaQueueState, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new l0(mediaQueueState, this.$readId, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((MediaQueueState) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }
}

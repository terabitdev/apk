package io.elevenlabs.payments;

import a8.s;
import android.content.Context;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.c;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.StoreCountryCodeRecordingService;
import io.elevenlabs.domain.services.UserConfigService;
import jd.d;
import jd.e;
import jd.f;
import jd.h0;
import jd.l;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p0.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/payments/StoreCountryCodeRecordingServiceImpl;", "Lio/elevenlabs/domain/services/StoreCountryCodeRecordingService;", "Landroid/content/Context;", "context", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "Lfr/d0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lio/elevenlabs/domain/services/UserConfigService;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Lfr/d0;)V", "Lsn/z;", "doFetchAndRecordCountryCode", "()V", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "recordCountryCode", "(Ljava/lang/String;)V", "fetchAndRecordCountryCode", "Landroid/content/Context;", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/Logger;", "Lfr/d0;", "Companion", "payments_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class StoreCountryCodeRecordingServiceImpl implements StoreCountryCodeRecordingService {
    private static final String TAG = "StoreCountryCodeRecordingService";
    private final Context context;
    private final d0 coroutineScope;
    private final DispatcherFactory dispatcherFactory;
    private final Logger logger;
    private final UserConfigService userConfigService;

    public StoreCountryCodeRecordingServiceImpl(Context context, UserConfigService userConfigService, DispatcherFactory dispatcherFactory, Logger logger, @ApplicationCoroutineScope d0 d0Var) {
        context.getClass();
        userConfigService.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        d0Var.getClass();
        this.context = context;
        this.userConfigService = userConfigService;
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
        this.coroutineScope = d0Var;
    }

    public final void doFetchAndRecordCountryCode() {
        jd.a aVar = new jd.a(this.context);
        aVar.f19365c = new c(3);
        aVar.f19363a = new s(false, false);
        final jd.c a10 = aVar.a();
        this.logger.log(TAG, "fetchAndRecordCountryCode - fetching country code through BillingClient");
        a10.j(new d() { // from class: io.elevenlabs.payments.StoreCountryCodeRecordingServiceImpl$doFetchAndRecordCountryCode$1
            @Override // jd.d
            public void onBillingServiceDisconnected() {
                Logger logger;
                logger = this.logger;
                logger.log("StoreCountryCodeRecordingService", "onBillingServiceDisconnected");
            }

            @Override // jd.d
            public void onBillingSetupFinished(l result) {
                result.getClass();
                if (result.f19444a == 0) {
                    jd.b bVar = jd.b.this;
                    final StoreCountryCodeRecordingServiceImpl storeCountryCodeRecordingServiceImpl = this;
                    f fVar = new f() { // from class: io.elevenlabs.payments.StoreCountryCodeRecordingServiceImpl$doFetchAndRecordCountryCode$1$onBillingSetupFinished$1
                        @Override // jd.f
                        public void onBillingConfigResponse(l result2, e config) {
                            Logger logger;
                            String str;
                            Logger logger2;
                            result2.getClass();
                            if (result2.f19444a != 0 || config == null || (str = config.f19400a) == null) {
                                logger = StoreCountryCodeRecordingServiceImpl.this.logger;
                                logger.log("StoreCountryCodeRecordingService", "Could not obtain countryCode - result=" + result2 + ", config=" + config);
                                return;
                            }
                            StoreCountryCodeRecordingServiceImpl storeCountryCodeRecordingServiceImpl2 = StoreCountryCodeRecordingServiceImpl.this;
                            logger2 = storeCountryCodeRecordingServiceImpl2.logger;
                            logger2.log("StoreCountryCodeRecordingService", "onBillingSetupFinished - countryCode=".concat(str));
                            storeCountryCodeRecordingServiceImpl2.recordCountryCode(str);
                        }
                    };
                    jd.c cVar = (jd.c) bVar;
                    cVar.getClass();
                    if (jd.c.l(new h0(cVar, fVar, 0), HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new i(cVar, fVar, 6), cVar.t(), cVar.k()) == null) {
                        l w6 = cVar.w();
                        cVar.L(13, zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, w6);
                        fVar.onBillingConfigResponse(w6, null);
                    }
                }
            }
        });
    }

    public final void recordCountryCode(String r52) {
        g0.D(this.coroutineScope, this.dispatcherFactory.getDefault(), null, new StoreCountryCodeRecordingServiceImpl$recordCountryCode$1(this, r52, null), 2);
    }

    @Override // io.elevenlabs.domain.services.StoreCountryCodeRecordingService
    public void fetchAndRecordCountryCode() {
        g0.D(this.coroutineScope, this.dispatcherFactory.getDefault(), null, new StoreCountryCodeRecordingServiceImpl$fetchAndRecordCountryCode$1(this, null), 2);
    }
}

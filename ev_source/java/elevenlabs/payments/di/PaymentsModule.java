package io.elevenlabs.payments.di;

import android.content.Context;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesConfiguration;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.StoreCountryCodeRecordingService;
import io.elevenlabs.payments.InAppPurchasesService;
import io.elevenlabs.payments.StoreCountryCodeRecordingServiceImpl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/payments/di/PaymentsModule;", "", "<init>", "()V", "provideRevenueCatPayments", "Lcom/revenuecat/purchases/Purchases;", "configuration", "Lio/elevenlabs/domain/Configuration;", "context", "Landroid/content/Context;", "provideProductsService", "Lio/elevenlabs/domain/services/PurchasesService;", "inAppPurchasesService", "Lio/elevenlabs/payments/InAppPurchasesService;", "provideStoreCountryCodeRecordingService", "Lio/elevenlabs/domain/services/StoreCountryCodeRecordingService;", "storeCountryCodeRecordingServiceImpl", "Lio/elevenlabs/payments/StoreCountryCodeRecordingServiceImpl;", "payments_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PaymentsModule {
    public static final PaymentsModule INSTANCE = new PaymentsModule();

    private PaymentsModule() {
    }

    public final PurchasesService provideProductsService(InAppPurchasesService inAppPurchasesService) {
        inAppPurchasesService.getClass();
        return inAppPurchasesService;
    }

    public final Purchases provideRevenueCatPayments(Configuration configuration, Context context) {
        LogLevel logLevel;
        configuration.getClass();
        context.getClass();
        Purchases.Companion companion = Purchases.INSTANCE;
        if (configuration.getDebugMode()) {
            logLevel = LogLevel.DEBUG;
        } else {
            logLevel = LogLevel.ERROR;
        }
        companion.setLogLevel(logLevel);
        companion.configure(new PurchasesConfiguration.Builder(context, configuration.getRevenueCatKey()).build());
        return companion.getSharedInstance();
    }

    public final StoreCountryCodeRecordingService provideStoreCountryCodeRecordingService(StoreCountryCodeRecordingServiceImpl storeCountryCodeRecordingServiceImpl) {
        storeCountryCodeRecordingServiceImpl.getClass();
        return storeCountryCodeRecordingServiceImpl;
    }
}

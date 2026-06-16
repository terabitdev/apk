package io.elevenlabs.payments.di;

import androidx.room.m0;
import io.elevenlabs.domain.services.StoreCountryCodeRecordingService;
import io.elevenlabs.payments.StoreCountryCodeRecordingServiceImpl;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PaymentsModule_ProvideStoreCountryCodeRecordingServiceFactory implements c {
    private final f storeCountryCodeRecordingServiceImplProvider;

    private PaymentsModule_ProvideStoreCountryCodeRecordingServiceFactory(f fVar) {
        this.storeCountryCodeRecordingServiceImplProvider = fVar;
    }

    public static PaymentsModule_ProvideStoreCountryCodeRecordingServiceFactory create(f fVar) {
        return new PaymentsModule_ProvideStoreCountryCodeRecordingServiceFactory(fVar);
    }

    public static StoreCountryCodeRecordingService provideStoreCountryCodeRecordingService(StoreCountryCodeRecordingServiceImpl storeCountryCodeRecordingServiceImpl) {
        StoreCountryCodeRecordingService provideStoreCountryCodeRecordingService = PaymentsModule.INSTANCE.provideStoreCountryCodeRecordingService(storeCountryCodeRecordingServiceImpl);
        m0.n(provideStoreCountryCodeRecordingService);
        return provideStoreCountryCodeRecordingService;
    }

    @Override // rn.a
    public StoreCountryCodeRecordingService get() {
        return provideStoreCountryCodeRecordingService((StoreCountryCodeRecordingServiceImpl) this.storeCountryCodeRecordingServiceImplProvider.get());
    }
}

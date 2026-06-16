package io.elevenlabs.analytics;

import io.elevenlabs.domain.Logger;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class FirebaseAnalyticsService_Factory implements c {
    private final f loggerProvider;

    private FirebaseAnalyticsService_Factory(f fVar) {
        this.loggerProvider = fVar;
    }

    public static FirebaseAnalyticsService_Factory create(f fVar) {
        return new FirebaseAnalyticsService_Factory(fVar);
    }

    public static FirebaseAnalyticsService newInstance(Logger logger) {
        return new FirebaseAnalyticsService(logger);
    }

    @Override // rn.a
    public FirebaseAnalyticsService get() {
        return newInstance((Logger) this.loggerProvider.get());
    }
}

package io.elevenlabs.readerapp.usecase;

import android.content.Context;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppRatingService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RateAppUseCase_Factory implements c {
    private final f contextProvider;
    private final f loggerProvider;
    private final f ratingServiceProvider;

    private RateAppUseCase_Factory(f fVar, f fVar2, f fVar3) {
        this.contextProvider = fVar;
        this.ratingServiceProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static RateAppUseCase_Factory create(f fVar, f fVar2, f fVar3) {
        return new RateAppUseCase_Factory(fVar, fVar2, fVar3);
    }

    public static RateAppUseCase newInstance(Context context, AppRatingService appRatingService, Logger logger) {
        return new RateAppUseCase(context, appRatingService, logger);
    }

    @Override // rn.a
    public RateAppUseCase get() {
        return newInstance((Context) this.contextProvider.get(), (AppRatingService) this.ratingServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}

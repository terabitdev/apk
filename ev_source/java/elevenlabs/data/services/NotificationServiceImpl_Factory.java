package io.elevenlabs.data.services;

import android.content.Context;
import android.content.SharedPreferences;
import io.elevenlabs.data.api.NotificationsApi;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.DeviceUuidService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NotificationServiceImpl_Factory implements ul.c {
    private final ul.f appContextProvider;
    private final ul.f authServiceProvider;
    private final ul.f deviceUuidServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f notificationsApiProvider;
    private final ul.f userPreferencesProvider;

    private NotificationServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.userPreferencesProvider = fVar;
        this.authServiceProvider = fVar2;
        this.notificationsApiProvider = fVar3;
        this.loggerProvider = fVar4;
        this.deviceUuidServiceProvider = fVar5;
        this.appContextProvider = fVar6;
    }

    public static NotificationServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new NotificationServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static NotificationServiceImpl newInstance(SharedPreferences sharedPreferences, AuthService authService, NotificationsApi notificationsApi, Logger logger, DeviceUuidService deviceUuidService, Context context) {
        return new NotificationServiceImpl(sharedPreferences, authService, notificationsApi, logger, deviceUuidService, context);
    }

    @Override // rn.a
    public NotificationServiceImpl get() {
        return newInstance((SharedPreferences) this.userPreferencesProvider.get(), (AuthService) this.authServiceProvider.get(), (NotificationsApi) this.notificationsApiProvider.get(), (Logger) this.loggerProvider.get(), (DeviceUuidService) this.deviceUuidServiceProvider.get(), (Context) this.appContextProvider.get());
    }
}

package io.elevenlabs.data.services;

import android.content.Context;
import android.content.SharedPreferences;
import io.elevenlabs.data.api.NotificationsApi;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NotificationPermissionServiceImpl_Factory implements ul.c {
    private final ul.f contextProvider;
    private final ul.f loggerProvider;
    private final ul.f notificationsApiProvider;
    private final ul.f sharedPreferencesProvider;

    private NotificationPermissionServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.sharedPreferencesProvider = fVar;
        this.loggerProvider = fVar2;
        this.contextProvider = fVar3;
        this.notificationsApiProvider = fVar4;
    }

    public static NotificationPermissionServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new NotificationPermissionServiceImpl_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static NotificationPermissionServiceImpl newInstance(SharedPreferences sharedPreferences, Logger logger, Context context, NotificationsApi notificationsApi) {
        return new NotificationPermissionServiceImpl(sharedPreferences, logger, context, notificationsApi);
    }

    @Override // rn.a
    public NotificationPermissionServiceImpl get() {
        return newInstance((SharedPreferences) this.sharedPreferencesProvider.get(), (Logger) this.loggerProvider.get(), (Context) this.contextProvider.get(), (NotificationsApi) this.notificationsApiProvider.get());
    }
}

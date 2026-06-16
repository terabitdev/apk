package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.NotificationPermissionService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class NotificationPrimerViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f notificationPermissionServiceProvider;

    private NotificationPrimerViewModel_Factory(ul.f fVar, ul.f fVar2) {
        this.analyticsProvider = fVar;
        this.notificationPermissionServiceProvider = fVar2;
    }

    public static NotificationPrimerViewModel_Factory create(ul.f fVar, ul.f fVar2) {
        return new NotificationPrimerViewModel_Factory(fVar, fVar2);
    }

    public static NotificationPrimerViewModel newInstance(Analytics analytics, NotificationPermissionService notificationPermissionService) {
        return new NotificationPrimerViewModel(analytics, notificationPermissionService);
    }

    @Override // rn.a
    public NotificationPrimerViewModel get() {
        return newInstance((Analytics) this.analyticsProvider.get(), (NotificationPermissionService) this.notificationPermissionServiceProvider.get());
    }
}

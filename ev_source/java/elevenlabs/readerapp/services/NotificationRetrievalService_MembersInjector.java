package io.elevenlabs.readerapp.services;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.NotificationService;
import io.elevenlabs.domain.services.ToastService;
import jl.b;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NotificationRetrievalService_MembersInjector implements b {
    private final f analyticsProvider;
    private final f loggerProvider;
    private final f notificationServiceProvider;
    private final f toastServiceProvider;

    private NotificationRetrievalService_MembersInjector(f fVar, f fVar2, f fVar3, f fVar4) {
        this.loggerProvider = fVar;
        this.notificationServiceProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.toastServiceProvider = fVar4;
    }

    public static b create(f fVar, f fVar2, f fVar3, f fVar4) {
        return new NotificationRetrievalService_MembersInjector(fVar, fVar2, fVar3, fVar4);
    }

    public static void injectAnalytics(NotificationRetrievalService notificationRetrievalService, Analytics analytics) {
        notificationRetrievalService.analytics = analytics;
    }

    public static void injectLogger(NotificationRetrievalService notificationRetrievalService, Logger logger) {
        notificationRetrievalService.logger = logger;
    }

    public static void injectNotificationService(NotificationRetrievalService notificationRetrievalService, NotificationService notificationService) {
        notificationRetrievalService.notificationService = notificationService;
    }

    public static void injectToastService(NotificationRetrievalService notificationRetrievalService, ToastService toastService) {
        notificationRetrievalService.toastService = toastService;
    }

    public void injectMembers(NotificationRetrievalService notificationRetrievalService) {
        injectLogger(notificationRetrievalService, (Logger) this.loggerProvider.get());
        injectNotificationService(notificationRetrievalService, (NotificationService) this.notificationServiceProvider.get());
        injectAnalytics(notificationRetrievalService, (Analytics) this.analyticsProvider.get());
        injectToastService(notificationRetrievalService, (ToastService) this.toastServiceProvider.get());
    }
}

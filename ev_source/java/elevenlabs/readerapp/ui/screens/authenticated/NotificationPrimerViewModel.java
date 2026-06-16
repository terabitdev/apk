package io.elevenlabs.readerapp.ui.screens.authenticated;

import androidx.lifecycle.j1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.services.NotificationPermissionService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/NotificationPrimerViewModel;", "Landroidx/lifecycle/j1;", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "notificationPermissionService", "<init>", "(Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/NotificationPermissionService;)V", "Lio/elevenlabs/domain/Analytics$Event;", "event", "Lsn/z;", "logEvent", "(Lio/elevenlabs/domain/Analytics$Event;)V", "Lio/elevenlabs/domain/model/NotificationPrimerSource;", "source", "recordPrimerShown", "(Lio/elevenlabs/domain/model/NotificationPrimerSource;)V", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class NotificationPrimerViewModel extends j1 {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final NotificationPermissionService notificationPermissionService;

    public NotificationPrimerViewModel(Analytics analytics, NotificationPermissionService notificationPermissionService) {
        analytics.getClass();
        notificationPermissionService.getClass();
        this.analytics = analytics;
        this.notificationPermissionService = notificationPermissionService;
    }

    public final void logEvent(Analytics.Event event) {
        event.getClass();
        this.analytics.log(event);
    }

    public final void recordPrimerShown(NotificationPrimerSource source) {
        source.getClass();
        fr.g0.D(androidx.lifecycle.c1.h(this), null, null, new NotificationPrimerViewModel$recordPrimerShown$1(this, source, null), 3);
    }
}

package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\u0006J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/NotificationPermissionService;", "", "Lio/elevenlabs/domain/model/NotificationPrimerSource;", "source", "Lsn/z;", "recordPrimerShown", "(Lio/elevenlabs/domain/model/NotificationPrimerSource;Lwn/c;)Ljava/lang/Object;", "Lir/i;", "Lio/elevenlabs/domain/model/NotificationPrimerData;", "primerRequests", "()Lir/i;", "requestPrimer", "Lio/elevenlabs/domain/model/NotificationPrimerModel;", "fetchNotificationPrimer", "", "hasSeenNotificationPrimerSource", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface NotificationPermissionService {
    Object fetchNotificationPrimer(NotificationPrimerSource notificationPrimerSource, c<? super NotificationPrimerModel> cVar);

    Object hasSeenNotificationPrimerSource(NotificationPrimerSource notificationPrimerSource, c<? super Boolean> cVar);

    i primerRequests();

    Object recordPrimerShown(NotificationPrimerSource notificationPrimerSource, c<? super z> cVar);

    Object requestPrimer(NotificationPrimerSource notificationPrimerSource, c<? super z> cVar);
}

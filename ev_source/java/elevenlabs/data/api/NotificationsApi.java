package io.elevenlabs.data.api;

import ct.f;
import ct.o;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.NotificationNewDeviceModel;
import io.elevenlabs.data.model.response.NotificationPrimerResponseModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/NotificationsApi;", "", "Lio/elevenlabs/data/model/request/NotificationNewDeviceModel;", "device", "Lio/elevenlabs/data/model/ApiResult;", "Lsn/z;", "register", "(Lio/elevenlabs/data/model/request/NotificationNewDeviceModel;Lwn/c;)Ljava/lang/Object;", "", "source", "Lio/elevenlabs/data/model/response/NotificationPrimerResponseModel;", "getNotificationPrimer", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface NotificationsApi {
    @f("/v1/reader/notification-primer")
    Object getNotificationPrimer(@t("source") String str, c<? super ApiResult<NotificationPrimerResponseModel>> cVar);

    @o("/v1/reader/notifications/register")
    Object register(@ct.a NotificationNewDeviceModel notificationNewDeviceModel, c<? super ApiResult<z>> cVar);
}

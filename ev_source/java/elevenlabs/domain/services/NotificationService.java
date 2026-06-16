package io.elevenlabs.domain.services;

import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/NotificationService;", "", "Lsn/z;", "sync", "(Lwn/c;)Ljava/lang/Object;", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "saveToken", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "submitToken", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface NotificationService {
    String getToken();

    void saveToken(String token);

    Object submitToken(String str, c<? super z> cVar);

    Object sync(c<? super z> cVar);
}

package io.elevenlabs.domain.services;

import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/DevService;", "", "Lsn/z;", "clearCache", "()V", "clearFileCache", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "resendNotificationToken", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "clearWinBackCooldown", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface DevService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void clearCache(DevService devService) {
            DevService.super.clearCache();
        }

        @Deprecated
        public static void clearFileCache(DevService devService) {
            DevService.super.clearFileCache();
        }

        @Deprecated
        public static void clearWinBackCooldown(DevService devService) {
            DevService.super.clearWinBackCooldown();
        }

        @Deprecated
        public static Object resendNotificationToken(DevService devService, String str, c<? super z> cVar) {
            return DevService.super.resendNotificationToken(str, cVar);
        }
    }

    static /* synthetic */ Object resendNotificationToken$suspendImpl(DevService devService, String str, c<? super z> cVar) {
        return z.f31622a;
    }

    default Object resendNotificationToken(String str, c<? super z> cVar) {
        return resendNotificationToken$suspendImpl(this, str, cVar);
    }

    default void clearCache() {
    }

    default void clearFileCache() {
    }

    default void clearWinBackCooldown() {
    }
}

package io.elevenlabs.domain.usecase.firebase;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.usecase.ResolveMultiFactorResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H¦B¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/usecase/firebase/ResolveMultiFactorAuthUseCase;", "", "resolver", "", "verificationId", "verificationCode", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/usecase/ResolveMultiFactorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/Logger;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ResolveMultiFactorAuthUseCase {
    Object invoke(Object obj, String str, String str2, Logger logger, c<? super ResolveMultiFactorResult> cVar);
}

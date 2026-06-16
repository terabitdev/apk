package io.elevenlabs.domain.usecase.firebase;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.usecase.VerifyPhoneNumberResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H¦B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/usecase/firebase/VerifyPhoneNumberForMfaUseCase;", "", "Lio/elevenlabs/domain/Logger;", "logger", "activity", "multiFactorResolver", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult;", "invoke", "(Lio/elevenlabs/domain/Logger;Ljava/lang/Object;Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface VerifyPhoneNumberForMfaUseCase {
    Object invoke(Logger logger, Object obj, Object obj2, c<? super VerifyPhoneNumberResult> cVar);
}

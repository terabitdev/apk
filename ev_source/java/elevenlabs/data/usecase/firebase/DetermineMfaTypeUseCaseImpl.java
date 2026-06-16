package io.elevenlabs.data.usecase.firebase;

import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.TotpMultiFactorInfo;
import io.elevenlabs.domain.services.MfaType;
import io.elevenlabs.domain.usecase.firebase.DetermineMfaTypeUseCase;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/usecase/firebase/DetermineMfaTypeUseCaseImpl;", "Lio/elevenlabs/domain/usecase/firebase/DetermineMfaTypeUseCase;", "<init>", "()V", "invoke", "Lio/elevenlabs/domain/services/MfaType;", "resolver", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DetermineMfaTypeUseCaseImpl implements DetermineMfaTypeUseCase {
    @Override // io.elevenlabs.domain.usecase.firebase.DetermineMfaTypeUseCase
    public MfaType invoke(Object resolver) {
        resolver.getClass();
        List<MultiFactorInfo> hints = ((MultiFactorResolver) resolver).getHints();
        hints.getClass();
        if (!hints.isEmpty()) {
            Iterator<T> it = hints.iterator();
            while (it.hasNext()) {
                if (((MultiFactorInfo) it.next()) instanceof TotpMultiFactorInfo) {
                    return MfaType.TOTP;
                }
            }
        }
        return MfaType.PHONE;
    }
}

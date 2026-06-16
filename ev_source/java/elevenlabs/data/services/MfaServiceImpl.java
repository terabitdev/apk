package io.elevenlabs.data.services;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.domain.model.MfaState;
import io.elevenlabs.domain.services.MfaService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/data/services/MfaServiceImpl;", "Lio/elevenlabs/domain/services/MfaService;", "<init>", "()V", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lsn/z;", "storeMfaState", "(Ljava/lang/Object;)V", "getMfaState", "()Ljava/lang/Object;", "clearMfaState", "Lio/elevenlabs/domain/model/MfaState;", "mfaState", "Lio/elevenlabs/domain/model/MfaState;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MfaServiceImpl implements MfaService {
    private MfaState mfaState;

    @Override // io.elevenlabs.domain.services.MfaService
    public void clearMfaState() {
        this.mfaState = null;
    }

    @Override // io.elevenlabs.domain.services.MfaService
    public Object getMfaState() {
        return this.mfaState;
    }

    @Override // io.elevenlabs.domain.services.MfaService
    public void storeMfaState(Object state) {
        MfaState mfaState;
        state.getClass();
        if (state instanceof MfaState) {
            mfaState = (MfaState) state;
        } else {
            mfaState = null;
        }
        this.mfaState = mfaState;
    }
}

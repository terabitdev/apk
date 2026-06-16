package io.elevenlabs.data.usecase;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/data/usecase/CurrentTimeMillisUseCaseImpl;", "Lio/elevenlabs/data/usecase/CurrentTimeMillisUseCase;", "<init>", "()V", "invoke", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CurrentTimeMillisUseCaseImpl implements CurrentTimeMillisUseCase {
    @Override // io.elevenlabs.data.usecase.CurrentTimeMillisUseCase
    public long invoke() {
        return System.currentTimeMillis();
    }
}

package io.elevenlabs.readerapp.usecase;

import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import ir.i;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/readerapp/usecase/GetCurrentTimeUseCaseImpl;", "Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "<init>", "()V", "Lxq/b;", "interval", "Lir/i;", "Ljava/util/Date;", "invoke-LRDsOJo", "(J)Lir/i;", "invoke", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GetCurrentTimeUseCaseImpl implements GetCurrentTimeUseCase {
    public static final int $stable = 0;

    @Override // io.elevenlabs.domain.usecase.GetCurrentTimeUseCase
    /* renamed from: invoke-LRDsOJo */
    public i mo959invokeLRDsOJo(long interval) {
        return r.j(new GetCurrentTimeUseCaseImpl$invoke$1(interval, null));
    }
}

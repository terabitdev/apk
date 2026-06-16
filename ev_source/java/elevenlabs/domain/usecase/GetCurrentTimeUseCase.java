package io.elevenlabs.domain.usecase;

import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import xq.a;
import xq.b;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "", "Lxq/b;", "interval", "Lir/i;", "Ljava/util/Date;", "invoke-LRDsOJo", "(J)Lir/i;", "invoke", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface GetCurrentTimeUseCase {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: invoke-LRDsOJo$default, reason: not valid java name */
    static /* synthetic */ i m958invokeLRDsOJo$default(GetCurrentTimeUseCase getCurrentTimeUseCase, long j4, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                a aVar = b.f38124b;
                j4 = g.n(1, d.SECONDS);
            }
            return getCurrentTimeUseCase.mo959invokeLRDsOJo(j4);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: invoke-LRDsOJo");
        return null;
    }

    /* renamed from: invoke-LRDsOJo, reason: not valid java name */
    i mo959invokeLRDsOJo(long interval);
}

package io.elevenlabs.data.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.RestAppConfigService", f = "RestAppConfigService.kt", l = {81}, m = "getReportLinks", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestAppConfigService$getReportLinks$1 extends yn.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RestAppConfigService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestAppConfigService$getReportLinks$1(RestAppConfigService restAppConfigService, wn.c<? super RestAppConfigService$getReportLinks$1> cVar) {
        super(cVar);
        this.this$0 = restAppConfigService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getReportLinks(null, this);
    }
}

package io.livekit.android.room.metrics;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.metrics.RTCMetricsManagerKt", f = "RTCMetricsManager.kt", l = {83, 329, 104}, m = "collectSubscriberMetrics")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCMetricsManagerKt$collectSubscriberMetrics$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public RTCMetricsManagerKt$collectSubscriberMetrics$1(wn.c<? super RTCMetricsManagerKt$collectSubscriberMetrics$1> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object collectSubscriberMetrics;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        collectSubscriberMetrics = RTCMetricsManagerKt.collectSubscriberMetrics(null, null, this);
        return collectSubscriberMetrics;
    }
}

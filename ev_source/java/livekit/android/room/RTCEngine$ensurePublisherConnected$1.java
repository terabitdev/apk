package io.livekit.android.room;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine", f = "RTCEngine.kt", l = {802, 803, 817, 820}, m = "ensurePublisherConnected")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCEngine$ensurePublisherConnected$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$ensurePublisherConnected$1(RTCEngine rTCEngine, wn.c<? super RTCEngine$ensurePublisherConnected$1> cVar) {
        super(cVar);
        this.this$0 = rTCEngine;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object ensurePublisherConnected;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ensurePublisherConnected = this.this$0.ensurePublisherConnected(null, this);
        return ensurePublisherConnected;
    }
}

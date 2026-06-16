package io.elevenlabs.data.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.CollectionsServiceImpl", f = "CollectionsServiceImpl.kt", l = {223}, m = "updateCollection", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionsServiceImpl$updateCollection$1 extends yn.c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CollectionsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsServiceImpl$updateCollection$1(CollectionsServiceImpl collectionsServiceImpl, wn.c<? super CollectionsServiceImpl$updateCollection$1> cVar) {
        super(cVar);
        this.this$0 = collectionsServiceImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateCollection(null, null, null, this);
    }
}

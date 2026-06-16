package io.elevenlabs;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ClientToolRegistryBuilder$addTool$1", f = "ClientToolRegistry.kt", l = {208}, m = "execute")
@Metadata(k = 3, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ClientToolRegistryBuilder$addTool$1$execute$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClientToolRegistryBuilder$addTool$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientToolRegistryBuilder$addTool$1$execute$1(ClientToolRegistryBuilder$addTool$1 clientToolRegistryBuilder$addTool$1, wn.c<? super ClientToolRegistryBuilder$addTool$1$execute$1> cVar) {
        super(cVar);
        this.this$0 = clientToolRegistryBuilder$addTool$1;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}

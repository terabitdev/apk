package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.ConnectivityService;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1", f = "ReadsStreamingService.kt", l = {471}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Z"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1 extends yn.i implements p {
    int label;
    final /* synthetic */ StreamingApiChunkFlowFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1(StreamingApiChunkFlowFactory streamingApiChunkFlowFactory, wn.c<? super StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1> cVar) {
        super(2, cVar);
        this.this$0 = streamingApiChunkFlowFactory;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super Boolean> cVar) {
        return ((StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConnectivityService connectivityService;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        connectivityService = this.this$0.connectivityService;
        z1 isConnected = connectivityService.getIsConnected();
        this.label = 1;
        Object w6 = r.w(isConnected, this);
        xn.a aVar = xn.a.f37986a;
        if (w6 == aVar) {
            return aVar;
        }
        return w6;
    }
}

package io.elevenlabs.readerapp.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1$1$1", f = "AgentContextServiceImpl.kt", l = {103}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/ReadMeta;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/ReadMeta;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1$1$1 extends i implements p {
    final /* synthetic */ ReadMeta $read;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AgentContextServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1$1$1(ReadMeta readMeta, AgentContextServiceImpl agentContextServiceImpl, c<? super AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1$1$1> cVar) {
        super(2, cVar);
        this.$read = readMeta;
        this.this$0 = agentContextServiceImpl;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1$1$1(this.$read, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super ReadMeta> cVar) {
        return ((AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadMeta readMeta;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                readMeta = (ReadMeta) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            readMeta = this.$read;
            AgentContextServiceImpl agentContextServiceImpl = this.this$0;
            String readId = readMeta.getReadId();
            this.L$0 = readMeta;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = agentContextServiceImpl.isUltraPricing(readId, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        return readMeta;
    }
}

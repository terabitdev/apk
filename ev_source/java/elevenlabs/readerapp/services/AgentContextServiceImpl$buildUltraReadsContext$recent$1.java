package io.elevenlabs.readerapp.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import ir.r;
import java.util.List;
import kotlin.Metadata;
import sn.l;
import sn.m;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.AgentContextServiceImpl$buildUltraReadsContext$recent$1", f = "AgentContextServiceImpl.kt", l = {85, 89}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "", "Lio/elevenlabs/domain/model/ReadMeta;", "<anonymous>", "(Lfr/d0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AgentContextServiceImpl$buildUltraReadsContext$recent$1 extends i implements p {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AgentContextServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentContextServiceImpl$buildUltraReadsContext$recent$1(AgentContextServiceImpl agentContextServiceImpl, c<? super AgentContextServiceImpl$buildUltraReadsContext$recent$1> cVar) {
        super(2, cVar);
        this.this$0 = agentContextServiceImpl;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        AgentContextServiceImpl$buildUltraReadsContext$recent$1 agentContextServiceImpl$buildUltraReadsContext$recent$1 = new AgentContextServiceImpl$buildUltraReadsContext$recent$1(this.this$0, cVar);
        agentContextServiceImpl$buildUltraReadsContext$recent$1.L$0 = obj;
        return agentContextServiceImpl$buildUltraReadsContext$recent$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super List<ReadMeta>> cVar) {
        return ((AgentContextServiceImpl$buildUltraReadsContext$recent$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r8 == r4) goto L23;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object lVar;
        Logger logger;
        ReadsService readsService;
        int i10;
        int i11 = this.label;
        xn.a aVar = xn.a.f37986a;
        try {
        } catch (Throwable th) {
            lVar = new l(th);
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    sn.a.g(obj);
                    lVar = (List) obj;
                    AgentContextServiceImpl agentContextServiceImpl = this.this$0;
                    Throwable a10 = m.a(lVar);
                    if (a10 != null) {
                        logger = agentContextServiceImpl.logger;
                        logger.logWarning("AgentContextServiceImpl", "library lookup failed: " + a10.getMessage(), a10);
                    }
                    if (lVar instanceof l) {
                        return null;
                    }
                    return lVar;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i10 = this.I$0;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            readsService = this.this$0.readsService;
            Boolean bool = Boolean.FALSE;
            ReadsService.SortBy sortBy = ReadsService.SortBy.AddedAt;
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = readsService.getReads(5, bool, sortBy, this);
            if (obj != aVar) {
                i10 = 0;
            } else {
                return aVar;
            }
        }
        this.L$0 = null;
        this.L$1 = null;
        this.I$0 = i10;
        this.label = 2;
        obj = r.w((ir.i) obj, this);
    }
}

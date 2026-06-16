package io.elevenlabs;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import java.util.Map;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ClientToolRegistry$executeTool$2", f = "ClientToolRegistry.kt", l = {75}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/ClientToolResult;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/ClientToolResult;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class ClientToolRegistry$executeTool$2 extends i implements p {
    final /* synthetic */ Map<String, Object> $parameters;
    final /* synthetic */ ClientTool $tool;
    int label;
    final /* synthetic */ ClientToolRegistry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientToolRegistry$executeTool$2(ClientToolRegistry clientToolRegistry, Map<String, ? extends Object> map, ClientTool clientTool, c<? super ClientToolRegistry$executeTool$2> cVar) {
        super(2, cVar);
        this.this$0 = clientToolRegistry;
        this.$parameters = map;
        this.$tool = clientTool;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ClientToolRegistry$executeTool$2(this.this$0, this.$parameters, this.$tool, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super ClientToolResult> cVar) {
        return ((ClientToolRegistry$executeTool$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
        this.this$0.validateParameters(this.$parameters);
        ClientTool clientTool = this.$tool;
        Map<String, ? extends Object> map = this.$parameters;
        this.label = 1;
        Object execute = clientTool.execute(map, this);
        xn.a aVar = xn.a.f37986a;
        if (execute == aVar) {
            return aVar;
        }
        return execute;
    }
}

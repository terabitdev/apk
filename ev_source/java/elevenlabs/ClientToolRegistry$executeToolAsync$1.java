package io.elevenlabs;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import java.util.Map;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ClientToolRegistry$executeToolAsync$1", f = "ClientToolRegistry.kt", l = {97}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class ClientToolRegistry$executeToolAsync$1 extends i implements p {
    final /* synthetic */ l $callback;
    final /* synthetic */ String $name;
    final /* synthetic */ Map<String, Object> $parameters;
    int label;
    final /* synthetic */ ClientToolRegistry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientToolRegistry$executeToolAsync$1(ClientToolRegistry clientToolRegistry, String str, Map<String, ? extends Object> map, l lVar, c<? super ClientToolRegistry$executeToolAsync$1> cVar) {
        super(2, cVar);
        this.this$0 = clientToolRegistry;
        this.$name = str;
        this.$parameters = map;
        this.$callback = lVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ClientToolRegistry$executeToolAsync$1(this.this$0, this.$name, this.$parameters, this.$callback, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ClientToolRegistry$executeToolAsync$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ClientToolRegistry$executeToolAsync$1 clientToolRegistry$executeToolAsync$1;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                clientToolRegistry$executeToolAsync$1 = this;
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            ClientToolRegistry clientToolRegistry = this.this$0;
            String str = this.$name;
            Map<String, Object> map = this.$parameters;
            this.label = 1;
            clientToolRegistry$executeToolAsync$1 = this;
            obj = ClientToolRegistry.executeTool$default(clientToolRegistry, str, map, 0L, clientToolRegistry$executeToolAsync$1, 4, null);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        ClientToolResult clientToolResult = (ClientToolResult) obj;
        l lVar = clientToolRegistry$executeToolAsync$1.$callback;
        if (lVar != null) {
            lVar.invoke(clientToolResult);
        }
        return z.f31622a;
    }
}

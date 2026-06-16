package io.elevenlabs.network;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import hr.n;
import ir.d;
import ir.j;
import ir.r;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.network.WebSocketConnection$startMessageProcessing$1", f = "WebSocketConnection.kt", l = {223}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class WebSocketConnection$startMessageProcessing$1 extends i implements p {
    int label;
    final /* synthetic */ WebSocketConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketConnection$startMessageProcessing$1(WebSocketConnection webSocketConnection, c<? super WebSocketConnection$startMessageProcessing$1> cVar) {
        super(2, cVar);
        this.this$0 = webSocketConnection;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new WebSocketConnection$startMessageProcessing$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((WebSocketConnection$startMessageProcessing$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            nVar = this.this$0.messageChannel;
            d n2 = r.n(nVar);
            final WebSocketConnection webSocketConnection = this.this$0;
            j jVar = new j() { // from class: io.elevenlabs.network.WebSocketConnection$startMessageProcessing$1.1
                public final Object emit(String str, c<? super z> cVar) {
                    l lVar;
                    lVar = WebSocketConnection.this.messageListener;
                    if (lVar != null) {
                        lVar.invoke(str);
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((String) obj2, (c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = n2.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}

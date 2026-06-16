package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.DispatcherFactory;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$1", f = "ExploreVoicesServiceImpl.kt", l = {73, 77, 78, 78}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir/j;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ExploreVoicesServiceImpl$observeSections$1 extends yn.i implements p {
    final /* synthetic */ p $makeRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ExploreVoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreVoicesServiceImpl$observeSections$1(ExploreVoicesServiceImpl exploreVoicesServiceImpl, p pVar, wn.c<? super ExploreVoicesServiceImpl$observeSections$1> cVar) {
        super(2, cVar);
        this.this$0 = exploreVoicesServiceImpl;
        this.$makeRequest = pVar;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ExploreVoicesServiceImpl$observeSections$1 exploreVoicesServiceImpl$observeSections$1 = new ExploreVoicesServiceImpl$observeSections$1(this.this$0, this.$makeRequest, cVar);
        exploreVoicesServiceImpl$observeSections$1.L$0 = obj;
        return exploreVoicesServiceImpl$observeSections$1;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((ExploreVoicesServiceImpl$observeSections$1) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        if (r0.emit(r10, r9) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (r10 != r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r0.emit(r10, r9) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r10 == r7) goto L27;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DispatcherFactory dispatcherFactory;
        ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            sn.a.g(obj);
                            return z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar = (ir.j) this.L$2;
                    sn.a.g(obj);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                } else {
                    sn.a.g(obj);
                    p pVar = this.$makeRequest;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = jVar;
                    this.label = 3;
                    obj = pVar.invoke("private", this);
                }
            } else {
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            dispatcherFactory = this.this$0.dispatcherFactory;
            fr.z io2 = dispatcherFactory.getIo();
            ExploreVoicesServiceImpl$observeSections$1$cachedResponse$1 exploreVoicesServiceImpl$observeSections$1$cachedResponse$1 = new ExploreVoicesServiceImpl$observeSections$1$cachedResponse$1(this.$makeRequest, null);
            this.L$0 = jVar;
            this.label = 1;
            obj = g0.Q(io2, exploreVoicesServiceImpl$observeSections$1$cachedResponse$1, this);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult instanceof ApiResult.Success) {
            this.L$0 = jVar;
            this.L$1 = null;
            this.label = 2;
        }
        p pVar2 = this.$makeRequest;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = jVar;
        this.label = 3;
        obj = pVar2.invoke("private", this);
    }
}

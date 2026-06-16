package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ExploreVoicesResponse;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$1$cachedResponse$1", f = "ExploreVoicesServiceImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/data/model/ApiResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ExploreVoicesServiceImpl$observeSections$1$cachedResponse$1 extends yn.i implements p {
    final /* synthetic */ p $makeRequest;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreVoicesServiceImpl$observeSections$1$cachedResponse$1(p pVar, wn.c<? super ExploreVoicesServiceImpl$observeSections$1$cachedResponse$1> cVar) {
        super(2, cVar);
        this.$makeRequest = pVar;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ExploreVoicesServiceImpl$observeSections$1$cachedResponse$1(this.$makeRequest, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super ApiResult<ExploreVoicesResponse>> cVar) {
        return ((ExploreVoicesServiceImpl$observeSections$1$cachedResponse$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
        p pVar = this.$makeRequest;
        this.label = 1;
        Object invoke = pVar.invoke("max-stale=3600", this);
        xn.a aVar = xn.a.f37986a;
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}

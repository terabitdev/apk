package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.api.ExploreVoicesApi;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ExploreVoicesResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeReadExploreVoices$1", f = "ExploreVoicesServiceImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse;", "cacheControl", ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreVoicesServiceImpl$observeReadExploreVoices$1 extends yn.i implements p {
    final /* synthetic */ String $readId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ExploreVoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreVoicesServiceImpl$observeReadExploreVoices$1(ExploreVoicesServiceImpl exploreVoicesServiceImpl, String str, wn.c<? super ExploreVoicesServiceImpl$observeReadExploreVoices$1> cVar) {
        super(2, cVar);
        this.this$0 = exploreVoicesServiceImpl;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ExploreVoicesServiceImpl$observeReadExploreVoices$1 exploreVoicesServiceImpl$observeReadExploreVoices$1 = new ExploreVoicesServiceImpl$observeReadExploreVoices$1(this.this$0, this.$readId, cVar);
        exploreVoicesServiceImpl$observeReadExploreVoices$1.L$0 = obj;
        return exploreVoicesServiceImpl$observeReadExploreVoices$1;
    }

    @Override // ho.p
    public final Object invoke(String str, wn.c<? super ApiResult<ExploreVoicesResponse>> cVar) {
        return ((ExploreVoicesServiceImpl$observeReadExploreVoices$1) create(str, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ExploreVoicesApi exploreVoicesApi;
        String str = (String) this.L$0;
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
        exploreVoicesApi = this.this$0.api;
        String str2 = this.$readId;
        this.L$0 = null;
        this.label = 1;
        Object readExploreVoices = exploreVoicesApi.getReadExploreVoices(str2, str, this);
        xn.a aVar = xn.a.f37986a;
        if (readExploreVoices == aVar) {
            return aVar;
        }
        return readExploreVoices;
    }
}

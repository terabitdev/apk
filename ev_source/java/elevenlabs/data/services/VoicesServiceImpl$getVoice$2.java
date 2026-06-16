package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import ho.p;
import io.elevenlabs.data.api.VoicesAPI;
import io.elevenlabs.data.model.ApiResult;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$getVoice$2", f = "VoicesServiceImpl.kt", l = {199, 200, RCHTTPStatusCodes.CREATED, RCHTTPStatusCodes.CREATED}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir/j;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class VoicesServiceImpl$getVoice$2 extends yn.i implements p {
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ VoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicesServiceImpl$getVoice$2(VoicesServiceImpl voicesServiceImpl, String str, wn.c<? super VoicesServiceImpl$getVoice$2> cVar) {
        super(2, cVar);
        this.this$0 = voicesServiceImpl;
        this.$id = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        VoicesServiceImpl$getVoice$2 voicesServiceImpl$getVoice$2 = new VoicesServiceImpl$getVoice$2(this.this$0, this.$id, cVar);
        voicesServiceImpl$getVoice$2.L$0 = obj;
        return voicesServiceImpl$getVoice$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((VoicesServiceImpl$getVoice$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        if (r0.emit(r9, r8) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r9 != r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r0.emit(r9, r8) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r9 == r7) goto L27;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VoicesAPI voicesAPI;
        VoicesAPI voicesAPI2;
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
                    voicesAPI2 = this.this$0.voicesAPI;
                    String str = this.$id;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = jVar;
                    this.label = 3;
                    obj = voicesAPI2.getVoice(str, "private", this);
                }
            } else {
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            voicesAPI = this.this$0.voicesAPI;
            String str2 = this.$id;
            this.L$0 = jVar;
            this.label = 1;
            obj = voicesAPI.getVoice(str2, "max-stale=3600", this);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult instanceof ApiResult.Success) {
            this.L$0 = jVar;
            this.L$1 = null;
            this.label = 2;
        }
        voicesAPI2 = this.this$0.voicesAPI;
        String str3 = this.$id;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = jVar;
        this.label = 3;
        obj = voicesAPI2.getVoice(str3, "private", this);
    }
}

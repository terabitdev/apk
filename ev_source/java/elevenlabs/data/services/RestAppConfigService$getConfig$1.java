package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.model.response.ReaderAppConfigResponseModel;
import io.elevenlabs.domain.model.AppConfig;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.RestAppConfigService$getConfig$1", f = "RestAppConfigService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/domain/model/AppConfig;", "Landroid/content/SharedPreferences;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestAppConfigService$getConfig$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RestAppConfigService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestAppConfigService$getConfig$1(RestAppConfigService restAppConfigService, wn.c<? super RestAppConfigService$getConfig$1> cVar) {
        super(2, cVar);
        this.this$0 = restAppConfigService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        RestAppConfigService$getConfig$1 restAppConfigService$getConfig$1 = new RestAppConfigService$getConfig$1(this.this$0, cVar);
        restAppConfigService$getConfig$1.L$0 = obj;
        return restAppConfigService$getConfig$1;
    }

    @Override // ho.p
    public final Object invoke(SharedPreferences sharedPreferences, wn.c<? super AppConfig> cVar) {
        return ((RestAppConfigService$getConfig$1) create(sharedPreferences, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        String str;
        Object lVar;
        AppConfig domain;
        vr.c cVar;
        if (this.label == 0) {
            sn.a.g(obj);
            sharedPreferences = this.this$0.sharedPreferences;
            str = this.this$0.prefConfig;
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                try {
                    cVar = this.this$0.json;
                    cVar.getClass();
                    lVar = (ReaderAppConfigResponseModel) cVar.b(string, ReaderAppConfigResponseModel.INSTANCE.serializer());
                } catch (Throwable th) {
                    lVar = new sn.l(th);
                }
                if (lVar instanceof sn.l) {
                    lVar = null;
                }
                ReaderAppConfigResponseModel readerAppConfigResponseModel = (ReaderAppConfigResponseModel) lVar;
                if (readerAppConfigResponseModel != null) {
                    domain = this.this$0.toDomain(readerAppConfigResponseModel);
                    return domain;
                }
                return null;
            }
            return null;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

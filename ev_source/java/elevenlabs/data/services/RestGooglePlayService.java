package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.GooglePlayAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.GooglePlayPurchaseReadTokenRequest;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.GooglePlayService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/data/services/RestGooglePlayService;", "Lio/elevenlabs/domain/services/GooglePlayService;", "Lio/elevenlabs/data/api/GooglePlayAPI;", "googlePlayAPI", "<init>", "(Lio/elevenlabs/data/api/GooglePlayAPI;)V", "", "readId", "purchaseToken", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "confirmPurchaseReadToken", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "orderId", "signature", "postPurchaseReadToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/GooglePlayAPI;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestGooglePlayService implements GooglePlayService {
    private final GooglePlayAPI googlePlayAPI;

    public RestGooglePlayService(GooglePlayAPI googlePlayAPI) {
        googlePlayAPI.getClass();
        this.googlePlayAPI = googlePlayAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.GooglePlayService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object confirmPurchaseReadToken(String str, String str2, wn.c<? super AsyncCallResult<z>> cVar) {
        RestGooglePlayService$confirmPurchaseReadToken$1 restGooglePlayService$confirmPurchaseReadToken$1;
        int i10;
        if (cVar instanceof RestGooglePlayService$confirmPurchaseReadToken$1) {
            restGooglePlayService$confirmPurchaseReadToken$1 = (RestGooglePlayService$confirmPurchaseReadToken$1) cVar;
            int i11 = restGooglePlayService$confirmPurchaseReadToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restGooglePlayService$confirmPurchaseReadToken$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restGooglePlayService$confirmPurchaseReadToken$1.result;
                i10 = restGooglePlayService$confirmPurchaseReadToken$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    GooglePlayAPI googlePlayAPI = this.googlePlayAPI;
                    restGooglePlayService$confirmPurchaseReadToken$1.L$0 = null;
                    restGooglePlayService$confirmPurchaseReadToken$1.L$1 = null;
                    restGooglePlayService$confirmPurchaseReadToken$1.label = 1;
                    obj = googlePlayAPI.confirmPurchaseReadToken(str, str2, restGooglePlayService$confirmPurchaseReadToken$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        restGooglePlayService$confirmPurchaseReadToken$1 = new RestGooglePlayService$confirmPurchaseReadToken$1(this, cVar);
        Object obj2 = restGooglePlayService$confirmPurchaseReadToken$1.result;
        i10 = restGooglePlayService$confirmPurchaseReadToken$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.GooglePlayService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postPurchaseReadToken(String str, String str2, String str3, String str4, wn.c<? super AsyncCallResult<z>> cVar) {
        RestGooglePlayService$postPurchaseReadToken$1 restGooglePlayService$postPurchaseReadToken$1;
        int i10;
        if (cVar instanceof RestGooglePlayService$postPurchaseReadToken$1) {
            restGooglePlayService$postPurchaseReadToken$1 = (RestGooglePlayService$postPurchaseReadToken$1) cVar;
            int i11 = restGooglePlayService$postPurchaseReadToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restGooglePlayService$postPurchaseReadToken$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restGooglePlayService$postPurchaseReadToken$1.result;
                i10 = restGooglePlayService$postPurchaseReadToken$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    GooglePlayAPI googlePlayAPI = this.googlePlayAPI;
                    GooglePlayPurchaseReadTokenRequest googlePlayPurchaseReadTokenRequest = new GooglePlayPurchaseReadTokenRequest(str2, str3, str4);
                    restGooglePlayService$postPurchaseReadToken$1.L$0 = null;
                    restGooglePlayService$postPurchaseReadToken$1.L$1 = null;
                    restGooglePlayService$postPurchaseReadToken$1.L$2 = null;
                    restGooglePlayService$postPurchaseReadToken$1.L$3 = null;
                    restGooglePlayService$postPurchaseReadToken$1.label = 1;
                    obj = googlePlayAPI.postPurchaseReadToken(str, googlePlayPurchaseReadTokenRequest, restGooglePlayService$postPurchaseReadToken$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        restGooglePlayService$postPurchaseReadToken$1 = new RestGooglePlayService$postPurchaseReadToken$1(this, cVar);
        Object obj2 = restGooglePlayService$postPurchaseReadToken$1.result;
        i10 = restGooglePlayService$postPurchaseReadToken$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }
}

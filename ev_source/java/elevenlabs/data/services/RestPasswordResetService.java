package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.PasswordResetAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.PasswordResetRequest;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.PasswordResetService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/data/services/RestPasswordResetService;", "Lio/elevenlabs/domain/services/PasswordResetService;", "Lio/elevenlabs/data/api/PasswordResetAPI;", "passwordResetAPI", "<init>", "(Lio/elevenlabs/data/api/PasswordResetAPI;)V", "", "email", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "resetPassword", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/PasswordResetAPI;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestPasswordResetService implements PasswordResetService {
    private final PasswordResetAPI passwordResetAPI;

    public RestPasswordResetService(PasswordResetAPI passwordResetAPI) {
        passwordResetAPI.getClass();
        this.passwordResetAPI = passwordResetAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.PasswordResetService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resetPassword(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        RestPasswordResetService$resetPassword$1 restPasswordResetService$resetPassword$1;
        int i10;
        if (cVar instanceof RestPasswordResetService$resetPassword$1) {
            restPasswordResetService$resetPassword$1 = (RestPasswordResetService$resetPassword$1) cVar;
            int i11 = restPasswordResetService$resetPassword$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restPasswordResetService$resetPassword$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restPasswordResetService$resetPassword$1.result;
                i10 = restPasswordResetService$resetPassword$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    PasswordResetAPI passwordResetAPI = this.passwordResetAPI;
                    PasswordResetRequest passwordResetRequest = new PasswordResetRequest(str);
                    restPasswordResetService$resetPassword$1.L$0 = null;
                    restPasswordResetService$resetPassword$1.label = 1;
                    obj = passwordResetAPI.resetPassword(passwordResetRequest, restPasswordResetService$resetPassword$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        restPasswordResetService$resetPassword$1 = new RestPasswordResetService$resetPassword$1(this, cVar);
        Object obj2 = restPasswordResetService$resetPassword$1.result;
        i10 = restPasswordResetService$resetPassword$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }
}

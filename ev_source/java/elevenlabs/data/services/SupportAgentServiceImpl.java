package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.SupportAgentAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.SupportAgentInitResponse;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.SupportAgentConfig;
import io.elevenlabs.domain.services.SupportAgentService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/data/services/SupportAgentServiceImpl;", "Lio/elevenlabs/domain/services/SupportAgentService;", "Lio/elevenlabs/data/api/SupportAgentAPI;", "supportAgentAPI", "<init>", "(Lio/elevenlabs/data/api/SupportAgentAPI;)V", "Lio/elevenlabs/data/model/response/SupportAgentInitResponse;", "Lio/elevenlabs/domain/model/SupportAgentConfig;", "toDomain", "(Lio/elevenlabs/data/model/response/SupportAgentInitResponse;)Lio/elevenlabs/domain/model/SupportAgentConfig;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "initializeSupportAgent", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/SupportAgentAPI;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SupportAgentServiceImpl implements SupportAgentService {
    private final SupportAgentAPI supportAgentAPI;

    public SupportAgentServiceImpl(SupportAgentAPI supportAgentAPI) {
        supportAgentAPI.getClass();
        this.supportAgentAPI = supportAgentAPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportAgentConfig initializeSupportAgent$lambda$0(SupportAgentServiceImpl supportAgentServiceImpl, SupportAgentInitResponse supportAgentInitResponse) {
        supportAgentInitResponse.getClass();
        return supportAgentServiceImpl.toDomain(supportAgentInitResponse);
    }

    private final SupportAgentConfig toDomain(SupportAgentInitResponse supportAgentInitResponse) {
        return new SupportAgentConfig(supportAgentInitResponse.getSignedUrl(), supportAgentInitResponse.getConversationToken(), supportAgentInitResponse.getAgentId(), supportAgentInitResponse.getWebsocketUrl());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.SupportAgentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initializeSupportAgent(wn.c<? super AsyncCallResult<SupportAgentConfig>> cVar) {
        SupportAgentServiceImpl$initializeSupportAgent$1 supportAgentServiceImpl$initializeSupportAgent$1;
        int i10;
        if (cVar instanceof SupportAgentServiceImpl$initializeSupportAgent$1) {
            supportAgentServiceImpl$initializeSupportAgent$1 = (SupportAgentServiceImpl$initializeSupportAgent$1) cVar;
            int i11 = supportAgentServiceImpl$initializeSupportAgent$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                supportAgentServiceImpl$initializeSupportAgent$1.label = i11 - Integer.MIN_VALUE;
                Object obj = supportAgentServiceImpl$initializeSupportAgent$1.result;
                i10 = supportAgentServiceImpl$initializeSupportAgent$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    SupportAgentAPI supportAgentAPI = this.supportAgentAPI;
                    supportAgentServiceImpl$initializeSupportAgent$1.label = 1;
                    obj = supportAgentAPI.initializeSupportAgent(supportAgentServiceImpl$initializeSupportAgent$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new a(this, 4));
            }
        }
        supportAgentServiceImpl$initializeSupportAgent$1 = new SupportAgentServiceImpl$initializeSupportAgent$1(this, cVar);
        Object obj2 = supportAgentServiceImpl$initializeSupportAgent$1.result;
        i10 = supportAgentServiceImpl$initializeSupportAgent$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new a(this, 4));
    }
}

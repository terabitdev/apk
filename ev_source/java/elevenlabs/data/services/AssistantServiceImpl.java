package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.AssistantAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.AssistantInitRequest;
import io.elevenlabs.data.model.response.AssistantInitResponse;
import io.elevenlabs.domain.model.AssistantConfig;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AssistantService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/data/services/AssistantServiceImpl;", "Lio/elevenlabs/domain/services/AssistantService;", "Lio/elevenlabs/data/api/AssistantAPI;", "assistantAPI", "<init>", "(Lio/elevenlabs/data/api/AssistantAPI;)V", "Lio/elevenlabs/data/model/response/AssistantInitResponse;", "Lio/elevenlabs/domain/model/AssistantConfig;", "toDomain", "(Lio/elevenlabs/data/model/response/AssistantInitResponse;)Lio/elevenlabs/domain/model/AssistantConfig;", "", "readId", "", "position", "voiceId", "Lio/elevenlabs/domain/model/AsyncCallResult;", "initializeAssistant", "(Ljava/lang/String;JLjava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/AssistantAPI;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AssistantServiceImpl implements AssistantService {
    private final AssistantAPI assistantAPI;

    public AssistantServiceImpl(AssistantAPI assistantAPI) {
        assistantAPI.getClass();
        this.assistantAPI = assistantAPI;
    }

    public static /* synthetic */ AssistantConfig a(AssistantServiceImpl assistantServiceImpl, AssistantInitResponse assistantInitResponse) {
        return initializeAssistant$lambda$0(assistantServiceImpl, assistantInitResponse);
    }

    public static final AssistantConfig initializeAssistant$lambda$0(AssistantServiceImpl assistantServiceImpl, AssistantInitResponse assistantInitResponse) {
        assistantInitResponse.getClass();
        return assistantServiceImpl.toDomain(assistantInitResponse);
    }

    private final AssistantConfig toDomain(AssistantInitResponse assistantInitResponse) {
        return new AssistantConfig(assistantInitResponse.getPromptSuggestions(), assistantInitResponse.getConversationToken(), assistantInitResponse.getUserId(), assistantInitResponse.getVoiceId(), assistantInitResponse.getFirstMessage(), assistantInitResponse.getLanguage(), assistantInitResponse.getDynamicVariables(), assistantInitResponse.getApiEndpoint(), assistantInitResponse.getWebsocketUrl());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.AssistantService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initializeAssistant(String str, long j4, String str2, wn.c<? super AsyncCallResult<AssistantConfig>> cVar) {
        AssistantServiceImpl$initializeAssistant$1 assistantServiceImpl$initializeAssistant$1;
        int i10;
        if (cVar instanceof AssistantServiceImpl$initializeAssistant$1) {
            assistantServiceImpl$initializeAssistant$1 = (AssistantServiceImpl$initializeAssistant$1) cVar;
            int i11 = assistantServiceImpl$initializeAssistant$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assistantServiceImpl$initializeAssistant$1.label = i11 - Integer.MIN_VALUE;
                Object obj = assistantServiceImpl$initializeAssistant$1.result;
                i10 = assistantServiceImpl$initializeAssistant$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    AssistantInitRequest assistantInitRequest = new AssistantInitRequest(str, j4, str2);
                    AssistantAPI assistantAPI = this.assistantAPI;
                    assistantServiceImpl$initializeAssistant$1.L$0 = null;
                    assistantServiceImpl$initializeAssistant$1.L$1 = null;
                    assistantServiceImpl$initializeAssistant$1.L$2 = null;
                    assistantServiceImpl$initializeAssistant$1.J$0 = j4;
                    assistantServiceImpl$initializeAssistant$1.label = 1;
                    obj = assistantAPI.initializeAssistant(assistantInitRequest, assistantServiceImpl$initializeAssistant$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new a(this, 0));
            }
        }
        assistantServiceImpl$initializeAssistant$1 = new AssistantServiceImpl$initializeAssistant$1(this, cVar);
        Object obj2 = assistantServiceImpl$initializeAssistant$1.result;
        i10 = assistantServiceImpl$initializeAssistant$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new a(this, 0));
    }
}

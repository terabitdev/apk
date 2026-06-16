package io.elevenlabs.domain.usecase;

import a9.a;
import io.elevenlabs.domain.model.AsyncCallResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦\u0002¢\u0006\u0002\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "", "invoke", "", "asyncCallResult", "Lio/elevenlabs/domain/model/AsyncCallResult$Error;", "unknownErrorMessage", "", "(Lio/elevenlabs/domain/model/AsyncCallResult$Error;Ljava/lang/Integer;)Ljava/lang/String;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ResolveErrorMessageUseCase {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ String invoke$default(ResolveErrorMessageUseCase resolveErrorMessageUseCase, AsyncCallResult.Error error, Integer num, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            return resolveErrorMessageUseCase.invoke(error, num);
        }
        a.y("Super calls with default arguments not supported in this target, function: invoke");
        return null;
    }

    String invoke(AsyncCallResult.Error<?> asyncCallResult, Integer unknownErrorMessage);
}

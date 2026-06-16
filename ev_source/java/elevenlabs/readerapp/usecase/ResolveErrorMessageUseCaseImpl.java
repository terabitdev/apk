package io.elevenlabs.readerapp.usecase;

import com.google.protobuf.c6;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/readerapp/usecase/ResolveErrorMessageUseCaseImpl;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "stringProvider", "Lio/elevenlabs/domain/StringProvider;", "<init>", "(Lio/elevenlabs/domain/StringProvider;)V", "invoke", "", "asyncCallResult", "Lio/elevenlabs/domain/model/AsyncCallResult$Error;", "unknownErrorMessage", "", "(Lio/elevenlabs/domain/model/AsyncCallResult$Error;Ljava/lang/Integer;)Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ResolveErrorMessageUseCaseImpl implements ResolveErrorMessageUseCase {
    public static final int $stable = 8;
    private final StringProvider stringProvider;

    public ResolveErrorMessageUseCaseImpl(StringProvider stringProvider) {
        stringProvider.getClass();
        this.stringProvider = stringProvider;
    }

    @Override // io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase
    public String invoke(AsyncCallResult.Error<?> asyncCallResult, Integer unknownErrorMessage) {
        int i10;
        asyncCallResult.getClass();
        AsyncCallResult.AsyncCallError error = asyncCallResult.getError();
        if (error instanceof AsyncCallResult.AsyncCallError.ApiError) {
            String message = ((AsyncCallResult.AsyncCallError.ApiError) error).getMessage();
            if (message == null) {
                StringProvider stringProvider = this.stringProvider;
                if (unknownErrorMessage != null) {
                    i10 = unknownErrorMessage.intValue();
                } else {
                    i10 = R.string.error_network_error;
                }
                return stringProvider.invoke(i10);
            }
            return message;
        }
        if (error instanceof AsyncCallResult.AsyncCallError.NetworkError) {
            return this.stringProvider.invoke(R.string.error_network_error);
        }
        if (error instanceof AsyncCallResult.AsyncCallError.UnknownError) {
            return this.stringProvider.invoke(R.string.error_unknown_error);
        }
        c6.p();
        return null;
    }
}

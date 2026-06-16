package io.elevenlabs.data.extensions;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.l;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import qr.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {TokenNames.T, "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "toDomain", "(Lio/elevenlabs/data/model/ApiResult;)Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/data/model/ApiResult$Error$ApiError;", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "decodeDataOrNull", "(Lio/elevenlabs/data/model/ApiResult$Error$ApiError;Lvr/c;Lio/elevenlabs/domain/Logger;)Ljava/lang/Object;", TokenNames.R, "Lkotlin/Function1;", "transform", "map", "(Lio/elevenlabs/domain/model/AsyncCallResult;Lho/l;)Lio/elevenlabs/domain/model/AsyncCallResult;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ApiResultExtensionKt {
    public static final <T> T decodeDataOrNull(ApiResult.Error.ApiError<?> apiError, vr.c cVar, Logger logger) {
        apiError.getClass();
        cVar.getClass();
        try {
            if (apiError.getData() == null) {
                return null;
            }
            m.h();
            throw null;
        } catch (h unused) {
            if (logger == null) {
                return null;
            }
            m.h();
            throw null;
        }
    }

    public static Object decodeDataOrNull$default(ApiResult.Error.ApiError apiError, vr.c cVar, Logger logger, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logger = null;
        }
        apiError.getClass();
        cVar.getClass();
        try {
            if (apiError.getData() == null) {
                return null;
            }
            m.h();
            throw null;
        } catch (h unused) {
            if (logger == null) {
                return null;
            }
            m.h();
            throw null;
        }
    }

    public static final <T, R> AsyncCallResult<R> map(AsyncCallResult<T> asyncCallResult, l lVar) {
        asyncCallResult.getClass();
        lVar.getClass();
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            return new AsyncCallResult.Success(lVar.invoke(((AsyncCallResult.Success) asyncCallResult).getData()));
        }
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            AsyncCallResult.AsyncCallError error = ((AsyncCallResult.Error) asyncCallResult).getError();
            if (error instanceof AsyncCallResult.AsyncCallError.ApiError) {
                AsyncCallResult.AsyncCallError.ApiError apiError = (AsyncCallResult.AsyncCallError.ApiError) error;
                return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError(apiError.getCode(), apiError.getMessage()));
            }
            if (error instanceof AsyncCallResult.AsyncCallError.NetworkError) {
                return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
            }
            if (error instanceof AsyncCallResult.AsyncCallError.UnknownError) {
                return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.UnknownError(((AsyncCallResult.AsyncCallError.UnknownError) error).getMessage()));
            }
            c6.p();
            return null;
        }
        c6.p();
        return null;
    }

    public static final <T> AsyncCallResult<T> toDomain(ApiResult<T> apiResult) {
        apiResult.getClass();
        if (apiResult instanceof ApiResult.Success) {
            return new AsyncCallResult.Success(((ApiResult.Success) apiResult).getData());
        }
        if (apiResult instanceof ApiResult.Error.ApiError) {
            ApiResult.Error.ApiError apiError = (ApiResult.Error.ApiError) apiResult;
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError(apiError.getCode(), apiError.getMessage()));
        }
        if (apiResult instanceof ApiResult.Error.NetworkError) {
            return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
        }
        if (apiResult instanceof ApiResult.Error.UnknownError) {
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.UnknownError(((ApiResult.Error.UnknownError) apiResult).getMessage()));
        }
        c6.p();
        return null;
    }
}

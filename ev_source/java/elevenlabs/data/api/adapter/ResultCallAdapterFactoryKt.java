package io.elevenlabs.data.api.adapter;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.room.m0;
import ct.b;
import ct.f;
import ct.g;
import ct.n;
import ct.o;
import ct.p;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.Logger;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Request;
import okhttp3.ResponseBody;
import oo.d;
import qr.h;
import vr.c;
import zs.p0;
import zs.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aI\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", TokenNames.T, "Lokhttp3/Request;", "Loo/d;", "annotationClass", "getAnnotation", "(Lokhttp3/Request;Loo/d;)Ljava/lang/annotation/Annotation;", "request", "Lzs/p0;", "response", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "", ParameterNames.TAG, "Lio/elevenlabs/data/model/ApiResult$Error;", "adaptResponseBody", "(Lokhttp3/Request;Lzs/p0;Lvr/c;Lio/elevenlabs/domain/Logger;Ljava/lang/String;)Lio/elevenlabs/data/model/ApiResult$Error;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ResultCallAdapterFactoryKt {
    public static final /* synthetic */ ApiResult.Error access$adaptResponseBody(Request request, p0 p0Var, c cVar, Logger logger, String str) {
        return adaptResponseBody(request, p0Var, cVar, logger, str);
    }

    public static final <T> ApiResult.Error<T> adaptResponseBody(Request request, p0<T> p0Var, c cVar, Logger logger, String str) {
        Logger logger2;
        String str2;
        IllegalArgumentException illegalArgumentException;
        ResponseBody responseBody;
        String E;
        h hVar;
        ResponseBody responseBody2;
        String E2;
        String E3;
        ApiError apiError;
        String str3 = "";
        try {
            ResponseBody responseBody3 = p0Var.f39811c;
            if (responseBody3 != null) {
                try {
                    E3 = responseBody3.E();
                } catch (h e10) {
                    hVar = e10;
                    logger2 = logger;
                    str2 = str;
                    logger2.logWarning(str2, "API unknown error " + adaptResponseBody$formatLog(request, p0Var), hVar);
                    responseBody2 = p0Var.f39811c;
                    if (responseBody2 != null && (E2 = responseBody2.E()) != null) {
                        str3 = E2;
                    }
                    return new ApiResult.Error.UnknownError(str3);
                } catch (IllegalArgumentException e11) {
                    illegalArgumentException = e11;
                    logger2 = logger;
                    str2 = str;
                    logger2.logWarning(str2, "API unknown error " + adaptResponseBody$formatLog(request, p0Var), illegalArgumentException);
                    responseBody = p0Var.f39811c;
                    if (responseBody != null && (E = responseBody.E()) != null) {
                        str3 = E;
                    }
                    return new ApiResult.Error.UnknownError(str3);
                }
            } else {
                E3 = null;
            }
            if (E3 == null) {
                E3 = "";
            }
            cVar.getClass();
            apiError = (ApiError) cVar.b(E3, ApiError.INSTANCE.serializer());
            logger2 = logger;
            str2 = str;
        } catch (h e12) {
            e = e12;
            logger2 = logger;
            str2 = str;
        } catch (IllegalArgumentException e13) {
            e = e13;
            logger2 = logger;
            str2 = str;
        }
        try {
            Logger.logWarning$default(logger2, str2, "API error " + adaptResponseBody$formatLog(request, p0Var), null, 4, null);
            return new ApiResult.Error.ApiError(apiError.getDetail().getStatus(), apiError.getDetail().getMessage(), apiError.getDetail().getData(), p0Var.f39809a.f25426d);
        } catch (h e14) {
            e = e14;
            hVar = e;
            logger2.logWarning(str2, "API unknown error " + adaptResponseBody$formatLog(request, p0Var), hVar);
            responseBody2 = p0Var.f39811c;
            if (responseBody2 != null) {
                str3 = E2;
            }
            return new ApiResult.Error.UnknownError(str3);
        } catch (IllegalArgumentException e15) {
            e = e15;
            illegalArgumentException = e;
            logger2.logWarning(str2, "API unknown error " + adaptResponseBody$formatLog(request, p0Var), illegalArgumentException);
            responseBody = p0Var.f39811c;
            if (responseBody != null) {
                str3 = E;
            }
            return new ApiResult.Error.UnknownError(str3);
        }
    }

    private static final <T> String adaptResponseBody$formatLog(Request request, p0<T> p0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        f0 f0Var = e0.f20562a;
        b bVar = (b) getAnnotation(request, f0Var.b(b.class));
        String str6 = null;
        if (bVar != null) {
            str = bVar.value();
        } else {
            str = null;
        }
        f fVar = (f) getAnnotation(request, f0Var.b(f.class));
        if (fVar != null) {
            str2 = fVar.value();
        } else {
            str2 = null;
        }
        g gVar = (g) getAnnotation(request, f0Var.b(g.class));
        if (gVar != null) {
            str3 = gVar.value();
        } else {
            str3 = null;
        }
        o oVar = (o) getAnnotation(request, f0Var.b(o.class));
        if (oVar != null) {
            str4 = oVar.value();
        } else {
            str4 = null;
        }
        p pVar = (p) getAnnotation(request, f0Var.b(p.class));
        if (pVar != null) {
            str5 = pVar.value();
        } else {
            str5 = null;
        }
        n nVar = (n) getAnnotation(request, f0Var.b(n.class));
        if (nVar != null) {
            str6 = nVar.value();
        }
        List F0 = tn.n.F0(new String[]{str, str2, str3, str4, str5, str6});
        return request.f25400b + Separators.SP + F0 + " (" + p0Var.f39809a.f25426d + Separators.RPAREN;
    }

    private static final <T extends Annotation> T getAnnotation(Request request, d dVar) {
        request.getClass();
        d b10 = e0.f20562a.b(t.class);
        t tVar = (t) m0.H(b10).cast(request.f25403e.a(b10));
        if (tVar != null) {
            return (T) tVar.f39836c.getAnnotation(m0.H(dVar));
        }
        return null;
    }
}

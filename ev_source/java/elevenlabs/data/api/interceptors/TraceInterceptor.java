package io.elevenlabs.data.api.interceptors;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/elevenlabs/data/api/interceptors/TraceInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lio/elevenlabs/domain/Logger;", "<init>", "(Lio/elevenlabs/domain/Logger;)V", "intercept", "Lokhttp3/Response;", ReferencesHeader.CHAIN, "Lokhttp3/Interceptor$Chain;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TraceInterceptor implements Interceptor {
    private final Logger logger;

    public TraceInterceptor(Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        try {
            Response a10 = chain.a(request);
            this.logger.log("http-trace", Response.h("x-trace-id", a10) + " - " + request.f25400b + Separators.SP + request.f25399a + " (" + a10.f25426d + Separators.RPAREN);
            return a10;
        } catch (Throwable th) {
            this.logger.log("http-trace", request.f25400b + Separators.SP + request.f25399a + " FAILED: " + th.getClass().getSimpleName());
            throw th;
        }
    }
}

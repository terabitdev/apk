package io.elevenlabs.data.api.interceptors;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/api/interceptors/CacheInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", ReferencesHeader.CHAIN, "Lokhttp3/Interceptor$Chain;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CacheInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        Request request2 = chain.request();
        request2.getClass();
        String b10 = request2.f25401c.b("Cache-Control");
        if (b10 == null) {
            return chain.a(request);
        }
        Response.Builder n2 = chain.a(request).n();
        Headers.Builder builder = n2.f25437f;
        builder.getClass();
        _HeadersCommonKt.b("Cache-Control");
        _HeadersCommonKt.c(b10, "Cache-Control");
        builder.f("Cache-Control");
        _HeadersCommonKt.a(builder, "Cache-Control", b10);
        return n2.a();
    }
}

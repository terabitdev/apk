package io.elevenlabs.data.api.interceptors;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import fr.g0;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.AuthTokenService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Interceptor;
import okhttp3.Response;
import vr.c;
import wn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/data/api/interceptors/AuthorizationInterceptor;", "Lokhttp3/Interceptor;", "Lio/elevenlabs/domain/services/AuthTokenService;", "authTokenService", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/Logger;", "logger", "Lvr/c;", "json", "<init>", "(Lio/elevenlabs/domain/services/AuthTokenService;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/Logger;Lvr/c;)V", "Lokhttp3/Interceptor$Chain;", ReferencesHeader.CHAIN, "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lio/elevenlabs/domain/services/AuthTokenService;", "Lio/elevenlabs/domain/services/AuthService;", "Lio/elevenlabs/domain/Logger;", "Lvr/c;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthorizationInterceptor implements Interceptor {
    private static final String TAG = "AuthorizationInterceptor";
    private final AuthService authService;
    private final AuthTokenService authTokenService;
    private final c json;
    private final Logger logger;

    public AuthorizationInterceptor(AuthTokenService authTokenService, AuthService authService, Logger logger, c cVar) {
        authTokenService.getClass();
        authService.getClass();
        logger.getClass();
        cVar.getClass();
        this.authTokenService = authTokenService;
        this.authService = authService;
        this.logger = logger;
        this.json = cVar;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        return (Response) g0.I(i.f37087a, new AuthorizationInterceptor$intercept$1(this, chain, null));
    }
}

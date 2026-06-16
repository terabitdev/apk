package io.elevenlabs.data.api.interceptors;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.perf.FirebasePerformance;
import ib.i;
import io.elevenlabs.domain.Logger;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import xq.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/data/api/interceptors/RetryInterceptor;", "Lokhttp3/Interceptor;", "", "maxRetries", "Lxq/b;", "initialBackoff", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(IJLio/elevenlabs/domain/Logger;Lkotlin/jvm/internal/f;)V", "Lokhttp3/Interceptor$Chain;", ReferencesHeader.CHAIN, "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", TokenNames.I, "J", "Lio/elevenlabs/domain/Logger;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RetryInterceptor implements Interceptor {
    private final long initialBackoff;
    private final Logger logger;
    private final int maxRetries;

    private RetryInterceptor(int i10, long j4, Logger logger) {
        logger.getClass();
        this.maxRetries = i10;
        this.initialBackoff = j4;
        this.logger = logger;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response a10;
        int i10;
        chain.getClass();
        Request f25665e = chain.getF25665e();
        long j4 = this.initialBackoff;
        if (!m.c(f25665e.f25400b, FirebasePerformance.HttpMethod.GET)) {
            return chain.a(f25665e);
        }
        int i11 = this.maxRetries - 1;
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                a10 = chain.a(f25665e);
            } catch (IOException e10) {
                i.r("IOException - ", e10.getMessage(), this.logger, "RetryInterceptor");
            }
            if (!a10.F0 && 408 <= (i10 = a10.f25426d) && i10 < 505) {
                _UtilCommonKt.b(a10);
                try {
                    Thread.sleep(b.d(j4));
                    j4 = b.h(2, j4);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted while retrying", e11);
                }
            } else {
                return a10;
            }
        }
        return chain.a(f25665e);
    }

    public /* synthetic */ RetryInterceptor(int i10, long j4, Logger logger, f fVar) {
        this(i10, j4, logger);
    }
}

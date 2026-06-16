package io.elevenlabs.player.di;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/player/di/DrmNetworkModule;", "", "<init>", "()V", "provideDrmOkHttpClient", "Lokhttp3/OkHttpClient;", "okHttpClient", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DrmNetworkModule {
    public static final DrmNetworkModule INSTANCE = new DrmNetworkModule();

    private DrmNetworkModule() {
    }

    public final OkHttpClient provideDrmOkHttpClient(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        OkHttpClient.Builder c5 = okHttpClient.c();
        c5.f25369d.add(new Interceptor() { // from class: io.elevenlabs.player.di.DrmNetworkModule$provideDrmOkHttpClient$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                chain.getClass();
                Request.Builder b10 = chain.request().b();
                b10.f25407c.f(SIPHeaderNames.AUTHORIZATION);
                return chain.a(new Request(b10));
            }
        });
        return new OkHttpClient(c5);
    }
}

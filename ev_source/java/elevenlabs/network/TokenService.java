package io.elevenlabs.network;

import com.google.gson.a;
import fr.g0;
import fr.r0;
import io.elevenlabs.readerapp.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import mr.d;
import mr.e;
import okhttp3.OkHttpClient;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/network/TokenService;", "", "", "baseUrl", "Lokhttp3/OkHttpClient;", "httpClient", "Lcom/google/gson/a;", "gson", "<init>", "(Ljava/lang/String;Lokhttp3/OkHttpClient;Lcom/google/gson/a;)V", "agentId", "source", "version", "environment", "buildTokenUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lio/elevenlabs/network/TokenResponse;", "fetchPublicAgentToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Ljava/lang/String;", "Lokhttp3/OkHttpClient;", "Lcom/google/gson/a;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TokenService {
    private final String baseUrl;
    private final a gson;
    private final OkHttpClient httpClient;

    public /* synthetic */ TokenService(String str, OkHttpClient okHttpClient, a aVar, int i10, f fVar) {
        this((i10 & 1) != 0 ? BuildConfig.API_URL : str, (i10 & 2) != 0 ? new OkHttpClient() : okHttpClient, (i10 & 4) != 0 ? new a() : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildTokenUrl(String agentId, String source, String version, String environment) {
        String str = this.baseUrl;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/v1/convai/conversation/token?agent_id=");
        sb.append(agentId);
        sb.append("&source=");
        sb.append(source);
        String l4 = defpackage.f.l("&version=", version, sb);
        if (environment != null) {
            return ((Object) l4) + "&environment=" + environment;
        }
        return l4;
    }

    public static /* synthetic */ String buildTokenUrl$default(TokenService tokenService, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        return tokenService.buildTokenUrl(str, str2, str3, str4);
    }

    public static /* synthetic */ Object fetchPublicAgentToken$default(TokenService tokenService, String str, String str2, String str3, String str4, c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        return tokenService.fetchPublicAgentToken(str, str2, str3, str4, cVar);
    }

    public final Object fetchPublicAgentToken(String str, String str2, String str3, String str4, c<? super TokenResponse> cVar) {
        e eVar = r0.f9888a;
        return g0.Q(d.f23445b, new TokenService$fetchPublicAgentToken$2(this, str, str2, str3, str4, null), cVar);
    }

    public TokenService(String str, OkHttpClient okHttpClient, a aVar) {
        str.getClass();
        okHttpClient.getClass();
        aVar.getClass();
        this.baseUrl = str;
        this.httpClient = okHttpClient;
        this.gson = aVar;
    }

    public TokenService() {
        this(null, null, null, 7, null);
    }
}

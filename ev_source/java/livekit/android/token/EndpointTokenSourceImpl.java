package io.livekit.android.token;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.livekit.android.token.EndpointTokenSource;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/token/EndpointTokenSourceImpl;", "Lio/livekit/android/token/EndpointTokenSource;", "url", "Ljava/net/URL;", FirebaseAnalytics.Param.METHOD, "", "headers", "", "(Ljava/net/URL;Ljava/lang/String;Ljava/util/Map;)V", "getHeaders", "()Ljava/util/Map;", "getMethod", "()Ljava/lang/String;", "getUrl", "()Ljava/net/URL;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EndpointTokenSourceImpl implements EndpointTokenSource {
    private final Map<String, String> headers;
    private final String method;
    private final URL url;

    public EndpointTokenSourceImpl(URL url, String str, Map<String, String> map) {
        url.getClass();
        str.getClass();
        map.getClass();
        this.url = url;
        this.method = str;
        this.headers = map;
    }

    @Override // io.livekit.android.token.EndpointTokenSource, io.livekit.android.token.ConfigurableTokenSource
    public Object fetch(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar) {
        return EndpointTokenSource.DefaultImpls.fetch(this, tokenRequestOptions, cVar);
    }

    @Override // io.livekit.android.token.EndpointTokenSource
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // io.livekit.android.token.EndpointTokenSource
    public String getMethod() {
        return this.method;
    }

    @Override // io.livekit.android.token.EndpointTokenSource
    public URL getUrl() {
        return this.url;
    }
}

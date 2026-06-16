package io.livekit.android.token;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import androidx.room.m0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import fr.l;
import fr.n;
import gg.b;
import io.livekit.android.dagger.WebModuleKt;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import vr.p;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/livekit/android/token/EndpointTokenSource;", "Lio/livekit/android/token/ConfigurableTokenSource;", "Lio/livekit/android/token/TokenRequestOptions;", "options", "Lio/livekit/android/token/TokenSourceResponse;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lio/livekit/android/token/TokenRequestOptions;Lwn/c;)Ljava/lang/Object;", "Ljava/net/URL;", "getUrl", "()Ljava/net/URL;", "url", "", "getMethod", "()Ljava/lang/String;", FirebaseAnalytics.Param.METHOD, "", "getHeaders", "()Ljava/util/Map;", "headers", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface EndpointTokenSource extends ConfigurableTokenSource {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static Object fetch(EndpointTokenSource endpointTokenSource, TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar) {
            final n nVar = new n(1, b.V(cVar));
            nVar.t();
            try {
                OkHttpClient globalOkHttpClient = WebModuleKt.getGlobalOkHttpClient();
                final p b10 = m0.b(EndpointTokenSource$fetch$2$snakeCaseJson$1.INSTANCE);
                final p b11 = m0.b(EndpointTokenSource$fetch$2$camelCaseJson$1.INSTANCE);
                String d10 = b10.d(TokenSourceRequest.INSTANCE.serializer(), TokenSourceKt.toRequest(tokenRequestOptions));
                Request.Builder builder = new Request.Builder();
                URL url = endpointTokenSource.getUrl();
                url.getClass();
                String url2 = url.toString();
                url2.getClass();
                builder.f25405a = HttpUrl.Companion.c(url2);
                String method = endpointTokenSource.getMethod();
                RequestBody.INSTANCE.getClass();
                builder.d(method, RequestBody.Companion.a(d10, null));
                builder.a(SIPHeaderNames.CONTENT_TYPE, "application/json");
                for (Map.Entry<String, String> entry : endpointTokenSource.getHeaders().entrySet()) {
                    builder.a(entry.getKey(), entry.getValue());
                }
                Request request = new Request(builder);
                globalOkHttpClient.getClass();
                FirebasePerfOkHttpClient.enqueue(new RealCall(globalOkHttpClient, request, false), new Callback() { // from class: io.livekit.android.token.EndpointTokenSource$fetch$2$1
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException e10) {
                        call.getClass();
                        e10.getClass();
                        l.this.resumeWith(new sn.l(e10));
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) {
                        String str;
                        call.getClass();
                        response.getClass();
                        ResponseBody responseBody = response.Y;
                        TokenSourceResponse tokenSourceResponse = null;
                        if (responseBody != null) {
                            str = responseBody.E();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            l.this.resumeWith(new sn.l(new NullPointerException("No response returned from server")));
                            return;
                        }
                        try {
                            vr.c cVar2 = b10;
                            cVar2.getClass();
                            tokenSourceResponse = (TokenSourceResponse) cVar2.b(str, TokenSourceResponse.INSTANCE.serializer());
                        } catch (Exception unused) {
                        }
                        if (tokenSourceResponse == null) {
                            try {
                                vr.c cVar3 = b11;
                                cVar3.getClass();
                                tokenSourceResponse = (TokenSourceResponse) cVar3.b(str, TokenSourceResponse.INSTANCE.serializer());
                            } catch (Exception e10) {
                                l.this.resumeWith(new sn.l(new IllegalArgumentException("Failed to decode response from token server", e10)));
                                return;
                            }
                        }
                        l.this.resumeWith(tokenSourceResponse);
                    }
                });
            } catch (Exception e10) {
                nVar.resumeWith(new sn.l(e10));
            }
            return nVar.s();
        }

        public static String getMethod(EndpointTokenSource endpointTokenSource) {
            return FirebasePerformance.HttpMethod.POST;
        }
    }

    @Override // io.livekit.android.token.ConfigurableTokenSource
    Object fetch(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar);

    Map<String, String> getHeaders();

    String getMethod();

    URL getUrl();
}

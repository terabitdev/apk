package io.elevenlabs.network;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.a;
import com.google.gson.internal.d;
import com.google.protobuf.c6;
import defpackage.f;
import fr.d0;
import ho.p;
import java.io.IOException;
import java.io.StringReader;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.network.TokenService$fetchPublicAgentToken$2", f = "TokenService.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/network/TokenResponse;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/network/TokenResponse;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class TokenService$fetchPublicAgentToken$2 extends i implements p {
    final /* synthetic */ String $agentId;
    final /* synthetic */ String $environment;
    final /* synthetic */ String $source;
    final /* synthetic */ String $version;
    int label;
    final /* synthetic */ TokenService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenService$fetchPublicAgentToken$2(TokenService tokenService, String str, String str2, String str3, String str4, c<? super TokenService$fetchPublicAgentToken$2> cVar) {
        super(2, cVar);
        this.this$0 = tokenService;
        this.$agentId = str;
        this.$source = str2;
        this.$version = str3;
        this.$environment = str4;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new TokenService$fetchPublicAgentToken$2(this.this$0, this.$agentId, this.$source, this.$version, this.$environment, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super TokenResponse> cVar) {
        return ((TokenService$fetchPublicAgentToken$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String buildTokenUrl;
        OkHttpClient okHttpClient;
        String E;
        a aVar;
        String str;
        if (this.label == 0) {
            sn.a.g(obj);
            buildTokenUrl = this.this$0.buildTokenUrl(this.$agentId, this.$source, this.$version, this.$environment);
            Request.Builder builder = new Request.Builder();
            builder.f(buildTokenUrl);
            builder.a(SIPHeaderNames.ACCEPT, "application/json");
            builder.d(FirebasePerformance.HttpMethod.GET, null);
            Request request = new Request(builder);
            try {
                okHttpClient = this.this$0.httpClient;
                okHttpClient.getClass();
                Response execute = FirebasePerfOkHttpClient.execute(new RealCall(okHttpClient, request, false));
                boolean z6 = execute.F0;
                ResponseBody responseBody = execute.Y;
                if (!z6) {
                    if (responseBody != null) {
                        str = responseBody.E();
                        if (str == null) {
                        }
                        throw new TokenServiceException("Failed to fetch public agent token: HTTP " + execute.f25426d + " - " + str, null, 2, null);
                    }
                    str = "Unknown error";
                    throw new TokenServiceException("Failed to fetch public agent token: HTTP " + execute.f25426d + " - " + str, null, 2, null);
                }
                if (responseBody != null && (E = responseBody.E()) != null) {
                    try {
                        aVar = this.this$0.gson;
                        aVar.getClass();
                        TokenResponse tokenResponse = (TokenResponse) d.l(TokenResponse.class).cast(aVar.f(new StringReader(E), zi.a.get(TokenResponse.class)));
                        if (tokenResponse != null) {
                            return tokenResponse;
                        }
                        throw new TokenServiceException("Failed to parse token response", null, 2, null);
                    } catch (Exception e10) {
                        throw new TokenServiceException("Failed to parse token response: " + e10.getMessage(), e10);
                    }
                }
                throw new TokenServiceException("Empty response body", null, 2, null);
            } catch (IOException e11) {
                throw new TokenServiceException(f.i("Network error: ", e11.getMessage()), e11);
            }
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

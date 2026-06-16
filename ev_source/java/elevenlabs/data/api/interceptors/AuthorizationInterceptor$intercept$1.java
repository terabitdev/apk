package io.elevenlabs.data.api.interceptors;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import fr.d0;
import fr.e2;
import ho.p;
import io.elevenlabs.data.api.adapter.ApiError;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.AuthTokenService;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.b;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import sn.z;
import wn.c;
import wq.l;
import wq.n;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.api.interceptors.AuthorizationInterceptor$intercept$1", f = "AuthorizationInterceptor.kt", l = {24}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lokhttp3/Response;", "<anonymous>", "(Lfr/d0;)Lokhttp3/Response;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AuthorizationInterceptor$intercept$1 extends i implements p {
    final /* synthetic */ Interceptor.Chain $chain;
    int label;
    final /* synthetic */ AuthorizationInterceptor this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.data.api.interceptors.AuthorizationInterceptor$intercept$1$1", f = "AuthorizationInterceptor.kt", l = {26, 29}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lokhttp3/Response;", "<anonymous>", "(Lfr/d0;)Lokhttp3/Response;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.api.interceptors.AuthorizationInterceptor$intercept$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Interceptor.Chain $chain;
        Object L$0;
        int label;
        final /* synthetic */ AuthorizationInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuthorizationInterceptor authorizationInterceptor, Interceptor.Chain chain, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = authorizationInterceptor;
            this.$chain = chain;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$chain, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super Response> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x017f, code lost:
        
            if (r15.signOut(r0, r14) != r7) goto L49;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Logger logger;
            AuthService authService;
            Logger logger2;
            vr.c cVar;
            String str;
            AuthTokenService authTokenService;
            Logger logger3;
            int i10 = this.label;
            Protocol protocol = Protocol.HTTP_2;
            boolean z6 = true;
            a aVar = a.f37986a;
            try {
            } catch (AuthTokenService.ErrorGettingAuthTokenException e10) {
                logger2 = this.this$0.logger;
                Logger.logWarning$default(logger2, "AuthorizationInterceptor", "Failed to get auth token for request header: " + e10, null, 4, null);
                Response.Builder builder = new Response.Builder();
                Request f25665e = this.$chain.getF25665e();
                f25665e.getClass();
                builder.f25432a = f25665e;
                builder.f25433b = protocol;
                builder.f25434c = RCHTTPStatusCodes.UNAUTHORIZED;
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                builder.f25435d = message;
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.f25447b;
                cVar = this.this$0.json;
                String message2 = e10.getMessage();
                if (message2 == null) {
                    str = "";
                } else {
                    str = message2;
                }
                ApiError apiError = new ApiError(new ApiError.Detail("firebase_error", str, (b) null, 4, (f) null));
                cVar.getClass();
                String d10 = cVar.d(ApiError.INSTANCE.serializer(), apiError);
                l lVar = MediaType.f25321e;
                builder.f25438g = ResponseBody.Companion.a(d10, MediaType.Companion.a("application/json"));
                return builder.a();
            } catch (AuthTokenService.InvalidRefreshTokenException e11) {
                logger = this.this$0.logger;
                Logger.logWarning$default(logger, "AuthorizationInterceptor", "Failed to get auth token for request header: " + e11, null, 4, null);
                authService = this.this$0.authService;
                AuthService.SignOutReason signOutReason = AuthService.SignOutReason.InvalidRefreshToken;
                this.L$0 = null;
                this.label = 2;
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        Response.Builder builder2 = new Response.Builder();
                        Request f25665e2 = this.$chain.getF25665e();
                        f25665e2.getClass();
                        builder2.f25432a = f25665e2;
                        builder2.f25433b = protocol;
                        builder2.f25434c = RCHTTPStatusCodes.UNAUTHORIZED;
                        builder2.f25435d = "Invalid refresh token";
                        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$12 = ResponseBody.f25447b;
                        builder2.f25438g = ResponseBody.Companion.a("Invalid refresh token", null);
                        return builder2.a();
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                authTokenService = this.this$0.authTokenService;
                this.label = 1;
                obj = authTokenService.getAuthTokenOrNull(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            String str2 = (String) obj;
            Request.Builder b10 = this.$chain.getF25665e().b();
            if (str2 != null && !n.m0(str2)) {
                b10.a(SIPHeaderNames.AUTHORIZATION, "Bearer ".concat(str2));
            } else {
                Request f25665e3 = this.$chain.getF25665e();
                f25665e3.getClass();
                if (!m.c(f25665e3.f25401c.b("Upgrade"), "websocket")) {
                    Request f25665e4 = this.$chain.getF25665e();
                    f25665e4.getClass();
                    String b11 = f25665e4.f25401c.b("Connection");
                    if (b11 == null || !n.a0(b11, "Upgrade", true)) {
                        z6 = false;
                    }
                }
                logger3 = this.this$0.logger;
                String str3 = this.$chain.getF25665e().f25400b;
                HttpUrl httpUrl = this.$chain.getF25665e().f25399a;
                StringBuilder sb = new StringBuilder("No auth token available for ");
                sb.append(str3);
                sb.append(Separators.SP);
                sb.append(httpUrl);
                sb.append(" (WebSocket: ");
                logger3.logWarning("AuthorizationInterceptor", p.n.j(Separators.RPAREN, sb, z6), null);
            }
            return this.$chain.a(new Request(b10));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationInterceptor$intercept$1(AuthorizationInterceptor authorizationInterceptor, Interceptor.Chain chain, c<? super AuthorizationInterceptor$intercept$1> cVar) {
        super(2, cVar);
        this.this$0 = authorizationInterceptor;
        this.$chain = chain;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new AuthorizationInterceptor$intercept$1(this.this$0, this.$chain, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super Response> cVar) {
        return ((AuthorizationInterceptor$intercept$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$chain, null);
        this.label = 1;
        e2 e2Var = new e2(getContext(), this, 0);
        Object F = g0.c.F(e2Var, true, e2Var, anonymousClass1);
        a aVar = a.f37986a;
        if (F == aVar) {
            return aVar;
        }
        return F;
    }
}

package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.data.api.SignUpAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BodyPostReaderPreSignUpUserPreSignUpPost;
import io.elevenlabs.data.model.BodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost;
import io.elevenlabs.data.model.request.VerifyEmailRequest;
import io.elevenlabs.data.model.response.AccountMetadataResponseModel;
import io.elevenlabs.data.model.response.GeoLocationResponseModel;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.SignUpService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/elevenlabs/data/services/RestSignUpService;", "Lio/elevenlabs/domain/services/SignUpService;", "Lio/elevenlabs/data/api/SignUpAPI;", "signUpAPI", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "<init>", "(Lio/elevenlabs/data/api/SignUpAPI;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/AppCheckTokenService;)V", "", "email", DiagnosticsEntry.NAME_KEY, "", "agreesToProductUpdates", "hCaptchaToken", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "preSignUp", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwn/c;)Ljava/lang/Object;", "sendVerificationPasswordEmail", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "code", "sendVerificationCode", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "postRegistrationSetup", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/SignUpAPI;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", ParameterNames.TAG, "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestSignUpService implements SignUpService {
    private final AppCheckTokenService appCheckTokenService;
    private final Logger logger;
    private final SignUpAPI signUpAPI;
    private final String tag;

    public RestSignUpService(SignUpAPI signUpAPI, Logger logger, AppCheckTokenService appCheckTokenService) {
        signUpAPI.getClass();
        logger.getClass();
        appCheckTokenService.getClass();
        this.signUpAPI = signUpAPI;
        this.logger = logger;
        this.appCheckTokenService = appCheckTokenService;
        this.tag = "RestSignUpService";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.SignUpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postRegistrationSetup(wn.c<? super AsyncCallResult<z>> cVar) {
        RestSignUpService$postRegistrationSetup$1 restSignUpService$postRegistrationSetup$1;
        int i10;
        if (cVar instanceof RestSignUpService$postRegistrationSetup$1) {
            restSignUpService$postRegistrationSetup$1 = (RestSignUpService$postRegistrationSetup$1) cVar;
            int i11 = restSignUpService$postRegistrationSetup$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restSignUpService$postRegistrationSetup$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restSignUpService$postRegistrationSetup$1.result;
                i10 = restSignUpService$postRegistrationSetup$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.log(this.tag, "postRegistrationSetup");
                    SignUpAPI signUpAPI = this.signUpAPI;
                    restSignUpService$postRegistrationSetup$1.label = 1;
                    obj = signUpAPI.postRegistrationSetup(restSignUpService$postRegistrationSetup$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        restSignUpService$postRegistrationSetup$1 = new RestSignUpService$postRegistrationSetup$1(this, cVar);
        Object obj2 = restSignUpService$postRegistrationSetup$1.result;
        i10 = restSignUpService$postRegistrationSetup$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        if (r1 != r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // io.elevenlabs.domain.services.SignUpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object preSignUp(String str, String str2, boolean z6, String str3, wn.c<? super AsyncCallResult<z>> cVar) {
        RestSignUpService$preSignUp$1 restSignUpService$preSignUp$1;
        int i10;
        String str4;
        String str5;
        String str6;
        boolean z10;
        AppCheckTokenService.Result result;
        String str7;
        if (cVar instanceof RestSignUpService$preSignUp$1) {
            restSignUpService$preSignUp$1 = (RestSignUpService$preSignUp$1) cVar;
            int i11 = restSignUpService$preSignUp$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restSignUpService$preSignUp$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restSignUpService$preSignUp$1.result;
                i10 = restSignUpService$preSignUp$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return ApiResultExtensionKt.toDomain((ApiResult) obj);
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z11 = restSignUpService$preSignUp$1.Z$0;
                    str6 = (String) restSignUpService$preSignUp$1.L$2;
                    str5 = (String) restSignUpService$preSignUp$1.L$1;
                    String str8 = (String) restSignUpService$preSignUp$1.L$0;
                    sn.a.g(obj);
                    z10 = z11;
                    str4 = str8;
                } else {
                    sn.a.g(obj);
                    this.logger.log(this.tag, "preSignUp");
                    AppCheckTokenService appCheckTokenService = this.appCheckTokenService;
                    str4 = str;
                    restSignUpService$preSignUp$1.L$0 = str4;
                    str5 = str2;
                    restSignUpService$preSignUp$1.L$1 = str5;
                    restSignUpService$preSignUp$1.L$2 = str3;
                    restSignUpService$preSignUp$1.Z$0 = z6;
                    restSignUpService$preSignUp$1.label = 1;
                    obj = appCheckTokenService.getAppCheckToken(restSignUpService$preSignUp$1);
                    if (obj != aVar) {
                        str6 = str3;
                        z10 = z6;
                    }
                    return aVar;
                }
                String str9 = str5;
                result = (AppCheckTokenService.Result) obj;
                if (!(result instanceof AppCheckTokenService.Result.Success)) {
                    str7 = ((AppCheckTokenService.Result.Success) result).getToken();
                } else {
                    str7 = null;
                }
                SignUpAPI signUpAPI = this.signUpAPI;
                BodyPostReaderPreSignUpUserPreSignUpPost bodyPostReaderPreSignUpUserPreSignUpPost = new BodyPostReaderPreSignUpUserPreSignUpPost(str4, new AccountMetadataResponseModel(z10, (GeoLocationResponseModel) null, str9, 2, (kotlin.jvm.internal.f) null), str6);
                restSignUpService$preSignUp$1.L$0 = null;
                restSignUpService$preSignUp$1.L$1 = null;
                restSignUpService$preSignUp$1.L$2 = null;
                restSignUpService$preSignUp$1.L$3 = null;
                restSignUpService$preSignUp$1.Z$0 = z10;
                restSignUpService$preSignUp$1.label = 2;
                obj = signUpAPI.preSignUp(str7, bodyPostReaderPreSignUpUserPreSignUpPost, restSignUpService$preSignUp$1);
            }
        }
        restSignUpService$preSignUp$1 = new RestSignUpService$preSignUp$1(this, cVar);
        Object obj2 = restSignUpService$preSignUp$1.result;
        i10 = restSignUpService$preSignUp$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        String str92 = str5;
        result = (AppCheckTokenService.Result) obj2;
        if (!(result instanceof AppCheckTokenService.Result.Success)) {
        }
        SignUpAPI signUpAPI2 = this.signUpAPI;
        BodyPostReaderPreSignUpUserPreSignUpPost bodyPostReaderPreSignUpUserPreSignUpPost2 = new BodyPostReaderPreSignUpUserPreSignUpPost(str4, new AccountMetadataResponseModel(z10, (GeoLocationResponseModel) null, str92, 2, (kotlin.jvm.internal.f) null), str6);
        restSignUpService$preSignUp$1.L$0 = null;
        restSignUpService$preSignUp$1.L$1 = null;
        restSignUpService$preSignUp$1.L$2 = null;
        restSignUpService$preSignUp$1.L$3 = null;
        restSignUpService$preSignUp$1.Z$0 = z10;
        restSignUpService$preSignUp$1.label = 2;
        obj2 = signUpAPI2.preSignUp(str7, bodyPostReaderPreSignUpUserPreSignUpPost2, restSignUpService$preSignUp$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.SignUpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendVerificationCode(String str, String str2, wn.c<? super AsyncCallResult<z>> cVar) {
        RestSignUpService$sendVerificationCode$1 restSignUpService$sendVerificationCode$1;
        int i10;
        if (cVar instanceof RestSignUpService$sendVerificationCode$1) {
            restSignUpService$sendVerificationCode$1 = (RestSignUpService$sendVerificationCode$1) cVar;
            int i11 = restSignUpService$sendVerificationCode$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restSignUpService$sendVerificationCode$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restSignUpService$sendVerificationCode$1.result;
                i10 = restSignUpService$sendVerificationCode$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.log(this.tag, "sendVerificationCode");
                    SignUpAPI signUpAPI = this.signUpAPI;
                    VerifyEmailRequest verifyEmailRequest = new VerifyEmailRequest(str, str2);
                    restSignUpService$sendVerificationCode$1.L$0 = null;
                    restSignUpService$sendVerificationCode$1.L$1 = null;
                    restSignUpService$sendVerificationCode$1.label = 1;
                    obj = signUpAPI.verifyEmail(verifyEmailRequest, restSignUpService$sendVerificationCode$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        restSignUpService$sendVerificationCode$1 = new RestSignUpService$sendVerificationCode$1(this, cVar);
        Object obj2 = restSignUpService$sendVerificationCode$1.result;
        i10 = restSignUpService$sendVerificationCode$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.SignUpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendVerificationPasswordEmail(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        RestSignUpService$sendVerificationPasswordEmail$1 restSignUpService$sendVerificationPasswordEmail$1;
        int i10;
        if (cVar instanceof RestSignUpService$sendVerificationPasswordEmail$1) {
            restSignUpService$sendVerificationPasswordEmail$1 = (RestSignUpService$sendVerificationPasswordEmail$1) cVar;
            int i11 = restSignUpService$sendVerificationPasswordEmail$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restSignUpService$sendVerificationPasswordEmail$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restSignUpService$sendVerificationPasswordEmail$1.result;
                i10 = restSignUpService$sendVerificationPasswordEmail$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.log(this.tag, "sendVerificationPasswordEmail");
                    SignUpAPI signUpAPI = this.signUpAPI;
                    BodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost bodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost = new BodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost(str);
                    restSignUpService$sendVerificationPasswordEmail$1.L$0 = null;
                    restSignUpService$sendVerificationPasswordEmail$1.label = 1;
                    obj = signUpAPI.sendVerificationEmail(bodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost, restSignUpService$sendVerificationPasswordEmail$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        restSignUpService$sendVerificationPasswordEmail$1 = new RestSignUpService$sendVerificationPasswordEmail$1(this, cVar);
        Object obj2 = restSignUpService$sendVerificationPasswordEmail$1.result;
        i10 = restSignUpService$sendVerificationPasswordEmail$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }
}

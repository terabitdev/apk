package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.ReferralAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.UseReferralRequest;
import io.elevenlabs.data.model.response.GenerateReferralResponse;
import io.elevenlabs.data.model.response.UseReferralResponse;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReferralResult;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ReferralService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/data/services/ReferralServiceImpl;", "Lio/elevenlabs/domain/services/ReferralService;", "Lio/elevenlabs/data/api/ReferralAPI;", "referralAPI", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/data/api/ReferralAPI;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/model/AsyncCallResult;", "", FirebaseAnalytics.Event.SHARE, "(Lwn/c;)Ljava/lang/Object;", "code", "Lio/elevenlabs/domain/model/ReferralResult;", "use", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/ReferralAPI;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Lio/elevenlabs/domain/Logger;", ParameterNames.TAG, "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReferralServiceImpl implements ReferralService {
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final AppCheckTokenService appCheckTokenService;
    private final Logger logger;
    private final ReferralAPI referralAPI;
    private final String tag;

    public ReferralServiceImpl(ReferralAPI referralAPI, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Logger logger) {
        referralAPI.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        logger.getClass();
        this.referralAPI = referralAPI;
        this.appCheckTokenService = appCheckTokenService;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.logger = logger;
        this.tag = "ReferralService";
    }

    public static /* synthetic */ ReferralResult a(UseReferralResponse useReferralResponse) {
        return use$lambda$0(useReferralResponse);
    }

    public static /* synthetic */ String b(GenerateReferralResponse generateReferralResponse) {
        return share$lambda$0(generateReferralResponse);
    }

    public static final String share$lambda$0(GenerateReferralResponse generateReferralResponse) {
        generateReferralResponse.getClass();
        return generateReferralResponse.getReferralUrl();
    }

    public static final ReferralResult use$lambda$0(UseReferralResponse useReferralResponse) {
        useReferralResponse.getClass();
        return new ReferralResult(useReferralResponse.getHoursAllocated(), useReferralResponse.getSubscriptionMonths());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.ReferralService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object share(wn.c<? super AsyncCallResult<String>> cVar) {
        ReferralServiceImpl$share$1 referralServiceImpl$share$1;
        int i10;
        if (cVar instanceof ReferralServiceImpl$share$1) {
            referralServiceImpl$share$1 = (ReferralServiceImpl$share$1) cVar;
            int i11 = referralServiceImpl$share$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                referralServiceImpl$share$1.label = i11 - Integer.MIN_VALUE;
                Object obj = referralServiceImpl$share$1.result;
                i10 = referralServiceImpl$share$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ReferralAPI referralAPI = this.referralAPI;
                    referralServiceImpl$share$1.label = 1;
                    obj = referralAPI.generate(referralServiceImpl$share$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new h(0));
            }
        }
        referralServiceImpl$share$1 = new ReferralServiceImpl$share$1(this, cVar);
        Object obj2 = referralServiceImpl$share$1.result;
        i10 = referralServiceImpl$share$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new h(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r10 != r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r10 == r6) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.ReferralService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object use(String str, wn.c<? super AsyncCallResult<ReferralResult>> cVar) {
        ReferralServiceImpl$use$1 referralServiceImpl$use$1;
        int i10;
        xn.a aVar;
        AppCheckTokenService.Result result;
        String token;
        Object token2;
        String str2;
        String str3;
        if (cVar instanceof ReferralServiceImpl$use$1) {
            referralServiceImpl$use$1 = (ReferralServiceImpl$use$1) cVar;
            int i11 = referralServiceImpl$use$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                referralServiceImpl$use$1.label = i11 - Integer.MIN_VALUE;
                Object obj = referralServiceImpl$use$1.result;
                i10 = referralServiceImpl$use$1.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(29));
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = (String) referralServiceImpl$use$1.L$1;
                        str2 = (String) referralServiceImpl$use$1.L$0;
                        sn.a.g(obj);
                        ReferralAPI referralAPI = this.referralAPI;
                        UseReferralRequest useReferralRequest = new UseReferralRequest(str2);
                        referralServiceImpl$use$1.L$0 = null;
                        referralServiceImpl$use$1.L$1 = null;
                        referralServiceImpl$use$1.L$2 = null;
                        referralServiceImpl$use$1.label = 3;
                        obj = referralAPI.use(useReferralRequest, str3, (String) obj, referralServiceImpl$use$1);
                    } else {
                        str = (String) referralServiceImpl$use$1.L$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    AppCheckTokenService appCheckTokenService = this.appCheckTokenService;
                    referralServiceImpl$use$1.L$0 = str;
                    referralServiceImpl$use$1.label = 1;
                    obj = appCheckTokenService.getAppCheckToken(referralServiceImpl$use$1);
                }
                result = (AppCheckTokenService.Result) obj;
                if (!(result instanceof AppCheckTokenService.Result.Error)) {
                    this.logger.log(this.tag, "Can't get app check token");
                    token = null;
                } else if (result instanceof AppCheckTokenService.Result.Success) {
                    token = ((AppCheckTokenService.Result.Success) result).getToken();
                } else {
                    c6.p();
                    return null;
                }
                AnonCaptchaTokenService anonCaptchaTokenService = this.anonCaptchaTokenService;
                referralServiceImpl$use$1.L$0 = str;
                referralServiceImpl$use$1.L$1 = token;
                referralServiceImpl$use$1.label = 2;
                token2 = anonCaptchaTokenService.getToken(referralServiceImpl$use$1);
                if (token2 != aVar) {
                    str2 = str;
                    str3 = token;
                    obj = token2;
                    ReferralAPI referralAPI2 = this.referralAPI;
                    UseReferralRequest useReferralRequest2 = new UseReferralRequest(str2);
                    referralServiceImpl$use$1.L$0 = null;
                    referralServiceImpl$use$1.L$1 = null;
                    referralServiceImpl$use$1.L$2 = null;
                    referralServiceImpl$use$1.label = 3;
                    obj = referralAPI2.use(useReferralRequest2, str3, (String) obj, referralServiceImpl$use$1);
                }
                return aVar;
            }
        }
        referralServiceImpl$use$1 = new ReferralServiceImpl$use$1(this, cVar);
        Object obj2 = referralServiceImpl$use$1.result;
        i10 = referralServiceImpl$use$1.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        result = (AppCheckTokenService.Result) obj2;
        if (!(result instanceof AppCheckTokenService.Result.Error)) {
        }
        AnonCaptchaTokenService anonCaptchaTokenService2 = this.anonCaptchaTokenService;
        referralServiceImpl$use$1.L$0 = str;
        referralServiceImpl$use$1.L$1 = token;
        referralServiceImpl$use$1.label = 2;
        token2 = anonCaptchaTokenService2.getToken(referralServiceImpl$use$1);
        if (token2 != aVar) {
        }
        return aVar;
    }
}

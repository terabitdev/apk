package io.elevenlabs.data.api;

import ct.i;
import ct.o;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.UseReferralRequest;
import io.elevenlabs.data.model.response.GenerateReferralResponse;
import io.elevenlabs.data.model.response.UseReferralResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ReferralAPI;", "", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/GenerateReferralResponse;", "generate", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/request/UseReferralRequest;", "useReferralRequest", "", "xiAppCheckToken", "hcaptchaToken", "Lio/elevenlabs/data/model/response/UseReferralResponse;", "use", "(Lio/elevenlabs/data/model/request/UseReferralRequest;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReferralAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object use$default(ReferralAPI referralAPI, UseReferralRequest useReferralRequest, String str, String str2, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            return referralAPI.use(useReferralRequest, str, str2, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: use");
        return null;
    }

    @o("/v1/reader/referrals/generate")
    Object generate(c<? super ApiResult<GenerateReferralResponse>> cVar);

    @o("/v1/reader/referrals/use")
    Object use(@ct.a UseReferralRequest useReferralRequest, @i("xi-app-check-token") String str, @i("hcaptcha-token") String str2, c<? super ApiResult<UseReferralResponse>> cVar);
}

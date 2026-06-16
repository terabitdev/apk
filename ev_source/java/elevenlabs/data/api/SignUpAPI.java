package io.elevenlabs.data.api;

import ct.i;
import ct.o;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BodyPostReaderPreSignUpUserPreSignUpPost;
import io.elevenlabs.data.model.BodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost;
import io.elevenlabs.data.model.request.VerifyEmailRequest;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/SignUpAPI;", "", "", "appCheckToken", "Lio/elevenlabs/data/model/BodyPostReaderPreSignUpUserPreSignUpPost;", "body", "Lio/elevenlabs/data/model/ApiResult;", "Lsn/z;", "preSignUp", "(Ljava/lang/String;Lio/elevenlabs/data/model/BodyPostReaderPreSignUpUserPreSignUpPost;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/BodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost;", "sendVerificationEmail", "(Lio/elevenlabs/data/model/BodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/request/VerifyEmailRequest;", "verifyEmail", "(Lio/elevenlabs/data/model/request/VerifyEmailRequest;Lwn/c;)Ljava/lang/Object;", "postRegistrationSetup", "(Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface SignUpAPI {
    @o("/v1/reader/user/post-registration-setup")
    Object postRegistrationSetup(c<? super ApiResult<z>> cVar);

    @o("/v1/reader/user/pre-sign-up")
    Object preSignUp(@i("xi-app-check-token") String str, @ct.a BodyPostReaderPreSignUpUserPreSignUpPost bodyPostReaderPreSignUpUserPreSignUpPost, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/user/send-verification-email-code")
    Object sendVerificationEmail(@ct.a BodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost bodyPostReaderSendVerificationEmailCodeUserSendVerificationEmailCodePost, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/user/verify-email")
    Object verifyEmail(@ct.a VerifyEmailRequest verifyEmailRequest, c<? super ApiResult<z>> cVar);
}

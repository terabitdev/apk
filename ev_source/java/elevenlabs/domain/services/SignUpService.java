package io.elevenlabs.domain.services;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.domain.model.AsyncCallResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/SignUpService;", "", "", "email", DiagnosticsEntry.NAME_KEY, "", "agreesToProductUpdates", "hCaptchaToken", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "preSignUp", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwn/c;)Ljava/lang/Object;", "sendVerificationPasswordEmail", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "code", "sendVerificationCode", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "postRegistrationSetup", "(Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface SignUpService {
    Object postRegistrationSetup(c<? super AsyncCallResult<z>> cVar);

    Object preSignUp(String str, String str2, boolean z6, String str3, c<? super AsyncCallResult<z>> cVar);

    Object sendVerificationCode(String str, String str2, c<? super AsyncCallResult<z>> cVar);

    Object sendVerificationPasswordEmail(String str, c<? super AsyncCallResult<z>> cVar);
}

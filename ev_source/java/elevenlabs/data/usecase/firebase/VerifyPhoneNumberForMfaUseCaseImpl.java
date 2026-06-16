package io.elevenlabs.data.usecase.firebase;

import android.app.Activity;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import gg.b;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.usecase.VerifyPhoneNumberResult;
import io.elevenlabs.domain.usecase.firebase.VerifyPhoneNumberForMfaUseCase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import wn.c;
import wn.j;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/elevenlabs/data/usecase/firebase/VerifyPhoneNumberForMfaUseCaseImpl;", "Lio/elevenlabs/domain/usecase/firebase/VerifyPhoneNumberForMfaUseCase;", "<init>", "()V", "Lio/elevenlabs/domain/Logger;", "logger", "", "activity", "multiFactorResolver", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult;", "invoke", "(Lio/elevenlabs/domain/Logger;Ljava/lang/Object;Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VerifyPhoneNumberForMfaUseCaseImpl implements VerifyPhoneNumberForMfaUseCase {
    private static final String TAG = "VerifyPhoneNumberForMfaUseCase";

    @Override // io.elevenlabs.domain.usecase.firebase.VerifyPhoneNumberForMfaUseCase
    public Object invoke(final Logger logger, Object obj, Object obj2, c<? super VerifyPhoneNumberResult> cVar) {
        PhoneMultiFactorInfo phoneMultiFactorInfo;
        final j jVar = new j(b.V(cVar), a.f37987b);
        obj2.getClass();
        final MultiFactorResolver multiFactorResolver = (MultiFactorResolver) obj2;
        obj.getClass();
        Activity activity = (Activity) obj;
        logger.log(TAG, "Starting phone verification for MFA");
        List<MultiFactorInfo> hints = multiFactorResolver.getHints();
        hints.getClass();
        Object y02 = o.y0(hints);
        if (y02 instanceof PhoneMultiFactorInfo) {
            phoneMultiFactorInfo = (PhoneMultiFactorInfo) y02;
        } else {
            phoneMultiFactorInfo = null;
        }
        if (phoneMultiFactorInfo == null) {
            Logger.logWarning$default(logger, TAG, "No phone hint available for MFA", null, 4, null);
            jVar.resumeWith(VerifyPhoneNumberResult.Error.NoPhoneNumberAvailable.INSTANCE);
        } else {
            PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() { // from class: io.elevenlabs.data.usecase.firebase.VerifyPhoneNumberForMfaUseCaseImpl$invoke$2$callbacks$1
                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onCodeSent(String verificationId, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                    verificationId.getClass();
                    forceResendingToken.getClass();
                    Logger.this.log("VerifyPhoneNumberForMfaUseCase", "SMS code sent successfully");
                    jVar.resumeWith(new VerifyPhoneNumberResult.Success.CodeSent(verificationId, multiFactorResolver, forceResendingToken));
                }

                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onVerificationCompleted(PhoneAuthCredential credential) {
                    credential.getClass();
                    Logger.this.log("VerifyPhoneNumberForMfaUseCase", "Phone verification completed automatically");
                    jVar.resumeWith(new VerifyPhoneNumberResult.Success.AutoVerified(credential, multiFactorResolver));
                }

                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onVerificationFailed(FirebaseException e10) {
                    Object obj3;
                    e10.getClass();
                    Logger.this.logWarning("VerifyPhoneNumberForMfaUseCase", "Phone verification failed", e10);
                    if (e10 instanceof FirebaseAuthInvalidCredentialsException) {
                        obj3 = VerifyPhoneNumberResult.Error.InvalidCredentials.INSTANCE;
                    } else if (e10 instanceof FirebaseTooManyRequestsException) {
                        obj3 = VerifyPhoneNumberResult.Error.TooManyAttempts.INSTANCE;
                    } else {
                        obj3 = VerifyPhoneNumberResult.Error.Unknown.INSTANCE;
                    }
                    jVar.resumeWith(obj3);
                }
            };
            logger.log(TAG, "Sending SMS verification code");
            PhoneAuthProvider.verifyPhoneNumber(PhoneAuthOptions.newBuilder().setActivity(activity).setMultiFactorSession(multiFactorResolver.getSession()).setMultiFactorHint(phoneMultiFactorInfo).setCallbacks(onVerificationStateChangedCallbacks).setTimeout(new Long(30L), TimeUnit.SECONDS).build());
        }
        return jVar.b();
    }
}

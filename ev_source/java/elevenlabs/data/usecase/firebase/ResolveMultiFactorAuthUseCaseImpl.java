package io.elevenlabs.data.usecase.firebase;

import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.PhoneMultiFactorGenerator;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.usecase.ResolveMultiFactorResult;
import io.elevenlabs.domain.usecase.firebase.ResolveMultiFactorAuthUseCase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/data/usecase/firebase/ResolveMultiFactorAuthUseCaseImpl;", "Lio/elevenlabs/domain/usecase/firebase/ResolveMultiFactorAuthUseCase;", "<init>", "()V", "", "resolver", "", "verificationId", "verificationCode", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/usecase/ResolveMultiFactorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/Logger;Lwn/c;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ResolveMultiFactorAuthUseCaseImpl implements ResolveMultiFactorAuthUseCase {
    private static final String TAG = "ResolveMultiFactorAuthUseCase";

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // io.elevenlabs.domain.usecase.firebase.ResolveMultiFactorAuthUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Object obj, String str, String str2, Logger logger, c<? super ResolveMultiFactorResult> cVar) {
        ResolveMultiFactorAuthUseCaseImpl$invoke$1 resolveMultiFactorAuthUseCaseImpl$invoke$1;
        int i10;
        try {
            if (cVar instanceof ResolveMultiFactorAuthUseCaseImpl$invoke$1) {
                resolveMultiFactorAuthUseCaseImpl$invoke$1 = (ResolveMultiFactorAuthUseCaseImpl$invoke$1) cVar;
                int i11 = resolveMultiFactorAuthUseCaseImpl$invoke$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    resolveMultiFactorAuthUseCaseImpl$invoke$1.label = i11 - Integer.MIN_VALUE;
                    Object obj2 = resolveMultiFactorAuthUseCaseImpl$invoke$1.result;
                    i10 = resolveMultiFactorAuthUseCaseImpl$invoke$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            logger = (Logger) resolveMultiFactorAuthUseCaseImpl$invoke$1.L$3;
                            a.g(obj2);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        a.g(obj2);
                        obj.getClass();
                        MultiFactorResolver multiFactorResolver = (MultiFactorResolver) obj;
                        logger.log(TAG, "Resolving MFA with verification code");
                        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(str, str2);
                        credential.getClass();
                        PhoneMultiFactorAssertion assertion = PhoneMultiFactorGenerator.getAssertion(credential);
                        assertion.getClass();
                        Task<AuthResult> resolveSignIn = multiFactorResolver.resolveSignIn(assertion);
                        resolveSignIn.getClass();
                        resolveMultiFactorAuthUseCaseImpl$invoke$1.L$0 = null;
                        resolveMultiFactorAuthUseCaseImpl$invoke$1.L$1 = null;
                        resolveMultiFactorAuthUseCaseImpl$invoke$1.L$2 = null;
                        resolveMultiFactorAuthUseCaseImpl$invoke$1.L$3 = logger;
                        resolveMultiFactorAuthUseCaseImpl$invoke$1.L$4 = null;
                        resolveMultiFactorAuthUseCaseImpl$invoke$1.L$5 = null;
                        resolveMultiFactorAuthUseCaseImpl$invoke$1.L$6 = null;
                        resolveMultiFactorAuthUseCaseImpl$invoke$1.label = 1;
                        Object j4 = kj.c.j(resolveSignIn, resolveMultiFactorAuthUseCaseImpl$invoke$1);
                        xn.a aVar = xn.a.f37986a;
                        if (j4 == aVar) {
                            return aVar;
                        }
                    }
                    logger.log(TAG, "MFA resolution successful");
                    return ResolveMultiFactorResult.Success.INSTANCE;
                }
            }
            if (i10 == 0) {
            }
            logger.log(TAG, "MFA resolution successful");
            return ResolveMultiFactorResult.Success.INSTANCE;
        } catch (FirebaseException e10) {
            logger.logWarning(TAG, "MFA resolution failed", e10);
            if (e10 instanceof FirebaseTooManyRequestsException) {
                return ResolveMultiFactorResult.Error.TooManyAttempts.INSTANCE;
            }
            if (e10 instanceof FirebaseAuthInvalidCredentialsException) {
                return ResolveMultiFactorResult.Error.InvalidCode.INSTANCE;
            }
            return ResolveMultiFactorResult.Error.Unknown.INSTANCE;
        }
        resolveMultiFactorAuthUseCaseImpl$invoke$1 = new ResolveMultiFactorAuthUseCaseImpl$invoke$1(this, cVar);
        Object obj22 = resolveMultiFactorAuthUseCaseImpl$invoke$1.result;
        i10 = resolveMultiFactorAuthUseCaseImpl$invoke$1.label;
    }
}

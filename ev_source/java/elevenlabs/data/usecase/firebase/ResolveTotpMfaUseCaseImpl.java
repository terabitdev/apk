package io.elevenlabs.data.usecase.firebase;

import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.usecase.ResolveMultiFactorResult;
import io.elevenlabs.domain.usecase.firebase.ResolveTotpMfaUseCase;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/data/usecase/firebase/ResolveTotpMfaUseCaseImpl;", "Lio/elevenlabs/domain/usecase/firebase/ResolveTotpMfaUseCase;", "<init>", "()V", "", "resolver", "", "verificationCode", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/usecase/ResolveMultiFactorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/String;Lio/elevenlabs/domain/Logger;Lwn/c;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ResolveTotpMfaUseCaseImpl implements ResolveTotpMfaUseCase {
    private static final String TAG = "ResolveTotpMfaUseCase";

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean] */
    @Override // io.elevenlabs.domain.usecase.firebase.ResolveTotpMfaUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Object obj, String str, Logger logger, c<? super ResolveMultiFactorResult> cVar) {
        ResolveTotpMfaUseCaseImpl$invoke$1 resolveTotpMfaUseCaseImpl$invoke$1;
        int i10;
        FirebaseException firebaseException;
        Object obj2;
        TotpMultiFactorInfo totpMultiFactorInfo;
        ?? r52;
        try {
            if (cVar instanceof ResolveTotpMfaUseCaseImpl$invoke$1) {
                resolveTotpMfaUseCaseImpl$invoke$1 = (ResolveTotpMfaUseCaseImpl$invoke$1) cVar;
                int i11 = resolveTotpMfaUseCaseImpl$invoke$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    resolveTotpMfaUseCaseImpl$invoke$1.label = i11 - Integer.MIN_VALUE;
                    Object obj3 = resolveTotpMfaUseCaseImpl$invoke$1.result;
                    i10 = resolveTotpMfaUseCaseImpl$invoke$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            logger = (Logger) resolveTotpMfaUseCaseImpl$invoke$1.L$2;
                            a.g(obj3);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        a.g(obj3);
                        obj.getClass();
                        MultiFactorResolver multiFactorResolver = (MultiFactorResolver) obj;
                        try {
                            logger.log(TAG, "Resolving TOTP MFA with verification code");
                            List<MultiFactorInfo> hints = multiFactorResolver.getHints();
                            hints.getClass();
                            Iterator<T> it = hints.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    r52 = ((MultiFactorInfo) obj2) instanceof TotpMultiFactorInfo;
                                    if (r52 != 0) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            if (obj2 instanceof TotpMultiFactorInfo) {
                                totpMultiFactorInfo = (TotpMultiFactorInfo) obj2;
                            } else {
                                totpMultiFactorInfo = null;
                            }
                            try {
                                if (totpMultiFactorInfo == null) {
                                    Logger.logWarning$default(logger, TAG, "No TOTP hint available for MFA", null, 4, null);
                                    return ResolveMultiFactorResult.Error.Unknown.INSTANCE;
                                }
                                TotpMultiFactorAssertion assertionForSignIn = TotpMultiFactorGenerator.getAssertionForSignIn(totpMultiFactorInfo.getUid(), str);
                                assertionForSignIn.getClass();
                                Task<AuthResult> resolveSignIn = multiFactorResolver.resolveSignIn(assertionForSignIn);
                                resolveSignIn.getClass();
                                resolveTotpMfaUseCaseImpl$invoke$1.L$0 = null;
                                resolveTotpMfaUseCaseImpl$invoke$1.L$1 = null;
                                resolveTotpMfaUseCaseImpl$invoke$1.L$2 = logger;
                                resolveTotpMfaUseCaseImpl$invoke$1.L$3 = null;
                                resolveTotpMfaUseCaseImpl$invoke$1.L$4 = null;
                                resolveTotpMfaUseCaseImpl$invoke$1.L$5 = null;
                                resolveTotpMfaUseCaseImpl$invoke$1.label = 1;
                                Object j4 = kj.c.j(resolveSignIn, resolveTotpMfaUseCaseImpl$invoke$1);
                                xn.a aVar = xn.a.f37986a;
                                if (j4 == aVar) {
                                    return aVar;
                                }
                                logger = logger;
                            } catch (FirebaseException e10) {
                                firebaseException = e10;
                                logger = r52;
                                logger.logWarning(TAG, "TOTP MFA resolution failed", firebaseException);
                                if (!(firebaseException instanceof FirebaseTooManyRequestsException)) {
                                    return ResolveMultiFactorResult.Error.TooManyAttempts.INSTANCE;
                                }
                                if (firebaseException instanceof FirebaseAuthInvalidCredentialsException) {
                                    return ResolveMultiFactorResult.Error.InvalidCode.INSTANCE;
                                }
                                return ResolveMultiFactorResult.Error.Unknown.INSTANCE;
                            }
                        } catch (FirebaseException e11) {
                            e = e11;
                            firebaseException = e;
                            logger.logWarning(TAG, "TOTP MFA resolution failed", firebaseException);
                            if (!(firebaseException instanceof FirebaseTooManyRequestsException)) {
                            }
                        }
                    }
                    logger.log(TAG, "TOTP MFA resolution successful");
                    return ResolveMultiFactorResult.Success.INSTANCE;
                }
            }
            if (i10 == 0) {
            }
            logger.log(TAG, "TOTP MFA resolution successful");
            return ResolveMultiFactorResult.Success.INSTANCE;
        } catch (FirebaseException e12) {
            e = e12;
        }
        resolveTotpMfaUseCaseImpl$invoke$1 = new ResolveTotpMfaUseCaseImpl$invoke$1(this, cVar);
        Object obj32 = resolveTotpMfaUseCaseImpl$invoke$1.result;
        i10 = resolveTotpMfaUseCaseImpl$invoke$1.label;
    }
}

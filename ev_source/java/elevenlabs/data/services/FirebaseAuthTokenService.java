package io.elevenlabs.data.services;

import android.gov.nist.core.Separators;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthTokenService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/data/services/FirebaseAuthTokenService;", "Lio/elevenlabs/domain/services/AuthTokenService;", "Lcom/google/firebase/auth/FirebaseAuth;", "auth", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lcom/google/firebase/auth/FirebaseAuth;Lio/elevenlabs/domain/Logger;)V", "", "getAuthTokenOrNull", "(Lwn/c;)Ljava/lang/Object;", "Lcom/google/firebase/auth/FirebaseAuth;", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FirebaseAuthTokenService implements AuthTokenService {
    private static final String TAG = "FirebaseAuthTokenService";
    private final FirebaseAuth auth;
    private final Logger logger;

    public FirebaseAuthTokenService(FirebaseAuth firebaseAuth, Logger logger) {
        firebaseAuth.getClass();
        logger.getClass();
        this.auth = firebaseAuth;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0031, FirebaseException -> 0x0034, TRY_LEAVE, TryCatch #2 {FirebaseException -> 0x0034, all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0066, B:14:0x006a, B:18:0x0078, B:20:0x0080, B:24:0x0088, B:31:0x0048, B:33:0x0050, B:35:0x0056), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[Catch: all -> 0x0031, FirebaseException -> 0x0034, TRY_LEAVE, TryCatch #2 {FirebaseException -> 0x0034, all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0066, B:14:0x006a, B:18:0x0078, B:20:0x0080, B:24:0x0088, B:31:0x0048, B:33:0x0050, B:35:0x0056), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // io.elevenlabs.domain.services.AuthTokenService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAuthTokenOrNull(wn.c<? super String> cVar) {
        FirebaseAuthTokenService$getAuthTokenOrNull$1 firebaseAuthTokenService$getAuthTokenOrNull$1;
        int i10;
        FirebaseUser currentUser;
        Task<GetTokenResult> idToken;
        FirebaseUser firebaseUser;
        String str;
        String str2;
        GetTokenResult getTokenResult;
        try {
            if (cVar instanceof FirebaseAuthTokenService$getAuthTokenOrNull$1) {
                firebaseAuthTokenService$getAuthTokenOrNull$1 = (FirebaseAuthTokenService$getAuthTokenOrNull$1) cVar;
                int i11 = firebaseAuthTokenService$getAuthTokenOrNull$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    firebaseAuthTokenService$getAuthTokenOrNull$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = firebaseAuthTokenService$getAuthTokenOrNull$1.result;
                    i10 = firebaseAuthTokenService$getAuthTokenOrNull$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            firebaseUser = (FirebaseUser) firebaseAuthTokenService$getAuthTokenOrNull$1.L$0;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        this.logger.log(TAG, "Fetching...");
                        currentUser = this.auth.getCurrentUser();
                        if (currentUser != null && (idToken = currentUser.getIdToken(false)) != null) {
                            firebaseAuthTokenService$getAuthTokenOrNull$1.L$0 = currentUser;
                            firebaseAuthTokenService$getAuthTokenOrNull$1.label = 1;
                            Object j4 = kj.c.j(idToken, firebaseAuthTokenService$getAuthTokenOrNull$1);
                            xn.a aVar = xn.a.f37986a;
                            if (j4 == aVar) {
                                return aVar;
                            }
                            firebaseUser = currentUser;
                            obj = j4;
                        }
                        firebaseUser = currentUser;
                        str = null;
                        Logger logger = this.logger;
                        if (str == null) {
                            if (firebaseUser == null || (str2 = firebaseUser.getUid()) == null) {
                                str2 = "null";
                            }
                            logger.log(TAG, "No token available - currentUser.uid: ".concat(str2));
                            return str;
                        }
                        logger.log(TAG, "Token fetched successfully (length=" + str.length() + Separators.RPAREN);
                        return str;
                    }
                    getTokenResult = (GetTokenResult) obj;
                    if (getTokenResult == null) {
                        str = getTokenResult.getToken();
                        Logger logger2 = this.logger;
                        if (str == null) {
                        }
                    } else {
                        currentUser = firebaseUser;
                        firebaseUser = currentUser;
                        str = null;
                        Logger logger22 = this.logger;
                        if (str == null) {
                        }
                    }
                }
            }
            if (i10 == 0) {
            }
            getTokenResult = (GetTokenResult) obj;
            if (getTokenResult == null) {
            }
        } catch (FirebaseException e10) {
            String message = e10.getMessage();
            if (message != null && n.a0(message, "INVALID_REFRESH_TOKEN", false)) {
                this.logger.log(TAG, "FirebaseException - " + e10);
                throw new AuthTokenService.InvalidRefreshTokenException();
            }
            this.logger.logError(TAG, "FirebaseException", e10);
            return null;
        } catch (Throwable th) {
            this.logger.logError(TAG, "Fetch error", th);
            throw th;
        }
        firebaseAuthTokenService$getAuthTokenOrNull$1 = new FirebaseAuthTokenService$getAuthTokenOrNull$1(this, cVar);
        Object obj2 = firebaseAuthTokenService$getAuthTokenOrNull$1.result;
        i10 = firebaseAuthTokenService$getAuthTokenOrNull$1.label;
    }
}

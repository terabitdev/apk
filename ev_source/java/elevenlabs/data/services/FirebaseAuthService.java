package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthEmailException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthMultiFactorException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.DeleteAccountAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.elevenlabs.di.AppDatabase;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.MfaState;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.MfaService;
import io.elevenlabs.domain.services.MfaType;
import io.elevenlabs.domain.usecase.ResolveMultiFactorResult;
import io.elevenlabs.domain.usecase.firebase.DetermineMfaTypeUseCase;
import io.elevenlabs.domain.usecase.firebase.ResolveMultiFactorAuthUseCase;
import io.elevenlabs.domain.usecase.firebase.ResolveTotpMfaUseCase;
import ir.a1;
import ir.r;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Cache;
import sn.z;
import wq.n;
import zs.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0087\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*H\u0016¢\u0006\u0004\b.\u0010-J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0*H\u0016¢\u0006\u0004\b0\u0010-J \u00104\u001a\u00020#2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0096@¢\u0006\u0004\b4\u00105J \u00106\u001a\u00020#2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0096@¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020/H\u0096@¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020#2\b\u00109\u001a\u0004\u0018\u000101H\u0096@¢\u0006\u0004\b:\u0010;J\u0018\u0010=\u001a\u00020#2\u0006\u0010<\u001a\u000201H\u0096@¢\u0006\u0004\b=\u0010;J\u0018\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0096@¢\u0006\u0004\bA\u0010BJ\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020@0CH\u0096@¢\u0006\u0004\bD\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010JR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010KR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010LR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010MR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010NR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010OR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010PR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010QR\"\u0010T\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020S\u0018\u00010R0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lio/elevenlabs/data/services/FirebaseAuthService;", "Lio/elevenlabs/domain/services/AuthService;", "Lcom/google/firebase/auth/FirebaseAuth;", "auth", "Lio/elevenlabs/domain/Logger;", "logger", "Ljl/a;", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lokhttp3/Cache;", "cache", "Lio/elevenlabs/di/AppDatabase;", "appDatabase", "Lio/elevenlabs/domain/services/FileService;", "fileService", "Landroid/content/SharedPreferences;", "userSharedPreferences", "Lio/elevenlabs/data/api/DeleteAccountAPI;", "deleteAccountAPI", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/domain/services/MfaService;", "mfaService", "Lio/elevenlabs/domain/usecase/firebase/DetermineMfaTypeUseCase;", "determineMfaTypeUseCase", "Lio/elevenlabs/domain/usecase/firebase/ResolveMultiFactorAuthUseCase;", "resolveMultiFactorAuthUseCase", "Lio/elevenlabs/domain/usecase/firebase/ResolveTotpMfaUseCase;", "resolveTotpMfaUseCase", "<init>", "(Lcom/google/firebase/auth/FirebaseAuth;Lio/elevenlabs/domain/Logger;Ljl/a;Lokhttp3/Cache;Lio/elevenlabs/di/AppDatabase;Lio/elevenlabs/domain/services/FileService;Landroid/content/SharedPreferences;Ljl/a;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ConnectivityService;Lio/elevenlabs/domain/services/MfaService;Lio/elevenlabs/domain/usecase/firebase/DetermineMfaTypeUseCase;Lio/elevenlabs/domain/usecase/firebase/ResolveMultiFactorAuthUseCase;Lio/elevenlabs/domain/usecase/firebase/ResolveTotpMfaUseCase;)V", "Lcom/google/firebase/FirebaseException;", "exc", "Lio/elevenlabs/domain/services/AuthService$AuthResult;", "handleSignInException", "(Lcom/google/firebase/FirebaseException;)Lio/elevenlabs/domain/services/AuthService$AuthResult;", "Lcom/google/firebase/FirebaseTooManyRequestsException;", "exception", "getAuthResultForFirebaseTooManyRequestsException", "(Lcom/google/firebase/FirebaseTooManyRequestsException;)Lio/elevenlabs/domain/services/AuthService$AuthResult;", "Lir/i;", "Lio/elevenlabs/domain/model/User;", "user", "()Lir/i;", "userOrNull", "", "isSignedIn", "", "email", "password", "signInWithEmailPassword", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "createUserWithEmailPassword", "tryAutoSignInAfterCreateUserEmailVerification", "(Lwn/c;)Ljava/lang/Object;", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "signInWithGoogleToken", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "code", "verifyMfaCode", "Lio/elevenlabs/domain/services/AuthService$SignOutReason;", "reason", "Lsn/z;", "signOut", "(Lio/elevenlabs/domain/services/AuthService$SignOutReason;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "deleteUser", "Lcom/google/firebase/auth/FirebaseAuth;", "Lio/elevenlabs/domain/Logger;", "Ljl/a;", "Lokhttp3/Cache;", "Lio/elevenlabs/di/AppDatabase;", "Lio/elevenlabs/domain/services/FileService;", "Landroid/content/SharedPreferences;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lio/elevenlabs/domain/services/MfaService;", "Lio/elevenlabs/domain/usecase/firebase/DetermineMfaTypeUseCase;", "Lio/elevenlabs/domain/usecase/firebase/ResolveMultiFactorAuthUseCase;", "Lio/elevenlabs/domain/usecase/firebase/ResolveTotpMfaUseCase;", "Ljava/util/Optional;", "Lcom/google/firebase/auth/FirebaseUser;", "firebaseUser", "Lir/i;", "lastEmail", "Ljava/lang/String;", "lastPassword", "Lio/elevenlabs/domain/Analytics$Event$AuthMethod;", "mfaAuthMethod", "Lio/elevenlabs/domain/Analytics$Event$AuthMethod;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FirebaseAuthService implements AuthService {
    private static final String TAG = "AuthService";
    private final jl.a analytics;
    private final AppDatabase appDatabase;
    private final FirebaseAuth auth;
    private final Cache cache;
    private final ConnectivityService connectivityService;
    private final jl.a deleteAccountAPI;
    private final DetermineMfaTypeUseCase determineMfaTypeUseCase;
    private final DispatcherFactory dispatcherFactory;
    private final FileService fileService;
    private final ir.i firebaseUser;
    private String lastEmail;
    private String lastPassword;
    private final Logger logger;
    private Analytics.Event.AuthMethod mfaAuthMethod;
    private final MfaService mfaService;
    private final ResolveMultiFactorAuthUseCase resolveMultiFactorAuthUseCase;
    private final ResolveTotpMfaUseCase resolveTotpMfaUseCase;
    private final SharedPreferences userSharedPreferences;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MfaType.values().length];
            try {
                iArr[MfaType.TOTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MfaType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FirebaseAuthService(FirebaseAuth firebaseAuth, Logger logger, jl.a aVar, Cache cache, AppDatabase appDatabase, FileService fileService, @UserSharedPreferences SharedPreferences sharedPreferences, jl.a aVar2, DispatcherFactory dispatcherFactory, ConnectivityService connectivityService, MfaService mfaService, DetermineMfaTypeUseCase determineMfaTypeUseCase, ResolveMultiFactorAuthUseCase resolveMultiFactorAuthUseCase, ResolveTotpMfaUseCase resolveTotpMfaUseCase) {
        firebaseAuth.getClass();
        logger.getClass();
        aVar.getClass();
        cache.getClass();
        appDatabase.getClass();
        fileService.getClass();
        sharedPreferences.getClass();
        aVar2.getClass();
        dispatcherFactory.getClass();
        connectivityService.getClass();
        mfaService.getClass();
        determineMfaTypeUseCase.getClass();
        resolveMultiFactorAuthUseCase.getClass();
        resolveTotpMfaUseCase.getClass();
        this.auth = firebaseAuth;
        this.logger = logger;
        this.analytics = aVar;
        this.cache = cache;
        this.appDatabase = appDatabase;
        this.fileService = fileService;
        this.userSharedPreferences = sharedPreferences;
        this.deleteAccountAPI = aVar2;
        this.dispatcherFactory = dispatcherFactory;
        this.connectivityService = connectivityService;
        this.mfaService = mfaService;
        this.determineMfaTypeUseCase = determineMfaTypeUseCase;
        this.resolveMultiFactorAuthUseCase = resolveMultiFactorAuthUseCase;
        this.resolveTotpMfaUseCase = resolveTotpMfaUseCase;
        this.firebaseUser = r.h(new FirebaseAuthService$firebaseUser$1(this, null));
    }

    private final AuthService.AuthResult getAuthResultForFirebaseTooManyRequestsException(FirebaseTooManyRequestsException exception) {
        String message = exception.getMessage();
        String str = "";
        if (message == null) {
            message = "";
        }
        if (n.a0(message, "We have blocked all requests from this device due to unusual activity", false)) {
            String localizedMessage = exception.getLocalizedMessage();
            if (localizedMessage == null) {
                String message2 = exception.getMessage();
                if (message2 != null) {
                    str = message2;
                }
            } else {
                str = localizedMessage;
            }
            return new AuthService.AuthResult.Error.FirebaseGeneric(str);
        }
        return AuthService.AuthResult.Error.TooManyRequests.INSTANCE;
    }

    private final AuthService.AuthResult handleSignInException(FirebaseException exc) {
        Object totp;
        if (exc instanceof FirebaseAuthEmailException) {
            return AuthService.AuthResult.Error.InvalidEmail.INSTANCE;
        }
        if (exc instanceof FirebaseAuthInvalidUserException) {
            return AuthService.AuthResult.Error.InvalidCredentials.INSTANCE;
        }
        if (exc instanceof FirebaseAuthInvalidCredentialsException) {
            return AuthService.AuthResult.Error.InvalidCredentials.INSTANCE;
        }
        if (exc instanceof FirebaseAuthMultiFactorException) {
            DetermineMfaTypeUseCase determineMfaTypeUseCase = this.determineMfaTypeUseCase;
            FirebaseAuthMultiFactorException firebaseAuthMultiFactorException = (FirebaseAuthMultiFactorException) exc;
            MultiFactorResolver resolver = firebaseAuthMultiFactorException.getResolver();
            resolver.getClass();
            MfaType invoke = determineMfaTypeUseCase.invoke(resolver);
            this.logger.log(TAG, "MFA required, type: " + invoke);
            int i10 = WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    MultiFactorResolver resolver2 = firebaseAuthMultiFactorException.getResolver();
                    resolver2.getClass();
                    totp = new MfaState.PhonePending(resolver2);
                } else {
                    c6.p();
                    return null;
                }
            } else {
                MultiFactorResolver resolver3 = firebaseAuthMultiFactorException.getResolver();
                resolver3.getClass();
                totp = new MfaState.Totp(resolver3);
            }
            this.mfaService.storeMfaState(totp);
            MultiFactorResolver resolver4 = firebaseAuthMultiFactorException.getResolver();
            resolver4.getClass();
            return new AuthService.AuthResult.Error.MultiFactorRequired(resolver4, invoke);
        }
        if (exc instanceof FirebaseTooManyRequestsException) {
            return getAuthResultForFirebaseTooManyRequestsException((FirebaseTooManyRequestsException) exc);
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        if (n.a0(message, "has been banned", false)) {
            return AuthService.AuthResult.Error.AccountBanned.INSTANCE;
        }
        if (n.a0(message, "not been verified", false)) {
            return AuthService.AuthResult.Error.AccountNotVerified.INSTANCE;
        }
        if (n.a0(message, "Failed to connect", false)) {
            return AuthService.AuthResult.Error.FailedToConnect.INSTANCE;
        }
        if (n.a0(message, "email address is badly formatted", false)) {
            return AuthService.AuthResult.Error.InvalidEmail.INSTANCE;
        }
        if (n.a0(message, "has been deleted", false)) {
            return AuthService.AuthResult.Error.AccountDeleted.INSTANCE;
        }
        this.logger.logError(TAG, "unknown FirebaseException: " + exc.getMessage(), exc);
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = exc.getMessage();
        }
        if (localizedMessage != null && !n.m0(localizedMessage)) {
            return new AuthService.AuthResult.Error.FirebaseGeneric(localizedMessage);
        }
        return AuthService.AuthResult.Error.Unknown.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // io.elevenlabs.domain.services.AuthService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUserWithEmailPassword(String str, String str2, wn.c<? super AuthService.AuthResult> cVar) {
        FirebaseAuthService$createUserWithEmailPassword$1 firebaseAuthService$createUserWithEmailPassword$1;
        int i10;
        try {
            if (cVar instanceof FirebaseAuthService$createUserWithEmailPassword$1) {
                firebaseAuthService$createUserWithEmailPassword$1 = (FirebaseAuthService$createUserWithEmailPassword$1) cVar;
                int i11 = firebaseAuthService$createUserWithEmailPassword$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    firebaseAuthService$createUserWithEmailPassword$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = firebaseAuthService$createUserWithEmailPassword$1.result;
                    i10 = firebaseAuthService$createUserWithEmailPassword$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        if (!n.m0(str) && !n.m0(str2)) {
                            this.lastEmail = str;
                            this.lastPassword = str2;
                            Task<AuthResult> createUserWithEmailAndPassword = this.auth.createUserWithEmailAndPassword(str, str2);
                            createUserWithEmailAndPassword.getClass();
                            firebaseAuthService$createUserWithEmailPassword$1.L$0 = null;
                            firebaseAuthService$createUserWithEmailPassword$1.L$1 = null;
                            firebaseAuthService$createUserWithEmailPassword$1.label = 1;
                            Object j4 = kj.c.j(createUserWithEmailAndPassword, firebaseAuthService$createUserWithEmailPassword$1);
                            xn.a aVar = xn.a.f37986a;
                            if (j4 == aVar) {
                                return aVar;
                            }
                        } else {
                            return AuthService.AuthResult.Error.InvalidCredentials.INSTANCE;
                        }
                    }
                    ((Analytics) this.analytics.get()).log(new Analytics.Event.SignedUp(Analytics.Event.AuthMethod.Email));
                    return new AuthService.AuthResult.Success(true);
                }
            }
            if (i10 == 0) {
            }
            ((Analytics) this.analytics.get()).log(new Analytics.Event.SignedUp(Analytics.Event.AuthMethod.Email));
            return new AuthService.AuthResult.Success(true);
        } catch (FirebaseException e10) {
            return handleSignInException(e10);
        } catch (o e11) {
            this.logger.logWarning(TAG, "createUserWithEmailPassword/http - " + e11.f39795a, e11);
            return AuthService.AuthResult.Error.Unknown.INSTANCE;
        }
        firebaseAuthService$createUserWithEmailPassword$1 = new FirebaseAuthService$createUserWithEmailPassword$1(this, cVar);
        Object obj2 = firebaseAuthService$createUserWithEmailPassword$1.result;
        i10 = firebaseAuthService$createUserWithEmailPassword$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (fr.g0.Q(r7, r1, r0) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // io.elevenlabs.domain.services.AuthService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteUser(wn.c<? super AsyncCallResult<z>> cVar) {
        FirebaseAuthService$deleteUser$1 firebaseAuthService$deleteUser$1;
        int i10;
        boolean z6;
        if (cVar instanceof FirebaseAuthService$deleteUser$1) {
            firebaseAuthService$deleteUser$1 = (FirebaseAuthService$deleteUser$1) cVar;
            int i11 = firebaseAuthService$deleteUser$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                firebaseAuthService$deleteUser$1.label = i11 - Integer.MIN_VALUE;
                Object obj = firebaseAuthService$deleteUser$1.result;
                i10 = firebaseAuthService$deleteUser$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return new AsyncCallResult.Success(z.f31622a);
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    DeleteAccountAPI deleteAccountAPI = (DeleteAccountAPI) this.deleteAccountAPI.get();
                    firebaseAuthService$deleteUser$1.label = 1;
                    obj = deleteAccountAPI.deleteAccount(firebaseAuthService$deleteUser$1);
                }
                ApiResult apiResult = (ApiResult) obj;
                z6 = apiResult instanceof ApiResult.Success;
                Logger logger = this.logger;
                if (!z6) {
                    logger.log(TAG, "deleteUser success");
                    fr.z io2 = this.dispatcherFactory.getIo();
                    FirebaseAuthService$deleteUser$2 firebaseAuthService$deleteUser$2 = new FirebaseAuthService$deleteUser$2(this, null);
                    firebaseAuthService$deleteUser$1.L$0 = null;
                    firebaseAuthService$deleteUser$1.label = 2;
                } else {
                    logger.log(TAG, "deleteUser error: " + apiResult);
                    return ApiResultExtensionKt.toDomain(apiResult);
                }
            }
        }
        firebaseAuthService$deleteUser$1 = new FirebaseAuthService$deleteUser$1(this, cVar);
        Object obj2 = firebaseAuthService$deleteUser$1.result;
        i10 = firebaseAuthService$deleteUser$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z6 = apiResult2 instanceof ApiResult.Success;
        Logger logger2 = this.logger;
        if (!z6) {
        }
    }

    @Override // io.elevenlabs.domain.services.AuthService
    public ir.i isSignedIn() {
        final ir.i iVar = this.firebaseUser;
        final ir.i iVar2 = new ir.i() { // from class: io.elevenlabs.data.services.FirebaseAuthService$isSignedIn$$inlined$filter$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.FirebaseAuthService$isSignedIn$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.FirebaseAuthService$isSignedIn$$inlined$filter$1$2", f = "FirebaseAuthService.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.FirebaseAuthService$isSignedIn$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                if (((Optional) obj) != null) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(obj, anonymousClass1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
        return r.o(new ir.i() { // from class: io.elevenlabs.data.services.FirebaseAuthService$isSignedIn$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.FirebaseAuthService$isSignedIn$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.FirebaseAuthService$isSignedIn$$inlined$map$1$2", f = "FirebaseAuthService.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.FirebaseAuthService$isSignedIn$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z6;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                Optional optional = (Optional) obj;
                                if (optional != null && optional.isPresent() && !((FirebaseUser) optional.get()).isAnonymous()) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z6);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(valueOf, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // io.elevenlabs.domain.services.AuthService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object signInWithEmailPassword(String str, String str2, wn.c<? super AuthService.AuthResult> cVar) {
        FirebaseAuthService$signInWithEmailPassword$1 firebaseAuthService$signInWithEmailPassword$1;
        int i10;
        try {
            if (cVar instanceof FirebaseAuthService$signInWithEmailPassword$1) {
                firebaseAuthService$signInWithEmailPassword$1 = (FirebaseAuthService$signInWithEmailPassword$1) cVar;
                int i11 = firebaseAuthService$signInWithEmailPassword$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    firebaseAuthService$signInWithEmailPassword$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = firebaseAuthService$signInWithEmailPassword$1.result;
                    i10 = firebaseAuthService$signInWithEmailPassword$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        if (!n.m0(str) && !n.m0(str2)) {
                            this.lastEmail = str;
                            this.lastPassword = str2;
                            Task<AuthResult> signInWithEmailAndPassword = this.auth.signInWithEmailAndPassword(str, str2);
                            signInWithEmailAndPassword.getClass();
                            firebaseAuthService$signInWithEmailPassword$1.L$0 = null;
                            firebaseAuthService$signInWithEmailPassword$1.L$1 = null;
                            firebaseAuthService$signInWithEmailPassword$1.label = 1;
                            Object j4 = kj.c.j(signInWithEmailAndPassword, firebaseAuthService$signInWithEmailPassword$1);
                            xn.a aVar = xn.a.f37986a;
                            if (j4 == aVar) {
                                return aVar;
                            }
                        } else {
                            return AuthService.AuthResult.Error.InvalidCredentials.INSTANCE;
                        }
                    }
                    ((Analytics) this.analytics.get()).log(new Analytics.Event.SignedIn(Analytics.Event.AuthMethod.Email));
                    return new AuthService.AuthResult.Success(false);
                }
            }
            if (i10 == 0) {
            }
            ((Analytics) this.analytics.get()).log(new Analytics.Event.SignedIn(Analytics.Event.AuthMethod.Email));
            return new AuthService.AuthResult.Success(false);
        } catch (FirebaseException e10) {
            AuthService.AuthResult handleSignInException = handleSignInException(e10);
            if (handleSignInException instanceof AuthService.AuthResult.Error.MultiFactorRequired) {
                this.mfaAuthMethod = Analytics.Event.AuthMethod.Email;
            }
            return handleSignInException;
        }
        firebaseAuthService$signInWithEmailPassword$1 = new FirebaseAuthService$signInWithEmailPassword$1(this, cVar);
        Object obj2 = firebaseAuthService$signInWithEmailPassword$1.result;
        i10 = firebaseAuthService$signInWithEmailPassword$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: FirebaseException -> 0x002d, TRY_LEAVE, TryCatch #0 {FirebaseException -> 0x002d, blocks: (B:11:0x0029, B:12:0x0062, B:14:0x006a, B:17:0x0074, B:18:0x0095, B:22:0x0085, B:31:0x0043), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[Catch: FirebaseException -> 0x002d, TRY_ENTER, TryCatch #0 {FirebaseException -> 0x002d, blocks: (B:11:0x0029, B:12:0x0062, B:14:0x006a, B:17:0x0074, B:18:0x0095, B:22:0x0085, B:31:0x0043), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[Catch: FirebaseException -> 0x002d, TryCatch #0 {FirebaseException -> 0x002d, blocks: (B:11:0x0029, B:12:0x0062, B:14:0x006a, B:17:0x0074, B:18:0x0095, B:22:0x0085, B:31:0x0043), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // io.elevenlabs.domain.services.AuthService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object signInWithGoogleToken(String str, wn.c<? super AuthService.AuthResult> cVar) {
        FirebaseAuthService$signInWithGoogleToken$1 firebaseAuthService$signInWithGoogleToken$1;
        int i10;
        AdditionalUserInfo additionalUserInfo;
        boolean z6;
        try {
            if (cVar instanceof FirebaseAuthService$signInWithGoogleToken$1) {
                firebaseAuthService$signInWithGoogleToken$1 = (FirebaseAuthService$signInWithGoogleToken$1) cVar;
                int i11 = firebaseAuthService$signInWithGoogleToken$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    firebaseAuthService$signInWithGoogleToken$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = firebaseAuthService$signInWithGoogleToken$1.result;
                    i10 = firebaseAuthService$signInWithGoogleToken$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        if (str != null && !n.m0(str)) {
                            AuthCredential credential = GoogleAuthProvider.getCredential(str, null);
                            credential.getClass();
                            Task<AuthResult> signInWithCredential = this.auth.signInWithCredential(credential);
                            signInWithCredential.getClass();
                            firebaseAuthService$signInWithGoogleToken$1.L$0 = null;
                            firebaseAuthService$signInWithGoogleToken$1.L$1 = null;
                            firebaseAuthService$signInWithGoogleToken$1.label = 1;
                            obj = kj.c.j(signInWithCredential, firebaseAuthService$signInWithGoogleToken$1);
                            xn.a aVar = xn.a.f37986a;
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            return AuthService.AuthResult.Error.InvalidCredentials.INSTANCE;
                        }
                    }
                    additionalUserInfo = ((AuthResult) obj).getAdditionalUserInfo();
                    if (additionalUserInfo == null) {
                        z6 = additionalUserInfo.isNewUser();
                    } else {
                        z6 = false;
                    }
                    jl.a aVar2 = this.analytics;
                    if (!z6) {
                        ((Analytics) aVar2.get()).log(new Analytics.Event.SignedUp(Analytics.Event.AuthMethod.Google));
                    } else {
                        ((Analytics) aVar2.get()).log(new Analytics.Event.SignedIn(Analytics.Event.AuthMethod.Google));
                    }
                    return new AuthService.AuthResult.Success(z6);
                }
            }
            if (i10 == 0) {
            }
            additionalUserInfo = ((AuthResult) obj).getAdditionalUserInfo();
            if (additionalUserInfo == null) {
            }
            jl.a aVar22 = this.analytics;
            if (!z6) {
            }
            return new AuthService.AuthResult.Success(z6);
        } catch (FirebaseException e10) {
            AuthService.AuthResult handleSignInException = handleSignInException(e10);
            if (handleSignInException instanceof AuthService.AuthResult.Error.MultiFactorRequired) {
                this.mfaAuthMethod = Analytics.Event.AuthMethod.Google;
            }
            return handleSignInException;
        }
        firebaseAuthService$signInWithGoogleToken$1 = new FirebaseAuthService$signInWithGoogleToken$1(this, cVar);
        Object obj2 = firebaseAuthService$signInWithGoogleToken$1.result;
        i10 = firebaseAuthService$signInWithGoogleToken$1.label;
    }

    @Override // io.elevenlabs.domain.services.AuthService
    public Object signOut(AuthService.SignOutReason signOutReason, wn.c<? super z> cVar) {
        String str;
        String uid;
        ((Analytics) this.analytics.get()).log(new Analytics.Event.SignedOut(signOutReason, ((Boolean) this.connectivityService.getIsConnected().getValue()).booleanValue()));
        Logger logger = this.logger;
        FirebaseUser currentUser = this.auth.getCurrentUser();
        String str2 = "null";
        if (currentUser == null || (str = currentUser.getUid()) == null) {
            str = "null";
        }
        logger.log(TAG, "signOut called - currentUser.uid: ".concat(str));
        this.lastEmail = null;
        this.lastPassword = null;
        this.mfaAuthMethod = null;
        this.mfaService.clearMfaState();
        this.cache.a();
        this.appDatabase.clearAllTables();
        this.userSharedPreferences.edit().clear().apply();
        eo.k.h0(this.fileService.getCacheDirectory());
        this.auth.signOut();
        Logger logger2 = this.logger;
        FirebaseUser currentUser2 = this.auth.getCurrentUser();
        if (currentUser2 != null && (uid = currentUser2.getUid()) != null) {
            str2 = uid;
        }
        logger2.log(TAG, "signOut completed - currentUser.uid after signOut: ".concat(str2));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // io.elevenlabs.domain.services.AuthService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryAutoSignInAfterCreateUserEmailVerification(wn.c<? super Boolean> cVar) {
        FirebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1 firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1;
        int i10;
        if (cVar instanceof FirebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1) {
            firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1 = (FirebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1) cVar;
            int i11 = firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.label = i11 - Integer.MIN_VALUE;
                Object obj = firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.result;
                i10 = firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    String str = this.lastEmail;
                    String str2 = this.lastPassword;
                    if (str != null && !n.m0(str) && str2 != null && !n.m0(str2)) {
                        firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.L$0 = null;
                        firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.L$1 = null;
                        firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.label = 1;
                        obj = signInWithEmailPassword(str, str2, firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1);
                        Object obj2 = xn.a.f37986a;
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        return Boolean.FALSE;
                    }
                }
                this.lastEmail = null;
                this.lastPassword = null;
                return Boolean.valueOf(((AuthService.AuthResult) obj) instanceof AuthService.AuthResult.Success);
            }
        }
        firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1 = new FirebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1(this, cVar);
        Object obj3 = firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.result;
        i10 = firebaseAuthService$tryAutoSignInAfterCreateUserEmailVerification$1.label;
        if (i10 == 0) {
        }
        this.lastEmail = null;
        this.lastPassword = null;
        return Boolean.valueOf(((AuthService.AuthResult) obj3) instanceof AuthService.AuthResult.Success);
    }

    @Override // io.elevenlabs.domain.services.AuthService
    public ir.i user() {
        return new a1(userOrNull(), 0);
    }

    @Override // io.elevenlabs.domain.services.AuthService
    public ir.i userOrNull() {
        final ir.i iVar = this.firebaseUser;
        final ir.i iVar2 = new ir.i() { // from class: io.elevenlabs.data.services.FirebaseAuthService$userOrNull$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.FirebaseAuthService$userOrNull$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.FirebaseAuthService$userOrNull$$inlined$map$1$2", f = "FirebaseAuthService.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.FirebaseAuthService$userOrNull$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    FirebaseUser firebaseUser;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                Optional optional = (Optional) obj;
                                if (optional != null) {
                                    firebaseUser = (FirebaseUser) optional.orElse(null);
                                } else {
                                    firebaseUser = null;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(firebaseUser, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
        return new ir.i() { // from class: io.elevenlabs.data.services.FirebaseAuthService$userOrNull$$inlined$map$2

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.FirebaseAuthService$userOrNull$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.FirebaseAuthService$userOrNull$$inlined$map$2$2", f = "FirebaseAuthService.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.FirebaseAuthService$userOrNull$$inlined$map$2$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    User user;
                    String str;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                FirebaseUser firebaseUser = (FirebaseUser) obj;
                                if (firebaseUser != null) {
                                    String uid = firebaseUser.getUid();
                                    uid.getClass();
                                    String email = firebaseUser.getEmail();
                                    Uri photoUrl = firebaseUser.getPhotoUrl();
                                    if (photoUrl != null) {
                                        str = photoUrl.toString();
                                    } else {
                                        str = null;
                                    }
                                    user = new User(uid, email, str, firebaseUser.getDisplayName());
                                } else {
                                    user = null;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(user, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
    
        if (r0 == r12) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:13:0x0037, B:14:0x00cb, B:15:0x00cd, B:17:0x00d5, B:19:0x00e5, B:20:0x00f7, B:23:0x00fe, B:25:0x0102, B:27:0x0120, B:28:0x0125, B:32:0x004e, B:33:0x00ab, B:40:0x0076, B:42:0x007a, B:44:0x0084, B:47:0x008a, B:51:0x00ae, B:53:0x00b2, B:55:0x0126, B:56:0x012b), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:13:0x0037, B:14:0x00cb, B:15:0x00cd, B:17:0x00d5, B:19:0x00e5, B:20:0x00f7, B:23:0x00fe, B:25:0x0102, B:27:0x0120, B:28:0x0125, B:32:0x004e, B:33:0x00ab, B:40:0x0076, B:42:0x007a, B:44:0x0084, B:47:0x008a, B:51:0x00ae, B:53:0x00b2, B:55:0x0126, B:56:0x012b), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    @Override // io.elevenlabs.domain.services.AuthService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object verifyMfaCode(String str, wn.c<? super AuthService.AuthResult> cVar) {
        FirebaseAuthService$verifyMfaCode$1 firebaseAuthService$verifyMfaCode$1;
        int i10;
        MfaState mfaState;
        ResolveMultiFactorResult resolveMultiFactorResult;
        try {
            if (cVar instanceof FirebaseAuthService$verifyMfaCode$1) {
                firebaseAuthService$verifyMfaCode$1 = (FirebaseAuthService$verifyMfaCode$1) cVar;
                int i11 = firebaseAuthService$verifyMfaCode$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    firebaseAuthService$verifyMfaCode$1.label = i11 - Integer.MIN_VALUE;
                    FirebaseAuthService$verifyMfaCode$1 firebaseAuthService$verifyMfaCode$12 = firebaseAuthService$verifyMfaCode$1;
                    Object obj = firebaseAuthService$verifyMfaCode$12.result;
                    i10 = firebaseAuthService$verifyMfaCode$12.label;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                sn.a.g(obj);
                                resolveMultiFactorResult = (ResolveMultiFactorResult) obj;
                            } else {
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            sn.a.g(obj);
                            resolveMultiFactorResult = (ResolveMultiFactorResult) obj;
                        }
                    } else {
                        sn.a.g(obj);
                        Object mfaState2 = this.mfaService.getMfaState();
                        if (mfaState2 instanceof MfaState) {
                            mfaState = (MfaState) mfaState2;
                        } else {
                            mfaState = null;
                        }
                        if (mfaState == null) {
                            Logger.logWarning$default(this.logger, TAG, "No MFA state available", null, 4, null);
                            return AuthService.AuthResult.Error.Unknown.INSTANCE;
                        }
                        if (mfaState instanceof MfaState.PhonePending) {
                            this.logger.logError(TAG, "Phone verification not yet initiated", null);
                            return AuthService.AuthResult.Error.Unknown.INSTANCE;
                        }
                        boolean z6 = mfaState instanceof MfaState.Phone;
                        xn.a aVar = xn.a.f37986a;
                        if (z6) {
                            ResolveMultiFactorAuthUseCase resolveMultiFactorAuthUseCase = this.resolveMultiFactorAuthUseCase;
                            Object resolver = ((MfaState.Phone) mfaState).getResolver();
                            String verificationId = ((MfaState.Phone) mfaState).getVerificationId();
                            Logger logger = this.logger;
                            firebaseAuthService$verifyMfaCode$12.L$0 = null;
                            firebaseAuthService$verifyMfaCode$12.L$1 = null;
                            firebaseAuthService$verifyMfaCode$12.label = 1;
                            obj = resolveMultiFactorAuthUseCase.invoke(resolver, verificationId, str, logger, firebaseAuthService$verifyMfaCode$12);
                            if (obj == aVar) {
                            }
                            resolveMultiFactorResult = (ResolveMultiFactorResult) obj;
                        } else if (mfaState instanceof MfaState.Totp) {
                            ResolveTotpMfaUseCase resolveTotpMfaUseCase = this.resolveTotpMfaUseCase;
                            Object resolver2 = ((MfaState.Totp) mfaState).getResolver();
                            Logger logger2 = this.logger;
                            firebaseAuthService$verifyMfaCode$12.L$0 = null;
                            firebaseAuthService$verifyMfaCode$12.L$1 = null;
                            firebaseAuthService$verifyMfaCode$12.label = 2;
                            obj = resolveTotpMfaUseCase.invoke(resolver2, str, logger2, firebaseAuthService$verifyMfaCode$12);
                        } else {
                            throw new RuntimeException();
                        }
                        return aVar;
                    }
                    if (!m.c(resolveMultiFactorResult, ResolveMultiFactorResult.Success.INSTANCE)) {
                        this.logger.log(TAG, "MFA verification successful");
                        this.mfaService.clearMfaState();
                        Analytics.Event.AuthMethod authMethod = this.mfaAuthMethod;
                        if (authMethod != null) {
                            ((Analytics) this.analytics.get()).log(new Analytics.Event.SignedIn(authMethod));
                            this.mfaAuthMethod = null;
                        }
                        return new AuthService.AuthResult.Success(false);
                    }
                    if (resolveMultiFactorResult instanceof ResolveMultiFactorResult.Error) {
                        Logger.logWarning$default(this.logger, TAG, "MFA verification failed: " + resolveMultiFactorResult, null, 4, null);
                        return new AuthService.AuthResult.Error.MultiFactorError((ResolveMultiFactorResult.Error) resolveMultiFactorResult);
                    }
                    throw new RuntimeException();
                }
            }
            if (i10 == 0) {
            }
            if (!m.c(resolveMultiFactorResult, ResolveMultiFactorResult.Success.INSTANCE)) {
            }
        } catch (Exception e10) {
            this.logger.logError(TAG, "MFA verification exception", e10);
            return AuthService.AuthResult.Error.Unknown.INSTANCE;
        }
        firebaseAuthService$verifyMfaCode$1 = new FirebaseAuthService$verifyMfaCode$1(this, cVar);
        FirebaseAuthService$verifyMfaCode$1 firebaseAuthService$verifyMfaCode$122 = firebaseAuthService$verifyMfaCode$1;
        Object obj2 = firebaseAuthService$verifyMfaCode$122.result;
        i10 = firebaseAuthService$verifyMfaCode$122.label;
    }
}

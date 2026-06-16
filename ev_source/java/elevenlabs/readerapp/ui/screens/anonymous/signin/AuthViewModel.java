package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.PasswordValidationResult;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.PasswordValidatorService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.usecase.ValidateHCaptchaResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001d¢\u0006\u0004\b$\u0010\u001fJ\r\u0010%\u001a\u00020\u001d¢\u0006\u0004\b%\u0010\u001fJ\u0019\u0010)\u001a\u00020\u001a2\n\u0010(\u001a\u00060&j\u0002`'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u001d¢\u0006\u0004\b+\u0010\u001fJ\u0015\u0010-\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020 ¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020 ¢\u0006\u0004\b0\u0010.J\u0015\u00103\u001a\u00020\u001a2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u001d¢\u0006\u0004\b5\u0010\u001fJ\r\u00106\u001a\u00020\u001d¢\u0006\u0004\b6\u0010\u001fJ\r\u00107\u001a\u00020\u001d¢\u0006\u0004\b7\u0010\u001fJ\r\u00108\u001a\u00020\u001d¢\u0006\u0004\b8\u0010\u001fJ\u0015\u0010;\u001a\u00020\u001d2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020 ¢\u0006\u0004\b>\u0010.J\r\u0010?\u001a\u00020\u001d¢\u0006\u0004\b?\u0010\u001fJ\u0017\u0010B\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010DR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010LR\u0014\u0010M\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/AuthViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/services/PasswordResetService;", "passwordResetService", "Lio/elevenlabs/domain/services/PasswordValidatorService;", "passwordValidatorService", "Lio/elevenlabs/domain/services/SignUpService;", "signUpService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Ljl/a;Ljl/a;Ljl/a;Lio/elevenlabs/domain/services/PasswordValidatorService;Ljl/a;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;)V", "Lsn/z;", "signInWithDevAccount", "()V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onSignInClick", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "idToken", "onGoogleIdTokenReceived", "(Ljava/lang/String;)V", "onGoogleSignInStarted", "onGoogleSignInCancelled", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exc", "onGoogleSignInError", "(Ljava/lang/Exception;)V", "onForgotPasswordClick", "email", "onEmailChanged", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "password", "onPasswordChanged", "Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;", "hCaptchaResult", "onHCaptchaResult", "(Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;)V", "navigatedToVerifyEmail", "navigatedToMfaVerification", "onAgreeToProductUpdatesToggled", "onAgreeToTermsToggled", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInMode;", "signInMode", "onDefaultSignInModeSet", "(Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInMode;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", DiagnosticsEntry.NAME_KEY, "onNameChanged", "onErrorDismiss", "Lio/elevenlabs/domain/services/AuthService$AuthResult;", "result", "handleAuthResult", "(Lio/elevenlabs/domain/services/AuthService$AuthResult;)V", "Ljl/a;", "Lio/elevenlabs/domain/services/PasswordValidatorService;", "Lio/elevenlabs/domain/Logger;", "getLogger", "()Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthViewModel extends MviViewModel<SignInState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final jl.a authService;
    private final Logger logger;
    private final jl.a passwordResetService;
    private final PasswordValidatorService passwordValidatorService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final jl.a signUpService;
    private final jl.a stringProvider;
    private final String tag;
    private final jl.a toastService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignInMode.values().length];
            try {
                iArr[SignInMode.SIGN_IN_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignInMode.SIGN_UP_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AuthViewModel(DispatcherFactory dispatcherFactory, jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, PasswordValidatorService passwordValidatorService, jl.a aVar5, Logger logger, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        super(new SignInState(null, false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32767, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        passwordValidatorService.getClass();
        aVar5.getClass();
        logger.getClass();
        analytics.getClass();
        resolveErrorMessageUseCase.getClass();
        Logger logger2 = null;
        this.authService = aVar;
        this.stringProvider = aVar2;
        this.toastService = aVar3;
        this.passwordResetService = aVar4;
        this.passwordValidatorService = passwordValidatorService;
        this.signUpService = aVar5;
        this.logger = logger;
        this.analytics = analytics;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.tag = "AuthViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAuthResult(AuthService.AuthResult result) {
        queueStateUpdate(new g(21));
        if (result instanceof AuthService.AuthResult.Success) {
            if (((AuthService.AuthResult.Success) result).isNewUser()) {
                this.analytics.log(Analytics.Event.SignupSignupSuccess.INSTANCE);
            }
            this.analytics.log(Analytics.Event.SignupLoginSuccess.INSTANCE);
            return;
        }
        if (kotlin.jvm.internal.m.c(result, AuthService.AuthResult.Error.InvalidCredentials.INSTANCE)) {
            queueStateUpdate(new a(this, 11));
            return;
        }
        if (kotlin.jvm.internal.m.c(result, AuthService.AuthResult.Error.InvalidEmail.INSTANCE)) {
            queueStateUpdate(new a(this, 1));
            return;
        }
        if (result instanceof AuthService.AuthResult.Error.MultiFactorRequired) {
            queueStateUpdate(new g(12));
            return;
        }
        if (kotlin.jvm.internal.m.c(result, AuthService.AuthResult.Error.Unknown.INSTANCE)) {
            queueStateUpdate(new a(this, 2));
            return;
        }
        if (kotlin.jvm.internal.m.c(result, AuthService.AuthResult.Error.FailedToConnect.INSTANCE)) {
            queueStateUpdate(new a(this, 3));
            return;
        }
        if (kotlin.jvm.internal.m.c(result, AuthService.AuthResult.Error.AccountBanned.INSTANCE)) {
            queueStateUpdate(new a(this, 4));
            return;
        }
        if (kotlin.jvm.internal.m.c(result, AuthService.AuthResult.Error.AccountDeleted.INSTANCE)) {
            queueStateUpdate(new a(this, 5));
            return;
        }
        if (kotlin.jvm.internal.m.c(result, AuthService.AuthResult.Error.AccountNotVerified.INSTANCE)) {
            queueStateUpdate(new a(this, 6));
            return;
        }
        if (kotlin.jvm.internal.m.c(result, AuthService.AuthResult.Error.TooManyRequests.INSTANCE)) {
            queueStateUpdate(new a(this, 7));
            return;
        }
        if (result instanceof AuthService.AuthResult.Error.MultiFactorError) {
            Logger.logWarning$default(this.logger, this.tag, "Unexpected MultiFactorError in initial auth", null, 4, null);
            queueStateUpdate(new a(this, 10));
        } else if (result instanceof AuthService.AuthResult.Error.FirebaseGeneric) {
            queueStateUpdate(new a2.b((AuthService.AuthResult.Error.FirebaseGeneric) result, 29));
        } else {
            c6.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, "", false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32752, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$1(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((StringProvider) authViewModel.stringProvider.get()).getString(R.string.signin_error_invalid_credentials), false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$10(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((StringProvider) authViewModel.stringProvider.get()).getString(R.string.signin_error_unknown), false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$11(AuthService.AuthResult authResult, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((AuthService.AuthResult.Error.FirebaseGeneric) authResult).getMessage(), false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$2(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((StringProvider) authViewModel.stringProvider.get()).getString(R.string.signin_error_invalid_email), false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$3(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, false, null, true, false, 24567, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$4(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((StringProvider) authViewModel.stringProvider.get()).getString(R.string.signin_error_unknown), false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$5(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((StringProvider) authViewModel.stringProvider.get()).getString(R.string.signin_error_network), false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$6(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((StringProvider) authViewModel.stringProvider.get()).getString(R.string.signin_error_account_banned), true, false, false, false, null, null, null, null, null, false, false, null, false, false, 32756, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$7(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((StringProvider) authViewModel.stringProvider.get()).getString(R.string.signin_error_account_deleted), false, true, false, false, null, null, null, null, null, false, false, null, false, false, 32754, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$8(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        authViewModel.logger.log(authViewModel.tag, "Account not verified - moving to confirmation");
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, false, signInState.getEmail(), false, false, 28671, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState handleAuthResult$lambda$9(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, ((StringProvider) authViewModel.stringProvider.get()).getString(R.string.signin_error_too_many_attempts), false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState navigatedToMfaVerification$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, false, null, false, false, 24575, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState navigatedToVerifyEmail$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, false, null, false, false, 28671, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onAgreeToProductUpdatesToggled$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, false, null, false, !signInState.getAgreesToProductUpdates(), 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onAgreeToTermsToggled$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, !signInState.getAgreeToTerms(), null, false, false, 30719, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onDefaultSignInModeSet$lambda$0(SignInMode signInMode, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, signInMode, null, null, null, null, false, false, null, false, false, 32735, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onEmailChanged$lambda$0(String str, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, wq.n.L0(str).toString(), null, null, false, false, null, false, false, 32639, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onErrorDismiss$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, "", false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32760, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onForgotPasswordClick$lambda$0(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        authViewModel.analytics.log(Analytics.Event.SignupClickedForgotPassword.INSTANCE);
        if (signInState.isLoadingPasswordReset()) {
            return signInState;
        }
        g0.D(c1.h(authViewModel), authViewModel.getDispatcherFactory().getIo(), null, new AuthViewModel$onForgotPasswordClick$1$1(authViewModel, signInState, null), 2);
        return SignInState.copy$default(signInState, null, false, false, false, true, null, null, null, null, null, false, false, null, false, false, 32751, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onGoogleSignInCancelled$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onGoogleSignInError$lambda$0(String str, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, str, false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onGoogleSignInStarted$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, "", false, false, true, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onHCaptchaResult$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, false, null, false, false, 31743, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onHCaptchaResult$lambda$1(ValidateHCaptchaResult validateHCaptchaResult, AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        ValidateHCaptchaResult.Error error = (ValidateHCaptchaResult.Error) validateHCaptchaResult;
        if (!ig.f.I(sj.i.CHALLENGE_CLOSED, sj.i.NETWORK_ERROR).contains(error.getException().f31565a)) {
            authViewModel.analytics.log(Analytics.Event.SignupSubmissionError.INSTANCE);
            authViewModel.logger.logWarning(authViewModel.tag, "HCaptcha error", error.getException());
        } else {
            authViewModel.logger.log(authViewModel.tag, "HCaptcha error: " + error.getException());
        }
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onHCaptchaResult$lambda$2(AuthViewModel authViewModel, ValidateHCaptchaResult validateHCaptchaResult, SignInState signInState) {
        signInState.getClass();
        authViewModel.logger.log(authViewModel.tag, "HCaptcha success, signing up");
        g0.D(c1.h(authViewModel), authViewModel.getDispatcherFactory().getIo(), null, new AuthViewModel$onHCaptchaResult$3$1(authViewModel, signInState, validateHCaptchaResult, null), 2);
        return signInState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onNameChanged$lambda$0(String str, SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, str, null, null, null, false, false, null, false, false, 32703, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onPasswordChanged$lambda$0(String str, AuthViewModel authViewModel, SignInState signInState) {
        String str2;
        PasswordValidationResult validate;
        signInState.getClass();
        if (wq.n.m0(str)) {
            validate = null;
            str2 = str;
        } else {
            str2 = str;
            validate = authViewModel.passwordValidatorService.validate(str2);
        }
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, null, str2, validate, false, false, null, false, false, 31999, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState onSignInClick$lambda$0(AuthViewModel authViewModel, SignInState signInState) {
        signInState.getClass();
        if (!signInState.isLoadingAuth()) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[signInState.getMode().ordinal()];
            if (i10 != 1) {
                if (i10 == 2 && !wq.n.m0(signInState.getEmail()) && !wq.n.m0(signInState.getPassword())) {
                    authViewModel.analytics.log(Analytics.Event.SignupSubmitted.INSTANCE);
                    authViewModel.logger.log(authViewModel.tag, "Starting hCaptcha process");
                    return SignInState.copy$default(signInState, null, false, false, true, false, null, null, null, null, null, true, false, null, false, false, 31735, null);
                }
            } else {
                authViewModel.analytics.log(Analytics.Event.SignupLoginSubmitted.INSTANCE);
                g0.D(c1.h(authViewModel), authViewModel.getDispatcherFactory().getIo(), null, new AuthViewModel$onSignInClick$1$1(authViewModel, signInState, null), 2);
                return SignInState.copy$default(signInState, null, false, false, true, false, null, null, null, null, null, false, false, null, false, false, 32759, null);
            }
        }
        return signInState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInState signInWithDevAccount$lambda$0(SignInState signInState) {
        signInState.getClass();
        return SignInState.copy$default(signInState, null, false, false, false, false, null, null, "", "", null, false, false, null, false, false, 32383, null);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final MviViewModel.StateUpdate navigatedToMfaVerification() {
        return queueStateUpdate(new g(15));
    }

    public final MviViewModel.StateUpdate navigatedToVerifyEmail() {
        return queueStateUpdate(new g(20));
    }

    public final MviViewModel.StateUpdate onAgreeToProductUpdatesToggled() {
        return queueStateUpdate(new g(19));
    }

    public final MviViewModel.StateUpdate onAgreeToTermsToggled() {
        return queueStateUpdate(new g(16));
    }

    public final MviViewModel.StateUpdate onDefaultSignInModeSet(SignInMode signInMode) {
        signInMode.getClass();
        return queueStateUpdate(new a2.b(signInMode, 28));
    }

    public final MviViewModel.StateUpdate onEmailChanged(String email) {
        email.getClass();
        return queueStateUpdate(new am.c(email, 6));
    }

    public final MviViewModel.StateUpdate onErrorDismiss() {
        return queueStateUpdate(new g(17));
    }

    public final MviViewModel.StateUpdate onForgotPasswordClick() {
        return queueStateUpdate(new a(this, 9));
    }

    public final void onGoogleIdTokenReceived(String idToken) {
        boolean z6;
        Logger logger = this.logger;
        String str = this.tag;
        if (idToken != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        logger.log(str, "Google token received: isEmpty: " + z6);
        g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new AuthViewModel$onGoogleIdTokenReceived$1(this, idToken, null), 2);
    }

    public final MviViewModel.StateUpdate onGoogleSignInCancelled() {
        return queueStateUpdate(new g(11));
    }

    public final void onGoogleSignInError(Exception exc) {
        String localizedMessage;
        exc.getClass();
        this.logger.logWarning(this.tag, "onGoogleSignInError", exc);
        if (exc instanceof r6.i) {
            localizedMessage = ((StringProvider) this.stringProvider.get()).getString(R.string.signin_error_google_account);
        } else if (exc instanceof r6.f) {
            localizedMessage = ((r6.f) exc).getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = ((StringProvider) this.stringProvider.get()).getString(R.string.signin_error_google_account);
            }
        } else {
            localizedMessage = exc.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = ((StringProvider) this.stringProvider.get()).getString(R.string.signin_error_google_account);
            }
        }
        queueStateUpdate(new am.c(localizedMessage, 5));
    }

    public final MviViewModel.StateUpdate onGoogleSignInStarted() {
        return queueStateUpdate(new g(18));
    }

    public final void onHCaptchaResult(ValidateHCaptchaResult hCaptchaResult) {
        hCaptchaResult.getClass();
        queueStateUpdate(new g(14));
        if (hCaptchaResult instanceof ValidateHCaptchaResult.Error) {
            queueStateUpdate(new f(hCaptchaResult, this));
        } else if (hCaptchaResult instanceof ValidateHCaptchaResult.Success) {
            queueStateUpdate(new f(this, hCaptchaResult));
        } else {
            c6.p();
        }
    }

    public final MviViewModel.StateUpdate onNameChanged(String name) {
        name.getClass();
        return queueStateUpdate(new am.c(name, 4));
    }

    public final MviViewModel.StateUpdate onPasswordChanged(String password) {
        password.getClass();
        return queueStateUpdate(new h(password, this));
    }

    public final MviViewModel.StateUpdate onSignInClick() {
        return queueStateUpdate(new a(this, 8));
    }

    public final void signInWithDevAccount() {
        queueStateUpdate(new g(13));
        onSignInClick();
    }
}

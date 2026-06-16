package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import androidx.lifecycle.c1;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.SignUpService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/verify/VerifyEmailViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/verify/VerifyEmailState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "signUpService", "Lio/elevenlabs/domain/services/SignUpService;", "logger", "Lio/elevenlabs/domain/Logger;", "toastService", "Lio/elevenlabs/domain/services/ToastService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "stringProvider", "Lio/elevenlabs/domain/StringProvider;", "authService", "Lio/elevenlabs/domain/services/AuthService;", "analytics", "Lio/elevenlabs/domain/Analytics;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/SignUpService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/Analytics;)V", "sendVerificationEmail", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onEmailChanged", "email", "", "setVerificationCode", "code", "submitVerificationCode", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VerifyEmailViewModel extends MviViewModel<VerifyEmailState> {
    private static final String TAG = "VerifyEmailViewModel";
    private final Analytics analytics;
    private final AuthService authService;
    private final Logger logger;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final SignUpService signUpService;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerifyEmailViewModel(DispatcherFactory dispatcherFactory, SignUpService signUpService, Logger logger, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, StringProvider stringProvider, AuthService authService, Analytics analytics) {
        super(new VerifyEmailState(false, false, null, null, false, 31, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        signUpService.getClass();
        logger.getClass();
        toastService.getClass();
        resolveErrorMessageUseCase.getClass();
        stringProvider.getClass();
        authService.getClass();
        analytics.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.signUpService = signUpService;
        this.logger = logger;
        this.toastService = toastService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.stringProvider = stringProvider;
        this.authService = authService;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyEmailState onEmailChanged$lambda$0(VerifyEmailViewModel verifyEmailViewModel, String str, VerifyEmailState verifyEmailState) {
        verifyEmailState.getClass();
        verifyEmailViewModel.sendVerificationEmail();
        return VerifyEmailState.copy$default(verifyEmailState, false, false, str, null, false, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyEmailState sendVerificationEmail$lambda$0(VerifyEmailViewModel verifyEmailViewModel, VerifyEmailState verifyEmailState) {
        verifyEmailState.getClass();
        if (verifyEmailState.isLoadingEmailSending()) {
            return verifyEmailState;
        }
        g0.D(c1.h(verifyEmailViewModel), verifyEmailViewModel.getDispatcherFactory().getIo(), null, new VerifyEmailViewModel$sendVerificationEmail$1$1(verifyEmailViewModel, verifyEmailState, null), 2);
        return VerifyEmailState.copy$default(verifyEmailState, true, false, null, null, false, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyEmailState setVerificationCode$lambda$0(String str, VerifyEmailState verifyEmailState) {
        verifyEmailState.getClass();
        return VerifyEmailState.copy$default(verifyEmailState, false, false, null, str, false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyEmailState submitVerificationCode$lambda$0(VerifyEmailViewModel verifyEmailViewModel, VerifyEmailState verifyEmailState) {
        verifyEmailState.getClass();
        if (verifyEmailState.isLoadingEmailSending() || verifyEmailState.isLoadingSubmit() || !verifyEmailState.getCanSubmit()) {
            return verifyEmailState;
        }
        g0.D(c1.h(verifyEmailViewModel), verifyEmailViewModel.getDispatcherFactory().getDefault(), null, new VerifyEmailViewModel$submitVerificationCode$1$1(verifyEmailViewModel, verifyEmailState, null), 2);
        return VerifyEmailState.copy$default(verifyEmailState, false, true, null, null, false, 29, null);
    }

    public final MviViewModel.StateUpdate onEmailChanged(String email) {
        email.getClass();
        return queueStateUpdate(new e(this, email, 3));
    }

    public final MviViewModel.StateUpdate sendVerificationEmail() {
        return queueStateUpdate(new d(this, 1));
    }

    public final MviViewModel.StateUpdate setVerificationCode(String code) {
        code.getClass();
        return queueStateUpdate(new am.c(code, 18));
    }

    public final MviViewModel.StateUpdate submitVerificationCode() {
        return queueStateUpdate(new d(this, 2));
    }
}

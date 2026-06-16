package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import android.app.Activity;
import androidx.lifecycle.c1;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.protobuf.c6;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.MfaState;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.MfaService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.firebase.VerifyPhoneNumberForMfaUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001c\u001a\u00020\u00172\b\b\u0001\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001c\u0010 J\u0015\u0010!\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b$\u0010\u001dJ\r\u0010%\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0014¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-¨\u0006/"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/mfa/MfaVerificationViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/mfa/MfaVerificationState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/MfaService;", "mfaService", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/usecase/firebase/VerifyPhoneNumberForMfaUseCase;", "verifyPhoneNumberForMfaUseCase", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/MfaService;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/usecase/firebase/VerifyPhoneNumberForMfaUseCase;)V", "Landroid/app/Activity;", "activity", "Lcom/google/firebase/auth/MultiFactorResolver;", "resolver", "Lsn/z;", "startPhoneVerification", "(Landroid/app/Activity;Lcom/google/firebase/auth/MultiFactorResolver;)V", "", "message", "showErrorToast", "(Ljava/lang/String;)V", "", "messageRes", "(I)V", "startMfaVerification", "(Landroid/app/Activity;)V", "code", "onSubmitCode", "clearCloseScreenOnSuccessAction", "()V", "onCleared", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/services/MfaService;", "Lio/elevenlabs/domain/services/AuthService;", "Lio/elevenlabs/domain/usecase/firebase/VerifyPhoneNumberForMfaUseCase;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MfaVerificationViewModel extends MviViewModel<MfaVerificationState> {
    private static final String TAG = "MfaViewModel";
    public static final int VERIFICATION_CODE_LENGTH = 6;
    private final AuthService authService;
    private final Logger logger;
    private final MfaService mfaService;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    private final VerifyPhoneNumberForMfaUseCase verifyPhoneNumberForMfaUseCase;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MfaVerificationViewModel(DispatcherFactory dispatcherFactory, ToastService toastService, Logger logger, StringProvider stringProvider, MfaService mfaService, AuthService authService, VerifyPhoneNumberForMfaUseCase verifyPhoneNumberForMfaUseCase) {
        super(new MfaVerificationState(false, false, null, false, 15, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        toastService.getClass();
        logger.getClass();
        stringProvider.getClass();
        mfaService.getClass();
        authService.getClass();
        verifyPhoneNumberForMfaUseCase.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.toastService = toastService;
        this.logger = logger;
        this.stringProvider = stringProvider;
        this.mfaService = mfaService;
        this.authService = authService;
        this.verifyPhoneNumberForMfaUseCase = verifyPhoneNumberForMfaUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaVerificationState clearCloseScreenOnSuccessAction$lambda$0(MfaVerificationState mfaVerificationState) {
        mfaVerificationState.getClass();
        return MfaVerificationState.copy$default(mfaVerificationState, false, false, null, false, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaVerificationState onSubmitCode$lambda$0(MfaVerificationState mfaVerificationState) {
        mfaVerificationState.getClass();
        return MfaVerificationState.copy$default(mfaVerificationState, false, true, null, false, 13, null);
    }

    private final void showErrorToast(String message) {
        ToastService.showToast$default(this.toastService, message, null, ToastService.ToastVariant.ERROR, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaVerificationState startMfaVerification$lambda$0(MfaVerificationState mfaVerificationState) {
        mfaVerificationState.getClass();
        return MfaVerificationState.copy$default(mfaVerificationState, false, false, null, false, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaVerificationState startMfaVerification$lambda$1(MfaState mfaState, MfaVerificationState mfaVerificationState) {
        mfaVerificationState.getClass();
        return MfaVerificationState.copy$default(mfaVerificationState, true, false, mfaState, false, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaVerificationState startMfaVerification$lambda$2(MfaVerificationState mfaVerificationState) {
        mfaVerificationState.getClass();
        return MfaVerificationState.copy$default(mfaVerificationState, false, false, null, false, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaVerificationState startMfaVerification$lambda$3(MfaVerificationState mfaVerificationState) {
        mfaVerificationState.getClass();
        return MfaVerificationState.copy$default(mfaVerificationState, false, false, null, false, 14, null);
    }

    private final void startPhoneVerification(Activity activity, MultiFactorResolver resolver) {
        g0.D(c1.h(this), null, null, new MfaVerificationViewModel$startPhoneVerification$1(this, activity, resolver, null), 3);
    }

    public final void clearCloseScreenOnSuccessAction() {
        this.mfaService.clearMfaState();
        queueStateUpdate(new i(6));
    }

    @Override // io.elevenlabs.readerapp.core.MviViewModel, androidx.lifecycle.j1
    public void onCleared() {
        this.mfaService.clearMfaState();
    }

    public final void onSubmitCode(String code) {
        code.getClass();
        ib.i.q("onSubmitCode called, code length: ", code.length(), "/6", this.logger, TAG);
        if (code.length() != 6) {
            return;
        }
        if (((MfaVerificationState) getStateFlow().getValue()).getMfaState() == null) {
            Logger.logWarning$default(this.logger, TAG, "Missing MFA state", null, 4, null);
        } else {
            queueStateUpdate(new i(7));
            g0.D(c1.h(this), null, null, new MfaVerificationViewModel$onSubmitCode$2(this, code, null), 3);
        }
    }

    public final void startMfaVerification(Activity activity) {
        MfaState mfaState;
        activity.getClass();
        Object mfaState2 = this.mfaService.getMfaState();
        if (mfaState2 instanceof MfaState) {
            mfaState = (MfaState) mfaState2;
        } else {
            mfaState = null;
        }
        if (mfaState == null) {
            this.logger.logError(TAG, "No MFA state available", null);
            showErrorToast(R.string.signin_error_unknown);
            queueStateUpdate(new i(8));
            return;
        }
        queueStateUpdate(new j(mfaState, 3));
        if (mfaState instanceof MfaState.PhonePending) {
            Object resolver = ((MfaState.PhonePending) mfaState).getResolver();
            resolver.getClass();
            startPhoneVerification(activity, (MultiFactorResolver) resolver);
        } else if (mfaState instanceof MfaState.Phone) {
            this.logger.log(TAG, "OTP screen ready for input (Phone)");
            queueStateUpdate(new i(9));
        } else if (mfaState instanceof MfaState.Totp) {
            this.logger.log(TAG, "OTP screen ready for input (TOTP)");
            queueStateUpdate(new i(10));
        } else {
            c6.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorToast(int messageRes) {
        showErrorToast(this.stringProvider.getString(messageRes));
    }
}

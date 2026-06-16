package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import android.app.Activity;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.MfaState;
import io.elevenlabs.domain.services.MfaService;
import io.elevenlabs.domain.usecase.VerifyPhoneNumberResult;
import io.elevenlabs.domain.usecase.firebase.VerifyPhoneNumberForMfaUseCase;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.MfaVerificationViewModel$startPhoneVerification$1", f = "MfaViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class MfaVerificationViewModel$startPhoneVerification$1 extends yn.i implements p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ MultiFactorResolver $resolver;
    int label;
    final /* synthetic */ MfaVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaVerificationViewModel$startPhoneVerification$1(MfaVerificationViewModel mfaVerificationViewModel, Activity activity, MultiFactorResolver multiFactorResolver, wn.c<? super MfaVerificationViewModel$startPhoneVerification$1> cVar) {
        super(2, cVar);
        this.this$0 = mfaVerificationViewModel;
        this.$activity = activity;
        this.$resolver = multiFactorResolver;
    }

    public static final MfaVerificationState invokeSuspend$lambda$0(MfaState.Phone phone, MfaVerificationState mfaVerificationState) {
        return MfaVerificationState.copy$default(mfaVerificationState, false, false, phone, false, 10, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new MfaVerificationViewModel$startPhoneVerification$1(this.this$0, this.$activity, this.$resolver, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((MfaVerificationViewModel$startPhoneVerification$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VerifyPhoneNumberForMfaUseCase verifyPhoneNumberForMfaUseCase;
        Logger logger;
        Logger logger2;
        int i10;
        Logger logger3;
        Logger logger4;
        MfaService mfaService;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            verifyPhoneNumberForMfaUseCase = this.this$0.verifyPhoneNumberForMfaUseCase;
            logger = this.this$0.logger;
            Activity activity = this.$activity;
            MultiFactorResolver multiFactorResolver = this.$resolver;
            this.label = 1;
            obj = verifyPhoneNumberForMfaUseCase.invoke(logger, activity, multiFactorResolver, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        VerifyPhoneNumberResult verifyPhoneNumberResult = (VerifyPhoneNumberResult) obj;
        if (verifyPhoneNumberResult instanceof VerifyPhoneNumberResult.Success.CodeSent) {
            logger4 = this.this$0.logger;
            VerifyPhoneNumberResult.Success.CodeSent codeSent = (VerifyPhoneNumberResult.Success.CodeSent) verifyPhoneNumberResult;
            logger4.log("MfaViewModel", "Phone verification started, ID: " + codeSent.getVerificationId());
            MultiFactorResolver multiFactorResolver2 = this.$resolver;
            multiFactorResolver2.getClass();
            MfaState.Phone phone = new MfaState.Phone(multiFactorResolver2, codeSent.getVerificationId());
            mfaService = this.this$0.mfaService;
            mfaService.storeMfaState(phone);
            this.this$0.queueStateUpdate(new j(phone, 0));
        } else if (verifyPhoneNumberResult instanceof VerifyPhoneNumberResult.Success.AutoVerified) {
            logger3 = this.this$0.logger;
            logger3.log("MfaViewModel", "Phone number auto-verified");
            this.this$0.queueStateUpdate(new i(3));
        } else if (verifyPhoneNumberResult instanceof VerifyPhoneNumberResult.Error) {
            logger2 = this.this$0.logger;
            logger2.logError("MfaViewModel", "Failed to start phone verification: " + verifyPhoneNumberResult, null);
            VerifyPhoneNumberResult.Error error = (VerifyPhoneNumberResult.Error) verifyPhoneNumberResult;
            if (error.equals(VerifyPhoneNumberResult.Error.NoPhoneNumberAvailable.INSTANCE)) {
                i10 = R.string.signin_error_unknown;
            } else if (error.equals(VerifyPhoneNumberResult.Error.InvalidCredentials.INSTANCE)) {
                i10 = R.string.signin_error_invalid_credentials;
            } else if (error.equals(VerifyPhoneNumberResult.Error.TooManyAttempts.INSTANCE)) {
                i10 = R.string.signin_error_too_many_attempts;
            } else if (error.equals(VerifyPhoneNumberResult.Error.Unknown.INSTANCE)) {
                i10 = R.string.signin_error_unknown;
            } else {
                c6.p();
                return null;
            }
            this.this$0.showErrorToast(i10);
            this.this$0.queueStateUpdate(new i(4));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}

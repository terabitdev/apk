package io.elevenlabs.di;

import io.elevenlabs.data.services.FirebaseAuthService;
import io.elevenlabs.data.services.MfaServiceImpl;
import io.elevenlabs.data.usecase.firebase.DetermineMfaTypeUseCaseImpl;
import io.elevenlabs.data.usecase.firebase.ResolveMultiFactorAuthUseCaseImpl;
import io.elevenlabs.data.usecase.firebase.ResolveTotpMfaUseCaseImpl;
import io.elevenlabs.data.usecase.firebase.VerifyPhoneNumberForMfaUseCaseImpl;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.MfaService;
import io.elevenlabs.domain.usecase.firebase.DetermineMfaTypeUseCase;
import io.elevenlabs.domain.usecase.firebase.ResolveMultiFactorAuthUseCase;
import io.elevenlabs.domain.usecase.firebase.ResolveTotpMfaUseCase;
import io.elevenlabs.domain.usecase.firebase.VerifyPhoneNumberForMfaUseCase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0012H'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0015H'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0018H'¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/di/AuthModule;", "", "<init>", "()V", "bindAuthService", "Lio/elevenlabs/domain/services/AuthService;", "firebaseAuthService", "Lio/elevenlabs/data/services/FirebaseAuthService;", "bindMfaService", "Lio/elevenlabs/domain/services/MfaService;", "mfaServiceImpl", "Lio/elevenlabs/data/services/MfaServiceImpl;", "bindDetermineMfaTypeUseCase", "Lio/elevenlabs/domain/usecase/firebase/DetermineMfaTypeUseCase;", "impl", "Lio/elevenlabs/data/usecase/firebase/DetermineMfaTypeUseCaseImpl;", "bindResolveMultiFactorAuthUseCase", "Lio/elevenlabs/domain/usecase/firebase/ResolveMultiFactorAuthUseCase;", "Lio/elevenlabs/data/usecase/firebase/ResolveMultiFactorAuthUseCaseImpl;", "bindResolveTotpMfaUseCase", "Lio/elevenlabs/domain/usecase/firebase/ResolveTotpMfaUseCase;", "Lio/elevenlabs/data/usecase/firebase/ResolveTotpMfaUseCaseImpl;", "bindVerifyPhoneNumberForMfaUseCase", "Lio/elevenlabs/domain/usecase/firebase/VerifyPhoneNumberForMfaUseCase;", "Lio/elevenlabs/data/usecase/firebase/VerifyPhoneNumberForMfaUseCaseImpl;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class AuthModule {
    public abstract AuthService bindAuthService(FirebaseAuthService firebaseAuthService);

    public abstract DetermineMfaTypeUseCase bindDetermineMfaTypeUseCase(DetermineMfaTypeUseCaseImpl impl);

    public abstract MfaService bindMfaService(MfaServiceImpl mfaServiceImpl);

    public abstract ResolveMultiFactorAuthUseCase bindResolveMultiFactorAuthUseCase(ResolveMultiFactorAuthUseCaseImpl impl);

    public abstract ResolveTotpMfaUseCase bindResolveTotpMfaUseCase(ResolveTotpMfaUseCaseImpl impl);

    public abstract VerifyPhoneNumberForMfaUseCase bindVerifyPhoneNumberForMfaUseCase(VerifyPhoneNumberForMfaUseCaseImpl impl);
}

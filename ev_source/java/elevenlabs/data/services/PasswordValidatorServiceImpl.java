package io.elevenlabs.data.services;

import io.elevenlabs.domain.model.PasswordValidationResult;
import io.elevenlabs.domain.services.PasswordValidatorService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/data/services/PasswordValidatorServiceImpl;", "Lio/elevenlabs/domain/services/PasswordValidatorService;", "<init>", "()V", "", "password", "Lio/elevenlabs/domain/model/PasswordValidationResult;", "validate", "(Ljava/lang/String;)Lio/elevenlabs/domain/model/PasswordValidationResult;", "Lwq/l;", "letterRegex", "Lwq/l;", "digitRegex", "specialRegex", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PasswordValidatorServiceImpl implements PasswordValidatorService {
    private final wq.l letterRegex = new wq.l("[A-Za-z]");
    private final wq.l digitRegex = new wq.l("[0-9]");
    private final wq.l specialRegex = new wq.l("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]");

    @Override // io.elevenlabs.domain.services.PasswordValidatorService
    public PasswordValidationResult validate(String password) {
        boolean z6;
        password.getClass();
        boolean a10 = this.letterRegex.a(password);
        if (password.length() >= 8 && a10) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new PasswordValidationResult(z6, this.digitRegex.a(password), this.specialRegex.a(password));
    }
}

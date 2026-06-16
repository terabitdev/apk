package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/PasswordValidationResult;", "", "hasMinLengthAndLetter", "", "hasDigit", "hasSpecial", "<init>", "(ZZZ)V", "getHasMinLengthAndLetter", "()Z", "getHasDigit", "getHasSpecial", "isValid", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class PasswordValidationResult {
    private final boolean hasDigit;
    private final boolean hasMinLengthAndLetter;
    private final boolean hasSpecial;

    public PasswordValidationResult(boolean z6, boolean z10, boolean z11) {
        this.hasMinLengthAndLetter = z6;
        this.hasDigit = z10;
        this.hasSpecial = z11;
    }

    public static /* synthetic */ PasswordValidationResult copy$default(PasswordValidationResult passwordValidationResult, boolean z6, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = passwordValidationResult.hasMinLengthAndLetter;
        }
        if ((i10 & 2) != 0) {
            z10 = passwordValidationResult.hasDigit;
        }
        if ((i10 & 4) != 0) {
            z11 = passwordValidationResult.hasSpecial;
        }
        return passwordValidationResult.copy(z6, z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasMinLengthAndLetter() {
        return this.hasMinLengthAndLetter;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasDigit() {
        return this.hasDigit;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasSpecial() {
        return this.hasSpecial;
    }

    public final PasswordValidationResult copy(boolean hasMinLengthAndLetter, boolean hasDigit, boolean hasSpecial) {
        return new PasswordValidationResult(hasMinLengthAndLetter, hasDigit, hasSpecial);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PasswordValidationResult)) {
            return false;
        }
        PasswordValidationResult passwordValidationResult = (PasswordValidationResult) other;
        if (this.hasMinLengthAndLetter == passwordValidationResult.hasMinLengthAndLetter && this.hasDigit == passwordValidationResult.hasDigit && this.hasSpecial == passwordValidationResult.hasSpecial) {
            return true;
        }
        return false;
    }

    public final boolean getHasDigit() {
        return this.hasDigit;
    }

    public final boolean getHasMinLengthAndLetter() {
        return this.hasMinLengthAndLetter;
    }

    public final boolean getHasSpecial() {
        return this.hasSpecial;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasSpecial) + b.f(Boolean.hashCode(this.hasMinLengthAndLetter) * 31, 31, this.hasDigit);
    }

    public final boolean isValid() {
        if (this.hasMinLengthAndLetter && this.hasDigit && this.hasSpecial) {
            return true;
        }
        return false;
    }

    public String toString() {
        boolean z6 = this.hasMinLengthAndLetter;
        boolean z10 = this.hasDigit;
        boolean z11 = this.hasSpecial;
        StringBuilder sb = new StringBuilder("PasswordValidationResult(hasMinLengthAndLetter=");
        sb.append(z6);
        sb.append(", hasDigit=");
        sb.append(z10);
        sb.append(", hasSpecial=");
        return n.j(Separators.RPAREN, sb, z11);
    }
}

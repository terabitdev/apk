package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.MfaState;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/mfa/MfaVerificationState;", "", "isInitializing", "", "isLoadingVerifyingCode", "mfaState", "Lio/elevenlabs/domain/model/MfaState;", "closeScreenOnSuccess", "<init>", "(ZZLio/elevenlabs/domain/model/MfaState;Z)V", "()Z", "getMfaState", "()Lio/elevenlabs/domain/model/MfaState;", "getCloseScreenOnSuccess", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class MfaVerificationState {
    public static final int $stable = 8;
    private final boolean closeScreenOnSuccess;
    private final boolean isInitializing;
    private final boolean isLoadingVerifyingCode;
    private final MfaState mfaState;

    public /* synthetic */ MfaVerificationState(boolean z6, boolean z10, MfaState mfaState, boolean z11, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? true : z6, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : mfaState, (i10 & 8) != 0 ? false : z11);
    }

    public static /* synthetic */ MfaVerificationState copy$default(MfaVerificationState mfaVerificationState, boolean z6, boolean z10, MfaState mfaState, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = mfaVerificationState.isInitializing;
        }
        if ((i10 & 2) != 0) {
            z10 = mfaVerificationState.isLoadingVerifyingCode;
        }
        if ((i10 & 4) != 0) {
            mfaState = mfaVerificationState.mfaState;
        }
        if ((i10 & 8) != 0) {
            z11 = mfaVerificationState.closeScreenOnSuccess;
        }
        return mfaVerificationState.copy(z6, z10, mfaState, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsInitializing() {
        return this.isInitializing;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingVerifyingCode() {
        return this.isLoadingVerifyingCode;
    }

    /* renamed from: component3, reason: from getter */
    public final MfaState getMfaState() {
        return this.mfaState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCloseScreenOnSuccess() {
        return this.closeScreenOnSuccess;
    }

    public final MfaVerificationState copy(boolean isInitializing, boolean isLoadingVerifyingCode, MfaState mfaState, boolean closeScreenOnSuccess) {
        return new MfaVerificationState(isInitializing, isLoadingVerifyingCode, mfaState, closeScreenOnSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaVerificationState)) {
            return false;
        }
        MfaVerificationState mfaVerificationState = (MfaVerificationState) other;
        if (this.isInitializing == mfaVerificationState.isInitializing && this.isLoadingVerifyingCode == mfaVerificationState.isLoadingVerifyingCode && m.c(this.mfaState, mfaVerificationState.mfaState) && this.closeScreenOnSuccess == mfaVerificationState.closeScreenOnSuccess) {
            return true;
        }
        return false;
    }

    public final boolean getCloseScreenOnSuccess() {
        return this.closeScreenOnSuccess;
    }

    public final MfaState getMfaState() {
        return this.mfaState;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(Boolean.hashCode(this.isInitializing) * 31, 31, this.isLoadingVerifyingCode);
        MfaState mfaState = this.mfaState;
        if (mfaState == null) {
            hashCode = 0;
        } else {
            hashCode = mfaState.hashCode();
        }
        return Boolean.hashCode(this.closeScreenOnSuccess) + ((f10 + hashCode) * 31);
    }

    public final boolean isInitializing() {
        return this.isInitializing;
    }

    public final boolean isLoadingVerifyingCode() {
        return this.isLoadingVerifyingCode;
    }

    public String toString() {
        return "MfaVerificationState(isInitializing=" + this.isInitializing + ", isLoadingVerifyingCode=" + this.isLoadingVerifyingCode + ", mfaState=" + this.mfaState + ", closeScreenOnSuccess=" + this.closeScreenOnSuccess + Separators.RPAREN;
    }

    public MfaVerificationState(boolean z6, boolean z10, MfaState mfaState, boolean z11) {
        this.isInitializing = z6;
        this.isLoadingVerifyingCode = z10;
        this.mfaState = mfaState;
        this.closeScreenOnSuccess = z11;
    }

    public MfaVerificationState() {
        this(false, false, null, false, 15, null);
    }
}

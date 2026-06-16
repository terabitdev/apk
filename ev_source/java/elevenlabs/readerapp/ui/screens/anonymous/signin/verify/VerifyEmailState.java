package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/verify/VerifyEmailState;", "", "isLoadingEmailSending", "", "isLoadingSubmit", "email", "", "verificationCode", "navigateToSignIn", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Z)V", "()Z", "getEmail", "()Ljava/lang/String;", "getVerificationCode", "getNavigateToSignIn", "canSubmit", "getCanSubmit", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class VerifyEmailState {
    public static final int $stable = 0;
    private static final int CODE_LENGTH = 6;
    private final boolean canSubmit;
    private final String email;
    private final boolean isLoadingEmailSending;
    private final boolean isLoadingSubmit;
    private final boolean navigateToSignIn;
    private final String verificationCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ VerifyEmailState(boolean z6, boolean z10, String str, String str2, boolean z11, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, z10, str, str2, r8);
        boolean z12;
        z6 = (i10 & 1) != 0 ? false : z6;
        z10 = (i10 & 2) != 0 ? false : z10;
        str = (i10 & 4) != 0 ? "" : str;
        str2 = (i10 & 8) != 0 ? "" : str2;
        if ((i10 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
    }

    public static /* synthetic */ VerifyEmailState copy$default(VerifyEmailState verifyEmailState, boolean z6, boolean z10, String str, String str2, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = verifyEmailState.isLoadingEmailSending;
        }
        if ((i10 & 2) != 0) {
            z10 = verifyEmailState.isLoadingSubmit;
        }
        if ((i10 & 4) != 0) {
            str = verifyEmailState.email;
        }
        if ((i10 & 8) != 0) {
            str2 = verifyEmailState.verificationCode;
        }
        if ((i10 & 16) != 0) {
            z11 = verifyEmailState.navigateToSignIn;
        }
        boolean z12 = z11;
        String str3 = str;
        return verifyEmailState.copy(z6, z10, str3, str2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoadingEmailSending() {
        return this.isLoadingEmailSending;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingSubmit() {
        return this.isLoadingSubmit;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVerificationCode() {
        return this.verificationCode;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getNavigateToSignIn() {
        return this.navigateToSignIn;
    }

    public final VerifyEmailState copy(boolean isLoadingEmailSending, boolean isLoadingSubmit, String email, String verificationCode, boolean navigateToSignIn) {
        email.getClass();
        verificationCode.getClass();
        return new VerifyEmailState(isLoadingEmailSending, isLoadingSubmit, email, verificationCode, navigateToSignIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyEmailState)) {
            return false;
        }
        VerifyEmailState verifyEmailState = (VerifyEmailState) other;
        if (this.isLoadingEmailSending == verifyEmailState.isLoadingEmailSending && this.isLoadingSubmit == verifyEmailState.isLoadingSubmit && m.c(this.email, verifyEmailState.email) && m.c(this.verificationCode, verifyEmailState.verificationCode) && this.navigateToSignIn == verifyEmailState.navigateToSignIn) {
            return true;
        }
        return false;
    }

    public final boolean getCanSubmit() {
        return this.canSubmit;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getNavigateToSignIn() {
        return this.navigateToSignIn;
    }

    public final String getVerificationCode() {
        return this.verificationCode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.navigateToSignIn) + j0.c.c(j0.c.c(com.google.android.gms.internal.play_billing.b.f(Boolean.hashCode(this.isLoadingEmailSending) * 31, 31, this.isLoadingSubmit), 31, this.email), 31, this.verificationCode);
    }

    public final boolean isLoadingEmailSending() {
        return this.isLoadingEmailSending;
    }

    public final boolean isLoadingSubmit() {
        return this.isLoadingSubmit;
    }

    public String toString() {
        boolean z6 = this.isLoadingEmailSending;
        boolean z10 = this.isLoadingSubmit;
        String str = this.email;
        String str2 = this.verificationCode;
        boolean z11 = this.navigateToSignIn;
        StringBuilder sb = new StringBuilder("VerifyEmailState(isLoadingEmailSending=");
        sb.append(z6);
        sb.append(", isLoadingSubmit=");
        sb.append(z10);
        sb.append(", email=");
        defpackage.f.x(sb, str, ", verificationCode=", str2, ", navigateToSignIn=");
        return n.j(Separators.RPAREN, sb, z11);
    }

    public VerifyEmailState(boolean z6, boolean z10, String str, String str2, boolean z11) {
        str.getClass();
        str2.getClass();
        this.isLoadingEmailSending = z6;
        this.isLoadingSubmit = z10;
        this.email = str;
        this.verificationCode = str2;
        this.navigateToSignIn = z11;
        this.canSubmit = str2.length() == 6;
    }

    public VerifyEmailState() {
        this(false, false, null, null, false, 31, null);
    }
}

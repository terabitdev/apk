package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.domain.model.PasswordValidationResult;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J£\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\u0014\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020;HÖ\u0081\u0004J\n\u0010<\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010\u0019¨\u0006="}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInState;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "isAccountBanned", "", "isAccountDeleted", "isLoadingAuth", "isLoadingPasswordReset", "mode", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInMode;", DiagnosticsEntry.NAME_KEY, "email", "password", "passwordValidationResult", "Lio/elevenlabs/domain/model/PasswordValidationResult;", "showHCaptcha", "agreeToTerms", "navigateToEmailVerification", "navigateToMfaVerification", "agreesToProductUpdates", "<init>", "(Ljava/lang/String;ZZZZLio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/PasswordValidationResult;ZZLjava/lang/String;ZZ)V", "getError", "()Ljava/lang/String;", "()Z", "getMode", "()Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInMode;", "getName", "getEmail", "getPassword", "getPasswordValidationResult", "()Lio/elevenlabs/domain/model/PasswordValidationResult;", "getShowHCaptcha", "getAgreeToTerms", "getNavigateToEmailVerification", "getNavigateToMfaVerification", "getAgreesToProductUpdates", "canSubmitSignUp", "getCanSubmitSignUp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SignInState {
    public static final int $stable = 8;
    private final boolean agreeToTerms;
    private final boolean agreesToProductUpdates;
    private final String email;
    private final String error;
    private final boolean isAccountBanned;
    private final boolean isAccountDeleted;
    private final boolean isLoadingAuth;
    private final boolean isLoadingPasswordReset;
    private final SignInMode mode;
    private final String name;
    private final String navigateToEmailVerification;
    private final boolean navigateToMfaVerification;
    private final String password;
    private final PasswordValidationResult passwordValidationResult;
    private final boolean showHCaptcha;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SignInState(String str, boolean z6, boolean z10, boolean z11, boolean z12, SignInMode signInMode, String str2, String str3, String str4, PasswordValidationResult passwordValidationResult, boolean z13, boolean z14, String str5, boolean z15, boolean z16, int i10, kotlin.jvm.internal.f fVar) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r2, r11, r13, r14, r12, r15, r32);
        String str6;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        SignInMode signInMode2;
        String str7;
        String str8;
        PasswordValidationResult passwordValidationResult2;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        if ((i10 & 1) != 0) {
            str6 = "";
        } else {
            str6 = str;
        }
        if ((i10 & 2) != 0) {
            z17 = false;
        } else {
            z17 = z6;
        }
        if ((i10 & 4) != 0) {
            z18 = false;
        } else {
            z18 = z10;
        }
        if ((i10 & 8) != 0) {
            z19 = false;
        } else {
            z19 = z11;
        }
        if ((i10 & 16) != 0) {
            z20 = false;
        } else {
            z20 = z12;
        }
        if ((i10 & 32) != 0) {
            signInMode2 = SignInMode.INTRO;
        } else {
            signInMode2 = signInMode;
        }
        if ((i10 & 64) != 0) {
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i10 & 128) != 0) {
            str8 = "";
        } else {
            str8 = str3;
        }
        String str9 = (i10 & RpcError.MAX_MESSAGE_BYTES) == 0 ? str4 : "";
        if ((i10 & 512) != 0) {
            passwordValidationResult2 = null;
        } else {
            passwordValidationResult2 = passwordValidationResult;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z21 = false;
        } else {
            z21 = z13;
        }
        if ((i10 & 2048) != 0) {
            z22 = false;
        } else {
            z22 = z14;
        }
        String str10 = (i10 & 4096) == 0 ? str5 : null;
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z23 = false;
        } else {
            z23 = z15;
        }
        if ((i10 & 16384) != 0) {
            z24 = false;
        } else {
            z24 = z16;
        }
    }

    public static /* synthetic */ SignInState copy$default(SignInState signInState, String str, boolean z6, boolean z10, boolean z11, boolean z12, SignInMode signInMode, String str2, String str3, String str4, PasswordValidationResult passwordValidationResult, boolean z13, boolean z14, String str5, boolean z15, boolean z16, int i10, Object obj) {
        String str6;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        SignInMode signInMode2;
        String str7;
        String str8;
        String str9;
        PasswordValidationResult passwordValidationResult2;
        boolean z21;
        boolean z22;
        String str10;
        boolean z23;
        boolean z24;
        if ((i10 & 1) != 0) {
            str6 = signInState.error;
        } else {
            str6 = str;
        }
        if ((i10 & 2) != 0) {
            z17 = signInState.isAccountBanned;
        } else {
            z17 = z6;
        }
        if ((i10 & 4) != 0) {
            z18 = signInState.isAccountDeleted;
        } else {
            z18 = z10;
        }
        if ((i10 & 8) != 0) {
            z19 = signInState.isLoadingAuth;
        } else {
            z19 = z11;
        }
        if ((i10 & 16) != 0) {
            z20 = signInState.isLoadingPasswordReset;
        } else {
            z20 = z12;
        }
        if ((i10 & 32) != 0) {
            signInMode2 = signInState.mode;
        } else {
            signInMode2 = signInMode;
        }
        if ((i10 & 64) != 0) {
            str7 = signInState.name;
        } else {
            str7 = str2;
        }
        if ((i10 & 128) != 0) {
            str8 = signInState.email;
        } else {
            str8 = str3;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str9 = signInState.password;
        } else {
            str9 = str4;
        }
        if ((i10 & 512) != 0) {
            passwordValidationResult2 = signInState.passwordValidationResult;
        } else {
            passwordValidationResult2 = passwordValidationResult;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z21 = signInState.showHCaptcha;
        } else {
            z21 = z13;
        }
        if ((i10 & 2048) != 0) {
            z22 = signInState.agreeToTerms;
        } else {
            z22 = z14;
        }
        if ((i10 & 4096) != 0) {
            str10 = signInState.navigateToEmailVerification;
        } else {
            str10 = str5;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z23 = signInState.navigateToMfaVerification;
        } else {
            z23 = z15;
        }
        if ((i10 & 16384) != 0) {
            z24 = signInState.agreesToProductUpdates;
        } else {
            z24 = z16;
        }
        return signInState.copy(str6, z17, z18, z19, z20, signInMode2, str7, str8, str9, passwordValidationResult2, z21, z22, str10, z23, z24);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component10, reason: from getter */
    public final PasswordValidationResult getPasswordValidationResult() {
        return this.passwordValidationResult;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowHCaptcha() {
        return this.showHCaptcha;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getAgreeToTerms() {
        return this.agreeToTerms;
    }

    /* renamed from: component13, reason: from getter */
    public final String getNavigateToEmailVerification() {
        return this.navigateToEmailVerification;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getNavigateToMfaVerification() {
        return this.navigateToMfaVerification;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getAgreesToProductUpdates() {
        return this.agreesToProductUpdates;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAccountBanned() {
        return this.isAccountBanned;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAccountDeleted() {
        return this.isAccountDeleted;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoadingAuth() {
        return this.isLoadingAuth;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoadingPasswordReset() {
        return this.isLoadingPasswordReset;
    }

    /* renamed from: component6, reason: from getter */
    public final SignInMode getMode() {
        return this.mode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final SignInState copy(String r17, boolean isAccountBanned, boolean isAccountDeleted, boolean isLoadingAuth, boolean isLoadingPasswordReset, SignInMode mode, String r23, String email, String password, PasswordValidationResult passwordValidationResult, boolean showHCaptcha, boolean agreeToTerms, String navigateToEmailVerification, boolean navigateToMfaVerification, boolean agreesToProductUpdates) {
        r17.getClass();
        mode.getClass();
        r23.getClass();
        email.getClass();
        password.getClass();
        return new SignInState(r17, isAccountBanned, isAccountDeleted, isLoadingAuth, isLoadingPasswordReset, mode, r23, email, password, passwordValidationResult, showHCaptcha, agreeToTerms, navigateToEmailVerification, navigateToMfaVerification, agreesToProductUpdates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignInState)) {
            return false;
        }
        SignInState signInState = (SignInState) other;
        if (kotlin.jvm.internal.m.c(this.error, signInState.error) && this.isAccountBanned == signInState.isAccountBanned && this.isAccountDeleted == signInState.isAccountDeleted && this.isLoadingAuth == signInState.isLoadingAuth && this.isLoadingPasswordReset == signInState.isLoadingPasswordReset && this.mode == signInState.mode && kotlin.jvm.internal.m.c(this.name, signInState.name) && kotlin.jvm.internal.m.c(this.email, signInState.email) && kotlin.jvm.internal.m.c(this.password, signInState.password) && kotlin.jvm.internal.m.c(this.passwordValidationResult, signInState.passwordValidationResult) && this.showHCaptcha == signInState.showHCaptcha && this.agreeToTerms == signInState.agreeToTerms && kotlin.jvm.internal.m.c(this.navigateToEmailVerification, signInState.navigateToEmailVerification) && this.navigateToMfaVerification == signInState.navigateToMfaVerification && this.agreesToProductUpdates == signInState.agreesToProductUpdates) {
            return true;
        }
        return false;
    }

    public final boolean getAgreeToTerms() {
        return this.agreeToTerms;
    }

    public final boolean getAgreesToProductUpdates() {
        return this.agreesToProductUpdates;
    }

    public final boolean getCanSubmitSignUp() {
        PasswordValidationResult passwordValidationResult;
        if (!wq.n.m0(this.email) && !wq.n.m0(this.password) && this.agreeToTerms && (passwordValidationResult = this.passwordValidationResult) != null && passwordValidationResult.isValid()) {
            return true;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getError() {
        return this.error;
    }

    public final SignInMode getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNavigateToEmailVerification() {
        return this.navigateToEmailVerification;
    }

    public final boolean getNavigateToMfaVerification() {
        return this.navigateToMfaVerification;
    }

    public final String getPassword() {
        return this.password;
    }

    public final PasswordValidationResult getPasswordValidationResult() {
        return this.passwordValidationResult;
    }

    public final boolean getShowHCaptcha() {
        return this.showHCaptcha;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(j0.c.c(j0.c.c((this.mode.hashCode() + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(this.error.hashCode() * 31, 31, this.isAccountBanned), 31, this.isAccountDeleted), 31, this.isLoadingAuth), 31, this.isLoadingPasswordReset)) * 31, 31, this.name), 31, this.email), 31, this.password);
        PasswordValidationResult passwordValidationResult = this.passwordValidationResult;
        int i10 = 0;
        if (passwordValidationResult == null) {
            hashCode = 0;
        } else {
            hashCode = passwordValidationResult.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((c5 + hashCode) * 31, 31, this.showHCaptcha), 31, this.agreeToTerms);
        String str = this.navigateToEmailVerification;
        if (str != null) {
            i10 = str.hashCode();
        }
        return Boolean.hashCode(this.agreesToProductUpdates) + com.google.android.gms.internal.play_billing.b.f((f10 + i10) * 31, 31, this.navigateToMfaVerification);
    }

    public final boolean isAccountBanned() {
        return this.isAccountBanned;
    }

    public final boolean isAccountDeleted() {
        return this.isAccountDeleted;
    }

    public final boolean isLoadingAuth() {
        return this.isLoadingAuth;
    }

    public final boolean isLoadingPasswordReset() {
        return this.isLoadingPasswordReset;
    }

    public String toString() {
        String str = this.error;
        boolean z6 = this.isAccountBanned;
        boolean z10 = this.isAccountDeleted;
        boolean z11 = this.isLoadingAuth;
        boolean z12 = this.isLoadingPasswordReset;
        SignInMode signInMode = this.mode;
        String str2 = this.name;
        String str3 = this.email;
        String str4 = this.password;
        PasswordValidationResult passwordValidationResult = this.passwordValidationResult;
        boolean z13 = this.showHCaptcha;
        boolean z14 = this.agreeToTerms;
        String str5 = this.navigateToEmailVerification;
        boolean z15 = this.navigateToMfaVerification;
        boolean z16 = this.agreesToProductUpdates;
        StringBuilder sb = new StringBuilder("SignInState(error=");
        sb.append(str);
        sb.append(", isAccountBanned=");
        sb.append(z6);
        sb.append(", isAccountDeleted=");
        ib.i.t(sb, z10, ", isLoadingAuth=", z11, ", isLoadingPasswordReset=");
        sb.append(z12);
        sb.append(", mode=");
        sb.append(signInMode);
        sb.append(", name=");
        defpackage.f.x(sb, str2, ", email=", str3, ", password=");
        sb.append(str4);
        sb.append(", passwordValidationResult=");
        sb.append(passwordValidationResult);
        sb.append(", showHCaptcha=");
        ib.i.t(sb, z13, ", agreeToTerms=", z14, ", navigateToEmailVerification=");
        defpackage.f.y(sb, str5, ", navigateToMfaVerification=", z15, ", agreesToProductUpdates=");
        return p.n.j(Separators.RPAREN, sb, z16);
    }

    public SignInState(String str, boolean z6, boolean z10, boolean z11, boolean z12, SignInMode signInMode, String str2, String str3, String str4, PasswordValidationResult passwordValidationResult, boolean z13, boolean z14, String str5, boolean z15, boolean z16) {
        str.getClass();
        signInMode.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.error = str;
        this.isAccountBanned = z6;
        this.isAccountDeleted = z10;
        this.isLoadingAuth = z11;
        this.isLoadingPasswordReset = z12;
        this.mode = signInMode;
        this.name = str2;
        this.email = str3;
        this.password = str4;
        this.passwordValidationResult = passwordValidationResult;
        this.showHCaptcha = z13;
        this.agreeToTerms = z14;
        this.navigateToEmailVerification = str5;
        this.navigateToMfaVerification = z15;
        this.agreesToProductUpdates = z16;
    }

    public SignInState() {
        this(null, false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32767, null);
    }
}

package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.model.User;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u007f\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0014\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u000200HÖ\u0081\u0004J\n\u00101\u001a\u00020\fHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001c¨\u00062"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountState;", "", "user", "Lio/elevenlabs/domain/model/User;", "isLoadingPasswordReset", "", "config", "Lio/elevenlabs/domain/model/AppConfig;", "page", "Lio/elevenlabs/domain/model/AccountPage;", "isLoading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "isScreenVisible", "showSignOutConfirmDialog", "showSignOutWarningSheet", "showCustomerCenter", "pendingCustomerCenterAction", "<init>", "(Lio/elevenlabs/domain/model/User;ZLio/elevenlabs/domain/model/AppConfig;Lio/elevenlabs/domain/model/AccountPage;ZLjava/lang/String;ZZZZLjava/lang/String;)V", "getUser", "()Lio/elevenlabs/domain/model/User;", "()Z", "getConfig", "()Lio/elevenlabs/domain/model/AppConfig;", "getPage", "()Lio/elevenlabs/domain/model/AccountPage;", "getError", "()Ljava/lang/String;", "getShowSignOutConfirmDialog", "getShowSignOutWarningSheet", "getShowCustomerCenter", "getPendingCustomerCenterAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AccountState {
    public static final int $stable = 8;
    private final AppConfig config;
    private final String error;
    private final boolean isLoading;
    private final boolean isLoadingPasswordReset;
    private final boolean isScreenVisible;
    private final AccountPage page;
    private final String pendingCustomerCenterAction;
    private final boolean showCustomerCenter;
    private final boolean showSignOutConfirmDialog;
    private final boolean showSignOutWarningSheet;
    private final User user;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AccountState(User user, boolean z6, AppConfig appConfig, AccountPage accountPage, boolean z10, String str, boolean z11, boolean z12, boolean z13, boolean z14, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this(user, z6, appConfig, accountPage, z10, str, z11, z12, z13, z14, r14);
        String str3;
        user = (i10 & 1) != 0 ? null : user;
        z6 = (i10 & 2) != 0 ? false : z6;
        appConfig = (i10 & 4) != 0 ? null : appConfig;
        accountPage = (i10 & 8) != 0 ? null : accountPage;
        z10 = (i10 & 16) != 0 ? true : z10;
        str = (i10 & 32) != 0 ? "" : str;
        z11 = (i10 & 64) != 0 ? false : z11;
        z12 = (i10 & 128) != 0 ? false : z12;
        z13 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? false : z13;
        z14 = (i10 & 512) != 0 ? false : z14;
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
    }

    public static /* synthetic */ AccountState copy$default(AccountState accountState, User user, boolean z6, AppConfig appConfig, AccountPage accountPage, boolean z10, String str, boolean z11, boolean z12, boolean z13, boolean z14, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            user = accountState.user;
        }
        if ((i10 & 2) != 0) {
            z6 = accountState.isLoadingPasswordReset;
        }
        if ((i10 & 4) != 0) {
            appConfig = accountState.config;
        }
        if ((i10 & 8) != 0) {
            accountPage = accountState.page;
        }
        if ((i10 & 16) != 0) {
            z10 = accountState.isLoading;
        }
        if ((i10 & 32) != 0) {
            str = accountState.error;
        }
        if ((i10 & 64) != 0) {
            z11 = accountState.isScreenVisible;
        }
        if ((i10 & 128) != 0) {
            z12 = accountState.showSignOutConfirmDialog;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            z13 = accountState.showSignOutWarningSheet;
        }
        if ((i10 & 512) != 0) {
            z14 = accountState.showCustomerCenter;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str2 = accountState.pendingCustomerCenterAction;
        }
        boolean z15 = z14;
        String str3 = str2;
        boolean z16 = z12;
        boolean z17 = z13;
        String str4 = str;
        boolean z18 = z11;
        boolean z19 = z10;
        AppConfig appConfig2 = appConfig;
        return accountState.copy(user, z6, appConfig2, accountPage, z19, str4, z18, z16, z17, z15, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowCustomerCenter() {
        return this.showCustomerCenter;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPendingCustomerCenterAction() {
        return this.pendingCustomerCenterAction;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingPasswordReset() {
        return this.isLoadingPasswordReset;
    }

    /* renamed from: component3, reason: from getter */
    public final AppConfig getConfig() {
        return this.config;
    }

    /* renamed from: component4, reason: from getter */
    public final AccountPage getPage() {
        return this.page;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsScreenVisible() {
        return this.isScreenVisible;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSignOutConfirmDialog() {
        return this.showSignOutConfirmDialog;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowSignOutWarningSheet() {
        return this.showSignOutWarningSheet;
    }

    public final AccountState copy(User user, boolean isLoadingPasswordReset, AppConfig config, AccountPage page, boolean isLoading, String error, boolean isScreenVisible, boolean showSignOutConfirmDialog, boolean showSignOutWarningSheet, boolean showCustomerCenter, String pendingCustomerCenterAction) {
        error.getClass();
        return new AccountState(user, isLoadingPasswordReset, config, page, isLoading, error, isScreenVisible, showSignOutConfirmDialog, showSignOutWarningSheet, showCustomerCenter, pendingCustomerCenterAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountState)) {
            return false;
        }
        AccountState accountState = (AccountState) other;
        if (kotlin.jvm.internal.m.c(this.user, accountState.user) && this.isLoadingPasswordReset == accountState.isLoadingPasswordReset && kotlin.jvm.internal.m.c(this.config, accountState.config) && kotlin.jvm.internal.m.c(this.page, accountState.page) && this.isLoading == accountState.isLoading && kotlin.jvm.internal.m.c(this.error, accountState.error) && this.isScreenVisible == accountState.isScreenVisible && this.showSignOutConfirmDialog == accountState.showSignOutConfirmDialog && this.showSignOutWarningSheet == accountState.showSignOutWarningSheet && this.showCustomerCenter == accountState.showCustomerCenter && kotlin.jvm.internal.m.c(this.pendingCustomerCenterAction, accountState.pendingCustomerCenterAction)) {
            return true;
        }
        return false;
    }

    public final AppConfig getConfig() {
        return this.config;
    }

    public final String getError() {
        return this.error;
    }

    public final AccountPage getPage() {
        return this.page;
    }

    public final String getPendingCustomerCenterAction() {
        return this.pendingCustomerCenterAction;
    }

    public final boolean getShowCustomerCenter() {
        return this.showCustomerCenter;
    }

    public final boolean getShowSignOutConfirmDialog() {
        return this.showSignOutConfirmDialog;
    }

    public final boolean getShowSignOutWarningSheet() {
        return this.showSignOutWarningSheet;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        User user = this.user;
        int i10 = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(hashCode * 31, 31, this.isLoadingPasswordReset);
        AppConfig appConfig = this.config;
        if (appConfig == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = appConfig.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        AccountPage accountPage = this.page;
        if (accountPage == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = accountPage.hashCode();
        }
        int f11 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(j0.c.c(com.google.android.gms.internal.play_billing.b.f((i11 + hashCode3) * 31, 31, this.isLoading), 31, this.error), 31, this.isScreenVisible), 31, this.showSignOutConfirmDialog), 31, this.showSignOutWarningSheet), 31, this.showCustomerCenter);
        String str = this.pendingCustomerCenterAction;
        if (str != null) {
            i10 = str.hashCode();
        }
        return f11 + i10;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingPasswordReset() {
        return this.isLoadingPasswordReset;
    }

    public final boolean isScreenVisible() {
        return this.isScreenVisible;
    }

    public String toString() {
        User user = this.user;
        boolean z6 = this.isLoadingPasswordReset;
        AppConfig appConfig = this.config;
        AccountPage accountPage = this.page;
        boolean z10 = this.isLoading;
        String str = this.error;
        boolean z11 = this.isScreenVisible;
        boolean z12 = this.showSignOutConfirmDialog;
        boolean z13 = this.showSignOutWarningSheet;
        boolean z14 = this.showCustomerCenter;
        String str2 = this.pendingCustomerCenterAction;
        StringBuilder sb = new StringBuilder("AccountState(user=");
        sb.append(user);
        sb.append(", isLoadingPasswordReset=");
        sb.append(z6);
        sb.append(", config=");
        sb.append(appConfig);
        sb.append(", page=");
        sb.append(accountPage);
        sb.append(", isLoading=");
        defpackage.f.z(sb, z10, ", error=", str, ", isScreenVisible=");
        ib.i.t(sb, z11, ", showSignOutConfirmDialog=", z12, ", showSignOutWarningSheet=");
        ib.i.t(sb, z13, ", showCustomerCenter=", z14, ", pendingCustomerCenterAction=");
        return defpackage.f.l(str2, Separators.RPAREN, sb);
    }

    public AccountState(User user, boolean z6, AppConfig appConfig, AccountPage accountPage, boolean z10, String str, boolean z11, boolean z12, boolean z13, boolean z14, String str2) {
        str.getClass();
        this.user = user;
        this.isLoadingPasswordReset = z6;
        this.config = appConfig;
        this.page = accountPage;
        this.isLoading = z10;
        this.error = str;
        this.isScreenVisible = z11;
        this.showSignOutConfirmDialog = z12;
        this.showSignOutWarningSheet = z13;
        this.showCustomerCenter = z14;
        this.pendingCustomerCenterAction = str2;
    }

    public AccountState() {
        this(null, false, null, null, false, null, false, false, false, false, null, 2047, null);
    }
}

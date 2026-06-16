package io.elevenlabs.readerapp;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/AppCompatibilityState;", "", "showInstallPlayServicesDialog", "", "showInstallGooglePlayDialog", "showSignInToPlayStoreAccount", "<init>", "(ZZZ)V", "getShowInstallPlayServicesDialog", "()Z", "getShowInstallGooglePlayDialog", "getShowSignInToPlayStoreAccount", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AppCompatibilityState {
    public static final int $stable = 0;
    private final boolean showInstallGooglePlayDialog;
    private final boolean showInstallPlayServicesDialog;
    private final boolean showSignInToPlayStoreAccount;

    public /* synthetic */ AppCompatibilityState(boolean z6, boolean z10, boolean z11, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? false : z6, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }

    public static /* synthetic */ AppCompatibilityState copy$default(AppCompatibilityState appCompatibilityState, boolean z6, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = appCompatibilityState.showInstallPlayServicesDialog;
        }
        if ((i10 & 2) != 0) {
            z10 = appCompatibilityState.showInstallGooglePlayDialog;
        }
        if ((i10 & 4) != 0) {
            z11 = appCompatibilityState.showSignInToPlayStoreAccount;
        }
        return appCompatibilityState.copy(z6, z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowInstallPlayServicesDialog() {
        return this.showInstallPlayServicesDialog;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowInstallGooglePlayDialog() {
        return this.showInstallGooglePlayDialog;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowSignInToPlayStoreAccount() {
        return this.showSignInToPlayStoreAccount;
    }

    public final AppCompatibilityState copy(boolean showInstallPlayServicesDialog, boolean showInstallGooglePlayDialog, boolean showSignInToPlayStoreAccount) {
        return new AppCompatibilityState(showInstallPlayServicesDialog, showInstallGooglePlayDialog, showSignInToPlayStoreAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCompatibilityState)) {
            return false;
        }
        AppCompatibilityState appCompatibilityState = (AppCompatibilityState) other;
        if (this.showInstallPlayServicesDialog == appCompatibilityState.showInstallPlayServicesDialog && this.showInstallGooglePlayDialog == appCompatibilityState.showInstallGooglePlayDialog && this.showSignInToPlayStoreAccount == appCompatibilityState.showSignInToPlayStoreAccount) {
            return true;
        }
        return false;
    }

    public final boolean getShowInstallGooglePlayDialog() {
        return this.showInstallGooglePlayDialog;
    }

    public final boolean getShowInstallPlayServicesDialog() {
        return this.showInstallPlayServicesDialog;
    }

    public final boolean getShowSignInToPlayStoreAccount() {
        return this.showSignInToPlayStoreAccount;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showSignInToPlayStoreAccount) + com.google.android.gms.internal.play_billing.b.f(Boolean.hashCode(this.showInstallPlayServicesDialog) * 31, 31, this.showInstallGooglePlayDialog);
    }

    public String toString() {
        boolean z6 = this.showInstallPlayServicesDialog;
        boolean z10 = this.showInstallGooglePlayDialog;
        boolean z11 = this.showSignInToPlayStoreAccount;
        StringBuilder sb = new StringBuilder("AppCompatibilityState(showInstallPlayServicesDialog=");
        sb.append(z6);
        sb.append(", showInstallGooglePlayDialog=");
        sb.append(z10);
        sb.append(", showSignInToPlayStoreAccount=");
        return n.j(Separators.RPAREN, sb, z11);
    }

    public AppCompatibilityState(boolean z6, boolean z10, boolean z11) {
        this.showInstallPlayServicesDialog = z6;
        this.showInstallGooglePlayDialog = z10;
        this.showSignInToPlayStoreAccount = z11;
    }

    public AppCompatibilityState() {
        this(false, false, false, 7, null);
    }
}

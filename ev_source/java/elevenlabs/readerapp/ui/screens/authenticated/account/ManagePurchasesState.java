package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManagePurchasesState;", "", "isLoadingRestorePurchases", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ManagePurchasesState {
    public static final int $stable = 0;
    private final boolean isLoadingRestorePurchases;

    public /* synthetic */ ManagePurchasesState(boolean z6, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? false : z6);
    }

    public static /* synthetic */ ManagePurchasesState copy$default(ManagePurchasesState managePurchasesState, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = managePurchasesState.isLoadingRestorePurchases;
        }
        return managePurchasesState.copy(z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoadingRestorePurchases() {
        return this.isLoadingRestorePurchases;
    }

    public final ManagePurchasesState copy(boolean isLoadingRestorePurchases) {
        return new ManagePurchasesState(isLoadingRestorePurchases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ManagePurchasesState) && this.isLoadingRestorePurchases == ((ManagePurchasesState) other).isLoadingRestorePurchases) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoadingRestorePurchases);
    }

    public final boolean isLoadingRestorePurchases() {
        return this.isLoadingRestorePurchases;
    }

    public String toString() {
        return "ManagePurchasesState(isLoadingRestorePurchases=" + this.isLoadingRestorePurchases + Separators.RPAREN;
    }

    public ManagePurchasesState(boolean z6) {
        this.isLoadingRestorePurchases = z6;
    }

    public ManagePurchasesState() {
        this(false, 1, null);
    }
}

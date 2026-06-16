package io.elevenlabs.readerapp.ui.screens.authenticated.account.delete;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/delete/DeleteAccountState;", "", "user", "Lio/elevenlabs/domain/model/User;", "isDeleteInProgress", "", "<init>", "(Lio/elevenlabs/domain/model/User;Z)V", "getUser", "()Lio/elevenlabs/domain/model/User;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class DeleteAccountState {
    public static final int $stable = 8;
    private final boolean isDeleteInProgress;
    private final User user;

    public /* synthetic */ DeleteAccountState(User user, boolean z6, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : user, (i10 & 2) != 0 ? false : z6);
    }

    public static /* synthetic */ DeleteAccountState copy$default(DeleteAccountState deleteAccountState, User user, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            user = deleteAccountState.user;
        }
        if ((i10 & 2) != 0) {
            z6 = deleteAccountState.isDeleteInProgress;
        }
        return deleteAccountState.copy(user, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDeleteInProgress() {
        return this.isDeleteInProgress;
    }

    public final DeleteAccountState copy(User user, boolean isDeleteInProgress) {
        return new DeleteAccountState(user, isDeleteInProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountState)) {
            return false;
        }
        DeleteAccountState deleteAccountState = (DeleteAccountState) other;
        if (m.c(this.user, deleteAccountState.user) && this.isDeleteInProgress == deleteAccountState.isDeleteInProgress) {
            return true;
        }
        return false;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        User user = this.user;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        return Boolean.hashCode(this.isDeleteInProgress) + (hashCode * 31);
    }

    public final boolean isDeleteInProgress() {
        return this.isDeleteInProgress;
    }

    public String toString() {
        return "DeleteAccountState(user=" + this.user + ", isDeleteInProgress=" + this.isDeleteInProgress + Separators.RPAREN;
    }

    public DeleteAccountState(User user, boolean z6) {
        this.user = user;
        this.isDeleteInProgress = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteAccountState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}

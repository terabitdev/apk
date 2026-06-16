package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import ir.a1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.z0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/library/DeleteConfirmationState;", "", "<init>", "()V", "Lsn/z;", "show", "onDismiss", "onConfirm", "", "awaitResult", "(Lwn/c;)Ljava/lang/Object;", "<set-?>", "isVisible$delegate", "Lu2/z0;", "isVisible", "()Z", "setVisible", "(Z)V", "userConfirmed$delegate", "getUserConfirmed", "()Ljava/lang/Boolean;", "setUserConfirmed", "(Ljava/lang/Boolean;)V", "userConfirmed", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DeleteConfirmationState {

    /* renamed from: isVisible$delegate, reason: from kotlin metadata */
    private final z0 isVisible = u2.r.A(Boolean.FALSE);

    /* renamed from: userConfirmed$delegate, reason: from kotlin metadata */
    private final z0 userConfirmed = u2.r.A(null);

    private final void setUserConfirmed(Boolean bool) {
        this.userConfirmed.setValue(bool);
    }

    private final void setVisible(boolean z6) {
        this.isVisible.setValue(Boolean.valueOf(z6));
    }

    public final Object awaitResult(wn.c<? super Boolean> cVar) {
        return ir.r.u(new a1(u2.r.K(new d(this, 0)), 0), cVar);
    }

    public final Boolean getUserConfirmed() {
        return (Boolean) this.userConfirmed.getValue();
    }

    public final boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void onConfirm() {
        setVisible(false);
        setUserConfirmed(Boolean.TRUE);
    }

    public final void onDismiss() {
        setVisible(false);
        setUserConfirmed(Boolean.FALSE);
    }

    public final void show() {
        setVisible(true);
        setUserConfirmed(null);
    }
}

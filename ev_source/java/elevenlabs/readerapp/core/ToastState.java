package io.elevenlabs.readerapp.core;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.services.ToastService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/readerapp/core/ToastState;", "", "toast", "Lio/elevenlabs/domain/services/ToastService$Toast;", "showToast", "", "<init>", "(Lio/elevenlabs/domain/services/ToastService$Toast;Z)V", "getToast", "()Lio/elevenlabs/domain/services/ToastService$Toast;", "getShowToast", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ToastState {
    public static final int $stable = 8;
    private final boolean showToast;
    private final ToastService.Toast toast;

    public /* synthetic */ ToastState(ToastService.Toast toast, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : toast, (i10 & 2) != 0 ? false : z6);
    }

    public static /* synthetic */ ToastState copy$default(ToastState toastState, ToastService.Toast toast, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            toast = toastState.toast;
        }
        if ((i10 & 2) != 0) {
            z6 = toastState.showToast;
        }
        return toastState.copy(toast, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final ToastService.Toast getToast() {
        return this.toast;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowToast() {
        return this.showToast;
    }

    public final ToastState copy(ToastService.Toast toast, boolean showToast) {
        return new ToastState(toast, showToast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToastState)) {
            return false;
        }
        ToastState toastState = (ToastState) other;
        if (kotlin.jvm.internal.m.c(this.toast, toastState.toast) && this.showToast == toastState.showToast) {
            return true;
        }
        return false;
    }

    public final boolean getShowToast() {
        return this.showToast;
    }

    public final ToastService.Toast getToast() {
        return this.toast;
    }

    public int hashCode() {
        int hashCode;
        ToastService.Toast toast = this.toast;
        if (toast == null) {
            hashCode = 0;
        } else {
            hashCode = toast.hashCode();
        }
        return Boolean.hashCode(this.showToast) + (hashCode * 31);
    }

    public String toString() {
        return "ToastState(toast=" + this.toast + ", showToast=" + this.showToast + Separators.RPAREN;
    }

    public ToastState(ToastService.Toast toast, boolean z6) {
        this.toast = toast;
        this.showToast = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToastState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}

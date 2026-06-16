package io.livekit.android.audio;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillManager$AutofillCallback;
import android.view.autofill.AutofillValue;
import io.livekit.android.room.track.screencapture.ScreenCaptureService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel a() {
        return new NotificationChannel(ScreenCaptureService.DEFAULT_CHANNEL_ID, "Screen Capture", 2);
    }

    public static /* bridge */ /* synthetic */ AutofillManager$AutofillCallback b(Object obj) {
        return (AutofillManager$AutofillCallback) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager c(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue e(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return AutofillManager.class;
    }

    public static /* synthetic */ void j() {
    }
}

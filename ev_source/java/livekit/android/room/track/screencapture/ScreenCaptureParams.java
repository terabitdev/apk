package io.livekit.android.room.track.screencapture;

import android.app.Notification;
import android.content.Intent;
import ho.a;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureParams;", "", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "", "notificationId", "Landroid/app/Notification;", "notification", "Lkotlin/Function0;", "Lsn/z;", "onStop", "<init>", "(Landroid/content/Intent;Ljava/lang/Integer;Landroid/app/Notification;Lho/a;)V", "Landroid/content/Intent;", "getMediaProjectionPermissionResultData", "()Landroid/content/Intent;", "Ljava/lang/Integer;", "getNotificationId", "()Ljava/lang/Integer;", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "Lho/a;", "getOnStop", "()Lho/a;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ScreenCaptureParams {
    private final Intent mediaProjectionPermissionResultData;
    private final Notification notification;
    private final Integer notificationId;
    private final a onStop;

    public /* synthetic */ ScreenCaptureParams(Intent intent, Integer num, Notification notification, a aVar, int i10, f fVar) {
        this(intent, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : notification, (i10 & 8) != 0 ? null : aVar);
    }

    public final Intent getMediaProjectionPermissionResultData() {
        return this.mediaProjectionPermissionResultData;
    }

    public final Notification getNotification() {
        return this.notification;
    }

    public final Integer getNotificationId() {
        return this.notificationId;
    }

    public final a getOnStop() {
        return this.onStop;
    }

    public ScreenCaptureParams(Intent intent, Integer num, Notification notification, a aVar) {
        intent.getClass();
        this.mediaProjectionPermissionResultData = intent;
        this.notificationId = num;
        this.notification = notification;
        this.onStop = aVar;
    }
}

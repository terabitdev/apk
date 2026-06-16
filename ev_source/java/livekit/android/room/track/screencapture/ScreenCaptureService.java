package io.livekit.android.room.track.screencapture;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import f2.p;
import io.livekit.android.audio.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import y5.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "Landroid/app/Service;", "<init>", "()V", "Lsn/z;", "createNotificationChannel", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "notificationId", "Landroid/app/Notification;", "notification", "start", "(Ljava/lang/Integer;Landroid/app/Notification;)V", "", "onUnbind", "(Landroid/content/Intent;)Z", "binder", "Landroid/os/IBinder;", "bindCount", TokenNames.I, "Companion", "ScreenCaptureBinder", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class ScreenCaptureService extends Service {
    public static final String DEFAULT_CHANNEL_ID = "livekit_screen_capture";
    public static final int DEFAULT_NOTIFICATION_ID = 2345;
    private int bindCount;
    private IBinder binder = new ScreenCaptureBinder();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureService$ScreenCaptureBinder;", "Landroid/os/Binder;", "(Lio/livekit/android/room/track/screencapture/ScreenCaptureService;)V", ReferencesHeader.SERVICE, "Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "getService", "()Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public final class ScreenCaptureBinder extends Binder {
        public ScreenCaptureBinder() {
        }

        /* renamed from: getService, reason: from getter */
        public final ScreenCaptureService getThis$0() {
            return ScreenCaptureService.this;
        }
    }

    private final void createNotificationChannel() {
        p.s();
        NotificationChannel a10 = a.a();
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).createNotificationChannel(a10);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.bindCount++;
        return this.binder;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        int i10 = this.bindCount - 1;
        this.bindCount = i10;
        if (i10 == 0) {
            stopSelf();
            return false;
        }
        return false;
    }

    public final void start(Integer notificationId, Notification notification) {
        int i10;
        if (notification == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                createNotificationChannel();
            }
            n nVar = new n(this, DEFAULT_CHANNEL_ID);
            nVar.f38370j = 0;
            notification = nVar.a();
            notification.getClass();
        }
        if (notificationId != null) {
            i10 = notificationId.intValue();
        } else {
            i10 = DEFAULT_NOTIFICATION_ID;
        }
        startForeground(i10, notification);
    }
}

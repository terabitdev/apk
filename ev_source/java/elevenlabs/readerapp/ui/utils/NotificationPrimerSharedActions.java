package io.elevenlabs.readerapp.ui.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lio/elevenlabs/readerapp/ui/utils/NotificationPrimerSharedActions;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsn/z;", "openAppNotificationSettings", "(Landroid/content/Context;)V", "openAppSettings", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class NotificationPrimerSharedActions {
    public static final int $stable = 0;
    public static final NotificationPrimerSharedActions INSTANCE = new NotificationPrimerSharedActions();

    private NotificationPrimerSharedActions() {
    }

    private static final Intent openAppNotificationSettings$createFallbackIntent(String str) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", str, null));
        intent.addFlags(268435456);
        return intent;
    }

    public final void openAppNotificationSettings(Context context) {
        Intent openAppNotificationSettings$createFallbackIntent;
        context.getClass();
        String packageName = context.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                openAppNotificationSettings$createFallbackIntent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                openAppNotificationSettings$createFallbackIntent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
                openAppNotificationSettings$createFallbackIntent.addFlags(268435456);
            } else {
                openAppNotificationSettings$createFallbackIntent = openAppNotificationSettings$createFallbackIntent(packageName);
            }
            context.startActivity(openAppNotificationSettings$createFallbackIntent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(openAppNotificationSettings$createFallbackIntent(packageName));
        }
    }

    public final void openAppSettings(Context context) {
        context.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}

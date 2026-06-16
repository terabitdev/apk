package io.elevenlabs.analytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lio/elevenlabs/analytics/ManifestUtils;", "", "<init>", "()V", "getMetaData", "", "context", "Landroid/content/Context;", SubscriberAttributeKt.JSON_NAME_KEY, "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ManifestUtils {
    public static final ManifestUtils INSTANCE = new ManifestUtils();

    private ManifestUtils() {
    }

    public final String getMetaData(Context context, String key) {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of2;
        context.getClass();
        key.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of2 = PackageManager.ApplicationInfoFlags.of(128L);
            applicationInfo = packageManager.getApplicationInfo(packageName, of2);
            applicationInfo.getClass();
        } else {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            return bundle.getString(key);
        }
        return null;
    }
}

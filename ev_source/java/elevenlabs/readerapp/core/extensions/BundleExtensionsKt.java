package io.elevenlabs.readerapp.core.extensions;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getParcelableUri", "Landroid/net/Uri;", "Landroid/os/Bundle;", SubscriberAttributeKt.JSON_NAME_KEY, "", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BundleExtensionsKt {
    public static final Uri getParcelableUri(Bundle bundle, String str) {
        Object parcelable;
        bundle.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable(str, Uri.class);
            return (Uri) parcelable;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }
}

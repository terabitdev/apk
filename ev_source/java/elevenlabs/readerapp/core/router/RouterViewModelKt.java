package io.elevenlabs.readerapp.core.router;

import android.net.Uri;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002*\u00020\u0002*\u0016\u0010\u0000\"\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006"}, d2 = {"StackPoppingRoutes", "", "", "encodeUrlParam", "kotlin.jvm.PlatformType", "decodeUrlParam", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RouterViewModelKt {
    public static final String decodeUrlParam(String str) {
        str.getClass();
        return Uri.decode(str);
    }

    public static final String encodeUrlParam(String str) {
        str.getClass();
        return Uri.encode(str);
    }
}

package io.livekit.android.room;

import java.net.URI;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljava/net/URI;", "", "isLKCloud", "(Ljava/net/URI;)Z", "", "appendPath", "getCloudConfigUrl", "(Ljava/net/URI;Ljava/lang/String;)Ljava/net/URI;", "enable", "Lsn/z;", "setRegionUrlProviderTesting", "(Z)V", "regionUrlProviderTesting", "Z", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RegionUrlProviderKt {
    private static boolean regionUrlProviderTesting;

    public static final URI getCloudConfigUrl(URI uri, String str) {
        String scheme;
        uri.getClass();
        str.getClass();
        String scheme2 = uri.getScheme();
        scheme2.getClass();
        if (u.W(scheme2, "ws", false)) {
            String scheme3 = uri.getScheme();
            scheme3.getClass();
            scheme = u.U(scheme3, "ws", "http");
        } else {
            scheme = uri.getScheme();
        }
        return new URI(scheme, null, uri.getHost(), uri.getPort(), "/settings".concat(str), null, null);
    }

    public static /* synthetic */ URI getCloudConfigUrl$default(URI uri, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return getCloudConfigUrl(uri, str);
    }

    public static final boolean isLKCloud(URI uri) {
        uri.getClass();
        if (!regionUrlProviderTesting) {
            if (uri.getHost() != null) {
                String host = uri.getHost();
                host.getClass();
                if (!u.N(host, ".livekit.cloud", false)) {
                    String host2 = uri.getHost();
                    host2.getClass();
                    if (u.N(host2, ".livekit.run", false)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final void setRegionUrlProviderTesting(boolean z6) {
        regionUrlProviderTesting = z6;
    }
}

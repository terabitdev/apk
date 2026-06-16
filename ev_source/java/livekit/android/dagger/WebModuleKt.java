package io.livekit.android.dagger;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import sn.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokhttp3/OkHttpClient;", "globalOkHttpClient$delegate", "Lsn/h;", "getGlobalOkHttpClient", "()Lokhttp3/OkHttpClient;", "globalOkHttpClient", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class WebModuleKt {
    private static final h globalOkHttpClient$delegate = sn.a.e(WebModuleKt$globalOkHttpClient$2.INSTANCE);

    public static final OkHttpClient getGlobalOkHttpClient() {
        return (OkHttpClient) globalOkHttpClient$delegate.getValue();
    }
}

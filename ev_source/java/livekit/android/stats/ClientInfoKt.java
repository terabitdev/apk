package io.livekit.android.stats;

import android.os.Build;
import as.x6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$ClientInfo;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\u0000¨\u0006\u0003"}, d2 = {"getClientInfo", "Llivekit/LivekitModels$ClientInfo;", "kotlin.jvm.PlatformType", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ClientInfoKt {
    public static final LivekitModels$ClientInfo getClientInfo() {
        x6 newBuilder = LivekitModels$ClientInfo.newBuilder();
        newBuilder.e();
        newBuilder.f();
        newBuilder.c();
        String str = Build.VERSION.RELEASE;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        newBuilder.d(str);
        String str3 = Build.MANUFACTURER;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = Build.MODEL;
        if (str4 != null) {
            str2 = str4;
        }
        newBuilder.b(n.L0(str3 + ' ' + str2).toString());
        return (LivekitModels$ClientInfo) newBuilder.build();
    }
}

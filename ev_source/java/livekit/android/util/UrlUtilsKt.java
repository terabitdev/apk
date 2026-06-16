package io.livekit.android.util;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"toHttpUrl", "", "toWebsocketUrl", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class UrlUtilsKt {
    public static final String toHttpUrl(String str) {
        str.getClass();
        if (u.W(str, "ws", false)) {
            return u.U(str, "ws", "http");
        }
        return str;
    }

    public static final String toWebsocketUrl(String str) {
        str.getClass();
        if (u.W(str, "http", false)) {
            return u.U(str, "http", "ws");
        }
        return str;
    }
}

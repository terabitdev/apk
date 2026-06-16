package io.livekit.android.util;

import fs.k;
import java.nio.charset.Charset;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"byteLength", "", "", "truncateBytes", "maxBytes", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class StringByteUtilsKt {
    public static final int byteLength(String str) {
        if (str == null) {
            return 0;
        }
        k kVar = k.f9979d;
        Charset charset = b.f37231a;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        new k(bytes);
        return bytes.length;
    }

    public static final String truncateBytes(String str, int i10) {
        str.getClass();
        if (byteLength(str) <= i10) {
            return str;
        }
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int i12 = ((i11 + length) + 1) / 2;
            if (byteLength(str.substring(0, i12)) <= i10) {
                i11 = i12;
            } else {
                length = i12 - 1;
            }
        }
        return str.substring(0, i11);
    }
}

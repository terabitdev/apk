package io.livekit.android.util;

import com.google.protobuf.i4;
import fs.b;
import fs.k;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/i4;", "Lfs/k;", "toOkioByteString", "(Lcom/google/protobuf/i4;)Lfs/k;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MessageLiteExtKt {
    public static final k toOkioByteString(i4 i4Var) {
        i4Var.getClass();
        byte[] byteArray = i4Var.toByteArray();
        k kVar = k.f9979d;
        byteArray.getClass();
        int length = byteArray.length;
        if (length == -1234567890) {
            length = byteArray.length;
        }
        b.e(byteArray.length, 0, length);
        return new k(n.y0(byteArray, 0, length));
    }
}

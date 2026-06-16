package io.livekit.android.util;

import io.livekit.android.util.Either;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a0\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, d2 = {"nullSafe", "Lio/livekit/android/util/Either;", "A", "", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EitherKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <A> Either<A, String> nullSafe(Either<? extends A, String> either) {
        if (either == 0) {
            return new Either.Right("null");
        }
        return either;
    }
}

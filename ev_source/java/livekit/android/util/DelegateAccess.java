package io.livekit.android.util;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lio/livekit/android/util/DelegateAccess;", "", "()V", "delegate", "Ljava/lang/ThreadLocal;", "getDelegate$livekit_android_sdk_release", "()Ljava/lang/ThreadLocal;", "delegateRequested", "", "getDelegateRequested$livekit_android_sdk_release", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DelegateAccess {
    public static final DelegateAccess INSTANCE = new DelegateAccess();
    private static final ThreadLocal<Object> delegate = new ThreadLocal<>();
    private static final ThreadLocal<Boolean> delegateRequested;

    static {
        ThreadLocal<Boolean> threadLocal = new ThreadLocal<>();
        threadLocal.set(Boolean.FALSE);
        delegateRequested = threadLocal;
    }

    private DelegateAccess() {
    }

    public final ThreadLocal<Object> getDelegate$livekit_android_sdk_release() {
        return delegate;
    }

    public final ThreadLocal<Boolean> getDelegateRequested$livekit_android_sdk_release() {
        return delegateRequested;
    }
}

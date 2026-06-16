package io.livekit.android.util;

import fr.d0;
import fr.g0;
import java.io.Closeable;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/livekit/android/util/CloseableCoroutineScope;", "Ljava/io/Closeable;", "Lfr/d0;", "Lwn/h;", "context", "<init>", "(Lwn/h;)V", "Lsn/z;", "close", "()V", "coroutineContext", "Lwn/h;", "getCoroutineContext", "()Lwn/h;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CloseableCoroutineScope implements Closeable, d0 {
    private final h coroutineContext;

    public CloseableCoroutineScope(h hVar) {
        hVar.getClass();
        this.coroutineContext = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g0.j(getCoroutineContext(), null);
    }

    @Override // fr.d0
    public h getCoroutineContext() {
        return this.coroutineContext;
    }
}

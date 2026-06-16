package io.livekit.android.memory;

import java.io.Closeable;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/memory/SurfaceTextureHelperCloser;", "Ljava/io/Closeable;", "Llivekit/org/webrtc/SurfaceTextureHelper;", "surfaceTextureHelper", "<init>", "(Llivekit/org/webrtc/SurfaceTextureHelper;)V", "Lsn/z;", "close", "()V", "Llivekit/org/webrtc/SurfaceTextureHelper;", "", "isClosed", "Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SurfaceTextureHelperCloser implements Closeable {
    private boolean isClosed;
    private final SurfaceTextureHelper surfaceTextureHelper;

    public SurfaceTextureHelperCloser(SurfaceTextureHelper surfaceTextureHelper) {
        this.surfaceTextureHelper = surfaceTextureHelper;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.isClosed) {
            this.isClosed = true;
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
            }
            SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
            if (surfaceTextureHelper2 != null) {
                surfaceTextureHelper2.dispose();
            }
        }
    }
}

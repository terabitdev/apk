package io.livekit.android.room.track.video;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.CameraVideoCapturer;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/livekit/android/room/track/video/CameraEventsDispatchHandler;", "Llivekit/org/webrtc/CameraVideoCapturer$CameraEventsHandler;", "<init>", "()V", "handler", "Lsn/z;", "registerHandler", "(Llivekit/org/webrtc/CameraVideoCapturer$CameraEventsHandler;)V", "unregisterHandler", "", "errorDescription", "onCameraError", "(Ljava/lang/String;)V", "onCameraDisconnected", "onCameraFreezed", "cameraName", "onCameraOpening", "onFirstFrameAvailable", "onCameraClosed", "", "handlers", "Ljava/util/Set;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CameraEventsDispatchHandler implements CameraVideoCapturer.CameraEventsHandler {
    private final Set<CameraVideoCapturer.CameraEventsHandler> handlers = new LinkedHashSet();

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
        Iterator it = o.k1(this.handlers).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraClosed();
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
        Iterator it = o.k1(this.handlers).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraDisconnected();
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String errorDescription) {
        errorDescription.getClass();
        Iterator it = o.k1(this.handlers).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraError(errorDescription);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String errorDescription) {
        errorDescription.getClass();
        Iterator it = o.k1(this.handlers).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraFreezed(errorDescription);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String cameraName) {
        cameraName.getClass();
        Iterator it = o.k1(this.handlers).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onCameraOpening(cameraName);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
        Iterator it = o.k1(this.handlers).iterator();
        while (it.hasNext()) {
            ((CameraVideoCapturer.CameraEventsHandler) it.next()).onFirstFrameAvailable();
        }
    }

    public final synchronized void registerHandler(CameraVideoCapturer.CameraEventsHandler handler) {
        handler.getClass();
        this.handlers.add(handler);
    }

    public final synchronized void unregisterHandler(CameraVideoCapturer.CameraEventsHandler handler) {
        handler.getClass();
        this.handlers.remove(handler);
    }
}

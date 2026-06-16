package io.livekit.android.room.track.video;

import android.content.Context;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.Camera1Capturer;
import livekit.org.webrtc.Camera1Helper;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u001b\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u000e\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00190\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010 \u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b \u0010\u0011J\u0010\u0010!\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b!\u0010\u0013J \u0010$\u001a\u00020\u000f2\u000e\u0010#\u001a\n \u0015*\u0004\u0018\u00010\"0\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J0\u0010$\u001a\u00020\u000f2\u000e\u0010#\u001a\n \u0015*\u0004\u0018\u00010\"0\"2\u000e\u0010&\u001a\n \u0015*\u0004\u0018\u00010\u00050\u0005H\u0096\u0001¢\u0006\u0004\b$\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,¨\u0006-"}, d2 = {"Lio/livekit/android/room/track/video/Camera1CapturerWithSize;", "Lio/livekit/android/room/track/video/CameraCapturerWithSize;", "Llivekit/org/webrtc/CameraVideoCapturer;", "Llivekit/org/webrtc/Camera1Capturer;", "capturer", "", "deviceName", "Lio/livekit/android/room/track/video/CameraEventsDispatchHandler;", "cameraEventsDispatchHandler", "<init>", "(Llivekit/org/webrtc/Camera1Capturer;Ljava/lang/String;Lio/livekit/android/room/track/video/CameraEventsDispatchHandler;)V", "", "width", "height", "framerate", "Lsn/z;", "changeCaptureFormat", "(III)V", "dispose", "()V", "Llivekit/org/webrtc/SurfaceTextureHelper;", "kotlin.jvm.PlatformType", "surfaceTextureHelper", "Landroid/content/Context;", "applicationContext", "Llivekit/org/webrtc/CapturerObserver;", "capturerObserver", "initialize", "(Llivekit/org/webrtc/SurfaceTextureHelper;Landroid/content/Context;Llivekit/org/webrtc/CapturerObserver;)V", "", "isScreencast", "()Z", "startCapture", "stopCapture", "Llivekit/org/webrtc/CameraVideoCapturer$CameraSwitchHandler;", "switchEventsHandler", "switchCamera", "(Llivekit/org/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V", "cameraName", "(Llivekit/org/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V", "Llivekit/org/webrtc/Size;", "findCaptureFormat", "(II)Llivekit/org/webrtc/Size;", "Llivekit/org/webrtc/Camera1Capturer;", "Ljava/lang/String;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class Camera1CapturerWithSize extends CameraCapturerWithSize implements CameraVideoCapturer {
    private final Camera1Capturer capturer;
    private final String deviceName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera1CapturerWithSize(Camera1Capturer camera1Capturer, String str, CameraEventsDispatchHandler cameraEventsDispatchHandler) {
        super(cameraEventsDispatchHandler);
        camera1Capturer.getClass();
        cameraEventsDispatchHandler.getClass();
        this.capturer = camera1Capturer;
        this.deviceName = str;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void changeCaptureFormat(int width, int height, int framerate) {
        this.capturer.changeCaptureFormat(width, height, framerate);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void dispose() {
        this.capturer.dispose();
    }

    @Override // io.livekit.android.room.track.video.VideoCapturerWithSize
    public Size findCaptureFormat(int width, int height) {
        Camera1Helper.Companion companion = Camera1Helper.INSTANCE;
        return companion.findClosestCaptureFormat(companion.getCameraId(this.deviceName), width, height);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context applicationContext, CapturerObserver capturerObserver) {
        this.capturer.initialize(surfaceTextureHelper, applicationContext, capturerObserver);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return this.capturer.isScreencast();
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void startCapture(int width, int height, int framerate) {
        this.capturer.startCapture(width, height, framerate);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void stopCapture() {
        this.capturer.stopCapture();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler switchEventsHandler) {
        this.capturer.switchCamera(switchEventsHandler);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler switchEventsHandler, String cameraName) {
        this.capturer.switchCamera(switchEventsHandler, cameraName);
    }
}

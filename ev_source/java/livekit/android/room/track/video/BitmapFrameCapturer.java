package io.livekit.android.room.track.video;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import android.view.Surface;
import com.google.protobuf.c6;
import fc.d;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoSink;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lio/livekit/android/room/track/video/BitmapFrameCapturer;", "Llivekit/org/webrtc/VideoCapturer;", "<init>", "()V", "Lsn/z;", "checkNotDisposed", "Llivekit/org/webrtc/SurfaceTextureHelper;", "surfaceTextureHelper", "Landroid/content/Context;", "context", "Llivekit/org/webrtc/CapturerObserver;", "observer", "initialize", "(Llivekit/org/webrtc/SurfaceTextureHelper;Landroid/content/Context;Llivekit/org/webrtc/CapturerObserver;)V", "", "width", "height", "framerate", "startCapture", "(III)V", "stopCapture", "changeCaptureFormat", "dispose", "", "isScreencast", "()Z", "Landroid/graphics/Bitmap;", "bitmap", "rotationDegrees", "pushBitmap", "(Landroid/graphics/Bitmap;I)V", "Llivekit/org/webrtc/SurfaceTextureHelper;", "capturerObserver", "Llivekit/org/webrtc/CapturerObserver;", "disposed", "Z", "rotation", TokenNames.I, "", "stateLock", "Ljava/lang/Object;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class BitmapFrameCapturer implements VideoCapturer {
    private CapturerObserver capturerObserver;
    private boolean disposed;
    private int height;
    private int rotation;
    private final Object stateLock = new Object();
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;

    public static /* synthetic */ void b(BitmapFrameCapturer bitmapFrameCapturer, Bitmap bitmap) {
        pushBitmap$lambda$8$lambda$7(bitmapFrameCapturer, bitmap);
    }

    private final void checkNotDisposed() {
        if (!this.disposed) {
            return;
        }
        c6.x("Capturer is disposed.");
    }

    public static final void pushBitmap$lambda$8$lambda$7(BitmapFrameCapturer bitmapFrameCapturer, Bitmap bitmap) {
        Canvas canvas;
        bitmapFrameCapturer.getClass();
        bitmap.getClass();
        Surface surface = bitmapFrameCapturer.surface;
        if (surface != null) {
            canvas = surface.lockHardwareCanvas();
        } else {
            canvas = null;
        }
        if (canvas != null) {
            canvas.drawBitmap(bitmap, new Matrix(), new Paint());
            Surface surface2 = bitmapFrameCapturer.surface;
            if (surface2 != null) {
                surface2.unlockCanvasAndPost(canvas);
            }
        }
    }

    public static final void startCapture$lambda$4$lambda$3(BitmapFrameCapturer bitmapFrameCapturer, VideoFrame videoFrame) {
        bitmapFrameCapturer.getClass();
        CapturerObserver capturerObserver = bitmapFrameCapturer.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void dispose() {
        synchronized (this.stateLock) {
            try {
                if (this.disposed) {
                    return;
                }
                stopCapture();
                Surface surface = this.surface;
                if (surface != null) {
                    surface.release();
                }
                this.disposed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver observer) {
        surfaceTextureHelper.getClass();
        context.getClass();
        observer.getClass();
        synchronized (this.stateLock) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            this.capturerObserver = observer;
            this.surface = new Surface(surfaceTextureHelper.getSurfaceTexture());
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public final void pushBitmap(Bitmap bitmap, int rotationDegrees) {
        Handler handler;
        bitmap.getClass();
        synchronized (this.stateLock) {
            try {
                if (this.disposed) {
                    return;
                }
                SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    if (this.surface != null) {
                        if (this.rotation != rotationDegrees) {
                            surfaceTextureHelper.setFrameRotation(rotationDegrees);
                            this.rotation = rotationDegrees;
                        }
                        if (this.width != bitmap.getWidth() || this.height != bitmap.getHeight()) {
                            SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
                            if (surfaceTextureHelper2 != null) {
                                surfaceTextureHelper2.setTextureSize(bitmap.getWidth(), bitmap.getHeight());
                            }
                            this.width = bitmap.getWidth();
                            this.height = bitmap.getHeight();
                        }
                        SurfaceTextureHelper surfaceTextureHelper3 = this.surfaceTextureHelper;
                        if (surfaceTextureHelper3 != null && (handler = surfaceTextureHelper3.getHandler()) != null) {
                            handler.post(new d(this, bitmap, 20));
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void startCapture(int width, int height, int framerate) {
        synchronized (this.stateLock) {
            try {
                checkNotDisposed();
                if (this.surfaceTextureHelper != null) {
                    CapturerObserver capturerObserver = this.capturerObserver;
                    if (capturerObserver != null) {
                        capturerObserver.onCapturerStarted(true);
                    }
                    SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                    if (surfaceTextureHelper != null) {
                        surfaceTextureHelper.startListening(new VideoSink() { // from class: io.livekit.android.room.track.video.a
                            @Override // livekit.org.webrtc.VideoSink
                            public final void onFrame(VideoFrame videoFrame) {
                                BitmapFrameCapturer.startCapture$lambda$4$lambda$3(BitmapFrameCapturer.this, videoFrame);
                            }
                        });
                    }
                } else {
                    throw new IllegalStateException("BitmapFrameCapturer must be initialized before calling startCapture.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void stopCapture() {
        synchronized (this.stateLock) {
            try {
                SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                }
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerStopped();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void changeCaptureFormat(int width, int height, int framerate) {
    }
}

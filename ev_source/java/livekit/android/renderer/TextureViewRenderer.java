package io.livekit.android.renderer;

import a9.a;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import et.d;
import f8.l0;
import io.livekit.android.room.track.video.ViewVisibility;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.EglRenderer;
import livekit.org.webrtc.GlRectDrawer;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.RendererCommon;
import livekit.org.webrtc.SurfaceEglRenderer;
import livekit.org.webrtc.ThreadUtils;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoSink;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u008b\u0001B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ;\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001f\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u001f\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020$¢\u0006\u0004\b)\u0010'J\u0017\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J!\u0010,\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010*2\b\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u00100J\u0015\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u001c¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0015¢\u0006\u0004\b4\u0010\u0019J\r\u00105\u001a\u00020\u0015¢\u0006\u0004\b5\u0010\u0019J\u0017\u00108\u001a\u00020\u00152\u0006\u00107\u001a\u000206H\u0017¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u00152\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0014¢\u0006\u0004\b=\u0010>J7\u0010D\u001a\u00020\u00152\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020:H\u0014¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00152\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00152\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bJ\u0010IJ/\u0010N\u001a\u00020\u00152\u0006\u0010G\u001a\u00020F2\u0006\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020:H\u0016¢\u0006\u0004\bN\u0010OJ'\u0010T\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020:H\u0016¢\u0006\u0004\bT\u0010UJ'\u0010V\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020P2\u0006\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020:H\u0016¢\u0006\u0004\bV\u0010UJ\u0017\u0010W\u001a\u00020$2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\u0015¢\u0006\u0004\b[\u0010\u0019J\u000f\u0010\\\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\\\u0010\u0019J'\u0010`\u001a\u00020\u00152\u0006\u0010]\u001a\u00020:2\u0006\u0010^\u001a\u00020:2\u0006\u0010_\u001a\u00020:H\u0016¢\u0006\u0004\b`\u0010aJ\u001f\u0010e\u001a\u00020\u00152\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020:H\u0014¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u0015H\u0002¢\u0006\u0004\bg\u0010\u0019J\u001f\u0010h\u001a\u00020\u00152\u0006\u0010]\u001a\u00020:2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\bh\u0010>J\u000f\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\u00152\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020\u00152\u0006\u0010p\u001a\u00020iH\u0002¢\u0006\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010{R\u0016\u0010|\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010}R\u0017\u0010\u007f\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0081\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u0018\u0010\u0082\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010}R\u0019\u0010\u0083\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0080\u0001R,\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008c\u0001"}, d2 = {"Lio/livekit/android/renderer/TextureViewRenderer;", "Landroid/view/TextureView;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/TextureView$SurfaceTextureListener;", "Llivekit/org/webrtc/VideoSink;", "Llivekit/org/webrtc/RendererCommon$RendererEvents;", "Lio/livekit/android/room/track/video/ViewVisibility$Notifier;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Llivekit/org/webrtc/EglBase$Context;", "sharedContext", "rendererEvents", "", "configAttributes", "Llivekit/org/webrtc/RendererCommon$GlDrawer;", "drawer", "Lsn/z;", "init", "(Llivekit/org/webrtc/EglBase$Context;Llivekit/org/webrtc/RendererCommon$RendererEvents;[ILlivekit/org/webrtc/RendererCommon$GlDrawer;)V", "release", "()V", "Llivekit/org/webrtc/EglRenderer$FrameListener;", "listener", "", "scale", "drawerParam", "addFrameListener", "(Llivekit/org/webrtc/EglRenderer$FrameListener;FLlivekit/org/webrtc/RendererCommon$GlDrawer;)V", "(Llivekit/org/webrtc/EglRenderer$FrameListener;F)V", "removeFrameListener", "(Llivekit/org/webrtc/EglRenderer$FrameListener;)V", "", "enabled", "setEnableHardwareScaler", "(Z)V", "mirror", "setMirror", "Llivekit/org/webrtc/RendererCommon$ScalingType;", "scalingType", "setScalingType", "(Llivekit/org/webrtc/RendererCommon$ScalingType;)V", "scalingTypeMatchOrientation", "scalingTypeMismatchOrientation", "(Llivekit/org/webrtc/RendererCommon$ScalingType;Llivekit/org/webrtc/RendererCommon$ScalingType;)V", "fps", "setFpsReduction", "(F)V", "disableFpsReduction", "pauseVideo", "Llivekit/org/webrtc/VideoFrame;", "frame", "onFrame", "(Llivekit/org/webrtc/VideoFrame;)V", "", "widthSpec", "heightSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "surfaceDestroyed", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "Landroid/graphics/SurfaceTexture;", "surface", "i", "i1", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureSizeChanged", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "clearImage", "onFirstFrameRendered", "videoWidth", "videoHeight", "rotation", "onFrameResolutionChanged", "(III)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "updateSurfaceSize", "adjustAspectRatio", "", "getResourceName", "()Ljava/lang/String;", "Ljava/lang/Runnable;", "r", "postOrRun", "(Ljava/lang/Runnable;)V", "string", "logD", "(Ljava/lang/String;)V", "resourceName", "Ljava/lang/String;", "Llivekit/org/webrtc/RendererCommon$VideoLayoutMeasure;", "videoLayoutMeasure", "Llivekit/org/webrtc/RendererCommon$VideoLayoutMeasure;", "Llivekit/org/webrtc/SurfaceEglRenderer;", "eglRenderer", "Llivekit/org/webrtc/SurfaceEglRenderer;", "Llivekit/org/webrtc/RendererCommon$RendererEvents;", "rotatedFrameWidth", TokenNames.I, "rotatedFrameHeight", "enableFixedSize", "Z", "surfaceWidth", "surfaceHeight", "initialized", "Lio/livekit/android/room/track/video/ViewVisibility;", "viewVisibility", "Lio/livekit/android/room/track/video/ViewVisibility;", "getViewVisibility", "()Lio/livekit/android/room/track/video/ViewVisibility;", "setViewVisibility", "(Lio/livekit/android/room/track/video/ViewVisibility;)V", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class TextureViewRenderer extends TextureView implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, VideoSink, RendererCommon.RendererEvents, ViewVisibility.Notifier {
    private static final String TAG = "TextureViewRenderer";
    private final SurfaceEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private boolean initialized;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
    private ViewVisibility viewVisibility;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        this.eglRenderer = new SurfaceEglRenderer(resourceName);
        setSurfaceTextureListener(this);
    }

    public static /* synthetic */ void a(TextureViewRenderer textureViewRenderer, int i10, int i11) {
        onFrameResolutionChanged$lambda$2(textureViewRenderer, i10, i11);
    }

    private final void adjustAspectRatio(int videoWidth, int videoHeight) {
        int i10;
        int width = getWidth();
        int height = getHeight();
        double d10 = videoHeight / videoWidth;
        int i11 = (int) (width * d10);
        if (height > i11) {
            i10 = width;
        } else {
            i10 = (int) (height / d10);
            i11 = height;
        }
        int i12 = (width - i10) / 2;
        int i13 = (height - i11) / 2;
        logD("video=" + videoWidth + 'x' + videoHeight + " view=" + width + 'x' + height + " newView=" + i10 + 'x' + i11 + " off=" + i12 + ',' + i13);
        Matrix matrix = new Matrix();
        getTransform(matrix);
        matrix.setScale(((float) i10) / ((float) width), ((float) i11) / ((float) height));
        matrix.postTranslate((float) i12, (float) i13);
        setTransform(matrix);
    }

    public static /* synthetic */ void b(CountDownLatch countDownLatch) {
        onSurfaceTextureDestroyed$lambda$1(countDownLatch);
    }

    private final String getResourceName() {
        try {
            String resourceEntryName = getResources().getResourceEntryName(getId());
            resourceEntryName.getClass();
            return resourceEntryName;
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public static /* synthetic */ void init$default(TextureViewRenderer textureViewRenderer, EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                iArr = EglBase.CONFIG_PLAIN;
            }
            if ((i10 & 8) != 0) {
                glDrawer = new GlRectDrawer();
            }
            textureViewRenderer.init(context, rendererEvents, iArr, glDrawer);
            return;
        }
        a.y("Super calls with default arguments not supported in this target, function: init");
    }

    private final void logD(String string) {
        Logging.d(TAG, this.resourceName + ": " + string);
    }

    public static final void onFrameResolutionChanged$lambda$2(TextureViewRenderer textureViewRenderer, int i10, int i11) {
        textureViewRenderer.getClass();
        textureViewRenderer.rotatedFrameWidth = i10;
        textureViewRenderer.rotatedFrameHeight = i11;
        textureViewRenderer.updateSurfaceSize();
        textureViewRenderer.requestLayout();
    }

    public static final void onSurfaceTextureDestroyed$lambda$1(CountDownLatch countDownLatch) {
        countDownLatch.getClass();
        countDownLatch.countDown();
    }

    private final void postOrRun(Runnable r10) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            r10.run();
        } else {
            post(r10);
        }
    }

    private final void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (this.enableFixedSize && this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && getWidth() != 0 && getHeight() != 0) {
            float width = getWidth() / getHeight();
            int i10 = this.rotatedFrameWidth;
            int i11 = this.rotatedFrameHeight;
            if (i10 / i11 > width) {
                i10 = (int) (i11 * width);
            } else {
                i11 = (int) (i10 / width);
            }
            int min = Math.min(getWidth(), i10);
            int min2 = Math.min(getHeight(), i11);
            logD("updateSurfaceSize. Layout size: " + getWidth() + 'x' + getHeight() + ", frame size: " + this.rotatedFrameWidth + 'x' + this.rotatedFrameHeight + ", requested surface size: " + min + 'x' + min2 + ", old surface size: " + this.surfaceWidth + 'x' + this.surfaceHeight);
            if (min == this.surfaceWidth && min2 == this.surfaceHeight) {
                return;
            }
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            adjustAspectRatio(min, min2);
            return;
        }
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
    }

    public final void addFrameListener(EglRenderer.FrameListener listener, float scale, RendererCommon.GlDrawer drawerParam) {
        this.eglRenderer.addFrameListener(listener, scale, drawerParam);
    }

    public final void clearImage() {
        this.eglRenderer.clearImage();
    }

    public final void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    @Override // io.livekit.android.room.track.video.ViewVisibility.Notifier
    public ViewVisibility getViewVisibility() {
        return this.viewVisibility;
    }

    public final void init(EglBase.Context sharedContext, RendererCommon.RendererEvents rendererEvents, int[] configAttributes, RendererCommon.GlDrawer drawer) {
        ThreadUtils.checkIsOnMainThread();
        if (this.initialized) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "Reinitializing already initialized TextureViewRenderer.", new Object[0]);
            }
        }
        this.initialized = true;
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(sharedContext, this, configAttributes, drawer);
    }

    @Override // livekit.org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.getClass();
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override // livekit.org.webrtc.VideoSink
    public void onFrame(VideoFrame frame) {
        frame.getClass();
        if (!this.initialized) {
            Log.e(TAG, "Received frame when not initialized! You must call Room.initVideoRenderer(view) before using this view!");
        }
        this.eglRenderer.onFrame(frame);
    }

    @Override // livekit.org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int videoWidth, int videoHeight, int rotation) {
        int i10;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(videoWidth, videoHeight, rotation);
        }
        if (rotation != 0 && rotation != 180) {
            i10 = videoHeight;
        } else {
            i10 = videoWidth;
        }
        if (rotation == 0 || rotation == 180) {
            videoWidth = videoHeight;
        }
        postOrRun(new l0(this, i10, videoWidth, 4));
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((right - left) / (bottom - top));
        updateSurfaceSize();
    }

    @Override // android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(widthSpec, heightSpec, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        logD("onMeasure(). New size: " + measure.x + 'x' + measure.y);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i12) {
        surface.getClass();
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.createEglSurface(getSurfaceTexture());
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        surface.getClass();
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.eglRenderer.releaseEglSurface(new w0.d(countDownLatch, 9));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        surface.getClass();
        ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: size: " + width + 'x' + height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        surface.getClass();
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        changedView.getClass();
        super.onVisibilityChanged(changedView, visibility);
        ViewVisibility viewVisibility = getViewVisibility();
        if (viewVisibility != null) {
            viewVisibility.recalculate();
        }
    }

    public final void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public final void release() {
        this.initialized = false;
        this.eglRenderer.release();
    }

    public final void removeFrameListener(EglRenderer.FrameListener listener) {
        this.eglRenderer.removeFrameListener(listener);
    }

    public final void setEnableHardwareScaler(boolean enabled) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = enabled;
        updateSurfaceSize();
    }

    public final void setFpsReduction(float fps) {
        this.eglRenderer.setFpsReduction(fps);
    }

    public final void setMirror(boolean mirror) {
        this.eglRenderer.setMirror(mirror);
    }

    public final void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    @Override // io.livekit.android.room.track.video.ViewVisibility.Notifier
    public void setViewVisibility(ViewVisibility viewVisibility) {
        this.viewVisibility = viewVisibility;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        holder.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        holder.getClass();
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        holder.getClass();
    }

    public final void addFrameListener(EglRenderer.FrameListener listener, float scale) {
        this.eglRenderer.addFrameListener(listener, scale);
    }

    public final void setScalingType(RendererCommon.ScalingType scalingTypeMatchOrientation, RendererCommon.ScalingType scalingTypeMismatchOrientation) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingTypeMatchOrientation, scalingTypeMismatchOrientation);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewRenderer(Context context) {
        super(context);
        context.getClass();
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        this.eglRenderer = new SurfaceEglRenderer(resourceName);
        setSurfaceTextureListener(this);
    }

    public final void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr) {
        init$default(this, context, rendererEvents, iArr, null, 8, null);
    }

    public final void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init$default(this, context, rendererEvents, null, null, 12, null);
    }
}

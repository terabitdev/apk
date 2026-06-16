package io.livekit.android.renderer;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import et.d;
import io.livekit.android.room.track.video.ViewVisibility;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.RendererCommon;
import livekit.org.webrtc.VideoFrame;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ7\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lio/livekit/android/renderer/SurfaceViewRenderer;", "Llivekit/org/webrtc/SurfaceViewRenderer;", "Lio/livekit/android/room/track/video/ViewVisibility$Notifier;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Llivekit/org/webrtc/EglBase$Context;", "sharedContext", "Llivekit/org/webrtc/RendererCommon$RendererEvents;", "rendererEvents", "", "configAttributes", "Llivekit/org/webrtc/RendererCommon$GlDrawer;", "drawer", "Lsn/z;", "init", "(Llivekit/org/webrtc/EglBase$Context;Llivekit/org/webrtc/RendererCommon$RendererEvents;[ILlivekit/org/webrtc/RendererCommon$GlDrawer;)V", "release", "()V", "Llivekit/org/webrtc/VideoFrame;", "frame", "onFrame", "(Llivekit/org/webrtc/VideoFrame;)V", "Landroid/view/View;", "changedView", "", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Lio/livekit/android/room/track/video/ViewVisibility;", "viewVisibility", "Lio/livekit/android/room/track/video/ViewVisibility;", "getViewVisibility", "()Lio/livekit/android/room/track/video/ViewVisibility;", "setViewVisibility", "(Lio/livekit/android/room/track/video/ViewVisibility;)V", "", "initialized", "Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class SurfaceViewRenderer extends livekit.org.webrtc.SurfaceViewRenderer implements ViewVisibility.Notifier {
    private boolean initialized;
    private ViewVisibility viewVisibility;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // io.livekit.android.room.track.video.ViewVisibility.Notifier
    public ViewVisibility getViewVisibility() {
        return this.viewVisibility;
    }

    @Override // livekit.org.webrtc.SurfaceViewRenderer
    public void init(EglBase.Context sharedContext, RendererCommon.RendererEvents rendererEvents, int[] configAttributes, RendererCommon.GlDrawer drawer) {
        if (this.initialized) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "Reinitializing already initialized SurfaceViewRenderer.", new Object[0]);
            }
        }
        this.initialized = true;
        super.init(sharedContext, rendererEvents, configAttributes, drawer);
    }

    @Override // livekit.org.webrtc.SurfaceViewRenderer, livekit.org.webrtc.VideoSink
    public void onFrame(VideoFrame frame) {
        frame.getClass();
        if (!this.initialized) {
            Log.e("SurfaceViewRenderer", "Received frame when not initialized! You must call Room.initVideoRenderer(view) before using this view!");
        }
        super.onFrame(frame);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        changedView.getClass();
        super.onVisibilityChanged(changedView, visibility);
        ViewVisibility viewVisibility = getViewVisibility();
        if (viewVisibility != null) {
            viewVisibility.recalculate();
        }
    }

    @Override // livekit.org.webrtc.SurfaceViewRenderer
    public void release() {
        this.initialized = false;
        super.release();
    }

    @Override // io.livekit.android.room.track.video.ViewVisibility.Notifier
    public void setViewVisibility(ViewVisibility viewVisibility) {
        this.viewVisibility = viewVisibility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceViewRenderer(Context context) {
        super(context);
        context.getClass();
    }
}

package io.livekit.android.room.track.video;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import io.livekit.android.room.track.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006)"}, d2 = {"Lio/livekit/android/room/track/video/ViewVisibility;", "Lio/livekit/android/room/track/video/VideoSinkVisibility;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lsn/z;", "scheduleRecalculate", "()V", "", "isViewAncestorsVisible", "(Landroid/view/View;)Z", "recalculate", "isVisible", "()Z", "Lio/livekit/android/room/track/Track$Dimensions;", "size", "()Lio/livekit/android/room/track/Track$Dimensions;", "close", "Landroid/view/View;", "lastVisibility", "Z", "lastSize", "Lio/livekit/android/room/track/Track$Dimensions;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "", "loc", "[I", "Landroid/graphics/Rect;", "viewRect", "Landroid/graphics/Rect;", "windowRect", "Notifier", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ViewVisibility extends VideoSinkVisibility {
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private final Handler handler;
    private final Track.Dimensions lastSize;
    private final boolean lastVisibility;
    private final int[] loc;
    private final ViewTreeObserver.OnScrollChangedListener scrollListener;
    private final View view;
    private final Rect viewRect;
    private final Rect windowRect;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/room/track/video/ViewVisibility$Notifier;", "", "viewVisibility", "Lio/livekit/android/room/track/video/ViewVisibility;", "getViewVisibility", "()Lio/livekit/android/room/track/video/ViewVisibility;", "setViewVisibility", "(Lio/livekit/android/room/track/video/ViewVisibility;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Notifier {
        ViewVisibility getViewVisibility();

        void setViewVisibility(ViewVisibility viewVisibility);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewVisibility(View view) {
        view.getClass();
        this.view = view;
        this.lastSize = new Track.Dimensions(0, 0);
        this.handler = new Handler(Looper.getMainLooper());
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.livekit.android.room.track.video.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewVisibility.globalLayoutListener$lambda$0(ViewVisibility.this);
            }
        };
        this.globalLayoutListener = onGlobalLayoutListener;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: io.livekit.android.room.track.video.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ViewVisibility.scrollListener$lambda$1(ViewVisibility.this);
            }
        };
        this.scrollListener = onScrollChangedListener;
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        if (view instanceof Notifier) {
            ((Notifier) view).setViewVisibility(this);
        }
        this.loc = new int[2];
        this.viewRect = new Rect();
        this.windowRect = new Rect();
    }

    public static /* synthetic */ void b(ViewVisibility viewVisibility) {
        scheduleRecalculate$lambda$2(viewVisibility);
    }

    public static final void globalLayoutListener$lambda$0(ViewVisibility viewVisibility) {
        viewVisibility.getClass();
        viewVisibility.scheduleRecalculate();
    }

    private final boolean isViewAncestorsVisible(View view) {
        View view2;
        if (view.getVisibility() != 0) {
            return false;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            return isViewAncestorsVisible(view2);
        }
        return true;
    }

    private final void scheduleRecalculate() {
        this.handler.removeCallbacksAndMessages(null);
        this.handler.postDelayed(new i8.c(this, 3), 2000L);
    }

    public static final void scheduleRecalculate$lambda$2(ViewVisibility viewVisibility) {
        viewVisibility.getClass();
        viewVisibility.recalculate();
    }

    public static final void scrollListener$lambda$1(ViewVisibility viewVisibility) {
        viewVisibility.getClass();
        viewVisibility.scheduleRecalculate();
    }

    @Override // io.livekit.android.room.track.video.VideoSinkVisibility
    public void close() {
        super.close();
        this.handler.removeCallbacksAndMessages(null);
        this.view.getViewTreeObserver().removeOnScrollChangedListener(this.scrollListener);
        this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        KeyEvent.Callback callback = this.view;
        if ((callback instanceof Notifier) && m.c(((Notifier) callback).getViewVisibility(), this)) {
            ((Notifier) this.view).setViewVisibility(null);
        }
    }

    @Override // io.livekit.android.room.track.video.VideoSinkVisibility
    public boolean isVisible() {
        if (this.view.getWindowVisibility() != 0 || !isViewAncestorsVisible(this.view)) {
            return false;
        }
        this.view.getLocationInWindow(this.loc);
        Rect rect = this.viewRect;
        int[] iArr = this.loc;
        int i10 = iArr[0];
        rect.set(i10, iArr[1], this.view.getWidth() + i10, this.view.getHeight() + this.loc[1]);
        this.view.getWindowVisibleDisplayFrame(this.windowRect);
        Rect rect2 = this.windowRect;
        rect2.offset(-rect2.left, -rect2.top);
        return this.viewRect.intersect(this.windowRect);
    }

    public final void recalculate() {
        boolean z6;
        boolean isVisible = isVisible();
        Track.Dimensions size = size();
        boolean z10 = true;
        if (isVisible != this.lastVisibility) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (m.c(size, this.lastSize)) {
            z10 = z6;
        }
        if (z10) {
            notifyChanged();
        }
    }

    @Override // io.livekit.android.room.track.video.VideoSinkVisibility
    public Track.Dimensions size() {
        return new Track.Dimensions(this.view.getWidth(), this.view.getHeight());
    }
}

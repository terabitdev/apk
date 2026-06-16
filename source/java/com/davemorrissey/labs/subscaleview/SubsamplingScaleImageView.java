package com.davemorrissey.labs.subscaleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.m;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import b.d;
import com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import com.google.android.gms.internal.measurement.i6;
import d.b;
import d.e;
import f2.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o2.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class SubsamplingScaleImageView extends View {
    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    public static final int SCALE_TYPE_START = 4;
    private static final String TAG = "SubsamplingScaleImageView";
    public static final int TILE_SIZE_AUTO = Integer.MAX_VALUE;
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    private static Bitmap.Config preferredBitmapConfig;
    private Anim anim;
    private Bitmap bitmap;
    private DecoderFactory<? extends ImageDecoder> bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private ImageRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    private final float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private final float[] dstArray;
    private boolean eagerLoadingEnabled;
    private Executor executor;
    private int fullImageSampleSize;
    private final Handler handler;
    private boolean imageLoadedSent;
    private boolean isPanning;
    private boolean isQuickScaling;
    private boolean isZooming;
    private Matrix matrix;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    private int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    private OnImageEventListener onImageEventListener;
    private View.OnLongClickListener onLongClickListener;
    private OnStateChangedListener onStateChangedListener;
    private int orientation;
    private Rect pRegion;
    private boolean panEnabled;
    private int panLimit;
    private Float pendingScale;
    private boolean quickScaleEnabled;
    private float quickScaleLastDistance;
    private boolean quickScaleMoved;
    private PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    private PointF quickScaleVLastPoint;
    private PointF quickScaleVStart;
    private boolean readySent;
    private DecoderFactory<? extends ImageRegionDecoder> regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    private Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private ScaleAndTranslate satTemp;
    private float scale;
    private float scaleStart;
    private GestureDetector singleDetector;
    private final float[] srcArray;
    private Paint tileBgPaint;
    private Map<Integer, List<Tile>> tileMap;
    private Uri uri;
    private PointF vCenterStart;
    private float vDistStart;
    private PointF vTranslate;
    private PointF vTranslateBefore;
    private PointF vTranslateStart;
    private boolean zoomEnabled;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    private static final List<Integer> VALID_ORIENTATIONS = Arrays.asList(0, 90, Integer.valueOf(ORIENTATION_180), Integer.valueOf(ORIENTATION_270), -1);
    private static final List<Integer> VALID_ZOOM_STYLES = Arrays.asList(1, 2, 3);
    private static final List<Integer> VALID_EASING_STYLES = Arrays.asList(2, 1);
    private static final List<Integer> VALID_PAN_LIMITS = Arrays.asList(1, 2, 3);
    private static final List<Integer> VALID_SCALE_TYPES = Arrays.asList(2, 1, 3, 4);

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class Anim {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private PointF sCenterEnd;
        private PointF sCenterEndRequested;
        private PointF sCenterStart;
        private float scaleEnd;
        private float scaleStart;
        private long time;
        private PointF vFocusEnd;
        private PointF vFocusStart;

        private Anim() {
            this.duration = 500L;
            this.interruptible = true;
            this.easing = 2;
            this.origin = 1;
            this.time = System.currentTimeMillis();
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class BitmapLoadTask extends AsyncTask<Void, Void, Integer> {
        private Bitmap bitmap;
        private final WeakReference<Context> contextRef;
        private final WeakReference<DecoderFactory<? extends ImageDecoder>> decoderFactoryRef;
        private Exception exception;
        private final boolean preview;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public BitmapLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageDecoder> decoderFactory, Uri uri, boolean z10) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<>(context);
            this.decoderFactoryRef = new WeakReference<>(decoderFactory);
            this.source = uri;
            this.preview = z10;
        }

        @Override // android.os.AsyncTask
        public Integer doInBackground(Void... voidArr) {
            try {
                String uri = this.source.toString();
                Context context = this.contextRef.get();
                DecoderFactory<? extends ImageDecoder> decoderFactory = this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (context != null && decoderFactory != null && subsamplingScaleImageView != null) {
                    subsamplingScaleImageView.debug("BitmapLoadTask.doInBackground", new Object[0]);
                    this.bitmap = decoderFactory.make().decode(context, this.source);
                    return Integer.valueOf(subsamplingScaleImageView.getExifOrientation(context, uri));
                }
                return null;
            } catch (Exception e10) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to load bitmap", e10);
                this.exception = e10;
                return null;
            } catch (OutOfMemoryError e11) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to load bitmap - OutOfMemoryError", e11);
                this.exception = new RuntimeException(e11);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.bitmap;
                if (bitmap != null && num != null) {
                    if (this.preview) {
                        subsamplingScaleImageView.onPreviewLoaded(bitmap);
                        return;
                    } else {
                        subsamplingScaleImageView.onImageLoaded(bitmap, num.intValue(), false);
                        return;
                    }
                }
                if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    if (this.preview) {
                        subsamplingScaleImageView.onImageEventListener.onPreviewLoadError(this.exception);
                    } else {
                        subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.exception);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface OnAnimationEventListener {
        void onComplete();

        void onInterruptedByNewAnim();

        void onInterruptedByUser();
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface OnImageEventListener {
        void onImageLoadError(Exception exc);

        void onImageLoaded();

        void onPreviewLoadError(Exception exc);

        void onPreviewReleased();

        void onReady();

        void onTileLoadError(Exception exc);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface OnStateChangedListener {
        void onCenterChanged(PointF pointF, int i);

        void onScaleChanged(float f7, int i);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class ScaleAndTranslate {
        private float scale;
        private final PointF vTranslate;

        private ScaleAndTranslate(float f7, PointF pointF) {
            this.scale = f7;
            this.vTranslate = pointF;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class Tile {
        private Bitmap bitmap;
        private Rect fileSRect;
        private boolean loading;
        private Rect sRect;
        private int sampleSize;
        private Rect vRect;
        private boolean visible;

        private Tile() {
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class TileLoadTask extends AsyncTask<Void, Void, Bitmap> {
        private final WeakReference<ImageRegionDecoder> decoderRef;
        private Exception exception;
        private final WeakReference<Tile> tileRef;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public TileLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, Tile tile) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.decoderRef = new WeakReference<>(imageRegionDecoder);
            this.tileRef = new WeakReference<>(tile);
            tile.loading = true;
        }

        @Override // android.os.AsyncTask
        public Bitmap doInBackground(Void... voidArr) {
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                ImageRegionDecoder imageRegionDecoder = this.decoderRef.get();
                Tile tile = this.tileRef.get();
                if (imageRegionDecoder != null && tile != null && subsamplingScaleImageView != null && imageRegionDecoder.isReady() && tile.visible) {
                    subsamplingScaleImageView.debug("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", tile.sRect, Integer.valueOf(tile.sampleSize));
                    subsamplingScaleImageView.decoderLock.readLock().lock();
                    try {
                        if (imageRegionDecoder.isReady()) {
                            subsamplingScaleImageView.fileSRect(tile.sRect, tile.fileSRect);
                            if (subsamplingScaleImageView.sRegion != null) {
                                tile.fileSRect.offset(subsamplingScaleImageView.sRegion.left, subsamplingScaleImageView.sRegion.top);
                            }
                            Bitmap decodeRegion = imageRegionDecoder.decodeRegion(tile.fileSRect, tile.sampleSize);
                            subsamplingScaleImageView.decoderLock.readLock().unlock();
                            return decodeRegion;
                        }
                        tile.loading = false;
                        subsamplingScaleImageView.decoderLock.readLock().unlock();
                        return null;
                    } catch (Throwable th) {
                        subsamplingScaleImageView.decoderLock.readLock().unlock();
                        throw th;
                    }
                }
                if (tile != null) {
                    tile.loading = false;
                    return null;
                }
                return null;
            } catch (Exception e10) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to decode tile", e10);
                this.exception = e10;
                return null;
            } catch (OutOfMemoryError e11) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to decode tile - OutOfMemoryError", e11);
                this.exception = new RuntimeException(e11);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            Tile tile = this.tileRef.get();
            if (subsamplingScaleImageView != null && tile != null) {
                if (bitmap != null) {
                    tile.bitmap = bitmap;
                    tile.loading = false;
                    subsamplingScaleImageView.onTileLoaded();
                } else if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onTileLoadError(this.exception);
                }
            }
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class TilesInitTask extends AsyncTask<Void, Void, int[]> {
        private final WeakReference<Context> contextRef;
        private ImageRegionDecoder decoder;
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> decoderFactoryRef;
        private Exception exception;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public TilesInitTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<>(context);
            this.decoderFactoryRef = new WeakReference<>(decoderFactory);
            this.source = uri;
        }

        @Override // android.os.AsyncTask
        public int[] doInBackground(Void... voidArr) {
            try {
                String uri = this.source.toString();
                Context context = this.contextRef.get();
                DecoderFactory<? extends ImageRegionDecoder> decoderFactory = this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (context != null && decoderFactory != null && subsamplingScaleImageView != null) {
                    subsamplingScaleImageView.debug("TilesInitTask.doInBackground", new Object[0]);
                    ImageRegionDecoder make = decoderFactory.make();
                    this.decoder = make;
                    Point init = make.init(context, this.source);
                    int i = init.x;
                    int i3 = init.y;
                    int exifOrientation = subsamplingScaleImageView.getExifOrientation(context, uri);
                    if (subsamplingScaleImageView.sRegion != null) {
                        subsamplingScaleImageView.sRegion.left = Math.max(0, subsamplingScaleImageView.sRegion.left);
                        subsamplingScaleImageView.sRegion.top = Math.max(0, subsamplingScaleImageView.sRegion.top);
                        subsamplingScaleImageView.sRegion.right = Math.min(i, subsamplingScaleImageView.sRegion.right);
                        subsamplingScaleImageView.sRegion.bottom = Math.min(i3, subsamplingScaleImageView.sRegion.bottom);
                        i = subsamplingScaleImageView.sRegion.width();
                        i3 = subsamplingScaleImageView.sRegion.height();
                    }
                    return new int[]{i, i3, exifOrientation};
                }
                return null;
            } catch (Exception e10) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to initialise bitmap decoder", e10);
                this.exception = e10;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView != null) {
                ImageRegionDecoder imageRegionDecoder = this.decoder;
                if (imageRegionDecoder != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.onTilesInited(imageRegionDecoder, iArr[0], iArr[1], iArr[2]);
                } else if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.exception);
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        this.orientation = 0;
        this.maxScale = 2.0f;
        this.minScale = minScale();
        this.minimumTileDpi = -1;
        this.panLimit = 1;
        this.minimumScaleType = 1;
        this.maxTileWidth = Integer.MAX_VALUE;
        this.maxTileHeight = Integer.MAX_VALUE;
        this.executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.eagerLoadingEnabled = true;
        this.panEnabled = true;
        this.zoomEnabled = true;
        this.quickScaleEnabled = true;
        this.doubleTapZoomScale = 1.0f;
        this.doubleTapZoomStyle = 1;
        this.doubleTapZoomDuration = 500;
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.bitmapDecoderFactory = new CompatDecoderFactory(SkiaImageDecoder.class);
        this.regionDecoderFactory = new CompatDecoderFactory(SkiaImageRegionDecoder.class);
        this.srcArray = new float[8];
        this.dstArray = new float[8];
        this.density = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.handler = new Handler(new Handler.Callback() { // from class: com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.onLongClickListener != null) {
                    SubsamplingScaleImageView.this.maxTouchCount = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.onLongClickListener);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SubsamplingScaleImageView);
            if (obtainStyledAttributes.hasValue(R.styleable.SubsamplingScaleImageView_assetName) && (string = obtainStyledAttributes.getString(R.styleable.SubsamplingScaleImageView_assetName)) != null && string.length() > 0) {
                setImage(ImageSource.asset(string).tilingEnabled());
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SubsamplingScaleImageView_src) && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.SubsamplingScaleImageView_src, 0)) > 0) {
                setImage(ImageSource.resource(resourceId).tilingEnabled());
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SubsamplingScaleImageView_panEnabled)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(R.styleable.SubsamplingScaleImageView_panEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SubsamplingScaleImageView_zoomEnabled)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(R.styleable.SubsamplingScaleImageView_zoomEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SubsamplingScaleImageView_quickScaleEnabled)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(R.styleable.SubsamplingScaleImageView_quickScaleEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SubsamplingScaleImageView_tileBackgroundColor)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(R.styleable.SubsamplingScaleImageView_tileBackgroundColor, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.quickScaleThreshold = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    private int calculateInSampleSize(float f7) {
        int round;
        if (this.minimumTileDpi > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f7 *= this.minimumTileDpi / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int sWidth = (int) (sWidth() * f7);
        int sHeight = (int) (sHeight() * f7);
        if (sWidth != 0 && sHeight != 0) {
            int i = 1;
            if (sHeight() <= sHeight && sWidth() <= sWidth) {
                round = 1;
            } else {
                round = Math.round(sHeight() / sHeight);
                int round2 = Math.round(sWidth() / sWidth);
                if (round >= round2) {
                    round = round2;
                }
            }
            while (true) {
                int i3 = i * 2;
                if (i3 < round) {
                    i = i3;
                } else {
                    return i;
                }
            }
        } else {
            return 32;
        }
    }

    private boolean checkImageLoaded() {
        boolean isBaseLayerReady = isBaseLayerReady();
        if (!this.imageLoadedSent && isBaseLayerReady) {
            preDraw();
            this.imageLoadedSent = true;
            onImageLoaded();
            OnImageEventListener onImageEventListener = this.onImageEventListener;
            if (onImageEventListener != null) {
                onImageEventListener.onImageLoaded();
            }
        }
        return isBaseLayerReady;
    }

    private boolean checkReady() {
        boolean z10;
        if (getWidth() > 0 && getHeight() > 0 && this.sWidth > 0 && this.sHeight > 0 && (this.bitmap != null || isBaseLayerReady())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.readySent && z10) {
            preDraw();
            this.readySent = true;
            onReady();
            OnImageEventListener onImageEventListener = this.onImageEventListener;
            if (onImageEventListener != null) {
                onImageEventListener.onReady();
            }
        }
        return z10;
    }

    private void createPaints() {
        if (this.bitmapPaint == null) {
            Paint paint = new Paint();
            this.bitmapPaint = paint;
            paint.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if ((this.debugTextPaint == null || this.debugLinePaint == null) && this.debug) {
            Paint paint2 = new Paint();
            this.debugTextPaint = paint2;
            paint2.setTextSize(px(12));
            this.debugTextPaint.setColor(-65281);
            this.debugTextPaint.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.debugLinePaint = paint3;
            paint3.setColor(-65281);
            this.debugLinePaint.setStyle(Paint.Style.STROKE);
            this.debugLinePaint.setStrokeWidth(px(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void debug(String str, Object... objArr) {
        if (this.debug) {
            Log.d(TAG, String.format(str, objArr));
        }
    }

    private float distance(float f7, float f10, float f11, float f12) {
        float f13 = f7 - f10;
        float f14 = f11 - f12;
        return (float) Math.sqrt((f14 * f14) + (f13 * f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doubleTapZoom(PointF pointF, PointF pointF2) {
        boolean z10;
        if (!this.panEnabled) {
            PointF pointF3 = this.sRequestedCenter;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = sWidth() / 2;
                pointF.y = sHeight() / 2;
            }
        }
        float min = Math.min(this.maxScale, this.doubleTapZoomScale);
        float f7 = this.scale;
        if (f7 > min * 0.9d && f7 != this.minScale) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            min = minScale();
        }
        float f10 = min;
        int i = this.doubleTapZoomStyle;
        if (i == 3) {
            setScaleAndCenter(f10, pointF);
        } else {
            if (i != 2 && z10 && this.panEnabled) {
                if (i == 1) {
                    new AnimationBuilder(f10, pointF, pointF2).withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
                }
            } else {
                new AnimationBuilder(f10, pointF).withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
            }
            invalidate();
        }
        invalidate();
    }

    private float ease(int i, long j, float f7, float f10, long j10) {
        if (i != 1) {
            if (i == 2) {
                return easeInOutQuad(j, f7, f10, j10);
            }
            d.j(i6.m(i, "Unexpected easing type: "));
            return 0.0f;
        }
        return easeOutQuad(j, f7, f10, j10);
    }

    private float easeInOutQuad(long j, float f7, float f10, long j10) {
        float f11 = ((float) j) / (((float) j10) / 2.0f);
        if (f11 < 1.0f) {
            return ((f10 / 2.0f) * f11 * f11) + f7;
        }
        float f12 = f11 - 1.0f;
        return ((((f12 - 2.0f) * f12) - 1.0f) * ((-f10) / 2.0f)) + f7;
    }

    private float easeOutQuad(long j, float f7, float f10, long j10) {
        float f11 = ((float) j) / ((float) j10);
        return m.f(f11, 2.0f, (-f10) * f11, f7);
    }

    private void execute(AsyncTask<Void, Void, ?> asyncTask) {
        asyncTask.executeOnExecutor(this.executor, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fileSRect(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (getRequiredRotation() == 90) {
            int i = rect.top;
            int i3 = this.sHeight;
            rect2.set(i, i3 - rect.right, rect.bottom, i3 - rect.left);
            return;
        }
        int requiredRotation = getRequiredRotation();
        int i8 = this.sWidth;
        if (requiredRotation == 180) {
            int i10 = i8 - rect.right;
            int i11 = this.sHeight;
            rect2.set(i10, i11 - rect.bottom, i8 - rect.left, i11 - rect.top);
            return;
        }
        rect2.set(i8 - rect.bottom, rect.left, i8 - rect.top, rect.right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fitToBounds(boolean z10, ScaleAndTranslate scaleAndTranslate) {
        float paddingLeft;
        float max;
        int max2;
        float max3;
        if (this.panLimit == 2 && isReady()) {
            z10 = false;
        }
        PointF pointF = scaleAndTranslate.vTranslate;
        float limitedScale = limitedScale(scaleAndTranslate.scale);
        float sWidth = sWidth() * limitedScale;
        float sHeight = sHeight() * limitedScale;
        if (this.panLimit == 3 && isReady()) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - sWidth);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - sHeight);
        } else if (z10) {
            pointF.x = Math.max(pointF.x, getWidth() - sWidth);
            pointF.y = Math.max(pointF.y, getHeight() - sHeight);
        } else {
            pointF.x = Math.max(pointF.x, -sWidth);
            pointF.y = Math.max(pointF.y, -sHeight);
        }
        float f7 = 0.5f;
        if (getPaddingLeft() <= 0 && getPaddingRight() <= 0) {
            paddingLeft = 0.5f;
        } else {
            paddingLeft = getPaddingLeft() / (getPaddingRight() + getPaddingLeft());
        }
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f7 = getPaddingTop() / (getPaddingBottom() + getPaddingTop());
        }
        if (this.panLimit == 3 && isReady()) {
            max = Math.max(0, getWidth() / 2);
            max2 = Math.max(0, getHeight() / 2);
        } else {
            if (z10) {
                max = Math.max(0.0f, (getWidth() - sWidth) * paddingLeft);
                max3 = Math.max(0.0f, (getHeight() - sHeight) * f7);
                pointF.x = Math.min(pointF.x, max);
                pointF.y = Math.min(pointF.y, max3);
                scaleAndTranslate.scale = limitedScale;
            }
            max = Math.max(0, getWidth());
            max2 = Math.max(0, getHeight());
        }
        max3 = max2;
        pointF.x = Math.min(pointF.x, max);
        pointF.y = Math.min(pointF.y, max3);
        scaleAndTranslate.scale = limitedScale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExifOrientation(Context context, String str) {
        int i;
        int i3 = 0;
        if (str.startsWith("content")) {
            Cursor cursor = null;
            try {
                try {
                    cursor = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                    if (cursor != null && cursor.moveToFirst()) {
                        int i8 = cursor.getInt(0);
                        if (VALID_ORIENTATIONS.contains(Integer.valueOf(i8)) && i8 != -1) {
                            i3 = i8;
                        } else {
                            Log.w(TAG, "Unsupported orientation: " + i8);
                        }
                    }
                    if (cursor == null) {
                        return i3;
                    }
                } catch (Exception unused) {
                    Log.w(TAG, "Could not get orientation of image from media store");
                    if (cursor == null) {
                        return 0;
                    }
                }
                cursor.close();
                return i3;
            } finally {
            }
        } else {
            if (!str.startsWith("file:///") || str.startsWith("file:///android_asset/")) {
                return 0;
            }
            try {
                e eVar = new e(str.substring(7));
                b d10 = eVar.d(ExifInterface.TAG_ORIENTATION);
                if (d10 != null) {
                    try {
                        i = d10.e(eVar.f4571d);
                    } catch (NumberFormatException unused2) {
                        i = 1;
                    }
                    if (i == 1 && i != 0) {
                        if (i == 6) {
                            return 90;
                        }
                        if (i == 3) {
                            return ORIENTATION_180;
                        }
                        if (i == 8) {
                            return ORIENTATION_270;
                        }
                        Log.w(TAG, "Unsupported EXIF orientation: " + i);
                        return 0;
                    }
                }
                i = 1;
                return i == 1 ? 0 : 0;
            } catch (Exception unused3) {
                Log.w(TAG, "Could not get EXIF orientation of image");
                return 0;
            }
        }
    }

    private Point getMaxBitmapDimensions(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.maxTileWidth), Math.min(canvas.getMaximumBitmapHeight(), this.maxTileHeight));
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return preferredBitmapConfig;
    }

    private int getRequiredRotation() {
        int i = this.orientation;
        if (i == -1) {
            return this.sOrientation;
        }
        return i;
    }

    private synchronized void initialiseBaseLayer(Point point) {
        Throwable th;
        try {
            try {
                debug("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
                ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
                this.satTemp = scaleAndTranslate;
                fitToBounds(true, scaleAndTranslate);
                int calculateInSampleSize = calculateInSampleSize(this.satTemp.scale);
                this.fullImageSampleSize = calculateInSampleSize;
                if (calculateInSampleSize > 1) {
                    try {
                        this.fullImageSampleSize = calculateInSampleSize / 2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.fullImageSampleSize == 1 && this.sRegion == null && sWidth() < point.x && sHeight() < point.y) {
                    this.decoder.recycle();
                    this.decoder = null;
                    execute(new BitmapLoadTask(this, getContext(), this.bitmapDecoderFactory, this.uri, false));
                } else {
                    initialiseTileMap(point);
                    Iterator<Tile> it = this.tileMap.get(Integer.valueOf(this.fullImageSampleSize)).iterator();
                    while (it.hasNext()) {
                        execute(new TileLoadTask(this, this.decoder, it.next()));
                    }
                    refreshRequiredTiles(true);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initialiseTileMap(Point point) {
        boolean z10;
        int i;
        int i3;
        int i8 = 0;
        int i10 = 1;
        debug("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.tileMap = new LinkedHashMap();
        int i11 = this.fullImageSampleSize;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            int sWidth = sWidth() / i12;
            int sHeight = sHeight() / i13;
            int i14 = sWidth / i11;
            int i15 = sHeight / i11;
            while (true) {
                if (i14 + i12 + i10 > point.x || (i14 > getWidth() * 1.25d && i11 < this.fullImageSampleSize)) {
                    i12++;
                    sWidth = sWidth() / i12;
                    i14 = sWidth / i11;
                }
            }
            while (true) {
                if (i15 + i13 + i10 > point.y || (i15 > getHeight() * 1.25d && i11 < this.fullImageSampleSize)) {
                    i13++;
                    sHeight = sHeight() / i13;
                    i15 = sHeight / i11;
                }
            }
            ArrayList arrayList = new ArrayList(i12 * i13);
            int i16 = i8;
            while (i16 < i12) {
                int i17 = i8;
                while (i17 < i13) {
                    Tile tile = new Tile();
                    tile.sampleSize = i11;
                    if (i11 == this.fullImageSampleSize) {
                        z10 = i10;
                    } else {
                        z10 = i8;
                    }
                    tile.visible = z10;
                    int i18 = i16 * sWidth;
                    int i19 = i17 * sHeight;
                    if (i16 == i12 - 1) {
                        i = sWidth();
                    } else {
                        i = (i16 + 1) * sWidth;
                    }
                    if (i17 == i13 - 1) {
                        i3 = sHeight();
                    } else {
                        i3 = (i17 + 1) * sHeight;
                    }
                    tile.sRect = new Rect(i18, i19, i, i3);
                    i8 = 0;
                    tile.vRect = new Rect(0, 0, 0, 0);
                    tile.fileSRect = new Rect(tile.sRect);
                    arrayList.add(tile);
                    i17++;
                    i10 = 1;
                }
                i16++;
                i10 = 1;
            }
            this.tileMap.put(Integer.valueOf(i11), arrayList);
            i10 = 1;
            if (i11 == 1) {
                return;
            } else {
                i11 /= 2;
            }
        }
    }

    private boolean isBaseLayerReady() {
        boolean z10 = true;
        if (this.bitmap != null && !this.bitmapIsPreview) {
            return true;
        }
        Map<Integer, List<Tile>> map = this.tileMap;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<Tile>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.fullImageSampleSize) {
                for (Tile tile : entry.getValue()) {
                    if (tile.loading || tile.bitmap == null) {
                        z10 = false;
                    }
                }
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointF limitedSCenter(float f7, float f10, float f11, PointF pointF) {
        PointF vTranslateForSCenter = vTranslateForSCenter(f7, f10, f11);
        pointF.set((((((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft()) - vTranslateForSCenter.x) / f11, (((((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop()) - vTranslateForSCenter.y) / f11);
        return pointF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float limitedScale(float f7) {
        return Math.min(this.maxScale, Math.max(minScale(), f7));
    }

    private float minScale() {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i = this.minimumScaleType;
        if (i != 2 && i != 4) {
            if (i == 3) {
                float f7 = this.minScale;
                if (f7 > 0.0f) {
                    return f7;
                }
            }
            return Math.min((getWidth() - paddingRight) / sWidth(), (getHeight() - paddingTop) / sHeight());
        }
        return Math.max((getWidth() - paddingRight) / sWidth(), (getHeight() - paddingTop) / sHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onImageLoaded(Bitmap bitmap, int i, boolean z10) {
        OnImageEventListener onImageEventListener;
        try {
            debug("onImageLoaded", new Object[0]);
            int i3 = this.sWidth;
            if (i3 > 0) {
                if (this.sHeight > 0) {
                    if (i3 == bitmap.getWidth()) {
                        if (this.sHeight != bitmap.getHeight()) {
                        }
                    }
                    reset(false);
                }
            }
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null && !this.bitmapIsCached) {
                bitmap2.recycle();
            }
            if (this.bitmap != null && this.bitmapIsCached && (onImageEventListener = this.onImageEventListener) != null) {
                onImageEventListener.onPreviewReleased();
            }
            this.bitmapIsPreview = false;
            this.bitmapIsCached = z10;
            this.bitmap = bitmap;
            this.sWidth = bitmap.getWidth();
            this.sHeight = bitmap.getHeight();
            this.sOrientation = i;
            boolean checkReady = checkReady();
            boolean checkImageLoaded = checkImageLoaded();
            if (checkReady || checkImageLoaded) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onPreviewLoaded(Bitmap bitmap) {
        try {
            debug("onPreviewLoaded", new Object[0]);
            if (this.bitmap == null && !this.imageLoadedSent) {
                Rect rect = this.pRegion;
                if (rect != null) {
                    this.bitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.pRegion.height());
                } else {
                    this.bitmap = bitmap;
                }
                this.bitmapIsPreview = true;
                if (checkReady()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onTileLoaded() {
        Bitmap bitmap;
        try {
            debug("onTileLoaded", new Object[0]);
            checkReady();
            checkImageLoaded();
            if (isBaseLayerReady() && (bitmap = this.bitmap) != null) {
                if (!this.bitmapIsCached) {
                    bitmap.recycle();
                }
                this.bitmap = null;
                OnImageEventListener onImageEventListener = this.onImageEventListener;
                if (onImageEventListener != null && this.bitmapIsCached) {
                    onImageEventListener.onPreviewReleased();
                }
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onTilesInited(ImageRegionDecoder imageRegionDecoder, int i, int i3, int i8) {
        int i10;
        int i11;
        int i12;
        try {
            debug("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(this.orientation));
            int i13 = this.sWidth;
            if (i13 > 0 && (i12 = this.sHeight) > 0 && (i13 != i || i12 != i3)) {
                reset(false);
                Bitmap bitmap = this.bitmap;
                if (bitmap != null) {
                    if (!this.bitmapIsCached) {
                        bitmap.recycle();
                    }
                    this.bitmap = null;
                    OnImageEventListener onImageEventListener = this.onImageEventListener;
                    if (onImageEventListener != null && this.bitmapIsCached) {
                        onImageEventListener.onPreviewReleased();
                    }
                    this.bitmapIsPreview = false;
                    this.bitmapIsCached = false;
                }
            }
            this.decoder = imageRegionDecoder;
            this.sWidth = i;
            this.sHeight = i3;
            this.sOrientation = i8;
            checkReady();
            if (!checkImageLoaded() && (i10 = this.maxTileWidth) > 0 && i10 != Integer.MAX_VALUE && (i11 = this.maxTileHeight) > 0 && i11 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
                initialiseBaseLayer(new Point(this.maxTileWidth, this.maxTileHeight));
            }
            invalidate();
            requestLayout();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1 != 262) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onTouchEventInternal(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        boolean z16 = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action != 6) {
                            if (action != 261) {
                            }
                        }
                    }
                } else if (this.maxTouchCount > 0) {
                    if (pointerCount >= 2) {
                        float distance = distance(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                        float x5 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        if (this.zoomEnabled) {
                            PointF pointF = this.vCenterStart;
                            if (distance(pointF.x, x5, pointF.y, y10) > 5.0f || Math.abs(distance - this.vDistStart) > 5.0f || this.isPanning) {
                                this.isZooming = true;
                                this.isPanning = true;
                                double d10 = this.scale;
                                float min = Math.min(this.maxScale, (distance / this.vDistStart) * this.scaleStart);
                                this.scale = min;
                                if (min <= minScale()) {
                                    this.vDistStart = distance;
                                    this.scaleStart = minScale();
                                    this.vCenterStart.set(x5, y10);
                                    this.vTranslateStart.set(this.vTranslate);
                                } else if (this.panEnabled) {
                                    PointF pointF2 = this.vCenterStart;
                                    float f7 = pointF2.x;
                                    PointF pointF3 = this.vTranslateStart;
                                    float f10 = f7 - pointF3.x;
                                    float f11 = pointF2.y - pointF3.y;
                                    float f12 = this.scale;
                                    float f13 = this.scaleStart;
                                    float f14 = (f12 / f13) * f10;
                                    float f15 = (f12 / f13) * f11;
                                    PointF pointF4 = this.vTranslate;
                                    pointF4.x = x5 - f14;
                                    pointF4.y = y10 - f15;
                                    if ((sHeight() * d10 < getHeight() && this.scale * sHeight() >= getHeight()) || (d10 * sWidth() < getWidth() && this.scale * sWidth() >= getWidth())) {
                                        fitToBounds(true);
                                        this.vCenterStart.set(x5, y10);
                                        this.vTranslateStart.set(this.vTranslate);
                                        this.scaleStart = this.scale;
                                        this.vDistStart = distance;
                                    }
                                } else {
                                    PointF pointF5 = this.sRequestedCenter;
                                    PointF pointF6 = this.vTranslate;
                                    if (pointF5 != null) {
                                        pointF6.x = (getWidth() / 2) - (this.scale * this.sRequestedCenter.x);
                                        this.vTranslate.y = (getHeight() / 2) - (this.scale * this.sRequestedCenter.y);
                                    } else {
                                        pointF6.x = (getWidth() / 2) - (this.scale * (sWidth() / 2));
                                        this.vTranslate.y = (getHeight() / 2) - (this.scale * (sHeight() / 2));
                                    }
                                }
                                fitToBounds(true);
                                refreshRequiredTiles(this.eagerLoadingEnabled);
                                this.handler.removeMessages(1);
                                invalidate();
                                return true;
                            }
                        }
                    } else {
                        if (this.isQuickScaling) {
                            float abs = (Math.abs(this.quickScaleVStart.y - motionEvent.getY()) * 2.0f) + this.quickScaleThreshold;
                            if (this.quickScaleLastDistance == -1.0f) {
                                this.quickScaleLastDistance = abs;
                            }
                            float y11 = motionEvent.getY();
                            PointF pointF7 = this.quickScaleVLastPoint;
                            if (y11 > pointF7.y) {
                                z16 = true;
                            }
                            pointF7.set(0.0f, motionEvent.getY());
                            float f16 = 1.0f;
                            float abs2 = Math.abs(1.0f - (abs / this.quickScaleLastDistance)) * 0.5f;
                            if (abs2 > 0.03f || this.quickScaleMoved) {
                                this.quickScaleMoved = true;
                                if (this.quickScaleLastDistance > 0.0f) {
                                    if (z16) {
                                        f16 = abs2 + 1.0f;
                                    } else {
                                        f16 = 1.0f - abs2;
                                    }
                                }
                                double d11 = this.scale;
                                float max = Math.max(minScale(), Math.min(this.maxScale, this.scale * f16));
                                this.scale = max;
                                if (this.panEnabled) {
                                    PointF pointF8 = this.vCenterStart;
                                    float f17 = pointF8.x;
                                    PointF pointF9 = this.vTranslateStart;
                                    float f18 = f17 - pointF9.x;
                                    float f19 = pointF8.y;
                                    float f20 = f19 - pointF9.y;
                                    float f21 = this.scaleStart;
                                    float f22 = (max / f21) * f18;
                                    float f23 = (max / f21) * f20;
                                    PointF pointF10 = this.vTranslate;
                                    pointF10.x = f17 - f22;
                                    pointF10.y = f19 - f23;
                                    if ((sHeight() * d11 < getHeight() && this.scale * sHeight() >= getHeight()) || (d11 * sWidth() < getWidth() && this.scale * sWidth() >= getWidth())) {
                                        fitToBounds(true);
                                        this.vCenterStart.set(sourceToViewCoord(this.quickScaleSCenter));
                                        this.vTranslateStart.set(this.vTranslate);
                                        this.scaleStart = this.scale;
                                        abs = 0.0f;
                                    }
                                } else {
                                    PointF pointF11 = this.sRequestedCenter;
                                    PointF pointF12 = this.vTranslate;
                                    if (pointF11 != null) {
                                        pointF12.x = (getWidth() / 2) - (this.scale * this.sRequestedCenter.x);
                                        this.vTranslate.y = (getHeight() / 2) - (this.scale * this.sRequestedCenter.y);
                                    } else {
                                        pointF12.x = (getWidth() / 2) - (this.scale * (sWidth() / 2));
                                        this.vTranslate.y = (getHeight() / 2) - (this.scale * (sHeight() / 2));
                                    }
                                }
                            }
                            this.quickScaleLastDistance = abs;
                            fitToBounds(true);
                            refreshRequiredTiles(this.eagerLoadingEnabled);
                        } else if (!this.isZooming) {
                            float abs3 = Math.abs(motionEvent.getX() - this.vCenterStart.x);
                            float abs4 = Math.abs(motionEvent.getY() - this.vCenterStart.y);
                            float f24 = this.density * 5.0f;
                            if (abs3 > f24 || abs4 > f24 || this.isPanning) {
                                this.vTranslate.x = (motionEvent.getX() - this.vCenterStart.x) + this.vTranslateStart.x;
                                this.vTranslate.y = (motionEvent.getY() - this.vCenterStart.y) + this.vTranslateStart.y;
                                PointF pointF13 = this.vTranslate;
                                float f25 = pointF13.x;
                                float f26 = pointF13.y;
                                fitToBounds(true);
                                PointF pointF14 = this.vTranslate;
                                if (f25 != pointF14.x) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                float f27 = pointF14.y;
                                if (f26 != f27) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 && abs3 > abs4 && !this.isPanning) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z12 && abs4 > abs3 && !this.isPanning) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (f26 == f27 && abs4 > 3.0f * f24) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (!z13 && !z14 && (!z11 || !z12 || z15 || this.isPanning)) {
                                    this.isPanning = true;
                                } else if (abs3 > f24 || abs4 > f24) {
                                    this.maxTouchCount = 0;
                                    this.handler.removeMessages(1);
                                    requestDisallowInterceptTouchEvent(false);
                                }
                                if (!this.panEnabled) {
                                    PointF pointF15 = this.vTranslate;
                                    PointF pointF16 = this.vTranslateStart;
                                    pointF15.x = pointF16.x;
                                    pointF15.y = pointF16.y;
                                    requestDisallowInterceptTouchEvent(false);
                                }
                                refreshRequiredTiles(this.eagerLoadingEnabled);
                            }
                        }
                        this.handler.removeMessages(1);
                        invalidate();
                        return true;
                    }
                }
                return false;
            }
            this.handler.removeMessages(1);
            if (this.isQuickScaling) {
                this.isQuickScaling = false;
                if (!this.quickScaleMoved) {
                    doubleTapZoom(this.quickScaleSCenter, this.vCenterStart);
                }
            }
            if (this.maxTouchCount > 0 && ((z10 = this.isZooming) || this.isPanning)) {
                if (z10 && pointerCount == 2) {
                    this.isPanning = true;
                    PointF pointF17 = this.vTranslateStart;
                    PointF pointF18 = this.vTranslate;
                    pointF17.set(pointF18.x, pointF18.y);
                    int actionIndex = motionEvent.getActionIndex();
                    PointF pointF19 = this.vCenterStart;
                    if (actionIndex == 1) {
                        pointF19.set(motionEvent.getX(0), motionEvent.getY(0));
                    } else {
                        pointF19.set(motionEvent.getX(1), motionEvent.getY(1));
                    }
                }
                if (pointerCount < 3) {
                    this.isZooming = false;
                }
                if (pointerCount < 2) {
                    this.isPanning = false;
                    this.maxTouchCount = 0;
                }
                refreshRequiredTiles(true);
                return true;
            }
            if (pointerCount == 1) {
                this.isZooming = false;
                this.isPanning = false;
                this.maxTouchCount = 0;
            }
            return true;
        }
        this.anim = null;
        requestDisallowInterceptTouchEvent(true);
        this.maxTouchCount = Math.max(this.maxTouchCount, pointerCount);
        if (pointerCount >= 2) {
            if (this.zoomEnabled) {
                float distance2 = distance(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                this.scaleStart = this.scale;
                this.vDistStart = distance2;
                PointF pointF20 = this.vTranslateStart;
                PointF pointF21 = this.vTranslate;
                pointF20.set(pointF21.x, pointF21.y);
                this.vCenterStart.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
            } else {
                this.maxTouchCount = 0;
            }
            this.handler.removeMessages(1);
        } else if (!this.isQuickScaling) {
            PointF pointF22 = this.vTranslateStart;
            PointF pointF23 = this.vTranslate;
            pointF22.set(pointF23.x, pointF23.y);
            this.vCenterStart.set(motionEvent.getX(), motionEvent.getY());
            this.handler.sendEmptyMessageDelayed(1, 600L);
        }
        return true;
    }

    private void preDraw() {
        Float f7;
        if (getWidth() != 0 && getHeight() != 0 && this.sWidth > 0 && this.sHeight > 0) {
            if (this.sPendingCenter != null && (f7 = this.pendingScale) != null) {
                this.scale = f7.floatValue();
                if (this.vTranslate == null) {
                    this.vTranslate = new PointF();
                }
                this.vTranslate.x = (getWidth() / 2) - (this.scale * this.sPendingCenter.x);
                this.vTranslate.y = (getHeight() / 2) - (this.scale * this.sPendingCenter.y);
                this.sPendingCenter = null;
                this.pendingScale = null;
                fitToBounds(true);
                refreshRequiredTiles(true);
            }
            fitToBounds(false);
        }
    }

    private int px(int i) {
        return (int) (this.density * i);
    }

    private void refreshRequiredTiles(boolean z10) {
        if (this.decoder != null && this.tileMap != null) {
            int min = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
            Iterator<Map.Entry<Integer, List<Tile>>> it = this.tileMap.entrySet().iterator();
            while (it.hasNext()) {
                for (Tile tile : it.next().getValue()) {
                    if (tile.sampleSize < min || (tile.sampleSize > min && tile.sampleSize != this.fullImageSampleSize)) {
                        tile.visible = false;
                        if (tile.bitmap != null) {
                            tile.bitmap.recycle();
                            tile.bitmap = null;
                        }
                    }
                    if (tile.sampleSize == min) {
                        if (tileVisible(tile)) {
                            tile.visible = true;
                            if (!tile.loading && tile.bitmap == null && z10) {
                                execute(new TileLoadTask(this, this.decoder, tile));
                            }
                        } else if (tile.sampleSize != this.fullImageSampleSize) {
                            tile.visible = false;
                            if (tile.bitmap != null) {
                                tile.bitmap.recycle();
                                tile.bitmap = null;
                            }
                        }
                    } else if (tile.sampleSize == this.fullImageSampleSize) {
                        tile.visible = true;
                    }
                }
            }
        }
    }

    private void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private void reset(boolean z10) {
        OnImageEventListener onImageEventListener;
        debug("reset newImage=" + z10, new Object[0]);
        this.scale = 0.0f;
        this.scaleStart = 0.0f;
        this.vTranslate = null;
        this.vTranslateStart = null;
        this.vTranslateBefore = null;
        this.pendingScale = Float.valueOf(0.0f);
        this.sPendingCenter = null;
        this.sRequestedCenter = null;
        this.isZooming = false;
        this.isPanning = false;
        this.isQuickScaling = false;
        this.maxTouchCount = 0;
        this.fullImageSampleSize = 0;
        this.vCenterStart = null;
        this.vDistStart = 0.0f;
        this.quickScaleLastDistance = 0.0f;
        this.quickScaleMoved = false;
        this.quickScaleSCenter = null;
        this.quickScaleVLastPoint = null;
        this.quickScaleVStart = null;
        this.anim = null;
        this.satTemp = null;
        this.matrix = null;
        this.sRect = null;
        if (z10) {
            this.uri = null;
            this.decoderLock.writeLock().lock();
            try {
                ImageRegionDecoder imageRegionDecoder = this.decoder;
                if (imageRegionDecoder != null) {
                    imageRegionDecoder.recycle();
                    this.decoder = null;
                }
                this.decoderLock.writeLock().unlock();
                Bitmap bitmap = this.bitmap;
                if (bitmap != null && !this.bitmapIsCached) {
                    bitmap.recycle();
                }
                if (this.bitmap != null && this.bitmapIsCached && (onImageEventListener = this.onImageEventListener) != null) {
                    onImageEventListener.onPreviewReleased();
                }
                this.sWidth = 0;
                this.sHeight = 0;
                this.sOrientation = 0;
                this.sRegion = null;
                this.pRegion = null;
                this.readySent = false;
                this.imageLoadedSent = false;
                this.bitmap = null;
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            } catch (Throwable th) {
                this.decoderLock.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<Tile>> map = this.tileMap;
        if (map != null) {
            Iterator<Map.Entry<Integer, List<Tile>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (Tile tile : it.next().getValue()) {
                    tile.visible = false;
                    if (tile.bitmap != null) {
                        tile.bitmap.recycle();
                        tile.bitmap = null;
                    }
                }
            }
            this.tileMap = null;
        }
        setGestureDetector(getContext());
    }

    private void restoreState(ImageViewState imageViewState) {
        if (imageViewState != null && VALID_ORIENTATIONS.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            this.orientation = imageViewState.getOrientation();
            this.pendingScale = Float.valueOf(imageViewState.getScale());
            this.sPendingCenter = imageViewState.getCenter();
            invalidate();
        }
    }

    private int sHeight() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation != 90 && requiredRotation != 270) {
            return this.sHeight;
        }
        return this.sWidth;
    }

    private int sWidth() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation != 90 && requiredRotation != 270) {
            return this.sWidth;
        }
        return this.sHeight;
    }

    private void sendStateChanged(float f7, PointF pointF, int i) {
        OnStateChangedListener onStateChangedListener = this.onStateChangedListener;
        if (onStateChangedListener != null) {
            float f10 = this.scale;
            if (f10 != f7) {
                onStateChangedListener.onScaleChanged(f10, i);
            }
        }
        if (this.onStateChangedListener != null && !this.vTranslate.equals(pointF)) {
            this.onStateChangedListener.onCenterChanged(getCenter(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(final Context context) {
        this.detector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (SubsamplingScaleImageView.this.zoomEnabled && SubsamplingScaleImageView.this.readySent && SubsamplingScaleImageView.this.vTranslate != null) {
                    SubsamplingScaleImageView.this.setGestureDetector(context);
                    boolean z10 = SubsamplingScaleImageView.this.quickScaleEnabled;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    if (z10) {
                        subsamplingScaleImageView.vCenterStart = new PointF(motionEvent.getX(), motionEvent.getY());
                        SubsamplingScaleImageView.this.vTranslateStart = new PointF(SubsamplingScaleImageView.this.vTranslate.x, SubsamplingScaleImageView.this.vTranslate.y);
                        SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                        subsamplingScaleImageView2.scaleStart = subsamplingScaleImageView2.scale;
                        SubsamplingScaleImageView.this.isQuickScaling = true;
                        SubsamplingScaleImageView.this.isZooming = true;
                        SubsamplingScaleImageView.this.quickScaleLastDistance = -1.0f;
                        SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                        subsamplingScaleImageView3.quickScaleSCenter = subsamplingScaleImageView3.viewToSourceCoord(subsamplingScaleImageView3.vCenterStart);
                        SubsamplingScaleImageView.this.quickScaleVStart = new PointF(motionEvent.getX(), motionEvent.getY());
                        SubsamplingScaleImageView.this.quickScaleVLastPoint = new PointF(SubsamplingScaleImageView.this.quickScaleSCenter.x, SubsamplingScaleImageView.this.quickScaleSCenter.y);
                        SubsamplingScaleImageView.this.quickScaleMoved = false;
                        return false;
                    }
                    subsamplingScaleImageView.doubleTapZoom(subsamplingScaleImageView.viewToSourceCoord(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                    return true;
                }
                return super.onDoubleTapEvent(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
                if (SubsamplingScaleImageView.this.panEnabled && SubsamplingScaleImageView.this.readySent && SubsamplingScaleImageView.this.vTranslate != null && motionEvent != null && motionEvent2 != null && ((Math.abs(motionEvent.getX() - motionEvent2.getX()) > 50.0f || Math.abs(motionEvent.getY() - motionEvent2.getY()) > 50.0f) && ((Math.abs(f7) > 500.0f || Math.abs(f10) > 500.0f) && !SubsamplingScaleImageView.this.isZooming))) {
                    PointF pointF = new PointF((f7 * 0.25f) + SubsamplingScaleImageView.this.vTranslate.x, (f10 * 0.25f) + SubsamplingScaleImageView.this.vTranslate.y);
                    new AnimationBuilder(new PointF(((SubsamplingScaleImageView.this.getWidth() / 2) - pointF.x) / SubsamplingScaleImageView.this.scale, ((SubsamplingScaleImageView.this.getHeight() / 2) - pointF.y) / SubsamplingScaleImageView.this.scale)).withEasing(1).withPanLimited(false).withOrigin(3).start();
                    return true;
                }
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
        this.singleDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.3
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
    }

    private void setMatrixArray(float[] fArr, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        fArr[0] = f7;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        preferredBitmapConfig = config;
    }

    private void sourceToViewRect(Rect rect, Rect rect2) {
        rect2.set((int) sourceToViewX(rect.left), (int) sourceToViewY(rect.top), (int) sourceToViewX(rect.right), (int) sourceToViewY(rect.bottom));
    }

    private float sourceToViewX(float f7) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f7 * this.scale) + pointF.x;
    }

    private float sourceToViewY(float f7) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f7 * this.scale) + pointF.y;
    }

    private boolean tileVisible(Tile tile) {
        float viewToSourceX = viewToSourceX(0.0f);
        float viewToSourceX2 = viewToSourceX(getWidth());
        float viewToSourceY = viewToSourceY(0.0f);
        float viewToSourceY2 = viewToSourceY(getHeight());
        if (viewToSourceX <= tile.sRect.right && tile.sRect.left <= viewToSourceX2 && viewToSourceY <= tile.sRect.bottom && tile.sRect.top <= viewToSourceY2) {
            return true;
        }
        return false;
    }

    private PointF vTranslateForSCenter(float f7, float f10, float f11) {
        int width = (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft();
        int height = (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop();
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
        }
        this.satTemp.scale = f11;
        this.satTemp.vTranslate.set(width - (f7 * f11), height - (f10 * f11));
        fitToBounds(true, this.satTemp);
        return this.satTemp.vTranslate;
    }

    private float viewToSourceX(float f7) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f7 - pointF.x) / this.scale;
    }

    private float viewToSourceY(float f7) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f7 - pointF.y) / this.scale;
    }

    public AnimationBuilder animateCenter(PointF pointF) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(pointF);
    }

    public AnimationBuilder animateScale(float f7) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(f7);
    }

    public AnimationBuilder animateScaleAndCenter(float f7, PointF pointF) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(f7, pointF);
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        return viewToSourceCoord(getWidth() / 2, getHeight() / 2);
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return minScale();
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void getPanRemaining(RectF rectF) {
        if (!isReady()) {
            return;
        }
        float sWidth = this.scale * sWidth();
        float sHeight = this.scale * sHeight();
        int i = this.panLimit;
        if (i == 3) {
            rectF.top = Math.max(0.0f, -(this.vTranslate.y - (getHeight() / 2)));
            rectF.left = Math.max(0.0f, -(this.vTranslate.x - (getWidth() / 2)));
            rectF.bottom = Math.max(0.0f, this.vTranslate.y - ((getHeight() / 2) - sHeight));
            rectF.right = Math.max(0.0f, this.vTranslate.x - ((getWidth() / 2) - sWidth));
            return;
        }
        PointF pointF = this.vTranslate;
        if (i == 2) {
            rectF.top = Math.max(0.0f, -(pointF.y - getHeight()));
            rectF.left = Math.max(0.0f, -(this.vTranslate.x - getWidth()));
            rectF.bottom = Math.max(0.0f, this.vTranslate.y + sHeight);
            rectF.right = Math.max(0.0f, this.vTranslate.x + sWidth);
            return;
        }
        rectF.top = Math.max(0.0f, -pointF.y);
        rectF.left = Math.max(0.0f, -this.vTranslate.x);
        rectF.bottom = Math.max(0.0f, (sHeight + this.vTranslate.y) - getHeight());
        rectF.right = Math.max(0.0f, (sWidth + this.vTranslate.x) - getWidth());
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    public final ImageViewState getState() {
        if (this.vTranslate != null && this.sWidth > 0 && this.sHeight > 0) {
            return new ImageViewState(getScale(), getCenter(), getOrientation());
        }
        return null;
    }

    public boolean hasImage() {
        if (this.uri == null && this.bitmap == null) {
            return false;
        }
        return true;
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        char c10;
        float f7;
        int i3;
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        super.onDraw(canvas);
        createPaints();
        if (this.sWidth != 0 && this.sHeight != 0 && getWidth() != 0 && getHeight() != 0) {
            if (this.tileMap == null && this.decoder != null) {
                initialiseBaseLayer(getMaxBitmapDimensions(canvas));
            }
            if (checkReady()) {
                preDraw();
                Anim anim = this.anim;
                if (anim != null && anim.vFocusStart != null) {
                    float f10 = this.scale;
                    if (this.vTranslateBefore == null) {
                        this.vTranslateBefore = new PointF(0.0f, 0.0f);
                    }
                    this.vTranslateBefore.set(this.vTranslate);
                    long currentTimeMillis = System.currentTimeMillis() - this.anim.time;
                    if (currentTimeMillis > this.anim.duration) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long min = Math.min(currentTimeMillis, this.anim.duration);
                    this.scale = ease(this.anim.easing, min, this.anim.scaleStart, this.anim.scaleEnd - this.anim.scaleStart, this.anim.duration);
                    float ease = ease(this.anim.easing, min, this.anim.vFocusStart.x, this.anim.vFocusEnd.x - this.anim.vFocusStart.x, this.anim.duration);
                    float ease2 = ease(this.anim.easing, min, this.anim.vFocusStart.y, this.anim.vFocusEnd.y - this.anim.vFocusStart.y, this.anim.duration);
                    this.vTranslate.x -= sourceToViewX(this.anim.sCenterEnd.x) - ease;
                    this.vTranslate.y -= sourceToViewY(this.anim.sCenterEnd.y) - ease2;
                    if (!z10 && this.anim.scaleStart != this.anim.scaleEnd) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    fitToBounds(z11);
                    sendStateChanged(f10, this.vTranslateBefore, this.anim.origin);
                    refreshRequiredTiles(z10);
                    if (z10) {
                        if (this.anim.listener != null) {
                            try {
                                this.anim.listener.onComplete();
                            } catch (Exception e10) {
                                Log.w(TAG, "Error thrown by animation listener", e10);
                            }
                        }
                        this.anim = null;
                    }
                    invalidate();
                }
                Map<Integer, List<Tile>> map = this.tileMap;
                int i14 = ORIENTATION_270;
                int i15 = ORIENTATION_180;
                int i16 = 90;
                int i17 = 5;
                if (map != null && isBaseLayerReady()) {
                    int min2 = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
                    boolean z12 = false;
                    for (Map.Entry<Integer, List<Tile>> entry : this.tileMap.entrySet()) {
                        if (entry.getKey().intValue() == min2) {
                            for (Tile tile : entry.getValue()) {
                                if (tile.visible && (tile.loading || tile.bitmap == null)) {
                                    z12 = true;
                                }
                            }
                        }
                    }
                    for (Map.Entry<Integer, List<Tile>> entry2 : this.tileMap.entrySet()) {
                        if (entry2.getKey().intValue() == min2 || z12) {
                            for (Tile tile2 : entry2.getValue()) {
                                sourceToViewRect(tile2.sRect, tile2.vRect);
                                if (!tile2.loading && tile2.bitmap != null) {
                                    if (this.tileBgPaint != null) {
                                        canvas.drawRect(tile2.vRect, this.tileBgPaint);
                                    }
                                    if (this.matrix == null) {
                                        this.matrix = new Matrix();
                                    }
                                    this.matrix.reset();
                                    i11 = i15;
                                    i12 = i16;
                                    i10 = i14;
                                    i13 = i17;
                                    setMatrixArray(this.srcArray, 0.0f, 0.0f, tile2.bitmap.getWidth(), 0.0f, tile2.bitmap.getWidth(), tile2.bitmap.getHeight(), 0.0f, tile2.bitmap.getHeight());
                                    if (getRequiredRotation() == 0) {
                                        setMatrixArray(this.dstArray, tile2.vRect.left, tile2.vRect.top, tile2.vRect.right, tile2.vRect.top, tile2.vRect.right, tile2.vRect.bottom, tile2.vRect.left, tile2.vRect.bottom);
                                    } else if (getRequiredRotation() == i12) {
                                        setMatrixArray(this.dstArray, tile2.vRect.right, tile2.vRect.top, tile2.vRect.right, tile2.vRect.bottom, tile2.vRect.left, tile2.vRect.bottom, tile2.vRect.left, tile2.vRect.top);
                                    } else if (getRequiredRotation() == i11) {
                                        setMatrixArray(this.dstArray, tile2.vRect.right, tile2.vRect.bottom, tile2.vRect.left, tile2.vRect.bottom, tile2.vRect.left, tile2.vRect.top, tile2.vRect.right, tile2.vRect.top);
                                    } else if (getRequiredRotation() == i10) {
                                        setMatrixArray(this.dstArray, tile2.vRect.left, tile2.vRect.bottom, tile2.vRect.left, tile2.vRect.top, tile2.vRect.right, tile2.vRect.top, tile2.vRect.right, tile2.vRect.bottom);
                                    }
                                    this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                                    canvas.drawBitmap(tile2.bitmap, this.matrix, this.bitmapPaint);
                                    if (this.debug) {
                                        canvas.drawRect(tile2.vRect, this.debugLinePaint);
                                    }
                                } else {
                                    i10 = i14;
                                    i11 = i15;
                                    i12 = i16;
                                    i13 = i17;
                                    if (tile2.loading && this.debug) {
                                        canvas.drawText("LOADING", tile2.vRect.left + px(i13), tile2.vRect.top + px(35), this.debugTextPaint);
                                    }
                                }
                                if (tile2.visible && this.debug) {
                                    canvas.drawText("ISS " + tile2.sampleSize + " RECT " + tile2.sRect.top + "," + tile2.sRect.left + "," + tile2.sRect.bottom + "," + tile2.sRect.right, tile2.vRect.left + px(i13), tile2.vRect.top + px(15), this.debugTextPaint);
                                }
                                i14 = i10;
                                i15 = i11;
                                i16 = i12;
                                i17 = i13;
                            }
                        }
                        i14 = i14;
                        i15 = i15;
                        i16 = i16;
                        i17 = i17;
                    }
                    i = i17;
                    c10 = 0;
                } else {
                    i = 5;
                    c10 = 0;
                    if (this.bitmap != null) {
                        float f11 = this.scale;
                        if (this.bitmapIsPreview) {
                            f11 *= this.sWidth / r0.getWidth();
                            f7 = this.scale * (this.sHeight / this.bitmap.getHeight());
                        } else {
                            f7 = f11;
                        }
                        if (this.matrix == null) {
                            this.matrix = new Matrix();
                        }
                        this.matrix.reset();
                        this.matrix.postScale(f11, f7);
                        this.matrix.postRotate(getRequiredRotation());
                        Matrix matrix = this.matrix;
                        PointF pointF = this.vTranslate;
                        matrix.postTranslate(pointF.x, pointF.y);
                        if (getRequiredRotation() == 180) {
                            Matrix matrix2 = this.matrix;
                            float f12 = this.scale;
                            matrix2.postTranslate(this.sWidth * f12, f12 * this.sHeight);
                        } else if (getRequiredRotation() == 90) {
                            this.matrix.postTranslate(this.scale * this.sHeight, 0.0f);
                        } else if (getRequiredRotation() == 270) {
                            this.matrix.postTranslate(0.0f, this.scale * this.sWidth);
                        }
                        if (this.tileBgPaint != null) {
                            if (this.sRect == null) {
                                this.sRect = new RectF();
                            }
                            RectF rectF = this.sRect;
                            if (this.bitmapIsPreview) {
                                i3 = this.bitmap.getWidth();
                            } else {
                                i3 = this.sWidth;
                            }
                            float f13 = i3;
                            if (this.bitmapIsPreview) {
                                i8 = this.bitmap.getHeight();
                            } else {
                                i8 = this.sHeight;
                            }
                            rectF.set(0.0f, 0.0f, f13, i8);
                            this.matrix.mapRect(this.sRect);
                            canvas.drawRect(this.sRect, this.tileBgPaint);
                        }
                        canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
                    }
                }
                if (this.debug) {
                    StringBuilder sb = new StringBuilder("Scale: ");
                    Locale locale = Locale.ENGLISH;
                    Object[] objArr = new Object[1];
                    objArr[c10] = Float.valueOf(this.scale);
                    sb.append(String.format(locale, "%.2f", objArr));
                    sb.append(" (");
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = Float.valueOf(minScale());
                    sb.append(String.format(locale, "%.2f", objArr2));
                    sb.append(" - ");
                    Object[] objArr3 = new Object[1];
                    objArr3[c10] = Float.valueOf(this.maxScale);
                    sb.append(String.format(locale, "%.2f", objArr3));
                    sb.append(")");
                    canvas.drawText(sb.toString(), px(i), px(15), this.debugTextPaint);
                    StringBuilder sb2 = new StringBuilder("Translate: ");
                    Object[] objArr4 = new Object[1];
                    objArr4[c10] = Float.valueOf(this.vTranslate.x);
                    sb2.append(String.format(locale, "%.2f", objArr4));
                    sb2.append(":");
                    Object[] objArr5 = new Object[1];
                    objArr5[c10] = Float.valueOf(this.vTranslate.y);
                    sb2.append(String.format(locale, "%.2f", objArr5));
                    canvas.drawText(sb2.toString(), px(i), px(30), this.debugTextPaint);
                    PointF center = getCenter();
                    StringBuilder sb3 = new StringBuilder("Source center: ");
                    Object[] objArr6 = new Object[1];
                    objArr6[c10] = Float.valueOf(center.x);
                    sb3.append(String.format(locale, "%.2f", objArr6));
                    sb3.append(":");
                    Object[] objArr7 = new Object[1];
                    objArr7[c10] = Float.valueOf(center.y);
                    sb3.append(String.format(locale, "%.2f", objArr7));
                    canvas.drawText(sb3.toString(), px(i), px(45), this.debugTextPaint);
                    Anim anim2 = this.anim;
                    if (anim2 != null) {
                        PointF sourceToViewCoord = sourceToViewCoord(anim2.sCenterStart);
                        PointF sourceToViewCoord2 = sourceToViewCoord(this.anim.sCenterEndRequested);
                        PointF sourceToViewCoord3 = sourceToViewCoord(this.anim.sCenterEnd);
                        canvas.drawCircle(sourceToViewCoord.x, sourceToViewCoord.y, px(10), this.debugLinePaint);
                        this.debugLinePaint.setColor(SupportMenu.CATEGORY_MASK);
                        canvas.drawCircle(sourceToViewCoord2.x, sourceToViewCoord2.y, px(20), this.debugLinePaint);
                        this.debugLinePaint.setColor(-16776961);
                        canvas.drawCircle(sourceToViewCoord3.x, sourceToViewCoord3.y, px(25), this.debugLinePaint);
                        this.debugLinePaint.setColor(-16711681);
                        canvas.drawCircle(getWidth() / 2, getHeight() / 2, px(30), this.debugLinePaint);
                    }
                    if (this.vCenterStart != null) {
                        this.debugLinePaint.setColor(SupportMenu.CATEGORY_MASK);
                        PointF pointF2 = this.vCenterStart;
                        canvas.drawCircle(pointF2.x, pointF2.y, px(20), this.debugLinePaint);
                    }
                    if (this.quickScaleSCenter != null) {
                        this.debugLinePaint.setColor(-16776961);
                        canvas.drawCircle(sourceToViewX(this.quickScaleSCenter.x), sourceToViewY(this.quickScaleSCenter.y), px(35), this.debugLinePaint);
                    }
                    if (this.quickScaleVStart != null && this.isQuickScaling) {
                        this.debugLinePaint.setColor(-16711681);
                        PointF pointF3 = this.quickScaleVStart;
                        canvas.drawCircle(pointF3.x, pointF3.y, px(30), this.debugLinePaint);
                    }
                    this.debugLinePaint.setColor(-65281);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        boolean z10;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i3);
        boolean z11 = false;
        if (mode != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (mode2 != 1073741824) {
            z11 = true;
        }
        if (this.sWidth > 0 && this.sHeight > 0) {
            if (z10 && z11) {
                size = sWidth();
                size2 = sHeight();
            } else if (z11) {
                size2 = (int) ((sHeight() / sWidth()) * size);
            } else if (z10) {
                size = (int) ((sWidth() / sHeight()) * size2);
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i8, int i10) {
        debug("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i8), Integer.valueOf(i10), Integer.valueOf(i), Integer.valueOf(i3));
        PointF center = getCenter();
        if (this.readySent && center != null) {
            this.anim = null;
            this.pendingScale = Float.valueOf(this.scale);
            this.sPendingCenter = center;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        Anim anim = this.anim;
        if (anim != null && !anim.interruptible) {
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        Anim anim2 = this.anim;
        if (anim2 != null && anim2.listener != null) {
            try {
                this.anim.listener.onInterruptedByUser();
            } catch (Exception e10) {
                Log.w(TAG, "Error thrown by animation listener", e10);
            }
        }
        this.anim = null;
        if (this.vTranslate == null) {
            GestureDetector gestureDetector2 = this.singleDetector;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
            }
            return true;
        }
        if (!this.isQuickScaling && ((gestureDetector = this.detector) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.isZooming = false;
            this.isPanning = false;
            this.maxTouchCount = 0;
            return true;
        }
        if (this.vTranslateStart == null) {
            this.vTranslateStart = new PointF(0.0f, 0.0f);
        }
        if (this.vTranslateBefore == null) {
            this.vTranslateBefore = new PointF(0.0f, 0.0f);
        }
        if (this.vCenterStart == null) {
            this.vCenterStart = new PointF(0.0f, 0.0f);
        }
        float f7 = this.scale;
        this.vTranslateBefore.set(this.vTranslate);
        boolean onTouchEventInternal = onTouchEventInternal(motionEvent);
        sendStateChanged(f7, this.vTranslateBefore, 2);
        if (onTouchEventInternal || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void recycle() {
        reset(true);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = Float.valueOf(limitedScale(0.0f));
        if (isReady()) {
            this.sPendingCenter = new PointF(sWidth() / 2, sHeight() / 2);
        } else {
            this.sPendingCenter = new PointF(0.0f, 0.0f);
        }
        invalidate();
    }

    public final void setBitmapDecoderClass(Class<? extends ImageDecoder> cls) {
        if (cls != null) {
            this.bitmapDecoderFactory = new CompatDecoderFactory(cls);
        } else {
            i.k("Decoder class cannot be set to null");
        }
    }

    public final void setBitmapDecoderFactory(DecoderFactory<? extends ImageDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.bitmapDecoderFactory = decoderFactory;
        } else {
            i.k("Decoder factory cannot be set to null");
        }
    }

    public final void setDebug(boolean z10) {
        this.debug = z10;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.doubleTapZoomDuration = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f7) {
        this.doubleTapZoomScale = f7;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (VALID_ZOOM_STYLES.contains(Integer.valueOf(i))) {
            this.doubleTapZoomStyle = i;
        } else {
            i.k(i6.m(i, "Invalid zoom style: "));
        }
    }

    public void setEagerLoadingEnabled(boolean z10) {
        this.eagerLoadingEnabled = z10;
    }

    public void setExecutor(Executor executor) {
        if (executor != null) {
            this.executor = executor;
        } else {
            a.h("Executor must not be null");
        }
    }

    public final void setImage(ImageSource imageSource, ImageSource imageSource2, ImageViewState imageViewState) {
        if (imageSource != null) {
            reset(true);
            if (imageViewState != null) {
                restoreState(imageViewState);
            }
            if (imageSource2 != null) {
                if (imageSource.getBitmap() == null) {
                    if (imageSource.getSWidth() > 0 && imageSource.getSHeight() > 0) {
                        this.sWidth = imageSource.getSWidth();
                        this.sHeight = imageSource.getSHeight();
                        this.pRegion = imageSource2.getSRegion();
                        if (imageSource2.getBitmap() != null) {
                            this.bitmapIsCached = imageSource2.isCached();
                            onPreviewLoaded(imageSource2.getBitmap());
                        } else {
                            Uri uri = imageSource2.getUri();
                            if (uri == null && imageSource2.getResource() != null) {
                                uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + imageSource2.getResource());
                            }
                            execute(new BitmapLoadTask(this, getContext(), this.bitmapDecoderFactory, uri, true));
                        }
                    } else {
                        i.k("Preview image cannot be used unless dimensions are provided for the main image");
                        return;
                    }
                } else {
                    i.k("Preview image cannot be used when a bitmap is provided for the main image");
                    return;
                }
            }
            if (imageSource.getBitmap() != null && imageSource.getSRegion() != null) {
                onImageLoaded(Bitmap.createBitmap(imageSource.getBitmap(), imageSource.getSRegion().left, imageSource.getSRegion().top, imageSource.getSRegion().width(), imageSource.getSRegion().height()), 0, false);
                return;
            }
            if (imageSource.getBitmap() != null) {
                onImageLoaded(imageSource.getBitmap(), 0, imageSource.isCached());
                return;
            }
            this.sRegion = imageSource.getSRegion();
            Uri uri2 = imageSource.getUri();
            this.uri = uri2;
            if (uri2 == null && imageSource.getResource() != null) {
                this.uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + imageSource.getResource());
            }
            if (!imageSource.getTile() && this.sRegion == null) {
                execute(new BitmapLoadTask(this, getContext(), this.bitmapDecoderFactory, this.uri, false));
                return;
            } else {
                execute(new TilesInitTask(this, getContext(), this.regionDecoderFactory, this.uri));
                return;
            }
        }
        a.h("imageSource must not be null");
    }

    public final void setMaxScale(float f7) {
        this.maxScale = f7;
    }

    public void setMaxTileSize(int i) {
        this.maxTileWidth = i;
        this.maxTileHeight = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinScale(float f7) {
        this.minScale = f7;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumScaleType(int i) {
        if (VALID_SCALE_TYPES.contains(Integer.valueOf(i))) {
            this.minimumScaleType = i;
            if (isReady()) {
                fitToBounds(true);
                invalidate();
                return;
            }
            return;
        }
        i.k(i6.m(i, "Invalid scale type: "));
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.minimumTileDpi = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (isReady()) {
            reset(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(OnImageEventListener onImageEventListener) {
        this.onImageEventListener = onImageEventListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onLongClickListener = onLongClickListener;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        this.onStateChangedListener = onStateChangedListener;
    }

    public final void setOrientation(int i) {
        if (VALID_ORIENTATIONS.contains(Integer.valueOf(i))) {
            this.orientation = i;
            reset(false);
            invalidate();
            requestLayout();
            return;
        }
        i.k(i6.m(i, "Invalid orientation: "));
    }

    public final void setPanEnabled(boolean z10) {
        PointF pointF;
        this.panEnabled = z10;
        if (!z10 && (pointF = this.vTranslate) != null) {
            pointF.x = (getWidth() / 2) - (this.scale * (sWidth() / 2));
            this.vTranslate.y = (getHeight() / 2) - (this.scale * (sHeight() / 2));
            if (isReady()) {
                refreshRequiredTiles(true);
                invalidate();
            }
        }
    }

    public final void setPanLimit(int i) {
        if (VALID_PAN_LIMITS.contains(Integer.valueOf(i))) {
            this.panLimit = i;
            if (isReady()) {
                fitToBounds(true);
                invalidate();
                return;
            }
            return;
        }
        i.k(i6.m(i, "Invalid pan limit: "));
    }

    public final void setQuickScaleEnabled(boolean z10) {
        this.quickScaleEnabled = z10;
    }

    public final void setRegionDecoderClass(Class<? extends ImageRegionDecoder> cls) {
        if (cls != null) {
            this.regionDecoderFactory = new CompatDecoderFactory(cls);
        } else {
            i.k("Decoder class cannot be set to null");
        }
    }

    public final void setRegionDecoderFactory(DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.regionDecoderFactory = decoderFactory;
        } else {
            i.k("Decoder factory cannot be set to null");
        }
    }

    public final void setScaleAndCenter(float f7, PointF pointF) {
        this.anim = null;
        this.pendingScale = Float.valueOf(f7);
        this.sPendingCenter = pointF;
        this.sRequestedCenter = pointF;
        invalidate();
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.tileBgPaint = null;
        } else {
            Paint paint = new Paint();
            this.tileBgPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.tileBgPaint.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z10) {
        this.zoomEnabled = z10;
    }

    public final PointF sourceToViewCoord(float f7, float f10, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(sourceToViewX(f7), sourceToViewY(f10));
        return pointF;
    }

    public void viewToFileRect(Rect rect, Rect rect2) {
        if (this.vTranslate != null && this.readySent) {
            rect2.set((int) viewToSourceX(rect.left), (int) viewToSourceY(rect.top), (int) viewToSourceX(rect.right), (int) viewToSourceY(rect.bottom));
            fileSRect(rect2, rect2);
            rect2.set(Math.max(0, rect2.left), Math.max(0, rect2.top), Math.min(this.sWidth, rect2.right), Math.min(this.sHeight, rect2.bottom));
            Rect rect3 = this.sRegion;
            if (rect3 != null) {
                rect2.offset(rect3.left, rect3.top);
            }
        }
    }

    public final PointF viewToSourceCoord(float f7, float f10, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(viewToSourceX(f7), viewToSourceY(f10));
        return pointF;
    }

    public void visibleFileRect(Rect rect) {
        if (this.vTranslate != null && this.readySent) {
            rect.set(0, 0, getWidth(), getHeight());
            viewToFileRect(rect, rect);
        }
    }

    public void setMaxTileSize(int i, int i3) {
        this.maxTileWidth = i;
        this.maxTileHeight = i3;
    }

    public final PointF sourceToViewCoord(float f7, float f10) {
        return sourceToViewCoord(f7, f10, new PointF());
    }

    public final PointF viewToSourceCoord(float f7, float f10) {
        return viewToSourceCoord(f7, f10, new PointF());
    }

    public final PointF sourceToViewCoord(PointF pointF, PointF pointF2) {
        return sourceToViewCoord(pointF.x, pointF.y, pointF2);
    }

    public final PointF viewToSourceCoord(PointF pointF, PointF pointF2) {
        return viewToSourceCoord(pointF.x, pointF.y, pointF2);
    }

    public final PointF sourceToViewCoord(PointF pointF) {
        return sourceToViewCoord(pointF.x, pointF.y, new PointF());
    }

    public final PointF viewToSourceCoord(PointF pointF) {
        return viewToSourceCoord(pointF.x, pointF.y, new PointF());
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class DefaultOnAnimationEventListener implements OnAnimationEventListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onComplete() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onInterruptedByNewAnim() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
        public void onInterruptedByUser() {
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class DefaultOnImageEventListener implements OnImageEventListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoaded() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewReleased() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onReady() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewLoadError(Exception exc) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onTileLoadError(Exception exc) {
        }
    }

    public void onReady() {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public final class AnimationBuilder {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private boolean panLimited;
        private final PointF targetSCenter;
        private final float targetScale;
        private final PointF vFocus;

        private AnimationBuilder(PointF pointF) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = SubsamplingScaleImageView.this.scale;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AnimationBuilder withOrigin(int i) {
            this.origin = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AnimationBuilder withPanLimited(boolean z10) {
            this.panLimited = z10;
            return this;
        }

        public void start() {
            PointF pointF;
            if (SubsamplingScaleImageView.this.anim != null && SubsamplingScaleImageView.this.anim.listener != null) {
                try {
                    SubsamplingScaleImageView.this.anim.listener.onInterruptedByNewAnim();
                } catch (Exception e10) {
                    Log.w(SubsamplingScaleImageView.TAG, "Error thrown by animation listener", e10);
                }
            }
            int width = (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2) + SubsamplingScaleImageView.this.getPaddingLeft();
            int height = (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2) + SubsamplingScaleImageView.this.getPaddingTop();
            float limitedScale = SubsamplingScaleImageView.this.limitedScale(this.targetScale);
            if (this.panLimited) {
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                PointF pointF2 = this.targetSCenter;
                pointF = subsamplingScaleImageView.limitedSCenter(pointF2.x, pointF2.y, limitedScale, new PointF());
            } else {
                pointF = this.targetSCenter;
            }
            SubsamplingScaleImageView.this.anim = new Anim();
            SubsamplingScaleImageView.this.anim.scaleStart = SubsamplingScaleImageView.this.scale;
            SubsamplingScaleImageView.this.anim.scaleEnd = limitedScale;
            SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.sCenterEndRequested = pointF;
            SubsamplingScaleImageView.this.anim.sCenterStart = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.anim.sCenterEnd = pointF;
            SubsamplingScaleImageView.this.anim.vFocusStart = SubsamplingScaleImageView.this.sourceToViewCoord(pointF);
            SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF(width, height);
            SubsamplingScaleImageView.this.anim.duration = this.duration;
            SubsamplingScaleImageView.this.anim.interruptible = this.interruptible;
            SubsamplingScaleImageView.this.anim.easing = this.easing;
            SubsamplingScaleImageView.this.anim.origin = this.origin;
            SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.listener = this.listener;
            PointF pointF3 = this.vFocus;
            if (pointF3 != null) {
                float f7 = pointF3.x - (SubsamplingScaleImageView.this.anim.sCenterStart.x * limitedScale);
                float f10 = this.vFocus.y - (SubsamplingScaleImageView.this.anim.sCenterStart.y * limitedScale);
                ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(limitedScale, new PointF(f7, f10));
                SubsamplingScaleImageView.this.fitToBounds(true, scaleAndTranslate);
                SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF((scaleAndTranslate.vTranslate.x - f7) + this.vFocus.x, (scaleAndTranslate.vTranslate.y - f10) + this.vFocus.y);
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        public AnimationBuilder withDuration(long j) {
            this.duration = j;
            return this;
        }

        public AnimationBuilder withEasing(int i) {
            if (SubsamplingScaleImageView.VALID_EASING_STYLES.contains(Integer.valueOf(i))) {
                this.easing = i;
                return this;
            }
            i.k(i6.m(i, "Unknown easing type: "));
            return null;
        }

        public AnimationBuilder withInterruptible(boolean z10) {
            this.interruptible = z10;
            return this;
        }

        public AnimationBuilder withOnAnimationEventListener(OnAnimationEventListener onAnimationEventListener) {
            this.listener = onAnimationEventListener;
            return this;
        }

        private AnimationBuilder(float f7) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f7;
            this.targetSCenter = SubsamplingScaleImageView.this.getCenter();
            this.vFocus = null;
        }

        private AnimationBuilder(float f7, PointF pointF) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f7;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(float f7, PointF pointF, PointF pointF2) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f7;
            this.targetSCenter = pointF;
            this.vFocus = pointF2;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class DefaultOnStateChangedListener implements OnStateChangedListener {
        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(PointF pointF, int i) {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f7, int i) {
        }
    }

    public void onImageLoaded() {
    }

    private void fitToBounds(boolean z10) {
        boolean z11;
        float f7 = 0.0f;
        if (this.vTranslate == null) {
            this.vTranslate = new PointF(0.0f, 0.0f);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(f7, new PointF(0.0f, 0.0f));
        }
        this.satTemp.scale = this.scale;
        this.satTemp.vTranslate.set(this.vTranslate);
        fitToBounds(z10, this.satTemp);
        this.scale = this.satTemp.scale;
        this.vTranslate.set(this.satTemp.vTranslate);
        if (!z11 || this.minimumScaleType == 4) {
            return;
        }
        this.vTranslate.set(vTranslateForSCenter(sWidth() / 2, sHeight() / 2, this.scale));
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }

    public final void setImage(ImageSource imageSource, ImageViewState imageViewState) {
        setImage(imageSource, null, imageViewState);
    }

    public final void setImage(ImageSource imageSource, ImageSource imageSource2) {
        setImage(imageSource, imageSource2, null);
    }

    public final void setImage(ImageSource imageSource) {
        setImage(imageSource, null, null);
    }
}

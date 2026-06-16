package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import b.d;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class InterpolateOnScrollPositionChangeHelper {
    private ScrollView containingScrollView;
    private MaterialShapeDrawable materialShapeDrawable;
    private View shapedView;
    private final int[] scrollLocation = new int[2];
    private final int[] containerLocation = new int[2];
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            InterpolateOnScrollPositionChangeHelper.this.updateInterpolationForScreenPosition();
        }
    };

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
        this.shapedView = view;
        this.materialShapeDrawable = materialShapeDrawable;
        this.containingScrollView = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.containingScrollView = scrollView;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
        this.materialShapeDrawable = materialShapeDrawable;
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.scrollChangedListener);
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.scrollChangedListener);
    }

    public void updateInterpolationForScreenPosition() {
        ScrollView scrollView = this.containingScrollView;
        if (scrollView != null) {
            if (scrollView.getChildCount() != 0) {
                this.containingScrollView.getLocationInWindow(this.scrollLocation);
                this.containingScrollView.getChildAt(0).getLocationInWindow(this.containerLocation);
                int top = (this.shapedView.getTop() - this.scrollLocation[1]) + this.containerLocation[1];
                int height = this.shapedView.getHeight();
                int height2 = this.containingScrollView.getHeight();
                if (top < 0) {
                    this.materialShapeDrawable.setInterpolation(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
                    this.shapedView.invalidate();
                    return;
                }
                int i = top + height;
                MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
                if (i > height2) {
                    materialShapeDrawable.setInterpolation(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i - height2) / height))));
                    this.shapedView.invalidate();
                    return;
                } else {
                    if (materialShapeDrawable.getInterpolation() != 1.0f) {
                        this.materialShapeDrawable.setInterpolation(1.0f);
                        this.shapedView.invalidate();
                        return;
                    }
                    return;
                }
            }
            d.j("Scroll bar must contain a child to calculate interpolation.");
        }
    }
}

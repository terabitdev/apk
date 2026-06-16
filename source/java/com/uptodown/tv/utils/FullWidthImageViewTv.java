package com.uptodown.tv.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class FullWidthImageViewTv extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullWidthImageViewTv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i3) {
        if (getDrawable() != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), (int) Math.ceil((r3 * getDrawable().getIntrinsicHeight()) / getDrawable().getIntrinsicWidth()));
        } else {
            super.onMeasure(i, i3);
        }
    }
}

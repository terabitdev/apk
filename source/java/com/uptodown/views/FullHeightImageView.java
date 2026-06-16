package com.uptodown.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class FullHeightImageView extends AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullHeightImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i3) {
        if (getDrawable() != null) {
            setMeasuredDimension((int) Math.ceil((r3 * getDrawable().getIntrinsicWidth()) / getDrawable().getIntrinsicHeight()), View.MeasureSpec.getSize(i3));
        } else {
            super.onMeasure(i, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullHeightImageView(Context context) {
        super(context);
        context.getClass();
    }
}

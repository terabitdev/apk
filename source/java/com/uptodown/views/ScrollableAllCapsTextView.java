package com.uptodown.views;

import a6.n;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ScrollableAllCapsTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableAllCapsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        if (getText().toString().length() > 0) {
            setSingleLine();
            setEllipsize(TextUtils.TruncateAt.MARQUEE);
            setMarqueeRepeatLimit(1);
            setFocusable(true);
            setFocusableInTouchMode(true);
            setHorizontallyScrolling(true);
            postDelayed(new n(this, 0), 3000L);
            setAllCaps(true);
        }
    }
}

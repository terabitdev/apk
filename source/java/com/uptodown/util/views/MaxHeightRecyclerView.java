package com.uptodown.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.h;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MaxHeightRecyclerView extends RecyclerView {

    /* renamed from: a, reason: collision with root package name */
    public int f4511a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f4511a = (int) context.getResources().getDimension(R.dimen.remote_install_devices_rv_max_height);
    }

    public final int getMaxHeightPx() {
        return this.f4511a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i3) {
        int i8 = this.f4511a;
        if (i8 > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i3);
    }

    public final void setMaxHeightPx(int i) {
        this.f4511a = i;
    }

    public /* synthetic */ MaxHeightRecyclerView(Context context, AttributeSet attributeSet, int i, h hVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaxHeightRecyclerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}

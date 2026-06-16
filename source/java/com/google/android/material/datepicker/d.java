package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDatePicker f4119b;

    public /* synthetic */ d(MaterialDatePicker materialDatePicker, int i) {
        this.f4118a = i;
        this.f4119b = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4118a) {
            case 0:
                MaterialDatePicker.a(this.f4119b, view);
                return;
            case 1:
                this.f4119b.onPositiveButtonClick(view);
                return;
            default:
                this.f4119b.onNegativeButtonClick(view);
                return;
        }
    }
}

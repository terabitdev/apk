package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4185b;

    public /* synthetic */ c(Object obj, int i) {
        this.f4184a = i;
        this.f4185b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z10) {
        switch (this.f4184a) {
            case 0:
                TimePickerTextInputPresenter.a((TimePickerTextInputPresenter) this.f4185b, materialButtonToggleGroup, i, z10);
                return;
            default:
                TimePickerView.a((TimePickerView) this.f4185b, materialButtonToggleGroup, i, z10);
                return;
        }
    }
}

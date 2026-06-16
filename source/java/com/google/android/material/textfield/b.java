package com.google.android.material.textfield;

import android.view.View;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f4172b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i) {
        this.f4171a = i;
        this.f4172b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f4171a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f4172b).lambda$new$1(view, z10);
                return;
            default:
                ((DropdownMenuEndIconDelegate) this.f4172b).lambda$new$1(view, z10);
                return;
        }
    }
}

package com.google.android.material.textfield;

import android.view.View;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f4170b;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i) {
        this.f4169a = i;
        this.f4170b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4169a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f4170b).lambda$new$0(view);
                return;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f4170b).lambda$new$0(view);
                return;
            default:
                PasswordToggleEndIconDelegate.a((PasswordToggleEndIconDelegate) this.f4170b, view);
                return;
        }
    }
}

package com.google.android.material.bottomappbar;

import android.view.View;
import com.google.android.material.internal.ViewUtils;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4083b;

    public /* synthetic */ a(View view, int i) {
        this.f4082a = i;
        this.f4083b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4082a) {
            case 0:
                BottomAppBar.a(this.f4083b);
                return;
            default:
                ViewUtils.requestFocusAndShowKeyboard(this.f4083b, false);
                return;
        }
    }
}

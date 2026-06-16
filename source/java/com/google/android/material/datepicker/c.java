package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;
import r5.l;
import r5.q;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4117b;

    public /* synthetic */ c(Object obj, int i) {
        this.f4116a = i;
        this.f4117b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        int i;
        int i3;
        switch (this.f4116a) {
            case 0:
                for (EditText editText : (EditText[]) this.f4117b) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                ViewUtils.hideKeyboard(view, false);
                return;
            case 1:
                l lVar = (l) this.f4117b;
                view.getClass();
                if (z10) {
                    i = lVar.f10257a;
                } else {
                    i = lVar.f10258b;
                }
                view.setBackgroundColor(i);
                return;
            default:
                q qVar = (q) this.f4117b;
                view.getClass();
                if (z10) {
                    i3 = qVar.f10266a;
                } else {
                    i3 = qVar.f10267b;
                }
                view.setBackgroundColor(i3);
                return;
        }
    }
}

package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import com.uptodown.R;
import h5.y;
import k5.d0;
import s5.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class TvAppDetailActivity extends a {
    @Override // s5.a
    public final void h(d0 d0Var) {
        d0Var.getClass();
        runOnUiThread(new y(this, d0Var.c(), d0Var.a(), 4));
    }

    @Override // s5.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_app_detail_activity);
    }
}

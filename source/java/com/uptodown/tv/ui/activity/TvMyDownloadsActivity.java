package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import com.uptodown.R;
import k5.d0;
import o4.r4;
import s5.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class TvMyDownloadsActivity extends a {
    @Override // s5.a
    public final void h(d0 d0Var) {
        d0Var.getClass();
        runOnUiThread(new r4(this, d0Var.c(), 1));
    }

    @Override // s5.a
    public final boolean i() {
        return false;
    }

    @Override // s5.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_my_downloads_activity);
    }
}

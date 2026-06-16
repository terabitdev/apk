package com.uptodown.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import c7.n;
import g5.h1;
import j4.a;
import l4.i;
import o4.b;
import o4.b0;
import o4.ec;
import o4.fd;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class YouTubeActivity extends b0 {
    public static final /* synthetic */ int Q = 0;
    public final n O = new n(new ec(this, 3));
    public final b P = new b(this, 7);

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5480a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Window window = getWindow();
        window.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                insetsController.setSystemBarsBehavior(2);
            }
        } else {
            window.getDecorView().setSystemUiVisibility(4);
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
        getOnBackPressedDispatcher().addCallback(this, this.P);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("id_youtube")) {
            str = extras.getString("id_youtube");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            a aVar = new a(this);
            aVar.b(1, "controls");
            aVar.b(1, "fs");
            w0().l.a(new fd(0, this, str), new j4.b(aVar.f7030a));
            w0().l.f4373a.add(new i(this, 1));
            return;
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        w0().l.b();
    }

    public final h1 w0() {
        return (h1) this.O.getValue();
    }
}

package com.uptodown.core.activities;

import a6.v;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.uptodown.R;
import h5.u;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ConfirmDeleteActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4461a = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.confirm_delete_dialog);
        String stringExtra = getIntent().getStringExtra("realPath");
        int intExtra = getIntent().getIntExtra("notificationId", -1);
        ((TextView) findViewById(R.id.tv_confirm_delete_msg)).setText(getString(R.string.dialog_delete_download_msg, stringExtra));
        ((TextView) findViewById(R.id.tv_cancel_confirm_delete)).setOnClickListener(new u(this, 23));
        ((TextView) findViewById(R.id.tv_delete_confirm_delete)).setOnClickListener(new v(stringExtra, this, intExtra));
    }
}

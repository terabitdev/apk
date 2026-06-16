package com.uptodown.core.activities;

import a5.n;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.internal.measurement.l5;
import j$.util.concurrent.ConcurrentHashMap;
import o4.j6;
import t4.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ConfirmationIntentWrapperActivity extends AppCompatActivity {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f4462n = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4463a;

    /* renamed from: b, reason: collision with root package name */
    public int f4464b = -1;
    public a l;
    public final ActivityResultLauncher m;

    public ConfirmationIntentWrapperActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new j6(this, 6));
        registerForActivityResult.getClass();
        this.m = registerForActivityResult;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.pm.PackageInstaller$SessionCallback, t4.a] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelableExtra;
        super.onCreate(bundle);
        this.f4464b = getIntent().getIntExtra("com.uptodown.sapk.session_id", -1);
        this.l = new PackageInstaller.SessionCallback();
        PackageInstaller packageInstaller = getPackageManager().getPackageInstaller();
        a aVar = this.l;
        aVar.getClass();
        packageInstaller.registerSessionCallback(aVar);
        Intent intent = getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = (Parcelable) intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent", Intent.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent");
        }
        try {
            this.m.launch((Intent) parcelableExtra);
        } catch (Exception e10) {
            e10.printStackTrace();
            ConcurrentHashMap concurrentHashMap = n.f152c;
            l5.p(this.f4464b, false);
            this.f4463a = true;
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        a aVar = this.l;
        if (aVar != null) {
            try {
                getPackageManager().getPackageInstaller().unregisterSessionCallback(aVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (!this.f4463a) {
            ConcurrentHashMap concurrentHashMap = n.f152c;
            l5.p(this.f4464b, true);
            s4.a.f10430a.a();
        }
        super.onDestroy();
    }
}

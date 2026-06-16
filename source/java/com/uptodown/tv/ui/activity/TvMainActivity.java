package com.uptodown.tv.ui.activity;

import a5.f;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.leanback.app.BackgroundManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import c8.f0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvMainActivity;
import d7.t;
import g7.c;
import j8.d;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.p;
import n4.e;
import o4.a0;
import o4.b3;
import q4.c0;
import s5.a;
import s5.b;
import t5.i;
import t5.r;
import w5.g;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class TvMainActivity extends a {
    public static final /* synthetic */ int p = 0;
    public AlertDialog l;
    public r m;

    /* renamed from: n, reason: collision with root package name */
    public final ActivityResultLauncher f4491n;
    public final ActivityResultLauncher o;

    public TvMainActivity() {
        final int i = 0;
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: s5.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TvMainActivity f10448b;

            {
                this.f10448b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                String str;
                Bundle extras;
                int i3 = i;
                boolean z10 = false;
                TvMainActivity tvMainActivity = this.f10448b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        int i8 = TvMainActivity.p;
                        if (activityResult.getResultCode() == 10) {
                            Intent data = activityResult.getData();
                            String str2 = null;
                            if (data != null && (extras = data.getExtras()) != null) {
                                str = extras.getString("realPath");
                            } else {
                                str = null;
                            }
                            if (str != null && str.length() != 0) {
                                boolean f7 = w5.a.f(tvMainActivity);
                                File file = new File(str);
                                String absolutePath = file.getAbsolutePath();
                                absolutePath.getClass();
                                Intent intent = new Intent(tvMainActivity, (Class<?>) InstallerActivity.class);
                                intent.putExtra("realPath", absolutePath);
                                intent.putExtra("requireUserAction", f7);
                                intent.putExtra("backgroundInstallation", false);
                                intent.addFlags(GroupFlagsKt.IsMovableContentFlag);
                                tvMainActivity.startActivity(intent);
                                g f10 = g.D.f(tvMainActivity);
                                f10.b();
                                String name = file.getName();
                                name.getClass();
                                k5.r G = f10.G(name);
                                f10.d();
                                Bundle bundle = new Bundle();
                                if (G != null) {
                                    str2 = G.f7495b;
                                }
                                if (str2 != null) {
                                    String str3 = G.f7495b;
                                    str3.getClass();
                                    a.a.e(tvMainActivity, str3, bundle, false);
                                    bundle.putString("packagename", G.f7495b);
                                }
                                if (G != null) {
                                    long j = G.q;
                                    if (j > 0) {
                                        bundle.putString("appId", String.valueOf(j));
                                    }
                                }
                                bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start");
                                a0 a0Var = tvMainActivity.f10445a;
                                if (a0Var != null) {
                                    a0Var.u(bundle, "install");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i10 = TvMainActivity.p;
                        try {
                            SharedPreferences sharedPreferences = tvMainActivity.getSharedPreferences("SettingsPreferences", 0);
                            if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                                z10 = sharedPreferences.getBoolean("gdpr_tracking_allowed", false);
                            }
                        } catch (Exception unused) {
                        }
                        if (z10) {
                            float f11 = UptodownApp.G;
                            e.D(tvMainActivity);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.f4491n = registerForActivityResult;
        final int i3 = 1;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: s5.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TvMainActivity f10448b;

            {
                this.f10448b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                String str;
                Bundle extras;
                int i32 = i3;
                boolean z10 = false;
                TvMainActivity tvMainActivity = this.f10448b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i32) {
                    case 0:
                        int i8 = TvMainActivity.p;
                        if (activityResult.getResultCode() == 10) {
                            Intent data = activityResult.getData();
                            String str2 = null;
                            if (data != null && (extras = data.getExtras()) != null) {
                                str = extras.getString("realPath");
                            } else {
                                str = null;
                            }
                            if (str != null && str.length() != 0) {
                                boolean f7 = w5.a.f(tvMainActivity);
                                File file = new File(str);
                                String absolutePath = file.getAbsolutePath();
                                absolutePath.getClass();
                                Intent intent = new Intent(tvMainActivity, (Class<?>) InstallerActivity.class);
                                intent.putExtra("realPath", absolutePath);
                                intent.putExtra("requireUserAction", f7);
                                intent.putExtra("backgroundInstallation", false);
                                intent.addFlags(GroupFlagsKt.IsMovableContentFlag);
                                tvMainActivity.startActivity(intent);
                                g f10 = g.D.f(tvMainActivity);
                                f10.b();
                                String name = file.getName();
                                name.getClass();
                                k5.r G = f10.G(name);
                                f10.d();
                                Bundle bundle = new Bundle();
                                if (G != null) {
                                    str2 = G.f7495b;
                                }
                                if (str2 != null) {
                                    String str3 = G.f7495b;
                                    str3.getClass();
                                    a.a.e(tvMainActivity, str3, bundle, false);
                                    bundle.putString("packagename", G.f7495b);
                                }
                                if (G != null) {
                                    long j = G.q;
                                    if (j > 0) {
                                        bundle.putString("appId", String.valueOf(j));
                                    }
                                }
                                bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start");
                                a0 a0Var = tvMainActivity.f10445a;
                                if (a0Var != null) {
                                    a0Var.u(bundle, "install");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i10 = TvMainActivity.p;
                        try {
                            SharedPreferences sharedPreferences = tvMainActivity.getSharedPreferences("SettingsPreferences", 0);
                            if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                                z10 = sharedPreferences.getBoolean("gdpr_tracking_allowed", false);
                            }
                        } catch (Exception unused) {
                        }
                        if (z10) {
                            float f11 = UptodownApp.G;
                            e.D(tvMainActivity);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.o = registerForActivityResult2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        fragments.getClass();
        if (t.G0(fragments) instanceof i) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // s5.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        BackgroundManager backgroundManager;
        Intent intent;
        Uri data;
        SharedPreferences sharedPreferences;
        super.onCreate(bundle);
        setContentView(R.layout.tv_activity_main);
        this.m = new r();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        r rVar = this.m;
        c cVar = null;
        if (rVar != null) {
            beginTransaction.replace(R.id.fragmentContainer, rVar).commit();
            try {
                sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused) {
            }
            if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                z10 = sharedPreferences.getBoolean("gdpr_tracking_allowed", false);
                if (z10) {
                    float f7 = UptodownApp.G;
                    e.D(this);
                }
                backgroundManager = BackgroundManager.getInstance(this);
                Drawable drawable = ContextCompat.getDrawable(this, R.drawable.tv_default_background);
                if (backgroundManager != null) {
                    backgroundManager.setDrawable(drawable);
                }
                intent = getIntent();
                if (intent == null && (intent.getFlags() & 1048576) != 1048576 && (data = intent.getData()) != null) {
                    String b10 = f.b(data, this);
                    if (b10 != null) {
                        boolean z11 = true;
                        if (!v.Y(b10, ".xapk", true) && !v.Y(b10, ".apks", true) && !v.Y(b10, ".apkm", true) && !v.Y(b10, ".zip", true)) {
                            z11 = false;
                        }
                        if (z11 || v.Y(b10, ".apk", false)) {
                            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                            intent2.setData(data);
                            this.f4491n.launch(intent2);
                            return;
                        }
                    }
                    f0.z(LifecycleOwnerKt.getLifecycleScope(this), d.f7053a, null, new b3(this, w5.c.d(data), cVar, 21), 2);
                    return;
                }
                return;
            }
            z10 = false;
            if (z10) {
            }
            backgroundManager = BackgroundManager.getInstance(this);
            Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.tv_default_background);
            if (backgroundManager != null) {
            }
            intent = getIntent();
            if (intent == null) {
                return;
            } else {
                return;
            }
        }
        p.i("tvMainFragment");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        boolean z10;
        AlertDialog alertDialog;
        SharedPreferences sharedPreferences;
        super.onResume();
        AlertDialog alertDialog2 = this.l;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        int i = 1;
        boolean z11 = false;
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences.contains("is_in_eea")) {
            z10 = sharedPreferences.getBoolean("is_in_eea", true);
            if (!z10) {
                try {
                    SharedPreferences sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
                    if (sharedPreferences2.contains("gdpr_tracking_allowed")) {
                        z11 = sharedPreferences2.getBoolean("gdpr_tracking_allowed", false);
                    }
                } catch (Exception unused2) {
                }
                if (!z11) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.tracking_disabled_warning_gdpr));
                    builder.setPositiveButton(R.string.gdpr_set_up, new c0(this, i));
                    builder.setNegativeButton(android.R.string.cancel, new b(1));
                    builder.setCancelable(true);
                    this.l = builder.create();
                    if (!isFinishing() && (alertDialog = this.l) != null) {
                        alertDialog.show();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z10 = true;
        if (!z10) {
        }
    }
}

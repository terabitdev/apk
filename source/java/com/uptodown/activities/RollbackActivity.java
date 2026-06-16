package com.uptodown.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.RollbackActivity;
import g5.r0;
import h5.o;
import j8.d;
import j8.e;
import kotlin.jvm.internal.i0;
import m3.c;
import o4.f0;
import o4.g6;
import o4.j4;
import o4.j6;
import o4.s8;
import o4.t8;
import o4.v8;
import o4.y0;
import r4.j0;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class RollbackActivity extends j4 {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f4430f0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public j0 f4433c0;

    /* renamed from: e0, reason: collision with root package name */
    public final ActivityResultLauncher f4435e0;
    public final String Z = "RollbackActivity";

    /* renamed from: a0, reason: collision with root package name */
    public final n f4431a0 = new n(new f0(this, 22));

    /* renamed from: b0, reason: collision with root package name */
    public final ViewModelLazy f4432b0 = new ViewModelLazy(i0.a(v8.class), new t8(this, 0), new s8(this), new t8(this, 1));

    /* renamed from: d0, reason: collision with root package name */
    public final c f4434d0 = new c(this, 25);

    public RollbackActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new j6(this, 3));
        registerForActivityResult.getClass();
        this.f4435e0 = registerForActivityResult;
    }

    @Override // o4.j4
    public final String D0() {
        return this.Z;
    }

    public final r0 N0() {
        return (r0) this.f4431a0.getValue();
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = N0().f5586a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            N0().m.setNavigationIcon(drawable);
            N0().m.setNavigationContentDescription(getString(R.string.back));
        }
        Toolbar toolbar = N0().m;
        boolean z10 = false;
        z10 = false;
        final int i = z10 ? 1 : 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.r8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RollbackActivity f9059b;

            {
                this.f9059b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                RollbackActivity rollbackActivity = this.f9059b;
                switch (i3) {
                    case 0:
                        int i8 = RollbackActivity.f4430f0;
                        rollbackActivity.finish();
                        return;
                    default:
                        int i10 = RollbackActivity.f4430f0;
                        Intent intent = new Intent(rollbackActivity.getApplicationContext(), (Class<?>) GdprPrivacySettings.class);
                        ActivityResultLauncher activityResultLauncher = rollbackActivity.f4435e0;
                        float f7 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(rollbackActivity));
                        return;
                }
            }
        });
        N0().q.setTypeface(s4.c.u);
        final int i3 = 1;
        N0().l.setLayoutManager(new LinearLayoutManager(this, 1, false));
        N0().l.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        N0().l.addItemDecoration(new f(dimension, dimension));
        N0().o.setTypeface(s4.c.v);
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                z10 = sharedPreferences.getBoolean("gdpr_tracking_allowed", false);
            }
        } catch (Exception unused) {
        }
        if (!z10) {
            N0().o.setText(getString(R.string.msg_permissions_rollback));
        }
        N0().p.setTypeface(s4.c.v);
        N0().f5588n.setTypeface(s4.c.v);
        N0().f5588n.setOnClickListener(new View.OnClickListener(this) { // from class: o4.r8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RollbackActivity f9059b;

            {
                this.f9059b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                RollbackActivity rollbackActivity = this.f9059b;
                switch (i32) {
                    case 0:
                        int i8 = RollbackActivity.f4430f0;
                        rollbackActivity.finish();
                        return;
                    default:
                        int i10 = RollbackActivity.f4430f0;
                        Intent intent = new Intent(rollbackActivity.getApplicationContext(), (Class<?>) GdprPrivacySettings.class);
                        ActivityResultLauncher activityResultLauncher = rollbackActivity.f4435e0;
                        float f7 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(rollbackActivity));
                        return;
                }
            }
        });
        N0().f5587b.setOnClickListener(new o(20));
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, null, 3), 2);
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        v8 v8Var = (v8) this.f4432b0.getValue();
        v8Var.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(v8Var);
        e eVar = p0.f3588a;
        c8.f0.z(viewModelScope, d.f7053a, null, new y0(true, v8Var, this, null, 2), 2);
    }
}

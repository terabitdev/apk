package com.uptodown.activities;

import a6.g;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c7.n;
import c8.f0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.WishlistActivity;
import g5.j1;
import g7.c;
import h5.o;
import j8.e;
import java.io.File;
import k5.d0;
import k5.u0;
import kotlin.jvm.internal.i0;
import o4.ad;
import o4.bd;
import o4.cd;
import o4.dd;
import o4.ed;
import o4.g6;
import o4.h3;
import o4.j4;
import o4.xc;
import r4.e1;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class WishlistActivity extends j4 {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f4454g0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public e1 f4457c0;

    /* renamed from: e0, reason: collision with root package name */
    public final ActivityResultLauncher f4459e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ActivityResultLauncher f4460f0;
    public final String Z = "WishlistActivity";

    /* renamed from: a0, reason: collision with root package name */
    public final n f4455a0 = new n(new xc(this, 0));

    /* renamed from: b0, reason: collision with root package name */
    public final ViewModelLazy f4456b0 = new ViewModelLazy(i0.a(ed.class), new dd(this, 0), new cd(this), new dd(this, 1));

    /* renamed from: d0, reason: collision with root package name */
    public final bd f4458d0 = new bd(this, 0);

    public WishlistActivity() {
        final int i = 0;
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: o4.yc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WishlistActivity f9282b;

            {
                this.f9282b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Boolean bool;
                int i3 = i;
                WishlistActivity wishlistActivity = this.f9282b;
                g7.c cVar = null;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        int i8 = WishlistActivity.f4454g0;
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            if (data != null) {
                                bool = Boolean.valueOf(data.getBooleanExtra("wishlistChanged", false));
                            } else {
                                bool = null;
                            }
                            if (kotlin.jvm.internal.p.b(bool, Boolean.TRUE)) {
                                wishlistActivity.f4457c0 = null;
                                ed O0 = wishlistActivity.O0();
                                O0.getClass();
                                O0.f8641c = false;
                                O0.f8643e = 0;
                                O0.a(wishlistActivity);
                                wishlistActivity.setResult(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i10 = WishlistActivity.f4454g0;
                        int i11 = 1;
                        if (activityResult.getResultCode() == 1) {
                            wishlistActivity.P0();
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(wishlistActivity);
                            lifecycleScope.getClass();
                            float f7 = UptodownApp.G;
                            n4.e.y(wishlistActivity);
                            n4.e.x(wishlistActivity);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(lifecycleScope, j8.d.f7053a, null, new b6.r(wishlistActivity, cVar, i11), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.f4459e0 = registerForActivityResult;
        final int i3 = 1;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: o4.yc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WishlistActivity f9282b;

            {
                this.f9282b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Boolean bool;
                int i32 = i3;
                WishlistActivity wishlistActivity = this.f9282b;
                g7.c cVar = null;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i32) {
                    case 0:
                        int i8 = WishlistActivity.f4454g0;
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            if (data != null) {
                                bool = Boolean.valueOf(data.getBooleanExtra("wishlistChanged", false));
                            } else {
                                bool = null;
                            }
                            if (kotlin.jvm.internal.p.b(bool, Boolean.TRUE)) {
                                wishlistActivity.f4457c0 = null;
                                ed O0 = wishlistActivity.O0();
                                O0.getClass();
                                O0.f8641c = false;
                                O0.f8643e = 0;
                                O0.a(wishlistActivity);
                                wishlistActivity.setResult(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i10 = WishlistActivity.f4454g0;
                        int i11 = 1;
                        if (activityResult.getResultCode() == 1) {
                            wishlistActivity.P0();
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(wishlistActivity);
                            lifecycleScope.getClass();
                            float f7 = UptodownApp.G;
                            n4.e.y(wishlistActivity);
                            n4.e.x(wishlistActivity);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(lifecycleScope, j8.d.f7053a, null, new b6.r(wishlistActivity, cVar, i11), 2);
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.f4460f0 = registerForActivityResult2;
    }

    @Override // o4.j4
    public final String D0() {
        return this.Z;
    }

    public final j1 N0() {
        return (j1) this.f4455a0.getValue();
    }

    public final ed O0() {
        return (ed) this.f4456b0.getValue();
    }

    public final void P0() {
        String str;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2 = getSharedPreferences("SharedPreferencesUser", 0);
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (sharedPreferences.contains("UTOKEN")) {
            str = sharedPreferences.getString("UTOKEN", null);
            if (str != null && sharedPreferences2.getString("is_turbo", null) == null) {
                new Handler(Looper.getMainLooper()).postDelayed(new a6.n(this, 23), 500L);
                return;
            } else {
                O0().a(this);
            }
        }
        str = null;
        if (str != null) {
        }
        O0().a(this);
    }

    public final void Q0(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        f0.z(lifecycleScope, h8.n.f6148a, null, new h3(this, str, null, 23), 2);
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        Q0(d0Var.b());
    }

    @Override // o4.b0
    public final void c0(u0 u0Var) {
        u0Var.getClass();
        Q0(u0Var.b());
    }

    @Override // o4.b0
    public final void d0(String str) {
        e1 e1Var = this.f4457c0;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // o4.b0
    public final void e0(String str, String str2) {
        e1 e1Var = this.f4457c0;
        if (e1Var != null) {
            e1Var.b();
        }
        if (str2 != null && str2.length() != 0) {
            String string = getString(R.string.install_compatibility_error, str2);
            string.getClass();
            A(string);
        }
    }

    @Override // o4.b0
    public final void i0(long j, String str) {
        if (S()) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = p0.f3588a;
            f0.z(lifecycleScope, h8.n.f6148a, null, new g(this, j, str, (c) null, 10), 2);
        }
    }

    @Override // o4.b0
    public final void l0() {
        e1 e1Var = this.f4457c0;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // o4.b0
    public final void n0(File file) {
        e1 e1Var = this.f4457c0;
        if (e1Var != null) {
            e1Var.b();
        }
        e1 e1Var2 = this.f4457c0;
        if (e1Var2 != null) {
            e1Var2.a(this, file);
        }
    }

    @Override // o4.b0
    public final void o0(File file) {
        file.getClass();
        e1 e1Var = this.f4457c0;
        if (e1Var != null) {
            e1Var.a(this, file);
        }
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = N0().f5509a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        j1 N0 = N0();
        if (drawable != null) {
            N0.m.setNavigationIcon(drawable);
            N0.m.setNavigationContentDescription(getString(R.string.back));
        }
        Toolbar toolbar = N0.m;
        TextView textView = N0.f5511n;
        RecyclerView recyclerView = N0.l;
        final int i = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.zc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WishlistActivity f9312b;

            {
                this.f9312b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                WishlistActivity wishlistActivity = this.f9312b;
                switch (i3) {
                    case 0:
                        int i8 = WishlistActivity.f4454g0;
                        wishlistActivity.finish();
                        return;
                    default:
                        int i10 = WishlistActivity.f4454g0;
                        wishlistActivity.setResult(1);
                        wishlistActivity.finish();
                        return;
                }
            }
        });
        N0.p.setTypeface(s4.c.u);
        final int i3 = 1;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        N0().l.addItemDecoration(new f(dimension, dimension));
        recyclerView.setItemAnimator(defaultItemAnimator);
        N0.o.setTypeface(s4.c.v);
        textView.setTypeface(s4.c.u);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: o4.zc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WishlistActivity f9312b;

            {
                this.f9312b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                WishlistActivity wishlistActivity = this.f9312b;
                switch (i32) {
                    case 0:
                        int i8 = WishlistActivity.f4454g0;
                        wishlistActivity.finish();
                        return;
                    default:
                        int i10 = WishlistActivity.f4454g0;
                        wishlistActivity.setResult(1);
                        wishlistActivity.finish();
                        return;
                }
            }
        });
        N0.f5510b.setOnClickListener(new o(25));
        recyclerView.addOnScrollListener(new ad(linearLayoutManager, this));
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, null, 7), 2);
        P0();
    }

    @Override // o4.b0
    public final void p0(File file) {
        e1 e1Var = this.f4457c0;
        if (e1Var != null) {
            e1Var.c(this, file);
        }
    }
}

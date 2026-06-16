package com.uptodown.activities;

import a6.g;
import android.content.Intent;
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
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c7.n;
import c8.f0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RecommendedActivity;
import g5.m0;
import g7.c;
import h5.o;
import j8.e;
import java.io.File;
import k5.d0;
import k5.t2;
import k5.u0;
import k5.v2;
import kotlin.jvm.internal.i0;
import o4.h3;
import o4.j4;
import o4.j7;
import o4.m7;
import o4.o7;
import o4.p7;
import o4.q7;
import o4.s7;
import r0.i;
import r4.e1;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class RecommendedActivity extends j4 {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f4423g0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public e1 f4426c0;

    /* renamed from: e0, reason: collision with root package name */
    public final ActivityResultLauncher f4428e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ActivityResultLauncher f4429f0;
    public final String Z = "RecommendedActivity";

    /* renamed from: a0, reason: collision with root package name */
    public final n f4424a0 = new n(new j7(this, 1));

    /* renamed from: b0, reason: collision with root package name */
    public final ViewModelLazy f4425b0 = new ViewModelLazy(i0.a(s7.class), new q7(this, 0), new p7(this), new q7(this, 1));

    /* renamed from: d0, reason: collision with root package name */
    public final i f4427d0 = new i((Object) this, 25);

    public RecommendedActivity() {
        final int i = 0;
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: o4.k7

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedActivity f8826b;

            {
                this.f8826b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Boolean bool;
                int i3 = i;
                g7.c cVar = null;
                RecommendedActivity recommendedActivity = this.f8826b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        int i8 = RecommendedActivity.f4423g0;
                        int i10 = 1;
                        if (activityResult.getResultCode() == 1) {
                            recommendedActivity.P0();
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(recommendedActivity);
                            lifecycleScope.getClass();
                            float f7 = UptodownApp.G;
                            n4.e.y(recommendedActivity);
                            n4.e.x(recommendedActivity);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(lifecycleScope, j8.d.f7053a, null, new b6.r(recommendedActivity, cVar, i10), 2);
                            return;
                        }
                        return;
                    default:
                        int i11 = RecommendedActivity.f4423g0;
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            if (data != null) {
                                bool = Boolean.valueOf(data.getBooleanExtra("recommendedAppsChanged", false));
                            } else {
                                bool = null;
                            }
                            if (kotlin.jvm.internal.p.b(bool, Boolean.TRUE)) {
                                recommendedActivity.f4426c0 = null;
                                s7 O0 = recommendedActivity.O0();
                                O0.getClass();
                                O0.f9093e = false;
                                O0.g = 0;
                                O0.a(recommendedActivity);
                                recommendedActivity.setResult(2);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.f4428e0 = registerForActivityResult;
        final int i3 = 1;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: o4.k7

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedActivity f8826b;

            {
                this.f8826b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Boolean bool;
                int i32 = i3;
                g7.c cVar = null;
                RecommendedActivity recommendedActivity = this.f8826b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i32) {
                    case 0:
                        int i8 = RecommendedActivity.f4423g0;
                        int i10 = 1;
                        if (activityResult.getResultCode() == 1) {
                            recommendedActivity.P0();
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(recommendedActivity);
                            lifecycleScope.getClass();
                            float f7 = UptodownApp.G;
                            n4.e.y(recommendedActivity);
                            n4.e.x(recommendedActivity);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(lifecycleScope, j8.d.f7053a, null, new b6.r(recommendedActivity, cVar, i10), 2);
                            return;
                        }
                        return;
                    default:
                        int i11 = RecommendedActivity.f4423g0;
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            if (data != null) {
                                bool = Boolean.valueOf(data.getBooleanExtra("recommendedAppsChanged", false));
                            } else {
                                bool = null;
                            }
                            if (kotlin.jvm.internal.p.b(bool, Boolean.TRUE)) {
                                recommendedActivity.f4426c0 = null;
                                s7 O0 = recommendedActivity.O0();
                                O0.getClass();
                                O0.f9093e = false;
                                O0.g = 0;
                                O0.a(recommendedActivity);
                                recommendedActivity.setResult(2);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.f4429f0 = registerForActivityResult2;
    }

    @Override // o4.j4
    public final String D0() {
        return this.Z;
    }

    public final m0 N0() {
        return (m0) this.f4424a0.getValue();
    }

    public final s7 O0() {
        return (s7) this.f4425b0.getValue();
    }

    public final void P0() {
        String str;
        v2 h = t2.h(this);
        if (h != null && (str = h.f7542a) != null && str.length() != 0) {
            O0().a(this);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new a6.n(this, 22), 500L);
        }
    }

    public final void Q0(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        f0.z(lifecycleScope, h8.n.f6148a, null, new h3(this, str, null, 14), 2);
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
        e1 e1Var = this.f4426c0;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // o4.b0
    public final void e0(String str, String str2) {
        e1 e1Var = this.f4426c0;
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
            f0.z(lifecycleScope, h8.n.f6148a, null, new g(this, j, str, (c) null, 6), 2);
        }
    }

    @Override // o4.b0
    public final void l0() {
        e1 e1Var = this.f4426c0;
        if (e1Var != null) {
            e1Var.b();
        }
    }

    @Override // o4.b0
    public final void n0(File file) {
        e1 e1Var = this.f4426c0;
        if (e1Var != null) {
            e1Var.b();
        }
        e1 e1Var2 = this.f4426c0;
        if (e1Var2 != null) {
            e1Var2.a(this, file);
        }
    }

    @Override // o4.b0
    public final void o0(File file) {
        file.getClass();
        e1 e1Var = this.f4426c0;
        if (e1Var != null) {
            e1Var.a(this, file);
        }
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = N0().f5541a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        m0 N0 = N0();
        if (drawable != null) {
            N0.f5543n.setNavigationIcon(drawable);
            N0.f5543n.setNavigationContentDescription(getString(R.string.back));
        }
        Toolbar toolbar = N0.f5543n;
        TextView textView = N0.o;
        RecyclerView recyclerView = N0.l;
        final int i = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.l7

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedActivity f8857b;

            {
                this.f8857b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                RecommendedActivity recommendedActivity = this.f8857b;
                switch (i3) {
                    case 0:
                        int i8 = RecommendedActivity.f4423g0;
                        recommendedActivity.finish();
                        return;
                    case 1:
                        int i10 = RecommendedActivity.f4423g0;
                        recommendedActivity.setResult(1);
                        recommendedActivity.finish();
                        return;
                    default:
                        int i11 = RecommendedActivity.f4423g0;
                        recommendedActivity.N0().m.setChecked(true ^ recommendedActivity.N0().m.isChecked());
                        float f7 = UptodownApp.G;
                        if (n4.e.s() && recommendedActivity.S()) {
                            s7 O0 = recommendedActivity.O0();
                            O0.getClass();
                            c8.f0.z(ViewModelKt.getViewModelScope(O0), null, null, new r7(O0, recommendedActivity, null, 0), 3);
                            return;
                        }
                        return;
                }
            }
        });
        N0.r.setTypeface(s4.c.u);
        final int i3 = 1;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        recyclerView.addItemDecoration(new f(dimension, dimension));
        recyclerView.setItemAnimator(defaultItemAnimator);
        N0.p.setTypeface(s4.c.v);
        N0.q.setTypeface(s4.c.v);
        textView.setTypeface(s4.c.v);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: o4.l7

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedActivity f8857b;

            {
                this.f8857b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                RecommendedActivity recommendedActivity = this.f8857b;
                switch (i32) {
                    case 0:
                        int i8 = RecommendedActivity.f4423g0;
                        recommendedActivity.finish();
                        return;
                    case 1:
                        int i10 = RecommendedActivity.f4423g0;
                        recommendedActivity.setResult(1);
                        recommendedActivity.finish();
                        return;
                    default:
                        int i11 = RecommendedActivity.f4423g0;
                        recommendedActivity.N0().m.setChecked(true ^ recommendedActivity.N0().m.isChecked());
                        float f7 = UptodownApp.G;
                        if (n4.e.s() && recommendedActivity.S()) {
                            s7 O0 = recommendedActivity.O0();
                            O0.getClass();
                            c8.f0.z(ViewModelKt.getViewModelScope(O0), null, null, new r7(O0, recommendedActivity, null, 0), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i8 = 2;
        N0().m.setOnClickListener(new View.OnClickListener(this) { // from class: o4.l7

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedActivity f8857b;

            {
                this.f8857b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i8;
                RecommendedActivity recommendedActivity = this.f8857b;
                switch (i32) {
                    case 0:
                        int i82 = RecommendedActivity.f4423g0;
                        recommendedActivity.finish();
                        return;
                    case 1:
                        int i10 = RecommendedActivity.f4423g0;
                        recommendedActivity.setResult(1);
                        recommendedActivity.finish();
                        return;
                    default:
                        int i11 = RecommendedActivity.f4423g0;
                        recommendedActivity.N0().m.setChecked(true ^ recommendedActivity.N0().m.isChecked());
                        float f7 = UptodownApp.G;
                        if (n4.e.s() && recommendedActivity.S()) {
                            s7 O0 = recommendedActivity.O0();
                            O0.getClass();
                            c8.f0.z(ViewModelKt.getViewModelScope(O0), null, null, new r7(O0, recommendedActivity, null, 0), 3);
                            return;
                        }
                        return;
                }
            }
        });
        N0.f5542b.setOnClickListener(new o(18));
        recyclerView.addOnScrollListener(new m7(linearLayoutManager, this));
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar = h8.n.f6148a;
        c cVar2 = null;
        f0.z(lifecycleScope, cVar, null, new o7(this, cVar2, i), 2);
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new o7(this, cVar2, i3), 2);
        P0();
    }

    @Override // o4.b0
    public final void p0(File file) {
        e1 e1Var = this.f4426c0;
        if (e1Var != null) {
            e1Var.c(this, file);
        }
    }
}

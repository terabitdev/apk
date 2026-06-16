package com.uptodown.activities;

import a6.h;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import d7.t;
import f8.l1;
import f8.m;
import g7.c;
import h5.k2;
import h5.l0;
import h8.n;
import j8.e;
import java.util.ArrayList;
import k5.d0;
import k5.e0;
import k5.f0;
import k5.g;
import k5.g0;
import k5.h0;
import k5.i0;
import k5.j;
import k5.r;
import k5.u0;
import o4.a;
import o4.b;
import o4.b0;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class AppDetailActivity extends b0 {
    public static final /* synthetic */ int X = 0;
    public j O;
    public final l1 P;
    public final l1 Q;
    public final ActivityResultLauncher R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public final ActivityResultLauncher V;
    public final b W;

    public AppDetailActivity() {
        Boolean bool = Boolean.FALSE;
        this.P = m.c(bool);
        this.Q = m.c(bool);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 1));
        registerForActivityResult.getClass();
        this.R = registerForActivityResult;
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 2));
        registerForActivityResult2.getClass();
        this.V = registerForActivityResult2;
        this.W = new b(this, 0);
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        y0(d0Var.c(), d0Var.a());
    }

    @Override // o4.b0
    public final void b0(i0 i0Var) {
        i0Var.getClass();
        if (i0Var instanceof f0) {
            y0(ComposerKt.providerKey, ((f0) i0Var).f7352a);
            return;
        }
        if (i0Var instanceof h0) {
            y0(211, ((h0) i0Var).f7395a);
        } else if (!i0Var.equals(g0.f7386a) && !i0Var.equals(e0.f7345a)) {
            o2.a.b();
        }
    }

    @Override // o4.b0
    public final void c0(u0 u0Var) {
        u0Var.getClass();
        y0(u0Var.c(), u0Var.a());
    }

    @Override // o4.b0
    public final void d0(String str) {
        h hVar;
        h hVar2 = this.L;
        if (hVar2 != null) {
            hVar2.getClass();
            if (v.a0(hVar2.f206a.F, str, true) && (hVar = this.L) != null) {
                hVar.b(this);
            }
        }
    }

    @Override // o4.b0
    public final void e0(String str, String str2) {
        h hVar;
        if (str != null) {
            l0 w02 = w0();
            if (w02 != null && w02.isResumed()) {
                w02.x0(str);
            }
            h hVar2 = this.L;
            if (hVar2 != null && v.a0(hVar2.f206a.F, str, true) && (hVar = this.L) != null) {
                hVar.b(this);
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        l1 l1Var = this.P;
        boolean booleanValue = ((Boolean) l1Var.getValue()).booleanValue();
        l1 l1Var2 = this.Q;
        if (booleanValue || ((Boolean) l1Var2.getValue()).booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra("wishlistChanged", ((Boolean) l1Var.getValue()).booleanValue());
            intent.putExtra("recommendedAppsChanged", ((Boolean) l1Var2.getValue()).booleanValue());
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // o4.b0
    public final void h0(long j) {
        if (S()) {
            if (j > 0) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                e eVar = p0.f3588a;
                c8.f0.z(lifecycleScope, n.f6148a, null, new h5.l1(this, j, null, 1), 2);
                return;
            }
            j0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        g gVar;
        boolean z10;
        l0 l0Var;
        j jVar;
        Bundle extras;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this).inflate(R.layout.app_detail_activity, (ViewGroup) null);
        inflate.getClass();
        setContentView(inflate);
        Intent intent = getIntent();
        this.M = (RelativeLayout) findViewById(R.id.app_info_selected_popup);
        int i = 0;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = (Parcelable) extras.getParcelable("appInfo", g.class);
                } else {
                    parcelable2 = extras.getParcelable("appInfo");
                }
                gVar = (g) parcelable2;
            } else {
                gVar = null;
            }
            if (extras.containsKey("viewCategory")) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = (Parcelable) extras.getParcelable("viewCategory", j.class);
                } else {
                    parcelable = extras.getParcelable("viewCategory");
                }
                this.O = (j) parcelable;
            }
            if (extras.containsKey("openReviewDialog")) {
                z10 = extras.getBoolean("openReviewDialog");
                if (!z10) {
                    l0Var = new l0();
                    Bundle bundle2 = new Bundle();
                    if (gVar != null) {
                        bundle2.putParcelable("appInfo", gVar);
                        bundle2.putBoolean("openReviewDialog", true);
                    }
                    l0Var.setArguments(bundle2);
                } else {
                    l0Var = new l0();
                    Bundle bundle3 = new Bundle();
                    if (gVar != null) {
                        bundle3.putParcelable("appInfo", gVar);
                    }
                    l0Var.setArguments(bundle3);
                }
                getSupportFragmentManager().beginTransaction().add(R.id.fl_main_app_detail_activity, l0Var, (String) null).commit();
                getOnBackPressedDispatcher().addCallback(this, this.W);
                this.K = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, i));
                this.S.add(l0Var);
                jVar = this.O;
                if (jVar == null) {
                    z0(jVar);
                    return;
                }
                return;
            }
        } else {
            gVar = null;
        }
        z10 = false;
        if (!z10) {
        }
        getSupportFragmentManager().beginTransaction().add(R.id.fl_main_app_detail_activity, l0Var, (String) null).commit();
        getOnBackPressedDispatcher().addCallback(this, this.W);
        this.K = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, i));
        this.S.add(l0Var);
        jVar = this.O;
        if (jVar == null) {
        }
    }

    @Override // o4.b0
    public final void v0(g gVar) {
        gVar.getClass();
        if (S()) {
            l0 l0Var = new l0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("appInfo", gVar);
            l0Var.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(R.id.fl_main_app_detail_activity, l0Var, (String) null).addToBackStack(String.valueOf(gVar.f7356a)).commit();
            this.S.add(l0Var);
        }
    }

    public final l0 w0() {
        ArrayList arrayList = this.S;
        if (!arrayList.isEmpty()) {
            return (l0) t.G0(arrayList);
        }
        return null;
    }

    public final void x0(g gVar) {
        gVar.getClass();
        if (!isFinishing()) {
            Intent intent = new Intent(this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", gVar);
            float f7 = UptodownApp.G;
            this.R.launch(intent, n4.e.b(this));
        }
    }

    public final void y0(int i, r rVar) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        c8.f0.z(lifecycleScope, n.f6148a, null, new a5.m(rVar, this, i, (c) null), 2);
    }

    public final void z0(j jVar) {
        jVar.getClass();
        k2 k2Var = new k2();
        k2Var.m = jVar;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.getClass();
        float f7 = UptodownApp.G;
        n4.e.A(beginTransaction, this);
        beginTransaction.add(R.id.fl_main_app_detail_activity, k2Var, (String) null).addToBackStack(String.valueOf(jVar.f7407a)).commit();
        this.T.add(k2Var);
    }
}

package com.uptodown.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.b;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.preference.a;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import f8.l1;
import g5.u;
import h5.k2;
import h5.o;
import j8.d;
import j8.e;
import java.util.ArrayList;
import k5.j;
import kotlin.jvm.internal.i0;
import m4.a0;
import m4.e0;
import o4.b0;
import o4.f0;
import o4.m1;
import o4.o1;
import o4.p1;
import o4.q1;
import o4.t1;
import o4.u1;
import o4.v1;
import q2.c;
import w5.m;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ListsActivity extends b0 {
    public static final /* synthetic */ int S = 0;
    public final n O = new n(new f0(this, 7));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(v1.class), new q1(this, 0), new p1(this), new q1(this, 1));
    public boolean Q;
    public final ActivityResultLauncher R;

    public ListsActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new b(this, 25));
        registerForActivityResult.getClass();
        this.R = registerForActivityResult;
    }

    public static final void w0(ListsActivity listsActivity, c cVar) {
        ((ImageView) cVar.l).setImageResource(R.drawable.vector_uptodown_logo);
        LinearLayout linearLayout = (LinearLayout) cVar.m;
        if (linearLayout.getChildCount() > 1) {
            linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        }
        ((RelativeLayout) cVar.o).setVisibility(4);
        ((ProgressBar) cVar.f9891n).setVisibility(0);
    }

    public final String A0(int i) {
        if (i == 1) {
            String string = getString(R.string.apps_count_1);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.apps_count, String.valueOf(i));
        string2.getClass();
        return string2;
    }

    public final void B0() {
        String str;
        SharedPreferences sharedPreferences;
        int i = 0;
        SharedPreferences sharedPreferences2 = getSharedPreferences("SharedPreferencesUser", 0);
        g7.c cVar = null;
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (sharedPreferences.contains("UTOKEN")) {
            str = sharedPreferences.getString("UTOKEN", null);
            if (str != null && sharedPreferences2.getString("is_turbo", null) == null) {
                return;
            }
            v1 z0 = z0();
            z0.getClass();
            z0.f9161c = false;
            l1 l1Var = z0.f9159a;
            l1Var.getClass();
            m mVar = m.f11208a;
            l1Var.j(null, mVar);
            z0.f9164f = false;
            l1 l1Var2 = z0.f9162d;
            l1Var2.getClass();
            l1Var2.j(null, mVar);
            z0.i = false;
            l1 l1Var3 = z0.g;
            l1Var3.getClass();
            l1Var3.j(null, mVar);
            z0.l = false;
            l1 l1Var4 = z0.j;
            l1Var4.getClass();
            l1Var4.j(null, mVar);
            c8.f0.z(ViewModelKt.getViewModelScope(z0), null, null, new t1(this, z0, cVar, i), 3);
            c8.f0.z(ViewModelKt.getViewModelScope(z0), null, null, new t1(this, z0, cVar, 1), 3);
            ArrayList arrayList = new ArrayList();
            c0 viewModelScope = ViewModelKt.getViewModelScope(z0);
            e eVar = p0.f3588a;
            d dVar = d.f7053a;
            c8.f0.z(viewModelScope, dVar, null, new u1(this, z0, arrayList, (g7.c) null), 2);
            c8.f0.z(ViewModelKt.getViewModelScope(z0), dVar, null, new u1(this, new ArrayList(), z0, (g7.c) null), 2);
        }
        str = null;
        if (str != null) {
        }
        v1 z02 = z0();
        z02.getClass();
        z02.f9161c = false;
        l1 l1Var5 = z02.f9159a;
        l1Var5.getClass();
        m mVar2 = m.f11208a;
        l1Var5.j(null, mVar2);
        z02.f9164f = false;
        l1 l1Var22 = z02.f9162d;
        l1Var22.getClass();
        l1Var22.j(null, mVar2);
        z02.i = false;
        l1 l1Var32 = z02.g;
        l1Var32.getClass();
        l1Var32.j(null, mVar2);
        z02.l = false;
        l1 l1Var42 = z02.j;
        l1Var42.getClass();
        l1Var42.j(null, mVar2);
        c8.f0.z(ViewModelKt.getViewModelScope(z02), null, null, new t1(this, z02, cVar, i), 3);
        c8.f0.z(ViewModelKt.getViewModelScope(z02), null, null, new t1(this, z02, cVar, 1), 3);
        ArrayList arrayList2 = new ArrayList();
        c0 viewModelScope2 = ViewModelKt.getViewModelScope(z02);
        e eVar2 = p0.f3588a;
        d dVar2 = d.f7053a;
        c8.f0.z(viewModelScope2, dVar2, null, new u1(this, z02, arrayList2, (g7.c) null), 2);
        c8.f0.z(ViewModelKt.getViewModelScope(z02), dVar2, null, new u1(this, new ArrayList(), z02, (g7.c) null), 2);
    }

    public final void C0(j jVar) {
        jVar.getClass();
        if (S()) {
            k2 k2Var = new k2();
            k2Var.m = jVar;
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            float f7 = UptodownApp.G;
            beginTransaction.getClass();
            n4.e.A(beginTransaction, this);
            beginTransaction.add(R.id.fl_lists, k2Var, (String) null).addToBackStack(String.valueOf(jVar.f7407a)).commit();
            getSupportFragmentManager().addOnBackStackChangedListener(new a(this, 1));
        }
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f5601a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        u y02 = y0();
        if (drawable != null) {
            y02.p.setNavigationIcon(drawable);
            y02.p.setNavigationContentDescription(getString(R.string.back));
        }
        Toolbar toolbar = y02.p;
        c cVar = y02.l;
        TextView textView = (TextView) cVar.q;
        c cVar2 = y02.m;
        TextView textView2 = (TextView) cVar2.q;
        c cVar3 = y02.f5603n;
        TextView textView3 = (TextView) cVar3.q;
        int i = 0;
        toolbar.setNavigationOnClickListener(new m1(this, i));
        y02.q.setTypeface(s4.c.u);
        textView3.setTypeface(s4.c.u);
        ((TextView) cVar3.p).setTypeface(s4.c.v);
        textView3.setText(getString(R.string.my_wishlist));
        textView2.setTypeface(s4.c.u);
        ((TextView) cVar2.p).setTypeface(s4.c.v);
        textView2.setText(getString(R.string.my_recommended_apps));
        textView.setTypeface(s4.c.u);
        ((TextView) cVar.p).setTypeface(s4.c.v);
        textView.setText(getString(R.string.my_preregistrations));
        y02.o.setOnClickListener(new o(6));
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar4 = h8.n.f6148a;
        g7.c cVar5 = null;
        c8.f0.z(lifecycleScope, cVar4, null, new o1(this, cVar5, i), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar4, null, new o1(this, cVar5, 1), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar4, null, new o1(this, cVar5, 2), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar4, null, new o1(this, cVar5, 3), 2);
        B0();
    }

    public final void x0(String str, LinearLayout linearLayout, int i) {
        ImageView imageView = new ImageView(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.icon_size_l);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMargins((int) getResources().getDimension(R.dimen.lists_items_iv_margin), 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setContentDescription(null);
        imageView.setElevation(getResources().getDimension(R.dimen.button_elevation));
        imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_logo_google));
        imageView.setElevation(-i);
        e0 e10 = a0.d().e(str);
        float f7 = UptodownApp.G;
        Context context = imageView.getContext();
        context.getClass();
        e10.g(n4.e.g(context));
        e10.h(n4.e.v(this));
        e10.e(imageView, null);
        linearLayout.addView(imageView);
    }

    public final u y0() {
        return (u) this.O.getValue();
    }

    public final v1 z0() {
        return (v1) this.P.getValue();
    }
}

package com.uptodown.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import c7.n;
import c8.c0;
import c8.f0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import g5.j0;
import h5.k2;
import h5.o;
import j8.d;
import j8.e;
import k5.j;
import kotlin.jvm.internal.i0;
import o4.b0;
import o4.g6;
import o4.i6;
import o4.j6;
import o4.k6;
import o4.l6;
import o4.m6;
import o4.o6;
import r0.i;
import r4.d0;
import s4.c;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class PreregistrationActivity extends b0 {
    public static final /* synthetic */ int T = 0;
    public d0 Q;
    public final ActivityResultLauncher S;
    public final ViewModelLazy O = new ViewModelLazy(i0.a(o6.class), new m6(this, 0), new l6(this), new m6(this, 1));
    public final n P = new n(new i6(this, 0));
    public final i R = new i((Object) this, 23);

    public PreregistrationActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new j6(this, 0));
        registerForActivityResult.getClass();
        this.S = registerForActivityResult;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5506a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        j0 w02 = w0();
        if (drawable != null) {
            w02.f5508n.setNavigationIcon(drawable);
            w02.f5508n.setNavigationContentDescription(getString(R.string.back));
        }
        Toolbar toolbar = w02.f5508n;
        RecyclerView recyclerView = w02.m;
        TextView textView = w02.o;
        toolbar.setNavigationOnClickListener(new k6(this, 0));
        w02.q.setTypeface(c.u);
        textView.setTypeface(c.u);
        int i = 1;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        w0().m.addItemDecoration(new f(dimension, dimension));
        w02.p.setTypeface(c.v);
        w02.l.setOnClickListener(new o(17));
        textView.setOnClickListener(new k6(this, i));
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, null, i), 2);
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        o6 o6Var = (o6) this.O.getValue();
        o6Var.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(o6Var);
        e eVar = p0.f3588a;
        f0.z(viewModelScope, d.f7053a, null, new g(o6Var, false, this, (g7.c) null), 2);
    }

    public final j0 w0() {
        return (j0) this.P.getValue();
    }

    public final void x0(j jVar) {
        jVar.getClass();
        k2 k2Var = new k2();
        k2Var.m = jVar;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        float f7 = UptodownApp.G;
        beginTransaction.getClass();
        n4.e.A(beginTransaction, this);
        beginTransaction.add(w0().f5507b.getId(), k2Var, (String) null).addToBackStack(String.valueOf(jVar.f7407a)).commit();
    }
}

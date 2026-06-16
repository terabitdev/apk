package com.uptodown.activities;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import c7.n;
import c8.p0;
import c8.x1;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.SearchActivity;
import com.uptodown.views.InstantAutoCompleteTextView;
import g5.t0;
import g7.c;
import h5.k2;
import h5.o;
import j8.e;
import k5.d0;
import k5.j;
import k5.u0;
import kotlin.jvm.internal.i0;
import o4.a9;
import o4.b0;
import o4.b9;
import o4.c9;
import o4.e9;
import o4.f0;
import o4.g9;
import o4.h9;
import o4.i9;
import o4.j6;
import o4.m9;
import o4.w8;
import o4.y1;
import o4.y5;
import o4.z8;
import r4.l0;
import r4.m0;
import y5.f;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class SearchActivity extends b0 {
    public static final /* synthetic */ int Y = 0;
    public x1 Q;
    public l0 R;
    public m0 S;
    public z8 T;
    public final ActivityResultLauncher X;
    public final n O = new n(new f0(this, 23));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(m9.class), new i9(this, 0), new h9(this), new i9(this, 1));
    public final a9 U = new a9(this);
    public final b9 V = new b9(this);
    public final b9 W = new b9(this);

    public SearchActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new j6(this, 4));
        registerForActivityResult.getClass();
        this.X = registerForActivityResult;
    }

    public static final String w0(SearchActivity searchActivity, String str) {
        str.getClass();
        return v.d0(str, "/", "", false);
    }

    public final void A0(int i, String str) {
        x1 x1Var = this.Q;
        if (x1Var != null) {
            x1Var.cancel(null);
        }
        this.Q = c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b6.n(i, this, (c) null, str), 3);
    }

    public final void B0(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        c8.f0.z(lifecycleScope, h8.n.f6148a, null, new g9(2, this, null, str), 2);
    }

    public final void C0(j jVar) {
        jVar.getClass();
        if (S()) {
            z0();
            k2 k2Var = new k2();
            k2Var.m = jVar;
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.getClass();
            float f7 = UptodownApp.G;
            n4.e.A(beginTransaction, this);
            beginTransaction.add(R.id.fl_category_search_activity, k2Var, (String) null).addToBackStack(String.valueOf(jVar.f7407a)).commit();
        }
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        B0(d0Var.b());
    }

    @Override // o4.b0
    public final void c0(u0 u0Var) {
        u0Var.getClass();
        B0(u0Var.b());
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = x0().f5598a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        ImageView imageView = (ImageView) findViewById(R.id.iv_back_search_bar);
        int i = 0;
        if (imageView != null) {
            imageView.setOnClickListener(new w8(this, i));
        }
        int i3 = 1;
        ((ImageView) x0().f5599b.m).setOnClickListener(new w8(this, i3));
        int i8 = 2;
        ((ImageView) x0().f5599b.f7248n).setOnClickListener(new w8(this, i8));
        ((InstantAutoCompleteTextView) x0().f5599b.l).requestFocus();
        ((InstantAutoCompleteTextView) x0().f5599b.l).setTypeface(s4.c.v);
        ((InstantAutoCompleteTextView) x0().f5599b.l).setOnEditorActionListener(new y1(this, i8));
        this.T = new z8(this, this);
        ((InstantAutoCompleteTextView) x0().f5599b.l).setAdapter(this.T);
        ((InstantAutoCompleteTextView) x0().f5599b.l).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o4.x8
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                int i11 = SearchActivity.Y;
                adapterView.getClass();
                float f7 = UptodownApp.G;
                if (n4.e.s()) {
                    Object itemAtPosition = adapterView.getItemAtPosition(i10);
                    itemAtPosition.getClass();
                    String str = ((k5.z1) itemAtPosition).f7577a;
                    if (str != null) {
                        SearchActivity.this.A0(0, str);
                    }
                }
            }
        });
        ((InstantAutoCompleteTextView) x0().f5599b.l).addTextChangedListener(new y5(this, i8));
        x0().f5600n.setTypeface(s4.c.u);
        x0().f5600n.setOnClickListener(new w8(this, 3));
        x0().o.setTypeface(s4.c.u);
        x0().o.setOnClickListener(new w8(this, 4));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        x0().m.setLayoutManager(linearLayoutManager);
        c cVar = null;
        x0().m.setItemAnimator(null);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        x0().m.addItemDecoration(new f(dimension, dimension));
        x0().m.addOnScrollListener(new c9(linearLayoutManager, this));
        hideKeyboardOnScroll(x0().m);
        x0().l.setOnClickListener(new o(21));
        x0().p.setTypeface(s4.c.v);
        z8 z8Var = this.T;
        z8Var.getClass();
        z8Var.getFilter().filter(((InstantAutoCompleteTextView) x0().f5599b.l).getText().toString());
        Intent intent = getIntent();
        if (intent != null && "android.intent.action.SEARCH".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("query")) != null) {
            A0(0, stringExtra);
        }
        showKeyboard((InstantAutoCompleteTextView) x0().f5599b.l);
        x0().l.setVisibility(8);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar2 = h8.n.f6148a;
        c8.f0.z(lifecycleScope, cVar2, null, new e9(this, cVar, i), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new e9(this, cVar, i3), 2);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.menu_search, menu);
        Object systemService = getSystemService("search");
        systemService.getClass();
        SearchManager searchManager = (SearchManager) systemService;
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setIconifiedByDefault(false);
            return true;
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String stringExtra;
        intent.getClass();
        super.onNewIntent(intent);
        if ("android.intent.action.SEARCH".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("query")) != null) {
            A0(0, stringExtra);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        z0();
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        l0 l0Var = this.R;
        if (l0Var != null) {
            l0Var.notifyDataSetChanged();
        }
        m0 m0Var = this.S;
        if (m0Var != null) {
            m0Var.notifyDataSetChanged();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        startSearch(null, false, new Bundle(), false);
        return true;
    }

    public final t0 x0() {
        return (t0) this.O.getValue();
    }

    public final m9 y0() {
        return (m9) this.P.getValue();
    }

    public final void z0() {
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(((InstantAutoCompleteTextView) x0().f5599b.l).getWindowToken(), 0);
        ((InstantAutoCompleteTextView) x0().f5599b.l).clearFocus();
    }
}

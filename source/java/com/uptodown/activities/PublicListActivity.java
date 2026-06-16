package com.uptodown.activities;

import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import f8.l1;
import g5.k0;
import g7.c;
import h5.u;
import j8.d;
import j8.e;
import k5.d0;
import k5.u0;
import k5.v2;
import kotlin.jvm.internal.i0;
import o4.b3;
import o4.f0;
import o4.g6;
import o4.h3;
import o4.j4;
import o4.p6;
import o4.q6;
import o4.r6;
import o4.s6;
import r0.i;
import r4.e1;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class PublicListActivity extends j4 {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f4418e0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public e1 f4421c0;
    public final String Z = "PublicListActivity";

    /* renamed from: a0, reason: collision with root package name */
    public final n f4419a0 = new n(new f0(this, 18));

    /* renamed from: b0, reason: collision with root package name */
    public final ViewModelLazy f4420b0 = new ViewModelLazy(i0.a(s6.class), new r6(this, 0), new q6(this), new r6(this, 1));

    /* renamed from: d0, reason: collision with root package name */
    public final i f4422d0 = new i((Object) this, 24);

    @Override // o4.j4
    public final String D0() {
        return this.Z;
    }

    public final k0 N0() {
        return (k0) this.f4419a0.getValue();
    }

    public final s6 O0() {
        return (s6) this.f4420b0.getValue();
    }

    public final void P0(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        c8.f0.z(lifecycleScope, h8.n.f6148a, null, new h3(this, str, null, 13), 2);
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        P0(d0Var.b());
    }

    @Override // o4.b0
    public final void c0(u0 u0Var) {
        u0Var.getClass();
        P0(u0Var.b());
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        v2 v2Var;
        String str;
        Bundle extras;
        super.onCreate(bundle);
        c cVar = null;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("user")) {
            v2Var = (v2) extras.getParcelable("user");
        } else {
            v2Var = null;
        }
        int i = 2;
        if (v2Var != null && (str = v2Var.f7542a) != null && str.length() != 0) {
            RelativeLayout relativeLayout = N0().f5514a;
            relativeLayout.getClass();
            setContentView(relativeLayout);
            N0().m.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_back));
            N0().m.setNavigationContentDescription(getString(R.string.back));
            N0().m.setNavigationOnClickListener(new u(this, 17));
            N0().o.setTypeface(s4.c.u);
            N0().f5516n.setTypeface(s4.c.v);
            N0().o.setText(getString(R.string.user_recommended_apps, v2Var.m));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
            N0().l.setLayoutManager(linearLayoutManager);
            N0().l.setItemAnimator(new DefaultItemAnimator());
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            int dimension = (int) getResources().getDimension(R.dimen.margin_m);
            N0().l.addItemDecoration(new f(dimension, dimension));
            N0().l.setItemAnimator(defaultItemAnimator);
            N0().l.addOnScrollListener(new p6(linearLayoutManager, this));
            l1 l1Var = O0().f9085c;
            String str2 = v2Var.f7542a;
            str2.getClass();
            l1Var.getClass();
            l1Var.j(null, str2);
            s6 O0 = O0();
            O0.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(O0);
            e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new b3(O0, this, cVar, 9), 2);
        }
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, cVar, i), 2);
    }
}

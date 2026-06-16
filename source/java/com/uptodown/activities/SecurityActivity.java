package com.uptodown.activities;

import android.app.NotificationManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import c7.n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import f1.g;
import f8.l1;
import g5.v0;
import h5.u;
import java.util.ArrayList;
import java.util.Iterator;
import k5.e;
import k5.w1;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.p;
import m3.c;
import o4.f0;
import o4.j4;
import o4.o9;
import o4.q2;
import o4.q9;
import o4.r9;
import o4.s9;
import r0.i;
import r4.n0;
import w5.a;
import w5.o;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class SecurityActivity extends j4 {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f4436g0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public n0 f4439c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4440d0;
    public final String Z = "SecurityActivity";

    /* renamed from: a0, reason: collision with root package name */
    public final n f4437a0 = new n(new f0(this, 24));

    /* renamed from: b0, reason: collision with root package name */
    public final ViewModelLazy f4438b0 = new ViewModelLazy(i0.a(s9.class), new r9(this, 0), new q9(this), new r9(this, 1));

    /* renamed from: e0, reason: collision with root package name */
    public final c f4441e0 = new c(this, 26);

    /* renamed from: f0, reason: collision with root package name */
    public final i f4442f0 = new i((Object) this, 27);

    @Override // o4.j4
    public final String D0() {
        return this.Z;
    }

    public final v0 N0() {
        return (v0) this.f4437a0.getValue();
    }

    public final void O0() {
        if (!this.f4440d0) {
            this.f4440d0 = true;
            c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o9(this, null, 0), 3);
        }
    }

    public final void P0() {
        s9 s9Var = (s9) this.f4438b0.getValue();
        s9Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList i = a.i(this);
        ArrayList arrayList2 = UptodownApp.f4382g0;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                w1 w1Var = (w1) next;
                Iterator it2 = i.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    next2.getClass();
                    e eVar = (e) next2;
                    if (p.b(w1Var.f7551b, eVar.B)) {
                        eVar.D = w1Var;
                        arrayList.add(eVar);
                    }
                }
            }
        }
        g.R(arrayList, this);
        l1 l1Var = s9Var.f9096a;
        o oVar = new o(arrayList);
        l1Var.getClass();
        l1Var.j(null, oVar);
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = N0().f5610a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            N0().f5612n.setNavigationIcon(drawable);
            N0().f5612n.setNavigationContentDescription(getString(R.string.back));
        }
        v0 N0 = N0();
        Toolbar toolbar = N0.f5612n;
        TextView textView = N0.o;
        RecyclerView recyclerView = N0.m;
        toolbar.setNavigationOnClickListener(new u(this, 18));
        N0.r.setTypeface(s4.c.u);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) recyclerView.getItemAnimator();
        simpleItemAnimator.getClass();
        simpleItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.addItemDecoration(new f((int) getResources().getDimension(R.dimen.margin_m), 0));
        N0.f5611b.setOnClickListener(new h5.o(22));
        N0.q.setTypeface(s4.c.u);
        N0.p.setTypeface(s4.c.v);
        textView.setTypeface(s4.c.u);
        textView.setOnClickListener(new q2(10, this, N0));
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new o9(this, null, 1), 2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 82) {
            N0().f5612n.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O0();
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
    }
}

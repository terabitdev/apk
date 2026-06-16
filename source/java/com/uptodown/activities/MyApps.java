package com.uptodown.activities;

import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.b;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import g5.y;
import h5.o;
import j8.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k5.d0;
import k5.e;
import k5.j0;
import k5.p2;
import k5.r;
import k5.u0;
import kotlin.jvm.internal.i0;
import m3.c;
import o4.a4;
import o4.b4;
import o4.f0;
import o4.j4;
import o4.l4;
import o4.q2;
import o4.s3;
import o4.t3;
import o4.u3;
import o4.w3;
import o4.x3;
import o4.y0;
import o4.z3;
import r4.p;
import r4.v0;
import w5.g;
import y5.f;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MyApps extends j4 {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f4411g0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public p f4414c0;
    public final String Z = "listado_instaladas";

    /* renamed from: a0, reason: collision with root package name */
    public final n f4412a0 = new n(new f0(this, 11));

    /* renamed from: b0, reason: collision with root package name */
    public final ViewModelLazy f4413b0 = new ViewModelLazy(i0.a(l4.class), new a4(this, 0), new z3(this), new a4(this, 1));

    /* renamed from: d0, reason: collision with root package name */
    public final t3 f4415d0 = new t3(this, 0);

    /* renamed from: e0, reason: collision with root package name */
    public final t3 f4416e0 = new t3(this, 1);

    /* renamed from: f0, reason: collision with root package name */
    public final c f4417f0 = new c(this, 18);

    public static final boolean N0(MyApps myApps, int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        p pVar = myApps.f4414c0;
        if (pVar != null && (arrayList = pVar.f10193d) != null && !arrayList.isEmpty()) {
            p pVar2 = myApps.f4414c0;
            ArrayList arrayList3 = null;
            if (pVar2 != null) {
                arrayList2 = pVar2.f10193d;
            } else {
                arrayList2 = null;
            }
            arrayList2.getClass();
            if (arrayList2.size() > i) {
                p pVar3 = myApps.f4414c0;
                if (pVar3 != null) {
                    arrayList3 = pVar3.f10193d;
                }
                arrayList3.getClass();
                if (arrayList3.get(i) instanceof e) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean O0(MyApps myApps, int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        p pVar = myApps.f4414c0;
        if (pVar != null && (arrayList = pVar.f10193d) != null && !arrayList.isEmpty()) {
            p pVar2 = myApps.f4414c0;
            ArrayList arrayList3 = null;
            if (pVar2 != null) {
                arrayList2 = pVar2.f10193d;
            } else {
                arrayList2 = null;
            }
            arrayList2.getClass();
            if (arrayList2.size() > i) {
                p pVar3 = myApps.f4414c0;
                if (pVar3 != null) {
                    arrayList3 = pVar3.f10193d;
                }
                arrayList3.getClass();
                if (arrayList3.get(i) instanceof v0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o4.j4
    public final String D0() {
        return this.Z;
    }

    @Override // o4.j4
    public final void H0() {
        S0(false);
    }

    @Override // o4.j4
    public final void I0() {
        S0(false);
    }

    public final y P0() {
        return (y) this.f4412a0.getValue();
    }

    public final int Q0(String str) {
        ArrayList arrayList;
        p pVar = this.f4414c0;
        ArrayList arrayList2 = null;
        if (pVar != null) {
            arrayList = pVar.f10193d;
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            p pVar2 = this.f4414c0;
            if (pVar2 != null) {
                arrayList2 = pVar2.f10193d;
            }
            arrayList2.getClass();
            int i = 0;
            for (Object obj : arrayList2) {
                int i3 = i + 1;
                if (((obj instanceof p2) && v.a0(((p2) obj).f7479b, str, true)) || (((obj instanceof e) && v.a0(((e) obj).l, str, true)) || ((obj instanceof v0) && v.a0(((v0) obj).f10230a.l, str, true)))) {
                    return i;
                }
                i = i3;
            }
            return -1;
        }
        return -1;
    }

    public final l4 R0() {
        return (l4) this.f4413b0.getValue();
    }

    public final void S0(boolean z10) {
        l4 R0 = R0();
        R0.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(R0);
        j8.e eVar = p0.f3588a;
        c8.f0.z(viewModelScope, d.f7053a, null, new y0(z10, R0, this, null, 1), 2);
    }

    @Override // o4.b0
    public final void X(String str) {
        if (Q0(str) >= 0) {
            S0(false);
        }
    }

    @Override // o4.b0
    public final void Y(String str) {
        ArrayList arrayList;
        int Q0 = Q0(str);
        if (Q0 >= 0) {
            p pVar = this.f4414c0;
            if (pVar != null && (arrayList = pVar.f10193d) != null) {
                arrayList.remove(Q0);
            }
            p pVar2 = this.f4414c0;
            if (pVar2 != null) {
                pVar2.notifyItemRemoved(Q0);
            }
        }
    }

    @Override // o4.b0
    public final void Z(String str) {
        if (Q0(str) >= 0) {
            S0(false);
        }
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        int c10 = d0Var.c();
        String b10 = d0Var.b();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        j8.e eVar = p0.f3588a;
        c8.f0.z(lifecycleScope, h8.n.f6148a, null, new b4(c10, null, this, b10, null, 0), 2);
    }

    @Override // o4.b0
    public final void c0(u0 u0Var) {
        Bundle bundle;
        u0Var.getClass();
        int c10 = u0Var.c();
        String b10 = u0Var.b();
        if (u0Var instanceof k5.p0) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("apps_parcelable", ((k5.p0) u0Var).f7477a);
            bundle = bundle2;
        } else {
            bundle = null;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        j8.e eVar = p0.f3588a;
        c8.f0.z(lifecycleScope, h8.n.f6148a, null, new b4(c10, bundle, this, b10, null, 0), 2);
    }

    @Override // o4.b0
    public final void d0(String str) {
        p pVar = this.f4414c0;
        if (pVar != null) {
            pVar.f10194e = -1;
        }
    }

    @Override // o4.b0
    public final void e0(String str, String str2) {
        p pVar = this.f4414c0;
        if (pVar != null) {
            pVar.f10194e = -1;
        }
        if (str2 != null && str2.length() != 0) {
            String string = getString(R.string.install_compatibility_error, str2);
            string.getClass();
            A(string);
        }
    }

    @Override // o4.b0
    public final void f0() {
        p pVar = this.f4414c0;
        if (pVar != null) {
            pVar.notifyDataSetChanged();
        }
    }

    @Override // o4.b0
    public final void g0(String str) {
        p pVar = this.f4414c0;
        if (pVar != null) {
            pVar.notifyDataSetChanged();
        }
    }

    @Override // o4.b0
    public final void l0() {
        p pVar = this.f4414c0;
        if (pVar != null) {
            pVar.f10194e = -1;
        }
    }

    @Override // o4.b0
    public final void n0(File file) {
        p pVar = this.f4414c0;
        if (pVar != null) {
            pVar.f10194e = -1;
        }
        if (pVar != null) {
            pVar.a(this, file);
        }
    }

    @Override // o4.b0
    public final void o0(File file) {
        file.getClass();
        p pVar = this.f4414c0;
        if (pVar != null) {
            pVar.a(this, file);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)|4|(2:5|6)|(8:8|9|10|11|(3:13|14|15)|18|14|15)|21|9|10|11|(0)|18|14|15) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096 A[Catch: Exception -> 0x009b, TRY_LEAVE, TryCatch #0 {Exception -> 0x009b, blocks: (B:11:0x008c, B:13:0x0096), top: B:10:0x008c }] */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = P0().f5656a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            P0().p.setNavigationIcon(drawable);
            P0().p.setNavigationContentDescription(getString(R.string.back));
        }
        P0().p.setNavigationOnClickListener(new s3(this, 0));
        P0().p.inflateMenu(R.menu.toolbar_menu_my_apps);
        P0().r.setTypeface(s4.c.u);
        P0().q.setTypeface(s4.c.v);
        try {
            sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences2.contains("show_system_apps")) {
            z10 = sharedPreferences2.getBoolean("show_system_apps", false);
            P0().p.getMenu().findItem(R.id.action_show_system_apps).setChecked(z10);
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("show_system_services")) {
                z11 = sharedPreferences.getBoolean("show_system_services", false);
                P0().p.getMenu().findItem(R.id.action_show_system_services).setChecked(z11);
                j4.A0(P0().p, z10);
                P0().p.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
                P0().p.setOnMenuItemClickListener(new b(this, 26));
                ((TextView) P0().f5657b.l).setTypeface(s4.c.v);
                ((TextView) P0().f5657b.m).setTypeface(s4.c.u);
                ((TextView) P0().f5657b.m).setText(getString(R.string.order_by_name));
                HashMap hashMap = new HashMap();
                hashMap.put(0, getString(R.string.order_by_name));
                int i = 1;
                hashMap.put(1, getString(R.string.order_by_last_update));
                hashMap.put(2, getString(R.string.order_by_size));
                ((LinearLayout) P0().f5657b.f69b).setOnClickListener(new q2(i, this, hashMap));
                int dimension = (int) getResources().getDimension(R.dimen.margin_m);
                P0().f5658n.addItemDecoration(new f(dimension, dimension));
                P0().f5658n.setLayoutManager(new LinearLayoutManager(this, 1, false));
                P0().f5658n.setItemAnimator(new DefaultItemAnimator());
                hideKeyboardOnScroll(P0().m);
                SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) P0().f5658n.getItemAnimator();
                simpleItemAnimator.getClass();
                simpleItemAnimator.setSupportsChangeAnimations(false);
                P0().o.setOnQueryTextListener(new u3(this));
                EditText editText = (EditText) P0().o.findViewById(androidx.appcompat.R.id.search_src_text);
                editText.setTypeface(s4.c.v);
                editText.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
                editText.setHintTextColor(ContextCompat.getColor(this, R.color.core_search_view_color));
                P0().o.setOnClickListener(new s3(this, i));
                P0().l.setOnClickListener(new o(10));
                c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new x3(this, null), 3);
                c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new w3(this, null, i), 3);
            }
            z11 = false;
            P0().p.getMenu().findItem(R.id.action_show_system_services).setChecked(z11);
            j4.A0(P0().p, z10);
            P0().p.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
            P0().p.setOnMenuItemClickListener(new b(this, 26));
            ((TextView) P0().f5657b.l).setTypeface(s4.c.v);
            ((TextView) P0().f5657b.m).setTypeface(s4.c.u);
            ((TextView) P0().f5657b.m).setText(getString(R.string.order_by_name));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(0, getString(R.string.order_by_name));
            int i3 = 1;
            hashMap2.put(1, getString(R.string.order_by_last_update));
            hashMap2.put(2, getString(R.string.order_by_size));
            ((LinearLayout) P0().f5657b.f69b).setOnClickListener(new q2(i3, this, hashMap2));
            int dimension2 = (int) getResources().getDimension(R.dimen.margin_m);
            P0().f5658n.addItemDecoration(new f(dimension2, dimension2));
            P0().f5658n.setLayoutManager(new LinearLayoutManager(this, 1, false));
            P0().f5658n.setItemAnimator(new DefaultItemAnimator());
            hideKeyboardOnScroll(P0().m);
            SimpleItemAnimator simpleItemAnimator2 = (SimpleItemAnimator) P0().f5658n.getItemAnimator();
            simpleItemAnimator2.getClass();
            simpleItemAnimator2.setSupportsChangeAnimations(false);
            P0().o.setOnQueryTextListener(new u3(this));
            EditText editText2 = (EditText) P0().o.findViewById(androidx.appcompat.R.id.search_src_text);
            editText2.setTypeface(s4.c.v);
            editText2.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
            editText2.setHintTextColor(ContextCompat.getColor(this, R.color.core_search_view_color));
            P0().o.setOnClickListener(new s3(this, i3));
            P0().l.setOnClickListener(new o(10));
            c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new x3(this, null), 3);
            c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new w3(this, null, i3), 3);
        }
        z10 = false;
        P0().p.getMenu().findItem(R.id.action_show_system_apps).setChecked(z10);
        sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        if (sharedPreferences.contains("show_system_services")) {
        }
        z11 = false;
        P0().p.getMenu().findItem(R.id.action_show_system_services).setChecked(z11);
        j4.A0(P0().p, z10);
        P0().p.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        P0().p.setOnMenuItemClickListener(new b(this, 26));
        ((TextView) P0().f5657b.l).setTypeface(s4.c.v);
        ((TextView) P0().f5657b.m).setTypeface(s4.c.u);
        ((TextView) P0().f5657b.m).setText(getString(R.string.order_by_name));
        HashMap hashMap22 = new HashMap();
        hashMap22.put(0, getString(R.string.order_by_name));
        int i32 = 1;
        hashMap22.put(1, getString(R.string.order_by_last_update));
        hashMap22.put(2, getString(R.string.order_by_size));
        ((LinearLayout) P0().f5657b.f69b).setOnClickListener(new q2(i32, this, hashMap22));
        int dimension22 = (int) getResources().getDimension(R.dimen.margin_m);
        P0().f5658n.addItemDecoration(new f(dimension22, dimension22));
        P0().f5658n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        P0().f5658n.setItemAnimator(new DefaultItemAnimator());
        hideKeyboardOnScroll(P0().m);
        SimpleItemAnimator simpleItemAnimator22 = (SimpleItemAnimator) P0().f5658n.getItemAnimator();
        simpleItemAnimator22.getClass();
        simpleItemAnimator22.setSupportsChangeAnimations(false);
        P0().o.setOnQueryTextListener(new u3(this));
        EditText editText22 = (EditText) P0().o.findViewById(androidx.appcompat.R.id.search_src_text);
        editText22.setTypeface(s4.c.v);
        editText22.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        editText22.setHintTextColor(ContextCompat.getColor(this, R.color.core_search_view_color));
        P0().o.setOnClickListener(new s3(this, i32));
        P0().l.setOnClickListener(new o(10));
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new x3(this, null), 3);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new w3(this, null, i32), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 82) {
            P0().p.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        S0(true);
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
    }

    @Override // o4.b0
    public final void p0(File file) {
        e eVar;
        String str;
        r rVar;
        p pVar = this.f4414c0;
        if (pVar != null) {
            g f7 = g.D.f(this);
            f7.b();
            Iterator it = pVar.f10193d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i3 = i + 1;
                Object next = it.next();
                if ((next instanceof e) && (str = (eVar = (e) next).l) != null && str.length() != 0) {
                    String str2 = eVar.l;
                    str2.getClass();
                    p2 Y = f7.Y(str2);
                    if (Y != null) {
                        rVar = Y.a(this);
                    } else {
                        rVar = null;
                    }
                    if (rVar != null && rVar.F.size() == 1 && v.a0(((j0) rVar.F.get(0)).q, file.getAbsolutePath(), true)) {
                        pVar.f10194e = i;
                        break;
                    }
                }
                i = i3;
            }
            f7.d();
            int i8 = pVar.f10194e;
            if (i8 >= 0) {
                pVar.notifyItemChanged(i8);
            }
        }
    }
}

package com.uptodown.activities;

import a5.h;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import c7.n;
import c8.c0;
import c8.f0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyDownloads;
import g5.z;
import g7.c;
import h5.o;
import j8.d;
import j8.e;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import k5.d0;
import k5.r;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.p;
import o4.b0;
import o4.b3;
import o4.m4;
import o4.q2;
import o4.s4;
import o4.t4;
import o4.u;
import o4.u4;
import o4.v4;
import o4.w4;
import o4.y4;
import o4.z4;
import r0.i;
import r4.b;
import w5.g;
import y5.f;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MyDownloads extends b0 {
    public static final /* synthetic */ int V = 0;
    public b Q;
    public boolean S;
    public final n O = new n(new m4(this, 0));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(z4.class), new w4(this, 0), new v4(this), new w4(this, 1));
    public y4 R = y4.f9261b;
    public final o4.b T = new o4.b(this, 4);
    public final i U = new i((Object) this, 21);

    public final void A0(boolean z10) {
        z4 z0 = z0();
        y4 y4Var = this.R;
        z0.getClass();
        y4Var.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(z0);
        e eVar = p0.f3588a;
        f0.z(viewModelScope, d.f7053a, null, new u(z10, z0, this, y4Var, null), 2);
    }

    public final void B0() {
        int i;
        b bVar = this.Q;
        if (bVar != null) {
            boolean[] zArr = bVar.f10068d;
            if (zArr != null) {
                i = 0;
                for (boolean z10 : zArr) {
                    if (z10) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            TextView textView = (TextView) y0().l.f5483b;
            this.Q.getClass();
            textView.setEnabled(!r3.f10066b.isEmpty());
        } else {
            i = 0;
        }
        if (i > 0) {
            ((TextView) y0().l.l).setEnabled(true);
            ((TextView) y0().l.l).setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_blue_primary_button));
        } else {
            ((TextView) y0().l.l).setEnabled(false);
            ((TextView) y0().l.l).setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_light_grey));
        }
        ((TextView) y0().l.m).setText(getString(R.string.core_x_items_selected, String.valueOf(i)));
    }

    public final void C0() {
        ((RelativeLayout) y0().l.o).setVisibility(0);
        ((RelativeLayout) y0().l.f5484n).setVisibility(0);
        ((LinearLayout) ((a3.i) y0().l.p).f69b).setVisibility(4);
        B0();
    }

    public final void D0() {
        b bVar = this.Q;
        if (bVar != null) {
            bVar.c(false);
        }
        ((RelativeLayout) y0().l.o).setVisibility(0);
        ((LinearLayout) ((a3.i) y0().l.p).f69b).setVisibility(0);
        ((RelativeLayout) y0().l.f5484n).setVisibility(4);
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        int c10 = d0Var.c();
        r a10 = d0Var.a();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        f0.z(lifecycleScope, h8.n.f6148a, null, new b3(this, c10, a10, (c) null, 6), 2);
    }

    @Override // o4.b0
    public final void d0(String str) {
        Integer num;
        b bVar;
        b bVar2 = this.Q;
        if (bVar2 != null) {
            num = Integer.valueOf(bVar2.f10069e);
        } else {
            num = null;
        }
        if (num != null && num.intValue() >= 0 && (bVar = this.Q) != null) {
            bVar.notifyItemChanged(num.intValue());
        }
        b bVar3 = this.Q;
        if (bVar3 != null) {
            bVar3.f10069e = -1;
        }
    }

    @Override // o4.b0
    public final void e0(String str, String str2) {
        b bVar;
        if (str != null && (bVar = this.Q) != null && !bVar.f10066b.isEmpty()) {
            b bVar2 = this.Q;
            bVar2.getClass();
            Iterator it = bVar2.f10066b.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    int i3 = i + 1;
                    if (v.a0(((r) it.next()).f7495b, str, true)) {
                        break;
                    } else {
                        i = i3;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                b bVar3 = this.Q;
                bVar3.getClass();
                bVar3.notifyItemChanged(i);
                b bVar4 = this.Q;
                bVar4.getClass();
                String string = getString(R.string.install_compatibility_error, ((r) bVar4.f10066b.get(i)).f7497w);
                string.getClass();
                A(string);
            }
            b bVar5 = this.Q;
            bVar5.getClass();
            bVar5.f10069e = -1;
        }
    }

    @Override // o4.b0
    public final void l0() {
        b bVar = this.Q;
        if (bVar != null) {
            bVar.f10069e = -1;
        }
    }

    @Override // o4.b0
    public final void n0(File file) {
        b bVar = this.Q;
        if (bVar != null) {
            bVar.f10069e = -1;
        }
        if (bVar != null) {
            bVar.a(file);
        }
    }

    @Override // o4.b0
    public final void o0(File file) {
        file.getClass();
        b bVar = this.Q;
        if (bVar != null) {
            bVar.a(file);
        }
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        final int i = 1;
        c cVar = null;
        if (extras != null && extras.containsKey("remoteInstallPath")) {
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                str = extras2.getString("remoteInstallPath");
            } else {
                str = null;
            }
            str.getClass();
            File file = new File(str);
            if (file.exists()) {
                V(file, null);
            }
            Object systemService = getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(8);
        }
        RelativeLayout relativeLayout = y0().f5666a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            y0().p.setNavigationIcon(drawable);
            y0().p.setNavigationContentDescription(getString(R.string.back));
        }
        ((TextView) findViewById(R.id.tv_toolbar_title_downloads)).setTypeface(s4.c.u);
        final int i3 = 0;
        y0().p.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.q4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyDownloads f9008b;

            {
                this.f9008b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i3;
                MyDownloads myDownloads = this.f9008b;
                switch (i8) {
                    case 0:
                        int i10 = MyDownloads.V;
                        myDownloads.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i11 = MyDownloads.V;
                        myDownloads.y0().o.setIconified(false);
                        return;
                    case 2:
                        int i12 = MyDownloads.V;
                        String string = myDownloads.getString(R.string.dialog_delete_all_download_msg);
                        string.getClass();
                        myDownloads.I(String.format(string, Arrays.copyOf(new Object[0], 0)), new m4(myDownloads, 4));
                        return;
                    default:
                        int i13 = MyDownloads.V;
                        String string2 = myDownloads.getString(R.string.dialog_delete_selected_download_msg);
                        string2.getClass();
                        myDownloads.I(String.format(string2, Arrays.copyOf(new Object[0], 0)), new m4(myDownloads, 1));
                        return;
                }
            }
        });
        y0().p.inflateMenu(R.menu.toolbar_menu_my_downloads);
        y0().p.setOnMenuItemClickListener(new androidx.core.view.inputmethod.b(this, 27));
        y0().o.setOnQueryTextListener(new t4(this));
        y0().o.setOnClickListener(new View.OnClickListener(this) { // from class: o4.q4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyDownloads f9008b;

            {
                this.f9008b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i;
                MyDownloads myDownloads = this.f9008b;
                switch (i8) {
                    case 0:
                        int i10 = MyDownloads.V;
                        myDownloads.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i11 = MyDownloads.V;
                        myDownloads.y0().o.setIconified(false);
                        return;
                    case 2:
                        int i12 = MyDownloads.V;
                        String string = myDownloads.getString(R.string.dialog_delete_all_download_msg);
                        string.getClass();
                        myDownloads.I(String.format(string, Arrays.copyOf(new Object[0], 0)), new m4(myDownloads, 4));
                        return;
                    default:
                        int i13 = MyDownloads.V;
                        String string2 = myDownloads.getString(R.string.dialog_delete_selected_download_msg);
                        string2.getClass();
                        myDownloads.I(String.format(string2, Arrays.copyOf(new Object[0], 0)), new m4(myDownloads, 1));
                        return;
                }
            }
        });
        ((ImageView) y0().o.findViewById(androidx.appcompat.R.id.search_close_btn)).setBackgroundResource(R.drawable.core_shape_transparent);
        EditText editText = (EditText) y0().o.findViewById(androidx.appcompat.R.id.search_src_text);
        editText.setTypeface(s4.c.v);
        editText.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        editText.setHintTextColor(ContextCompat.getColor(this, R.color.core_search_view_color));
        ((TextView) ((a3.i) y0().l.p).l).setTypeface(s4.c.v);
        ((TextView) ((a3.i) y0().l.p).m).setTypeface(s4.c.u);
        ((TextView) ((a3.i) y0().l.p).m).setText(getString(R.string.order_by_date));
        HashMap hashMap = new HashMap();
        hashMap.put(0, getString(R.string.order_by_name));
        hashMap.put(1, getString(R.string.order_by_date));
        final int i8 = 2;
        hashMap.put(2, getString(R.string.order_by_size));
        final int i10 = 3;
        ((LinearLayout) ((a3.i) y0().l.p).f69b).setOnClickListener(new q2(i10, this, hashMap));
        y0().f5668n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        y0().f5668n.addItemDecoration(new f(dimension, dimension));
        y0().f5668n.setItemAnimator(null);
        y0().f5668n.addOnItemTouchListener(new u4(this));
        y0().q.setTypeface(s4.c.v);
        g5.i iVar = y0().l;
        ((TextView) y0().l.m).setTypeface(s4.c.v);
        ((TextView) y0().l.f5483b).setTypeface(s4.c.u);
        ((TextView) y0().l.f5483b).setOnClickListener(new View.OnClickListener(this) { // from class: o4.q4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyDownloads f9008b;

            {
                this.f9008b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i82 = i8;
                MyDownloads myDownloads = this.f9008b;
                switch (i82) {
                    case 0:
                        int i102 = MyDownloads.V;
                        myDownloads.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i11 = MyDownloads.V;
                        myDownloads.y0().o.setIconified(false);
                        return;
                    case 2:
                        int i12 = MyDownloads.V;
                        String string = myDownloads.getString(R.string.dialog_delete_all_download_msg);
                        string.getClass();
                        myDownloads.I(String.format(string, Arrays.copyOf(new Object[0], 0)), new m4(myDownloads, 4));
                        return;
                    default:
                        int i13 = MyDownloads.V;
                        String string2 = myDownloads.getString(R.string.dialog_delete_selected_download_msg);
                        string2.getClass();
                        myDownloads.I(String.format(string2, Arrays.copyOf(new Object[0], 0)), new m4(myDownloads, 1));
                        return;
                }
            }
        });
        ((TextView) y0().l.l).setTypeface(s4.c.u);
        ((TextView) y0().l.l).setOnClickListener(new View.OnClickListener(this) { // from class: o4.q4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyDownloads f9008b;

            {
                this.f9008b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i82 = i10;
                MyDownloads myDownloads = this.f9008b;
                switch (i82) {
                    case 0:
                        int i102 = MyDownloads.V;
                        myDownloads.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i11 = MyDownloads.V;
                        myDownloads.y0().o.setIconified(false);
                        return;
                    case 2:
                        int i12 = MyDownloads.V;
                        String string = myDownloads.getString(R.string.dialog_delete_all_download_msg);
                        string.getClass();
                        myDownloads.I(String.format(string, Arrays.copyOf(new Object[0], 0)), new m4(myDownloads, 4));
                        return;
                    default:
                        int i13 = MyDownloads.V;
                        String string2 = myDownloads.getString(R.string.dialog_delete_selected_download_msg);
                        string2.getClass();
                        myDownloads.I(String.format(string2, Arrays.copyOf(new Object[0], 0)), new m4(myDownloads, 1));
                        return;
                }
            }
        });
        y0().f5667b.setOnClickListener(new o(12));
        D0();
        hideKeyboardOnScroll(y0().m);
        z();
        getOnBackPressedDispatcher().addCallback(this, this.T);
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new h(this, cVar, 25), 2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        try {
            g f7 = g.D.f(this);
            f7.b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("checked", (Integer) 1);
            SQLiteDatabase sQLiteDatabase = f7.f11192a;
            sQLiteDatabase.getClass();
            sQLiteDatabase.update("downloads", contentValues, null, null);
            f7.d();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onPause();
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
        A0(true);
    }

    @Override // o4.b0
    public final void p0(File file) {
        b bVar = this.Q;
        if (bVar != null) {
            Iterator it = bVar.f10066b.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i3 = i + 1;
                if (p.b(((r) it.next()).f(), file)) {
                    bVar.f10069e = i;
                    break;
                }
                i = i3;
            }
            int i8 = bVar.f10069e;
            if (i8 >= 0) {
                bVar.notifyItemChanged(i8);
            }
        }
    }

    @Override // o4.b0
    public final void v0(k5.g gVar) {
        gVar.getClass();
        if (!isFinishing() && S()) {
            Intent intent = new Intent(this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", gVar);
            float f7 = UptodownApp.G;
            startActivity(intent, n4.e.a(this));
        }
    }

    public final void w0(boolean z10) {
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new s4(this, z10, null), 3);
    }

    public final void x0(int i) {
        b bVar = this.Q;
        if (bVar != null && !bVar.f10066b.isEmpty()) {
            b bVar2 = this.Q;
            bVar2.getClass();
            if (i < bVar2.f10066b.size()) {
                f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b6.n(this, i, null), 3);
            }
        }
    }

    public final z y0() {
        return (z) this.O.getValue();
    }

    public final z4 z0() {
        return (z4) this.P.getValue();
    }

    @Override // o4.b0
    public final void f0() {
    }

    @Override // o4.b0
    public final void X(String str) {
    }

    @Override // o4.b0
    public final void Y(String str) {
    }

    @Override // o4.b0
    public final void Z(String str) {
    }

    @Override // o4.b0
    public final void g0(String str) {
    }
}

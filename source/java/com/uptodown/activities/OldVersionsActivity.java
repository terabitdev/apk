package com.uptodown.activities;

import a5.h;
import a5.k;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.core.b;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import f8.l1;
import h5.o;
import h5.u;
import j8.d;
import java.io.File;
import java.util.ArrayList;
import k5.a0;
import k5.d0;
import k5.e;
import k5.g;
import k5.r;
import k5.t1;
import k5.x;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.p;
import o4.b0;
import o4.f0;
import o4.n5;
import o4.o5;
import o4.q5;
import r0.i;
import r4.s;
import s4.c;
import y1.a;
import y5.f;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class OldVersionsActivity extends b0 {
    public static final /* synthetic */ int S = 0;
    public s Q;
    public final n O = new n(new f0(this, 14));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(q5.class), new o5(this, 0), new n5(this), new o5(this, 1));
    public final i R = new i((Object) this, 22);

    public final void A0(r rVar) {
        int r = rVar.r(this);
        if (r >= 0) {
            Object value = y0().f9012d.getValue();
            value.getClass();
            String str = ((g) value).f7358b;
            str.getClass();
            m0(r, str);
            return;
        }
        A(getString(R.string.error_cant_enqueue_download) + " (108)");
    }

    public final void B0(int i, r rVar) {
        String str;
        Long l;
        Object value = y0().f9012d.getValue();
        value.getClass();
        String str2 = ((g) value).F;
        Long l10 = null;
        if (rVar != null) {
            str = rVar.f7495b;
        } else {
            str = null;
        }
        if (v.a0(str2, str, false)) {
            if (i == 203) {
                C0(rVar);
                return;
            }
            if (i == 208) {
                String string = getString(R.string.no_free_space);
                string.getClass();
                A(string);
            } else if (this.Q != null && !y0().f9013e) {
                if (rVar != null) {
                    l = Long.valueOf(rVar.q);
                } else {
                    l = null;
                }
                g gVar = (g) y0().f9012d.getValue();
                if (gVar != null) {
                    l10 = Long.valueOf(gVar.f7356a);
                }
                if (p.b(l, l10)) {
                    C0(rVar);
                }
            }
        }
    }

    public final void C0(r rVar) {
        t1 t1Var;
        Object obj;
        Object value = y0().f9012d.getValue();
        value.getClass();
        ArrayList arrayList = ((g) value).E0;
        Integer num = null;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    obj = arrayList.get(i);
                    i++;
                    t1 t1Var2 = (t1) obj;
                    if (rVar != null && t1Var2.m == rVar.f7496n) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            t1Var = (t1) obj;
        } else {
            t1Var = null;
        }
        Object value2 = y0().f9012d.getValue();
        value2.getClass();
        ArrayList arrayList2 = ((g) value2).E0;
        if (arrayList2 != null) {
            num = Integer.valueOf(arrayList2.indexOf(t1Var));
        }
        if (t1Var != null && num != null) {
            s sVar = this.Q;
            if (sVar != null) {
                sVar.notifyItemChanged(num.intValue());
                return;
            }
            return;
        }
        s sVar2 = this.Q;
        if (sVar2 != null) {
            sVar2.notifyDataSetChanged();
        }
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        Long l;
        d0Var.getClass();
        r a10 = d0Var.a();
        if (a10 != null) {
            l = Long.valueOf(a10.f7496n);
        } else {
            l = null;
        }
        if (l != null) {
            B0(d0Var.c(), a10);
        }
        if ((d0Var instanceof x) && a10 != null && a10.g() != null) {
            runOnUiThread(new a(6, this, false, a10));
        }
        if (d0Var instanceof a0) {
            B0(d0Var.c(), a10);
        }
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5431a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        y0().f9014f = true;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("app")) {
                l1 l1Var = y0().f9011c;
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = (Parcelable) extras.getParcelable("app", e.class);
                } else {
                    parcelable2 = extras.getParcelable("app");
                }
                l1Var.i(parcelable2);
            }
            if (extras.containsKey("appInfo")) {
                l1 l1Var2 = y0().f9012d;
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = (Parcelable) extras.getParcelable("appInfo", g.class);
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                l1Var2.i(parcelable);
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_old_versions);
        int i = 15;
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
            }
            toolbar.setNavigationOnClickListener(new u(this, i));
        }
        ((TextView) findViewById(R.id.tv_toolbar_old_versions)).setTypeface(c.u);
        w0().m.setTypeface(c.v);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        linearLayoutManager.setItemPrefetchEnabled(false);
        w0().l.setLayoutManager(linearLayoutManager);
        w0().l.setItemAnimator(null);
        w0().l.addItemDecoration(new f((int) getResources().getDimension(R.dimen.margin_m), (int) getResources().getDimension(R.dimen.margin_xl)));
        w0().f5432b.setOnClickListener(new o(15));
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new h(this, (g7.c) null, 27), 2);
        x0();
    }

    @Override // o4.b0
    public final boolean q0() {
        return false;
    }

    public final g5.d0 w0() {
        return (g5.d0) this.O.getValue();
    }

    public final void x0() {
        y0().f9013e = true;
        if (y0().f9012d.getValue() != null) {
            q5 y02 = y0();
            y02.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(y02);
            j8.e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new k(y02, this, null, 13), 2);
        }
    }

    public final q5 y0() {
        return (q5) this.P.getValue();
    }

    public final void z0(r rVar) {
        String str = rVar.f7495b;
        str.getClass();
        long j = rVar.f7496n;
        PackageManager packageManager = getPackageManager();
        try {
            packageManager.getClass();
            if (j < a5.f.d(a5.o.e(packageManager, str, 128))) {
                String str2 = rVar.f7495b;
                str2.getClass();
                String string = getString(R.string.msg_warning_old_versions);
                string.getClass();
                I(string, new b(16, this, str2));
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        File g = rVar.g();
        if (g != null && g.exists()) {
            float f7 = UptodownApp.G;
            n4.e.p(this, null, g);
        }
    }
}

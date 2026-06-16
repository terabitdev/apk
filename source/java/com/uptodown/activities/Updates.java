package com.uptodown.activities;

import a5.q;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import c7.n;
import c8.c0;
import c8.f0;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadUpdatesWorker;
import d7.a0;
import d7.t;
import d7.u;
import f8.l1;
import h5.o;
import j8.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k5.d0;
import k5.e;
import k5.j0;
import k5.o1;
import k5.p2;
import k5.r;
import k5.u0;
import k5.y0;
import kotlin.jvm.internal.i0;
import n5.f;
import o4.aa;
import o4.b;
import o4.b4;
import o4.ca;
import o4.da;
import o4.ea;
import o4.h3;
import o4.ha;
import o4.ia;
import o4.j4;
import o4.oa;
import o4.pa;
import o4.t9;
import o4.u9;
import o4.v9;
import o4.w9;
import o4.x9;
import o4.z9;
import q1.e0;
import q7.a;
import r4.v0;
import r4.x0;
import s4.c;
import w5.g;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class Updates extends j4 {
    public static final /* synthetic */ int m0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    public x0 f4444b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4445c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f4446d0;

    /* renamed from: f0, reason: collision with root package name */
    public final ActivityResultLauncher f4448f0;

    /* renamed from: g0, reason: collision with root package name */
    public final x9 f4449g0;
    public final x9 h0;

    /* renamed from: i0, reason: collision with root package name */
    public final aa f4450i0;

    /* renamed from: j0, reason: collision with root package name */
    public final aa f4451j0;

    /* renamed from: k0, reason: collision with root package name */
    public final ActivityResultLauncher f4452k0;

    /* renamed from: l0, reason: collision with root package name */
    public final b f4453l0;
    public final n Z = new n(new t9(this, 0));

    /* renamed from: a0, reason: collision with root package name */
    public final ViewModelLazy f4443a0 = new ViewModelLazy(i0.a(pa.class), new ia(this, 0), new ha(this), new ia(this, 1));

    /* renamed from: e0, reason: collision with root package name */
    public final String f4447e0 = "panel_actualizaciones_individual";

    public Updates() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new v9(this, 0));
        registerForActivityResult.getClass();
        this.f4448f0 = registerForActivityResult;
        this.f4449g0 = new x9(this, 1);
        this.h0 = new x9(this, 0);
        this.f4450i0 = new aa(this);
        this.f4451j0 = new aa(this);
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new v9(this, 1));
        registerForActivityResult2.getClass();
        this.f4452k0 = registerForActivityResult2;
        this.f4453l0 = new b(this, 5);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:9|10|11|(9:13|(1:15)(1:29)|16|17|18|(1:20)|(1:23)(1:27)|24|25)|31|(0)(0)|16|17|18|(0)|(0)(0)|24|25) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[Catch: Exception -> 0x00b1, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b1, blocks: (B:18:0x00a3, B:20:0x00ad), top: B:17:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void N0(Updates updates) {
        boolean z10;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (!((Collection) updates.W0().h.f5266a.getValue()).isEmpty()) {
            updates.U0().u.setVisibility(8);
            updates.U0().o.setVisibility(0);
        } else {
            updates.U0().u.setVisibility(0);
            updates.U0().o.setVisibility(8);
        }
        if (!a4.f3693b) {
            updates.U0().u.setAlpha(0.4f);
        } else {
            updates.U0().u.setAlpha(1.0f);
        }
        if (updates.U0().m.getVisibility() == 8) {
            RelativeLayout relativeLayout = updates.U0().m;
            boolean z11 = true;
            z11 = true;
            z9 z9Var = new z9(updates, z11 ? 1 : 0);
            Animation loadAnimation = AnimationUtils.loadAnimation(updates, R.anim.slide_in_bottom);
            float f7 = UptodownApp.G;
            try {
                sharedPreferences2 = updates.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused) {
            }
            if (sharedPreferences2.contains("animations")) {
                z10 = sharedPreferences2.getBoolean("animations", true);
                if (!z10) {
                    float f10 = UptodownApp.G;
                    loadAnimation.setAnimationListener(z9Var);
                    relativeLayout.startAnimation(loadAnimation);
                } else {
                    z9Var.onAnimationEnd(loadAnimation);
                }
                RelativeLayout relativeLayout2 = updates.U0().f5655n;
                float f11 = UptodownApp.G;
                sharedPreferences = updates.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("animations")) {
                    z11 = sharedPreferences.getBoolean("animations", true);
                }
                if (!z11) {
                    float f12 = UptodownApp.G;
                    relativeLayout2.startAnimation(AnimationUtils.loadAnimation(updates, R.anim.slide_in_bottom));
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout2.setVisibility(0);
                }
                updates.U0().m.setVisibility(0);
            }
            z10 = true;
            if (!z10) {
            }
            RelativeLayout relativeLayout22 = updates.U0().f5655n;
            float f112 = UptodownApp.G;
            sharedPreferences = updates.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("animations")) {
            }
            if (!z11) {
            }
            updates.U0().m.setVisibility(0);
        }
    }

    public static final void O0(Updates updates, String str) {
        p2 Y;
        if (!((Collection) updates.W0().h.f5266a.getValue()).isEmpty()) {
            g f7 = g.D.f(updates);
            f7.b();
            r rVar = null;
            if (str != null && (Y = f7.Y(str)) != null) {
                rVar = Y.a(updates);
            }
            f7.d();
            updates.U0().o.setOnClickListener(new o(23));
            updates.a1();
            if (rVar != null) {
                updates.U0().l.setIndeterminate(false);
                updates.U0().l.setProgress(rVar.i());
            }
        }
    }

    @Override // o4.j4
    public final String D0() {
        return this.f4447e0;
    }

    @Override // o4.j4
    public final void F0() {
        Q0();
    }

    @Override // o4.j4
    public final void H0() {
        Y0(false);
    }

    @Override // o4.j4
    public final void I0() {
        Y0(false);
    }

    @Override // o4.j4
    public final void J0(e eVar) {
        R0(new u9(this, eVar, 1));
    }

    @Override // o4.j4
    public final void K0(e eVar) {
        R0(new u9(this, eVar, 0));
    }

    public final void P0(int i) {
        if (X0(i)) {
            x0 x0Var = this.f4444b0;
            x0Var.getClass();
            Object obj = x0Var.a().get(i);
            obj.getClass();
            e eVar = ((v0) obj).f10230a;
            W0().d(eVar.l);
            E0(eVar);
            x0 x0Var2 = this.f4444b0;
            if (x0Var2 != null) {
                x0Var2.notifyItemChanged(i);
            }
        }
    }

    public final void Q0() {
        Integer num;
        x0 x0Var = this.f4444b0;
        if (x0Var != null) {
            x0Var.h = false;
        }
        float f7 = UptodownApp.G;
        n4.e.f();
        x0 x0Var2 = this.f4444b0;
        if (x0Var2 != null) {
            num = Integer.valueOf(x0Var2.a().size());
        } else {
            num = null;
        }
        if (num != null && num.intValue() > 0) {
            int intValue = num.intValue();
            for (int i = 0; i < intValue; i++) {
                P0(i);
            }
        }
        l1 l1Var = W0().f8988d;
        l1Var.getClass();
        l1Var.j(null, a0.f4706a);
    }

    public final void R0(a aVar) {
        boolean z10;
        if (((List) W0().h.f5266a.getValue()).size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        x0 x0Var = this.f4444b0;
        if ((x0Var != null && x0Var.h) || z10) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            j8.e eVar = p0.f3588a;
            f0.z(lifecycleScope, h8.n.f6148a, null, new h3(this, aVar, null, 16), 2);
            return;
        }
        aVar.invoke();
    }

    public final void S0() {
        r rVar;
        r rVar2;
        File g;
        if (!a4.f3693b) {
            Q0();
            return;
        }
        if (!((Collection) W0().h.f5266a.getValue()).isEmpty()) {
            l1 l1Var = n5.e.f8328a;
            if (!(l1Var.getValue() instanceof o1)) {
                float f7 = UptodownApp.G;
                if (!n4.e.o(this, "GenerateQueueWorker") && !n4.e.o(this, "downloadApkWorker")) {
                    e eVar = (e) ((List) W0().h.f5266a.getValue()).get(0);
                    e0 e0Var = g.D;
                    g f10 = e0Var.f(this);
                    f10.b();
                    String str = eVar.l;
                    str.getClass();
                    p2 Y = f10.Y(str);
                    if (Y != null) {
                        rVar = Y.a(this);
                    } else {
                        rVar = null;
                    }
                    f10.d();
                    a1();
                    if (rVar != null && rVar.c()) {
                        if (!(l1Var.getValue() instanceof o1) && !((Collection) W0().h.f5266a.getValue()).isEmpty()) {
                            a1();
                            e b10 = W0().b();
                            if (b10 != null) {
                                Context applicationContext = getApplicationContext();
                                applicationContext.getClass();
                                g f11 = e0Var.f(applicationContext);
                                f11.b();
                                String str2 = b10.l;
                                str2.getClass();
                                p2 Y2 = f11.Y(str2);
                                if (Y2 != null) {
                                    rVar2 = Y2.a(this);
                                } else {
                                    rVar2 = null;
                                }
                                f11.d();
                                if (rVar2 != null && rVar2.c() && (g = rVar2.g()) != null) {
                                    if (Y2.p == 1) {
                                        R(Y2, g);
                                        return;
                                    } else {
                                        V(g, null);
                                        return;
                                    }
                                }
                                S0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    boolean z10 = this.f4445c0;
                    if (!n4.e.o(this, "DownloadUpdatesWorker")) {
                        WorkManager.Companion.getInstance(this).enqueue(((OneTimeWorkRequest.Builder) i6.l(DownloadUpdatesWorker.class, "DownloadUpdatesWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", z10).build()).build());
                        return;
                    }
                    return;
                }
            }
        }
        x0 x0Var = this.f4444b0;
        if (x0Var != null) {
            x0Var.h = false;
        }
    }

    public final int T0(String str) {
        x0 x0Var;
        if (str != null && (x0Var = this.f4444b0) != null) {
            ArrayList a10 = x0Var.a();
            Iterator it = a10.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i3 = i + 1;
                if (it.next() instanceof v0) {
                    Object obj = a10.get(i);
                    obj.getClass();
                    if (v.a0(((v0) obj).f10230a.l, str, true)) {
                        return i;
                    }
                }
                i = i3;
            }
            return -1;
        }
        return -1;
    }

    public final g5.x0 U0() {
        return (g5.x0) this.Z.getValue();
    }

    public final int V0(String str) {
        ArrayList arrayList;
        x0 x0Var = this.f4444b0;
        ArrayList arrayList2 = null;
        if (x0Var != null) {
            arrayList = x0Var.a();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            x0 x0Var2 = this.f4444b0;
            if (x0Var2 != null) {
                arrayList2 = x0Var2.a();
            }
            arrayList2.getClass();
            int i = 0;
            for (Object obj : arrayList2) {
                int i3 = i + 1;
                if ((obj instanceof v0) && v.a0(((v0) obj).f10230a.l, str, true)) {
                    return i;
                }
                i = i3;
            }
            return -1;
        }
        return -1;
    }

    public final pa W0() {
        return (pa) this.f4443a0.getValue();
    }

    @Override // o4.b0
    public final void X(String str) {
        this.f4446d0 = null;
        Y0(false);
    }

    public final boolean X0(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        x0 x0Var = this.f4444b0;
        if (x0Var != null && i >= 0) {
            x0Var.getClass();
            if (i < x0Var.getItemCount()) {
                x0 x0Var2 = this.f4444b0;
                ArrayList arrayList3 = null;
                if (x0Var2 != null) {
                    arrayList = x0Var2.a();
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    x0 x0Var3 = this.f4444b0;
                    if (x0Var3 != null) {
                        arrayList2 = x0Var3.a();
                    } else {
                        arrayList2 = null;
                    }
                    arrayList2.getClass();
                    if (arrayList2.size() > i) {
                        x0 x0Var4 = this.f4444b0;
                        if (x0Var4 != null) {
                            arrayList3 = x0Var4.a();
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
            return false;
        }
        return false;
    }

    @Override // o4.b0
    public final void Y(String str) {
        W0().d(str);
        Y0(false);
    }

    public final void Y0(boolean z10) {
        pa W0 = W0();
        W0.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(W0);
        j8.e eVar = p0.f3588a;
        f0.z(viewModelScope, d.f7053a, null, new oa(z10, W0, this, null), 2);
    }

    @Override // o4.b0
    public final void Z(String str) {
        this.f4446d0 = null;
        W0().d(str);
        W0().c(str);
        x0 x0Var = this.f4444b0;
        if (x0Var != null && str != null) {
            Iterator it = x0Var.a().iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    int i3 = i + 1;
                    Object next = it.next();
                    if ((next instanceof v0) && v.a0(((v0) next).f10231b.f7479b, str, true)) {
                        break;
                    } else {
                        i = i3;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            x0 x0Var2 = this.f4444b0;
            if (x0Var2 != null && i >= 0 && i < x0Var2.a().size()) {
                Object remove = x0Var2.a().remove(i);
                remove.getClass();
                e eVar = ((v0) remove).f10230a;
                eVar.p = k5.d.f7325b;
                x0Var2.notifyItemRemoved(i);
                int indexOf = x0Var2.a().indexOf("title_recent_updates") + 1;
                x0Var2.a().add(indexOf, eVar);
                x0Var2.notifyItemInserted(indexOf);
            }
        }
        Y0(false);
        S0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d7.a0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void Z0() {
        ?? r02;
        float f7 = UptodownApp.G;
        boolean o = n4.e.o(this, "downloadApkWorker");
        x0 x0Var = this.f4444b0;
        int i = 0;
        if (!o) {
            if (x0Var != null) {
                ArrayList a10 = x0Var.a();
                ArrayList arrayList = new ArrayList();
                int size = a10.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = a10.get(i3);
                    i3++;
                    if (obj instanceof v0) {
                        arrayList.add(obj);
                    }
                }
                r02 = new ArrayList(u.i0(arrayList, 10));
                int size2 = arrayList.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    r02.add(((v0) obj2).f10230a);
                }
            } else {
                r02 = a0.f4706a;
            }
            pa W0 = W0();
            W0.getClass();
            l1 l1Var = W0.f8988d;
            List T0 = t.T0((Iterable) r02);
            l1Var.getClass();
            l1Var.j(null, T0);
            for (e eVar : (List) W0().h.f5266a.getValue()) {
                String str = eVar.l;
                if (str != null) {
                    f.b(str, "panel_actualizaciones_actualizar_todo");
                }
                j4.B0(eVar);
            }
            x0 x0Var2 = this.f4444b0;
            if (x0Var2 != null) {
                x0Var2.h = true;
                Iterator it = x0Var2.a().iterator();
                int i10 = 0;
                int i11 = -1;
                while (it.hasNext()) {
                    int i12 = i + 1;
                    if (it.next() instanceof v0) {
                        if (i11 == -1) {
                            i11 = i;
                        }
                        i10++;
                    } else if (i11 != -1) {
                        break;
                    }
                    i = i12;
                }
                if (i11 >= 0) {
                    x0Var2.notifyItemRangeChanged(i11, i10);
                } else {
                    x0Var2.notifyDataSetChanged();
                }
            }
            S0();
            return;
        }
        if (x0Var != null) {
            x0Var.h = false;
        }
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        int c10 = d0Var.c();
        String b10 = d0Var.b();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        j8.e eVar = p0.f3588a;
        f0.z(lifecycleScope, h8.n.f6148a, null, new b4(c10, null, this, b10, null, 1), 2);
    }

    public final void a1() {
        List list = (List) W0().h.f5266a.getValue();
        if (!list.isEmpty()) {
            U0().t.setText(getString(R.string.dialog_update_all_desc, String.valueOf(list.size())));
            U0().l.setIndeterminate(true);
        }
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
        f0.z(lifecycleScope, h8.n.f6148a, null, new b4(c10, bundle, this, b10, null, 1), 2);
    }

    @Override // o4.b0
    public final void d0(String str) {
        this.f4446d0 = null;
        if (str != null) {
            int T0 = T0(str);
            if (X0(T0)) {
                x0 x0Var = this.f4444b0;
                x0Var.getClass();
                Object obj = x0Var.a().get(T0);
                obj.getClass();
                e eVar = ((v0) obj).f10230a;
                W0().d(eVar.l);
                E0(eVar);
                x0 x0Var2 = this.f4444b0;
                if (x0Var2 != null) {
                    x0Var2.notifyItemChanged(T0);
                }
            }
        }
        x0 x0Var3 = this.f4444b0;
        if (x0Var3 != null) {
            x0Var3.g = -1;
        }
        if (x0Var3 != null) {
            x0Var3.notifyDataSetChanged();
        }
        S0();
    }

    @Override // o4.b0
    public final void e0(String str, String str2) {
        String str3;
        e eVar;
        String str4;
        this.f4446d0 = null;
        x0 x0Var = this.f4444b0;
        int i = -1;
        if (x0Var != null) {
            x0Var.g = -1;
        }
        if (x0Var != null && str != null && str.length() != 0) {
            int i3 = 0;
            for (Object obj : x0Var.a()) {
                int i8 = i3 + 1;
                if (((obj instanceof e) && (str4 = (eVar = (e) obj).l) != null && str4.length() != 0 && v.a0(eVar.l, str, true)) || ((obj instanceof v0) && v.a0(((v0) obj).f10231b.f7479b, str, true))) {
                    i = i3;
                    break;
                }
                i3 = i8;
            }
            if (i >= 0) {
                g f7 = g.D.f(this);
                f7.b();
                p2 Y = f7.Y(str);
                f7.d();
                if (Y != null && Y.c()) {
                    x0Var.a().remove(i);
                    x0Var.notifyItemRemoved(i);
                    W0().c(str);
                } else {
                    x0Var.notifyItemChanged(i);
                }
            }
        }
        x0 x0Var2 = this.f4444b0;
        if (x0Var2 != null) {
            x0Var2.b();
        }
        S0();
        e h = w5.a.h(this, str);
        if (h != null && (str3 = h.f7339b) != null && str3.length() != 0) {
            String string = getString(R.string.install_compatibility_error, h.f7339b);
            string.getClass();
            A(string);
        }
    }

    @Override // o4.b0
    public final void f0() {
        String str = this.f4446d0;
        this.f4446d0 = null;
        if (str != null) {
            W0().d(str);
            x0 x0Var = this.f4444b0;
            if (x0Var != null) {
                x0Var.notifyItemChanged(V0(str));
            }
        }
        x0 x0Var2 = this.f4444b0;
        if (x0Var2 != null) {
            x0Var2.g = -1;
        }
        S0();
    }

    @Override // o4.b0
    public final void g0(String str) {
        this.f4446d0 = str;
        int V0 = V0(str);
        x0 x0Var = this.f4444b0;
        if (x0Var != null && V0 > -1) {
            x0Var.g = V0;
            x0Var.notifyItemChanged(V0);
        }
    }

    @Override // o4.b0
    public final void h0(long j) {
        R0(new androidx.compose.foundation.text.input.a(this, 4, j));
    }

    @Override // o4.b0
    public final void l0() {
        x0 x0Var = this.f4444b0;
        if (x0Var != null) {
            x0Var.g = -1;
        }
    }

    @Override // o4.b0
    public final void n0(File file) {
        x0 x0Var = this.f4444b0;
        if (x0Var != null) {
            x0Var.g = -1;
        }
        if (x0Var != null) {
            x0Var.c(this, file);
        }
    }

    @Override // o4.b0
    public final void o0(File file) {
        file.getClass();
        x0 x0Var = this.f4444b0;
        if (x0Var != null) {
            x0Var.c(this, file);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)|4|(1:6)|7|8|9|(12:11|12|13|14|(7:16|17|18|19|(1:21)|23|24)|28|17|18|19|(0)|23|24)|31|12|13|14|(0)|28|17|18|19|(0)|23|24) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a2, blocks: (B:14:0x0093, B:16:0x009d), top: B:13:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a1 A[Catch: Exception -> 0x01a4, TRY_LEAVE, TryCatch #1 {Exception -> 0x01a4, blocks: (B:19:0x0197, B:21:0x01a1), top: B:18:0x0197 }] */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = U0().f5653a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            U0().r.setNavigationIcon(drawable);
            U0().r.setNavigationContentDescription(getString(R.string.back));
        }
        U0().r.setNavigationOnClickListener(new w9(this, 0));
        U0().v.setTypeface(c.u);
        U0().r.inflateMenu(R.menu.toolbar_menu_updates);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable);
        if (drawable2 != null) {
            U0().r.setOverflowIcon(drawable2);
        }
        try {
            sharedPreferences3 = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences3.contains("show_system_apps")) {
            z10 = sharedPreferences3.getBoolean("show_system_apps", false);
            U0().r.getMenu().findItem(R.id.action_show_system_apps).setChecked(z10);
            sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences2.contains("show_system_services")) {
                z11 = sharedPreferences2.getBoolean("show_system_services", false);
                U0().r.getMenu().findItem(R.id.action_show_system_services).setChecked(z11);
                j4.A0(U0().r, z10);
                int i = 2;
                U0().r.setOnMenuItemClickListener(new v9(this, i));
                U0().p.setLayoutManager(new LinearLayoutManager(this, 1, false));
                DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                defaultItemAnimator.setSupportsChangeAnimations(false);
                int dimension = (int) getResources().getDimension(R.dimen.margin_m);
                U0().p.addItemDecoration(new y5.f(dimension, dimension));
                U0().p.setItemAnimator(defaultItemAnimator);
                U0().f5654b.setOnClickListener(new o(23));
                U0().u.setTypeface(c.u);
                U0().u.setOnClickListener(new w9(this, 1));
                U0().t.setTypeface(c.v);
                U0().s.setTypeface(c.u);
                U0().s.setOnClickListener(new w9(this, i));
                U0().q.setColorSchemeColors(ContextCompat.getColor(this, R.color.main_blue), ContextCompat.getColor(this, R.color.main_blue_pressed));
                U0().q.setOnRefreshListener(new v9(this, 3));
                U0().m.setOnClickListener(new o(23));
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                sharedPreferences = applicationContext.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("install_apk_rooted")) {
                    sharedPreferences.getBoolean("install_apk_rooted", false);
                }
                f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new da(this, null), 3);
                f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ea(this, null), 3);
                f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new ca(this, (g7.c) null, i), 2);
                getOnBackPressedDispatcher().addCallback(this, this.f4453l0);
                Y0(true);
            }
            z11 = false;
            U0().r.getMenu().findItem(R.id.action_show_system_services).setChecked(z11);
            j4.A0(U0().r, z10);
            int i3 = 2;
            U0().r.setOnMenuItemClickListener(new v9(this, i3));
            U0().p.setLayoutManager(new LinearLayoutManager(this, 1, false));
            DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator();
            defaultItemAnimator2.setSupportsChangeAnimations(false);
            int dimension2 = (int) getResources().getDimension(R.dimen.margin_m);
            U0().p.addItemDecoration(new y5.f(dimension2, dimension2));
            U0().p.setItemAnimator(defaultItemAnimator2);
            U0().f5654b.setOnClickListener(new o(23));
            U0().u.setTypeface(c.u);
            U0().u.setOnClickListener(new w9(this, 1));
            U0().t.setTypeface(c.v);
            U0().s.setTypeface(c.u);
            U0().s.setOnClickListener(new w9(this, i3));
            U0().q.setColorSchemeColors(ContextCompat.getColor(this, R.color.main_blue), ContextCompat.getColor(this, R.color.main_blue_pressed));
            U0().q.setOnRefreshListener(new v9(this, 3));
            U0().m.setOnClickListener(new o(23));
            Context applicationContext2 = getApplicationContext();
            applicationContext2.getClass();
            sharedPreferences = applicationContext2.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("install_apk_rooted")) {
            }
            f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new da(this, null), 3);
            f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ea(this, null), 3);
            f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new ca(this, (g7.c) null, i3), 2);
            getOnBackPressedDispatcher().addCallback(this, this.f4453l0);
            Y0(true);
        }
        z10 = false;
        U0().r.getMenu().findItem(R.id.action_show_system_apps).setChecked(z10);
        sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
        if (sharedPreferences2.contains("show_system_services")) {
        }
        z11 = false;
        U0().r.getMenu().findItem(R.id.action_show_system_services).setChecked(z11);
        j4.A0(U0().r, z10);
        int i32 = 2;
        U0().r.setOnMenuItemClickListener(new v9(this, i32));
        U0().p.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DefaultItemAnimator defaultItemAnimator22 = new DefaultItemAnimator();
        defaultItemAnimator22.setSupportsChangeAnimations(false);
        int dimension22 = (int) getResources().getDimension(R.dimen.margin_m);
        U0().p.addItemDecoration(new y5.f(dimension22, dimension22));
        U0().p.setItemAnimator(defaultItemAnimator22);
        U0().f5654b.setOnClickListener(new o(23));
        U0().u.setTypeface(c.u);
        U0().u.setOnClickListener(new w9(this, 1));
        U0().t.setTypeface(c.v);
        U0().s.setTypeface(c.u);
        U0().s.setOnClickListener(new w9(this, i32));
        U0().q.setColorSchemeColors(ContextCompat.getColor(this, R.color.main_blue), ContextCompat.getColor(this, R.color.main_blue_pressed));
        U0().q.setOnRefreshListener(new v9(this, 3));
        U0().m.setOnClickListener(new o(23));
        Context applicationContext22 = getApplicationContext();
        applicationContext22.getClass();
        sharedPreferences = applicationContext22.getSharedPreferences("SettingsPreferences", 0);
        if (sharedPreferences.contains("install_apk_rooted")) {
        }
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new da(this, null), 3);
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ea(this, null), 3);
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new ca(this, (g7.c) null, i32), 2);
        getOnBackPressedDispatcher().addCallback(this, this.f4453l0);
        Y0(true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (n5.d.f8324a.getValue() instanceof y0) {
            WorkManager.Companion.getInstance(this).cancelAllWorkByTag("DownloadUpdatesWorker");
            float f7 = UptodownApp.G;
            n4.e.f();
        }
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        r a10;
        super.onResume();
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
        float f7 = UptodownApp.G;
        if (!n4.e.o(this, "DownloadUpdatesWorker")) {
            pa W0 = W0();
            W0.getClass();
            List list = (List) W0.f8988d.getValue();
            if (!list.isEmpty()) {
                g f10 = g.D.f(this);
                f10.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    String str = ((e) obj).l;
                    if (str != null) {
                        float f11 = UptodownApp.G;
                        if (!n4.e.l(str)) {
                            p2 Y = f10.Y(str);
                            if (Y != null && (a10 = Y.a(this)) != null && a10.c()) {
                            }
                        }
                    }
                    arrayList.add(obj);
                }
                f10.d();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    W0.d(((e) obj2).l);
                }
            }
        }
        if (this.f4446d0 == null) {
            S0();
        }
    }

    @Override // o4.b0
    public final void p0(File file) {
        e eVar;
        String str;
        x0 x0Var = this.f4444b0;
        if (x0Var != null) {
            g f7 = g.D.f(this);
            f7.b();
            int i = 0;
            for (Object obj : x0Var.a()) {
                int i3 = i + 1;
                ArrayList arrayList = null;
                r rVar = null;
                if ((obj instanceof e) && (str = (eVar = (e) obj).l) != null && str.length() != 0) {
                    String str2 = eVar.l;
                    str2.getClass();
                    p2 Y = f7.Y(str2);
                    if (Y != null) {
                        rVar = Y.a(this);
                    }
                    if (rVar != null && !rVar.F.isEmpty()) {
                        Iterator it = rVar.F.iterator();
                        it.getClass();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                if (v.a0(((j0) next).q, file.getAbsolutePath(), true)) {
                                    if (i > -1) {
                                        x0Var.g = i;
                                        x0Var.notifyItemChanged(i);
                                    }
                                }
                            }
                        }
                    }
                } else if (obj instanceof v0) {
                    p2 p2Var = ((v0) obj).f10231b;
                    r rVar2 = p2Var.s;
                    if (rVar2 != null) {
                        arrayList = rVar2.F;
                    }
                    if (arrayList != null) {
                        rVar2.getClass();
                        if (!rVar2.F.isEmpty()) {
                            r rVar3 = p2Var.s;
                            rVar3.getClass();
                            Iterator it2 = rVar3.F.iterator();
                            it2.getClass();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (v.a0(((j0) next2).q, file.getAbsolutePath(), true)) {
                                        if (i > -1) {
                                            x0Var.g = i;
                                            x0Var.notifyItemChanged(i);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i = i3;
            }
            f7.d();
            int i8 = x0Var.g;
            if (i8 >= 0) {
                x0Var.notifyItemChanged(i8);
            }
        }
    }

    @Override // o4.b0
    public final boolean q0() {
        return false;
    }

    @Override // o4.j4
    public final void y0(String str, ArrayList arrayList) {
        str.getClass();
        String string = getString(R.string.msg_warning_incompatible_required_features_to_install);
        string.getClass();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        j8.e eVar = p0.f3588a;
        f0.z(lifecycleScope, h8.n.f6148a, null, new q(this, str, string, arrayList, null, 12), 2);
    }
}

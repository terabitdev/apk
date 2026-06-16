package com.uptodown.activities;

import a3.i;
import a5.i0;
import a5.m;
import a5.o;
import a5.w;
import a6.d;
import a6.h;
import a6.j;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SwitchCompat;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.x;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import c7.z;
import c8.f0;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.gcm.MyFirebaseMessagingService;
import com.uptodown.tv.ui.activity.TvMainActivity;
import com.uptodown.views.ScrollableTextView;
import h5.d1;
import h5.k2;
import h5.l0;
import h5.q1;
import h5.r1;
import h5.x1;
import h7.a;
import h8.n;
import i7.c;
import j$.util.concurrent.ConcurrentHashMap;
import j8.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.t;
import k5.d0;
import k5.d3;
import k5.g;
import k5.k;
import k5.m2;
import k5.r;
import k5.t2;
import k5.u0;
import kotlin.jvm.internal.p;
import m4.e0;
import o4.a0;
import o4.a3;
import o4.b;
import o4.b1;
import o4.b3;
import o4.c3;
import o4.f3;
import o4.g3;
import o4.h2;
import o4.l;
import o4.n2;
import o4.p2;
import o4.q2;
import o4.r2;
import o4.s2;
import o4.u2;
import o4.v2;
import o4.w2;
import o4.x2;
import o4.y2;
import o4.z2;
import w5.f;
import w5.q;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MainActivity extends h2 {
    public static int G0;
    public final ActivityResultLauncher A0;
    public final ActivityResultLauncher B0;
    public final ActivityResultLauncher C0;
    public final ActivityResultLauncher D0;
    public final b E0;
    public final ActivityResultLauncher F0;
    public RelativeLayout S;
    public int T;
    public boolean V;
    public RelativeLayout W;
    public RelativeLayout X;
    public AppBarLayout Y;
    public SwitchCompat Z;

    /* renamed from: a0, reason: collision with root package name */
    public SwitchCompat f4388a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f4389b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4390c0;

    /* renamed from: d0, reason: collision with root package name */
    public g f4391d0;

    /* renamed from: e0, reason: collision with root package name */
    public g f4392e0;

    /* renamed from: g0, reason: collision with root package name */
    public int f4394g0;
    public ViewPager2 h0;

    /* renamed from: i0, reason: collision with root package name */
    public RelativeLayout f4395i0;

    /* renamed from: j0, reason: collision with root package name */
    public RelativeLayout f4396j0;

    /* renamed from: k0, reason: collision with root package name */
    public ProgressBar f4397k0;

    /* renamed from: l0, reason: collision with root package name */
    public TabLayout f4398l0;
    public r1 m0;

    /* renamed from: n0, reason: collision with root package name */
    public d1 f4399n0;

    /* renamed from: o0, reason: collision with root package name */
    public x1 f4400o0;

    /* renamed from: p0, reason: collision with root package name */
    public q1 f4401p0;

    /* renamed from: t0, reason: collision with root package name */
    public FrameLayout f4405t0;

    /* renamed from: u0, reason: collision with root package name */
    public t f4406u0;

    /* renamed from: v0, reason: collision with root package name */
    public FrameLayout f4407v0;

    /* renamed from: w0, reason: collision with root package name */
    public ImageView f4408w0;

    /* renamed from: x0, reason: collision with root package name */
    public ImageView f4409x0;

    /* renamed from: y0, reason: collision with root package name */
    public r2 f4410y0;
    public d z0;
    public final ArrayList U = new ArrayList();

    /* renamed from: f0, reason: collision with root package name */
    public final Handler f4393f0 = new Handler(Looper.getMainLooper());

    /* renamed from: q0, reason: collision with root package name */
    public final ArrayList f4402q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f4403r0 = new ArrayList();

    /* renamed from: s0, reason: collision with root package name */
    public long f4404s0 = -1;

    public MainActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new p2(0, this));
        registerForActivityResult.getClass();
        this.A0 = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new p2(1, this));
        registerForActivityResult2.getClass();
        this.B0 = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new p2(2, this));
        registerForActivityResult3.getClass();
        this.C0 = registerForActivityResult3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new p2(3, this));
        registerForActivityResult4.getClass();
        this.D0 = registerForActivityResult4;
        this.E0 = new b(this, 3);
        ActivityResultLauncher registerForActivityResult5 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new p2(4, this));
        registerForActivityResult5.getClass();
        this.F0 = registerForActivityResult5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        if (c8.f0.K(r13, r1, r0) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0067, code lost:
    
        if (r13 != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0054, code lost:
    
        if (r13 == r6) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F0(MainActivity mainActivity, c cVar) {
        x2 x2Var;
        int i;
        if (cVar instanceof x2) {
            x2Var = (x2) cVar;
            int i3 = x2Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x2Var.l = i3 - Integer.MIN_VALUE;
                Object obj = x2Var.f9229a;
                i = x2Var.l;
                int i8 = 3;
                int i10 = 1;
                g7.c cVar2 = null;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c7.a.e(obj);
                                return Boolean.TRUE;
                            }
                            b.d.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c7.a.e(obj);
                        m2 m2Var = (m2) obj;
                        if (m2Var == null) {
                            return Boolean.FALSE;
                        }
                        String str = m2Var.f7445e;
                        mainActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity);
                        int i11 = 0;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.dialog_system_message, (ViewGroup) null, false);
                        int i12 = R.id.tv_body;
                        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_body);
                        if (textView != null) {
                            i12 = R.id.tv_ok;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_ok);
                            if (textView2 != null) {
                                i12 = R.id.tv_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_title);
                                if (textView3 != null) {
                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                    textView3.setTypeface(s4.c.u);
                                    textView3.setText(m2Var.f7442b);
                                    textView.setTypeface(s4.c.v);
                                    textView.setText(m2Var.f7443c);
                                    String str2 = m2Var.f7444d;
                                    if (str2 != null && str2.length() != 0) {
                                        textView2.setTypeface(s4.c.u);
                                        if (str != null && str.length() != 0) {
                                            textView2.setText(str);
                                        }
                                        textView2.setOnClickListener(new j(29, mainActivity, m2Var));
                                    } else {
                                        textView2.setVisibility(8);
                                    }
                                    builder.setView(linearLayout);
                                    mainActivity.F = builder.create();
                                    if (!mainActivity.isFinishing() && mainActivity.F != null) {
                                        e eVar = p0.f3588a;
                                        d8.c cVar3 = n.f6148a;
                                        y2 y2Var = new y2(mainActivity, cVar2, i11);
                                        x2Var.l = 3;
                                    }
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        o2.a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
                        return null;
                    }
                    c7.a.e(obj);
                } else {
                    c7.a.e(obj);
                    x2Var.l = 1;
                    e eVar2 = p0.f3588a;
                    Object K = f0.K(j8.d.f7053a, new y2(mainActivity, cVar2, i10), x2Var);
                    if (K != aVar) {
                        K = z.f3538a;
                    }
                }
                x2Var.l = 2;
                e eVar3 = p0.f3588a;
                obj = f0.K(j8.d.f7053a, new y2(mainActivity, cVar2, i8), x2Var);
            }
        }
        x2Var = new x2(mainActivity, cVar);
        Object obj2 = x2Var.f9229a;
        i = x2Var.l;
        int i82 = 3;
        int i102 = 1;
        g7.c cVar22 = null;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        x2Var.l = 2;
        e eVar32 = p0.f3588a;
        obj2 = f0.K(j8.d.f7053a, new y2(mainActivity, cVar22, i82), x2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G0(MainActivity mainActivity, c cVar) {
        z2 z2Var;
        int i;
        g7.c cVar2;
        MainActivity mainActivity2;
        int i3;
        if (cVar instanceof z2) {
            z2Var = (z2) cVar;
            int i8 = z2Var.m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                z2Var.m = i8 - Integer.MIN_VALUE;
                Object obj = z2Var.f9291b;
                i = z2Var.m;
                cVar2 = null;
                boolean z10 = true;
                if (i == 0) {
                    if (i == 1) {
                        mainActivity2 = z2Var.f9290a;
                        c7.a.e(obj);
                    } else {
                        b.d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    c7.a.e(obj);
                    w5.g f7 = w5.g.D.f(mainActivity);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    i0 i0Var = new i0(f7, cVar2, 18);
                    z2Var.f9290a = mainActivity;
                    z2Var.m = 1;
                    obj = f0.K(dVar, i0Var, z2Var);
                    a aVar = a.f6117a;
                    if (obj == aVar) {
                        return aVar;
                    }
                    mainActivity2 = mainActivity;
                }
                ArrayList arrayList = (ArrayList) obj;
                mainActivity2.getClass();
                arrayList.getClass();
                mainActivity2.J = arrayList;
                i3 = 0;
                while (!mainActivity.J.isEmpty() && i3 < 2) {
                    Object remove = mainActivity.J.remove(0);
                    remove.getClass();
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(mainActivity);
                    e eVar2 = p0.f3588a;
                    f0.z(lifecycleScope, n.f6148a, null, new m(mainActivity, (k5.x1) remove, cVar2, 26), 2);
                    i3++;
                }
                if (i3 <= 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }
        z2Var = new z2(mainActivity, cVar);
        Object obj2 = z2Var.f9291b;
        i = z2Var.m;
        cVar2 = null;
        boolean z102 = true;
        if (i == 0) {
        }
        ArrayList arrayList2 = (ArrayList) obj2;
        mainActivity2.getClass();
        arrayList2.getClass();
        mainActivity2.J = arrayList2;
        i3 = 0;
        while (!mainActivity.J.isEmpty()) {
            Object remove2 = mainActivity.J.remove(0);
            remove2.getClass();
            LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(mainActivity);
            e eVar22 = p0.f3588a;
            f0.z(lifecycleScope2, n.f6148a, null, new m(mainActivity, (k5.x1) remove2, cVar2, 26), 2);
            i3++;
        }
        if (i3 <= 0) {
        }
        return Boolean.valueOf(z102);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H0(MainActivity mainActivity, c cVar) {
        a3 a3Var;
        int i;
        ArrayList arrayList;
        if (cVar instanceof a3) {
            a3Var = (a3) cVar;
            int i3 = a3Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a3Var.m = i3 - Integer.MIN_VALUE;
                Object obj = a3Var.f8510b;
                i = a3Var.m;
                g7.c cVar2 = null;
                if (i == 0) {
                    if (i == 1) {
                        arrayList = a3Var.f8509a;
                        c7.a.e(obj);
                    } else {
                        b.d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ArrayList r = x.r(obj);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    m mVar = new m(mainActivity, r, cVar2, 28);
                    a3Var.f8509a = r;
                    a3Var.m = 1;
                    Object K = f0.K(dVar, mVar, a3Var);
                    a aVar = a.f6117a;
                    if (K == aVar) {
                        return aVar;
                    }
                    arrayList = r;
                }
                if (arrayList.isEmpty()) {
                    if (arrayList.size() == 1) {
                        if (UptodownApp.f4380e0 == null) {
                            k kVar = new k();
                            UptodownApp.f4380e0 = kVar;
                            kVar.f7422c = ((g) arrayList.get(0)).F;
                        }
                        Object obj2 = arrayList.get(0);
                        obj2.getClass();
                        mainActivity.u1((g) obj2);
                    } else {
                        mainActivity.n1(arrayList);
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }
        a3Var = new a3(mainActivity, cVar);
        Object obj3 = a3Var.f8510b;
        i = a3Var.m;
        g7.c cVar22 = null;
        if (i == 0) {
        }
        if (arrayList.isEmpty()) {
        }
    }

    public static final boolean I0(MainActivity mainActivity) {
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv_title_auto_update);
        if ((textView == null || textView.getVisibility() != 0) && !mainActivity.X0()) {
            return true;
        }
        return false;
    }

    public static final void J0(MainActivity mainActivity, String str) {
        Bundle f7 = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
        a0 a0Var = mainActivity.E;
        if (a0Var != null) {
            a0Var.u(f7, "tab_clicked");
        }
    }

    public static final void K0(MainActivity mainActivity, g gVar) {
        int i;
        ArrayList arrayList = mainActivity.U;
        if (mainActivity.W != null && mainActivity.T == 0 && arrayList.size() == 1 && ((d3) arrayList.get(mainActivity.T)).f7336a == 1 && !mainActivity.X0()) {
            mainActivity.f4392e0 = gVar;
            mainActivity.f4391d0 = gVar;
            mainActivity.M0(mainActivity.b1(gVar), 2);
            String i3 = android.support.v4.media.session.m.i(((d3) arrayList.get(mainActivity.T)).f7336a, "wizard_step_", "_shown");
            SharedPreferences sharedPreferences = mainActivity.getSharedPreferences("SettingsPreferences", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(i3, true);
            edit.apply();
            int i8 = mainActivity.T;
            if (i8 >= 0 && i8 < mainActivity.U.size() - 1) {
                i = mainActivity.T + 1;
                mainActivity.T = i;
            } else {
                i = -1;
            }
            if (i >= 0 && i < arrayList.size()) {
                Object obj = arrayList.get(i);
                obj.getClass();
                mainActivity.m1((d3) obj);
                if (((d3) arrayList.get(mainActivity.T)).f7336a == 2 && ((d3) arrayList.get(0)).f7336a == 1) {
                    ((d3) arrayList.get(0)).a().removeAllViews();
                    arrayList.remove(0);
                    mainActivity.T = 0;
                }
            }
            RelativeLayout relativeLayout = mainActivity.W;
            relativeLayout.getClass();
            relativeLayout.setVisibility(0);
        } else if (mainActivity.Z0()) {
            mainActivity.f4392e0 = gVar;
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(gVar);
            mainActivity.n1(arrayList2);
        }
        RelativeLayout relativeLayout2 = mainActivity.X;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
    }

    public static final void L0(MainActivity mainActivity) {
        ArrayList arrayList = mainActivity.U;
        if (mainActivity.W != null && mainActivity.T == 0 && arrayList.size() == 1 && ((d3) arrayList.get(mainActivity.T)).f7336a == 1 && !mainActivity.X0()) {
            RelativeLayout relativeLayout = mainActivity.W;
            relativeLayout.getClass();
            relativeLayout.setVisibility(0);
            TextView textView = (TextView) mainActivity.findViewById(R.id.tv_accept_wizard_welcome);
            if (textView != null) {
                textView.setBackground(ContextCompat.getDrawable(mainActivity, R.drawable.selector_wizard_accept_button));
            }
            if (textView != null) {
                textView.setEnabled(true);
            }
            ProgressBar progressBar = (ProgressBar) mainActivity.findViewById(R.id.pb_wizard_deep_link);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            mainActivity.M0(mainActivity.d1(), 4);
            mainActivity.M0(mainActivity.c1(), 5);
        }
        RelativeLayout relativeLayout2 = mainActivity.X;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
    }

    public final void E0() {
        if (!s7.a.v(this, "gdpr_requested", false)) {
            s7.a.M(this, "gdpr_requested", true);
            s7.a.M(this, "gdpr_analytics_allowed", true);
            s7.a.M(this, "gdpr_crashlytics_allowed", true);
            s7.a.M(this, "gdpr_tracking_allowed", true);
            float f7 = UptodownApp.G;
            n4.e.D(this);
            this.E = new a0(this, 22);
        }
        this.E = new a0(this, 22);
        if (!s7.a.v(this, "gdpr_tracking_allowed", false)) {
            w5.c.a(this.F, this);
            return;
        }
        this.f4394g0 = 0;
        r2 r2Var = new r2(1, this);
        this.f4410y0 = r2Var;
        this.f4393f0.postDelayed(r2Var, 2000L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k5.d3] */
    public final void M0(RelativeLayout relativeLayout, int i) {
        ?? obj = new Object();
        obj.f7336a = i;
        obj.f7337b = relativeLayout;
        this.U.add(obj);
    }

    public final void N0() {
        int i;
        if (!this.V) {
            ArrayList arrayList = this.U;
            if (!arrayList.isEmpty() && (i = this.T) >= 0) {
                RelativeLayout a10 = ((d3) arrayList.get(i)).a();
                u2 u2Var = new u2(0, this);
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_back_out);
                float f7 = UptodownApp.G;
                boolean z10 = true;
                try {
                    SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                    if (sharedPreferences.contains("animations")) {
                        z10 = sharedPreferences.getBoolean("animations", true);
                    }
                } catch (Exception unused) {
                }
                if (z10) {
                    float f10 = UptodownApp.G;
                    loadAnimation.setAnimationListener(u2Var);
                    a10.startAnimation(loadAnimation);
                    return;
                }
                u2Var.onAnimationEnd(loadAnimation);
            }
        }
    }

    public final void O0() {
        int i = this.T;
        ArrayList arrayList = this.U;
        String i3 = android.support.v4.media.session.m.i(((d3) arrayList.get(i)).f7336a, "wizard_step_", "_shown");
        SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        boolean z10 = true;
        z10 = true;
        edit.putBoolean(i3, true);
        edit.apply();
        RelativeLayout a10 = ((d3) arrayList.get(this.T)).a();
        u2 u2Var = new u2(z10 ? 1 : 0, this);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_next_out);
        float f7 = UptodownApp.G;
        try {
            SharedPreferences sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences2.contains("animations")) {
                z10 = sharedPreferences2.getBoolean("animations", true);
            }
        } catch (Exception unused) {
        }
        if (z10) {
            float f10 = UptodownApp.G;
            loadAnimation.setAnimationListener(u2Var);
            a10.startAnimation(loadAnimation);
            return;
        }
        u2Var.onAnimationEnd(loadAnimation);
    }

    public final void P0(g gVar, boolean z10) {
        l0 l0Var = new l0();
        Bundle bundle = new Bundle();
        if (gVar != null) {
            bundle.putParcelable("appInfo", gVar);
        }
        l0Var.setArguments(bundle);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.getClass();
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.replace(R.id.rl_main_scrollable, l0Var);
                beginTransaction.addToBackStack(null);
                if (z10) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    beginTransaction.commitAllowingStateLoss();
                    return;
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                String string = getString(R.string.error_generico);
                string.getClass();
                A(string);
                return;
            }
        }
        String string2 = getString(R.string.error_generico);
        string2.getClass();
        A(string2);
    }

    public final void Q0(int i) {
        TabLayout tabLayout = this.f4398l0;
        tabLayout.getClass();
        if (i < tabLayout.getTabCount()) {
            TabLayout tabLayout2 = this.f4398l0;
            tabLayout2.getClass();
            if (tabLayout2.getSelectedTabPosition() != i) {
                TabLayout tabLayout3 = this.f4398l0;
                tabLayout3.getClass();
                TabLayout.Tab tabAt = tabLayout3.getTabAt(i);
                if (tabAt != null) {
                    tabAt.select();
                }
            }
        }
    }

    public final void R0() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f4389b0 > 60000) {
            this.f4389b0 = currentTimeMillis;
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = p0.f3588a;
            f0.z(lifecycleScope, j8.d.f7053a, null, new v2(this, null, 0), 2);
        }
    }

    public final void S0() {
        t tVar;
        FrameLayout frameLayout = this.f4405t0;
        if (frameLayout != null && frameLayout.getChildCount() != 0 && (tVar = this.f4406u0) != null) {
            tVar.getClass();
            RelativeLayout relativeLayout = (RelativeLayout) tVar.f7247b;
            relativeLayout.getClass();
            u2 u2Var = new u2(2, this);
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out_bottom);
            float f7 = UptodownApp.G;
            boolean z10 = true;
            try {
                SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("animations")) {
                    z10 = sharedPreferences.getBoolean("animations", true);
                }
            } catch (Exception unused) {
            }
            if (z10) {
                float f10 = UptodownApp.G;
                loadAnimation.setAnimationListener(u2Var);
                relativeLayout.startAnimation(loadAnimation);
                return;
            }
            u2Var.onAnimationEnd(loadAnimation);
        }
    }

    public final void T0() {
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog alertDialog2 = this.F;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            w d10 = w.d(getLayoutInflater());
            TextView textView = (TextView) d10.m;
            TextView textView2 = (TextView) d10.o;
            TextView textView3 = (TextView) d10.f185n;
            textView3.setTypeface(s4.c.v);
            textView3.setText(getString(R.string.notification_permission_request));
            textView2.setTypeface(s4.c.u);
            textView2.setOnClickListener(new o4.m2(0, this));
            textView.setTypeface(s4.c.u);
            textView.setOnClickListener(new o4.m2(5, this));
            builder.setView((LinearLayout) d10.f184b);
            builder.setCancelable(true);
            this.F = builder.create();
            if (!isFinishing() && (alertDialog = this.F) != null) {
                Window window = alertDialog.getWindow();
                if (window != null) {
                    android.support.v4.media.session.m.z(window, 0);
                }
                AlertDialog alertDialog3 = this.F;
                alertDialog3.getClass();
                alertDialog3.show();
            }
        }
    }

    public final Fragment U0() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            fragments.getClass();
            return (Fragment) d7.t.G0(fragments);
        }
        ArrayList arrayList = this.f4402q0;
        if (!arrayList.isEmpty()) {
            return (Fragment) d7.t.G0(arrayList);
        }
        return null;
    }

    public final void V0() {
        FrameLayout frameLayout = this.f4407v0;
        if (frameLayout != null && frameLayout.getChildCount() != 0) {
            FrameLayout frameLayout2 = this.f4407v0;
            frameLayout2.getClass();
            u2 u2Var = new u2(3, this);
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.popup_turbo_out);
            float f7 = UptodownApp.G;
            boolean z10 = true;
            try {
                SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("animations")) {
                    z10 = sharedPreferences.getBoolean("animations", true);
                }
            } catch (Exception unused) {
            }
            if (z10) {
                float f10 = UptodownApp.G;
                loadAnimation.setAnimationListener(u2Var);
                frameLayout2.startAnimation(loadAnimation);
                return;
            }
            u2Var.onAnimationEnd(loadAnimation);
        }
    }

    public final void W0() {
        S0();
        V0();
    }

    public final boolean X0() {
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y0() {
        r rVar;
        File file;
        boolean z10;
        r rVar2;
        SharedPreferences sharedPreferences;
        w5.g f7 = w5.g.D.f(this);
        f7.b();
        String packageName = getPackageName();
        packageName.getClass();
        k5.p2 Y = f7.Y(packageName);
        g7.c cVar = null;
        if (Y != null) {
            rVar = Y.a(this);
        } else {
            rVar = null;
        }
        if (rVar != null && rVar.c()) {
            file = rVar.g();
        } else {
            file = null;
        }
        f7.d();
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences.contains("is_status_code_526")) {
            z10 = sharedPreferences.getBoolean("is_status_code_526", false);
            int i = 1;
            if (!z10) {
                setContentView(R.layout.status_526);
                TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
                textView.setTypeface(s4.c.v);
                ConcurrentHashMap concurrentHashMap = q.f11211a;
                textView.setText(q.a(getString(R.string.msg_update_app_status_526)));
                TextView textView2 = (TextView) findViewById(R.id.tv_update_status_526);
                textView2.setTypeface(s4.c.v);
                textView2.setOnClickListener(new o4.m2(6, this));
                return true;
            }
            if (file == null) {
                return false;
            }
            w5.g f10 = w5.g.D.f(this);
            f10.b();
            String packageName2 = getPackageName();
            packageName2.getClass();
            k5.p2 Y2 = f10.Y(packageName2);
            f10.d();
            if (Y2 != null && 731 < Y2.l && (rVar2 = Y2.s) != null && rVar2.c()) {
                setContentView(R.layout.dialog_auto_update);
                ((TextView) findViewById(R.id.tv_title_auto_update)).setTypeface(s4.c.u);
                ((TextView) findViewById(R.id.tv_desc_auto_update)).setTypeface(s4.c.v);
                ((TextView) findViewById(R.id.tv_info_auto_update)).setTypeface(s4.c.v);
                TextView textView3 = (TextView) findViewById(R.id.tv_installed_version_auto_update);
                textView3.setTypeface(s4.c.v);
                PackageManager packageManager = getPackageManager();
                packageManager.getClass();
                String packageName3 = getPackageName();
                packageName3.getClass();
                textView3.setText(getString(R.string.autoupdate_installed_version, o.e(packageManager, packageName3, 0).versionName));
                TextView textView4 = (TextView) findViewById(R.id.tv_update_version_auto_update);
                textView4.setTypeface(s4.c.u);
                textView4.setText(getString(R.string.autoupdate_update_version, Y2.m));
                TextView textView5 = (TextView) findViewById(R.id.tv_update_size_auto_update);
                textView5.setTypeface(s4.c.v);
                r rVar3 = Y2.s;
                if (rVar3 != null) {
                    textView5.setText(getString(R.string.autoupdate_update_size, a4.x(this, rVar3.k())));
                }
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_uptodown_version_details);
                ((TextView) findViewById(R.id.tv_uptodown_version_details_label)).setTypeface(s4.c.v);
                ImageView imageView = (ImageView) findViewById(R.id.iv_uptodown_version_details_label);
                TextView textView6 = (TextView) findViewById(R.id.tv_uptodown_version_details);
                textView6.setTypeface(s4.c.v);
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                e eVar = p0.f3588a;
                f0.z(lifecycleScope, j8.d.f7053a, null, new b.n(this, Y2, textView6, cVar, 7), 2);
                relativeLayout.setOnClickListener(new j(28, textView6, imageView));
                ((TextView) findViewById(R.id.tv_update)).setTypeface(s4.c.u);
                ((RelativeLayout) findViewById(R.id.rl_update)).setOnClickListener(new o4.m2(i, this));
                ((TextView) findViewById(R.id.tv_cancel)).setTypeface(s4.c.u);
                ((RelativeLayout) findViewById(R.id.rl_cancel)).setOnClickListener(new o4.m2(2, this));
            }
            return true;
        }
        z10 = false;
        int i3 = 1;
        if (!z10) {
        }
    }

    public final boolean Z0() {
        RelativeLayout relativeLayout = this.X;
        if (relativeLayout != null) {
            relativeLayout.getClass();
            if (relativeLayout.getVisibility() == 0) {
                return true;
            }
        }
        RelativeLayout relativeLayout2 = this.W;
        if (relativeLayout2 != null) {
            relativeLayout2.getClass();
            if (relativeLayout2.getVisibility() == 0) {
                RelativeLayout relativeLayout3 = this.W;
                relativeLayout3.getClass();
                if (relativeLayout3.getChildCount() != 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        r a10 = d0Var.a();
        if (a10 != null) {
            int c10 = d0Var.c();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = p0.f3588a;
            f0.z(lifecycleScope, n.f6148a, null, new b3(c10, this, a10, (g7.c) null), 2);
        }
    }

    public final RelativeLayout a1() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_continue, (ViewGroup) this.W, false);
        inflate.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ((TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_continue)).setTypeface(s4.c.v);
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_continue)).setTypeface(s4.c.u);
        ((TextView) relativeLayout.findViewById(R.id.tv_continue_to_wizard_continue)).setTypeface(s4.c.v);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_next_wizard_continue);
        textView.setTypeface(s4.c.u);
        textView.setOnClickListener(new o4.m2(28, this));
        return relativeLayout;
    }

    public final RelativeLayout b1(g gVar) {
        int i = 0;
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_deep_link, (ViewGroup) this.W, false);
        inflate.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_header_feature_wizard_deep_link);
        ImageView imageView2 = (ImageView) relativeLayout.findViewById(R.id.iv_logo_wizard_deep_link);
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_info_wizard_deep_link);
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.ll_options_wizard_welcome);
        e0 e10 = m4.a0.d().e(gVar.h());
        float f7 = UptodownApp.G;
        e10.h(n4.e.v(this));
        e10.e(imageView2, null);
        m4.a0.d().e(gVar.e()).e(imageView, new i(relativeLayout2, linearLayout, this, 22));
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_name_app_wizard_deep_link);
        textView.setTypeface(s4.c.v);
        int i3 = f.l;
        String string = getString(R.string.wizard_deep_link_download, gVar.f7358b);
        string.getClass();
        Typeface typeface = s4.c.u;
        typeface.getClass();
        Spanned fromHtml = HtmlCompat.fromHtml(string, 0);
        fromHtml.getClass();
        SpannableString spannableString = new SpannableString(fromHtml);
        c7.q e11 = p.e((StyleSpan[]) spannableString.getSpans(0, spannableString.length(), StyleSpan.class));
        while (e11.hasNext()) {
            StyleSpan styleSpan = (StyleSpan) e11.next();
            if (styleSpan.getStyle() == 1) {
                int spanStart = spannableString.getSpanStart(styleSpan);
                int spanEnd = spannableString.getSpanEnd(styleSpan);
                spannableString.removeSpan(styleSpan);
                spannableString.setSpan(new f(typeface, i), spanStart, spanEnd, 33);
            }
        }
        textView.setText(spannableString);
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_deep_link)).setTypeface(s4.c.u);
        ((TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_deep_link)).setTypeface(s4.c.v);
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_deep_link)).setTypeface(s4.c.u);
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_deep_link)).setOnClickListener(new o4.m2(3, this));
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_deep_link)).setTypeface(s4.c.u);
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_deep_link)).setOnClickListener(new o4.m2(4, this));
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_deep_link);
        textView2.setTypeface(s4.c.u);
        textView2.setOnClickListener(new n2(this, gVar, textView2, relativeLayout, 0));
        Bundle bundle = new Bundle();
        bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "detected");
        bundle.putString("source", "wizard");
        k kVar = UptodownApp.f4380e0;
        if (kVar != null && kVar.f7424e > 0) {
            bundle.putString(TypedValues.TransitionType.S_FROM, "fingerprint");
        } else {
            bundle.putString(TypedValues.TransitionType.S_FROM, "downloadFile");
        }
        bundle.putString("appId", String.valueOf(gVar.f7356a));
        bundle.putString("fileId", String.valueOf(gVar.J));
        new a0(this, 22).u(bundle, "deeplink");
        return relativeLayout;
    }

    @Override // o4.b0
    public final void c0(u0 u0Var) {
        h hVar;
        h hVar2;
        u0Var.getClass();
        if (u0Var instanceof k5.l0) {
            r1();
        }
        if (u0Var.a() != null && (hVar = this.L) != null) {
            hVar.getClass();
            String str = hVar.f206a.F;
            r a10 = u0Var.a();
            a10.getClass();
            if (v.a0(str, a10.f7495b, true) && (hVar2 = this.L) != null) {
                r a11 = u0Var.a();
                a11.getClass();
                hVar2.i(a11, u0Var.c(), this);
            }
        }
    }

    public final RelativeLayout c1() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_login, (ViewGroup) this.W, false);
        inflate.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wl);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(s4.c.u);
        }
        ((TextView) relativeLayout.findViewById(R.id.tv_title_wl)).setTypeface(s4.c.u);
        RelativeLayout relativeLayout3 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_login_google_wl);
        float f7 = UptodownApp.G;
        ((TextView) relativeLayout.findViewById(R.id.tv_login_google_wl)).setTypeface(s4.c.u);
        relativeLayout3.setOnClickListener(new o4.m2(7, this));
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_login_email_wl);
        textView.setTypeface(s4.c.u);
        textView.setOnClickListener(new o4.m2(8, this));
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setTypeface(s4.c.v);
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setOnClickListener(new o4.m2(9, this));
        return relativeLayout;
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

    public final RelativeLayout d1() {
        boolean z10;
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_permissions, (ViewGroup) this.W, false);
        inflate.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wp);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(s4.c.u);
        }
        ((TextView) relativeLayout.findViewById(R.id.tv_title_wp)).setTypeface(s4.c.u);
        RelativeLayout relativeLayout3 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_notifications_wp);
        if (Build.VERSION.SDK_INT >= 33) {
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_title_wp)).setTypeface(s4.c.u);
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_msg_wp)).setTypeface(s4.c.v);
            SwitchCompat switchCompat = (SwitchCompat) relativeLayout.findViewById(R.id.sc_notifications_wp);
            this.f4388a0 = switchCompat;
            switchCompat.getClass();
            if (ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            switchCompat.setChecked(z10);
            SwitchCompat switchCompat2 = this.f4388a0;
            switchCompat2.getClass();
            switchCompat2.setClickable(false);
            relativeLayout3.setOnClickListener(new o4.m2(17, this));
        } else if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_unknown_sources_wp);
        ((ScrollableTextView) relativeLayout.findViewById(R.id.tv_unknown_sources_title_wp)).setTypeface(s4.c.u);
        ((TextView) relativeLayout.findViewById(R.id.tv_unknown_sources_badge_wp)).setTypeface(s4.c.u);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_unknown_sources_msg_wp);
        textView.setText(getString(R.string.msg_install_from_unknown_source, getString(R.string.app_name)));
        textView.setTypeface(s4.c.v);
        SwitchCompat switchCompat3 = (SwitchCompat) relativeLayout.findViewById(R.id.sc_unknown_sources_wp);
        this.Z = switchCompat3;
        switchCompat3.getClass();
        switchCompat3.setChecked(m());
        SwitchCompat switchCompat4 = this.Z;
        switchCompat4.getClass();
        switchCompat4.setClickable(false);
        relativeLayout4.setOnClickListener(new o4.m2(19, this));
        relativeLayout3.getClass();
        if (relativeLayout3.getVisibility() == 8) {
            relativeLayout.findViewById(R.id.v_unknown_sources_separator).setVisibility(4);
        }
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_next_wp);
        textView2.setTypeface(s4.c.u);
        textView2.setOnClickListener(new o4.m2(20, this));
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_back_wp);
        textView3.setTypeface(s4.c.u);
        textView3.setOnClickListener(new o4.m2(21, this));
        return relativeLayout;
    }

    @Override // o4.b0
    public final void e0(String str, String str2) {
        h hVar;
        if (str != null) {
            Fragment U0 = U0();
            if (U0 instanceof l0) {
                ((l0) U0).x0(str);
            }
            h hVar2 = this.L;
            if (hVar2 != null && v.a0(hVar2.f206a.F, str, true) && (hVar = this.L) != null) {
                hVar.b(this);
            }
        }
    }

    public final RelativeLayout e1() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_welcome, (ViewGroup) this.W, false);
        inflate.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ((TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_welcome)).setTypeface(s4.c.v);
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_welcome)).setTypeface(s4.c.u);
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_welcome)).setTypeface(s4.c.v);
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_welcome)).setTypeface(s4.c.u);
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_welcome)).setOnClickListener(new o4.m2(24, this));
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_welcome)).setTypeface(s4.c.u);
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_welcome)).setOnClickListener(new o4.m2(25, this));
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_welcome);
        textView.setTypeface(s4.c.u);
        textView.setEnabled(false);
        textView.setOnClickListener(new o4.m2(27, this));
        ProgressBar progressBar = (ProgressBar) relativeLayout.findViewById(R.id.pb_wizard_deep_link);
        if (this.f4390c0) {
            textView.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
            textView.setEnabled(true);
            progressBar.setVisibility(8);
            return relativeLayout;
        }
        progressBar.setVisibility(0);
        return relativeLayout;
    }

    public final void f1() {
        RelativeLayout relativeLayout;
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate((String) null, 1);
        }
        RelativeLayout relativeLayout2 = this.f4396j0;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0 && (relativeLayout = this.f4396j0) != null) {
            relativeLayout.setVisibility(8);
        }
        TabLayout tabLayout = this.f4398l0;
        if (tabLayout != null && tabLayout.getSelectedTabPosition() == 3) {
            return;
        }
        o1();
    }

    public final void g1() {
        boolean z10;
        boolean z11;
        if (!Z0()) {
            TabLayout tabLayout = this.f4398l0;
            boolean z12 = true;
            if (tabLayout != null && tabLayout.getSelectedTabPosition() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ViewPager2 viewPager2 = this.h0;
            if (viewPager2 == null || viewPager2.getCurrentItem() != 0) {
                z12 = false;
            }
            if (z10 && z11 && z12 && a4.f3693b) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                e eVar = p0.f3588a;
                f0.z(lifecycleScope, n.f6148a, null, new b3(this, null), 2);
            }
        }
    }

    @Override // o4.b0
    public final void h0(long j) {
        if (S()) {
            W0();
            if (j > 0) {
                if (this.f4404s0 == -1) {
                    this.f4404s0 = j;
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                    e eVar = p0.f3588a;
                    f0.z(lifecycleScope, n.f6148a, null, new o4.d3(this, j, null, 0), 2);
                    return;
                }
                return;
            }
            j0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h1() {
        boolean z10;
        SharedPreferences sharedPreferences;
        if (Z0()) {
            Iterator it = this.U.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                ((d3) next).a().removeAllViews();
            }
            RelativeLayout relativeLayout = this.W;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout2 = this.W;
            if (relativeLayout2 != null) {
                relativeLayout2.removeAllViews();
            }
            RelativeLayout relativeLayout3 = this.X;
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(8);
            }
            boolean D = s7.a.D(4, this);
            boolean D2 = s7.a.D(5, this);
            if (D && D2) {
                s7.a.M(this, "wizard_completed", true);
            }
            g gVar = this.f4392e0;
            g7.c cVar = null;
            this.f4392e0 = null;
            if (gVar != null) {
                if (gVar.k() && gVar.j()) {
                    u1(gVar);
                    return;
                }
                W0();
                int i = 0;
                try {
                    sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                if (sharedPreferences.contains("is_device_tracking_registered")) {
                    z10 = sharedPreferences.getBoolean("is_device_tracking_registered", false);
                    if (!z10) {
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                        e eVar = p0.f3588a;
                        f0.z(lifecycleScope, n.f6148a, null, new w2(this, gVar, cVar, i), 2);
                        return;
                    } else {
                        this.f4394g0 = 0;
                        d dVar = new d(24, this, gVar);
                        this.z0 = dVar;
                        this.f4393f0.postDelayed(dVar, 2000L);
                        return;
                    }
                }
                z10 = false;
                if (!z10) {
                }
            } else {
                g1();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i1() {
        boolean z10;
        int i;
        SharedPreferences sharedPreferences;
        h1();
        if (!Y0()) {
            if (!isFinishing() && this.W != null) {
                try {
                    sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                if (sharedPreferences.contains("wizard_completed")) {
                    z10 = sharedPreferences.getBoolean("wizard_completed", false);
                    if (!z10) {
                        RelativeLayout relativeLayout = this.W;
                        relativeLayout.getClass();
                        relativeLayout.setVisibility(0);
                        RelativeLayout relativeLayout2 = this.W;
                        relativeLayout2.getClass();
                        relativeLayout2.setOnClickListener(new h5.o(8));
                        ArrayList arrayList = this.U;
                        Iterator it = arrayList.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            d3 d3Var = (d3) next;
                            int i3 = d3Var.f7336a;
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 != 3) {
                                        if (i3 != 4) {
                                            if (i3 == 5) {
                                                d3Var.f7337b = c1();
                                            }
                                        } else {
                                            d3Var.f7337b = d1();
                                        }
                                    } else {
                                        d3Var.f7337b = a1();
                                    }
                                } else {
                                    g gVar = this.f4391d0;
                                    if (gVar != null) {
                                        d3Var.f7337b = b1(gVar);
                                    }
                                }
                            } else {
                                d3Var.f7337b = e1();
                            }
                        }
                        if (!arrayList.isEmpty() && (i = this.T) >= 0 && i < arrayList.size()) {
                            Object obj = arrayList.get(this.T);
                            obj.getClass();
                            m1((d3) obj);
                        } else {
                            h1();
                        }
                        j1();
                        r1();
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
            h1();
            j1();
            r1();
        }
    }

    public final void j1() {
        RelativeLayout relativeLayout = this.S;
        if (relativeLayout != null) {
            relativeLayout.getClass();
            u2 u2Var = new u2(4, this);
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);
            float f7 = UptodownApp.G;
            boolean z10 = true;
            try {
                SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("animations")) {
                    z10 = sharedPreferences.getBoolean("animations", true);
                }
            } catch (Exception unused) {
            }
            if (z10) {
                float f10 = UptodownApp.G;
                loadAnimation.setAnimationListener(u2Var);
                relativeLayout.startAnimation(loadAnimation);
                return;
            }
            u2Var.onAnimationEnd(loadAnimation);
        }
    }

    public final void k1() {
        ProgressBar progressBar = this.f4397k0;
        if (progressBar != null && progressBar.getVisibility() != 0) {
            ProgressBar progressBar2 = this.f4397k0;
            progressBar2.getClass();
            progressBar2.setVisibility(0);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = p0.f3588a;
            f0.z(lifecycleScope, j8.d.f7053a, null, new v2(this, null, 5), 2);
            x1 x1Var = this.f4400o0;
            if (x1Var != null) {
                x1Var.c();
            }
            r1 r1Var = this.m0;
            if (r1Var != null) {
                r1Var.p = false;
                r1Var.c();
            }
            d1 d1Var = this.f4399n0;
            if (d1Var != null) {
                d1Var.p = false;
                d1Var.c();
            }
        }
    }

    public final void l1() {
        long currentTimeMillis = (System.currentTimeMillis() - 86400000) + 3600000;
        SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("getLastTimePendingDialogShown", currentTimeMillis);
        edit.apply();
    }

    public final void m1(d3 d3Var) {
        String str;
        g gVar;
        RelativeLayout relativeLayout = this.W;
        relativeLayout.getClass();
        relativeLayout.removeAllViews();
        RelativeLayout relativeLayout2 = this.W;
        relativeLayout2.getClass();
        relativeLayout2.addView(d3Var.a());
        switch (d3Var.f7336a) {
            case 1:
                str = "welcome";
                break;
            case 2:
                str = "deeplink";
                break;
            case 3:
                str = "continue";
                break;
            case 4:
                str = "permissions";
                break;
            case 5:
                str = "login";
                break;
            case 6:
                str = "kill";
                break;
            default:
                str = "null";
                break;
        }
        Bundle f7 = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
        if (str.equals("deeplink") && (gVar = this.f4391d0) != null) {
            long j = gVar.f7356a;
            if (j > 0) {
                f7.putString("appId", String.valueOf(j));
            }
        }
        a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.u(f7, "wizard");
        }
    }

    @Override // t4.g
    public final void n() {
        SwitchCompat switchCompat = this.f4388a0;
        if (switchCompat != null) {
            switchCompat.setChecked(false);
        }
        t1();
    }

    public final void n1(ArrayList arrayList) {
        AlertDialog alertDialog;
        if (!arrayList.isEmpty() && !Z0()) {
            AlertDialog alertDialog2 = this.F;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            int i = 0;
            View inflate = getLayoutInflater().inflate(R.layout.deep_links_availables_popup, (ViewGroup) null, false);
            int i3 = R.id.ll_content_deep_link_availables;
            if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_content_deep_link_availables)) != null) {
                i3 = R.id.ll_deep_link_availables;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_deep_link_availables);
                if (linearLayout != null) {
                    i3 = R.id.pb_loaging_deep_links;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(inflate, R.id.pb_loaging_deep_links);
                    if (progressBar != null) {
                        i3 = R.id.tv_cancel_deep_link_availables;
                        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_cancel_deep_link_availables);
                        if (textView != null) {
                            i3 = R.id.tv_download_deep_link_availables;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_download_deep_link_availables);
                            if (textView2 != null) {
                                i3 = R.id.tv_title_deep_link_availables;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_title_deep_link_availables);
                                if (textView3 != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                    textView3.setTypeface(s4.c.u);
                                    textView.setTypeface(s4.c.u);
                                    textView.setOnClickListener(new o4.m2(14, this));
                                    textView2.setTypeface(s4.c.u);
                                    textView2.setOnClickListener(new q2(i, this, arrayList));
                                    Iterator it = arrayList.iterator();
                                    it.getClass();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        next.getClass();
                                        g gVar = (g) next;
                                        progressBar.setVisibility(8);
                                        View inflate2 = getLayoutInflater().inflate(R.layout.deep_link_available_item, (ViewGroup) null, false);
                                        int i8 = R.id.iv_icon_deep_link_available;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate2, R.id.iv_icon_deep_link_available);
                                        if (imageView != null) {
                                            i8 = R.id.tv_name_deep_link_available;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate2, R.id.tv_name_deep_link_available);
                                            if (textView4 != null) {
                                                e0 e10 = m4.a0.d().e(gVar.i());
                                                float f7 = UptodownApp.G;
                                                e10.g(n4.e.g(this));
                                                e10.h(n4.e.v(this));
                                                e10.e(imageView, null);
                                                textView4.setTypeface(s4.c.v);
                                                textView4.setText(gVar.f7358b);
                                                linearLayout.addView((RelativeLayout) inflate2);
                                                Bundle bundle = new Bundle();
                                                bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "detected");
                                                bundle.putString("source", "dialog");
                                                k kVar = UptodownApp.f4380e0;
                                                if (kVar != null && kVar.f7424e > 0) {
                                                    String str = gVar.F;
                                                    kVar.getClass();
                                                    if (p.b(str, kVar.f7422c)) {
                                                        bundle.putString(TypedValues.TransitionType.S_FROM, "fingerprint");
                                                        bundle.putString("appId", String.valueOf(gVar.f7356a));
                                                        bundle.putString("fileId", String.valueOf(gVar.J));
                                                        new a0(this, 22).u(bundle, "deeplink");
                                                    }
                                                }
                                                bundle.putString(TypedValues.TransitionType.S_FROM, "downloadFile");
                                                bundle.putString("appId", String.valueOf(gVar.f7356a));
                                                bundle.putString("fileId", String.valueOf(gVar.J));
                                                new a0(this, 22).u(bundle, "deeplink");
                                            }
                                        }
                                        o2.a.h("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i8)));
                                        return;
                                    }
                                    builder.setView(relativeLayout);
                                    builder.setCancelable(true);
                                    this.F = builder.create();
                                    if (!isFinishing() && (alertDialog = this.F) != null) {
                                        Window window = alertDialog.getWindow();
                                        if (window != null) {
                                            android.support.v4.media.session.m.z(window, 0);
                                        }
                                        AlertDialog alertDialog3 = this.F;
                                        alertDialog3.getClass();
                                        alertDialog3.show();
                                        SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                                        sharedPreferences.getClass();
                                        SharedPreferences.Editor edit = sharedPreferences.edit();
                                        edit.putBoolean("welcome_popup_shown", true);
                                        edit.apply();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            o2.a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        }
    }

    @Override // t4.g
    public final void o() {
        SwitchCompat switchCompat = this.f4388a0;
        if (switchCompat != null) {
            switchCompat.setChecked(true);
        }
        t1();
    }

    public final void o1() {
        AppBarLayout appBarLayout = this.Y;
        appBarLayout.getClass();
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.Y;
        appBarLayout2.getClass();
        appBarLayout2.setExpanded(true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.jvm.internal.g0] */
    @Override // o4.h2, o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ViewPager2 viewPager2;
        String str;
        String str2;
        Bundle extras;
        String str3;
        String str4;
        Bundle extras2;
        Bundle extras3;
        super.onCreate(bundle);
        setContentView(R.layout.main);
        float f7 = UptodownApp.G;
        if (n4.e.m(this)) {
            startActivity(new Intent(this, (Class<?>) TvMainActivity.class));
            finish();
            return;
        }
        this.f4405t0 = (FrameLayout) findViewById(R.id.fl_sign_in_popup);
        this.f4407v0 = (FrameLayout) findViewById(R.id.fl_uptodown_turbo_popup);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_splash);
        this.S = relativeLayout;
        relativeLayout.getClass();
        relativeLayout.setOnClickListener(new h5.o(8));
        this.M = (RelativeLayout) findViewById(R.id.app_info_selected_popup);
        if (UptodownApp.f4379d0) {
            RelativeLayout relativeLayout2 = this.S;
            relativeLayout2.getClass();
            relativeLayout2.setVisibility(8);
        }
        this.W = (RelativeLayout) findViewById(R.id.rl_wizard);
        this.X = (RelativeLayout) findViewById(R.id.rl_wizard_placeholder);
        Q();
        this.Y = (AppBarLayout) findViewById(R.id.abl_toolbar);
        ((ImageView) findViewById(R.id.home_uptodown_logo)).setOnClickListener(new o4.m2(18, this));
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.rl_main_search_view);
        ((TextView) findViewById(R.id.tv_main_search_view)).setTypeface(s4.c.v);
        relativeLayout3.setOnClickListener(new o4.m2(26, this));
        int i = 4;
        ((ImageView) findViewById(R.id.home_uptodown_turbo)).setOnClickListener(new s2(i, this));
        s1();
        View view = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new v2(this, 0 == true ? 1 : 0, 3), 3);
        String z10 = s7.a.z(this, "app_id_after_kill");
        int i3 = 5;
        int i8 = 2;
        int i10 = 1;
        int i11 = 0;
        if (z10 != null) {
            g gVar = new g();
            gVar.f7356a = Long.parseLong(z10);
            v0(gVar);
            s7.a.S(this, "app_id_after_kill", null);
        } else if (!s7.a.v(this, "wizard_completed", false)) {
            s7.a.Q(System.currentTimeMillis(), this, "last_sign_in_request_timestamp");
            RelativeLayout relativeLayout4 = this.X;
            relativeLayout4.getClass();
            relativeLayout4.setOnClickListener(new h5.o(8));
            RelativeLayout relativeLayout5 = this.X;
            relativeLayout5.getClass();
            relativeLayout5.setVisibility(0);
            RelativeLayout relativeLayout6 = this.W;
            relativeLayout6.getClass();
            relativeLayout6.setVisibility(8);
            RelativeLayout relativeLayout7 = this.W;
            relativeLayout7.getClass();
            relativeLayout7.setOnClickListener(new h5.o(8));
            if (s7.a.D(1, this) && s7.a.v(this, "gdpr_requested", false)) {
                RelativeLayout relativeLayout8 = this.W;
                relativeLayout8.getClass();
                relativeLayout8.setVisibility(0);
                M0(a1(), 3);
                if (!s7.a.D(4, this)) {
                    M0(d1(), 4);
                }
                if (!s7.a.D(5, this)) {
                    if (t2.h(this) != null) {
                        s7.a.M(this, "wizard_step_5_shown", true);
                    } else {
                        M0(c1(), 5);
                    }
                }
            } else {
                M0(e1(), 1);
            }
            this.T = 0;
            Object obj = this.U.get(0);
            obj.getClass();
            m1((d3) obj);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = p0.f3588a;
            f0.z(lifecycleScope, j8.d.f7053a, null, new v2(this, objArr == true ? 1 : 0, i8), 2);
        }
        runOnUiThread(new r2(2, this));
        n4.e.D(this);
        if (!s7.a.v(this, "is_in_eea_checked", false)) {
            f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new v2(this, objArr7 == true ? 1 : 0, i), 3);
        }
        if (getIntent() != null) {
            Intent intent = getIntent();
            intent.getClass();
            if ((intent.getFlags() & 1048576) != 1048576) {
                Uri data = getIntent().getData();
                if (data != null) {
                    String uri = data.toString();
                    uri.getClass();
                    String b10 = a5.f.b(data, this);
                    ActivityResultLauncher activityResultLauncher = this.F0;
                    if (b10 != null && v.Y(b10, ".apk", false)) {
                        String y10 = z1.b.y(b10);
                        if (y10 != null) {
                            k kVar = new k();
                            kVar.f7422c = y10;
                            LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this);
                            e eVar2 = p0.f3588a;
                            f0.z(lifecycleScope2, n.f6148a, null, new f5.k(this, y10, kVar, objArr6 == true ? 1 : 0, 2), 2);
                        } else {
                            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                            intent2.setData(data);
                            activityResultLauncher.launch(intent2);
                        }
                    } else if (b10 != null && (v.Y(b10, ".xapk", true) || v.Y(b10, ".apks", true) || v.Y(b10, ".apkm", true) || v.Y(b10, ".zip", true))) {
                        Intent intent3 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                        intent3.setData(data);
                        activityResultLauncher.launch(intent3);
                    } else if (v.e0(uri, "https://dw.uptodown.com/dwn/", false)) {
                        f0.z(LifecycleOwnerKt.getLifecycleScope(this), j8.d.f7053a, null, new c3(this, uri, objArr5 == true ? 1 : 0, i11), 2);
                    } else if (z7.n.h0(uri, "preregister-available", false)) {
                        String queryParameter = data.getQueryParameter("appID");
                        if (queryParameter != null && queryParameter.length() != 0) {
                            try {
                                String queryParameter2 = data.getQueryParameter("appID");
                                queryParameter2.getClass();
                                h0(Long.parseLong(queryParameter2));
                            } catch (NumberFormatException e10) {
                                e10.printStackTrace();
                            }
                        }
                    } else if (!n4.e.m(this)) {
                        f0.z(LifecycleOwnerKt.getLifecycleScope(this), j8.d.f7053a, null, new c3(this, w5.c.d(data), objArr4 == true ? 1 : 0, i10), 2);
                    }
                }
                Intent intent4 = getIntent();
                if (intent4 != null && (extras3 = intent4.getExtras()) != null) {
                    str = extras3.getString("action");
                } else {
                    str = null;
                }
                if (str != null) {
                    int i12 = MyFirebaseMessagingService.r;
                    if (str.equalsIgnoreCase("notificationApp")) {
                        Intent intent5 = getIntent();
                        if (intent5 != null && (extras2 = intent5.getExtras()) != null) {
                            str3 = extras2.getString("appId");
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            ?? obj2 = new Object();
                            obj2.f7674a = -1L;
                            try {
                                obj2.f7674a = Long.parseLong(str3);
                            } catch (NumberFormatException e11) {
                                e11.printStackTrace();
                            }
                            if (obj2.f7674a > 0) {
                                Bundle extras4 = getIntent().getExtras();
                                if (extras4 != null) {
                                    str4 = extras4.getString("packageName");
                                } else {
                                    str4 = null;
                                }
                                long j = obj2.f7674a;
                                long currentTimeMillis = System.currentTimeMillis();
                                s7.a.Q(j, this, "fcm_app_id");
                                s7.a.S(this, "fcm_packagename", str4);
                                s7.a.O(this, -1, "fcm_download_id");
                                s7.a.Q(currentTimeMillis, this, "fcm_received_timestamp");
                                s7.a.Q(0L, this, "fcm_shown_timestamp");
                                f0.z(LifecycleOwnerKt.getLifecycleScope(this), n.f6148a, null, new m((Object) this, (Object) obj2, (g7.c) (objArr3 == true ? 1 : 0), 29), 2);
                            }
                        }
                    } else if (str.equalsIgnoreCase("campaign")) {
                        Intent intent6 = getIntent();
                        if (intent6 != null && (extras = intent6.getExtras()) != null) {
                            str2 = extras.getString("campaign");
                        } else {
                            str2 = null;
                        }
                        if (str2 != null && str2.equalsIgnoreCase("BlackFriday")) {
                            u0();
                        }
                    }
                } else {
                    k5.r1 B = z1.b.B(this);
                    if (B != null && B.f7506e <= 0) {
                        f0.z(LifecycleOwnerKt.getLifecycleScope(this), n.f6148a, null, new b3((Object) this, (Object) B, (g7.c) (objArr2 == true ? 1 : 0), i11), 2);
                    }
                }
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.E0);
        int i13 = 6;
        this.K = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new p2(i13, this));
        ViewPager2 viewPager22 = (ViewPager2) findViewById(R.id.view_pager);
        this.h0 = viewPager22;
        if (viewPager22 != null) {
            viewPager22.setOffscreenPageLimit(4);
        }
        ViewPager2 viewPager23 = this.h0;
        if (viewPager23 != null) {
            viewPager23.setUserInputEnabled(false);
        }
        this.f4398l0 = (TabLayout) findViewById(R.id.tabs);
        this.f4396j0 = (RelativeLayout) findViewById(R.id.rl_app_detail_open);
        ImageView imageView = (ImageView) findViewById(R.id.iv_avatar_user);
        this.f4408w0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new s2(i13, this));
        }
        ImageView imageView2 = this.f4408w0;
        if (imageView2 != null) {
            ViewParent parent = imageView2.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            }
            if (view != null) {
                view.post(new d(25, imageView2, this));
            }
        }
        this.f4409x0 = (ImageView) findViewById(R.id.iv_badge_user);
        g3 g3Var = new g3(this, getSupportFragmentManager(), getLifecycle());
        ViewPager2 viewPager24 = this.h0;
        if (viewPager24 != null) {
            viewPager24.setAdapter(g3Var);
        }
        if (UptodownApp.f4379d0) {
            ViewPager2 viewPager25 = this.h0;
            if (viewPager25 != null) {
                viewPager25.setCurrentItem(G0, false);
            }
            UptodownApp.f4379d0 = false;
            if (G0 == 3) {
                AppBarLayout appBarLayout = this.Y;
                appBarLayout.getClass();
                appBarLayout.setVisibility(0);
                AppBarLayout appBarLayout2 = this.Y;
                appBarLayout2.getClass();
                appBarLayout2.setExpanded(false, false);
            }
        }
        TabLayout tabLayout = this.f4398l0;
        if (tabLayout != null && (viewPager2 = this.h0) != null) {
            new TabLayoutMediator(tabLayout, viewPager2, new p2(i3, this)).attach();
            TabLayout tabLayout2 = this.f4398l0;
            tabLayout2.getClass();
            tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new f3(this));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        r2 r2Var = this.f4410y0;
        Handler handler = this.f4393f0;
        if (r2Var != null) {
            handler.removeCallbacks(r2Var);
        }
        d dVar = this.z0;
        if (dVar != null) {
            handler.removeCallbacks(dVar);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.onKeyDown(i, keyEvent);
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!Y0()) {
            r1();
            Object systemService = getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(258);
            RelativeLayout relativeLayout = this.f4395i0;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                k1();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(new Bundle());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p1() {
        boolean z10;
        AlertDialog alertDialog;
        SharedPreferences sharedPreferences;
        k5.v2 h = t2.h(this);
        if (!isFinishing() && h != null && h.d()) {
            try {
                sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused) {
            }
            if (sharedPreferences.contains("welcome_popup_shown")) {
                z10 = sharedPreferences.getBoolean("welcome_popup_shown", false);
                if (!z10) {
                    AlertDialog alertDialog2 = this.F;
                    if (alertDialog2 != null) {
                        alertDialog2.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    View inflate = getLayoutInflater().inflate(R.layout.uptodown_turbo_welcome_popup, (ViewGroup) null, false);
                    int i = R.id.iv_customization_turbo_welcome_popup;
                    if (((ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_customization_turbo_welcome_popup)) != null) {
                        i = R.id.iv_highlighted_comments_turbo_welcome_popup;
                        if (((ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_highlighted_comments_turbo_welcome_popup)) != null) {
                            i = R.id.iv_no_ads_turbo_welcome_popup;
                            if (((ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_no_ads_turbo_welcome_popup)) != null) {
                                i = R.id.ll_content_turbo;
                                if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_content_turbo)) != null) {
                                    i = R.id.nsv_turbo_welcome_popup;
                                    if (((NestedScrollView) ViewBindings.findChildViewById(inflate, R.id.nsv_turbo_welcome_popup)) != null) {
                                        i = R.id.tv_customization_desc_turbo_welcome_popup;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_customization_desc_turbo_welcome_popup);
                                        if (textView != null) {
                                            i = R.id.tv_customization_turbo_welcome_popup;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_customization_turbo_welcome_popup);
                                            if (textView2 != null) {
                                                i = R.id.tv_desc_turbo_welcome_popup;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_desc_turbo_welcome_popup);
                                                if (textView3 != null) {
                                                    i = R.id.tv_highlighted_comments_desc_turbo_welcome_popup;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_highlighted_comments_desc_turbo_welcome_popup);
                                                    if (textView4 != null) {
                                                        i = R.id.tv_highlighted_comments_turbo_welcome_popup;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_highlighted_comments_turbo_welcome_popup);
                                                        if (textView5 != null) {
                                                            i = R.id.tv_no_ads_desc_turbo_welcome_popup;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_no_ads_desc_turbo_welcome_popup);
                                                            if (textView6 != null) {
                                                                i = R.id.tv_no_ads_turbo_welcome_popup;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_no_ads_turbo_welcome_popup);
                                                                if (textView7 != null) {
                                                                    i = R.id.tv_start_turbo_welcome_popup;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_start_turbo_welcome_popup);
                                                                    if (textView8 != null) {
                                                                        i = R.id.tv_title_turbo_welcome_popup;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_title_turbo_welcome_popup);
                                                                        if (textView9 != null) {
                                                                            RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                                                            textView9.setTypeface(s4.c.u);
                                                                            String string = getString(R.string.uptodown_turbo);
                                                                            string.getClass();
                                                                            int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
                                                                            int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
                                                                            String obj = textView9.getText().toString();
                                                                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, textView9.getPaint().measureText(string), textView9.getHeight(), new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                                                            SpannableString spannableString = new SpannableString(obj);
                                                                            int q02 = z7.n.q0(obj, string, 0, false, 6);
                                                                            if (q02 >= 0) {
                                                                                spannableString.setSpan(new w5.b(linearGradient, getResources().getDimension(R.dimen.font_size_26)), q02, string.length() + q02, 33);
                                                                            }
                                                                            textView9.setText(spannableString);
                                                                            ConcurrentHashMap concurrentHashMap = q.f11211a;
                                                                            Spanned a10 = q.a(getString(R.string.turbo_welcome_popup_description, getString(R.string.turbo_welcome_popup_manage_subscription)));
                                                                            String string2 = getString(R.string.turbo_welcome_popup_manage_subscription);
                                                                            string2.getClass();
                                                                            SpannableString spannableString2 = new SpannableString(a10);
                                                                            int q03 = z7.n.q0(a10, string2, 0, false, 6);
                                                                            if (q03 >= 0) {
                                                                                spannableString2.setSpan(new StyleSpan(1), q03, string2.length() + q03, 33);
                                                                            }
                                                                            textView3.setText(spannableString2);
                                                                            textView3.setTypeface(s4.c.v);
                                                                            textView7.setTypeface(s4.c.u);
                                                                            textView6.setTypeface(s4.c.v);
                                                                            textView2.setTypeface(s4.c.u);
                                                                            textView.setTypeface(s4.c.v);
                                                                            textView5.setTypeface(s4.c.u);
                                                                            textView4.setTypeface(s4.c.v);
                                                                            textView8.setTypeface(s4.c.u);
                                                                            textView8.setOnClickListener(new o4.m2(10, this));
                                                                            builder.setView(relativeLayout);
                                                                            builder.setCancelable(true);
                                                                            this.F = builder.create();
                                                                            if (!isFinishing() && (alertDialog = this.F) != null) {
                                                                                Window window = alertDialog.getWindow();
                                                                                if (window != null) {
                                                                                    android.support.v4.media.session.m.z(window, 0);
                                                                                }
                                                                                AlertDialog alertDialog3 = this.F;
                                                                                alertDialog3.getClass();
                                                                                alertDialog3.show();
                                                                                SharedPreferences sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
                                                                                sharedPreferences2.getClass();
                                                                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                                                                edit.putBoolean("welcome_popup_shown", true);
                                                                                edit.apply();
                                                                                return true;
                                                                            }
                                                                            return false;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    o2.a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                    return false;
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return false;
    }

    public final void q1() {
        String str = null;
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("url_526")) {
                str = sharedPreferences.getString("url_526", null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (str == null) {
            str = "https://uptodown-android.uptodown.com/android";
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public final void r1() {
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new v2(this, null, 7), 3);
    }

    @Override // o4.b0, t4.g
    public final void s() {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        f0.z(lifecycleScope, n.f6148a, null, new o4.m(this, null, 1), 2);
    }

    public final void s1() {
        ImageView imageView = (ImageView) findViewById(R.id.home_uptodown_turbo);
        k5.v2 h = t2.h(this);
        if (!isFinishing() && h != null && h.d()) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (imageView != null) {
            imageView.setVisibility(0);
        }
        r1();
    }

    @Override // t4.g
    public final void t() {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        f0.z(lifecycleScope, n.f6148a, null, new o4.m(this, null, 1), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object, k5.d3] */
    @Override // o4.b0
    public final void t0(long j) {
        String valueOf = String.valueOf(j);
        SharedPreferences sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("app_id_after_kill", valueOf);
        edit.apply();
        View rootView = getWindow().getDecorView().getRootView();
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        rootView.draw(new Canvas(createBitmap));
        float applyDimension = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, rootView.getWidth() / 2, rootView.getHeight() / 2, true);
        int i = (int) applyDimension;
        Bitmap createBitmap2 = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f7 = i;
        paint.setAntiAlias(true);
        canvas.drawRoundRect(rectF, f7, f7, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createScaledBitmap, rect, rect, paint);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_wizard);
        this.W = relativeLayout;
        relativeLayout.getClass();
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.W;
        relativeLayout2.getClass();
        relativeLayout2.setOnClickListener(new h5.o(8));
        RelativeLayout relativeLayout3 = this.W;
        relativeLayout3.getClass();
        relativeLayout3.removeAllViews();
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_kill, (ViewGroup) this.W, false);
        inflate.getClass();
        RelativeLayout relativeLayout4 = (RelativeLayout) inflate;
        ((TextView) relativeLayout4.findViewById(R.id.tv_title_wizard_kill)).setTypeface(s4.c.u);
        TextView textView = (TextView) relativeLayout4.findViewById(R.id.tv_slogan_to_wizard_kill);
        textView.setTypeface(s4.c.v);
        textView.setText(getString(R.string.core_kill_this_app, getString(R.string.app_name)));
        ((TextView) relativeLayout4.findViewById(R.id.tv_slide_wizard_kill)).setTypeface(s4.c.u);
        TextView textView2 = (TextView) relativeLayout4.findViewById(R.id.tv_accept_wizard_kill);
        textView2.setTypeface(s4.c.v);
        textView2.setEnabled(true);
        textView2.setOnClickListener(new s2(5, this));
        ?? obj = new Object();
        obj.f7336a = 6;
        obj.f7337b = relativeLayout4;
        m1(obj);
        ImageView imageView = (ImageView) relativeLayout4.findViewById(R.id.iv_tap_screen_kill);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up_tap);
        loadAnimation.setStartOffset(500L);
        loadAnimation.setFillAfter(true);
        ImageView imageView2 = (ImageView) relativeLayout4.findViewById(R.id.iv_screenshot_kill);
        imageView2.setImageBitmap(createBitmap2);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.slide_up_out);
        loadAnimation2.setFillAfter(true);
        loadAnimation2.setStartOffset(500L);
        loadAnimation2.setAnimationListener(new a6.e(imageView, loadAnimation, imageView2, 1));
        imageView.startAnimation(loadAnimation);
        imageView2.startAnimation(loadAnimation2);
    }

    public final void t1() {
        if (this.W != null && this.T >= 0) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            int i = this.T;
            if (size > i && ((d3) arrayList.get(i)).f7336a == 4 && m()) {
                if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                    TextView textView = (TextView) findViewById(R.id.tv_next_wp);
                    if (textView != null) {
                        textView.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
                    }
                    if (textView != null) {
                        textView.setTextColor(ContextCompat.getColor(this, R.color.text_color_wizard_button));
                    }
                }
            }
        }
    }

    @Override // o4.b0, t4.g
    public final void u() {
        R0();
    }

    public final void u1(g gVar) {
        String str = gVar.O;
        androidx.compose.animation.core.b bVar = new androidx.compose.animation.core.b(14, gVar, this);
        androidx.window.embedding.t tVar = new androidx.window.embedding.t(13);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        f0.z(lifecycleScope, n.f6148a, null, new l(str, this, tVar, bVar, (g7.c) null), 2);
    }

    @Override // t4.g
    public final void v() {
        R0();
    }

    @Override // o4.b0
    public final void v0(g gVar) {
        gVar.getClass();
        if (S()) {
            Fragment U0 = U0();
            RelativeLayout relativeLayout = this.f4396j0;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new h5.o(8));
            }
            RelativeLayout relativeLayout2 = this.f4396j0;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            if (U0 instanceof l0) {
                if (((l0) U0).B().f7356a != gVar.f7356a) {
                    P0(gVar, true);
                }
            } else {
                P0(gVar, false);
            }
            AppBarLayout appBarLayout = this.Y;
            appBarLayout.getClass();
            appBarLayout.setVisibility(8);
        }
    }

    public final void v1(k5.j jVar) {
        jVar.getClass();
        if (S()) {
            int i = jVar.f7407a;
            if (i == 523) {
                Q0(1);
            } else if (i == 831) {
                Q0(2);
            }
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.getClass();
            String str = jVar.f7408b;
            str.getClass();
            d1 d1Var = new d1(str);
            jVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt("id", jVar.f7407a);
            bundle.putString(HintConstants.AUTOFILL_HINT_NAME, jVar.f7408b);
            bundle.putString("description", jVar.l);
            bundle.putBoolean("isFloating", jVar.m);
            bundle.putInt("parentCategoryId", jVar.o);
            bundle.putInt("isGame", jVar.p);
            bundle.putBoolean("isLeaf", jVar.f7409n);
            d1Var.setArguments(bundle);
            beginTransaction.add(R.id.fl_apps_category_fragment, d1Var);
            beginTransaction.addToBackStack("appsCategory");
            if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                try {
                    beginTransaction.commitAllowingStateLoss();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    @Override // t4.g
    public final void w() {
        SwitchCompat switchCompat = this.Z;
        if (switchCompat != null) {
            switchCompat.setChecked(m());
        }
        t1();
    }

    public final void w1(k5.j jVar) {
        jVar.getClass();
        if (S()) {
            W0();
            k2 k2Var = new k2();
            k2Var.m = jVar;
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.getClass();
            if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
                try {
                    float f7 = UptodownApp.G;
                    n4.e.A(beginTransaction, this);
                    beginTransaction.add(R.id.rl_main_scrollable, k2Var);
                    beginTransaction.addToBackStack(k2Var.m.f7408b);
                    if (U0() instanceof k2) {
                        beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    }
                    if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                        try {
                            beginTransaction.commitAllowingStateLoss();
                            return;
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            String string = getString(R.string.error_generico);
                            string.getClass();
                            A(string);
                            return;
                        }
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    String string2 = getString(R.string.error_generico);
                    string2.getClass();
                    A(string2);
                    return;
                }
            }
            String string3 = getString(R.string.error_generico);
            string3.getClass();
            A(string3);
        }
    }

    @Override // o4.h2
    public final k5.v2 x0() {
        String str;
        k5.v2 h = t2.h(this);
        if (h != null) {
            str = h.f7542a;
        } else {
            str = null;
        }
        if (str == null || !t2.g(this)) {
            return null;
        }
        return h;
    }

    @Override // o4.h2
    public final void z0() {
        if (this.W != null) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            int i = this.T;
            if (size > i && ((d3) arrayList.get(i)).f7336a == 5) {
                O0();
                s1();
                return;
            }
        }
        q1 q1Var = this.f4401p0;
        if (q1Var != null) {
            q1Var.onResume();
        }
    }

    @Override // o4.h2
    public final void C0() {
    }

    @Override // o4.h2
    public final void D0() {
    }

    @Override // o4.h2
    public final void w0() {
    }

    @Override // o4.h2
    public final void A0(k5.v2 v2Var) {
    }

    @Override // o4.h2
    public final void B0(k5.v2 v2Var, String str) {
    }
}

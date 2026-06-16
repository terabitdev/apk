package com.uptodown.activities;

import a5.m;
import a6.j;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.style.c;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import b.d;
import c7.n;
import c7.z;
import c8.f0;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.l5;
import com.uptodown.R;
import h5.o;
import h7.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import k5.e;
import k5.g;
import k5.o0;
import k5.u0;
import kotlin.jvm.internal.p;
import o4.f;
import o4.h;
import o4.j4;
import w5.q;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class AppInstalledDetailsActivity extends j4 {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f4383e0 = 0;
    public final String Z = "AppInstalledDetailsActivity";

    /* renamed from: a0, reason: collision with root package name */
    public final n f4384a0 = new n(new c(this, 27));

    /* renamed from: b0, reason: collision with root package name */
    public e f4385b0;

    /* renamed from: c0, reason: collision with root package name */
    public g f4386c0;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f4387d0;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (c8.f0.K(r7, r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (c8.f0.K(r7, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N0(AppInstalledDetailsActivity appInstalledDetailsActivity, i7.c cVar) {
        h hVar;
        int i;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i3 = hVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.l = i3 - Integer.MIN_VALUE;
                Object obj = hVar.f8712a;
                i = hVar.l;
                g7.c cVar2 = null;
                int i8 = 2;
                int i10 = 1;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c7.a.e(obj);
                            return z.f3538a;
                        }
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c7.a.e(obj);
                } else {
                    c7.a.e(obj);
                    j8.e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    o4.g gVar = new o4.g(appInstalledDetailsActivity, cVar2, i10);
                    hVar.l = 1;
                }
                j8.e eVar2 = p0.f3588a;
                d8.c cVar3 = h8.n.f6148a;
                o4.g gVar2 = new o4.g(appInstalledDetailsActivity, cVar2, i8);
                hVar.l = 2;
            }
        }
        hVar = new h(appInstalledDetailsActivity, cVar);
        Object obj2 = hVar.f8712a;
        i = hVar.l;
        g7.c cVar22 = null;
        int i82 = 2;
        int i102 = 1;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        j8.e eVar22 = p0.f3588a;
        d8.c cVar32 = h8.n.f6148a;
        o4.g gVar22 = new o4.g(appInstalledDetailsActivity, cVar22, i82);
        hVar.l = 2;
    }

    public static final void O0(AppInstalledDetailsActivity appInstalledDetailsActivity) {
        l5.s(appInstalledDetailsActivity.R0().s, appInstalledDetailsActivity.R0().f5410b);
        appInstalledDetailsActivity.R0().p.setVisibility(8);
        appInstalledDetailsActivity.R0().f5419k0.setVisibility(8);
        appInstalledDetailsActivity.R0().C.setVisibility(8);
        appInstalledDetailsActivity.R0().f5423o0.setVisibility(0);
    }

    public static final void P0(AppInstalledDetailsActivity appInstalledDetailsActivity, String str) {
        l5.s(appInstalledDetailsActivity.R0().s, appInstalledDetailsActivity.R0().f5410b);
        appInstalledDetailsActivity.R0().V.setVisibility(0);
        appInstalledDetailsActivity.R0().f5423o0.setVisibility(0);
        appInstalledDetailsActivity.R0().p.setVisibility(8);
        appInstalledDetailsActivity.R0().K.setVisibility(8);
        s7.a.J(appInstalledDetailsActivity.R0().f5419k0);
        appInstalledDetailsActivity.R0().f5419k0.setVisibility(0);
        appInstalledDetailsActivity.R0().f5419k0.setOnClickListener(new j(23, appInstalledDetailsActivity, str));
    }

    @Override // o4.j4
    public final String D0() {
        return this.Z;
    }

    public final void Q0() {
        if (this.f4386c0 == null) {
            e eVar = this.f4385b0;
            eVar.getClass();
            if (eVar.F > 0) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                j8.e eVar2 = p0.f3588a;
                f0.z(lifecycleScope, h8.n.f6148a, null, new f(this, null, 1), 2);
            }
        }
    }

    public final g5.d R0() {
        return (g5.d) this.f4384a0.getValue();
    }

    public final void S0() {
        l5.E(R0().s, R0().f5410b);
        R0().s.setIndeterminate(true);
        R0().p.setVisibility(0);
        R0().f5423o0.setVisibility(0);
        R0().V.setVisibility(8);
        R0().f5419k0.setVisibility(8);
        R0().K.setVisibility(8);
        R0().C.setVisibility(0);
    }

    public final void T0() {
        l5.E(R0().s, R0().f5410b);
        R0().p.setVisibility(0);
        R0().f5423o0.setVisibility(8);
        R0().V.setVisibility(0);
        R0().K.setOnClickListener(new o4.e(this, 1));
        R0().f5419k0.setVisibility(8);
        R0().K.setVisibility(0);
    }

    @Override // o4.b0
    public final void c0(u0 u0Var) {
        u0Var.getClass();
        if (!(u0Var instanceof o0) && !(u0Var instanceof k5.p0)) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            j8.e eVar = p0.f3588a;
            f0.z(lifecycleScope, h8.n.f6148a, null, new m(this, u0Var, (g7.c) null, 24), 2);
            return;
        }
        String string = getString(R.string.error_no_connection);
        string.getClass();
        A(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x036d A[Catch: Exception -> 0x037a, TryCatch #2 {Exception -> 0x037a, blocks: (B:75:0x0367, B:77:0x036d, B:81:0x037c), top: B:74:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x037c A[Catch: Exception -> 0x037a, TRY_LEAVE, TryCatch #2 {Exception -> 0x037a, blocks: (B:75:0x0367, B:77:0x036d, B:81:0x037c), top: B:74:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0405  */
    /* JADX WARN: Type inference failed for: r2v26, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [g7.h, c8.d0, g7.c] */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        ApplicationInfo applicationInfo;
        e eVar;
        e eVar2;
        long j;
        e eVar3;
        ?? obj;
        String str;
        CharSequence charSequence;
        ?? r42;
        e eVar4;
        e eVar5;
        int i;
        e eVar6;
        e eVar7;
        String str2;
        String str3;
        e eVar8;
        e eVar9;
        PackageInfo packageInfo;
        boolean z10;
        CharSequence charSequence2;
        String str4;
        String format;
        String format2;
        k5.j jVar;
        e eVar10;
        String str5;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = R0().f5408a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("appInstalled")) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = (Parcelable) extras.getParcelable("appInstalled", e.class);
                } else {
                    parcelable2 = extras.getParcelable("appInstalled");
                }
                this.f4385b0 = (e) parcelable2;
            }
            extras.getClass();
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = (Parcelable) extras.getParcelable("appInfo", g.class);
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                this.f4386c0 = (g) parcelable;
            }
        }
        Q0();
        g5.d R0 = R0();
        TextView textView = R0.f5417i0;
        View view = R0.r;
        Toolbar toolbar = R0.G;
        textView.setTypeface(s4.c.u);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(getString(R.string.back));
        }
        toolbar.setNavigationOnClickListener(new o4.e(this, 0));
        R0.P.setTypeface(s4.c.v);
        int i3 = 2;
        view.setOnClickListener(new o(2));
        view.setVisibility(0);
        try {
            eVar10 = this.f4385b0;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        if (eVar10 != null && (str5 = eVar10.l) != null && str5.length() != 0) {
            PackageManager packageManager = getPackageManager();
            packageManager.getClass();
            e eVar11 = this.f4385b0;
            eVar11.getClass();
            String str6 = eVar11.l;
            str6.getClass();
            applicationInfo = a5.o.b(packageManager, str6, 128);
            if (applicationInfo == null) {
                w5.g f7 = w5.g.D.f(this);
                f7.b();
                e eVar12 = this.f4385b0;
                eVar12.getClass();
                eVar12.f(applicationInfo, f7);
                e eVar13 = this.f4385b0;
                eVar13.getClass();
                eVar13.e(f7);
                f7.d();
                ConcurrentHashMap concurrentHashMap = q.f11211a;
                e eVar14 = this.f4385b0;
                eVar14.getClass();
                Drawable b10 = q.b(this, eVar14.l);
                R0().f5410b.setImageDrawable(b10);
                TextView textView2 = R0().I;
                e eVar15 = this.f4385b0;
                eVar15.getClass();
                textView2.setText(eVar15.f7339b);
                R0().I.setTypeface(s4.c.u);
                TextView textView3 = R0().f5423o0;
                e eVar16 = this.f4385b0;
                eVar16.getClass();
                textView3.setText(eVar16.f7340n);
                R0().f5423o0.setTypeface(s4.c.v);
                R0().h0.setTypeface(s4.c.v);
                R0().f5418j0.setTypeface(s4.c.v);
                R0().V.setTypeface(s4.c.v);
                R0().f5422n0.setTypeface(s4.c.v);
                R0().K.setTypeface(s4.c.u);
                e eVar17 = this.f4385b0;
                eVar17.getClass();
                if (!p.b(eVar17.l, getPackageName())) {
                    g gVar = this.f4386c0;
                    if (gVar != null && (jVar = gVar.G) != null && jVar.p == 1) {
                        R0().Q.setText(getString(R.string.app_detail_play_button));
                    }
                } else {
                    R0().o.setVisibility(8);
                }
                e eVar18 = this.f4385b0;
                eVar18.getClass();
                String str7 = eVar18.l;
                str7.getClass();
                int i8 = 4;
                int i10 = 3;
                try {
                    int applicationEnabledSetting = getPackageManager().getApplicationEnabledSetting(str7);
                    if (applicationEnabledSetting == 2 || applicationEnabledSetting == 3 || applicationEnabledSetting == 4) {
                        R0().h0.setVisibility(0);
                    }
                } catch (Error e11) {
                    e11.printStackTrace();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                R0().Q.setTypeface(s4.c.u);
                R0().Q.setOnClickListener(new o4.e(this, i3));
                R0().f5421n.setOnClickListener(new o4.e(this, i10));
                R0().H.setTypeface(s4.c.u);
                e eVar19 = this.f4385b0;
                eVar19.getClass();
                if (eVar19.l != null) {
                    e eVar20 = this.f4385b0;
                    eVar20.getClass();
                    if (!v.a0(eVar20.l, "", true)) {
                        R0().S.setTypeface(s4.c.u);
                        R0().R.setTypeface(s4.c.v);
                        TextView textView4 = R0().R;
                        e eVar21 = this.f4385b0;
                        eVar21.getClass();
                        textView4.setText(eVar21.l);
                        eVar = this.f4385b0;
                        eVar.getClass();
                        if (eVar.m <= 0) {
                            R0().f5425q0.setTypeface(s4.c.u);
                            R0().f5424p0.setTypeface(s4.c.v);
                            TextView textView5 = R0().f5424p0;
                            e eVar22 = this.f4385b0;
                            eVar22.getClass();
                            textView5.setText(String.valueOf(eVar22.m));
                        } else {
                            R0().E.setVisibility(8);
                        }
                        R0().t.setVisibility(8);
                        eVar2 = this.f4385b0;
                        eVar2.getClass();
                        if (eVar2.A == 0) {
                            R0().M.setTypeface(s4.c.u);
                            R0().L.setTypeface(s4.c.v);
                            TextView textView6 = R0().L;
                            e eVar23 = this.f4385b0;
                            eVar23.getClass();
                            long j10 = eVar23.A;
                            if (j10 <= 0) {
                                j = 0;
                                format2 = null;
                            } else {
                                j = 0;
                                format2 = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(j10));
                            }
                            textView6.setText(format2);
                        } else {
                            j = 0;
                            R0().u.setVisibility(8);
                        }
                        eVar3 = this.f4385b0;
                        eVar3.getClass();
                        if (eVar3.f7342x == j) {
                            R0().O.setTypeface(s4.c.u);
                            R0().N.setTypeface(s4.c.v);
                            TextView textView7 = R0().N;
                            e eVar24 = this.f4385b0;
                            eVar24.getClass();
                            long j11 = eVar24.f7342x;
                            if (j11 <= j) {
                                format = null;
                            } else {
                                format = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(j11));
                            }
                            textView7.setText(format);
                        } else {
                            R0().v.setVisibility(8);
                        }
                        obj = new Object();
                        e eVar25 = this.f4385b0;
                        eVar25.getClass();
                        str = eVar25.l;
                        if (str != null && str.length() != 0) {
                            e eVar26 = this.f4385b0;
                            eVar26.getClass();
                            String str8 = eVar26.l;
                            str8.getClass();
                            try {
                                if (Build.VERSION.SDK_INT < 30) {
                                    str4 = getPackageManager().getInstallSourceInfo(str8).getInstallingPackageName();
                                } else {
                                    str4 = getPackageManager().getInstallerPackageName(str8);
                                }
                            } catch (Exception e13) {
                                e13.printStackTrace();
                                str4 = null;
                            }
                            obj.f7675a = str4;
                        }
                        charSequence = (CharSequence) obj.f7675a;
                        if (charSequence != null || charSequence.length() == 0) {
                            r42 = 0;
                            R0().D.setVisibility(8);
                        } else {
                            try {
                                PackageManager packageManager2 = getPackageManager();
                                packageManager2.getClass();
                                packageInfo = a5.o.e(packageManager2, (String) obj.f7675a, 0);
                            } catch (Exception e14) {
                                e14.printStackTrace();
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                                if (applicationInfo2 != null) {
                                    charSequence2 = applicationInfo2.loadLabel(getPackageManager());
                                } else {
                                    charSequence2 = null;
                                }
                                R0().f5420l0.setText(charSequence2);
                                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                                j8.e eVar27 = p0.f3588a;
                                z10 = false;
                                f0.z(lifecycleScope, j8.d.f7053a, null, new b.n((Object) this, (Object) obj, (Object) charSequence2, (g7.c) (false ? 1 : 0), 5), 2);
                            } else {
                                z10 = false;
                            }
                            R0().m0.setTypeface(s4.c.u);
                            R0().f5420l0.setTypeface(s4.c.v);
                            r42 = z10;
                        }
                        eVar4 = this.f4385b0;
                        eVar4.getClass();
                        if (eVar4.s == 0) {
                            R0().X.setTypeface(s4.c.u);
                            R0().W.setTypeface(s4.c.v);
                            TextView textView8 = R0().W;
                            e eVar28 = this.f4385b0;
                            eVar28.getClass();
                            textView8.setText(String.valueOf(eVar28.s));
                        } else {
                            R0().f5429y.setVisibility(8);
                        }
                        R0().f5411b0.setTypeface(s4.c.u);
                        R0().f5409a0.setTypeface(s4.c.v);
                        eVar5 = this.f4385b0;
                        eVar5.getClass();
                        if (eVar5.I == null) {
                            e eVar29 = this.f4385b0;
                            eVar29.getClass();
                            ArrayList arrayList = eVar29.I;
                            arrayList.getClass();
                            i = arrayList.size() + 1;
                        } else {
                            i = 1;
                        }
                        eVar6 = this.f4385b0;
                        eVar6.getClass();
                        if (eVar6.J != null) {
                            e eVar30 = this.f4385b0;
                            eVar30.getClass();
                            ArrayList arrayList2 = eVar30.J;
                            arrayList2.getClass();
                            i += arrayList2.size();
                        }
                        if (i <= 1) {
                            R0().f5411b0.setText(getString(R.string.app_installed_files_title));
                            R0().f5409a0.setText(getString(R.string.app_installed_x_files_value, String.valueOf(i)));
                            R0().f5426r0.setTypeface(s4.c.u);
                            R0().f5426r0.setOnClickListener(new o4.e(this, i8));
                        } else {
                            e eVar31 = this.f4385b0;
                            eVar31.getClass();
                            if (eVar31.B != null) {
                                e eVar32 = this.f4385b0;
                                eVar32.getClass();
                                if (!v.a0(eVar32.B, "", true)) {
                                    TextView textView9 = R0().f5409a0;
                                    e eVar33 = this.f4385b0;
                                    eVar33.getClass();
                                    textView9.setText(eVar33.B);
                                    R0().f5426r0.setVisibility(8);
                                }
                            }
                            R0().f5430z.setVisibility(8);
                        }
                        eVar7 = this.f4385b0;
                        eVar7.getClass();
                        if (eVar7.f7341w == j) {
                            R0().f5416g0.setTypeface(s4.c.u);
                            R0().f5415f0.setTypeface(s4.c.v);
                            TextView textView10 = R0().f5415f0;
                            e eVar34 = this.f4385b0;
                            eVar34.getClass();
                            textView10.setText(a4.x(this, eVar34.f7341w));
                        } else {
                            R0().B.setVisibility(8);
                        }
                        e eVar35 = this.f4385b0;
                        eVar35.getClass();
                        str2 = eVar35.l;
                        if (str2 == null && str2.length() != 0) {
                            PackageManager packageManager3 = getPackageManager();
                            packageManager3.getClass();
                            e eVar36 = this.f4385b0;
                            eVar36.getClass();
                            String str9 = eVar36.l;
                            str9.getClass();
                            str3 = w5.a.d(packageManager3, str9, "MD5");
                        } else {
                            str3 = r42;
                        }
                        if (str3 == null) {
                            R0().f5414e0.setTypeface(s4.c.u);
                            R0().f5413d0.setTypeface(s4.c.v);
                            R0().f5413d0.setText(str3);
                        } else {
                            R0().A.setVisibility(8);
                        }
                        R0().U.setTypeface(s4.c.u);
                        R0().T.setTypeface(s4.c.v);
                        R0().f5428x.setOnClickListener(new o4.e(this, 5));
                        eVar8 = this.f4385b0;
                        eVar8.getClass();
                        if (eVar8.F <= j) {
                            R0().l.setImageDrawable(b10);
                            TextView textView11 = R0().J;
                            e eVar37 = this.f4385b0;
                            eVar37.getClass();
                            textView11.setText(eVar37.f7339b);
                            R0().J.setTypeface(s4.c.u);
                            R0().Y.setTypeface(s4.c.u);
                            R0().Z.setTypeface(s4.c.u);
                            R0().f5412c0.setTypeface(s4.c.v);
                            R0().Y.setOnClickListener(new o4.e(this, 6));
                        } else {
                            R0().l.setVisibility(8);
                            R0().J.setVisibility(8);
                            R0().Y.setVisibility(8);
                            R0().f5412c0.setVisibility(8);
                            R0().Z.setVisibility(8);
                        }
                        eVar9 = this.f4385b0;
                        eVar9.getClass();
                        if (!eVar9.d()) {
                            R0().f5418j0.setText(getString(R.string.system_service));
                            R0().f5418j0.setVisibility(0);
                            R0().Q.setVisibility(8);
                            R0().f5421n.setVisibility(8);
                        } else {
                            e eVar38 = this.f4385b0;
                            eVar38.getClass();
                            if (eVar38.c()) {
                                R0().f5418j0.setText(getString(R.string.system_app));
                                R0().f5418j0.setVisibility(0);
                                R0().f5421n.setVisibility(8);
                            }
                        }
                        R0().r.setVisibility(8);
                        f0.z(LifecycleOwnerKt.getLifecycleScope(this), r42, r42, new f(this, r42, i3), 3);
                        f0.z(LifecycleOwnerKt.getLifecycleScope(this), r42, r42, new f(this, r42, i10), 3);
                        return;
                    }
                }
                R0().f5427w.setVisibility(8);
                eVar = this.f4385b0;
                eVar.getClass();
                if (eVar.m <= 0) {
                }
                R0().t.setVisibility(8);
                eVar2 = this.f4385b0;
                eVar2.getClass();
                if (eVar2.A == 0) {
                }
                eVar3 = this.f4385b0;
                eVar3.getClass();
                if (eVar3.f7342x == j) {
                }
                obj = new Object();
                e eVar252 = this.f4385b0;
                eVar252.getClass();
                str = eVar252.l;
                if (str != null) {
                    e eVar262 = this.f4385b0;
                    eVar262.getClass();
                    String str82 = eVar262.l;
                    str82.getClass();
                    if (Build.VERSION.SDK_INT < 30) {
                    }
                    obj.f7675a = str4;
                }
                charSequence = (CharSequence) obj.f7675a;
                if (charSequence != null) {
                }
                r42 = 0;
                R0().D.setVisibility(8);
                eVar4 = this.f4385b0;
                eVar4.getClass();
                if (eVar4.s == 0) {
                }
                R0().f5411b0.setTypeface(s4.c.u);
                R0().f5409a0.setTypeface(s4.c.v);
                eVar5 = this.f4385b0;
                eVar5.getClass();
                if (eVar5.I == null) {
                }
                eVar6 = this.f4385b0;
                eVar6.getClass();
                if (eVar6.J != null) {
                }
                if (i <= 1) {
                }
                eVar7 = this.f4385b0;
                eVar7.getClass();
                if (eVar7.f7341w == j) {
                }
                e eVar352 = this.f4385b0;
                eVar352.getClass();
                str2 = eVar352.l;
                if (str2 == null) {
                }
                str3 = r42;
                if (str3 == null) {
                }
                R0().U.setTypeface(s4.c.u);
                R0().T.setTypeface(s4.c.v);
                R0().f5428x.setOnClickListener(new o4.e(this, 5));
                eVar8 = this.f4385b0;
                eVar8.getClass();
                if (eVar8.F <= j) {
                }
                eVar9 = this.f4385b0;
                eVar9.getClass();
                if (!eVar9.d()) {
                }
                R0().r.setVisibility(8);
                f0.z(LifecycleOwnerKt.getLifecycleScope(this), r42, r42, new f(this, r42, i3), 3);
                f0.z(LifecycleOwnerKt.getLifecycleScope(this), r42, r42, new f(this, r42, i10), 3);
                return;
            }
            R0().F.setVisibility(8);
            R0().P.setVisibility(0);
            return;
        }
        applicationInfo = null;
        if (applicationInfo == null) {
        }
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        if (this.f4385b0 != null) {
            y4.a c10 = s4.a.f10430a.c();
            g7.c cVar = null;
            if (c10 != null) {
                str = c10.f11389a;
            } else {
                str = null;
            }
            e eVar = this.f4385b0;
            eVar.getClass();
            if (v.a0(str, eVar.l, true)) {
                R0().s.setIndeterminate(true);
                l5.E(R0().s, R0().f5410b);
            } else {
                f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new f(this, cVar, 4), 3);
            }
        }
    }
}

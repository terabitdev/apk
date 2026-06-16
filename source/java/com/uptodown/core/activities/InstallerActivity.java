package com.uptodown.core.activities;

import a5.f;
import a5.i0;
import a5.k;
import a5.m;
import a5.o;
import a5.s;
import a5.t;
import a5.u;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.autofill.HintConstants;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.d;
import c7.q;
import c7.z;
import c8.f0;
import c8.p0;
import c8.x1;
import com.uptodown.R;
import com.uptodown.core.activities.InstallerActivity;
import h5.w;
import h7.a;
import h8.n;
import j8.e;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.p;
import o4.b;
import o4.b3;
import o4.q2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import p6.c;
import t4.a0;
import t4.b0;
import t4.c0;
import t4.e0;
import t4.g;
import t4.g0;
import t4.h0;
import t4.x;
import t4.y;
import y4.l;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class InstallerActivity extends g {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f4480j0 = 0;
    public TextView A;
    public ImageView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public LinearLayout F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public ImageView O;
    public ImageView P;
    public String Q;
    public ArrayList R;
    public String S;
    public Uri T;
    public AlertDialog U;
    public AlertDialog V;
    public ArrayList W;
    public x1 X;
    public c Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public LinearLayout f4481a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4482b0;

    /* renamed from: c0, reason: collision with root package name */
    public String f4483c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4484d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4485e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4486f0;

    /* renamed from: g0, reason: collision with root package name */
    public final b f4487g0 = new b(this, 9);
    public final c0 h0 = new c0(this);

    /* renamed from: i0, reason: collision with root package name */
    public final c0 f4488i0 = new c0(this);

    /* renamed from: y, reason: collision with root package name */
    public ProgressBar f4489y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f4490z;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (c8.f0.K(r10, r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (c8.f0.K(r10, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(InstallerActivity installerActivity, Uri uri, String str, i7.c cVar) {
        h0 h0Var;
        int i;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i3 = h0Var.f10597n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0Var.f10597n = i3 - Integer.MIN_VALUE;
                Object obj = h0Var.l;
                i = h0Var.f10597n;
                g7.c cVar2 = null;
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
                    str = h0Var.f10596b;
                    uri = h0Var.f10595a;
                    c7.a.e(obj);
                } else {
                    c7.a.e(obj);
                    e eVar = p0.f3588a;
                    d8.c cVar3 = n.f6148a;
                    i0 i0Var = new i0(installerActivity, cVar2, 25);
                    h0Var.f10595a = uri;
                    h0Var.f10596b = str;
                    h0Var.f10597n = 1;
                }
                e eVar2 = p0.f3588a;
                j8.d dVar = j8.d.f7053a;
                g0 g0Var = new g0(str, installerActivity, uri, (g7.c) null);
                h0Var.f10595a = null;
                h0Var.f10596b = null;
                h0Var.f10597n = 2;
            }
        }
        h0Var = new h0(installerActivity, cVar);
        Object obj2 = h0Var.l;
        i = h0Var.f10597n;
        g7.c cVar22 = null;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar22 = p0.f3588a;
        j8.d dVar2 = j8.d.f7053a;
        g0 g0Var2 = new g0(str, installerActivity, uri, (g7.c) null);
        h0Var.f10595a = null;
        h0Var.f10596b = null;
        h0Var.f10597n = 2;
    }

    public final void D() {
        Activity activity = s4.c.o;
        z1.b.p(this, null);
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file != null && file.exists()) {
                    file.delete();
                }
            }
        }
        finish();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    public final void E() {
        TextView textView;
        InstallerActivity installerActivity;
        String str;
        ImageView imageView;
        setContentView(R.layout.installer_activity);
        try {
            this.Z = false;
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                this.T = data;
                if (data != null) {
                    this.Q = f.b(data, this);
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (extras.containsKey("realPath")) {
                        this.S = extras.getString("realPath");
                    }
                    if (extras.containsKey("newFeatures")) {
                        this.f4483c0 = extras.getString("newFeatures");
                    }
                    if (extras.containsKey("requireUserAction")) {
                        this.f4484d0 = extras.getBoolean("requireUserAction");
                    }
                    if (extras.containsKey("notificationId")) {
                        int i = extras.getInt("notificationId");
                        Object systemService = getSystemService("notification");
                        systemService.getClass();
                        ((NotificationManager) systemService).cancel(i);
                    }
                    if (extras.containsKey("backgroundInstallation")) {
                        this.f4485e0 = extras.getBoolean("backgroundInstallation");
                    }
                }
            }
            this.f4481a0 = (LinearLayout) findViewById(R.id.ll_installer_activity);
            ImageView imageView2 = (ImageView) findViewById(R.id.iv_hide_installer_activity);
            this.P = imageView2;
            imageView2.getClass();
            imageView2.setOnClickListener(new x(this, 5));
            this.O = (ImageView) findViewById(R.id.iv_logo_apk_installer_activity);
            TextView textView2 = (TextView) findViewById(R.id.tv_app_name_installer_activity);
            this.E = textView2;
            if (textView2 != null) {
                textView2.setTypeface(s4.c.u);
            }
            String str2 = this.Q;
            int i3 = 6;
            if (str2 != null) {
                TextView textView3 = this.G;
                if (textView3 != null) {
                    textView3.setText(str2);
                }
                String str3 = this.Q;
                str3.getClass();
                if (v.Y(str3, ".apk", false)) {
                    ImageView imageView3 = this.O;
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.core_vector_apk);
                    }
                } else {
                    String str4 = this.Q;
                    str4.getClass();
                    if (v.Y(str4, ".xapk", false) && (imageView = this.O) != null) {
                        imageView.setImageResource(R.drawable.core_vector_xapk);
                    }
                }
            } else {
                String str5 = this.S;
                if (str5 != null && (textView = this.G) != null) {
                    str5.getClass();
                    textView.setText(str5.substring(z7.n.t0("/", str5, 6) + 1));
                }
            }
            this.F = (LinearLayout) findViewById(R.id.ll_info_installer_activity);
            TextView textView4 = (TextView) findViewById(R.id.tv_file_name_label_installer_activity);
            if (textView4 != null) {
                textView4.setTypeface(s4.c.v);
            }
            TextView textView5 = (TextView) findViewById(R.id.tv_file_name_installer_activity);
            this.G = textView5;
            if (textView5 != null) {
                textView5.setTypeface(s4.c.u);
            }
            TextView textView6 = (TextView) findViewById(R.id.tv_size_label_installer_activity);
            if (textView6 != null) {
                textView6.setTypeface(s4.c.v);
            }
            TextView textView7 = (TextView) findViewById(R.id.tv_size_installer_activity);
            this.H = textView7;
            if (textView7 != null) {
                textView7.setTypeface(s4.c.u);
            }
            TextView textView8 = (TextView) findViewById(R.id.tv_version_label_installer_activity);
            if (textView8 != null) {
                textView8.setTypeface(s4.c.v);
            }
            TextView textView9 = (TextView) findViewById(R.id.tv_version_installer_activity);
            this.I = textView9;
            if (textView9 != null) {
                textView9.setTypeface(s4.c.u);
            }
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_installer_activity);
            this.f4489y = progressBar;
            progressBar.getClass();
            progressBar.setInterpolator(new AccelerateDecelerateInterpolator());
            TextView textView10 = (TextView) findViewById(R.id.tv_msg_info_installer_activity);
            this.f4490z = textView10;
            if (textView10 != null) {
                textView10.setTypeface(s4.c.v);
            }
            TextView textView11 = (TextView) findViewById(R.id.tv_msg_installer_activity);
            this.L = textView11;
            if (textView11 != null) {
                textView11.setTypeface(s4.c.v);
            }
            TextView textView12 = (TextView) findViewById(R.id.tv_install_installer_activity);
            this.M = textView12;
            if (textView12 != null) {
                textView12.setTypeface(s4.c.u);
            }
            TextView textView13 = this.M;
            if (textView13 != null) {
                textView13.setVisibility(8);
            }
            TextView textView14 = this.M;
            if (textView14 != null) {
                textView14.setOnClickListener(new x(this, i3));
            }
            TextView textView15 = (TextView) findViewById(R.id.tv_cancel_installer_activity);
            this.N = textView15;
            if (textView15 != null) {
                textView15.setTypeface(s4.c.u);
            }
            TextView textView16 = this.N;
            if (textView16 != null) {
                textView16.setVisibility(8);
            }
            TextView textView17 = this.N;
            if (textView17 != null) {
                textView17.setOnClickListener(new x(this, 7));
            }
            String str6 = this.f4483c0;
            if (str6 == null || str6.length() == 0) {
                installerActivity = this;
            } else {
                TextView textView18 = this.f4490z;
                textView18.getClass();
                textView18.setVisibility(8);
                ?? obj = new Object();
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_show_version_new_features);
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.ll_version_new_features);
                TextView textView19 = (TextView) findViewById(R.id.tv_version_new_features);
                ImageView imageView4 = (ImageView) findViewById(R.id.iv_version_new_features);
                textView19.setTypeface(s4.c.u);
                TextView textView20 = (TextView) findViewById(R.id.tv_version_new_features_content);
                textView20.setTypeface(s4.c.v);
                textView20.setText(this.f4483c0);
                textView20.setVisibility(8);
                linearLayout2.setVisibility(0);
                installerActivity = this;
                try {
                    linearLayout.setOnClickListener(new w((d0) obj, textView19, installerActivity, imageView4, textView20));
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    return;
                }
            }
            installerActivity.Y = new c(this);
            installerActivity.W = J();
            if (installerActivity.T != null && (str = installerActivity.Q) != null && (v.Y(str, ".apk", true) || v.Y(str, ".xapk", true) || v.Y(str, ".apks", true) || v.Y(str, ".apkm", true) || v.Y(str, ".zip", true))) {
                Uri uri = installerActivity.T;
                uri.getClass();
                String str7 = installerActivity.Q;
                str7.getClass();
                e eVar = p0.f3588a;
                f0.z(f0.b(j8.d.f7053a), null, null, new g0(this, uri, str7, (g7.c) null), 3);
                return;
            }
            L(installerActivity.S);
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void F(File file) {
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        a5.n nVar = new a5.n(applicationContext);
        nVar.f155b = this.f4484d0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        e eVar = p0.f3588a;
        f0.z(f0.b(j8.d.f7053a), null, null, new m(nVar, arrayList, (g7.c) null, 0), 3);
    }

    public final void G(Activity activity, final File file) {
        u4.a aVar = new u4.a(activity);
        final int i = 0;
        boolean c10 = aVar.c("device_rooted", false);
        boolean c11 = aVar.c("system_app", false);
        if (!this.Z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            if (I(arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(file);
                N(arrayList2);
                return;
            }
        }
        if (!c10 && !c11) {
            F(file);
            return;
        }
        final int i3 = 1;
        if (!aVar.c("user_asked_for_show_permissions", false)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getString(R.string.warning_title));
            builder.setMessage(R.string.msg_dialog_install_auto);
            builder.setCancelable(false);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: t4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InstallerActivity f10644b;

                {
                    this.f10644b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    int i10 = i;
                    File file2 = file;
                    InstallerActivity installerActivity = this.f10644b;
                    switch (i10) {
                        case 0:
                            int i11 = InstallerActivity.f4480j0;
                            u4.a aVar2 = new u4.a(installerActivity);
                            aVar2.i(true);
                            aVar2.e("install_apk_as_root_system", true);
                            installerActivity.G(installerActivity, file2);
                            return;
                        default:
                            int i12 = InstallerActivity.f4480j0;
                            u4.a aVar3 = new u4.a(installerActivity);
                            aVar3.i(true);
                            aVar3.e("install_apk_as_root_system", false);
                            installerActivity.G(installerActivity, file2);
                            return;
                    }
                }
            });
            builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: t4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InstallerActivity f10644b;

                {
                    this.f10644b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    int i10 = i3;
                    File file2 = file;
                    InstallerActivity installerActivity = this.f10644b;
                    switch (i10) {
                        case 0:
                            int i11 = InstallerActivity.f4480j0;
                            u4.a aVar2 = new u4.a(installerActivity);
                            aVar2.i(true);
                            aVar2.e("install_apk_as_root_system", true);
                            installerActivity.G(installerActivity, file2);
                            return;
                        default:
                            int i12 = InstallerActivity.f4480j0;
                            u4.a aVar3 = new u4.a(installerActivity);
                            aVar3.i(true);
                            aVar3.e("install_apk_as_root_system", false);
                            installerActivity.G(installerActivity, file2);
                            return;
                    }
                }
            });
            builder.create().show();
            return;
        }
        if (!aVar.c("install_apk_as_root_system", false)) {
            F(file);
            return;
        }
        g7.c cVar = null;
        if (aVar.c("device_rooted", false)) {
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            f0.z(f0.b(p0.f3588a), null, null, new k(absolutePath, activity, this.f4488i0, cVar, 1), 3);
            return;
        }
        if (aVar.c("system_app", false)) {
            a5.z zVar = new a5.z(i, activity, this.h0);
            e eVar = p0.f3588a;
            f0.z(f0.b(j8.d.f7053a), null, null, new m(zVar, file, cVar, i3), 3);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(2:2|3)|(20:5|6|7|8|(3:10|11|(6:18|(6:26|27|28|(2:30|(2:32|33))|35|(0))|21|(1:23)|24|25)(2:15|16))|38|11|(1:13)|18|(0)|26|27|28|(0)|35|(0)|21|(0)|24|25)|41|6|7|8|(0)|38|11|(0)|18|(0)|26|27|28|(0)|35|(0)|21|(0)|24|25) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #1 {Exception -> 0x0029, blocks: (B:8:0x001a, B:10:0x0024), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:28:0x003f, B:30:0x0049), top: B:27:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Activity activity, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        activity.getClass();
        int i = 0;
        try {
            sharedPreferences3 = activity.getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences3.contains("device_rooted")) {
            z10 = sharedPreferences3.getBoolean("device_rooted", false);
            sharedPreferences2 = activity.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences2.contains("system_app")) {
                z11 = sharedPreferences2.getBoolean("system_app", false);
                if (this.Z && I(arrayList)) {
                    N(arrayList);
                    return;
                }
                int i3 = 1;
                if (!z10 || z11) {
                    sharedPreferences = activity.getSharedPreferences("CoreSettings", 0);
                    if (sharedPreferences.contains("user_asked_for_show_permissions")) {
                        z12 = sharedPreferences.getBoolean("user_asked_for_show_permissions", false);
                        if (!z12) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(this);
                            builder.setTitle(getString(R.string.warning_title));
                            builder.setMessage(R.string.msg_dialog_install_auto);
                            builder.setCancelable(false);
                            builder.setPositiveButton(android.R.string.ok, new y(i, arrayList, this));
                            builder.setNegativeButton(android.R.string.cancel, new y(i3, arrayList, this));
                            builder.create().show();
                            return;
                        }
                    }
                    z12 = false;
                    if (!z12) {
                    }
                }
                if (!this.f4485e0) {
                    runOnUiThread(new a0(this, i3));
                }
                new a5.n(activity).k(arrayList, this.f4484d0);
            }
            z11 = false;
            if (this.Z) {
            }
            int i32 = 1;
            if (!z10) {
            }
            sharedPreferences = activity.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences.contains("user_asked_for_show_permissions")) {
            }
            z12 = false;
            if (!z12) {
            }
            if (!this.f4485e0) {
            }
            new a5.n(activity).k(arrayList, this.f4484d0);
        }
        z10 = false;
        sharedPreferences2 = activity.getSharedPreferences("CoreSettings", 0);
        if (sharedPreferences2.contains("system_app")) {
        }
        z11 = false;
        if (this.Z) {
        }
        int i322 = 1;
        if (!z10) {
        }
        sharedPreferences = activity.getSharedPreferences("CoreSettings", 0);
        if (sharedPreferences.contains("user_asked_for_show_permissions")) {
        }
        z12 = false;
        if (!z12) {
        }
        if (!this.f4485e0) {
        }
        new a5.n(activity).k(arrayList, this.f4484d0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(ArrayList arrayList) {
        boolean z10;
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences.contains("warn_installed")) {
            z10 = sharedPreferences.getBoolean("warn_installed", true);
            if (z10) {
                try {
                    if (arrayList.size() == 1) {
                        String name = ((File) arrayList.get(0)).getName();
                        name.getClass();
                        if (v.Y(name, ".apk", false)) {
                            PackageManager packageManager = getPackageManager();
                            packageManager.getClass();
                            String absolutePath = ((File) arrayList.get(0)).getAbsolutePath();
                            absolutePath.getClass();
                            PackageInfo d10 = o.d(packageManager, absolutePath, 0);
                            if (d10 != null) {
                                PackageManager packageManager2 = getPackageManager();
                                packageManager2.getClass();
                                String str = d10.packageName;
                                str.getClass();
                                if (f.d(o.e(packageManager2, str, 0)) == f.d(d10)) {
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            return false;
        }
        z10 = true;
        if (z10) {
        }
        return false;
    }

    public final ArrayList J() {
        String string = getString(R.string.app_name);
        string.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            String[] stringArray = getResources().getStringArray(R.array.messages_info);
            stringArray.getClass();
            for (String str : stringArray) {
                str.getClass();
                if (str.length() > 0) {
                    if (z7.n.h0(str, "%s", false)) {
                        arrayList.add(v.d0(str, "%s", string, false));
                    } else {
                        arrayList.add(str);
                    }
                }
            }
            String[] stringArray2 = getResources().getStringArray(R.array.messages_info_core);
            stringArray2.getClass();
            for (String str2 : stringArray2) {
                str2.getClass();
                if (str2.length() > 0) {
                    if (z7.n.h0(str2, "%s", false)) {
                        arrayList.add(v.d0(str2, "%s", string, false));
                    } else {
                        arrayList.add(str2);
                    }
                }
            }
            return arrayList;
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return arrayList;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02cd, code lost:
    
        r0 = new y4.n();
        r0.f11415a = r14;
        r0.f11417c = r3;
        r0.f11419e = r3;
        r0.f11420f = r13;
        ((java.util.ArrayList) r5.l).add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0263, code lost:
    
        if (r3.equals("armeabi_v7a") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026d, code lost:
    
        if (r3.equals("xhdpi") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x031f, code lost:
    
        r0 = new y4.n();
        r0.f11415a = r14;
        r0.f11417c = r3;
        r0.f11419e = r3;
        r0.f11416b = r3.equalsIgnoreCase(r7);
        r0.f11418d = true;
        r0.f11420f = r13;
        ((java.util.ArrayList) r5.m).add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0277, code lost:
    
        if (r3.equals("tvdpi") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0281, code lost:
    
        if (r3.equals("mips") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x028b, code lost:
    
        if (r3.equals("mdpi") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0294, code lost:
    
        if (r3.equals("ldpi") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x029d, code lost:
    
        if (r3.equals("hdpi") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a6, code lost:
    
        if (r3.equals("x86") != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02af, code lost:
    
        if (r3.equals("armeabi") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b8, code lost:
    
        if (r3.equals("xxhdpi") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c1, code lost:
    
        if (r3.equals("x86_64") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ca, code lost:
    
        if (r3.equals("mips64") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e9, code lost:
    
        if (r3.equals("xxxhdpi") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0259, code lost:
    
        if (r3.equals("arm64_v8a") == false) goto L131;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x024e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(File file, ArrayList arrayList) {
        boolean z10;
        String str;
        Window window;
        boolean z11;
        boolean z12;
        Bundle bundle;
        SharedPreferences sharedPreferences;
        int i = 0;
        try {
            sharedPreferences = getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences.contains("show_installation_details")) {
            z10 = sharedPreferences.getBoolean("show_installation_details", false);
            if (!z10) {
                if (file != null) {
                    str = file.getName();
                } else {
                    str = null;
                }
                android.app.AlertDialog alertDialog = this.U;
                if (alertDialog != null && alertDialog.isShowing()) {
                    android.app.AlertDialog alertDialog2 = this.U;
                    alertDialog2.getClass();
                    alertDialog2.dismiss();
                }
                a5.w wVar = new a5.w(this);
                String string = getString(R.string.dpi_device);
                string.getClass();
                wVar.l = new ArrayList();
                wVar.m = new ArrayList();
                wVar.f185n = new ArrayList();
                wVar.o = new ArrayList();
                String language = Locale.getDefault().getLanguage();
                PackageManager packageManager = getPackageManager();
                Iterator it = arrayList.iterator();
                it.getClass();
                while (true) {
                    int i3 = 2;
                    int i8 = 1;
                    int i10 = -1;
                    if (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        File file2 = (File) next;
                        m3.c cVar = new m3.c(1);
                        try {
                            JarFile jarFile = new JarFile(file2.getAbsolutePath());
                            InputStream inputStream = jarFile.getInputStream(jarFile.getEntry("AndroidManifest.xml"));
                            byte[] bArr = new byte[inputStream.available()];
                            inputStream.read(bArr);
                            cVar.f(bArr);
                        } catch (Exception unused2) {
                        }
                        String sb = ((StringBuilder) cVar.f7816b).toString();
                        try {
                            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                            newInstance.setNamespaceAware(true);
                            XmlPullParser newPullParser = newInstance.newPullParser();
                            newPullParser.setInput(new StringReader(sb));
                            int eventType = newPullParser.getEventType();
                            while (eventType != 1) {
                                if (eventType == i3 && v.a0(newPullParser.getName(), "meta-data", true)) {
                                    int attributeCount = newPullParser.getAttributeCount();
                                    String str2 = null;
                                    Integer num = null;
                                    for (int i11 = i; i11 < attributeCount; i11++) {
                                        if (v.a0(newPullParser.getAttributeName(i11), HintConstants.AUTOFILL_HINT_NAME, true) && v.a0(newPullParser.getAttributeValue(i11), "com.android.vending.derived.apk.id", true)) {
                                            str2 = newPullParser.getAttributeValue(i11);
                                        } else if (v.a0(newPullParser.getAttributeName(i11), "value", true)) {
                                            try {
                                                String attributeValue = newPullParser.getAttributeValue(i11);
                                                attributeValue.getClass();
                                                num = Integer.valueOf(Integer.parseInt(attributeValue));
                                            } catch (NumberFormatException unused3) {
                                            }
                                        }
                                    }
                                    if (str2 != null && str2.length() != 0 && num != null) {
                                        i10 = num.intValue();
                                    }
                                }
                                eventType = newPullParser.next();
                                i = 0;
                                i3 = 2;
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        packageManager.getClass();
                        String absolutePath = file2.getAbsolutePath();
                        absolutePath.getClass();
                        PackageInfo d10 = o.d(packageManager, absolutePath, 128);
                        if (d10 != null && ((b0) wVar.f184b) == null) {
                            ApplicationInfo applicationInfo = d10.applicationInfo;
                            if (applicationInfo != null) {
                                Bundle bundle2 = applicationInfo.metaData;
                                if (bundle2 != null && bundle2.containsKey("com.android.vending.splits.required")) {
                                    ApplicationInfo applicationInfo2 = d10.applicationInfo;
                                    applicationInfo2.getClass();
                                    z12 = applicationInfo2.metaData.getBoolean("com.android.vending.splits.required");
                                } else {
                                    ApplicationInfo applicationInfo3 = d10.applicationInfo;
                                    if (applicationInfo3 != null && (bundle = applicationInfo3.metaData) != null && bundle.containsKey("com.android.vending.splits")) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                }
                                if (z12) {
                                    b0 b0Var = new b0(file2);
                                    wVar.f184b = b0Var;
                                    b0Var.f10558b = i10;
                                    b0Var.f10559c = d10.packageName;
                                    b0Var.f10560d = d10.versionName;
                                    b0Var.f10561e = f.d(d10);
                                } else if (z7.n.h0(sb, "name=\"com.android.vending.splits\"", false)) {
                                    b0 b0Var2 = new b0(file2);
                                    wVar.f184b = b0Var2;
                                    b0Var2.f10558b = i10;
                                } else {
                                    y4.n nVar = new y4.n();
                                    nVar.f11415a = file2;
                                    nVar.f11417c = file2.getName();
                                    nVar.f11419e = file2.getName();
                                    nVar.f11416b = true;
                                    nVar.f11418d = true;
                                    nVar.f11420f = i10;
                                    ((ArrayList) wVar.o).add(nVar);
                                }
                            }
                        } else if (z7.n.h0(sb, "isFeatureSplit=\"-1\"", true)) {
                            y4.n nVar2 = new y4.n();
                            nVar2.f11415a = file2;
                            nVar2.f11419e = file2.getName();
                            nVar2.f11416b = true;
                            nVar2.f11418d = true;
                            nVar2.f11420f = i10;
                            ((ArrayList) wVar.o).add(nVar2);
                        } else if (z7.n.h0(sb, "configForSplit=", false) && !z7.n.h0(sb, "configForSplit=\"\"", false)) {
                            y4.n nVar3 = new y4.n();
                            nVar3.f11415a = file2;
                            nVar3.f11417c = file2.getName();
                            nVar3.f11419e = file2.getName();
                            nVar3.f11416b = true;
                            nVar3.f11418d = true;
                            nVar3.f11420f = i10;
                            ((ArrayList) wVar.o).add(nVar3);
                        } else if (z7.n.h0(sb, "split=\"config.", false)) {
                            String substring = sb.substring(z7.n.q0(sb, "split=\"config.", 0, false, 6) + 14);
                            String substring2 = substring.substring(0, z7.n.q0(substring, "\"", 0, false, 6));
                            switch (substring2.hashCode()) {
                                case -1619189395:
                                    break;
                                case -1073971299:
                                    break;
                                case -806050265:
                                    break;
                                case -745448715:
                                    break;
                                case -738963905:
                                    break;
                                case 117110:
                                    break;
                                case 3197941:
                                    break;
                                case 3317105:
                                    break;
                                case 3346896:
                                    break;
                                case 3351711:
                                    break;
                                case 110743451:
                                    break;
                                case 114020461:
                                    break;
                                case 146933760:
                                    break;
                                case 1433054842:
                                    break;
                                default:
                                    y4.n nVar4 = new y4.n();
                                    try {
                                        Locale build = new Locale.Builder().setLanguage(substring2).build();
                                        nVar4.f11419e = build.getDisplayLanguage(build);
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                    nVar4.f11415a = file2;
                                    nVar4.f11417c = substring2;
                                    nVar4.f11416b = substring2.equalsIgnoreCase(language);
                                    nVar4.f11418d = true;
                                    nVar4.f11420f = i10;
                                    ((ArrayList) wVar.f185n).add(nVar4);
                                    break;
                            }
                        } else {
                            y4.n nVar5 = new y4.n();
                            nVar5.f11415a = file2;
                            nVar5.f11417c = file2.getName();
                            nVar5.f11419e = file2.getName();
                            nVar5.f11416b = true;
                            nVar5.f11418d = true;
                            nVar5.f11420f = i10;
                            ((ArrayList) wVar.o).add(nVar5);
                        }
                        i = 0;
                    } else {
                        b0 b0Var3 = (b0) wVar.f184b;
                        if (b0Var3 != null && b0Var3.f10558b > -1) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = ((ArrayList) wVar.l).iterator();
                            it2.getClass();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                next2.getClass();
                                y4.n nVar6 = (y4.n) next2;
                                b0 b0Var4 = (b0) wVar.f184b;
                                b0Var4.getClass();
                                if (a5.w.e(nVar6, b0Var4.f10558b)) {
                                    arrayList2.add(nVar6);
                                }
                            }
                            wVar.l = arrayList2;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = ((ArrayList) wVar.m).iterator();
                            it3.getClass();
                            while (it3.hasNext()) {
                                Object next3 = it3.next();
                                next3.getClass();
                                y4.n nVar7 = (y4.n) next3;
                                b0 b0Var5 = (b0) wVar.f184b;
                                b0Var5.getClass();
                                if (a5.w.e(nVar7, b0Var5.f10558b)) {
                                    arrayList3.add(nVar7);
                                }
                            }
                            wVar.m = arrayList3;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = ((ArrayList) wVar.f185n).iterator();
                            it4.getClass();
                            while (it4.hasNext()) {
                                Object next4 = it4.next();
                                next4.getClass();
                                y4.n nVar8 = (y4.n) next4;
                                b0 b0Var6 = (b0) wVar.f184b;
                                b0Var6.getClass();
                                if (a5.w.e(nVar8, b0Var6.f10558b)) {
                                    arrayList4.add(nVar8);
                                }
                            }
                            wVar.f185n = arrayList4;
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it5 = ((ArrayList) wVar.o).iterator();
                            it5.getClass();
                            while (it5.hasNext()) {
                                Object next5 = it5.next();
                                next5.getClass();
                                y4.n nVar9 = (y4.n) next5;
                                b0 b0Var7 = (b0) wVar.f184b;
                                b0Var7.getClass();
                                if (a5.w.e(nVar9, b0Var7.f10558b)) {
                                    arrayList5.add(nVar9);
                                }
                            }
                            wVar.o = arrayList5;
                        }
                        q e12 = p.e(Build.SUPPORTED_ABIS);
                        boolean z13 = false;
                        while (e12.hasNext()) {
                            String str3 = (String) e12.next();
                            Iterator it6 = ((ArrayList) wVar.l).iterator();
                            it6.getClass();
                            while (it6.hasNext()) {
                                Object next6 = it6.next();
                                next6.getClass();
                                y4.n nVar10 = (y4.n) next6;
                                String str4 = nVar10.f11417c;
                                if (str4 != null) {
                                    Pattern compile = Pattern.compile("_");
                                    compile.getClass();
                                    String replaceAll = compile.matcher(str4).replaceAll("-");
                                    replaceAll.getClass();
                                    if (v.a0(str3, replaceAll, true)) {
                                        if (!z13) {
                                            nVar10.f11416b = true;
                                            z13 = true;
                                        }
                                        nVar10.f11418d = true;
                                    }
                                }
                            }
                        }
                        Iterator it7 = ((ArrayList) wVar.m).iterator();
                        it7.getClass();
                        while (true) {
                            if (it7.hasNext()) {
                                Object next7 = it7.next();
                                next7.getClass();
                                if (((y4.n) next7).f11416b) {
                                }
                            } else {
                                Iterator it8 = ((ArrayList) wVar.m).iterator();
                                it8.getClass();
                                while (it8.hasNext()) {
                                    Object next8 = it8.next();
                                    next8.getClass();
                                    ((y4.n) next8).f11416b = true;
                                }
                            }
                        }
                        d7.x.j0((ArrayList) wVar.l, new t(0));
                        d7.x.j0((ArrayList) wVar.l, new t(1));
                        d7.x.j0((ArrayList) wVar.m, new t(2));
                        int i12 = 0;
                        d7.x.j0((ArrayList) wVar.m, new a5.v(new u(i12), i12));
                        d7.x.j0((ArrayList) wVar.f185n, new t(3));
                        d7.x.j0((ArrayList) wVar.f185n, new a5.v(new u(i8), i8));
                        d7.x.j0((ArrayList) wVar.o, new t(4));
                        String str5 = null;
                        View inflate = getLayoutInflater().inflate(R.layout.dialog_splits_selector, (ViewGroup) null, false);
                        TextView textView = (TextView) inflate.findViewById(R.id.tv_app_name_dialog_splits);
                        textView.setTypeface(s4.c.u);
                        textView.setText(str);
                        ((TextView) inflate.findViewById(R.id.tv_label_packagename_dialog_splits)).setTypeface(s4.c.u);
                        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_packagename_dialog_splits);
                        textView2.setTypeface(s4.c.v);
                        b0 b0Var8 = (b0) wVar.f184b;
                        if (b0Var8 != null) {
                            str5 = b0Var8.f10559c;
                        }
                        textView2.setText(str5);
                        ((TextView) inflate.findViewById(R.id.tv_label_version_dialog_splits)).setTypeface(s4.c.u);
                        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_version_dialog_splits);
                        textView3.setTypeface(s4.c.v);
                        ((TextView) inflate.findViewById(R.id.tv_label_apps_to_install_dialog_splits)).setTypeface(s4.c.u);
                        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.cb_base_apk_dialog_splits);
                        checkBox.setTypeface(s4.c.v);
                        b0 b0Var9 = (b0) wVar.f184b;
                        if (b0Var9 != null) {
                            textView3.setText(b0Var9.f10560d + " (" + b0Var9.f10561e + ")");
                            b0 b0Var10 = (b0) wVar.f184b;
                            b0Var10.getClass();
                            checkBox.setText(b0Var10.f10557a.getName());
                        }
                        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_label_arquitecture_dialog_splits);
                        textView4.setTypeface(s4.c.u);
                        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_device_supported_abis_dialog_splits);
                        textView5.setTypeface(s4.c.v);
                        View findViewById = inflate.findViewById(R.id.rv_arquitecture_dialog_splits);
                        findViewById.getClass();
                        RecyclerView recyclerView = (RecyclerView) findViewById;
                        if (!((ArrayList) wVar.l).isEmpty()) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
                            recyclerView.addItemDecoration(new s((int) getResources().getDimension(R.dimen.margin_generic_item_recyclerview)));
                            recyclerView.setItemAnimator(new DefaultItemAnimator());
                            recyclerView.setAdapter(new v4.c((ArrayList) wVar.l, new t4.d0(wVar, 0)));
                            String[] strArr = Build.SUPPORTED_ABIS;
                            if (strArr != null) {
                                if (strArr.length == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    StringBuilder sb2 = new StringBuilder();
                                    int length = strArr.length;
                                    for (int i13 = 0; i13 < length; i13++) {
                                        if (i13 == 0) {
                                            sb2 = new StringBuilder(android.support.v4.media.session.m.l("(", strArr[i13]));
                                        } else {
                                            sb2.append(",");
                                            sb2.append(strArr[i13]);
                                        }
                                    }
                                    sb2.append(")");
                                    String string2 = getString(R.string.device_supported_abis_split_selector);
                                    string2.getClass();
                                    textView5.setText(String.format(string2, Arrays.copyOf(new Object[]{sb2.toString()}, 1)));
                                }
                            }
                            textView5.setVisibility(8);
                        } else {
                            recyclerView.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            inflate.findViewById(R.id.separator_abis_split_selector).setVisibility(8);
                        }
                        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_label_dpi_dialog_splits);
                        textView6.setTypeface(s4.c.u);
                        TextView textView7 = (TextView) inflate.findViewById(R.id.tv_device_supported_pdis_dialog_splits);
                        textView7.setTypeface(s4.c.v);
                        View findViewById2 = inflate.findViewById(R.id.rv_dpi_dialog_splits);
                        findViewById2.getClass();
                        RecyclerView recyclerView2 = (RecyclerView) findViewById2;
                        if (!((ArrayList) wVar.m).isEmpty()) {
                            recyclerView2.setLayoutManager(new LinearLayoutManager(this, 1, false));
                            recyclerView2.addItemDecoration(new s((int) getResources().getDimension(R.dimen.margin_generic_item_recyclerview)));
                            recyclerView2.setItemAnimator(new DefaultItemAnimator());
                            recyclerView2.setAdapter(new v4.c((ArrayList) wVar.m, new e0(wVar, 0)));
                            String string3 = getString(R.string.device_supported_dpis_split_selector);
                            string3.getClass();
                            textView7.setText(String.format(string3, Arrays.copyOf(new Object[]{getString(R.string.dpi_device)}, 1)));
                        } else {
                            recyclerView2.setVisibility(8);
                            textView6.setVisibility(8);
                            textView7.setVisibility(8);
                            inflate.findViewById(R.id.separator_dpis_split_selector).setVisibility(8);
                        }
                        TextView textView8 = (TextView) inflate.findViewById(R.id.tv_label_lang_dialog_splits);
                        textView8.setTypeface(s4.c.u);
                        TextView textView9 = (TextView) inflate.findViewById(R.id.tv_device_lang_dialog_splits);
                        textView9.setTypeface(s4.c.v);
                        View findViewById3 = inflate.findViewById(R.id.rv_lang_dialog_splits);
                        findViewById3.getClass();
                        RecyclerView recyclerView3 = (RecyclerView) findViewById3;
                        if (!((ArrayList) wVar.f185n).isEmpty()) {
                            recyclerView3.setLayoutManager(new LinearLayoutManager(this, 1, false));
                            recyclerView3.addItemDecoration(new s((int) getResources().getDimension(R.dimen.margin_generic_item_recyclerview)));
                            recyclerView3.setItemAnimator(new DefaultItemAnimator());
                            recyclerView3.setAdapter(new v4.c((ArrayList) wVar.f185n, new e0(wVar, i8)));
                            textView9.setText(getString(R.string.device_lang_split_selector));
                        } else {
                            recyclerView3.setVisibility(8);
                            textView8.setVisibility(8);
                            textView9.setVisibility(8);
                            inflate.findViewById(R.id.separator_lang_split_selector).setVisibility(8);
                        }
                        TextView textView10 = (TextView) inflate.findViewById(R.id.tv_label_features_dialog_splits);
                        textView10.setTypeface(s4.c.u);
                        TextView textView11 = (TextView) inflate.findViewById(R.id.tv_device_features_dialog_splits);
                        textView11.setTypeface(s4.c.v);
                        View findViewById4 = inflate.findViewById(R.id.rv_features_dialog_splits);
                        findViewById4.getClass();
                        RecyclerView recyclerView4 = (RecyclerView) findViewById4;
                        if (!((ArrayList) wVar.o).isEmpty()) {
                            recyclerView4.setLayoutManager(new LinearLayoutManager(this, 1, false));
                            recyclerView4.addItemDecoration(new s((int) getResources().getDimension(R.dimen.margin_generic_item_recyclerview)));
                            recyclerView4.setItemAnimator(new DefaultItemAnimator());
                            recyclerView4.setAdapter(new v4.c((ArrayList) wVar.o, new t4.d0(wVar, i8)));
                        } else {
                            recyclerView4.setVisibility(8);
                            textView10.setVisibility(8);
                            textView11.setVisibility(8);
                            inflate.findViewById(R.id.separator_features_split_selector).setVisibility(8);
                        }
                        TextView textView12 = (TextView) inflate.findViewById(R.id.tv_install_dialog_splits);
                        textView12.setTypeface(s4.c.u);
                        textView12.setOnClickListener(new q2(22, this, wVar));
                        TextView textView13 = (TextView) inflate.findViewById(R.id.tv_cancel_dialog_splits);
                        textView13.setTypeface(s4.c.u);
                        textView13.setOnClickListener(new x(this, 2));
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setView(inflate);
                        builder.setCancelable(true);
                        this.U = builder.create();
                        if (!isFinishing()) {
                            android.app.AlertDialog alertDialog3 = this.U;
                            if (alertDialog3 != null && (window = alertDialog3.getWindow()) != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            android.app.AlertDialog alertDialog4 = this.U;
                            if (alertDialog4 != null) {
                                alertDialog4.show();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            } else {
                H(this, arrayList);
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final void L(String str) {
        if (str != null && new File(str).exists()) {
            if (new File(str).isDirectory()) {
                ArrayList arrayList = new ArrayList();
                File[] listFiles = new File(str).listFiles();
                if (listFiles != null) {
                    d7.y.m0(arrayList, listFiles);
                    K(null, arrayList);
                    return;
                }
                return;
            }
            if (!v.Y(str, ".xapk", true) && !v.Y(str, ".apks", true) && !v.Y(str, ".apkm", true) && !v.Y(str, ".zip", true)) {
                if (v.Y(str, ".apk", false)) {
                    G(this, new File(str));
                    return;
                }
                String string = getString(R.string.installable_files_not_found);
                string.getClass();
                A(string);
                finish();
                return;
            }
            c cVar = this.Y;
            cVar.getClass();
            new c9.d(this, str, cVar, m());
            return;
        }
        String string2 = getString(R.string.installable_files_not_found);
        string2.getClass();
        A(string2);
        finish();
    }

    public final void M(String str) {
        str.getClass();
        TextView textView = this.L;
        if (textView != null) {
            textView.setText(str);
        }
        ProgressBar progressBar = this.f4489y;
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
        getWindow().clearFlags(128);
        x1 x1Var = this.X;
        if (x1Var != null) {
            x1Var.cancel(null);
        }
        TextView textView2 = this.f4490z;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        TextView textView3 = this.N;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        TextView textView4 = this.N;
        if (textView4 != null) {
            textView4.setOnClickListener(new x(this, 4));
        }
        A(str);
    }

    public final void N(ArrayList arrayList) {
        android.app.AlertDialog alertDialog;
        android.app.AlertDialog alertDialog2 = this.V;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            android.app.AlertDialog alertDialog3 = this.V;
            alertDialog3.getClass();
            alertDialog3.dismiss();
        }
        Window window = null;
        View inflate = getLayoutInflater().inflate(R.layout.dialog_installed_version, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.tv_msg_installed_version)).setTypeface(s4.c.v);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.cb_not_again_installed_version);
        checkBox.setTypeface(s4.c.v);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_install);
        textView.setTypeface(s4.c.u);
        textView.setOnClickListener(new a6.c(this, checkBox, arrayList, 16));
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_cancel);
        textView2.setTypeface(s4.c.u);
        textView2.setOnClickListener(new x(this, 1));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        android.app.AlertDialog create = builder.create();
        this.V = create;
        if (create != null) {
            window = create.getWindow();
        }
        window.getClass();
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (!isFinishing() && (alertDialog = this.V) != null) {
            alertDialog.show();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (c8.f0.K(r12, r4, r0) != r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (c8.f0.K(r13, r4, r0) == r10) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(int i, i7.c cVar) {
        t4.i0 i0Var;
        int i3;
        kotlin.jvm.internal.h0 w6;
        if (cVar instanceof t4.i0) {
            i0Var = (t4.i0) cVar;
            int i8 = i0Var.f10601n;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                i0Var.f10601n = i8 - Integer.MIN_VALUE;
                Object obj = i0Var.l;
                i3 = i0Var.f10601n;
                g7.c cVar2 = null;
                a aVar = a.f6117a;
                if (i3 == 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            c7.a.e(obj);
                            return z.f3538a;
                        }
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = i0Var.f10599a;
                    w6 = i0Var.f10600b;
                    c7.a.e(obj);
                } else {
                    w6 = android.support.v4.media.session.m.w(obj);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    l5.a aVar2 = new l5.a(this, w6, null, 2);
                    i0Var.f10600b = w6;
                    i0Var.f10599a = i;
                    i0Var.f10601n = 1;
                }
                int i10 = i;
                kotlin.jvm.internal.h0 h0Var = w6;
                e eVar2 = p0.f3588a;
                d8.c cVar3 = n.f6148a;
                b3 b3Var = new b3(this, i10, h0Var, cVar2, 23);
                i0Var.f10600b = null;
                i0Var.f10599a = i10;
                i0Var.f10601n = 2;
            }
        }
        i0Var = new t4.i0(this, cVar);
        Object obj2 = i0Var.l;
        i3 = i0Var.f10601n;
        g7.c cVar22 = null;
        a aVar3 = a.f6117a;
        if (i3 == 0) {
        }
        int i102 = i;
        kotlin.jvm.internal.h0 h0Var2 = w6;
        e eVar22 = p0.f3588a;
        d8.c cVar32 = n.f6148a;
        b3 b3Var2 = new b3(this, i102, h0Var2, cVar22, 23);
        i0Var.f10600b = null;
        i0Var.f10599a = i102;
        i0Var.f10601n = 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        TextView textView;
        super.onCreate(bundle);
        s4.a aVar = s4.a.f10430a;
        int i = 3;
        int i3 = 1;
        g7.c cVar = null;
        if (aVar.c() == null && s4.c.t == null) {
            E();
        } else {
            setContentView(R.layout.installer_activity_dialog);
            this.f4482b0 = true;
            s4.a.f10433d.c(l.f11414a);
            TextView textView2 = (TextView) findViewById(R.id.tv_header_ready_to_install);
            this.A = textView2;
            textView2.getClass();
            textView2.setTypeface(s4.c.u);
            this.B = (ImageView) findViewById(R.id.iv_app_to_install);
            TextView textView3 = (TextView) findViewById(R.id.tv_app_to_install_name);
            this.C = textView3;
            textView3.getClass();
            textView3.setTypeface(s4.c.u);
            TextView textView4 = (TextView) findViewById(R.id.tv_app_to_install_filename);
            this.D = textView4;
            textView4.getClass();
            textView4.setTypeface(s4.c.v);
            TextView textView5 = (TextView) findViewById(R.id.tv_installation_in_progress_title);
            this.J = textView5;
            textView5.getClass();
            textView5.setTypeface(s4.c.v);
            TextView textView6 = (TextView) findViewById(R.id.tv_cancel_installer_activity);
            this.N = textView6;
            textView6.getClass();
            textView6.setTypeface(s4.c.u);
            TextView textView7 = this.N;
            textView7.getClass();
            textView7.setOnClickListener(new x(this, 0));
            TextView textView8 = (TextView) findViewById(R.id.tv_install_installer_activity);
            this.M = textView8;
            textView8.getClass();
            textView8.setTypeface(s4.c.u);
            TextView textView9 = this.M;
            textView9.getClass();
            textView9.setOnClickListener(new x(this, i));
            this.f4489y = (ProgressBar) findViewById(R.id.pb_installer_activity);
            TextView textView10 = (TextView) findViewById(R.id.tv_installation_in_progress_filename);
            this.K = textView10;
            textView10.getClass();
            textView10.setTypeface(s4.c.v);
            y4.a c10 = aVar.c();
            if (c10 != null) {
                str = c10.f11391c;
            } else {
                str = null;
            }
            if (str != null && (textView = this.K) != null) {
                textView.setText(str);
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f4487g0);
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new t4.f0(this, cVar, i3), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        x1 x1Var = this.X;
        if (x1Var != null) {
            x1Var.cancel(null);
        }
        getWindow().clearFlags(128);
    }

    @Override // t4.g
    public final void w() {
        c cVar;
        if (m() && !new File("/Android/obb").canRead() && (cVar = this.Y) != null) {
            cVar.n();
        }
    }

    @Override // t4.g
    public final void p() {
    }

    @Override // t4.g
    public final void q() {
    }

    @Override // t4.g
    public final void r() {
    }

    @Override // t4.g
    public final void s() {
    }

    @Override // t4.g
    public final void u() {
    }
}

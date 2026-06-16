package com.uptodown.workers;

import a5.n;
import a5.o;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b6.k;
import b6.t;
import c7.q;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.UptodownApp;
import d7.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import k5.e;
import k5.j0;
import k5.p2;
import k5.r;
import kotlin.jvm.internal.p;
import n5.f;
import o4.a0;
import q1.e0;
import s4.c;
import s7.a;
import w5.g;
import w5.l;
import z1.b;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class InstallUpdatesWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallUpdatesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4537a = context;
        Activity activity = c.o;
        this.f4537a = b.j(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableWorker.Result doWork() {
        boolean z10;
        PackageInfo packageInfo;
        boolean z11;
        ApplicationInfo applicationInfo;
        File file;
        File file2;
        e B;
        boolean z12;
        r rVar;
        boolean z13;
        int i = Build.VERSION.SDK_INT;
        boolean z14 = false;
        InstallUpdatesWorker installUpdatesWorker = this;
        Context context = installUpdatesWorker.f4537a;
        if (i >= 31) {
            context.getClass();
            String A = a.A(context, "updates_mobile_data", "notify");
            String A2 = a.A(context, "updates_wifi", "auto");
            if ((A.equalsIgnoreCase("auto") || A2.equalsIgnoreCase("auto")) && !w5.a.f(context) && s4.a.f10430a.c() == null) {
                Object systemService = context.getSystemService("display");
                systemService.getClass();
                q e10 = p.e(((DisplayManager) systemService).getDisplays());
                while (true) {
                    if (e10.hasNext()) {
                        if (((Display) e10.next()).getState() != 1) {
                            z13 = true;
                            break;
                        }
                    } else {
                        z13 = false;
                        break;
                    }
                }
                z10 = !z13;
                if (z10) {
                    e0 e0Var = g.D;
                    Context applicationContext = installUpdatesWorker.getApplicationContext();
                    applicationContext.getClass();
                    g f7 = e0Var.f(applicationContext);
                    f7.b();
                    ArrayList a02 = f7.a0();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a02.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        p2 p2Var = (p2) next;
                        if (!p2Var.c() && p2Var.r < 3 && (B = f7.B(p2Var.f7479b)) != null) {
                            if (!v.a0(context.getPackageName(), B.l, true) && (B.v != 0 || !B.b(context))) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12 && (rVar = p2Var.s) != null && rVar.c()) {
                                arrayList.add(p2Var);
                            }
                        }
                    }
                    f7.d();
                    if (arrayList.size() > 1) {
                        x.j0(arrayList, new k(0));
                    }
                    Iterator it2 = arrayList.iterator();
                    it2.getClass();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        next2.getClass();
                        p2 p2Var2 = (p2) next2;
                        String str = p2Var2.f7479b;
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            packageManager.getClass();
                            r rVar2 = p2Var2.s;
                            rVar2.getClass();
                            String str2 = rVar2.f7495b;
                            str2.getClass();
                            packageInfo = o.e(packageManager, str2, 128);
                        } catch (PackageManager.NameNotFoundException unused) {
                            packageInfo = null;
                        }
                        if (packageInfo != null && packageInfo.applicationInfo != null) {
                            n nVar = new n(context);
                            ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                            applicationInfo2.getClass();
                            if (n.l(applicationInfo2.targetSdkVersion)) {
                                String packageName = context.getPackageName();
                                r rVar3 = p2Var2.s;
                                rVar3.getClass();
                                String str3 = rVar3.f7495b;
                                str3.getClass();
                                if (p.b(packageName, w5.a.b(context, str3))) {
                                    ArrayList arrayList2 = new ArrayList();
                                    if (p2Var2.p == 1) {
                                        r rVar4 = p2Var2.s;
                                        rVar4.getClass();
                                        File g = rVar4.g();
                                        g.getClass();
                                        if (g.isFile()) {
                                            g = g.getParentFile();
                                        }
                                        File file3 = g;
                                        try {
                                            PackageManager packageManager2 = context.getPackageManager();
                                            packageManager2.getClass();
                                            applicationInfo = o.b(packageManager2, str, 128);
                                        } catch (PackageManager.NameNotFoundException e11) {
                                            e11.printStackTrace();
                                            applicationInfo = null;
                                        }
                                        if (applicationInfo != null) {
                                            file = new File(applicationInfo.sourceDir);
                                        } else {
                                            file = null;
                                        }
                                        if (file != null && file3 != null && file3.getUsableSpace() >= file.length()) {
                                            if (file3.isDirectory()) {
                                                file2 = new File(androidx.compose.foundation.gestures.x.m(file3.getAbsolutePath(), "/", file.getName()));
                                            } else {
                                                file2 = file3;
                                            }
                                            if (!file2.isFile() || !file2.exists()) {
                                                try {
                                                    FileInputStream fileInputStream = new FileInputStream(file);
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                    byte[] bArr = new byte[1024];
                                                    while (true) {
                                                        int read = fileInputStream.read(bArr);
                                                        if (read <= 0) {
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr, 0, read);
                                                    }
                                                    fileInputStream.close();
                                                    fileOutputStream.close();
                                                } catch (FileNotFoundException | SecurityException unused2) {
                                                }
                                            }
                                        }
                                        file.getClass();
                                        arrayList2.add(new File(file3, file.getName()));
                                    }
                                    r rVar5 = p2Var2.s;
                                    rVar5.getClass();
                                    Iterator it3 = rVar5.F.iterator();
                                    it3.getClass();
                                    while (it3.hasNext()) {
                                        Object next3 = it3.next();
                                        next3.getClass();
                                        j0 j0Var = (j0) next3;
                                        if (j0Var.q != null) {
                                            String str4 = j0Var.q;
                                            str4.getClass();
                                            arrayList2.add(new File(str4));
                                        }
                                    }
                                    p2Var2.r++;
                                    e0 e0Var2 = g.D;
                                    Context applicationContext2 = installUpdatesWorker.getApplicationContext();
                                    applicationContext2.getClass();
                                    g f10 = e0Var2.f(applicationContext2);
                                    f10.b();
                                    f10.p0(p2Var2);
                                    f10.d();
                                    if (p2Var2.r == 3) {
                                        Bundle k10 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "max_attempts", "packagename", str);
                                        r rVar6 = p2Var2.s;
                                        if (rVar6 != null && rVar6.q > 0) {
                                            rVar6.getClass();
                                            k10.putString("appId", String.valueOf(rVar6.q));
                                        }
                                        k10.putString("updateOrigin", f.a(str));
                                        new a0(context, 22).u(k10, "install");
                                    }
                                    if (arrayList2.size() == 1) {
                                        String absolutePath = ((File) arrayList2.get(0)).getAbsolutePath();
                                        absolutePath.getClass();
                                        if (!v.Y(absolutePath, ".xapk", true) && !v.Y(absolutePath, ".apks", true) && !v.Y(absolutePath, ".apkm", true) && !v.Y(absolutePath, ".zip", true)) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        if (z11) {
                                            float f11 = UptodownApp.G;
                                            Object obj = arrayList2.get(0);
                                            obj.getClass();
                                            n4.e.p(context, null, (File) obj);
                                            z14 = true;
                                        }
                                    }
                                    nVar.k(arrayList2, false);
                                    Bundle bundle = new Bundle();
                                    bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start");
                                    bundle.putString("packagename", str);
                                    bundle.putInt("update", 1);
                                    r rVar7 = p2Var2.s;
                                    if (rVar7 != null && rVar7.q > 0) {
                                        rVar7.getClass();
                                        bundle.putString("appId", String.valueOf(rVar7.q));
                                    }
                                    bundle.putString("updateOrigin", f.a(str));
                                    new a0(context, 22).u(bundle, "install");
                                    z14 = true;
                                }
                            } else {
                                continue;
                            }
                        }
                        installUpdatesWorker = this;
                    }
                }
                if (!z14) {
                    l.l(context);
                    t.a(context, null);
                }
                ListenableWorker.Result success = ListenableWorker.Result.success();
                success.getClass();
                return success;
            }
        }
        z10 = false;
        if (z10) {
        }
        if (!z14) {
        }
        ListenableWorker.Result success2 = ListenableWorker.Result.success();
        success2.getClass();
        return success2;
    }
}

package com.uptodown.workers;

import a5.f;
import a5.o;
import a5.x;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.a4;
import f5.y;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o2.a;
import s4.c;
import w5.g;
import w5.l;
import z1.b;
import z7.n;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SearchApksWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4540a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchApksWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4540a = context;
        Activity activity = c.o;
        this.f4540a = b.j(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0192  */
    /* JADX WARN: Type inference failed for: r10v0, types: [f5.y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(File file, int i) {
        PackageInfo packageInfo;
        long d10;
        long j;
        long j10;
        y yVar;
        PackageManager packageManager;
        ?? obj;
        ApplicationInfo applicationInfo;
        Drawable drawable;
        String name = file.getName();
        name.getClass();
        boolean Y = v.Y(name, ".apk", false);
        Context context = this.f4540a;
        PackageInfo packageInfo2 = null;
        if (Y) {
            try {
                PackageManager packageManager2 = context.getPackageManager();
                packageManager2.getClass();
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                packageInfo = o.d(packageManager2, absolutePath, 128);
                if (packageInfo != null) {
                    try {
                        PackageManager packageManager3 = context.getPackageManager();
                        if (packageManager3 != null) {
                            String str = packageInfo.packageName;
                            str.getClass();
                            packageInfo2 = o.e(packageManager3, str, 0);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                d10 = f.d(packageInfo);
                j = -1;
                if (packageInfo2 == null) {
                    j10 = f.d(packageInfo2);
                } else {
                    j10 = j;
                }
                if (j10 <= j) {
                    if (d10 > j) {
                        if (j10 > d10) {
                            l.d(context, file, false, i);
                            return true;
                        }
                        if (j10 < d10) {
                            l.d(context, file, true, i);
                            return true;
                        }
                        l.d(context, file, false, i);
                        return true;
                    }
                    return false;
                }
                l.d(context, file, true, i);
                return true;
            }
        } else {
            String name2 = file.getName();
            name2.getClass();
            if (v.Y(name2, ".xapk", true) || v.Y(name2, ".apks", true) || v.Y(name2, ".apkm", true) || v.Y(name2, ".zip", true)) {
                context.getClass();
                File file2 = new File(context.getExternalFilesDir(null), "tmp");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                String name3 = file.getName();
                name3.getClass();
                String name4 = file.getName();
                name4.getClass();
                File file3 = new File(file2, name3.substring(0, n.t0(".", name4, 6)));
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                if (c3.f.E(file, file3)) {
                    File[] listFiles = file3.listFiles();
                    if (listFiles == null || listFiles.length == 0) {
                        j = -1;
                        yVar = null;
                    } else {
                        PackageManager packageManager4 = context.getPackageManager();
                        int i3 = 0;
                        yVar = null;
                        while (i3 < listFiles.length) {
                            int i8 = i3 + 1;
                            try {
                                File file4 = listFiles[i3];
                                packageManager4.getClass();
                                String absolutePath2 = file4.getAbsolutePath();
                                absolutePath2.getClass();
                                PackageInfo d11 = o.d(packageManager4, absolutePath2, 128);
                                if (d11 != null) {
                                    try {
                                        long d12 = f.d(d11);
                                        String str2 = d11.packageName;
                                        str2.getClass();
                                        obj = new Object();
                                        obj.f5144b = str2;
                                        obj.f5143a = d12;
                                    } catch (Exception e10) {
                                        e = e10;
                                    }
                                    try {
                                        HashMap hashMap = x.f186a;
                                        if (((Drawable) hashMap.get(file.getName())) == null) {
                                            String absolutePath3 = file4.getAbsolutePath();
                                            absolutePath3.getClass();
                                            PackageManager packageManager5 = context.getPackageManager();
                                            packageManager5.getClass();
                                            PackageInfo d13 = o.d(packageManager5, absolutePath3, 128);
                                            if (d13 != null) {
                                                applicationInfo = d13.applicationInfo;
                                            } else {
                                                applicationInfo = null;
                                            }
                                            if (applicationInfo != null) {
                                                ApplicationInfo applicationInfo2 = d13.applicationInfo;
                                                applicationInfo2.getClass();
                                                applicationInfo2.sourceDir = absolutePath3;
                                                ApplicationInfo applicationInfo3 = d13.applicationInfo;
                                                applicationInfo3.getClass();
                                                applicationInfo3.publicSourceDir = absolutePath3;
                                                ApplicationInfo applicationInfo4 = d13.applicationInfo;
                                                applicationInfo4.getClass();
                                                drawable = applicationInfo4.loadIcon(context.getPackageManager());
                                            } else {
                                                drawable = null;
                                            }
                                            hashMap.put(file.getName(), drawable);
                                        }
                                        yVar = obj;
                                    } catch (Exception e11) {
                                        e = e11;
                                        yVar = obj;
                                        e.printStackTrace();
                                        file4.delete();
                                        i3 = i8;
                                    }
                                }
                                try {
                                    file4.delete();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                i3 = i8;
                            } catch (ArrayIndexOutOfBoundsException e13) {
                                a.f(e13.getMessage());
                                return false;
                            }
                        }
                        j = -1;
                    }
                    if (file3.exists()) {
                        a4.l(file3);
                    }
                } else {
                    j = -1;
                    yVar = null;
                }
                if (yVar != null) {
                    d10 = yVar.f5143a;
                    try {
                        packageManager = context.getPackageManager();
                    } catch (PackageManager.NameNotFoundException unused3) {
                    }
                    if (packageManager != null) {
                        packageInfo2 = o.e(packageManager, (String) yVar.f5144b, 0);
                        if (packageInfo2 == null) {
                        }
                        if (j10 <= j) {
                        }
                    }
                    packageInfo2 = null;
                    if (packageInfo2 == null) {
                    }
                    if (j10 <= j) {
                    }
                }
                return false;
            }
        }
        d10 = -1;
        j = -1;
        if (packageInfo2 == null) {
        }
        if (j10 <= j) {
        }
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        boolean z10;
        Context context = this.f4540a;
        ListenableWorker.Result success = ListenableWorker.Result.success();
        success.getClass();
        try {
            ArrayList C = c3.f.C(context);
            g f7 = g.D.f(context);
            f7.b();
            ArrayList S = f7.S();
            Iterator it = C.iterator();
            it.getClass();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                File file = (File) next;
                Iterator it2 = S.iterator();
                int i3 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        int i8 = i3 + 1;
                        if (v.a0(file.getAbsolutePath(), (String) it2.next(), false)) {
                            z10 = true;
                            break;
                        }
                        i3 = i8;
                    } else {
                        i3 = -1;
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    S.remove(i3);
                } else if (i < 10 && d(file, i)) {
                    String absolutePath = file.getAbsolutePath();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("path", absolutePath);
                    SQLiteDatabase sQLiteDatabase = f7.f11192a;
                    sQLiteDatabase.getClass();
                    sQLiteDatabase.insert("installable_files", null, contentValues);
                    i++;
                }
            }
            Iterator it3 = S.iterator();
            it3.getClass();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                next2.getClass();
                SQLiteDatabase sQLiteDatabase2 = f7.f11192a;
                sQLiteDatabase2.getClass();
                sQLiteDatabase2.delete("installable_files", "path=?", new String[]{(String) next2});
            }
            f7.d();
            return success;
        } catch (Exception e10) {
            e10.printStackTrace();
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            failure.getClass();
            return failure;
        }
    }
}

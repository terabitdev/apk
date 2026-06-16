package com.uptodown.workers;

import a.a;
import a3.i;
import a5.f;
import a5.o;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import b6.e;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyDownloads;
import f8.l1;
import j8.d;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import k5.a2;
import k5.b0;
import k5.c0;
import k5.e0;
import k5.f0;
import k5.g0;
import k5.g2;
import k5.h0;
import k5.j0;
import k5.k;
import k5.k0;
import k5.r;
import k5.t;
import k5.u;
import k5.v;
import k5.w;
import k5.x;
import k5.y;
import k5.z;
import o4.a0;
import o4.b1;
import org.json.JSONObject;
import s4.c;
import w5.g;
import w5.l;
import w5.s;
import z1.b;
import z7.n;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DownloadApkWorker extends DownloadWorker {

    /* renamed from: e, reason: collision with root package name */
    public final String f4523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadApkWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Cursor cursor;
        r rVar;
        int i;
        context.getClass();
        workerParameters.getClass();
        Activity activity = c.o;
        Context j = b.j(this.f4526a);
        this.f4526a = j;
        this.f4527b = new a0(j, 22);
        int i3 = workerParameters.getInputData().getInt("downloadId", -1);
        if (i3 >= 0) {
            g f7 = g.D.f(this.f4526a);
            f7.b();
            r rVar2 = null;
            try {
                String[] strArr = {String.valueOf(i3)};
                SQLiteDatabase sQLiteDatabase = f7.f11192a;
                sQLiteDatabase.getClass();
                cursor = sQLiteDatabase.query("downloads", f7.f11194n, "id=?", strArr, null, null, null);
            } catch (Exception e10) {
                e = e10;
                cursor = null;
            }
            try {
                if (cursor.moveToFirst()) {
                    rVar = g.i0(cursor);
                } else {
                    rVar = null;
                }
                cursor.close();
                if (rVar != null && (i = rVar.f7494a) >= 0) {
                    rVar.F = f7.N(i);
                }
                rVar2 = rVar;
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                this.f4529d = rVar2;
                f7.d();
                this.f4523e = workerParameters.getInputData().getString("url");
            }
            this.f4529d = rVar2;
            f7.d();
        }
        this.f4523e = workerParameters.getInputData().getString("url");
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void A() {
        n5.b.h();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void B(r rVar) {
        rVar.getClass();
        l1 l1Var = n5.b.f8317a;
        n5.b.i(g0.f7386a);
        n5.b.f8319c.c(new w(rVar));
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void C(int i, r rVar) {
        rVar.getClass();
        g0 g0Var = g0.f7386a;
        switch (i) {
            case 199:
                l1 l1Var = n5.b.f8317a;
                n5.b.f8319c.c(new y(rVar));
                return;
            case 200:
                l1 l1Var2 = n5.b.f8317a;
                n5.b.i(new f0(rVar));
                n5.b.f8319c.c(new c0(rVar));
                return;
            case ComposerKt.providerKey /* 201 */:
                l1 l1Var3 = n5.b.f8317a;
                n5.b.i(new f0(rVar));
                n5.b.f8319c.c(new b0(rVar));
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
                n5.b.i(g0Var);
                n5.b.f8319c.c(new x(rVar));
                return;
            case ComposerKt.providerValuesKey /* 203 */:
            case ComposerKt.providerMapsKey /* 204 */:
            case 209:
            case 210:
            default:
                return;
            case 205:
                l1 l1Var4 = n5.b.f8317a;
                n5.b.f8319c.c(new v(rVar));
                return;
            case ComposerKt.referenceKey /* 206 */:
                l1 l1Var5 = n5.b.f8317a;
                n5.b.f8319c.c(new u(rVar));
                return;
            case ComposerKt.reuseKey /* 207 */:
                l1 l1Var6 = n5.b.f8317a;
                n5.b.f8319c.c(new t(rVar));
                return;
            case 208:
                n5.b.i(g0Var);
                n5.b.f8319c.c(k5.a0.f7287a);
                return;
            case 211:
                l1 l1Var7 = n5.b.f8317a;
                n5.b.i(new h0(rVar));
                return;
        }
    }

    public final void D() {
        k kVar = UptodownApp.f4380e0;
        if (kVar != null && this.f4529d != null && kVar.f7424e > -1) {
            kVar.getClass();
            int i = kVar.f7423d;
            r rVar = this.f4529d;
            rVar.getClass();
            if (i == rVar.f7494a) {
                s sVar = new s(this.f4526a);
                k kVar2 = UptodownApp.f4380e0;
                kVar2.getClass();
                String k10 = androidx.compose.foundation.gestures.x.k(kVar2.f7424e, "/eapi/deep-link-hash/");
                g2 k11 = sVar.k("https://www.uptodown.app:443".concat(k10), null, "DELETE", false);
                k11.f7392d = sVar.i(k11, k10);
                k kVar3 = UptodownApp.f4380e0;
                if (kVar3 != null) {
                    kVar3.f7424e = -1L;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00e2  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.g0] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, kotlin.jvm.internal.g0, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(r rVar) {
        z zVar;
        r rVar2;
        r rVar3;
        long j;
        boolean z10;
        int i;
        int i3;
        long j10;
        g2 w6;
        int i8;
        String str;
        String str2;
        File externalFilesDir;
        long j11;
        boolean z11;
        boolean z12;
        k5.b bVar;
        int i10;
        SharedPreferences sharedPreferences;
        int i11;
        boolean z13;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        String str3;
        PackageInfo packageInfo;
        PackageManager packageManager;
        DownloadApkWorker downloadApkWorker = this;
        r rVar4 = rVar;
        long j12 = 0;
        ?? r13 = 0;
        String str4 = null;
        int i12 = 1;
        if (rVar4.B == 1) {
            Bundle bundle = new Bundle();
            long j13 = rVar4.q;
            if (j13 >= 0) {
                bundle.putString("appId", String.valueOf(j13));
            }
            String str5 = rVar4.f7495b;
            if (str5 != null) {
                bundle.putString("packagename", str5);
                try {
                    packageManager = downloadApkWorker.f4526a.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageManager != null) {
                    String str6 = rVar4.f7495b;
                    str6.getClass();
                    packageInfo = o.e(packageManager, str6, 0);
                    if (packageInfo != null) {
                        long d10 = f.d(packageInfo);
                        if (d10 > -1) {
                            bundle.putString("fromVersionCode", String.valueOf(d10));
                        }
                    }
                }
                packageInfo = null;
                if (packageInfo != null) {
                }
            }
            long j14 = rVar4.f7496n;
            if (j14 > -1) {
                bundle.putString("toVersionCode", String.valueOf(j14));
            }
            a0 a0Var = downloadApkWorker.f4527b;
            if (a0Var != null) {
                a0Var.u(bundle, "rollback_started");
            }
        }
        int size = rVar4.F.size();
        int i13 = 0;
        while (true) {
            zVar = z.f7575a;
            if (i13 >= size) {
                break;
            }
            if (!downloadApkWorker.p() && !downloadApkWorker.isStopped()) {
                if (!a4.f3693b) {
                    n5.b.f8319c.c(zVar);
                    str2 = str4;
                } else {
                    if (i13 == 0) {
                        downloadApkWorker.C(199, rVar4);
                    }
                    s sVar = new s(downloadApkWorker.f4526a);
                    if (((j0) rVar4.F.get(i13)).q != null) {
                        String str7 = ((j0) rVar4.F.get(i13)).q;
                        str7.getClass();
                        File file = new File(str7);
                        if (file.exists()) {
                            j10 = file.length();
                            ArrayList arrayList = rVar4.F;
                            if (j10 <= j12) {
                                w6 = sVar.x(r13, String.valueOf(((j0) arrayList.get(i13)).l), String.valueOf(rVar4.q));
                            } else {
                                w6 = sVar.w(r13, String.valueOf(((j0) arrayList.get(i13)).l), String.valueOf(rVar4.q));
                            }
                            if (w6.b() && w6.f7389a != null) {
                                String str8 = w6.f7389a;
                                str8.getClass();
                                JSONObject jSONObject = new JSONObject(str8);
                                if (!jSONObject.isNull("success")) {
                                    i8 = jSONObject.optInt("success");
                                } else {
                                    i8 = r13;
                                }
                                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                if (optJSONObject != null) {
                                    if (!optJSONObject.isNull("sha256")) {
                                        ((j0) rVar4.F.get(i13)).p = optJSONObject.optString("sha256");
                                    }
                                    if (!optJSONObject.isNull("downloadURL")) {
                                        str = optJSONObject.optString("downloadURL");
                                        if (i8 != i12) {
                                            downloadApkWorker.F(rVar4, " (105)");
                                        } else if (downloadApkWorker.p()) {
                                            downloadApkWorker.h(j12, (j0) rVar4.F.get(i13), ComposerKt.reuseKey);
                                        }
                                        str2 = str;
                                    }
                                }
                            } else {
                                i8 = r13;
                            }
                            str = str4;
                            if (i8 != i12) {
                            }
                            str2 = str;
                        }
                    }
                    j10 = j12;
                    ArrayList arrayList2 = rVar4.F;
                    if (j10 <= j12) {
                    }
                    if (w6.b()) {
                    }
                    i8 = r13;
                    str = str4;
                    if (i8 != i12) {
                    }
                    str2 = str;
                }
                if (str2 != null) {
                    downloadApkWorker.f4528c = str4;
                    Object obj = rVar4.F.get(i13);
                    obj.getClass();
                    j0 j0Var = (j0) obj;
                    int i14 = i12;
                    if (j0Var.o == j0Var.f7412n && (str3 = j0Var.q) != null) {
                        if (!z7.v.a0(a.C(str3), j0Var.p, r13)) {
                            String str9 = j0Var.q;
                            str9.getClass();
                            new File(str9).delete();
                            j0Var.o = j12;
                            g f7 = g.D.f(downloadApkWorker.f4526a);
                            f7.b();
                            f7.r0(j0Var);
                            f7.d();
                        }
                    }
                    if (!a4.f3693b) {
                        n5.b.f8319c.c(zVar);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        downloadApkWorker.r(b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start"), new URL(str2).getHost(), (j0) rVar4.F.get(i13));
                        HttpsURLConnection z14 = downloadApkWorker.z(str2, currentTimeMillis, (j0) rVar4.F.get(i13));
                        if (z14 != null) {
                            downloadApkWorker.f4528c = z14.getURL().getHost();
                            String url = z14.getURL().toString();
                            url.getClass();
                            String substring = url.substring(n.t0("/", url, 6) + 1);
                            if (n.q0(substring, ".", r13, r13, 6) < 0) {
                                String url2 = z14.getURL().toString();
                                url2.getClass();
                                substring = substring.concat(DownloadWorker.n(url2));
                            }
                            Context context = downloadApkWorker.f4526a;
                            context.getClass();
                            u4.a aVar = new u4.a(context);
                            if (aVar.d()) {
                                j = j12;
                                File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                if (externalFilesDirs.length > i14) {
                                    externalFilesDir = externalFilesDirs[i14];
                                } else {
                                    externalFilesDir = context.getExternalFilesDir(null);
                                    aVar.g();
                                    aVar.f();
                                }
                            } else {
                                j = j12;
                                externalFilesDir = context.getExternalFilesDir(null);
                            }
                            File file2 = new File(externalFilesDir, "Apps");
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            File file3 = new File(file2, rVar4.f7495b + rVar4.f7496n);
                            if (!file3.exists() && !file3.mkdirs()) {
                                downloadApkWorker.j(i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", "cant_mkdir"), " (106)", currentTimeMillis);
                            } else {
                                if (substring.length() > 0 && ((j0) rVar4.F.get(i13)).q == null) {
                                    ((j0) rVar4.F.get(i13)).q = new File(file3, substring).getAbsolutePath();
                                    if (i13 == 0) {
                                        rVar4.r(downloadApkWorker.f4526a);
                                    }
                                    g f10 = g.D.f(downloadApkWorker.f4526a);
                                    f10.b();
                                    Object obj2 = rVar4.F.get(i13);
                                    obj2.getClass();
                                    f10.r0((j0) obj2);
                                    f10.d();
                                }
                                String str10 = ((j0) rVar4.F.get(i13)).q;
                                str10.getClass();
                                File file4 = new File(str10);
                                if (file4.exists()) {
                                    j11 = file4.length();
                                } else {
                                    j11 = j;
                                }
                                if (downloadApkWorker.p()) {
                                    downloadApkWorker.h(currentTimeMillis, (j0) rVar4.F.get(i13), ComposerKt.reuseKey);
                                } else if (downloadApkWorker.v(z14, currentTimeMillis)) {
                                    int i15 = i13;
                                    long length = ((j0) rVar4.F.get(i13)).f7412n - file4.length();
                                    if (length < j) {
                                        i = i15;
                                        rVar3 = rVar4;
                                    } else {
                                        if (b.A(downloadApkWorker.f4526a, file2) < length * 2.25d) {
                                            z14.disconnect();
                                            rVar4.t(downloadApkWorker.f4526a);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail");
                                            bundle2.putString("error", "no_enough_space");
                                            downloadApkWorker.j(bundle2, " (112)", currentTimeMillis);
                                            rVar3 = rVar4;
                                            i3 = size;
                                            i = i15;
                                        } else {
                                            if (i15 == 0) {
                                                downloadApkWorker.C(200, rVar4);
                                                downloadApkWorker.D();
                                            }
                                            if (rVar4.q > j) {
                                                g f11 = g.D.f(downloadApkWorker.f4526a);
                                                f11.b();
                                                k0 O = f11.O(rVar4.q);
                                                if (O != null) {
                                                    O.a(downloadApkWorker.f4526a, "downloadStarted");
                                                }
                                                f11.d();
                                            }
                                            ?? obj3 = new Object();
                                            ?? obj4 = new Object();
                                            e eVar = new e(obj3, obj4, this, rVar4, i15, 0);
                                            downloadApkWorker = this;
                                            String str11 = str2;
                                            i = i15;
                                            Object obj5 = rVar4.F.get(i);
                                            obj5.getClass();
                                            String str12 = downloadApkWorker.f4528c;
                                            str12.getClass();
                                            long k10 = downloadApkWorker.k(z14, file4, rVar4, (j0) obj5, str12, currentTimeMillis, eVar);
                                            rVar3 = rVar4;
                                            if (k10 >= j && !downloadApkWorker.isStopped()) {
                                                boolean p = downloadApkWorker.p();
                                                ArrayList arrayList3 = rVar3.F;
                                                if (p) {
                                                    downloadApkWorker.h(currentTimeMillis, (j0) arrayList3.get(i), ComposerKt.reuseKey);
                                                } else {
                                                    Object obj6 = arrayList3.get(i);
                                                    obj6.getClass();
                                                    Bundle f12 = downloadApkWorker.f(j11, k10, file4, (j0) obj6);
                                                    if (f12 != null) {
                                                        rVar3.t(downloadApkWorker.f4526a);
                                                        f12.putString("url", str11);
                                                        downloadApkWorker.j(f12, " (111)", currentTimeMillis);
                                                    } else {
                                                        if (rVar3.q > j) {
                                                            g f13 = g.D.f(downloadApkWorker.f4526a);
                                                            f13.b();
                                                            k0 O2 = f13.O(rVar3.q);
                                                            if (O2 != null) {
                                                                O2.a(downloadApkWorker.f4526a, "downloadFinished");
                                                            }
                                                            f13.d();
                                                        }
                                                        i3 = size;
                                                        downloadApkWorker.s(obj3.f7674a, currentTimeMillis, obj4.f7674a, k10, (j0) rVar3.F.get(i));
                                                        if (i == rVar3.F.size() - 1) {
                                                            Context context2 = downloadApkWorker.f4526a;
                                                            context2.getClass();
                                                            try {
                                                                sharedPreferences3 = context2.getSharedPreferences("CoreSettings", 0);
                                                            } catch (Exception unused2) {
                                                            }
                                                            if (sharedPreferences3.contains("install_apk_as_root_system")) {
                                                                z11 = sharedPreferences3.getBoolean("install_apk_as_root_system", false);
                                                                if (!z11) {
                                                                    float f14 = UptodownApp.G;
                                                                    n4.e.q(downloadApkWorker.f4526a, file4);
                                                                } else {
                                                                    g f15 = g.D.f(downloadApkWorker.f4526a);
                                                                    f15.b();
                                                                    ArrayList arrayList4 = new ArrayList();
                                                                    SQLiteDatabase sQLiteDatabase = f15.f11192a;
                                                                    sQLiteDatabase.getClass();
                                                                    Cursor query = sQLiteDatabase.query("remote_installs", f15.B, null, null, null, null, null);
                                                                    query.getClass();
                                                                    if (query.moveToFirst()) {
                                                                        a2 a2Var = new a2();
                                                                        a2Var.a(query);
                                                                        arrayList4.add(a2Var);
                                                                        while (query.moveToNext()) {
                                                                            a2 a2Var2 = new a2();
                                                                            a2Var2.a(query);
                                                                            arrayList4.add(a2Var2);
                                                                        }
                                                                    }
                                                                    query.close();
                                                                    Iterator it = arrayList4.iterator();
                                                                    it.getClass();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            break;
                                                                        }
                                                                        Object next = it.next();
                                                                        next.getClass();
                                                                        a2 a2Var3 = (a2) next;
                                                                        if (a2Var3.f7291d == rVar3.f7494a) {
                                                                            Context context3 = downloadApkWorker.f4526a;
                                                                            String str13 = a2Var3.f7290c;
                                                                            context3.getClass();
                                                                            if (l.a(context3)) {
                                                                                try {
                                                                                    sharedPreferences = context3.getSharedPreferences("SettingsPreferences", 0);
                                                                                } catch (Exception unused3) {
                                                                                }
                                                                                if (sharedPreferences.contains("download_notification")) {
                                                                                    z12 = sharedPreferences.getBoolean("download_notification", true);
                                                                                    if (z12) {
                                                                                        Intent intent = new Intent(context3, (Class<?>) MyDownloads.class);
                                                                                        if (rVar3.F.size() == 1 && ((j0) rVar3.F.get(0)).q != null) {
                                                                                            String str14 = ((j0) rVar3.F.get(0)).q;
                                                                                            str14.getClass();
                                                                                            if (new File(str14).exists()) {
                                                                                                intent.putExtra("remoteInstallPath", ((j0) rVar3.F.get(0)).q);
                                                                                            }
                                                                                        }
                                                                                        TaskStackBuilder create = TaskStackBuilder.create(context3);
                                                                                        create.getClass();
                                                                                        create.addParentStack(MyDownloads.class);
                                                                                        create.addNextIntent(intent);
                                                                                        PendingIntent pendingIntent = create.getPendingIntent(0, l.h());
                                                                                        NotificationCompat.Builder builder = new NotificationCompat.Builder(context3, "CHANNEL_ID_UPTODOWN");
                                                                                        builder.setContentIntent(pendingIntent);
                                                                                        builder.setSmallIcon(R.drawable.vector_uptodown_notification);
                                                                                        String string = context3.getString(R.string.notification_remote_install_title);
                                                                                        string.getClass();
                                                                                        builder.setContentTitle(string);
                                                                                        String string2 = context3.getString(R.string.notification_remote_install_msg, str13, rVar3.f7497w);
                                                                                        string2.getClass();
                                                                                        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(string2));
                                                                                        builder.setContentText(string2);
                                                                                        builder.setAutoCancel(true);
                                                                                        if (rVar3.v != null) {
                                                                                            try {
                                                                                                builder.setLargeIcon(m4.a0.d().e(rVar3.v).c()).getClass();
                                                                                            } catch (Exception e10) {
                                                                                                e10.printStackTrace();
                                                                                            }
                                                                                        }
                                                                                        builder.setGroup("com.uptodown.REMOTE_APP_DOWNLOADED");
                                                                                        Object systemService = context3.getSystemService("notification");
                                                                                        systemService.getClass();
                                                                                        NotificationManager notificationManager = (NotificationManager) systemService;
                                                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                                                            NotificationCompat.Builder groupSummary = new NotificationCompat.Builder(context3, "CHANNEL_ID_UPTODOWN").setContentTitle(context3.getString(R.string.descarga_completada)).setSmallIcon(R.drawable.vector_uptodown_notification).setGroup("com.uptodown.REMOTE_APP_DOWNLOADED").setAutoCancel(true).setGroupSummary(true);
                                                                                            groupSummary.getClass();
                                                                                            notificationManager.notify(8, groupSummary.build());
                                                                                        }
                                                                                        String str15 = rVar3.f7495b;
                                                                                        if (str15 != null) {
                                                                                            long j15 = rVar3.f7496n;
                                                                                            if (j15 > j) {
                                                                                                k5.b bVar2 = new k5.b(str15, j15);
                                                                                                bVar = bVar2.a(context3);
                                                                                                if (bVar != null) {
                                                                                                    i10 = bVar.f7298d;
                                                                                                    if (i10 == -1) {
                                                                                                        i10 = l.g(context3);
                                                                                                        if (bVar != null) {
                                                                                                            bVar.f7298d = i10;
                                                                                                        }
                                                                                                        if (bVar != null) {
                                                                                                            bVar.f7299e = k5.a.f7285a;
                                                                                                        }
                                                                                                        if (bVar != null) {
                                                                                                            bVar.b(context3);
                                                                                                        }
                                                                                                    }
                                                                                                    notificationManager.notify(i10, builder.build());
                                                                                                    l.k(string, String.valueOf(System.currentTimeMillis()), string2, "downloads", rVar3.f7497w, context3);
                                                                                                    a0 a0Var2 = new a0(context3, 22);
                                                                                                    Bundle bundle3 = new Bundle();
                                                                                                    bundle3.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "download_complete_notified");
                                                                                                    a0Var2.u(bundle3, "remote_install");
                                                                                                } else {
                                                                                                    bVar = bVar2;
                                                                                                    i10 = -1;
                                                                                                    if (i10 == -1) {
                                                                                                    }
                                                                                                    notificationManager.notify(i10, builder.build());
                                                                                                    l.k(string, String.valueOf(System.currentTimeMillis()), string2, "downloads", rVar3.f7497w, context3);
                                                                                                    a0 a0Var22 = new a0(context3, 22);
                                                                                                    Bundle bundle32 = new Bundle();
                                                                                                    bundle32.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "download_complete_notified");
                                                                                                    a0Var22.u(bundle32, "remote_install");
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        bVar = null;
                                                                                        i10 = -1;
                                                                                        if (i10 == -1) {
                                                                                        }
                                                                                        notificationManager.notify(i10, builder.build());
                                                                                        l.k(string, String.valueOf(System.currentTimeMillis()), string2, "downloads", rVar3.f7497w, context3);
                                                                                        a0 a0Var222 = new a0(context3, 22);
                                                                                        Bundle bundle322 = new Bundle();
                                                                                        bundle322.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "download_complete_notified");
                                                                                        a0Var222.u(bundle322, "remote_install");
                                                                                    }
                                                                                }
                                                                                z12 = true;
                                                                                if (z12) {
                                                                                }
                                                                            }
                                                                            String[] strArr = {String.valueOf(rVar3.f7494a)};
                                                                            SQLiteDatabase sQLiteDatabase2 = f15.f11192a;
                                                                            sQLiteDatabase2.getClass();
                                                                            sQLiteDatabase2.delete("remote_installs", "downloadId=?", strArr);
                                                                        }
                                                                    }
                                                                    f15.d();
                                                                }
                                                                z10 = false;
                                                                if (rVar3.j() == rVar3.k()) {
                                                                    rVar3.m = 0;
                                                                    g f16 = g.D.f(downloadApkWorker.f4526a);
                                                                    f16.b();
                                                                    f16.q0(rVar3);
                                                                    f16.d();
                                                                    Context context4 = downloadApkWorker.f4526a;
                                                                    context4.getClass();
                                                                    try {
                                                                        sharedPreferences2 = context4.getSharedPreferences("SettingsPreferences", 0);
                                                                    } catch (Exception unused4) {
                                                                    }
                                                                    if (sharedPreferences2.contains("stats_enabled")) {
                                                                        z13 = sharedPreferences2.getBoolean("stats_enabled", false);
                                                                        if (z13) {
                                                                            i11 = 1;
                                                                            int i16 = context4.getSharedPreferences("SettingsPreferences", 0).getInt("stats_downloads", 0) + 1;
                                                                            SharedPreferences sharedPreferences4 = context4.getSharedPreferences("SettingsPreferences", 0);
                                                                            sharedPreferences4.getClass();
                                                                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                                                                            edit.putInt("stats_downloads", i16);
                                                                            edit.apply();
                                                                            if (rVar3.B == i11) {
                                                                                Context context5 = downloadApkWorker.f4526a;
                                                                                String str16 = rVar3.f7495b;
                                                                                long j16 = rVar3.f7496n;
                                                                                context5.getClass();
                                                                                if (str16 != null && str16.length() != 0) {
                                                                                    j8.e eVar2 = p0.f3588a;
                                                                                    c8.f0.z(c8.f0.b(d.f7053a), null, null, new f5.d(context5, str16, j16, null, 0), 3);
                                                                                }
                                                                            }
                                                                            downloadApkWorker.C(ComposerKt.compositionLocalMapKey, rVar3);
                                                                            Context context6 = downloadApkWorker.f4526a;
                                                                            context6.getClass();
                                                                            Object systemService2 = context6.getSystemService("notification");
                                                                            systemService2.getClass();
                                                                            ((NotificationManager) systemService2).cancel(261);
                                                                            i13 = i + 1;
                                                                            r13 = z10;
                                                                            size = i3;
                                                                            rVar4 = rVar3;
                                                                            j12 = j;
                                                                            str4 = null;
                                                                            i12 = 1;
                                                                        }
                                                                    }
                                                                    z13 = false;
                                                                    if (z13) {
                                                                    }
                                                                }
                                                                i11 = 1;
                                                                if (rVar3.B == i11) {
                                                                }
                                                                downloadApkWorker.C(ComposerKt.compositionLocalMapKey, rVar3);
                                                                Context context62 = downloadApkWorker.f4526a;
                                                                context62.getClass();
                                                                Object systemService22 = context62.getSystemService("notification");
                                                                systemService22.getClass();
                                                                ((NotificationManager) systemService22).cancel(261);
                                                                i13 = i + 1;
                                                                r13 = z10;
                                                                size = i3;
                                                                rVar4 = rVar3;
                                                                j12 = j;
                                                                str4 = null;
                                                                i12 = 1;
                                                            }
                                                            z11 = false;
                                                            if (!z11) {
                                                            }
                                                            z10 = false;
                                                            if (rVar3.j() == rVar3.k()) {
                                                            }
                                                            i11 = 1;
                                                            if (rVar3.B == i11) {
                                                            }
                                                            downloadApkWorker.C(ComposerKt.compositionLocalMapKey, rVar3);
                                                            Context context622 = downloadApkWorker.f4526a;
                                                            context622.getClass();
                                                            Object systemService222 = context622.getSystemService("notification");
                                                            systemService222.getClass();
                                                            ((NotificationManager) systemService222).cancel(261);
                                                            i13 = i + 1;
                                                            r13 = z10;
                                                            size = i3;
                                                            rVar4 = rVar3;
                                                            j12 = j;
                                                            str4 = null;
                                                            i12 = 1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z10 = false;
                                        i13 = i + 1;
                                        r13 = z10;
                                        size = i3;
                                        rVar4 = rVar3;
                                        j12 = j;
                                        str4 = null;
                                        i12 = 1;
                                    }
                                    i3 = size;
                                    z10 = false;
                                    i13 = i + 1;
                                    r13 = z10;
                                    size = i3;
                                    rVar4 = rVar3;
                                    j12 = j;
                                    str4 = null;
                                    i12 = 1;
                                }
                            }
                            rVar3 = rVar4;
                            i = i13;
                            i3 = size;
                            z10 = false;
                            i13 = i + 1;
                            r13 = z10;
                            size = i3;
                            rVar4 = rVar3;
                            j12 = j;
                            str4 = null;
                            i12 = 1;
                        }
                    }
                }
            }
            rVar3 = rVar4;
            j = j12;
            z10 = r13;
            i = i13;
            i3 = size;
            i13 = i + 1;
            r13 = z10;
            size = i3;
            rVar4 = rVar3;
            j12 = j;
            str4 = null;
            i12 = 1;
        }
        if (!downloadApkWorker.isStopped()) {
            if (!a4.f3693b) {
                n5.b.f8319c.c(zVar);
                return;
            }
            Context context7 = downloadApkWorker.f4526a;
            context7.getClass();
            ArrayList arrayList5 = new ArrayList();
            g f17 = g.D.f(context7);
            f17.b();
            Iterator it2 = f17.P().iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                r rVar5 = (r) next2;
                if (rVar5.m()) {
                    arrayList5.add(rVar5);
                }
            }
            f17.d();
            Iterator it3 = arrayList5.iterator();
            it3.getClass();
            while (true) {
                if (it3.hasNext()) {
                    Object next3 = it3.next();
                    next3.getClass();
                    rVar2 = (r) next3;
                    if (rVar2.r == 1 || a4.f3696e) {
                        break;
                    }
                } else {
                    rVar2 = null;
                    break;
                }
            }
            downloadApkWorker.f4529d = null;
            if (rVar2 != null) {
                n5.b.a();
                downloadApkWorker.f4529d = rVar2;
                downloadApkWorker.E(rVar2);
            }
        }
    }

    public final void F(r rVar, String str) {
        if (rVar != null) {
            rVar.l(this.f4526a);
            B(rVar);
        }
        l.i(this.f4526a, rVar, str);
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.jvm.internal.g0] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, kotlin.jvm.internal.g0] */
    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        long j;
        File externalFilesDir;
        r rVar;
        File externalFilesDir2;
        File externalFilesDir3;
        n5.b.a();
        boolean z10 = false;
        String str = this.f4523e;
        if (str != null) {
            this.f4528c = null;
            n5.b.a();
            if (!a4.f3693b) {
                n5.b.f8319c.c(z.f7575a);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                r(b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start"), new URL(str).getHost(), null);
                HttpsURLConnection z11 = z(str, currentTimeMillis, null);
                if (z11 != null) {
                    this.f4528c = z11.getURL().getHost();
                    String url = z11.getURL().toString();
                    url.getClass();
                    String substring = url.substring(n.t0("/", url, 6) + 1);
                    if (n.q0(substring, ".", 0, false, 6) < 0) {
                        String url2 = z11.getURL().toString();
                        url2.getClass();
                        substring = substring.concat(DownloadWorker.n(url2));
                    }
                    if (substring.length() > 0 && (rVar = this.f4529d) != null) {
                        if (rVar.F.isEmpty()) {
                            Context context = this.f4526a;
                            context.getClass();
                            u4.a aVar = new u4.a(context);
                            if (aVar.d()) {
                                j = 0;
                                File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                if (externalFilesDirs.length > 1) {
                                    externalFilesDir3 = externalFilesDirs[1];
                                } else {
                                    externalFilesDir3 = context.getExternalFilesDir(null);
                                    aVar.g();
                                    aVar.f();
                                }
                            } else {
                                j = 0;
                                externalFilesDir3 = context.getExternalFilesDir(null);
                            }
                            File file = new File(externalFilesDir3, "Apps");
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            File file2 = new File(file, substring);
                            j0 j0Var = new j0();
                            j0Var.q = file2.getAbsolutePath();
                            j0Var.f7412n = DownloadWorker.m(z11);
                            g f7 = g.D.f(this.f4526a);
                            f7.b();
                            this.f4529d.getClass();
                            f7.c0(j0Var, r8.f7494a);
                            f7.d();
                            r rVar2 = this.f4529d;
                            rVar2.getClass();
                            rVar2.F.add(j0Var);
                        } else {
                            j = 0;
                            r rVar3 = this.f4529d;
                            rVar3.getClass();
                            if (((j0) rVar3.F.get(0)).q == null) {
                                Context context2 = this.f4526a;
                                context2.getClass();
                                u4.a aVar2 = new u4.a(context2);
                                if (aVar2.d()) {
                                    File[] externalFilesDirs2 = context2.getExternalFilesDirs(null);
                                    if (externalFilesDirs2.length > 1) {
                                        externalFilesDir2 = externalFilesDirs2[1];
                                    } else {
                                        externalFilesDir2 = context2.getExternalFilesDir(null);
                                        aVar2.g();
                                        aVar2.f();
                                    }
                                } else {
                                    externalFilesDir2 = context2.getExternalFilesDir(null);
                                }
                                File file3 = new File(externalFilesDir2, "Apps");
                                if (!file3.exists()) {
                                    file3.mkdirs();
                                }
                                File file4 = new File(file3, substring);
                                r rVar4 = this.f4529d;
                                rVar4.getClass();
                                ((j0) rVar4.F.get(0)).q = file4.getAbsolutePath();
                                g f10 = g.D.f(this.f4526a);
                                f10.b();
                                r rVar5 = this.f4529d;
                                rVar5.getClass();
                                Object obj = rVar5.F.get(0);
                                obj.getClass();
                                f10.r0((j0) obj);
                                f10.d();
                            }
                        }
                    } else {
                        j = 0;
                    }
                    Context context3 = this.f4526a;
                    context3.getClass();
                    u4.a aVar3 = new u4.a(context3);
                    if (aVar3.d()) {
                        File[] externalFilesDirs3 = context3.getExternalFilesDirs(null);
                        if (externalFilesDirs3.length > 1) {
                            externalFilesDir = externalFilesDirs3[1];
                        } else {
                            externalFilesDir = context3.getExternalFilesDir(null);
                            aVar3.g();
                            aVar3.f();
                        }
                    } else {
                        externalFilesDir = context3.getExternalFilesDir(null);
                    }
                    File file5 = new File(externalFilesDir, "Apps");
                    if (!file5.exists()) {
                        file5.mkdirs();
                    }
                    if (!file5.exists() && !file5.mkdirs()) {
                        j(i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", "cant_mkdir"), " (106)", currentTimeMillis);
                    } else {
                        r rVar6 = this.f4529d;
                        rVar6.getClass();
                        String str2 = ((j0) rVar6.F.get(0)).q;
                        str2.getClass();
                        File file6 = new File(str2);
                        if (p()) {
                            r rVar7 = this.f4529d;
                            rVar7.getClass();
                            h(currentTimeMillis, (j0) rVar7.F.get(0), ComposerKt.reuseKey);
                        } else if (v(z11, currentTimeMillis)) {
                            r rVar8 = this.f4529d;
                            rVar8.getClass();
                            long length = ((j0) rVar8.F.get(0)).f7412n - file6.length();
                            if (length >= j) {
                                if (b.A(this.f4526a, file5) < length * 2.25d) {
                                    z11.disconnect();
                                    r rVar9 = this.f4529d;
                                    if (rVar9 != null) {
                                        rVar9.t(this.f4526a);
                                    }
                                    j(i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", "no_enough_space"), " (112)", currentTimeMillis);
                                } else {
                                    r rVar10 = this.f4529d;
                                    rVar10.getClass();
                                    C(200, rVar10);
                                    D();
                                    r rVar11 = this.f4529d;
                                    rVar11.getClass();
                                    if (rVar11.q > j) {
                                        g f11 = g.D.f(this.f4526a);
                                        f11.b();
                                        r rVar12 = this.f4529d;
                                        rVar12.getClass();
                                        k0 O = f11.O(rVar12.q);
                                        if (O != null) {
                                            O.a(this.f4526a, "downloadStarted");
                                        }
                                        f11.d();
                                    }
                                    ?? obj2 = new Object();
                                    ?? obj3 = new Object();
                                    i iVar = new i((Object) obj2, (Object) obj3, this, 2);
                                    r rVar13 = this.f4529d;
                                    rVar13.getClass();
                                    r rVar14 = this.f4529d;
                                    rVar14.getClass();
                                    Object obj4 = rVar14.F.get(0);
                                    obj4.getClass();
                                    String str3 = this.f4528c;
                                    str3.getClass();
                                    long k10 = k(z11, file6, rVar13, (j0) obj4, str3, currentTimeMillis, iVar);
                                    if (k10 >= j && !isStopped()) {
                                        boolean p = p();
                                        r rVar15 = this.f4529d;
                                        if (p) {
                                            rVar15.getClass();
                                            h(currentTimeMillis, (j0) rVar15.F.get(0), ComposerKt.reuseKey);
                                        } else {
                                            if (rVar15 != null) {
                                                rVar15.m = 0;
                                                g f12 = g.D.f(this.f4526a);
                                                f12.b();
                                                r rVar16 = this.f4529d;
                                                rVar16.getClass();
                                                f12.q0(rVar16);
                                                f12.d();
                                            }
                                            r rVar17 = this.f4529d;
                                            if (rVar17 != null && rVar17.q > j) {
                                                g f13 = g.D.f(this.f4526a);
                                                f13.b();
                                                r rVar18 = this.f4529d;
                                                rVar18.getClass();
                                                k0 O2 = f13.O(rVar18.q);
                                                if (O2 != null) {
                                                    O2.a(this.f4526a, "downloadFinished");
                                                }
                                                f13.d();
                                            }
                                            s(obj2.f7674a, currentTimeMillis, obj3.f7674a, k10, null);
                                            Context context4 = this.f4526a;
                                            context4.getClass();
                                            try {
                                                SharedPreferences sharedPreferences = context4.getSharedPreferences("CoreSettings", 0);
                                                if (sharedPreferences.contains("install_apk_as_root_system")) {
                                                    z10 = sharedPreferences.getBoolean("install_apk_as_root_system", false);
                                                }
                                            } catch (Exception unused) {
                                            }
                                            if (z10) {
                                                float f14 = UptodownApp.G;
                                                n4.e.q(this.f4526a, file6);
                                            }
                                            r rVar19 = this.f4529d;
                                            if (rVar19 != null) {
                                                if (rVar19.B == 1) {
                                                    Context context5 = this.f4526a;
                                                    String str4 = rVar19.f7495b;
                                                    rVar19.getClass();
                                                    long j10 = rVar19.f7496n;
                                                    context5.getClass();
                                                    if (str4 != null && str4.length() != 0) {
                                                        j8.e eVar = p0.f3588a;
                                                        c8.f0.z(c8.f0.b(d.f7053a), null, null, new f5.d(context5, str4, j10, null, 0), 3);
                                                    }
                                                }
                                                r rVar20 = this.f4529d;
                                                rVar20.getClass();
                                                C(ComposerKt.compositionLocalMapKey, rVar20);
                                            }
                                            Context context6 = this.f4526a;
                                            context6.getClass();
                                            Object systemService = context6.getSystemService("notification");
                                            systemService.getClass();
                                            ((NotificationManager) systemService).cancel(261);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            r rVar21 = this.f4529d;
            if (rVar21 == null) {
                F(null, " (100)");
            } else {
                boolean isEmpty = rVar21.F.isEmpty();
                r rVar22 = this.f4529d;
                if (isEmpty) {
                    F(rVar22, " (114)");
                } else {
                    rVar22.getClass();
                    long j11 = ((j0) rVar22.F.get(0)).l;
                    r rVar23 = this.f4529d;
                    if (j11 < 0) {
                        F(rVar23, " (103)");
                    } else {
                        rVar23.getClass();
                        long j12 = rVar23.q;
                        r rVar24 = this.f4529d;
                        if (j12 == -1) {
                            F(rVar24, " (113)");
                        } else {
                            rVar24.getClass();
                            E(rVar24);
                        }
                    }
                }
            }
        }
        l1 l1Var = n5.b.f8317a;
        n5.b.i(g0.f7386a);
        n5.b.f8319c.c(k5.s.f7510a);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        success.getClass();
        return success;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void j(Bundle bundle, String str, long j) {
        F(this.f4529d, str);
        if (j > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j) / 1000);
        }
        d(bundle, null);
        a0 a0Var = this.f4527b;
        if (a0Var != null) {
            a0Var.u(bundle, "download");
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final boolean p() {
        return n5.b.f8318b.f5266a.getValue() instanceof e0;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final boolean q() {
        return n5.b.f8318b.f5266a.getValue() instanceof h0;
    }
}

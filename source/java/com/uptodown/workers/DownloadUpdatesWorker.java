package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.gestures.x;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.FileProvider;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.UptodownApp;
import f8.l1;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import k3.t;
import k5.e;
import k5.g2;
import k5.j0;
import k5.l0;
import k5.m0;
import k5.n0;
import k5.o0;
import k5.p0;
import k5.p2;
import k5.q0;
import k5.r;
import k5.r0;
import k5.s0;
import k5.t0;
import k5.v0;
import k5.w0;
import k5.x0;
import k5.y0;
import k5.z0;
import kotlin.jvm.internal.p;
import n5.d;
import n5.f;
import o4.a0;
import o4.b1;
import org.json.JSONObject;
import q1.e0;
import s4.c;
import s7.a;
import w5.g;
import w5.l;
import w5.s;
import z1.b;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DownloadUpdatesWorker extends DownloadWorker {

    /* renamed from: f, reason: collision with root package name */
    public static p2 f4524f;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadUpdatesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4525e = workerParameters.getInputData().getBoolean("downloadAnyway", false);
        Activity activity = c.o;
        Context j = b.j(this.f4526a);
        this.f4526a = j;
        this.f4527b = new a0(j, 22);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void A() {
        d.f();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void B(r rVar) {
        rVar.getClass();
        l1 l1Var = d.f8324a;
        d.g(x0.f7556a);
        d.f8326c.c(new r0(rVar));
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void C(int i, r rVar) {
        rVar.getClass();
        if (i != 106) {
            if (i != 201) {
                if (i != 207) {
                    return;
                }
            } else {
                d.g(new w0(rVar));
                d.f8326c.c(new q0(rVar));
                return;
            }
        }
        d.f8326c.c(new m0(rVar));
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final Bundle d(Bundle bundle, j0 j0Var) {
        String str;
        super.d(bundle, j0Var);
        r rVar = this.f4529d;
        if (rVar != null) {
            str = rVar.f7495b;
        } else {
            str = null;
        }
        if (str != null) {
            bundle.putString("updateOrigin", f.a(str));
            String string = bundle.getString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (p.b(string, "fail") || p.b(string, "cancelled")) {
                f.f8332a.remove(str);
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d9  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.jvm.internal.g0] */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, kotlin.jvm.internal.g0] */
    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableWorker.Result doWork() {
        x0 x0Var;
        Class<InstallUpdatesWorker> cls;
        String str;
        File externalFilesDir;
        r rVar;
        String str2;
        File file;
        x0 x0Var2;
        int i;
        Class<InstallUpdatesWorker> cls2;
        String str3;
        boolean z10;
        ?? r15;
        Uri fromFile;
        long j;
        g2 w6;
        e eVar;
        String str4;
        x0 x0Var3;
        Class<InstallUpdatesWorker> cls3;
        String str5;
        boolean z11;
        r rVar2;
        String str6;
        int i3;
        p2 p2Var;
        File externalFilesDir2;
        String str7;
        String str8;
        HttpsURLConnection httpsURLConnection;
        p2 p2Var2;
        File file2;
        long j10;
        boolean z12;
        String str9;
        DownloadUpdatesWorker downloadUpdatesWorker = this;
        l1 l1Var = d.f8324a;
        boolean z13 = l1Var.getValue() instanceof v0;
        x0 x0Var4 = x0.f7556a;
        if (z13 || (l1Var.getValue() instanceof y0)) {
            d.g(x0Var4);
        }
        if (downloadUpdatesWorker.getRunAttemptCount() > 0) {
            ListenableWorker.Result success = ListenableWorker.Result.success();
            success.getClass();
            return success;
        }
        Context context = downloadUpdatesWorker.f4526a;
        context.getClass();
        int i8 = 1;
        if (!a.v(context, "updates_active", true)) {
            ListenableWorker.Result success2 = ListenableWorker.Result.success();
            success2.getClass();
            return success2;
        }
        d.g(z0.f7576a);
        Class<InstallUpdatesWorker> cls4 = InstallUpdatesWorker.class;
        String str10 = "InstallUpdatesWorker";
        if (a4.f3693b) {
            Context applicationContext = downloadUpdatesWorker.getApplicationContext();
            applicationContext.getClass();
            b.q(applicationContext);
            float f7 = UptodownApp.G;
            ArrayList i10 = n4.e.i();
            if (i10 != null && !i10.isEmpty()) {
                boolean z14 = downloadUpdatesWorker.f4525e;
                if (!z14 && !a.l(downloadUpdatesWorker.f4526a)) {
                    if (!a4.f3696e) {
                        d.f8326c.c(new p0(i10));
                    }
                } else {
                    e h = n4.e.h();
                    Context context2 = downloadUpdatesWorker.f4526a;
                    context2.getClass();
                    u4.a aVar = new u4.a(context2);
                    r rVar3 = null;
                    if (aVar.d()) {
                        File[] externalFilesDirs = context2.getExternalFilesDirs(null);
                        if (externalFilesDirs.length > 1) {
                            externalFilesDir = externalFilesDirs[1];
                        } else {
                            externalFilesDir = context2.getExternalFilesDir(null);
                            aVar.g();
                            aVar.f();
                        }
                    } else {
                        externalFilesDir = context2.getExternalFilesDir(null);
                    }
                    String str11 = "Updates";
                    File file3 = new File(externalFilesDir, "Updates");
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                    while (h != null && a4.f3693b && !downloadUpdatesWorker.isStopped()) {
                        float f10 = UptodownApp.G;
                        if (n4.e.o(downloadUpdatesWorker.f4526a, "downloadApkWorker")) {
                            break;
                        }
                        g f11 = g.D.f(downloadUpdatesWorker.f4526a);
                        f11.b();
                        String str12 = h.l;
                        str12.getClass();
                        f4524f = f11.Y(str12);
                        f11.d();
                        p2 p2Var3 = f4524f;
                        if (p2Var3 != null) {
                            rVar = p2Var3.s;
                        } else {
                            rVar = rVar3;
                        }
                        downloadUpdatesWorker.f4529d = rVar;
                        if (rVar != null && !rVar.F.isEmpty()) {
                            l1 l1Var2 = d.f8324a;
                            d.g(new w0(downloadUpdatesWorker.f4529d));
                            d.f8326c.c(new t0(downloadUpdatesWorker.f4529d));
                            r rVar4 = downloadUpdatesWorker.f4529d;
                            rVar4.getClass();
                            Iterator it = rVar4.F.iterator();
                            it.getClass();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    j0 j0Var = (j0) next;
                                    if (!downloadUpdatesWorker.p() && !downloadUpdatesWorker.isStopped()) {
                                        long A = b.A(downloadUpdatesWorker.f4526a, file3);
                                        downloadUpdatesWorker.f4529d.getClass();
                                        file = file3;
                                        double k10 = r2.k() * 2.25d;
                                        double d10 = A;
                                        n0 n0Var = n0.f7448a;
                                        if (d10 < k10) {
                                            d.f8326c.c(n0Var);
                                            z10 = z14;
                                            r15 = 0;
                                            break;
                                        }
                                        s sVar = new s(downloadUpdatesWorker.f4526a);
                                        if (j0Var.l >= 0) {
                                            Context context3 = downloadUpdatesWorker.f4526a;
                                            context3.getClass();
                                            j0Var.r += i8;
                                            j0Var.s = System.currentTimeMillis() + 1800000;
                                            e0 e0Var = g.D;
                                            g f12 = e0Var.f(context3);
                                            f12.b();
                                            f12.r0(j0Var);
                                            f12.d();
                                            if (j0Var.q != null) {
                                                String str13 = j0Var.q;
                                                str13.getClass();
                                                File file4 = new File(str13);
                                                if (file4.exists()) {
                                                    j = file4.length();
                                                    long j11 = j0Var.l;
                                                    if (j <= 0) {
                                                        w6 = sVar.x(i8, String.valueOf(j11), String.valueOf(h.F));
                                                    } else {
                                                        w6 = sVar.w(i8, String.valueOf(j11), String.valueOf(h.F));
                                                    }
                                                    if (w6.b() && (str6 = w6.f7389a) != null && str6.length() != 0) {
                                                        String str14 = w6.f7389a;
                                                        str14.getClass();
                                                        JSONObject jSONObject = new JSONObject(str14);
                                                        if (!jSONObject.isNull("success")) {
                                                            i3 = jSONObject.optInt("success");
                                                        } else {
                                                            i3 = 0;
                                                        }
                                                        if (i3 != i8) {
                                                            l1 l1Var3 = d.f8324a;
                                                            p2 p2Var4 = f4524f;
                                                            p2Var4.getClass();
                                                            d.f8326c.c(new r0(p2Var4.s));
                                                        } else {
                                                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                                            if (optJSONObject != null) {
                                                                if (!optJSONObject.isNull("sha256")) {
                                                                    j0Var.p = optJSONObject.optString("sha256");
                                                                }
                                                                if (!optJSONObject.isNull("downloadURL")) {
                                                                    String optString = optJSONObject.optString("downloadURL");
                                                                    if (z14 || a.l(downloadUpdatesWorker.f4526a)) {
                                                                        if (z14) {
                                                                            r rVar5 = downloadUpdatesWorker.f4529d;
                                                                            rVar5.getClass();
                                                                            rVar5.r = i8;
                                                                        }
                                                                        optString.getClass();
                                                                        p2 p2Var5 = f4524f;
                                                                        p2Var5.getClass();
                                                                        String str15 = p2Var5.f7479b;
                                                                        downloadUpdatesWorker.f4528c = null;
                                                                        cls3 = cls4;
                                                                        x0Var3 = x0Var4;
                                                                        if (j0Var.o == j0Var.f7412n && (str9 = j0Var.q) != null) {
                                                                            if (!v.a0(a.a.C(str9), j0Var.p, false)) {
                                                                                String str16 = j0Var.q;
                                                                                str16.getClass();
                                                                                new File(str16).delete();
                                                                                j0Var.o = 0L;
                                                                                g f13 = e0Var.f(downloadUpdatesWorker.f4526a);
                                                                                f13.b();
                                                                                f13.r0(j0Var);
                                                                                f13.d();
                                                                            }
                                                                            eVar = h;
                                                                            str4 = str11;
                                                                            str5 = str10;
                                                                            z11 = z14;
                                                                            rVar2 = null;
                                                                        }
                                                                        long currentTimeMillis = System.currentTimeMillis();
                                                                        downloadUpdatesWorker.r(b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start"), new URL(optString).getHost(), j0Var);
                                                                        HttpsURLConnection z15 = downloadUpdatesWorker.z(optString, currentTimeMillis, j0Var);
                                                                        if (z15 != null) {
                                                                            downloadUpdatesWorker.f4528c = z15.getURL().getHost();
                                                                            Context applicationContext2 = downloadUpdatesWorker.getApplicationContext();
                                                                            applicationContext2.getClass();
                                                                            eVar = h;
                                                                            u4.a aVar2 = new u4.a(applicationContext2);
                                                                            if (aVar2.d()) {
                                                                                z11 = z14;
                                                                                File[] externalFilesDirs2 = applicationContext2.getExternalFilesDirs(null);
                                                                                p2Var = p2Var5;
                                                                                if (externalFilesDirs2.length > 1) {
                                                                                    externalFilesDir2 = externalFilesDirs2[1];
                                                                                    rVar2 = null;
                                                                                } else {
                                                                                    rVar2 = null;
                                                                                    externalFilesDir2 = applicationContext2.getExternalFilesDir(null);
                                                                                    aVar2.g();
                                                                                    aVar2.f();
                                                                                }
                                                                            } else {
                                                                                p2Var = p2Var5;
                                                                                z11 = z14;
                                                                                rVar2 = null;
                                                                                externalFilesDir2 = applicationContext2.getExternalFilesDir(null);
                                                                            }
                                                                            File file5 = new File(externalFilesDir2, str11);
                                                                            if (!file5.exists()) {
                                                                                file5.mkdirs();
                                                                            }
                                                                            if (!file5.exists() && !file5.mkdirs()) {
                                                                                Bundle f14 = b1.f("error", "cant_mkdir");
                                                                                String str17 = str11;
                                                                                r rVar6 = downloadUpdatesWorker.f4529d;
                                                                                rVar6.getClass();
                                                                                downloadUpdatesWorker.t(p2Var, rVar6, j0Var, f14, downloadUpdatesWorker.f4528c, currentTimeMillis);
                                                                                str4 = str17;
                                                                                str5 = str10;
                                                                            } else {
                                                                                String str18 = str11;
                                                                                str5 = str10;
                                                                                p2 p2Var6 = p2Var;
                                                                                String str19 = j0Var.q;
                                                                                if (str19 != null && str19.length() != 0) {
                                                                                    String str20 = j0Var.q;
                                                                                    str20.getClass();
                                                                                    str7 = "error";
                                                                                    p2Var2 = p2Var6;
                                                                                    httpsURLConnection = z15;
                                                                                    str4 = str18;
                                                                                    file2 = new File(str20);
                                                                                    str8 = optString;
                                                                                } else {
                                                                                    String url = z15.getURL().toString();
                                                                                    url.getClass();
                                                                                    String n10 = DownloadWorker.n(url);
                                                                                    long j12 = j0Var.l;
                                                                                    str7 = "error";
                                                                                    StringBuilder sb = new StringBuilder();
                                                                                    sb.append(str15);
                                                                                    str4 = str18;
                                                                                    sb.append("_");
                                                                                    sb.append(j12);
                                                                                    sb.append(".");
                                                                                    sb.append(n10);
                                                                                    String sb2 = sb.toString();
                                                                                    str8 = optString;
                                                                                    httpsURLConnection = z15;
                                                                                    p2Var2 = p2Var6;
                                                                                    File file6 = new File(file5.getAbsolutePath() + "/" + str15 + p2Var6.l);
                                                                                    if (!file6.exists()) {
                                                                                        file6.mkdirs();
                                                                                    }
                                                                                    file2 = new File(x.m(file6.getAbsolutePath(), "/", sb2));
                                                                                    j0Var.q = file2.getAbsolutePath();
                                                                                    g f15 = e0Var.f(downloadUpdatesWorker.f4526a);
                                                                                    f15.b();
                                                                                    f15.r0(j0Var);
                                                                                    f15.d();
                                                                                }
                                                                                if (file2.exists()) {
                                                                                    j10 = file2.length();
                                                                                } else {
                                                                                    j10 = 0;
                                                                                }
                                                                                if (downloadUpdatesWorker.v(httpsURLConnection, currentTimeMillis)) {
                                                                                    downloadUpdatesWorker.f4529d.getClass();
                                                                                    if (b.A(downloadUpdatesWorker.f4526a, file5) < (r0.k() - j10) * 2.25d) {
                                                                                        z12 = false;
                                                                                    } else {
                                                                                        z12 = true;
                                                                                    }
                                                                                    if (z12) {
                                                                                        ?? obj = new Object();
                                                                                        ?? obj2 = new Object();
                                                                                        t tVar = new t((Object) obj, (Object) obj2, this, j0Var, 2);
                                                                                        downloadUpdatesWorker = this;
                                                                                        r rVar7 = downloadUpdatesWorker.f4529d;
                                                                                        rVar7.getClass();
                                                                                        String str21 = downloadUpdatesWorker.f4528c;
                                                                                        str21.getClass();
                                                                                        File file7 = file2;
                                                                                        p2 p2Var7 = p2Var2;
                                                                                        rVar2 = null;
                                                                                        long k11 = downloadUpdatesWorker.k(httpsURLConnection, file7, rVar7, j0Var, str21, currentTimeMillis, tVar);
                                                                                        if (k11 >= 0 && !downloadUpdatesWorker.isStopped()) {
                                                                                            if (downloadUpdatesWorker.p()) {
                                                                                                downloadUpdatesWorker.h(currentTimeMillis, j0Var, 106);
                                                                                            } else {
                                                                                                Bundle f16 = downloadUpdatesWorker.f(j10, k11, file7, j0Var);
                                                                                                if (f16 != null) {
                                                                                                    r rVar8 = downloadUpdatesWorker.f4529d;
                                                                                                    if (rVar8 != null) {
                                                                                                        rVar8.t(downloadUpdatesWorker.f4526a);
                                                                                                    }
                                                                                                    l1 l1Var4 = d.f8324a;
                                                                                                    d.f8326c.c(new r0(p2Var7.s));
                                                                                                    f16.putString("url", str8);
                                                                                                    r rVar9 = downloadUpdatesWorker.f4529d;
                                                                                                    rVar9.getClass();
                                                                                                    downloadUpdatesWorker.t(p2Var7, rVar9, j0Var, f16, downloadUpdatesWorker.f4528c, currentTimeMillis);
                                                                                                    downloadUpdatesWorker = this;
                                                                                                } else {
                                                                                                    downloadUpdatesWorker = this;
                                                                                                    downloadUpdatesWorker.s(obj.f7674a, currentTimeMillis, obj2.f7674a, k11, j0Var);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        downloadUpdatesWorker = this;
                                                                                        p2 p2Var8 = p2Var2;
                                                                                        rVar2 = null;
                                                                                        httpsURLConnection.disconnect();
                                                                                        r rVar10 = downloadUpdatesWorker.f4529d;
                                                                                        if (rVar10 != null) {
                                                                                            rVar10.t(downloadUpdatesWorker.f4526a);
                                                                                        }
                                                                                        Context applicationContext3 = downloadUpdatesWorker.getApplicationContext();
                                                                                        applicationContext3.getClass();
                                                                                        b.q(applicationContext3);
                                                                                        d.f8326c.c(n0Var);
                                                                                        Bundle bundle = new Bundle();
                                                                                        bundle.putString(str7, "no_enough_space");
                                                                                        r rVar11 = downloadUpdatesWorker.f4529d;
                                                                                        rVar11.getClass();
                                                                                        downloadUpdatesWorker.t(p2Var8, rVar11, j0Var, bundle, downloadUpdatesWorker.f4528c, currentTimeMillis);
                                                                                    }
                                                                                }
                                                                                rVar2 = null;
                                                                            }
                                                                        }
                                                                        eVar = h;
                                                                        str4 = str11;
                                                                        str5 = str10;
                                                                        z11 = z14;
                                                                        rVar2 = null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        file3 = file;
                                                        rVar3 = null;
                                                    } else {
                                                        eVar = h;
                                                        str4 = str11;
                                                        x0Var3 = x0Var4;
                                                        cls3 = cls4;
                                                        str5 = str10;
                                                        z11 = z14;
                                                        rVar2 = null;
                                                        l1 l1Var5 = d.f8324a;
                                                        p2 p2Var9 = f4524f;
                                                        p2Var9.getClass();
                                                        d.f8326c.c(new r0(p2Var9.s));
                                                    }
                                                    rVar3 = rVar2;
                                                    file3 = file;
                                                    str10 = str5;
                                                    cls4 = cls3;
                                                    x0Var4 = x0Var3;
                                                    h = eVar;
                                                    z14 = z11;
                                                    str11 = str4;
                                                }
                                            }
                                            j = 0;
                                            long j112 = j0Var.l;
                                            if (j <= 0) {
                                            }
                                            if (w6.b()) {
                                            }
                                            eVar = h;
                                            str4 = str11;
                                            x0Var3 = x0Var4;
                                            cls3 = cls4;
                                            str5 = str10;
                                            z11 = z14;
                                            rVar2 = null;
                                            l1 l1Var52 = d.f8324a;
                                            p2 p2Var92 = f4524f;
                                            p2Var92.getClass();
                                            d.f8326c.c(new r0(p2Var92.s));
                                            rVar3 = rVar2;
                                            file3 = file;
                                            str10 = str5;
                                            cls4 = cls3;
                                            x0Var4 = x0Var3;
                                            h = eVar;
                                            z14 = z11;
                                            str11 = str4;
                                        } else {
                                            e eVar2 = h;
                                            l1 l1Var6 = d.f8324a;
                                            p2 p2Var10 = f4524f;
                                            p2Var10.getClass();
                                            d.f8326c.c(new r0(p2Var10.s));
                                            rVar3 = null;
                                            file3 = file;
                                            h = eVar2;
                                            z14 = z14;
                                        }
                                        i8 = 1;
                                    }
                                } else {
                                    file = file3;
                                    z10 = z14;
                                    r15 = rVar3;
                                    break;
                                }
                            }
                            str2 = str11;
                            x0Var2 = x0Var4;
                            Class<InstallUpdatesWorker> cls5 = cls4;
                            String str22 = str10;
                            l1 l1Var7 = d.f8324a;
                            if ((l1Var7.getValue() instanceof v0) || (l1Var7.getValue() instanceof y0)) {
                                d.g(x0Var2);
                            }
                            r rVar12 = downloadUpdatesWorker.f4529d;
                            rVar12.getClass();
                            long j13 = rVar12.j();
                            r rVar13 = downloadUpdatesWorker.f4529d;
                            rVar13.getClass();
                            if (j13 == rVar13.k()) {
                                r rVar14 = downloadUpdatesWorker.f4529d;
                                rVar14.getClass();
                                rVar14.m = 0;
                                g f17 = g.D.f(downloadUpdatesWorker.f4526a);
                                f17.b();
                                r rVar15 = downloadUpdatesWorker.f4529d;
                                rVar15.getClass();
                                f17.q0(rVar15);
                                f17.d();
                            }
                            d.g(x0Var2);
                            d.f8326c.c(new s0(downloadUpdatesWorker.f4529d));
                            r rVar16 = downloadUpdatesWorker.f4529d;
                            rVar16.getClass();
                            i = 1;
                            if (v.a0(rVar16.f7495b, downloadUpdatesWorker.f4526a.getPackageName(), true)) {
                                Activity activity = c.o;
                                r rVar17 = downloadUpdatesWorker.f4529d;
                                rVar17.getClass();
                                File g = rVar17.g();
                                if (g != null && g.exists()) {
                                    int i11 = Build.VERSION.SDK_INT;
                                    if (i11 >= 31 && activity == null) {
                                        float f18 = UptodownApp.G;
                                        n4.e.p(downloadUpdatesWorker.f4526a, r15, g);
                                        d.d();
                                    } else {
                                        try {
                                            Context context4 = downloadUpdatesWorker.f4526a;
                                            context4.getClass();
                                            if (i11 >= 24) {
                                                fromFile = FileProvider.getUriForFile(context4, context4.getPackageName() + ".provider", g);
                                                fromFile.getClass();
                                            } else {
                                                fromFile = Uri.fromFile(g);
                                                fromFile.getClass();
                                            }
                                            l.j(context4, fromFile);
                                        } catch (Exception e10) {
                                            e10.printStackTrace();
                                        }
                                    }
                                }
                                str3 = str22;
                            } else {
                                Context context5 = downloadUpdatesWorker.f4526a;
                                context5.getClass();
                                float f19 = UptodownApp.G;
                                str3 = str22;
                                if (!n4.e.o(context5, str3)) {
                                    cls2 = cls5;
                                    WorkManager.Companion.getInstance(context5).enqueue(((OneTimeWorkRequest.Builder) i6.l(cls2, str3)).build());
                                }
                            }
                            cls2 = cls5;
                        } else {
                            str2 = str11;
                            file = file3;
                            x0Var2 = x0Var4;
                            i = i8;
                            cls2 = cls4;
                            str3 = str10;
                            z10 = z14;
                            r15 = rVar3;
                        }
                        float f20 = UptodownApp.G;
                        h = n4.e.h();
                        str10 = str3;
                        i8 = i;
                        cls4 = cls2;
                        rVar3 = r15;
                        file3 = file;
                        x0Var4 = x0Var2;
                        z14 = z10;
                        str11 = str2;
                    }
                }
            }
            x0Var = x0Var4;
            cls = cls4;
            str = str10;
        } else {
            x0Var = x0Var4;
            cls = cls4;
            str = "InstallUpdatesWorker";
            d.f8326c.c(o0.f7462a);
        }
        Context context6 = downloadUpdatesWorker.f4526a;
        context6.getClass();
        float f21 = UptodownApp.G;
        if (!n4.e.o(context6, str)) {
            WorkManager.Companion.getInstance(context6).enqueue(((OneTimeWorkRequest.Builder) i6.l(cls, str)).build());
        }
        d.g(x0Var);
        d.f8326c.c(l0.f7431a);
        ListenableWorker.Result success3 = ListenableWorker.Result.success();
        success3.getClass();
        return success3;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final p2 o() {
        return f4524f;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final boolean p() {
        return d.f8325b.f5266a.getValue() instanceof v0;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final boolean q() {
        return d.f8325b.f5266a.getValue() instanceof y0;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void t(p2 p2Var, r rVar, j0 j0Var, Bundle bundle, String str, long j) {
        p2Var.getClass();
        rVar.getClass();
        bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail");
        if (j > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j) / 1000);
        }
        r(bundle, str, j0Var);
    }
}

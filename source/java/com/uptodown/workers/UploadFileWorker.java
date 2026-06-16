package com.uptodown.workers;

import a5.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.UptodownApp;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import k5.e;
import k5.e1;
import k5.g2;
import o4.a0;
import o4.b1;
import org.json.JSONObject;
import s4.c;
import s7.a;
import w5.g;
import w5.s;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class UploadFileWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4548a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f4549b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4548a = context;
        this.f4549b = new a0(context, 22);
        Activity activity = c.o;
        this.f4548a = b.j(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03ee  */
    @Override // androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableWorker.Result doWork() {
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z10;
        String str12;
        boolean z11;
        String str13;
        long j;
        boolean z12;
        e eVar;
        Context context2;
        String str14;
        String str15;
        e eVar2;
        ApplicationInfo applicationInfo;
        String str16;
        String str17;
        boolean z13;
        JSONObject jSONObject;
        boolean z14;
        float f7 = UptodownApp.G;
        Context context3 = this.f4548a;
        String str18 = "DownloadUpdatesWorker";
        boolean n10 = n4.e.n(context3, "DownloadUpdatesWorker");
        boolean n11 = n4.e.n(context3, "downloadApkWorker");
        if (!n10 && !n11) {
            String string = getInputData().getString("sha256");
            String str19 = "power";
            String str20 = "plugged";
            String str21 = "scale";
            String str22 = "android.intent.action.BATTERY_CHANGED";
            a0 a0Var = this.f4549b;
            if (string == null) {
                long x5 = a.x(0L, context3, "last_get_file_to_upload_timestamp");
                long currentTimeMillis = System.currentTimeMillis();
                if (x5 + 7200000 < currentTimeMillis) {
                    int i = m5.c.f7913a;
                    Intent registerReceiver = context3.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (registerReceiver != null) {
                        str17 = string;
                        int intExtra = registerReceiver.getIntExtra("level", -1);
                        str2 = "level";
                        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                        int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
                        if (intExtra3 != 1 && intExtra3 != 2) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (((int) ((intExtra / intExtra2) * 100.0f)) >= 25 || z14) {
                            z13 = true;
                            Object systemService = context3.getSystemService("power");
                            systemService.getClass();
                            boolean isPowerSaveMode = ((PowerManager) systemService).isPowerSaveMode();
                            if (z13 || n4.e.n(context3, "DownloadUpdatesWorker") || n4.e.n(context3, "downloadApkWorker") || isPowerSaveMode) {
                                str = "downloadApkWorker";
                            } else {
                                String string2 = Settings.Secure.getString(context3.getContentResolver(), "android_id");
                                s sVar = new s(context3, 0);
                                string2.getClass();
                                str = "downloadApkWorker";
                                g2 k10 = sVar.k("https://t.uptodown.app:443/eapi/v2/tracker/app-to-upload/".concat(string2), null, ShareTarget.METHOD_GET, false);
                                a0Var.x("getFileToUpload", null, k10, null);
                                if (sVar.c(k10) && k10.f7389a != null) {
                                    String str23 = k10.f7389a;
                                    str23.getClass();
                                    JSONObject jSONObject2 = new JSONObject(str23);
                                    if (jSONObject2.optInt("success") == 1) {
                                        jSONObject = jSONObject2.optJSONObject("data");
                                        if (jSONObject == null && !jSONObject.isNull("sha256")) {
                                            str3 = jSONObject.optString("sha256");
                                        } else {
                                            str3 = str17;
                                        }
                                        a.Q(currentTimeMillis, context3, "last_get_file_to_upload_timestamp");
                                        if (str3 != null) {
                                            g f10 = g.D.f(context3);
                                            f10.b();
                                            ArrayList E = f10.E();
                                            f10.d();
                                            PackageManager packageManager = context3.getPackageManager();
                                            Iterator it = E.iterator();
                                            it.getClass();
                                            while (true) {
                                                Iterator it2 = it;
                                                str4 = str18;
                                                if (it.hasNext()) {
                                                    Object next = it2.next();
                                                    next.getClass();
                                                    str5 = str19;
                                                    e eVar3 = (e) next;
                                                    str6 = str20;
                                                    String str24 = eVar3.B;
                                                    str7 = str21;
                                                    str8 = str22;
                                                    Context context4 = context3;
                                                    if (str24 != null && str24.equalsIgnoreCase(str3)) {
                                                        try {
                                                            packageManager.getClass();
                                                            String str25 = eVar3.l;
                                                            str25.getClass();
                                                            eVar2 = eVar3;
                                                            try {
                                                                applicationInfo = o.b(packageManager, str25, 128);
                                                            } catch (PackageManager.NameNotFoundException unused) {
                                                                applicationInfo = null;
                                                                if (applicationInfo == null) {
                                                                }
                                                            }
                                                        } catch (PackageManager.NameNotFoundException unused2) {
                                                            eVar2 = eVar3;
                                                        }
                                                        if (applicationInfo == null) {
                                                            String C = a.a.C(applicationInfo.sourceDir);
                                                            if (str3.equalsIgnoreCase(C)) {
                                                                str10 = applicationInfo.sourceDir;
                                                                context = context4;
                                                            } else {
                                                                Bundle k11 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "ignored", "error", "hashNotMatch");
                                                                k11.putString("filehash", str3);
                                                                k11.putString("packagename", applicationInfo.packageName);
                                                                k11.putString("filehashCalculated", C);
                                                                if (!a4.f3696e) {
                                                                    str16 = "mobile";
                                                                } else {
                                                                    str16 = "wifi";
                                                                }
                                                                k11.putString("connectionType", str16);
                                                                k11.putLong("downBandwidthKbps", a4.f3694c);
                                                                k11.putLong("upBandwidthKbps", a4.f3695d);
                                                                a0Var.u(k11, "upload");
                                                                g f11 = g.D.f(context4);
                                                                f11.b();
                                                                e eVar4 = eVar2;
                                                                eVar4.B = C;
                                                                f11.n0(eVar4);
                                                                f11.d();
                                                                context = context4;
                                                            }
                                                        } else {
                                                            context2 = context4;
                                                            eVar = eVar2;
                                                        }
                                                    } else {
                                                        eVar = eVar3;
                                                        context2 = context4;
                                                    }
                                                    PackageManager packageManager2 = packageManager;
                                                    g f12 = g.D.f(context2);
                                                    f12.b();
                                                    ArrayList D = f12.D(eVar);
                                                    f12.d();
                                                    if (D != null) {
                                                        Iterator it3 = D.iterator();
                                                        it3.getClass();
                                                        while (it3.hasNext()) {
                                                            Object next2 = it3.next();
                                                            next2.getClass();
                                                            Iterator it4 = it3;
                                                            e1 e1Var = (e1) next2;
                                                            context = context2;
                                                            if (str3.equalsIgnoreCase(e1Var.f7346a) && (str14 = e1Var.f7348c) != null) {
                                                                String C2 = a.a.C(str14);
                                                                if (str3.equalsIgnoreCase(C2)) {
                                                                    str10 = e1Var.f7348c;
                                                                } else {
                                                                    Bundle k12 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "ignored", "error", "hashNotMatch");
                                                                    k12.putString("filehash", str3);
                                                                    k12.putString("packagename", eVar.l);
                                                                    k12.putString("filehashCalculated", C2);
                                                                    if (!a4.f3696e) {
                                                                        str15 = "mobile";
                                                                    } else {
                                                                        str15 = "wifi";
                                                                    }
                                                                    k12.putString("connectionType", str15);
                                                                    k12.putLong("downBandwidthKbps", a4.f3694c);
                                                                    k12.putLong("upBandwidthKbps", a4.f3695d);
                                                                    a0Var.u(k12, "upload");
                                                                }
                                                            } else {
                                                                context2 = context;
                                                                it3 = it4;
                                                            }
                                                        }
                                                    }
                                                    context3 = context2;
                                                    it = it2;
                                                    str20 = str6;
                                                    str18 = str4;
                                                    str19 = str5;
                                                    str21 = str7;
                                                    str22 = str8;
                                                    packageManager = packageManager2;
                                                } else {
                                                    context = context3;
                                                    str5 = str19;
                                                    str6 = str20;
                                                    str7 = str21;
                                                    str8 = str22;
                                                    Bundle k13 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "ignored", "error", "hashNotFound");
                                                    k13.putString("filehash", str3);
                                                    if (!a4.f3696e) {
                                                        str9 = "mobile";
                                                    } else {
                                                        str9 = "wifi";
                                                    }
                                                    k13.putString("connectionType", str9);
                                                    k13.putLong("downBandwidthKbps", a4.f3694c);
                                                    k13.putLong("upBandwidthKbps", a4.f3695d);
                                                    a0Var.u(k13, "upload");
                                                }
                                            }
                                            str10 = null;
                                            if (str10 != null) {
                                                Context context5 = context;
                                                Intent registerReceiver2 = context5.registerReceiver(null, new IntentFilter(str8));
                                                if (registerReceiver2 != null) {
                                                    int intExtra4 = registerReceiver2.getIntExtra(str2, -1);
                                                    int intExtra5 = registerReceiver2.getIntExtra(str7, -1);
                                                    int intExtra6 = registerReceiver2.getIntExtra(str6, -1);
                                                    if (intExtra6 != 1 && intExtra6 != 2) {
                                                        z12 = false;
                                                    } else {
                                                        z12 = true;
                                                    }
                                                    if (((int) ((intExtra4 / intExtra5) * 100.0f)) >= 25 || z12) {
                                                        str11 = str5;
                                                        z10 = true;
                                                        Object systemService2 = context5.getSystemService(str11);
                                                        systemService2.getClass();
                                                        boolean isPowerSaveMode2 = ((PowerManager) systemService2).isPowerSaveMode();
                                                        if (z10) {
                                                            float f13 = UptodownApp.G;
                                                            if (!n4.e.n(context5, str4) && !n4.e.n(context5, str) && !isPowerSaveMode2) {
                                                                File file = new File(str10);
                                                                if (file.exists()) {
                                                                    long length = file.length();
                                                                    boolean z15 = a4.f3696e;
                                                                    if (z15) {
                                                                        z11 = b.H(context5, file, str3, false);
                                                                    } else if (a4.f3693b && (z15 || a4.f3695d >= 9152)) {
                                                                        String str26 = str3;
                                                                        long x10 = a.x(0L, context5, "bytes_uploaded");
                                                                        long x11 = a.x(0L, context5, "timestamp_uploaded");
                                                                        if (length > 0) {
                                                                            long currentTimeMillis2 = System.currentTimeMillis() - x11;
                                                                            j = length;
                                                                            if (currentTimeMillis2 > 2592000000L) {
                                                                                long currentTimeMillis3 = System.currentTimeMillis();
                                                                                a.Q(0L, context5, "bytes_uploaded");
                                                                                a.Q(currentTimeMillis3, context5, "timestamp_uploaded");
                                                                                x10 = 0;
                                                                            }
                                                                            if (j < 209715200 - x10) {
                                                                                z11 = b.H(context5, file, str26, true);
                                                                            }
                                                                        } else {
                                                                            j = length;
                                                                        }
                                                                        Bundle k14 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "ignored", "error", "size");
                                                                        k14.putString("size", a.a.I(j));
                                                                        a.a.d(k14);
                                                                        a0Var.u(k14, "upload");
                                                                    } else {
                                                                        Bundle k15 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "ignored", "error", "connection");
                                                                        k15.putString("size", a.a.I(length));
                                                                        a.a.d(k15);
                                                                        a0Var.u(k15, "upload");
                                                                    }
                                                                    if (z11) {
                                                                        float f14 = UptodownApp.G;
                                                                        n4.e.D(context5);
                                                                    }
                                                                } else {
                                                                    Bundle k16 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "ignored", "error", "fileNotFound");
                                                                    if (!a4.f3696e) {
                                                                        str13 = "mobile";
                                                                    } else {
                                                                        str13 = "wifi";
                                                                    }
                                                                    k16.putString("connectionType", str13);
                                                                    k16.putLong("downBandwidthKbps", a4.f3694c);
                                                                    k16.putLong("upBandwidthKbps", a4.f3695d);
                                                                    a0Var.u(k16, "upload");
                                                                }
                                                                z11 = false;
                                                                if (z11) {
                                                                }
                                                            }
                                                        }
                                                        Bundle f15 = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "ignored");
                                                        if (z10) {
                                                            f15.putString("error", "battery");
                                                        } else {
                                                            f15.putString("error", "notIdle");
                                                        }
                                                        if (a4.f3696e) {
                                                            str12 = "mobile";
                                                        } else {
                                                            str12 = "wifi";
                                                        }
                                                        f15.putString("connectionType", str12);
                                                        f15.putLong("downBandwidthKbps", a4.f3694c);
                                                        f15.putLong("upBandwidthKbps", a4.f3695d);
                                                        a0Var.u(f15, "upload");
                                                        z11 = false;
                                                        if (z11) {
                                                        }
                                                    }
                                                }
                                                str11 = str5;
                                                z10 = false;
                                                Object systemService22 = context5.getSystemService(str11);
                                                systemService22.getClass();
                                                boolean isPowerSaveMode22 = ((PowerManager) systemService22).isPowerSaveMode();
                                                if (z10) {
                                                }
                                                Bundle f152 = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "ignored");
                                                if (z10) {
                                                }
                                                if (a4.f3696e) {
                                                }
                                                f152.putString("connectionType", str12);
                                                f152.putLong("downBandwidthKbps", a4.f3694c);
                                                f152.putLong("upBandwidthKbps", a4.f3695d);
                                                a0Var.u(f152, "upload");
                                                z11 = false;
                                                if (z11) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            jSONObject = null;
                            if (jSONObject == null) {
                            }
                            str3 = str17;
                            a.Q(currentTimeMillis, context3, "last_get_file_to_upload_timestamp");
                            if (str3 != null) {
                            }
                        }
                    } else {
                        str17 = string;
                        str2 = "level";
                    }
                    z13 = false;
                    Object systemService3 = context3.getSystemService("power");
                    systemService3.getClass();
                    boolean isPowerSaveMode3 = ((PowerManager) systemService3).isPowerSaveMode();
                    if (z13) {
                    }
                    str = "downloadApkWorker";
                    jSONObject = null;
                    if (jSONObject == null) {
                    }
                    str3 = str17;
                    a.Q(currentTimeMillis, context3, "last_get_file_to_upload_timestamp");
                    if (str3 != null) {
                    }
                }
            }
            str = "downloadApkWorker";
            str2 = "level";
            str3 = string;
            if (str3 != null) {
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        success.getClass();
        return success;
    }
}

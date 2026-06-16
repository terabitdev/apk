package com.uptodown.workers;

import a5.t;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.UptodownApp;
import d7.x;
import f8.l1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k5.d;
import k5.p2;
import k5.r;
import n4.e;
import n5.f;
import s4.c;
import w5.a;
import w5.g;
import z1.b;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GenerateQueueWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4531b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4532c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateQueueWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4530a = context;
        this.f4531b = workerParameters.getInputData().getBoolean("downloadAnyway", false);
        this.f4532c = workerParameters.getInputData().getBoolean("downloadUptodown", false);
        this.f4533d = workerParameters.getInputData().getString("packagename");
        Activity activity = c.o;
        this.f4530a = b.j(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f5, code lost:
    
        if (r0.F.isEmpty() != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        r0 = r0.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ff, code lost:
    
        if (r0.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0102, code lost:
    
        r11 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
    
        if (r10 >= r11) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0108, code lost:
    
        r12 = r0.get(r10);
        r10 = r10 + 1;
        r12 = (k5.j0) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0112, code lost:
    
        if (r12.r < r9) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0120, code lost:
    
        if (java.lang.System.currentTimeMillis() <= r12.s) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0122, code lost:
    
        r10 = r10;
        r9 = 4;
     */
    @Override // androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableWorker.Result doWork() {
        File g;
        float f7 = UptodownApp.G;
        Context context = this.f4530a;
        context.getClass();
        if (!e.o(context, "DownloadUpdatesWorker")) {
            String str = this.f4533d;
            boolean z10 = this.f4532c;
            Context context2 = this.f4530a;
            ArrayList arrayList = new ArrayList();
            g f10 = g.D.f(context2);
            f10.b();
            ArrayList arrayList2 = new ArrayList();
            String packageName = context2.getPackageName();
            if (z10) {
                packageName.getClass();
                p2 Y = f10.Y(packageName);
                if (Y != null) {
                    arrayList2.add(Y);
                }
            } else if (str != null) {
                p2 Y2 = f10.Y(str);
                if (Y2 != null) {
                    arrayList2.add(Y2);
                }
            } else {
                arrayList2 = f10.a0();
            }
            boolean f11 = a.f(context2);
            Iterator it = arrayList2.iterator();
            it.getClass();
            while (true) {
                String str2 = null;
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                next.getClass();
                p2 p2Var = (p2) next;
                k5.e h = a.h(context2, p2Var.f7479b);
                if (h != null) {
                    if (!v.a0(packageName, h.l, true) && str == null) {
                        if (!f11) {
                            Context context3 = this.f4530a;
                            if (h.F > 0 && h.v == 0 && h.b(context3)) {
                                String str3 = h.l;
                                if (str3 != null) {
                                    str2 = a.b(context3, str3);
                                }
                                if (str2 != null && str2.equalsIgnoreCase(context3.getPackageName())) {
                                }
                            }
                        }
                    }
                    int i3 = 4;
                    if (str == null) {
                        if (!p2Var.c()) {
                            String str4 = p2Var.f7479b;
                            str4.getClass();
                            try {
                                int applicationEnabledSetting = context2.getPackageManager().getApplicationEnabledSetting(str4);
                                if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3 && applicationEnabledSetting != 4) {
                                }
                            } catch (Error e10) {
                                e10.printStackTrace();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    r a10 = p2Var.a(context2);
                    if (a10 == null || !a10.c() || (g = a10.g()) == null || !g.exists()) {
                        arrayList.add(h);
                    }
                }
            }
            f10.d();
            x.j0(arrayList, new t(8));
            int size = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 < size) {
                    if (v.a0(packageName, ((k5.e) arrayList.get(i8)).l, true) && ((k5.e) arrayList.get(i8)).p == d.f7324a) {
                        Object obj = arrayList.get(i8);
                        obj.getClass();
                        arrayList.remove(i8);
                        arrayList.add(0, (k5.e) obj);
                        break;
                    }
                    i8++;
                } else {
                    break;
                }
            }
            if (str == null) {
                Iterator it2 = arrayList.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    next2.getClass();
                    String str5 = ((k5.e) next2).l;
                    if (str5 != null) {
                        f.b(str5, "actualizacion_automatica");
                    }
                }
            }
            float f12 = UptodownApp.G;
            synchronized (n5.c.f8321a) {
                l1 l1Var = n5.c.f8322b;
                List T0 = d7.t.T0(arrayList);
                l1Var.getClass();
                l1Var.j(null, T0);
            }
            float f13 = UptodownApp.G;
            ArrayList i10 = e.i();
            if (i10 != null && !i10.isEmpty()) {
                Context context4 = this.f4530a;
                boolean z11 = this.f4531b;
                context4.getClass();
                if (!e.o(context4, "DownloadUpdatesWorker")) {
                    WorkManager.Companion.getInstance(context4).enqueue(((OneTimeWorkRequest.Builder) i6.l(DownloadUpdatesWorker.class, "DownloadUpdatesWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", z11).build()).build());
                }
            } else {
                Context context5 = this.f4530a;
                context5.getClass();
                if (!e.o(context5, "InstallUpdatesWorker")) {
                    WorkManager.Companion.getInstance(context5).enqueue(((OneTimeWorkRequest.Builder) i6.l(InstallUpdatesWorker.class, "InstallUpdatesWorker")).build());
                }
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        success.getClass();
        return success;
    }
}

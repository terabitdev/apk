package com.uptodown;

import a5.o;
import a5.w;
import a6.m;
import a9.y;
import a9.z;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.ResultReceiver;
import android.service.notification.StatusBarNotification;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import b6.r;
import c7.q;
import c8.f0;
import c8.p0;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.l5;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ActionButton;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.DisplayInfo;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;
import com.uptodown.workers.DeviceStatusWorker;
import com.uptodown.workers.SearchApksWorker;
import e9.a;
import f1.g;
import h4.e;
import j8.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import k5.k;
import k5.t2;
import k5.v2;
import kotlin.jvm.internal.p;
import m4.a0;
import m4.n;
import m5.b;
import m5.f;
import n4.h;
import s4.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UptodownApp extends c implements ChoiceCmpCallback {
    public static float G = 1.0f;
    public static String H;
    public static String I;
    public static String J;
    public static String K;
    public static String L;
    public static String M;
    public static String N;
    public static String O;
    public static String P;
    public static int Q;
    public static int R;
    public static int S;
    public static int T;
    public static m U;
    public static m V;
    public static int W;
    public static e X;
    public static e Y;

    /* renamed from: b0, reason: collision with root package name */
    public static boolean f4377b0;

    /* renamed from: c0, reason: collision with root package name */
    public static boolean f4378c0;

    /* renamed from: d0, reason: collision with root package name */
    public static boolean f4379d0;

    /* renamed from: e0, reason: collision with root package name */
    public static k f4380e0;

    /* renamed from: f0, reason: collision with root package name */
    public static long f4381f0;

    /* renamed from: g0, reason: collision with root package name */
    public static ArrayList f4382g0;
    public n D;
    public b E;
    public final h8.c F;
    public static final HashMap Z = new HashMap();

    /* renamed from: a0, reason: collision with root package name */
    public static final f f4376a0 = new ResultReceiver(null);
    public static final Object h0 = new Object();

    public UptodownApp() {
        this.f10441a = new AtomicBoolean(false);
        this.f10442b = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new h(this);
        this.f10443n = new s4.b(this);
        this.F = f0.b(g.L(f0.d(), p0.f3588a));
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onActionButtonClicked(ActionButton actionButton) {
        actionButton.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onCCPAConsentGiven(String str) {
        str.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onCMPUIStatusChanged(DisplayInfo displayInfo) {
        displayInfo.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onCmpError(ChoiceError choiceError) {
        choiceError.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onCmpLoaded(PingReturn pingReturn) {
        pingReturn.getClass();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:6|9b|13|(2:15|(1:17))|18|(1:20)(1:193)|21|(2:23|(1:25))(2:187|(2:189|(1:191))(1:192))|26|(2:28|(1:30)(1:183))(2:184|(1:186))|31|(2:33|(1:35))|36|(1:38)|39|(26:174|175|176|(1:178)|180|(1:173)(1:46)|47|(1:49)|50|(1:172)|54|(1:58)|59|(11:61|62|63|65|66|(3:68|(2:71|69)|72)|73|74|(5:77|(2:78|(1:107)(2:80|(2:82|83)(1:106)))|(3:85|86|(3:102|103|104)(3:88|89|(3:99|100|101)(3:91|92|(3:94|95|96)(1:98))))(1:105)|97|75)|108|109)|120|121|122|(8:124|(1:130)|131|(3:133|134|144)|145|(3:147|(1:(1:(1:151))(1:153))(1:154)|152)|155|(4:157|(1:(2:160|(1:162))(1:166))(1:167)|163|164)(1:168))|170|(2:126|130)|131|(0)|145|(0)|155|(0)(0))|42|(1:44)|173|47|(0)|50|(1:52)|172|54|(2:56|58)|59|(0)|120|121|122|(0)|170|(0)|131|(0)|145|(0)|155|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02ba, code lost:
    
        if ((r4.flags & 129) != 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044a A[Catch: Exception -> 0x044f, TRY_LEAVE, TryCatch #0 {Exception -> 0x044f, blocks: (B:122:0x043e, B:124:0x044a), top: B:121:0x043e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ba  */
    /* JADX WARN: Type inference failed for: r4v21, types: [android.os.ResultReceiver, m5.d] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.content.BroadcastReceiver, m5.b] */
    @Override // s4.c, android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate() {
        boolean z10;
        boolean z11;
        boolean z12;
        Context applicationContext;
        v2 h;
        SharedPreferences sharedPreferences;
        Cursor cursor;
        Iterator it;
        super.onCreate();
        int i = 1;
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        AtomicLong[][] atomicLongArr = w5.h.f11199a;
        Context applicationContext2 = getApplicationContext();
        w5.h.f11200b = applicationContext2;
        int i3 = 3;
        int i8 = 2;
        int i10 = 0;
        g7.c cVar = null;
        if (applicationContext2 != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(6, -60);
            f0.z(w5.h.f11201c, null, null, new a5.c(applicationContext2, String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3)), cVar, i3), 3);
        }
        a9.h hVar = new a9.h(new File(getCacheDir(), "picasso-cache"), 15728640L);
        y yVar = new y();
        yVar.i = hVar;
        yVar.f388e.add(new a(i));
        z zVar = new z(yVar);
        w wVar = new w(this);
        m3.c cVar2 = new m3.c(zVar, 11);
        if (((m3.c) wVar.l) == null) {
            wVar.l = cVar2;
            a0 b10 = wVar.b();
            synchronized (a0.class) {
                if (a0.f7818k == null) {
                    a0.f7818k = b10;
                } else {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
            }
            l5.w(this);
            Context applicationContext3 = getApplicationContext();
            applicationContext3.getClass();
            String z13 = s7.a.z(applicationContext3, "fcmToken");
            if (z13 != null) {
                Context applicationContext4 = getApplicationContext();
                applicationContext4.getClass();
                if (!s7.a.v(applicationContext4, "fcmTokenSent", false)) {
                    f0.z(this.F, null, null, new a5.m(this, z13, cVar, 18), 3);
                }
            }
            h8.c cVar3 = this.F;
            j8.e eVar = p0.f3588a;
            d dVar = d.f7053a;
            f0.z(cVar3, dVar, null, new n4.f(this, cVar, i), 2);
            w5.k kVar = (w5.k) new o4.a0(this).l;
            Object systemService = getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                connectivityManager.registerDefaultNetworkCallback(kVar);
            } else {
                connectivityManager.registerNetworkCallback(builder.build(), kVar);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            n nVar = new n();
            this.D = nVar;
            registerReceiver(nVar, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter2.addDataScheme("package");
            ?? broadcastReceiver = new BroadcastReceiver();
            this.E = broadcastReceiver;
            registerReceiver(broadcastReceiver, intentFilter2);
            WorkManager.Companion.getInstance(this).enqueueUniquePeriodicWork("DeviceStatusWorker", ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) DeviceStatusWorker.class, 1L, TimeUnit.HOURS).addTag("DeviceStatusWorker").build());
            f0.z(this.F, dVar, null, new n4.g(this, cVar, i10), 2);
            int i12 = getResources().getConfiguration().uiMode & 48;
            String A = s7.a.A(this, "dark_mode", "system");
            if (A.equalsIgnoreCase("yes")) {
                if (i12 != 32) {
                    AppCompatDelegate.setDefaultNightMode(2);
                }
            } else if (A.equalsIgnoreCase("no")) {
                if (i12 != 16) {
                    AppCompatDelegate.setDefaultNightMode(1);
                }
            } else {
                AppCompatDelegate.setDefaultNightMode(-1);
            }
            Context applicationContext5 = getApplicationContext();
            applicationContext5.getClass();
            String z14 = s7.a.z(applicationContext5, "Language");
            if (z14 == null) {
                String language = Locale.getDefault().getLanguage();
                if (g.E(language)) {
                    Context applicationContext6 = getApplicationContext();
                    applicationContext6.getClass();
                    language.getClass();
                    s7.a.P(applicationContext6, language);
                } else {
                    Context applicationContext7 = getApplicationContext();
                    applicationContext7.getClass();
                    s7.a.P(applicationContext7, "en");
                }
            } else if (!g.E(z14)) {
                Context applicationContext8 = getApplicationContext();
                applicationContext8.getClass();
                s7.a.P(applicationContext8, "en");
                Context applicationContext9 = getApplicationContext();
                applicationContext9.getClass();
                s7.a.M(applicationContext9, "settings_utd_sended", false);
            }
            f0.z(this.F, dVar, null, new n4.g(this, cVar, i8), 2);
            Context applicationContext10 = getApplicationContext();
            applicationContext10.getClass();
            if (s7.a.v(applicationContext10, "is_status_code_526", false)) {
                Context applicationContext11 = getApplicationContext();
                applicationContext11.getClass();
                if (731 != s7.a.w(applicationContext11, -1, "versioncode_526")) {
                    Context applicationContext12 = getApplicationContext();
                    applicationContext12.getClass();
                    s7.a.M(applicationContext12, "is_status_code_526", false);
                    Context applicationContext13 = getApplicationContext();
                    applicationContext13.getClass();
                    s7.a.S(applicationContext13, "url_526", null);
                }
            }
            if (i11 >= 26) {
                Object systemService2 = getSystemService("notification");
                systemService2.getClass();
                String string = getString(R.string.app_name);
                string.getClass();
                String string2 = getString(R.string.notification_channel_description);
                string2.getClass();
                NotificationChannel notificationChannel = new NotificationChannel("CHANNEL_ID_UPTODOWN", string, 3);
                notificationChannel.setSound(null, null);
                notificationChannel.setDescription(string2);
                notificationChannel.enableLights(true);
                ((NotificationManager) systemService2).createNotificationChannel(notificationChannel);
            }
            n4.e.z(this);
            f0.z(this.F, null, null, new a5.m(this, new h(this), cVar, 19), 3);
            u4.a aVar = new u4.a(this);
            PackageManager packageManager = getPackageManager();
            int checkPermission = packageManager.checkPermission("android.permission.INSTALL_PACKAGES", getPackageName());
            int checkPermission2 = packageManager.checkPermission("android.permission.DELETE_PACKAGES", getPackageName());
            if (checkPermission != 0 || checkPermission2 != 0) {
                try {
                    String packageName = getPackageName();
                    packageName.getClass();
                    ApplicationInfo applicationInfo = o.e(packageManager, packageName, 4096).applicationInfo;
                    if (applicationInfo != null) {
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                z10 = false;
                if (z10 && Build.VERSION.SDK_INT <= 29) {
                    z11 = g.D();
                } else {
                    z11 = false;
                }
                aVar.e("device_rooted", z11);
                if (!z11) {
                    aVar.i(false);
                    aVar.e("install_apk_as_root_system", false);
                }
                aVar.e("system_app", z10);
                if (!aVar.c("device_rooted", false) || aVar.c("system_app", false)) {
                    ?? resultReceiver = new ResultReceiver(null);
                    c.s = resultReceiver;
                    resultReceiver.f7914a = getApplicationContext();
                }
                if (aVar.c("search_apk_worker_active", true) && !n4.e.o(this, "SearchApksWorker")) {
                    WorkManager.Companion.getInstance(this).enqueue(((OneTimeWorkRequest.Builder) i6.l(SearchApksWorker.class, "SearchApksWorker")).build());
                }
                h8.c cVar4 = this.F;
                Context applicationContext14 = getApplicationContext();
                applicationContext14.getClass();
                cVar4.getClass();
                j8.e eVar2 = p0.f3588a;
                f0.z(cVar4, d.f7053a, null, new r(applicationContext14, cVar, i8), 2);
                Context applicationContext15 = getApplicationContext();
                applicationContext15.getClass();
                if (Build.VERSION.SDK_INT >= 24) {
                    Object systemService3 = applicationContext15.getSystemService("notification");
                    systemService3.getClass();
                    StatusBarNotification[] activeNotifications = ((NotificationManager) systemService3).getActiveNotifications();
                    w5.g f7 = w5.g.D.f(applicationContext15);
                    f7.b();
                    ArrayList arrayList = new ArrayList();
                    try {
                        SQLiteDatabase sQLiteDatabase = f7.f11192a;
                        sQLiteDatabase.getClass();
                        cursor = sQLiteDatabase.query("active_notifications", f7.f11195w, null, null, null, null, null);
                    } catch (Exception e10) {
                        e = e10;
                        cursor = null;
                    }
                    try {
                        if (cursor.moveToFirst()) {
                            arrayList.add(w5.g.f0(cursor));
                            while (cursor.moveToNext()) {
                                arrayList.add(w5.g.f0(cursor));
                            }
                        }
                        cursor.close();
                    } catch (Exception e11) {
                        e = e11;
                        e.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        it = arrayList.iterator();
                        it.getClass();
                        boolean z15 = false;
                        while (it.hasNext()) {
                        }
                        f7.d();
                        Context applicationContext16 = getApplicationContext();
                        applicationContext16.getClass();
                        z1.b.p(applicationContext16, null);
                        f0.z(this.F, null, null, new n4.g(this, cVar, i), 3);
                        sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences.contains("wizard_completed")) {
                        }
                        z12 = false;
                        if (z12) {
                        }
                        Context applicationContext17 = getApplicationContext();
                        applicationContext17.getClass();
                        n4.e.d(applicationContext17);
                        applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        if (s7.a.C(applicationContext, "download_updates_options")) {
                        }
                        if (s7.a.C(applicationContext, "autoplay_video")) {
                        }
                        if (!s7.a.C(applicationContext, "data_saver_options")) {
                        }
                    }
                    it = arrayList.iterator();
                    it.getClass();
                    boolean z152 = false;
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        k5.b bVar = (k5.b) next;
                        q e12 = p.e(activeNotifications);
                        while (true) {
                            if (!e12.hasNext()) {
                                break;
                            } else if (bVar.f7298d == ((StatusBarNotification) e12.next()).getId()) {
                                z152 = true;
                                break;
                            }
                        }
                        if (!z152) {
                            String str = bVar.f7295a;
                            int i13 = bVar.f7297c;
                            if (i13 > -1) {
                                String[] strArr = {String.valueOf(i13)};
                                SQLiteDatabase sQLiteDatabase2 = f7.f11192a;
                                sQLiteDatabase2.getClass();
                                sQLiteDatabase2.delete("active_notifications", "id=?", strArr);
                            } else {
                                int i14 = bVar.f7298d;
                                if (i14 > -1) {
                                    String[] strArr2 = {String.valueOf(i14)};
                                    SQLiteDatabase sQLiteDatabase3 = f7.f11192a;
                                    sQLiteDatabase3.getClass();
                                    sQLiteDatabase3.delete("active_notifications", "notificationId=?", strArr2);
                                } else if (str.length() > 0) {
                                    String[] strArr3 = {str};
                                    SQLiteDatabase sQLiteDatabase4 = f7.f11192a;
                                    sQLiteDatabase4.getClass();
                                    sQLiteDatabase4.delete("active_notifications", "packagename=?", strArr3);
                                }
                            }
                        }
                    }
                    f7.d();
                }
                Context applicationContext162 = getApplicationContext();
                applicationContext162.getClass();
                z1.b.p(applicationContext162, null);
                f0.z(this.F, null, null, new n4.g(this, cVar, i), 3);
                sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("wizard_completed")) {
                    z12 = sharedPreferences.getBoolean("wizard_completed", false);
                    if (z12 && ((h = t2.h(this)) == null || !h.d())) {
                        String packageName2 = getPackageName();
                        packageName2.getClass();
                        ChoiceCmp.startChoice$default(this, packageName2, "p-PLc5NudJ4X36X", this, null, 16, null);
                    }
                    Context applicationContext172 = getApplicationContext();
                    applicationContext172.getClass();
                    n4.e.d(applicationContext172);
                    applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    if (s7.a.C(applicationContext, "download_updates_options")) {
                        String A2 = s7.a.A(applicationContext, "download_updates_options", ExifInterface.GPS_MEASUREMENT_2D);
                        switch (A2.hashCode()) {
                            case 48:
                                if (A2.equals("0")) {
                                    s7.a.S(applicationContext, "updates_mobile_data", "notify");
                                    s7.a.S(applicationContext, "updates_wifi", "notify");
                                    s7.a.M(applicationContext, "updates_active", false);
                                    break;
                                }
                                break;
                            case 49:
                                if (A2.equals("1")) {
                                    s7.a.S(applicationContext, "updates_mobile_data", "notify");
                                    s7.a.S(applicationContext, "updates_wifi", "notify");
                                    s7.a.M(applicationContext, "updates_active", true);
                                    break;
                                }
                                break;
                            case 50:
                                if (A2.equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                                    s7.a.S(applicationContext, "updates_mobile_data", "notify");
                                    s7.a.S(applicationContext, "updates_wifi", "auto");
                                    s7.a.M(applicationContext, "updates_active", true);
                                    break;
                                }
                                break;
                        }
                        s7.a.E(applicationContext, "download_updates_options");
                    }
                    if (s7.a.C(applicationContext, "autoplay_video")) {
                        int parseInt = Integer.parseInt(s7.a.A(applicationContext, "autoplay_video", "0"));
                        if (parseInt != -1) {
                            if (parseInt != 0) {
                                if (parseInt == 1) {
                                    s7.a.M(applicationContext, "autoplay_wifi", true);
                                    s7.a.M(applicationContext, "autoplay_mobile_data", true);
                                }
                            } else {
                                s7.a.M(applicationContext, "autoplay_wifi", true);
                                s7.a.M(applicationContext, "autoplay_mobile_data", false);
                            }
                        } else {
                            s7.a.M(applicationContext, "autoplay_wifi", false);
                            s7.a.M(applicationContext, "autoplay_mobile_data", false);
                        }
                        s7.a.E(applicationContext, "autoplay_video");
                    }
                    if (!s7.a.C(applicationContext, "data_saver_options")) {
                        int parseInt2 = Integer.parseInt(s7.a.A(applicationContext, "data_saver_options", "1"));
                        if (parseInt2 != 0) {
                            if (parseInt2 != 1) {
                                if (parseInt2 == 2) {
                                    s7.a.M(applicationContext, "autoplay_wifi", true);
                                    s7.a.M(applicationContext, "autoplay_mobile_data", true);
                                }
                            } else {
                                s7.a.M(applicationContext, "autoplay_wifi", true);
                                s7.a.M(applicationContext, "autoplay_mobile_data", false);
                            }
                        } else {
                            s7.a.M(applicationContext, "autoplay_wifi", false);
                            s7.a.M(applicationContext, "autoplay_mobile_data", false);
                        }
                        s7.a.E(applicationContext, "data_saver_options");
                        return;
                    }
                    return;
                }
                z12 = false;
                if (z12) {
                    String packageName22 = getPackageName();
                    packageName22.getClass();
                    ChoiceCmp.startChoice$default(this, packageName22, "p-PLc5NudJ4X36X", this, null, 16, null);
                }
                Context applicationContext1722 = getApplicationContext();
                applicationContext1722.getClass();
                n4.e.d(applicationContext1722);
                applicationContext = getApplicationContext();
                applicationContext.getClass();
                if (s7.a.C(applicationContext, "download_updates_options")) {
                }
                if (s7.a.C(applicationContext, "autoplay_video")) {
                }
                if (!s7.a.C(applicationContext, "data_saver_options")) {
                }
            }
            z10 = true;
            if (z10) {
            }
            z11 = false;
            aVar.e("device_rooted", z11);
            if (!z11) {
            }
            aVar.e("system_app", z10);
            if (!aVar.c("device_rooted", false)) {
            }
            ?? resultReceiver2 = new ResultReceiver(null);
            c.s = resultReceiver2;
            resultReceiver2.f7914a = getApplicationContext();
            if (aVar.c("search_apk_worker_active", true)) {
                WorkManager.Companion.getInstance(this).enqueue(((OneTimeWorkRequest.Builder) i6.l(SearchApksWorker.class, "SearchApksWorker")).build());
            }
            h8.c cVar42 = this.F;
            Context applicationContext142 = getApplicationContext();
            applicationContext142.getClass();
            cVar42.getClass();
            j8.e eVar22 = p0.f3588a;
            f0.z(cVar42, d.f7053a, null, new r(applicationContext142, cVar, i8), 2);
            Context applicationContext152 = getApplicationContext();
            applicationContext152.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            Context applicationContext1622 = getApplicationContext();
            applicationContext1622.getClass();
            z1.b.p(applicationContext1622, null);
            f0.z(this.F, null, null, new n4.g(this, cVar, i), 3);
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("wizard_completed")) {
            }
            z12 = false;
            if (z12) {
            }
            Context applicationContext17222 = getApplicationContext();
            applicationContext17222.getClass();
            n4.e.d(applicationContext17222);
            applicationContext = getApplicationContext();
            applicationContext.getClass();
            if (s7.a.C(applicationContext, "download_updates_options")) {
            }
            if (s7.a.C(applicationContext, "autoplay_video")) {
            }
            if (!s7.a.C(applicationContext, "data_saver_options")) {
            }
        } else {
            b.d.j("Downloader already set.");
        }
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onGoogleBasicConsentChange(GoogleBasicConsents googleBasicConsents) {
        googleBasicConsents.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onGoogleVendorConsentGiven(ACData aCData) {
        aCData.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onIABVendorConsentGiven(GDPRData gDPRData) {
        gDPRData.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onNonIABVendorConsentGiven(NonIABData nonIABData) {
        nonIABData.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onReceiveUSRegulationsConsent(USRegulationData uSRegulationData) {
        uSRegulationData.getClass();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        f0.h(this.F, null);
        new o4.a0(this);
        Object systemService = getSystemService("connectivity");
        systemService.getClass();
        ((ConnectivityManager) systemService).unregisterNetworkCallback(new ConnectivityManager.NetworkCallback());
        try {
            n nVar = this.D;
            if (nVar != null) {
                unregisterReceiver(nVar);
                this.D = null;
            }
            b bVar = this.E;
            if (bVar != null) {
                unregisterReceiver(bVar);
                this.E = null;
            }
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onUserMovedToOtherState() {
    }
}

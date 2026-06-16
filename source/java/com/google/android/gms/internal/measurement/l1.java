package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class l1 {
    public static volatile l1 g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f3877a;

    /* renamed from: b, reason: collision with root package name */
    public final m3.c f3878b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3879c;

    /* renamed from: d, reason: collision with root package name */
    public int f3880d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3881e;

    /* renamed from: f, reason: collision with root package name */
    public volatile l0 f3882f;

    public l1(Context context, Bundle bundle) {
        g1 g1Var = new g1(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), g1Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3877a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f3878b = new m3.c(this, 29);
        this.f3879c = new ArrayList();
        int i = 0;
        try {
            if (q1.j2.b(context, q1.j2.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, l1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f3881e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new a1(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new k1(this));
        }
    }

    public static l1 c(Context context, Bundle bundle) {
        w0.x.g(context);
        if (g == null) {
            synchronized (l1.class) {
                try {
                    if (g == null) {
                        g = new l1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final void a(h1 h1Var) {
        this.f3877a.execute(h1Var);
    }

    public final void b(Exception exc, boolean z10, boolean z11) {
        this.f3881e |= z10;
        if (z10) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            a(new y0(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }
}

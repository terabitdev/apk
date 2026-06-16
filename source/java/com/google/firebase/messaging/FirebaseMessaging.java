package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import b3.c;
import c1.a;
import c9.d;
import com.google.firebase.messaging.FirebaseMessaging;
import e2.f;
import e3.b;
import f5.v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k3.d0;
import k3.j;
import k3.k;
import k3.m;
import k3.p;
import k3.u;
import k3.w;
import r0.i;
import s0.h;
import s0.n;
import v1.o;
import w0.x;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class FirebaseMessaging {
    public static i j;

    /* renamed from: k, reason: collision with root package name */
    public static b f4200k = new f(1);
    public static ScheduledThreadPoolExecutor l;

    /* renamed from: a, reason: collision with root package name */
    public final z1.f f4201a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4202b;

    /* renamed from: c, reason: collision with root package name */
    public final g5.i f4203c;

    /* renamed from: d, reason: collision with root package name */
    public final j f4204d;

    /* renamed from: e, reason: collision with root package name */
    public final d f4205e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4206f;
    public final ThreadPoolExecutor g;
    public final v h;
    public boolean i;

    public FirebaseMessaging(z1.f fVar, b bVar, b bVar2, f3.d dVar, b bVar3, c cVar) {
        fVar.a();
        Context context = fVar.f11486a;
        final v vVar = new v(context);
        final g5.i iVar = new g5.i(fVar, vVar, bVar, bVar2, dVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-File-Io"));
        this.i = false;
        f4200k = bVar3;
        this.f4201a = fVar;
        this.f4205e = new d(this, cVar);
        fVar.a();
        final Context context2 = fVar.f11486a;
        this.f4202b = context2;
        k kVar = new k();
        this.h = vVar;
        this.f4203c = iVar;
        this.f4204d = new j(newSingleThreadExecutor);
        this.f4206f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        fVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(kVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        final int i = 0;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: k3.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f7236b;

            {
                this.f7236b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f7236b;
                if (firebaseMessaging.f4205e.i() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                v1.o w6;
                int i3;
                switch (i) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f7236b;
                        final Context context3 = firebaseMessaging.f4202b;
                        p.a(context3);
                        g5.i iVar2 = firebaseMessaging.f4203c;
                        final boolean g = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences e10 = d0.e(context3);
                            if (!e10.contains("proxy_retention") || e10.getBoolean("proxy_retention", false) != g) {
                                s0.b bVar4 = (s0.b) iVar2.f5483b;
                                if (bVar4.f10385c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g);
                                    s0.n a10 = s0.n.a(bVar4.f10384b);
                                    synchronized (a10) {
                                        i3 = a10.f10412d;
                                        a10.f10412d = i3 + 1;
                                    }
                                    w6 = a10.b(new s0.m(i3, 4, bundle, 0));
                                } else {
                                    w6 = z1.b.w(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                w6.c(new androidx.arch.core.executor.a(2), new v1.e() { // from class: k3.q
                                    @Override // v1.e
                                    public final void h(Object obj) {
                                        SharedPreferences.Editor edit = d0.e(context3).edit();
                                        edit.putBoolean("proxy_retention", g);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
        z1.b.n(scheduledThreadPoolExecutor2, new Callable() { // from class: k3.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y yVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                f5.v vVar2 = vVar;
                g5.i iVar2 = iVar;
                synchronized (y.class) {
                    try {
                        WeakReference weakReference = y.f7261d;
                        if (weakReference != null) {
                            yVar = (y) weakReference.get();
                        } else {
                            yVar = null;
                        }
                        if (yVar == null) {
                            y yVar2 = new y(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            yVar2.b();
                            y.f7261d = new WeakReference(yVar2);
                            yVar = yVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new a0(firebaseMessaging, vVar2, yVar, iVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).c(scheduledThreadPoolExecutor, new m(this, 0));
        final int i3 = 1;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: k3.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f7236b;

            {
                this.f7236b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f7236b;
                if (firebaseMessaging.f4205e.i() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                v1.o w6;
                int i32;
                switch (i3) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f7236b;
                        final Context context3 = firebaseMessaging.f4202b;
                        p.a(context3);
                        g5.i iVar2 = firebaseMessaging.f4203c;
                        final boolean g = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences e10 = d0.e(context3);
                            if (!e10.contains("proxy_retention") || e10.getBoolean("proxy_retention", false) != g) {
                                s0.b bVar4 = (s0.b) iVar2.f5483b;
                                if (bVar4.f10385c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g);
                                    s0.n a10 = s0.n.a(bVar4.f10384b);
                                    synchronized (a10) {
                                        i32 = a10.f10412d;
                                        a10.f10412d = i32 + 1;
                                    }
                                    w6 = a10.b(new s0.m(i32, 4, bundle, 0));
                                } else {
                                    w6 = z1.b.w(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                w6.c(new androidx.arch.core.executor.a(2), new v1.e() { // from class: k3.q
                                    @Override // v1.e
                                    public final void h(Object obj) {
                                        SharedPreferences.Editor edit = d0.e(context3).edit();
                                        edit.putBoolean("proxy_retention", g);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new ScheduledThreadPoolExecutor(1, new a("TAG"));
                }
                l.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized i c(Context context) {
        i iVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (j == null) {
                    j = new i(context, 14);
                }
                iVar = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull z1.f fVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) fVar.b(FirebaseMessaging.class);
            x.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        o oVar;
        u d10 = d();
        if (!i(d10)) {
            return d10.f7249a;
        }
        String d11 = v.d(this.f4201a);
        j jVar = this.f4204d;
        synchronized (jVar) {
            oVar = (o) ((ArrayMap) jVar.f7232b).get(d11);
            if (oVar != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + d11);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + d11);
                }
                g5.i iVar = this.f4203c;
                oVar = iVar.d(iVar.k(v.d((z1.f) iVar.o), "*", new Bundle())).j(this.g, new androidx.transition.a(this, d11, d10, 7)).e((Executor) jVar.f7231a, new androidx.compose.runtime.composer.linkbuffer.a(8, jVar, d11));
                ((ArrayMap) jVar.f7232b).put(d11, oVar);
            }
        }
        try {
            return (String) z1.b.k(oVar);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final u d() {
        String d10;
        u d11;
        i c10 = c(this.f4202b);
        z1.f fVar = this.f4201a;
        fVar.a();
        if ("[DEFAULT]".equals(fVar.f11487b)) {
            d10 = "";
        } else {
            d10 = fVar.d();
        }
        String d12 = v.d(this.f4201a);
        synchronized (c10) {
            d11 = u.d(((SharedPreferences) c10.f10003b).getString(d10 + "|T|" + d12 + "|*", null));
        }
        return d11;
    }

    public final void e() {
        o w6;
        int i;
        s0.b bVar = (s0.b) this.f4203c.f5483b;
        if (bVar.f10385c.a() >= 241100000) {
            n a10 = n.a(bVar.f10384b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (a10) {
                i = a10.f10412d;
                a10.f10412d = i + 1;
            }
            w6 = a10.b(new s0.m(i, 5, bundle, 1)).d(h.l, s0.d.l);
        } else {
            w6 = z1.b.w(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        w6.c(this.f4206f, new m(this, 1));
    }

    public final synchronized void f(boolean z10) {
        this.i = z10;
    }

    public final boolean g() {
        Context context = this.f4202b;
        p.a(context);
        if (p.b(context)) {
            if (this.f4201a.b(b2.a.class) == null) {
                if (d0.d() && f4200k != null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final synchronized void h(long j10) {
        b(new w(this, Math.min(Math.max(30L, 2 * j10), 28800L)), j10);
        this.i = true;
    }

    public final boolean i(u uVar) {
        if (uVar != null) {
            String b10 = this.h.b();
            if (System.currentTimeMillis() <= uVar.f7251c + 604800000 && b10.equals((String) uVar.f7250b)) {
                return false;
            }
            return true;
        }
        return true;
    }
}

package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import c1.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k3.d0;
import k3.e0;
import k3.g;
import k3.r;
import k3.t;
import m3.c;
import r0.i;
import s0.b;
import s0.m;
import s0.n;
import v1.h;
import v1.o;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class FirebaseMessagingService extends Service {
    public static final ArrayDeque p = new ArrayDeque(10);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f4207a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f4208b;
    public final Object l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f4209n;
    public b o;

    public FirebaseMessagingService() {
        a aVar = new a("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f4207a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.l = new Object();
        this.f4209n = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            d0.c(intent);
        }
        synchronized (this.l) {
            try {
                int i = this.f4209n - 1;
                this.f4209n = i;
                if (i == 0) {
                    stopSelfResult(this.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        b bVar;
        Integer num;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                d(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = p;
            if (arrayDeque.contains(stringExtra)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra);
                }
                if (this.o == null) {
                    this.o = new b(getApplicationContext());
                }
                bVar = this.o;
                if (bVar.f10385c.a() < 233700000) {
                    Bundle bundle = new Bundle();
                    String stringExtra2 = intent.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    if (intent.hasExtra("google.product_id")) {
                        num = Integer.valueOf(intent.getIntExtra("google.product_id", 0));
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        bundle.putInt("google.product_id", num.intValue());
                    }
                    n a10 = n.a(bVar.f10384b);
                    synchronized (a10) {
                        i = a10.f10412d;
                        a10.f10412d = i + 1;
                    }
                    a10.b(new m(i, 3, bundle, 0));
                    return;
                }
                z1.b.w(new IOException("SERVICE_NOT_AVAILABLE"));
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra);
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        char c10 = 65535;
        switch (stringExtra3.hashCode()) {
            case -2062414158:
                if (stringExtra3.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra3.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra3.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra3.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
                d0.f(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (c.A(extras)) {
                    c cVar = new c(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io"));
                    try {
                        if (new g(this, cVar, newSingleThreadExecutor).a()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (d0.i(intent)) {
                                d0.g(intent.getExtras(), "_nf");
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                c(new r(extras));
                break;
            case 2:
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new Exception(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case 3:
                intent.getStringExtra("google.message_id");
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra3));
                break;
        }
        if (this.o == null) {
        }
        bVar = this.o;
        if (bVar.f10385c.a() < 233700000) {
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f4208b == null) {
                this.f4208b = new e0(new i((Object) this, 13));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4208b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f4207a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i3) {
        synchronized (this.l) {
            this.m = i3;
            this.f4209n++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) t.t().f7248n).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        h hVar = new h();
        this.f4207a.execute(new androidx.work.impl.c(this, intent2, hVar, 3));
        o oVar = hVar.f10870a;
        if (oVar.h()) {
            a(intent);
            return 2;
        }
        oVar.a(new androidx.arch.core.executor.a(2), new androidx.compose.runtime.composer.linkbuffer.a(7, this, intent));
        return 3;
    }

    public void c(r rVar) {
    }

    public void d(String str) {
    }
}

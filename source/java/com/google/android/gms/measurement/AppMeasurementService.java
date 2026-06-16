package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import o4.bd;
import q1.b2;
import q1.s1;
import q1.s4;
import q1.v0;
import q1.w3;
import y1.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class AppMeasurementService extends Service implements w3 {

    /* renamed from: a, reason: collision with root package name */
    public bd f4072a;

    @Override // q1.w3
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // q1.w3
    public final void b(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // q1.w3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final bd d() {
        if (this.f4072a == null) {
            this.f4072a = new bd(this, 4);
        }
        return this.f4072a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        bd d10 = d();
        d10.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new b2(s4.C((Service) d10.f8551b));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f8551b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f8551b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i3) {
        final bd d10 = d();
        if (intent == null) {
            d10.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) d10.f8551b;
        final v0 v0Var = s1.s(service, null, null).o;
        s1.m(v0Var);
        String action = intent.getAction();
        v0Var.f9815w.d(Integer.valueOf(i3), "Local AppMeasurementService called. startId, action", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Runnable runnable = new Runnable() { // from class: q1.x3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Service service2 = (Service) bd.this.f8551b;
                    w3 w3Var = (w3) service2;
                    int i8 = i3;
                    if (w3Var.a(i8)) {
                        v0Var.f9815w.c(Integer.valueOf(i8), "Local AppMeasurementService processed last upload request. StartId");
                        v0 v0Var2 = s1.s(service2, null, null).o;
                        s1.m(v0Var2);
                        v0Var2.f9815w.b("Completed wakeful intent.");
                        w3Var.b(intent);
                    }
                }
            };
            s4 C = s4.C(service);
            C.b().p(new a(d10, C, runnable));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}

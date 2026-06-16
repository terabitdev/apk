package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.y0;
import j$.util.Objects;
import o4.bd;
import o9.a;
import q1.s4;
import q1.v0;
import q1.w1;
import q1.w3;
import w0.x;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class AppMeasurementJobService extends JobService implements w3 {

    /* renamed from: a, reason: collision with root package name */
    public bd f4070a;

    @Override // q1.w3
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // q1.w3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final bd d() {
        if (this.f4070a == null) {
            this.f4070a = new bd(this, 4);
        }
        return this.f4070a;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        bd d10 = d();
        Service service = (Service) d10.f8551b;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            x.g(string);
            s4 C = s4.C(service);
            v0 a10 = C.a();
            a aVar = C.u.l;
            a10.f9815w.c(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            C.b().p(new y1.a(d10, C, new w1(8, d10, a10, jobParameters2, false)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            x.g(string);
            l1 c10 = l1.c(service, null);
            y1.a aVar2 = new y1.a(20, d10, jobParameters2);
            c10.getClass();
            c10.a(new y0(c10, aVar2, 3));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // q1.w3
    public final void b(Intent intent) {
    }
}

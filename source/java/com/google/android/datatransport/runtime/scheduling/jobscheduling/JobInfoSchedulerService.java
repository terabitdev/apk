package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a0.d;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import d0.j;
import d0.s;
import j0.g;
import n0.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3659a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        byte[] bArr;
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        if (string != null) {
            d b10 = a.b(i);
            if (string2 != null) {
                bArr = Base64.decode(string2, 0);
            } else {
                bArr = null;
            }
            g gVar = s.a().f4624d;
            gVar.f7023e.execute(new j0.d(gVar, new j(string, bArr, b10), i3, new a6.d(18, this, jobParameters)));
            return true;
        }
        o2.a.h("Null backendName");
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

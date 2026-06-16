package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b6.o;
import c8.f0;
import c8.p0;
import j8.d;
import j8.e;
import s4.c;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PreRegisterWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4539a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreRegisterWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4539a = context;
        Activity activity = c.o;
        this.f4539a = b.j(context);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        ListenableWorker.Result success = ListenableWorker.Result.success();
        success.getClass();
        try {
            e eVar = p0.f3588a;
            f0.z(f0.b(d.f7053a), null, null, new o(this, null), 3);
            return success;
        } catch (Exception e10) {
            e10.printStackTrace();
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            failure.getClass();
            return failure;
        }
    }
}

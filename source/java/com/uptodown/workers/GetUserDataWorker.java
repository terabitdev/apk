package com.uptodown.workers;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import b.d;
import b6.j;
import c7.a;
import c7.z;
import c8.f0;
import c8.p0;
import g7.c;
import j8.e;
import o4.a0;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GetUserDataWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserDataWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(c cVar) {
        j jVar;
        int i;
        try {
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i3 = jVar.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    jVar.l = i3 - Integer.MIN_VALUE;
                    Object obj = jVar.f3321a;
                    i = jVar.l;
                    c cVar2 = null;
                    if (i == 0) {
                        if (i == 1) {
                            a.e(obj);
                        } else {
                            d.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        a.e(obj);
                        Context applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        jVar.l = 1;
                        e eVar = p0.f3588a;
                        Object K = f0.K(j8.d.f7053a, new a5.j(applicationContext, cVar2, cVar2, 5), jVar);
                        Object obj2 = h7.a.f6117a;
                        if (K != obj2) {
                            K = z.f3538a;
                        }
                        if (K == obj2) {
                            return obj2;
                        }
                    }
                    ListenableWorker.Result success = ListenableWorker.Result.success();
                    success.getClass();
                    return success;
                }
            }
            if (i == 0) {
            }
            ListenableWorker.Result success2 = ListenableWorker.Result.success();
            success2.getClass();
            return success2;
        } catch (Exception e10) {
            e10.printStackTrace();
            new a0(getApplicationContext(), 22).w("GetUserDataWorker", e10);
            ListenableWorker.Result success3 = ListenableWorker.Result.success();
            success3.getClass();
            return success3;
        }
        jVar = new j(this, cVar);
        Object obj3 = jVar.f3321a;
        i = jVar.l;
        c cVar22 = null;
    }
}

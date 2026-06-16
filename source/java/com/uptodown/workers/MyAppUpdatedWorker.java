package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b.d;
import b6.l;
import b6.m;
import c7.a;
import c8.f0;
import c8.p0;
import j8.e;
import s4.c;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MyAppUpdatedWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAppUpdatedWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4538a = context;
        Activity activity = c.o;
        this.f4538a = b.j(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(g7.c cVar) {
        l lVar;
        int i;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i3 = lVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.l = i3 - Integer.MIN_VALUE;
                Object obj = lVar.f3325a;
                i = lVar.l;
                if (i == 0) {
                    if (i == 1) {
                        a.e(obj);
                    } else {
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.e(obj);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    m mVar = new m(this, null);
                    lVar.l = 1;
                    obj = f0.K(dVar, mVar, lVar);
                    h7.a aVar = h7.a.f6117a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                obj.getClass();
                return obj;
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f3325a;
        i = lVar.l;
        if (i == 0) {
        }
        obj2.getClass();
        return obj2;
    }
}

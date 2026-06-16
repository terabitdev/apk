package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b.d;
import c7.a;
import c8.f0;
import c8.p0;
import j8.e;
import s4.c;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AppUpdatedWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdatedWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4520a = context;
        String string = workerParameters.getInputData().getString("packagename");
        string.getClass();
        this.f4521b = string;
        Activity activity = c.o;
        this.f4520a = b.j(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(g7.c cVar) {
        b6.c cVar2;
        int i;
        if (cVar instanceof b6.c) {
            cVar2 = (b6.c) cVar;
            int i3 = cVar2.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.l = i3 - Integer.MIN_VALUE;
                Object obj = cVar2.f3309a;
                i = cVar2.l;
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
                    b6.d dVar2 = new b6.d(this, null);
                    cVar2.l = 1;
                    obj = f0.K(dVar, dVar2, cVar2);
                    h7.a aVar = h7.a.f6117a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                obj.getClass();
                return obj;
            }
        }
        cVar2 = new b6.c(this, cVar);
        Object obj2 = cVar2.f3309a;
        i = cVar2.l;
        if (i == 0) {
        }
        obj2.getClass();
        return obj2;
    }
}

package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b.d;
import b6.a;
import c8.f0;
import c8.p0;
import j8.e;
import s4.c;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AppInstalledWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4518a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInstalledWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4518a = context;
        String string = workerParameters.getInputData().getString("packagename");
        string.getClass();
        this.f4519b = string;
        Activity activity = c.o;
        this.f4518a = b.j(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(g7.c cVar) {
        a aVar;
        int i;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i3 = aVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.l = i3 - Integer.MIN_VALUE;
                Object obj = aVar.f3305a;
                i = aVar.l;
                if (i == 0) {
                    if (i == 1) {
                        c7.a.e(obj);
                    } else {
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    c7.a.e(obj);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    b6.b bVar = new b6.b(this, null);
                    aVar.l = 1;
                    obj = f0.K(dVar, bVar, aVar);
                    h7.a aVar2 = h7.a.f6117a;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                obj.getClass();
                return obj;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f3305a;
        i = aVar.l;
        if (i == 0) {
        }
        obj2.getClass();
        return obj2;
    }
}

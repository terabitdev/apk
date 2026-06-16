package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a0.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.compose.ui.platform.c;
import d0.j;
import d0.s;
import j0.g;
import n0.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3658a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte[] bArr;
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        if (queryParameter != null) {
            d b10 = a.b(intValue);
            if (queryParameter2 != null) {
                bArr = Base64.decode(queryParameter2, 0);
            } else {
                bArr = null;
            }
            g gVar = s.a().f4624d;
            gVar.f7023e.execute(new j0.d(gVar, new j(queryParameter, bArr, b10), i, new c(1)));
            return;
        }
        o2.a.h("Null backendName");
    }
}

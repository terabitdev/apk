package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import d9.a;
import p6.c;
import q1.s1;
import q1.v0;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public c f4071a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f4071a == null) {
            this.f4071a = new c(this);
        }
        c cVar = this.f4071a;
        cVar.getClass();
        v0 v0Var = s1.s(context, null, null).o;
        s1.m(v0Var);
        a aVar = v0Var.f9815w;
        a aVar2 = v0Var.r;
        if (intent == null) {
            aVar2.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        aVar.c(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            aVar.b("Starting wakeful intent.");
            ((AppMeasurementReceiver) cVar.f9394a).getClass();
            WakefulBroadcastReceiver.startWakefulService(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            aVar2.b("Install Referrer Broadcasts are deprecated");
        }
    }
}

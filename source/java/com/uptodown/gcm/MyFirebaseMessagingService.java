package com.uptodown.gcm;

import a5.m;
import android.content.Context;
import android.content.SharedPreferences;
import c8.f0;
import c8.p0;
import com.google.firebase.messaging.FirebaseMessagingService;
import f1.g;
import h8.c;
import j8.d;
import j8.e;
import java.util.Map;
import k3.r;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final /* synthetic */ int r = 0;
    public final c q = f0.b(g.L(f0.d(), p0.f3588a));

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(r rVar) {
        Map b10 = rVar.b();
        b10.getClass();
        if (!b10.isEmpty()) {
            e eVar = p0.f3588a;
            f0.z(this.q, d.f7053a, null, new m(rVar, this, (g7.c) null, 16), 2);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        str.getClass();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("SettingsPreferences", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("fcmToken", str);
        edit.apply();
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        SharedPreferences sharedPreferences2 = applicationContext2.getSharedPreferences("SettingsPreferences", 0);
        sharedPreferences2.getClass();
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.putBoolean("fcmTokenSent", false);
        edit2.apply();
        e eVar = p0.f3588a;
        f0.z(this.q, d.f7053a, null, new m(this, str, (g7.c) null, 17), 2);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f0.h(this.q, null);
    }
}

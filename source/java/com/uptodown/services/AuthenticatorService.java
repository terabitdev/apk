package com.uptodown.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import w5.d;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class AuthenticatorService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        IBinder iBinder = new d(this).getIBinder();
        iBinder.getClass();
        return iBinder;
    }
}

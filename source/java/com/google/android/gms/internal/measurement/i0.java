package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class i0 extends y implements n0 {
    public final AtomicReference i;
    public boolean j;

    public i0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.i = new AtomicReference();
    }

    public static final Object d(Class cls, Bundle bundle) {
        Object obj;
        if (bundle != null && (obj = bundle.get("r")) != null) {
            try {
                return cls.cast(obj);
            } catch (ClassCastException e10) {
                Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e10);
                throw e10;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
            z.d(parcel);
            s(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final Bundle c(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.i;
        synchronized (atomicReference) {
            if (!this.j) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.i.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final void s(Bundle bundle) {
        AtomicReference atomicReference = this.i;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.j = true;
                } finally {
                    this.i.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

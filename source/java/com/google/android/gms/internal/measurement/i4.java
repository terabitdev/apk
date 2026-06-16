package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class i4 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        o4.i.incrementAndGet();
    }
}

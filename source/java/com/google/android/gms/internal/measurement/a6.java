package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class a6 extends h {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6(String str, int i) {
        super(str);
        this.l = i;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n a(k3.t tVar, List list) {
        switch (this.l) {
            case 0:
                return n.f3896c;
            case 1:
            case 2:
                return this;
            case 3:
                return new g(Double.valueOf(0.0d));
            default:
                return n.f3896c;
        }
    }
}

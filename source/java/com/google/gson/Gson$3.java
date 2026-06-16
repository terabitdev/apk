package com.google.gson;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class Gson$3 extends i {
    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        return Long.valueOf(aVar.A());
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.q();
        } else {
            bVar.C(number.toString());
        }
    }
}

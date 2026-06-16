package com.google.gson;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class Gson$2 extends i {
    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        return Float.valueOf((float) aVar.y());
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.q();
            return;
        }
        float floatValue = number.floatValue();
        b.a(floatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(floatValue);
        }
        bVar.B(number);
    }
}

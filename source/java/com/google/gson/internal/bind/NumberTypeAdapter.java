package com.google.gson.internal.bind;

import com.google.android.gms.internal.measurement.i6;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import o4.b1;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class NumberTypeAdapter extends i {

    /* renamed from: b, reason: collision with root package name */
    public static final j f4265b = d(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f4266a;

    public NumberTypeAdapter(int i) {
        this.f4266a = i;
    }

    public static j d(int i) {
        return new j() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.j
            public final i a(com.google.gson.b bVar, TypeToken typeToken) {
                if (typeToken.f4354a == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        int H = aVar.H();
        int c10 = c.i.c(H);
        if (c10 != 5 && c10 != 6) {
            if (c10 == 8) {
                aVar.D();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + b1.o(H) + "; at path " + aVar.n(false));
        }
        return i6.b(this.f4266a, aVar);
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        bVar.B((Number) obj);
    }
}

package com.google.gson;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class i {
    public final i a() {
        if (!(this instanceof TypeAdapter$NullSafeTypeAdapter)) {
            return new i() { // from class: com.google.gson.TypeAdapter$NullSafeTypeAdapter
                @Override // com.google.gson.i
                public final Object b(w3.a aVar) {
                    if (aVar.H() == 9) {
                        aVar.D();
                        return null;
                    }
                    return i.this.b(aVar);
                }

                @Override // com.google.gson.i
                public final void c(w3.b bVar, Object obj) {
                    if (obj == null) {
                        bVar.q();
                    } else {
                        i.this.c(bVar, obj);
                    }
                }

                public final String toString() {
                    return "NullSafeTypeAdapter[" + i.this + "]";
                }
            };
        }
        return this;
    }

    public abstract Object b(w3.a aVar);

    public abstract void c(w3.b bVar, Object obj);
}

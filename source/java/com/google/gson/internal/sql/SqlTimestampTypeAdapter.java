package com.google.gson.internal.sql;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class SqlTimestampTypeAdapter extends i {

    /* renamed from: b, reason: collision with root package name */
    public static final j f4347b = new j() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            if (typeToken.f4354a == Timestamp.class) {
                bVar.getClass();
                return new SqlTimestampTypeAdapter(bVar.c(new TypeToken(Date.class)));
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final i f4348a;

    public SqlTimestampTypeAdapter(i iVar) {
        this.f4348a = iVar;
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        Date date = (Date) this.f4348a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        this.f4348a.c(bVar, (Timestamp) obj);
    }
}

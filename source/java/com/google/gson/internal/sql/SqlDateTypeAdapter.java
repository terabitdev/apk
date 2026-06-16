package com.google.gson.internal.sql;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
final class SqlDateTypeAdapter extends i {

    /* renamed from: b, reason: collision with root package name */
    public static final j f4343b = new j() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            if (typeToken.f4354a == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4344a;

    private SqlDateTypeAdapter() {
        this.f4344a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        Date date;
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String F = aVar.F();
        synchronized (this) {
            TimeZone timeZone = this.f4344a.getTimeZone();
            try {
                try {
                    date = new Date(this.f4344a.parse(F).getTime());
                } catch (ParseException e10) {
                    throw new RuntimeException("Failed parsing '" + F + "' as SQL Date; at path " + aVar.n(true), e10);
                }
            } finally {
                this.f4344a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.q();
            return;
        }
        synchronized (this) {
            format = this.f4344a.format((java.util.Date) date);
        }
        bVar.C(format);
    }

    public /* synthetic */ SqlDateTypeAdapter(int i) {
        this();
    }
}

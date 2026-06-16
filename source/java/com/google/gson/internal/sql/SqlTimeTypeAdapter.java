package com.google.gson.internal.sql;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends i {

    /* renamed from: b, reason: collision with root package name */
    public static final j f4345b = new j() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            if (typeToken.f4354a == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4346a;

    private SqlTimeTypeAdapter() {
        this.f4346a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        Time time;
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String F = aVar.F();
        synchronized (this) {
            TimeZone timeZone = this.f4346a.getTimeZone();
            try {
                try {
                    time = new Time(this.f4346a.parse(F).getTime());
                } catch (ParseException e10) {
                    throw new RuntimeException("Failed parsing '" + F + "' as SQL Time; at path " + aVar.n(true), e10);
                }
            } finally {
                this.f4346a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.q();
            return;
        }
        synchronized (this) {
            format = this.f4346a.format((Date) time);
        }
        bVar.C(format);
    }

    public /* synthetic */ SqlTimeTypeAdapter(int i) {
        this();
    }
}

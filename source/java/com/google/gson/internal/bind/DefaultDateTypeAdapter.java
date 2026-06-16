package com.google.gson.internal.bind;

import android.support.v4.media.session.m;
import androidx.compose.foundation.gestures.x;
import com.google.gson.i;
import com.google.gson.internal.g;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends i {

    /* renamed from: c, reason: collision with root package name */
    public static final j f4251c = new j() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            if (typeToken.f4354a == Date.class) {
                return new DefaultDateTypeAdapter();
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final a f4252a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4253b;

    public DefaultDateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f4253b = arrayList;
        this.f4252a = b.f4293a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (g.f4321a >= 9) {
            arrayList.add(new SimpleDateFormat(x.m("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        Date b10;
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String F = aVar.F();
        synchronized (this.f4253b) {
            try {
                ArrayList arrayList = this.f4253b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        DateFormat dateFormat = (DateFormat) obj;
                        TimeZone timeZone = dateFormat.getTimeZone();
                        try {
                            try {
                                b10 = dateFormat.parse(F);
                                break;
                            } finally {
                                dateFormat.setTimeZone(timeZone);
                            }
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } else {
                        try {
                            b10 = u3.a.b(F, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder v = m.v("Failed parsing '", F, "' as Date; at path ");
                            v.append(aVar.n(true));
                            throw new RuntimeException(v.toString(), e10);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4252a.getClass();
        return b10;
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.q();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f4253b.get(0);
        synchronized (this.f4253b) {
            format = dateFormat.format(date);
        }
        bVar.C(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f4253b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}

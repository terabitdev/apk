package io.elevenlabs.readerapp.ui.formatter;

import android.icu.text.DateFormat;
import i4.w1;
import java.util.Date;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.e;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/util/Date;", "", "formatDate", "(Ljava/util/Date;Lu2/m;I)Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DateFormatterKt {
    public static final String formatDate(Date date, m mVar, int i10) {
        date.getClass();
        q qVar = (q) mVar;
        boolean booleanValue = ((Boolean) qVar.j(w1.f13252a)).booleanValue();
        e eVar = l.f33918a;
        if (!booleanValue) {
            qVar.X(-1294839948);
            boolean f10 = qVar.f(date);
            Object L = qVar.L();
            if (f10 || L == eVar) {
                L = DateFormat.getDateInstance(2).format(date);
                qVar.h0(L);
            }
            String str = (String) L;
            str.getClass();
            qVar.p(false);
            return str;
        }
        qVar.X(-1485216255);
        boolean f11 = qVar.f(date);
        Object L2 = qVar.L();
        if (f11 || L2 == eVar) {
            L2 = String.valueOf(date);
            qVar.h0(L2);
        }
        String str2 = (String) L2;
        qVar.p(false);
        return str2;
    }
}

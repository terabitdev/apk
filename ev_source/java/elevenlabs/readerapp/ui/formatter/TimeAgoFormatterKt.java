package io.elevenlabs.readerapp.ui.formatter;

import android.gov.nist.core.Separators;
import c3.o;
import fm.e;
import h4.f;
import h4.g;
import h4.h;
import i3.a;
import i3.d;
import i3.t;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.readerapp.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.j;
import r1.w;
import r1.x;
import sn.z;
import tn.p;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljava/util/Date;", "now", "", "formatTimeAgoSince", "(Ljava/util/Date;Ljava/util/Date;Lu2/m;I)Ljava/lang/String;", "Lsn/z;", "Preview_TimeAgoFormatter", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TimeAgoFormatterKt {
    public static final void Preview_TimeAgoFormatter(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1909416688);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            x a10 = w.a(j.f29230c, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(i3.q.f13017a, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            Date date = new Date(1729581652L);
            Date date2 = new Date(date.getTime() - 3600000);
            Date date3 = new Date(date.getTime() - 7200000);
            Date date4 = new Date(date.getTime() - 86400000);
            Date date5 = new Date(date.getTime() - 172800000);
            Date date6 = new Date(date.getTime() - OfflineReadData.EXPIRY_WARNING_MILLIS);
            Date date7 = new Date(date.getTime() - 1209600000);
            Date date8 = new Date(date.getTime() - 2764800000L);
            Date date9 = new Date(date.getTime() - 5356800000L);
            Date date10 = new Date(date.getTime() - 31536000000L);
            Date date11 = new Date(date.getTime() - 63072000000L);
            qVar.X(-1278073028);
            List I = ig.f.I(date, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11);
            ArrayList arrayList = new ArrayList(p.a0(I, 10));
            Iterator it = I.iterator();
            while (it.hasNext()) {
                arrayList.add(formatTimeAgoSince((Date) it.next(), date, qVar, 0));
            }
            qVar.p(false);
            j7.d(tn.o.E0(arrayList, Separators.RETURN, null, null, null, 62), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 0, 0, 262142);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 5);
        }
    }

    public static final z Preview_TimeAgoFormatter$lambda$1(int i10, m mVar, int i11) {
        Preview_TimeAgoFormatter(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final String formatTimeAgoSince(Date date, Date date2, m mVar, int i10) {
        date.getClass();
        date2.getClass();
        q qVar = (q) mVar;
        boolean f10 = qVar.f(date) | qVar.f(date2);
        Object L = qVar.L();
        u2.e eVar = l.f33918a;
        if (f10 || L == eVar) {
            L = Long.valueOf(date2.getTime() - date.getTime());
            qVar.h0(L);
        }
        long longValue = ((Number) L).longValue();
        boolean e10 = qVar.e(longValue);
        Object L2 = qVar.L();
        if (e10 || L2 == eVar) {
            L2 = Integer.valueOf((int) (longValue / 1000));
            qVar.h0(L2);
        }
        int intValue = ((Number) L2).intValue();
        boolean e11 = qVar.e(longValue);
        Object L3 = qVar.L();
        if (e11 || L3 == eVar) {
            L3 = Integer.valueOf((int) (longValue / 60000));
            qVar.h0(L3);
        }
        int intValue2 = ((Number) L3).intValue();
        boolean e12 = qVar.e(longValue);
        Object L4 = qVar.L();
        if (e12 || L4 == eVar) {
            L4 = Integer.valueOf((int) (longValue / 3600000));
            qVar.h0(L4);
        }
        int intValue3 = ((Number) L4).intValue();
        boolean e13 = qVar.e(longValue);
        Object L5 = qVar.L();
        if (e13 || L5 == eVar) {
            L5 = Integer.valueOf((int) (longValue / 86400000));
            qVar.h0(L5);
        }
        int intValue4 = ((Number) L5).intValue();
        if (intValue < 60) {
            qVar.X(1305742113);
            String R = c.R(qVar, R.string.time_just_now);
            qVar.p(false);
            return R;
        }
        if (intValue2 < 60) {
            qVar.X(1305745089);
            String Q = c.Q(R.string.time_ago, new Object[]{c.I(R.plurals.time_minutes_long_plurals, intValue2, new Object[]{Integer.valueOf(intValue2)}, qVar)}, qVar);
            qVar.p(false);
            return Q;
        }
        if (intValue3 < 24) {
            qVar.X(1305753979);
            String Q2 = c.Q(R.string.time_ago, new Object[]{c.I(R.plurals.time_hours_long_plurals, intValue3, new Object[]{Integer.valueOf(intValue3)}, qVar)}, qVar);
            qVar.p(false);
            return Q2;
        }
        if (intValue4 == 1) {
            qVar.X(1305762466);
            String R2 = c.R(qVar, R.string.time_yesterday);
            qVar.p(false);
            return R2;
        }
        if (intValue4 < 7) {
            qVar.X(1305765336);
            String Q3 = c.Q(R.string.time_ago, new Object[]{c.I(R.plurals.time_days_long_plurals, intValue4, new Object[]{Integer.valueOf(intValue4)}, qVar)}, qVar);
            qVar.p(false);
            return Q3;
        }
        if (intValue4 < 30) {
            qVar.X(1824288338);
            int i11 = intValue4 / 7;
            String Q4 = c.Q(R.string.time_ago, new Object[]{c.I(R.plurals.time_weeks_long_plurals, i11, new Object[]{Integer.valueOf(i11)}, qVar)}, qVar);
            qVar.p(false);
            return Q4;
        }
        if (intValue4 < 365) {
            qVar.X(1824642637);
            int i12 = intValue4 / 30;
            String Q5 = c.Q(R.string.time_ago, new Object[]{c.I(R.plurals.time_months_long_plurals, i12, new Object[]{Integer.valueOf(i12)}, qVar)}, qVar);
            qVar.p(false);
            return Q5;
        }
        qVar.X(1824995696);
        int i13 = intValue4 / 365;
        String Q6 = c.Q(R.string.time_ago, new Object[]{c.I(R.plurals.time_years_long_plurals, i13, new Object[]{Integer.valueOf(i13)}, qVar)}, qVar);
        qVar.p(false);
        return Q6;
    }
}

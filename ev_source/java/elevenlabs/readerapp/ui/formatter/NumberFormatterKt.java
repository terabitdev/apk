package io.elevenlabs.readerapp.ui.formatter;

import android.gov.nist.core.Separators;
import android.icu.text.NumberFormat;
import i4.w1;
import jo.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import u2.e;
import u2.l;
import u2.m;
import u2.q;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "formatInteger", "(ILu2/m;I)Ljava/lang/String;", "", "(JLu2/m;I)Ljava/lang/String;", "", "formatFloat", "(FLu2/m;I)Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NumberFormatterKt {
    public static final String formatFloat(float f10, m mVar, int i10) {
        q qVar = (q) mVar;
        boolean booleanValue = ((Boolean) qVar.j(w1.f13252a)).booleanValue();
        e eVar = l.f33918a;
        boolean z6 = true;
        if (!booleanValue) {
            qVar.X(668715066);
            if ((((i10 & 14) ^ 6) <= 4 || !qVar.c(f10)) && (i10 & 6) != 4) {
                z6 = false;
            }
            Object L = qVar.L();
            if (z6 || L == eVar) {
                L = NumberFormat.getNumberInstance().format(f10);
                qVar.h0(L);
            }
            String str = (String) L;
            str.getClass();
            qVar.p(false);
            return str;
        }
        qVar.X(-744558669);
        if ((((i10 & 14) ^ 6) <= 4 || !qVar.c(f10)) && (i10 & 6) != 4) {
            z6 = false;
        }
        Object L2 = qVar.L();
        if (z6 || L2 == eVar) {
            L2 = String.valueOf(a.y(f10 * 100) / 100.0f);
            qVar.h0(L2);
        }
        String str2 = (String) L2;
        qVar.p(false);
        return str2;
    }

    public static final String formatInteger(int i10, m mVar, int i11) {
        q qVar = (q) mVar;
        boolean booleanValue = ((Boolean) qVar.j(w1.f13252a)).booleanValue();
        e eVar = l.f33918a;
        boolean z6 = true;
        if (!booleanValue) {
            qVar.X(1868947363);
            if ((((i11 & 14) ^ 6) <= 4 || !qVar.d(i10)) && (i11 & 6) != 4) {
                z6 = false;
            }
            Object L = qVar.L();
            if (z6 || L == eVar) {
                L = NumberFormat.getNumberInstance().format(i10);
                qVar.h0(L);
            }
            String str = (String) L;
            str.getClass();
            qVar.p(false);
            return str;
        }
        qVar.X(2102903333);
        if ((((i11 & 14) ^ 6) <= 4 || !qVar.d(i10)) && (i11 & 6) != 4) {
            z6 = false;
        }
        Object L2 = qVar.L();
        if (z6 || L2 == eVar) {
            L2 = o.E0(n.N0(3, 3, String.valueOf(i10)), Separators.SP, null, null, null, 62);
            qVar.h0(L2);
        }
        String str2 = (String) L2;
        qVar.p(false);
        return str2;
    }

    public static final String formatInteger(long j4, m mVar, int i10) {
        q qVar = (q) mVar;
        boolean booleanValue = ((Boolean) qVar.j(w1.f13252a)).booleanValue();
        e eVar = l.f33918a;
        boolean z6 = true;
        if (!booleanValue) {
            qVar.X(-1736127430);
            if ((((i10 & 14) ^ 6) <= 4 || !qVar.e(j4)) && (i10 & 6) != 4) {
                z6 = false;
            }
            Object L = qVar.L();
            if (z6 || L == eVar) {
                L = NumberFormat.getNumberInstance().format(j4);
                qVar.h0(L);
            }
            String str = (String) L;
            str.getClass();
            qVar.p(false);
            return str;
        }
        qVar.X(2014734446);
        if ((((i10 & 14) ^ 6) <= 4 || !qVar.e(j4)) && (i10 & 6) != 4) {
            z6 = false;
        }
        Object L2 = qVar.L();
        if (z6 || L2 == eVar) {
            L2 = o.E0(n.N0(3, 3, String.valueOf(j4)), Separators.SP, null, null, null, 62);
            qVar.h0(L2);
        }
        String str2 = (String) L2;
        qVar.p(false);
        return str2;
    }
}

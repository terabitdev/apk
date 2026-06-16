package io.elevenlabs.readerapp.ui.formatter;

import io.elevenlabs.domain.model.TtsTimeConversionKt;
import io.elevenlabs.readerapp.R;
import jo.a;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.e;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "charCountToMinutes", "(J)J", "", "charCountToTextDuration", "(JLu2/m;I)Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class WordCountToLengthFormatterKt {
    public static final long charCountToMinutes(long j4) {
        return a.z(TtsTimeConversionKt.charsToSeconds(j4) / 60.0d);
    }

    public static final String charCountToTextDuration(long j4, m mVar, int i10) {
        boolean z6;
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        if ((i11 > 4 && ((q) mVar).e(j4)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        Object L = qVar.L();
        e eVar = l.f33918a;
        if (z6 || L == eVar) {
            L = Integer.valueOf((int) (TtsTimeConversionKt.charsToSeconds(j4) / 60.0d));
            qVar.h0(L);
        }
        int intValue = ((Number) L).intValue();
        boolean d10 = qVar.d(intValue);
        Object L2 = qVar.L();
        if (d10 || L2 == eVar) {
            L2 = Integer.valueOf(intValue / 60);
            qVar.h0(L2);
        }
        int intValue2 = ((Number) L2).intValue();
        String I = c.I(R.plurals.time_hours_plurals, intValue2, new Object[]{Integer.valueOf(intValue2)}, qVar);
        String I2 = c.I(R.plurals.time_minutes_plurals, intValue, new Object[]{Integer.valueOf(intValue)}, qVar);
        if ((i11 <= 4 || !qVar.e(j4)) && (i10 & 6) != 4) {
            z10 = false;
        }
        Object L3 = qVar.L();
        if (z10 || L3 == eVar) {
            if (intValue <= 119) {
                I = I2;
            }
            qVar.h0(I);
            L3 = I;
        }
        return (String) L3;
    }
}

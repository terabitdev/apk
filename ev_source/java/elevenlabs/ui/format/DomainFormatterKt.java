package io.elevenlabs.ui.format;

import java.util.regex.Matcher;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.s0;
import u2.m;
import u2.q;
import wq.g;
import wq.i;
import wq.l;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "formatDomain", "(Ljava/lang/String;Lu2/m;I)Ljava/lang/String;", "Lwq/l;", "domainRegex", "Lwq/l;", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DomainFormatterKt {
    private static final l domainRegex = new l("://([^/]+)");

    public static final String formatDomain(String str, m mVar, int i10) {
        boolean z6;
        String str2;
        g d10;
        str.getClass();
        if ((((i10 & 14) ^ 6) > 4 && ((q) mVar).f(str)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (z6 || L == u2.l.f33918a) {
            l lVar = domainRegex;
            lVar.getClass();
            Matcher matcher = lVar.f37263a.matcher(str);
            matcher.getClass();
            i g10 = s0.g(matcher, 0, str);
            if (g10 != null && (d10 = g10.f37257c.d(1)) != null) {
                str2 = u.T(d10.f37253a, "(^\\w+:\\|^)\\/\\/", "");
            } else {
                str2 = null;
            }
            L = str2;
            qVar.h0(L);
        }
        return (String) L;
    }
}

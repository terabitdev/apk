package io.elevenlabs.readerapp.core.extensions;

import java.util.Date;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import xq.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ljava/util/Date;", "Lxq/b;", "duration", "plus-HG0u8IE", "(Ljava/util/Date;J)Ljava/util/Date;", "plus", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DateExtensionsKt {
    /* renamed from: plus-HG0u8IE, reason: not valid java name */
    public static final Date m1013plusHG0u8IE(Date date, long j4) {
        date.getClass();
        return new Date(b.d(j4) + date.getTime());
    }
}

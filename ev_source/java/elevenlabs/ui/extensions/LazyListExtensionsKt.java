package io.elevenlabs.ui.extensions;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t1.j;
import t1.q;
import t1.r;
import t1.z;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt1/z;", "", "buffer", "", "reachedEnd", "(Lt1/z;I)Z", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LazyListExtensionsKt {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public static final boolean reachedEnd(z zVar, int i10) {
        int i11;
        zVar.getClass();
        j jVar = (j) o.H0(((q) zVar.h()).f31820k);
        if (jVar != null && (i11 = ((r) jVar).f31827a) != 0 && i11 >= ((q) zVar.h()).f31823n - i10) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean reachedEnd$default(z zVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 5;
        }
        return reachedEnd(zVar, i10);
    }
}

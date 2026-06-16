package io.livekit.android.util;

import android.gov.nist.javax.sip.parser.TokenNames;
import fr.d0;
import ho.l;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a]\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {TokenNames.T, TokenNames.R, "", "waitMs", "Lfr/d0;", "coroutineScope", "Lkotlin/Function2;", "Lwn/c;", "", "destinationFunction", "Lkotlin/Function1;", "Lsn/z;", "debounce", "(JLfr/d0;Lho/p;)Lho/l;", "invoke", "(Lho/l;)V", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CoroutineUtilKt {
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    public static final <T, R> l debounce(long j4, d0 d0Var, p pVar) {
        d0Var.getClass();
        pVar.getClass();
        return new CoroutineUtilKt$debounce$1(new Object(), d0Var, j4, pVar);
    }

    public static /* synthetic */ l debounce$default(long j4, d0 d0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = 300;
        }
        return debounce(j4, d0Var, pVar);
    }

    public static final <R> void invoke(l lVar) {
        lVar.getClass();
        lVar.invoke(z.f31622a);
    }
}

package io.elevenlabs.domain.services;

import android.gov.nist.javax.sip.parser.TokenNames;
import ho.l;
import ir.i;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {TokenNames.T, "Lio/elevenlabs/domain/services/ConnectivityService;", "Lkotlin/Function1;", "Lwn/c;", "Lir/i;", "", "operation", "whenConnected", "(Lio/elevenlabs/domain/services/ConnectivityService;Lho/l;)Lir/i;", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConnectivityServiceKt {
    public static final <T> i whenConnected(ConnectivityService connectivityService, l lVar) {
        connectivityService.getClass();
        lVar.getClass();
        return r.G(connectivityService.getIsConnected(), new ConnectivityServiceKt$whenConnected$$inlined$flatMapLatest$1(null, lVar));
    }
}

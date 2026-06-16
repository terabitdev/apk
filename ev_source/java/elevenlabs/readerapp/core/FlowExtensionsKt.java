package io.elevenlabs.readerapp.core;

import android.gov.nist.javax.sip.parser.TokenNames;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {TokenNames.T, TokenNames.R, "Lir/z1;", "Lkotlin/Function1;", "mapper", "mapState", "(Lir/z1;Lho/l;)Lir/z1;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FlowExtensionsKt {
    public static final <T, R> z1 mapState(z1 z1Var, ho.l lVar) {
        z1Var.getClass();
        lVar.getClass();
        return new MappedStateFlow(z1Var, lVar);
    }
}

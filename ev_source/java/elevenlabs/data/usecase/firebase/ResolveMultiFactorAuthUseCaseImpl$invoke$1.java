package io.elevenlabs.data.usecase.firebase;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.usecase.firebase.ResolveMultiFactorAuthUseCaseImpl", f = "ResolveMultiFactorAuthUseCaseImpl.kt", l = {31}, m = "invoke", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ResolveMultiFactorAuthUseCaseImpl$invoke$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ResolveMultiFactorAuthUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveMultiFactorAuthUseCaseImpl$invoke$1(ResolveMultiFactorAuthUseCaseImpl resolveMultiFactorAuthUseCaseImpl, wn.c<? super ResolveMultiFactorAuthUseCaseImpl$invoke$1> cVar) {
        super(cVar);
        this.this$0 = resolveMultiFactorAuthUseCaseImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, this);
    }
}

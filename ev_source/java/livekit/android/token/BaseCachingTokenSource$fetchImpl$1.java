package io.livekit.android.token;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.token.BaseCachingTokenSource", f = "CachingTokenSource.kt", l = {35, 41, 42}, m = "fetchImpl$livekit_android_sdk_release")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BaseCachingTokenSource$fetchImpl$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseCachingTokenSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCachingTokenSource$fetchImpl$1(BaseCachingTokenSource baseCachingTokenSource, wn.c<? super BaseCachingTokenSource$fetchImpl$1> cVar) {
        super(cVar);
        this.this$0 = baseCachingTokenSource;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchImpl$livekit_android_sdk_release(null, this);
    }
}

package io.livekit.android.token;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/livekit/android/token/CachingFixedTokenSource;", "Lio/livekit/android/token/BaseCachingTokenSource;", "Lio/livekit/android/token/FixedTokenSource;", "source", "Lio/livekit/android/token/TokenStore;", ProductResponseJsonKeys.STORE, "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lio/livekit/android/token/TokenSourceResponse;", "", "Lio/livekit/android/token/TokenValidator;", "validator", "<init>", "(Lio/livekit/android/token/FixedTokenSource;Lio/livekit/android/token/TokenStore;Lho/p;)V", "options", "fetchFromSource", "(Lio/livekit/android/token/TokenRequestOptions;Lwn/c;)Ljava/lang/Object;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/token/FixedTokenSource;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CachingFixedTokenSource extends BaseCachingTokenSource implements FixedTokenSource {
    private final FixedTokenSource source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachingFixedTokenSource(FixedTokenSource fixedTokenSource, TokenStore tokenStore, p pVar) {
        super(tokenStore, pVar);
        fixedTokenSource.getClass();
        tokenStore.getClass();
        pVar.getClass();
        this.source = fixedTokenSource;
    }

    @Override // io.livekit.android.token.FixedTokenSource
    public Object fetch(c<? super TokenSourceResponse> cVar) {
        return fetchImpl$livekit_android_sdk_release(null, cVar);
    }

    @Override // io.livekit.android.token.BaseCachingTokenSource
    public Object fetchFromSource(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar) {
        return this.source.fetch(cVar);
    }
}

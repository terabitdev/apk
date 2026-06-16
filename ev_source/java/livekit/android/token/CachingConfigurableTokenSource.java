package io.livekit.android.token;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/livekit/android/token/CachingConfigurableTokenSource;", "Lio/livekit/android/token/BaseCachingTokenSource;", "Lio/livekit/android/token/ConfigurableTokenSource;", "source", "Lio/livekit/android/token/TokenStore;", ProductResponseJsonKeys.STORE, "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lio/livekit/android/token/TokenSourceResponse;", "", "Lio/livekit/android/token/TokenValidator;", "validator", "<init>", "(Lio/livekit/android/token/ConfigurableTokenSource;Lio/livekit/android/token/TokenStore;Lho/p;)V", "options", "fetchFromSource", "(Lio/livekit/android/token/TokenRequestOptions;Lwn/c;)Ljava/lang/Object;", RemoteConfigComponent.FETCH_FILE_NAME, "Lio/livekit/android/token/ConfigurableTokenSource;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CachingConfigurableTokenSource extends BaseCachingTokenSource implements ConfigurableTokenSource {
    private final ConfigurableTokenSource source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachingConfigurableTokenSource(ConfigurableTokenSource configurableTokenSource, TokenStore tokenStore, p pVar) {
        super(tokenStore, pVar);
        configurableTokenSource.getClass();
        tokenStore.getClass();
        pVar.getClass();
        this.source = configurableTokenSource;
    }

    @Override // io.livekit.android.token.ConfigurableTokenSource
    public Object fetch(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar) {
        return fetchImpl$livekit_android_sdk_release(tokenRequestOptions, cVar);
    }

    @Override // io.livekit.android.token.BaseCachingTokenSource
    public Object fetchFromSource(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar) {
        ConfigurableTokenSource configurableTokenSource = this.source;
        if (tokenRequestOptions == null) {
            tokenRequestOptions = new TokenRequestOptions(null, null, null, null, null, null, null, 127, null);
        }
        return configurableTokenSource.fetch(tokenRequestOptions, cVar);
    }
}

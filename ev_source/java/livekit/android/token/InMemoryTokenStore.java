package io.livekit.android.token;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import io.livekit.android.token.TokenStore;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/livekit/android/token/InMemoryTokenStore;", "Lio/livekit/android/token/TokenStore;", "<init>", "()V", "Lio/livekit/android/token/TokenStore$Item;", "retrieve", "(Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/token/TokenRequestOptions;", "options", "Lio/livekit/android/token/TokenSourceResponse;", "response", "Lsn/z;", ProductResponseJsonKeys.STORE, "(Lio/livekit/android/token/TokenRequestOptions;Lio/livekit/android/token/TokenSourceResponse;Lwn/c;)Ljava/lang/Object;", SDPKeywords.CLEAR, "item", "Lio/livekit/android/token/TokenStore$Item;", "getItem", "()Lio/livekit/android/token/TokenStore$Item;", "setItem", "(Lio/livekit/android/token/TokenStore$Item;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class InMemoryTokenStore implements TokenStore {
    private TokenStore.Item item;

    @Override // io.livekit.android.token.TokenStore
    public Object clear(c<? super z> cVar) {
        this.item = null;
        return z.f31622a;
    }

    public final TokenStore.Item getItem() {
        return this.item;
    }

    @Override // io.livekit.android.token.TokenStore
    public Object retrieve(c<? super TokenStore.Item> cVar) {
        return this.item;
    }

    public final void setItem(TokenStore.Item item) {
        this.item = item;
    }

    @Override // io.livekit.android.token.TokenStore
    public Object store(TokenRequestOptions tokenRequestOptions, TokenSourceResponse tokenSourceResponse, c<? super z> cVar) {
        this.item = new TokenStore.Item(tokenRequestOptions, tokenSourceResponse);
        return z.f31622a;
    }
}

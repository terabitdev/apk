package io.livekit.android.token;

import com.google.protobuf.c6;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import ho.p;
import io.livekit.android.token.TokenStore;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0080@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R,\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/livekit/android/token/BaseCachingTokenSource;", "", "Lio/livekit/android/token/TokenStore;", ProductResponseJsonKeys.STORE, "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lio/livekit/android/token/TokenSourceResponse;", "", "Lio/livekit/android/token/TokenValidator;", "validator", "<init>", "(Lio/livekit/android/token/TokenStore;Lho/p;)V", "options", "fetchImpl$livekit_android_sdk_release", "(Lio/livekit/android/token/TokenRequestOptions;Lwn/c;)Ljava/lang/Object;", "fetchImpl", "fetchFromSource", "Lsn/z;", "invalidate", "(Lwn/c;)Ljava/lang/Object;", "cachedResponse", "Lio/livekit/android/token/TokenStore;", "Lho/p;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class BaseCachingTokenSource {
    private final TokenStore store;
    private final p validator;

    public BaseCachingTokenSource(TokenStore tokenStore, p pVar) {
        tokenStore.getClass();
        pVar.getClass();
        this.store = tokenStore;
        this.validator = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cachedResponse(c<? super TokenSourceResponse> cVar) {
        BaseCachingTokenSource$cachedResponse$1 baseCachingTokenSource$cachedResponse$1;
        int i10;
        TokenStore.Item item;
        if (cVar instanceof BaseCachingTokenSource$cachedResponse$1) {
            baseCachingTokenSource$cachedResponse$1 = (BaseCachingTokenSource$cachedResponse$1) cVar;
            int i11 = baseCachingTokenSource$cachedResponse$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                baseCachingTokenSource$cachedResponse$1.label = i11 - Integer.MIN_VALUE;
                Object obj = baseCachingTokenSource$cachedResponse$1.result;
                i10 = baseCachingTokenSource$cachedResponse$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj);
                    TokenStore tokenStore = this.store;
                    baseCachingTokenSource$cachedResponse$1.label = 1;
                    obj = tokenStore.retrieve(baseCachingTokenSource$cachedResponse$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                item = (TokenStore.Item) obj;
                if (item == null) {
                    return item.getResponse();
                }
                return null;
            }
        }
        baseCachingTokenSource$cachedResponse$1 = new BaseCachingTokenSource$cachedResponse$1(this, cVar);
        Object obj2 = baseCachingTokenSource$cachedResponse$1.result;
        i10 = baseCachingTokenSource$cachedResponse$1.label;
        if (i10 == 0) {
        }
        item = (TokenStore.Item) obj2;
        if (item == null) {
        }
    }

    public abstract Object fetchFromSource(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar);

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r10 != r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchImpl$livekit_android_sdk_release(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar) {
        BaseCachingTokenSource$fetchImpl$1 baseCachingTokenSource$fetchImpl$1;
        Object obj;
        int i10;
        BaseCachingTokenSource baseCachingTokenSource;
        TokenStore.Item item;
        if (cVar instanceof BaseCachingTokenSource$fetchImpl$1) {
            baseCachingTokenSource$fetchImpl$1 = (BaseCachingTokenSource$fetchImpl$1) cVar;
            int i11 = baseCachingTokenSource$fetchImpl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                baseCachingTokenSource$fetchImpl$1.label = i11 - Integer.MIN_VALUE;
                obj = baseCachingTokenSource$fetchImpl$1.result;
                i10 = baseCachingTokenSource$fetchImpl$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                TokenSourceResponse tokenSourceResponse = (TokenSourceResponse) baseCachingTokenSource$fetchImpl$1.L$0;
                                a.g(obj);
                                return tokenSourceResponse;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tokenRequestOptions = (TokenRequestOptions) baseCachingTokenSource$fetchImpl$1.L$1;
                        baseCachingTokenSource = (BaseCachingTokenSource) baseCachingTokenSource$fetchImpl$1.L$0;
                        a.g(obj);
                        TokenSourceResponse tokenSourceResponse2 = (TokenSourceResponse) obj;
                        TokenStore tokenStore = baseCachingTokenSource.store;
                        baseCachingTokenSource$fetchImpl$1.L$0 = tokenSourceResponse2;
                        baseCachingTokenSource$fetchImpl$1.L$1 = null;
                        baseCachingTokenSource$fetchImpl$1.label = 3;
                        if (tokenStore.store(tokenRequestOptions, tokenSourceResponse2, baseCachingTokenSource$fetchImpl$1) == aVar) {
                            return aVar;
                        }
                        return tokenSourceResponse2;
                    }
                    tokenRequestOptions = (TokenRequestOptions) baseCachingTokenSource$fetchImpl$1.L$1;
                    baseCachingTokenSource = (BaseCachingTokenSource) baseCachingTokenSource$fetchImpl$1.L$0;
                    a.g(obj);
                } else {
                    a.g(obj);
                    TokenStore tokenStore2 = this.store;
                    baseCachingTokenSource$fetchImpl$1.L$0 = this;
                    baseCachingTokenSource$fetchImpl$1.L$1 = tokenRequestOptions;
                    baseCachingTokenSource$fetchImpl$1.label = 1;
                    obj = tokenStore2.retrieve(baseCachingTokenSource$fetchImpl$1);
                    if (obj != aVar) {
                        baseCachingTokenSource = this;
                    }
                    return aVar;
                }
                item = (TokenStore.Item) obj;
                if (item == null && m.c(item.getOptions(), tokenRequestOptions) && ((Boolean) baseCachingTokenSource.validator.invoke(item.getOptions(), item.getResponse())).booleanValue()) {
                    return item.getResponse();
                }
                baseCachingTokenSource$fetchImpl$1.L$0 = baseCachingTokenSource;
                baseCachingTokenSource$fetchImpl$1.L$1 = tokenRequestOptions;
                baseCachingTokenSource$fetchImpl$1.label = 2;
                obj = baseCachingTokenSource.fetchFromSource(tokenRequestOptions, baseCachingTokenSource$fetchImpl$1);
            }
        }
        baseCachingTokenSource$fetchImpl$1 = new BaseCachingTokenSource$fetchImpl$1(this, cVar);
        obj = baseCachingTokenSource$fetchImpl$1.result;
        i10 = baseCachingTokenSource$fetchImpl$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        item = (TokenStore.Item) obj;
        if (item == null) {
        }
        baseCachingTokenSource$fetchImpl$1.L$0 = baseCachingTokenSource;
        baseCachingTokenSource$fetchImpl$1.L$1 = tokenRequestOptions;
        baseCachingTokenSource$fetchImpl$1.label = 2;
        obj = baseCachingTokenSource.fetchFromSource(tokenRequestOptions, baseCachingTokenSource$fetchImpl$1);
    }

    public final Object invalidate(c<? super z> cVar) {
        Object clear = this.store.clear(cVar);
        if (clear == xn.a.f37986a) {
            return clear;
        }
        return z.f31622a;
    }
}

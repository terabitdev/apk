package io.livekit.android.token;

import ho.p;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "options", "Lio/livekit/android/token/TokenRequestOptions;", "response", "Lio/livekit/android/token/TokenSourceResponse;", "invoke", "(Lio/livekit/android/token/TokenRequestOptions;Lio/livekit/android/token/TokenSourceResponse;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CachingTokenSourceKt$defaultValidator$1 extends n implements p {
    public static final CachingTokenSourceKt$defaultValidator$1 INSTANCE = new CachingTokenSourceKt$defaultValidator$1();

    public CachingTokenSourceKt$defaultValidator$1() {
        super(2);
    }

    @Override // ho.p
    public final Boolean invoke(TokenRequestOptions tokenRequestOptions, TokenSourceResponse tokenSourceResponse) {
        tokenSourceResponse.getClass();
        return Boolean.valueOf(CachingTokenSourceKt.m2634hasValidToken8Mi8wO0$default(tokenSourceResponse, 0L, null, 3, null));
    }
}

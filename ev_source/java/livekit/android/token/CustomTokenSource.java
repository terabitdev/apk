package io.livekit.android.token;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fR3\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/livekit/android/token/CustomTokenSource;", "Lio/livekit/android/token/ConfigurableTokenSource;", "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lwn/c;", "Lio/livekit/android/token/TokenSourceResponse;", "", "block", "<init>", "(Lho/p;)V", "options", RemoteConfigComponent.FETCH_FILE_NAME, "(Lio/livekit/android/token/TokenRequestOptions;Lwn/c;)Ljava/lang/Object;", "Lho/p;", "getBlock", "()Lho/p;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CustomTokenSource implements ConfigurableTokenSource {
    private final p block;

    public CustomTokenSource(p pVar) {
        pVar.getClass();
        this.block = pVar;
    }

    @Override // io.livekit.android.token.ConfigurableTokenSource
    public Object fetch(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar) {
        return this.block.invoke(tokenRequestOptions, cVar);
    }

    public final p getBlock() {
        return this.block;
    }
}

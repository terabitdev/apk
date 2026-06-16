package io.livekit.android.token;

import a9.a;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/token/ConfigurableTokenSource;", "Lio/livekit/android/token/TokenSource;", "Lio/livekit/android/token/TokenRequestOptions;", "options", "Lio/livekit/android/token/TokenSourceResponse;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lio/livekit/android/token/TokenRequestOptions;Lwn/c;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface ConfigurableTokenSource extends TokenSource {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetch$default(ConfigurableTokenSource configurableTokenSource, TokenRequestOptions tokenRequestOptions, c cVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    tokenRequestOptions = new TokenRequestOptions(null, null, null, null, null, null, null, 127, null);
                }
                return configurableTokenSource.fetch(tokenRequestOptions, cVar);
            }
            a.y("Super calls with default arguments not supported in this target, function: fetch");
            return null;
        }
    }

    Object fetch(TokenRequestOptions tokenRequestOptions, c<? super TokenSourceResponse> cVar);
}

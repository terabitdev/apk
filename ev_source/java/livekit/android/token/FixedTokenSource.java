package io.livekit.android.token;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/token/FixedTokenSource;", "Lio/livekit/android/token/TokenSource;", "Lio/livekit/android/token/TokenSourceResponse;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lwn/c;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface FixedTokenSource extends TokenSource {
    Object fetch(c<? super TokenSourceResponse> cVar);
}

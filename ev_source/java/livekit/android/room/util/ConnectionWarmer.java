package io.livekit.android.room.util;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Response;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/util/ConnectionWarmer;", "", "", "url", "Lokhttp3/Response;", RemoteConfigComponent.FETCH_FILE_NAME, "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface ConnectionWarmer {
    Object fetch(String str, c<? super Response> cVar);
}

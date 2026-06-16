package io.livekit.android.room.util;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import io.livekit.android.util.OkHttpCallExtKt;
import io.livekit.android.util.UrlUtilsKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lio/livekit/android/room/util/OkHttpConnectionWarmer;", "Lio/livekit/android/room/util/ConnectionWarmer;", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Lokhttp3/OkHttpClient;)V", "", "url", "Lokhttp3/Response;", RemoteConfigComponent.FETCH_FILE_NAME, "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OkHttpConnectionWarmer implements ConnectionWarmer {
    private final OkHttpClient okHttpClient;

    public OkHttpConnectionWarmer(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.okHttpClient = okHttpClient;
    }

    @Override // io.livekit.android.room.util.ConnectionWarmer
    public Object fetch(String str, c<? super Response> cVar) {
        Request.Builder builder = new Request.Builder();
        builder.f(UrlUtilsKt.toHttpUrl(str));
        builder.d(FirebasePerformance.HttpMethod.HEAD, null);
        Request request = new Request(builder);
        OkHttpClient okHttpClient = this.okHttpClient;
        okHttpClient.getClass();
        return OkHttpCallExtKt.executeAsync(new RealCall(okHttpClient, request, false), cVar);
    }
}
